/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.editors.outline;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.fx.ide.jdt.ui.internal.JavaFXUIPlugin;
import org.eclipse.jdt.internal.ui.propertiesfileeditor.PropertiesFileEditor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.osgi.service.prefs.BackingStoreException;


@SuppressWarnings("restriction")
public class PropertyContentOutlinePage extends ContentOutlinePage {
	private List<Object> hierarchicalStructure = new ArrayList<Object>();
	private List<Property> flatStructure = new ArrayList<Property>();
	private Pair[] properties = new Pair[0];
	private IEclipsePreferences preferences = InstanceScope.INSTANCE.getNode("propertiesoutline");

	private static final String PREF_SORTED = "sorted";
	private static final String PREF_HIERARCHICAL = "hierarchical";

	private Action sortAction;
	private Action hierarchicalAction;

	private String groupRegexp = "_|\\.|/";
	private IDocument document;
	private PropertiesFileEditor editor;

	public PropertyContentOutlinePage(PropertiesFileEditor editor) {
		final IEditorInput input = editor.getEditorInput();
		final IDocumentProvider provider = editor.getDocumentProvider();
		this.editor = editor;
		document = provider.getDocument(input);
		document.addDocumentListener(new IDocumentListener() {

			public void documentChanged(DocumentEvent event) {
				try {
					setProperties(getPairs(event.fDocument));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			public void documentAboutToBeChanged(DocumentEvent event) {
			}
		});
		try {
			properties = getPairs(document);
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		sortAction = new Action("", IAction.AS_CHECK_BOX) {
			@Override
			public void run() {
				preferences.putBoolean(PREF_SORTED, isChecked());
				try {
					preferences.flush();
				} catch (BackingStoreException e) {
					e.printStackTrace();
				}
			}
		};
		sortAction.setImageDescriptor(JavaFXUIPlugin.getDefault().getImageRegistry()
				.getDescriptor(JavaFXUIPlugin.ALPHASORT_ICON));
		sortAction.setChecked(isSorted());

		hierarchicalAction = new Action("", IAction.AS_CHECK_BOX) {
			@Override
			public void run() {
				preferences.putBoolean(PREF_HIERARCHICAL, isChecked());
				try {
					preferences.flush();
				} catch (BackingStoreException e) {
					e.printStackTrace();
				}
			}
		};
		hierarchicalAction.setImageDescriptor(JavaFXUIPlugin.getDefault()
				.getImageRegistry().getDescriptor(JavaFXUIPlugin.HIERACHICAL_ICON));
		hierarchicalAction.setChecked(isHierarchical());

		preferences
				.addPreferenceChangeListener(new IPreferenceChangeListener() {

					public void preferenceChange(PreferenceChangeEvent event) {
						if (event.getKey().equals(PREF_SORTED)) {
							boolean val = isSorted();
							setSorted(val);
							sortAction.setChecked(val);
						} else if (event.getKey().equals(PREF_HIERARCHICAL)) {
							boolean val = isHierarchical();
							setHierarchical(val);
							hierarchicalAction.setChecked(val);
						}
					}
				});
	}

	public Pair[] getPairs(IDocument document)
			throws UnsupportedEncodingException, IOException {
		Properties p = new Properties();
		p.load(new ByteArrayInputStream(document.get().getBytes("UTF-8")));
		Pair[] pairs = new Pair[p.entrySet().size()];
		int i = 0;
		for (Entry<Object, Object> e : p.entrySet()) {
			pairs[i++] = new Pair((String) e.getKey(), (String) e.getValue());
		}
		return pairs;
	}

	@Override
	public void makeContributions(IMenuManager menuManager,
			IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
		super.makeContributions(menuManager, toolBarManager, statusLineManager);
		toolBarManager.add(hierarchicalAction);
		toolBarManager.add(sortAction);

		Action a = new Action("", IAction.AS_PUSH_BUTTON) {
			@Override
			public void run() {
				try {
					getTreeViewer().getTree().setRedraw(false);
					getTreeViewer().collapseAll();
				} finally {
					getTreeViewer().getTree().setRedraw(true);
				}
			}
		};
		a.setImageDescriptor(JavaFXUIPlugin.getDefault().getImageRegistry()
				.getDescriptor(JavaFXUIPlugin.COLLAPSE_ICON));
		toolBarManager.add(a);
	}

	@Override
	protected void fireSelectionChanged(ISelection selection) {
		super.fireSelectionChanged(selection);
		Object o = ((IStructuredSelection) selection).getFirstElement();
		String searchKey = null;
		int selectionLength = 0;

		if (o instanceof PropertyGroup) {
			searchKey = ((PropertyGroup) o).name;
		} else if (o instanceof Property) {
			searchKey = ((Property) o).pair.key;
			selectionLength = ((Property) o).pair.value.length();
		}

		if (searchKey == null) {
			return;
		}

		int lines = document.getNumberOfLines();
		try {
			for (int i = 0; i < lines; i++) {
				IRegion r = document.getLineInformation(i);
				String line = document.get(r.getOffset(), r.getLength());
				if (line.startsWith(searchKey)) {
					editor.selectAndReveal(r.getOffset() + r.getLength()
							- selectionLength, selectionLength);
					break;
				}
			}
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setSorted(boolean sorted) {
		// FIXME We should delay until visible!
		if (sorted) {
			getTreeViewer().setComparator(new ViewerComparator() {
				@Override
				public int compare(Viewer viewer, Object e1, Object e2) {
					if (e1 instanceof PropertyGroup
							&& e2 instanceof PropertyGroup) {
						return ((PropertyGroup) e1).name
								.compareTo(((PropertyGroup) e2).name);
					} else if (e1 instanceof Property && e2 instanceof Property) {
						String k1 = ((Property) e1).pair.key.replaceAll(
								groupRegexp, "");
						String k2 = ((Property) e2).pair.key.replaceAll(
								groupRegexp, "");
						return k1.compareTo(k2);
					} else if (e1 instanceof Property) {
						return -1;
					} else if (e2 instanceof Property) {
						return -1;
					}
					return super.compare(viewer, e1, e2);
				}
			});
		} else {
			getTreeViewer().setComparator(null);
		}
	}

	protected void setHierarchical(boolean val) {
		// FIXME We should delay until visible!
		if (val) {
			getTreeViewer().setInput(hierarchicalStructure);
		} else {
			getTreeViewer().setInput(flatStructure);
		}
	}

	private void createHierarchicalStructure() {
		List<Property> found = new ArrayList<Property>();
		List<Property> added = new ArrayList<Property>();
		for (Pair property : properties) {
			boolean isFound = false;
			Iterator<Property> it = flatStructure.iterator();
			while (it.hasNext()) {
				Property p = it.next();
				if (p.pair.key.equals(property.key)) {
					p.pair = property;
					isFound = true;
					found.add(p);
					it.remove();
				}
			}
			if (!isFound) {
				added.add(new Property(property));
			}
		}

		// These are removed
		for (Property p : flatStructure) {
			if (p.parent != null) {
				p.parent.items.remove(p);
				p.parent = null;
			} else {
				hierarchicalStructure.remove(p);
			}
		}

		flatStructure.clear();
		flatStructure.addAll(found);

		for (Property p : added) {
			List<String> parts = new ArrayList<String>(Arrays.asList(p.pair.key
					.split(groupRegexp)));
			if (parts.size() > 1) {
				PropertyGroup group = getGroup(hierarchicalStructure, parts);
				if (parts.size() > 1) {
					PropertyGroup tmp = group;
					PropertyGroup root = null;
					for (int i = 0; i < parts.size() - 1; i++) {
						tmp = new PropertyGroup(tmp, parts.get(i));
						if (i == 0) {
							root = tmp;
						}
					}

					p.parent = tmp;
					p.parent.items.add(p);

					if (group == null) {
						hierarchicalStructure.add(root);
					}
				} else {
					p.parent = group;
					p.parent.items.add(p);
				}
			} else {
				hierarchicalStructure.add(p);
			}
			flatStructure.add(p);
		}

		removeEmptyGroups(hierarchicalStructure);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer viewer = getTreeViewer();
		viewer.setLabelProvider(new StyledCellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				Object element = cell.getElement();
				if (element instanceof PropertyGroup) {
					cell.setText(((PropertyGroup) element).name);
					cell.setImage(JavaFXUIPlugin.getDefault().getImageRegistry()
							.get(JavaFXUIPlugin.GROUP_ICON));
					cell.setStyleRanges(null);
				} else if (element instanceof Property) {
					cell.setImage(JavaFXUIPlugin.getDefault().getImageRegistry()
							.get(JavaFXUIPlugin.KEY_ICON));
					StyledString s = new StyledString(
							((Property) element).pair.key);
					String text = ((Property) element).pair.value;
					if (text.length() > 20) {
						text = text.substring(0, 20) + "...";
					}
					s.append(" : " + text, StyledString.DECORATIONS_STYLER);
					cell.setStyleRanges(s.getStyleRanges());
					cell.setText(s.getString());
				}
				super.update(cell);
			}
		});

		viewer.setContentProvider(new HierarchicalContentProvider());

		if (isSorted()) {
			setSorted(true);
		}

		createHierarchicalStructure();

		if (isHierarchical()) {
			viewer.setInput(hierarchicalStructure);
		} else {
			viewer.setInput(flatStructure);
		}
	}

	public void setProperties(Pair[] properties) {
		this.properties = properties;
		createHierarchicalStructure();
		if (getTreeViewer() != null) {
			getTreeViewer().refresh();
		}
	}

	private boolean isSorted() {
		return preferences.getBoolean(PREF_SORTED, true);
	}

	private boolean isHierarchical() {
		return preferences.getBoolean(PREF_HIERARCHICAL, false);
	}

	private void removeEmptyGroups(List<?> list) {
		Iterator<?> it = list.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof PropertyGroup) {
				removeEmptyGroups(((PropertyGroup) o).groups);
				if (((PropertyGroup) o).groups.size() == 0
						&& ((PropertyGroup) o).items.size() == 0) {
					it.remove();
				}
			}
		}
	}

	private PropertyGroup getGroup(List<?> list, List<String> parts) {
		PropertyGroup group = null;
		for (Object o : list) {
			if (o instanceof PropertyGroup) {
				if (((PropertyGroup) o).name.equals(parts.get(0))) {
					parts.remove(0);
					group = (PropertyGroup) o;
					if (parts.size() > 1) {
						PropertyGroup tmp = getGroup(group.groups, parts);
						if (tmp != null) {
							return tmp;
						}
					}
					return group;
				}
			}
		}
		return group;
	}

	static class LabelProvider extends ColumnLabelProvider {
		@Override
		public String getText(Object element) {
			return super.getText(element);
		}
	}

	static class HierarchicalContentProvider implements ITreeContentProvider {

		public void dispose() {

		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

		}

		public Object[] getElements(Object inputElement) {
			return ((List<?>) inputElement).toArray();
		}

		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof PropertyGroup) {
				Object[] groups = ((PropertyGroup) parentElement).groups
						.toArray();
				Object[] items = ((PropertyGroup) parentElement).items
						.toArray();
				Object[] rv = new Object[groups.length + items.length];
				System.arraycopy(groups, 0, rv, 0, groups.length);
				System.arraycopy(items, 0, rv, groups.length, items.length);

				return rv;
			}
			return new Object[0];
		}

