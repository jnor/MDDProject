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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContentModel'", "'{'", "'Name'", "'='", "'Contains'", "','", "'}'", "'visible'", "'ContentType'", "'guid'", "'hasProperties'", "'hasVersions'", "'modifiedBy'", "'Property'", "'accessModifer'", "'Type'", "'isAdmin'", "'Role'", "'types'", "'disabled'", "'User'", "'firstname'", "'lastname'", "'login'", "'password'", "'email'", "'Version'", "'Number'", "'CMS'", "'type'", "'address_url'", "'username'", "'-'", "'char'", "'byte'", "'string'", "'int'", "'float'", "'double'", "'boolean'", "'date'", "'Jease'", "'N2'", "'Concrete5'", "'Plone'", "'public'", "'private'"
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
            else if ( (LA3_0==39) ) {
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


    // $ANTLR start "entryRuleEString"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:225:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:226:2: (iv_ruleEString= ruleEString EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:227:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString452);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString463); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:234:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:237:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:238:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:238:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:238:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString503); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:246:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString529); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:261:1: entryRuleContentType returns [EObject current=null] : iv_ruleContentType= ruleContentType EOF ;
    public final EObject entryRuleContentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentType = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:262:2: (iv_ruleContentType= ruleContentType EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:263:2: iv_ruleContentType= ruleContentType EOF
            {
             newCompositeNode(grammarAccess.getContentTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContentType_in_entryRuleContentType574);
            iv_ruleContentType=ruleContentType();

            state._fsp--;

             current =iv_ruleContentType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContentType584); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:270:1: ruleContentType returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' otherlv_7= '=' ( (lv_guid_8_0= ruleEInt ) ) )? otherlv_9= 'hasProperties' otherlv_10= '{' ( (lv_hasProperties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_hasProperties_13_0= ruleProperty ) ) )* otherlv_14= '}' (otherlv_15= 'hasVersions' otherlv_16= '{' ( (lv_hasVersions_17_0= ruleVersion ) ) (otherlv_18= ',' ( (lv_hasVersions_19_0= ruleVersion ) ) )* otherlv_20= '}' )? (otherlv_21= 'modifiedBy' otherlv_22= '=' ( (lv_modifiedBy_23_0= ruleUser ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleContentType() throws RecognitionException {
        EObject current = null;

        Token lv_visible_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_guid_8_0 = null;

        EObject lv_hasProperties_11_0 = null;

        EObject lv_hasProperties_13_0 = null;

        EObject lv_hasVersions_17_0 = null;

        EObject lv_hasVersions_19_0 = null;

        EObject lv_modifiedBy_23_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:273:28: ( ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' otherlv_7= '=' ( (lv_guid_8_0= ruleEInt ) ) )? otherlv_9= 'hasProperties' otherlv_10= '{' ( (lv_hasProperties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_hasProperties_13_0= ruleProperty ) ) )* otherlv_14= '}' (otherlv_15= 'hasVersions' otherlv_16= '{' ( (lv_hasVersions_17_0= ruleVersion ) ) (otherlv_18= ',' ( (lv_hasVersions_19_0= ruleVersion ) ) )* otherlv_20= '}' )? (otherlv_21= 'modifiedBy' otherlv_22= '=' ( (lv_modifiedBy_23_0= ruleUser ) ) )? otherlv_24= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:274:1: ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' otherlv_7= '=' ( (lv_guid_8_0= ruleEInt ) ) )? otherlv_9= 'hasProperties' otherlv_10= '{' ( (lv_hasProperties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_hasProperties_13_0= ruleProperty ) ) )* otherlv_14= '}' (otherlv_15= 'hasVersions' otherlv_16= '{' ( (lv_hasVersions_17_0= ruleVersion ) ) (otherlv_18= ',' ( (lv_hasVersions_19_0= ruleVersion ) ) )* otherlv_20= '}' )? (otherlv_21= 'modifiedBy' otherlv_22= '=' ( (lv_modifiedBy_23_0= ruleUser ) ) )? otherlv_24= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:274:1: ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' otherlv_7= '=' ( (lv_guid_8_0= ruleEInt ) ) )? otherlv_9= 'hasProperties' otherlv_10= '{' ( (lv_hasProperties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_hasProperties_13_0= ruleProperty ) ) )* otherlv_14= '}' (otherlv_15= 'hasVersions' otherlv_16= '{' ( (lv_hasVersions_17_0= ruleVersion ) ) (otherlv_18= ',' ( (lv_hasVersions_19_0= ruleVersion ) ) )* otherlv_20= '}' )? (otherlv_21= 'modifiedBy' otherlv_22= '=' ( (lv_modifiedBy_23_0= ruleUser ) ) )? otherlv_24= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:274:2: ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'guid' otherlv_7= '=' ( (lv_guid_8_0= ruleEInt ) ) )? otherlv_9= 'hasProperties' otherlv_10= '{' ( (lv_hasProperties_11_0= ruleProperty ) ) (otherlv_12= ',' ( (lv_hasProperties_13_0= ruleProperty ) ) )* otherlv_14= '}' (otherlv_15= 'hasVersions' otherlv_16= '{' ( (lv_hasVersions_17_0= ruleVersion ) ) (otherlv_18= ',' ( (lv_hasVersions_19_0= ruleVersion ) ) )* otherlv_20= '}' )? (otherlv_21= 'modifiedBy' otherlv_22= '=' ( (lv_modifiedBy_23_0= ruleUser ) ) )? otherlv_24= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:274:2: ( (lv_visible_0_0= 'visible' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:275:1: (lv_visible_0_0= 'visible' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:275:1: (lv_visible_0_0= 'visible' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:276:3: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContentType627); 

                            newLeafNode(lv_visible_0_0, grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContentType653); 

                	newLeafNode(otherlv_1, grammarAccess.getContentTypeAccess().getContentTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentType665); 

                	newLeafNode(otherlv_2, grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContentType677); 

                	newLeafNode(otherlv_3, grammarAccess.getContentTypeAccess().getNameKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContentType689); 

                	newLeafNode(otherlv_4, grammarAccess.getContentTypeAccess().getEqualsSignKeyword_4());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:305:1: ( (lv_name_5_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:306:1: (lv_name_5_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:306:1: (lv_name_5_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:307:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getContentTypeAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContentType710);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:323:2: (otherlv_6= 'guid' otherlv_7= '=' ( (lv_guid_8_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:323:4: otherlv_6= 'guid' otherlv_7= '=' ( (lv_guid_8_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContentType723); 

                        	newLeafNode(otherlv_6, grammarAccess.getContentTypeAccess().getGuidKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContentType735); 

                        	newLeafNode(otherlv_7, grammarAccess.getContentTypeAccess().getEqualsSignKeyword_6_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:331:1: ( (lv_guid_8_0= ruleEInt ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:332:1: (lv_guid_8_0= ruleEInt )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:332:1: (lv_guid_8_0= ruleEInt )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:333:3: lv_guid_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentTypeAccess().getGuidEIntParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleContentType756);
                    lv_guid_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"guid",
                            		lv_guid_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContentType770); 

                	newLeafNode(otherlv_9, grammarAccess.getContentTypeAccess().getHasPropertiesKeyword_7());
                
            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentType782); 

                	newLeafNode(otherlv_10, grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_8());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:357:1: ( (lv_hasProperties_11_0= ruleProperty ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:358:1: (lv_hasProperties_11_0= ruleProperty )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:358:1: (lv_hasProperties_11_0= ruleProperty )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:359:3: lv_hasProperties_11_0= ruleProperty
            {
             
            	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleContentType803);
            lv_hasProperties_11_0=ruleProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
            	        }
                   		add(
                   			current, 
                   			"hasProperties",
                    		lv_hasProperties_11_0, 
                    		"Property");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:375:2: (otherlv_12= ',' ( (lv_hasProperties_13_0= ruleProperty ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:375:4: otherlv_12= ',' ( (lv_hasProperties_13_0= ruleProperty ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentType816); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContentTypeAccess().getCommaKeyword_10_0());
            	        
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:379:1: ( (lv_hasProperties_13_0= ruleProperty ) )
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:380:1: (lv_hasProperties_13_0= ruleProperty )
            	    {
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:380:1: (lv_hasProperties_13_0= ruleProperty )
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:381:3: lv_hasProperties_13_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleContentType837);
            	    lv_hasProperties_13_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hasProperties",
            	            		lv_hasProperties_13_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentType851); 

                	newLeafNode(otherlv_14, grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_11());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:401:1: (otherlv_15= 'hasVersions' otherlv_16= '{' ( (lv_hasVersions_17_0= ruleVersion ) ) (otherlv_18= ',' ( (lv_hasVersions_19_0= ruleVersion ) ) )* otherlv_20= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:401:3: otherlv_15= 'hasVersions' otherlv_16= '{' ( (lv_hasVersions_17_0= ruleVersion ) ) (otherlv_18= ',' ( (lv_hasVersions_19_0= ruleVersion ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleContentType864); 

                        	newLeafNode(otherlv_15, grammarAccess.getContentTypeAccess().getHasVersionsKeyword_12_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentType876); 

                        	newLeafNode(otherlv_16, grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:409:1: ( (lv_hasVersions_17_0= ruleVersion ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:410:1: (lv_hasVersions_17_0= ruleVersion )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:410:1: (lv_hasVersions_17_0= ruleVersion )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:411:3: lv_hasVersions_17_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleContentType897);
                    lv_hasVersions_17_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"hasVersions",
                            		lv_hasVersions_17_0, 
                            		"Version");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:427:2: (otherlv_18= ',' ( (lv_hasVersions_19_0= ruleVersion ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:427:4: otherlv_18= ',' ( (lv_hasVersions_19_0= ruleVersion ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentType910); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getContentTypeAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:431:1: ( (lv_hasVersions_19_0= ruleVersion ) )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:432:1: (lv_hasVersions_19_0= ruleVersion )
                    	    {
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:432:1: (lv_hasVersions_19_0= ruleVersion )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:433:3: lv_hasVersions_19_0= ruleVersion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleContentType931);
                    	    lv_hasVersions_19_0=ruleVersion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"hasVersions",
                    	            		lv_hasVersions_19_0, 
                    	            		"Version");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentType945); 

                        	newLeafNode(otherlv_20, grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:453:3: (otherlv_21= 'modifiedBy' otherlv_22= '=' ( (lv_modifiedBy_23_0= ruleUser ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:453:5: otherlv_21= 'modifiedBy' otherlv_22= '=' ( (lv_modifiedBy_23_0= ruleUser ) )
                    {
                    otherlv_21=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleContentType960); 

                        	newLeafNode(otherlv_21, grammarAccess.getContentTypeAccess().getModifiedByKeyword_13_0());
                        
                    otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContentType972); 

                        	newLeafNode(otherlv_22, grammarAccess.getContentTypeAccess().getEqualsSignKeyword_13_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:461:1: ( (lv_modifiedBy_23_0= ruleUser ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:462:1: (lv_modifiedBy_23_0= ruleUser )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:462:1: (lv_modifiedBy_23_0= ruleUser )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:463:3: lv_modifiedBy_23_0= ruleUser
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentTypeAccess().getModifiedByUserParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUser_in_ruleContentType993);
                    lv_modifiedBy_23_0=ruleUser();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"modifiedBy",
                            		lv_modifiedBy_23_0, 
                            		"User");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentType1007); 

                	newLeafNode(otherlv_24, grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_14());
                

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:491:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:492:2: (iv_ruleProperty= ruleProperty EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:493:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty1043);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty1053); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:500:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) (otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_accessModifer_7_0 = null;

        Enumerator lv_type_10_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:503:28: ( (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) (otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) )? otherlv_11= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:504:1: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) (otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) )? otherlv_11= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:504:1: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) (otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) )? otherlv_11= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:504:3: otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'accessModifer' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) (otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleProperty1090); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProperty1102); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleProperty1114); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getNameKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProperty1126); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getEqualsSignKeyword_3());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:520:1: ( (lv_name_4_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:521:1: (lv_name_4_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:521:1: (lv_name_4_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:522:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty1147);
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

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleProperty1159); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getAccessModiferKeyword_5());
                
            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProperty1171); 

                	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getEqualsSignKeyword_6());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:546:1: ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:547:1: (lv_accessModifer_7_0= ruleAccessLevelEnum )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:547:1: (lv_accessModifer_7_0= ruleAccessLevelEnum )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:548:3: lv_accessModifer_7_0= ruleAccessLevelEnum
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getAccessModiferAccessLevelEnumEnumRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAccessLevelEnum_in_ruleProperty1192);
            lv_accessModifer_7_0=ruleAccessLevelEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"accessModifer",
                    		lv_accessModifer_7_0, 
                    		"AccessLevelEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:564:2: (otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:564:4: otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) )
                    {
                    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleProperty1205); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getTypeKeyword_8_0());
                        
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProperty1217); 

                        	newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getEqualsSignKeyword_8_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:572:1: ( (lv_type_10_0= ruleTypeEnum ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:573:1: (lv_type_10_0= ruleTypeEnum )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:573:1: (lv_type_10_0= ruleTypeEnum )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:574:3: lv_type_10_0= ruleTypeEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeEnumEnumRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_ruleProperty1238);
                    lv_type_10_0=ruleTypeEnum();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_10_0, 
                            		"TypeEnum");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProperty1252); 

                	newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleRole"
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:602:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:603:2: (iv_ruleRole= ruleRole EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:604:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole1288);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole1298); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:611:1: ruleRole returns [EObject current=null] : ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:614:28: ( ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:615:1: ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:615:1: ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:615:2: () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:615:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:616:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoleAccess().getRoleAction_0(),
                        current);
                

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:621:2: ( (lv_isAdmin_1_0= 'isAdmin' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:622:1: (lv_isAdmin_1_0= 'isAdmin' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:622:1: (lv_isAdmin_1_0= 'isAdmin' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:623:3: lv_isAdmin_1_0= 'isAdmin'
                    {
                    lv_isAdmin_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRole1350); 

                            newLeafNode(lv_isAdmin_1_0, grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(current, "isAdmin", true, "isAdmin");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRole1376); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getRoleKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRole1388); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRole1400); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getNameKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRole1412); 

                	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getEqualsSignKeyword_5());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:652:1: ( (lv_name_6_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:653:1: (lv_name_6_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:653:1: (lv_name_6_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:654:3: lv_name_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRole1433);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:670:2: (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:670:4: otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRole1446); 

                        	newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getTypesKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRole1458); 

                        	newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:678:1: ( (lv_types_9_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:679:1: (lv_types_9_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:679:1: (lv_types_9_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:680:3: lv_types_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRole1479);
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

                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:696:2: (otherlv_10= ',' ( (lv_types_11_0= ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:696:4: otherlv_10= ',' ( (lv_types_11_0= ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRole1492); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:700:1: ( (lv_types_11_0= ruleEString ) )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:701:1: (lv_types_11_0= ruleEString )
                    	    {
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:701:1: (lv_types_11_0= ruleEString )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:702:3: lv_types_11_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRole1513);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRole1527); 

                        	newLeafNode(otherlv_12, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRole1541); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:734:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:735:2: (iv_ruleUser= ruleUser EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:736:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUser_in_entryRuleUser1577);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUser1587); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:743:1: ruleUser returns [EObject current=null] : ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'lastname' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_disabled_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_firstname_9_0 = null;

        AntlrDatatypeRuleToken lv_lastname_12_0 = null;

        AntlrDatatypeRuleToken lv_login_15_0 = null;

        AntlrDatatypeRuleToken lv_password_18_0 = null;

        AntlrDatatypeRuleToken lv_email_21_0 = null;

        EObject lv_hasRole_24_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:746:28: ( ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'lastname' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:747:1: ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'lastname' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:747:1: ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'lastname' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:747:2: () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'firstname' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'lastname' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:747:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:748:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUserAccess().getUserAction_0(),
                        current);
                

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:753:2: ( (lv_disabled_1_0= 'disabled' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:754:1: (lv_disabled_1_0= 'disabled' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:754:1: (lv_disabled_1_0= 'disabled' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:755:3: lv_disabled_1_0= 'disabled'
                    {
                    lv_disabled_1_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleUser1639); 

                            newLeafNode(lv_disabled_1_0, grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUserRule());
                    	        }
                           		setWithLastConsumed(current, "disabled", true, "disabled");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleUser1665); 

                	newLeafNode(otherlv_2, grammarAccess.getUserAccess().getUserKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUser1677); 

                	newLeafNode(otherlv_3, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleUser1689); 

                	newLeafNode(otherlv_4, grammarAccess.getUserAccess().getNameKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1701); 

                	newLeafNode(otherlv_5, grammarAccess.getUserAccess().getEqualsSignKeyword_5());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:784:1: ( (lv_name_6_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:785:1: (lv_name_6_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:785:1: (lv_name_6_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:786:3: lv_name_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUserAccess().getNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1722);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:802:2: (otherlv_7= 'firstname' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:802:4: otherlv_7= 'firstname' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleUser1735); 

                        	newLeafNode(otherlv_7, grammarAccess.getUserAccess().getFirstnameKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1747); 

                        	newLeafNode(otherlv_8, grammarAccess.getUserAccess().getEqualsSignKeyword_7_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:810:1: ( (lv_firstname_9_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:811:1: (lv_firstname_9_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:811:1: (lv_firstname_9_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:812:3: lv_firstname_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getFirstnameEStringParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1768);
                    lv_firstname_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"firstname",
                            		lv_firstname_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:828:4: (otherlv_10= 'lastname' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:828:6: otherlv_10= 'lastname' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleUser1783); 

                        	newLeafNode(otherlv_10, grammarAccess.getUserAccess().getLastnameKeyword_8_0());
                        
                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1795); 

                        	newLeafNode(otherlv_11, grammarAccess.getUserAccess().getEqualsSignKeyword_8_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:836:1: ( (lv_lastname_12_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:837:1: (lv_lastname_12_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:837:1: (lv_lastname_12_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:838:3: lv_lastname_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getLastnameEStringParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1816);
                    lv_lastname_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"lastname",
                            		lv_lastname_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:854:4: (otherlv_13= 'login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:854:6: otherlv_13= 'login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUser1831); 

                        	newLeafNode(otherlv_13, grammarAccess.getUserAccess().getLoginKeyword_9_0());
                        
                    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1843); 

                        	newLeafNode(otherlv_14, grammarAccess.getUserAccess().getEqualsSignKeyword_9_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:862:1: ( (lv_login_15_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:863:1: (lv_login_15_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:863:1: (lv_login_15_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:864:3: lv_login_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getLoginEStringParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1864);
                    lv_login_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"login",
                            		lv_login_15_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:880:4: (otherlv_16= 'password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:880:6: otherlv_16= 'password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleUser1879); 

                        	newLeafNode(otherlv_16, grammarAccess.getUserAccess().getPasswordKeyword_10_0());
                        
                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1891); 

                        	newLeafNode(otherlv_17, grammarAccess.getUserAccess().getEqualsSignKeyword_10_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:888:1: ( (lv_password_18_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:889:1: (lv_password_18_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:889:1: (lv_password_18_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:890:3: lv_password_18_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getPasswordEStringParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1912);
                    lv_password_18_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"password",
                            		lv_password_18_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:906:4: (otherlv_19= 'email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:906:6: otherlv_19= 'email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUser1927); 

                        	newLeafNode(otherlv_19, grammarAccess.getUserAccess().getEmailKeyword_11_0());
                        
                    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1939); 

                        	newLeafNode(otherlv_20, grammarAccess.getUserAccess().getEqualsSignKeyword_11_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:914:1: ( (lv_email_21_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:915:1: (lv_email_21_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:915:1: (lv_email_21_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:916:3: lv_email_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getEmailEStringParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1960);
                    lv_email_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"email",
                            		lv_email_21_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:932:4: (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:932:6: otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) )
                    {
                    otherlv_22=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleUser1975); 

                        	newLeafNode(otherlv_22, grammarAccess.getUserAccess().getRoleKeyword_12_0());
                        
                    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1987); 

                        	newLeafNode(otherlv_23, grammarAccess.getUserAccess().getEqualsSignKeyword_12_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:940:1: ( (lv_hasRole_24_0= ruleRole ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:941:1: (lv_hasRole_24_0= ruleRole )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:941:1: (lv_hasRole_24_0= ruleRole )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:942:3: lv_hasRole_24_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getHasRoleRoleParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleUser2008);
                    lv_hasRole_24_0=ruleRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserRule());
                    	        }
                           		set(
                           			current, 
                           			"hasRole",
                            		lv_hasRole_24_0, 
                            		"Role");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUser2022); 

                	newLeafNode(otherlv_25, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:970:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:971:2: (iv_ruleVersion= ruleVersion EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:972:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion2058);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion2068); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:979:1: ruleVersion returns [EObject current=null] : ( () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:982:28: ( ( () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:983:1: ( () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:983:1: ( () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:983:2: () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:983:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:984:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVersionAccess().getVersionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleVersion2114); 

                	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getVersionKeyword_1());
                
            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleVersion2126); 

                	newLeafNode(otherlv_2, grammarAccess.getVersionAccess().getNumberKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVersion2138); 

                	newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getEqualsSignKeyword_3());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1001:1: ( (lv_name_4_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1002:1: (lv_name_4_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1002:1: (lv_name_4_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1003:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVersion2159);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVersionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1027:1: entryRuleCMS returns [EObject current=null] : iv_ruleCMS= ruleCMS EOF ;
    public final EObject entryRuleCMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMS = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1028:2: (iv_ruleCMS= ruleCMS EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1029:2: iv_ruleCMS= ruleCMS EOF
            {
             newCompositeNode(grammarAccess.getCMSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCMS_in_entryRuleCMS2195);
            iv_ruleCMS=ruleCMS();

            state._fsp--;

             current =iv_ruleCMS; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCMS2205); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1036:1: ruleCMS returns [EObject current=null] : ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}' ) ;
    public final EObject ruleCMS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_type_8_0 = null;

        AntlrDatatypeRuleToken lv_address_url_11_0 = null;

        AntlrDatatypeRuleToken lv_username_14_0 = null;

        AntlrDatatypeRuleToken lv_password_17_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1039:28: ( ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1040:1: ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1040:1: ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1040:2: () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1040:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1041:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCMSAccess().getCMSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCMS2251); 

                	newLeafNode(otherlv_1, grammarAccess.getCMSAccess().getCMSKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCMS2263); 

                	newLeafNode(otherlv_2, grammarAccess.getCMSAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCMS2275); 

                	newLeafNode(otherlv_3, grammarAccess.getCMSAccess().getNameKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2287); 

                	newLeafNode(otherlv_4, grammarAccess.getCMSAccess().getEqualsSignKeyword_4());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1062:1: ( (lv_name_5_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1063:1: (lv_name_5_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1063:1: (lv_name_5_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1064:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2308);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1080:2: (otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1080:4: otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) )
            {
            otherlv_6=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCMS2321); 

                	newLeafNode(otherlv_6, grammarAccess.getCMSAccess().getTypeKeyword_6_0());
                
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2333); 

                	newLeafNode(otherlv_7, grammarAccess.getCMSAccess().getEqualsSignKeyword_6_1());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1088:1: ( (lv_type_8_0= ruleCMSEnum ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1089:1: (lv_type_8_0= ruleCMSEnum )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1089:1: (lv_type_8_0= ruleCMSEnum )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1090:3: lv_type_8_0= ruleCMSEnum
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getTypeCMSEnumEnumRuleCall_6_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCMSEnum_in_ruleCMS2354);
            lv_type_8_0=ruleCMSEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCMSRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"CMSEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1106:3: (otherlv_9= 'address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1106:5: otherlv_9= 'address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) )
            {
            otherlv_9=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCMS2368); 

                	newLeafNode(otherlv_9, grammarAccess.getCMSAccess().getAddress_urlKeyword_7_0());
                
            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2380); 

                	newLeafNode(otherlv_10, grammarAccess.getCMSAccess().getEqualsSignKeyword_7_1());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1114:1: ( (lv_address_url_11_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1115:1: (lv_address_url_11_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1115:1: (lv_address_url_11_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1116:3: lv_address_url_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getAddress_urlEStringParserRuleCall_7_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2401);
            lv_address_url_11_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCMSRule());
            	        }
                   		set(
                   			current, 
                   			"address_url",
                    		lv_address_url_11_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1132:3: (otherlv_12= 'username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1132:5: otherlv_12= 'username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) )
            {
            otherlv_12=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCMS2415); 

                	newLeafNode(otherlv_12, grammarAccess.getCMSAccess().getUsernameKeyword_8_0());
                
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2427); 

                	newLeafNode(otherlv_13, grammarAccess.getCMSAccess().getEqualsSignKeyword_8_1());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1140:1: ( (lv_username_14_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1141:1: (lv_username_14_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1141:1: (lv_username_14_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1142:3: lv_username_14_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getUsernameEStringParserRuleCall_8_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2448);
            lv_username_14_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCMSRule());
            	        }
                   		set(
                   			current, 
                   			"username",
                    		lv_username_14_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1158:3: (otherlv_15= 'password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1158:5: otherlv_15= 'password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) )
            {
            otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCMS2462); 

                	newLeafNode(otherlv_15, grammarAccess.getCMSAccess().getPasswordKeyword_9_0());
                
            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2474); 

                	newLeafNode(otherlv_16, grammarAccess.getCMSAccess().getEqualsSignKeyword_9_1());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1166:1: ( (lv_password_17_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1167:1: (lv_password_17_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1167:1: (lv_password_17_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1168:3: lv_password_17_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getPasswordEStringParserRuleCall_9_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2495);
            lv_password_17_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCMSRule());
            	        }
                   		set(
                   			current, 
                   			"password",
                    		lv_password_17_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCMS2508); 

                	newLeafNode(otherlv_18, grammarAccess.getCMSAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1196:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1197:2: (iv_ruleEInt= ruleEInt EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1198:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2545);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2556); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1205:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1208:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1209:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1209:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1209:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1209:2: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1210:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEInt2595); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2612); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1232:1: ruleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) ) ;
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
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1234:28: ( ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1235:1: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1235:1: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt23=1;
                }
                break;
            case 45:
                {
                alt23=2;
                }
                break;
            case 46:
                {
                alt23=3;
                }
                break;
            case 47:
                {
                alt23=4;
                }
                break;
            case 48:
                {
                alt23=5;
                }
                break;
            case 49:
                {
                alt23=6;
                }
                break;
            case 50:
                {
                alt23=7;
                }
                break;
            case 51:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1235:2: (enumLiteral_0= 'char' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1235:2: (enumLiteral_0= 'char' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1235:4: enumLiteral_0= 'char'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTypeEnum2673); 

                            current = grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1241:6: (enumLiteral_1= 'byte' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1241:6: (enumLiteral_1= 'byte' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1241:8: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTypeEnum2690); 

                            current = grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1247:6: (enumLiteral_2= 'string' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1247:6: (enumLiteral_2= 'string' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1247:8: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTypeEnum2707); 

                            current = grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1253:6: (enumLiteral_3= 'int' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1253:6: (enumLiteral_3= 'int' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1253:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTypeEnum2724); 

                            current = grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1259:6: (enumLiteral_4= 'float' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1259:6: (enumLiteral_4= 'float' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1259:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTypeEnum2741); 

                            current = grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1265:6: (enumLiteral_5= 'double' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1265:6: (enumLiteral_5= 'double' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1265:8: enumLiteral_5= 'double'
                    {
                    enumLiteral_5=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTypeEnum2758); 

                            current = grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1271:6: (enumLiteral_6= 'boolean' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1271:6: (enumLiteral_6= 'boolean' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1271:8: enumLiteral_6= 'boolean'
                    {
                    enumLiteral_6=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTypeEnum2775); 

                            current = grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1277:6: (enumLiteral_7= 'date' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1277:6: (enumLiteral_7= 'date' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1277:8: enumLiteral_7= 'date'
                    {
                    enumLiteral_7=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTypeEnum2792); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1287:1: ruleCMSEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) ) ;
    public final Enumerator ruleCMSEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1289:28: ( ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1290:1: ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1290:1: ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt24=1;
                }
                break;
            case 53:
                {
                alt24=2;
                }
                break;
            case 54:
                {
                alt24=3;
                }
                break;
            case 55:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1290:2: (enumLiteral_0= 'Jease' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1290:2: (enumLiteral_0= 'Jease' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1290:4: enumLiteral_0= 'Jease'
                    {
                    enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleCMSEnum2837); 

                            current = grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1296:6: (enumLiteral_1= 'N2' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1296:6: (enumLiteral_1= 'N2' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1296:8: enumLiteral_1= 'N2'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleCMSEnum2854); 

                            current = grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1302:6: (enumLiteral_2= 'Concrete5' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1302:6: (enumLiteral_2= 'Concrete5' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1302:8: enumLiteral_2= 'Concrete5'
                    {
                    enumLiteral_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleCMSEnum2871); 

                            current = grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1308:6: (enumLiteral_3= 'Plone' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1308:6: (enumLiteral_3= 'Plone' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1308:8: enumLiteral_3= 'Plone'
                    {
                    enumLiteral_3=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleCMSEnum2888); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1318:1: ruleAccessLevelEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleAccessLevelEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1320:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1321:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1321:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==56) ) {
                alt25=1;
            }
            else if ( (LA25_0==57) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1321:2: (enumLiteral_0= 'public' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1321:2: (enumLiteral_0= 'public' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1321:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleAccessLevelEnum2933); 

                            current = grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1327:6: (enumLiteral_1= 'private' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1327:6: (enumLiteral_1= 'private' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1327:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleAccessLevelEnum2950); 

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
        public static final BitSet FOLLOW_12_in_ruleContentModel213 = new BitSet(new long[]{0x00000080000C0000L});
        public static final BitSet FOLLOW_ruleNamedElement_in_ruleContentModel234 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleContentModel247 = new BitSet(new long[]{0x00000080000C0000L});
        public static final BitSet FOLLOW_ruleNamedElement_in_ruleContentModel268 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleContentModel282 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContentModel296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_ruleNamedElement389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_ruleNamedElement416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_entryRuleContentType574 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContentType584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleContentType627 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleContentType653 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentType665 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContentType677 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleContentType689 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContentType710 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleContentType723 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleContentType735 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleContentType756 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleContentType770 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentType782 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleContentType803 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleContentType816 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleContentType837 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleContentType851 = new BitSet(new long[]{0x0000000000C20000L});
        public static final BitSet FOLLOW_22_in_ruleContentType864 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentType876 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleContentType897 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleContentType910 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleContentType931 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleContentType945 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleContentType960 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleContentType972 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleUser_in_ruleContentType993 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContentType1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1043 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleProperty1090 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProperty1102 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleProperty1114 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProperty1126 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty1147 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleProperty1159 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProperty1171 = new BitSet(new long[]{0x0300000000000000L});
        public static final BitSet FOLLOW_ruleAccessLevelEnum_in_ruleProperty1192 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleProperty1205 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProperty1217 = new BitSet(new long[]{0x000FF00000000000L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_ruleProperty1238 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProperty1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleRole1350 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleRole1376 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole1388 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRole1400 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRole1412 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRole1433 = new BitSet(new long[]{0x0000000020020000L});
        public static final BitSet FOLLOW_29_in_ruleRole1446 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole1458 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRole1479 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleRole1492 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRole1513 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleRole1527 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRole1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUser_in_entryRuleUser1577 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUser1587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleUser1639 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleUser1665 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUser1677 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleUser1689 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1701 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1722 = new BitSet(new long[]{0x0000001F10020000L});
        public static final BitSet FOLLOW_32_in_ruleUser1735 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1747 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1768 = new BitSet(new long[]{0x0000001E10020000L});
        public static final BitSet FOLLOW_33_in_ruleUser1783 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1795 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1816 = new BitSet(new long[]{0x0000001C10020000L});
        public static final BitSet FOLLOW_34_in_ruleUser1831 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1843 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1864 = new BitSet(new long[]{0x0000001810020000L});
        public static final BitSet FOLLOW_35_in_ruleUser1879 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1891 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1912 = new BitSet(new long[]{0x0000001010020000L});
        public static final BitSet FOLLOW_36_in_ruleUser1927 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1939 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1960 = new BitSet(new long[]{0x0000000010020000L});
        public static final BitSet FOLLOW_28_in_ruleUser1975 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1987 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_ruleRole_in_ruleUser2008 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleUser2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion2068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleVersion2114 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleVersion2126 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleVersion2138 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVersion2159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_entryRuleCMS2195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCMS2205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCMS2251 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCMS2263 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCMS2275 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2287 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2308 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleCMS2321 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2333 = new BitSet(new long[]{0x00F0000000000000L});
        public static final BitSet FOLLOW_ruleCMSEnum_in_ruleCMS2354 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleCMS2368 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2380 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2401 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleCMS2415 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2427 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2448 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleCMS2462 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2474 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2495 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCMS2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEInt2595 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleTypeEnum2673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleTypeEnum2690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTypeEnum2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTypeEnum2724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTypeEnum2741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTypeEnum2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTypeEnum2775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTypeEnum2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleCMSEnum2837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleCMSEnum2854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleCMSEnum2871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleCMSEnum2888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleAccessLevelEnum2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleAccessLevelEnum2950 = new BitSet(new long[]{0x0000000000000002L});
    }


}