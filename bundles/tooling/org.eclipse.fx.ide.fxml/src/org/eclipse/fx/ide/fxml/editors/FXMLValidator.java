package org.eclipse.fx.ide.fxml.editors;

import java.util.Locale;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.jface.text.quickassist.IQuickAssistProcessor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.sse.core.internal.provisional.IndexedRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegionList;
import org.eclipse.wst.sse.ui.internal.reconcile.validator.ISourceValidator;
import org.eclipse.wst.sse.ui.internal.reconcile.validator.IncrementalReporter;
import org.eclipse.wst.validation.AbstractValidator;
import org.eclipse.wst.validation.internal.core.Message;
import org.eclipse.wst.validation.internal.core.ValidationException;
import org.eclipse.wst.validation.internal.operations.IWorkbenchContext;
import org.eclipse.wst.validation.internal.operations.LocalizedMessage;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;
import org.eclipse.wst.validation.internal.provisional.core.IValidationContext;
import org.eclipse.wst.validation.internal.provisional.core.IValidator;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMAttr;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.xml.core.internal.regions.DOMRegionContext;
import org.eclipse.wst.xml.ui.internal.Logger;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXClass;
import org.eclipse.fx.ide.model.IFXCtrlClass;
import org.eclipse.fx.ide.model.IFXCtrlEventMethod;
import org.eclipse.fx.ide.model.IFXCtrlField;
import org.eclipse.fx.ide.model.IFXEventHandlerProperty;
import org.eclipse.fx.ide.model.IFXProperty;
import org.eclipse.fx.ide.ui.util.IconKeys;

@SuppressWarnings("restriction")
public class FXMLValidator extends AbstractValidator implements IValidator, ISourceValidator {
	private IDocument document;
	private IContentType fRootContentType = null;

	private void setDocument(IDocument document) {
		this.document = document;
	}

	private IDocument getDocument() {
		return this.document;
	}

	@Override
	public void connect(IDocument document) {
		setDocument(document);
	}

	@Override
	public void disconnect(IDocument document) {
		setDocument(null);
	}

	@Override
	public void validate(IRegion dirtyRegion, IValidationContext helper, IReporter reporter) {
		if (getDocument() == null) {
			return;
		}
		if (!(reporter instanceof IncrementalReporter)) {
			return;
		}
		if (!(getDocument() instanceof IStructuredDocument)) {
			return;
		}

		// remove old messages
		reporter.removeAllMessages(this);

		IStructuredDocumentRegion[] regions = ((IStructuredDocument) document).getStructuredDocumentRegions(dirtyRegion.getOffset(), dirtyRegion.getLength());
		for (int i = 0; i < regions.length; i++) {
			validate(regions[i], reporter);
		}
	}

	public void validate(IStructuredDocumentRegion structuredDocumentRegion, IReporter reporter) {
		if (structuredDocumentRegion == null) {
			return;
		}

		if (isStartTag(structuredDocumentRegion)) {
			checkControllerAttributes(structuredDocumentRegion, reporter);
		}
	}

