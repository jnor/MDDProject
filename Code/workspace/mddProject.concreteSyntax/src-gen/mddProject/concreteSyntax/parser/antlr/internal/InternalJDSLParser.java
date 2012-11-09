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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContentModel'", "'{'", "'Name'", "'='", "'Contains'", "';'", "'}'", "'visible'", "'ContentType'", "'Properties'", "'Guid'", "'Versions'", "'ModifiedBy'", "'Property'", "'AccessModifier'", "'Type'", "'isAdmin'", "'Role'", "'Types'", "'disabled'", "'User'", "'userFirstName'", "'userLastName'", "'Login'", "'Password'", "'Email'", "'Version'", "'Number'", "'CMS'", "'Address_url'", "'Username'", "'-'", "'char'", "'byte'", "'string'", "'int'", "'float'", "'double'", "'boolean'", "'date'", "'Jease'", "'N2'", "'Concrete5'", "'Plone'", "'public'", "'private'"
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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:77:1: ruleContentModel returns [EObject current=null] : ( () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ';' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= ';' otherlv_12= '}' )? otherlv_13= '}' ) ;
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
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_hasElements_8_0 = null;

        EObject lv_hasElements_10_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:80:28: ( ( () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ';' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= ';' otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:81:1: ( () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ';' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= ';' otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:81:1: ( () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ';' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= ';' otherlv_12= '}' )? otherlv_13= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:81:2: () otherlv_1= 'ContentModel' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ';' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= ';' otherlv_12= '}' )? otherlv_13= '}'
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:121:2: (otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ';' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= ';' otherlv_12= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:121:4: otherlv_6= 'Contains' otherlv_7= '{' ( (lv_hasElements_8_0= ruleNamedElement ) ) (otherlv_9= ';' ( (lv_hasElements_10_0= ruleNamedElement ) ) )* otherlv_11= ';' otherlv_12= '}'
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

                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:147:2: (otherlv_9= ';' ( (lv_hasElements_10_0= ruleNamedElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            int LA1_1 = input.LA(2);

                            if ( ((LA1_1>=18 && LA1_1<=19)||LA1_1==39) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:147:4: otherlv_9= ';' ( (lv_hasElements_10_0= ruleNamedElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentModel247); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getContentModelAccess().getSemicolonKeyword_6_3_0());
                    	        
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

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentModel282); 

                        	newLeafNode(otherlv_11, grammarAccess.getContentModelAccess().getSemicolonKeyword_6_4());
                        
                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentModel294); 

                        	newLeafNode(otherlv_12, grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_6_5());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentModel308); 

                	newLeafNode(otherlv_13, grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:189:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:190:2: (iv_ruleNamedElement= ruleNamedElement EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:191:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_entryRuleNamedElement344);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedElement354); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:198:1: ruleNamedElement returns [EObject current=null] : (this_ContentType_0= ruleContentType | this_CMS_1= ruleCMS ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_ContentType_0 = null;

        EObject this_CMS_1 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:201:28: ( (this_ContentType_0= ruleContentType | this_CMS_1= ruleCMS ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:202:1: (this_ContentType_0= ruleContentType | this_CMS_1= ruleCMS )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:202:1: (this_ContentType_0= ruleContentType | this_CMS_1= ruleCMS )
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
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:203:5: this_ContentType_0= ruleContentType
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getContentTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleContentType_in_ruleNamedElement401);
                    this_ContentType_0=ruleContentType();

                    state._fsp--;

                     
                            current = this_ContentType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:213:5: this_CMS_1= ruleCMS
                    {
                     
                            newCompositeNode(grammarAccess.getNamedElementAccess().getCMSParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCMS_in_ruleNamedElement428);
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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:229:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:230:2: (iv_ruleEString= ruleEString EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:231:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString464);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString475); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:238:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:241:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:242:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:242:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:242:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString515); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:250:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString541); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:265:1: entryRuleContentType returns [EObject current=null] : iv_ruleContentType= ruleContentType EOF ;
    public final EObject entryRuleContentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentType = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:266:2: (iv_ruleContentType= ruleContentType EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:267:2: iv_ruleContentType= ruleContentType EOF
            {
             newCompositeNode(grammarAccess.getContentTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContentType_in_entryRuleContentType586);
            iv_ruleContentType=ruleContentType();

            state._fsp--;

             current =iv_ruleContentType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContentType596); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:274:1: ruleContentType returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'Properties' otherlv_7= '{' ( (lv_hasProperties_8_0= ruleProperty ) ) (otherlv_9= ';' ( (lv_hasProperties_10_0= ruleProperty ) ) )* otherlv_11= ';' otherlv_12= '}' (otherlv_13= 'Guid' otherlv_14= '=' ( (lv_guid_15_0= ruleEInt ) ) )? (otherlv_16= 'Versions' otherlv_17= '{' ( (lv_hasVersions_18_0= ruleVersion ) ) (otherlv_19= ';' ( (lv_hasVersions_20_0= ruleVersion ) ) )* otherlv_21= ';' otherlv_22= '}' )? (otherlv_23= 'ModifiedBy' otherlv_24= '=' ( (lv_modifiedBy_25_0= ruleUser ) ) )? otherlv_26= '}' ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_hasProperties_8_0 = null;

        EObject lv_hasProperties_10_0 = null;

        AntlrDatatypeRuleToken lv_guid_15_0 = null;

        EObject lv_hasVersions_18_0 = null;

        EObject lv_hasVersions_20_0 = null;

        EObject lv_modifiedBy_25_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:277:28: ( ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'Properties' otherlv_7= '{' ( (lv_hasProperties_8_0= ruleProperty ) ) (otherlv_9= ';' ( (lv_hasProperties_10_0= ruleProperty ) ) )* otherlv_11= ';' otherlv_12= '}' (otherlv_13= 'Guid' otherlv_14= '=' ( (lv_guid_15_0= ruleEInt ) ) )? (otherlv_16= 'Versions' otherlv_17= '{' ( (lv_hasVersions_18_0= ruleVersion ) ) (otherlv_19= ';' ( (lv_hasVersions_20_0= ruleVersion ) ) )* otherlv_21= ';' otherlv_22= '}' )? (otherlv_23= 'ModifiedBy' otherlv_24= '=' ( (lv_modifiedBy_25_0= ruleUser ) ) )? otherlv_26= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:278:1: ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'Properties' otherlv_7= '{' ( (lv_hasProperties_8_0= ruleProperty ) ) (otherlv_9= ';' ( (lv_hasProperties_10_0= ruleProperty ) ) )* otherlv_11= ';' otherlv_12= '}' (otherlv_13= 'Guid' otherlv_14= '=' ( (lv_guid_15_0= ruleEInt ) ) )? (otherlv_16= 'Versions' otherlv_17= '{' ( (lv_hasVersions_18_0= ruleVersion ) ) (otherlv_19= ';' ( (lv_hasVersions_20_0= ruleVersion ) ) )* otherlv_21= ';' otherlv_22= '}' )? (otherlv_23= 'ModifiedBy' otherlv_24= '=' ( (lv_modifiedBy_25_0= ruleUser ) ) )? otherlv_26= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:278:1: ( ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'Properties' otherlv_7= '{' ( (lv_hasProperties_8_0= ruleProperty ) ) (otherlv_9= ';' ( (lv_hasProperties_10_0= ruleProperty ) ) )* otherlv_11= ';' otherlv_12= '}' (otherlv_13= 'Guid' otherlv_14= '=' ( (lv_guid_15_0= ruleEInt ) ) )? (otherlv_16= 'Versions' otherlv_17= '{' ( (lv_hasVersions_18_0= ruleVersion ) ) (otherlv_19= ';' ( (lv_hasVersions_20_0= ruleVersion ) ) )* otherlv_21= ';' otherlv_22= '}' )? (otherlv_23= 'ModifiedBy' otherlv_24= '=' ( (lv_modifiedBy_25_0= ruleUser ) ) )? otherlv_26= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:278:2: ( (lv_visible_0_0= 'visible' ) )? otherlv_1= 'ContentType' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'Properties' otherlv_7= '{' ( (lv_hasProperties_8_0= ruleProperty ) ) (otherlv_9= ';' ( (lv_hasProperties_10_0= ruleProperty ) ) )* otherlv_11= ';' otherlv_12= '}' (otherlv_13= 'Guid' otherlv_14= '=' ( (lv_guid_15_0= ruleEInt ) ) )? (otherlv_16= 'Versions' otherlv_17= '{' ( (lv_hasVersions_18_0= ruleVersion ) ) (otherlv_19= ';' ( (lv_hasVersions_20_0= ruleVersion ) ) )* otherlv_21= ';' otherlv_22= '}' )? (otherlv_23= 'ModifiedBy' otherlv_24= '=' ( (lv_modifiedBy_25_0= ruleUser ) ) )? otherlv_26= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:278:2: ( (lv_visible_0_0= 'visible' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:279:1: (lv_visible_0_0= 'visible' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:279:1: (lv_visible_0_0= 'visible' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:280:3: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContentType639); 

                            newLeafNode(lv_visible_0_0, grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContentTypeRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContentType665); 

                	newLeafNode(otherlv_1, grammarAccess.getContentTypeAccess().getContentTypeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentType677); 

                	newLeafNode(otherlv_2, grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContentType689); 

                	newLeafNode(otherlv_3, grammarAccess.getContentTypeAccess().getNameKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContentType701); 

                	newLeafNode(otherlv_4, grammarAccess.getContentTypeAccess().getEqualsSignKeyword_4());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:309:1: ( (lv_name_5_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:310:1: (lv_name_5_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:310:1: (lv_name_5_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:311:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getContentTypeAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContentType722);
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

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContentType734); 

                	newLeafNode(otherlv_6, grammarAccess.getContentTypeAccess().getPropertiesKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentType746); 

                	newLeafNode(otherlv_7, grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_7());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:335:1: ( (lv_hasProperties_8_0= ruleProperty ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:336:1: (lv_hasProperties_8_0= ruleProperty )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:336:1: (lv_hasProperties_8_0= ruleProperty )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:337:3: lv_hasProperties_8_0= ruleProperty
            {
             
            	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleContentType767);
            lv_hasProperties_8_0=ruleProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
            	        }
                   		add(
                   			current, 
                   			"hasProperties",
                    		lv_hasProperties_8_0, 
                    		"Property");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:353:2: (otherlv_9= ';' ( (lv_hasProperties_10_0= ruleProperty ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==24) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:353:4: otherlv_9= ';' ( (lv_hasProperties_10_0= ruleProperty ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentType780); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContentTypeAccess().getSemicolonKeyword_9_0());
            	        
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:357:1: ( (lv_hasProperties_10_0= ruleProperty ) )
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:358:1: (lv_hasProperties_10_0= ruleProperty )
            	    {
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:358:1: (lv_hasProperties_10_0= ruleProperty )
            	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:359:3: lv_hasProperties_10_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleContentType801);
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


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentType815); 

                	newLeafNode(otherlv_11, grammarAccess.getContentTypeAccess().getSemicolonKeyword_10());
                
            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentType827); 

                	newLeafNode(otherlv_12, grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_11());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:383:1: (otherlv_13= 'Guid' otherlv_14= '=' ( (lv_guid_15_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:383:3: otherlv_13= 'Guid' otherlv_14= '=' ( (lv_guid_15_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContentType840); 

                        	newLeafNode(otherlv_13, grammarAccess.getContentTypeAccess().getGuidKeyword_12_0());
                        
                    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContentType852); 

                        	newLeafNode(otherlv_14, grammarAccess.getContentTypeAccess().getEqualsSignKeyword_12_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:391:1: ( (lv_guid_15_0= ruleEInt ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:392:1: (lv_guid_15_0= ruleEInt )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:392:1: (lv_guid_15_0= ruleEInt )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:393:3: lv_guid_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentTypeAccess().getGuidEIntParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleContentType873);
                    lv_guid_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"guid",
                            		lv_guid_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:409:4: (otherlv_16= 'Versions' otherlv_17= '{' ( (lv_hasVersions_18_0= ruleVersion ) ) (otherlv_19= ';' ( (lv_hasVersions_20_0= ruleVersion ) ) )* otherlv_21= ';' otherlv_22= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:409:6: otherlv_16= 'Versions' otherlv_17= '{' ( (lv_hasVersions_18_0= ruleVersion ) ) (otherlv_19= ';' ( (lv_hasVersions_20_0= ruleVersion ) ) )* otherlv_21= ';' otherlv_22= '}'
                    {
                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleContentType888); 

                        	newLeafNode(otherlv_16, grammarAccess.getContentTypeAccess().getVersionsKeyword_13_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContentType900); 

                        	newLeafNode(otherlv_17, grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:417:1: ( (lv_hasVersions_18_0= ruleVersion ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:418:1: (lv_hasVersions_18_0= ruleVersion )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:418:1: (lv_hasVersions_18_0= ruleVersion )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:419:3: lv_hasVersions_18_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleContentType921);
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

                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:435:2: (otherlv_19= ';' ( (lv_hasVersions_20_0= ruleVersion ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==37) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:435:4: otherlv_19= ';' ( (lv_hasVersions_20_0= ruleVersion ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentType934); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getContentTypeAccess().getSemicolonKeyword_13_3_0());
                    	        
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:439:1: ( (lv_hasVersions_20_0= ruleVersion ) )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:440:1: (lv_hasVersions_20_0= ruleVersion )
                    	    {
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:440:1: (lv_hasVersions_20_0= ruleVersion )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:441:3: lv_hasVersions_20_0= ruleVersion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleContentType955);
                    	    lv_hasVersions_20_0=ruleVersion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"hasVersions",
                    	            		lv_hasVersions_20_0, 
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

                    otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContentType969); 

                        	newLeafNode(otherlv_21, grammarAccess.getContentTypeAccess().getSemicolonKeyword_13_4());
                        
                    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentType981); 

                        	newLeafNode(otherlv_22, grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_13_5());
                        

                    }
                    break;

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:465:3: (otherlv_23= 'ModifiedBy' otherlv_24= '=' ( (lv_modifiedBy_25_0= ruleUser ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:465:5: otherlv_23= 'ModifiedBy' otherlv_24= '=' ( (lv_modifiedBy_25_0= ruleUser ) )
                    {
                    otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleContentType996); 

                        	newLeafNode(otherlv_23, grammarAccess.getContentTypeAccess().getModifiedByKeyword_14_0());
                        
                    otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContentType1008); 

                        	newLeafNode(otherlv_24, grammarAccess.getContentTypeAccess().getEqualsSignKeyword_14_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:473:1: ( (lv_modifiedBy_25_0= ruleUser ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:474:1: (lv_modifiedBy_25_0= ruleUser )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:474:1: (lv_modifiedBy_25_0= ruleUser )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:475:3: lv_modifiedBy_25_0= ruleUser
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentTypeAccess().getModifiedByUserParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUser_in_ruleContentType1029);
                    lv_modifiedBy_25_0=ruleUser();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"modifiedBy",
                            		lv_modifiedBy_25_0, 
                            		"User");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContentType1043); 

                	newLeafNode(otherlv_26, grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_15());
                

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:503:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:504:2: (iv_ruleProperty= ruleProperty EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:505:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty1079);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty1089); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:512:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'AccessModifier' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) otherlv_11= '}' ) ;
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
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:515:28: ( (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'AccessModifier' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) otherlv_11= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:516:1: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'AccessModifier' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) otherlv_11= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:516:1: (otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'AccessModifier' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) otherlv_11= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:516:3: otherlv_0= 'Property' otherlv_1= '{' otherlv_2= 'Name' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'AccessModifier' otherlv_6= '=' ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) ) otherlv_8= 'Type' otherlv_9= '=' ( (lv_type_10_0= ruleTypeEnum ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleProperty1126); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProperty1138); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleProperty1150); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getNameKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProperty1162); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getEqualsSignKeyword_3());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:532:1: ( (lv_name_4_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:533:1: (lv_name_4_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:533:1: (lv_name_4_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:534:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty1183);
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

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleProperty1195); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getAccessModifierKeyword_5());
                
            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProperty1207); 

                	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getEqualsSignKeyword_6());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:558:1: ( (lv_accessModifer_7_0= ruleAccessLevelEnum ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:559:1: (lv_accessModifer_7_0= ruleAccessLevelEnum )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:559:1: (lv_accessModifer_7_0= ruleAccessLevelEnum )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:560:3: lv_accessModifer_7_0= ruleAccessLevelEnum
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getAccessModiferAccessLevelEnumEnumRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAccessLevelEnum_in_ruleProperty1228);
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

            otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleProperty1240); 

                	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getTypeKeyword_8());
                
            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleProperty1252); 

                	newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getEqualsSignKeyword_9());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:584:1: ( (lv_type_10_0= ruleTypeEnum ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:585:1: (lv_type_10_0= ruleTypeEnum )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:585:1: (lv_type_10_0= ruleTypeEnum )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:586:3: lv_type_10_0= ruleTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeEnumEnumRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_ruleProperty1273);
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

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProperty1285); 

                	newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:614:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:615:2: (iv_ruleRole= ruleRole EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:616:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole1321);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole1331); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:623:1: ruleRole returns [EObject current=null] : ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'Types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ';' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= ';' otherlv_13= '}' )? otherlv_14= '}' ) ;
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
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_types_9_0 = null;

        AntlrDatatypeRuleToken lv_types_11_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:626:28: ( ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'Types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ';' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= ';' otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:627:1: ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'Types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ';' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= ';' otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:627:1: ( () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'Types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ';' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= ';' otherlv_13= '}' )? otherlv_14= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:627:2: () ( (lv_isAdmin_1_0= 'isAdmin' ) )? otherlv_2= 'Role' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'Types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ';' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= ';' otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:627:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:628:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoleAccess().getRoleAction_0(),
                        current);
                

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:633:2: ( (lv_isAdmin_1_0= 'isAdmin' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:634:1: (lv_isAdmin_1_0= 'isAdmin' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:634:1: (lv_isAdmin_1_0= 'isAdmin' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:635:3: lv_isAdmin_1_0= 'isAdmin'
                    {
                    lv_isAdmin_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRole1383); 

                            newLeafNode(lv_isAdmin_1_0, grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRoleRule());
                    	        }
                           		setWithLastConsumed(current, "isAdmin", true, "isAdmin");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRole1409); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getRoleKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRole1421); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRole1433); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getNameKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRole1445); 

                	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getEqualsSignKeyword_5());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:664:1: ( (lv_name_6_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:665:1: (lv_name_6_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:665:1: (lv_name_6_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:666:3: lv_name_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRole1466);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:682:2: (otherlv_7= 'Types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ';' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= ';' otherlv_13= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:682:4: otherlv_7= 'Types' otherlv_8= '{' ( (lv_types_9_0= ruleEString ) ) (otherlv_10= ';' ( (lv_types_11_0= ruleEString ) ) )* otherlv_12= ';' otherlv_13= '}'
                    {
                    otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRole1479); 

                        	newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getTypesKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRole1491); 

                        	newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:690:1: ( (lv_types_9_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:691:1: (lv_types_9_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:691:1: (lv_types_9_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:692:3: lv_types_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRole1512);
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

                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:708:2: (otherlv_10= ';' ( (lv_types_11_0= ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            int LA12_1 = input.LA(2);

                            if ( ((LA12_1>=RULE_STRING && LA12_1<=RULE_ID)) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:708:4: otherlv_10= ';' ( (lv_types_11_0= ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRole1525); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getSemicolonKeyword_7_3_0());
                    	        
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:712:1: ( (lv_types_11_0= ruleEString ) )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:713:1: (lv_types_11_0= ruleEString )
                    	    {
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:713:1: (lv_types_11_0= ruleEString )
                    	    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:714:3: lv_types_11_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRole1546);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRole1560); 

                        	newLeafNode(otherlv_12, grammarAccess.getRoleAccess().getSemicolonKeyword_7_4());
                        
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRole1572); 

                        	newLeafNode(otherlv_13, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRole1586); 

                	newLeafNode(otherlv_14, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:750:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:751:2: (iv_ruleUser= ruleUser EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:752:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUser_in_entryRuleUser1622);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUser1632); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:759:1: ruleUser returns [EObject current=null] : ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'userFirstName' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'userLastName' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'Login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'Password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'Email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}' ) ;
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
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:762:28: ( ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'userFirstName' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'userLastName' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'Login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'Password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'Email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:763:1: ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'userFirstName' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'userLastName' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'Login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'Password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'Email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:763:1: ( () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'userFirstName' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'userLastName' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'Login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'Password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'Email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:763:2: () ( (lv_disabled_1_0= 'disabled' ) )? otherlv_2= 'User' otherlv_3= '{' otherlv_4= 'Name' otherlv_5= '=' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'userFirstName' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )? (otherlv_10= 'userLastName' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )? (otherlv_13= 'Login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )? (otherlv_16= 'Password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )? (otherlv_19= 'Email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )? (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )? otherlv_25= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:763:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:764:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUserAccess().getUserAction_0(),
                        current);
                

            }

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:769:2: ( (lv_disabled_1_0= 'disabled' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:770:1: (lv_disabled_1_0= 'disabled' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:770:1: (lv_disabled_1_0= 'disabled' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:771:3: lv_disabled_1_0= 'disabled'
                    {
                    lv_disabled_1_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleUser1684); 

                            newLeafNode(lv_disabled_1_0, grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUserRule());
                    	        }
                           		setWithLastConsumed(current, "disabled", true, "disabled");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleUser1710); 

                	newLeafNode(otherlv_2, grammarAccess.getUserAccess().getUserKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUser1722); 

                	newLeafNode(otherlv_3, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleUser1734); 

                	newLeafNode(otherlv_4, grammarAccess.getUserAccess().getNameKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1746); 

                	newLeafNode(otherlv_5, grammarAccess.getUserAccess().getEqualsSignKeyword_5());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:800:1: ( (lv_name_6_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:801:1: (lv_name_6_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:801:1: (lv_name_6_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:802:3: lv_name_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUserAccess().getNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1767);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:818:2: (otherlv_7= 'userFirstName' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:818:4: otherlv_7= 'userFirstName' otherlv_8= '=' ( (lv_firstname_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleUser1780); 

                        	newLeafNode(otherlv_7, grammarAccess.getUserAccess().getUserFirstNameKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1792); 

                        	newLeafNode(otherlv_8, grammarAccess.getUserAccess().getEqualsSignKeyword_7_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:826:1: ( (lv_firstname_9_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:827:1: (lv_firstname_9_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:827:1: (lv_firstname_9_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:828:3: lv_firstname_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getFirstnameEStringParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1813);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:844:4: (otherlv_10= 'userLastName' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:844:6: otherlv_10= 'userLastName' otherlv_11= '=' ( (lv_lastname_12_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleUser1828); 

                        	newLeafNode(otherlv_10, grammarAccess.getUserAccess().getUserLastNameKeyword_8_0());
                        
                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1840); 

                        	newLeafNode(otherlv_11, grammarAccess.getUserAccess().getEqualsSignKeyword_8_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:852:1: ( (lv_lastname_12_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:853:1: (lv_lastname_12_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:853:1: (lv_lastname_12_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:854:3: lv_lastname_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getLastnameEStringParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1861);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:870:4: (otherlv_13= 'Login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:870:6: otherlv_13= 'Login' otherlv_14= '=' ( (lv_login_15_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUser1876); 

                        	newLeafNode(otherlv_13, grammarAccess.getUserAccess().getLoginKeyword_9_0());
                        
                    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1888); 

                        	newLeafNode(otherlv_14, grammarAccess.getUserAccess().getEqualsSignKeyword_9_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:878:1: ( (lv_login_15_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:879:1: (lv_login_15_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:879:1: (lv_login_15_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:880:3: lv_login_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getLoginEStringParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1909);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:896:4: (otherlv_16= 'Password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:896:6: otherlv_16= 'Password' otherlv_17= '=' ( (lv_password_18_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleUser1924); 

                        	newLeafNode(otherlv_16, grammarAccess.getUserAccess().getPasswordKeyword_10_0());
                        
                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1936); 

                        	newLeafNode(otherlv_17, grammarAccess.getUserAccess().getEqualsSignKeyword_10_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:904:1: ( (lv_password_18_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:905:1: (lv_password_18_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:905:1: (lv_password_18_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:906:3: lv_password_18_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getPasswordEStringParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser1957);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:922:4: (otherlv_19= 'Email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:922:6: otherlv_19= 'Email' otherlv_20= '=' ( (lv_email_21_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUser1972); 

                        	newLeafNode(otherlv_19, grammarAccess.getUserAccess().getEmailKeyword_11_0());
                        
                    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser1984); 

                        	newLeafNode(otherlv_20, grammarAccess.getUserAccess().getEqualsSignKeyword_11_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:930:1: ( (lv_email_21_0= ruleEString ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:931:1: (lv_email_21_0= ruleEString )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:931:1: (lv_email_21_0= ruleEString )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:932:3: lv_email_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getEmailEStringParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUser2005);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:948:4: (otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:948:6: otherlv_22= 'Role' otherlv_23= '=' ( (lv_hasRole_24_0= ruleRole ) )
                    {
                    otherlv_22=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleUser2020); 

                        	newLeafNode(otherlv_22, grammarAccess.getUserAccess().getRoleKeyword_12_0());
                        
                    otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUser2032); 

                        	newLeafNode(otherlv_23, grammarAccess.getUserAccess().getEqualsSignKeyword_12_1());
                        
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:956:1: ( (lv_hasRole_24_0= ruleRole ) )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:957:1: (lv_hasRole_24_0= ruleRole )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:957:1: (lv_hasRole_24_0= ruleRole )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:958:3: lv_hasRole_24_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserAccess().getHasRoleRoleParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleUser2053);
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

            otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUser2067); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:986:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:987:2: (iv_ruleVersion= ruleVersion EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:988:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion2103);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion2113); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:995:1: ruleVersion returns [EObject current=null] : ( () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:998:28: ( ( () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:999:1: ( () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:999:1: ( () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:999:2: () otherlv_1= 'Version' otherlv_2= 'Number' otherlv_3= '=' ( (lv_name_4_0= ruleEString ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:999:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1000:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVersionAccess().getVersionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleVersion2159); 

                	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getVersionKeyword_1());
                
            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleVersion2171); 

                	newLeafNode(otherlv_2, grammarAccess.getVersionAccess().getNumberKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVersion2183); 

                	newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getEqualsSignKeyword_3());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1017:1: ( (lv_name_4_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1018:1: (lv_name_4_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1018:1: (lv_name_4_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1019:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVersion2204);
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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1043:1: entryRuleCMS returns [EObject current=null] : iv_ruleCMS= ruleCMS EOF ;
    public final EObject entryRuleCMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMS = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1044:2: (iv_ruleCMS= ruleCMS EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1045:2: iv_ruleCMS= ruleCMS EOF
            {
             newCompositeNode(grammarAccess.getCMSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCMS_in_entryRuleCMS2240);
            iv_ruleCMS=ruleCMS();

            state._fsp--;

             current =iv_ruleCMS; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCMS2250); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1052:1: ruleCMS returns [EObject current=null] : ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'Address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'Username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'Password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}' ) ;
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
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1055:28: ( ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'Address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'Username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'Password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}' ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1056:1: ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'Address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'Username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'Password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}' )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1056:1: ( () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'Address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'Username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'Password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}' )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1056:2: () otherlv_1= 'CMS' otherlv_2= '{' otherlv_3= 'Name' otherlv_4= '=' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'Type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) ) (otherlv_9= 'Address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) ) (otherlv_12= 'Username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) ) (otherlv_15= 'Password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) ) otherlv_18= '}'
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1056:2: ()
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1057:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCMSAccess().getCMSAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCMS2296); 

                	newLeafNode(otherlv_1, grammarAccess.getCMSAccess().getCMSKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCMS2308); 

                	newLeafNode(otherlv_2, grammarAccess.getCMSAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCMS2320); 

                	newLeafNode(otherlv_3, grammarAccess.getCMSAccess().getNameKeyword_3());
                
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2332); 

                	newLeafNode(otherlv_4, grammarAccess.getCMSAccess().getEqualsSignKeyword_4());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1078:1: ( (lv_name_5_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1079:1: (lv_name_5_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1079:1: (lv_name_5_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1080:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2353);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1096:2: (otherlv_6= 'Type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1096:4: otherlv_6= 'Type' otherlv_7= '=' ( (lv_type_8_0= ruleCMSEnum ) )
            {
            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCMS2366); 

                	newLeafNode(otherlv_6, grammarAccess.getCMSAccess().getTypeKeyword_6_0());
                
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2378); 

                	newLeafNode(otherlv_7, grammarAccess.getCMSAccess().getEqualsSignKeyword_6_1());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1104:1: ( (lv_type_8_0= ruleCMSEnum ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1105:1: (lv_type_8_0= ruleCMSEnum )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1105:1: (lv_type_8_0= ruleCMSEnum )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1106:3: lv_type_8_0= ruleCMSEnum
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getTypeCMSEnumEnumRuleCall_6_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCMSEnum_in_ruleCMS2399);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1122:3: (otherlv_9= 'Address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1122:5: otherlv_9= 'Address_url' otherlv_10= '=' ( (lv_address_url_11_0= ruleEString ) )
            {
            otherlv_9=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCMS2413); 

                	newLeafNode(otherlv_9, grammarAccess.getCMSAccess().getAddress_urlKeyword_7_0());
                
            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2425); 

                	newLeafNode(otherlv_10, grammarAccess.getCMSAccess().getEqualsSignKeyword_7_1());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1130:1: ( (lv_address_url_11_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1131:1: (lv_address_url_11_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1131:1: (lv_address_url_11_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1132:3: lv_address_url_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getAddress_urlEStringParserRuleCall_7_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2446);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1148:3: (otherlv_12= 'Username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1148:5: otherlv_12= 'Username' otherlv_13= '=' ( (lv_username_14_0= ruleEString ) )
            {
            otherlv_12=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCMS2460); 

                	newLeafNode(otherlv_12, grammarAccess.getCMSAccess().getUsernameKeyword_8_0());
                
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2472); 

                	newLeafNode(otherlv_13, grammarAccess.getCMSAccess().getEqualsSignKeyword_8_1());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1156:1: ( (lv_username_14_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1157:1: (lv_username_14_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1157:1: (lv_username_14_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1158:3: lv_username_14_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getUsernameEStringParserRuleCall_8_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2493);
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

            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1174:3: (otherlv_15= 'Password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1174:5: otherlv_15= 'Password' otherlv_16= '=' ( (lv_password_17_0= ruleEString ) )
            {
            otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCMS2507); 

                	newLeafNode(otherlv_15, grammarAccess.getCMSAccess().getPasswordKeyword_9_0());
                
            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCMS2519); 

                	newLeafNode(otherlv_16, grammarAccess.getCMSAccess().getEqualsSignKeyword_9_1());
                
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1182:1: ( (lv_password_17_0= ruleEString ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1183:1: (lv_password_17_0= ruleEString )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1183:1: (lv_password_17_0= ruleEString )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1184:3: lv_password_17_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCMSAccess().getPasswordEStringParserRuleCall_9_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCMS2540);
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

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCMS2553); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1212:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1213:2: (iv_ruleEInt= ruleEInt EOF )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1214:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2590);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2601); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1221:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1224:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1225:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1225:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1225:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1225:2: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1226:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEInt2640); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2657); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1248:1: ruleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) ) ;
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
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1250:28: ( ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1251:1: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1251:1: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'boolean' ) | (enumLiteral_7= 'date' ) )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            case 46:
                {
                alt22=4;
                }
                break;
            case 47:
                {
                alt22=5;
                }
                break;
            case 48:
                {
                alt22=6;
                }
                break;
            case 49:
                {
                alt22=7;
                }
                break;
            case 50:
                {
                alt22=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1251:2: (enumLiteral_0= 'char' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1251:2: (enumLiteral_0= 'char' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1251:4: enumLiteral_0= 'char'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTypeEnum2718); 

                            current = grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1257:6: (enumLiteral_1= 'byte' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1257:6: (enumLiteral_1= 'byte' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1257:8: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTypeEnum2735); 

                            current = grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1263:6: (enumLiteral_2= 'string' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1263:6: (enumLiteral_2= 'string' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1263:8: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTypeEnum2752); 

                            current = grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1269:6: (enumLiteral_3= 'int' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1269:6: (enumLiteral_3= 'int' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1269:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTypeEnum2769); 

                            current = grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1275:6: (enumLiteral_4= 'float' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1275:6: (enumLiteral_4= 'float' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1275:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTypeEnum2786); 

                            current = grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1281:6: (enumLiteral_5= 'double' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1281:6: (enumLiteral_5= 'double' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1281:8: enumLiteral_5= 'double'
                    {
                    enumLiteral_5=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTypeEnum2803); 

                            current = grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1287:6: (enumLiteral_6= 'boolean' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1287:6: (enumLiteral_6= 'boolean' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1287:8: enumLiteral_6= 'boolean'
                    {
                    enumLiteral_6=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTypeEnum2820); 

                            current = grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1293:6: (enumLiteral_7= 'date' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1293:6: (enumLiteral_7= 'date' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1293:8: enumLiteral_7= 'date'
                    {
                    enumLiteral_7=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTypeEnum2837); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1303:1: ruleCMSEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) ) ;
    public final Enumerator ruleCMSEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1305:28: ( ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1306:1: ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1306:1: ( (enumLiteral_0= 'Jease' ) | (enumLiteral_1= 'N2' ) | (enumLiteral_2= 'Concrete5' ) | (enumLiteral_3= 'Plone' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt23=1;
                }
                break;
            case 52:
                {
                alt23=2;
                }
                break;
            case 53:
                {
                alt23=3;
                }
                break;
            case 54:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1306:2: (enumLiteral_0= 'Jease' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1306:2: (enumLiteral_0= 'Jease' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1306:4: enumLiteral_0= 'Jease'
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCMSEnum2882); 

                            current = grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1312:6: (enumLiteral_1= 'N2' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1312:6: (enumLiteral_1= 'N2' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1312:8: enumLiteral_1= 'N2'
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleCMSEnum2899); 

                            current = grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1318:6: (enumLiteral_2= 'Concrete5' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1318:6: (enumLiteral_2= 'Concrete5' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1318:8: enumLiteral_2= 'Concrete5'
                    {
                    enumLiteral_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleCMSEnum2916); 

                            current = grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1324:6: (enumLiteral_3= 'Plone' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1324:6: (enumLiteral_3= 'Plone' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1324:8: enumLiteral_3= 'Plone'
                    {
                    enumLiteral_3=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleCMSEnum2933); 

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
    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1334:1: ruleAccessLevelEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleAccessLevelEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1336:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1337:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1337:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==55) ) {
                alt24=1;
            }
            else if ( (LA24_0==56) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1337:2: (enumLiteral_0= 'public' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1337:2: (enumLiteral_0= 'public' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1337:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAccessLevelEnum2978); 

                            current = grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1343:6: (enumLiteral_1= 'private' )
                    {
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1343:6: (enumLiteral_1= 'private' )
                    // ../mddProject.concreteSyntax/src-gen/mddProject/concreteSyntax/parser/antlr/internal/InternalJDSL.g:1343:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleAccessLevelEnum2995); 

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
        public static final BitSet FOLLOW_ruleNamedElement_in_ruleContentModel234 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleContentModel247 = new BitSet(new long[]{0x00000080000C0000L});
        public static final BitSet FOLLOW_ruleNamedElement_in_ruleContentModel268 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleContentModel282 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContentModel294 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContentModel308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_ruleNamedElement401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_ruleNamedElement428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString464 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_entryRuleContentType586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContentType596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleContentType639 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleContentType665 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentType677 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContentType689 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleContentType701 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContentType722 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleContentType734 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentType746 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleContentType767 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleContentType780 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleContentType801 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleContentType815 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContentType827 = new BitSet(new long[]{0x0000000000E20000L});
        public static final BitSet FOLLOW_21_in_ruleContentType840 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleContentType852 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleContentType873 = new BitSet(new long[]{0x0000000000C20000L});
        public static final BitSet FOLLOW_22_in_ruleContentType888 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContentType900 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleContentType921 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleContentType934 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleContentType955 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleContentType969 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContentType981 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleContentType996 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleContentType1008 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleUser_in_ruleContentType1029 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContentType1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1079 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleProperty1126 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProperty1138 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleProperty1150 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProperty1162 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty1183 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleProperty1195 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProperty1207 = new BitSet(new long[]{0x0180000000000000L});
        public static final BitSet FOLLOW_ruleAccessLevelEnum_in_ruleProperty1228 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleProperty1240 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleProperty1252 = new BitSet(new long[]{0x0007F80000000000L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_ruleProperty1273 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProperty1285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleRole1383 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleRole1409 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole1421 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRole1433 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRole1445 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRole1466 = new BitSet(new long[]{0x0000000020020000L});
        public static final BitSet FOLLOW_29_in_ruleRole1479 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole1491 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRole1512 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRole1525 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRole1546 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRole1560 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRole1572 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRole1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUser_in_entryRuleUser1622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUser1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleUser1684 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleUser1710 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUser1722 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleUser1734 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1746 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1767 = new BitSet(new long[]{0x0000001F10020000L});
        public static final BitSet FOLLOW_32_in_ruleUser1780 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1792 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1813 = new BitSet(new long[]{0x0000001E10020000L});
        public static final BitSet FOLLOW_33_in_ruleUser1828 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1840 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1861 = new BitSet(new long[]{0x0000001C10020000L});
        public static final BitSet FOLLOW_34_in_ruleUser1876 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1888 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1909 = new BitSet(new long[]{0x0000001810020000L});
        public static final BitSet FOLLOW_35_in_ruleUser1924 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1936 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser1957 = new BitSet(new long[]{0x0000001010020000L});
        public static final BitSet FOLLOW_36_in_ruleUser1972 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser1984 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUser2005 = new BitSet(new long[]{0x0000000010020000L});
        public static final BitSet FOLLOW_28_in_ruleUser2020 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUser2032 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_ruleRole_in_ruleUser2053 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleUser2067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2103 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion2113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleVersion2159 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleVersion2171 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleVersion2183 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVersion2204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_entryRuleCMS2240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCMS2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCMS2296 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCMS2308 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCMS2320 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2332 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2353 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleCMS2366 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2378 = new BitSet(new long[]{0x0078000000000000L});
        public static final BitSet FOLLOW_ruleCMSEnum_in_ruleCMS2399 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleCMS2413 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2425 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2446 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleCMS2460 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2472 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2493 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleCMS2507 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCMS2519 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCMS2540 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCMS2553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEInt2640 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleTypeEnum2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleTypeEnum2735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleTypeEnum2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTypeEnum2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTypeEnum2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTypeEnum2803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTypeEnum2820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTypeEnum2837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleCMSEnum2882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleCMSEnum2899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleCMSEnum2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleCMSEnum2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleAccessLevelEnum2978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleAccessLevelEnum2995 = new BitSet(new long[]{0x0000000000000002L});
    }


}