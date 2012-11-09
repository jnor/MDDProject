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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'char'", "'byte'", "'string'", "'int'", "'float'", "'double'", "'boolean'", "'date'", "'Jease'", "'N2'", "'Concrete5'", "'Plone'", "'public'", "'private'", "'ContentModel'", "'{'", "'Name'", "'='", "'}'", "'Contains'", "';'", "'ContentType'", "'Properties'", "'Guid'", "'Versions'", "'ModifiedBy'", "'Property'", "'AccessModifier'", "'Type'", "'Role'", "'Types'", "'User'", "'userFirstName'", "'userLastName'", "'Login'", "'Password'", "'Email'", "'Version'", "'Number'", "'CMS'", "'Address_url'", "'Username'", "'-'", "'visible'", "'isAdmin'", "'disabled'"
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

            if ( (LA1_0==32||LA1_0==54) ) {
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
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==32||LA7_1==50||LA7_1==54) ) {
                        alt7=1;
                    }


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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:953:1: rule__ContentModel__Group_6__4 : rule__ContentModel__Group_6__4__Impl rule__ContentModel__Group_6__5 ;
    public final void rule__ContentModel__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:957:1: ( rule__ContentModel__Group_6__4__Impl rule__ContentModel__Group_6__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:958:2: rule__ContentModel__Group_6__4__Impl rule__ContentModel__Group_6__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__4__Impl_in_rule__ContentModel__Group_6__41966);
            rule__ContentModel__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__5_in_rule__ContentModel__Group_6__41969);
            rule__ContentModel__Group_6__5();

            state._fsp--;


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:965:1: rule__ContentModel__Group_6__4__Impl : ( ';' ) ;
    public final void rule__ContentModel__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:969:1: ( ( ';' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:970:1: ( ';' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:970:1: ( ';' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:971:1: ';'
            {
             before(grammarAccess.getContentModelAccess().getSemicolonKeyword_6_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentModel__Group_6__4__Impl1997); 
             after(grammarAccess.getContentModelAccess().getSemicolonKeyword_6_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ContentModel__Group_6__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:984:1: rule__ContentModel__Group_6__5 : rule__ContentModel__Group_6__5__Impl ;
    public final void rule__ContentModel__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:988:1: ( rule__ContentModel__Group_6__5__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:989:2: rule__ContentModel__Group_6__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6__5__Impl_in_rule__ContentModel__Group_6__52028);
            rule__ContentModel__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__5"


    // $ANTLR start "rule__ContentModel__Group_6__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:995:1: rule__ContentModel__Group_6__5__Impl : ( '}' ) ;
    public final void rule__ContentModel__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:999:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1000:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1000:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1001:1: '}'
            {
             before(grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_6_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentModel__Group_6__5__Impl2056); 
             after(grammarAccess.getContentModelAccess().getRightCurlyBracketKeyword_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentModel__Group_6__5__Impl"


    // $ANTLR start "rule__ContentModel__Group_6_3__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1026:1: rule__ContentModel__Group_6_3__0 : rule__ContentModel__Group_6_3__0__Impl rule__ContentModel__Group_6_3__1 ;
    public final void rule__ContentModel__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1030:1: ( rule__ContentModel__Group_6_3__0__Impl rule__ContentModel__Group_6_3__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1031:2: rule__ContentModel__Group_6_3__0__Impl rule__ContentModel__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__0__Impl_in_rule__ContentModel__Group_6_3__02099);
            rule__ContentModel__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__1_in_rule__ContentModel__Group_6_3__02102);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1038:1: rule__ContentModel__Group_6_3__0__Impl : ( ';' ) ;
    public final void rule__ContentModel__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1042:1: ( ( ';' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1043:1: ( ';' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1043:1: ( ';' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1044:1: ';'
            {
             before(grammarAccess.getContentModelAccess().getSemicolonKeyword_6_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentModel__Group_6_3__0__Impl2130); 
             after(grammarAccess.getContentModelAccess().getSemicolonKeyword_6_3_0()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1057:1: rule__ContentModel__Group_6_3__1 : rule__ContentModel__Group_6_3__1__Impl ;
    public final void rule__ContentModel__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1061:1: ( rule__ContentModel__Group_6_3__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1062:2: rule__ContentModel__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__Group_6_3__1__Impl_in_rule__ContentModel__Group_6_3__12161);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1068:1: rule__ContentModel__Group_6_3__1__Impl : ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) ) ;
    public final void rule__ContentModel__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1072:1: ( ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1073:1: ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1073:1: ( ( rule__ContentModel__HasElementsAssignment_6_3_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1074:1: ( rule__ContentModel__HasElementsAssignment_6_3_1 )
            {
             before(grammarAccess.getContentModelAccess().getHasElementsAssignment_6_3_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1075:1: ( rule__ContentModel__HasElementsAssignment_6_3_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1075:2: rule__ContentModel__HasElementsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentModel__HasElementsAssignment_6_3_1_in_rule__ContentModel__Group_6_3__1__Impl2188);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1089:1: rule__ContentType__Group__0 : rule__ContentType__Group__0__Impl rule__ContentType__Group__1 ;
    public final void rule__ContentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1093:1: ( rule__ContentType__Group__0__Impl rule__ContentType__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1094:2: rule__ContentType__Group__0__Impl rule__ContentType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__0__Impl_in_rule__ContentType__Group__02222);
            rule__ContentType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__1_in_rule__ContentType__Group__02225);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1101:1: rule__ContentType__Group__0__Impl : ( ( rule__ContentType__VisibleAssignment_0 )? ) ;
    public final void rule__ContentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1105:1: ( ( ( rule__ContentType__VisibleAssignment_0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1106:1: ( ( rule__ContentType__VisibleAssignment_0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1106:1: ( ( rule__ContentType__VisibleAssignment_0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1107:1: ( rule__ContentType__VisibleAssignment_0 )?
            {
             before(grammarAccess.getContentTypeAccess().getVisibleAssignment_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1108:1: ( rule__ContentType__VisibleAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==54) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1108:2: rule__ContentType__VisibleAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__VisibleAssignment_0_in_rule__ContentType__Group__0__Impl2252);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1118:1: rule__ContentType__Group__1 : rule__ContentType__Group__1__Impl rule__ContentType__Group__2 ;
    public final void rule__ContentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1122:1: ( rule__ContentType__Group__1__Impl rule__ContentType__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1123:2: rule__ContentType__Group__1__Impl rule__ContentType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__1__Impl_in_rule__ContentType__Group__12283);
            rule__ContentType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__2_in_rule__ContentType__Group__12286);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1130:1: rule__ContentType__Group__1__Impl : ( 'ContentType' ) ;
    public final void rule__ContentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1134:1: ( ( 'ContentType' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1135:1: ( 'ContentType' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1135:1: ( 'ContentType' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1136:1: 'ContentType'
            {
             before(grammarAccess.getContentTypeAccess().getContentTypeKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ContentType__Group__1__Impl2314); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1149:1: rule__ContentType__Group__2 : rule__ContentType__Group__2__Impl rule__ContentType__Group__3 ;
    public final void rule__ContentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1153:1: ( rule__ContentType__Group__2__Impl rule__ContentType__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1154:2: rule__ContentType__Group__2__Impl rule__ContentType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__2__Impl_in_rule__ContentType__Group__22345);
            rule__ContentType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__3_in_rule__ContentType__Group__22348);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1161:1: rule__ContentType__Group__2__Impl : ( '{' ) ;
    public final void rule__ContentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1165:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1166:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1166:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1167:1: '{'
            {
             before(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentType__Group__2__Impl2376); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1180:1: rule__ContentType__Group__3 : rule__ContentType__Group__3__Impl rule__ContentType__Group__4 ;
    public final void rule__ContentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1184:1: ( rule__ContentType__Group__3__Impl rule__ContentType__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1185:2: rule__ContentType__Group__3__Impl rule__ContentType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__3__Impl_in_rule__ContentType__Group__32407);
            rule__ContentType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__4_in_rule__ContentType__Group__32410);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1192:1: rule__ContentType__Group__3__Impl : ( 'Name' ) ;
    public final void rule__ContentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1196:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1197:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1197:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1198:1: 'Name'
            {
             before(grammarAccess.getContentTypeAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ContentType__Group__3__Impl2438); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1211:1: rule__ContentType__Group__4 : rule__ContentType__Group__4__Impl rule__ContentType__Group__5 ;
    public final void rule__ContentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1215:1: ( rule__ContentType__Group__4__Impl rule__ContentType__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1216:2: rule__ContentType__Group__4__Impl rule__ContentType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__4__Impl_in_rule__ContentType__Group__42469);
            rule__ContentType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__5_in_rule__ContentType__Group__42472);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1223:1: rule__ContentType__Group__4__Impl : ( '=' ) ;
    public final void rule__ContentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1227:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1228:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1228:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1229:1: '='
            {
             before(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ContentType__Group__4__Impl2500); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1242:1: rule__ContentType__Group__5 : rule__ContentType__Group__5__Impl rule__ContentType__Group__6 ;
    public final void rule__ContentType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1246:1: ( rule__ContentType__Group__5__Impl rule__ContentType__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1247:2: rule__ContentType__Group__5__Impl rule__ContentType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__5__Impl_in_rule__ContentType__Group__52531);
            rule__ContentType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__6_in_rule__ContentType__Group__52534);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1254:1: rule__ContentType__Group__5__Impl : ( ( rule__ContentType__NameAssignment_5 ) ) ;
    public final void rule__ContentType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1258:1: ( ( ( rule__ContentType__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1259:1: ( ( rule__ContentType__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1259:1: ( ( rule__ContentType__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1260:1: ( rule__ContentType__NameAssignment_5 )
            {
             before(grammarAccess.getContentTypeAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1261:1: ( rule__ContentType__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1261:2: rule__ContentType__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__NameAssignment_5_in_rule__ContentType__Group__5__Impl2561);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1271:1: rule__ContentType__Group__6 : rule__ContentType__Group__6__Impl rule__ContentType__Group__7 ;
    public final void rule__ContentType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1275:1: ( rule__ContentType__Group__6__Impl rule__ContentType__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1276:2: rule__ContentType__Group__6__Impl rule__ContentType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__6__Impl_in_rule__ContentType__Group__62591);
            rule__ContentType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__7_in_rule__ContentType__Group__62594);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1283:1: rule__ContentType__Group__6__Impl : ( 'Properties' ) ;
    public final void rule__ContentType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1287:1: ( ( 'Properties' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1288:1: ( 'Properties' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1288:1: ( 'Properties' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1289:1: 'Properties'
            {
             before(grammarAccess.getContentTypeAccess().getPropertiesKeyword_6()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ContentType__Group__6__Impl2622); 
             after(grammarAccess.getContentTypeAccess().getPropertiesKeyword_6()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1302:1: rule__ContentType__Group__7 : rule__ContentType__Group__7__Impl rule__ContentType__Group__8 ;
    public final void rule__ContentType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1306:1: ( rule__ContentType__Group__7__Impl rule__ContentType__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1307:2: rule__ContentType__Group__7__Impl rule__ContentType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__7__Impl_in_rule__ContentType__Group__72653);
            rule__ContentType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__8_in_rule__ContentType__Group__72656);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1314:1: rule__ContentType__Group__7__Impl : ( '{' ) ;
    public final void rule__ContentType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1318:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1319:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1319:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1320:1: '{'
            {
             before(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentType__Group__7__Impl2684); 
             after(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1333:1: rule__ContentType__Group__8 : rule__ContentType__Group__8__Impl rule__ContentType__Group__9 ;
    public final void rule__ContentType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1337:1: ( rule__ContentType__Group__8__Impl rule__ContentType__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1338:2: rule__ContentType__Group__8__Impl rule__ContentType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__8__Impl_in_rule__ContentType__Group__82715);
            rule__ContentType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__9_in_rule__ContentType__Group__82718);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1345:1: rule__ContentType__Group__8__Impl : ( ( rule__ContentType__HasPropertiesAssignment_8 ) ) ;
    public final void rule__ContentType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1349:1: ( ( ( rule__ContentType__HasPropertiesAssignment_8 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1350:1: ( ( rule__ContentType__HasPropertiesAssignment_8 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1350:1: ( ( rule__ContentType__HasPropertiesAssignment_8 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1351:1: ( rule__ContentType__HasPropertiesAssignment_8 )
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_8()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1352:1: ( rule__ContentType__HasPropertiesAssignment_8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1352:2: rule__ContentType__HasPropertiesAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasPropertiesAssignment_8_in_rule__ContentType__Group__8__Impl2745);
            rule__ContentType__HasPropertiesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_8()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1362:1: rule__ContentType__Group__9 : rule__ContentType__Group__9__Impl rule__ContentType__Group__10 ;
    public final void rule__ContentType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1366:1: ( rule__ContentType__Group__9__Impl rule__ContentType__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1367:2: rule__ContentType__Group__9__Impl rule__ContentType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__9__Impl_in_rule__ContentType__Group__92775);
            rule__ContentType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__10_in_rule__ContentType__Group__92778);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1374:1: rule__ContentType__Group__9__Impl : ( ( rule__ContentType__Group_9__0 )* ) ;
    public final void rule__ContentType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1378:1: ( ( ( rule__ContentType__Group_9__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1379:1: ( ( rule__ContentType__Group_9__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1379:1: ( ( rule__ContentType__Group_9__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1380:1: ( rule__ContentType__Group_9__0 )*
            {
             before(grammarAccess.getContentTypeAccess().getGroup_9()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1381:1: ( rule__ContentType__Group_9__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==37) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1381:2: rule__ContentType__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_9__0_in_rule__ContentType__Group__9__Impl2805);
            	    rule__ContentType__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getContentTypeAccess().getGroup_9()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1391:1: rule__ContentType__Group__10 : rule__ContentType__Group__10__Impl rule__ContentType__Group__11 ;
    public final void rule__ContentType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1395:1: ( rule__ContentType__Group__10__Impl rule__ContentType__Group__11 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1396:2: rule__ContentType__Group__10__Impl rule__ContentType__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__10__Impl_in_rule__ContentType__Group__102836);
            rule__ContentType__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__11_in_rule__ContentType__Group__102839);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1403:1: rule__ContentType__Group__10__Impl : ( ';' ) ;
    public final void rule__ContentType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1407:1: ( ( ';' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1408:1: ( ';' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1408:1: ( ';' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1409:1: ';'
            {
             before(grammarAccess.getContentTypeAccess().getSemicolonKeyword_10()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentType__Group__10__Impl2867); 
             after(grammarAccess.getContentTypeAccess().getSemicolonKeyword_10()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1422:1: rule__ContentType__Group__11 : rule__ContentType__Group__11__Impl rule__ContentType__Group__12 ;
    public final void rule__ContentType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1426:1: ( rule__ContentType__Group__11__Impl rule__ContentType__Group__12 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1427:2: rule__ContentType__Group__11__Impl rule__ContentType__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__11__Impl_in_rule__ContentType__Group__112898);
            rule__ContentType__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__12_in_rule__ContentType__Group__112901);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1434:1: rule__ContentType__Group__11__Impl : ( '}' ) ;
    public final void rule__ContentType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1438:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1439:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1439:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1440:1: '}'
            {
             before(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentType__Group__11__Impl2929); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1453:1: rule__ContentType__Group__12 : rule__ContentType__Group__12__Impl rule__ContentType__Group__13 ;
    public final void rule__ContentType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1457:1: ( rule__ContentType__Group__12__Impl rule__ContentType__Group__13 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1458:2: rule__ContentType__Group__12__Impl rule__ContentType__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__12__Impl_in_rule__ContentType__Group__122960);
            rule__ContentType__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__13_in_rule__ContentType__Group__122963);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1465:1: rule__ContentType__Group__12__Impl : ( ( rule__ContentType__Group_12__0 )? ) ;
    public final void rule__ContentType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1469:1: ( ( ( rule__ContentType__Group_12__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1470:1: ( ( rule__ContentType__Group_12__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1470:1: ( ( rule__ContentType__Group_12__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1471:1: ( rule__ContentType__Group_12__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_12()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1472:1: ( rule__ContentType__Group_12__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1472:2: rule__ContentType__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__0_in_rule__ContentType__Group__12__Impl2990);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1482:1: rule__ContentType__Group__13 : rule__ContentType__Group__13__Impl rule__ContentType__Group__14 ;
    public final void rule__ContentType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1486:1: ( rule__ContentType__Group__13__Impl rule__ContentType__Group__14 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1487:2: rule__ContentType__Group__13__Impl rule__ContentType__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__13__Impl_in_rule__ContentType__Group__133021);
            rule__ContentType__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__14_in_rule__ContentType__Group__133024);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1494:1: rule__ContentType__Group__13__Impl : ( ( rule__ContentType__Group_13__0 )? ) ;
    public final void rule__ContentType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1498:1: ( ( ( rule__ContentType__Group_13__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1499:1: ( ( rule__ContentType__Group_13__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1499:1: ( ( rule__ContentType__Group_13__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1500:1: ( rule__ContentType__Group_13__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_13()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1501:1: ( rule__ContentType__Group_13__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1501:2: rule__ContentType__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__0_in_rule__ContentType__Group__13__Impl3051);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1511:1: rule__ContentType__Group__14 : rule__ContentType__Group__14__Impl rule__ContentType__Group__15 ;
    public final void rule__ContentType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1515:1: ( rule__ContentType__Group__14__Impl rule__ContentType__Group__15 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1516:2: rule__ContentType__Group__14__Impl rule__ContentType__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__14__Impl_in_rule__ContentType__Group__143082);
            rule__ContentType__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__15_in_rule__ContentType__Group__143085);
            rule__ContentType__Group__15();

            state._fsp--;


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1523:1: rule__ContentType__Group__14__Impl : ( ( rule__ContentType__Group_14__0 )? ) ;
    public final void rule__ContentType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1527:1: ( ( ( rule__ContentType__Group_14__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1528:1: ( ( rule__ContentType__Group_14__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1528:1: ( ( rule__ContentType__Group_14__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1529:1: ( rule__ContentType__Group_14__0 )?
            {
             before(grammarAccess.getContentTypeAccess().getGroup_14()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1530:1: ( rule__ContentType__Group_14__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1530:2: rule__ContentType__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_14__0_in_rule__ContentType__Group__14__Impl3112);
                    rule__ContentType__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentTypeAccess().getGroup_14()); 

            }


            }

        }
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


    // $ANTLR start "rule__ContentType__Group__15"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1540:1: rule__ContentType__Group__15 : rule__ContentType__Group__15__Impl ;
    public final void rule__ContentType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1544:1: ( rule__ContentType__Group__15__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1545:2: rule__ContentType__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group__15__Impl_in_rule__ContentType__Group__153143);
            rule__ContentType__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__15"


    // $ANTLR start "rule__ContentType__Group__15__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1551:1: rule__ContentType__Group__15__Impl : ( '}' ) ;
    public final void rule__ContentType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1555:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1556:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1556:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1557:1: '}'
            {
             before(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_15()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentType__Group__15__Impl3171); 
             after(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group__15__Impl"


    // $ANTLR start "rule__ContentType__Group_9__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1602:1: rule__ContentType__Group_9__0 : rule__ContentType__Group_9__0__Impl rule__ContentType__Group_9__1 ;
    public final void rule__ContentType__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1606:1: ( rule__ContentType__Group_9__0__Impl rule__ContentType__Group_9__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1607:2: rule__ContentType__Group_9__0__Impl rule__ContentType__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_9__0__Impl_in_rule__ContentType__Group_9__03234);
            rule__ContentType__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_9__1_in_rule__ContentType__Group_9__03237);
            rule__ContentType__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_9__0"


    // $ANTLR start "rule__ContentType__Group_9__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1614:1: rule__ContentType__Group_9__0__Impl : ( ';' ) ;
    public final void rule__ContentType__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1618:1: ( ( ';' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1619:1: ( ';' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1619:1: ( ';' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1620:1: ';'
            {
             before(grammarAccess.getContentTypeAccess().getSemicolonKeyword_9_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentType__Group_9__0__Impl3265); 
             after(grammarAccess.getContentTypeAccess().getSemicolonKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_9__0__Impl"


    // $ANTLR start "rule__ContentType__Group_9__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1633:1: rule__ContentType__Group_9__1 : rule__ContentType__Group_9__1__Impl ;
    public final void rule__ContentType__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1637:1: ( rule__ContentType__Group_9__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1638:2: rule__ContentType__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_9__1__Impl_in_rule__ContentType__Group_9__13296);
            rule__ContentType__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_9__1"


    // $ANTLR start "rule__ContentType__Group_9__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1644:1: rule__ContentType__Group_9__1__Impl : ( ( rule__ContentType__HasPropertiesAssignment_9_1 ) ) ;
    public final void rule__ContentType__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1648:1: ( ( ( rule__ContentType__HasPropertiesAssignment_9_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1649:1: ( ( rule__ContentType__HasPropertiesAssignment_9_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1649:1: ( ( rule__ContentType__HasPropertiesAssignment_9_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1650:1: ( rule__ContentType__HasPropertiesAssignment_9_1 )
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_9_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1651:1: ( rule__ContentType__HasPropertiesAssignment_9_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1651:2: rule__ContentType__HasPropertiesAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasPropertiesAssignment_9_1_in_rule__ContentType__Group_9__1__Impl3323);
            rule__ContentType__HasPropertiesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getHasPropertiesAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_9__1__Impl"


    // $ANTLR start "rule__ContentType__Group_12__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1665:1: rule__ContentType__Group_12__0 : rule__ContentType__Group_12__0__Impl rule__ContentType__Group_12__1 ;
    public final void rule__ContentType__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1669:1: ( rule__ContentType__Group_12__0__Impl rule__ContentType__Group_12__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1670:2: rule__ContentType__Group_12__0__Impl rule__ContentType__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__0__Impl_in_rule__ContentType__Group_12__03357);
            rule__ContentType__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__1_in_rule__ContentType__Group_12__03360);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1677:1: rule__ContentType__Group_12__0__Impl : ( 'Guid' ) ;
    public final void rule__ContentType__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1681:1: ( ( 'Guid' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1682:1: ( 'Guid' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1682:1: ( 'Guid' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1683:1: 'Guid'
            {
             before(grammarAccess.getContentTypeAccess().getGuidKeyword_12_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ContentType__Group_12__0__Impl3388); 
             after(grammarAccess.getContentTypeAccess().getGuidKeyword_12_0()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1696:1: rule__ContentType__Group_12__1 : rule__ContentType__Group_12__1__Impl rule__ContentType__Group_12__2 ;
    public final void rule__ContentType__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1700:1: ( rule__ContentType__Group_12__1__Impl rule__ContentType__Group_12__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1701:2: rule__ContentType__Group_12__1__Impl rule__ContentType__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__1__Impl_in_rule__ContentType__Group_12__13419);
            rule__ContentType__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__2_in_rule__ContentType__Group_12__13422);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1708:1: rule__ContentType__Group_12__1__Impl : ( '=' ) ;
    public final void rule__ContentType__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1712:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1713:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1713:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1714:1: '='
            {
             before(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_12_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ContentType__Group_12__1__Impl3450); 
             after(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_12_1()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1727:1: rule__ContentType__Group_12__2 : rule__ContentType__Group_12__2__Impl ;
    public final void rule__ContentType__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1731:1: ( rule__ContentType__Group_12__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1732:2: rule__ContentType__Group_12__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_12__2__Impl_in_rule__ContentType__Group_12__23481);
            rule__ContentType__Group_12__2__Impl();

            state._fsp--;


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1738:1: rule__ContentType__Group_12__2__Impl : ( ( rule__ContentType__GuidAssignment_12_2 ) ) ;
    public final void rule__ContentType__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1742:1: ( ( ( rule__ContentType__GuidAssignment_12_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1743:1: ( ( rule__ContentType__GuidAssignment_12_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1743:1: ( ( rule__ContentType__GuidAssignment_12_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1744:1: ( rule__ContentType__GuidAssignment_12_2 )
            {
             before(grammarAccess.getContentTypeAccess().getGuidAssignment_12_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1745:1: ( rule__ContentType__GuidAssignment_12_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1745:2: rule__ContentType__GuidAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__GuidAssignment_12_2_in_rule__ContentType__Group_12__2__Impl3508);
            rule__ContentType__GuidAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getGuidAssignment_12_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ContentType__Group_13__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1761:1: rule__ContentType__Group_13__0 : rule__ContentType__Group_13__0__Impl rule__ContentType__Group_13__1 ;
    public final void rule__ContentType__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1765:1: ( rule__ContentType__Group_13__0__Impl rule__ContentType__Group_13__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1766:2: rule__ContentType__Group_13__0__Impl rule__ContentType__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__0__Impl_in_rule__ContentType__Group_13__03544);
            rule__ContentType__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__1_in_rule__ContentType__Group_13__03547);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1773:1: rule__ContentType__Group_13__0__Impl : ( 'Versions' ) ;
    public final void rule__ContentType__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1777:1: ( ( 'Versions' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1778:1: ( 'Versions' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1778:1: ( 'Versions' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1779:1: 'Versions'
            {
             before(grammarAccess.getContentTypeAccess().getVersionsKeyword_13_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ContentType__Group_13__0__Impl3575); 
             after(grammarAccess.getContentTypeAccess().getVersionsKeyword_13_0()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1792:1: rule__ContentType__Group_13__1 : rule__ContentType__Group_13__1__Impl rule__ContentType__Group_13__2 ;
    public final void rule__ContentType__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1796:1: ( rule__ContentType__Group_13__1__Impl rule__ContentType__Group_13__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1797:2: rule__ContentType__Group_13__1__Impl rule__ContentType__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__1__Impl_in_rule__ContentType__Group_13__13606);
            rule__ContentType__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__2_in_rule__ContentType__Group_13__13609);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1804:1: rule__ContentType__Group_13__1__Impl : ( '{' ) ;
    public final void rule__ContentType__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1808:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1809:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1809:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1810:1: '{'
            {
             before(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ContentType__Group_13__1__Impl3637); 
             after(grammarAccess.getContentTypeAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1823:1: rule__ContentType__Group_13__2 : rule__ContentType__Group_13__2__Impl rule__ContentType__Group_13__3 ;
    public final void rule__ContentType__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1827:1: ( rule__ContentType__Group_13__2__Impl rule__ContentType__Group_13__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1828:2: rule__ContentType__Group_13__2__Impl rule__ContentType__Group_13__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__2__Impl_in_rule__ContentType__Group_13__23668);
            rule__ContentType__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__3_in_rule__ContentType__Group_13__23671);
            rule__ContentType__Group_13__3();

            state._fsp--;


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1835:1: rule__ContentType__Group_13__2__Impl : ( ( rule__ContentType__HasVersionsAssignment_13_2 ) ) ;
    public final void rule__ContentType__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1839:1: ( ( ( rule__ContentType__HasVersionsAssignment_13_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1840:1: ( ( rule__ContentType__HasVersionsAssignment_13_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1840:1: ( ( rule__ContentType__HasVersionsAssignment_13_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1841:1: ( rule__ContentType__HasVersionsAssignment_13_2 )
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_13_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1842:1: ( rule__ContentType__HasVersionsAssignment_13_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1842:2: rule__ContentType__HasVersionsAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasVersionsAssignment_13_2_in_rule__ContentType__Group_13__2__Impl3698);
            rule__ContentType__HasVersionsAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_13_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ContentType__Group_13__3"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1852:1: rule__ContentType__Group_13__3 : rule__ContentType__Group_13__3__Impl rule__ContentType__Group_13__4 ;
    public final void rule__ContentType__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1856:1: ( rule__ContentType__Group_13__3__Impl rule__ContentType__Group_13__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1857:2: rule__ContentType__Group_13__3__Impl rule__ContentType__Group_13__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__3__Impl_in_rule__ContentType__Group_13__33728);
            rule__ContentType__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__4_in_rule__ContentType__Group_13__33731);
            rule__ContentType__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__3"


    // $ANTLR start "rule__ContentType__Group_13__3__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1864:1: rule__ContentType__Group_13__3__Impl : ( ( rule__ContentType__Group_13_3__0 )* ) ;
    public final void rule__ContentType__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1868:1: ( ( ( rule__ContentType__Group_13_3__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1869:1: ( ( rule__ContentType__Group_13_3__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1869:1: ( ( rule__ContentType__Group_13_3__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1870:1: ( rule__ContentType__Group_13_3__0 )*
            {
             before(grammarAccess.getContentTypeAccess().getGroup_13_3()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1871:1: ( rule__ContentType__Group_13_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==48) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1871:2: rule__ContentType__Group_13_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13_3__0_in_rule__ContentType__Group_13__3__Impl3758);
            	    rule__ContentType__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getContentTypeAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__3__Impl"


    // $ANTLR start "rule__ContentType__Group_13__4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1881:1: rule__ContentType__Group_13__4 : rule__ContentType__Group_13__4__Impl rule__ContentType__Group_13__5 ;
    public final void rule__ContentType__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1885:1: ( rule__ContentType__Group_13__4__Impl rule__ContentType__Group_13__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1886:2: rule__ContentType__Group_13__4__Impl rule__ContentType__Group_13__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__4__Impl_in_rule__ContentType__Group_13__43789);
            rule__ContentType__Group_13__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__5_in_rule__ContentType__Group_13__43792);
            rule__ContentType__Group_13__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__4"


    // $ANTLR start "rule__ContentType__Group_13__4__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1893:1: rule__ContentType__Group_13__4__Impl : ( ';' ) ;
    public final void rule__ContentType__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1897:1: ( ( ';' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1898:1: ( ';' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1898:1: ( ';' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1899:1: ';'
            {
             before(grammarAccess.getContentTypeAccess().getSemicolonKeyword_13_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentType__Group_13__4__Impl3820); 
             after(grammarAccess.getContentTypeAccess().getSemicolonKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__4__Impl"


    // $ANTLR start "rule__ContentType__Group_13__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1912:1: rule__ContentType__Group_13__5 : rule__ContentType__Group_13__5__Impl ;
    public final void rule__ContentType__Group_13__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1916:1: ( rule__ContentType__Group_13__5__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1917:2: rule__ContentType__Group_13__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13__5__Impl_in_rule__ContentType__Group_13__53851);
            rule__ContentType__Group_13__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__5"


    // $ANTLR start "rule__ContentType__Group_13__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1923:1: rule__ContentType__Group_13__5__Impl : ( '}' ) ;
    public final void rule__ContentType__Group_13__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1927:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1928:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1928:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1929:1: '}'
            {
             before(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_13_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ContentType__Group_13__5__Impl3879); 
             after(grammarAccess.getContentTypeAccess().getRightCurlyBracketKeyword_13_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13__5__Impl"


    // $ANTLR start "rule__ContentType__Group_13_3__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1954:1: rule__ContentType__Group_13_3__0 : rule__ContentType__Group_13_3__0__Impl rule__ContentType__Group_13_3__1 ;
    public final void rule__ContentType__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1958:1: ( rule__ContentType__Group_13_3__0__Impl rule__ContentType__Group_13_3__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1959:2: rule__ContentType__Group_13_3__0__Impl rule__ContentType__Group_13_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13_3__0__Impl_in_rule__ContentType__Group_13_3__03922);
            rule__ContentType__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13_3__1_in_rule__ContentType__Group_13_3__03925);
            rule__ContentType__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13_3__0"


    // $ANTLR start "rule__ContentType__Group_13_3__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1966:1: rule__ContentType__Group_13_3__0__Impl : ( ';' ) ;
    public final void rule__ContentType__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1970:1: ( ( ';' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1971:1: ( ';' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1971:1: ( ';' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1972:1: ';'
            {
             before(grammarAccess.getContentTypeAccess().getSemicolonKeyword_13_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ContentType__Group_13_3__0__Impl3953); 
             after(grammarAccess.getContentTypeAccess().getSemicolonKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13_3__0__Impl"


    // $ANTLR start "rule__ContentType__Group_13_3__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1985:1: rule__ContentType__Group_13_3__1 : rule__ContentType__Group_13_3__1__Impl ;
    public final void rule__ContentType__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1989:1: ( rule__ContentType__Group_13_3__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1990:2: rule__ContentType__Group_13_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_13_3__1__Impl_in_rule__ContentType__Group_13_3__13984);
            rule__ContentType__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13_3__1"


    // $ANTLR start "rule__ContentType__Group_13_3__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:1996:1: rule__ContentType__Group_13_3__1__Impl : ( ( rule__ContentType__HasVersionsAssignment_13_3_1 ) ) ;
    public final void rule__ContentType__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2000:1: ( ( ( rule__ContentType__HasVersionsAssignment_13_3_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2001:1: ( ( rule__ContentType__HasVersionsAssignment_13_3_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2001:1: ( ( rule__ContentType__HasVersionsAssignment_13_3_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2002:1: ( rule__ContentType__HasVersionsAssignment_13_3_1 )
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_13_3_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2003:1: ( rule__ContentType__HasVersionsAssignment_13_3_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2003:2: rule__ContentType__HasVersionsAssignment_13_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__HasVersionsAssignment_13_3_1_in_rule__ContentType__Group_13_3__1__Impl4011);
            rule__ContentType__HasVersionsAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getHasVersionsAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_13_3__1__Impl"


    // $ANTLR start "rule__ContentType__Group_14__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2017:1: rule__ContentType__Group_14__0 : rule__ContentType__Group_14__0__Impl rule__ContentType__Group_14__1 ;
    public final void rule__ContentType__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2021:1: ( rule__ContentType__Group_14__0__Impl rule__ContentType__Group_14__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2022:2: rule__ContentType__Group_14__0__Impl rule__ContentType__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_14__0__Impl_in_rule__ContentType__Group_14__04045);
            rule__ContentType__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_14__1_in_rule__ContentType__Group_14__04048);
            rule__ContentType__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_14__0"


    // $ANTLR start "rule__ContentType__Group_14__0__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2029:1: rule__ContentType__Group_14__0__Impl : ( 'ModifiedBy' ) ;
    public final void rule__ContentType__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2033:1: ( ( 'ModifiedBy' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2034:1: ( 'ModifiedBy' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2034:1: ( 'ModifiedBy' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2035:1: 'ModifiedBy'
            {
             before(grammarAccess.getContentTypeAccess().getModifiedByKeyword_14_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ContentType__Group_14__0__Impl4076); 
             after(grammarAccess.getContentTypeAccess().getModifiedByKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_14__0__Impl"


    // $ANTLR start "rule__ContentType__Group_14__1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2048:1: rule__ContentType__Group_14__1 : rule__ContentType__Group_14__1__Impl rule__ContentType__Group_14__2 ;
    public final void rule__ContentType__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2052:1: ( rule__ContentType__Group_14__1__Impl rule__ContentType__Group_14__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2053:2: rule__ContentType__Group_14__1__Impl rule__ContentType__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_14__1__Impl_in_rule__ContentType__Group_14__14107);
            rule__ContentType__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_14__2_in_rule__ContentType__Group_14__14110);
            rule__ContentType__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_14__1"


    // $ANTLR start "rule__ContentType__Group_14__1__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2060:1: rule__ContentType__Group_14__1__Impl : ( '=' ) ;
    public final void rule__ContentType__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2064:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2065:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2065:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2066:1: '='
            {
             before(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_14_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ContentType__Group_14__1__Impl4138); 
             after(grammarAccess.getContentTypeAccess().getEqualsSignKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_14__1__Impl"


    // $ANTLR start "rule__ContentType__Group_14__2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2079:1: rule__ContentType__Group_14__2 : rule__ContentType__Group_14__2__Impl ;
    public final void rule__ContentType__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2083:1: ( rule__ContentType__Group_14__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2084:2: rule__ContentType__Group_14__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__Group_14__2__Impl_in_rule__ContentType__Group_14__24169);
            rule__ContentType__Group_14__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_14__2"


    // $ANTLR start "rule__ContentType__Group_14__2__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2090:1: rule__ContentType__Group_14__2__Impl : ( ( rule__ContentType__ModifiedByAssignment_14_2 ) ) ;
    public final void rule__ContentType__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2094:1: ( ( ( rule__ContentType__ModifiedByAssignment_14_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2095:1: ( ( rule__ContentType__ModifiedByAssignment_14_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2095:1: ( ( rule__ContentType__ModifiedByAssignment_14_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2096:1: ( rule__ContentType__ModifiedByAssignment_14_2 )
            {
             before(grammarAccess.getContentTypeAccess().getModifiedByAssignment_14_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2097:1: ( rule__ContentType__ModifiedByAssignment_14_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2097:2: rule__ContentType__ModifiedByAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ContentType__ModifiedByAssignment_14_2_in_rule__ContentType__Group_14__2__Impl4196);
            rule__ContentType__ModifiedByAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getContentTypeAccess().getModifiedByAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__Group_14__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2113:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2117:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2118:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04232);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04235);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2125:1: rule__Property__Group__0__Impl : ( 'Property' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2129:1: ( ( 'Property' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2130:1: ( 'Property' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2130:1: ( 'Property' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2131:1: 'Property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Property__Group__0__Impl4263); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2144:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2148:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2149:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14294);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14297);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2156:1: rule__Property__Group__1__Impl : ( '{' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2160:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2161:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2161:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2162:1: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Property__Group__1__Impl4325); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2175:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2179:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2180:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24356);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24359);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2187:1: rule__Property__Group__2__Impl : ( 'Name' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2191:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2192:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2192:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2193:1: 'Name'
            {
             before(grammarAccess.getPropertyAccess().getNameKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Property__Group__2__Impl4387); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2206:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2210:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2211:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34418);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34421);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2218:1: rule__Property__Group__3__Impl : ( '=' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2222:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2223:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2223:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2224:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Property__Group__3__Impl4449); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2237:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2241:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2242:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44480);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5_in_rule__Property__Group__44483);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2249:1: rule__Property__Group__4__Impl : ( ( rule__Property__NameAssignment_4 ) ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2253:1: ( ( ( rule__Property__NameAssignment_4 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2254:1: ( ( rule__Property__NameAssignment_4 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2254:1: ( ( rule__Property__NameAssignment_4 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2255:1: ( rule__Property__NameAssignment_4 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_4()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2256:1: ( rule__Property__NameAssignment_4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2256:2: rule__Property__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__NameAssignment_4_in_rule__Property__Group__4__Impl4510);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2266:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2270:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2271:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__54540);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6_in_rule__Property__Group__54543);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2278:1: rule__Property__Group__5__Impl : ( 'AccessModifier' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2282:1: ( ( 'AccessModifier' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2283:1: ( 'AccessModifier' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2283:1: ( 'AccessModifier' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2284:1: 'AccessModifier'
            {
             before(grammarAccess.getPropertyAccess().getAccessModifierKeyword_5()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Property__Group__5__Impl4571); 
             after(grammarAccess.getPropertyAccess().getAccessModifierKeyword_5()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2297:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2301:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2302:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__64602);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7_in_rule__Property__Group__64605);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2309:1: rule__Property__Group__6__Impl : ( '=' ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2313:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2314:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2314:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2315:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_6()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Property__Group__6__Impl4633); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2328:1: rule__Property__Group__7 : rule__Property__Group__7__Impl rule__Property__Group__8 ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2332:1: ( rule__Property__Group__7__Impl rule__Property__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2333:2: rule__Property__Group__7__Impl rule__Property__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__74664);
            rule__Property__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__8_in_rule__Property__Group__74667);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2340:1: rule__Property__Group__7__Impl : ( ( rule__Property__AccessModiferAssignment_7 ) ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2344:1: ( ( ( rule__Property__AccessModiferAssignment_7 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2345:1: ( ( rule__Property__AccessModiferAssignment_7 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2345:1: ( ( rule__Property__AccessModiferAssignment_7 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2346:1: ( rule__Property__AccessModiferAssignment_7 )
            {
             before(grammarAccess.getPropertyAccess().getAccessModiferAssignment_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2347:1: ( rule__Property__AccessModiferAssignment_7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2347:2: rule__Property__AccessModiferAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__AccessModiferAssignment_7_in_rule__Property__Group__7__Impl4694);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2357:1: rule__Property__Group__8 : rule__Property__Group__8__Impl rule__Property__Group__9 ;
    public final void rule__Property__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2361:1: ( rule__Property__Group__8__Impl rule__Property__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2362:2: rule__Property__Group__8__Impl rule__Property__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__8__Impl_in_rule__Property__Group__84724);
            rule__Property__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__9_in_rule__Property__Group__84727);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2369:1: rule__Property__Group__8__Impl : ( 'Type' ) ;
    public final void rule__Property__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2373:1: ( ( 'Type' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2374:1: ( 'Type' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2374:1: ( 'Type' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2375:1: 'Type'
            {
             before(grammarAccess.getPropertyAccess().getTypeKeyword_8()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Property__Group__8__Impl4755); 
             after(grammarAccess.getPropertyAccess().getTypeKeyword_8()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2388:1: rule__Property__Group__9 : rule__Property__Group__9__Impl rule__Property__Group__10 ;
    public final void rule__Property__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2392:1: ( rule__Property__Group__9__Impl rule__Property__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2393:2: rule__Property__Group__9__Impl rule__Property__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__9__Impl_in_rule__Property__Group__94786);
            rule__Property__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__10_in_rule__Property__Group__94789);
            rule__Property__Group__10();

            state._fsp--;


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2400:1: rule__Property__Group__9__Impl : ( '=' ) ;
    public final void rule__Property__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2404:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2405:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2405:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2406:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_9()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Property__Group__9__Impl4817); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Property__Group__10"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2419:1: rule__Property__Group__10 : rule__Property__Group__10__Impl rule__Property__Group__11 ;
    public final void rule__Property__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2423:1: ( rule__Property__Group__10__Impl rule__Property__Group__11 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2424:2: rule__Property__Group__10__Impl rule__Property__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__10__Impl_in_rule__Property__Group__104848);
            rule__Property__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__11_in_rule__Property__Group__104851);
            rule__Property__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__10"


    // $ANTLR start "rule__Property__Group__10__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2431:1: rule__Property__Group__10__Impl : ( ( rule__Property__TypeAssignment_10 ) ) ;
    public final void rule__Property__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2435:1: ( ( ( rule__Property__TypeAssignment_10 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2436:1: ( ( rule__Property__TypeAssignment_10 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2436:1: ( ( rule__Property__TypeAssignment_10 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2437:1: ( rule__Property__TypeAssignment_10 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_10()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2438:1: ( rule__Property__TypeAssignment_10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2438:2: rule__Property__TypeAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__TypeAssignment_10_in_rule__Property__Group__10__Impl4878);
            rule__Property__TypeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__10__Impl"


    // $ANTLR start "rule__Property__Group__11"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2448:1: rule__Property__Group__11 : rule__Property__Group__11__Impl ;
    public final void rule__Property__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2452:1: ( rule__Property__Group__11__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2453:2: rule__Property__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__11__Impl_in_rule__Property__Group__114908);
            rule__Property__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__11"


    // $ANTLR start "rule__Property__Group__11__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2459:1: rule__Property__Group__11__Impl : ( '}' ) ;
    public final void rule__Property__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2463:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2464:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2464:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2465:1: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_11()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Property__Group__11__Impl4936); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__11__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2502:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2506:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2507:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__04991);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1_in_rule__Role__Group__04994);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2514:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2518:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2519:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2519:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2520:1: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2521:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2523:1: 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2533:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2537:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2538:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__15052);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2_in_rule__Role__Group__15055);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2545:1: rule__Role__Group__1__Impl : ( ( rule__Role__IsAdminAssignment_1 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2549:1: ( ( ( rule__Role__IsAdminAssignment_1 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2550:1: ( ( rule__Role__IsAdminAssignment_1 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2550:1: ( ( rule__Role__IsAdminAssignment_1 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2551:1: ( rule__Role__IsAdminAssignment_1 )?
            {
             before(grammarAccess.getRoleAccess().getIsAdminAssignment_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2552:1: ( rule__Role__IsAdminAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==55) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2552:2: rule__Role__IsAdminAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Role__IsAdminAssignment_1_in_rule__Role__Group__1__Impl5082);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2562:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2566:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2567:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__25113);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__3_in_rule__Role__Group__25116);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2574:1: rule__Role__Group__2__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2578:1: ( ( 'Role' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2579:1: ( 'Role' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2579:1: ( 'Role' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2580:1: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_2()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Role__Group__2__Impl5144); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2593:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2597:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2598:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__35175);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__4_in_rule__Role__Group__35178);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2605:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2609:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2610:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2610:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2611:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Role__Group__3__Impl5206); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2624:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2628:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2629:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__45237);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__5_in_rule__Role__Group__45240);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2636:1: rule__Role__Group__4__Impl : ( 'Name' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2640:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2641:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2641:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2642:1: 'Name'
            {
             before(grammarAccess.getRoleAccess().getNameKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Role__Group__4__Impl5268); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2655:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2659:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2660:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__55299);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__6_in_rule__Role__Group__55302);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2667:1: rule__Role__Group__5__Impl : ( '=' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2671:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2672:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2672:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2673:1: '='
            {
             before(grammarAccess.getRoleAccess().getEqualsSignKeyword_5()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Role__Group__5__Impl5330); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2686:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2690:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2691:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__65361);
            rule__Role__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__7_in_rule__Role__Group__65364);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2698:1: rule__Role__Group__6__Impl : ( ( rule__Role__NameAssignment_6 ) ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2702:1: ( ( ( rule__Role__NameAssignment_6 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2703:1: ( ( rule__Role__NameAssignment_6 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2703:1: ( ( rule__Role__NameAssignment_6 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2704:1: ( rule__Role__NameAssignment_6 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2705:1: ( rule__Role__NameAssignment_6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2705:2: rule__Role__NameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__NameAssignment_6_in_rule__Role__Group__6__Impl5391);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2715:1: rule__Role__Group__7 : rule__Role__Group__7__Impl rule__Role__Group__8 ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2719:1: ( rule__Role__Group__7__Impl rule__Role__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2720:2: rule__Role__Group__7__Impl rule__Role__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__75421);
            rule__Role__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__8_in_rule__Role__Group__75424);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2727:1: rule__Role__Group__7__Impl : ( ( rule__Role__Group_7__0 )? ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2731:1: ( ( ( rule__Role__Group_7__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2732:1: ( ( rule__Role__Group_7__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2732:1: ( ( rule__Role__Group_7__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2733:1: ( rule__Role__Group_7__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2734:1: ( rule__Role__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2734:2: rule__Role__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__0_in_rule__Role__Group__7__Impl5451);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2744:1: rule__Role__Group__8 : rule__Role__Group__8__Impl ;
    public final void rule__Role__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2748:1: ( rule__Role__Group__8__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2749:2: rule__Role__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__8__Impl_in_rule__Role__Group__85482);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2755:1: rule__Role__Group__8__Impl : ( '}' ) ;
    public final void rule__Role__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2759:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2760:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2760:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2761:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Role__Group__8__Impl5510); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2792:1: rule__Role__Group_7__0 : rule__Role__Group_7__0__Impl rule__Role__Group_7__1 ;
    public final void rule__Role__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2796:1: ( rule__Role__Group_7__0__Impl rule__Role__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2797:2: rule__Role__Group_7__0__Impl rule__Role__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__0__Impl_in_rule__Role__Group_7__05559);
            rule__Role__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__1_in_rule__Role__Group_7__05562);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2804:1: rule__Role__Group_7__0__Impl : ( 'Types' ) ;
    public final void rule__Role__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2808:1: ( ( 'Types' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2809:1: ( 'Types' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2809:1: ( 'Types' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2810:1: 'Types'
            {
             before(grammarAccess.getRoleAccess().getTypesKeyword_7_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Role__Group_7__0__Impl5590); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2823:1: rule__Role__Group_7__1 : rule__Role__Group_7__1__Impl rule__Role__Group_7__2 ;
    public final void rule__Role__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2827:1: ( rule__Role__Group_7__1__Impl rule__Role__Group_7__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2828:2: rule__Role__Group_7__1__Impl rule__Role__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__1__Impl_in_rule__Role__Group_7__15621);
            rule__Role__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__2_in_rule__Role__Group_7__15624);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2835:1: rule__Role__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Role__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2839:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2840:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2840:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2841:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Role__Group_7__1__Impl5652); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2854:1: rule__Role__Group_7__2 : rule__Role__Group_7__2__Impl rule__Role__Group_7__3 ;
    public final void rule__Role__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2858:1: ( rule__Role__Group_7__2__Impl rule__Role__Group_7__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2859:2: rule__Role__Group_7__2__Impl rule__Role__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__2__Impl_in_rule__Role__Group_7__25683);
            rule__Role__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__3_in_rule__Role__Group_7__25686);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2866:1: rule__Role__Group_7__2__Impl : ( ( rule__Role__TypesAssignment_7_2 ) ) ;
    public final void rule__Role__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2870:1: ( ( ( rule__Role__TypesAssignment_7_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2871:1: ( ( rule__Role__TypesAssignment_7_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2871:1: ( ( rule__Role__TypesAssignment_7_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2872:1: ( rule__Role__TypesAssignment_7_2 )
            {
             before(grammarAccess.getRoleAccess().getTypesAssignment_7_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2873:1: ( rule__Role__TypesAssignment_7_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2873:2: rule__Role__TypesAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__TypesAssignment_7_2_in_rule__Role__Group_7__2__Impl5713);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2883:1: rule__Role__Group_7__3 : rule__Role__Group_7__3__Impl rule__Role__Group_7__4 ;
    public final void rule__Role__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2887:1: ( rule__Role__Group_7__3__Impl rule__Role__Group_7__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2888:2: rule__Role__Group_7__3__Impl rule__Role__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__3__Impl_in_rule__Role__Group_7__35743);
            rule__Role__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__4_in_rule__Role__Group_7__35746);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2895:1: rule__Role__Group_7__3__Impl : ( ( rule__Role__Group_7_3__0 )* ) ;
    public final void rule__Role__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2899:1: ( ( ( rule__Role__Group_7_3__0 )* ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2900:1: ( ( rule__Role__Group_7_3__0 )* )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2900:1: ( ( rule__Role__Group_7_3__0 )* )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2901:1: ( rule__Role__Group_7_3__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_7_3()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2902:1: ( rule__Role__Group_7_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    int LA16_1 = input.LA(2);

                    if ( ((LA16_1>=RULE_STRING && LA16_1<=RULE_ID)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2902:2: rule__Role__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__0_in_rule__Role__Group_7__3__Impl5773);
            	    rule__Role__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2912:1: rule__Role__Group_7__4 : rule__Role__Group_7__4__Impl rule__Role__Group_7__5 ;
    public final void rule__Role__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2916:1: ( rule__Role__Group_7__4__Impl rule__Role__Group_7__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2917:2: rule__Role__Group_7__4__Impl rule__Role__Group_7__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__4__Impl_in_rule__Role__Group_7__45804);
            rule__Role__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__5_in_rule__Role__Group_7__45807);
            rule__Role__Group_7__5();

            state._fsp--;


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2924:1: rule__Role__Group_7__4__Impl : ( ';' ) ;
    public final void rule__Role__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2928:1: ( ( ';' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2929:1: ( ';' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2929:1: ( ';' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2930:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_7_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Role__Group_7__4__Impl5835); 
             after(grammarAccess.getRoleAccess().getSemicolonKeyword_7_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Role__Group_7__5"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2943:1: rule__Role__Group_7__5 : rule__Role__Group_7__5__Impl ;
    public final void rule__Role__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2947:1: ( rule__Role__Group_7__5__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2948:2: rule__Role__Group_7__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7__5__Impl_in_rule__Role__Group_7__55866);
            rule__Role__Group_7__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__5"


    // $ANTLR start "rule__Role__Group_7__5__Impl"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2954:1: rule__Role__Group_7__5__Impl : ( '}' ) ;
    public final void rule__Role__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2958:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2959:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2959:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2960:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Role__Group_7__5__Impl5894); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_7__5__Impl"


    // $ANTLR start "rule__Role__Group_7_3__0"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2985:1: rule__Role__Group_7_3__0 : rule__Role__Group_7_3__0__Impl rule__Role__Group_7_3__1 ;
    public final void rule__Role__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2989:1: ( rule__Role__Group_7_3__0__Impl rule__Role__Group_7_3__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2990:2: rule__Role__Group_7_3__0__Impl rule__Role__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__0__Impl_in_rule__Role__Group_7_3__05937);
            rule__Role__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__1_in_rule__Role__Group_7_3__05940);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:2997:1: rule__Role__Group_7_3__0__Impl : ( ';' ) ;
    public final void rule__Role__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3001:1: ( ( ';' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3002:1: ( ';' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3002:1: ( ';' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3003:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_7_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Role__Group_7_3__0__Impl5968); 
             after(grammarAccess.getRoleAccess().getSemicolonKeyword_7_3_0()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3016:1: rule__Role__Group_7_3__1 : rule__Role__Group_7_3__1__Impl ;
    public final void rule__Role__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3020:1: ( rule__Role__Group_7_3__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3021:2: rule__Role__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_7_3__1__Impl_in_rule__Role__Group_7_3__15999);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3027:1: rule__Role__Group_7_3__1__Impl : ( ( rule__Role__TypesAssignment_7_3_1 ) ) ;
    public final void rule__Role__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3031:1: ( ( ( rule__Role__TypesAssignment_7_3_1 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3032:1: ( ( rule__Role__TypesAssignment_7_3_1 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3032:1: ( ( rule__Role__TypesAssignment_7_3_1 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3033:1: ( rule__Role__TypesAssignment_7_3_1 )
            {
             before(grammarAccess.getRoleAccess().getTypesAssignment_7_3_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3034:1: ( rule__Role__TypesAssignment_7_3_1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3034:2: rule__Role__TypesAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__TypesAssignment_7_3_1_in_rule__Role__Group_7_3__1__Impl6026);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3048:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3052:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3053:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__06060);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__1_in_rule__User__Group__06063);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3060:1: rule__User__Group__0__Impl : ( () ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3064:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3065:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3065:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3066:1: ()
            {
             before(grammarAccess.getUserAccess().getUserAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3067:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3069:1: 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3079:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3083:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3084:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__16121);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__2_in_rule__User__Group__16124);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3091:1: rule__User__Group__1__Impl : ( ( rule__User__DisabledAssignment_1 )? ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3095:1: ( ( ( rule__User__DisabledAssignment_1 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3096:1: ( ( rule__User__DisabledAssignment_1 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3096:1: ( ( rule__User__DisabledAssignment_1 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3097:1: ( rule__User__DisabledAssignment_1 )?
            {
             before(grammarAccess.getUserAccess().getDisabledAssignment_1()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3098:1: ( rule__User__DisabledAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==56) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3098:2: rule__User__DisabledAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__DisabledAssignment_1_in_rule__User__Group__1__Impl6151);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3108:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3112:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3113:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__26182);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__3_in_rule__User__Group__26185);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3120:1: rule__User__Group__2__Impl : ( 'User' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3124:1: ( ( 'User' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3125:1: ( 'User' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3125:1: ( 'User' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3126:1: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__User__Group__2__Impl6213); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3139:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3143:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3144:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__36244);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__4_in_rule__User__Group__36247);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3151:1: rule__User__Group__3__Impl : ( '{' ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3155:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3156:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3156:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3157:1: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__User__Group__3__Impl6275); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3170:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3174:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3175:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__46306);
            rule__User__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__5_in_rule__User__Group__46309);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3182:1: rule__User__Group__4__Impl : ( 'Name' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3186:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3187:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3187:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3188:1: 'Name'
            {
             before(grammarAccess.getUserAccess().getNameKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__User__Group__4__Impl6337); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3201:1: rule__User__Group__5 : rule__User__Group__5__Impl rule__User__Group__6 ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3205:1: ( rule__User__Group__5__Impl rule__User__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3206:2: rule__User__Group__5__Impl rule__User__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__5__Impl_in_rule__User__Group__56368);
            rule__User__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__6_in_rule__User__Group__56371);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3213:1: rule__User__Group__5__Impl : ( '=' ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3217:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3218:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3218:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3219:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_5()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group__5__Impl6399); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3232:1: rule__User__Group__6 : rule__User__Group__6__Impl rule__User__Group__7 ;
    public final void rule__User__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3236:1: ( rule__User__Group__6__Impl rule__User__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3237:2: rule__User__Group__6__Impl rule__User__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__6__Impl_in_rule__User__Group__66430);
            rule__User__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__7_in_rule__User__Group__66433);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3244:1: rule__User__Group__6__Impl : ( ( rule__User__NameAssignment_6 ) ) ;
    public final void rule__User__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3248:1: ( ( ( rule__User__NameAssignment_6 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3249:1: ( ( rule__User__NameAssignment_6 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3249:1: ( ( rule__User__NameAssignment_6 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3250:1: ( rule__User__NameAssignment_6 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3251:1: ( rule__User__NameAssignment_6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3251:2: rule__User__NameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__NameAssignment_6_in_rule__User__Group__6__Impl6460);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3261:1: rule__User__Group__7 : rule__User__Group__7__Impl rule__User__Group__8 ;
    public final void rule__User__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3265:1: ( rule__User__Group__7__Impl rule__User__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3266:2: rule__User__Group__7__Impl rule__User__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__7__Impl_in_rule__User__Group__76490);
            rule__User__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__8_in_rule__User__Group__76493);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3273:1: rule__User__Group__7__Impl : ( ( rule__User__Group_7__0 )? ) ;
    public final void rule__User__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3277:1: ( ( ( rule__User__Group_7__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3278:1: ( ( rule__User__Group_7__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3278:1: ( ( rule__User__Group_7__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3279:1: ( rule__User__Group_7__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3280:1: ( rule__User__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3280:2: rule__User__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__0_in_rule__User__Group__7__Impl6520);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3290:1: rule__User__Group__8 : rule__User__Group__8__Impl rule__User__Group__9 ;
    public final void rule__User__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3294:1: ( rule__User__Group__8__Impl rule__User__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3295:2: rule__User__Group__8__Impl rule__User__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__8__Impl_in_rule__User__Group__86551);
            rule__User__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__9_in_rule__User__Group__86554);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3302:1: rule__User__Group__8__Impl : ( ( rule__User__Group_8__0 )? ) ;
    public final void rule__User__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3306:1: ( ( ( rule__User__Group_8__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3307:1: ( ( rule__User__Group_8__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3307:1: ( ( rule__User__Group_8__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3308:1: ( rule__User__Group_8__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_8()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3309:1: ( rule__User__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3309:2: rule__User__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__0_in_rule__User__Group__8__Impl6581);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3319:1: rule__User__Group__9 : rule__User__Group__9__Impl rule__User__Group__10 ;
    public final void rule__User__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3323:1: ( rule__User__Group__9__Impl rule__User__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3324:2: rule__User__Group__9__Impl rule__User__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__9__Impl_in_rule__User__Group__96612);
            rule__User__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__10_in_rule__User__Group__96615);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3331:1: rule__User__Group__9__Impl : ( ( rule__User__Group_9__0 )? ) ;
    public final void rule__User__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3335:1: ( ( ( rule__User__Group_9__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3336:1: ( ( rule__User__Group_9__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3336:1: ( ( rule__User__Group_9__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3337:1: ( rule__User__Group_9__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_9()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3338:1: ( rule__User__Group_9__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3338:2: rule__User__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__0_in_rule__User__Group__9__Impl6642);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3348:1: rule__User__Group__10 : rule__User__Group__10__Impl rule__User__Group__11 ;
    public final void rule__User__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3352:1: ( rule__User__Group__10__Impl rule__User__Group__11 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3353:2: rule__User__Group__10__Impl rule__User__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__10__Impl_in_rule__User__Group__106673);
            rule__User__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__11_in_rule__User__Group__106676);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3360:1: rule__User__Group__10__Impl : ( ( rule__User__Group_10__0 )? ) ;
    public final void rule__User__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3364:1: ( ( ( rule__User__Group_10__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3365:1: ( ( rule__User__Group_10__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3365:1: ( ( rule__User__Group_10__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3366:1: ( rule__User__Group_10__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_10()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3367:1: ( rule__User__Group_10__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3367:2: rule__User__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__0_in_rule__User__Group__10__Impl6703);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3377:1: rule__User__Group__11 : rule__User__Group__11__Impl rule__User__Group__12 ;
    public final void rule__User__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3381:1: ( rule__User__Group__11__Impl rule__User__Group__12 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3382:2: rule__User__Group__11__Impl rule__User__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__11__Impl_in_rule__User__Group__116734);
            rule__User__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__12_in_rule__User__Group__116737);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3389:1: rule__User__Group__11__Impl : ( ( rule__User__Group_11__0 )? ) ;
    public final void rule__User__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3393:1: ( ( ( rule__User__Group_11__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3394:1: ( ( rule__User__Group_11__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3394:1: ( ( rule__User__Group_11__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3395:1: ( rule__User__Group_11__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_11()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3396:1: ( rule__User__Group_11__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3396:2: rule__User__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__0_in_rule__User__Group__11__Impl6764);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3406:1: rule__User__Group__12 : rule__User__Group__12__Impl rule__User__Group__13 ;
    public final void rule__User__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3410:1: ( rule__User__Group__12__Impl rule__User__Group__13 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3411:2: rule__User__Group__12__Impl rule__User__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__12__Impl_in_rule__User__Group__126795);
            rule__User__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group__13_in_rule__User__Group__126798);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3418:1: rule__User__Group__12__Impl : ( ( rule__User__Group_12__0 )? ) ;
    public final void rule__User__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3422:1: ( ( ( rule__User__Group_12__0 )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3423:1: ( ( rule__User__Group_12__0 )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3423:1: ( ( rule__User__Group_12__0 )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3424:1: ( rule__User__Group_12__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_12()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3425:1: ( rule__User__Group_12__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3425:2: rule__User__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__0_in_rule__User__Group__12__Impl6825);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3435:1: rule__User__Group__13 : rule__User__Group__13__Impl ;
    public final void rule__User__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3439:1: ( rule__User__Group__13__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3440:2: rule__User__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group__13__Impl_in_rule__User__Group__136856);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3446:1: rule__User__Group__13__Impl : ( '}' ) ;
    public final void rule__User__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3450:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3451:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3451:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3452:1: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_13()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__User__Group__13__Impl6884); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3493:1: rule__User__Group_7__0 : rule__User__Group_7__0__Impl rule__User__Group_7__1 ;
    public final void rule__User__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3497:1: ( rule__User__Group_7__0__Impl rule__User__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3498:2: rule__User__Group_7__0__Impl rule__User__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__0__Impl_in_rule__User__Group_7__06943);
            rule__User__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__1_in_rule__User__Group_7__06946);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3505:1: rule__User__Group_7__0__Impl : ( 'userFirstName' ) ;
    public final void rule__User__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3509:1: ( ( 'userFirstName' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3510:1: ( 'userFirstName' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3510:1: ( 'userFirstName' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3511:1: 'userFirstName'
            {
             before(grammarAccess.getUserAccess().getUserFirstNameKeyword_7_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__User__Group_7__0__Impl6974); 
             after(grammarAccess.getUserAccess().getUserFirstNameKeyword_7_0()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3524:1: rule__User__Group_7__1 : rule__User__Group_7__1__Impl rule__User__Group_7__2 ;
    public final void rule__User__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3528:1: ( rule__User__Group_7__1__Impl rule__User__Group_7__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3529:2: rule__User__Group_7__1__Impl rule__User__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__1__Impl_in_rule__User__Group_7__17005);
            rule__User__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__2_in_rule__User__Group_7__17008);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3536:1: rule__User__Group_7__1__Impl : ( '=' ) ;
    public final void rule__User__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3540:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3541:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3541:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3542:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_7_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_7__1__Impl7036); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3555:1: rule__User__Group_7__2 : rule__User__Group_7__2__Impl ;
    public final void rule__User__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3559:1: ( rule__User__Group_7__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3560:2: rule__User__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_7__2__Impl_in_rule__User__Group_7__27067);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3566:1: rule__User__Group_7__2__Impl : ( ( rule__User__FirstnameAssignment_7_2 ) ) ;
    public final void rule__User__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3570:1: ( ( ( rule__User__FirstnameAssignment_7_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3571:1: ( ( rule__User__FirstnameAssignment_7_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3571:1: ( ( rule__User__FirstnameAssignment_7_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3572:1: ( rule__User__FirstnameAssignment_7_2 )
            {
             before(grammarAccess.getUserAccess().getFirstnameAssignment_7_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3573:1: ( rule__User__FirstnameAssignment_7_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3573:2: rule__User__FirstnameAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__FirstnameAssignment_7_2_in_rule__User__Group_7__2__Impl7094);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3589:1: rule__User__Group_8__0 : rule__User__Group_8__0__Impl rule__User__Group_8__1 ;
    public final void rule__User__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3593:1: ( rule__User__Group_8__0__Impl rule__User__Group_8__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3594:2: rule__User__Group_8__0__Impl rule__User__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__0__Impl_in_rule__User__Group_8__07130);
            rule__User__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__1_in_rule__User__Group_8__07133);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3601:1: rule__User__Group_8__0__Impl : ( 'userLastName' ) ;
    public final void rule__User__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3605:1: ( ( 'userLastName' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3606:1: ( 'userLastName' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3606:1: ( 'userLastName' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3607:1: 'userLastName'
            {
             before(grammarAccess.getUserAccess().getUserLastNameKeyword_8_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__User__Group_8__0__Impl7161); 
             after(grammarAccess.getUserAccess().getUserLastNameKeyword_8_0()); 

            }


            }

        }
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3620:1: rule__User__Group_8__1 : rule__User__Group_8__1__Impl rule__User__Group_8__2 ;
    public final void rule__User__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3624:1: ( rule__User__Group_8__1__Impl rule__User__Group_8__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3625:2: rule__User__Group_8__1__Impl rule__User__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__1__Impl_in_rule__User__Group_8__17192);
            rule__User__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__2_in_rule__User__Group_8__17195);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3632:1: rule__User__Group_8__1__Impl : ( '=' ) ;
    public final void rule__User__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3636:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3637:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3637:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3638:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_8_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_8__1__Impl7223); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3651:1: rule__User__Group_8__2 : rule__User__Group_8__2__Impl ;
    public final void rule__User__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3655:1: ( rule__User__Group_8__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3656:2: rule__User__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_8__2__Impl_in_rule__User__Group_8__27254);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3662:1: rule__User__Group_8__2__Impl : ( ( rule__User__LastnameAssignment_8_2 ) ) ;
    public final void rule__User__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3666:1: ( ( ( rule__User__LastnameAssignment_8_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3667:1: ( ( rule__User__LastnameAssignment_8_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3667:1: ( ( rule__User__LastnameAssignment_8_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3668:1: ( rule__User__LastnameAssignment_8_2 )
            {
             before(grammarAccess.getUserAccess().getLastnameAssignment_8_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3669:1: ( rule__User__LastnameAssignment_8_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3669:2: rule__User__LastnameAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__LastnameAssignment_8_2_in_rule__User__Group_8__2__Impl7281);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3685:1: rule__User__Group_9__0 : rule__User__Group_9__0__Impl rule__User__Group_9__1 ;
    public final void rule__User__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3689:1: ( rule__User__Group_9__0__Impl rule__User__Group_9__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3690:2: rule__User__Group_9__0__Impl rule__User__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__0__Impl_in_rule__User__Group_9__07317);
            rule__User__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__1_in_rule__User__Group_9__07320);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3697:1: rule__User__Group_9__0__Impl : ( 'Login' ) ;
    public final void rule__User__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3701:1: ( ( 'Login' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3702:1: ( 'Login' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3702:1: ( 'Login' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3703:1: 'Login'
            {
             before(grammarAccess.getUserAccess().getLoginKeyword_9_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__User__Group_9__0__Impl7348); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3716:1: rule__User__Group_9__1 : rule__User__Group_9__1__Impl rule__User__Group_9__2 ;
    public final void rule__User__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3720:1: ( rule__User__Group_9__1__Impl rule__User__Group_9__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3721:2: rule__User__Group_9__1__Impl rule__User__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__1__Impl_in_rule__User__Group_9__17379);
            rule__User__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__2_in_rule__User__Group_9__17382);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3728:1: rule__User__Group_9__1__Impl : ( '=' ) ;
    public final void rule__User__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3732:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3733:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3733:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3734:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_9_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_9__1__Impl7410); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3747:1: rule__User__Group_9__2 : rule__User__Group_9__2__Impl ;
    public final void rule__User__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3751:1: ( rule__User__Group_9__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3752:2: rule__User__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_9__2__Impl_in_rule__User__Group_9__27441);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3758:1: rule__User__Group_9__2__Impl : ( ( rule__User__LoginAssignment_9_2 ) ) ;
    public final void rule__User__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3762:1: ( ( ( rule__User__LoginAssignment_9_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3763:1: ( ( rule__User__LoginAssignment_9_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3763:1: ( ( rule__User__LoginAssignment_9_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3764:1: ( rule__User__LoginAssignment_9_2 )
            {
             before(grammarAccess.getUserAccess().getLoginAssignment_9_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3765:1: ( rule__User__LoginAssignment_9_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3765:2: rule__User__LoginAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__LoginAssignment_9_2_in_rule__User__Group_9__2__Impl7468);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3781:1: rule__User__Group_10__0 : rule__User__Group_10__0__Impl rule__User__Group_10__1 ;
    public final void rule__User__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3785:1: ( rule__User__Group_10__0__Impl rule__User__Group_10__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3786:2: rule__User__Group_10__0__Impl rule__User__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__0__Impl_in_rule__User__Group_10__07504);
            rule__User__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__1_in_rule__User__Group_10__07507);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3793:1: rule__User__Group_10__0__Impl : ( 'Password' ) ;
    public final void rule__User__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3797:1: ( ( 'Password' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3798:1: ( 'Password' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3798:1: ( 'Password' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3799:1: 'Password'
            {
             before(grammarAccess.getUserAccess().getPasswordKeyword_10_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__User__Group_10__0__Impl7535); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3812:1: rule__User__Group_10__1 : rule__User__Group_10__1__Impl rule__User__Group_10__2 ;
    public final void rule__User__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3816:1: ( rule__User__Group_10__1__Impl rule__User__Group_10__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3817:2: rule__User__Group_10__1__Impl rule__User__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__1__Impl_in_rule__User__Group_10__17566);
            rule__User__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__2_in_rule__User__Group_10__17569);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3824:1: rule__User__Group_10__1__Impl : ( '=' ) ;
    public final void rule__User__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3828:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3829:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3829:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3830:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_10_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_10__1__Impl7597); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3843:1: rule__User__Group_10__2 : rule__User__Group_10__2__Impl ;
    public final void rule__User__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3847:1: ( rule__User__Group_10__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3848:2: rule__User__Group_10__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_10__2__Impl_in_rule__User__Group_10__27628);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3854:1: rule__User__Group_10__2__Impl : ( ( rule__User__PasswordAssignment_10_2 ) ) ;
    public final void rule__User__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3858:1: ( ( ( rule__User__PasswordAssignment_10_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3859:1: ( ( rule__User__PasswordAssignment_10_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3859:1: ( ( rule__User__PasswordAssignment_10_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3860:1: ( rule__User__PasswordAssignment_10_2 )
            {
             before(grammarAccess.getUserAccess().getPasswordAssignment_10_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3861:1: ( rule__User__PasswordAssignment_10_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3861:2: rule__User__PasswordAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__PasswordAssignment_10_2_in_rule__User__Group_10__2__Impl7655);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3877:1: rule__User__Group_11__0 : rule__User__Group_11__0__Impl rule__User__Group_11__1 ;
    public final void rule__User__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3881:1: ( rule__User__Group_11__0__Impl rule__User__Group_11__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3882:2: rule__User__Group_11__0__Impl rule__User__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__0__Impl_in_rule__User__Group_11__07691);
            rule__User__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__1_in_rule__User__Group_11__07694);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3889:1: rule__User__Group_11__0__Impl : ( 'Email' ) ;
    public final void rule__User__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3893:1: ( ( 'Email' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3894:1: ( 'Email' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3894:1: ( 'Email' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3895:1: 'Email'
            {
             before(grammarAccess.getUserAccess().getEmailKeyword_11_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__User__Group_11__0__Impl7722); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3908:1: rule__User__Group_11__1 : rule__User__Group_11__1__Impl rule__User__Group_11__2 ;
    public final void rule__User__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3912:1: ( rule__User__Group_11__1__Impl rule__User__Group_11__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3913:2: rule__User__Group_11__1__Impl rule__User__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__1__Impl_in_rule__User__Group_11__17753);
            rule__User__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__2_in_rule__User__Group_11__17756);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3920:1: rule__User__Group_11__1__Impl : ( '=' ) ;
    public final void rule__User__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3924:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3925:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3925:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3926:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_11_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_11__1__Impl7784); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3939:1: rule__User__Group_11__2 : rule__User__Group_11__2__Impl ;
    public final void rule__User__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3943:1: ( rule__User__Group_11__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3944:2: rule__User__Group_11__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_11__2__Impl_in_rule__User__Group_11__27815);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3950:1: rule__User__Group_11__2__Impl : ( ( rule__User__EmailAssignment_11_2 ) ) ;
    public final void rule__User__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3954:1: ( ( ( rule__User__EmailAssignment_11_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3955:1: ( ( rule__User__EmailAssignment_11_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3955:1: ( ( rule__User__EmailAssignment_11_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3956:1: ( rule__User__EmailAssignment_11_2 )
            {
             before(grammarAccess.getUserAccess().getEmailAssignment_11_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3957:1: ( rule__User__EmailAssignment_11_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3957:2: rule__User__EmailAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__EmailAssignment_11_2_in_rule__User__Group_11__2__Impl7842);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3973:1: rule__User__Group_12__0 : rule__User__Group_12__0__Impl rule__User__Group_12__1 ;
    public final void rule__User__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3977:1: ( rule__User__Group_12__0__Impl rule__User__Group_12__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3978:2: rule__User__Group_12__0__Impl rule__User__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__0__Impl_in_rule__User__Group_12__07878);
            rule__User__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__1_in_rule__User__Group_12__07881);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3985:1: rule__User__Group_12__0__Impl : ( 'Role' ) ;
    public final void rule__User__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3989:1: ( ( 'Role' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3990:1: ( 'Role' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3990:1: ( 'Role' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:3991:1: 'Role'
            {
             before(grammarAccess.getUserAccess().getRoleKeyword_12_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__User__Group_12__0__Impl7909); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4004:1: rule__User__Group_12__1 : rule__User__Group_12__1__Impl rule__User__Group_12__2 ;
    public final void rule__User__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4008:1: ( rule__User__Group_12__1__Impl rule__User__Group_12__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4009:2: rule__User__Group_12__1__Impl rule__User__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__1__Impl_in_rule__User__Group_12__17940);
            rule__User__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__2_in_rule__User__Group_12__17943);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4016:1: rule__User__Group_12__1__Impl : ( '=' ) ;
    public final void rule__User__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4020:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4021:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4021:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4022:1: '='
            {
             before(grammarAccess.getUserAccess().getEqualsSignKeyword_12_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__User__Group_12__1__Impl7971); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4035:1: rule__User__Group_12__2 : rule__User__Group_12__2__Impl ;
    public final void rule__User__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4039:1: ( rule__User__Group_12__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4040:2: rule__User__Group_12__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__Group_12__2__Impl_in_rule__User__Group_12__28002);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4046:1: rule__User__Group_12__2__Impl : ( ( rule__User__HasRoleAssignment_12_2 ) ) ;
    public final void rule__User__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4050:1: ( ( ( rule__User__HasRoleAssignment_12_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4051:1: ( ( rule__User__HasRoleAssignment_12_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4051:1: ( ( rule__User__HasRoleAssignment_12_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4052:1: ( rule__User__HasRoleAssignment_12_2 )
            {
             before(grammarAccess.getUserAccess().getHasRoleAssignment_12_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4053:1: ( rule__User__HasRoleAssignment_12_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4053:2: rule__User__HasRoleAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__User__HasRoleAssignment_12_2_in_rule__User__Group_12__2__Impl8029);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4069:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4073:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4074:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__08065);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1_in_rule__Version__Group__08068);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4081:1: rule__Version__Group__0__Impl : ( () ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4085:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4086:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4086:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4087:1: ()
            {
             before(grammarAccess.getVersionAccess().getVersionAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4088:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4090:1: 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4100:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4104:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4105:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__18126);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__2_in_rule__Version__Group__18129);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4112:1: rule__Version__Group__1__Impl : ( 'Version' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4116:1: ( ( 'Version' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4117:1: ( 'Version' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4117:1: ( 'Version' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4118:1: 'Version'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Version__Group__1__Impl8157); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4131:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4135:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4136:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__28188);
            rule__Version__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__3_in_rule__Version__Group__28191);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4143:1: rule__Version__Group__2__Impl : ( 'Number' ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4147:1: ( ( 'Number' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4148:1: ( 'Number' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4148:1: ( 'Number' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4149:1: 'Number'
            {
             before(grammarAccess.getVersionAccess().getNumberKeyword_2()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Version__Group__2__Impl8219); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4162:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4166:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4167:2: rule__Version__Group__3__Impl rule__Version__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__3__Impl_in_rule__Version__Group__38250);
            rule__Version__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__4_in_rule__Version__Group__38253);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4174:1: rule__Version__Group__3__Impl : ( '=' ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4178:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4179:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4179:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4180:1: '='
            {
             before(grammarAccess.getVersionAccess().getEqualsSignKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Version__Group__3__Impl8281); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4193:1: rule__Version__Group__4 : rule__Version__Group__4__Impl ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4197:1: ( rule__Version__Group__4__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4198:2: rule__Version__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__Group__4__Impl_in_rule__Version__Group__48312);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4204:1: rule__Version__Group__4__Impl : ( ( rule__Version__NameAssignment_4 ) ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4208:1: ( ( ( rule__Version__NameAssignment_4 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4209:1: ( ( rule__Version__NameAssignment_4 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4209:1: ( ( rule__Version__NameAssignment_4 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4210:1: ( rule__Version__NameAssignment_4 )
            {
             before(grammarAccess.getVersionAccess().getNameAssignment_4()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4211:1: ( rule__Version__NameAssignment_4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4211:2: rule__Version__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Version__NameAssignment_4_in_rule__Version__Group__4__Impl8339);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4231:1: rule__CMS__Group__0 : rule__CMS__Group__0__Impl rule__CMS__Group__1 ;
    public final void rule__CMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4235:1: ( rule__CMS__Group__0__Impl rule__CMS__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4236:2: rule__CMS__Group__0__Impl rule__CMS__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__0__Impl_in_rule__CMS__Group__08379);
            rule__CMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__1_in_rule__CMS__Group__08382);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4243:1: rule__CMS__Group__0__Impl : ( () ) ;
    public final void rule__CMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4247:1: ( ( () ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4248:1: ( () )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4248:1: ( () )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4249:1: ()
            {
             before(grammarAccess.getCMSAccess().getCMSAction_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4250:1: ()
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4252:1: 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4262:1: rule__CMS__Group__1 : rule__CMS__Group__1__Impl rule__CMS__Group__2 ;
    public final void rule__CMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4266:1: ( rule__CMS__Group__1__Impl rule__CMS__Group__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4267:2: rule__CMS__Group__1__Impl rule__CMS__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__1__Impl_in_rule__CMS__Group__18440);
            rule__CMS__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__2_in_rule__CMS__Group__18443);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4274:1: rule__CMS__Group__1__Impl : ( 'CMS' ) ;
    public final void rule__CMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4278:1: ( ( 'CMS' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4279:1: ( 'CMS' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4279:1: ( 'CMS' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4280:1: 'CMS'
            {
             before(grammarAccess.getCMSAccess().getCMSKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__CMS__Group__1__Impl8471); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4293:1: rule__CMS__Group__2 : rule__CMS__Group__2__Impl rule__CMS__Group__3 ;
    public final void rule__CMS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4297:1: ( rule__CMS__Group__2__Impl rule__CMS__Group__3 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4298:2: rule__CMS__Group__2__Impl rule__CMS__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__2__Impl_in_rule__CMS__Group__28502);
            rule__CMS__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__3_in_rule__CMS__Group__28505);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4305:1: rule__CMS__Group__2__Impl : ( '{' ) ;
    public final void rule__CMS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4309:1: ( ( '{' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4310:1: ( '{' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4310:1: ( '{' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4311:1: '{'
            {
             before(grammarAccess.getCMSAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__CMS__Group__2__Impl8533); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4324:1: rule__CMS__Group__3 : rule__CMS__Group__3__Impl rule__CMS__Group__4 ;
    public final void rule__CMS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4328:1: ( rule__CMS__Group__3__Impl rule__CMS__Group__4 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4329:2: rule__CMS__Group__3__Impl rule__CMS__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__3__Impl_in_rule__CMS__Group__38564);
            rule__CMS__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__4_in_rule__CMS__Group__38567);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4336:1: rule__CMS__Group__3__Impl : ( 'Name' ) ;
    public final void rule__CMS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4340:1: ( ( 'Name' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4341:1: ( 'Name' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4341:1: ( 'Name' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4342:1: 'Name'
            {
             before(grammarAccess.getCMSAccess().getNameKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CMS__Group__3__Impl8595); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4355:1: rule__CMS__Group__4 : rule__CMS__Group__4__Impl rule__CMS__Group__5 ;
    public final void rule__CMS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4359:1: ( rule__CMS__Group__4__Impl rule__CMS__Group__5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4360:2: rule__CMS__Group__4__Impl rule__CMS__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__4__Impl_in_rule__CMS__Group__48626);
            rule__CMS__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__5_in_rule__CMS__Group__48629);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4367:1: rule__CMS__Group__4__Impl : ( '=' ) ;
    public final void rule__CMS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4371:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4372:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4372:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4373:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group__4__Impl8657); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4386:1: rule__CMS__Group__5 : rule__CMS__Group__5__Impl rule__CMS__Group__6 ;
    public final void rule__CMS__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4390:1: ( rule__CMS__Group__5__Impl rule__CMS__Group__6 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4391:2: rule__CMS__Group__5__Impl rule__CMS__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__5__Impl_in_rule__CMS__Group__58688);
            rule__CMS__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__6_in_rule__CMS__Group__58691);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4398:1: rule__CMS__Group__5__Impl : ( ( rule__CMS__NameAssignment_5 ) ) ;
    public final void rule__CMS__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4402:1: ( ( ( rule__CMS__NameAssignment_5 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4403:1: ( ( rule__CMS__NameAssignment_5 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4403:1: ( ( rule__CMS__NameAssignment_5 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4404:1: ( rule__CMS__NameAssignment_5 )
            {
             before(grammarAccess.getCMSAccess().getNameAssignment_5()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4405:1: ( rule__CMS__NameAssignment_5 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4405:2: rule__CMS__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__NameAssignment_5_in_rule__CMS__Group__5__Impl8718);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4415:1: rule__CMS__Group__6 : rule__CMS__Group__6__Impl rule__CMS__Group__7 ;
    public final void rule__CMS__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4419:1: ( rule__CMS__Group__6__Impl rule__CMS__Group__7 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4420:2: rule__CMS__Group__6__Impl rule__CMS__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__6__Impl_in_rule__CMS__Group__68748);
            rule__CMS__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__7_in_rule__CMS__Group__68751);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4427:1: rule__CMS__Group__6__Impl : ( ( rule__CMS__Group_6__0 ) ) ;
    public final void rule__CMS__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4431:1: ( ( ( rule__CMS__Group_6__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4432:1: ( ( rule__CMS__Group_6__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4432:1: ( ( rule__CMS__Group_6__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4433:1: ( rule__CMS__Group_6__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_6()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4434:1: ( rule__CMS__Group_6__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4434:2: rule__CMS__Group_6__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__0_in_rule__CMS__Group__6__Impl8778);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4444:1: rule__CMS__Group__7 : rule__CMS__Group__7__Impl rule__CMS__Group__8 ;
    public final void rule__CMS__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4448:1: ( rule__CMS__Group__7__Impl rule__CMS__Group__8 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4449:2: rule__CMS__Group__7__Impl rule__CMS__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__7__Impl_in_rule__CMS__Group__78808);
            rule__CMS__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__8_in_rule__CMS__Group__78811);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4456:1: rule__CMS__Group__7__Impl : ( ( rule__CMS__Group_7__0 ) ) ;
    public final void rule__CMS__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4460:1: ( ( ( rule__CMS__Group_7__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4461:1: ( ( rule__CMS__Group_7__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4461:1: ( ( rule__CMS__Group_7__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4462:1: ( rule__CMS__Group_7__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_7()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4463:1: ( rule__CMS__Group_7__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4463:2: rule__CMS__Group_7__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__0_in_rule__CMS__Group__7__Impl8838);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4473:1: rule__CMS__Group__8 : rule__CMS__Group__8__Impl rule__CMS__Group__9 ;
    public final void rule__CMS__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4477:1: ( rule__CMS__Group__8__Impl rule__CMS__Group__9 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4478:2: rule__CMS__Group__8__Impl rule__CMS__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__8__Impl_in_rule__CMS__Group__88868);
            rule__CMS__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__9_in_rule__CMS__Group__88871);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4485:1: rule__CMS__Group__8__Impl : ( ( rule__CMS__Group_8__0 ) ) ;
    public final void rule__CMS__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4489:1: ( ( ( rule__CMS__Group_8__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4490:1: ( ( rule__CMS__Group_8__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4490:1: ( ( rule__CMS__Group_8__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4491:1: ( rule__CMS__Group_8__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_8()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4492:1: ( rule__CMS__Group_8__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4492:2: rule__CMS__Group_8__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__0_in_rule__CMS__Group__8__Impl8898);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4502:1: rule__CMS__Group__9 : rule__CMS__Group__9__Impl rule__CMS__Group__10 ;
    public final void rule__CMS__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4506:1: ( rule__CMS__Group__9__Impl rule__CMS__Group__10 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4507:2: rule__CMS__Group__9__Impl rule__CMS__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__9__Impl_in_rule__CMS__Group__98928);
            rule__CMS__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__10_in_rule__CMS__Group__98931);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4514:1: rule__CMS__Group__9__Impl : ( ( rule__CMS__Group_9__0 ) ) ;
    public final void rule__CMS__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4518:1: ( ( ( rule__CMS__Group_9__0 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4519:1: ( ( rule__CMS__Group_9__0 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4519:1: ( ( rule__CMS__Group_9__0 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4520:1: ( rule__CMS__Group_9__0 )
            {
             before(grammarAccess.getCMSAccess().getGroup_9()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4521:1: ( rule__CMS__Group_9__0 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4521:2: rule__CMS__Group_9__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__0_in_rule__CMS__Group__9__Impl8958);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4531:1: rule__CMS__Group__10 : rule__CMS__Group__10__Impl ;
    public final void rule__CMS__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4535:1: ( rule__CMS__Group__10__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4536:2: rule__CMS__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group__10__Impl_in_rule__CMS__Group__108988);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4542:1: rule__CMS__Group__10__Impl : ( '}' ) ;
    public final void rule__CMS__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4546:1: ( ( '}' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4547:1: ( '}' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4547:1: ( '}' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4548:1: '}'
            {
             before(grammarAccess.getCMSAccess().getRightCurlyBracketKeyword_10()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__CMS__Group__10__Impl9016); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4583:1: rule__CMS__Group_6__0 : rule__CMS__Group_6__0__Impl rule__CMS__Group_6__1 ;
    public final void rule__CMS__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4587:1: ( rule__CMS__Group_6__0__Impl rule__CMS__Group_6__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4588:2: rule__CMS__Group_6__0__Impl rule__CMS__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__0__Impl_in_rule__CMS__Group_6__09069);
            rule__CMS__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__1_in_rule__CMS__Group_6__09072);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4595:1: rule__CMS__Group_6__0__Impl : ( 'Type' ) ;
    public final void rule__CMS__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4599:1: ( ( 'Type' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4600:1: ( 'Type' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4600:1: ( 'Type' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4601:1: 'Type'
            {
             before(grammarAccess.getCMSAccess().getTypeKeyword_6_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__CMS__Group_6__0__Impl9100); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4614:1: rule__CMS__Group_6__1 : rule__CMS__Group_6__1__Impl rule__CMS__Group_6__2 ;
    public final void rule__CMS__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4618:1: ( rule__CMS__Group_6__1__Impl rule__CMS__Group_6__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4619:2: rule__CMS__Group_6__1__Impl rule__CMS__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__1__Impl_in_rule__CMS__Group_6__19131);
            rule__CMS__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__2_in_rule__CMS__Group_6__19134);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4626:1: rule__CMS__Group_6__1__Impl : ( '=' ) ;
    public final void rule__CMS__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4630:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4631:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4631:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4632:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_6_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group_6__1__Impl9162); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4645:1: rule__CMS__Group_6__2 : rule__CMS__Group_6__2__Impl ;
    public final void rule__CMS__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4649:1: ( rule__CMS__Group_6__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4650:2: rule__CMS__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_6__2__Impl_in_rule__CMS__Group_6__29193);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4656:1: rule__CMS__Group_6__2__Impl : ( ( rule__CMS__TypeAssignment_6_2 ) ) ;
    public final void rule__CMS__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4660:1: ( ( ( rule__CMS__TypeAssignment_6_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4661:1: ( ( rule__CMS__TypeAssignment_6_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4661:1: ( ( rule__CMS__TypeAssignment_6_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4662:1: ( rule__CMS__TypeAssignment_6_2 )
            {
             before(grammarAccess.getCMSAccess().getTypeAssignment_6_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4663:1: ( rule__CMS__TypeAssignment_6_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4663:2: rule__CMS__TypeAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__TypeAssignment_6_2_in_rule__CMS__Group_6__2__Impl9220);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4679:1: rule__CMS__Group_7__0 : rule__CMS__Group_7__0__Impl rule__CMS__Group_7__1 ;
    public final void rule__CMS__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4683:1: ( rule__CMS__Group_7__0__Impl rule__CMS__Group_7__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4684:2: rule__CMS__Group_7__0__Impl rule__CMS__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__0__Impl_in_rule__CMS__Group_7__09256);
            rule__CMS__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__1_in_rule__CMS__Group_7__09259);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4691:1: rule__CMS__Group_7__0__Impl : ( 'Address_url' ) ;
    public final void rule__CMS__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4695:1: ( ( 'Address_url' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4696:1: ( 'Address_url' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4696:1: ( 'Address_url' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4697:1: 'Address_url'
            {
             before(grammarAccess.getCMSAccess().getAddress_urlKeyword_7_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__CMS__Group_7__0__Impl9287); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4710:1: rule__CMS__Group_7__1 : rule__CMS__Group_7__1__Impl rule__CMS__Group_7__2 ;
    public final void rule__CMS__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4714:1: ( rule__CMS__Group_7__1__Impl rule__CMS__Group_7__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4715:2: rule__CMS__Group_7__1__Impl rule__CMS__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__1__Impl_in_rule__CMS__Group_7__19318);
            rule__CMS__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__2_in_rule__CMS__Group_7__19321);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4722:1: rule__CMS__Group_7__1__Impl : ( '=' ) ;
    public final void rule__CMS__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4726:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4727:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4727:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4728:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_7_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group_7__1__Impl9349); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4741:1: rule__CMS__Group_7__2 : rule__CMS__Group_7__2__Impl ;
    public final void rule__CMS__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4745:1: ( rule__CMS__Group_7__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4746:2: rule__CMS__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_7__2__Impl_in_rule__CMS__Group_7__29380);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4752:1: rule__CMS__Group_7__2__Impl : ( ( rule__CMS__Address_urlAssignment_7_2 ) ) ;
    public final void rule__CMS__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4756:1: ( ( ( rule__CMS__Address_urlAssignment_7_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4757:1: ( ( rule__CMS__Address_urlAssignment_7_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4757:1: ( ( rule__CMS__Address_urlAssignment_7_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4758:1: ( rule__CMS__Address_urlAssignment_7_2 )
            {
             before(grammarAccess.getCMSAccess().getAddress_urlAssignment_7_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4759:1: ( rule__CMS__Address_urlAssignment_7_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4759:2: rule__CMS__Address_urlAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Address_urlAssignment_7_2_in_rule__CMS__Group_7__2__Impl9407);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4775:1: rule__CMS__Group_8__0 : rule__CMS__Group_8__0__Impl rule__CMS__Group_8__1 ;
    public final void rule__CMS__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4779:1: ( rule__CMS__Group_8__0__Impl rule__CMS__Group_8__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4780:2: rule__CMS__Group_8__0__Impl rule__CMS__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__0__Impl_in_rule__CMS__Group_8__09443);
            rule__CMS__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__1_in_rule__CMS__Group_8__09446);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4787:1: rule__CMS__Group_8__0__Impl : ( 'Username' ) ;
    public final void rule__CMS__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4791:1: ( ( 'Username' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4792:1: ( 'Username' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4792:1: ( 'Username' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4793:1: 'Username'
            {
             before(grammarAccess.getCMSAccess().getUsernameKeyword_8_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__CMS__Group_8__0__Impl9474); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4806:1: rule__CMS__Group_8__1 : rule__CMS__Group_8__1__Impl rule__CMS__Group_8__2 ;
    public final void rule__CMS__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4810:1: ( rule__CMS__Group_8__1__Impl rule__CMS__Group_8__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4811:2: rule__CMS__Group_8__1__Impl rule__CMS__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__1__Impl_in_rule__CMS__Group_8__19505);
            rule__CMS__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__2_in_rule__CMS__Group_8__19508);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4818:1: rule__CMS__Group_8__1__Impl : ( '=' ) ;
    public final void rule__CMS__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4822:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4823:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4823:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4824:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_8_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group_8__1__Impl9536); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4837:1: rule__CMS__Group_8__2 : rule__CMS__Group_8__2__Impl ;
    public final void rule__CMS__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4841:1: ( rule__CMS__Group_8__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4842:2: rule__CMS__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_8__2__Impl_in_rule__CMS__Group_8__29567);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4848:1: rule__CMS__Group_8__2__Impl : ( ( rule__CMS__UsernameAssignment_8_2 ) ) ;
    public final void rule__CMS__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4852:1: ( ( ( rule__CMS__UsernameAssignment_8_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4853:1: ( ( rule__CMS__UsernameAssignment_8_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4853:1: ( ( rule__CMS__UsernameAssignment_8_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4854:1: ( rule__CMS__UsernameAssignment_8_2 )
            {
             before(grammarAccess.getCMSAccess().getUsernameAssignment_8_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4855:1: ( rule__CMS__UsernameAssignment_8_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4855:2: rule__CMS__UsernameAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__UsernameAssignment_8_2_in_rule__CMS__Group_8__2__Impl9594);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4871:1: rule__CMS__Group_9__0 : rule__CMS__Group_9__0__Impl rule__CMS__Group_9__1 ;
    public final void rule__CMS__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4875:1: ( rule__CMS__Group_9__0__Impl rule__CMS__Group_9__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4876:2: rule__CMS__Group_9__0__Impl rule__CMS__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__0__Impl_in_rule__CMS__Group_9__09630);
            rule__CMS__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__1_in_rule__CMS__Group_9__09633);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4883:1: rule__CMS__Group_9__0__Impl : ( 'Password' ) ;
    public final void rule__CMS__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4887:1: ( ( 'Password' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4888:1: ( 'Password' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4888:1: ( 'Password' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4889:1: 'Password'
            {
             before(grammarAccess.getCMSAccess().getPasswordKeyword_9_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__CMS__Group_9__0__Impl9661); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4902:1: rule__CMS__Group_9__1 : rule__CMS__Group_9__1__Impl rule__CMS__Group_9__2 ;
    public final void rule__CMS__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4906:1: ( rule__CMS__Group_9__1__Impl rule__CMS__Group_9__2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4907:2: rule__CMS__Group_9__1__Impl rule__CMS__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__1__Impl_in_rule__CMS__Group_9__19692);
            rule__CMS__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__2_in_rule__CMS__Group_9__19695);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4914:1: rule__CMS__Group_9__1__Impl : ( '=' ) ;
    public final void rule__CMS__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4918:1: ( ( '=' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4919:1: ( '=' )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4919:1: ( '=' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4920:1: '='
            {
             before(grammarAccess.getCMSAccess().getEqualsSignKeyword_9_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CMS__Group_9__1__Impl9723); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4933:1: rule__CMS__Group_9__2 : rule__CMS__Group_9__2__Impl ;
    public final void rule__CMS__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4937:1: ( rule__CMS__Group_9__2__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4938:2: rule__CMS__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__Group_9__2__Impl_in_rule__CMS__Group_9__29754);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4944:1: rule__CMS__Group_9__2__Impl : ( ( rule__CMS__PasswordAssignment_9_2 ) ) ;
    public final void rule__CMS__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4948:1: ( ( ( rule__CMS__PasswordAssignment_9_2 ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4949:1: ( ( rule__CMS__PasswordAssignment_9_2 ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4949:1: ( ( rule__CMS__PasswordAssignment_9_2 ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4950:1: ( rule__CMS__PasswordAssignment_9_2 )
            {
             before(grammarAccess.getCMSAccess().getPasswordAssignment_9_2()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4951:1: ( rule__CMS__PasswordAssignment_9_2 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4951:2: rule__CMS__PasswordAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CMS__PasswordAssignment_9_2_in_rule__CMS__Group_9__2__Impl9781);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4967:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4971:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4972:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09817);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09820);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4979:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4983:1: ( ( ( '-' )? ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4984:1: ( ( '-' )? )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4984:1: ( ( '-' )? )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4985:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4986:1: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==53) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4987:2: '-'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_rule__EInt__Group__0__Impl9849); 

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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:4998:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5002:1: ( rule__EInt__Group__1__Impl )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5003:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19882);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5009:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5013:1: ( ( RULE_INT ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5014:1: ( RULE_INT )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5014:1: ( RULE_INT )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5015:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9909); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5031:1: rule__ContentModel__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__ContentModel__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5035:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5036:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5036:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5037:1: ruleEString
            {
             before(grammarAccess.getContentModelAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ContentModel__NameAssignment_59947);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5046:1: rule__ContentModel__HasElementsAssignment_6_2 : ( ruleNamedElement ) ;
    public final void rule__ContentModel__HasElementsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5050:1: ( ( ruleNamedElement ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5051:1: ( ruleNamedElement )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5051:1: ( ruleNamedElement )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5052:1: ruleNamedElement
            {
             before(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_29978);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5061:1: rule__ContentModel__HasElementsAssignment_6_3_1 : ( ruleNamedElement ) ;
    public final void rule__ContentModel__HasElementsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5065:1: ( ( ruleNamedElement ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5066:1: ( ruleNamedElement )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5066:1: ( ruleNamedElement )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5067:1: ruleNamedElement
            {
             before(grammarAccess.getContentModelAccess().getHasElementsNamedElementParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_3_110009);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5076:1: rule__ContentType__VisibleAssignment_0 : ( ( 'visible' ) ) ;
    public final void rule__ContentType__VisibleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5080:1: ( ( ( 'visible' ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5081:1: ( ( 'visible' ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5081:1: ( ( 'visible' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5082:1: ( 'visible' )
            {
             before(grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5083:1: ( 'visible' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5084:1: 'visible'
            {
             before(grammarAccess.getContentTypeAccess().getVisibleVisibleKeyword_0_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__ContentType__VisibleAssignment_010045); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5099:1: rule__ContentType__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__ContentType__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5103:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5104:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5104:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5105:1: ruleEString
            {
             before(grammarAccess.getContentTypeAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ContentType__NameAssignment_510084);
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


    // $ANTLR start "rule__ContentType__HasPropertiesAssignment_8"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5114:1: rule__ContentType__HasPropertiesAssignment_8 : ( ruleProperty ) ;
    public final void rule__ContentType__HasPropertiesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5118:1: ( ( ruleProperty ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5119:1: ( ruleProperty )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5119:1: ( ruleProperty )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5120:1: ruleProperty
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_810115);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__HasPropertiesAssignment_8"


    // $ANTLR start "rule__ContentType__HasPropertiesAssignment_9_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5129:1: rule__ContentType__HasPropertiesAssignment_9_1 : ( ruleProperty ) ;
    public final void rule__ContentType__HasPropertiesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5133:1: ( ( ruleProperty ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5134:1: ( ruleProperty )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5134:1: ( ruleProperty )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5135:1: ruleProperty
            {
             before(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_9_110146);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getHasPropertiesPropertyParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__HasPropertiesAssignment_9_1"


    // $ANTLR start "rule__ContentType__GuidAssignment_12_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5144:1: rule__ContentType__GuidAssignment_12_2 : ( ruleEInt ) ;
    public final void rule__ContentType__GuidAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5148:1: ( ( ruleEInt ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5149:1: ( ruleEInt )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5149:1: ( ruleEInt )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5150:1: ruleEInt
            {
             before(grammarAccess.getContentTypeAccess().getGuidEIntParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ContentType__GuidAssignment_12_210177);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getGuidEIntParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__GuidAssignment_12_2"


    // $ANTLR start "rule__ContentType__HasVersionsAssignment_13_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5159:1: rule__ContentType__HasVersionsAssignment_13_2 : ( ruleVersion ) ;
    public final void rule__ContentType__HasVersionsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5163:1: ( ( ruleVersion ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5164:1: ( ruleVersion )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5164:1: ( ruleVersion )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5165:1: ruleVersion
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_13_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_13_210208);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__HasVersionsAssignment_13_2"


    // $ANTLR start "rule__ContentType__HasVersionsAssignment_13_3_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5174:1: rule__ContentType__HasVersionsAssignment_13_3_1 : ( ruleVersion ) ;
    public final void rule__ContentType__HasVersionsAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5178:1: ( ( ruleVersion ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5179:1: ( ruleVersion )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5179:1: ( ruleVersion )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5180:1: ruleVersion
            {
             before(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_13_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_13_3_110239);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getHasVersionsVersionParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__HasVersionsAssignment_13_3_1"


    // $ANTLR start "rule__ContentType__ModifiedByAssignment_14_2"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5189:1: rule__ContentType__ModifiedByAssignment_14_2 : ( ruleUser ) ;
    public final void rule__ContentType__ModifiedByAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5193:1: ( ( ruleUser ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5194:1: ( ruleUser )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5194:1: ( ruleUser )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5195:1: ruleUser
            {
             before(grammarAccess.getContentTypeAccess().getModifiedByUserParserRuleCall_14_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUser_in_rule__ContentType__ModifiedByAssignment_14_210270);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getContentTypeAccess().getModifiedByUserParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentType__ModifiedByAssignment_14_2"


    // $ANTLR start "rule__Property__NameAssignment_4"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5204:1: rule__Property__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5208:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5209:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5209:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5210:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__NameAssignment_410301);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5219:1: rule__Property__AccessModiferAssignment_7 : ( ruleAccessLevelEnum ) ;
    public final void rule__Property__AccessModiferAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5223:1: ( ( ruleAccessLevelEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5224:1: ( ruleAccessLevelEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5224:1: ( ruleAccessLevelEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5225:1: ruleAccessLevelEnum
            {
             before(grammarAccess.getPropertyAccess().getAccessModiferAccessLevelEnumEnumRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccessLevelEnum_in_rule__Property__AccessModiferAssignment_710332);
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


    // $ANTLR start "rule__Property__TypeAssignment_10"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5234:1: rule__Property__TypeAssignment_10 : ( ruleTypeEnum ) ;
    public final void rule__Property__TypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5238:1: ( ( ruleTypeEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5239:1: ( ruleTypeEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5239:1: ( ruleTypeEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5240:1: ruleTypeEnum
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeEnumEnumRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__Property__TypeAssignment_1010363);
            ruleTypeEnum();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeEnumEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_10"


    // $ANTLR start "rule__Role__IsAdminAssignment_1"
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5249:1: rule__Role__IsAdminAssignment_1 : ( ( 'isAdmin' ) ) ;
    public final void rule__Role__IsAdminAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5253:1: ( ( ( 'isAdmin' ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5254:1: ( ( 'isAdmin' ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5254:1: ( ( 'isAdmin' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5255:1: ( 'isAdmin' )
            {
             before(grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5256:1: ( 'isAdmin' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5257:1: 'isAdmin'
            {
             before(grammarAccess.getRoleAccess().getIsAdminIsAdminKeyword_1_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Role__IsAdminAssignment_110399); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5272:1: rule__Role__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5276:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5277:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5277:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5278:1: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Role__NameAssignment_610438);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5287:1: rule__Role__TypesAssignment_7_2 : ( ruleEString ) ;
    public final void rule__Role__TypesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5291:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5292:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5292:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5293:1: ruleEString
            {
             before(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_210469);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5302:1: rule__Role__TypesAssignment_7_3_1 : ( ruleEString ) ;
    public final void rule__Role__TypesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5306:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5307:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5307:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5308:1: ruleEString
            {
             before(grammarAccess.getRoleAccess().getTypesEStringParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_3_110500);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5317:1: rule__User__DisabledAssignment_1 : ( ( 'disabled' ) ) ;
    public final void rule__User__DisabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5321:1: ( ( ( 'disabled' ) ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5322:1: ( ( 'disabled' ) )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5322:1: ( ( 'disabled' ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5323:1: ( 'disabled' )
            {
             before(grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0()); 
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5324:1: ( 'disabled' )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5325:1: 'disabled'
            {
             before(grammarAccess.getUserAccess().getDisabledDisabledKeyword_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__User__DisabledAssignment_110536); 
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5340:1: rule__User__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__User__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5344:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5345:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5345:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5346:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__NameAssignment_610575);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5355:1: rule__User__FirstnameAssignment_7_2 : ( ruleEString ) ;
    public final void rule__User__FirstnameAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5359:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5360:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5360:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5361:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getFirstnameEStringParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__FirstnameAssignment_7_210606);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5370:1: rule__User__LastnameAssignment_8_2 : ( ruleEString ) ;
    public final void rule__User__LastnameAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5374:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5375:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5375:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5376:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getLastnameEStringParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__LastnameAssignment_8_210637);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5385:1: rule__User__LoginAssignment_9_2 : ( ruleEString ) ;
    public final void rule__User__LoginAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5389:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5390:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5390:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5391:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getLoginEStringParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__LoginAssignment_9_210668);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5400:1: rule__User__PasswordAssignment_10_2 : ( ruleEString ) ;
    public final void rule__User__PasswordAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5404:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5405:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5405:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5406:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getPasswordEStringParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__PasswordAssignment_10_210699);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5415:1: rule__User__EmailAssignment_11_2 : ( ruleEString ) ;
    public final void rule__User__EmailAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5419:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5420:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5420:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5421:1: ruleEString
            {
             before(grammarAccess.getUserAccess().getEmailEStringParserRuleCall_11_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__User__EmailAssignment_11_210730);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5430:1: rule__User__HasRoleAssignment_12_2 : ( ruleRole ) ;
    public final void rule__User__HasRoleAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5434:1: ( ( ruleRole ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5435:1: ( ruleRole )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5435:1: ( ruleRole )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5436:1: ruleRole
            {
             before(grammarAccess.getUserAccess().getHasRoleRoleParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__User__HasRoleAssignment_12_210761);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5445:1: rule__Version__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Version__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5449:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5450:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5450:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5451:1: ruleEString
            {
             before(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Version__NameAssignment_410792);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5460:1: rule__CMS__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__CMS__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5464:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5465:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5465:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5466:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__NameAssignment_510823);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5475:1: rule__CMS__TypeAssignment_6_2 : ( ruleCMSEnum ) ;
    public final void rule__CMS__TypeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5479:1: ( ( ruleCMSEnum ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5480:1: ( ruleCMSEnum )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5480:1: ( ruleCMSEnum )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5481:1: ruleCMSEnum
            {
             before(grammarAccess.getCMSAccess().getTypeCMSEnumEnumRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCMSEnum_in_rule__CMS__TypeAssignment_6_210854);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5490:1: rule__CMS__Address_urlAssignment_7_2 : ( ruleEString ) ;
    public final void rule__CMS__Address_urlAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5494:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5495:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5495:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5496:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getAddress_urlEStringParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__Address_urlAssignment_7_210885);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5505:1: rule__CMS__UsernameAssignment_8_2 : ( ruleEString ) ;
    public final void rule__CMS__UsernameAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5509:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5510:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5510:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5511:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getUsernameEStringParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__UsernameAssignment_8_210916);
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
    // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5520:1: rule__CMS__PasswordAssignment_9_2 : ( ruleEString ) ;
    public final void rule__CMS__PasswordAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5524:1: ( ( ruleEString ) )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5525:1: ( ruleEString )
            {
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5525:1: ( ruleEString )
            // ../mddProject.concreteSyntax.ui/src-gen/mddProject/concreteSyntax/ui/contentassist/antlr/internal/InternalJDSL.g:5526:1: ruleEString
            {
             before(grammarAccess.getCMSAccess().getPasswordEStringParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CMS__PasswordAssignment_9_210947);
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
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__1__Impl_in_rule__ContentModel__Group_6__11783 = new BitSet(new long[]{0x0044000100000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__2_in_rule__ContentModel__Group_6__11786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentModel__Group_6__1__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__2__Impl_in_rule__ContentModel__Group_6__21845 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__3_in_rule__ContentModel__Group_6__21848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__HasElementsAssignment_6_2_in_rule__ContentModel__Group_6__2__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__3__Impl_in_rule__ContentModel__Group_6__31905 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__4_in_rule__ContentModel__Group_6__31908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__0_in_rule__ContentModel__Group_6__3__Impl1935 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__4__Impl_in_rule__ContentModel__Group_6__41966 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__5_in_rule__ContentModel__Group_6__41969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentModel__Group_6__4__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6__5__Impl_in_rule__ContentModel__Group_6__52028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentModel__Group_6__5__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__0__Impl_in_rule__ContentModel__Group_6_3__02099 = new BitSet(new long[]{0x0044000100000000L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__1_in_rule__ContentModel__Group_6_3__02102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentModel__Group_6_3__0__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__Group_6_3__1__Impl_in_rule__ContentModel__Group_6_3__12161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentModel__HasElementsAssignment_6_3_1_in_rule__ContentModel__Group_6_3__1__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__0__Impl_in_rule__ContentType__Group__02222 = new BitSet(new long[]{0x0040000100000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__1_in_rule__ContentType__Group__02225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__VisibleAssignment_0_in_rule__ContentType__Group__0__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__1__Impl_in_rule__ContentType__Group__12283 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__2_in_rule__ContentType__Group__12286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ContentType__Group__1__Impl2314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__2__Impl_in_rule__ContentType__Group__22345 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__3_in_rule__ContentType__Group__22348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentType__Group__2__Impl2376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__3__Impl_in_rule__ContentType__Group__32407 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__4_in_rule__ContentType__Group__32410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ContentType__Group__3__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__4__Impl_in_rule__ContentType__Group__42469 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ContentType__Group__5_in_rule__ContentType__Group__42472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ContentType__Group__4__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__5__Impl_in_rule__ContentType__Group__52531 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__6_in_rule__ContentType__Group__52534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__NameAssignment_5_in_rule__ContentType__Group__5__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__6__Impl_in_rule__ContentType__Group__62591 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__7_in_rule__ContentType__Group__62594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ContentType__Group__6__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__7__Impl_in_rule__ContentType__Group__72653 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__8_in_rule__ContentType__Group__72656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentType__Group__7__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__8__Impl_in_rule__ContentType__Group__82715 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__9_in_rule__ContentType__Group__82718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasPropertiesAssignment_8_in_rule__ContentType__Group__8__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__9__Impl_in_rule__ContentType__Group__92775 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__10_in_rule__ContentType__Group__92778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_9__0_in_rule__ContentType__Group__9__Impl2805 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__10__Impl_in_rule__ContentType__Group__102836 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__11_in_rule__ContentType__Group__102839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentType__Group__10__Impl2867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__11__Impl_in_rule__ContentType__Group__112898 = new BitSet(new long[]{0x0000001C20000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__12_in_rule__ContentType__Group__112901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentType__Group__11__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__12__Impl_in_rule__ContentType__Group__122960 = new BitSet(new long[]{0x0000001C20000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__13_in_rule__ContentType__Group__122963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__0_in_rule__ContentType__Group__12__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__13__Impl_in_rule__ContentType__Group__133021 = new BitSet(new long[]{0x0000001C20000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__14_in_rule__ContentType__Group__133024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__0_in_rule__ContentType__Group__13__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__14__Impl_in_rule__ContentType__Group__143082 = new BitSet(new long[]{0x0000001C20000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group__15_in_rule__ContentType__Group__143085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_14__0_in_rule__ContentType__Group__14__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group__15__Impl_in_rule__ContentType__Group__153143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentType__Group__15__Impl3171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_9__0__Impl_in_rule__ContentType__Group_9__03234 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_9__1_in_rule__ContentType__Group_9__03237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentType__Group_9__0__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_9__1__Impl_in_rule__ContentType__Group_9__13296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasPropertiesAssignment_9_1_in_rule__ContentType__Group_9__1__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__0__Impl_in_rule__ContentType__Group_12__03357 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__1_in_rule__ContentType__Group_12__03360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ContentType__Group_12__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__1__Impl_in_rule__ContentType__Group_12__13419 = new BitSet(new long[]{0x0020000000000040L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__2_in_rule__ContentType__Group_12__13422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ContentType__Group_12__1__Impl3450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_12__2__Impl_in_rule__ContentType__Group_12__23481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__GuidAssignment_12_2_in_rule__ContentType__Group_12__2__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__0__Impl_in_rule__ContentType__Group_13__03544 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__1_in_rule__ContentType__Group_13__03547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ContentType__Group_13__0__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__1__Impl_in_rule__ContentType__Group_13__13606 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__2_in_rule__ContentType__Group_13__13609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ContentType__Group_13__1__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__2__Impl_in_rule__ContentType__Group_13__23668 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__3_in_rule__ContentType__Group_13__23671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasVersionsAssignment_13_2_in_rule__ContentType__Group_13__2__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__3__Impl_in_rule__ContentType__Group_13__33728 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__4_in_rule__ContentType__Group_13__33731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13_3__0_in_rule__ContentType__Group_13__3__Impl3758 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__4__Impl_in_rule__ContentType__Group_13__43789 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__5_in_rule__ContentType__Group_13__43792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentType__Group_13__4__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13__5__Impl_in_rule__ContentType__Group_13__53851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ContentType__Group_13__5__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13_3__0__Impl_in_rule__ContentType__Group_13_3__03922 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13_3__1_in_rule__ContentType__Group_13_3__03925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ContentType__Group_13_3__0__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_13_3__1__Impl_in_rule__ContentType__Group_13_3__13984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__HasVersionsAssignment_13_3_1_in_rule__ContentType__Group_13_3__1__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_14__0__Impl_in_rule__ContentType__Group_14__04045 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_14__1_in_rule__ContentType__Group_14__04048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ContentType__Group_14__0__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_14__1__Impl_in_rule__ContentType__Group_14__14107 = new BitSet(new long[]{0x0100040000000000L});
        public static final BitSet FOLLOW_rule__ContentType__Group_14__2_in_rule__ContentType__Group_14__14110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ContentType__Group_14__1__Impl4138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__Group_14__2__Impl_in_rule__ContentType__Group_14__24169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ContentType__ModifiedByAssignment_14_2_in_rule__ContentType__Group_14__2__Impl4196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04232 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Property__Group__0__Impl4263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14294 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Property__Group__1__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24356 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__24359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Property__Group__2__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__34418 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__34421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Property__Group__3__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__44480 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__44483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__NameAssignment_4_in_rule__Property__Group__4__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__54540 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Property__Group__6_in_rule__Property__Group__54543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Property__Group__5__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__64602 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Property__Group__7_in_rule__Property__Group__64605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Property__Group__6__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__74664 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Property__Group__8_in_rule__Property__Group__74667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__AccessModiferAssignment_7_in_rule__Property__Group__7__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__8__Impl_in_rule__Property__Group__84724 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Property__Group__9_in_rule__Property__Group__84727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Property__Group__8__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__9__Impl_in_rule__Property__Group__94786 = new BitSet(new long[]{0x000000000007F800L});
        public static final BitSet FOLLOW_rule__Property__Group__10_in_rule__Property__Group__94789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Property__Group__9__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__10__Impl_in_rule__Property__Group__104848 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Property__Group__11_in_rule__Property__Group__104851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__TypeAssignment_10_in_rule__Property__Group__10__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__11__Impl_in_rule__Property__Group__114908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Property__Group__11__Impl4936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__04991 = new BitSet(new long[]{0x0080010000000000L});
        public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__04994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__15052 = new BitSet(new long[]{0x0080010000000000L});
        public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__15055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__IsAdminAssignment_1_in_rule__Role__Group__1__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__25113 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__25116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Role__Group__2__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__35175 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__35178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Role__Group__3__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__45237 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__45240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Role__Group__4__Impl5268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__55299 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Role__Group__6_in_rule__Role__Group__55302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Role__Group__5__Impl5330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__65361 = new BitSet(new long[]{0x0000020020000000L});
        public static final BitSet FOLLOW_rule__Role__Group__7_in_rule__Role__Group__65364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__NameAssignment_6_in_rule__Role__Group__6__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__75421 = new BitSet(new long[]{0x0000020020000000L});
        public static final BitSet FOLLOW_rule__Role__Group__8_in_rule__Role__Group__75424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__0_in_rule__Role__Group__7__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__8__Impl_in_rule__Role__Group__85482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Role__Group__8__Impl5510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__0__Impl_in_rule__Role__Group_7__05559 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__1_in_rule__Role__Group_7__05562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Role__Group_7__0__Impl5590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__1__Impl_in_rule__Role__Group_7__15621 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Role__Group_7__2_in_rule__Role__Group_7__15624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Role__Group_7__1__Impl5652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__2__Impl_in_rule__Role__Group_7__25683 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__3_in_rule__Role__Group_7__25686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__TypesAssignment_7_2_in_rule__Role__Group_7__2__Impl5713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__3__Impl_in_rule__Role__Group_7__35743 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__4_in_rule__Role__Group_7__35746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__0_in_rule__Role__Group_7__3__Impl5773 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__4__Impl_in_rule__Role__Group_7__45804 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Role__Group_7__5_in_rule__Role__Group_7__45807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Role__Group_7__4__Impl5835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7__5__Impl_in_rule__Role__Group_7__55866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Role__Group_7__5__Impl5894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__0__Impl_in_rule__Role__Group_7_3__05937 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__1_in_rule__Role__Group_7_3__05940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Role__Group_7_3__0__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_7_3__1__Impl_in_rule__Role__Group_7_3__15999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__TypesAssignment_7_3_1_in_rule__Role__Group_7_3__1__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__06060 = new BitSet(new long[]{0x0100040000000000L});
        public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__06063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__16121 = new BitSet(new long[]{0x0100040000000000L});
        public static final BitSet FOLLOW_rule__User__Group__2_in_rule__User__Group__16124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__DisabledAssignment_1_in_rule__User__Group__1__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__26182 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__User__Group__3_in_rule__User__Group__26185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__User__Group__2__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__36244 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__User__Group__4_in_rule__User__Group__36247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__User__Group__3__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__46306 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group__5_in_rule__User__Group__46309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__User__Group__4__Impl6337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__5__Impl_in_rule__User__Group__56368 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group__6_in_rule__User__Group__56371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group__5__Impl6399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__6__Impl_in_rule__User__Group__66430 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__7_in_rule__User__Group__66433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__NameAssignment_6_in_rule__User__Group__6__Impl6460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__7__Impl_in_rule__User__Group__76490 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__8_in_rule__User__Group__76493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__0_in_rule__User__Group__7__Impl6520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__8__Impl_in_rule__User__Group__86551 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__9_in_rule__User__Group__86554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__0_in_rule__User__Group__8__Impl6581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__9__Impl_in_rule__User__Group__96612 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__10_in_rule__User__Group__96615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__0_in_rule__User__Group__9__Impl6642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__10__Impl_in_rule__User__Group__106673 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__11_in_rule__User__Group__106676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__0_in_rule__User__Group__10__Impl6703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__11__Impl_in_rule__User__Group__116734 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__12_in_rule__User__Group__116737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__0_in_rule__User__Group__11__Impl6764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__12__Impl_in_rule__User__Group__126795 = new BitSet(new long[]{0x0000F90020000000L});
        public static final BitSet FOLLOW_rule__User__Group__13_in_rule__User__Group__126798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__0_in_rule__User__Group__12__Impl6825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group__13__Impl_in_rule__User__Group__136856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__User__Group__13__Impl6884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__0__Impl_in_rule__User__Group_7__06943 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_7__1_in_rule__User__Group_7__06946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__User__Group_7__0__Impl6974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__1__Impl_in_rule__User__Group_7__17005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_7__2_in_rule__User__Group_7__17008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_7__1__Impl7036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_7__2__Impl_in_rule__User__Group_7__27067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__FirstnameAssignment_7_2_in_rule__User__Group_7__2__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__0__Impl_in_rule__User__Group_8__07130 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_8__1_in_rule__User__Group_8__07133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__User__Group_8__0__Impl7161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__1__Impl_in_rule__User__Group_8__17192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_8__2_in_rule__User__Group_8__17195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_8__1__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_8__2__Impl_in_rule__User__Group_8__27254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__LastnameAssignment_8_2_in_rule__User__Group_8__2__Impl7281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__0__Impl_in_rule__User__Group_9__07317 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_9__1_in_rule__User__Group_9__07320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__User__Group_9__0__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__1__Impl_in_rule__User__Group_9__17379 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_9__2_in_rule__User__Group_9__17382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_9__1__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_9__2__Impl_in_rule__User__Group_9__27441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__LoginAssignment_9_2_in_rule__User__Group_9__2__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__0__Impl_in_rule__User__Group_10__07504 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_10__1_in_rule__User__Group_10__07507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__User__Group_10__0__Impl7535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__1__Impl_in_rule__User__Group_10__17566 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_10__2_in_rule__User__Group_10__17569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_10__1__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_10__2__Impl_in_rule__User__Group_10__27628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__PasswordAssignment_10_2_in_rule__User__Group_10__2__Impl7655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__0__Impl_in_rule__User__Group_11__07691 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_11__1_in_rule__User__Group_11__07694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__User__Group_11__0__Impl7722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__1__Impl_in_rule__User__Group_11__17753 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__User__Group_11__2_in_rule__User__Group_11__17756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_11__1__Impl7784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_11__2__Impl_in_rule__User__Group_11__27815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__EmailAssignment_11_2_in_rule__User__Group_11__2__Impl7842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__0__Impl_in_rule__User__Group_12__07878 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__User__Group_12__1_in_rule__User__Group_12__07881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__User__Group_12__0__Impl7909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__1__Impl_in_rule__User__Group_12__17940 = new BitSet(new long[]{0x0080010000000000L});
        public static final BitSet FOLLOW_rule__User__Group_12__2_in_rule__User__Group_12__17943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__User__Group_12__1__Impl7971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__Group_12__2__Impl_in_rule__User__Group_12__28002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__User__HasRoleAssignment_12_2_in_rule__User__Group_12__2__Impl8029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__08065 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__08068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__18126 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__18129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Version__Group__1__Impl8157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__28188 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Version__Group__3_in_rule__Version__Group__28191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Version__Group__2__Impl8219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__3__Impl_in_rule__Version__Group__38250 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Version__Group__4_in_rule__Version__Group__38253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Version__Group__3__Impl8281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__Group__4__Impl_in_rule__Version__Group__48312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Version__NameAssignment_4_in_rule__Version__Group__4__Impl8339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__0__Impl_in_rule__CMS__Group__08379 = new BitSet(new long[]{0x0044000100000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__1_in_rule__CMS__Group__08382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__1__Impl_in_rule__CMS__Group__18440 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__2_in_rule__CMS__Group__18443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__CMS__Group__1__Impl8471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__2__Impl_in_rule__CMS__Group__28502 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__3_in_rule__CMS__Group__28505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CMS__Group__2__Impl8533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__3__Impl_in_rule__CMS__Group__38564 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__4_in_rule__CMS__Group__38567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CMS__Group__3__Impl8595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__4__Impl_in_rule__CMS__Group__48626 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group__5_in_rule__CMS__Group__48629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group__4__Impl8657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__5__Impl_in_rule__CMS__Group__58688 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__6_in_rule__CMS__Group__58691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__NameAssignment_5_in_rule__CMS__Group__5__Impl8718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__6__Impl_in_rule__CMS__Group__68748 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__7_in_rule__CMS__Group__68751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__0_in_rule__CMS__Group__6__Impl8778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__7__Impl_in_rule__CMS__Group__78808 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__8_in_rule__CMS__Group__78811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__0_in_rule__CMS__Group__7__Impl8838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__8__Impl_in_rule__CMS__Group__88868 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__9_in_rule__CMS__Group__88871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__0_in_rule__CMS__Group__8__Impl8898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__9__Impl_in_rule__CMS__Group__98928 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__CMS__Group__10_in_rule__CMS__Group__98931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__0_in_rule__CMS__Group__9__Impl8958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group__10__Impl_in_rule__CMS__Group__108988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CMS__Group__10__Impl9016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__0__Impl_in_rule__CMS__Group_6__09069 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__1_in_rule__CMS__Group_6__09072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__CMS__Group_6__0__Impl9100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__1__Impl_in_rule__CMS__Group_6__19131 = new BitSet(new long[]{0x0000000000780000L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__2_in_rule__CMS__Group_6__19134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group_6__1__Impl9162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_6__2__Impl_in_rule__CMS__Group_6__29193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__TypeAssignment_6_2_in_rule__CMS__Group_6__2__Impl9220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__0__Impl_in_rule__CMS__Group_7__09256 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__1_in_rule__CMS__Group_7__09259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__CMS__Group_7__0__Impl9287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__1__Impl_in_rule__CMS__Group_7__19318 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__2_in_rule__CMS__Group_7__19321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group_7__1__Impl9349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_7__2__Impl_in_rule__CMS__Group_7__29380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Address_urlAssignment_7_2_in_rule__CMS__Group_7__2__Impl9407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__0__Impl_in_rule__CMS__Group_8__09443 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__1_in_rule__CMS__Group_8__09446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__CMS__Group_8__0__Impl9474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__1__Impl_in_rule__CMS__Group_8__19505 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__2_in_rule__CMS__Group_8__19508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group_8__1__Impl9536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_8__2__Impl_in_rule__CMS__Group_8__29567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__UsernameAssignment_8_2_in_rule__CMS__Group_8__2__Impl9594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__0__Impl_in_rule__CMS__Group_9__09630 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__1_in_rule__CMS__Group_9__09633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__CMS__Group_9__0__Impl9661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__1__Impl_in_rule__CMS__Group_9__19692 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__2_in_rule__CMS__Group_9__19695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CMS__Group_9__1__Impl9723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__Group_9__2__Impl_in_rule__CMS__Group_9__29754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CMS__PasswordAssignment_9_2_in_rule__CMS__Group_9__2__Impl9781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09817 = new BitSet(new long[]{0x0020000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__EInt__Group__0__Impl9849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ContentModel__NameAssignment_59947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_29978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNamedElement_in_rule__ContentModel__HasElementsAssignment_6_3_110009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__ContentType__VisibleAssignment_010045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ContentType__NameAssignment_510084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_810115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__ContentType__HasPropertiesAssignment_9_110146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ContentType__GuidAssignment_12_210177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_13_210208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_rule__ContentType__HasVersionsAssignment_13_3_110239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUser_in_rule__ContentType__ModifiedByAssignment_14_210270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__NameAssignment_410301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessLevelEnum_in_rule__Property__AccessModiferAssignment_710332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__Property__TypeAssignment_1010363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Role__IsAdminAssignment_110399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Role__NameAssignment_610438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_210469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Role__TypesAssignment_7_3_110500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__User__DisabledAssignment_110536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__NameAssignment_610575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__FirstnameAssignment_7_210606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__LastnameAssignment_8_210637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__LoginAssignment_9_210668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__PasswordAssignment_10_210699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__User__EmailAssignment_11_210730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__User__HasRoleAssignment_12_210761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Version__NameAssignment_410792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__NameAssignment_510823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCMSEnum_in_rule__CMS__TypeAssignment_6_210854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__Address_urlAssignment_7_210885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__UsernameAssignment_8_210916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CMS__PasswordAssignment_9_210947 = new BitSet(new long[]{0x0000000000000002L});
    }


}