	private void checkControllerAttributes(IStructuredDocumentRegion structuredDocumentRegion, IReporter reporter) {
		if (structuredDocumentRegion.isDeleted()) {
			return;
		}

		ITextRegionList textRegions = structuredDocumentRegion.getRegions();
		IFXCtrlClass fxCtrl = null;
		for (int i = 0; i < textRegions.size(); i++) {
			ITextRegion textRegion = textRegions.get(i);
			if (textRegion.getType() == DOMRegionContext.XML_TAG_OPEN) {
				IndexedRegion treeNode = getNode(document, structuredDocumentRegion.getStartOffset(textRegion));
				if (treeNode == null) {
					return;
				}

				IDOMNode node = (IDOMNode) treeNode;
				
				if (fxCtrl == null) {
					fxCtrl = getController(node);
				}
				
				if( fxCtrl == null ) {
					continue;
				}
				
				IFXClass e = computeTagNameHelp(node);

				if (e != null) {
					NamedNodeMap nnm = node.getAttributes();
					Map<String, IFXProperty> props = e.getAllProperties();
					for (int j = 0; j < nnm.getLength(); j++) {
						Node attribute = nnm.item(j);
						if (attribute.getNodeName().equals("fx:id")) {
							IFXCtrlField f = fxCtrl.getAllFields().get(attribute.getNodeValue());
							IType type = e.getType();
							
							if( f != null ) {
								IType toType = f.getType();
								IType fromType = Util.findType(node.getLocalName(), node.getOwnerDocument());
								if( fromType != null && toType != null ) {
									if( ! org.eclipse.fx.ide.model.Util.assignable(fromType, toType) ) {
										FXMLValidationMessage message = new FXMLValidationMessage(IMessage.ERROR_AND_WARNING, "FXMLValidator.incompatibleFieldTypes", fromType.getElementName(), toType.getElementName());
										IDOMAttr domAttr = (IDOMAttr) attribute;
										message.setLength(getAttributeLength(structuredDocumentRegion, domAttr));
										message.setOffset(domAttr.getStartOffset());
										reporter.addMessage(this, message);
									}
								}
							} else {
								String fielname = attribute.getNodeValue();
								FXMLValidationMessage message = new FXMLValidationMessage(IMessage.ERROR_AND_WARNING, "FXMLValidator.unknownControllerField", fxCtrl.getSimpleName(), fielname);
								IDOMAttr domAttr = (IDOMAttr) attribute;
								message.setLength(getAttributeLength(structuredDocumentRegion, domAttr));
								message.setOffset(domAttr.getStartOffset());

								UnknownControllerFieldQuickAssist processor = new UnknownControllerFieldQuickAssist(fielname, type, fxCtrl);
								message.setAttribute(IQuickAssistProcessor.class.getName(), processor);
								reporter.addMessage(this, message);
							}
						} else {
							IFXProperty p = props.get(attribute.getNodeName());
							if (p instanceof IFXEventHandlerProperty) {
								IFXCtrlEventMethod evtMethod = fxCtrl.getAllEventMethods().get(attribute.getNodeValue().substring(1));
								if (evtMethod == null) {
									String methodName = nnm.item(j).getNodeValue().substring(1);
									FXMLValidationMessage message = new FXMLValidationMessage(IMessage.HIGH_SEVERITY, "FXMLValidator.unknownControllerMethod", fxCtrl.getSimpleName(), methodName);
									IDOMAttr domAttr = (IDOMAttr) attribute;

									message.setLength(getAttributeLength(structuredDocumentRegion, domAttr));
									message.setOffset(domAttr.getStartOffset());

									UnknownControllerEventMethodQuickFixAssist processor = new UnknownControllerEventMethodQuickFixAssist(methodName, fxCtrl, (IFXEventHandlerProperty) p);
									message.setAttribute(IQuickAssistProcessor.class.getName(), processor);
									reporter.addMessage(this, message);
								}
							}
						}
					}
				}

			}
		}
	}
	
	private int getAttributeLength(IStructuredDocumentRegion structuredDocumentRegion, IDOMAttr domAttr) {
		int l = domAttr.getValueRegionStartOffset() - domAttr.getStartOffset();
		l += structuredDocumentRegion.getText(domAttr.getValueRegion()).length();
		return l; // domAttr.getLength() too long
	}

	private IFXCtrlClass getController(IDOMNode node) {
		Document d = node.getOwnerDocument();
		Element docEl = d.getDocumentElement();
		Attr a = docEl.getAttributeNodeNS("http://javafx.com/fxml", "controller");

		if (a != null && a.getValue() != null && !a.getValue().trim().isEmpty()) {
			IType type = Util.findType(a.getValue(), d);
			if( type != null ) {
				return FXPlugin.getClassmodel().findCtrlClass(type.getJavaProject(), type);	
			}
		}

		return null;
	}

