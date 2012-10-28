package mddProject.concreteSyntax.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import mddProject.concreteSyntax.services.JDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'char'", "'byte'", "'string'", "'int'", "'float'", "'double'", "'boolean'", "'date'", "'Jease'", "'N2'", "'Concrete5'", "'Plone'", "'public'", "'private'", "'ContentModel'", "'{'", "'Name'", "'='", "'}'", "'Contains'", "','", "'ContentType'", "'hasProperties'", "'guid'", "'hasVersions'", "'modifiedBy'", "'Property'", "'accessModifer'", "'Datatype'", "'SingleType'", "'type'", "'ArrayType'", "'Role'", "'types'", "'User'", "'firstname'", "'lastname'", "'login'", "'password'", "'email'", "'hasRole'", "'Version'", "'CMS'", "'address_url'", "'username'", "'-'", "'visible'", "'isAdmin'", "'disabled'"
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
    public String getGrammarFileName() { return "../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g"; }


     
     	private JDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleContentModel"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:60:1: entryRuleContentModel : ruleContentModel EOF ;
    public final void entryRuleContentModel() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:61:1: ( ruleContentModel EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:62:1: ruleContentModel EOF
            {
             before(grammarAccess.getContentModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContentModel_in_entryRuleContentModel61);
            ruleContentModel();

            state._fsp--;

             after(grammarAccess.getContentModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContentModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContentModel"


    // $ANTLR start "ruleContentModel"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:69:1: ruleContentModel : ( ( rule__ContentModel__Group__0 ) ) ;
    public final void ruleContentModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:73:2: ( ( ( rule__ContentModel__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:74:1: ( ( rule__ContentModel__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:74:1: ( ( rule__ContentModel__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:75:1: ( rule__ContentModel__Group__0 )
            {
             before(grammarAccess.getContentModelAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:76:1: ( rule__ContentModel__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:76:2: rule__ContentModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__0_in_ruleContentModel94);
            rule__ContentModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentModel"


    // $ANTLR start "entryRuleNamedElement"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:88:1: entryRuleNamedElement : ruleNamedElement EOF ;
    public final void entryRuleNamedElement() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:89:1: ( ruleNamedElement EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:90:1: ruleNamedElement EOF
            {
             before(grammarAccess.getNamedElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_entryRuleNamedElement121);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getNamedElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNamedElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:97:1: ruleNamedElement : ( ( rule__NamedElement__Alternatives ) ) ;
    public final void ruleNamedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:101:2: ( ( ( rule__NamedElement__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:102:1: ( ( rule__NamedElement__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:102:1: ( ( rule__NamedElement__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:103:1: ( rule__NamedElement__Alternatives )
            {
             before(grammarAccess.getNamedElementAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:104:1: ( rule__NamedElement__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:104:2: rule__NamedElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NamedElement__Alternatives_in_ruleNamedElement154);
            rule__NamedElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleType"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:117:1: ( ruleType EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType181);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:132:1: ( rule__Type__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Type__Alternatives_in_ruleType214);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEString"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:145:1: ( ruleEString EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:160:1: ( rule__EString__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleContentType"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:172:1: entryRuleContentType : ruleContentType EOF ;
    public final void entryRuleContentType() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:173:1: ( ruleContentType EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:174:1: ruleContentType EOF
            {
             before(grammarAccess.getContentTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContentType_in_entryRuleContentType301);
            ruleContentType();

            state._fsp--;

             after(grammarAccess.getContentTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContentType308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContentType"


    // $ANTLR start "ruleContentType"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:181:1: ruleContentType : ( ( rule__ContentType__Group__0 ) ) ;
    public final void ruleContentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:185:2: ( ( ( rule__ContentType__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:186:1: ( ( rule__ContentType__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:186:1: ( ( rule__ContentType__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:187:1: ( rule__ContentType__Group__0 )
            {
             before(grammarAccess.getContentTypeAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:188:1: ( rule__ContentType__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:188:2: rule__ContentType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__0_in_ruleContentType334);
            rule__ContentType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentType"


    // $ANTLR start "entryRuleProperty"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:200:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:201:1: ( ruleProperty EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:202:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty361);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:209:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:213:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:214:1: ( ( rule__Property__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:214:1: ( ( rule__Property__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:215:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:216:1: ( rule__Property__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:216:2: rule__Property__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0_in_ruleProperty394);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleSingleType"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:228:1: entryRuleSingleType : ruleSingleType EOF ;
    public final void entryRuleSingleType() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:229:1: ( ruleSingleType EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:230:1: ruleSingleType EOF
            {
             before(grammarAccess.getSingleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleType_in_entryRuleSingleType421);
            ruleSingleType();

            state._fsp--;

             after(grammarAccess.getSingleTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleType428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleType"


    // $ANTLR start "ruleSingleType"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:237:1: ruleSingleType : ( ( rule__SingleType__Group__0 ) ) ;
    public final void ruleSingleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:241:2: ( ( ( rule__SingleType__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:242:1: ( ( rule__SingleType__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:242:1: ( ( rule__SingleType__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:243:1: ( rule__SingleType__Group__0 )
            {
             before(grammarAccess.getSingleTypeAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:244:1: ( rule__SingleType__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:244:2: rule__SingleType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__0_in_ruleSingleType454);
            rule__SingleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleType"


    // $ANTLR start "entryRuleArrayType"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:256:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:257:1: ( ruleArrayType EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:258:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArrayType_in_entryRuleArrayType481);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayType488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:265:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:269:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:270:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:270:1: ( ( rule__ArrayType__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:271:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:272:1: ( rule__ArrayType__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:272:2: rule__ArrayType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType514);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleRole"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:284:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:285:1: ( ruleRole EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:286:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole541);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:293:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:297:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:298:1: ( ( rule__Role__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:298:1: ( ( rule__Role__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:299:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:300:1: ( rule__Role__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:300:2: rule__Role__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0_in_ruleRole574);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleUser"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:312:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:313:1: ( ruleUser EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:314:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUser_in_entryRuleUser601);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUser608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:321:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:325:2: ( ( ( rule__User__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:326:1: ( ( rule__User__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:326:1: ( ( rule__User__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:327:1: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:328:1: ( rule__User__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:328:2: rule__User__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__0_in_ruleUser634);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleVersion"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:340:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:341:1: ( ruleVersion EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:342:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion661);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:349:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:353:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:354:1: ( ( rule__Version__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:354:1: ( ( rule__Version__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:355:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:356:1: ( rule__Version__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:356:2: rule__Version__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0_in_ruleVersion694);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleCMS"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:368:1: entryRuleCMS : ruleCMS EOF ;
    public final void entryRuleCMS() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:369:1: ( ruleCMS EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:370:1: ruleCMS EOF
            {
             before(grammarAccess.getCMSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCMS_in_entryRuleCMS721);
            ruleCMS();

            state._fsp--;

             after(grammarAccess.getCMSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCMS728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCMS"


    // $ANTLR start "ruleCMS"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:377:1: ruleCMS : ( ( rule__CMS__Group__0 ) ) ;
    public final void ruleCMS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:381:2: ( ( ( rule__CMS__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:382:1: ( ( rule__CMS__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:382:1: ( ( rule__CMS__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:383:1: ( rule__CMS__Group__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:384:1: ( rule__CMS__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:384:2: rule__CMS__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__0_in_ruleCMS754);
            rule__CMS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCMS"


    // $ANTLR start "entryRuleEInt"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:396:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:397:1: ( ruleEInt EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:398:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt781);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:405:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:409:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:410:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:410:1: ( ( rule__EInt__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:411:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:412:1: ( rule__EInt__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:412:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt814);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleTypeEnum"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:427:1: ruleTypeEnum : ( ( rule__TypeEnum__Alternatives ) ) ;
    public final void ruleTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:431:1: ( ( ( rule__TypeEnum__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:432:1: ( ( rule__TypeEnum__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:432:1: ( ( rule__TypeEnum__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:433:1: ( rule__TypeEnum__Alternatives )
            {
             before(grammarAccess.getTypeEnumAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:434:1: ( rule__TypeEnum__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:434:2: rule__TypeEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypeEnum__Alternatives_in_ruleTypeEnum853);
            rule__TypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeEnum"


    // $ANTLR start "ruleCMSEnum"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:446:1: ruleCMSEnum : ( ( rule__CMSEnum__Alternatives ) ) ;
    public final void ruleCMSEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:450:1: ( ( ( rule__CMSEnum__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:451:1: ( ( rule__CMSEnum__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:451:1: ( ( rule__CMSEnum__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:452:1: ( rule__CMSEnum__Alternatives )
            {
             before(grammarAccess.getCMSEnumAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:453:1: ( rule__CMSEnum__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:453:2: rule__CMSEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMSEnum__Alternatives_in_ruleCMSEnum889);
            rule__CMSEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCMSEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCMSEnum"


    // $ANTLR start "ruleAccessLevelEnum"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:465:1: ruleAccessLevelEnum : ( ( rule__AccessLevelEnum__Alternatives ) ) ;
    public final void ruleAccessLevelEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:469:1: ( ( ( rule__AccessLevelEnum__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:470:1: ( ( rule__AccessLevelEnum__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:470:1: ( ( rule__AccessLevelEnum__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:471:1: ( rule__AccessLevelEnum__Alternatives )
            {
             before(grammarAccess.getAccessLevelEnumAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:472:1: ( rule__AccessLevelEnum__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:472:2: rule__AccessLevelEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccessLevelEnum__Alternatives_in_ruleAccessLevelEnum925);
            rule__AccessLevelEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessLevelEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessLevelEnum"


    // $ANTLR start "rule__NamedElement__Alternatives"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:483:1: rule__NamedElement__Alternatives : ( ( ruleContentType ) | ( ruleCMS ) );
    public final void rule__NamedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:487:1: ( ( ruleContentType ) | ( ruleCMS ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32||LA1_0==57) ) {
                alt1=1;
            }
            else if ( (LA1_0==53) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:488:1: ( ruleContentType )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:488:1: ( ruleContentType )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:489:1: ruleContentType
                    {
                     before(grammarAccess.getNamedElementAccess().getContentTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleContentType_in_rule__NamedElement__Alternatives960);
                    ruleContentType();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getContentTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:494:6: ( ruleCMS )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:494:6: ( ruleCMS )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:495:1: ruleCMS
                    {
                     before(grammarAccess.getNamedElementAccess().getCMSParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCMS_in_rule__NamedElement__Alternatives977);
                    ruleCMS();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getCMSParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:505:1: rule__Type__Alternatives : ( ( ruleSingleType ) | ( ruleArrayType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:509:1: ( ( ruleSingleType ) | ( ruleArrayType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
                alt2=1;
            }
            else if ( (LA2_0==42) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:510:1: ( ruleSingleType )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:510:1: ( ruleSingleType )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:511:1: ruleSingleType
                    {
                     before(grammarAccess.getTypeAccess().getSingleTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSingleType_in_rule__Type__Alternatives1009);
                    ruleSingleType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSingleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:516:6: ( ruleArrayType )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:516:6: ( ruleArrayType )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:517:1: ruleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleArrayType_in_rule__Type__Alternatives1026);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:527:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:531:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:532:1: ( RULE_STRING )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:532:1: ( RULE_STRING )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:533:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1058); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:538:6: ( RULE_ID )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:538:6: ( RULE_ID )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:539:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1075); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TypeEnum__Alternatives"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:550:1: rule__TypeEnum__Alternatives : ( ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) );
    public final void rule__TypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:554:1: ( ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:555:1: ( ( 'char' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:555:1: ( ( 'char' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:556:1: ( 'char' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:557:1: ( 'char' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:557:3: 'char'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__TypeEnum__Alternatives1109); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:562:6: ( ( 'byte' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:562:6: ( ( 'byte' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:563:1: ( 'byte' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:564:1: ( 'byte' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:564:3: 'byte'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__TypeEnum__Alternatives1130); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:569:6: ( ( 'string' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:569:6: ( ( 'string' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:570:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:571:1: ( 'string' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:571:3: 'string'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__TypeEnum__Alternatives1151); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:576:6: ( ( 'int' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:576:6: ( ( 'int' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:577:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:578:1: ( 'int' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:578:3: 'int'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__TypeEnum__Alternatives1172); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:583:6: ( ( 'float' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:583:6: ( ( 'float' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:584:1: ( 'float' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:585:1: ( 'float' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:585:3: 'float'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__TypeEnum__Alternatives1193); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:590:6: ( ( 'double' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:590:6: ( ( 'double' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:591:1: ( 'double' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:592:1: ( 'double' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:592:3: 'double'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TypeEnum__Alternatives1214); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:597:6: ( ( 'boolean' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:597:6: ( ( 'boolean' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:598:1: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:599:1: ( 'boolean' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:599:3: 'boolean'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__TypeEnum__Alternatives1235); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:604:6: ( ( 'date' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:604:6: ( ( 'date' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:605:1: ( 'date' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getDateEnumLiteralDeclaration_7()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:606:1: ( 'date' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:606:3: 'date'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__TypeEnum__Alternatives1256); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getDateEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeEnum__Alternatives"


    // $ANTLR start "rule__CMSEnum__Alternatives"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:616:1: rule__CMSEnum__Alternatives : ( ( ( 'Jease' ) ) | ( ( 'N2' ) ) | ( ( 'Concrete5' ) ) | ( ( 'Plone' ) ) );
    public final void rule__CMSEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:620:1: ( ( ( 'Jease' ) ) | ( ( 'N2' ) ) | ( ( 'Concrete5' ) ) | ( ( 'Plone' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:621:1: ( ( 'Jease' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:621:1: ( ( 'Jease' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:622:1: ( 'Jease' )
                    {
                     before(grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:623:1: ( 'Jease' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:623:3: 'Jease'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__CMSEnum__Alternatives1292); 

                    }

                     after(grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:628:6: ( ( 'N2' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:628:6: ( ( 'N2' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:629:1: ( 'N2' )
                    {
                     before(grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:630:1: ( 'N2' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:630:3: 'N2'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__CMSEnum__Alternatives1313); 

                    }

                     after(grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:635:6: ( ( 'Concrete5' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:635:6: ( ( 'Concrete5' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:636:1: ( 'Concrete5' )
                    {
                     before(grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:637:1: ( 'Concrete5' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:637:3: 'Concrete5'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__CMSEnum__Alternatives1334); 

                    }

                     after(grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:642:6: ( ( 'Plone' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:642:6: ( ( 'Plone' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:643:1: ( 'Plone' )
                    {
                     before(grammarAccess.getCMSEnumAccess().getPloneEnumLiteralDeclaration_3()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:644:1: ( 'Plone' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:644:3: 'Plone'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__CMSEnum__Alternatives1355); 

                    }

                     after(grammarAccess.getCMSEnumAccess().getPloneEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMSEnum__Alternatives"


    // $ANTLR start "rule__AccessLevelEnum__Alternatives"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:654:1: rule__AccessLevelEnum__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) );
    public final void rule__AccessLevelEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:658:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:659:1: ( ( 'public' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:659:1: ( ( 'public' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:660:1: ( 'public' )
                    {
                     before(grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:661:1: ( 'public' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:661:3: 'public'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__AccessLevelEnum__Alternatives1391); 

                    }

                     after(grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:666:6: ( ( 'private' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:666:6: ( ( 'private' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:667:1: ( 'private' )
                    {
                     before(grammarAccess.getAccessLevelEnumAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:668:1: ( 'private' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:668:3: 'private'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__AccessLevelEnum__Alternatives1412); 

                    }

                     after(grammarAccess.getAccessLevelEnumAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessLevelEnum__Alternatives"


    // $ANTLR start "rule__ContentModel__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:680:1: rule__ContentModel__Group__0 : rule__ContentModel__Group__0__Impl rule__ContentModel__Group__1 ;
    public final void rule__ContentModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:684:1: ( rule__ContentModel__Group__0__Impl rule__ContentModel__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:685:2: rule__ContentModel__Group__0__Impl rule__ContentModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__0__Impl_in_rule__ContentModel__Group__01445);
            rule__ContentModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__1_in_rule__ContentModel__Group__01448);
            rule__ContentModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__0"


    // $ANTLR start "rule__ContentModel__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:692:1: rule__ContentModel__Group__0__Impl : ( () ) ;
    public final void rule__ContentModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:696:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:697:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:697:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:698:1: ()
            {
             before(grammarAccess.getContentModelAccess().getContentModelAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:699:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:701:1: 
            {
            }

             after(grammarAccess.getContentModelAccess().getContentModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__0__Impl"


    // $ANTLR start "rule__ContentModel__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:711:1: rule__ContentModel__Group__1 : rule__ContentModel__Group__1__Impl rule__ContentModel__Group__2 ;
    public final void rule__ContentModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:715:1: ( rule__ContentModel__Group__1__Impl rule__ContentModel__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:716:2: rule__ContentModel__Group__1__Impl rule__ContentModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__1__Impl_in_rule__ContentModel__Group__11506);
            rule__ContentModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__2_in_rule__ContentModel__Group__11509);
            rule__ContentModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__1"


    // $ANTLR start "rule__ContentModel__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:723:1: rule__ContentModel__Group__1__Impl : ( 'ContentModel' ) ;
    public final void rule__ContentModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:727:1: ( ( 'ContentModel' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:728:1: ( 'ContentModel' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:728:1: ( 'ContentModel' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:729:1: 'ContentModel'
            {
             before(grammarAccess.getContentModelAccess().getContentModelKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ContentModel__Group__1__Impl1537); 
             after(grammarAccess.getContentModelAccess().getContentModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__1__Impl"


    // $ANTLR start "rule__ContentModel__Group__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:742:1: rule__ContentModel__Group__2 : rule__ContentModel__Group__2__Impl rule__ContentModel__Group__3 ;
    public final void rule__ContentModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:746:1: ( rule__ContentModel__Group__2__Impl rule__ContentModel__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:747:2: rule__ContentModel__Group__2__Impl rule__ContentModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__2__Impl_in_rule__ContentModel__Group__21568);
            rule__ContentModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__3_in_rule__ContentModel__Group__21571);
            rule__ContentModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__2"


    // $ANTLR start "rule__ContentModel__Group__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:754:1: rule__ContentModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ContentModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:758:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:759:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:759:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:760:1: '{'
            {
             before(grammarAccess.getContentModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentModel__Group__2__Impl1599); 
             after(grammarAccess.getContentModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__2__Impl"


    // $ANTLR start "rule__ContentModel__Group__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:773:1: rule__ContentModel__Group__3 : rule__ContentModel__Group__3__Impl rule__ContentModel__Group__4 ;
    public final void rule__ContentModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:777:1: ( rule__ContentModel__Group__3__Impl rule__ContentModel__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:778:2: rule__ContentModel__Group__3__Impl rule__ContentModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__3__Impl_in_rule__ContentModel__Group__31630);
            rule__ContentModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__4_in_rule__ContentModel__Group__31633);
            rule__ContentModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__3"


    // $ANTLR start "rule__ContentModel__Group__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:785:1: rule__ContentModel__Group__3__Impl : ( 'Name' ) ;
    public final void rule__ContentModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:789:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:790:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:790:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:791:1: 'Name'
            {
             before(grammarAccess.getContentModelAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ContentModel__Group__3__Impl1661); 
             after(grammarAccess.getContentModelAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__3__Impl"


    // $ANTLR start "rule__ContentModel__Group__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:804:1: rule__ContentModel__Group__4 : rule__ContentModel__Group__4__Impl rule__ContentModel__Group__5 ;
    public final void rule__ContentModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:808:1: ( rule__ContentModel__Group__4__Impl rule__ContentModel__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:809:2: rule__ContentModel__Group__4__Impl rule__ContentModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__4__Impl_in_rule__ContentModel__Group__41692);
            rule__ContentModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__5_in_rule__ContentModel__Group__41695);
            rule__ContentModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__4"


    // $ANTLR start "rule__ContentModel__Group__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:816:1: rule__ContentModel__Group__4__Impl : ( '=' ) ;
    public final void rule__ContentModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:820:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:821:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:821:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:822:1: '='
            {
             before(grammarAccess.getContentModelAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ContentModel__Group__4__Impl1723); 
             after(grammarAccess.getContentModelAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__4__Impl"


    // $ANTLR start "rule__ContentModel__Group__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:835:1: rule__ContentModel__Group__5 : rule__ContentModel__Group__5__Impl rule__ContentModel__Group__6 ;
    public final void rule__ContentModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:839:1: ( rule__ContentModel__Group__5__Impl rule__ContentModel__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:840:2: rule__ContentModel__Group__5__Impl rule__ContentModel__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__5__Impl_in_rule__ContentModel__Group__51754);
            rule__ContentModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__6_in_rule__ContentModel__Group__51757);
            rule__ContentModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__5"


    // $ANTLR start "rule__ContentModel__Group__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:847:1: rule__ContentModel__Group__5__Impl : ( ( rule__ContentModel__NameAssignment_5 ) ) ;
    public final void rule__ContentModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:851:1: ( ( ( rule__ContentModel__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:852:1: ( ( rule__ContentModel__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:852:1: ( ( rule__ContentModel__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:853:1: ( rule__ContentModel__NameAssignment_5 )
            {
             before(grammarAccess.getContentModelAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:854:1: ( rule__ContentModel__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:854:2: rule__ContentModel__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__NameAssignment_5_in_rule__ContentModel__Group__5__Impl1784);
            rule__ContentModel__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContentModelAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__5__Impl"


    // $ANTLR start "rule__ContentModel__Group__6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:864:1: rule__ContentModel__Group__6 : rule__ContentModel__Group__6__Impl rule__ContentModel__Group__7 ;
    public final void rule__ContentModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:868:1: ( rule__ContentModel__Group__6__Impl rule__ContentModel__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:869:2: rule__ContentModel__Group__6__Impl rule__ContentModel__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__6__Impl_in_rule__ContentModel__Group__61814);
            rule__ContentModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__7_in_rule__ContentModel__Group__61817);
            rule__ContentModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__6"


    // $ANTLR start "rule__ContentModel__Group__6__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:876:1: rule__ContentModel__Group__6__Impl : ( ( rule__ContentModel__Group_6__0 )? ) ;
    public final void rule__ContentModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:880:1: ( ( ( rule__ContentModel__Group_6__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:881:1: ( ( rule__ContentModel__Group_6__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:881:1: ( ( rule__ContentModel__Group_6__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:882:1: ( rule__ContentModel__Group_6__0 )?
            {
             before(grammarAccess.getContentModelAccess().getGroup_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:883:1: ( rule__ContentModel__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:883:2: rule__ContentModel__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__0_in_rule__ContentModel__Group__6__Impl1844);
                    rule__ContentModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__6__Impl"


    // $ANTLR start "rule__ContentModel__Group__7"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:893:1: rule__ContentModel__Group__7 : rule__ContentModel__Group__7__Impl ;
    public final void rule__ContentModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:897:1: ( rule__ContentModel__Group__7__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:898:2: rule__ContentModel__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__7__Impl_in_rule__ContentModel__Group__71875);
            rule__ContentModel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__7"


    // $ANTLR start "rule__ContentModel__Group__7__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:904:1: rule__ContentModel__Group__7__Impl : ( '}' ) ;
    public final void rule__ContentModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:908:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:909:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:909:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:910:1: '}'
            {
             before(grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentModel__Group__7__Impl1903); 
             after(grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group__7__Impl"


    // $ANTLR start "rule__ContentModel__Group_6__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:939:1: rule__ContentModel__Group_6__0 : rule__ContentModel__Group_6__0__Impl rule__ContentModel__Group_6__1 ;
    public final void rule__ContentModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:943:1: ( rule__ContentModel__Group_6__0__Impl rule__ContentModel__Group_6__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:944:2: rule__ContentModel__Group_6__0__Impl rule__ContentModel__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__0__Impl_in_rule__ContentModel__Group_6__01950);
            rule__ContentModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__1_in_rule__ContentModel__Group_6__01953);
            rule__ContentModel__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__0"


    // $ANTLR start "rule__ContentModel__Group_6__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:951:1: rule__ContentModel__Group_6__0__Impl : ( 'Contains' ) ;
    public final void rule__ContentModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:955:1: ( ( 'Contains' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:956:1: ( 'Contains' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:956:1: ( 'Contains' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:957:1: 'Contains'
            {
             before(grammarAccess.getContentModelAccess().getContainsKeyword_6_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ContentModel__Group_6__0__Impl1981); 
             after(grammarAccess.getContentModelAccess().getContainsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__0__Impl"


    // $ANTLR start "rule__ContentModel__Group_6__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:970:1: rule__ContentModel__Group_6__1 : rule__ContentModel__Group_6__1__Impl rule__ContentModel__Group_6__2 ;
    public final void rule__ContentModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:974:1: ( rule__ContentModel__Group_6__1__Impl rule__ContentModel__Group_6__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:975:2: rule__ContentModel__Group_6__1__Impl rule__ContentModel__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__1__Impl_in_rule__ContentModel__Group_6__12012);
            rule__ContentModel__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__2_in_rule__ContentModel__Group_6__12015);
            rule__ContentModel__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__1"


    // $ANTLR start "rule__ContentModel__Group_6__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:982:1: rule__ContentModel__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ContentModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:986:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:987:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:987:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:988:1: '{'
            {
             before(grammarAccess.getContentModelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentModel__Group_6__1__Impl2043); 
             after(grammarAccess.getContentModelAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__1__Impl"


    // $ANTLR start "rule__ContentModel__Group_6__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1001:1: rule__ContentModel__Group_6__2 : rule__ContentModel__Group_6__2__Impl rule__ContentModel__Group_6__3 ;
    public final void rule__ContentModel__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1005:1: ( rule__ContentModel__Group_6__2__Impl rule__ContentModel__Group_6__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1006:2: rule__ContentModel__Group_6__2__Impl rule__ContentModel__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__2__Impl_in_rule__ContentModel__Group_6__22074);
            rule__ContentModel__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__3_in_rule__ContentModel__Group_6__22077);
            rule__ContentModel__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__2"


    // $ANTLR start "rule__ContentModel__Group_6__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1013:1: rule__ContentModel__Group_6__2__Impl : ( ( rule__ContentModel__HasElementsAssignment_6_2 ) ) ;
    public final void rule__ContentModel__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1017:1: ( ( ( rule__ContentModel__HasElementsAssignment_6_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1018:1: ( ( rule__ContentModel__HasElementsAssignment_6_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1018:1: ( ( rule__ContentModel__HasElementsAssignment_6_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1019:1: ( rule__ContentModel__HasElementsAssignment_6_2 )
            {
             before(grammarAccess.getContentModelAccess().getHasElementsAssignment_6_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1020:1: ( rule__ContentModel__HasElementsAssignment_6_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1020:2: rule__ContentModel__HasElementsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__HasElementsAssignment_6_2_in_rule__ContentModel__Group_6__2__Impl2104);
            rule__ContentModel__HasElementsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getContentModelAccess().getHasElementsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__2__Impl"


    // $ANTLR start "rule__ContentModel__Group_6__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1030:1: rule__ContentModel__Group_6__3 : rule__ContentModel__Group_6__3__Impl rule__ContentModel__Group_6__4 ;
    public final void rule__ContentModel__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1034:1: ( rule__ContentModel__Group_6__3__Impl rule__ContentModel__Group_6__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1035:2: rule__ContentModel__Group_6__3__Impl rule__ContentModel__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__3__Impl_in_rule__ContentModel__Group_6__32134);
            rule__ContentModel__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__4_in_rule__ContentModel__Group_6__32137);
            rule__ContentModel__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__3"


    // $ANTLR start "rule__ContentModel__Group_6__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1042:1: rule__ContentModel__Group_6__3__Impl : ( ( rule__ContentModel__Group_6_3__0 )* ) ;
    public final void rule__ContentModel__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1046:1: ( ( ( rule__ContentModel__Group_6_3__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1047:1: ( ( rule__ContentModel__Group_6_3__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1047:1: ( ( rule__ContentModel__Group_6_3__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1048:1: ( rule__ContentModel__Group_6_3__0 )*
            {
             before(grammarAccess.getContentModelAccess().getGroup_6_3()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1049:1: ( rule__ContentModel__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1049:2: rule__ContentModel__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__0_in_rule__ContentModel__Group_6__3__Impl2164);
            	    rule__ContentModel__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getContentModelAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__3__Impl"


    // $ANTLR start "rule__ContentModel__Group_6__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1059:1: rule__ContentModel__Group_6__4 : rule__ContentModel__Group_6__4__Impl ;
    public final void rule__ContentModel__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1063:1: ( rule__ContentModel__Group_6__4__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1064:2: rule__ContentModel__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__4__Impl_in_rule__ContentModel__Group_6__42195);
            rule__ContentModel__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__4"


    // $ANTLR start "rule__ContentModel__Group_6__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1070:1: rule__ContentModel__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ContentModel__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1074:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1075:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1075:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1076:1: '}'
            {
             before(grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentModel__Group_6__4__Impl2223); 
             after(grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__4__Impl"


    // $ANTLR start "rule__ContentModel__Group_6_3__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1099:1: rule__ContentModel__Group_6_3__0 : rule__ContentModel__Group_6_3__0__Impl rule__ContentModel__Group_6_3__1 ;
    public final void rule__ContentModel__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1103:1: ( rule__ContentModel__Group_6_3__0__Impl rule__ContentModel__Group_6_3__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1104:2: rule__ContentModel__Group_6_3__0__Impl rule__ContentModel__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__0__Impl_in_rule__ContentModel__Group_6_3__02264);
            rule__ContentModel__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__1_in_rule__ContentModel__Group_6_3__02267);
            rule__ContentModel__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6_3__0"


    // $ANTLR start "rule__ContentModel__Group_6_3__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1111:1: rule__ContentModel__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ContentModel__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1115:1: ( ( ',' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1116:1: ( ',' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1116:1: ( ',' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1117:1: ','
            {
             before(grammarAccess.getContentModelAccess().getCommaKeyword_6_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentModel__Group_6_3__0__Impl2295); 
             after(grammarAccess.getContentModelAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6_3__0__Impl"


    // $ANTLR start "rule__ContentModel__Group_6_3__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1130:1: rule__ContentModel__Group_6_3__1 : rule__ContentModel__Group_6_3__1__Impl ;
    public final void rule__ContentModel__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1134:1: ( rule__ContentModel__Group_6_3__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1135:2: rule__ContentModel__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__1__Impl_in_rule__ContentModel__Group_6_3__12326);
            rule__ContentModel__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6_3__1"


    // $ANTLR start "rule__ContentModel__Group_6_3__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1141:1: rule__ContentModel__Group_6_3__1__Impl : ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) ) ;
    public final void rule__ContentModel__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1145:1: ( ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1146:1: ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1146:1: ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1147:1: ( rule__ContentModel__HasElementsAssignment_6_3_1 )
            {
             before(grammarAccess.getContentModelAccess().getHasElementsAssignment_6_3_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1148:1: ( rule__ContentModel__HasElementsAssignment_6_3_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1148:2: rule__ContentModel__HasElementsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__HasElementsAssignment_6_3_1_in_rule__ContentModel__Group_6_3__1__Impl2353);
            rule__ContentModel__HasElementsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContentModelAccess().getHasElementsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6_3__1__Impl"


    // $ANTLR start "rule__ContentType__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1162:1: rule__ContentType__Group__0 : rule__ContentType__Group__0__Impl rule__ContentType__Group__1 ;
    public final void rule__ContentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1166:1: ( rule__ContentType__Group__0__Impl rule__ContentType__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1167:2: rule__ContentType__Group__0__Impl rule__ContentType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__0__Impl_in_rule__ContentType__Group__02387);
            rule__ContentType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__1_in_rule__ContentType__Group__02390);
            rule__ContentType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__0"


    // $ANTLR start "rule__ContentType__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1174:1: rule__ContentType__Group__0__Impl : ( ( rule__ContentType__VisibleAssignment_0 )? ) ;
    public final void rule__ContentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1178:1: ( ( ( rule__ContentType__VisibleAssignment_0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1179:1: ( ( rule__ContentType__VisibleAssignment_0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1179:1: ( ( rule__ContentType__VisibleAssignment_0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1180:1: ( rule__ContentType__VisibleAssignment_0 )?
            {
             before(grammarAccess.getContentTypeAccess().getVisibleAssignment_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1181:1: ( rule__ContentType__VisibleAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==57) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1181:2: rule__ContentType__VisibleAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__VisibleAssignment_0_in_rule__ContentType__Group__0__Impl2417);
                    rule__ContentType__VisibleAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentTypeAccess().getVisibleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__0__Impl"


    // $ANTLR start "rule__ContentType__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1191:1: rule__ContentType__Group__1 : rule__ContentType__Group__1__Impl rule__ContentType__Group__2 ;
    public final void rule__ContentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1195:1: ( rule__ContentType__Group__1__Impl rule__ContentType__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1196:2: rule__ContentType__Group__1__Impl rule__ContentType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__1__Impl_in_rule__ContentType__Group__12448);
            rule__ContentType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__2_in_rule__ContentType__Group__12451);
            rule__ContentType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__1"


    // $ANTLR start "rule__ContentType__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1203:1: rule__ContentType__Group__1__Impl : ( 'ContentType' ) ;
    public final void rule__ContentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1207:1: ( ( 'ContentType' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1208:1: ( 'ContentType' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1208:1: ( 'ContentType' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1209:1: 'ContentType'
            {
             before(grammarAccess.getContentTypeAccess().getContentTypeKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ContentType__Group__1__Impl2479); 
             after(grammarAccess.getContentTypeAccess().getContentTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__1__Impl"


    // $ANTLR start "rule__ContentType__Group__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1222:1: rule__ContentType__Group__2 : rule__ContentType__Group__2__Impl rule__ContentType__Group__3 ;
    public final void rule__ContentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1226:1: ( rule__ContentType__Group__2__Impl rule__ContentType__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1227:2: rule__ContentType__Group__2__Impl rule__ContentType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__2__Impl_in_rule__ContentType__Group__22510);
            rule__ContentType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__3_in_rule__ContentType__Group__22513);
            rule__ContentType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__2"


    // $ANTLR start "rule__ContentType__Group__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1234:1: rule__ContentType__Group__2__Impl : ( '{' ) ;
    public final void rule__ContentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1238:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1239:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1239:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1240:1: '{'
            {
             before(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentType__Group__2__Impl2541); 
             after(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__2__Impl"


    // $ANTLR start "rule__ContentType__Group__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1253:1: rule__ContentType__Group__3 : rule__ContentType__Group__3__Impl rule__ContentType__Group__4 ;
    public final void rule__ContentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1257:1: ( rule__ContentType__Group__3__Impl rule__ContentType__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1258:2: rule__ContentType__Group__3__Impl rule__ContentType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__3__Impl_in_rule__ContentType__Group__32572);
            rule__ContentType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__4_in_rule__ContentType__Group__32575);
            rule__ContentType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__3"


    // $ANTLR start "rule__ContentType__Group__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1265:1: rule__ContentType__Group__3__Impl : ( 'Name' ) ;
    public final void rule__ContentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1269:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1270:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1270:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1271:1: 'Name'
            {
             before(grammarAccess.getContentTypeAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ContentType__Group__3__Impl2603); 
             after(grammarAccess.getContentTypeAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__3__Impl"


    // $ANTLR start "rule__ContentType__Group__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1284:1: rule__ContentType__Group__4 : rule__ContentType__Group__4__Impl rule__ContentType__Group__5 ;
    public final void rule__ContentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1288:1: ( rule__ContentType__Group__4__Impl rule__ContentType__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1289:2: rule__ContentType__Group__4__Impl rule__ContentType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__4__Impl_in_rule__ContentType__Group__42634);
            rule__ContentType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__5_in_rule__ContentType__Group__42637);
            rule__ContentType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__4"


    // $ANTLR start "rule__ContentType__Group__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1296:1: rule__ContentType__Group__4__Impl : ( '=' ) ;
    public final void rule__ContentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1300:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1301:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1301:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1302:1: '='
            {
             before(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ContentType__Group__4__Impl2665); 
             after(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__4__Impl"


    // $ANTLR start "rule__ContentType__Group__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1315:1: rule__ContentType__Group__5 : rule__ContentType__Group__5__Impl rule__ContentType__Group__6 ;
    public final void rule__ContentType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1319:1: ( rule__ContentType__Group__5__Impl rule__ContentType__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1320:2: rule__ContentType__Group__5__Impl rule__ContentType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__5__Impl_in_rule__ContentType__Group__52696);
            rule__ContentType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__6_in_rule__ContentType__Group__52699);
            rule__ContentType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__5"


    // $ANTLR start "rule__ContentType__Group__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1327:1: rule__ContentType__Group__5__Impl : ( ( rule__ContentType__NameAssignment_5 ) ) ;
    public final void rule__ContentType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1331:1: ( ( ( rule__ContentType__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1332:1: ( ( rule__ContentType__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1332:1: ( ( rule__ContentType__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1333:1: ( rule__ContentType__NameAssignment_5 )
            {
             before(grammarAccess.getContentTypeAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1334:1: ( rule__ContentType__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1334:2: rule__ContentType__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__NameAssignment_5_in_rule__ContentType__Group__5__Impl2726);
            rule__ContentType__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__5__Impl"


    // $ANTLR start "rule__ContentType__Group__6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1344:1: rule__ContentType__Group__6 : rule__ContentType__Group__6__Impl rule__ContentType__Group__7 ;
    public final void rule__ContentType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1348:1: ( rule__ContentType__Group__6__Impl rule__ContentType__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1349:2: rule__ContentType__Group__6__Impl rule__ContentType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__6__Impl_in_rule__ContentType__Group__62756);
            rule__ContentType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__7_in_rule__ContentType__Group__62759);
            rule__ContentType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__6"


    // $ANTLR start "rule__ContentType__Group__6__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1356:1: rule__ContentType__Group__6__Impl : ( ( rule__ContentType__Group_6__0 )? ) ;
    public final void rule__ContentType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1360:1: ( ( ( rule__ContentType__Group_6__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1361:1: ( ( rule__ContentType__Group_6__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1361:1: ( ( rule__ContentType__Group_6__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1362:1: ( rule__ContentType__Group_6__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1363:1: ( rule__ContentType__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1363:2: rule__ContentType__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__0_in_rule__ContentType__Group__6__Impl2786);
                    rule__ContentType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__6__Impl"


    // $ANTLR start "rule__ContentType__Group__7"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1373:1: rule__ContentType__Group__7 : rule__ContentType__Group__7__Impl rule__ContentType__Group__8 ;
    public final void rule__ContentType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1377:1: ( rule__ContentType__Group__7__Impl rule__ContentType__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1378:2: rule__ContentType__Group__7__Impl rule__ContentType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__7__Impl_in_rule__ContentType__Group__72817);
            rule__ContentType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__8_in_rule__ContentType__Group__72820);
            rule__ContentType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__7"


    // $ANTLR start "rule__ContentType__Group__7__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1385:1: rule__ContentType__Group__7__Impl : ( 'hasProperties' ) ;
    public final void rule__ContentType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1389:1: ( ( 'hasProperties' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1390:1: ( 'hasProperties' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1390:1: ( 'hasProperties' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1391:1: 'hasProperties'
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesKeyword_7()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ContentType__Group__7__Impl2848); 
             after(grammarAccess.getContentTypeAccess().getHasPropertiesKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__7__Impl"


    // $ANTLR start "rule__ContentType__Group__8"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1404:1: rule__ContentType__Group__8 : rule__ContentType__Group__8__Impl rule__ContentType__Group__9 ;
    public final void rule__ContentType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1408:1: ( rule__ContentType__Group__8__Impl rule__ContentType__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1409:2: rule__ContentType__Group__8__Impl rule__ContentType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__8__Impl_in_rule__ContentType__Group__82879);
            rule__ContentType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__9_in_rule__ContentType__Group__82882);
            rule__ContentType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__8"


    // $ANTLR start "rule__ContentType__Group__8__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1416:1: rule__ContentType__Group__8__Impl : ( '{' ) ;
    public final void rule__ContentType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1420:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1421:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1421:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1422:1: '{'
            {
             before(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentType__Group__8__Impl2910); 
             after(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__8__Impl"


    // $ANTLR start "rule__ContentType__Group__9"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1435:1: rule__ContentType__Group__9 : rule__ContentType__Group__9__Impl rule__ContentType__Group__10 ;
    public final void rule__ContentType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1439:1: ( rule__ContentType__Group__9__Impl rule__ContentType__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1440:2: rule__ContentType__Group__9__Impl rule__ContentType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__9__Impl_in_rule__ContentType__Group__92941);
            rule__ContentType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__10_in_rule__ContentType__Group__92944);
            rule__ContentType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__9"


    // $ANTLR start "rule__ContentType__Group__9__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1447:1: rule__ContentType__Group__9__Impl : ( ( rule__ContentType__HasPropertiesAssignment_9 ) ) ;
    public final void rule__ContentType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1451:1: ( ( ( rule__ContentType__HasPropertiesAssignment_9 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1452:1: ( ( rule__ContentType__HasPropertiesAssignment_9 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1452:1: ( ( rule__ContentType__HasPropertiesAssignment_9 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1453:1: ( rule__ContentType__HasPropertiesAssignment_9 )
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_9()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1454:1: ( rule__ContentType__HasPropertiesAssignment_9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1454:2: rule__ContentType__HasPropertiesAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasPropertiesAssignment_9_in_rule__ContentType__Group__9__Impl2971);
            rule__ContentType__HasPropertiesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__9__Impl"


    // $ANTLR start "rule__ContentType__Group__10"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1464:1: rule__ContentType__Group__10 : rule__ContentType__Group__10__Impl rule__ContentType__Group__11 ;
    public final void rule__ContentType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1468:1: ( rule__ContentType__Group__10__Impl rule__ContentType__Group__11 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1469:2: rule__ContentType__Group__10__Impl rule__ContentType__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__10__Impl_in_rule__ContentType__Group__103001);
            rule__ContentType__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__11_in_rule__ContentType__Group__103004);
            rule__ContentType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__10"


    // $ANTLR start "rule__ContentType__Group__10__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1476:1: rule__ContentType__Group__10__Impl : ( ( rule__ContentType__Group_10__0 )* ) ;
    public final void rule__ContentType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1480:1: ( ( ( rule__ContentType__Group_10__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1481:1: ( ( rule__ContentType__Group_10__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1481:1: ( ( rule__ContentType__Group_10__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1482:1: ( rule__ContentType__Group_10__0 )*
            {
             before(grammarAccess.getContentTypeAccess().getGroup_10()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1483:1: ( rule__ContentType__Group_10__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1483:2: rule__ContentType__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_10__0_in_rule__ContentType__Group__10__Impl3031);
            	    rule__ContentType__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getContentTypeAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__10__Impl"


    // $ANTLR start "rule__ContentType__Group__11"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1493:1: rule__ContentType__Group__11 : rule__ContentType__Group__11__Impl rule__ContentType__Group__12 ;
    public final void rule__ContentType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1497:1: ( rule__ContentType__Group__11__Impl rule__ContentType__Group__12 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1498:2: rule__ContentType__Group__11__Impl rule__ContentType__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__11__Impl_in_rule__ContentType__Group__113062);
            rule__ContentType__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__12_in_rule__ContentType__Group__113065);
            rule__ContentType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__11"


    // $ANTLR start "rule__ContentType__Group__11__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1505:1: rule__ContentType__Group__11__Impl : ( '}' ) ;
    public final void rule__ContentType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1509:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1510:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1510:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1511:1: '}'
            {
             before(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentType__Group__11__Impl3093); 
             after(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__11__Impl"


    // $ANTLR start "rule__ContentType__Group__12"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1524:1: rule__ContentType__Group__12 : rule__ContentType__Group__12__Impl rule__ContentType__Group__13 ;
    public final void rule__ContentType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1528:1: ( rule__ContentType__Group__12__Impl rule__ContentType__Group__13 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1529:2: rule__ContentType__Group__12__Impl rule__ContentType__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__12__Impl_in_rule__ContentType__Group__123124);
            rule__ContentType__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__13_in_rule__ContentType__Group__123127);
            rule__ContentType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__12"


    // $ANTLR start "rule__ContentType__Group__12__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1536:1: rule__ContentType__Group__12__Impl : ( ( rule__ContentType__Group_12__0 )? ) ;
    public final void rule__ContentType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1540:1: ( ( ( rule__ContentType__Group_12__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1541:1: ( ( rule__ContentType__Group_12__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1541:1: ( ( rule__ContentType__Group_12__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1542:1: ( rule__ContentType__Group_12__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_12()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1543:1: ( rule__ContentType__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1543:2: rule__ContentType__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__0_in_rule__ContentType__Group__12__Impl3154);
                    rule__ContentType__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentTypeAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__12__Impl"


    // $ANTLR start "rule__ContentType__Group__13"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1553:1: rule__ContentType__Group__13 : rule__ContentType__Group__13__Impl rule__ContentType__Group__14 ;
    public final void rule__ContentType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1557:1: ( rule__ContentType__Group__13__Impl rule__ContentType__Group__14 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1558:2: rule__ContentType__Group__13__Impl rule__ContentType__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__13__Impl_in_rule__ContentType__Group__133185);
            rule__ContentType__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__14_in_rule__ContentType__Group__133188);
            rule__ContentType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__13"


    // $ANTLR start "rule__ContentType__Group__13__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1565:1: rule__ContentType__Group__13__Impl : ( ( rule__ContentType__Group_13__0 )? ) ;
    public final void rule__ContentType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1569:1: ( ( ( rule__ContentType__Group_13__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1570:1: ( ( rule__ContentType__Group_13__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1570:1: ( ( rule__ContentType__Group_13__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1571:1: ( rule__ContentType__Group_13__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_13()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1572:1: ( rule__ContentType__Group_13__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1572:2: rule__ContentType__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__0_in_rule__ContentType__Group__13__Impl3215);
                    rule__ContentType__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentTypeAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__13__Impl"


    // $ANTLR start "rule__ContentType__Group__14"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1582:1: rule__ContentType__Group__14 : rule__ContentType__Group__14__Impl ;
    public final void rule__ContentType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1586:1: ( rule__ContentType__Group__14__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1587:2: rule__ContentType__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__14__Impl_in_rule__ContentType__Group__143246);
            rule__ContentType__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__14"


    // $ANTLR start "rule__ContentType__Group__14__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1593:1: rule__ContentType__Group__14__Impl : ( '}' ) ;
    public final void rule__ContentType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1597:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1598:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1598:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1599:1: '}'
            {
             before(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentType__Group__14__Impl3274); 
             after(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__14__Impl"


    // $ANTLR start "rule__ContentType__Group_6__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1642:1: rule__ContentType__Group_6__0 : rule__ContentType__Group_6__0__Impl rule__ContentType__Group_6__1 ;
    public final void rule__ContentType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1646:1: ( rule__ContentType__Group_6__0__Impl rule__ContentType__Group_6__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1647:2: rule__ContentType__Group_6__0__Impl rule__ContentType__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__0__Impl_in_rule__ContentType__Group_6__03335);
            rule__ContentType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__1_in_rule__ContentType__Group_6__03338);
            rule__ContentType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_6__0"


    // $ANTLR start "rule__ContentType__Group_6__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1654:1: rule__ContentType__Group_6__0__Impl : ( 'guid' ) ;
    public final void rule__ContentType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1658:1: ( ( 'guid' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1659:1: ( 'guid' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1659:1: ( 'guid' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1660:1: 'guid'
            {
             before(grammarAccess.getContentTypeAccess().getGuidKeyword_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ContentType__Group_6__0__Impl3366); 
             after(grammarAccess.getContentTypeAccess().getGuidKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_6__0__Impl"


    // $ANTLR start "rule__ContentType__Group_6__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1673:1: rule__ContentType__Group_6__1 : rule__ContentType__Group_6__1__Impl ;
    public final void rule__ContentType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1677:1: ( rule__ContentType__Group_6__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1678:2: rule__ContentType__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__1__Impl_in_rule__ContentType__Group_6__13397);
            rule__ContentType__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_6__1"


    // $ANTLR start "rule__ContentType__Group_6__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1684:1: rule__ContentType__Group_6__1__Impl : ( ( rule__ContentType__GuidAssignment_6_1 ) ) ;
    public final void rule__ContentType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1688:1: ( ( ( rule__ContentType__GuidAssignment_6_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1689:1: ( ( rule__ContentType__GuidAssignment_6_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1689:1: ( ( rule__ContentType__GuidAssignment_6_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1690:1: ( rule__ContentType__GuidAssignment_6_1 )
            {
             before(grammarAccess.getContentTypeAccess().getGuidAssignment_6_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1691:1: ( rule__ContentType__GuidAssignment_6_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1691:2: rule__ContentType__GuidAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__GuidAssignment_6_1_in_rule__ContentType__Group_6__1__Impl3424);
            rule__ContentType__GuidAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getGuidAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_6__1__Impl"


    // $ANTLR start "rule__ContentType__Group_10__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1705:1: rule__ContentType__Group_10__0 : rule__ContentType__Group_10__0__Impl rule__ContentType__Group_10__1 ;
    public final void rule__ContentType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1709:1: ( rule__ContentType__Group_10__0__Impl rule__ContentType__Group_10__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1710:2: rule__ContentType__Group_10__0__Impl rule__ContentType__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_10__0__Impl_in_rule__ContentType__Group_10__03458);
            rule__ContentType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_10__1_in_rule__ContentType__Group_10__03461);
            rule__ContentType__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_10__0"


    // $ANTLR start "rule__ContentType__Group_10__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1717:1: rule__ContentType__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ContentType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1721:1: ( ( ',' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1722:1: ( ',' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1722:1: ( ',' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1723:1: ','
            {
             before(grammarAccess.getContentTypeAccess().getCommaKeyword_10_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentType__Group_10__0__Impl3489); 
             after(grammarAccess.getContentTypeAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_10__0__Impl"


    // $ANTLR start "rule__ContentType__Group_10__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1736:1: rule__ContentType__Group_10__1 : rule__ContentType__Group_10__1__Impl ;
    public final void rule__ContentType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1740:1: ( rule__ContentType__Group_10__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1741:2: rule__ContentType__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_10__1__Impl_in_rule__ContentType__Group_10__13520);
            rule__ContentType__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_10__1"


    // $ANTLR start "rule__ContentType__Group_10__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1747:1: rule__ContentType__Group_10__1__Impl : ( ( rule__ContentType__HasPropertiesAssignment_10_1 ) ) ;
    public final void rule__ContentType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1751:1: ( ( ( rule__ContentType__HasPropertiesAssignment_10_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1752:1: ( ( rule__ContentType__HasPropertiesAssignment_10_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1752:1: ( ( rule__ContentType__HasPropertiesAssignment_10_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1753:1: ( rule__ContentType__HasPropertiesAssignment_10_1 )
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_10_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1754:1: ( rule__ContentType__HasPropertiesAssignment_10_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1754:2: rule__ContentType__HasPropertiesAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasPropertiesAssignment_10_1_in_rule__ContentType__Group_10__1__Impl3547);
            rule__ContentType__HasPropertiesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_10__1__Impl"


    // $ANTLR start "rule__ContentType__Group_12__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1768:1: rule__ContentType__Group_12__0 : rule__ContentType__Group_12__0__Impl rule__ContentType__Group_12__1 ;
    public final void rule__ContentType__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1772:1: ( rule__ContentType__Group_12__0__Impl rule__ContentType__Group_12__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1773:2: rule__ContentType__Group_12__0__Impl rule__ContentType__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__0__Impl_in_rule__ContentType__Group_12__03581);
            rule__ContentType__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__1_in_rule__ContentType__Group_12__03584);
            rule__ContentType__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__0"


    // $ANTLR start "rule__ContentType__Group_12__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1780:1: rule__ContentType__Group_12__0__Impl : ( 'hasVersions' ) ;
    public final void rule__ContentType__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1784:1: ( ( 'hasVersions' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1785:1: ( 'hasVersions' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1785:1: ( 'hasVersions' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1786:1: 'hasVersions'
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsKeyword_12_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ContentType__Group_12__0__Impl3612); 
             after(grammarAccess.getContentTypeAccess().getHasVersionsKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__0__Impl"


    // $ANTLR start "rule__ContentType__Group_12__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1799:1: rule__ContentType__Group_12__1 : rule__ContentType__Group_12__1__Impl rule__ContentType__Group_12__2 ;
    public final void rule__ContentType__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1803:1: ( rule__ContentType__Group_12__1__Impl rule__ContentType__Group_12__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1804:2: rule__ContentType__Group_12__1__Impl rule__ContentType__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__1__Impl_in_rule__ContentType__Group_12__13643);
            rule__ContentType__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__2_in_rule__ContentType__Group_12__13646);
            rule__ContentType__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__1"


    // $ANTLR start "rule__ContentType__Group_12__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1811:1: rule__ContentType__Group_12__1__Impl : ( '{' ) ;
    public final void rule__ContentType__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1815:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1816:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1816:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1817:1: '{'
            {
             before(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentType__Group_12__1__Impl3674); 
             after(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__1__Impl"


    // $ANTLR start "rule__ContentType__Group_12__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1830:1: rule__ContentType__Group_12__2 : rule__ContentType__Group_12__2__Impl rule__ContentType__Group_12__3 ;
    public final void rule__ContentType__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1834:1: ( rule__ContentType__Group_12__2__Impl rule__ContentType__Group_12__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1835:2: rule__ContentType__Group_12__2__Impl rule__ContentType__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__2__Impl_in_rule__ContentType__Group_12__23705);
            rule__ContentType__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__3_in_rule__ContentType__Group_12__23708);
            rule__ContentType__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__2"


    // $ANTLR start "rule__ContentType__Group_12__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1842:1: rule__ContentType__Group_12__2__Impl : ( ( rule__ContentType__HasVersionsAssignment_12_2 ) ) ;
    public final void rule__ContentType__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1846:1: ( ( ( rule__ContentType__HasVersionsAssignment_12_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1847:1: ( ( rule__ContentType__HasVersionsAssignment_12_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1847:1: ( ( rule__ContentType__HasVersionsAssignment_12_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1848:1: ( rule__ContentType__HasVersionsAssignment_12_2 )
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_12_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1849:1: ( rule__ContentType__HasVersionsAssignment_12_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1849:2: rule__ContentType__HasVersionsAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasVersionsAssignment_12_2_in_rule__ContentType__Group_12__2__Impl3735);
            rule__ContentType__HasVersionsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__2__Impl"


    // $ANTLR start "rule__ContentType__Group_12__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1859:1: rule__ContentType__Group_12__3 : rule__ContentType__Group_12__3__Impl rule__ContentType__Group_12__4 ;
    public final void rule__ContentType__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1863:1: ( rule__ContentType__Group_12__3__Impl rule__ContentType__Group_12__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1864:2: rule__ContentType__Group_12__3__Impl rule__ContentType__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__3__Impl_in_rule__ContentType__Group_12__33765);
            rule__ContentType__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__4_in_rule__ContentType__Group_12__33768);
            rule__ContentType__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__3"


    // $ANTLR start "rule__ContentType__Group_12__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1871:1: rule__ContentType__Group_12__3__Impl : ( ( rule__ContentType__Group_12_3__0 )* ) ;
    public final void rule__ContentType__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1875:1: ( ( ( rule__ContentType__Group_12_3__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1876:1: ( ( rule__ContentType__Group_12_3__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1876:1: ( ( rule__ContentType__Group_12_3__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1877:1: ( rule__ContentType__Group_12_3__0 )*
            {
             before(grammarAccess.getContentTypeAccess().getGroup_12_3()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1878:1: ( rule__ContentType__Group_12_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1878:2: rule__ContentType__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12_3__0_in_rule__ContentType__Group_12__3__Impl3795);
            	    rule__ContentType__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getContentTypeAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__3__Impl"


    // $ANTLR start "rule__ContentType__Group_12__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1888:1: rule__ContentType__Group_12__4 : rule__ContentType__Group_12__4__Impl ;
    public final void rule__ContentType__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1892:1: ( rule__ContentType__Group_12__4__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1893:2: rule__ContentType__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__4__Impl_in_rule__ContentType__Group_12__43826);
            rule__ContentType__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__4"


    // $ANTLR start "rule__ContentType__Group_12__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1899:1: rule__ContentType__Group_12__4__Impl : ( '}' ) ;
    public final void rule__ContentType__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1903:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1904:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1904:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1905:1: '}'
            {
             before(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentType__Group_12__4__Impl3854); 
             after(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12__4__Impl"


    // $ANTLR start "rule__ContentType__Group_12_3__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1928:1: rule__ContentType__Group_12_3__0 : rule__ContentType__Group_12_3__0__Impl rule__ContentType__Group_12_3__1 ;
    public final void rule__ContentType__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1932:1: ( rule__ContentType__Group_12_3__0__Impl rule__ContentType__Group_12_3__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1933:2: rule__ContentType__Group_12_3__0__Impl rule__ContentType__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12_3__0__Impl_in_rule__ContentType__Group_12_3__03895);
            rule__ContentType__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12_3__1_in_rule__ContentType__Group_12_3__03898);
            rule__ContentType__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12_3__0"


    // $ANTLR start "rule__ContentType__Group_12_3__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1940:1: rule__ContentType__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__ContentType__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1944:1: ( ( ',' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1945:1: ( ',' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1945:1: ( ',' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1946:1: ','
            {
             before(grammarAccess.getContentTypeAccess().getCommaKeyword_12_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentType__Group_12_3__0__Impl3926); 
             after(grammarAccess.getContentTypeAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12_3__0__Impl"


    // $ANTLR start "rule__ContentType__Group_12_3__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1959:1: rule__ContentType__Group_12_3__1 : rule__ContentType__Group_12_3__1__Impl ;
    public final void rule__ContentType__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1963:1: ( rule__ContentType__Group_12_3__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1964:2: rule__ContentType__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12_3__1__Impl_in_rule__ContentType__Group_12_3__13957);
            rule__ContentType__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12_3__1"


    // $ANTLR start "rule__ContentType__Group_12_3__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1970:1: rule__ContentType__Group_12_3__1__Impl : ( ( rule__ContentType__HasVersionsAssignment_12_3_1 ) ) ;
    public final void rule__ContentType__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1974:1: ( ( ( rule__ContentType__HasVersionsAssignment_12_3_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1975:1: ( ( rule__ContentType__HasVersionsAssignment_12_3_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1975:1: ( ( rule__ContentType__HasVersionsAssignment_12_3_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1976:1: ( rule__ContentType__HasVersionsAssignment_12_3_1 )
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_12_3_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1977:1: ( rule__ContentType__HasVersionsAssignment_12_3_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1977:2: rule__ContentType__HasVersionsAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasVersionsAssignment_12_3_1_in_rule__ContentType__Group_12_3__1__Impl3984);
            rule__ContentType__HasVersionsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_12_3__1__Impl"


    // $ANTLR start "rule__ContentType__Group_13__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1991:1: rule__ContentType__Group_13__0 : rule__ContentType__Group_13__0__Impl rule__ContentType__Group_13__1 ;
    public final void rule__ContentType__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1995:1: ( rule__ContentType__Group_13__0__Impl rule__ContentType__Group_13__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1996:2: rule__ContentType__Group_13__0__Impl rule__ContentType__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__0__Impl_in_rule__ContentType__Group_13__04018);
            rule__ContentType__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__1_in_rule__ContentType__Group_13__04021);
            rule__ContentType__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__0"


    // $ANTLR start "rule__ContentType__Group_13__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2003:1: rule__ContentType__Group_13__0__Impl : ( 'modifiedBy' ) ;
    public final void rule__ContentType__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2007:1: ( ( 'modifiedBy' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2008:1: ( 'modifiedBy' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2008:1: ( 'modifiedBy' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2009:1: 'modifiedBy'
            {
             before(grammarAccess.getContentTypeAccess().getModifiedByKeyword_13_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ContentType__Group_13__0__Impl4049); 
             after(grammarAccess.getContentTypeAccess().getModifiedByKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__0__Impl"


    // $ANTLR start "rule__ContentType__Group_13__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2022:1: rule__ContentType__Group_13__1 : rule__ContentType__Group_13__1__Impl ;
    public final void rule__ContentType__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2026:1: ( rule__ContentType__Group_13__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2027:2: rule__ContentType__Group_13__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__1__Impl_in_rule__ContentType__Group_13__14080);
            rule__ContentType__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__1"


    // $ANTLR start "rule__ContentType__Group_13__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2033:1: rule__ContentType__Group_13__1__Impl : ( ( rule__ContentType__ModifiedByAssignment_13_1 ) ) ;
    public final void rule__ContentType__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2037:1: ( ( ( rule__ContentType__ModifiedByAssignment_13_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2038:1: ( ( rule__ContentType__ModifiedByAssignment_13_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2038:1: ( ( rule__ContentType__ModifiedByAssignment_13_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2039:1: ( rule__ContentType__ModifiedByAssignment_13_1 )
            {
             before(grammarAccess.getContentTypeAccess().getModifiedByAssignment_13_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2040:1: ( rule__ContentType__ModifiedByAssignment_13_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2040:2: rule__ContentType__ModifiedByAssignment_13_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__ModifiedByAssignment_13_1_in_rule__ContentType__Group_13__1__Impl4107);
            rule__ContentType__ModifiedByAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getModifiedByAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2054:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2058:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2059:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04141);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04144);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2066:1: rule__Property__Group__0__Impl : ( 'Property' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2070:1: ( ( 'Property' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2071:1: ( 'Property' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2071:1: ( 'Property' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2072:1: 'Property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Property__Group__0__Impl4172); 
             after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2085:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2089:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2090:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14203);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14206);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2097:1: rule__Property__Group__1__Impl : ( '{' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2101:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2102:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2102:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2103:1: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Property__Group__1__Impl4234); 
             after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2116:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2120:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2121:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24265);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24268);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2128:1: rule__Property__Group__2__Impl : ( 'Name' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2132:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2133:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2133:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2134:1: 'Name'
            {
             before(grammarAccess.getPropertyAccess().getNameKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Property__Group__2__Impl4296); 
             after(grammarAccess.getPropertyAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2147:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2151:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2152:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34327);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34330);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2159:1: rule__Property__Group__3__Impl : ( '=' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2163:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2164:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2164:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2165:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Property__Group__3__Impl4358); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2178:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2182:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2183:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44389);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5_in_rule__Property__Group__44392);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2190:1: rule__Property__Group__4__Impl : ( ( rule__Property__NameAssignment_4 ) ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2194:1: ( ( ( rule__Property__NameAssignment_4 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2195:1: ( ( rule__Property__NameAssignment_4 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2195:1: ( ( rule__Property__NameAssignment_4 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2196:1: ( rule__Property__NameAssignment_4 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_4()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2197:1: ( rule__Property__NameAssignment_4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2197:2: rule__Property__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__NameAssignment_4_in_rule__Property__Group__4__Impl4419);
            rule__Property__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2207:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2211:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2212:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__54449);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6_in_rule__Property__Group__54452);
            rule__Property__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2219:1: rule__Property__Group__5__Impl : ( 'accessModifer' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2223:1: ( ( 'accessModifer' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2224:1: ( 'accessModifer' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2224:1: ( 'accessModifer' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2225:1: 'accessModifer'
            {
             before(grammarAccess.getPropertyAccess().getAccessModiferKeyword_5()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Property__Group__5__Impl4480); 
             after(grammarAccess.getPropertyAccess().getAccessModiferKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2238:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2242:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2243:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__64511);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7_in_rule__Property__Group__64514);
            rule__Property__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6"


    // $ANTLR start "rule__Property__Group__6__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2250:1: rule__Property__Group__6__Impl : ( ( rule__Property__AccessModiferAssignment_6 ) ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2254:1: ( ( ( rule__Property__AccessModiferAssignment_6 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2255:1: ( ( rule__Property__AccessModiferAssignment_6 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2255:1: ( ( rule__Property__AccessModiferAssignment_6 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2256:1: ( rule__Property__AccessModiferAssignment_6 )
            {
             before(grammarAccess.getPropertyAccess().getAccessModiferAssignment_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2257:1: ( rule__Property__AccessModiferAssignment_6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2257:2: rule__Property__AccessModiferAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__AccessModiferAssignment_6_in_rule__Property__Group__6__Impl4541);
            rule__Property__AccessModiferAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAccessModiferAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6__Impl"


    // $ANTLR start "rule__Property__Group__7"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2267:1: rule__Property__Group__7 : rule__Property__Group__7__Impl rule__Property__Group__8 ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2271:1: ( rule__Property__Group__7__Impl rule__Property__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2272:2: rule__Property__Group__7__Impl rule__Property__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__74571);
            rule__Property__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__8_in_rule__Property__Group__74574);
            rule__Property__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7"


    // $ANTLR start "rule__Property__Group__7__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2279:1: rule__Property__Group__7__Impl : ( ( rule__Property__Group_7__0 )? ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2283:1: ( ( ( rule__Property__Group_7__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2284:1: ( ( rule__Property__Group_7__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2284:1: ( ( rule__Property__Group_7__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2285:1: ( rule__Property__Group_7__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2286:1: ( rule__Property__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2286:2: rule__Property__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_7__0_in_rule__Property__Group__7__Impl4601);
                    rule__Property__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7__Impl"


    // $ANTLR start "rule__Property__Group__8"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2296:1: rule__Property__Group__8 : rule__Property__Group__8__Impl ;
    public final void rule__Property__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2300:1: ( rule__Property__Group__8__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2301:2: rule__Property__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__8__Impl_in_rule__Property__Group__84632);
            rule__Property__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8"


    // $ANTLR start "rule__Property__Group__8__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2307:1: rule__Property__Group__8__Impl : ( '}' ) ;
    public final void rule__Property__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2311:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2312:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2312:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2313:1: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_8()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Property__Group__8__Impl4660); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8__Impl"


    // $ANTLR start "rule__Property__Group_7__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2344:1: rule__Property__Group_7__0 : rule__Property__Group_7__0__Impl rule__Property__Group_7__1 ;
    public final void rule__Property__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2348:1: ( rule__Property__Group_7__0__Impl rule__Property__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2349:2: rule__Property__Group_7__0__Impl rule__Property__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_7__0__Impl_in_rule__Property__Group_7__04709);
            rule__Property__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_7__1_in_rule__Property__Group_7__04712);
            rule__Property__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__0"


    // $ANTLR start "rule__Property__Group_7__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2356:1: rule__Property__Group_7__0__Impl : ( 'Datatype' ) ;
    public final void rule__Property__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2360:1: ( ( 'Datatype' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2361:1: ( 'Datatype' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2361:1: ( 'Datatype' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2362:1: 'Datatype'
            {
             before(grammarAccess.getPropertyAccess().getDatatypeKeyword_7_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Property__Group_7__0__Impl4740); 
             after(grammarAccess.getPropertyAccess().getDatatypeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__0__Impl"


    // $ANTLR start "rule__Property__Group_7__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2375:1: rule__Property__Group_7__1 : rule__Property__Group_7__1__Impl ;
    public final void rule__Property__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2379:1: ( rule__Property__Group_7__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2380:2: rule__Property__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_7__1__Impl_in_rule__Property__Group_7__14771);
            rule__Property__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__1"


    // $ANTLR start "rule__Property__Group_7__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2386:1: rule__Property__Group_7__1__Impl : ( ( rule__Property__DatatypeAssignment_7_1 ) ) ;
    public final void rule__Property__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2390:1: ( ( ( rule__Property__DatatypeAssignment_7_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2391:1: ( ( rule__Property__DatatypeAssignment_7_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2391:1: ( ( rule__Property__DatatypeAssignment_7_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2392:1: ( rule__Property__DatatypeAssignment_7_1 )
            {
             before(grammarAccess.getPropertyAccess().getDatatypeAssignment_7_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2393:1: ( rule__Property__DatatypeAssignment_7_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2393:2: rule__Property__DatatypeAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__DatatypeAssignment_7_1_in_rule__Property__Group_7__1__Impl4798);
            rule__Property__DatatypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDatatypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__1__Impl"


    // $ANTLR start "rule__SingleType__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2407:1: rule__SingleType__Group__0 : rule__SingleType__Group__0__Impl rule__SingleType__Group__1 ;
    public final void rule__SingleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2411:1: ( rule__SingleType__Group__0__Impl rule__SingleType__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2412:2: rule__SingleType__Group__0__Impl rule__SingleType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__0__Impl_in_rule__SingleType__Group__04832);
            rule__SingleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__1_in_rule__SingleType__Group__04835);
            rule__SingleType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__0"


    // $ANTLR start "rule__SingleType__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2419:1: rule__SingleType__Group__0__Impl : ( () ) ;
    public final void rule__SingleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2423:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2424:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2424:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2425:1: ()
            {
             before(grammarAccess.getSingleTypeAccess().getSingleTypeAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2426:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2428:1: 
            {
            }

             after(grammarAccess.getSingleTypeAccess().getSingleTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__0__Impl"


    // $ANTLR start "rule__SingleType__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2438:1: rule__SingleType__Group__1 : rule__SingleType__Group__1__Impl rule__SingleType__Group__2 ;
    public final void rule__SingleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2442:1: ( rule__SingleType__Group__1__Impl rule__SingleType__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2443:2: rule__SingleType__Group__1__Impl rule__SingleType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__1__Impl_in_rule__SingleType__Group__14893);
            rule__SingleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__2_in_rule__SingleType__Group__14896);
            rule__SingleType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__1"


    // $ANTLR start "rule__SingleType__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2450:1: rule__SingleType__Group__1__Impl : ( 'SingleType' ) ;
    public final void rule__SingleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2454:1: ( ( 'SingleType' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2455:1: ( 'SingleType' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2455:1: ( 'SingleType' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2456:1: 'SingleType'
            {
             before(grammarAccess.getSingleTypeAccess().getSingleTypeKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__SingleType__Group__1__Impl4924); 
             after(grammarAccess.getSingleTypeAccess().getSingleTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__1__Impl"


    // $ANTLR start "rule__SingleType__Group__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2469:1: rule__SingleType__Group__2 : rule__SingleType__Group__2__Impl rule__SingleType__Group__3 ;
    public final void rule__SingleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2473:1: ( rule__SingleType__Group__2__Impl rule__SingleType__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2474:2: rule__SingleType__Group__2__Impl rule__SingleType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__2__Impl_in_rule__SingleType__Group__24955);
            rule__SingleType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__3_in_rule__SingleType__Group__24958);
            rule__SingleType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__2"


    // $ANTLR start "rule__SingleType__Group__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2481:1: rule__SingleType__Group__2__Impl : ( '{' ) ;
    public final void rule__SingleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2485:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2486:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2486:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2487:1: '{'
            {
             before(grammarAccess.getSingleTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__SingleType__Group__2__Impl4986); 
             after(grammarAccess.getSingleTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__2__Impl"


    // $ANTLR start "rule__SingleType__Group__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2500:1: rule__SingleType__Group__3 : rule__SingleType__Group__3__Impl rule__SingleType__Group__4 ;
    public final void rule__SingleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2504:1: ( rule__SingleType__Group__3__Impl rule__SingleType__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2505:2: rule__SingleType__Group__3__Impl rule__SingleType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__3__Impl_in_rule__SingleType__Group__35017);
            rule__SingleType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__4_in_rule__SingleType__Group__35020);
            rule__SingleType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__3"


    // $ANTLR start "rule__SingleType__Group__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2512:1: rule__SingleType__Group__3__Impl : ( 'Name' ) ;
    public final void rule__SingleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2516:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2517:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2517:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2518:1: 'Name'
            {
             before(grammarAccess.getSingleTypeAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__SingleType__Group__3__Impl5048); 
             after(grammarAccess.getSingleTypeAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__3__Impl"


    // $ANTLR start "rule__SingleType__Group__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2531:1: rule__SingleType__Group__4 : rule__SingleType__Group__4__Impl rule__SingleType__Group__5 ;
    public final void rule__SingleType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2535:1: ( rule__SingleType__Group__4__Impl rule__SingleType__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2536:2: rule__SingleType__Group__4__Impl rule__SingleType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__4__Impl_in_rule__SingleType__Group__45079);
            rule__SingleType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__5_in_rule__SingleType__Group__45082);
            rule__SingleType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__4"


    // $ANTLR start "rule__SingleType__Group__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2543:1: rule__SingleType__Group__4__Impl : ( '=' ) ;
    public final void rule__SingleType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2547:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2548:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2548:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2549:1: '='
            {
             before(grammarAccess.getSingleTypeAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__SingleType__Group__4__Impl5110); 
             after(grammarAccess.getSingleTypeAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__4__Impl"


    // $ANTLR start "rule__SingleType__Group__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2562:1: rule__SingleType__Group__5 : rule__SingleType__Group__5__Impl rule__SingleType__Group__6 ;
    public final void rule__SingleType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2566:1: ( rule__SingleType__Group__5__Impl rule__SingleType__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2567:2: rule__SingleType__Group__5__Impl rule__SingleType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__5__Impl_in_rule__SingleType__Group__55141);
            rule__SingleType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__6_in_rule__SingleType__Group__55144);
            rule__SingleType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__5"


    // $ANTLR start "rule__SingleType__Group__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2574:1: rule__SingleType__Group__5__Impl : ( ( rule__SingleType__NameAssignment_5 ) ) ;
    public final void rule__SingleType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2578:1: ( ( ( rule__SingleType__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2579:1: ( ( rule__SingleType__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2579:1: ( ( rule__SingleType__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2580:1: ( rule__SingleType__NameAssignment_5 )
            {
             before(grammarAccess.getSingleTypeAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2581:1: ( rule__SingleType__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2581:2: rule__SingleType__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__NameAssignment_5_in_rule__SingleType__Group__5__Impl5171);
            rule__SingleType__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSingleTypeAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__5__Impl"


    // $ANTLR start "rule__SingleType__Group__6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2591:1: rule__SingleType__Group__6 : rule__SingleType__Group__6__Impl rule__SingleType__Group__7 ;
    public final void rule__SingleType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2595:1: ( rule__SingleType__Group__6__Impl rule__SingleType__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2596:2: rule__SingleType__Group__6__Impl rule__SingleType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__6__Impl_in_rule__SingleType__Group__65201);
            rule__SingleType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__7_in_rule__SingleType__Group__65204);
            rule__SingleType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__6"


    // $ANTLR start "rule__SingleType__Group__6__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2603:1: rule__SingleType__Group__6__Impl : ( ( rule__SingleType__Group_6__0 )? ) ;
    public final void rule__SingleType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2607:1: ( ( ( rule__SingleType__Group_6__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2608:1: ( ( rule__SingleType__Group_6__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2608:1: ( ( rule__SingleType__Group_6__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2609:1: ( rule__SingleType__Group_6__0 )?
            {
             before(grammarAccess.getSingleTypeAccess().getGroup_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2610:1: ( rule__SingleType__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2610:2: rule__SingleType__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group_6__0_in_rule__SingleType__Group__6__Impl5231);
                    rule__SingleType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__6__Impl"


    // $ANTLR start "rule__SingleType__Group__7"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2620:1: rule__SingleType__Group__7 : rule__SingleType__Group__7__Impl ;
    public final void rule__SingleType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2624:1: ( rule__SingleType__Group__7__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2625:2: rule__SingleType__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group__7__Impl_in_rule__SingleType__Group__75262);
            rule__SingleType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__7"


    // $ANTLR start "rule__SingleType__Group__7__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2631:1: rule__SingleType__Group__7__Impl : ( '}' ) ;
    public final void rule__SingleType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2635:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2636:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2636:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2637:1: '}'
            {
             before(grammarAccess.getSingleTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__SingleType__Group__7__Impl5290); 
             after(grammarAccess.getSingleTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group__7__Impl"


    // $ANTLR start "rule__SingleType__Group_6__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2666:1: rule__SingleType__Group_6__0 : rule__SingleType__Group_6__0__Impl rule__SingleType__Group_6__1 ;
    public final void rule__SingleType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2670:1: ( rule__SingleType__Group_6__0__Impl rule__SingleType__Group_6__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2671:2: rule__SingleType__Group_6__0__Impl rule__SingleType__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group_6__0__Impl_in_rule__SingleType__Group_6__05337);
            rule__SingleType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group_6__1_in_rule__SingleType__Group_6__05340);
            rule__SingleType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group_6__0"


    // $ANTLR start "rule__SingleType__Group_6__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2678:1: rule__SingleType__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__SingleType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2682:1: ( ( 'type' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2683:1: ( 'type' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2683:1: ( 'type' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2684:1: 'type'
            {
             before(grammarAccess.getSingleTypeAccess().getTypeKeyword_6_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__SingleType__Group_6__0__Impl5368); 
             after(grammarAccess.getSingleTypeAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group_6__0__Impl"


    // $ANTLR start "rule__SingleType__Group_6__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2697:1: rule__SingleType__Group_6__1 : rule__SingleType__Group_6__1__Impl ;
    public final void rule__SingleType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2701:1: ( rule__SingleType__Group_6__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2702:2: rule__SingleType__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__Group_6__1__Impl_in_rule__SingleType__Group_6__15399);
            rule__SingleType__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group_6__1"


    // $ANTLR start "rule__SingleType__Group_6__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2708:1: rule__SingleType__Group_6__1__Impl : ( ( rule__SingleType__TypeAssignment_6_1 ) ) ;
    public final void rule__SingleType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2712:1: ( ( ( rule__SingleType__TypeAssignment_6_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2713:1: ( ( rule__SingleType__TypeAssignment_6_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2713:1: ( ( rule__SingleType__TypeAssignment_6_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2714:1: ( rule__SingleType__TypeAssignment_6_1 )
            {
             before(grammarAccess.getSingleTypeAccess().getTypeAssignment_6_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2715:1: ( rule__SingleType__TypeAssignment_6_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2715:2: rule__SingleType__TypeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleType__TypeAssignment_6_1_in_rule__SingleType__Group_6__1__Impl5426);
            rule__SingleType__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleTypeAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__Group_6__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2729:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2733:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2734:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__05460);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__05463);
            rule__ArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2741:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2745:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2746:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2746:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2747:1: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2748:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2750:1: 
            {
            }

             after(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2760:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2764:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2765:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__15521);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__15524);
            rule__ArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2772:1: rule__ArrayType__Group__1__Impl : ( 'ArrayType' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2776:1: ( ( 'ArrayType' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2777:1: ( 'ArrayType' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2777:1: ( 'ArrayType' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2778:1: 'ArrayType'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ArrayType__Group__1__Impl5552); 
             after(grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2791:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2795:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2796:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__25583);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__25586);
            rule__ArrayType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2"


    // $ANTLR start "rule__ArrayType__Group__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2803:1: rule__ArrayType__Group__2__Impl : ( '{' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2807:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2808:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2808:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2809:1: '{'
            {
             before(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ArrayType__Group__2__Impl5614); 
             after(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2822:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2826:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2827:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__35645);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__35648);
            rule__ArrayType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3"


    // $ANTLR start "rule__ArrayType__Group__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2834:1: rule__ArrayType__Group__3__Impl : ( 'Name' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2838:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2839:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2839:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2840:1: 'Name'
            {
             before(grammarAccess.getArrayTypeAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ArrayType__Group__3__Impl5676); 
             after(grammarAccess.getArrayTypeAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3__Impl"


    // $ANTLR start "rule__ArrayType__Group__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2853:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2857:1: ( rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2858:2: rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__45707);
            rule__ArrayType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__45710);
            rule__ArrayType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__4"


    // $ANTLR start "rule__ArrayType__Group__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2865:1: rule__ArrayType__Group__4__Impl : ( '=' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2869:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2870:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2870:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2871:1: '='
            {
             before(grammarAccess.getArrayTypeAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ArrayType__Group__4__Impl5738); 
             after(grammarAccess.getArrayTypeAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__4__Impl"


    // $ANTLR start "rule__ArrayType__Group__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2884:1: rule__ArrayType__Group__5 : rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 ;
    public final void rule__ArrayType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2888:1: ( rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2889:2: rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__55769);
            rule__ArrayType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__55772);
            rule__ArrayType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__5"


    // $ANTLR start "rule__ArrayType__Group__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2896:1: rule__ArrayType__Group__5__Impl : ( ( rule__ArrayType__NameAssignment_5 ) ) ;
    public final void rule__ArrayType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2900:1: ( ( ( rule__ArrayType__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2901:1: ( ( rule__ArrayType__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2901:1: ( ( rule__ArrayType__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2902:1: ( rule__ArrayType__NameAssignment_5 )
            {
             before(grammarAccess.getArrayTypeAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2903:1: ( rule__ArrayType__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2903:2: rule__ArrayType__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__NameAssignment_5_in_rule__ArrayType__Group__5__Impl5799);
            rule__ArrayType__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__5__Impl"


    // $ANTLR start "rule__ArrayType__Group__6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2913:1: rule__ArrayType__Group__6 : rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 ;
    public final void rule__ArrayType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2917:1: ( rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2918:2: rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__65829);
            rule__ArrayType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__65832);
            rule__ArrayType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__6"


    // $ANTLR start "rule__ArrayType__Group__6__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2925:1: rule__ArrayType__Group__6__Impl : ( ( rule__ArrayType__Group_6__0 )? ) ;
    public final void rule__ArrayType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2929:1: ( ( ( rule__ArrayType__Group_6__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2930:1: ( ( rule__ArrayType__Group_6__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2930:1: ( ( rule__ArrayType__Group_6__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2931:1: ( rule__ArrayType__Group_6__0 )?
            {
             before(grammarAccess.getArrayTypeAccess().getGroup_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2932:1: ( rule__ArrayType__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2932:2: rule__ArrayType__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group_6__0_in_rule__ArrayType__Group__6__Impl5859);
                    rule__ArrayType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__6__Impl"


    // $ANTLR start "rule__ArrayType__Group__7"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2942:1: rule__ArrayType__Group__7 : rule__ArrayType__Group__7__Impl ;
    public final void rule__ArrayType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2946:1: ( rule__ArrayType__Group__7__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2947:2: rule__ArrayType__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__75890);
            rule__ArrayType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__7"


    // $ANTLR start "rule__ArrayType__Group__7__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2953:1: rule__ArrayType__Group__7__Impl : ( '}' ) ;
    public final void rule__ArrayType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2957:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2958:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2958:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2959:1: '}'
            {
             before(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ArrayType__Group__7__Impl5918); 
             after(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__7__Impl"


    // $ANTLR start "rule__ArrayType__Group_6__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2988:1: rule__ArrayType__Group_6__0 : rule__ArrayType__Group_6__0__Impl rule__ArrayType__Group_6__1 ;
    public final void rule__ArrayType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2992:1: ( rule__ArrayType__Group_6__0__Impl rule__ArrayType__Group_6__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2993:2: rule__ArrayType__Group_6__0__Impl rule__ArrayType__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group_6__0__Impl_in_rule__ArrayType__Group_6__05965);
            rule__ArrayType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group_6__1_in_rule__ArrayType__Group_6__05968);
            rule__ArrayType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_6__0"


    // $ANTLR start "rule__ArrayType__Group_6__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3000:1: rule__ArrayType__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__ArrayType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3004:1: ( ( 'type' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3005:1: ( 'type' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3005:1: ( 'type' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3006:1: 'type'
            {
             before(grammarAccess.getArrayTypeAccess().getTypeKeyword_6_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ArrayType__Group_6__0__Impl5996); 
             after(grammarAccess.getArrayTypeAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_6__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_6__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3019:1: rule__ArrayType__Group_6__1 : rule__ArrayType__Group_6__1__Impl ;
    public final void rule__ArrayType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3023:1: ( rule__ArrayType__Group_6__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3024:2: rule__ArrayType__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__Group_6__1__Impl_in_rule__ArrayType__Group_6__16027);
            rule__ArrayType__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_6__1"


    // $ANTLR start "rule__ArrayType__Group_6__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3030:1: rule__ArrayType__Group_6__1__Impl : ( ( rule__ArrayType__TypeAssignment_6_1 ) ) ;
    public final void rule__ArrayType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3034:1: ( ( ( rule__ArrayType__TypeAssignment_6_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3035:1: ( ( rule__ArrayType__TypeAssignment_6_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3035:1: ( ( rule__ArrayType__TypeAssignment_6_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3036:1: ( rule__ArrayType__TypeAssignment_6_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getTypeAssignment_6_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3037:1: ( rule__ArrayType__TypeAssignment_6_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3037:2: rule__ArrayType__TypeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArrayType__TypeAssignment_6_1_in_rule__ArrayType__Group_6__1__Impl6054);
            rule__ArrayType__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_6__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3051:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3055:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3056:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__06088);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1_in_rule__Role__Group__06091);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3063:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3067:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3068:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3068:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3069:1: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3070:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3072:1: 
            {
            }

             after(grammarAccess.getRoleAccess().getRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3082:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3086:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3087:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__16149);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2_in_rule__Role__Group__16152);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3094:1: rule__Role__Group__1__Impl : ( ( rule__Role__IsAdminAssignment_1 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3098:1: ( ( ( rule__Role__IsAdminAssignment_1 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3099:1: ( ( rule__Role__IsAdminAssignment_1 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3099:1: ( ( rule__Role__IsAdminAssignment_1 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3100:1: ( rule__Role__IsAdminAssignment_1 )?
            {
             before(grammarAccess.getRoleAccess().getIsAdminAssignment_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3101:1: ( rule__Role__IsAdminAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==58) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3101:2: rule__Role__IsAdminAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Role__IsAdminAssignment_1_in_rule__Role__Group__1__Impl6179);
                    rule__Role__IsAdminAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getIsAdminAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3111:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3115:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3116:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__26210);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__3_in_rule__Role__Group__26213);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3123:1: rule__Role__Group__2__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3127:1: ( ( 'Role' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3128:1: ( 'Role' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3128:1: ( 'Role' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3129:1: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_2()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Role__Group__2__Impl6241); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3142:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3146:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3147:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__36272);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__4_in_rule__Role__Group__36275);
            rule__Role__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3154:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3158:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3159:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3159:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3160:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Role__Group__3__Impl6303); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3173:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3177:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3178:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__46334);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__5_in_rule__Role__Group__46337);
            rule__Role__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3185:1: rule__Role__Group__4__Impl : ( 'Name' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3189:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3190:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3190:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3191:1: 'Name'
            {
             before(grammarAccess.getRoleAccess().getNameKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Role__Group__4__Impl6365); 
             after(grammarAccess.getRoleAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3204:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3208:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3209:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__56396);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__6_in_rule__Role__Group__56399);
            rule__Role__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3216:1: rule__Role__Group__5__Impl : ( '=' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3220:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3221:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3221:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3222:1: '='
            {
             before(grammarAccess.getRoleAccess().getEqualsSignKeyword_5()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Role__Group__5__Impl6427); 
             after(grammarAccess.getRoleAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Role__Group__6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3235:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3239:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3240:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__66458);
            rule__Role__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__7_in_rule__Role__Group__66461);
            rule__Role__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6"


    // $ANTLR start "rule__Role__Group__6__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3247:1: rule__Role__Group__6__Impl : ( ( rule__Role__NameAssignment_6 ) ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3251:1: ( ( ( rule__Role__NameAssignment_6 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3252:1: ( ( rule__Role__NameAssignment_6 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3252:1: ( ( rule__Role__NameAssignment_6 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3253:1: ( rule__Role__NameAssignment_6 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3254:1: ( rule__Role__NameAssignment_6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3254:2: rule__Role__NameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__NameAssignment_6_in_rule__Role__Group__6__Impl6488);
            rule__Role__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6__Impl"


    // $ANTLR start "rule__Role__Group__7"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3264:1: rule__Role__Group__7 : rule__Role__Group__7__Impl rule__Role__Group__8 ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3268:1: ( rule__Role__Group__7__Impl rule__Role__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3269:2: rule__Role__Group__7__Impl rule__Role__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__76518);
            rule__Role__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__8_in_rule__Role__Group__76521);
            rule__Role__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__7"


    // $ANTLR start "rule__Role__Group__7__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3276:1: rule__Role__Group__7__Impl : ( ( rule__Role__Group_7__0 )? ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3280:1: ( ( ( rule__Role__Group_7__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3281:1: ( ( rule__Role__Group_7__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3281:1: ( ( rule__Role__Group_7__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3282:1: ( rule__Role__Group_7__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3283:1: ( rule__Role__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3283:2: rule__Role__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__0_in_rule__Role__Group__7__Impl6548);
                    rule__Role__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__7__Impl"


    // $ANTLR start "rule__Role__Group__8"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3293:1: rule__Role__Group__8 : rule__Role__Group__8__Impl ;
    public final void rule__Role__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3297:1: ( rule__Role__Group__8__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3298:2: rule__Role__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__8__Impl_in_rule__Role__Group__86579);
            rule__Role__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__8"


    // $ANTLR start "rule__Role__Group__8__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3304:1: rule__Role__Group__8__Impl : ( '}' ) ;
    public final void rule__Role__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3308:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3309:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3309:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3310:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Role__Group__8__Impl6607); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__8__Impl"


    // $ANTLR start "rule__Role__Group_7__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3341:1: rule__Role__Group_7__0 : rule__Role__Group_7__0__Impl rule__Role__Group_7__1 ;
    public final void rule__Role__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3345:1: ( rule__Role__Group_7__0__Impl rule__Role__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3346:2: rule__Role__Group_7__0__Impl rule__Role__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__0__Impl_in_rule__Role__Group_7__06656);
            rule__Role__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__1_in_rule__Role__Group_7__06659);
            rule__Role__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__0"


    // $ANTLR start "rule__Role__Group_7__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3353:1: rule__Role__Group_7__0__Impl : ( 'types' ) ;
    public final void rule__Role__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3357:1: ( ( 'types' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3358:1: ( 'types' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3358:1: ( 'types' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3359:1: 'types'
            {
             before(grammarAccess.getRoleAccess().getTypesKeyword_7_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Role__Group_7__0__Impl6687); 
             after(grammarAccess.getRoleAccess().getTypesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__0__Impl"


    // $ANTLR start "rule__Role__Group_7__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3372:1: rule__Role__Group_7__1 : rule__Role__Group_7__1__Impl rule__Role__Group_7__2 ;
    public final void rule__Role__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3376:1: ( rule__Role__Group_7__1__Impl rule__Role__Group_7__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3377:2: rule__Role__Group_7__1__Impl rule__Role__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__1__Impl_in_rule__Role__Group_7__16718);
            rule__Role__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__2_in_rule__Role__Group_7__16721);
            rule__Role__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__1"


    // $ANTLR start "rule__Role__Group_7__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3384:1: rule__Role__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Role__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3388:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3389:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3389:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3390:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Role__Group_7__1__Impl6749); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__1__Impl"


    // $ANTLR start "rule__Role__Group_7__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3403:1: rule__Role__Group_7__2 : rule__Role__Group_7__2__Impl rule__Role__Group_7__3 ;
    public final void rule__Role__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3407:1: ( rule__Role__Group_7__2__Impl rule__Role__Group_7__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3408:2: rule__Role__Group_7__2__Impl rule__Role__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__2__Impl_in_rule__Role__Group_7__26780);
            rule__Role__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__3_in_rule__Role__Group_7__26783);
            rule__Role__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__2"


    // $ANTLR start "rule__Role__Group_7__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3415:1: rule__Role__Group_7__2__Impl : ( ( rule__Role__TypesAssignment_7_2 ) ) ;
    public final void rule__Role__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3419:1: ( ( ( rule__Role__TypesAssignment_7_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3420:1: ( ( rule__Role__TypesAssignment_7_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3420:1: ( ( rule__Role__TypesAssignment_7_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3421:1: ( rule__Role__TypesAssignment_7_2 )
            {
             before(grammarAccess.getRoleAccess().getTypesAssignment_7_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3422:1: ( rule__Role__TypesAssignment_7_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3422:2: rule__Role__TypesAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__TypesAssignment_7_2_in_rule__Role__Group_7__2__Impl6810);
            rule__Role__TypesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getTypesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__2__Impl"


    // $ANTLR start "rule__Role__Group_7__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3432:1: rule__Role__Group_7__3 : rule__Role__Group_7__3__Impl rule__Role__Group_7__4 ;
    public final void rule__Role__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3436:1: ( rule__Role__Group_7__3__Impl rule__Role__Group_7__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3437:2: rule__Role__Group_7__3__Impl rule__Role__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__3__Impl_in_rule__Role__Group_7__36840);
            rule__Role__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__4_in_rule__Role__Group_7__36843);
            rule__Role__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__3"


    // $ANTLR start "rule__Role__Group_7__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3444:1: rule__Role__Group_7__3__Impl : ( ( rule__Role__Group_7_3__0 )* ) ;
    public final void rule__Role__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3448:1: ( ( ( rule__Role__Group_7_3__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3449:1: ( ( rule__Role__Group_7_3__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3449:1: ( ( rule__Role__Group_7_3__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3450:1: ( rule__Role__Group_7_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_7_3()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3451:1: ( rule__Role__Group_7_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3451:2: rule__Role__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__0_in_rule__Role__Group_7__3__Impl6870);
            	    rule__Role__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__3__Impl"


    // $ANTLR start "rule__Role__Group_7__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3461:1: rule__Role__Group_7__4 : rule__Role__Group_7__4__Impl ;
    public final void rule__Role__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3465:1: ( rule__Role__Group_7__4__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3466:2: rule__Role__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__4__Impl_in_rule__Role__Group_7__46901);
            rule__Role__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__4"


    // $ANTLR start "rule__Role__Group_7__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3472:1: rule__Role__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Role__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3476:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3477:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3477:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3478:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Role__Group_7__4__Impl6929); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__4__Impl"


    // $ANTLR start "rule__Role__Group_7_3__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3501:1: rule__Role__Group_7_3__0 : rule__Role__Group_7_3__0__Impl rule__Role__Group_7_3__1 ;
    public final void rule__Role__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3505:1: ( rule__Role__Group_7_3__0__Impl rule__Role__Group_7_3__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3506:2: rule__Role__Group_7_3__0__Impl rule__Role__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__0__Impl_in_rule__Role__Group_7_3__06970);
            rule__Role__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__1_in_rule__Role__Group_7_3__06973);
            rule__Role__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7_3__0"


    // $ANTLR start "rule__Role__Group_7_3__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3513:1: rule__Role__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3517:1: ( ( ',' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3518:1: ( ',' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3518:1: ( ',' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3519:1: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_7_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Role__Group_7_3__0__Impl7001); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7_3__0__Impl"


    // $ANTLR start "rule__Role__Group_7_3__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3532:1: rule__Role__Group_7_3__1 : rule__Role__Group_7_3__1__Impl ;
    public final void rule__Role__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3536:1: ( rule__Role__Group_7_3__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3537:2: rule__Role__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__1__Impl_in_rule__Role__Group_7_3__17032);
            rule__Role__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7_3__1"


    // $ANTLR start "rule__Role__Group_7_3__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3543:1: rule__Role__Group_7_3__1__Impl : ( ( rule__Role__TypesAssignment_7_3_1 ) ) ;
    public final void rule__Role__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3547:1: ( ( ( rule__Role__TypesAssignment_7_3_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3548:1: ( ( rule__Role__TypesAssignment_7_3_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3548:1: ( ( rule__Role__TypesAssignment_7_3_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3549:1: ( rule__Role__TypesAssignment_7_3_1 )
            {
             before(grammarAccess.getRoleAccess().getTypesAssignment_7_3_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3550:1: ( rule__Role__TypesAssignment_7_3_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3550:2: rule__Role__TypesAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__TypesAssignment_7_3_1_in_rule__Role__Group_7_3__1__Impl7059);
            rule__Role__TypesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getTypesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7_3__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3564:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3568:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3569:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__07093);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__1_in_rule__User__Group__07096);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3576:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3580:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3581:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3581:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3582:1: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3583:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3585:1: 
            {
            }

             after(grammarAccess.getUserAccess().getUserAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3595:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3599:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3600:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__17154);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__2_in_rule__User__Group__17157);
            rule__User__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3607:1: rule__User__Group__1__Impl : ( ( rule__User__DisabledAssignment_1 )? ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3611:1: ( ( ( rule__User__DisabledAssignment_1 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3612:1: ( ( rule__User__DisabledAssignment_1 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3612:1: ( ( rule__User__DisabledAssignment_1 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3613:1: ( rule__User__DisabledAssignment_1 )?
            {
             before(grammarAccess.getUserAccess().getDisabledAssignment_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3614:1: ( rule__User__DisabledAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==59) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3614:2: rule__User__DisabledAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__DisabledAssignment_1_in_rule__User__Group__1__Impl7184);
                    rule__User__DisabledAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getDisabledAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3624:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3628:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3629:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__27215);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__3_in_rule__User__Group__27218);
            rule__User__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3636:1: rule__User__Group__2__Impl : ( 'User' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3640:1: ( ( 'User' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3641:1: ( 'User' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3641:1: ( 'User' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3642:1: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_2()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__User__Group__2__Impl7246); 
             after(grammarAccess.getUserAccess().getUserKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__User__Group__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3655:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3659:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3660:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__37277);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__4_in_rule__User__Group__37280);
            rule__User__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3"


    // $ANTLR start "rule__User__Group__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3667:1: rule__User__Group__3__Impl : ( '{' ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3671:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3672:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3672:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3673:1: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__User__Group__3__Impl7308); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3__Impl"


    // $ANTLR start "rule__User__Group__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3686:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3690:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3691:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__47339);
            rule__User__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__5_in_rule__User__Group__47342);
            rule__User__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4"


    // $ANTLR start "rule__User__Group__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3698:1: rule__User__Group__4__Impl : ( 'Name' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3702:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3703:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3703:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3704:1: 'Name'
            {
             before(grammarAccess.getUserAccess().getNameKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__User__Group__4__Impl7370); 
             after(grammarAccess.getUserAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4__Impl"


    // $ANTLR start "rule__User__Group__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3717:1: rule__User__Group__5 : rule__User__Group__5__Impl rule__User__Group__6 ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3721:1: ( rule__User__Group__5__Impl rule__User__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3722:2: rule__User__Group__5__Impl rule__User__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__5__Impl_in_rule__User__Group__57401);
            rule__User__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__6_in_rule__User__Group__57404);
            rule__User__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5"


    // $ANTLR start "rule__User__Group__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3729:1: rule__User__Group__5__Impl : ( '=' ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3733:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3734:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3734:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3735:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_5()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group__5__Impl7432); 
             after(grammarAccess.getUserAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5__Impl"


    // $ANTLR start "rule__User__Group__6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3748:1: rule__User__Group__6 : rule__User__Group__6__Impl rule__User__Group__7 ;
    public final void rule__User__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3752:1: ( rule__User__Group__6__Impl rule__User__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3753:2: rule__User__Group__6__Impl rule__User__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__6__Impl_in_rule__User__Group__67463);
            rule__User__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__7_in_rule__User__Group__67466);
            rule__User__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__6"


    // $ANTLR start "rule__User__Group__6__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3760:1: rule__User__Group__6__Impl : ( ( rule__User__NameAssignment_6 ) ) ;
    public final void rule__User__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3764:1: ( ( ( rule__User__NameAssignment_6 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3765:1: ( ( rule__User__NameAssignment_6 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3765:1: ( ( rule__User__NameAssignment_6 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3766:1: ( rule__User__NameAssignment_6 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3767:1: ( rule__User__NameAssignment_6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3767:2: rule__User__NameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__NameAssignment_6_in_rule__User__Group__6__Impl7493);
            rule__User__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__6__Impl"


    // $ANTLR start "rule__User__Group__7"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3777:1: rule__User__Group__7 : rule__User__Group__7__Impl rule__User__Group__8 ;
    public final void rule__User__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3781:1: ( rule__User__Group__7__Impl rule__User__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3782:2: rule__User__Group__7__Impl rule__User__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__7__Impl_in_rule__User__Group__77523);
            rule__User__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__8_in_rule__User__Group__77526);
            rule__User__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__7"


    // $ANTLR start "rule__User__Group__7__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3789:1: rule__User__Group__7__Impl : ( ( rule__User__Group_7__0 )? ) ;
    public final void rule__User__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3793:1: ( ( ( rule__User__Group_7__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3794:1: ( ( rule__User__Group_7__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3794:1: ( ( rule__User__Group_7__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3795:1: ( rule__User__Group_7__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3796:1: ( rule__User__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3796:2: rule__User__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__0_in_rule__User__Group__7__Impl7553);
                    rule__User__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__7__Impl"


    // $ANTLR start "rule__User__Group__8"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3806:1: rule__User__Group__8 : rule__User__Group__8__Impl rule__User__Group__9 ;
    public final void rule__User__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3810:1: ( rule__User__Group__8__Impl rule__User__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3811:2: rule__User__Group__8__Impl rule__User__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__8__Impl_in_rule__User__Group__87584);
            rule__User__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__9_in_rule__User__Group__87587);
            rule__User__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__8"


    // $ANTLR start "rule__User__Group__8__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3818:1: rule__User__Group__8__Impl : ( ( rule__User__Group_8__0 )? ) ;
    public final void rule__User__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3822:1: ( ( ( rule__User__Group_8__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3823:1: ( ( rule__User__Group_8__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3823:1: ( ( rule__User__Group_8__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3824:1: ( rule__User__Group_8__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_8()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3825:1: ( rule__User__Group_8__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3825:2: rule__User__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__0_in_rule__User__Group__8__Impl7614);
                    rule__User__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__8__Impl"


    // $ANTLR start "rule__User__Group__9"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3835:1: rule__User__Group__9 : rule__User__Group__9__Impl rule__User__Group__10 ;
    public final void rule__User__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3839:1: ( rule__User__Group__9__Impl rule__User__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3840:2: rule__User__Group__9__Impl rule__User__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__9__Impl_in_rule__User__Group__97645);
            rule__User__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__10_in_rule__User__Group__97648);
            rule__User__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__9"


    // $ANTLR start "rule__User__Group__9__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3847:1: rule__User__Group__9__Impl : ( ( rule__User__Group_9__0 )? ) ;
    public final void rule__User__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3851:1: ( ( ( rule__User__Group_9__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3852:1: ( ( rule__User__Group_9__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3852:1: ( ( rule__User__Group_9__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3853:1: ( rule__User__Group_9__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_9()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3854:1: ( rule__User__Group_9__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3854:2: rule__User__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__0_in_rule__User__Group__9__Impl7675);
                    rule__User__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__9__Impl"


    // $ANTLR start "rule__User__Group__10"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3864:1: rule__User__Group__10 : rule__User__Group__10__Impl rule__User__Group__11 ;
    public final void rule__User__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3868:1: ( rule__User__Group__10__Impl rule__User__Group__11 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3869:2: rule__User__Group__10__Impl rule__User__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__10__Impl_in_rule__User__Group__107706);
            rule__User__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__11_in_rule__User__Group__107709);
            rule__User__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__10"


    // $ANTLR start "rule__User__Group__10__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3876:1: rule__User__Group__10__Impl : ( ( rule__User__Group_10__0 )? ) ;
    public final void rule__User__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3880:1: ( ( ( rule__User__Group_10__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3881:1: ( ( rule__User__Group_10__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3881:1: ( ( rule__User__Group_10__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3882:1: ( rule__User__Group_10__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_10()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3883:1: ( rule__User__Group_10__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3883:2: rule__User__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__0_in_rule__User__Group__10__Impl7736);
                    rule__User__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__10__Impl"


    // $ANTLR start "rule__User__Group__11"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3893:1: rule__User__Group__11 : rule__User__Group__11__Impl rule__User__Group__12 ;
    public final void rule__User__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3897:1: ( rule__User__Group__11__Impl rule__User__Group__12 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3898:2: rule__User__Group__11__Impl rule__User__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__11__Impl_in_rule__User__Group__117767);
            rule__User__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__12_in_rule__User__Group__117770);
            rule__User__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__11"


    // $ANTLR start "rule__User__Group__11__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3905:1: rule__User__Group__11__Impl : ( ( rule__User__Group_11__0 )? ) ;
    public final void rule__User__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3909:1: ( ( ( rule__User__Group_11__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3910:1: ( ( rule__User__Group_11__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3910:1: ( ( rule__User__Group_11__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3911:1: ( rule__User__Group_11__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_11()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3912:1: ( rule__User__Group_11__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3912:2: rule__User__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__0_in_rule__User__Group__11__Impl7797);
                    rule__User__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__11__Impl"


    // $ANTLR start "rule__User__Group__12"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3922:1: rule__User__Group__12 : rule__User__Group__12__Impl rule__User__Group__13 ;
    public final void rule__User__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3926:1: ( rule__User__Group__12__Impl rule__User__Group__13 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3927:2: rule__User__Group__12__Impl rule__User__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__12__Impl_in_rule__User__Group__127828);
            rule__User__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__13_in_rule__User__Group__127831);
            rule__User__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__12"


    // $ANTLR start "rule__User__Group__12__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3934:1: rule__User__Group__12__Impl : ( ( rule__User__Group_12__0 )? ) ;
    public final void rule__User__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3938:1: ( ( ( rule__User__Group_12__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3939:1: ( ( rule__User__Group_12__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3939:1: ( ( rule__User__Group_12__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3940:1: ( rule__User__Group_12__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_12()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3941:1: ( rule__User__Group_12__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==51) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3941:2: rule__User__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__0_in_rule__User__Group__12__Impl7858);
                    rule__User__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__12__Impl"


    // $ANTLR start "rule__User__Group__13"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3951:1: rule__User__Group__13 : rule__User__Group__13__Impl ;
    public final void rule__User__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3955:1: ( rule__User__Group__13__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3956:2: rule__User__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__13__Impl_in_rule__User__Group__137889);
            rule__User__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__13"


    // $ANTLR start "rule__User__Group__13__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3962:1: rule__User__Group__13__Impl : ( '}' ) ;
    public final void rule__User__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3966:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3967:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3967:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3968:1: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_13()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__User__Group__13__Impl7917); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__13__Impl"


    // $ANTLR start "rule__User__Group_7__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4009:1: rule__User__Group_7__0 : rule__User__Group_7__0__Impl rule__User__Group_7__1 ;
    public final void rule__User__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4013:1: ( rule__User__Group_7__0__Impl rule__User__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4014:2: rule__User__Group_7__0__Impl rule__User__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__0__Impl_in_rule__User__Group_7__07976);
            rule__User__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__1_in_rule__User__Group_7__07979);
            rule__User__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_7__0"


    // $ANTLR start "rule__User__Group_7__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4021:1: rule__User__Group_7__0__Impl : ( 'firstname' ) ;
    public final void rule__User__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4025:1: ( ( 'firstname' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4026:1: ( 'firstname' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4026:1: ( 'firstname' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4027:1: 'firstname'
            {
             before(grammarAccess.getUserAccess().getFirstnameKeyword_7_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__User__Group_7__0__Impl8007); 
             after(grammarAccess.getUserAccess().getFirstnameKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_7__0__Impl"


    // $ANTLR start "rule__User__Group_7__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4040:1: rule__User__Group_7__1 : rule__User__Group_7__1__Impl ;
    public final void rule__User__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4044:1: ( rule__User__Group_7__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4045:2: rule__User__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__1__Impl_in_rule__User__Group_7__18038);
            rule__User__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_7__1"


    // $ANTLR start "rule__User__Group_7__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4051:1: rule__User__Group_7__1__Impl : ( ( rule__User__FirstnameAssignment_7_1 ) ) ;
    public final void rule__User__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4055:1: ( ( ( rule__User__FirstnameAssignment_7_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4056:1: ( ( rule__User__FirstnameAssignment_7_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4056:1: ( ( rule__User__FirstnameAssignment_7_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4057:1: ( rule__User__FirstnameAssignment_7_1 )
            {
             before(grammarAccess.getUserAccess().getFirstnameAssignment_7_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4058:1: ( rule__User__FirstnameAssignment_7_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4058:2: rule__User__FirstnameAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__FirstnameAssignment_7_1_in_rule__User__Group_7__1__Impl8065);
            rule__User__FirstnameAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getFirstnameAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_7__1__Impl"


    // $ANTLR start "rule__User__Group_8__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4072:1: rule__User__Group_8__0 : rule__User__Group_8__0__Impl rule__User__Group_8__1 ;
    public final void rule__User__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4076:1: ( rule__User__Group_8__0__Impl rule__User__Group_8__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4077:2: rule__User__Group_8__0__Impl rule__User__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__0__Impl_in_rule__User__Group_8__08099);
            rule__User__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__1_in_rule__User__Group_8__08102);
            rule__User__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_8__0"


    // $ANTLR start "rule__User__Group_8__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4084:1: rule__User__Group_8__0__Impl : ( 'lastname' ) ;
    public final void rule__User__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4088:1: ( ( 'lastname' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4089:1: ( 'lastname' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4089:1: ( 'lastname' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4090:1: 'lastname'
            {
             before(grammarAccess.getUserAccess().getLastnameKeyword_8_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__User__Group_8__0__Impl8130); 
             after(grammarAccess.getUserAccess().getLastnameKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_8__0__Impl"


    // $ANTLR start "rule__User__Group_8__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4103:1: rule__User__Group_8__1 : rule__User__Group_8__1__Impl ;
    public final void rule__User__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4107:1: ( rule__User__Group_8__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4108:2: rule__User__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__1__Impl_in_rule__User__Group_8__18161);
            rule__User__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_8__1"


    // $ANTLR start "rule__User__Group_8__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4114:1: rule__User__Group_8__1__Impl : ( ( rule__User__LastnameAssignment_8_1 ) ) ;
    public final void rule__User__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4118:1: ( ( ( rule__User__LastnameAssignment_8_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4119:1: ( ( rule__User__LastnameAssignment_8_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4119:1: ( ( rule__User__LastnameAssignment_8_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4120:1: ( rule__User__LastnameAssignment_8_1 )
            {
             before(grammarAccess.getUserAccess().getLastnameAssignment_8_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4121:1: ( rule__User__LastnameAssignment_8_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4121:2: rule__User__LastnameAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__LastnameAssignment_8_1_in_rule__User__Group_8__1__Impl8188);
            rule__User__LastnameAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getLastnameAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_8__1__Impl"


    // $ANTLR start "rule__User__Group_9__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4135:1: rule__User__Group_9__0 : rule__User__Group_9__0__Impl rule__User__Group_9__1 ;
    public final void rule__User__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4139:1: ( rule__User__Group_9__0__Impl rule__User__Group_9__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4140:2: rule__User__Group_9__0__Impl rule__User__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__0__Impl_in_rule__User__Group_9__08222);
            rule__User__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__1_in_rule__User__Group_9__08225);
            rule__User__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_9__0"


    // $ANTLR start "rule__User__Group_9__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4147:1: rule__User__Group_9__0__Impl : ( 'login' ) ;
    public final void rule__User__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4151:1: ( ( 'login' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4152:1: ( 'login' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4152:1: ( 'login' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4153:1: 'login'
            {
             before(grammarAccess.getUserAccess().getLoginKeyword_9_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__User__Group_9__0__Impl8253); 
             after(grammarAccess.getUserAccess().getLoginKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_9__0__Impl"


    // $ANTLR start "rule__User__Group_9__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4166:1: rule__User__Group_9__1 : rule__User__Group_9__1__Impl ;
    public final void rule__User__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4170:1: ( rule__User__Group_9__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4171:2: rule__User__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__1__Impl_in_rule__User__Group_9__18284);
            rule__User__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_9__1"


    // $ANTLR start "rule__User__Group_9__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4177:1: rule__User__Group_9__1__Impl : ( ( rule__User__LoginAssignment_9_1 ) ) ;
    public final void rule__User__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4181:1: ( ( ( rule__User__LoginAssignment_9_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4182:1: ( ( rule__User__LoginAssignment_9_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4182:1: ( ( rule__User__LoginAssignment_9_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4183:1: ( rule__User__LoginAssignment_9_1 )
            {
             before(grammarAccess.getUserAccess().getLoginAssignment_9_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4184:1: ( rule__User__LoginAssignment_9_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4184:2: rule__User__LoginAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__LoginAssignment_9_1_in_rule__User__Group_9__1__Impl8311);
            rule__User__LoginAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getLoginAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_9__1__Impl"


    // $ANTLR start "rule__User__Group_10__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4198:1: rule__User__Group_10__0 : rule__User__Group_10__0__Impl rule__User__Group_10__1 ;
    public final void rule__User__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4202:1: ( rule__User__Group_10__0__Impl rule__User__Group_10__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4203:2: rule__User__Group_10__0__Impl rule__User__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__0__Impl_in_rule__User__Group_10__08345);
            rule__User__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__1_in_rule__User__Group_10__08348);
            rule__User__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_10__0"


    // $ANTLR start "rule__User__Group_10__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4210:1: rule__User__Group_10__0__Impl : ( 'password' ) ;
    public final void rule__User__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4214:1: ( ( 'password' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4215:1: ( 'password' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4215:1: ( 'password' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4216:1: 'password'
            {
             before(grammarAccess.getUserAccess().getPasswordKeyword_10_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__User__Group_10__0__Impl8376); 
             after(grammarAccess.getUserAccess().getPasswordKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_10__0__Impl"


    // $ANTLR start "rule__User__Group_10__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4229:1: rule__User__Group_10__1 : rule__User__Group_10__1__Impl ;
    public final void rule__User__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4233:1: ( rule__User__Group_10__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4234:2: rule__User__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__1__Impl_in_rule__User__Group_10__18407);
            rule__User__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_10__1"


    // $ANTLR start "rule__User__Group_10__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4240:1: rule__User__Group_10__1__Impl : ( ( rule__User__PasswordAssignment_10_1 ) ) ;
    public final void rule__User__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4244:1: ( ( ( rule__User__PasswordAssignment_10_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4245:1: ( ( rule__User__PasswordAssignment_10_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4245:1: ( ( rule__User__PasswordAssignment_10_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4246:1: ( rule__User__PasswordAssignment_10_1 )
            {
             before(grammarAccess.getUserAccess().getPasswordAssignment_10_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4247:1: ( rule__User__PasswordAssignment_10_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4247:2: rule__User__PasswordAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__PasswordAssignment_10_1_in_rule__User__Group_10__1__Impl8434);
            rule__User__PasswordAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getPasswordAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_10__1__Impl"


    // $ANTLR start "rule__User__Group_11__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4261:1: rule__User__Group_11__0 : rule__User__Group_11__0__Impl rule__User__Group_11__1 ;
    public final void rule__User__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4265:1: ( rule__User__Group_11__0__Impl rule__User__Group_11__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4266:2: rule__User__Group_11__0__Impl rule__User__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__0__Impl_in_rule__User__Group_11__08468);
            rule__User__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__1_in_rule__User__Group_11__08471);
            rule__User__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_11__0"


    // $ANTLR start "rule__User__Group_11__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4273:1: rule__User__Group_11__0__Impl : ( 'email' ) ;
    public final void rule__User__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4277:1: ( ( 'email' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4278:1: ( 'email' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4278:1: ( 'email' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4279:1: 'email'
            {
             before(grammarAccess.getUserAccess().getEmailKeyword_11_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__User__Group_11__0__Impl8499); 
             after(grammarAccess.getUserAccess().getEmailKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_11__0__Impl"


    // $ANTLR start "rule__User__Group_11__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4292:1: rule__User__Group_11__1 : rule__User__Group_11__1__Impl ;
    public final void rule__User__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4296:1: ( rule__User__Group_11__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4297:2: rule__User__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__1__Impl_in_rule__User__Group_11__18530);
            rule__User__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_11__1"


    // $ANTLR start "rule__User__Group_11__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4303:1: rule__User__Group_11__1__Impl : ( ( rule__User__EmailAssignment_11_1 ) ) ;
    public final void rule__User__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4307:1: ( ( ( rule__User__EmailAssignment_11_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4308:1: ( ( rule__User__EmailAssignment_11_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4308:1: ( ( rule__User__EmailAssignment_11_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4309:1: ( rule__User__EmailAssignment_11_1 )
            {
             before(grammarAccess.getUserAccess().getEmailAssignment_11_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4310:1: ( rule__User__EmailAssignment_11_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4310:2: rule__User__EmailAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__EmailAssignment_11_1_in_rule__User__Group_11__1__Impl8557);
            rule__User__EmailAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getEmailAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_11__1__Impl"


    // $ANTLR start "rule__User__Group_12__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4324:1: rule__User__Group_12__0 : rule__User__Group_12__0__Impl rule__User__Group_12__1 ;
    public final void rule__User__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4328:1: ( rule__User__Group_12__0__Impl rule__User__Group_12__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4329:2: rule__User__Group_12__0__Impl rule__User__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__0__Impl_in_rule__User__Group_12__08591);
            rule__User__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__1_in_rule__User__Group_12__08594);
            rule__User__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_12__0"


    // $ANTLR start "rule__User__Group_12__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4336:1: rule__User__Group_12__0__Impl : ( 'hasRole' ) ;
    public final void rule__User__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4340:1: ( ( 'hasRole' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4341:1: ( 'hasRole' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4341:1: ( 'hasRole' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4342:1: 'hasRole'
            {
             before(grammarAccess.getUserAccess().getHasRoleKeyword_12_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__User__Group_12__0__Impl8622); 
             after(grammarAccess.getUserAccess().getHasRoleKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_12__0__Impl"


    // $ANTLR start "rule__User__Group_12__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4355:1: rule__User__Group_12__1 : rule__User__Group_12__1__Impl ;
    public final void rule__User__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4359:1: ( rule__User__Group_12__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4360:2: rule__User__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__1__Impl_in_rule__User__Group_12__18653);
            rule__User__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_12__1"


    // $ANTLR start "rule__User__Group_12__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4366:1: rule__User__Group_12__1__Impl : ( ( rule__User__HasRoleAssignment_12_1 ) ) ;
    public final void rule__User__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4370:1: ( ( ( rule__User__HasRoleAssignment_12_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4371:1: ( ( rule__User__HasRoleAssignment_12_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4371:1: ( ( rule__User__HasRoleAssignment_12_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4372:1: ( rule__User__HasRoleAssignment_12_1 )
            {
             before(grammarAccess.getUserAccess().getHasRoleAssignment_12_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4373:1: ( rule__User__HasRoleAssignment_12_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4373:2: rule__User__HasRoleAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__HasRoleAssignment_12_1_in_rule__User__Group_12__1__Impl8680);
            rule__User__HasRoleAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getHasRoleAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_12__1__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4387:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4391:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4392:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__08714);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1_in_rule__Version__Group__08717);
            rule__Version__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4399:1: rule__Version__Group__0__Impl : ( () ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4403:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4404:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4404:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4405:1: ()
            {
             before(grammarAccess.getVersionAccess().getVersionAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4406:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4408:1: 
            {
            }

             after(grammarAccess.getVersionAccess().getVersionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4418:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4422:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4423:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__18775);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__2_in_rule__Version__Group__18778);
            rule__Version__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4430:1: rule__Version__Group__1__Impl : ( 'Version' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4434:1: ( ( 'Version' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4435:1: ( 'Version' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4435:1: ( 'Version' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4436:1: 'Version'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Version__Group__1__Impl8806); 
             after(grammarAccess.getVersionAccess().getVersionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4449:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4453:1: ( rule__Version__Group__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4454:2: rule__Version__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__28837);
            rule__Version__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4460:1: rule__Version__Group__2__Impl : ( ( rule__Version__NameAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4464:1: ( ( ( rule__Version__NameAssignment_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4465:1: ( ( rule__Version__NameAssignment_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4465:1: ( ( rule__Version__NameAssignment_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4466:1: ( rule__Version__NameAssignment_2 )
            {
             before(grammarAccess.getVersionAccess().getNameAssignment_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4467:1: ( rule__Version__NameAssignment_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4467:2: rule__Version__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__NameAssignment_2_in_rule__Version__Group__2__Impl8864);
            rule__Version__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__CMS__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4483:1: rule__CMS__Group__0 : rule__CMS__Group__0__Impl rule__CMS__Group__1 ;
    public final void rule__CMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4487:1: ( rule__CMS__Group__0__Impl rule__CMS__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4488:2: rule__CMS__Group__0__Impl rule__CMS__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__0__Impl_in_rule__CMS__Group__08900);
            rule__CMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__1_in_rule__CMS__Group__08903);
            rule__CMS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__0"


    // $ANTLR start "rule__CMS__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4495:1: rule__CMS__Group__0__Impl : ( () ) ;
    public final void rule__CMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4499:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4500:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4500:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4501:1: ()
            {
             before(grammarAccess.getCMSAccess().getCMSAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4502:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4504:1: 
            {
            }

             after(grammarAccess.getCMSAccess().getCMSAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__0__Impl"


    // $ANTLR start "rule__CMS__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4514:1: rule__CMS__Group__1 : rule__CMS__Group__1__Impl rule__CMS__Group__2 ;
    public final void rule__CMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4518:1: ( rule__CMS__Group__1__Impl rule__CMS__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4519:2: rule__CMS__Group__1__Impl rule__CMS__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__1__Impl_in_rule__CMS__Group__18961);
            rule__CMS__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__2_in_rule__CMS__Group__18964);
            rule__CMS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__1"


    // $ANTLR start "rule__CMS__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4526:1: rule__CMS__Group__1__Impl : ( 'CMS' ) ;
    public final void rule__CMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4530:1: ( ( 'CMS' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4531:1: ( 'CMS' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4531:1: ( 'CMS' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4532:1: 'CMS'
            {
             before(grammarAccess.getCMSAccess().getCMSKeyword_1()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__CMS__Group__1__Impl8992); 
             after(grammarAccess.getCMSAccess().getCMSKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__1__Impl"


    // $ANTLR start "rule__CMS__Group__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4545:1: rule__CMS__Group__2 : rule__CMS__Group__2__Impl rule__CMS__Group__3 ;
    public final void rule__CMS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4549:1: ( rule__CMS__Group__2__Impl rule__CMS__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4550:2: rule__CMS__Group__2__Impl rule__CMS__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__2__Impl_in_rule__CMS__Group__29023);
            rule__CMS__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__3_in_rule__CMS__Group__29026);
            rule__CMS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__2"


    // $ANTLR start "rule__CMS__Group__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4557:1: rule__CMS__Group__2__Impl : ( '{' ) ;
    public final void rule__CMS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4561:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4562:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4562:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4563:1: '{'
            {
             before(grammarAccess.getCMSAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__CMS__Group__2__Impl9054); 
             after(grammarAccess.getCMSAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__2__Impl"


    // $ANTLR start "rule__CMS__Group__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4576:1: rule__CMS__Group__3 : rule__CMS__Group__3__Impl rule__CMS__Group__4 ;
    public final void rule__CMS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4580:1: ( rule__CMS__Group__3__Impl rule__CMS__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4581:2: rule__CMS__Group__3__Impl rule__CMS__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__3__Impl_in_rule__CMS__Group__39085);
            rule__CMS__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__4_in_rule__CMS__Group__39088);
            rule__CMS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__3"


    // $ANTLR start "rule__CMS__Group__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4588:1: rule__CMS__Group__3__Impl : ( 'Name' ) ;
    public final void rule__CMS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4592:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4593:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4593:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4594:1: 'Name'
            {
             before(grammarAccess.getCMSAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CMS__Group__3__Impl9116); 
             after(grammarAccess.getCMSAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__3__Impl"


    // $ANTLR start "rule__CMS__Group__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4607:1: rule__CMS__Group__4 : rule__CMS__Group__4__Impl rule__CMS__Group__5 ;
    public final void rule__CMS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4611:1: ( rule__CMS__Group__4__Impl rule__CMS__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4612:2: rule__CMS__Group__4__Impl rule__CMS__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__4__Impl_in_rule__CMS__Group__49147);
            rule__CMS__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__5_in_rule__CMS__Group__49150);
            rule__CMS__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__4"


    // $ANTLR start "rule__CMS__Group__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4619:1: rule__CMS__Group__4__Impl : ( '=' ) ;
    public final void rule__CMS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4623:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4624:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4624:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4625:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group__4__Impl9178); 
             after(grammarAccess.getCMSAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__4__Impl"


    // $ANTLR start "rule__CMS__Group__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4638:1: rule__CMS__Group__5 : rule__CMS__Group__5__Impl rule__CMS__Group__6 ;
    public final void rule__CMS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4642:1: ( rule__CMS__Group__5__Impl rule__CMS__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4643:2: rule__CMS__Group__5__Impl rule__CMS__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__5__Impl_in_rule__CMS__Group__59209);
            rule__CMS__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__6_in_rule__CMS__Group__59212);
            rule__CMS__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__5"


    // $ANTLR start "rule__CMS__Group__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4650:1: rule__CMS__Group__5__Impl : ( ( rule__CMS__NameAssignment_5 ) ) ;
    public final void rule__CMS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4654:1: ( ( ( rule__CMS__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4655:1: ( ( rule__CMS__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4655:1: ( ( rule__CMS__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4656:1: ( rule__CMS__NameAssignment_5 )
            {
             before(grammarAccess.getCMSAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4657:1: ( rule__CMS__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4657:2: rule__CMS__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__NameAssignment_5_in_rule__CMS__Group__5__Impl9239);
            rule__CMS__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__5__Impl"


    // $ANTLR start "rule__CMS__Group__6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4667:1: rule__CMS__Group__6 : rule__CMS__Group__6__Impl rule__CMS__Group__7 ;
    public final void rule__CMS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4671:1: ( rule__CMS__Group__6__Impl rule__CMS__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4672:2: rule__CMS__Group__6__Impl rule__CMS__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__6__Impl_in_rule__CMS__Group__69269);
            rule__CMS__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__7_in_rule__CMS__Group__69272);
            rule__CMS__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__6"


    // $ANTLR start "rule__CMS__Group__6__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4679:1: rule__CMS__Group__6__Impl : ( ( rule__CMS__Group_6__0 ) ) ;
    public final void rule__CMS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4683:1: ( ( ( rule__CMS__Group_6__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4684:1: ( ( rule__CMS__Group_6__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4684:1: ( ( rule__CMS__Group_6__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4685:1: ( rule__CMS__Group_6__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4686:1: ( rule__CMS__Group_6__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4686:2: rule__CMS__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__0_in_rule__CMS__Group__6__Impl9299);
            rule__CMS__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__6__Impl"


    // $ANTLR start "rule__CMS__Group__7"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4696:1: rule__CMS__Group__7 : rule__CMS__Group__7__Impl rule__CMS__Group__8 ;
    public final void rule__CMS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4700:1: ( rule__CMS__Group__7__Impl rule__CMS__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4701:2: rule__CMS__Group__7__Impl rule__CMS__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__7__Impl_in_rule__CMS__Group__79329);
            rule__CMS__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__8_in_rule__CMS__Group__79332);
            rule__CMS__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__7"


    // $ANTLR start "rule__CMS__Group__7__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4708:1: rule__CMS__Group__7__Impl : ( ( rule__CMS__Group_7__0 ) ) ;
    public final void rule__CMS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4712:1: ( ( ( rule__CMS__Group_7__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4713:1: ( ( rule__CMS__Group_7__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4713:1: ( ( rule__CMS__Group_7__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4714:1: ( rule__CMS__Group_7__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4715:1: ( rule__CMS__Group_7__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4715:2: rule__CMS__Group_7__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__0_in_rule__CMS__Group__7__Impl9359);
            rule__CMS__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__7__Impl"


    // $ANTLR start "rule__CMS__Group__8"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4725:1: rule__CMS__Group__8 : rule__CMS__Group__8__Impl rule__CMS__Group__9 ;
    public final void rule__CMS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4729:1: ( rule__CMS__Group__8__Impl rule__CMS__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4730:2: rule__CMS__Group__8__Impl rule__CMS__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__8__Impl_in_rule__CMS__Group__89389);
            rule__CMS__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__9_in_rule__CMS__Group__89392);
            rule__CMS__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__8"


    // $ANTLR start "rule__CMS__Group__8__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4737:1: rule__CMS__Group__8__Impl : ( ( rule__CMS__Group_8__0 ) ) ;
    public final void rule__CMS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4741:1: ( ( ( rule__CMS__Group_8__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4742:1: ( ( rule__CMS__Group_8__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4742:1: ( ( rule__CMS__Group_8__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4743:1: ( rule__CMS__Group_8__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_8()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4744:1: ( rule__CMS__Group_8__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4744:2: rule__CMS__Group_8__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__0_in_rule__CMS__Group__8__Impl9419);
            rule__CMS__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__8__Impl"


    // $ANTLR start "rule__CMS__Group__9"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4754:1: rule__CMS__Group__9 : rule__CMS__Group__9__Impl rule__CMS__Group__10 ;
    public final void rule__CMS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4758:1: ( rule__CMS__Group__9__Impl rule__CMS__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4759:2: rule__CMS__Group__9__Impl rule__CMS__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__9__Impl_in_rule__CMS__Group__99449);
            rule__CMS__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__10_in_rule__CMS__Group__99452);
            rule__CMS__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__9"


    // $ANTLR start "rule__CMS__Group__9__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4766:1: rule__CMS__Group__9__Impl : ( ( rule__CMS__Group_9__0 ) ) ;
    public final void rule__CMS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4770:1: ( ( ( rule__CMS__Group_9__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4771:1: ( ( rule__CMS__Group_9__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4771:1: ( ( rule__CMS__Group_9__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4772:1: ( rule__CMS__Group_9__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_9()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4773:1: ( rule__CMS__Group_9__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4773:2: rule__CMS__Group_9__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__0_in_rule__CMS__Group__9__Impl9479);
            rule__CMS__Group_9__0();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__9__Impl"


    // $ANTLR start "rule__CMS__Group__10"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4783:1: rule__CMS__Group__10 : rule__CMS__Group__10__Impl ;
    public final void rule__CMS__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4787:1: ( rule__CMS__Group__10__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4788:2: rule__CMS__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__10__Impl_in_rule__CMS__Group__109509);
            rule__CMS__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__10"


    // $ANTLR start "rule__CMS__Group__10__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4794:1: rule__CMS__Group__10__Impl : ( '}' ) ;
    public final void rule__CMS__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4798:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4799:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4799:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4800:1: '}'
            {
             before(grammarAccess.getCMSAccess().getRightCurlyBracketKeyword_10()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__CMS__Group__10__Impl9537); 
             after(grammarAccess.getCMSAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group__10__Impl"


    // $ANTLR start "rule__CMS__Group_6__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4835:1: rule__CMS__Group_6__0 : rule__CMS__Group_6__0__Impl rule__CMS__Group_6__1 ;
    public final void rule__CMS__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4839:1: ( rule__CMS__Group_6__0__Impl rule__CMS__Group_6__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4840:2: rule__CMS__Group_6__0__Impl rule__CMS__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__0__Impl_in_rule__CMS__Group_6__09590);
            rule__CMS__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__1_in_rule__CMS__Group_6__09593);
            rule__CMS__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_6__0"


    // $ANTLR start "rule__CMS__Group_6__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4847:1: rule__CMS__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__CMS__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4851:1: ( ( 'type' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4852:1: ( 'type' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4852:1: ( 'type' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4853:1: 'type'
            {
             before(grammarAccess.getCMSAccess().getTypeKeyword_6_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__CMS__Group_6__0__Impl9621); 
             after(grammarAccess.getCMSAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_6__0__Impl"


    // $ANTLR start "rule__CMS__Group_6__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4866:1: rule__CMS__Group_6__1 : rule__CMS__Group_6__1__Impl ;
    public final void rule__CMS__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4870:1: ( rule__CMS__Group_6__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4871:2: rule__CMS__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__1__Impl_in_rule__CMS__Group_6__19652);
            rule__CMS__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_6__1"


    // $ANTLR start "rule__CMS__Group_6__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4877:1: rule__CMS__Group_6__1__Impl : ( ( rule__CMS__TypeAssignment_6_1 ) ) ;
    public final void rule__CMS__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4881:1: ( ( ( rule__CMS__TypeAssignment_6_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4882:1: ( ( rule__CMS__TypeAssignment_6_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4882:1: ( ( rule__CMS__TypeAssignment_6_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4883:1: ( rule__CMS__TypeAssignment_6_1 )
            {
             before(grammarAccess.getCMSAccess().getTypeAssignment_6_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4884:1: ( rule__CMS__TypeAssignment_6_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4884:2: rule__CMS__TypeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__TypeAssignment_6_1_in_rule__CMS__Group_6__1__Impl9679);
            rule__CMS__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_6__1__Impl"


    // $ANTLR start "rule__CMS__Group_7__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4898:1: rule__CMS__Group_7__0 : rule__CMS__Group_7__0__Impl rule__CMS__Group_7__1 ;
    public final void rule__CMS__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4902:1: ( rule__CMS__Group_7__0__Impl rule__CMS__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4903:2: rule__CMS__Group_7__0__Impl rule__CMS__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__0__Impl_in_rule__CMS__Group_7__09713);
            rule__CMS__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__1_in_rule__CMS__Group_7__09716);
            rule__CMS__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_7__0"


    // $ANTLR start "rule__CMS__Group_7__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4910:1: rule__CMS__Group_7__0__Impl : ( 'address_url' ) ;
    public final void rule__CMS__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4914:1: ( ( 'address_url' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4915:1: ( 'address_url' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4915:1: ( 'address_url' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4916:1: 'address_url'
            {
             before(grammarAccess.getCMSAccess().getAddress_urlKeyword_7_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__CMS__Group_7__0__Impl9744); 
             after(grammarAccess.getCMSAccess().getAddress_urlKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_7__0__Impl"


    // $ANTLR start "rule__CMS__Group_7__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4929:1: rule__CMS__Group_7__1 : rule__CMS__Group_7__1__Impl ;
    public final void rule__CMS__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4933:1: ( rule__CMS__Group_7__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4934:2: rule__CMS__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__1__Impl_in_rule__CMS__Group_7__19775);
            rule__CMS__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_7__1"


    // $ANTLR start "rule__CMS__Group_7__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4940:1: rule__CMS__Group_7__1__Impl : ( ( rule__CMS__Address_urlAssignment_7_1 ) ) ;
    public final void rule__CMS__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4944:1: ( ( ( rule__CMS__Address_urlAssignment_7_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4945:1: ( ( rule__CMS__Address_urlAssignment_7_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4945:1: ( ( rule__CMS__Address_urlAssignment_7_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4946:1: ( rule__CMS__Address_urlAssignment_7_1 )
            {
             before(grammarAccess.getCMSAccess().getAddress_urlAssignment_7_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4947:1: ( rule__CMS__Address_urlAssignment_7_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4947:2: rule__CMS__Address_urlAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Address_urlAssignment_7_1_in_rule__CMS__Group_7__1__Impl9802);
            rule__CMS__Address_urlAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getAddress_urlAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_7__1__Impl"


    // $ANTLR start "rule__CMS__Group_8__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4961:1: rule__CMS__Group_8__0 : rule__CMS__Group_8__0__Impl rule__CMS__Group_8__1 ;
    public final void rule__CMS__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4965:1: ( rule__CMS__Group_8__0__Impl rule__CMS__Group_8__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4966:2: rule__CMS__Group_8__0__Impl rule__CMS__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__0__Impl_in_rule__CMS__Group_8__09836);
            rule__CMS__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__1_in_rule__CMS__Group_8__09839);
            rule__CMS__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_8__0"


    // $ANTLR start "rule__CMS__Group_8__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4973:1: rule__CMS__Group_8__0__Impl : ( 'username' ) ;
    public final void rule__CMS__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4977:1: ( ( 'username' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4978:1: ( 'username' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4978:1: ( 'username' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4979:1: 'username'
            {
             before(grammarAccess.getCMSAccess().getUsernameKeyword_8_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__CMS__Group_8__0__Impl9867); 
             after(grammarAccess.getCMSAccess().getUsernameKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_8__0__Impl"


    // $ANTLR start "rule__CMS__Group_8__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4992:1: rule__CMS__Group_8__1 : rule__CMS__Group_8__1__Impl ;
    public final void rule__CMS__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4996:1: ( rule__CMS__Group_8__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4997:2: rule__CMS__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__1__Impl_in_rule__CMS__Group_8__19898);
            rule__CMS__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_8__1"


    // $ANTLR start "rule__CMS__Group_8__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5003:1: rule__CMS__Group_8__1__Impl : ( ( rule__CMS__UsernameAssignment_8_1 ) ) ;
    public final void rule__CMS__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5007:1: ( ( ( rule__CMS__UsernameAssignment_8_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5008:1: ( ( rule__CMS__UsernameAssignment_8_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5008:1: ( ( rule__CMS__UsernameAssignment_8_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5009:1: ( rule__CMS__UsernameAssignment_8_1 )
            {
             before(grammarAccess.getCMSAccess().getUsernameAssignment_8_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5010:1: ( rule__CMS__UsernameAssignment_8_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5010:2: rule__CMS__UsernameAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__UsernameAssignment_8_1_in_rule__CMS__Group_8__1__Impl9925);
            rule__CMS__UsernameAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getUsernameAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_8__1__Impl"


    // $ANTLR start "rule__CMS__Group_9__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5024:1: rule__CMS__Group_9__0 : rule__CMS__Group_9__0__Impl rule__CMS__Group_9__1 ;
    public final void rule__CMS__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5028:1: ( rule__CMS__Group_9__0__Impl rule__CMS__Group_9__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5029:2: rule__CMS__Group_9__0__Impl rule__CMS__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__0__Impl_in_rule__CMS__Group_9__09959);
            rule__CMS__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__1_in_rule__CMS__Group_9__09962);
            rule__CMS__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_9__0"


    // $ANTLR start "rule__CMS__Group_9__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5036:1: rule__CMS__Group_9__0__Impl : ( 'password' ) ;
    public final void rule__CMS__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5040:1: ( ( 'password' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5041:1: ( 'password' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5041:1: ( 'password' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5042:1: 'password'
            {
             before(grammarAccess.getCMSAccess().getPasswordKeyword_9_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__CMS__Group_9__0__Impl9990); 
             after(grammarAccess.getCMSAccess().getPasswordKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_9__0__Impl"


    // $ANTLR start "rule__CMS__Group_9__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5055:1: rule__CMS__Group_9__1 : rule__CMS__Group_9__1__Impl ;
    public final void rule__CMS__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5059:1: ( rule__CMS__Group_9__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5060:2: rule__CMS__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__1__Impl_in_rule__CMS__Group_9__110021);
            rule__CMS__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_9__1"


    // $ANTLR start "rule__CMS__Group_9__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5066:1: rule__CMS__Group_9__1__Impl : ( ( rule__CMS__PasswordAssignment_9_1 ) ) ;
    public final void rule__CMS__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5070:1: ( ( ( rule__CMS__PasswordAssignment_9_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5071:1: ( ( rule__CMS__PasswordAssignment_9_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5071:1: ( ( rule__CMS__PasswordAssignment_9_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5072:1: ( rule__CMS__PasswordAssignment_9_1 )
            {
             before(grammarAccess.getCMSAccess().getPasswordAssignment_9_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5073:1: ( rule__CMS__PasswordAssignment_9_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5073:2: rule__CMS__PasswordAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__PasswordAssignment_9_1_in_rule__CMS__Group_9__1__Impl10048);
            rule__CMS__PasswordAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getPasswordAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Group_9__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5087:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5091:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5092:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__010082);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__010085);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5099:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5103:1: ( ( ( '-' )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5104:1: ( ( '-' )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5104:1: ( ( '-' )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5105:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5106:1: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5107:2: '-'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_rule__EInt__Group__0__Impl10114); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5118:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5122:1: ( rule__EInt__Group__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5123:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__110147);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5129:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5133:1: ( ( RULE_INT ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5134:1: ( RULE_INT )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5134:1: ( RULE_INT )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5135:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl10174); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__ContentModel__NameAssignment_5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5151:1: rule__ContentModel__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__ContentModel__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5155:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5156:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5156:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5157:1: ruleEString
            {
             before(grammarAccess.getContentModelAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ContentModel__NameAssignment_510212);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentModelAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__NameAssignment_5"


    // $ANTLR start "rule__ContentModel__HasElementsAssignment_6_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5166:1: rule__ContentModel__HasElementsAssignment_6_2 : ( ruleNamedElement ) ;
    public final void rule__ContentModel__HasElementsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5170:1: ( ( ruleNamedElement ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5171:1: ( ruleNamedElement )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5171:1: ( ruleNamedElement )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5172:1: ruleNamedElement
            {
             before(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_210243);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__HasElementsAssignment_6_2"


    // $ANTLR start "rule__ContentModel__HasElementsAssignment_6_3_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5181:1: rule__ContentModel__HasElementsAssignment_6_3_1 : ( ruleNamedElement ) ;
    public final void rule__ContentModel__HasElementsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5185:1: ( ( ruleNamedElement ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5186:1: ( ruleNamedElement )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5186:1: ( ruleNamedElement )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5187:1: ruleNamedElement
            {
             before(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_3_110274);
            ruleNamedElement();

            state._fsp--;

             after(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__HasElementsAssignment_6_3_1"


    // $ANTLR start "rule__ContentType__VisibleAssignment_0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5196:1: rule__ContentType__VisibleAssignment_0 : ( ( 'visible' ) ) ;
    public final void rule__ContentType__VisibleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5200:1: ( ( ( 'visible' ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5201:1: ( ( 'visible' ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5201:1: ( ( 'visible' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5202:1: ( 'visible' )
            {
             before(grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5203:1: ( 'visible' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5204:1: 'visible'
            {
             before(grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__ContentType__VisibleAssignment_010310); 
             after(grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0()); 

            }

             after(grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__VisibleAssignment_0"


    // $ANTLR start "rule__ContentType__NameAssignment_5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5219:1: rule__ContentType__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__ContentType__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5223:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5224:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5224:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5225:1: ruleEString
            {
             before(grammarAccess.getContentTypeAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ContentType__NameAssignment_510349);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__NameAssignment_5"


    // $ANTLR start "rule__ContentType__GuidAssignment_6_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5234:1: rule__ContentType__GuidAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__ContentType__GuidAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5238:1: ( ( ruleEInt ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5239:1: ( ruleEInt )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5239:1: ( ruleEInt )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5240:1: ruleEInt
            {
             before(grammarAccess.getContentTypeAccess().getGuidEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ContentType__GuidAssignment_6_110380);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getGuidEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__GuidAssignment_6_1"


    // $ANTLR start "rule__ContentType__HasPropertiesAssignment_9"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5249:1: rule__ContentType__HasPropertiesAssignment_9 : ( ruleProperty ) ;
    public final void rule__ContentType__HasPropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5253:1: ( ( ruleProperty ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5254:1: ( ruleProperty )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5254:1: ( ruleProperty )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5255:1: ruleProperty
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_910411);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__HasPropertiesAssignment_9"


    // $ANTLR start "rule__ContentType__HasPropertiesAssignment_10_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5264:1: rule__ContentType__HasPropertiesAssignment_10_1 : ( ruleProperty ) ;
    public final void rule__ContentType__HasPropertiesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5268:1: ( ( ruleProperty ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5269:1: ( ruleProperty )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5269:1: ( ruleProperty )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5270:1: ruleProperty
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_10_110442);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__HasPropertiesAssignment_10_1"


    // $ANTLR start "rule__ContentType__HasVersionsAssignment_12_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5279:1: rule__ContentType__HasVersionsAssignment_12_2 : ( ruleVersion ) ;
    public final void rule__ContentType__HasVersionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5283:1: ( ( ruleVersion ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5284:1: ( ruleVersion )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5284:1: ( ruleVersion )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5285:1: ruleVersion
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_12_210473);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__HasVersionsAssignment_12_2"


    // $ANTLR start "rule__ContentType__HasVersionsAssignment_12_3_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5294:1: rule__ContentType__HasVersionsAssignment_12_3_1 : ( ruleVersion ) ;
    public final void rule__ContentType__HasVersionsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5298:1: ( ( ruleVersion ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5299:1: ( ruleVersion )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5299:1: ( ruleVersion )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5300:1: ruleVersion
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_12_3_110504);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__HasVersionsAssignment_12_3_1"


    // $ANTLR start "rule__ContentType__ModifiedByAssignment_13_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5309:1: rule__ContentType__ModifiedByAssignment_13_1 : ( ruleUser ) ;
    public final void rule__ContentType__ModifiedByAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5313:1: ( ( ruleUser ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5314:1: ( ruleUser )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5314:1: ( ruleUser )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5315:1: ruleUser
            {
             before(grammarAccess.getContentTypeAccess().getModifiedByUserParserRuleCall_13_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUser_in_rule__ContentType__ModifiedByAssignment_13_110535);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getModifiedByUserParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__ModifiedByAssignment_13_1"


    // $ANTLR start "rule__Property__NameAssignment_4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5324:1: rule__Property__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5328:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5329:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5329:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5330:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__NameAssignment_410566);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_4"


    // $ANTLR start "rule__Property__AccessModiferAssignment_6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5339:1: rule__Property__AccessModiferAssignment_6 : ( ruleAccessLevelEnum ) ;
    public final void rule__Property__AccessModiferAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5343:1: ( ( ruleAccessLevelEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5344:1: ( ruleAccessLevelEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5344:1: ( ruleAccessLevelEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5345:1: ruleAccessLevelEnum
            {
             before(grammarAccess.getPropertyAccess().getAccessModiferAccessLevelEnumEnumRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccessLevelEnum_in_rule__Property__AccessModiferAssignment_610597);
            ruleAccessLevelEnum();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getAccessModiferAccessLevelEnumEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__AccessModiferAssignment_6"


    // $ANTLR start "rule__Property__DatatypeAssignment_7_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5354:1: rule__Property__DatatypeAssignment_7_1 : ( ruleType ) ;
    public final void rule__Property__DatatypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5358:1: ( ( ruleType ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5359:1: ( ruleType )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5359:1: ( ruleType )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5360:1: ruleType
            {
             before(grammarAccess.getPropertyAccess().getDatatypeTypeParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_rule__Property__DatatypeAssignment_7_110628);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getDatatypeTypeParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__DatatypeAssignment_7_1"


    // $ANTLR start "rule__SingleType__NameAssignment_5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5369:1: rule__SingleType__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__SingleType__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5373:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5374:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5374:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5375:1: ruleEString
            {
             before(grammarAccess.getSingleTypeAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SingleType__NameAssignment_510659);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleTypeAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__NameAssignment_5"


    // $ANTLR start "rule__SingleType__TypeAssignment_6_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5384:1: rule__SingleType__TypeAssignment_6_1 : ( ruleTypeEnum ) ;
    public final void rule__SingleType__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5388:1: ( ( ruleTypeEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5389:1: ( ruleTypeEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5389:1: ( ruleTypeEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5390:1: ruleTypeEnum
            {
             before(grammarAccess.getSingleTypeAccess().getTypeTypeEnumEnumRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__SingleType__TypeAssignment_6_110690);
            ruleTypeEnum();

            state._fsp--;

             after(grammarAccess.getSingleTypeAccess().getTypeTypeEnumEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleType__TypeAssignment_6_1"


    // $ANTLR start "rule__ArrayType__NameAssignment_5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5399:1: rule__ArrayType__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__ArrayType__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5403:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5404:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5404:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5405:1: ruleEString
            {
             before(grammarAccess.getArrayTypeAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ArrayType__NameAssignment_510721);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__NameAssignment_5"


    // $ANTLR start "rule__ArrayType__TypeAssignment_6_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5414:1: rule__ArrayType__TypeAssignment_6_1 : ( ruleTypeEnum ) ;
    public final void rule__ArrayType__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5418:1: ( ( ruleTypeEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5419:1: ( ruleTypeEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5419:1: ( ruleTypeEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5420:1: ruleTypeEnum
            {
             before(grammarAccess.getArrayTypeAccess().getTypeTypeEnumEnumRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__ArrayType__TypeAssignment_6_110752);
            ruleTypeEnum();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getTypeTypeEnumEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__TypeAssignment_6_1"


    // $ANTLR start "rule__Role__IsAdminAssignment_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5429:1: rule__Role__IsAdminAssignment_1 : ( ( 'isAdmin' ) ) ;
    public final void rule__Role__IsAdminAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5433:1: ( ( ( 'isAdmin' ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5434:1: ( ( 'isAdmin' ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5434:1: ( ( 'isAdmin' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5435:1: ( 'isAdmin' )
            {
             before(grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5436:1: ( 'isAdmin' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5437:1: 'isAdmin'
            {
             before(grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Role__IsAdminAssignment_110788); 
             after(grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0()); 

            }

             after(grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__IsAdminAssignment_1"


    // $ANTLR start "rule__Role__NameAssignment_6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5452:1: rule__Role__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5456:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5457:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5457:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5458:1: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Role__NameAssignment_610827);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_6"


    // $ANTLR start "rule__Role__TypesAssignment_7_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5467:1: rule__Role__TypesAssignment_7_2 : ( ruleEString ) ;
    public final void rule__Role__TypesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5471:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5472:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5472:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5473:1: ruleEString
            {
             before(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_210858);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__TypesAssignment_7_2"


    // $ANTLR start "rule__Role__TypesAssignment_7_3_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5482:1: rule__Role__TypesAssignment_7_3_1 : ( ruleEString ) ;
    public final void rule__Role__TypesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5486:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5487:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5487:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5488:1: ruleEString
            {
             before(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_3_110889);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__TypesAssignment_7_3_1"


    // $ANTLR start "rule__User__DisabledAssignment_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5497:1: rule__User__DisabledAssignment_1 : ( ( 'disabled' ) ) ;
    public final void rule__User__DisabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5501:1: ( ( ( 'disabled' ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5502:1: ( ( 'disabled' ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5502:1: ( ( 'disabled' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5503:1: ( 'disabled' )
            {
             before(grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5504:1: ( 'disabled' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5505:1: 'disabled'
            {
             before(grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__User__DisabledAssignment_110925); 
             after(grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0()); 

            }

             after(grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__DisabledAssignment_1"


    // $ANTLR start "rule__User__NameAssignment_6"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5520:1: rule__User__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__User__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5524:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5525:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5525:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5526:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__NameAssignment_610964);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_6"


    // $ANTLR start "rule__User__FirstnameAssignment_7_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5535:1: rule__User__FirstnameAssignment_7_1 : ( ruleEString ) ;
    public final void rule__User__FirstnameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5539:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5540:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5540:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5541:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getFirstnameEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__FirstnameAssignment_7_110995);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getFirstnameEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__FirstnameAssignment_7_1"


    // $ANTLR start "rule__User__LastnameAssignment_8_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5550:1: rule__User__LastnameAssignment_8_1 : ( ruleEString ) ;
    public final void rule__User__LastnameAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5554:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5555:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5555:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5556:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getLastnameEStringParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__LastnameAssignment_8_111026);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getLastnameEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__LastnameAssignment_8_1"


    // $ANTLR start "rule__User__LoginAssignment_9_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5565:1: rule__User__LoginAssignment_9_1 : ( ruleEString ) ;
    public final void rule__User__LoginAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5569:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5570:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5570:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5571:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getLoginEStringParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__LoginAssignment_9_111057);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getLoginEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__LoginAssignment_9_1"


    // $ANTLR start "rule__User__PasswordAssignment_10_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5580:1: rule__User__PasswordAssignment_10_1 : ( ruleEString ) ;
    public final void rule__User__PasswordAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5584:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5585:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5585:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5586:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getPasswordEStringParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__PasswordAssignment_10_111088);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getPasswordEStringParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__PasswordAssignment_10_1"


    // $ANTLR start "rule__User__EmailAssignment_11_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5595:1: rule__User__EmailAssignment_11_1 : ( ruleEString ) ;
    public final void rule__User__EmailAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5599:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5600:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5600:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5601:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getEmailEStringParserRuleCall_11_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__EmailAssignment_11_111119);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getEmailEStringParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__EmailAssignment_11_1"


    // $ANTLR start "rule__User__HasRoleAssignment_12_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5610:1: rule__User__HasRoleAssignment_12_1 : ( ruleRole ) ;
    public final void rule__User__HasRoleAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5614:1: ( ( ruleRole ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5615:1: ( ruleRole )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5615:1: ( ruleRole )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5616:1: ruleRole
            {
             before(grammarAccess.getUserAccess().getHasRoleRoleParserRuleCall_12_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__User__HasRoleAssignment_12_111150);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getUserAccess().getHasRoleRoleParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__HasRoleAssignment_12_1"


    // $ANTLR start "rule__Version__NameAssignment_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5625:1: rule__Version__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Version__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5629:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5630:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5630:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5631:1: ruleEString
            {
             before(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Version__NameAssignment_211181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__NameAssignment_2"


    // $ANTLR start "rule__CMS__NameAssignment_5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5640:1: rule__CMS__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__CMS__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5644:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5645:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5645:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5646:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__NameAssignment_511212);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCMSAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__NameAssignment_5"


    // $ANTLR start "rule__CMS__TypeAssignment_6_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5655:1: rule__CMS__TypeAssignment_6_1 : ( ruleCMSEnum ) ;
    public final void rule__CMS__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5659:1: ( ( ruleCMSEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5660:1: ( ruleCMSEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5660:1: ( ruleCMSEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5661:1: ruleCMSEnum
            {
             before(grammarAccess.getCMSAccess().getTypeCMSEnumEnumRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCMSEnum_in_rule__CMS__TypeAssignment_6_111243);
            ruleCMSEnum();

            state._fsp--;

             after(grammarAccess.getCMSAccess().getTypeCMSEnumEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__TypeAssignment_6_1"


    // $ANTLR start "rule__CMS__Address_urlAssignment_7_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5670:1: rule__CMS__Address_urlAssignment_7_1 : ( ruleEString ) ;
    public final void rule__CMS__Address_urlAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5674:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5675:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5675:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5676:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getAddress_urlEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__Address_urlAssignment_7_111274);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCMSAccess().getAddress_urlEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__Address_urlAssignment_7_1"


    // $ANTLR start "rule__CMS__UsernameAssignment_8_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5685:1: rule__CMS__UsernameAssignment_8_1 : ( ruleEString ) ;
    public final void rule__CMS__UsernameAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5689:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5690:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5690:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5691:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getUsernameEStringParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__UsernameAssignment_8_111305);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCMSAccess().getUsernameEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__UsernameAssignment_8_1"


    // $ANTLR start "rule__CMS__PasswordAssignment_9_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5700:1: rule__CMS__PasswordAssignment_9_1 : ( ruleEString ) ;
    public final void rule__CMS__PasswordAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5704:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5705:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5705:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5706:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getPasswordEStringParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__PasswordAssignment_9_111336);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCMSAccess().getPasswordEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CMS__PasswordAssignment_9_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleContentModel_in_entryRuleContentModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContentModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__0_in_ruleContentModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NamedElement__Alternatives_in_ruleNamedElement154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_entryRuleContentType301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContentType308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__0_in_ruleContentType334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleType_in_entryRuleSingleType421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleType428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group__0_in_ruleSingleType454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayType488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUser_in_entryRuleUser601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUser608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_entryRuleCMS721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCMS728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__0_in_ruleCMS754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypeEnum__Alternatives_in_ruleTypeEnum853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMSEnum__Alternatives_in_ruleCMSEnum889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccessLevelEnum__Alternatives_in_ruleAccessLevelEnum925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_rule__NamedElement__Alternatives960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_rule__NamedElement__Alternatives977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleType_in_rule__Type__Alternatives1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayType_in_rule__Type__Alternatives1026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__TypeEnum__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TypeEnum__Alternatives1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__TypeEnum__Alternatives1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TypeEnum__Alternatives1172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypeEnum__Alternatives1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypeEnum__Alternatives1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TypeEnum__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TypeEnum__Alternatives1256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__CMSEnum__Alternatives1292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__CMSEnum__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CMSEnum__Alternatives1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CMSEnum__Alternatives1355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__AccessLevelEnum__Alternatives1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AccessLevelEnum__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__0__Impl_in_rule__ContentModel__Group__01445 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__1_in_rule__ContentModel__Group__01448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__1__Impl_in_rule__ContentModel__Group__11506 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__2_in_rule__ContentModel__Group__11509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ContentModel__Group__1__Impl1537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__2__Impl_in_rule__ContentModel__Group__21568 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__3_in_rule__ContentModel__Group__21571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentModel__Group__2__Impl1599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__3__Impl_in_rule__ContentModel__Group__31630 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__4_in_rule__ContentModel__Group__31633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ContentModel__Group__3__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__4__Impl_in_rule__ContentModel__Group__41692 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__5_in_rule__ContentModel__Group__41695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ContentModel__Group__4__Impl1723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__5__Impl_in_rule__ContentModel__Group__51754 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__6_in_rule__ContentModel__Group__51757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__NameAssignment_5_in_rule__ContentModel__Group__5__Impl1784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__6__Impl_in_rule__ContentModel__Group__61814 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__7_in_rule__ContentModel__Group__61817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__0_in_rule__ContentModel__Group__6__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__7__Impl_in_rule__ContentModel__Group__71875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentModel__Group__7__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__0__Impl_in_rule__ContentModel__Group_6__01950 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__1_in_rule__ContentModel__Group_6__01953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ContentModel__Group_6__0__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__1__Impl_in_rule__ContentModel__Group_6__12012 = new BitSet(new long[]{0x0220000100000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__2_in_rule__ContentModel__Group_6__12015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentModel__Group_6__1__Impl2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__2__Impl_in_rule__ContentModel__Group_6__22074 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__3_in_rule__ContentModel__Group_6__22077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__HasElementsAssignment_6_2_in_rule__ContentModel__Group_6__2__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__3__Impl_in_rule__ContentModel__Group_6__32134 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__4_in_rule__ContentModel__Group_6__32137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__0_in_rule__ContentModel__Group_6__3__Impl2164 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__4__Impl_in_rule__ContentModel__Group_6__42195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentModel__Group_6__4__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__0__Impl_in_rule__ContentModel__Group_6_3__02264 = new BitSet(new long[]{0x0220000100000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__1_in_rule__ContentModel__Group_6_3__02267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentModel__Group_6_3__0__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__1__Impl_in_rule__ContentModel__Group_6_3__12326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__HasElementsAssignment_6_3_1_in_rule__ContentModel__Group_6_3__1__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__0__Impl_in_rule__ContentType__Group__02387 = new BitSet(new long[]{0x0200000100000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__1_in_rule__ContentType__Group__02390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__VisibleAssignment_0_in_rule__ContentType__Group__0__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__1__Impl_in_rule__ContentType__Group__12448 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__2_in_rule__ContentType__Group__12451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ContentType__Group__1__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__2__Impl_in_rule__ContentType__Group__22510 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__3_in_rule__ContentType__Group__22513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentType__Group__2__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__3__Impl_in_rule__ContentType__Group__32572 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__4_in_rule__ContentType__Group__32575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ContentType__Group__3__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__4__Impl_in_rule__ContentType__Group__42634 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ContentType__Group__5_in_rule__ContentType__Group__42637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ContentType__Group__4__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__5__Impl_in_rule__ContentType__Group__52696 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__6_in_rule__ContentType__Group__52699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__NameAssignment_5_in_rule__ContentType__Group__5__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__6__Impl_in_rule__ContentType__Group__62756 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__7_in_rule__ContentType__Group__62759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__0_in_rule__ContentType__Group__6__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__7__Impl_in_rule__ContentType__Group__72817 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__8_in_rule__ContentType__Group__72820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ContentType__Group__7__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__8__Impl_in_rule__ContentType__Group__82879 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__9_in_rule__ContentType__Group__82882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentType__Group__8__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__9__Impl_in_rule__ContentType__Group__92941 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__10_in_rule__ContentType__Group__92944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasPropertiesAssignment_9_in_rule__ContentType__Group__9__Impl2971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__10__Impl_in_rule__ContentType__Group__103001 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__11_in_rule__ContentType__Group__103004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_10__0_in_rule__ContentType__Group__10__Impl3031 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__11__Impl_in_rule__ContentType__Group__113062 = new BitSet(new long[]{0x0000001820000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__12_in_rule__ContentType__Group__113065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentType__Group__11__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__12__Impl_in_rule__ContentType__Group__123124 = new BitSet(new long[]{0x0000001820000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__13_in_rule__ContentType__Group__123127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__0_in_rule__ContentType__Group__12__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__13__Impl_in_rule__ContentType__Group__133185 = new BitSet(new long[]{0x0000001820000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__14_in_rule__ContentType__Group__133188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__0_in_rule__ContentType__Group__13__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__14__Impl_in_rule__ContentType__Group__143246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentType__Group__14__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__0__Impl_in_rule__ContentType__Group_6__03335 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__1_in_rule__ContentType__Group_6__03338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ContentType__Group_6__0__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__1__Impl_in_rule__ContentType__Group_6__13397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__GuidAssignment_6_1_in_rule__ContentType__Group_6__1__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_10__0__Impl_in_rule__ContentType__Group_10__03458 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_10__1_in_rule__ContentType__Group_10__03461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentType__Group_10__0__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_10__1__Impl_in_rule__ContentType__Group_10__13520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasPropertiesAssignment_10_1_in_rule__ContentType__Group_10__1__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__0__Impl_in_rule__ContentType__Group_12__03581 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__1_in_rule__ContentType__Group_12__03584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ContentType__Group_12__0__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__1__Impl_in_rule__ContentType__Group_12__13643 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__2_in_rule__ContentType__Group_12__13646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentType__Group_12__1__Impl3674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__2__Impl_in_rule__ContentType__Group_12__23705 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__3_in_rule__ContentType__Group_12__23708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasVersionsAssignment_12_2_in_rule__ContentType__Group_12__2__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__3__Impl_in_rule__ContentType__Group_12__33765 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__4_in_rule__ContentType__Group_12__33768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12_3__0_in_rule__ContentType__Group_12__3__Impl3795 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__4__Impl_in_rule__ContentType__Group_12__43826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentType__Group_12__4__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12_3__0__Impl_in_rule__ContentType__Group_12_3__03895 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12_3__1_in_rule__ContentType__Group_12_3__03898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentType__Group_12_3__0__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12_3__1__Impl_in_rule__ContentType__Group_12_3__13957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasVersionsAssignment_12_3_1_in_rule__ContentType__Group_12_3__1__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__0__Impl_in_rule__ContentType__Group_13__04018 = new BitSet(new long[]{0x0800200000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__1_in_rule__ContentType__Group_13__04021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ContentType__Group_13__0__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__1__Impl_in_rule__ContentType__Group_13__14080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__ModifiedByAssignment_13_1_in_rule__ContentType__Group_13__1__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04141 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Property__Group__0__Impl4172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14203 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Property__Group__1__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24265 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Property__Group__2__Impl4296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34327 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Property__Group__3__Impl4358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44389 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__44392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__NameAssignment_4_in_rule__Property__Group__4__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__54449 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Property__Group__6_in_rule__Property__Group__54452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Property__Group__5__Impl4480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__64511 = new BitSet(new long[]{0x0000008020000000L});
        public static final BitSet FOLLOW_rule__Property__Group__7_in_rule__Property__Group__64514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__AccessModiferAssignment_6_in_rule__Property__Group__6__Impl4541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__74571 = new BitSet(new long[]{0x0000008020000000L});
        public static final BitSet FOLLOW_rule__Property__Group__8_in_rule__Property__Group__74574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_7__0_in_rule__Property__Group__7__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__8__Impl_in_rule__Property__Group__84632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Property__Group__8__Impl4660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_7__0__Impl_in_rule__Property__Group_7__04709 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__Property__Group_7__1_in_rule__Property__Group_7__04712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Property__Group_7__0__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_7__1__Impl_in_rule__Property__Group_7__14771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__DatatypeAssignment_7_1_in_rule__Property__Group_7__1__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group__0__Impl_in_rule__SingleType__Group__04832 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__SingleType__Group__1_in_rule__SingleType__Group__04835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group__1__Impl_in_rule__SingleType__Group__14893 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__SingleType__Group__2_in_rule__SingleType__Group__14896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__SingleType__Group__1__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group__2__Impl_in_rule__SingleType__Group__24955 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__SingleType__Group__3_in_rule__SingleType__Group__24958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__SingleType__Group__2__Impl4986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group__3__Impl_in_rule__SingleType__Group__35017 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__SingleType__Group__4_in_rule__SingleType__Group__35020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SingleType__Group__3__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group__4__Impl_in_rule__SingleType__Group__45079 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SingleType__Group__5_in_rule__SingleType__Group__45082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__SingleType__Group__4__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group__5__Impl_in_rule__SingleType__Group__55141 = new BitSet(new long[]{0x0000020020000000L});
        public static final BitSet FOLLOW_rule__SingleType__Group__6_in_rule__SingleType__Group__55144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__NameAssignment_5_in_rule__SingleType__Group__5__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group__6__Impl_in_rule__SingleType__Group__65201 = new BitSet(new long[]{0x0000020020000000L});
        public static final BitSet FOLLOW_rule__SingleType__Group__7_in_rule__SingleType__Group__65204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group_6__0_in_rule__SingleType__Group__6__Impl5231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group__7__Impl_in_rule__SingleType__Group__75262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SingleType__Group__7__Impl5290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group_6__0__Impl_in_rule__SingleType__Group_6__05337 = new BitSet(new long[]{0x000000000007F800L});
        public static final BitSet FOLLOW_rule__SingleType__Group_6__1_in_rule__SingleType__Group_6__05340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__SingleType__Group_6__0__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__Group_6__1__Impl_in_rule__SingleType__Group_6__15399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleType__TypeAssignment_6_1_in_rule__SingleType__Group_6__1__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__05460 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__05463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__15521 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__15524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ArrayType__Group__1__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__25583 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__25586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ArrayType__Group__2__Impl5614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__35645 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__35648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ArrayType__Group__3__Impl5676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__45707 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__5_in_rule__ArrayType__Group__45710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ArrayType__Group__4__Impl5738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__5__Impl_in_rule__ArrayType__Group__55769 = new BitSet(new long[]{0x0000020020000000L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__6_in_rule__ArrayType__Group__55772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__NameAssignment_5_in_rule__ArrayType__Group__5__Impl5799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__6__Impl_in_rule__ArrayType__Group__65829 = new BitSet(new long[]{0x0000020020000000L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__7_in_rule__ArrayType__Group__65832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group_6__0_in_rule__ArrayType__Group__6__Impl5859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group__7__Impl_in_rule__ArrayType__Group__75890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ArrayType__Group__7__Impl5918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group_6__0__Impl_in_rule__ArrayType__Group_6__05965 = new BitSet(new long[]{0x000000000007F800L});
        public static final BitSet FOLLOW_rule__ArrayType__Group_6__1_in_rule__ArrayType__Group_6__05968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ArrayType__Group_6__0__Impl5996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__Group_6__1__Impl_in_rule__ArrayType__Group_6__16027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArrayType__TypeAssignment_6_1_in_rule__ArrayType__Group_6__1__Impl6054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__06088 = new BitSet(new long[]{0x0400080000000000L});
        public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__06091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__16149 = new BitSet(new long[]{0x0400080000000000L});
        public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__16152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__IsAdminAssignment_1_in_rule__Role__Group__1__Impl6179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__26210 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__26213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Role__Group__2__Impl6241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__36272 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__36275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Role__Group__3__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__46334 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__46337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Role__Group__4__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__56396 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Role__Group__6_in_rule__Role__Group__56399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Role__Group__5__Impl6427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__66458 = new BitSet(new long[]{0x0000100020000000L});
        public static final BitSet FOLLOW_rule__Role__Group__7_in_rule__Role__Group__66461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__NameAssignment_6_in_rule__Role__Group__6__Impl6488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__76518 = new BitSet(new long[]{0x0000100020000000L});
        public static final BitSet FOLLOW_rule__Role__Group__8_in_rule__Role__Group__76521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__0_in_rule__Role__Group__7__Impl6548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__8__Impl_in_rule__Role__Group__86579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Role__Group__8__Impl6607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__0__Impl_in_rule__Role__Group_7__06656 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__1_in_rule__Role__Group_7__06659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Role__Group_7__0__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__1__Impl_in_rule__Role__Group_7__16718 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Role__Group_7__2_in_rule__Role__Group_7__16721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Role__Group_7__1__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__2__Impl_in_rule__Role__Group_7__26780 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__3_in_rule__Role__Group_7__26783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__TypesAssignment_7_2_in_rule__Role__Group_7__2__Impl6810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__3__Impl_in_rule__Role__Group_7__36840 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__4_in_rule__Role__Group_7__36843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__0_in_rule__Role__Group_7__3__Impl6870 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__4__Impl_in_rule__Role__Group_7__46901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Role__Group_7__4__Impl6929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__0__Impl_in_rule__Role__Group_7_3__06970 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__1_in_rule__Role__Group_7_3__06973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Role__Group_7_3__0__Impl7001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__1__Impl_in_rule__Role__Group_7_3__17032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__TypesAssignment_7_3_1_in_rule__Role__Group_7_3__1__Impl7059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__07093 = new BitSet(new long[]{0x0800200000000000L});
        public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__07096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__17154 = new BitSet(new long[]{0x0800200000000000L});
        public static final BitSet FOLLOW_rule__User__Group__2_in_rule__User__Group__17157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__DisabledAssignment_1_in_rule__User__Group__1__Impl7184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__27215 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__User__Group__3_in_rule__User__Group__27218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__User__Group__2__Impl7246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__37277 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__User__Group__4_in_rule__User__Group__37280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__User__Group__3__Impl7308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__47339 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group__5_in_rule__User__Group__47342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__User__Group__4__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__5__Impl_in_rule__User__Group__57401 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group__6_in_rule__User__Group__57404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group__5__Impl7432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__6__Impl_in_rule__User__Group__67463 = new BitSet(new long[]{0x000FC00020000000L});
        public static final BitSet FOLLOW_rule__User__Group__7_in_rule__User__Group__67466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__NameAssignment_6_in_rule__User__Group__6__Impl7493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__7__Impl_in_rule__User__Group__77523 = new BitSet(new long[]{0x000FC00020000000L});
        public static final BitSet FOLLOW_rule__User__Group__8_in_rule__User__Group__77526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__0_in_rule__User__Group__7__Impl7553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__8__Impl_in_rule__User__Group__87584 = new BitSet(new long[]{0x000FC00020000000L});
        public static final BitSet FOLLOW_rule__User__Group__9_in_rule__User__Group__87587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__0_in_rule__User__Group__8__Impl7614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__9__Impl_in_rule__User__Group__97645 = new BitSet(new long[]{0x000FC00020000000L});
        public static final BitSet FOLLOW_rule__User__Group__10_in_rule__User__Group__97648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__0_in_rule__User__Group__9__Impl7675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__10__Impl_in_rule__User__Group__107706 = new BitSet(new long[]{0x000FC00020000000L});
        public static final BitSet FOLLOW_rule__User__Group__11_in_rule__User__Group__107709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__0_in_rule__User__Group__10__Impl7736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__11__Impl_in_rule__User__Group__117767 = new BitSet(new long[]{0x000FC00020000000L});
        public static final BitSet FOLLOW_rule__User__Group__12_in_rule__User__Group__117770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__0_in_rule__User__Group__11__Impl7797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__12__Impl_in_rule__User__Group__127828 = new BitSet(new long[]{0x000FC00020000000L});
        public static final BitSet FOLLOW_rule__User__Group__13_in_rule__User__Group__127831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__0_in_rule__User__Group__12__Impl7858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__13__Impl_in_rule__User__Group__137889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__User__Group__13__Impl7917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__0__Impl_in_rule__User__Group_7__07976 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_7__1_in_rule__User__Group_7__07979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__User__Group_7__0__Impl8007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__1__Impl_in_rule__User__Group_7__18038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__FirstnameAssignment_7_1_in_rule__User__Group_7__1__Impl8065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__0__Impl_in_rule__User__Group_8__08099 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_8__1_in_rule__User__Group_8__08102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__User__Group_8__0__Impl8130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__1__Impl_in_rule__User__Group_8__18161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__LastnameAssignment_8_1_in_rule__User__Group_8__1__Impl8188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__0__Impl_in_rule__User__Group_9__08222 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_9__1_in_rule__User__Group_9__08225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__User__Group_9__0__Impl8253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__1__Impl_in_rule__User__Group_9__18284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__LoginAssignment_9_1_in_rule__User__Group_9__1__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__0__Impl_in_rule__User__Group_10__08345 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_10__1_in_rule__User__Group_10__08348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__User__Group_10__0__Impl8376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__1__Impl_in_rule__User__Group_10__18407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__PasswordAssignment_10_1_in_rule__User__Group_10__1__Impl8434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__0__Impl_in_rule__User__Group_11__08468 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_11__1_in_rule__User__Group_11__08471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__User__Group_11__0__Impl8499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__1__Impl_in_rule__User__Group_11__18530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__EmailAssignment_11_1_in_rule__User__Group_11__1__Impl8557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__0__Impl_in_rule__User__Group_12__08591 = new BitSet(new long[]{0x0400080000000000L});
        public static final BitSet FOLLOW_rule__User__Group_12__1_in_rule__User__Group_12__08594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__User__Group_12__0__Impl8622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__1__Impl_in_rule__User__Group_12__18653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__HasRoleAssignment_12_1_in_rule__User__Group_12__1__Impl8680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__08714 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__08717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__18775 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__18778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Version__Group__1__Impl8806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__28837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__NameAssignment_2_in_rule__Version__Group__2__Impl8864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__0__Impl_in_rule__CMS__Group__08900 = new BitSet(new long[]{0x0220000100000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__1_in_rule__CMS__Group__08903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__1__Impl_in_rule__CMS__Group__18961 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__2_in_rule__CMS__Group__18964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__CMS__Group__1__Impl8992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__2__Impl_in_rule__CMS__Group__29023 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__3_in_rule__CMS__Group__29026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CMS__Group__2__Impl9054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__3__Impl_in_rule__CMS__Group__39085 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__4_in_rule__CMS__Group__39088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CMS__Group__3__Impl9116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__4__Impl_in_rule__CMS__Group__49147 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group__5_in_rule__CMS__Group__49150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group__4__Impl9178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__5__Impl_in_rule__CMS__Group__59209 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__6_in_rule__CMS__Group__59212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__NameAssignment_5_in_rule__CMS__Group__5__Impl9239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__6__Impl_in_rule__CMS__Group__69269 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__7_in_rule__CMS__Group__69272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__0_in_rule__CMS__Group__6__Impl9299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__7__Impl_in_rule__CMS__Group__79329 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__8_in_rule__CMS__Group__79332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__0_in_rule__CMS__Group__7__Impl9359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__8__Impl_in_rule__CMS__Group__89389 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__9_in_rule__CMS__Group__89392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__0_in_rule__CMS__Group__8__Impl9419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__9__Impl_in_rule__CMS__Group__99449 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__10_in_rule__CMS__Group__99452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__0_in_rule__CMS__Group__9__Impl9479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__10__Impl_in_rule__CMS__Group__109509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CMS__Group__10__Impl9537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__0__Impl_in_rule__CMS__Group_6__09590 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__1_in_rule__CMS__Group_6__09593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__CMS__Group_6__0__Impl9621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__1__Impl_in_rule__CMS__Group_6__19652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__TypeAssignment_6_1_in_rule__CMS__Group_6__1__Impl9679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__0__Impl_in_rule__CMS__Group_7__09713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__1_in_rule__CMS__Group_7__09716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__CMS__Group_7__0__Impl9744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__1__Impl_in_rule__CMS__Group_7__19775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Address_urlAssignment_7_1_in_rule__CMS__Group_7__1__Impl9802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__0__Impl_in_rule__CMS__Group_8__09836 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__1_in_rule__CMS__Group_8__09839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__CMS__Group_8__0__Impl9867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__1__Impl_in_rule__CMS__Group_8__19898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__UsernameAssignment_8_1_in_rule__CMS__Group_8__1__Impl9925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__0__Impl_in_rule__CMS__Group_9__09959 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__1_in_rule__CMS__Group_9__09962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__CMS__Group_9__0__Impl9990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__1__Impl_in_rule__CMS__Group_9__110021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__PasswordAssignment_9_1_in_rule__CMS__Group_9__1__Impl10048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__010082 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__010085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__EInt__Group__0__Impl10114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__110147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl10174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ContentModel__NameAssignment_510212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_210243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_3_110274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__ContentType__VisibleAssignment_010310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ContentType__NameAssignment_510349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ContentType__GuidAssignment_6_110380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_910411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_10_110442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_12_210473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_12_3_110504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUser_in_rule__ContentType__ModifiedByAssignment_13_110535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__NameAssignment_410566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessLevelEnum_in_rule__Property__AccessModiferAssignment_610597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_rule__Property__DatatypeAssignment_7_110628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SingleType__NameAssignment_510659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__SingleType__TypeAssignment_6_110690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ArrayType__NameAssignment_510721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__ArrayType__TypeAssignment_6_110752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Role__IsAdminAssignment_110788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Role__NameAssignment_610827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_210858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_3_110889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__User__DisabledAssignment_110925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__NameAssignment_610964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__FirstnameAssignment_7_110995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__LastnameAssignment_8_111026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__LoginAssignment_9_111057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__PasswordAssignment_10_111088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__EmailAssignment_11_111119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__User__HasRoleAssignment_12_111150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Version__NameAssignment_211181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__NameAssignment_511212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMSEnum_in_rule__CMS__TypeAssignment_6_111243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__Address_urlAssignment_7_111274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__UsernameAssignment_8_111305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__PasswordAssignment_9_111336 = new BitSet(new long[]{0x0000000000000002L});
    }


}