		public Object getParent(Object element) {
			if (element instanceof PropertyGroup) {
				return ((PropertyGroup) element).parent;
			} else if (element instanceof Property) {
				return ((Property) element).parent;
			}
			return null;
		}

		public boolean hasChildren(Object element) {
			if (element instanceof PropertyGroup) {
				return ((PropertyGroup) element).groups.size() > 0
						|| ((PropertyGroup) element).items.size() > 0;
			}
			return false;
		}

	}

	public static class PropertyGroup {
		private PropertyGroup parent;
		public String name;
		private List<PropertyGroup> groups = new ArrayList<PropertyContentOutlinePage.PropertyGroup>();
		private List<Property> items = new ArrayList<Property>();

		public PropertyGroup(String name) {
			this(null, name);
		}

		public PropertyGroup(PropertyGroup parent, String name) {
			this.parent = parent;
			if (parent != null) {
				parent.groups.add(this);
			}
			this.name = name;
		}

		@Override
		public String toString() {
			return super.toString() + "#" + name;
		}
	}

	public static class Property {
		private PropertyGroup parent;
		public Pair pair;

		public Property(Pair pair) {
			this(null, pair);
		}

		public Property(PropertyGroup parent, Pair pair) {
			this.parent = parent;
			this.pair = pair;
		}

		@Override
		public String toString() {
			return super.toString() + "#" + pair.key + " / " + pair.value;
		}
	}

	public static class Pair {
		public final String key;
		public final String value;

		public Pair(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}
}