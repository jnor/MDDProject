package mddProject.concreteSyntax.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mddProject.concreteSyntax.services.JDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContentModel'", "'{'", "'Name'", "'='", "'Contains'", "','", "'}'", "'visible'", "'ContentType'", "'guid'", "'hasProperties'", "'hasVersions'", "'modifiedBy'", "'Property'", "'accessModifer'", "'Datatype'", "'SingleType'", "'type'", "'ArrayType'", "'isAdmin'", "'Role'", "'types'", "'disabled'", "'User'", "'firstname'", "'lastname'", "'login'", "'password'", "'email'", "'hasRole'", "'Version'", "'CMS'", "'address_url'", "'username'", "'-'", "'char'", "'byte'", "'string'", "'int'", "'float'", "'double'", "'boolean'", "'date'", "'Jease'", "'N2'", "'Concrete5'", "'Plone'", "'public'", "'private'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalJDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g"; }



     	private JDSLGrammarAccess grammarAccess;
     	
        public InternalJDSLParser(TokenStream input, JDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ContentModel";	
       	}
       	
       	@Override
       	protected JDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleContentModel"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:68:1: entryRuleContentModel returns [EObject current=null] : iv_ruleContentModel= ruleContentModel EOF ;
    public final EObject entryRuleContentModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentModel = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:69:2: (iv_ruleContentModel= ruleContentModel EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:70:2: iv_ruleContentModel= ruleContentModel EOF
            {
             newCompositeNode(grammarAccess.getContentModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContentModel_in_entryRuleContentModel75);
            iv_ruleContentModel=ruleContentModel();

            state._fsp--;

             current =iv_ruleContentModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContentModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentModel"


    // $ANTLR start "ruleContentModel"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:77:1: ruleContentModel returns [EObject current=null] : ( () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ',' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleContentModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_hasElements_8_0 = null;

        EObject lv_hasElements_10_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:80:28: ( ( () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ',' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:81:1: ( () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ',' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:81:1: ( () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ',' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:81:2: () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ',' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:81:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContentModelAccess().getContentModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleContentModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getContentModelAccess().getContentModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getContentModelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContentModel155); 

                	newLeafNode(otherlv_3, grammarAccess.getContentModelAccess().getNameKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContentModel167); 

                	newLeafNode(otherlv_4, grammarAccess.getContentModelAccess().getEqualsSignKeyword_4());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:103:1: ( (lv_name_5_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:104:1: (lv_name_5_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:104:1: (lv_name_5_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:105:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getContentModelAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContentModel188);
            lv_name_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:121:2: (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ',' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:121:4: otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ',' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContentModel201); 

                        	newLeafNode(otherlv_6, grammarAccess.getContentModelAccess().getContainsKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentModel213); 

                        	newLeafNode(otherlv_7, grammarAccess.getContentModelAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:129:1: ( (lv_hasElements_8_0= ruleNamedElement ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:130:1: (lv_hasElements_8_0= ruleNamedElement )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:130:1: (lv_hasElements_8_0= ruleNamedElement )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:131:3: lv_hasElements_8_0= ruleNamedElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_ruleContentModel234);
                    lv_hasElements_8_0=ruleNamedElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentModelRule());
                    	        }
                           		add(
                           			current, 
                           			"hasElements",
                            		lv_hasElements_8_0, 
                            		"NamedElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:147:2: (otherlv_9= ',' ( (lv_hasElements_10_0= ruleNamedElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:147:4: otherlv_9= ',' ( (lv_hasElements_10_0= ruleNamedElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentModel247); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getContentModelAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:151:1: ( (lv_hasElements_10_0= ruleNamedElement ) )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:152:1: (lv_hasElements_10_0= ruleNamedElement )
                    	    {
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:152:1: (lv_hasElements_10_0= ruleNamedElement )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:153:3: lv_hasElements_10_0= ruleNamedElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_ruleContentModel268);
                    	    lv_hasElements_10_0=ruleNamedElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContentModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"hasElements",
                    	            		lv_hasElements_10_0, 
                    	            		"NamedElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentModel282); 

                        	newLeafNode(otherlv_11, grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentModel296); 

                	newLeafNode(otherlv_12, grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentModel"


    // $ANTLR start "entryRuleNamedElement"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:185:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:186:2: (iv_ruleNamedElement= ruleNamedElement EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:187:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_entryRuleNamedElement332);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedElement342); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:194:1: ruleNamedElement returns [EObject current=null] : (this_ContentType_0= ruleContentType | this_CMS_1= ruleCMS ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_ContentType_0 = null;

        EObject this_CMS_1 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:197:28: ( (this_ContentType_0= ruleContentType | this_CMS_1= ruleCMS ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:198:1: (this_ContentType_0= ruleContentType | this_CMS_1= ruleCMS )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:198:1: (this_ContentType_0= ruleContentType | this_CMS_1= ruleCMS )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=19)) ) {
                alt3=1;
            }
            else if ( (LA3_0==42) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:199:5: this_ContentType_0= ruleContentType
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getContentTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleContentType_in_ruleNamedElement389);
                    this_ContentType_0=ruleContentType();

                    state._fsp--;

                     
                            current = this_ContentType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:209:5: this_CMS_1= ruleCMS
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getCMSParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCMS_in_ruleNamedElement416);
                    this_CMS_1=ruleCMS();

                    state._fsp--;

                     
                            current = this_CMS_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleType"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:225:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:226:2: (iv_ruleType= ruleType EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:227:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType451);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:234:1: ruleType returns [EObject current=null] : (this_SingleType_0= ruleSingleType | this_ArrayType_1= ruleArrayType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SingleType_0 = null;

        EObject this_ArrayType_1 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:237:28: ( (this_SingleType_0= ruleSingleType | this_ArrayType_1= ruleArrayType ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:238:1: (this_SingleType_0= ruleSingleType | this_ArrayType_1= ruleArrayType )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:238:1: (this_SingleType_0= ruleSingleType | this_ArrayType_1= ruleArrayType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:239:5: this_SingleType_0= ruleSingleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSingleTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleType_in_ruleType508);
                    this_SingleType_0=ruleSingleType();

                    state._fsp--;

                     
                            current = this_SingleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:249:5: this_ArrayType_1= ruleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArrayType_in_ruleType535);
                    this_ArrayType_1=ruleArrayType();

                    state._fsp--;

                     
                            current = this_ArrayType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:265:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:266:2: (iv_ruleEString= ruleEString EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:267:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString571);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString582); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:274:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:277:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:278:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:278:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:278:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString622); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:286:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString648); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleContentType"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:301:1: entryRuleContentType returns [EObject current=null] : iv_ruleContentType= ruleContentType EOF ;
    public final EObject entryRuleContentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentType = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:302:2: (iv_ruleContentType= ruleContentType EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:303:2: iv_ruleContentType= ruleContentType EOF
            {
             newCompositeNode(grammarAccess.getContentTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContentType_in_entryRuleContentType693);
            iv_ruleContentType=ruleContentType();

            state._fsp--;

             current =iv_ruleContentType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContentType703); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentType"


    // $ANTLR start "ruleContentType"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:310:1: ruleContentType returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' ( (lv_guid_7_0= ruleEInt ) ) )? otherlv_8= 'hasProperties' otherlv_9= '{' ( (lv_hasProperties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_hasProperties_12_0= ruleProperty ) ) )* otherlv_13= '}' (otherlv_14= 'hasVersions' otherlv_15= '{' ( (lv_hasVersions_16_0= ruleVersion ) ) (otherlv_17= ',' ( (lv_hasVersions_18_0= ruleVersion ) ) )* otherlv_19= '}' )? (otherlv_20= 'modifiedBy' ( (lv_modifiedBy_21_0= ruleUser ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleContentType() throws RecognitionException {
        EObject current = null;

        Token lv_visible_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_guid_7_0 = null;

        EObject lv_hasProperties_10_0 = null;

        EObject lv_hasProperties_12_0 = null;

        EObject lv_hasVersions_16_0 = null;

        EObject lv_hasVersions_18_0 = null;

        EObject lv_modifiedBy_21_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:313:28: ( ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' ( (lv_guid_7_0= ruleEInt ) ) )? otherlv_8= 'hasProperties' otherlv_9= '{' ( (lv_hasProperties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_hasProperties_12_0= ruleProperty ) ) )* otherlv_13= '}' (otherlv_14= 'hasVersions' otherlv_15= '{' ( (lv_hasVersions_16_0= ruleVersion ) ) (otherlv_17= ',' ( (lv_hasVersions_18_0= ruleVersion ) ) )* otherlv_19= '}' )? (otherlv_20= 'modifiedBy' ( (lv_modifiedBy_21_0= ruleUser ) ) )? otherlv_22= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:314:1: ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' ( (lv_guid_7_0= ruleEInt ) ) )? otherlv_8= 'hasProperties' otherlv_9= '{' ( (lv_hasProperties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_hasProperties_12_0= ruleProperty ) ) )* otherlv_13= '}' (otherlv_14= 'hasVersions' otherlv_15= '{' ( (lv_hasVersions_16_0= ruleVersion ) ) (otherlv_17= ',' ( (lv_hasVersions_18_0= ruleVersion ) ) )* otherlv_19= '}' )? (otherlv_20= 'modifiedBy' ( (lv_modifiedBy_21_0= ruleUser ) ) )? otherlv_22= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:314:1: ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' ( (lv_guid_7_0= ruleEInt ) ) )? otherlv_8= 'hasProperties' otherlv_9= '{' ( (lv_hasProperties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_hasProperties_12_0= ruleProperty ) ) )* otherlv_13= '}' (otherlv_14= 'hasVersions' otherlv_15= '{' ( (lv_hasVersions_16_0= ruleVersion ) ) (otherlv_17= ',' ( (lv_hasVersions_18_0= ruleVersion ) ) )* otherlv_19= '}' )? (otherlv_20= 'modifiedBy' ( (lv_modifiedBy_21_0= ruleUser ) ) )? otherlv_22= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:314:2: ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' ( (lv_guid_7_0= ruleEInt ) ) )? otherlv_8= 'hasProperties' otherlv_9= '{' ( (lv_hasProperties_10_0= ruleProperty ) ) (otherlv_11= ',' ( (lv_hasProperties_12_0= ruleProperty ) ) )* otherlv_13= '}' (otherlv_14= 'hasVersions' otherlv_15= '{' ( (lv_hasVersions_16_0= ruleVersion ) ) (otherlv_17= ',' ( (lv_hasVersions_18_0= ruleVersion ) ) )* otherlv_19= '}' )? (otherlv_20= 'modifiedBy' ( (lv_modifiedBy_21_0= ruleUser ) ) )? otherlv_22= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:314:2: ( (lv_visible_0_0= 'visible' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:315:1: (lv_visible_0_0= 'visible' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:315:1: (lv_visible_0_0= 'visible' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:316:3: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContentType746); 

                            newLeafNode(lv_visible_0_0, grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContentType772); 

                	newLeafNode(otherlv_1, grammarAccess.getContentTypeAccess().getContentTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentType784); 

                	newLeafNode(otherlv_2, grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContentType796); 

                	newLeafNode(otherlv_3, grammarAccess.getContentTypeAccess().getNameKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContentType808); 

                	newLeafNode(otherlv_4, grammarAccess.getContentTypeAccess().getEqualsSignKeyword_4());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:345:1: ( (lv_name_5_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:346:1: (lv_name_5_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:346:1: (lv_name_5_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:347:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getContentTypeAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContentType829);
            lv_name_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:363:2: (otherlv_6= 'guid' ( (lv_guid_7_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:363:4: otherlv_6= 'guid' ( (lv_guid_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContentType842); 

                        	newLeafNode(otherlv_6, grammarAccess.getContentTypeAccess().getGuidKeyword_6_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:367:1: ( (lv_guid_7_0= ruleEInt ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:368:1: (lv_guid_7_0= ruleEInt )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:368:1: (lv_guid_7_0= ruleEInt )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:369:3: lv_guid_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentTypeAccess().getGuidEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleContentType863);
                    lv_guid_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"guid",
                            		lv_guid_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContentType877); 

                	newLeafNode(otherlv_8, grammarAccess.getContentTypeAccess().getHasPropertiesKeyword_7());
                
            otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentType889); 

                	newLeafNode(otherlv_9, grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_8());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:393:1: ( (lv_hasProperties_10_0= ruleProperty ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:394:1: (lv_hasProperties_10_0= ruleProperty )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:394:1: (lv_hasProperties_10_0= ruleProperty )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:395:3: lv_hasProperties_10_0= ruleProperty
            {
             
            	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleContentType910);
            lv_hasProperties_10_0=ruleProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
            	        }
                   		add(
                   			current, 
                   			"hasProperties",
                    		lv_hasProperties_10_0, 
                    		"Property");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:411:2: (otherlv_11= ',' ( (lv_hasProperties_12_0= ruleProperty ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:411:4: otherlv_11= ',' ( (lv_hasProperties_12_0= ruleProperty ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentType923); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContentTypeAccess().getCommaKeyword_10_0());
            	        
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:415:1: ( (lv_hasProperties_12_0= ruleProperty ) )
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:416:1: (lv_hasProperties_12_0= ruleProperty )
            	    {
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:416:1: (lv_hasProperties_12_0= ruleProperty )
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:417:3: lv_hasProperties_12_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleContentType944);
            	    lv_hasProperties_12_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hasProperties",
            	            		lv_hasProperties_12_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentType958); 

                	newLeafNode(otherlv_13, grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_11());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:437:1: (otherlv_14= 'hasVersions' otherlv_15= '{' ( (lv_hasVersions_16_0= ruleVersion ) ) (otherlv_17= ',' ( (lv_hasVersions_18_0= ruleVersion ) ) )* otherlv_19= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:437:3: otherlv_14= 'hasVersions' otherlv_15= '{' ( (lv_hasVersions_16_0= ruleVersion ) ) (otherlv_17= ',' ( (lv_hasVersions_18_0= ruleVersion ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleContentType971); 

                        	newLeafNode(otherlv_14, grammarAccess.getContentTypeAccess().getHasVersionsKeyword_12_0());
                        
                    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentType983); 

                        	newLeafNode(otherlv_15, grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:445:1: ( (lv_hasVersions_16_0= ruleVersion ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:446:1: (lv_hasVersions_16_0= ruleVersion )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:446:1: (lv_hasVersions_16_0= ruleVersion )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:447:3: lv_hasVersions_16_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleContentType1004);
                    lv_hasVersions_16_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"hasVersions",
                            		lv_hasVersions_16_0, 
                            		"Version");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:463:2: (otherlv_17= ',' ( (lv_hasVersions_18_0= ruleVersion ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:463:4: otherlv_17= ',' ( (lv_hasVersions_18_0= ruleVersion ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentType1017); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getContentTypeAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:467:1: ( (lv_hasVersions_18_0= ruleVersion ) )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:468:1: (lv_hasVersions_18_0= ruleVersion )
                    	    {
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:468:1: (lv_hasVersions_18_0= ruleVersion )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:469:3: lv_hasVersions_18_0= ruleVersion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleContentType1038);
                    	    lv_hasVersions_18_0=ruleVersion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"hasVersions",
                    	            		lv_hasVersions_18_0, 
                    	            		"Version");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentType1052); 

                        	newLeafNode(otherlv_19, grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:489:3: (otherlv_20= 'modifiedBy' ( (lv_modifiedBy_21_0= ruleUser ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:489:5: otherlv_20= 'modifiedBy' ( (lv_modifiedBy_21_0= ruleUser ) )
                    {
                    otherlv_20=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleContentType1067); 

                        	newLeafNode(otherlv_20, grammarAccess.getContentTypeAccess().getModifiedByKeyword_13_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:493:1: ( (lv_modifiedBy_21_0= ruleUser ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:494:1: (lv_modifiedBy_21_0= ruleUser )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:494:1: (lv_modifiedBy_21_0= ruleUser )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:495:3: lv_modifiedBy_21_0= ruleUser
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentTypeAccess().getModifiedByUserParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUser_in_ruleContentType1088);
                    lv_modifiedBy_21_0=ruleUser();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"modifiedBy",
                            		lv_modifiedBy_21_0, 
                            		"User");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentType1102); 

                	newLeafNode(otherlv_22, grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentType"


    // $ANTLR start "entryRuleProperty"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:523:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:524:2: (iv_ruleProperty= ruleProperty EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:525:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty1138);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty1148); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:532:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' ( (lv_accessModifer_6_0= ruleAccessLevelEnum ) ) (otherlv_7= 'Datatype' ( (lv_Datatype_8_0= ruleType ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_accessModifer_6_0 = null;

        EObject lv_Datatype_8_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:535:28: ( (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' ( (lv_accessModifer_6_0= ruleAccessLevelEnum ) ) (otherlv_7= 'Datatype' ( (lv_Datatype_8_0= ruleType ) ) )? otherlv_9= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:536:1: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' ( (lv_accessModifer_6_0= ruleAccessLevelEnum ) ) (otherlv_7= 'Datatype' ( (lv_Datatype_8_0= ruleType ) ) )? otherlv_9= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:536:1: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' ( (lv_accessModifer_6_0= ruleAccessLevelEnum ) ) (otherlv_7= 'Datatype' ( (lv_Datatype_8_0= ruleType ) ) )? otherlv_9= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:536:3: otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' ( (lv_accessModifer_6_0= ruleAccessLevelEnum ) ) (otherlv_7= 'Datatype' ( (lv_Datatype_8_0= ruleType ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleProperty1185); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProperty1197); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleProperty1209); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getNameKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProperty1221); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getEqualsSignKeyword_3());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:552:1: ( (lv_name_4_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:553:1: (lv_name_4_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:553:1: (lv_name_4_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:554:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty1242);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleProperty1254); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getAccessModiferKeyword_5());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:574:1: ( (lv_accessModifer_6_0= ruleAccessLevelEnum ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:575:1: (lv_accessModifer_6_0= ruleAccessLevelEnum )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:575:1: (lv_accessModifer_6_0= ruleAccessLevelEnum )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:576:3: lv_accessModifer_6_0= ruleAccessLevelEnum
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getAccessModiferAccessLevelEnumEnumRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAccessLevelEnum_in_ruleProperty1275);
            lv_accessModifer_6_0=ruleAccessLevelEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"accessModifer",
                    		lv_accessModifer_6_0, 
                    		"AccessLevelEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:592:2: (otherlv_7= 'Datatype' ( (lv_Datatype_8_0= ruleType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:592:4: otherlv_7= 'Datatype' ( (lv_Datatype_8_0= ruleType ) )
                    {
                    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleProperty1288); 

                        	newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getDatatypeKeyword_7_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:596:1: ( (lv_Datatype_8_0= ruleType ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:597:1: (lv_Datatype_8_0= ruleType )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:597:1: (lv_Datatype_8_0= ruleType )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:598:3: lv_Datatype_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getDatatypeTypeParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleProperty1309);
                    lv_Datatype_8_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"Datatype",
                            		lv_Datatype_8_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProperty1323); 

                	newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleSingleType"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:626:1: entryRuleSingleType returns [EObject current=null] : iv_ruleSingleType= ruleSingleType EOF ;
    public final EObject entryRuleSingleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleType = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:627:2: (iv_ruleSingleType= ruleSingleType EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:628:2: iv_ruleSingleType= ruleSingleType EOF
            {
             newCompositeNode(grammarAccess.getSingleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleType_in_entryRuleSingleType1359);
            iv_ruleSingleType=ruleSingleType();

            state._fsp--;

             current =iv_ruleSingleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleType1369); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleType"


    // $ANTLR start "ruleSingleType"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:635:1: ruleSingleType returns [EObject current=null] : ( () otherlv_1= 'SingleType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleSingleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:638:28: ( ( () otherlv_1= 'SingleType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:639:1: ( () otherlv_1= 'SingleType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:639:1: ( () otherlv_1= 'SingleType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:639:2: () otherlv_1= 'SingleType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:639:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:640:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSingleTypeAccess().getSingleTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSingleType1415); 

                	newLeafNode(otherlv_1, grammarAccess.getSingleTypeAccess().getSingleTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSingleType1427); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingleType1439); 

                	newLeafNode(otherlv_3, grammarAccess.getSingleTypeAccess().getNameKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSingleType1451); 

                	newLeafNode(otherlv_4, grammarAccess.getSingleTypeAccess().getEqualsSignKeyword_4());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:661:1: ( (lv_name_5_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:662:1: (lv_name_5_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:662:1: (lv_name_5_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:663:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSingleTypeAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleType1472);
            lv_name_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:679:2: (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:679:4: otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) )
                    {
                    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSingleType1485); 

                        	newLeafNode(otherlv_6, grammarAccess.getSingleTypeAccess().getTypeKeyword_6_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:683:1: ( (lv_type_7_0= ruleTypeEnum ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:684:1: (lv_type_7_0= ruleTypeEnum )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:684:1: (lv_type_7_0= ruleTypeEnum )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:685:3: lv_type_7_0= ruleTypeEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleTypeAccess().getTypeTypeEnumEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_ruleSingleType1506);
                    lv_type_7_0=ruleTypeEnum();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_7_0, 
                            		"TypeEnum");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingleType1520); 

                	newLeafNode(otherlv_8, grammarAccess.getSingleTypeAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleType"


    // $ANTLR start "entryRuleArrayType"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:713:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:714:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:715:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArrayType_in_entryRuleArrayType1556);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayType1566); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:722:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= 'ArrayType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:725:28: ( ( () otherlv_1= 'ArrayType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:726:1: ( () otherlv_1= 'ArrayType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:726:1: ( () otherlv_1= 'ArrayType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:726:2: () otherlv_1= 'ArrayType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )? otherlv_8= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:726:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:727:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleArrayType1612); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArrayType1624); 

                	newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArrayType1636); 

                	newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getNameKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArrayType1648); 

                	newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getEqualsSignKeyword_4());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:748:1: ( (lv_name_5_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:749:1: (lv_name_5_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:749:1: (lv_name_5_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:750:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArrayTypeAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArrayType1669);
            lv_name_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:766:2: (otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:766:4: otherlv_6= 'type' ( (lv_type_7_0= ruleTypeEnum ) )
                    {
                    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleArrayType1682); 

                        	newLeafNode(otherlv_6, grammarAccess.getArrayTypeAccess().getTypeKeyword_6_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:770:1: ( (lv_type_7_0= ruleTypeEnum ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:771:1: (lv_type_7_0= ruleTypeEnum )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:771:1: (lv_type_7_0= ruleTypeEnum )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:772:3: lv_type_7_0= ruleTypeEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getTypeTypeEnumEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_ruleArrayType1703);
                    lv_type_7_0=ruleTypeEnum();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_7_0, 
                            		"TypeEnum");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleArrayType1717); 

                	newLeafNode(otherlv_8, grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleRole"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:800:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:801:2: (iv_ruleRole= ruleRole EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:802:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole1753);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole1763); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:809:1: ruleRole returns [EObject current=null] : ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_isAdmin_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_types_9_0 = null;

        AntlrDatatypeRuleToken lv_types_11_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:812:28: ( ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:813:1: ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:813:1: ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:813:2: () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:813:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:814:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoleAccess().getRoleAction_0(),
                        current);
                

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:819:2: ( (lv_isAdmin_1_0= 'isAdmin' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:820:1: (lv_isAdmin_1_0= 'isAdmin' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:820:1: (lv_isAdmin_1_0= 'isAdmin' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:821:3: lv_isAdmin_1_0= 'isAdmin'
                    {
                    lv_isAdmin_1_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRole1815); 

                            newLeafNode(lv_isAdmin_1_0, grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(current, "isAdmin", true, "isAdmin");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRole1841); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getRoleKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRole1853); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRole1865); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getNameKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRole1877); 

                	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getEqualsSignKeyword_5());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:850:1: ( (lv_name_6_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:851:1: (lv_name_6_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:851:1: (lv_name_6_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:852:3: lv_name_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRole1898);
            lv_name_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:868:2: (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:868:4: otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRole1911); 

                        	newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getTypesKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRole1923); 

                        	newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:876:1: ( (lv_types_9_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:877:1: (lv_types_9_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:877:1: (lv_types_9_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:878:3: lv_types_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRole1944);
                    lv_types_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRoleRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:894:2: (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:894:4: otherlv_10= ',' ( (lv_types_11_0= ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRole1957); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:898:1: ( (lv_types_11_0= ruleEString ) )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:899:1: (lv_types_11_0= ruleEString )
                    	    {
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:899:1: (lv_types_11_0= ruleEString )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:900:3: lv_types_11_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRole1978);
                    	    lv_types_11_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRoleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_11_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRole1992); 

                        	newLeafNode(otherlv_12, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRole2006); 

                	newLeafNode(otherlv_13, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:932:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:933:2: (iv_ruleUser= ruleUser EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:934:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUser_in_entryRuleUser2042);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUser2052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:941:1: ruleUser returns [EObject current=null] : ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' ( (lv_firstname_8_0= ruleEString ) ) )? (otherlv_9= 'lastname' ( (lv_lastname_10_0= ruleEString ) ) )? (otherlv_11= 'login' ( (lv_login_12_0= ruleEString ) ) )? (otherlv_13= 'password' ( (lv_password_14_0= ruleEString ) ) )? (otherlv_15= 'email' ( (lv_email_16_0= ruleEString ) ) )? (otherlv_17= 'hasRole' ( (lv_hasRole_18_0= ruleRole ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_disabled_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_firstname_8_0 = null;

        AntlrDatatypeRuleToken lv_lastname_10_0 = null;

        AntlrDatatypeRuleToken lv_login_12_0 = null;

        AntlrDatatypeRuleToken lv_password_14_0 = null;

        AntlrDatatypeRuleToken lv_email_16_0 = null;

        EObject lv_hasRole_18_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:944:28: ( ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' ( (lv_firstname_8_0= ruleEString ) ) )? (otherlv_9= 'lastname' ( (lv_lastname_10_0= ruleEString ) ) )? (otherlv_11= 'login' ( (lv_login_12_0= ruleEString ) ) )? (otherlv_13= 'password' ( (lv_password_14_0= ruleEString ) ) )? (otherlv_15= 'email' ( (lv_email_16_0= ruleEString ) ) )? (otherlv_17= 'hasRole' ( (lv_hasRole_18_0= ruleRole ) ) )? otherlv_19= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:945:1: ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' ( (lv_firstname_8_0= ruleEString ) ) )? (otherlv_9= 'lastname' ( (lv_lastname_10_0= ruleEString ) ) )? (otherlv_11= 'login' ( (lv_login_12_0= ruleEString ) ) )? (otherlv_13= 'password' ( (lv_password_14_0= ruleEString ) ) )? (otherlv_15= 'email' ( (lv_email_16_0= ruleEString ) ) )? (otherlv_17= 'hasRole' ( (lv_hasRole_18_0= ruleRole ) ) )? otherlv_19= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:945:1: ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' ( (lv_firstname_8_0= ruleEString ) ) )? (otherlv_9= 'lastname' ( (lv_lastname_10_0= ruleEString ) ) )? (otherlv_11= 'login' ( (lv_login_12_0= ruleEString ) ) )? (otherlv_13= 'password' ( (lv_password_14_0= ruleEString ) ) )? (otherlv_15= 'email' ( (lv_email_16_0= ruleEString ) ) )? (otherlv_17= 'hasRole' ( (lv_hasRole_18_0= ruleRole ) ) )? otherlv_19= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:945:2: () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' ( (lv_firstname_8_0= ruleEString ) ) )? (otherlv_9= 'lastname' ( (lv_lastname_10_0= ruleEString ) ) )? (otherlv_11= 'login' ( (lv_login_12_0= ruleEString ) ) )? (otherlv_13= 'password' ( (lv_password_14_0= ruleEString ) ) )? (otherlv_15= 'email' ( (lv_email_16_0= ruleEString ) ) )? (otherlv_17= 'hasRole' ( (lv_hasRole_18_0= ruleRole ) ) )? otherlv_19= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:945:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:946:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUserAccess().getUserAction_0(),
                        current);
                

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:951:2: ( (lv_disabled_1_0= 'disabled' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:952:1: (lv_disabled_1_0= 'disabled' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:952:1: (lv_disabled_1_0= 'disabled' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:953:3: lv_disabled_1_0= 'disabled'
                    {
                    lv_disabled_1_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleUser2104); 

                            newLeafNode(lv_disabled_1_0, grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUserRule());
                    	        }
                           		setWithLastConsumed(current, "disabled", true, "disabled");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUser2130); 

                	newLeafNode(otherlv_2, grammarAccess.getUserAccess().getUserKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUser2142); 

                	newLeafNode(otherlv_3, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleUser2154); 

                	newLeafNode(otherlv_4, grammarAccess.getUserAccess().getNameKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser2166); 

                	newLeafNode(otherlv_5, grammarAccess.getUserAccess().getEqualsSignKeyword_5());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:982:1: ( (lv_name_6_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:983:1: (lv_name_6_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:983:1: (lv_name_6_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:984:3: lv_name_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUserAccess().getNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser2187);
            lv_name_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUserRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1000:2: (otherlv_7= 'firstname' ( (lv_firstname_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1000:4: otherlv_7= 'firstname' ( (lv_firstname_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleUser2200); 

                        	newLeafNode(otherlv_7, grammarAccess.getUserAccess().getFirstnameKeyword_7_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1004:1: ( (lv_firstname_8_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1005:1: (lv_firstname_8_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1005:1: (lv_firstname_8_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1006:3: lv_firstname_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getFirstnameEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser2221);
                    lv_firstname_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"firstname",
                            		lv_firstname_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1022:4: (otherlv_9= 'lastname' ( (lv_lastname_10_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1022:6: otherlv_9= 'lastname' ( (lv_lastname_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUser2236); 

                        	newLeafNode(otherlv_9, grammarAccess.getUserAccess().getLastnameKeyword_8_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1026:1: ( (lv_lastname_10_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1027:1: (lv_lastname_10_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1027:1: (lv_lastname_10_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1028:3: lv_lastname_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getLastnameEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser2257);
                    lv_lastname_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"lastname",
                            		lv_lastname_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1044:4: (otherlv_11= 'login' ( (lv_login_12_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1044:6: otherlv_11= 'login' ( (lv_login_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleUser2272); 

                        	newLeafNode(otherlv_11, grammarAccess.getUserAccess().getLoginKeyword_9_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1048:1: ( (lv_login_12_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1049:1: (lv_login_12_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1049:1: (lv_login_12_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1050:3: lv_login_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getLoginEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser2293);
                    lv_login_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"login",
                            		lv_login_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1066:4: (otherlv_13= 'password' ( (lv_password_14_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1066:6: otherlv_13= 'password' ( (lv_password_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleUser2308); 

                        	newLeafNode(otherlv_13, grammarAccess.getUserAccess().getPasswordKeyword_10_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1070:1: ( (lv_password_14_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1071:1: (lv_password_14_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1071:1: (lv_password_14_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1072:3: lv_password_14_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getPasswordEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser2329);
                    lv_password_14_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"password",
                            		lv_password_14_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1088:4: (otherlv_15= 'email' ( (lv_email_16_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1088:6: otherlv_15= 'email' ( (lv_email_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleUser2344); 

                        	newLeafNode(otherlv_15, grammarAccess.getUserAccess().getEmailKeyword_11_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1092:1: ( (lv_email_16_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1093:1: (lv_email_16_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1093:1: (lv_email_16_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1094:3: lv_email_16_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getEmailEStringParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser2365);
                    lv_email_16_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"email",
                            		lv_email_16_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1110:4: (otherlv_17= 'hasRole' ( (lv_hasRole_18_0= ruleRole ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1110:6: otherlv_17= 'hasRole' ( (lv_hasRole_18_0= ruleRole ) )
                    {
                    otherlv_17=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleUser2380); 

                        	newLeafNode(otherlv_17, grammarAccess.getUserAccess().getHasRoleKeyword_12_0());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1114:1: ( (lv_hasRole_18_0= ruleRole ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1115:1: (lv_hasRole_18_0= ruleRole )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1115:1: (lv_hasRole_18_0= ruleRole )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1116:3: lv_hasRole_18_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getHasRoleRoleParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleUser2401);
                    lv_hasRole_18_0=ruleRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"hasRole",
                            		lv_hasRole_18_0, 
                            		"Role");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUser2415); 

                	newLeafNode(otherlv_19, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleVersion"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1144:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1145:2: (iv_ruleVersion= ruleVersion EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1146:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion2451);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion2461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1153:1: ruleVersion returns [EObject current=null] : ( () otherlv_1= 'Version' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1156:28: ( ( () otherlv_1= 'Version' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1157:1: ( () otherlv_1= 'Version' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1157:1: ( () otherlv_1= 'Version' ( (lv_name_2_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1157:2: () otherlv_1= 'Version' ( (lv_name_2_0= ruleEString ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1157:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1158:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVersionAccess().getVersionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleVersion2507); 

                	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getVersionKeyword_1());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1167:1: ( (lv_name_2_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1168:1: (lv_name_2_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1168:1: (lv_name_2_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1169:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVersion2528);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVersionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleCMS"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1193:1: entryRuleCMS returns [EObject current=null] : iv_ruleCMS= ruleCMS EOF ;
    public final EObject entryRuleCMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMS = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1194:2: (iv_ruleCMS= ruleCMS EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1195:2: iv_ruleCMS= ruleCMS EOF
            {
             newCompositeNode(grammarAccess.getCMSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCMS_in_entryRuleCMS2564);
            iv_ruleCMS=ruleCMS();

            state._fsp--;

             current =iv_ruleCMS; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCMS2574); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCMS"


    // $ANTLR start "ruleCMS"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1202:1: ruleCMS returns [EObject current=null] : ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleCMSEnum ) ) ) (otherlv_8= 'address_url' ( (lv_address_url_9_0= ruleEString ) ) ) (otherlv_10= 'username' ( (lv_username_11_0= ruleEString ) ) ) (otherlv_12= 'password' ( (lv_password_13_0= ruleEString ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleCMS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_type_7_0 = null;

        AntlrDatatypeRuleToken lv_address_url_9_0 = null;

        AntlrDatatypeRuleToken lv_username_11_0 = null;

        AntlrDatatypeRuleToken lv_password_13_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1205:28: ( ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleCMSEnum ) ) ) (otherlv_8= 'address_url' ( (lv_address_url_9_0= ruleEString ) ) ) (otherlv_10= 'username' ( (lv_username_11_0= ruleEString ) ) ) (otherlv_12= 'password' ( (lv_password_13_0= ruleEString ) ) ) otherlv_14= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1206:1: ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleCMSEnum ) ) ) (otherlv_8= 'address_url' ( (lv_address_url_9_0= ruleEString ) ) ) (otherlv_10= 'username' ( (lv_username_11_0= ruleEString ) ) ) (otherlv_12= 'password' ( (lv_password_13_0= ruleEString ) ) ) otherlv_14= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1206:1: ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleCMSEnum ) ) ) (otherlv_8= 'address_url' ( (lv_address_url_9_0= ruleEString ) ) ) (otherlv_10= 'username' ( (lv_username_11_0= ruleEString ) ) ) (otherlv_12= 'password' ( (lv_password_13_0= ruleEString ) ) ) otherlv_14= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1206:2: () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' ( (lv_type_7_0= ruleCMSEnum ) ) ) (otherlv_8= 'address_url' ( (lv_address_url_9_0= ruleEString ) ) ) (otherlv_10= 'username' ( (lv_username_11_0= ruleEString ) ) ) (otherlv_12= 'password' ( (lv_password_13_0= ruleEString ) ) ) otherlv_14= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1206:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1207:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCMSAccess().getCMSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCMS2620); 

                	newLeafNode(otherlv_1, grammarAccess.getCMSAccess().getCMSKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCMS2632); 

                	newLeafNode(otherlv_2, grammarAccess.getCMSAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCMS2644); 

                	newLeafNode(otherlv_3, grammarAccess.getCMSAccess().getNameKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2656); 

                	newLeafNode(otherlv_4, grammarAccess.getCMSAccess().getEqualsSignKeyword_4());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1228:1: ( (lv_name_5_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1229:1: (lv_name_5_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1229:1: (lv_name_5_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1230:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2677);
            lv_name_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCMSRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1246:2: (otherlv_6= 'type' ( (lv_type_7_0= ruleCMSEnum ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1246:4: otherlv_6= 'type' ( (lv_type_7_0= ruleCMSEnum ) )
            {
            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCMS2690); 

                	newLeafNode(otherlv_6, grammarAccess.getCMSAccess().getTypeKeyword_6_0());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1250:1: ( (lv_type_7_0= ruleCMSEnum ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1251:1: (lv_type_7_0= ruleCMSEnum )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1251:1: (lv_type_7_0= ruleCMSEnum )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1252:3: lv_type_7_0= ruleCMSEnum
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getTypeCMSEnumEnumRuleCall_6_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCMSEnum_in_ruleCMS2711);
            lv_type_7_0=ruleCMSEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCMSRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_7_0, 
                    		"CMSEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1268:3: (otherlv_8= 'address_url' ( (lv_address_url_9_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1268:5: otherlv_8= 'address_url' ( (lv_address_url_9_0= ruleEString ) )
            {
            otherlv_8=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleCMS2725); 

                	newLeafNode(otherlv_8, grammarAccess.getCMSAccess().getAddress_urlKeyword_7_0());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1272:1: ( (lv_address_url_9_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1273:1: (lv_address_url_9_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1273:1: (lv_address_url_9_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1274:3: lv_address_url_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getAddress_urlEStringParserRuleCall_7_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2746);
            lv_address_url_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCMSRule());
            	        }
                   		set(
                   			current, 
                   			"address_url",
                    		lv_address_url_9_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1290:3: (otherlv_10= 'username' ( (lv_username_11_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1290:5: otherlv_10= 'username' ( (lv_username_11_0= ruleEString ) )
            {
            otherlv_10=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleCMS2760); 

                	newLeafNode(otherlv_10, grammarAccess.getCMSAccess().getUsernameKeyword_8_0());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1294:1: ( (lv_username_11_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1295:1: (lv_username_11_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1295:1: (lv_username_11_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1296:3: lv_username_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getUsernameEStringParserRuleCall_8_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2781);
            lv_username_11_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCMSRule());
            	        }
                   		set(
                   			current, 
                   			"username",
                    		lv_username_11_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1312:3: (otherlv_12= 'password' ( (lv_password_13_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1312:5: otherlv_12= 'password' ( (lv_password_13_0= ruleEString ) )
            {
            otherlv_12=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCMS2795); 

                	newLeafNode(otherlv_12, grammarAccess.getCMSAccess().getPasswordKeyword_9_0());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1316:1: ( (lv_password_13_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1317:1: (lv_password_13_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1317:1: (lv_password_13_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1318:3: lv_password_13_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getPasswordEStringParserRuleCall_9_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2816);
            lv_password_13_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCMSRule());
            	        }
                   		set(
                   			current, 
                   			"password",
                    		lv_password_13_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCMS2829); 

                	newLeafNode(otherlv_14, grammarAccess.getCMSAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCMS"


    // $ANTLR start "entryRuleEInt"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1346:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1347:2: (iv_ruleEInt= ruleEInt EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1348:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2866);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1355:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1358:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1359:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1359:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1359:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1359:2: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1360:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEInt2916); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2933); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleTypeEnum"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1382:1: ruleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) ) ;
    public final Enumerator ruleTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1384:28: ( ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1385:1: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1385:1: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) )
            int alt26=8;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt26=1;
                }
                break;
            case 47:
                {
                alt26=2;
                }
                break;
            case 48:
                {
                alt26=3;
                }
                break;
            case 49:
                {
                alt26=4;
                }
                break;
            case 50:
                {
                alt26=5;
                }
                break;
            case 51:
                {
                alt26=6;
                }
                break;
            case 52:
                {
                alt26=7;
                }
                break;
            case 53:
                {
                alt26=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1385:2: (enumLiteral_0= 'char' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1385:2: (enumLiteral_0= 'char' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1385:4: enumLiteral_0= 'char'
                    {
                    enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTypeEnum2994); 

                            current = grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1391:6: (enumLiteral_1= 'byte' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1391:6: (enumLiteral_1= 'byte' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1391:8: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTypeEnum3011); 

                            current = grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1397:6: (enumLiteral_2= 'string' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1397:6: (enumLiteral_2= 'string' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1397:8: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTypeEnum3028); 

                            current = grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1403:6: (enumLiteral_3= 'int' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1403:6: (enumLiteral_3= 'int' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1403:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTypeEnum3045); 

                            current = grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1409:6: (enumLiteral_4= 'float' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1409:6: (enumLiteral_4= 'float' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1409:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTypeEnum3062); 

                            current = grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1415:6: (enumLiteral_5= 'double' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1415:6: (enumLiteral_5= 'double' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1415:8: enumLiteral_5= 'double'
                    {
                    enumLiteral_5=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTypeEnum3079); 

                            current = grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1421:6: (enumLiteral_6= 'boolean' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1421:6: (enumLiteral_6= 'boolean' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1421:8: enumLiteral_6= 'boolean'
                    {
                    enumLiteral_6=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTypeEnum3096); 

                            current = grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1427:6: (enumLiteral_7= 'date' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1427:6: (enumLiteral_7= 'date' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1427:8: enumLiteral_7= 'date'
                    {
                    enumLiteral_7=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTypeEnum3113); 

                            current = grammarAccess.getTypeEnumAccess().getDateEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTypeEnumAccess().getDateEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeEnum"


    // $ANTLR start "ruleCMSEnum"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1437:1: ruleCMSEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) ) ;
    public final Enumerator ruleCMSEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1439:28: ( ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1440:1: ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1440:1: ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt27=1;
                }
                break;
            case 55:
                {
                alt27=2;
                }
                break;
            case 56:
                {
                alt27=3;
                }
                break;
            case 57:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1440:2: (enumLiteral_0= 'Jease' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1440:2: (enumLiteral_0= 'Jease' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1440:4: enumLiteral_0= 'Jease'
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleCMSEnum3158); 

                            current = grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1446:6: (enumLiteral_1= 'N2' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1446:6: (enumLiteral_1= 'N2' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1446:8: enumLiteral_1= 'N2'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleCMSEnum3175); 

                            current = grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1452:6: (enumLiteral_2= 'Concrete5' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1452:6: (enumLiteral_2= 'Concrete5' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1452:8: enumLiteral_2= 'Concrete5'
                    {
                    enumLiteral_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleCMSEnum3192); 

                            current = grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1458:6: (enumLiteral_3= 'Plone' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1458:6: (enumLiteral_3= 'Plone' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1458:8: enumLiteral_3= 'Plone'
                    {
                    enumLiteral_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleCMSEnum3209); 

                            current = grammarAccess.getCMSEnumAccess().getPloneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCMSEnumAccess().getPloneEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCMSEnum"


    // $ANTLR start "ruleAccessLevelEnum"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1468:1: ruleAccessLevelEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleAccessLevelEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1470:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1471:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1471:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==58) ) {
                alt28=1;
            }
            else if ( (LA28_0==59) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1471:2: (enumLiteral_0= 'public' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1471:2: (enumLiteral_0= 'public' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1471:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleAccessLevelEnum3254); 

                            current = grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1477:6: (enumLiteral_1= 'private' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1477:6: (enumLiteral_1= 'private' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1477:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleAccessLevelEnum3271); 

                            current = grammarAccess.getAccessLevelEnumAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAccessLevelEnumAccess().getPrivateEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessLevelEnum"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleContentModel_in_entryRuleContentModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContentModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleContentModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentModel143 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContentModel155 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleContentModel167 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContentModel188 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_ruleContentModel201 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentModel213 = new BitSet(new long[]{0x00000400000C0000L});
        public static final BitSet FOLLOW_ruleNamedElement_in_ruleContentModel234 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleContentModel247 = new BitSet(new long[]{0x00000400000C0000L});
        public static final BitSet FOLLOW_ruleNamedElement_in_ruleContentModel268 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleContentModel282 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContentModel296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_ruleNamedElement389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_ruleNamedElement416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleType_in_ruleType508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayType_in_ruleType535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_entryRuleContentType693 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContentType703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleContentType746 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleContentType772 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentType784 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContentType796 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleContentType808 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContentType829 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleContentType842 = new BitSet(new long[]{0x0000200000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleContentType863 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleContentType877 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentType889 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleContentType910 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleContentType923 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleContentType944 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleContentType958 = new BitSet(new long[]{0x0000000000C20000L});
        public static final BitSet FOLLOW_22_in_ruleContentType971 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentType983 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleContentType1004 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleContentType1017 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleContentType1038 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleContentType1052 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleContentType1067 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_ruleUser_in_ruleContentType1088 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContentType1102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleProperty1185 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProperty1197 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleProperty1209 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProperty1221 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty1242 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleProperty1254 = new BitSet(new long[]{0x0C00000000000000L});
        public static final BitSet FOLLOW_ruleAccessLevelEnum_in_ruleProperty1275 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleProperty1288 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_ruleType_in_ruleProperty1309 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProperty1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleType_in_entryRuleSingleType1359 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleType1369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSingleType1415 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSingleType1427 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingleType1439 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSingleType1451 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleType1472 = new BitSet(new long[]{0x0000000010020000L});
        public static final BitSet FOLLOW_28_in_ruleSingleType1485 = new BitSet(new long[]{0x003FC00000000000L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_ruleSingleType1506 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSingleType1520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType1556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayType1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleArrayType1612 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleArrayType1624 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleArrayType1636 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleArrayType1648 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArrayType1669 = new BitSet(new long[]{0x0000000010020000L});
        public static final BitSet FOLLOW_28_in_ruleArrayType1682 = new BitSet(new long[]{0x003FC00000000000L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_ruleArrayType1703 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleArrayType1717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole1763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRole1815 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRole1841 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole1853 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRole1865 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRole1877 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRole1898 = new BitSet(new long[]{0x0000000100020000L});
        public static final BitSet FOLLOW_32_in_ruleRole1911 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole1923 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRole1944 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleRole1957 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRole1978 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleRole1992 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRole2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUser_in_entryRuleUser2042 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUser2052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleUser2104 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleUser2130 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUser2142 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleUser2154 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser2166 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser2187 = new BitSet(new long[]{0x000001F800020000L});
        public static final BitSet FOLLOW_35_in_ruleUser2200 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser2221 = new BitSet(new long[]{0x000001F000020000L});
        public static final BitSet FOLLOW_36_in_ruleUser2236 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser2257 = new BitSet(new long[]{0x000001E000020000L});
        public static final BitSet FOLLOW_37_in_ruleUser2272 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser2293 = new BitSet(new long[]{0x000001C000020000L});
        public static final BitSet FOLLOW_38_in_ruleUser2308 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser2329 = new BitSet(new long[]{0x0000018000020000L});
        public static final BitSet FOLLOW_39_in_ruleUser2344 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser2365 = new BitSet(new long[]{0x0000010000020000L});
        public static final BitSet FOLLOW_40_in_ruleUser2380 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleRole_in_ruleUser2401 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleUser2415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleVersion2507 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVersion2528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_entryRuleCMS2564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCMS2574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleCMS2620 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCMS2632 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCMS2644 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2656 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2677 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCMS2690 = new BitSet(new long[]{0x03C0000000000000L});
        public static final BitSet FOLLOW_ruleCMSEnum_in_ruleCMS2711 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleCMS2725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2746 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleCMS2760 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2781 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleCMS2795 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2816 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCMS2829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEInt2916 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTypeEnum2994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTypeEnum3011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTypeEnum3028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTypeEnum3045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTypeEnum3062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTypeEnum3079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTypeEnum3096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTypeEnum3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleCMSEnum3158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleCMSEnum3175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleCMSEnum3192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleCMSEnum3209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleAccessLevelEnum3254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleAccessLevelEnum3271 = new BitSet(new long[]{0x0000000000000002L});
    }


}