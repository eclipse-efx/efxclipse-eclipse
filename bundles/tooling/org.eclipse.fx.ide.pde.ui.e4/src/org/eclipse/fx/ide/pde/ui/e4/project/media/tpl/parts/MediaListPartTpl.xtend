package org.eclipse.fx.ide.pde.ui.e4.project.media.tpl.parts

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit
import java.io.ByteArrayInputStream

class MediaListPartTpl implements Generator<DynamicFile> {

	override generate(DynamicFile file, Map<String,Object> data) {
		val cu = file.eContainer as CompilationUnit;
		val rootPackage = cu.packagename.substring(0,cu.packagename.lastIndexOf('.'));
		val modelPackage = cu.packagename.substring(0,cu.packagename.lastIndexOf('.'))+".model"
		val handlersPackage = cu.packagename.substring(0,cu.packagename.lastIndexOf('.'))+".handlers"
		val partsPackage = cu.packagename.substring(0,cu.packagename.lastIndexOf('.'))+".parts"
		
		return new ByteArrayInputStream(generate(rootPackage, cu.packagename, modelPackage, handlersPackage, partsPackage).toString.bytes);
	}
	
	def generate(String rootPackage, String packageName, String modelPackage, String handlersPackage, String partsPackage) '''package «packageName»;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import «handlersPackage».OpenHandler;
import «modelPackage».Media;
import «modelPackage».MediaType;

@SuppressWarnings("restriction")
public class MediaListPart {
	static class MediaCell extends ListCell<Media> {
		@Override
		protected void updateItem(Media item, boolean empty) {
			if(  ! empty && item != null ) {
				setText(item.getName());
				switch (item.getType()) {
				case MOVIE:
					setGraphic(new ImageView("platform:/plugin/«rootPackage»/icons/kaffeine.png"));
					break;
				case PICTURE:
					setGraphic(new ImageView("platform:/plugin/«rootPackage»/icons/games-config-background.png"));
					break;
				default:
					setGraphic(new ImageView("platform:/plugin/«rootPackage»/icons/player-volume.png"));
					break;
				}				
			}
			super.updateItem(item, empty);
		}
	}
	
	
	@Inject
	EPartService partService;
	
	@Inject
	EModelService modelService;
	
	@Inject
	MApplication application;
	
	private ListView<Media> list;
	
	@PostConstruct
	void init(BorderPane pane) {
		list = new ListView<Media>(createList());
		list.setId("mediaList");
		list.setCellFactory(new Callback<ListView<Media>, ListCell<Media>>() {
			
			@Override
			public ListCell<Media> call(ListView<Media> param) {
				return new MediaCell();
			}
		});
		list.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if( event.getClickCount() > 1 ) {
					handleOpen();
				}
			}
		});
		pane.setCenter(list);
	}
	
	void handleOpen() {
		MPartStack stack = (MPartStack) modelService.find("content.stack", application);
		Media m = list.getSelectionModel().getSelectedItem();
		String instance = Media.serialize(m);
				
		for( MStackElement e : stack.getChildren() ) {
			if( e instanceof MPart ) {
				if( instance.equals(e.getPersistedState().get(MediaPart.MEDIA_OBJECT_KEY)) ) {
					partService.activate((MPart) e);
					return;
				}
			}
		}
		
		MPart p = MBasicFactory.INSTANCE.createPart();
		p.setLabel(m.getName());
		if( m.getType() == MediaType.MOVIE ) {
			p.setIconURI("platform:/plugin/«rootPackage»/icons/22/kaffeine.png");	
		} else if( m.getType() == MediaType.PICTURE ) {
			p.setIconURI("platform:/plugin/«rootPackage»/icons/22/games-config-background.png");
		} else {
			p.setIconURI("platform:/plugin/«rootPackage»/icons/22/player-volume.png");
		}
		
		p.setContributionURI("bundleclass://«rootPackage»/«partsPackage».MediaPart");
		p.getPersistedState().put(MediaPart.MEDIA_OBJECT_KEY, instance);
		stack.getChildren().add(p);
		partService.activate(p,true);
	}
	
	@Focus
	void focus() {
		list.requestFocus();
	}
	
	@Inject
	@Optional
	public void openMedia(@UIEventTopic(OpenHandler.OPEN_EVENT) String event) {
		handleOpen();
	}
	
	private static ObservableList<Media> createList() {
		ObservableList<Media> l = FXCollections.observableArrayList();
		l.add(new Media(MediaType.PICTURE, "Desert",     "platform:/plugin/«rootPackage»/icons/resources/pics/pic1.jpg"));
		l.add(new Media(MediaType.PICTURE, "Lighthouse", "platform:/plugin/«rootPackage»/icons/resources/pics/pic2.jpg"));
		l.add(new Media(MediaType.MOVIE,   "Grog",       "platform:/plugin/«rootPackage»/icons/resources/movs/mov1.flv"));
		l.add(new Media(MediaType.MOVIE,   "OTN",        "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv"));
		return l;
	}
}
'''
}