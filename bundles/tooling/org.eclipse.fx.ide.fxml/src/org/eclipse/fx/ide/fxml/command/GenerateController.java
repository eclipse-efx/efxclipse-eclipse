package org.eclipse.fx.ide.fxml.command;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.fx.ide.fxml.editors.Util;
import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXClass;
import org.eclipse.fx.ide.model.IFXEventHandlerProperty;
import org.eclipse.fx.ide.model.IFXProperty;
import org.eclipse.fx.ide.ui.wizards.JDTElementFactory;
import org.eclipse.fx.ide.ui.wizards.template.JDTElement;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.sse.core.internal.provisional.IndexedRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegionList;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.xml.core.internal.regions.DOMRegionContext;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/**
 * Handler to generate controller
 */
@SuppressWarnings("restriction")
public class GenerateController extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		ITextEditor textEditor = null;
		if (editor instanceof ITextEditor)
			textEditor = (ITextEditor) editor;
		else {
			Object o = editor.getAdapter(ITextEditor.class);
			if (o != null)
				textEditor = (ITextEditor) o;
		}
		if (textEditor != null) {
			IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
			if (document != null && document instanceof IStructuredDocument) {
				openDialog(textEditor, (IStructuredDocument) document);
			}
		}
		return null;
	}

	private static void openDialog(ITextEditor arg0, IStructuredDocument document) {
		List<ControllerEntry<IFXClass>> fields = new ArrayList<>();
		List<ControllerEntry<IFXEventHandlerProperty>> methods = new ArrayList<>();

		for (IStructuredDocumentRegion region : document.getStructuredDocumentRegions()) {
			ITextRegionList textRegions = region.getRegions();

			for (int i = 0; i < textRegions.size(); i++) {
				ITextRegion textRegion = textRegions.get(i);
				if (textRegion.getType() == DOMRegionContext.XML_TAG_OPEN) {
					IndexedRegion treeNode = getNode(document, region.getStartOffset(textRegion));
					if (treeNode == null) {
						return;
					}

					IDOMNode node = (IDOMNode) treeNode;

					IFXClass e = computeTagNameHelp(node);
					if (e != null) {
						NamedNodeMap nnm = node.getAttributes();
						Map<String, IFXProperty> props = e.getAllProperties();
						for (int j = 0; j < nnm.getLength(); j++) {
							Node attribute = nnm.item(j);
							if (attribute.getNodeName().equals("fx:id")) { //$NON-NLS-1$
								fields.add(new ControllerEntry<>(attribute.getNodeValue(), e, e, attribute.getNodeValue()));
							} else {
								IFXProperty p = props.get(attribute.getNodeName());
								if (p instanceof IFXEventHandlerProperty) {
									String id = nnm.getNamedItem("fx:id") == null ? null : nnm.getNamedItem("fx:id").getNodeValue();  //$NON-NLS-1$//$NON-NLS-2$
									methods.add(new ControllerEntry<>(id, e, (IFXEventHandlerProperty) p, attribute.getNodeValue()));
								}
							}
						}
					}
				}
			}
		}

		ControllerJDTElement clazz = new ControllerJDTElement();
		if( arg0.getEditorInput() instanceof FileEditorInput ) {
			FileEditorInput fi = (FileEditorInput) arg0.getEditorInput();
			IFile file = fi.getFile();
			IJavaProject jp = JavaCore.create(file.getProject());
			try {
				for( IPackageFragmentRoot r : jp.getPackageFragmentRoots() ) {
					if( file.getFullPath().toString().startsWith(r.getPath().toString())) {
						clazz.setFragmentRoot(r);
						break;
					}
				}
			} catch (JavaModelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				clazz.setPackageFragment(jp.findPackageFragment(file.getParent().getFullPath()));
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clazz.setName(fi.getName().replace(".fxml", "")+"Controller");   //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
		}

		CreationDialog d = new CreationDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),clazz,fields,methods);
		if( d.open() == Window.OK ) {
			if( clazz.getFragmentRoot() != null ) {
				IFile file = createFile(clazz);
				if( ! file.exists() ) {
					try( ByteArrayInputStream in = new ByteArrayInputStream(new ControllerGenerator(clazz).generate().toString().getBytes()) ) {
						file.create(in, true, null);
					} catch (Exception e) {
						MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Failed to create file", "Failure while create the controller file '"+e.getMessage()+"'");
					}
				} else {
					MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "File already exists", "The controller file already exists. Updateing existing controllers is not supported!");
				}
			}
		}
	}

	private static IFile createFile(ControllerJDTElement clazz) {
		IPackageFragment fragment = clazz.getPackageFragment();
		if (fragment != null) {
			String cuName = clazz.getName() + ".java";
			ICompilationUnit unit = fragment.getCompilationUnit(cuName);
			IResource resource = unit.getResource();
			return (IFile) resource;
		} else {
			String cuName = clazz.getName() + ".java";
			IFolder p = (IFolder) clazz.getFragmentRoot().getResource();
			return p.getFile(cuName);
		}
	}

	static class CreationDialog extends TitleAreaDialog {
		final List<ControllerEntry<IFXClass>> fields;
		final List<ControllerEntry<IFXEventHandlerProperty>> methods;
		final ControllerJDTElement clazz;

		Image privateField = JavaPluginImages.DESC_FIELD_PRIVATE.createImage();
		Image publicMethod = JavaPluginImages.DESC_MISC_PUBLIC.createImage();
		private CheckboxTableViewer viewer;

		public CreationDialog(Shell parentShell, ControllerJDTElement clazz, List<ControllerEntry<IFXClass>> fields, List<ControllerEntry<IFXEventHandlerProperty>> methods) {
			super(parentShell);
			this.clazz = clazz;
			this.fields = fields;
			this.methods = methods;
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = (Composite) super.createDialogArea(parent);

			Composite area = new Composite(container, SWT.NONE);
			area.setLayoutData(new GridData(GridData.FILL_BOTH));
			area.setLayout(new GridLayout(3, false));

			DataBindingContext dbc = new DataBindingContext();

			{
				JDTElementFactory.createSourceFolderElement(area, dbc, this.clazz, ResourcesPlugin.getWorkspace().getRoot());
			}

			{
				JDTElementFactory.createPackageElement(area, dbc, this.clazz);
			}

			{
				Label l = new Label(area, SWT.NONE);
				l.setText("Name:");

				IWidgetValueProperty textProp = WidgetProperties.text(SWT.Modify);
				Text t = new Text(area, SWT.BORDER);
				t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				dbc.bindValue(textProp.observe(t), BeanProperties.value("name", String.class).observe(this.clazz)); //$NON-NLS-1$

				@SuppressWarnings("unused")
				Label label = new Label(area, SWT.NONE);
			}

			{
				Label l = new Label(area, SWT.NONE);
				l.setText("Fields && Methods");
				l.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));

				this.viewer = new CheckboxTableViewer(new Table(area, SWT.FULL_SELECTION|SWT.BORDER|SWT.V_SCROLL|SWT.H_SCROLL|SWT.CHECK));
				GridData gd = new GridData(GridData.FILL_BOTH);
				gd.heightHint=200;
				this.viewer.getTable().setLayoutData(gd);
				this.viewer.setContentProvider(ArrayContentProvider.getInstance());
				this.viewer.setLabelProvider(new StyledCellLabelProvider() {
					@Override
					public void update(ViewerCell cell) {
						ControllerEntry<?> e = (ControllerEntry<?>) cell.getElement();
						if( e.type instanceof IFXClass ) {
							IFXClass c = ((IFXClass)e.type);
							StyledString s = new StyledString(e.name);
							s.append(" : "+ c.getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$
							cell.setText(s.getString());
							cell.setStyleRanges(s.getStyleRanges());
							cell.setImage(CreationDialog.this.privateField);
						} else {
							IFXEventHandlerProperty p = (IFXEventHandlerProperty) e.type;

							StyledString s = new StyledString(e.name.substring(1));
							s.append(" : " + e.owner.getSimpleName() + ( e.ownerId != null ? " [#" + e.ownerId + "]" : "" ) + " - " + p.getName() + "(" + p.getEventTypeAsString(false)+")", StyledString.QUALIFIER_STYLER); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
							cell.setText(s.getString());
							cell.setStyleRanges(s.getStyleRanges());
							cell.setImage(CreationDialog.this.publicMethod);
						}
						super.update(cell);
					}
				});

				ArrayList<Object> combined = new ArrayList<>();
				combined.addAll(this.fields);
				combined.addAll(this.methods);
				this.viewer.setInput(combined);
				this.viewer.setAllChecked(true);
			}

			return container;
		}

		@Override
		protected void okPressed() {
			for( Object o : this.viewer.getCheckedElements() ) {
				this.clazz.getEntries().add((ControllerEntry<?>) o);
			}
			super.okPressed();
		}

		@Override
		public boolean close() {
			this.privateField.dispose();
			this.publicMethod.dispose();
			return super.close();
		}
	}

	static class ControllerEntry<T> {
		final IFXClass owner;
		final String ownerId;

		final T type;
		final String name;

		public ControllerEntry(String ownerId, IFXClass owner,T type,  String name) {
			this.type = type;
			this.owner = owner;
			this.ownerId = ownerId;
			this.name = name;
		}
	}

	static class ControllerJDTElement extends JDTElement {
		private List<ControllerEntry<?>> entries = new ArrayList<>();

		public List<ControllerEntry<?>> getEntries() {
			return this.entries;
		}
	}

	private static IndexedRegion getNode(IDocument document, int documentOffset) {
		IndexedRegion node = null;
		IModelManager mm = StructuredModelManager.getModelManager();
		IStructuredModel model = null;
		if (mm != null)
			model = mm.getExistingModelForRead(document);
		try {
			if (model != null) {
				int lastOffset = documentOffset;
				node = model.getIndexedRegion(documentOffset);
				while (node == null && lastOffset >= 0) {
					lastOffset--;
					node = model.getIndexedRegion(lastOffset);
				}
			}
		} finally {
			if (model != null)
				model.releaseFromRead();
		}
		return node;
	}

	private static IFXClass computeTagNameHelp(IDOMNode xmlnode) {
		if (!Character.isLowerCase(xmlnode.getNodeName().charAt(0))) {
			if (xmlnode.getNodeName().contains(".")) { //$NON-NLS-1$
				String[] parts = xmlnode.getNodeName().split("\\."); //$NON-NLS-1$
				IType ownerType = Util.findType(parts[0], xmlnode.getOwnerDocument());
				if (ownerType != null) {
					return FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);

				}
			} else {
				IType ownerType = Util.findType(xmlnode.getNodeName(), xmlnode.getOwnerDocument());
				if (ownerType != null) {
					return FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
				}
			}
		}

		return null;
	}
}
