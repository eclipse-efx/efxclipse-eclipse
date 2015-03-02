package org.eclipse.fx.ide.l10n.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.l10n.nLSDsl.Message;
import org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry;
import org.eclipse.fx.ide.l10n.nLSDsl.MessageParam;
import org.eclipse.fx.ide.l10n.nLSDsl.NLS;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter;
import org.eclipse.fx.ide.l10n.nLSDsl.PackageDeclaration;
import org.eclipse.fx.ide.l10n.nLSDsl.RichString;
import org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteral;
import org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralEnd;
import org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralInbetween;
import org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralStart;
import org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart;
import org.eclipse.fx.ide.l10n.services.NLSDslGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class NLSDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NLSDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == NLSDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case NLSDslPackage.MESSAGE:
				if(context == grammarAccess.getMessageRule()) {
					sequence_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.MESSAGE_ENTRY:
				if(context == grammarAccess.getMessageEntryRule()) {
					sequence_MessageEntry(context, (MessageEntry) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.MESSAGE_PARAM:
				if(context == grammarAccess.getMessageParamRule()) {
					sequence_MessageParam(context, (MessageParam) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.NLS:
				if(context == grammarAccess.getNLSRule()) {
					sequence_NLS(context, (NLS) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.NLS_BUNDLE:
				if(context == grammarAccess.getNLSBundleRule()) {
					sequence_NLSBundle(context, (NLSBundle) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.NLS_FORMATTER:
				if(context == grammarAccess.getNLSFormatterRule()) {
					sequence_NLSFormatter(context, (NLSFormatter) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.RICH_STRING:
				if(context == grammarAccess.getRichStringRule()) {
					sequence_RichString(context, (RichString) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.RICH_STRING_LITERAL:
				if(context == grammarAccess.getRichStringLiteralRule()) {
					sequence_RichStringLiteral(context, (RichStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.RICH_STRING_LITERAL_END:
				if(context == grammarAccess.getRichStringLiteralEndRule()) {
					sequence_RichStringLiteralEnd(context, (RichStringLiteralEnd) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.RICH_STRING_LITERAL_INBETWEEN:
				if(context == grammarAccess.getRichStringLiteralInbetweenRule()) {
					sequence_RichStringLiteralInbetween(context, (RichStringLiteralInbetween) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.RICH_STRING_LITERAL_START:
				if(context == grammarAccess.getRichStringLiteralStartRule()) {
					sequence_RichStringLiteralStart(context, (RichStringLiteralStart) semanticObject); 
					return; 
				}
				else break;
			case NLSDslPackage.RICH_VAR_PART:
				if(context == grammarAccess.getRichVarPartRule()) {
					sequence_RichVarPart(context, (RichVarPart) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (paramList+=MessageParam paramList+=MessageParam*)? 
	 *         ((messageList+=Message messageList+=Message*) | entryRef=[MessageEntry|QualifiedName])
	 *     )
	 */
	protected void sequence_MessageEntry(EObject context, MessageEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (predefined=PredefinedTypes var=ID)
	 */
	protected void sequence_MessageParam(EObject context, MessageParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.MESSAGE_PARAM__PREDEFINED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.MESSAGE_PARAM__PREDEFINED));
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.MESSAGE_PARAM__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.MESSAGE_PARAM__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageParamAccess().getPredefinedPredefinedTypesEnumRuleCall_0_0(), semanticObject.getPredefined());
		feeder.accept(grammarAccess.getMessageParamAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID message=RichString)
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.MESSAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.MESSAGE__NAME));
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.MESSAGE__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.MESSAGE__MESSAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMessageAccess().getMessageRichStringParserRuleCall_2_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID lang=ID formatterList+=NLSFormatter* messageEntryList+=MessageEntry+)
	 */
	protected void sequence_NLSBundle(EObject context, NLSBundle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID classRef=QualifiedName)
	 */
	protected void sequence_NLSFormatter(EObject context, NLSFormatter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.NLS_FORMATTER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.NLS_FORMATTER__NAME));
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.NLS_FORMATTER__CLASS_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.NLS_FORMATTER__CLASS_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNLSFormatterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNLSFormatterAccess().getClassRefQualifiedNameParserRuleCall_2_0(), semanticObject.getClassRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (package=PackageDeclaration? bundleList+=NLSBundle+)
	 */
	protected void sequence_NLS(EObject context, NLS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.PACKAGE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.PACKAGE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=RICH_TEXT_END
	 */
	protected void sequence_RichStringLiteralEnd(EObject context, RichStringLiteralEnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.RICH_STRING_LITERAL_END__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.RICH_STRING_LITERAL_END__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRichStringLiteralEndAccess().getValueRICH_TEXT_ENDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=RICH_TEXT_INBETWEEN
	 */
	protected void sequence_RichStringLiteralInbetween(EObject context, RichStringLiteralInbetween semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.RICH_STRING_LITERAL_INBETWEEN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.RICH_STRING_LITERAL_INBETWEEN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRichStringLiteralInbetweenAccess().getValueRICH_TEXT_INBETWEENTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=RICH_TEXT_START
	 */
	protected void sequence_RichStringLiteralStart(EObject context, RichStringLiteralStart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.RICH_STRING_LITERAL_START__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.RICH_STRING_LITERAL_START__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRichStringLiteralStartAccess().getValueRICH_TEXT_STARTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=RICH_TEXT
	 */
	protected void sequence_RichStringLiteral(EObject context, RichStringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NLSDslPackage.Literals.RICH_STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NLSDslPackage.Literals.RICH_STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRichStringLiteralAccess().getValueRICH_TEXTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expressions+=RichStringLiteral | 
	 *         (
	 *             expressions+=RichStringLiteralStart 
	 *             expressions+=RichVarPart? 
	 *             (expressions+=RichStringLiteralInbetween expressions+=RichVarPart?)* 
	 *             expressions+=RichStringLiteralEnd
	 *         )
	 *     )
	 */
	protected void sequence_RichString(EObject context, RichString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID (format=STRING formatterClass=[NLSFormatter|QualifiedName]?)?)
	 */
	protected void sequence_RichVarPart(EObject context, RichVarPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}