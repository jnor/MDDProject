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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'char'", "'byte'", "'string'", "'int'", "'float'", "'double'", "'boolean'", "'date'", "'Jease'", "'N2'", "'Concrete5'", "'Plone'", "'public'", "'private'", "'ContentModel'", "'{'", "'Name'", "'='", "'}'", "'Contains'", "','", "'ContentType'", "'hasProperties'", "'guid'", "'hasVersions'", "'modifiedBy'", "'Property'", "'accessModifer'", "'Type'", "'Role'", "'types'", "'User'", "'firstname'", "'lastname'", "'login'", "'password'", "'email'", "'Version'", "'Number'", "'CMS'", "'type'", "'address_url'", "'username'", "'-'", "'visible'", "'isAdmin'", "'disabled'"
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


    // $ANTLR start "entryRuleEString"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:117:1: ( ruleEString EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:132:1: ( rule__EString__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:144:1: entryRuleContentType : ruleContentType EOF ;
    public final void entryRuleContentType() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:145:1: ( ruleContentType EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:146:1: ruleContentType EOF
            {
             before(grammarAccess.getContentTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContentType_in_entryRuleContentType241);
            ruleContentType();

            state._fsp--;

             after(grammarAccess.getContentTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContentType248); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:153:1: ruleContentType : ( ( rule__ContentType__Group__0 ) ) ;
    public final void ruleContentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:157:2: ( ( ( rule__ContentType__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:158:1: ( ( rule__ContentType__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:158:1: ( ( rule__ContentType__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:159:1: ( rule__ContentType__Group__0 )
            {
             before(grammarAccess.getContentTypeAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:160:1: ( rule__ContentType__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:160:2: rule__ContentType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__0_in_ruleContentType274);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:172:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:173:1: ( ruleProperty EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:174:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty301);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty308); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:181:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:185:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:186:1: ( ( rule__Property__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:186:1: ( ( rule__Property__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:187:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:188:1: ( rule__Property__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:188:2: rule__Property__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0_in_ruleProperty334);
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


    // $ANTLR start "entryRuleRole"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:200:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:201:1: ( ruleRole EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:202:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole361);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole368); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:209:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:213:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:214:1: ( ( rule__Role__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:214:1: ( ( rule__Role__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:215:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:216:1: ( rule__Role__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:216:2: rule__Role__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0_in_ruleRole394);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:228:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:229:1: ( ruleUser EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:230:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUser_in_entryRuleUser421);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUser428); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:237:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:241:2: ( ( ( rule__User__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:242:1: ( ( rule__User__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:242:1: ( ( rule__User__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:243:1: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:244:1: ( rule__User__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:244:2: rule__User__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__0_in_ruleUser454);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:256:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:257:1: ( ruleVersion EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:258:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion481);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion488); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:265:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:269:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:270:1: ( ( rule__Version__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:270:1: ( ( rule__Version__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:271:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:272:1: ( rule__Version__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:272:2: rule__Version__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0_in_ruleVersion514);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:284:1: entryRuleCMS : ruleCMS EOF ;
    public final void entryRuleCMS() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:285:1: ( ruleCMS EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:286:1: ruleCMS EOF
            {
             before(grammarAccess.getCMSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCMS_in_entryRuleCMS541);
            ruleCMS();

            state._fsp--;

             after(grammarAccess.getCMSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCMS548); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:293:1: ruleCMS : ( ( rule__CMS__Group__0 ) ) ;
    public final void ruleCMS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:297:2: ( ( ( rule__CMS__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:298:1: ( ( rule__CMS__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:298:1: ( ( rule__CMS__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:299:1: ( rule__CMS__Group__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:300:1: ( rule__CMS__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:300:2: rule__CMS__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__0_in_ruleCMS574);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:312:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:313:1: ( ruleEInt EOF )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:314:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt601);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt608); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:321:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:325:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:326:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:326:1: ( ( rule__EInt__Group__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:327:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:328:1: ( rule__EInt__Group__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:328:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt634);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:343:1: ruleTypeEnum : ( ( rule__TypeEnum__Alternatives ) ) ;
    public final void ruleTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:347:1: ( ( ( rule__TypeEnum__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:348:1: ( ( rule__TypeEnum__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:348:1: ( ( rule__TypeEnum__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:349:1: ( rule__TypeEnum__Alternatives )
            {
             before(grammarAccess.getTypeEnumAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:350:1: ( rule__TypeEnum__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:350:2: rule__TypeEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypeEnum__Alternatives_in_ruleTypeEnum673);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:362:1: ruleCMSEnum : ( ( rule__CMSEnum__Alternatives ) ) ;
    public final void ruleCMSEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:366:1: ( ( ( rule__CMSEnum__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:367:1: ( ( rule__CMSEnum__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:367:1: ( ( rule__CMSEnum__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:368:1: ( rule__CMSEnum__Alternatives )
            {
             before(grammarAccess.getCMSEnumAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:369:1: ( rule__CMSEnum__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:369:2: rule__CMSEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMSEnum__Alternatives_in_ruleCMSEnum709);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:381:1: ruleAccessLevelEnum : ( ( rule__AccessLevelEnum__Alternatives ) ) ;
    public final void ruleAccessLevelEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:385:1: ( ( ( rule__AccessLevelEnum__Alternatives ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:386:1: ( ( rule__AccessLevelEnum__Alternatives ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:386:1: ( ( rule__AccessLevelEnum__Alternatives ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:387:1: ( rule__AccessLevelEnum__Alternatives )
            {
             before(grammarAccess.getAccessLevelEnumAccess().getAlternatives()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:388:1: ( rule__AccessLevelEnum__Alternatives )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:388:2: rule__AccessLevelEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccessLevelEnum__Alternatives_in_ruleAccessLevelEnum745);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:399:1: rule__NamedElement__Alternatives : ( ( ruleContentType ) | ( ruleCMS ) );
    public final void rule__NamedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:403:1: ( ( ruleContentType ) | ( ruleCMS ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32||LA1_0==55) ) {
                alt1=1;
            }
            else if ( (LA1_0==50) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:404:1: ( ruleContentType )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:404:1: ( ruleContentType )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:405:1: ruleContentType
                    {
                     before(grammarAccess.getNamedElementAccess().getContentTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleContentType_in_rule__NamedElement__Alternatives780);
                    ruleContentType();

                    state._fsp--;

                     after(grammarAccess.getNamedElementAccess().getContentTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:410:6: ( ruleCMS )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:410:6: ( ruleCMS )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:411:1: ruleCMS
                    {
                     before(grammarAccess.getNamedElementAccess().getCMSParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCMS_in_rule__NamedElement__Alternatives797);
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:421:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:425:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:426:1: ( RULE_STRING )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:426:1: ( RULE_STRING )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:427:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives829); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:432:6: ( RULE_ID )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:432:6: ( RULE_ID )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:433:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives846); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:444:1: rule__TypeEnum__Alternatives : ( ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) );
    public final void rule__TypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:448:1: ( ( ( 'char' ) ) | ( ( 'byte' ) ) | ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'boolean' ) ) | ( ( 'date' ) ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:449:1: ( ( 'char' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:449:1: ( ( 'char' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:450:1: ( 'char' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:451:1: ( 'char' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:451:3: 'char'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__TypeEnum__Alternatives880); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getCharEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:456:6: ( ( 'byte' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:456:6: ( ( 'byte' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:457:1: ( 'byte' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:458:1: ( 'byte' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:458:3: 'byte'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__TypeEnum__Alternatives901); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getByteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:463:6: ( ( 'string' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:463:6: ( ( 'string' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:464:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:465:1: ( 'string' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:465:3: 'string'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__TypeEnum__Alternatives922); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getStringEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:470:6: ( ( 'int' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:470:6: ( ( 'int' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:471:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:472:1: ( 'int' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:472:3: 'int'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__TypeEnum__Alternatives943); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getIntEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:477:6: ( ( 'float' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:477:6: ( ( 'float' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:478:1: ( 'float' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:479:1: ( 'float' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:479:3: 'float'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__TypeEnum__Alternatives964); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getFloatEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:484:6: ( ( 'double' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:484:6: ( ( 'double' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:485:1: ( 'double' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:486:1: ( 'double' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:486:3: 'double'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TypeEnum__Alternatives985); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:491:6: ( ( 'boolean' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:491:6: ( ( 'boolean' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:492:1: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:493:1: ( 'boolean' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:493:3: 'boolean'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__TypeEnum__Alternatives1006); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getBooleanEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:498:6: ( ( 'date' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:498:6: ( ( 'date' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:499:1: ( 'date' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getDateEnumLiteralDeclaration_7()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:500:1: ( 'date' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:500:3: 'date'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__TypeEnum__Alternatives1027); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:510:1: rule__CMSEnum__Alternatives : ( ( ( 'Jease' ) ) | ( ( 'N2' ) ) | ( ( 'Concrete5' ) ) | ( ( 'Plone' ) ) );
    public final void rule__CMSEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:514:1: ( ( ( 'Jease' ) ) | ( ( 'N2' ) ) | ( ( 'Concrete5' ) ) | ( ( 'Plone' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:515:1: ( ( 'Jease' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:515:1: ( ( 'Jease' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:516:1: ( 'Jease' )
                    {
                     before(grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:517:1: ( 'Jease' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:517:3: 'Jease'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__CMSEnum__Alternatives1063); 

                    }

                     after(grammarAccess.getCMSEnumAccess().getJeaseEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:522:6: ( ( 'N2' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:522:6: ( ( 'N2' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:523:1: ( 'N2' )
                    {
                     before(grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:524:1: ( 'N2' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:524:3: 'N2'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__CMSEnum__Alternatives1084); 

                    }

                     after(grammarAccess.getCMSEnumAccess().getN2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:529:6: ( ( 'Concrete5' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:529:6: ( ( 'Concrete5' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:530:1: ( 'Concrete5' )
                    {
                     before(grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:531:1: ( 'Concrete5' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:531:3: 'Concrete5'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__CMSEnum__Alternatives1105); 

                    }

                     after(grammarAccess.getCMSEnumAccess().getConcrete5EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:536:6: ( ( 'Plone' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:536:6: ( ( 'Plone' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:537:1: ( 'Plone' )
                    {
                     before(grammarAccess.getCMSEnumAccess().getPloneEnumLiteralDeclaration_3()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:538:1: ( 'Plone' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:538:3: 'Plone'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__CMSEnum__Alternatives1126); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:548:1: rule__AccessLevelEnum__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) );
    public final void rule__AccessLevelEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:552:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:553:1: ( ( 'public' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:553:1: ( ( 'public' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:554:1: ( 'public' )
                    {
                     before(grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:555:1: ( 'public' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:555:3: 'public'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__AccessLevelEnum__Alternatives1162); 

                    }

                     after(grammarAccess.getAccessLevelEnumAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:560:6: ( ( 'private' ) )
                    {
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:560:6: ( ( 'private' ) )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:561:1: ( 'private' )
                    {
                     before(grammarAccess.getAccessLevelEnumAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:562:1: ( 'private' )
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:562:3: 'private'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__AccessLevelEnum__Alternatives1183); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:574:1: rule__ContentModel__Group__0 : rule__ContentModel__Group__0__Impl rule__ContentModel__Group__1 ;
    public final void rule__ContentModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:578:1: ( rule__ContentModel__Group__0__Impl rule__ContentModel__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:579:2: rule__ContentModel__Group__0__Impl rule__ContentModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__0__Impl_in_rule__ContentModel__Group__01216);
            rule__ContentModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__1_in_rule__ContentModel__Group__01219);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:586:1: rule__ContentModel__Group__0__Impl : ( () ) ;
    public final void rule__ContentModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:590:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:591:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:591:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:592:1: ()
            {
             before(grammarAccess.getContentModelAccess().getContentModelAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:593:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:595:1: 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:605:1: rule__ContentModel__Group__1 : rule__ContentModel__Group__1__Impl rule__ContentModel__Group__2 ;
    public final void rule__ContentModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:609:1: ( rule__ContentModel__Group__1__Impl rule__ContentModel__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:610:2: rule__ContentModel__Group__1__Impl rule__ContentModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__1__Impl_in_rule__ContentModel__Group__11277);
            rule__ContentModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__2_in_rule__ContentModel__Group__11280);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:617:1: rule__ContentModel__Group__1__Impl : ( 'ContentModel' ) ;
    public final void rule__ContentModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:621:1: ( ( 'ContentModel' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:622:1: ( 'ContentModel' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:622:1: ( 'ContentModel' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:623:1: 'ContentModel'
            {
             before(grammarAccess.getContentModelAccess().getContentModelKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ContentModel__Group__1__Impl1308); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:636:1: rule__ContentModel__Group__2 : rule__ContentModel__Group__2__Impl rule__ContentModel__Group__3 ;
    public final void rule__ContentModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:640:1: ( rule__ContentModel__Group__2__Impl rule__ContentModel__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:641:2: rule__ContentModel__Group__2__Impl rule__ContentModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__2__Impl_in_rule__ContentModel__Group__21339);
            rule__ContentModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__3_in_rule__ContentModel__Group__21342);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:648:1: rule__ContentModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ContentModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:652:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:653:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:653:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:654:1: '{'
            {
             before(grammarAccess.getContentModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentModel__Group__2__Impl1370); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:667:1: rule__ContentModel__Group__3 : rule__ContentModel__Group__3__Impl rule__ContentModel__Group__4 ;
    public final void rule__ContentModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:671:1: ( rule__ContentModel__Group__3__Impl rule__ContentModel__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:672:2: rule__ContentModel__Group__3__Impl rule__ContentModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__3__Impl_in_rule__ContentModel__Group__31401);
            rule__ContentModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__4_in_rule__ContentModel__Group__31404);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:679:1: rule__ContentModel__Group__3__Impl : ( 'Name' ) ;
    public final void rule__ContentModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:683:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:684:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:684:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:685:1: 'Name'
            {
             before(grammarAccess.getContentModelAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ContentModel__Group__3__Impl1432); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:698:1: rule__ContentModel__Group__4 : rule__ContentModel__Group__4__Impl rule__ContentModel__Group__5 ;
    public final void rule__ContentModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:702:1: ( rule__ContentModel__Group__4__Impl rule__ContentModel__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:703:2: rule__ContentModel__Group__4__Impl rule__ContentModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__4__Impl_in_rule__ContentModel__Group__41463);
            rule__ContentModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__5_in_rule__ContentModel__Group__41466);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:710:1: rule__ContentModel__Group__4__Impl : ( '=' ) ;
    public final void rule__ContentModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:714:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:715:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:715:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:716:1: '='
            {
             before(grammarAccess.getContentModelAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ContentModel__Group__4__Impl1494); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:729:1: rule__ContentModel__Group__5 : rule__ContentModel__Group__5__Impl rule__ContentModel__Group__6 ;
    public final void rule__ContentModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:733:1: ( rule__ContentModel__Group__5__Impl rule__ContentModel__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:734:2: rule__ContentModel__Group__5__Impl rule__ContentModel__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__5__Impl_in_rule__ContentModel__Group__51525);
            rule__ContentModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__6_in_rule__ContentModel__Group__51528);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:741:1: rule__ContentModel__Group__5__Impl : ( ( rule__ContentModel__NameAssignment_5 ) ) ;
    public final void rule__ContentModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:745:1: ( ( ( rule__ContentModel__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:746:1: ( ( rule__ContentModel__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:746:1: ( ( rule__ContentModel__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:747:1: ( rule__ContentModel__NameAssignment_5 )
            {
             before(grammarAccess.getContentModelAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:748:1: ( rule__ContentModel__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:748:2: rule__ContentModel__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__NameAssignment_5_in_rule__ContentModel__Group__5__Impl1555);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:758:1: rule__ContentModel__Group__6 : rule__ContentModel__Group__6__Impl rule__ContentModel__Group__7 ;
    public final void rule__ContentModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:762:1: ( rule__ContentModel__Group__6__Impl rule__ContentModel__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:763:2: rule__ContentModel__Group__6__Impl rule__ContentModel__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__6__Impl_in_rule__ContentModel__Group__61585);
            rule__ContentModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__7_in_rule__ContentModel__Group__61588);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:770:1: rule__ContentModel__Group__6__Impl : ( ( rule__ContentModel__Group_6__0 )? ) ;
    public final void rule__ContentModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:774:1: ( ( ( rule__ContentModel__Group_6__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:775:1: ( ( rule__ContentModel__Group_6__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:775:1: ( ( rule__ContentModel__Group_6__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:776:1: ( rule__ContentModel__Group_6__0 )?
            {
             before(grammarAccess.getContentModelAccess().getGroup_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:777:1: ( rule__ContentModel__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:777:2: rule__ContentModel__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__0_in_rule__ContentModel__Group__6__Impl1615);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:787:1: rule__ContentModel__Group__7 : rule__ContentModel__Group__7__Impl ;
    public final void rule__ContentModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:791:1: ( rule__ContentModel__Group__7__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:792:2: rule__ContentModel__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group__7__Impl_in_rule__ContentModel__Group__71646);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:798:1: rule__ContentModel__Group__7__Impl : ( '}' ) ;
    public final void rule__ContentModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:802:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:803:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:803:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:804:1: '}'
            {
             before(grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentModel__Group__7__Impl1674); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:833:1: rule__ContentModel__Group_6__0 : rule__ContentModel__Group_6__0__Impl rule__ContentModel__Group_6__1 ;
    public final void rule__ContentModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:837:1: ( rule__ContentModel__Group_6__0__Impl rule__ContentModel__Group_6__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:838:2: rule__ContentModel__Group_6__0__Impl rule__ContentModel__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__0__Impl_in_rule__ContentModel__Group_6__01721);
            rule__ContentModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__1_in_rule__ContentModel__Group_6__01724);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:845:1: rule__ContentModel__Group_6__0__Impl : ( 'Contains' ) ;
    public final void rule__ContentModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:849:1: ( ( 'Contains' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:850:1: ( 'Contains' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:850:1: ( 'Contains' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:851:1: 'Contains'
            {
             before(grammarAccess.getContentModelAccess().getContainsKeyword_6_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ContentModel__Group_6__0__Impl1752); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:864:1: rule__ContentModel__Group_6__1 : rule__ContentModel__Group_6__1__Impl rule__ContentModel__Group_6__2 ;
    public final void rule__ContentModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:868:1: ( rule__ContentModel__Group_6__1__Impl rule__ContentModel__Group_6__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:869:2: rule__ContentModel__Group_6__1__Impl rule__ContentModel__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__1__Impl_in_rule__ContentModel__Group_6__11783);
            rule__ContentModel__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__2_in_rule__ContentModel__Group_6__11786);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:876:1: rule__ContentModel__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ContentModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:880:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:881:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:881:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:882:1: '{'
            {
             before(grammarAccess.getContentModelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentModel__Group_6__1__Impl1814); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:895:1: rule__ContentModel__Group_6__2 : rule__ContentModel__Group_6__2__Impl rule__ContentModel__Group_6__3 ;
    public final void rule__ContentModel__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:899:1: ( rule__ContentModel__Group_6__2__Impl rule__ContentModel__Group_6__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:900:2: rule__ContentModel__Group_6__2__Impl rule__ContentModel__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__2__Impl_in_rule__ContentModel__Group_6__21845);
            rule__ContentModel__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__3_in_rule__ContentModel__Group_6__21848);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:907:1: rule__ContentModel__Group_6__2__Impl : ( ( rule__ContentModel__HasElementsAssignment_6_2 ) ) ;
    public final void rule__ContentModel__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:911:1: ( ( ( rule__ContentModel__HasElementsAssignment_6_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:912:1: ( ( rule__ContentModel__HasElementsAssignment_6_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:912:1: ( ( rule__ContentModel__HasElementsAssignment_6_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:913:1: ( rule__ContentModel__HasElementsAssignment_6_2 )
            {
             before(grammarAccess.getContentModelAccess().getHasElementsAssignment_6_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:914:1: ( rule__ContentModel__HasElementsAssignment_6_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:914:2: rule__ContentModel__HasElementsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__HasElementsAssignment_6_2_in_rule__ContentModel__Group_6__2__Impl1875);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:924:1: rule__ContentModel__Group_6__3 : rule__ContentModel__Group_6__3__Impl rule__ContentModel__Group_6__4 ;
    public final void rule__ContentModel__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:928:1: ( rule__ContentModel__Group_6__3__Impl rule__ContentModel__Group_6__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:929:2: rule__ContentModel__Group_6__3__Impl rule__ContentModel__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__3__Impl_in_rule__ContentModel__Group_6__31905);
            rule__ContentModel__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__4_in_rule__ContentModel__Group_6__31908);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:936:1: rule__ContentModel__Group_6__3__Impl : ( ( rule__ContentModel__Group_6_3__0 )* ) ;
    public final void rule__ContentModel__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:940:1: ( ( ( rule__ContentModel__Group_6_3__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:941:1: ( ( rule__ContentModel__Group_6_3__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:941:1: ( ( rule__ContentModel__Group_6_3__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:942:1: ( rule__ContentModel__Group_6_3__0 )*
            {
             before(grammarAccess.getContentModelAccess().getGroup_6_3()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:943:1: ( rule__ContentModel__Group_6_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:943:2: rule__ContentModel__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__0_in_rule__ContentModel__Group_6__3__Impl1935);
            	    rule__ContentModel__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:953:1: rule__ContentModel__Group_6__4 : rule__ContentModel__Group_6__4__Impl ;
    public final void rule__ContentModel__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:957:1: ( rule__ContentModel__Group_6__4__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:958:2: rule__ContentModel__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__4__Impl_in_rule__ContentModel__Group_6__41966);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:964:1: rule__ContentModel__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ContentModel__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:968:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:969:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:969:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:970:1: '}'
            {
             before(grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentModel__Group_6__4__Impl1994); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:993:1: rule__ContentModel__Group_6_3__0 : rule__ContentModel__Group_6_3__0__Impl rule__ContentModel__Group_6_3__1 ;
    public final void rule__ContentModel__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:997:1: ( rule__ContentModel__Group_6_3__0__Impl rule__ContentModel__Group_6_3__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:998:2: rule__ContentModel__Group_6_3__0__Impl rule__ContentModel__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__0__Impl_in_rule__ContentModel__Group_6_3__02035);
            rule__ContentModel__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__1_in_rule__ContentModel__Group_6_3__02038);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1005:1: rule__ContentModel__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ContentModel__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1009:1: ( ( ',' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1010:1: ( ',' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1010:1: ( ',' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1011:1: ','
            {
             before(grammarAccess.getContentModelAccess().getCommaKeyword_6_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentModel__Group_6_3__0__Impl2066); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1024:1: rule__ContentModel__Group_6_3__1 : rule__ContentModel__Group_6_3__1__Impl ;
    public final void rule__ContentModel__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1028:1: ( rule__ContentModel__Group_6_3__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1029:2: rule__ContentModel__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__1__Impl_in_rule__ContentModel__Group_6_3__12097);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1035:1: rule__ContentModel__Group_6_3__1__Impl : ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) ) ;
    public final void rule__ContentModel__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1039:1: ( ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1040:1: ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1040:1: ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1041:1: ( rule__ContentModel__HasElementsAssignment_6_3_1 )
            {
             before(grammarAccess.getContentModelAccess().getHasElementsAssignment_6_3_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1042:1: ( rule__ContentModel__HasElementsAssignment_6_3_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1042:2: rule__ContentModel__HasElementsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__HasElementsAssignment_6_3_1_in_rule__ContentModel__Group_6_3__1__Impl2124);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1056:1: rule__ContentType__Group__0 : rule__ContentType__Group__0__Impl rule__ContentType__Group__1 ;
    public final void rule__ContentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1060:1: ( rule__ContentType__Group__0__Impl rule__ContentType__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1061:2: rule__ContentType__Group__0__Impl rule__ContentType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__0__Impl_in_rule__ContentType__Group__02158);
            rule__ContentType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__1_in_rule__ContentType__Group__02161);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1068:1: rule__ContentType__Group__0__Impl : ( ( rule__ContentType__VisibleAssignment_0 )? ) ;
    public final void rule__ContentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1072:1: ( ( ( rule__ContentType__VisibleAssignment_0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1073:1: ( ( rule__ContentType__VisibleAssignment_0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1073:1: ( ( rule__ContentType__VisibleAssignment_0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1074:1: ( rule__ContentType__VisibleAssignment_0 )?
            {
             before(grammarAccess.getContentTypeAccess().getVisibleAssignment_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1075:1: ( rule__ContentType__VisibleAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==55) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1075:2: rule__ContentType__VisibleAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__VisibleAssignment_0_in_rule__ContentType__Group__0__Impl2188);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1085:1: rule__ContentType__Group__1 : rule__ContentType__Group__1__Impl rule__ContentType__Group__2 ;
    public final void rule__ContentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1089:1: ( rule__ContentType__Group__1__Impl rule__ContentType__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1090:2: rule__ContentType__Group__1__Impl rule__ContentType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__1__Impl_in_rule__ContentType__Group__12219);
            rule__ContentType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__2_in_rule__ContentType__Group__12222);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1097:1: rule__ContentType__Group__1__Impl : ( 'ContentType' ) ;
    public final void rule__ContentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1101:1: ( ( 'ContentType' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1102:1: ( 'ContentType' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1102:1: ( 'ContentType' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1103:1: 'ContentType'
            {
             before(grammarAccess.getContentTypeAccess().getContentTypeKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ContentType__Group__1__Impl2250); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1116:1: rule__ContentType__Group__2 : rule__ContentType__Group__2__Impl rule__ContentType__Group__3 ;
    public final void rule__ContentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1120:1: ( rule__ContentType__Group__2__Impl rule__ContentType__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1121:2: rule__ContentType__Group__2__Impl rule__ContentType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__2__Impl_in_rule__ContentType__Group__22281);
            rule__ContentType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__3_in_rule__ContentType__Group__22284);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1128:1: rule__ContentType__Group__2__Impl : ( '{' ) ;
    public final void rule__ContentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1132:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1133:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1133:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1134:1: '{'
            {
             before(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentType__Group__2__Impl2312); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1147:1: rule__ContentType__Group__3 : rule__ContentType__Group__3__Impl rule__ContentType__Group__4 ;
    public final void rule__ContentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1151:1: ( rule__ContentType__Group__3__Impl rule__ContentType__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1152:2: rule__ContentType__Group__3__Impl rule__ContentType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__3__Impl_in_rule__ContentType__Group__32343);
            rule__ContentType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__4_in_rule__ContentType__Group__32346);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1159:1: rule__ContentType__Group__3__Impl : ( 'Name' ) ;
    public final void rule__ContentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1163:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1164:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1164:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1165:1: 'Name'
            {
             before(grammarAccess.getContentTypeAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ContentType__Group__3__Impl2374); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1178:1: rule__ContentType__Group__4 : rule__ContentType__Group__4__Impl rule__ContentType__Group__5 ;
    public final void rule__ContentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1182:1: ( rule__ContentType__Group__4__Impl rule__ContentType__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1183:2: rule__ContentType__Group__4__Impl rule__ContentType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__4__Impl_in_rule__ContentType__Group__42405);
            rule__ContentType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__5_in_rule__ContentType__Group__42408);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1190:1: rule__ContentType__Group__4__Impl : ( '=' ) ;
    public final void rule__ContentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1194:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1195:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1195:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1196:1: '='
            {
             before(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ContentType__Group__4__Impl2436); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1209:1: rule__ContentType__Group__5 : rule__ContentType__Group__5__Impl rule__ContentType__Group__6 ;
    public final void rule__ContentType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1213:1: ( rule__ContentType__Group__5__Impl rule__ContentType__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1214:2: rule__ContentType__Group__5__Impl rule__ContentType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__5__Impl_in_rule__ContentType__Group__52467);
            rule__ContentType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__6_in_rule__ContentType__Group__52470);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1221:1: rule__ContentType__Group__5__Impl : ( ( rule__ContentType__NameAssignment_5 ) ) ;
    public final void rule__ContentType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1225:1: ( ( ( rule__ContentType__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1226:1: ( ( rule__ContentType__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1226:1: ( ( rule__ContentType__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1227:1: ( rule__ContentType__NameAssignment_5 )
            {
             before(grammarAccess.getContentTypeAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1228:1: ( rule__ContentType__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1228:2: rule__ContentType__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__NameAssignment_5_in_rule__ContentType__Group__5__Impl2497);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1238:1: rule__ContentType__Group__6 : rule__ContentType__Group__6__Impl rule__ContentType__Group__7 ;
    public final void rule__ContentType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1242:1: ( rule__ContentType__Group__6__Impl rule__ContentType__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1243:2: rule__ContentType__Group__6__Impl rule__ContentType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__6__Impl_in_rule__ContentType__Group__62527);
            rule__ContentType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__7_in_rule__ContentType__Group__62530);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1250:1: rule__ContentType__Group__6__Impl : ( ( rule__ContentType__Group_6__0 )? ) ;
    public final void rule__ContentType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1254:1: ( ( ( rule__ContentType__Group_6__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1255:1: ( ( rule__ContentType__Group_6__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1255:1: ( ( rule__ContentType__Group_6__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1256:1: ( rule__ContentType__Group_6__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1257:1: ( rule__ContentType__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1257:2: rule__ContentType__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__0_in_rule__ContentType__Group__6__Impl2557);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1267:1: rule__ContentType__Group__7 : rule__ContentType__Group__7__Impl rule__ContentType__Group__8 ;
    public final void rule__ContentType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1271:1: ( rule__ContentType__Group__7__Impl rule__ContentType__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1272:2: rule__ContentType__Group__7__Impl rule__ContentType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__7__Impl_in_rule__ContentType__Group__72588);
            rule__ContentType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__8_in_rule__ContentType__Group__72591);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1279:1: rule__ContentType__Group__7__Impl : ( 'hasProperties' ) ;
    public final void rule__ContentType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1283:1: ( ( 'hasProperties' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1284:1: ( 'hasProperties' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1284:1: ( 'hasProperties' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1285:1: 'hasProperties'
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesKeyword_7()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ContentType__Group__7__Impl2619); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1298:1: rule__ContentType__Group__8 : rule__ContentType__Group__8__Impl rule__ContentType__Group__9 ;
    public final void rule__ContentType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1302:1: ( rule__ContentType__Group__8__Impl rule__ContentType__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1303:2: rule__ContentType__Group__8__Impl rule__ContentType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__8__Impl_in_rule__ContentType__Group__82650);
            rule__ContentType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__9_in_rule__ContentType__Group__82653);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1310:1: rule__ContentType__Group__8__Impl : ( '{' ) ;
    public final void rule__ContentType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1314:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1315:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1315:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1316:1: '{'
            {
             before(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentType__Group__8__Impl2681); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1329:1: rule__ContentType__Group__9 : rule__ContentType__Group__9__Impl rule__ContentType__Group__10 ;
    public final void rule__ContentType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1333:1: ( rule__ContentType__Group__9__Impl rule__ContentType__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1334:2: rule__ContentType__Group__9__Impl rule__ContentType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__9__Impl_in_rule__ContentType__Group__92712);
            rule__ContentType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__10_in_rule__ContentType__Group__92715);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1341:1: rule__ContentType__Group__9__Impl : ( ( rule__ContentType__HasPropertiesAssignment_9 ) ) ;
    public final void rule__ContentType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1345:1: ( ( ( rule__ContentType__HasPropertiesAssignment_9 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1346:1: ( ( rule__ContentType__HasPropertiesAssignment_9 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1346:1: ( ( rule__ContentType__HasPropertiesAssignment_9 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1347:1: ( rule__ContentType__HasPropertiesAssignment_9 )
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_9()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1348:1: ( rule__ContentType__HasPropertiesAssignment_9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1348:2: rule__ContentType__HasPropertiesAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasPropertiesAssignment_9_in_rule__ContentType__Group__9__Impl2742);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1358:1: rule__ContentType__Group__10 : rule__ContentType__Group__10__Impl rule__ContentType__Group__11 ;
    public final void rule__ContentType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1362:1: ( rule__ContentType__Group__10__Impl rule__ContentType__Group__11 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1363:2: rule__ContentType__Group__10__Impl rule__ContentType__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__10__Impl_in_rule__ContentType__Group__102772);
            rule__ContentType__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__11_in_rule__ContentType__Group__102775);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1370:1: rule__ContentType__Group__10__Impl : ( ( rule__ContentType__Group_10__0 )* ) ;
    public final void rule__ContentType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1374:1: ( ( ( rule__ContentType__Group_10__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1375:1: ( ( rule__ContentType__Group_10__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1375:1: ( ( rule__ContentType__Group_10__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1376:1: ( rule__ContentType__Group_10__0 )*
            {
             before(grammarAccess.getContentTypeAccess().getGroup_10()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1377:1: ( rule__ContentType__Group_10__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1377:2: rule__ContentType__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_10__0_in_rule__ContentType__Group__10__Impl2802);
            	    rule__ContentType__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1387:1: rule__ContentType__Group__11 : rule__ContentType__Group__11__Impl rule__ContentType__Group__12 ;
    public final void rule__ContentType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1391:1: ( rule__ContentType__Group__11__Impl rule__ContentType__Group__12 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1392:2: rule__ContentType__Group__11__Impl rule__ContentType__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__11__Impl_in_rule__ContentType__Group__112833);
            rule__ContentType__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__12_in_rule__ContentType__Group__112836);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1399:1: rule__ContentType__Group__11__Impl : ( '}' ) ;
    public final void rule__ContentType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1403:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1404:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1404:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1405:1: '}'
            {
             before(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentType__Group__11__Impl2864); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1418:1: rule__ContentType__Group__12 : rule__ContentType__Group__12__Impl rule__ContentType__Group__13 ;
    public final void rule__ContentType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1422:1: ( rule__ContentType__Group__12__Impl rule__ContentType__Group__13 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1423:2: rule__ContentType__Group__12__Impl rule__ContentType__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__12__Impl_in_rule__ContentType__Group__122895);
            rule__ContentType__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__13_in_rule__ContentType__Group__122898);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1430:1: rule__ContentType__Group__12__Impl : ( ( rule__ContentType__Group_12__0 )? ) ;
    public final void rule__ContentType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1434:1: ( ( ( rule__ContentType__Group_12__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1435:1: ( ( rule__ContentType__Group_12__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1435:1: ( ( rule__ContentType__Group_12__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1436:1: ( rule__ContentType__Group_12__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_12()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1437:1: ( rule__ContentType__Group_12__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1437:2: rule__ContentType__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__0_in_rule__ContentType__Group__12__Impl2925);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1447:1: rule__ContentType__Group__13 : rule__ContentType__Group__13__Impl rule__ContentType__Group__14 ;
    public final void rule__ContentType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1451:1: ( rule__ContentType__Group__13__Impl rule__ContentType__Group__14 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1452:2: rule__ContentType__Group__13__Impl rule__ContentType__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__13__Impl_in_rule__ContentType__Group__132956);
            rule__ContentType__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__14_in_rule__ContentType__Group__132959);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1459:1: rule__ContentType__Group__13__Impl : ( ( rule__ContentType__Group_13__0 )? ) ;
    public final void rule__ContentType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1463:1: ( ( ( rule__ContentType__Group_13__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1464:1: ( ( rule__ContentType__Group_13__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1464:1: ( ( rule__ContentType__Group_13__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1465:1: ( rule__ContentType__Group_13__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_13()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1466:1: ( rule__ContentType__Group_13__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1466:2: rule__ContentType__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__0_in_rule__ContentType__Group__13__Impl2986);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1476:1: rule__ContentType__Group__14 : rule__ContentType__Group__14__Impl ;
    public final void rule__ContentType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1480:1: ( rule__ContentType__Group__14__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1481:2: rule__ContentType__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__14__Impl_in_rule__ContentType__Group__143017);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1487:1: rule__ContentType__Group__14__Impl : ( '}' ) ;
    public final void rule__ContentType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1491:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1492:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1492:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1493:1: '}'
            {
             before(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentType__Group__14__Impl3045); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1536:1: rule__ContentType__Group_6__0 : rule__ContentType__Group_6__0__Impl rule__ContentType__Group_6__1 ;
    public final void rule__ContentType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1540:1: ( rule__ContentType__Group_6__0__Impl rule__ContentType__Group_6__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1541:2: rule__ContentType__Group_6__0__Impl rule__ContentType__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__0__Impl_in_rule__ContentType__Group_6__03106);
            rule__ContentType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__1_in_rule__ContentType__Group_6__03109);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1548:1: rule__ContentType__Group_6__0__Impl : ( 'guid' ) ;
    public final void rule__ContentType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1552:1: ( ( 'guid' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1553:1: ( 'guid' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1553:1: ( 'guid' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1554:1: 'guid'
            {
             before(grammarAccess.getContentTypeAccess().getGuidKeyword_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ContentType__Group_6__0__Impl3137); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1567:1: rule__ContentType__Group_6__1 : rule__ContentType__Group_6__1__Impl rule__ContentType__Group_6__2 ;
    public final void rule__ContentType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1571:1: ( rule__ContentType__Group_6__1__Impl rule__ContentType__Group_6__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1572:2: rule__ContentType__Group_6__1__Impl rule__ContentType__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__1__Impl_in_rule__ContentType__Group_6__13168);
            rule__ContentType__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__2_in_rule__ContentType__Group_6__13171);
            rule__ContentType__Group_6__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1579:1: rule__ContentType__Group_6__1__Impl : ( '=' ) ;
    public final void rule__ContentType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1583:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1584:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1584:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1585:1: '='
            {
             before(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_6_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ContentType__Group_6__1__Impl3199); 
             after(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_6_1()); 

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


    // $ANTLR start "rule__ContentType__Group_6__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1598:1: rule__ContentType__Group_6__2 : rule__ContentType__Group_6__2__Impl ;
    public final void rule__ContentType__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1602:1: ( rule__ContentType__Group_6__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1603:2: rule__ContentType__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_6__2__Impl_in_rule__ContentType__Group_6__23230);
            rule__ContentType__Group_6__2__Impl();

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
    // $ANTLR end "rule__ContentType__Group_6__2"


    // $ANTLR start "rule__ContentType__Group_6__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1609:1: rule__ContentType__Group_6__2__Impl : ( ( rule__ContentType__GuidAssignment_6_2 ) ) ;
    public final void rule__ContentType__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1613:1: ( ( ( rule__ContentType__GuidAssignment_6_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1614:1: ( ( rule__ContentType__GuidAssignment_6_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1614:1: ( ( rule__ContentType__GuidAssignment_6_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1615:1: ( rule__ContentType__GuidAssignment_6_2 )
            {
             before(grammarAccess.getContentTypeAccess().getGuidAssignment_6_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1616:1: ( rule__ContentType__GuidAssignment_6_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1616:2: rule__ContentType__GuidAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__GuidAssignment_6_2_in_rule__ContentType__Group_6__2__Impl3257);
            rule__ContentType__GuidAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getGuidAssignment_6_2()); 

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
    // $ANTLR end "rule__ContentType__Group_6__2__Impl"


    // $ANTLR start "rule__ContentType__Group_10__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1632:1: rule__ContentType__Group_10__0 : rule__ContentType__Group_10__0__Impl rule__ContentType__Group_10__1 ;
    public final void rule__ContentType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1636:1: ( rule__ContentType__Group_10__0__Impl rule__ContentType__Group_10__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1637:2: rule__ContentType__Group_10__0__Impl rule__ContentType__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_10__0__Impl_in_rule__ContentType__Group_10__03293);
            rule__ContentType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_10__1_in_rule__ContentType__Group_10__03296);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1644:1: rule__ContentType__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ContentType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1648:1: ( ( ',' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1649:1: ( ',' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1649:1: ( ',' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1650:1: ','
            {
             before(grammarAccess.getContentTypeAccess().getCommaKeyword_10_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentType__Group_10__0__Impl3324); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1663:1: rule__ContentType__Group_10__1 : rule__ContentType__Group_10__1__Impl ;
    public final void rule__ContentType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1667:1: ( rule__ContentType__Group_10__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1668:2: rule__ContentType__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_10__1__Impl_in_rule__ContentType__Group_10__13355);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1674:1: rule__ContentType__Group_10__1__Impl : ( ( rule__ContentType__HasPropertiesAssignment_10_1 ) ) ;
    public final void rule__ContentType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1678:1: ( ( ( rule__ContentType__HasPropertiesAssignment_10_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1679:1: ( ( rule__ContentType__HasPropertiesAssignment_10_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1679:1: ( ( rule__ContentType__HasPropertiesAssignment_10_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1680:1: ( rule__ContentType__HasPropertiesAssignment_10_1 )
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_10_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1681:1: ( rule__ContentType__HasPropertiesAssignment_10_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1681:2: rule__ContentType__HasPropertiesAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasPropertiesAssignment_10_1_in_rule__ContentType__Group_10__1__Impl3382);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1695:1: rule__ContentType__Group_12__0 : rule__ContentType__Group_12__0__Impl rule__ContentType__Group_12__1 ;
    public final void rule__ContentType__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1699:1: ( rule__ContentType__Group_12__0__Impl rule__ContentType__Group_12__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1700:2: rule__ContentType__Group_12__0__Impl rule__ContentType__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__0__Impl_in_rule__ContentType__Group_12__03416);
            rule__ContentType__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__1_in_rule__ContentType__Group_12__03419);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1707:1: rule__ContentType__Group_12__0__Impl : ( 'hasVersions' ) ;
    public final void rule__ContentType__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1711:1: ( ( 'hasVersions' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1712:1: ( 'hasVersions' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1712:1: ( 'hasVersions' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1713:1: 'hasVersions'
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsKeyword_12_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ContentType__Group_12__0__Impl3447); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1726:1: rule__ContentType__Group_12__1 : rule__ContentType__Group_12__1__Impl rule__ContentType__Group_12__2 ;
    public final void rule__ContentType__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1730:1: ( rule__ContentType__Group_12__1__Impl rule__ContentType__Group_12__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1731:2: rule__ContentType__Group_12__1__Impl rule__ContentType__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__1__Impl_in_rule__ContentType__Group_12__13478);
            rule__ContentType__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__2_in_rule__ContentType__Group_12__13481);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1738:1: rule__ContentType__Group_12__1__Impl : ( '{' ) ;
    public final void rule__ContentType__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1742:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1743:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1743:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1744:1: '{'
            {
             before(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentType__Group_12__1__Impl3509); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1757:1: rule__ContentType__Group_12__2 : rule__ContentType__Group_12__2__Impl rule__ContentType__Group_12__3 ;
    public final void rule__ContentType__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1761:1: ( rule__ContentType__Group_12__2__Impl rule__ContentType__Group_12__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1762:2: rule__ContentType__Group_12__2__Impl rule__ContentType__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__2__Impl_in_rule__ContentType__Group_12__23540);
            rule__ContentType__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__3_in_rule__ContentType__Group_12__23543);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1769:1: rule__ContentType__Group_12__2__Impl : ( ( rule__ContentType__HasVersionsAssignment_12_2 ) ) ;
    public final void rule__ContentType__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1773:1: ( ( ( rule__ContentType__HasVersionsAssignment_12_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1774:1: ( ( rule__ContentType__HasVersionsAssignment_12_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1774:1: ( ( rule__ContentType__HasVersionsAssignment_12_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1775:1: ( rule__ContentType__HasVersionsAssignment_12_2 )
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_12_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1776:1: ( rule__ContentType__HasVersionsAssignment_12_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1776:2: rule__ContentType__HasVersionsAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasVersionsAssignment_12_2_in_rule__ContentType__Group_12__2__Impl3570);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1786:1: rule__ContentType__Group_12__3 : rule__ContentType__Group_12__3__Impl rule__ContentType__Group_12__4 ;
    public final void rule__ContentType__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1790:1: ( rule__ContentType__Group_12__3__Impl rule__ContentType__Group_12__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1791:2: rule__ContentType__Group_12__3__Impl rule__ContentType__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__3__Impl_in_rule__ContentType__Group_12__33600);
            rule__ContentType__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__4_in_rule__ContentType__Group_12__33603);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1798:1: rule__ContentType__Group_12__3__Impl : ( ( rule__ContentType__Group_12_3__0 )* ) ;
    public final void rule__ContentType__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1802:1: ( ( ( rule__ContentType__Group_12_3__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1803:1: ( ( rule__ContentType__Group_12_3__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1803:1: ( ( rule__ContentType__Group_12_3__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1804:1: ( rule__ContentType__Group_12_3__0 )*
            {
             before(grammarAccess.getContentTypeAccess().getGroup_12_3()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1805:1: ( rule__ContentType__Group_12_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1805:2: rule__ContentType__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12_3__0_in_rule__ContentType__Group_12__3__Impl3630);
            	    rule__ContentType__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1815:1: rule__ContentType__Group_12__4 : rule__ContentType__Group_12__4__Impl ;
    public final void rule__ContentType__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1819:1: ( rule__ContentType__Group_12__4__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1820:2: rule__ContentType__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__4__Impl_in_rule__ContentType__Group_12__43661);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1826:1: rule__ContentType__Group_12__4__Impl : ( '}' ) ;
    public final void rule__ContentType__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1830:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1831:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1831:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1832:1: '}'
            {
             before(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentType__Group_12__4__Impl3689); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1855:1: rule__ContentType__Group_12_3__0 : rule__ContentType__Group_12_3__0__Impl rule__ContentType__Group_12_3__1 ;
    public final void rule__ContentType__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1859:1: ( rule__ContentType__Group_12_3__0__Impl rule__ContentType__Group_12_3__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1860:2: rule__ContentType__Group_12_3__0__Impl rule__ContentType__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12_3__0__Impl_in_rule__ContentType__Group_12_3__03730);
            rule__ContentType__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12_3__1_in_rule__ContentType__Group_12_3__03733);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1867:1: rule__ContentType__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__ContentType__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1871:1: ( ( ',' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1872:1: ( ',' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1872:1: ( ',' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1873:1: ','
            {
             before(grammarAccess.getContentTypeAccess().getCommaKeyword_12_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentType__Group_12_3__0__Impl3761); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1886:1: rule__ContentType__Group_12_3__1 : rule__ContentType__Group_12_3__1__Impl ;
    public final void rule__ContentType__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1890:1: ( rule__ContentType__Group_12_3__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1891:2: rule__ContentType__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12_3__1__Impl_in_rule__ContentType__Group_12_3__13792);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1897:1: rule__ContentType__Group_12_3__1__Impl : ( ( rule__ContentType__HasVersionsAssignment_12_3_1 ) ) ;
    public final void rule__ContentType__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1901:1: ( ( ( rule__ContentType__HasVersionsAssignment_12_3_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1902:1: ( ( rule__ContentType__HasVersionsAssignment_12_3_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1902:1: ( ( rule__ContentType__HasVersionsAssignment_12_3_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1903:1: ( rule__ContentType__HasVersionsAssignment_12_3_1 )
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_12_3_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1904:1: ( rule__ContentType__HasVersionsAssignment_12_3_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1904:2: rule__ContentType__HasVersionsAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasVersionsAssignment_12_3_1_in_rule__ContentType__Group_12_3__1__Impl3819);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1918:1: rule__ContentType__Group_13__0 : rule__ContentType__Group_13__0__Impl rule__ContentType__Group_13__1 ;
    public final void rule__ContentType__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1922:1: ( rule__ContentType__Group_13__0__Impl rule__ContentType__Group_13__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1923:2: rule__ContentType__Group_13__0__Impl rule__ContentType__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__0__Impl_in_rule__ContentType__Group_13__03853);
            rule__ContentType__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__1_in_rule__ContentType__Group_13__03856);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1930:1: rule__ContentType__Group_13__0__Impl : ( 'modifiedBy' ) ;
    public final void rule__ContentType__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1934:1: ( ( 'modifiedBy' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1935:1: ( 'modifiedBy' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1935:1: ( 'modifiedBy' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1936:1: 'modifiedBy'
            {
             before(grammarAccess.getContentTypeAccess().getModifiedByKeyword_13_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ContentType__Group_13__0__Impl3884); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1949:1: rule__ContentType__Group_13__1 : rule__ContentType__Group_13__1__Impl rule__ContentType__Group_13__2 ;
    public final void rule__ContentType__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1953:1: ( rule__ContentType__Group_13__1__Impl rule__ContentType__Group_13__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1954:2: rule__ContentType__Group_13__1__Impl rule__ContentType__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__1__Impl_in_rule__ContentType__Group_13__13915);
            rule__ContentType__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__2_in_rule__ContentType__Group_13__13918);
            rule__ContentType__Group_13__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1961:1: rule__ContentType__Group_13__1__Impl : ( '=' ) ;
    public final void rule__ContentType__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1965:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1966:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1966:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1967:1: '='
            {
             before(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_13_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ContentType__Group_13__1__Impl3946); 
             after(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_13_1()); 

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


    // $ANTLR start "rule__ContentType__Group_13__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1980:1: rule__ContentType__Group_13__2 : rule__ContentType__Group_13__2__Impl ;
    public final void rule__ContentType__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1984:1: ( rule__ContentType__Group_13__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1985:2: rule__ContentType__Group_13__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__2__Impl_in_rule__ContentType__Group_13__23977);
            rule__ContentType__Group_13__2__Impl();

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
    // $ANTLR end "rule__ContentType__Group_13__2"


    // $ANTLR start "rule__ContentType__Group_13__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1991:1: rule__ContentType__Group_13__2__Impl : ( ( rule__ContentType__ModifiedByAssignment_13_2 ) ) ;
    public final void rule__ContentType__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1995:1: ( ( ( rule__ContentType__ModifiedByAssignment_13_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1996:1: ( ( rule__ContentType__ModifiedByAssignment_13_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1996:1: ( ( rule__ContentType__ModifiedByAssignment_13_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1997:1: ( rule__ContentType__ModifiedByAssignment_13_2 )
            {
             before(grammarAccess.getContentTypeAccess().getModifiedByAssignment_13_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1998:1: ( rule__ContentType__ModifiedByAssignment_13_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1998:2: rule__ContentType__ModifiedByAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__ModifiedByAssignment_13_2_in_rule__ContentType__Group_13__2__Impl4004);
            rule__ContentType__ModifiedByAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getModifiedByAssignment_13_2()); 

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
    // $ANTLR end "rule__ContentType__Group_13__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2014:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2018:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2019:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04040);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04043);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2026:1: rule__Property__Group__0__Impl : ( 'Property' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2030:1: ( ( 'Property' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2031:1: ( 'Property' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2031:1: ( 'Property' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2032:1: 'Property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Property__Group__0__Impl4071); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2045:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2049:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2050:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14102);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14105);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2057:1: rule__Property__Group__1__Impl : ( '{' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2061:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2062:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2062:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2063:1: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Property__Group__1__Impl4133); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2076:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2080:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2081:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24164);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24167);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2088:1: rule__Property__Group__2__Impl : ( 'Name' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2092:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2093:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2093:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2094:1: 'Name'
            {
             before(grammarAccess.getPropertyAccess().getNameKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Property__Group__2__Impl4195); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2107:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2111:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2112:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34226);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34229);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2119:1: rule__Property__Group__3__Impl : ( '=' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2123:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2124:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2124:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2125:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Property__Group__3__Impl4257); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2138:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2142:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2143:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44288);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5_in_rule__Property__Group__44291);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2150:1: rule__Property__Group__4__Impl : ( ( rule__Property__NameAssignment_4 ) ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2154:1: ( ( ( rule__Property__NameAssignment_4 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2155:1: ( ( rule__Property__NameAssignment_4 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2155:1: ( ( rule__Property__NameAssignment_4 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2156:1: ( rule__Property__NameAssignment_4 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_4()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2157:1: ( rule__Property__NameAssignment_4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2157:2: rule__Property__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__NameAssignment_4_in_rule__Property__Group__4__Impl4318);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2167:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2171:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2172:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__54348);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6_in_rule__Property__Group__54351);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2179:1: rule__Property__Group__5__Impl : ( 'accessModifer' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2183:1: ( ( 'accessModifer' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2184:1: ( 'accessModifer' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2184:1: ( 'accessModifer' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2185:1: 'accessModifer'
            {
             before(grammarAccess.getPropertyAccess().getAccessModiferKeyword_5()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Property__Group__5__Impl4379); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2198:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2202:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2203:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__64410);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7_in_rule__Property__Group__64413);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2210:1: rule__Property__Group__6__Impl : ( '=' ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2214:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2215:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2215:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2216:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_6()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Property__Group__6__Impl4441); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_6()); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2229:1: rule__Property__Group__7 : rule__Property__Group__7__Impl rule__Property__Group__8 ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2233:1: ( rule__Property__Group__7__Impl rule__Property__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2234:2: rule__Property__Group__7__Impl rule__Property__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__74472);
            rule__Property__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__8_in_rule__Property__Group__74475);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2241:1: rule__Property__Group__7__Impl : ( ( rule__Property__AccessModiferAssignment_7 ) ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2245:1: ( ( ( rule__Property__AccessModiferAssignment_7 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2246:1: ( ( rule__Property__AccessModiferAssignment_7 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2246:1: ( ( rule__Property__AccessModiferAssignment_7 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2247:1: ( rule__Property__AccessModiferAssignment_7 )
            {
             before(grammarAccess.getPropertyAccess().getAccessModiferAssignment_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2248:1: ( rule__Property__AccessModiferAssignment_7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2248:2: rule__Property__AccessModiferAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__AccessModiferAssignment_7_in_rule__Property__Group__7__Impl4502);
            rule__Property__AccessModiferAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAccessModiferAssignment_7()); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2258:1: rule__Property__Group__8 : rule__Property__Group__8__Impl rule__Property__Group__9 ;
    public final void rule__Property__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2262:1: ( rule__Property__Group__8__Impl rule__Property__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2263:2: rule__Property__Group__8__Impl rule__Property__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__8__Impl_in_rule__Property__Group__84532);
            rule__Property__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__9_in_rule__Property__Group__84535);
            rule__Property__Group__9();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2270:1: rule__Property__Group__8__Impl : ( ( rule__Property__Group_8__0 )? ) ;
    public final void rule__Property__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2274:1: ( ( ( rule__Property__Group_8__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2275:1: ( ( rule__Property__Group_8__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2275:1: ( ( rule__Property__Group_8__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2276:1: ( rule__Property__Group_8__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_8()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2277:1: ( rule__Property__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2277:2: rule__Property__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_8__0_in_rule__Property__Group__8__Impl4562);
                    rule__Property__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_8()); 

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


    // $ANTLR start "rule__Property__Group__9"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2287:1: rule__Property__Group__9 : rule__Property__Group__9__Impl ;
    public final void rule__Property__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2291:1: ( rule__Property__Group__9__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2292:2: rule__Property__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__9__Impl_in_rule__Property__Group__94593);
            rule__Property__Group__9__Impl();

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
    // $ANTLR end "rule__Property__Group__9"


    // $ANTLR start "rule__Property__Group__9__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2298:1: rule__Property__Group__9__Impl : ( '}' ) ;
    public final void rule__Property__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2302:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2303:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2303:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2304:1: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_9()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Property__Group__9__Impl4621); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Property__Group__9__Impl"


    // $ANTLR start "rule__Property__Group_8__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2337:1: rule__Property__Group_8__0 : rule__Property__Group_8__0__Impl rule__Property__Group_8__1 ;
    public final void rule__Property__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2341:1: ( rule__Property__Group_8__0__Impl rule__Property__Group_8__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2342:2: rule__Property__Group_8__0__Impl rule__Property__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_8__0__Impl_in_rule__Property__Group_8__04672);
            rule__Property__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_8__1_in_rule__Property__Group_8__04675);
            rule__Property__Group_8__1();

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
    // $ANTLR end "rule__Property__Group_8__0"


    // $ANTLR start "rule__Property__Group_8__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2349:1: rule__Property__Group_8__0__Impl : ( 'Type' ) ;
    public final void rule__Property__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2353:1: ( ( 'Type' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2354:1: ( 'Type' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2354:1: ( 'Type' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2355:1: 'Type'
            {
             before(grammarAccess.getPropertyAccess().getTypeKeyword_8_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Property__Group_8__0__Impl4703); 
             after(grammarAccess.getPropertyAccess().getTypeKeyword_8_0()); 

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
    // $ANTLR end "rule__Property__Group_8__0__Impl"


    // $ANTLR start "rule__Property__Group_8__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2368:1: rule__Property__Group_8__1 : rule__Property__Group_8__1__Impl rule__Property__Group_8__2 ;
    public final void rule__Property__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2372:1: ( rule__Property__Group_8__1__Impl rule__Property__Group_8__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2373:2: rule__Property__Group_8__1__Impl rule__Property__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_8__1__Impl_in_rule__Property__Group_8__14734);
            rule__Property__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_8__2_in_rule__Property__Group_8__14737);
            rule__Property__Group_8__2();

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
    // $ANTLR end "rule__Property__Group_8__1"


    // $ANTLR start "rule__Property__Group_8__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2380:1: rule__Property__Group_8__1__Impl : ( '=' ) ;
    public final void rule__Property__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2384:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2385:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2385:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2386:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_8_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Property__Group_8__1__Impl4765); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_8_1()); 

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
    // $ANTLR end "rule__Property__Group_8__1__Impl"


    // $ANTLR start "rule__Property__Group_8__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2399:1: rule__Property__Group_8__2 : rule__Property__Group_8__2__Impl ;
    public final void rule__Property__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2403:1: ( rule__Property__Group_8__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2404:2: rule__Property__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_8__2__Impl_in_rule__Property__Group_8__24796);
            rule__Property__Group_8__2__Impl();

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
    // $ANTLR end "rule__Property__Group_8__2"


    // $ANTLR start "rule__Property__Group_8__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2410:1: rule__Property__Group_8__2__Impl : ( ( rule__Property__TypeAssignment_8_2 ) ) ;
    public final void rule__Property__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2414:1: ( ( ( rule__Property__TypeAssignment_8_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2415:1: ( ( rule__Property__TypeAssignment_8_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2415:1: ( ( rule__Property__TypeAssignment_8_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2416:1: ( rule__Property__TypeAssignment_8_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_8_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2417:1: ( rule__Property__TypeAssignment_8_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2417:2: rule__Property__TypeAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__TypeAssignment_8_2_in_rule__Property__Group_8__2__Impl4823);
            rule__Property__TypeAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_8_2()); 

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
    // $ANTLR end "rule__Property__Group_8__2__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2433:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2437:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2438:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__04859);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1_in_rule__Role__Group__04862);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2445:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2449:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2450:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2450:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2451:1: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2452:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2454:1: 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2464:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2468:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2469:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__14920);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2_in_rule__Role__Group__14923);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2476:1: rule__Role__Group__1__Impl : ( ( rule__Role__IsAdminAssignment_1 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2480:1: ( ( ( rule__Role__IsAdminAssignment_1 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2481:1: ( ( rule__Role__IsAdminAssignment_1 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2481:1: ( ( rule__Role__IsAdminAssignment_1 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2482:1: ( rule__Role__IsAdminAssignment_1 )?
            {
             before(grammarAccess.getRoleAccess().getIsAdminAssignment_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2483:1: ( rule__Role__IsAdminAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==56) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2483:2: rule__Role__IsAdminAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Role__IsAdminAssignment_1_in_rule__Role__Group__1__Impl4950);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2493:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2497:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2498:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__24981);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__3_in_rule__Role__Group__24984);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2505:1: rule__Role__Group__2__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2509:1: ( ( 'Role' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2510:1: ( 'Role' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2510:1: ( 'Role' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2511:1: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_2()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Role__Group__2__Impl5012); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2524:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2528:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2529:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__35043);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__4_in_rule__Role__Group__35046);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2536:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2540:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2541:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2541:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2542:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Role__Group__3__Impl5074); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2555:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2559:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2560:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__45105);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__5_in_rule__Role__Group__45108);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2567:1: rule__Role__Group__4__Impl : ( 'Name' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2571:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2572:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2572:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2573:1: 'Name'
            {
             before(grammarAccess.getRoleAccess().getNameKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Role__Group__4__Impl5136); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2586:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2590:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2591:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__55167);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__6_in_rule__Role__Group__55170);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2598:1: rule__Role__Group__5__Impl : ( '=' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2602:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2603:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2603:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2604:1: '='
            {
             before(grammarAccess.getRoleAccess().getEqualsSignKeyword_5()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Role__Group__5__Impl5198); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2617:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2621:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2622:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__65229);
            rule__Role__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__7_in_rule__Role__Group__65232);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2629:1: rule__Role__Group__6__Impl : ( ( rule__Role__NameAssignment_6 ) ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2633:1: ( ( ( rule__Role__NameAssignment_6 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2634:1: ( ( rule__Role__NameAssignment_6 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2634:1: ( ( rule__Role__NameAssignment_6 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2635:1: ( rule__Role__NameAssignment_6 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2636:1: ( rule__Role__NameAssignment_6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2636:2: rule__Role__NameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__NameAssignment_6_in_rule__Role__Group__6__Impl5259);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2646:1: rule__Role__Group__7 : rule__Role__Group__7__Impl rule__Role__Group__8 ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2650:1: ( rule__Role__Group__7__Impl rule__Role__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2651:2: rule__Role__Group__7__Impl rule__Role__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__75289);
            rule__Role__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__8_in_rule__Role__Group__75292);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2658:1: rule__Role__Group__7__Impl : ( ( rule__Role__Group_7__0 )? ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2662:1: ( ( ( rule__Role__Group_7__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2663:1: ( ( rule__Role__Group_7__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2663:1: ( ( rule__Role__Group_7__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2664:1: ( rule__Role__Group_7__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2665:1: ( rule__Role__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2665:2: rule__Role__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__0_in_rule__Role__Group__7__Impl5319);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2675:1: rule__Role__Group__8 : rule__Role__Group__8__Impl ;
    public final void rule__Role__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2679:1: ( rule__Role__Group__8__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2680:2: rule__Role__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__8__Impl_in_rule__Role__Group__85350);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2686:1: rule__Role__Group__8__Impl : ( '}' ) ;
    public final void rule__Role__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2690:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2691:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2691:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2692:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Role__Group__8__Impl5378); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2723:1: rule__Role__Group_7__0 : rule__Role__Group_7__0__Impl rule__Role__Group_7__1 ;
    public final void rule__Role__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2727:1: ( rule__Role__Group_7__0__Impl rule__Role__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2728:2: rule__Role__Group_7__0__Impl rule__Role__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__0__Impl_in_rule__Role__Group_7__05427);
            rule__Role__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__1_in_rule__Role__Group_7__05430);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2735:1: rule__Role__Group_7__0__Impl : ( 'types' ) ;
    public final void rule__Role__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2739:1: ( ( 'types' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2740:1: ( 'types' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2740:1: ( 'types' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2741:1: 'types'
            {
             before(grammarAccess.getRoleAccess().getTypesKeyword_7_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Role__Group_7__0__Impl5458); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2754:1: rule__Role__Group_7__1 : rule__Role__Group_7__1__Impl rule__Role__Group_7__2 ;
    public final void rule__Role__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2758:1: ( rule__Role__Group_7__1__Impl rule__Role__Group_7__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2759:2: rule__Role__Group_7__1__Impl rule__Role__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__1__Impl_in_rule__Role__Group_7__15489);
            rule__Role__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__2_in_rule__Role__Group_7__15492);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2766:1: rule__Role__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Role__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2770:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2771:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2771:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2772:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Role__Group_7__1__Impl5520); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2785:1: rule__Role__Group_7__2 : rule__Role__Group_7__2__Impl rule__Role__Group_7__3 ;
    public final void rule__Role__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2789:1: ( rule__Role__Group_7__2__Impl rule__Role__Group_7__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2790:2: rule__Role__Group_7__2__Impl rule__Role__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__2__Impl_in_rule__Role__Group_7__25551);
            rule__Role__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__3_in_rule__Role__Group_7__25554);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2797:1: rule__Role__Group_7__2__Impl : ( ( rule__Role__TypesAssignment_7_2 ) ) ;
    public final void rule__Role__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2801:1: ( ( ( rule__Role__TypesAssignment_7_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2802:1: ( ( rule__Role__TypesAssignment_7_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2802:1: ( ( rule__Role__TypesAssignment_7_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2803:1: ( rule__Role__TypesAssignment_7_2 )
            {
             before(grammarAccess.getRoleAccess().getTypesAssignment_7_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2804:1: ( rule__Role__TypesAssignment_7_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2804:2: rule__Role__TypesAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__TypesAssignment_7_2_in_rule__Role__Group_7__2__Impl5581);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2814:1: rule__Role__Group_7__3 : rule__Role__Group_7__3__Impl rule__Role__Group_7__4 ;
    public final void rule__Role__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2818:1: ( rule__Role__Group_7__3__Impl rule__Role__Group_7__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2819:2: rule__Role__Group_7__3__Impl rule__Role__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__3__Impl_in_rule__Role__Group_7__35611);
            rule__Role__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__4_in_rule__Role__Group_7__35614);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2826:1: rule__Role__Group_7__3__Impl : ( ( rule__Role__Group_7_3__0 )* ) ;
    public final void rule__Role__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2830:1: ( ( ( rule__Role__Group_7_3__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2831:1: ( ( rule__Role__Group_7_3__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2831:1: ( ( rule__Role__Group_7_3__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2832:1: ( rule__Role__Group_7_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_7_3()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2833:1: ( rule__Role__Group_7_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2833:2: rule__Role__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__0_in_rule__Role__Group_7__3__Impl5641);
            	    rule__Role__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2843:1: rule__Role__Group_7__4 : rule__Role__Group_7__4__Impl ;
    public final void rule__Role__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2847:1: ( rule__Role__Group_7__4__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2848:2: rule__Role__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__4__Impl_in_rule__Role__Group_7__45672);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2854:1: rule__Role__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Role__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2858:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2859:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2859:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2860:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Role__Group_7__4__Impl5700); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2883:1: rule__Role__Group_7_3__0 : rule__Role__Group_7_3__0__Impl rule__Role__Group_7_3__1 ;
    public final void rule__Role__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2887:1: ( rule__Role__Group_7_3__0__Impl rule__Role__Group_7_3__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2888:2: rule__Role__Group_7_3__0__Impl rule__Role__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__0__Impl_in_rule__Role__Group_7_3__05741);
            rule__Role__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__1_in_rule__Role__Group_7_3__05744);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2895:1: rule__Role__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Role__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2899:1: ( ( ',' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2900:1: ( ',' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2900:1: ( ',' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2901:1: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_7_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Role__Group_7_3__0__Impl5772); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2914:1: rule__Role__Group_7_3__1 : rule__Role__Group_7_3__1__Impl ;
    public final void rule__Role__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2918:1: ( rule__Role__Group_7_3__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2919:2: rule__Role__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__1__Impl_in_rule__Role__Group_7_3__15803);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2925:1: rule__Role__Group_7_3__1__Impl : ( ( rule__Role__TypesAssignment_7_3_1 ) ) ;
    public final void rule__Role__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2929:1: ( ( ( rule__Role__TypesAssignment_7_3_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2930:1: ( ( rule__Role__TypesAssignment_7_3_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2930:1: ( ( rule__Role__TypesAssignment_7_3_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2931:1: ( rule__Role__TypesAssignment_7_3_1 )
            {
             before(grammarAccess.getRoleAccess().getTypesAssignment_7_3_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2932:1: ( rule__Role__TypesAssignment_7_3_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2932:2: rule__Role__TypesAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__TypesAssignment_7_3_1_in_rule__Role__Group_7_3__1__Impl5830);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2946:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2950:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2951:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__05864);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__1_in_rule__User__Group__05867);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2958:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2962:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2963:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2963:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2964:1: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2965:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2967:1: 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2977:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2981:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2982:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__15925);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__2_in_rule__User__Group__15928);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2989:1: rule__User__Group__1__Impl : ( ( rule__User__DisabledAssignment_1 )? ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2993:1: ( ( ( rule__User__DisabledAssignment_1 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2994:1: ( ( rule__User__DisabledAssignment_1 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2994:1: ( ( rule__User__DisabledAssignment_1 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2995:1: ( rule__User__DisabledAssignment_1 )?
            {
             before(grammarAccess.getUserAccess().getDisabledAssignment_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2996:1: ( rule__User__DisabledAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==57) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2996:2: rule__User__DisabledAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__DisabledAssignment_1_in_rule__User__Group__1__Impl5955);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3006:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3010:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3011:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__25986);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__3_in_rule__User__Group__25989);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3018:1: rule__User__Group__2__Impl : ( 'User' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3022:1: ( ( 'User' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3023:1: ( 'User' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3023:1: ( 'User' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3024:1: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__User__Group__2__Impl6017); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3037:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3041:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3042:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__36048);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__4_in_rule__User__Group__36051);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3049:1: rule__User__Group__3__Impl : ( '{' ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3053:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3054:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3054:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3055:1: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__User__Group__3__Impl6079); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3068:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3072:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3073:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__46110);
            rule__User__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__5_in_rule__User__Group__46113);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3080:1: rule__User__Group__4__Impl : ( 'Name' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3084:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3085:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3085:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3086:1: 'Name'
            {
             before(grammarAccess.getUserAccess().getNameKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__User__Group__4__Impl6141); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3099:1: rule__User__Group__5 : rule__User__Group__5__Impl rule__User__Group__6 ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3103:1: ( rule__User__Group__5__Impl rule__User__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3104:2: rule__User__Group__5__Impl rule__User__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__5__Impl_in_rule__User__Group__56172);
            rule__User__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__6_in_rule__User__Group__56175);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3111:1: rule__User__Group__5__Impl : ( '=' ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3115:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3116:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3116:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3117:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_5()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group__5__Impl6203); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3130:1: rule__User__Group__6 : rule__User__Group__6__Impl rule__User__Group__7 ;
    public final void rule__User__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3134:1: ( rule__User__Group__6__Impl rule__User__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3135:2: rule__User__Group__6__Impl rule__User__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__6__Impl_in_rule__User__Group__66234);
            rule__User__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__7_in_rule__User__Group__66237);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3142:1: rule__User__Group__6__Impl : ( ( rule__User__NameAssignment_6 ) ) ;
    public final void rule__User__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3146:1: ( ( ( rule__User__NameAssignment_6 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3147:1: ( ( rule__User__NameAssignment_6 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3147:1: ( ( rule__User__NameAssignment_6 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3148:1: ( rule__User__NameAssignment_6 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3149:1: ( rule__User__NameAssignment_6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3149:2: rule__User__NameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__NameAssignment_6_in_rule__User__Group__6__Impl6264);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3159:1: rule__User__Group__7 : rule__User__Group__7__Impl rule__User__Group__8 ;
    public final void rule__User__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3163:1: ( rule__User__Group__7__Impl rule__User__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3164:2: rule__User__Group__7__Impl rule__User__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__7__Impl_in_rule__User__Group__76294);
            rule__User__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__8_in_rule__User__Group__76297);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3171:1: rule__User__Group__7__Impl : ( ( rule__User__Group_7__0 )? ) ;
    public final void rule__User__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3175:1: ( ( ( rule__User__Group_7__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3176:1: ( ( rule__User__Group_7__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3176:1: ( ( rule__User__Group_7__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3177:1: ( rule__User__Group_7__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3178:1: ( rule__User__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3178:2: rule__User__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__0_in_rule__User__Group__7__Impl6324);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3188:1: rule__User__Group__8 : rule__User__Group__8__Impl rule__User__Group__9 ;
    public final void rule__User__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3192:1: ( rule__User__Group__8__Impl rule__User__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3193:2: rule__User__Group__8__Impl rule__User__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__8__Impl_in_rule__User__Group__86355);
            rule__User__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__9_in_rule__User__Group__86358);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3200:1: rule__User__Group__8__Impl : ( ( rule__User__Group_8__0 )? ) ;
    public final void rule__User__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3204:1: ( ( ( rule__User__Group_8__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3205:1: ( ( rule__User__Group_8__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3205:1: ( ( rule__User__Group_8__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3206:1: ( rule__User__Group_8__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_8()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3207:1: ( rule__User__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3207:2: rule__User__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__0_in_rule__User__Group__8__Impl6385);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3217:1: rule__User__Group__9 : rule__User__Group__9__Impl rule__User__Group__10 ;
    public final void rule__User__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3221:1: ( rule__User__Group__9__Impl rule__User__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3222:2: rule__User__Group__9__Impl rule__User__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__9__Impl_in_rule__User__Group__96416);
            rule__User__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__10_in_rule__User__Group__96419);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3229:1: rule__User__Group__9__Impl : ( ( rule__User__Group_9__0 )? ) ;
    public final void rule__User__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3233:1: ( ( ( rule__User__Group_9__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3234:1: ( ( rule__User__Group_9__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3234:1: ( ( rule__User__Group_9__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3235:1: ( rule__User__Group_9__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_9()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3236:1: ( rule__User__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3236:2: rule__User__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__0_in_rule__User__Group__9__Impl6446);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3246:1: rule__User__Group__10 : rule__User__Group__10__Impl rule__User__Group__11 ;
    public final void rule__User__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3250:1: ( rule__User__Group__10__Impl rule__User__Group__11 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3251:2: rule__User__Group__10__Impl rule__User__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__10__Impl_in_rule__User__Group__106477);
            rule__User__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__11_in_rule__User__Group__106480);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3258:1: rule__User__Group__10__Impl : ( ( rule__User__Group_10__0 )? ) ;
    public final void rule__User__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3262:1: ( ( ( rule__User__Group_10__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3263:1: ( ( rule__User__Group_10__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3263:1: ( ( rule__User__Group_10__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3264:1: ( rule__User__Group_10__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_10()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3265:1: ( rule__User__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3265:2: rule__User__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__0_in_rule__User__Group__10__Impl6507);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3275:1: rule__User__Group__11 : rule__User__Group__11__Impl rule__User__Group__12 ;
    public final void rule__User__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3279:1: ( rule__User__Group__11__Impl rule__User__Group__12 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3280:2: rule__User__Group__11__Impl rule__User__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__11__Impl_in_rule__User__Group__116538);
            rule__User__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__12_in_rule__User__Group__116541);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3287:1: rule__User__Group__11__Impl : ( ( rule__User__Group_11__0 )? ) ;
    public final void rule__User__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3291:1: ( ( ( rule__User__Group_11__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3292:1: ( ( rule__User__Group_11__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3292:1: ( ( rule__User__Group_11__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3293:1: ( rule__User__Group_11__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_11()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3294:1: ( rule__User__Group_11__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3294:2: rule__User__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__0_in_rule__User__Group__11__Impl6568);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3304:1: rule__User__Group__12 : rule__User__Group__12__Impl rule__User__Group__13 ;
    public final void rule__User__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3308:1: ( rule__User__Group__12__Impl rule__User__Group__13 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3309:2: rule__User__Group__12__Impl rule__User__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__12__Impl_in_rule__User__Group__126599);
            rule__User__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__13_in_rule__User__Group__126602);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3316:1: rule__User__Group__12__Impl : ( ( rule__User__Group_12__0 )? ) ;
    public final void rule__User__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3320:1: ( ( ( rule__User__Group_12__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3321:1: ( ( rule__User__Group_12__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3321:1: ( ( rule__User__Group_12__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3322:1: ( rule__User__Group_12__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_12()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3323:1: ( rule__User__Group_12__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3323:2: rule__User__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__0_in_rule__User__Group__12__Impl6629);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3333:1: rule__User__Group__13 : rule__User__Group__13__Impl ;
    public final void rule__User__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3337:1: ( rule__User__Group__13__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3338:2: rule__User__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__13__Impl_in_rule__User__Group__136660);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3344:1: rule__User__Group__13__Impl : ( '}' ) ;
    public final void rule__User__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3348:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3349:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3349:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3350:1: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_13()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__User__Group__13__Impl6688); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3391:1: rule__User__Group_7__0 : rule__User__Group_7__0__Impl rule__User__Group_7__1 ;
    public final void rule__User__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3395:1: ( rule__User__Group_7__0__Impl rule__User__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3396:2: rule__User__Group_7__0__Impl rule__User__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__0__Impl_in_rule__User__Group_7__06747);
            rule__User__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__1_in_rule__User__Group_7__06750);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3403:1: rule__User__Group_7__0__Impl : ( 'firstname' ) ;
    public final void rule__User__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3407:1: ( ( 'firstname' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3408:1: ( 'firstname' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3408:1: ( 'firstname' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3409:1: 'firstname'
            {
             before(grammarAccess.getUserAccess().getFirstnameKeyword_7_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__User__Group_7__0__Impl6778); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3422:1: rule__User__Group_7__1 : rule__User__Group_7__1__Impl rule__User__Group_7__2 ;
    public final void rule__User__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3426:1: ( rule__User__Group_7__1__Impl rule__User__Group_7__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3427:2: rule__User__Group_7__1__Impl rule__User__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__1__Impl_in_rule__User__Group_7__16809);
            rule__User__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__2_in_rule__User__Group_7__16812);
            rule__User__Group_7__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3434:1: rule__User__Group_7__1__Impl : ( '=' ) ;
    public final void rule__User__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3438:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3439:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3439:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3440:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_7_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_7__1__Impl6840); 
             after(grammarAccess.getUserAccess().getEqualsSignKeyword_7_1()); 

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


    // $ANTLR start "rule__User__Group_7__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3453:1: rule__User__Group_7__2 : rule__User__Group_7__2__Impl ;
    public final void rule__User__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3457:1: ( rule__User__Group_7__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3458:2: rule__User__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__2__Impl_in_rule__User__Group_7__26871);
            rule__User__Group_7__2__Impl();

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
    // $ANTLR end "rule__User__Group_7__2"


    // $ANTLR start "rule__User__Group_7__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3464:1: rule__User__Group_7__2__Impl : ( ( rule__User__FirstnameAssignment_7_2 ) ) ;
    public final void rule__User__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3468:1: ( ( ( rule__User__FirstnameAssignment_7_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3469:1: ( ( rule__User__FirstnameAssignment_7_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3469:1: ( ( rule__User__FirstnameAssignment_7_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3470:1: ( rule__User__FirstnameAssignment_7_2 )
            {
             before(grammarAccess.getUserAccess().getFirstnameAssignment_7_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3471:1: ( rule__User__FirstnameAssignment_7_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3471:2: rule__User__FirstnameAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__FirstnameAssignment_7_2_in_rule__User__Group_7__2__Impl6898);
            rule__User__FirstnameAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getFirstnameAssignment_7_2()); 

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
    // $ANTLR end "rule__User__Group_7__2__Impl"


    // $ANTLR start "rule__User__Group_8__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3487:1: rule__User__Group_8__0 : rule__User__Group_8__0__Impl rule__User__Group_8__1 ;
    public final void rule__User__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3491:1: ( rule__User__Group_8__0__Impl rule__User__Group_8__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3492:2: rule__User__Group_8__0__Impl rule__User__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__0__Impl_in_rule__User__Group_8__06934);
            rule__User__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__1_in_rule__User__Group_8__06937);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3499:1: rule__User__Group_8__0__Impl : ( 'lastname' ) ;
    public final void rule__User__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3503:1: ( ( 'lastname' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3504:1: ( 'lastname' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3504:1: ( 'lastname' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3505:1: 'lastname'
            {
             before(grammarAccess.getUserAccess().getLastnameKeyword_8_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__User__Group_8__0__Impl6965); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3518:1: rule__User__Group_8__1 : rule__User__Group_8__1__Impl rule__User__Group_8__2 ;
    public final void rule__User__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3522:1: ( rule__User__Group_8__1__Impl rule__User__Group_8__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3523:2: rule__User__Group_8__1__Impl rule__User__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__1__Impl_in_rule__User__Group_8__16996);
            rule__User__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__2_in_rule__User__Group_8__16999);
            rule__User__Group_8__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3530:1: rule__User__Group_8__1__Impl : ( '=' ) ;
    public final void rule__User__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3534:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3535:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3535:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3536:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_8_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_8__1__Impl7027); 
             after(grammarAccess.getUserAccess().getEqualsSignKeyword_8_1()); 

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


    // $ANTLR start "rule__User__Group_8__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3549:1: rule__User__Group_8__2 : rule__User__Group_8__2__Impl ;
    public final void rule__User__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3553:1: ( rule__User__Group_8__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3554:2: rule__User__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__2__Impl_in_rule__User__Group_8__27058);
            rule__User__Group_8__2__Impl();

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
    // $ANTLR end "rule__User__Group_8__2"


    // $ANTLR start "rule__User__Group_8__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3560:1: rule__User__Group_8__2__Impl : ( ( rule__User__LastnameAssignment_8_2 ) ) ;
    public final void rule__User__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3564:1: ( ( ( rule__User__LastnameAssignment_8_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3565:1: ( ( rule__User__LastnameAssignment_8_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3565:1: ( ( rule__User__LastnameAssignment_8_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3566:1: ( rule__User__LastnameAssignment_8_2 )
            {
             before(grammarAccess.getUserAccess().getLastnameAssignment_8_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3567:1: ( rule__User__LastnameAssignment_8_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3567:2: rule__User__LastnameAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__LastnameAssignment_8_2_in_rule__User__Group_8__2__Impl7085);
            rule__User__LastnameAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getLastnameAssignment_8_2()); 

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
    // $ANTLR end "rule__User__Group_8__2__Impl"


    // $ANTLR start "rule__User__Group_9__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3583:1: rule__User__Group_9__0 : rule__User__Group_9__0__Impl rule__User__Group_9__1 ;
    public final void rule__User__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3587:1: ( rule__User__Group_9__0__Impl rule__User__Group_9__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3588:2: rule__User__Group_9__0__Impl rule__User__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__0__Impl_in_rule__User__Group_9__07121);
            rule__User__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__1_in_rule__User__Group_9__07124);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3595:1: rule__User__Group_9__0__Impl : ( 'login' ) ;
    public final void rule__User__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3599:1: ( ( 'login' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3600:1: ( 'login' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3600:1: ( 'login' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3601:1: 'login'
            {
             before(grammarAccess.getUserAccess().getLoginKeyword_9_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__User__Group_9__0__Impl7152); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3614:1: rule__User__Group_9__1 : rule__User__Group_9__1__Impl rule__User__Group_9__2 ;
    public final void rule__User__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3618:1: ( rule__User__Group_9__1__Impl rule__User__Group_9__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3619:2: rule__User__Group_9__1__Impl rule__User__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__1__Impl_in_rule__User__Group_9__17183);
            rule__User__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__2_in_rule__User__Group_9__17186);
            rule__User__Group_9__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3626:1: rule__User__Group_9__1__Impl : ( '=' ) ;
    public final void rule__User__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3630:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3631:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3631:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3632:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_9_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_9__1__Impl7214); 
             after(grammarAccess.getUserAccess().getEqualsSignKeyword_9_1()); 

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


    // $ANTLR start "rule__User__Group_9__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3645:1: rule__User__Group_9__2 : rule__User__Group_9__2__Impl ;
    public final void rule__User__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3649:1: ( rule__User__Group_9__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3650:2: rule__User__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__2__Impl_in_rule__User__Group_9__27245);
            rule__User__Group_9__2__Impl();

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
    // $ANTLR end "rule__User__Group_9__2"


    // $ANTLR start "rule__User__Group_9__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3656:1: rule__User__Group_9__2__Impl : ( ( rule__User__LoginAssignment_9_2 ) ) ;
    public final void rule__User__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3660:1: ( ( ( rule__User__LoginAssignment_9_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3661:1: ( ( rule__User__LoginAssignment_9_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3661:1: ( ( rule__User__LoginAssignment_9_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3662:1: ( rule__User__LoginAssignment_9_2 )
            {
             before(grammarAccess.getUserAccess().getLoginAssignment_9_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3663:1: ( rule__User__LoginAssignment_9_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3663:2: rule__User__LoginAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__LoginAssignment_9_2_in_rule__User__Group_9__2__Impl7272);
            rule__User__LoginAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getLoginAssignment_9_2()); 

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
    // $ANTLR end "rule__User__Group_9__2__Impl"


    // $ANTLR start "rule__User__Group_10__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3679:1: rule__User__Group_10__0 : rule__User__Group_10__0__Impl rule__User__Group_10__1 ;
    public final void rule__User__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3683:1: ( rule__User__Group_10__0__Impl rule__User__Group_10__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3684:2: rule__User__Group_10__0__Impl rule__User__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__0__Impl_in_rule__User__Group_10__07308);
            rule__User__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__1_in_rule__User__Group_10__07311);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3691:1: rule__User__Group_10__0__Impl : ( 'password' ) ;
    public final void rule__User__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3695:1: ( ( 'password' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3696:1: ( 'password' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3696:1: ( 'password' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3697:1: 'password'
            {
             before(grammarAccess.getUserAccess().getPasswordKeyword_10_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__User__Group_10__0__Impl7339); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3710:1: rule__User__Group_10__1 : rule__User__Group_10__1__Impl rule__User__Group_10__2 ;
    public final void rule__User__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3714:1: ( rule__User__Group_10__1__Impl rule__User__Group_10__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3715:2: rule__User__Group_10__1__Impl rule__User__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__1__Impl_in_rule__User__Group_10__17370);
            rule__User__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__2_in_rule__User__Group_10__17373);
            rule__User__Group_10__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3722:1: rule__User__Group_10__1__Impl : ( '=' ) ;
    public final void rule__User__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3726:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3727:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3727:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3728:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_10_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_10__1__Impl7401); 
             after(grammarAccess.getUserAccess().getEqualsSignKeyword_10_1()); 

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


    // $ANTLR start "rule__User__Group_10__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3741:1: rule__User__Group_10__2 : rule__User__Group_10__2__Impl ;
    public final void rule__User__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3745:1: ( rule__User__Group_10__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3746:2: rule__User__Group_10__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__2__Impl_in_rule__User__Group_10__27432);
            rule__User__Group_10__2__Impl();

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
    // $ANTLR end "rule__User__Group_10__2"


    // $ANTLR start "rule__User__Group_10__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3752:1: rule__User__Group_10__2__Impl : ( ( rule__User__PasswordAssignment_10_2 ) ) ;
    public final void rule__User__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3756:1: ( ( ( rule__User__PasswordAssignment_10_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3757:1: ( ( rule__User__PasswordAssignment_10_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3757:1: ( ( rule__User__PasswordAssignment_10_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3758:1: ( rule__User__PasswordAssignment_10_2 )
            {
             before(grammarAccess.getUserAccess().getPasswordAssignment_10_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3759:1: ( rule__User__PasswordAssignment_10_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3759:2: rule__User__PasswordAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__PasswordAssignment_10_2_in_rule__User__Group_10__2__Impl7459);
            rule__User__PasswordAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getPasswordAssignment_10_2()); 

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
    // $ANTLR end "rule__User__Group_10__2__Impl"


    // $ANTLR start "rule__User__Group_11__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3775:1: rule__User__Group_11__0 : rule__User__Group_11__0__Impl rule__User__Group_11__1 ;
    public final void rule__User__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3779:1: ( rule__User__Group_11__0__Impl rule__User__Group_11__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3780:2: rule__User__Group_11__0__Impl rule__User__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__0__Impl_in_rule__User__Group_11__07495);
            rule__User__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__1_in_rule__User__Group_11__07498);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3787:1: rule__User__Group_11__0__Impl : ( 'email' ) ;
    public final void rule__User__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3791:1: ( ( 'email' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3792:1: ( 'email' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3792:1: ( 'email' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3793:1: 'email'
            {
             before(grammarAccess.getUserAccess().getEmailKeyword_11_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__User__Group_11__0__Impl7526); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3806:1: rule__User__Group_11__1 : rule__User__Group_11__1__Impl rule__User__Group_11__2 ;
    public final void rule__User__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3810:1: ( rule__User__Group_11__1__Impl rule__User__Group_11__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3811:2: rule__User__Group_11__1__Impl rule__User__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__1__Impl_in_rule__User__Group_11__17557);
            rule__User__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__2_in_rule__User__Group_11__17560);
            rule__User__Group_11__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3818:1: rule__User__Group_11__1__Impl : ( '=' ) ;
    public final void rule__User__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3822:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3823:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3823:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3824:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_11_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_11__1__Impl7588); 
             after(grammarAccess.getUserAccess().getEqualsSignKeyword_11_1()); 

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


    // $ANTLR start "rule__User__Group_11__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3837:1: rule__User__Group_11__2 : rule__User__Group_11__2__Impl ;
    public final void rule__User__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3841:1: ( rule__User__Group_11__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3842:2: rule__User__Group_11__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__2__Impl_in_rule__User__Group_11__27619);
            rule__User__Group_11__2__Impl();

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
    // $ANTLR end "rule__User__Group_11__2"


    // $ANTLR start "rule__User__Group_11__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3848:1: rule__User__Group_11__2__Impl : ( ( rule__User__EmailAssignment_11_2 ) ) ;
    public final void rule__User__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3852:1: ( ( ( rule__User__EmailAssignment_11_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3853:1: ( ( rule__User__EmailAssignment_11_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3853:1: ( ( rule__User__EmailAssignment_11_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3854:1: ( rule__User__EmailAssignment_11_2 )
            {
             before(grammarAccess.getUserAccess().getEmailAssignment_11_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3855:1: ( rule__User__EmailAssignment_11_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3855:2: rule__User__EmailAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__EmailAssignment_11_2_in_rule__User__Group_11__2__Impl7646);
            rule__User__EmailAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getEmailAssignment_11_2()); 

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
    // $ANTLR end "rule__User__Group_11__2__Impl"


    // $ANTLR start "rule__User__Group_12__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3871:1: rule__User__Group_12__0 : rule__User__Group_12__0__Impl rule__User__Group_12__1 ;
    public final void rule__User__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3875:1: ( rule__User__Group_12__0__Impl rule__User__Group_12__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3876:2: rule__User__Group_12__0__Impl rule__User__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__0__Impl_in_rule__User__Group_12__07682);
            rule__User__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__1_in_rule__User__Group_12__07685);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3883:1: rule__User__Group_12__0__Impl : ( 'Role' ) ;
    public final void rule__User__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3887:1: ( ( 'Role' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3888:1: ( 'Role' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3888:1: ( 'Role' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3889:1: 'Role'
            {
             before(grammarAccess.getUserAccess().getRoleKeyword_12_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__User__Group_12__0__Impl7713); 
             after(grammarAccess.getUserAccess().getRoleKeyword_12_0()); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3902:1: rule__User__Group_12__1 : rule__User__Group_12__1__Impl rule__User__Group_12__2 ;
    public final void rule__User__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3906:1: ( rule__User__Group_12__1__Impl rule__User__Group_12__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3907:2: rule__User__Group_12__1__Impl rule__User__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__1__Impl_in_rule__User__Group_12__17744);
            rule__User__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__2_in_rule__User__Group_12__17747);
            rule__User__Group_12__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3914:1: rule__User__Group_12__1__Impl : ( '=' ) ;
    public final void rule__User__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3918:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3919:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3919:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3920:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_12_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_12__1__Impl7775); 
             after(grammarAccess.getUserAccess().getEqualsSignKeyword_12_1()); 

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


    // $ANTLR start "rule__User__Group_12__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3933:1: rule__User__Group_12__2 : rule__User__Group_12__2__Impl ;
    public final void rule__User__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3937:1: ( rule__User__Group_12__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3938:2: rule__User__Group_12__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__2__Impl_in_rule__User__Group_12__27806);
            rule__User__Group_12__2__Impl();

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
    // $ANTLR end "rule__User__Group_12__2"


    // $ANTLR start "rule__User__Group_12__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3944:1: rule__User__Group_12__2__Impl : ( ( rule__User__HasRoleAssignment_12_2 ) ) ;
    public final void rule__User__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3948:1: ( ( ( rule__User__HasRoleAssignment_12_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3949:1: ( ( rule__User__HasRoleAssignment_12_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3949:1: ( ( rule__User__HasRoleAssignment_12_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3950:1: ( rule__User__HasRoleAssignment_12_2 )
            {
             before(grammarAccess.getUserAccess().getHasRoleAssignment_12_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3951:1: ( rule__User__HasRoleAssignment_12_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3951:2: rule__User__HasRoleAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__HasRoleAssignment_12_2_in_rule__User__Group_12__2__Impl7833);
            rule__User__HasRoleAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getHasRoleAssignment_12_2()); 

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
    // $ANTLR end "rule__User__Group_12__2__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3967:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3971:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3972:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__07869);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1_in_rule__Version__Group__07872);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3979:1: rule__Version__Group__0__Impl : ( () ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3983:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3984:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3984:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3985:1: ()
            {
             before(grammarAccess.getVersionAccess().getVersionAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3986:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3988:1: 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3998:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4002:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4003:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__17930);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__2_in_rule__Version__Group__17933);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4010:1: rule__Version__Group__1__Impl : ( 'Version' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4014:1: ( ( 'Version' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4015:1: ( 'Version' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4015:1: ( 'Version' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4016:1: 'Version'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Version__Group__1__Impl7961); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4029:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4033:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4034:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__27992);
            rule__Version__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__3_in_rule__Version__Group__27995);
            rule__Version__Group__3();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4041:1: rule__Version__Group__2__Impl : ( 'Number' ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4045:1: ( ( 'Number' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4046:1: ( 'Number' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4046:1: ( 'Number' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4047:1: 'Number'
            {
             before(grammarAccess.getVersionAccess().getNumberKeyword_2()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Version__Group__2__Impl8023); 
             after(grammarAccess.getVersionAccess().getNumberKeyword_2()); 

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


    // $ANTLR start "rule__Version__Group__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4060:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4064:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4065:2: rule__Version__Group__3__Impl rule__Version__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__3__Impl_in_rule__Version__Group__38054);
            rule__Version__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__4_in_rule__Version__Group__38057);
            rule__Version__Group__4();

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
    // $ANTLR end "rule__Version__Group__3"


    // $ANTLR start "rule__Version__Group__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4072:1: rule__Version__Group__3__Impl : ( '=' ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4076:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4077:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4077:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4078:1: '='
            {
             before(grammarAccess.getVersionAccess().getEqualsSignKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Version__Group__3__Impl8085); 
             after(grammarAccess.getVersionAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__Version__Group__3__Impl"


    // $ANTLR start "rule__Version__Group__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4091:1: rule__Version__Group__4 : rule__Version__Group__4__Impl ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4095:1: ( rule__Version__Group__4__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4096:2: rule__Version__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__4__Impl_in_rule__Version__Group__48116);
            rule__Version__Group__4__Impl();

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
    // $ANTLR end "rule__Version__Group__4"


    // $ANTLR start "rule__Version__Group__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4102:1: rule__Version__Group__4__Impl : ( ( rule__Version__NameAssignment_4 ) ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4106:1: ( ( ( rule__Version__NameAssignment_4 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4107:1: ( ( rule__Version__NameAssignment_4 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4107:1: ( ( rule__Version__NameAssignment_4 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4108:1: ( rule__Version__NameAssignment_4 )
            {
             before(grammarAccess.getVersionAccess().getNameAssignment_4()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4109:1: ( rule__Version__NameAssignment_4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4109:2: rule__Version__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__NameAssignment_4_in_rule__Version__Group__4__Impl8143);
            rule__Version__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Version__Group__4__Impl"


    // $ANTLR start "rule__CMS__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4129:1: rule__CMS__Group__0 : rule__CMS__Group__0__Impl rule__CMS__Group__1 ;
    public final void rule__CMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4133:1: ( rule__CMS__Group__0__Impl rule__CMS__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4134:2: rule__CMS__Group__0__Impl rule__CMS__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__0__Impl_in_rule__CMS__Group__08183);
            rule__CMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__1_in_rule__CMS__Group__08186);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4141:1: rule__CMS__Group__0__Impl : ( () ) ;
    public final void rule__CMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4145:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4146:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4146:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4147:1: ()
            {
             before(grammarAccess.getCMSAccess().getCMSAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4148:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4150:1: 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4160:1: rule__CMS__Group__1 : rule__CMS__Group__1__Impl rule__CMS__Group__2 ;
    public final void rule__CMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4164:1: ( rule__CMS__Group__1__Impl rule__CMS__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4165:2: rule__CMS__Group__1__Impl rule__CMS__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__1__Impl_in_rule__CMS__Group__18244);
            rule__CMS__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__2_in_rule__CMS__Group__18247);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4172:1: rule__CMS__Group__1__Impl : ( 'CMS' ) ;
    public final void rule__CMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4176:1: ( ( 'CMS' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4177:1: ( 'CMS' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4177:1: ( 'CMS' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4178:1: 'CMS'
            {
             before(grammarAccess.getCMSAccess().getCMSKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__CMS__Group__1__Impl8275); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4191:1: rule__CMS__Group__2 : rule__CMS__Group__2__Impl rule__CMS__Group__3 ;
    public final void rule__CMS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4195:1: ( rule__CMS__Group__2__Impl rule__CMS__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4196:2: rule__CMS__Group__2__Impl rule__CMS__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__2__Impl_in_rule__CMS__Group__28306);
            rule__CMS__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__3_in_rule__CMS__Group__28309);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4203:1: rule__CMS__Group__2__Impl : ( '{' ) ;
    public final void rule__CMS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4207:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4208:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4208:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4209:1: '{'
            {
             before(grammarAccess.getCMSAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__CMS__Group__2__Impl8337); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4222:1: rule__CMS__Group__3 : rule__CMS__Group__3__Impl rule__CMS__Group__4 ;
    public final void rule__CMS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4226:1: ( rule__CMS__Group__3__Impl rule__CMS__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4227:2: rule__CMS__Group__3__Impl rule__CMS__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__3__Impl_in_rule__CMS__Group__38368);
            rule__CMS__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__4_in_rule__CMS__Group__38371);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4234:1: rule__CMS__Group__3__Impl : ( 'Name' ) ;
    public final void rule__CMS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4238:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4239:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4239:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4240:1: 'Name'
            {
             before(grammarAccess.getCMSAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CMS__Group__3__Impl8399); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4253:1: rule__CMS__Group__4 : rule__CMS__Group__4__Impl rule__CMS__Group__5 ;
    public final void rule__CMS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4257:1: ( rule__CMS__Group__4__Impl rule__CMS__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4258:2: rule__CMS__Group__4__Impl rule__CMS__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__4__Impl_in_rule__CMS__Group__48430);
            rule__CMS__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__5_in_rule__CMS__Group__48433);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4265:1: rule__CMS__Group__4__Impl : ( '=' ) ;
    public final void rule__CMS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4269:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4270:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4270:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4271:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group__4__Impl8461); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4284:1: rule__CMS__Group__5 : rule__CMS__Group__5__Impl rule__CMS__Group__6 ;
    public final void rule__CMS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4288:1: ( rule__CMS__Group__5__Impl rule__CMS__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4289:2: rule__CMS__Group__5__Impl rule__CMS__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__5__Impl_in_rule__CMS__Group__58492);
            rule__CMS__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__6_in_rule__CMS__Group__58495);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4296:1: rule__CMS__Group__5__Impl : ( ( rule__CMS__NameAssignment_5 ) ) ;
    public final void rule__CMS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4300:1: ( ( ( rule__CMS__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4301:1: ( ( rule__CMS__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4301:1: ( ( rule__CMS__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4302:1: ( rule__CMS__NameAssignment_5 )
            {
             before(grammarAccess.getCMSAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4303:1: ( rule__CMS__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4303:2: rule__CMS__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__NameAssignment_5_in_rule__CMS__Group__5__Impl8522);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4313:1: rule__CMS__Group__6 : rule__CMS__Group__6__Impl rule__CMS__Group__7 ;
    public final void rule__CMS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4317:1: ( rule__CMS__Group__6__Impl rule__CMS__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4318:2: rule__CMS__Group__6__Impl rule__CMS__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__6__Impl_in_rule__CMS__Group__68552);
            rule__CMS__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__7_in_rule__CMS__Group__68555);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4325:1: rule__CMS__Group__6__Impl : ( ( rule__CMS__Group_6__0 ) ) ;
    public final void rule__CMS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4329:1: ( ( ( rule__CMS__Group_6__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4330:1: ( ( rule__CMS__Group_6__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4330:1: ( ( rule__CMS__Group_6__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4331:1: ( rule__CMS__Group_6__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4332:1: ( rule__CMS__Group_6__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4332:2: rule__CMS__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__0_in_rule__CMS__Group__6__Impl8582);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4342:1: rule__CMS__Group__7 : rule__CMS__Group__7__Impl rule__CMS__Group__8 ;
    public final void rule__CMS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4346:1: ( rule__CMS__Group__7__Impl rule__CMS__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4347:2: rule__CMS__Group__7__Impl rule__CMS__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__7__Impl_in_rule__CMS__Group__78612);
            rule__CMS__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__8_in_rule__CMS__Group__78615);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4354:1: rule__CMS__Group__7__Impl : ( ( rule__CMS__Group_7__0 ) ) ;
    public final void rule__CMS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4358:1: ( ( ( rule__CMS__Group_7__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4359:1: ( ( rule__CMS__Group_7__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4359:1: ( ( rule__CMS__Group_7__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4360:1: ( rule__CMS__Group_7__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4361:1: ( rule__CMS__Group_7__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4361:2: rule__CMS__Group_7__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__0_in_rule__CMS__Group__7__Impl8642);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4371:1: rule__CMS__Group__8 : rule__CMS__Group__8__Impl rule__CMS__Group__9 ;
    public final void rule__CMS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4375:1: ( rule__CMS__Group__8__Impl rule__CMS__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4376:2: rule__CMS__Group__8__Impl rule__CMS__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__8__Impl_in_rule__CMS__Group__88672);
            rule__CMS__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__9_in_rule__CMS__Group__88675);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4383:1: rule__CMS__Group__8__Impl : ( ( rule__CMS__Group_8__0 ) ) ;
    public final void rule__CMS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4387:1: ( ( ( rule__CMS__Group_8__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4388:1: ( ( rule__CMS__Group_8__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4388:1: ( ( rule__CMS__Group_8__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4389:1: ( rule__CMS__Group_8__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_8()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4390:1: ( rule__CMS__Group_8__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4390:2: rule__CMS__Group_8__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__0_in_rule__CMS__Group__8__Impl8702);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4400:1: rule__CMS__Group__9 : rule__CMS__Group__9__Impl rule__CMS__Group__10 ;
    public final void rule__CMS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4404:1: ( rule__CMS__Group__9__Impl rule__CMS__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4405:2: rule__CMS__Group__9__Impl rule__CMS__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__9__Impl_in_rule__CMS__Group__98732);
            rule__CMS__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__10_in_rule__CMS__Group__98735);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4412:1: rule__CMS__Group__9__Impl : ( ( rule__CMS__Group_9__0 ) ) ;
    public final void rule__CMS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4416:1: ( ( ( rule__CMS__Group_9__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4417:1: ( ( rule__CMS__Group_9__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4417:1: ( ( rule__CMS__Group_9__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4418:1: ( rule__CMS__Group_9__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_9()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4419:1: ( rule__CMS__Group_9__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4419:2: rule__CMS__Group_9__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__0_in_rule__CMS__Group__9__Impl8762);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4429:1: rule__CMS__Group__10 : rule__CMS__Group__10__Impl ;
    public final void rule__CMS__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4433:1: ( rule__CMS__Group__10__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4434:2: rule__CMS__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__10__Impl_in_rule__CMS__Group__108792);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4440:1: rule__CMS__Group__10__Impl : ( '}' ) ;
    public final void rule__CMS__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4444:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4445:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4445:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4446:1: '}'
            {
             before(grammarAccess.getCMSAccess().getRightCurlyBracketKeyword_10()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__CMS__Group__10__Impl8820); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4481:1: rule__CMS__Group_6__0 : rule__CMS__Group_6__0__Impl rule__CMS__Group_6__1 ;
    public final void rule__CMS__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4485:1: ( rule__CMS__Group_6__0__Impl rule__CMS__Group_6__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4486:2: rule__CMS__Group_6__0__Impl rule__CMS__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__0__Impl_in_rule__CMS__Group_6__08873);
            rule__CMS__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__1_in_rule__CMS__Group_6__08876);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4493:1: rule__CMS__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__CMS__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4497:1: ( ( 'type' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4498:1: ( 'type' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4498:1: ( 'type' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4499:1: 'type'
            {
             before(grammarAccess.getCMSAccess().getTypeKeyword_6_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__CMS__Group_6__0__Impl8904); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4512:1: rule__CMS__Group_6__1 : rule__CMS__Group_6__1__Impl rule__CMS__Group_6__2 ;
    public final void rule__CMS__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4516:1: ( rule__CMS__Group_6__1__Impl rule__CMS__Group_6__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4517:2: rule__CMS__Group_6__1__Impl rule__CMS__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__1__Impl_in_rule__CMS__Group_6__18935);
            rule__CMS__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__2_in_rule__CMS__Group_6__18938);
            rule__CMS__Group_6__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4524:1: rule__CMS__Group_6__1__Impl : ( '=' ) ;
    public final void rule__CMS__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4528:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4529:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4529:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4530:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_6_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group_6__1__Impl8966); 
             after(grammarAccess.getCMSAccess().getEqualsSignKeyword_6_1()); 

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


    // $ANTLR start "rule__CMS__Group_6__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4543:1: rule__CMS__Group_6__2 : rule__CMS__Group_6__2__Impl ;
    public final void rule__CMS__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4547:1: ( rule__CMS__Group_6__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4548:2: rule__CMS__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__2__Impl_in_rule__CMS__Group_6__28997);
            rule__CMS__Group_6__2__Impl();

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
    // $ANTLR end "rule__CMS__Group_6__2"


    // $ANTLR start "rule__CMS__Group_6__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4554:1: rule__CMS__Group_6__2__Impl : ( ( rule__CMS__TypeAssignment_6_2 ) ) ;
    public final void rule__CMS__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4558:1: ( ( ( rule__CMS__TypeAssignment_6_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4559:1: ( ( rule__CMS__TypeAssignment_6_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4559:1: ( ( rule__CMS__TypeAssignment_6_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4560:1: ( rule__CMS__TypeAssignment_6_2 )
            {
             before(grammarAccess.getCMSAccess().getTypeAssignment_6_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4561:1: ( rule__CMS__TypeAssignment_6_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4561:2: rule__CMS__TypeAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__TypeAssignment_6_2_in_rule__CMS__Group_6__2__Impl9024);
            rule__CMS__TypeAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getTypeAssignment_6_2()); 

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
    // $ANTLR end "rule__CMS__Group_6__2__Impl"


    // $ANTLR start "rule__CMS__Group_7__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4577:1: rule__CMS__Group_7__0 : rule__CMS__Group_7__0__Impl rule__CMS__Group_7__1 ;
    public final void rule__CMS__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4581:1: ( rule__CMS__Group_7__0__Impl rule__CMS__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4582:2: rule__CMS__Group_7__0__Impl rule__CMS__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__0__Impl_in_rule__CMS__Group_7__09060);
            rule__CMS__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__1_in_rule__CMS__Group_7__09063);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4589:1: rule__CMS__Group_7__0__Impl : ( 'address_url' ) ;
    public final void rule__CMS__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4593:1: ( ( 'address_url' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4594:1: ( 'address_url' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4594:1: ( 'address_url' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4595:1: 'address_url'
            {
             before(grammarAccess.getCMSAccess().getAddress_urlKeyword_7_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__CMS__Group_7__0__Impl9091); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4608:1: rule__CMS__Group_7__1 : rule__CMS__Group_7__1__Impl rule__CMS__Group_7__2 ;
    public final void rule__CMS__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4612:1: ( rule__CMS__Group_7__1__Impl rule__CMS__Group_7__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4613:2: rule__CMS__Group_7__1__Impl rule__CMS__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__1__Impl_in_rule__CMS__Group_7__19122);
            rule__CMS__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__2_in_rule__CMS__Group_7__19125);
            rule__CMS__Group_7__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4620:1: rule__CMS__Group_7__1__Impl : ( '=' ) ;
    public final void rule__CMS__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4624:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4625:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4625:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4626:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_7_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group_7__1__Impl9153); 
             after(grammarAccess.getCMSAccess().getEqualsSignKeyword_7_1()); 

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


    // $ANTLR start "rule__CMS__Group_7__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4639:1: rule__CMS__Group_7__2 : rule__CMS__Group_7__2__Impl ;
    public final void rule__CMS__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4643:1: ( rule__CMS__Group_7__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4644:2: rule__CMS__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__2__Impl_in_rule__CMS__Group_7__29184);
            rule__CMS__Group_7__2__Impl();

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
    // $ANTLR end "rule__CMS__Group_7__2"


    // $ANTLR start "rule__CMS__Group_7__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4650:1: rule__CMS__Group_7__2__Impl : ( ( rule__CMS__Address_urlAssignment_7_2 ) ) ;
    public final void rule__CMS__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4654:1: ( ( ( rule__CMS__Address_urlAssignment_7_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4655:1: ( ( rule__CMS__Address_urlAssignment_7_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4655:1: ( ( rule__CMS__Address_urlAssignment_7_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4656:1: ( rule__CMS__Address_urlAssignment_7_2 )
            {
             before(grammarAccess.getCMSAccess().getAddress_urlAssignment_7_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4657:1: ( rule__CMS__Address_urlAssignment_7_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4657:2: rule__CMS__Address_urlAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Address_urlAssignment_7_2_in_rule__CMS__Group_7__2__Impl9211);
            rule__CMS__Address_urlAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getAddress_urlAssignment_7_2()); 

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
    // $ANTLR end "rule__CMS__Group_7__2__Impl"


    // $ANTLR start "rule__CMS__Group_8__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4673:1: rule__CMS__Group_8__0 : rule__CMS__Group_8__0__Impl rule__CMS__Group_8__1 ;
    public final void rule__CMS__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4677:1: ( rule__CMS__Group_8__0__Impl rule__CMS__Group_8__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4678:2: rule__CMS__Group_8__0__Impl rule__CMS__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__0__Impl_in_rule__CMS__Group_8__09247);
            rule__CMS__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__1_in_rule__CMS__Group_8__09250);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4685:1: rule__CMS__Group_8__0__Impl : ( 'username' ) ;
    public final void rule__CMS__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4689:1: ( ( 'username' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4690:1: ( 'username' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4690:1: ( 'username' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4691:1: 'username'
            {
             before(grammarAccess.getCMSAccess().getUsernameKeyword_8_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__CMS__Group_8__0__Impl9278); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4704:1: rule__CMS__Group_8__1 : rule__CMS__Group_8__1__Impl rule__CMS__Group_8__2 ;
    public final void rule__CMS__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4708:1: ( rule__CMS__Group_8__1__Impl rule__CMS__Group_8__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4709:2: rule__CMS__Group_8__1__Impl rule__CMS__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__1__Impl_in_rule__CMS__Group_8__19309);
            rule__CMS__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__2_in_rule__CMS__Group_8__19312);
            rule__CMS__Group_8__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4716:1: rule__CMS__Group_8__1__Impl : ( '=' ) ;
    public final void rule__CMS__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4720:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4721:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4721:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4722:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_8_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group_8__1__Impl9340); 
             after(grammarAccess.getCMSAccess().getEqualsSignKeyword_8_1()); 

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


    // $ANTLR start "rule__CMS__Group_8__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4735:1: rule__CMS__Group_8__2 : rule__CMS__Group_8__2__Impl ;
    public final void rule__CMS__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4739:1: ( rule__CMS__Group_8__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4740:2: rule__CMS__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__2__Impl_in_rule__CMS__Group_8__29371);
            rule__CMS__Group_8__2__Impl();

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
    // $ANTLR end "rule__CMS__Group_8__2"


    // $ANTLR start "rule__CMS__Group_8__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4746:1: rule__CMS__Group_8__2__Impl : ( ( rule__CMS__UsernameAssignment_8_2 ) ) ;
    public final void rule__CMS__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4750:1: ( ( ( rule__CMS__UsernameAssignment_8_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4751:1: ( ( rule__CMS__UsernameAssignment_8_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4751:1: ( ( rule__CMS__UsernameAssignment_8_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4752:1: ( rule__CMS__UsernameAssignment_8_2 )
            {
             before(grammarAccess.getCMSAccess().getUsernameAssignment_8_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4753:1: ( rule__CMS__UsernameAssignment_8_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4753:2: rule__CMS__UsernameAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__UsernameAssignment_8_2_in_rule__CMS__Group_8__2__Impl9398);
            rule__CMS__UsernameAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getUsernameAssignment_8_2()); 

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
    // $ANTLR end "rule__CMS__Group_8__2__Impl"


    // $ANTLR start "rule__CMS__Group_9__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4769:1: rule__CMS__Group_9__0 : rule__CMS__Group_9__0__Impl rule__CMS__Group_9__1 ;
    public final void rule__CMS__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4773:1: ( rule__CMS__Group_9__0__Impl rule__CMS__Group_9__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4774:2: rule__CMS__Group_9__0__Impl rule__CMS__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__0__Impl_in_rule__CMS__Group_9__09434);
            rule__CMS__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__1_in_rule__CMS__Group_9__09437);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4781:1: rule__CMS__Group_9__0__Impl : ( 'password' ) ;
    public final void rule__CMS__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4785:1: ( ( 'password' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4786:1: ( 'password' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4786:1: ( 'password' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4787:1: 'password'
            {
             before(grammarAccess.getCMSAccess().getPasswordKeyword_9_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__CMS__Group_9__0__Impl9465); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4800:1: rule__CMS__Group_9__1 : rule__CMS__Group_9__1__Impl rule__CMS__Group_9__2 ;
    public final void rule__CMS__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4804:1: ( rule__CMS__Group_9__1__Impl rule__CMS__Group_9__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4805:2: rule__CMS__Group_9__1__Impl rule__CMS__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__1__Impl_in_rule__CMS__Group_9__19496);
            rule__CMS__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__2_in_rule__CMS__Group_9__19499);
            rule__CMS__Group_9__2();

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4812:1: rule__CMS__Group_9__1__Impl : ( '=' ) ;
    public final void rule__CMS__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4816:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4817:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4817:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4818:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_9_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group_9__1__Impl9527); 
             after(grammarAccess.getCMSAccess().getEqualsSignKeyword_9_1()); 

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


    // $ANTLR start "rule__CMS__Group_9__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4831:1: rule__CMS__Group_9__2 : rule__CMS__Group_9__2__Impl ;
    public final void rule__CMS__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4835:1: ( rule__CMS__Group_9__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4836:2: rule__CMS__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__2__Impl_in_rule__CMS__Group_9__29558);
            rule__CMS__Group_9__2__Impl();

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
    // $ANTLR end "rule__CMS__Group_9__2"


    // $ANTLR start "rule__CMS__Group_9__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4842:1: rule__CMS__Group_9__2__Impl : ( ( rule__CMS__PasswordAssignment_9_2 ) ) ;
    public final void rule__CMS__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4846:1: ( ( ( rule__CMS__PasswordAssignment_9_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4847:1: ( ( rule__CMS__PasswordAssignment_9_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4847:1: ( ( rule__CMS__PasswordAssignment_9_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4848:1: ( rule__CMS__PasswordAssignment_9_2 )
            {
             before(grammarAccess.getCMSAccess().getPasswordAssignment_9_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4849:1: ( rule__CMS__PasswordAssignment_9_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4849:2: rule__CMS__PasswordAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__PasswordAssignment_9_2_in_rule__CMS__Group_9__2__Impl9585);
            rule__CMS__PasswordAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getCMSAccess().getPasswordAssignment_9_2()); 

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
    // $ANTLR end "rule__CMS__Group_9__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4865:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4869:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4870:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09621);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09624);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4877:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4881:1: ( ( ( '-' )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4882:1: ( ( '-' )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4882:1: ( ( '-' )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4883:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4884:1: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4885:2: '-'
                    {
                    match(input,54,FollowSets000.FOLLOW_54_in_rule__EInt__Group__0__Impl9653); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4896:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4900:1: ( rule__EInt__Group__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4901:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19686);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4907:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4911:1: ( ( RULE_INT ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4912:1: ( RULE_INT )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4912:1: ( RULE_INT )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4913:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9713); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4929:1: rule__ContentModel__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__ContentModel__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4933:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4934:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4934:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4935:1: ruleEString
            {
             before(grammarAccess.getContentModelAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ContentModel__NameAssignment_59751);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4944:1: rule__ContentModel__HasElementsAssignment_6_2 : ( ruleNamedElement ) ;
    public final void rule__ContentModel__HasElementsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4948:1: ( ( ruleNamedElement ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4949:1: ( ruleNamedElement )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4949:1: ( ruleNamedElement )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4950:1: ruleNamedElement
            {
             before(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_29782);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4959:1: rule__ContentModel__HasElementsAssignment_6_3_1 : ( ruleNamedElement ) ;
    public final void rule__ContentModel__HasElementsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4963:1: ( ( ruleNamedElement ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4964:1: ( ruleNamedElement )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4964:1: ( ruleNamedElement )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4965:1: ruleNamedElement
            {
             before(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_3_19813);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4974:1: rule__ContentType__VisibleAssignment_0 : ( ( 'visible' ) ) ;
    public final void rule__ContentType__VisibleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4978:1: ( ( ( 'visible' ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4979:1: ( ( 'visible' ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4979:1: ( ( 'visible' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4980:1: ( 'visible' )
            {
             before(grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4981:1: ( 'visible' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4982:1: 'visible'
            {
             before(grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__ContentType__VisibleAssignment_09849); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4997:1: rule__ContentType__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__ContentType__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5001:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5002:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5002:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5003:1: ruleEString
            {
             before(grammarAccess.getContentTypeAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ContentType__NameAssignment_59888);
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


    // $ANTLR start "rule__ContentType__GuidAssignment_6_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5012:1: rule__ContentType__GuidAssignment_6_2 : ( ruleEInt ) ;
    public final void rule__ContentType__GuidAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5016:1: ( ( ruleEInt ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5017:1: ( ruleEInt )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5017:1: ( ruleEInt )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5018:1: ruleEInt
            {
             before(grammarAccess.getContentTypeAccess().getGuidEIntParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ContentType__GuidAssignment_6_29919);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getGuidEIntParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__ContentType__GuidAssignment_6_2"


    // $ANTLR start "rule__ContentType__HasPropertiesAssignment_9"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5027:1: rule__ContentType__HasPropertiesAssignment_9 : ( ruleProperty ) ;
    public final void rule__ContentType__HasPropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5031:1: ( ( ruleProperty ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5032:1: ( ruleProperty )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5032:1: ( ruleProperty )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5033:1: ruleProperty
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_99950);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5042:1: rule__ContentType__HasPropertiesAssignment_10_1 : ( ruleProperty ) ;
    public final void rule__ContentType__HasPropertiesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5046:1: ( ( ruleProperty ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5047:1: ( ruleProperty )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5047:1: ( ruleProperty )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5048:1: ruleProperty
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_10_19981);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5057:1: rule__ContentType__HasVersionsAssignment_12_2 : ( ruleVersion ) ;
    public final void rule__ContentType__HasVersionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5061:1: ( ( ruleVersion ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5062:1: ( ruleVersion )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5062:1: ( ruleVersion )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5063:1: ruleVersion
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_12_210012);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5072:1: rule__ContentType__HasVersionsAssignment_12_3_1 : ( ruleVersion ) ;
    public final void rule__ContentType__HasVersionsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5076:1: ( ( ruleVersion ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5077:1: ( ruleVersion )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5077:1: ( ruleVersion )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5078:1: ruleVersion
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_12_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_12_3_110043);
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


    // $ANTLR start "rule__ContentType__ModifiedByAssignment_13_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5087:1: rule__ContentType__ModifiedByAssignment_13_2 : ( ruleUser ) ;
    public final void rule__ContentType__ModifiedByAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5091:1: ( ( ruleUser ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5092:1: ( ruleUser )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5092:1: ( ruleUser )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5093:1: ruleUser
            {
             before(grammarAccess.getContentTypeAccess().getModifiedByUserParserRuleCall_13_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUser_in_rule__ContentType__ModifiedByAssignment_13_210074);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getModifiedByUserParserRuleCall_13_2_0()); 

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
    // $ANTLR end "rule__ContentType__ModifiedByAssignment_13_2"


    // $ANTLR start "rule__Property__NameAssignment_4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5102:1: rule__Property__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5106:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5107:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5107:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5108:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__NameAssignment_410105);
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


    // $ANTLR start "rule__Property__AccessModiferAssignment_7"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5117:1: rule__Property__AccessModiferAssignment_7 : ( ruleAccessLevelEnum ) ;
    public final void rule__Property__AccessModiferAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5121:1: ( ( ruleAccessLevelEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5122:1: ( ruleAccessLevelEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5122:1: ( ruleAccessLevelEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5123:1: ruleAccessLevelEnum
            {
             before(grammarAccess.getPropertyAccess().getAccessModiferAccessLevelEnumEnumRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccessLevelEnum_in_rule__Property__AccessModiferAssignment_710136);
            ruleAccessLevelEnum();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getAccessModiferAccessLevelEnumEnumRuleCall_7_0()); 

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
    // $ANTLR end "rule__Property__AccessModiferAssignment_7"


    // $ANTLR start "rule__Property__TypeAssignment_8_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5132:1: rule__Property__TypeAssignment_8_2 : ( ruleTypeEnum ) ;
    public final void rule__Property__TypeAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5136:1: ( ( ruleTypeEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5137:1: ( ruleTypeEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5137:1: ( ruleTypeEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5138:1: ruleTypeEnum
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeEnumEnumRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__Property__TypeAssignment_8_210167);
            ruleTypeEnum();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeEnumEnumRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Property__TypeAssignment_8_2"


    // $ANTLR start "rule__Role__IsAdminAssignment_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5147:1: rule__Role__IsAdminAssignment_1 : ( ( 'isAdmin' ) ) ;
    public final void rule__Role__IsAdminAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5151:1: ( ( ( 'isAdmin' ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5152:1: ( ( 'isAdmin' ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5152:1: ( ( 'isAdmin' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5153:1: ( 'isAdmin' )
            {
             before(grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5154:1: ( 'isAdmin' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5155:1: 'isAdmin'
            {
             before(grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Role__IsAdminAssignment_110203); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5170:1: rule__Role__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5174:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5175:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5175:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5176:1: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Role__NameAssignment_610242);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5185:1: rule__Role__TypesAssignment_7_2 : ( ruleEString ) ;
    public final void rule__Role__TypesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5189:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5190:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5190:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5191:1: ruleEString
            {
             before(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_210273);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5200:1: rule__Role__TypesAssignment_7_3_1 : ( ruleEString ) ;
    public final void rule__Role__TypesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5204:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5205:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5205:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5206:1: ruleEString
            {
             before(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_3_110304);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5215:1: rule__User__DisabledAssignment_1 : ( ( 'disabled' ) ) ;
    public final void rule__User__DisabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5219:1: ( ( ( 'disabled' ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5220:1: ( ( 'disabled' ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5220:1: ( ( 'disabled' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5221:1: ( 'disabled' )
            {
             before(grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5222:1: ( 'disabled' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5223:1: 'disabled'
            {
             before(grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__User__DisabledAssignment_110340); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5238:1: rule__User__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__User__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5242:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5243:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5243:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5244:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__NameAssignment_610379);
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


    // $ANTLR start "rule__User__FirstnameAssignment_7_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5253:1: rule__User__FirstnameAssignment_7_2 : ( ruleEString ) ;
    public final void rule__User__FirstnameAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5257:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5258:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5258:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5259:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getFirstnameEStringParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__FirstnameAssignment_7_210410);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getFirstnameEStringParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__User__FirstnameAssignment_7_2"


    // $ANTLR start "rule__User__LastnameAssignment_8_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5268:1: rule__User__LastnameAssignment_8_2 : ( ruleEString ) ;
    public final void rule__User__LastnameAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5272:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5273:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5273:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5274:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getLastnameEStringParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__LastnameAssignment_8_210441);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getLastnameEStringParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__User__LastnameAssignment_8_2"


    // $ANTLR start "rule__User__LoginAssignment_9_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5283:1: rule__User__LoginAssignment_9_2 : ( ruleEString ) ;
    public final void rule__User__LoginAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5287:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5288:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5288:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5289:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getLoginEStringParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__LoginAssignment_9_210472);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getLoginEStringParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__User__LoginAssignment_9_2"


    // $ANTLR start "rule__User__PasswordAssignment_10_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5298:1: rule__User__PasswordAssignment_10_2 : ( ruleEString ) ;
    public final void rule__User__PasswordAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5302:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5303:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5303:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5304:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getPasswordEStringParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__PasswordAssignment_10_210503);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getPasswordEStringParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__User__PasswordAssignment_10_2"


    // $ANTLR start "rule__User__EmailAssignment_11_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5313:1: rule__User__EmailAssignment_11_2 : ( ruleEString ) ;
    public final void rule__User__EmailAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5317:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5318:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5318:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5319:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getEmailEStringParserRuleCall_11_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__EmailAssignment_11_210534);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUserAccess().getEmailEStringParserRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__User__EmailAssignment_11_2"


    // $ANTLR start "rule__User__HasRoleAssignment_12_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5328:1: rule__User__HasRoleAssignment_12_2 : ( ruleRole ) ;
    public final void rule__User__HasRoleAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5332:1: ( ( ruleRole ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5333:1: ( ruleRole )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5333:1: ( ruleRole )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5334:1: ruleRole
            {
             before(grammarAccess.getUserAccess().getHasRoleRoleParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__User__HasRoleAssignment_12_210565);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getUserAccess().getHasRoleRoleParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__User__HasRoleAssignment_12_2"


    // $ANTLR start "rule__Version__NameAssignment_4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5343:1: rule__Version__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Version__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5347:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5348:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5348:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5349:1: ruleEString
            {
             before(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Version__NameAssignment_410596);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Version__NameAssignment_4"


    // $ANTLR start "rule__CMS__NameAssignment_5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5358:1: rule__CMS__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__CMS__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5362:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5363:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5363:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5364:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__NameAssignment_510627);
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


    // $ANTLR start "rule__CMS__TypeAssignment_6_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5373:1: rule__CMS__TypeAssignment_6_2 : ( ruleCMSEnum ) ;
    public final void rule__CMS__TypeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5377:1: ( ( ruleCMSEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5378:1: ( ruleCMSEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5378:1: ( ruleCMSEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5379:1: ruleCMSEnum
            {
             before(grammarAccess.getCMSAccess().getTypeCMSEnumEnumRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCMSEnum_in_rule__CMS__TypeAssignment_6_210658);
            ruleCMSEnum();

            state._fsp--;

             after(grammarAccess.getCMSAccess().getTypeCMSEnumEnumRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__CMS__TypeAssignment_6_2"


    // $ANTLR start "rule__CMS__Address_urlAssignment_7_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5388:1: rule__CMS__Address_urlAssignment_7_2 : ( ruleEString ) ;
    public final void rule__CMS__Address_urlAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5392:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5393:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5393:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5394:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getAddress_urlEStringParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__Address_urlAssignment_7_210689);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCMSAccess().getAddress_urlEStringParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__CMS__Address_urlAssignment_7_2"


    // $ANTLR start "rule__CMS__UsernameAssignment_8_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5403:1: rule__CMS__UsernameAssignment_8_2 : ( ruleEString ) ;
    public final void rule__CMS__UsernameAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5407:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5408:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5408:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5409:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getUsernameEStringParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__UsernameAssignment_8_210720);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCMSAccess().getUsernameEStringParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__CMS__UsernameAssignment_8_2"


    // $ANTLR start "rule__CMS__PasswordAssignment_9_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5418:1: rule__CMS__PasswordAssignment_9_2 : ( ruleEString ) ;
    public final void rule__CMS__PasswordAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5422:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5423:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5423:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5424:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getPasswordEStringParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__PasswordAssignment_9_210751);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCMSAccess().getPasswordEStringParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__CMS__PasswordAssignment_9_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleContentModel_in_entryRuleContentModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContentModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__0_in_ruleContentModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_entryRuleNamedElement121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNamedElement128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NamedElement__Alternatives_in_ruleNamedElement154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_entryRuleContentType241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContentType248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__0_in_ruleContentType274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUser_in_entryRuleUser421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUser428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_entryRuleCMS541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCMS548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__0_in_ruleCMS574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypeEnum__Alternatives_in_ruleTypeEnum673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMSEnum__Alternatives_in_ruleCMSEnum709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccessLevelEnum__Alternatives_in_ruleAccessLevelEnum745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContentType_in_rule__NamedElement__Alternatives780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMS_in_rule__NamedElement__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__TypeEnum__Alternatives880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TypeEnum__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__TypeEnum__Alternatives922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TypeEnum__Alternatives943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypeEnum__Alternatives964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypeEnum__Alternatives985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TypeEnum__Alternatives1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TypeEnum__Alternatives1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__CMSEnum__Alternatives1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__CMSEnum__Alternatives1084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CMSEnum__Alternatives1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CMSEnum__Alternatives1126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__AccessLevelEnum__Alternatives1162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AccessLevelEnum__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__0__Impl_in_rule__ContentModel__Group__01216 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__1_in_rule__ContentModel__Group__01219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__1__Impl_in_rule__ContentModel__Group__11277 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__2_in_rule__ContentModel__Group__11280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ContentModel__Group__1__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__2__Impl_in_rule__ContentModel__Group__21339 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__3_in_rule__ContentModel__Group__21342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentModel__Group__2__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__3__Impl_in_rule__ContentModel__Group__31401 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__4_in_rule__ContentModel__Group__31404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ContentModel__Group__3__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__4__Impl_in_rule__ContentModel__Group__41463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__5_in_rule__ContentModel__Group__41466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ContentModel__Group__4__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__5__Impl_in_rule__ContentModel__Group__51525 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__6_in_rule__ContentModel__Group__51528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__NameAssignment_5_in_rule__ContentModel__Group__5__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__6__Impl_in_rule__ContentModel__Group__61585 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__7_in_rule__ContentModel__Group__61588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__0_in_rule__ContentModel__Group__6__Impl1615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group__7__Impl_in_rule__ContentModel__Group__71646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentModel__Group__7__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__0__Impl_in_rule__ContentModel__Group_6__01721 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__1_in_rule__ContentModel__Group_6__01724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ContentModel__Group_6__0__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__1__Impl_in_rule__ContentModel__Group_6__11783 = new BitSet(new long[]{0x0084000100000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__2_in_rule__ContentModel__Group_6__11786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentModel__Group_6__1__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__2__Impl_in_rule__ContentModel__Group_6__21845 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__3_in_rule__ContentModel__Group_6__21848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__HasElementsAssignment_6_2_in_rule__ContentModel__Group_6__2__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__3__Impl_in_rule__ContentModel__Group_6__31905 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__4_in_rule__ContentModel__Group_6__31908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__0_in_rule__ContentModel__Group_6__3__Impl1935 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__4__Impl_in_rule__ContentModel__Group_6__41966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentModel__Group_6__4__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__0__Impl_in_rule__ContentModel__Group_6_3__02035 = new BitSet(new long[]{0x0084000100000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__1_in_rule__ContentModel__Group_6_3__02038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentModel__Group_6_3__0__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__1__Impl_in_rule__ContentModel__Group_6_3__12097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__HasElementsAssignment_6_3_1_in_rule__ContentModel__Group_6_3__1__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__0__Impl_in_rule__ContentType__Group__02158 = new BitSet(new long[]{0x0080000100000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__1_in_rule__ContentType__Group__02161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__VisibleAssignment_0_in_rule__ContentType__Group__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__1__Impl_in_rule__ContentType__Group__12219 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__2_in_rule__ContentType__Group__12222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ContentType__Group__1__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__2__Impl_in_rule__ContentType__Group__22281 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__3_in_rule__ContentType__Group__22284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentType__Group__2__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__3__Impl_in_rule__ContentType__Group__32343 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__4_in_rule__ContentType__Group__32346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ContentType__Group__3__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__4__Impl_in_rule__ContentType__Group__42405 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ContentType__Group__5_in_rule__ContentType__Group__42408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ContentType__Group__4__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__5__Impl_in_rule__ContentType__Group__52467 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__6_in_rule__ContentType__Group__52470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__NameAssignment_5_in_rule__ContentType__Group__5__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__6__Impl_in_rule__ContentType__Group__62527 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__7_in_rule__ContentType__Group__62530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__0_in_rule__ContentType__Group__6__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__7__Impl_in_rule__ContentType__Group__72588 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__8_in_rule__ContentType__Group__72591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ContentType__Group__7__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__8__Impl_in_rule__ContentType__Group__82650 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__9_in_rule__ContentType__Group__82653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentType__Group__8__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__9__Impl_in_rule__ContentType__Group__92712 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__10_in_rule__ContentType__Group__92715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasPropertiesAssignment_9_in_rule__ContentType__Group__9__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__10__Impl_in_rule__ContentType__Group__102772 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__11_in_rule__ContentType__Group__102775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_10__0_in_rule__ContentType__Group__10__Impl2802 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__11__Impl_in_rule__ContentType__Group__112833 = new BitSet(new long[]{0x0000001820000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__12_in_rule__ContentType__Group__112836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentType__Group__11__Impl2864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__12__Impl_in_rule__ContentType__Group__122895 = new BitSet(new long[]{0x0000001820000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__13_in_rule__ContentType__Group__122898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__0_in_rule__ContentType__Group__12__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__13__Impl_in_rule__ContentType__Group__132956 = new BitSet(new long[]{0x0000001820000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__14_in_rule__ContentType__Group__132959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__0_in_rule__ContentType__Group__13__Impl2986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__14__Impl_in_rule__ContentType__Group__143017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentType__Group__14__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__0__Impl_in_rule__ContentType__Group_6__03106 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__1_in_rule__ContentType__Group_6__03109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ContentType__Group_6__0__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__1__Impl_in_rule__ContentType__Group_6__13168 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__2_in_rule__ContentType__Group_6__13171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ContentType__Group_6__1__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_6__2__Impl_in_rule__ContentType__Group_6__23230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__GuidAssignment_6_2_in_rule__ContentType__Group_6__2__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_10__0__Impl_in_rule__ContentType__Group_10__03293 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_10__1_in_rule__ContentType__Group_10__03296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentType__Group_10__0__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_10__1__Impl_in_rule__ContentType__Group_10__13355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasPropertiesAssignment_10_1_in_rule__ContentType__Group_10__1__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__0__Impl_in_rule__ContentType__Group_12__03416 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__1_in_rule__ContentType__Group_12__03419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ContentType__Group_12__0__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__1__Impl_in_rule__ContentType__Group_12__13478 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__2_in_rule__ContentType__Group_12__13481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentType__Group_12__1__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__2__Impl_in_rule__ContentType__Group_12__23540 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__3_in_rule__ContentType__Group_12__23543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasVersionsAssignment_12_2_in_rule__ContentType__Group_12__2__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__3__Impl_in_rule__ContentType__Group_12__33600 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__4_in_rule__ContentType__Group_12__33603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12_3__0_in_rule__ContentType__Group_12__3__Impl3630 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__4__Impl_in_rule__ContentType__Group_12__43661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentType__Group_12__4__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12_3__0__Impl_in_rule__ContentType__Group_12_3__03730 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12_3__1_in_rule__ContentType__Group_12_3__03733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentType__Group_12_3__0__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12_3__1__Impl_in_rule__ContentType__Group_12_3__13792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasVersionsAssignment_12_3_1_in_rule__ContentType__Group_12_3__1__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__0__Impl_in_rule__ContentType__Group_13__03853 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__1_in_rule__ContentType__Group_13__03856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ContentType__Group_13__0__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__1__Impl_in_rule__ContentType__Group_13__13915 = new BitSet(new long[]{0x0200040000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__2_in_rule__ContentType__Group_13__13918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ContentType__Group_13__1__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__2__Impl_in_rule__ContentType__Group_13__23977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__ModifiedByAssignment_13_2_in_rule__ContentType__Group_13__2__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04040 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Property__Group__0__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14102 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Property__Group__1__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24164 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Property__Group__2__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34226 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Property__Group__3__Impl4257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44288 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__44291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__NameAssignment_4_in_rule__Property__Group__4__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__54348 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Property__Group__6_in_rule__Property__Group__54351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Property__Group__5__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__64410 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Property__Group__7_in_rule__Property__Group__64413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Property__Group__6__Impl4441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__74472 = new BitSet(new long[]{0x0000008020000000L});
        public static final BitSet FOLLOW_rule__Property__Group__8_in_rule__Property__Group__74475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__AccessModiferAssignment_7_in_rule__Property__Group__7__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__8__Impl_in_rule__Property__Group__84532 = new BitSet(new long[]{0x0000008020000000L});
        public static final BitSet FOLLOW_rule__Property__Group__9_in_rule__Property__Group__84535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_8__0_in_rule__Property__Group__8__Impl4562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__9__Impl_in_rule__Property__Group__94593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Property__Group__9__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_8__0__Impl_in_rule__Property__Group_8__04672 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Property__Group_8__1_in_rule__Property__Group_8__04675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Property__Group_8__0__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_8__1__Impl_in_rule__Property__Group_8__14734 = new BitSet(new long[]{0x000000000007F800L});
        public static final BitSet FOLLOW_rule__Property__Group_8__2_in_rule__Property__Group_8__14737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Property__Group_8__1__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_8__2__Impl_in_rule__Property__Group_8__24796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__TypeAssignment_8_2_in_rule__Property__Group_8__2__Impl4823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__04859 = new BitSet(new long[]{0x0100010000000000L});
        public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__04862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__14920 = new BitSet(new long[]{0x0100010000000000L});
        public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__14923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__IsAdminAssignment_1_in_rule__Role__Group__1__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__24981 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__24984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Role__Group__2__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__35043 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__35046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Role__Group__3__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__45105 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__45108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Role__Group__4__Impl5136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__55167 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Role__Group__6_in_rule__Role__Group__55170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Role__Group__5__Impl5198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__65229 = new BitSet(new long[]{0x0000020020000000L});
        public static final BitSet FOLLOW_rule__Role__Group__7_in_rule__Role__Group__65232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__NameAssignment_6_in_rule__Role__Group__6__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__75289 = new BitSet(new long[]{0x0000020020000000L});
        public static final BitSet FOLLOW_rule__Role__Group__8_in_rule__Role__Group__75292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__0_in_rule__Role__Group__7__Impl5319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__8__Impl_in_rule__Role__Group__85350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Role__Group__8__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__0__Impl_in_rule__Role__Group_7__05427 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__1_in_rule__Role__Group_7__05430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Role__Group_7__0__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__1__Impl_in_rule__Role__Group_7__15489 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Role__Group_7__2_in_rule__Role__Group_7__15492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Role__Group_7__1__Impl5520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__2__Impl_in_rule__Role__Group_7__25551 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__3_in_rule__Role__Group_7__25554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__TypesAssignment_7_2_in_rule__Role__Group_7__2__Impl5581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__3__Impl_in_rule__Role__Group_7__35611 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__4_in_rule__Role__Group_7__35614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__0_in_rule__Role__Group_7__3__Impl5641 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__4__Impl_in_rule__Role__Group_7__45672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Role__Group_7__4__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__0__Impl_in_rule__Role__Group_7_3__05741 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__1_in_rule__Role__Group_7_3__05744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Role__Group_7_3__0__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__1__Impl_in_rule__Role__Group_7_3__15803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__TypesAssignment_7_3_1_in_rule__Role__Group_7_3__1__Impl5830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__05864 = new BitSet(new long[]{0x0200040000000000L});
        public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__05867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__15925 = new BitSet(new long[]{0x0200040000000000L});
        public static final BitSet FOLLOW_rule__User__Group__2_in_rule__User__Group__15928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__DisabledAssignment_1_in_rule__User__Group__1__Impl5955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__25986 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__User__Group__3_in_rule__User__Group__25989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__User__Group__2__Impl6017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__36048 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__User__Group__4_in_rule__User__Group__36051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__User__Group__3__Impl6079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__46110 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group__5_in_rule__User__Group__46113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__User__Group__4__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__5__Impl_in_rule__User__Group__56172 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group__6_in_rule__User__Group__56175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group__5__Impl6203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__6__Impl_in_rule__User__Group__66234 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__7_in_rule__User__Group__66237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__NameAssignment_6_in_rule__User__Group__6__Impl6264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__7__Impl_in_rule__User__Group__76294 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__8_in_rule__User__Group__76297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__0_in_rule__User__Group__7__Impl6324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__8__Impl_in_rule__User__Group__86355 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__9_in_rule__User__Group__86358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__0_in_rule__User__Group__8__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__9__Impl_in_rule__User__Group__96416 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__10_in_rule__User__Group__96419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__0_in_rule__User__Group__9__Impl6446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__10__Impl_in_rule__User__Group__106477 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__11_in_rule__User__Group__106480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__0_in_rule__User__Group__10__Impl6507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__11__Impl_in_rule__User__Group__116538 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__12_in_rule__User__Group__116541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__0_in_rule__User__Group__11__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__12__Impl_in_rule__User__Group__126599 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__13_in_rule__User__Group__126602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__0_in_rule__User__Group__12__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__13__Impl_in_rule__User__Group__136660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__User__Group__13__Impl6688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__0__Impl_in_rule__User__Group_7__06747 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_7__1_in_rule__User__Group_7__06750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__User__Group_7__0__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__1__Impl_in_rule__User__Group_7__16809 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_7__2_in_rule__User__Group_7__16812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_7__1__Impl6840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__2__Impl_in_rule__User__Group_7__26871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__FirstnameAssignment_7_2_in_rule__User__Group_7__2__Impl6898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__0__Impl_in_rule__User__Group_8__06934 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_8__1_in_rule__User__Group_8__06937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__User__Group_8__0__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__1__Impl_in_rule__User__Group_8__16996 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_8__2_in_rule__User__Group_8__16999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_8__1__Impl7027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__2__Impl_in_rule__User__Group_8__27058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__LastnameAssignment_8_2_in_rule__User__Group_8__2__Impl7085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__0__Impl_in_rule__User__Group_9__07121 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_9__1_in_rule__User__Group_9__07124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__User__Group_9__0__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__1__Impl_in_rule__User__Group_9__17183 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_9__2_in_rule__User__Group_9__17186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_9__1__Impl7214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__2__Impl_in_rule__User__Group_9__27245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__LoginAssignment_9_2_in_rule__User__Group_9__2__Impl7272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__0__Impl_in_rule__User__Group_10__07308 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_10__1_in_rule__User__Group_10__07311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__User__Group_10__0__Impl7339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__1__Impl_in_rule__User__Group_10__17370 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_10__2_in_rule__User__Group_10__17373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_10__1__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__2__Impl_in_rule__User__Group_10__27432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__PasswordAssignment_10_2_in_rule__User__Group_10__2__Impl7459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__0__Impl_in_rule__User__Group_11__07495 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_11__1_in_rule__User__Group_11__07498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__User__Group_11__0__Impl7526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__1__Impl_in_rule__User__Group_11__17557 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_11__2_in_rule__User__Group_11__17560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_11__1__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__2__Impl_in_rule__User__Group_11__27619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__EmailAssignment_11_2_in_rule__User__Group_11__2__Impl7646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__0__Impl_in_rule__User__Group_12__07682 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_12__1_in_rule__User__Group_12__07685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__User__Group_12__0__Impl7713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__1__Impl_in_rule__User__Group_12__17744 = new BitSet(new long[]{0x0100010000000000L});
        public static final BitSet FOLLOW_rule__User__Group_12__2_in_rule__User__Group_12__17747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_12__1__Impl7775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__2__Impl_in_rule__User__Group_12__27806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__HasRoleAssignment_12_2_in_rule__User__Group_12__2__Impl7833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__07869 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__07872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__17930 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__17933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Version__Group__1__Impl7961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__27992 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Version__Group__3_in_rule__Version__Group__27995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Version__Group__2__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__3__Impl_in_rule__Version__Group__38054 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group__4_in_rule__Version__Group__38057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Version__Group__3__Impl8085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__4__Impl_in_rule__Version__Group__48116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__NameAssignment_4_in_rule__Version__Group__4__Impl8143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__0__Impl_in_rule__CMS__Group__08183 = new BitSet(new long[]{0x0084000100000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__1_in_rule__CMS__Group__08186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__1__Impl_in_rule__CMS__Group__18244 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__2_in_rule__CMS__Group__18247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__CMS__Group__1__Impl8275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__2__Impl_in_rule__CMS__Group__28306 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__3_in_rule__CMS__Group__28309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CMS__Group__2__Impl8337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__3__Impl_in_rule__CMS__Group__38368 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__4_in_rule__CMS__Group__38371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CMS__Group__3__Impl8399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__4__Impl_in_rule__CMS__Group__48430 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group__5_in_rule__CMS__Group__48433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group__4__Impl8461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__5__Impl_in_rule__CMS__Group__58492 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__6_in_rule__CMS__Group__58495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__NameAssignment_5_in_rule__CMS__Group__5__Impl8522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__6__Impl_in_rule__CMS__Group__68552 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__7_in_rule__CMS__Group__68555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__0_in_rule__CMS__Group__6__Impl8582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__7__Impl_in_rule__CMS__Group__78612 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__8_in_rule__CMS__Group__78615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__0_in_rule__CMS__Group__7__Impl8642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__8__Impl_in_rule__CMS__Group__88672 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__9_in_rule__CMS__Group__88675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__0_in_rule__CMS__Group__8__Impl8702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__9__Impl_in_rule__CMS__Group__98732 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__10_in_rule__CMS__Group__98735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__0_in_rule__CMS__Group__9__Impl8762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__10__Impl_in_rule__CMS__Group__108792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CMS__Group__10__Impl8820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__0__Impl_in_rule__CMS__Group_6__08873 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__1_in_rule__CMS__Group_6__08876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__CMS__Group_6__0__Impl8904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__1__Impl_in_rule__CMS__Group_6__18935 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__2_in_rule__CMS__Group_6__18938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group_6__1__Impl8966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__2__Impl_in_rule__CMS__Group_6__28997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__TypeAssignment_6_2_in_rule__CMS__Group_6__2__Impl9024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__0__Impl_in_rule__CMS__Group_7__09060 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__1_in_rule__CMS__Group_7__09063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__CMS__Group_7__0__Impl9091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__1__Impl_in_rule__CMS__Group_7__19122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__2_in_rule__CMS__Group_7__19125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group_7__1__Impl9153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__2__Impl_in_rule__CMS__Group_7__29184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Address_urlAssignment_7_2_in_rule__CMS__Group_7__2__Impl9211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__0__Impl_in_rule__CMS__Group_8__09247 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__1_in_rule__CMS__Group_8__09250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__CMS__Group_8__0__Impl9278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__1__Impl_in_rule__CMS__Group_8__19309 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__2_in_rule__CMS__Group_8__19312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group_8__1__Impl9340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__2__Impl_in_rule__CMS__Group_8__29371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__UsernameAssignment_8_2_in_rule__CMS__Group_8__2__Impl9398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__0__Impl_in_rule__CMS__Group_9__09434 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__1_in_rule__CMS__Group_9__09437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__CMS__Group_9__0__Impl9465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__1__Impl_in_rule__CMS__Group_9__19496 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__2_in_rule__CMS__Group_9__19499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group_9__1__Impl9527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__2__Impl_in_rule__CMS__Group_9__29558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__PasswordAssignment_9_2_in_rule__CMS__Group_9__2__Impl9585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09621 = new BitSet(new long[]{0x0040000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__EInt__Group__0__Impl9653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ContentModel__NameAssignment_59751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_29782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_3_19813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__ContentType__VisibleAssignment_09849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ContentType__NameAssignment_59888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ContentType__GuidAssignment_6_29919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_99950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_10_19981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_12_210012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_12_3_110043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUser_in_rule__ContentType__ModifiedByAssignment_13_210074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__NameAssignment_410105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessLevelEnum_in_rule__Property__AccessModiferAssignment_710136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__Property__TypeAssignment_8_210167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Role__IsAdminAssignment_110203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Role__NameAssignment_610242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_210273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_3_110304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__User__DisabledAssignment_110340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__NameAssignment_610379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__FirstnameAssignment_7_210410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__LastnameAssignment_8_210441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__LoginAssignment_9_210472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__PasswordAssignment_10_210503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__EmailAssignment_11_210534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__User__HasRoleAssignment_12_210565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Version__NameAssignment_410596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__NameAssignment_510627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMSEnum_in_rule__CMS__TypeAssignment_6_210658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__Address_urlAssignment_7_210689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__UsernameAssignment_8_210720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__PasswordAssignment_9_210751 = new BitSet(new long[]{0x0000000000000002L});
    }


}