	private IFXClass computeTagNameHelp(IDOMNode xmlnode) {
		if (!Character.isLowerCase(xmlnode.getNodeName().charAt(0))) {
			if (xmlnode.getNodeName().contains(".")) {
				String[] parts = xmlnode.getNodeName().split("\\.");
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

	private IndexedRegion getNode(IDocument document, int documentOffset) {
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

	private boolean isStartTag(IStructuredDocumentRegion structuredDocumentRegion) {
		if ((structuredDocumentRegion == null) || structuredDocumentRegion.isDeleted()) {
			return false;
		}
		return structuredDocumentRegion.getFirstRegion().getType() == DOMRegionContext.XML_TAG_OPEN;
	}

	@Override
	public void cleanup(IReporter reporter) {
		document = null;
	}

	private boolean shouldValidate(IResource file, boolean checkExtension) {
		if (file == null || !file.exists() || file.getType() != IResource.FILE)
			return false;
		if (checkExtension) {
			String extension = file.getFileExtension();
			if (extension != null && "xml".endsWith(extension.toLowerCase(Locale.US)))
				return true;
		}

		IContentDescription contentDescription = null;
		try {
			contentDescription = ((IFile) file).getContentDescription();
			if (contentDescription != null) {
				IContentType contentType = contentDescription.getContentType();
				return contentDescription != null && contentType.isKindOf(getXMLContentType());
			}
		} catch (CoreException e) {
			Logger.logException(e);
		}
		return false;
	}

	private IContentType getXMLContentType() {
		if (fRootContentType == null) {
			fRootContentType = Platform.getContentTypeManager().getContentType("org.eclipse.core.runtime.xml");
		}
		return fRootContentType;
	}

	@Override
	public void validate(IValidationContext helper, IReporter reporter) throws ValidationException {
		// TODO Auto-generated method stub
		String[] uris = helper.getURIs();
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		if (uris.length > 0) {
			IFile currentFile = null;

			for (int i = 0; i < uris.length && !reporter.isCancelled(); i++) {
				// might be called with just project path?
				IPath path = new Path(uris[i]);
				if (path.segmentCount() > 1) {
					currentFile = wsRoot.getFile(path);
					if (shouldValidate(currentFile, true)) {
						validateV1File(currentFile, reporter);
					}
				} else if (uris.length == 1) {
					validateV1Project(helper, reporter);
				}
			}
		} else
			validateV1Project(helper, reporter);
	}

	private boolean shouldValidate(IResourceProxy proxy) {
		if (proxy.getType() == IResource.FILE) {
			String name = proxy.getName();
			if (name.toLowerCase(Locale.US).endsWith(".fxml")) {
				return true;
			}
		}
		return shouldValidate(proxy.requestResource(), false);
	}

	private void validateV1Project(IValidationContext helper, final IReporter reporter) {
		// if uris[] length 0 -> validate() gets called for each project
		if (helper instanceof IWorkbenchContext) {
			IProject project = ((IWorkbenchContext) helper).getProject();
			IResourceProxyVisitor visitor = new IResourceProxyVisitor() {
				public boolean visit(IResourceProxy proxy) throws CoreException {
					if (shouldValidate(proxy)) {
						validateV1File((IFile) proxy.requestResource(), reporter);
					}
					return true;
				}
			};
			try {
				// collect all jsp files for the project
				project.accept(visitor, IResource.DEPTH_INFINITE);
			} catch (CoreException e) {
				Logger.logException(e);
			}
		}
	}

	private void validateV1File(IFile currentFile, IReporter reporter) {
		Message message = new LocalizedMessage(IMessage.LOW_SEVERITY, currentFile.getFullPath().toString().substring(1));
		reporter.displaySubtask(FXMLValidator.this, message);

		IStructuredModel model = null;
		try {
			model = StructuredModelManager.getModelManager().getModelForRead(currentFile);
			IStructuredDocument document = null;
			if (model != null) {
				document = model.getStructuredDocument();
				connect(document);
				IStructuredDocumentRegion validationRegion = document.getFirstStructuredDocumentRegion();
				while (validationRegion != null) {
					validate(validationRegion, reporter);
					validationRegion = validationRegion.getNext();
				}
				disconnect(document);
			}
		} catch (Exception e) {
			Logger.logException(e);
		} finally {
			if (model != null) {
				model.releaseFromRead();
			}
		}
	}

	static class UnknownControllerFieldQuickAssist implements IQuickAssistProcessor {
		private final String fieldName;
		private final IType fieldType;
		private final IFXCtrlClass controller;

		public UnknownControllerFieldQuickAssist(final String fieldName, final IType fieldType, final IFXCtrlClass controller) {
			this.fieldName = fieldName;
			this.fieldType = fieldType;
			this.controller = controller;
		}
		
		@Override
		public String getErrorMessage() {
			return null;
		}

		@Override
		public boolean canFix(Annotation annotation) {
			return false;
		}

		@Override
		public boolean canAssist(IQuickAssistInvocationContext invocationContext) {
			return false;
		}

		@Override
		public ICompletionProposal[] computeQuickAssistProposals(IQuickAssistInvocationContext invocationContext) {
			return new ICompletionProposal[] {
				new BaseCompletionProposalImpl("Add field '"+fieldName+"' to controller '"+controller.getSimpleName()+"'",null,invocationContext.getOffset(),0) {
					
					@Override
					public void apply(IDocument document) {
						try {
							IType type = controller.getType();
							String[][] resolvedType = type.resolveType("FXML");

							if( resolvedType == null ) {
								type.getCompilationUnit().createImport("javafx.fxml.FXML", null, new NullProgressMonitor());	
							}
							
							resolvedType = type.resolveType(Signature.getSimpleName(fieldType.getElementName()));
							
							if( resolvedType == null ) {
								type.getCompilationUnit().createImport(fieldType.getFullyQualifiedName(), null, new NullProgressMonitor());
							}
							
							type.createField("@FXML " + Signature.getSimpleName(fieldType.getElementName()) + " " + fieldName + ";", null, true, new NullProgressMonitor());
						} catch (JavaModelException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			};
		}
	}

	static class UnknownControllerEventMethodQuickFixAssist implements IQuickAssistProcessor {
		private final String methodName;
		private final IFXCtrlClass controller;
		private final IFXEventHandlerProperty property;

		public UnknownControllerEventMethodQuickFixAssist(final String methodName, final IFXCtrlClass controller, final IFXEventHandlerProperty property) {
			this.methodName = methodName;
			this.controller = controller;
			this.property = property;
		}

		@Override
		public String getErrorMessage() {
			return "THIS IS THE ERROR MESSAGE";
		}

		@Override
		public boolean canFix(Annotation annotation) {
			return true;
		}

		@Override
		public boolean canAssist(IQuickAssistInvocationContext invocationContext) {
			return true;
		}

		@Override
		public ICompletionProposal[] computeQuickAssistProposals(IQuickAssistInvocationContext invocationContext) {
			return new ICompletionProposal[] { new BaseCompletionProposalImpl("Add '" + methodName + "()' to controller '" + controller.getSimpleName() + "'", IconKeys.getIcon(IconKeys.EVENT_KEY), invocationContext.getOffset(), 0) {

				@Override
				public void apply(IDocument document) {
					try {
						IType type = controller.getType();

						String[][] resolvedType = type.resolveType("FXML");
						if (resolvedType == null) {
							type.getCompilationUnit().createImport("javafx.fxml.FXML", null, new NullProgressMonitor());
						}

						type.createMethod("@FXML public void " + methodName + "() {}", null, true, new NullProgressMonitor());
					} catch (JavaModelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					// Retrigger validation
					try {
						document.replace(0, 0, "");
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}, new BaseCompletionProposalImpl("Add '" + methodName + "(" + property.getEventTypeAsString(false) + ")' to controller '" + controller.getSimpleName() + "'", IconKeys.getIcon(IconKeys.EVENT_KEY), invocationContext.getOffset(), invocationContext.getLength()) {

				@Override
				public void apply(IDocument document) {
					try {
						IType type = controller.getType();
						String[][] resolvedType = type.resolveType("FXML");
						if (resolvedType == null) {
							type.getCompilationUnit().createImport("javafx.fxml.FXML", null, new NullProgressMonitor());
						}

						resolvedType = type.resolveType(property.getEventTypeAsString(false));

						if (resolvedType == null) {
							type.getCompilationUnit().createImport(property.getEventTypeAsString(true), null, new NullProgressMonitor());
						}

						type.createMethod("@FXML public void " + methodName + "(" + property.getEventTypeAsString(false) + " event) {}", null, true, new NullProgressMonitor());
					} catch (JavaModelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					// Retrigger validation
					try {
						document.replace(0, 0, "");
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			} };
		}
	}

	abstract static class BaseCompletionProposalImpl implements ICompletionProposal {
		private final int replacementOffset;
		private final int cursorPosition;
		private final String label;
		private final Image image;

		public BaseCompletionProposalImpl(String label, Image image, int replacementOffset, int cursorPosition) {
			this.label = label;
			this.image = image;
			this.replacementOffset = replacementOffset;
			this.cursorPosition = cursorPosition;
		}

		@Override
		public Point getSelection(IDocument document) {
			return new Point(replacementOffset + cursorPosition, 0);
		}

		@Override
		public String getAdditionalProposalInfo() {
			return null;
		}

		@Override
		public String getDisplayString() {
			return label;
		}

		@Override
		public Image getImage() {
			return image;
		}

		@Override
		public IContextInformation getContextInformation() {
			return null;
		}
	}
}