package mddProject.concreteSyntax.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jdsl.ArrayType;
import jdsl.CMS;
import jdsl.ContentModel;
import jdsl.ContentType;
import jdsl.JdslPackage;
import jdsl.Property;
import jdsl.Role;
import jdsl.SingleType;
import jdsl.User;
import jdsl.Version;
import mddProject.concreteSyntax.services.JDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
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
public class JDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JdslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JdslPackage.ARRAY_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ArrayType(context, (ArrayType) semanticObject); 
					return; 
				}
				else break;
			case JdslPackage.CMS:
				if(context == grammarAccess.getCMSRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_CMS(context, (CMS) semanticObject); 
					return; 
				}
				else break;
			case JdslPackage.CONTENT_MODEL:
				if(context == grammarAccess.getContentModelRule()) {
					sequence_ContentModel(context, (ContentModel) semanticObject); 
					return; 
				}
				else break;
			case JdslPackage.CONTENT_TYPE:
				if(context == grammarAccess.getContentTypeRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_ContentType(context, (ContentType) semanticObject); 
					return; 
				}
				else break;
			case JdslPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case JdslPackage.ROLE:
				if(context == grammarAccess.getRoleRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case JdslPackage.SINGLE_TYPE:
				if(context == grammarAccess.getSingleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_SingleType(context, (SingleType) semanticObject); 
					return; 
				}
				else break;
			case JdslPackage.USER:
				if(context == grammarAccess.getUserRule()) {
					sequence_User(context, (User) semanticObject); 
					return; 
				}
				else break;
			case JdslPackage.VERSION:
				if(context == grammarAccess.getVersionRule()) {
					sequence_Version(context, (Version) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString type=TypeEnum?)
	 */
	protected void sequence_ArrayType(EObject context, ArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=CMSEnum address_url=EString username=EString password=EString)
	 */
	protected void sequence_CMS(EObject context, CMS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JdslPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JdslPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, JdslPackage.Literals.CMS__ADDRESS_URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JdslPackage.Literals.CMS__ADDRESS_URL));
			if(transientValues.isValueTransient(semanticObject, JdslPackage.Literals.CMS__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JdslPackage.Literals.CMS__TYPE));
			if(transientValues.isValueTransient(semanticObject, JdslPackage.Literals.CMS__USERNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JdslPackage.Literals.CMS__USERNAME));
			if(transientValues.isValueTransient(semanticObject, JdslPackage.Literals.CMS__PASSWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JdslPackage.Literals.CMS__PASSWORD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCMSAccess().getNameEStringParserRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCMSAccess().getTypeCMSEnumEnumRuleCall_6_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCMSAccess().getAddress_urlEStringParserRuleCall_7_1_0(), semanticObject.getAddress_url());
		feeder.accept(grammarAccess.getCMSAccess().getUsernameEStringParserRuleCall_8_1_0(), semanticObject.getUsername());
		feeder.accept(grammarAccess.getCMSAccess().getPasswordEStringParserRuleCall_9_1_0(), semanticObject.getPassword());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (hasElements+=NamedElement hasElements+=NamedElement*)?)
	 */
	protected void sequence_ContentModel(EObject context, ContentModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         name=EString 
	 *         guid=EInt? 
	 *         hasProperties+=Property 
	 *         hasProperties+=Property* 
	 *         (hasVersions+=Version hasVersions+=Version*)? 
	 *         modifiedBy=User?
	 *     )
	 */
	protected void sequence_ContentType(EObject context, ContentType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString accessModifer=AccessLevelEnum Datatype=Type?)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isAdmin?='isAdmin'? name=EString (types+=EString types+=EString*)?)
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=TypeEnum?)
	 */
	protected void sequence_SingleType(EObject context, SingleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         disabled?='disabled'? 
	 *         name=EString 
	 *         firstname=EString? 
	 *         lastname=EString? 
	 *         login=EString? 
	 *         password=EString? 
	 *         email=EString? 
	 *         hasRole=Role?
	 *     )
	 */
	protected void sequence_User(EObject context, User semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Version(EObject context, Version semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JdslPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JdslPackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
}
