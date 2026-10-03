package swarchitecture.compliance.security.cbdl.parser.antlr.internal;

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
import swarchitecture.compliance.security.cbdl.services.CBDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCBDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'check'", "'import'", "'<'", "'>'", "'.'", "'component'", "'in'", "'{'", "','", "'}'", "';'", "'connector'", "':'", "'-'", "'data'", "'library'", "'category'", "'compliance'", "'('", "')'", "'reference'", "'comment'", "'alloy'", "'overlay'", "'instance'", "'securityControl'", "'enforce'", "'atomic'", "'securityReq'", "'<-'", "'->'", "'COMPONENT'", "'PORT'", "'CONNECTOR'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCBDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCBDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCBDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCBDL.g"; }



     	private CBDLGrammarAccess grammarAccess;

        public InternalCBDLParser(TokenStream input, CBDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected CBDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalCBDL.g:65:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalCBDL.g:65:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalCBDL.g:66:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalCBDL.g:72:1: ruleRoot returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_logicalView_2_0= ruleLogicalView ) ) | ( (lv_propetyView_3_0= rulePropetyView ) ) ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_logicalView_2_0 = null;

        EObject lv_propetyView_3_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:78:2: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_logicalView_2_0= ruleLogicalView ) ) | ( (lv_propetyView_3_0= rulePropetyView ) ) ) ) )
            // InternalCBDL.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_logicalView_2_0= ruleLogicalView ) ) | ( (lv_propetyView_3_0= rulePropetyView ) ) ) )
            {
            // InternalCBDL.g:79:2: ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_logicalView_2_0= ruleLogicalView ) ) | ( (lv_propetyView_3_0= rulePropetyView ) ) ) )
            // InternalCBDL.g:80:3: () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_logicalView_2_0= ruleLogicalView ) ) | ( (lv_propetyView_3_0= rulePropetyView ) ) )
            {
            // InternalCBDL.g:80:3: ()
            // InternalCBDL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootAccess().getRootAction_0(),
            					current);
            			

            }

            // InternalCBDL.g:87:3: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCBDL.g:88:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalCBDL.g:88:4: (lv_imports_1_0= ruleImport )
            	    // InternalCBDL.g:89:5: lv_imports_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"swarchitecture.compliance.security.cbdl.CBDL.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCBDL.g:106:3: ( ( (lv_logicalView_2_0= ruleLogicalView ) ) | ( (lv_propetyView_3_0= rulePropetyView ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 16:
            case 22:
            case 25:
                {
                alt2=1;
                }
                break;
            case EOF:
                {
                alt2=1;
                }
                break;
            case 11:
            case 26:
            case 39:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCBDL.g:107:4: ( (lv_logicalView_2_0= ruleLogicalView ) )
                    {
                    // InternalCBDL.g:107:4: ( (lv_logicalView_2_0= ruleLogicalView ) )
                    // InternalCBDL.g:108:5: (lv_logicalView_2_0= ruleLogicalView )
                    {
                    // InternalCBDL.g:108:5: (lv_logicalView_2_0= ruleLogicalView )
                    // InternalCBDL.g:109:6: lv_logicalView_2_0= ruleLogicalView
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getLogicalViewLogicalViewParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_logicalView_2_0=ruleLogicalView();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"logicalView",
                    							lv_logicalView_2_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.LogicalView");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCBDL.g:127:4: ( (lv_propetyView_3_0= rulePropetyView ) )
                    {
                    // InternalCBDL.g:127:4: ( (lv_propetyView_3_0= rulePropetyView ) )
                    // InternalCBDL.g:128:5: (lv_propetyView_3_0= rulePropetyView )
                    {
                    // InternalCBDL.g:128:5: (lv_propetyView_3_0= rulePropetyView )
                    // InternalCBDL.g:129:6: lv_propetyView_3_0= rulePropetyView
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getPropetyViewPropetyViewParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_propetyView_3_0=rulePropetyView();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"propetyView",
                    							lv_propetyView_3_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.PropetyView");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleLogicalView"
    // InternalCBDL.g:151:1: entryRuleLogicalView returns [EObject current=null] : iv_ruleLogicalView= ruleLogicalView EOF ;
    public final EObject entryRuleLogicalView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalView = null;


        try {
            // InternalCBDL.g:151:52: (iv_ruleLogicalView= ruleLogicalView EOF )
            // InternalCBDL.g:152:2: iv_ruleLogicalView= ruleLogicalView EOF
            {
             newCompositeNode(grammarAccess.getLogicalViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalView=ruleLogicalView();

            state._fsp--;

             current =iv_ruleLogicalView; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalView"


    // $ANTLR start "ruleLogicalView"
    // InternalCBDL.g:158:1: ruleLogicalView returns [EObject current=null] : ( () ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_connectors_2_0= ruleConnetor ) ) | ( (lv_interactionNatures_3_0= ruleInteractionNature ) ) )* ) ;
    public final EObject ruleLogicalView() throws RecognitionException {
        EObject current = null;

        EObject lv_components_1_0 = null;

        EObject lv_connectors_2_0 = null;

        EObject lv_interactionNatures_3_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:164:2: ( ( () ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_connectors_2_0= ruleConnetor ) ) | ( (lv_interactionNatures_3_0= ruleInteractionNature ) ) )* ) )
            // InternalCBDL.g:165:2: ( () ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_connectors_2_0= ruleConnetor ) ) | ( (lv_interactionNatures_3_0= ruleInteractionNature ) ) )* )
            {
            // InternalCBDL.g:165:2: ( () ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_connectors_2_0= ruleConnetor ) ) | ( (lv_interactionNatures_3_0= ruleInteractionNature ) ) )* )
            // InternalCBDL.g:166:3: () ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_connectors_2_0= ruleConnetor ) ) | ( (lv_interactionNatures_3_0= ruleInteractionNature ) ) )*
            {
            // InternalCBDL.g:166:3: ()
            // InternalCBDL.g:167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogicalViewAccess().getLogicalViewAction_0(),
            					current);
            			

            }

            // InternalCBDL.g:173:3: ( ( (lv_components_1_0= ruleComponent ) ) | ( (lv_connectors_2_0= ruleConnetor ) ) | ( (lv_interactionNatures_3_0= ruleInteractionNature ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt3=1;
                    }
                    break;
                case 22:
                    {
                    alt3=2;
                    }
                    break;
                case 25:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalCBDL.g:174:4: ( (lv_components_1_0= ruleComponent ) )
            	    {
            	    // InternalCBDL.g:174:4: ( (lv_components_1_0= ruleComponent ) )
            	    // InternalCBDL.g:175:5: (lv_components_1_0= ruleComponent )
            	    {
            	    // InternalCBDL.g:175:5: (lv_components_1_0= ruleComponent )
            	    // InternalCBDL.g:176:6: lv_components_1_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalViewAccess().getComponentsComponentParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_components_1_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalViewRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_1_0,
            	    							"swarchitecture.compliance.security.cbdl.CBDL.Component");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCBDL.g:194:4: ( (lv_connectors_2_0= ruleConnetor ) )
            	    {
            	    // InternalCBDL.g:194:4: ( (lv_connectors_2_0= ruleConnetor ) )
            	    // InternalCBDL.g:195:5: (lv_connectors_2_0= ruleConnetor )
            	    {
            	    // InternalCBDL.g:195:5: (lv_connectors_2_0= ruleConnetor )
            	    // InternalCBDL.g:196:6: lv_connectors_2_0= ruleConnetor
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalViewAccess().getConnectorsConnetorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_connectors_2_0=ruleConnetor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalViewRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectors",
            	    							lv_connectors_2_0,
            	    							"swarchitecture.compliance.security.cbdl.CBDL.Connetor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCBDL.g:214:4: ( (lv_interactionNatures_3_0= ruleInteractionNature ) )
            	    {
            	    // InternalCBDL.g:214:4: ( (lv_interactionNatures_3_0= ruleInteractionNature ) )
            	    // InternalCBDL.g:215:5: (lv_interactionNatures_3_0= ruleInteractionNature )
            	    {
            	    // InternalCBDL.g:215:5: (lv_interactionNatures_3_0= ruleInteractionNature )
            	    // InternalCBDL.g:216:6: lv_interactionNatures_3_0= ruleInteractionNature
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalViewAccess().getInteractionNaturesInteractionNatureParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_interactionNatures_3_0=ruleInteractionNature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalViewRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interactionNatures",
            	    							lv_interactionNatures_3_0,
            	    							"swarchitecture.compliance.security.cbdl.CBDL.InteractionNature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleLogicalView"


    // $ANTLR start "entryRulePropetyView"
    // InternalCBDL.g:238:1: entryRulePropetyView returns [EObject current=null] : iv_rulePropetyView= rulePropetyView EOF ;
    public final EObject entryRulePropetyView() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropetyView = null;


        try {
            // InternalCBDL.g:238:52: (iv_rulePropetyView= rulePropetyView EOF )
            // InternalCBDL.g:239:2: iv_rulePropetyView= rulePropetyView EOF
            {
             newCompositeNode(grammarAccess.getPropetyViewRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropetyView=rulePropetyView();

            state._fsp--;

             current =iv_rulePropetyView; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropetyView"


    // $ANTLR start "rulePropetyView"
    // InternalCBDL.g:245:1: rulePropetyView returns [EObject current=null] : ( () ( ( (lv_libraries_1_0= rulePropertyCategoryLibrary ) ) | ( (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) ) | ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) ) )* ) ) ;
    public final EObject rulePropetyView() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_libraries_1_0 = null;

        EObject lv_complianceProperties_3_0 = null;

        EObject lv_overlayComplianceProperties_4_0 = null;

        EObject lv_securityControlProperties_5_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:251:2: ( ( () ( ( (lv_libraries_1_0= rulePropertyCategoryLibrary ) ) | ( (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) ) | ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) ) )* ) ) )
            // InternalCBDL.g:252:2: ( () ( ( (lv_libraries_1_0= rulePropertyCategoryLibrary ) ) | ( (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) ) | ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) ) )* ) )
            {
            // InternalCBDL.g:252:2: ( () ( ( (lv_libraries_1_0= rulePropertyCategoryLibrary ) ) | ( (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) ) | ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) ) )* ) )
            // InternalCBDL.g:253:3: () ( ( (lv_libraries_1_0= rulePropertyCategoryLibrary ) ) | ( (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) ) | ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) ) )* )
            {
            // InternalCBDL.g:253:3: ()
            // InternalCBDL.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropetyViewAccess().getPropertyViewAction_0(),
            					current);
            			

            }

            // InternalCBDL.g:260:3: ( ( (lv_libraries_1_0= rulePropertyCategoryLibrary ) ) | ( (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) ) | ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) ) )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==EOF||LA6_0==11||LA6_0==39) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCBDL.g:261:4: ( (lv_libraries_1_0= rulePropertyCategoryLibrary ) )
                    {
                    // InternalCBDL.g:261:4: ( (lv_libraries_1_0= rulePropertyCategoryLibrary ) )
                    // InternalCBDL.g:262:5: (lv_libraries_1_0= rulePropertyCategoryLibrary )
                    {
                    // InternalCBDL.g:262:5: (lv_libraries_1_0= rulePropertyCategoryLibrary )
                    // InternalCBDL.g:263:6: lv_libraries_1_0= rulePropertyCategoryLibrary
                    {

                    						newCompositeNode(grammarAccess.getPropetyViewAccess().getLibrariesPropertyCategoryLibraryParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_libraries_1_0=rulePropertyCategoryLibrary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropetyViewRule());
                    						}
                    						add(
                    							current,
                    							"libraries",
                    							lv_libraries_1_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.PropertyCategoryLibrary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCBDL.g:281:4: ( (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) ) | ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) ) )*
                    {
                    // InternalCBDL.g:281:4: ( (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) ) | ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==11) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0==39) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCBDL.g:282:5: (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) )
                    	    {
                    	    // InternalCBDL.g:282:5: (otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) ) )
                    	    // InternalCBDL.g:283:6: otherlv_2= 'check' ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) )
                    	    {
                    	    otherlv_2=(Token)match(input,11,FOLLOW_5); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getPropetyViewAccess().getCheckKeyword_1_1_0_0());
                    	    					
                    	    // InternalCBDL.g:287:6: ( ( (lv_complianceProperties_3_0= ruleComplianceInstance ) ) | ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) ) )
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==38) ) {
                    	        alt4=1;
                    	    }
                    	    else if ( (LA4_0==34) ) {
                    	        alt4=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 4, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // InternalCBDL.g:288:7: ( (lv_complianceProperties_3_0= ruleComplianceInstance ) )
                    	            {
                    	            // InternalCBDL.g:288:7: ( (lv_complianceProperties_3_0= ruleComplianceInstance ) )
                    	            // InternalCBDL.g:289:8: (lv_complianceProperties_3_0= ruleComplianceInstance )
                    	            {
                    	            // InternalCBDL.g:289:8: (lv_complianceProperties_3_0= ruleComplianceInstance )
                    	            // InternalCBDL.g:290:9: lv_complianceProperties_3_0= ruleComplianceInstance
                    	            {

                    	            									newCompositeNode(grammarAccess.getPropetyViewAccess().getCompliancePropertiesComplianceInstanceParserRuleCall_1_1_0_1_0_0());
                    	            								
                    	            pushFollow(FOLLOW_6);
                    	            lv_complianceProperties_3_0=ruleComplianceInstance();

                    	            state._fsp--;


                    	            									if (current==null) {
                    	            										current = createModelElementForParent(grammarAccess.getPropetyViewRule());
                    	            									}
                    	            									add(
                    	            										current,
                    	            										"complianceProperties",
                    	            										lv_complianceProperties_3_0,
                    	            										"swarchitecture.compliance.security.cbdl.CBDL.ComplianceInstance");
                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalCBDL.g:308:7: ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) )
                    	            {
                    	            // InternalCBDL.g:308:7: ( (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance ) )
                    	            // InternalCBDL.g:309:8: (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance )
                    	            {
                    	            // InternalCBDL.g:309:8: (lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance )
                    	            // InternalCBDL.g:310:9: lv_overlayComplianceProperties_4_0= ruleOverlayComplianceInstance
                    	            {

                    	            									newCompositeNode(grammarAccess.getPropetyViewAccess().getOverlayCompliancePropertiesOverlayComplianceInstanceParserRuleCall_1_1_0_1_1_0());
                    	            								
                    	            pushFollow(FOLLOW_6);
                    	            lv_overlayComplianceProperties_4_0=ruleOverlayComplianceInstance();

                    	            state._fsp--;


                    	            									if (current==null) {
                    	            										current = createModelElementForParent(grammarAccess.getPropetyViewRule());
                    	            									}
                    	            									add(
                    	            										current,
                    	            										"overlayComplianceProperties",
                    	            										lv_overlayComplianceProperties_4_0,
                    	            										"swarchitecture.compliance.security.cbdl.CBDL.OverlayComplianceInstance");
                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCBDL.g:330:5: ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) )
                    	    {
                    	    // InternalCBDL.g:330:5: ( (lv_securityControlProperties_5_0= ruleSecurityControlInstance ) )
                    	    // InternalCBDL.g:331:6: (lv_securityControlProperties_5_0= ruleSecurityControlInstance )
                    	    {
                    	    // InternalCBDL.g:331:6: (lv_securityControlProperties_5_0= ruleSecurityControlInstance )
                    	    // InternalCBDL.g:332:7: lv_securityControlProperties_5_0= ruleSecurityControlInstance
                    	    {

                    	    							newCompositeNode(grammarAccess.getPropetyViewAccess().getSecurityControlPropertiesSecurityControlInstanceParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_securityControlProperties_5_0=ruleSecurityControlInstance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPropetyViewRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"securityControlProperties",
                    	    								lv_securityControlProperties_5_0,
                    	    								"swarchitecture.compliance.security.cbdl.CBDL.SecurityControlInstance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "rulePropetyView"


    // $ANTLR start "entryRuleImport"
    // InternalCBDL.g:355:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalCBDL.g:355:47: (iv_ruleImport= ruleImport EOF )
            // InternalCBDL.g:356:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCBDL.g:362:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= ruleEString ) ) otherlv_3= '>' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importURI_2_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:368:2: ( (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= ruleEString ) ) otherlv_3= '>' ) )
            // InternalCBDL.g:369:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= ruleEString ) ) otherlv_3= '>' )
            {
            // InternalCBDL.g:369:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= ruleEString ) ) otherlv_3= '>' )
            // InternalCBDL.g:370:3: otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= ruleEString ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLessThanSignKeyword_1());
            		
            // InternalCBDL.g:378:3: ( (lv_importURI_2_0= ruleEString ) )
            // InternalCBDL.g:379:4: (lv_importURI_2_0= ruleEString )
            {
            // InternalCBDL.g:379:4: (lv_importURI_2_0= ruleEString )
            // InternalCBDL.g:380:5: lv_importURI_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportURIEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_importURI_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importURI",
            						lv_importURI_2_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getImportAccess().getGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCBDL.g:405:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCBDL.g:405:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCBDL.g:406:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCBDL.g:412:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCBDL.g:418:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCBDL.g:419:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCBDL.g:419:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCBDL.g:420:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalCBDL.g:427:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCBDL.g:428:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleComponent"
    // InternalCBDL.g:445:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCBDL.g:445:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCBDL.g:446:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalCBDL.g:452:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_4= '{' ( (lv_uses_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_uses_7_0= rulePort ) ) )* otherlv_8= '}' )? otherlv_9= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_uses_5_0 = null;

        EObject lv_uses_7_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:458:2: ( (otherlv_0= 'component' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_4= '{' ( (lv_uses_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_uses_7_0= rulePort ) ) )* otherlv_8= '}' )? otherlv_9= ';' ) )
            // InternalCBDL.g:459:2: (otherlv_0= 'component' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_4= '{' ( (lv_uses_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_uses_7_0= rulePort ) ) )* otherlv_8= '}' )? otherlv_9= ';' )
            {
            // InternalCBDL.g:459:2: (otherlv_0= 'component' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_4= '{' ( (lv_uses_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_uses_7_0= rulePort ) ) )* otherlv_8= '}' )? otherlv_9= ';' )
            // InternalCBDL.g:460:3: otherlv_0= 'component' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'in' ( ( ruleQualifiedName ) ) )? (otherlv_4= '{' ( (lv_uses_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_uses_7_0= rulePort ) ) )* otherlv_8= '}' )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalCBDL.g:464:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBDL.g:465:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBDL.g:465:4: (lv_name_1_0= ruleEString )
            // InternalCBDL.g:466:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBDL.g:483:3: (otherlv_2= 'in' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCBDL.g:484:4: otherlv_2= 'in' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getInKeyword_2_0());
                    			
                    // InternalCBDL.g:488:4: ( ( ruleQualifiedName ) )
                    // InternalCBDL.g:489:5: ( ruleQualifiedName )
                    {
                    // InternalCBDL.g:489:5: ( ruleQualifiedName )
                    // InternalCBDL.g:490:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentAccess().getParentComponentCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCBDL.g:505:3: (otherlv_4= '{' ( (lv_uses_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_uses_7_0= rulePort ) ) )* otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCBDL.g:506:4: otherlv_4= '{' ( (lv_uses_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_uses_7_0= rulePort ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalCBDL.g:510:4: ( (lv_uses_5_0= rulePort ) )
                    // InternalCBDL.g:511:5: (lv_uses_5_0= rulePort )
                    {
                    // InternalCBDL.g:511:5: (lv_uses_5_0= rulePort )
                    // InternalCBDL.g:512:6: lv_uses_5_0= rulePort
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getUsesPortParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_uses_5_0=rulePort();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"uses",
                    							lv_uses_5_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.Port");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBDL.g:529:4: (otherlv_6= ',' ( (lv_uses_7_0= rulePort ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCBDL.g:530:5: otherlv_6= ',' ( (lv_uses_7_0= rulePort ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalCBDL.g:534:5: ( (lv_uses_7_0= rulePort ) )
                    	    // InternalCBDL.g:535:6: (lv_uses_7_0= rulePort )
                    	    {
                    	    // InternalCBDL.g:535:6: (lv_uses_7_0= rulePort )
                    	    // InternalCBDL.g:536:7: lv_uses_7_0= rulePort
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getUsesPortParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_uses_7_0=rulePort();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"uses",
                    	    								lv_uses_7_0,
                    	    								"swarchitecture.compliance.security.cbdl.CBDL.Port");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnetor"
    // InternalCBDL.g:567:1: entryRuleConnetor returns [EObject current=null] : iv_ruleConnetor= ruleConnetor EOF ;
    public final EObject entryRuleConnetor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnetor = null;


        try {
            // InternalCBDL.g:567:49: (iv_ruleConnetor= ruleConnetor EOF )
            // InternalCBDL.g:568:2: iv_ruleConnetor= ruleConnetor EOF
            {
             newCompositeNode(grammarAccess.getConnetorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnetor=ruleConnetor();

            state._fsp--;

             current =iv_ruleConnetor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnetor"


    // $ANTLR start "ruleConnetor"
    // InternalCBDL.g:574:1: ruleConnetor returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ;
    public final EObject ruleConnetor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:580:2: ( (otherlv_0= 'connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            // InternalCBDL.g:581:2: (otherlv_0= 'connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
            {
            // InternalCBDL.g:581:2: (otherlv_0= 'connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
            // InternalCBDL.g:582:3: otherlv_0= 'connector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '-' ( ( ruleQualifiedName ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConnetorAccess().getConnectorKeyword_0());
            		
            // InternalCBDL.g:586:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBDL.g:587:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBDL.g:587:4: (lv_name_1_0= ruleEString )
            // InternalCBDL.g:588:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnetorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnetorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getConnetorAccess().getColonKeyword_2());
            		
            // InternalCBDL.g:609:3: ( ( ruleQualifiedName ) )
            // InternalCBDL.g:610:4: ( ruleQualifiedName )
            {
            // InternalCBDL.g:610:4: ( ruleQualifiedName )
            // InternalCBDL.g:611:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnetorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnetorAccess().getConnectsPortCrossReference_3_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getConnetorAccess().getHyphenMinusKeyword_4());
            		
            // InternalCBDL.g:629:3: ( ( ruleQualifiedName ) )
            // InternalCBDL.g:630:4: ( ruleQualifiedName )
            {
            // InternalCBDL.g:630:4: ( ruleQualifiedName )
            // InternalCBDL.g:631:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnetorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnetorAccess().getConnectsPortCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConnetorAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleConnetor"


    // $ANTLR start "entryRuleInteractionNature"
    // InternalCBDL.g:653:1: entryRuleInteractionNature returns [EObject current=null] : iv_ruleInteractionNature= ruleInteractionNature EOF ;
    public final EObject entryRuleInteractionNature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionNature = null;


        try {
            // InternalCBDL.g:653:58: (iv_ruleInteractionNature= ruleInteractionNature EOF )
            // InternalCBDL.g:654:2: iv_ruleInteractionNature= ruleInteractionNature EOF
            {
             newCompositeNode(grammarAccess.getInteractionNatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteractionNature=ruleInteractionNature();

            state._fsp--;

             current =iv_ruleInteractionNature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInteractionNature"


    // $ANTLR start "ruleInteractionNature"
    // InternalCBDL.g:660:1: ruleInteractionNature returns [EObject current=null] : this_Data_0= ruleData ;
    public final EObject ruleInteractionNature() throws RecognitionException {
        EObject current = null;

        EObject this_Data_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:666:2: (this_Data_0= ruleData )
            // InternalCBDL.g:667:2: this_Data_0= ruleData
            {

            		newCompositeNode(grammarAccess.getInteractionNatureAccess().getDataParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Data_0=ruleData();

            state._fsp--;


            		current = this_Data_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleInteractionNature"


    // $ANTLR start "entryRuleEString"
    // InternalCBDL.g:678:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCBDL.g:678:47: (iv_ruleEString= ruleEString EOF )
            // InternalCBDL.g:679:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCBDL.g:685:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCBDL.g:691:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCBDL.g:692:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCBDL.g:692:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCBDL.g:693:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCBDL.g:701:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRulePort"
    // InternalCBDL.g:712:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalCBDL.g:712:45: (iv_rulePort= rulePort EOF )
            // InternalCBDL.g:713:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalCBDL.g:719:1: rulePort returns [EObject current=null] : (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_PortIn_0 = null;

        EObject this_PortOut_1 = null;



        	enterRule();

        try {
            // InternalCBDL.g:725:2: ( (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut ) )
            // InternalCBDL.g:726:2: (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut )
            {
            // InternalCBDL.g:726:2: (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==41) ) {
                    alt12=2;
                }
                else if ( (LA12_1==40) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_ID) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==40) ) {
                    alt12=1;
                }
                else if ( (LA12_2==41) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCBDL.g:727:3: this_PortIn_0= rulePortIn
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getPortInParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortIn_0=rulePortIn();

                    state._fsp--;


                    			current = this_PortIn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCBDL.g:736:3: this_PortOut_1= rulePortOut
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getPortOutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortOut_1=rulePortOut();

                    state._fsp--;


                    			current = this_PortOut_1;
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRulePortOut"
    // InternalCBDL.g:748:1: entryRulePortOut returns [EObject current=null] : iv_rulePortOut= rulePortOut EOF ;
    public final EObject entryRulePortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortOut = null;


        try {
            // InternalCBDL.g:748:48: (iv_rulePortOut= rulePortOut EOF )
            // InternalCBDL.g:749:2: iv_rulePortOut= rulePortOut EOF
            {
             newCompositeNode(grammarAccess.getPortOutRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortOut=rulePortOut();

            state._fsp--;

             current =iv_rulePortOut; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePortOut"


    // $ANTLR start "rulePortOut"
    // InternalCBDL.g:755:1: rulePortOut returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleOutput ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePortOut() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_kind_1_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:761:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleOutput ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalCBDL.g:762:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleOutput ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalCBDL.g:762:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleOutput ) ) ( ( ruleQualifiedName ) ) )
            // InternalCBDL.g:763:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleOutput ) ) ( ( ruleQualifiedName ) )
            {
            // InternalCBDL.g:763:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBDL.g:764:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBDL.g:764:4: (lv_name_0_0= ruleEString )
            // InternalCBDL.g:765:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPortOutAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortOutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBDL.g:782:3: ( (lv_kind_1_0= ruleOutput ) )
            // InternalCBDL.g:783:4: (lv_kind_1_0= ruleOutput )
            {
            // InternalCBDL.g:783:4: (lv_kind_1_0= ruleOutput )
            // InternalCBDL.g:784:5: lv_kind_1_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getPortOutAccess().getKindOutputEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_kind_1_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortOutRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_1_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBDL.g:801:3: ( ( ruleQualifiedName ) )
            // InternalCBDL.g:802:4: ( ruleQualifiedName )
            {
            // InternalCBDL.g:802:4: ( ruleQualifiedName )
            // InternalCBDL.g:803:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortOutRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPortOutAccess().getRealizesInteractionNatureCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "rulePortOut"


    // $ANTLR start "entryRulePortIn"
    // InternalCBDL.g:821:1: entryRulePortIn returns [EObject current=null] : iv_rulePortIn= rulePortIn EOF ;
    public final EObject entryRulePortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortIn = null;


        try {
            // InternalCBDL.g:821:47: (iv_rulePortIn= rulePortIn EOF )
            // InternalCBDL.g:822:2: iv_rulePortIn= rulePortIn EOF
            {
             newCompositeNode(grammarAccess.getPortInRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortIn=rulePortIn();

            state._fsp--;

             current =iv_rulePortIn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePortIn"


    // $ANTLR start "rulePortIn"
    // InternalCBDL.g:828:1: rulePortIn returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleInput ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePortIn() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_kind_1_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:834:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleInput ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalCBDL.g:835:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleInput ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalCBDL.g:835:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleInput ) ) ( ( ruleQualifiedName ) ) )
            // InternalCBDL.g:836:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_kind_1_0= ruleInput ) ) ( ( ruleQualifiedName ) )
            {
            // InternalCBDL.g:836:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBDL.g:837:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBDL.g:837:4: (lv_name_0_0= ruleEString )
            // InternalCBDL.g:838:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPortInAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortInRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBDL.g:855:3: ( (lv_kind_1_0= ruleInput ) )
            // InternalCBDL.g:856:4: (lv_kind_1_0= ruleInput )
            {
            // InternalCBDL.g:856:4: (lv_kind_1_0= ruleInput )
            // InternalCBDL.g:857:5: lv_kind_1_0= ruleInput
            {

            					newCompositeNode(grammarAccess.getPortInAccess().getKindInputEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_kind_1_0=ruleInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortInRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_1_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBDL.g:874:3: ( ( ruleQualifiedName ) )
            // InternalCBDL.g:875:4: ( ruleQualifiedName )
            {
            // InternalCBDL.g:875:4: ( ruleQualifiedName )
            // InternalCBDL.g:876:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortInRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPortInAccess().getRealizesInteractionNatureCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "rulePortIn"


    // $ANTLR start "entryRuleData"
    // InternalCBDL.g:894:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalCBDL.g:894:45: (iv_ruleData= ruleData EOF )
            // InternalCBDL.g:895:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalCBDL.g:901:1: ruleData returns [EObject current=null] : (otherlv_0= 'data' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ';' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:907:2: ( (otherlv_0= 'data' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ';' ) )
            // InternalCBDL.g:908:2: (otherlv_0= 'data' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ';' )
            {
            // InternalCBDL.g:908:2: (otherlv_0= 'data' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ';' )
            // InternalCBDL.g:909:3: otherlv_0= 'data' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDataKeyword_0());
            		
            // InternalCBDL.g:913:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBDL.g:914:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBDL.g:914:4: (lv_name_1_0= ruleEString )
            // InternalCBDL.g:915:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDataAccess().getColonKeyword_2());
            		
            // InternalCBDL.g:936:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalCBDL.g:937:4: (lv_type_3_0= ruleDataType )
            {
            // InternalCBDL.g:937:4: (lv_type_3_0= ruleDataType )
            // InternalCBDL.g:938:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getDataAccess().getTypeDataTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleDataType"
    // InternalCBDL.g:963:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalCBDL.g:963:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalCBDL.g:964:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalCBDL.g:970:1: ruleDataType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:976:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCBDL.g:977:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCBDL.g:977:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalCBDL.g:978:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCBDL.g:978:3: ()
            // InternalCBDL.g:979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            // InternalCBDL.g:985:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCBDL.g:986:4: (lv_name_1_0= ruleEString )
            {
            // InternalCBDL.g:986:4: (lv_name_1_0= ruleEString )
            // InternalCBDL.g:987:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRulePropertyCategoryLibrary"
    // InternalCBDL.g:1008:1: entryRulePropertyCategoryLibrary returns [EObject current=null] : iv_rulePropertyCategoryLibrary= rulePropertyCategoryLibrary EOF ;
    public final EObject entryRulePropertyCategoryLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCategoryLibrary = null;


        try {
            // InternalCBDL.g:1008:64: (iv_rulePropertyCategoryLibrary= rulePropertyCategoryLibrary EOF )
            // InternalCBDL.g:1009:2: iv_rulePropertyCategoryLibrary= rulePropertyCategoryLibrary EOF
            {
             newCompositeNode(grammarAccess.getPropertyCategoryLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyCategoryLibrary=rulePropertyCategoryLibrary();

            state._fsp--;

             current =iv_rulePropertyCategoryLibrary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyCategoryLibrary"


    // $ANTLR start "rulePropertyCategoryLibrary"
    // InternalCBDL.g:1015:1: rulePropertyCategoryLibrary returns [EObject current=null] : ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_categories_4_0= rulePropertyCategory ) )* otherlv_5= '}' ) ;
    public final EObject rulePropertyCategoryLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_categories_4_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:1021:2: ( ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_categories_4_0= rulePropertyCategory ) )* otherlv_5= '}' ) )
            // InternalCBDL.g:1022:2: ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_categories_4_0= rulePropertyCategory ) )* otherlv_5= '}' )
            {
            // InternalCBDL.g:1022:2: ( () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_categories_4_0= rulePropertyCategory ) )* otherlv_5= '}' )
            // InternalCBDL.g:1023:3: () otherlv_1= 'library' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_categories_4_0= rulePropertyCategory ) )* otherlv_5= '}'
            {
            // InternalCBDL.g:1023:3: ()
            // InternalCBDL.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyCategoryLibraryAccess().getPropertyCategoryLibraryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyCategoryLibraryAccess().getLibraryKeyword_1());
            		
            // InternalCBDL.g:1034:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCBDL.g:1035:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCBDL.g:1035:4: (lv_name_2_0= RULE_ID )
            // InternalCBDL.g:1036:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyCategoryLibraryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyCategoryLibraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyCategoryLibraryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBDL.g:1056:3: ( (lv_categories_4_0= rulePropertyCategory ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCBDL.g:1057:4: (lv_categories_4_0= rulePropertyCategory )
            	    {
            	    // InternalCBDL.g:1057:4: (lv_categories_4_0= rulePropertyCategory )
            	    // InternalCBDL.g:1058:5: lv_categories_4_0= rulePropertyCategory
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyCategoryLibraryAccess().getCategoriesPropertyCategoryParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_categories_4_0=rulePropertyCategory();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyCategoryLibraryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"categories",
            	    						lv_categories_4_0,
            	    						"swarchitecture.compliance.security.cbdl.CBDL.PropertyCategory");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyCategoryLibraryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyCategoryLibrary"


    // $ANTLR start "entryRulePropertyCategory"
    // InternalCBDL.g:1083:1: entryRulePropertyCategory returns [EObject current=null] : iv_rulePropertyCategory= rulePropertyCategory EOF ;
    public final EObject entryRulePropertyCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCategory = null;


        try {
            // InternalCBDL.g:1083:57: (iv_rulePropertyCategory= rulePropertyCategory EOF )
            // InternalCBDL.g:1084:2: iv_rulePropertyCategory= rulePropertyCategory EOF
            {
             newCompositeNode(grammarAccess.getPropertyCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyCategory=rulePropertyCategory();

            state._fsp--;

             current =iv_rulePropertyCategory; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyCategory"


    // $ANTLR start "rulePropertyCategory"
    // InternalCBDL.g:1090:1: rulePropertyCategory returns [EObject current=null] : ( () otherlv_1= 'category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= rulePropertyDefinition ) )* otherlv_5= '}' ) ;
    public final EObject rulePropertyCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_4_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:1096:2: ( ( () otherlv_1= 'category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= rulePropertyDefinition ) )* otherlv_5= '}' ) )
            // InternalCBDL.g:1097:2: ( () otherlv_1= 'category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= rulePropertyDefinition ) )* otherlv_5= '}' )
            {
            // InternalCBDL.g:1097:2: ( () otherlv_1= 'category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= rulePropertyDefinition ) )* otherlv_5= '}' )
            // InternalCBDL.g:1098:3: () otherlv_1= 'category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= rulePropertyDefinition ) )* otherlv_5= '}'
            {
            // InternalCBDL.g:1098:3: ()
            // InternalCBDL.g:1099:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyCategoryAccess().getPropertyCategoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyCategoryAccess().getCategoryKeyword_1());
            		
            // InternalCBDL.g:1109:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCBDL.g:1110:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCBDL.g:1110:4: (lv_name_2_0= RULE_ID )
            // InternalCBDL.g:1111:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyCategoryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyCategoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCBDL.g:1131:3: ( (lv_properties_4_0= rulePropertyDefinition ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28||LA14_0==34||LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCBDL.g:1132:4: (lv_properties_4_0= rulePropertyDefinition )
            	    {
            	    // InternalCBDL.g:1132:4: (lv_properties_4_0= rulePropertyDefinition )
            	    // InternalCBDL.g:1133:5: lv_properties_4_0= rulePropertyDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyCategoryAccess().getPropertiesPropertyDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_properties_4_0=rulePropertyDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyCategoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_4_0,
            	    						"swarchitecture.compliance.security.cbdl.CBDL.PropertyDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyCategoryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePropertyCategory"


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalCBDL.g:1158:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalCBDL.g:1158:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalCBDL.g:1159:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // InternalCBDL.g:1165:1: rulePropertyDefinition returns [EObject current=null] : (this_ComplianceDefinition_0= ruleComplianceDefinition | this_SecurityControlDefintion_1= ruleSecurityControlDefintion | this_OverlayComplianceDeffinition_2= ruleOverlayComplianceDeffinition ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ComplianceDefinition_0 = null;

        EObject this_SecurityControlDefintion_1 = null;

        EObject this_OverlayComplianceDeffinition_2 = null;



        	enterRule();

        try {
            // InternalCBDL.g:1171:2: ( (this_ComplianceDefinition_0= ruleComplianceDefinition | this_SecurityControlDefintion_1= ruleSecurityControlDefintion | this_OverlayComplianceDeffinition_2= ruleOverlayComplianceDeffinition ) )
            // InternalCBDL.g:1172:2: (this_ComplianceDefinition_0= ruleComplianceDefinition | this_SecurityControlDefintion_1= ruleSecurityControlDefintion | this_OverlayComplianceDeffinition_2= ruleOverlayComplianceDeffinition )
            {
            // InternalCBDL.g:1172:2: (this_ComplianceDefinition_0= ruleComplianceDefinition | this_SecurityControlDefintion_1= ruleSecurityControlDefintion | this_OverlayComplianceDeffinition_2= ruleOverlayComplianceDeffinition )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalCBDL.g:1173:3: this_ComplianceDefinition_0= ruleComplianceDefinition
                    {

                    			newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getComplianceDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplianceDefinition_0=ruleComplianceDefinition();

                    state._fsp--;


                    			current = this_ComplianceDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCBDL.g:1182:3: this_SecurityControlDefintion_1= ruleSecurityControlDefintion
                    {

                    			newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getSecurityControlDefintionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SecurityControlDefintion_1=ruleSecurityControlDefintion();

                    state._fsp--;


                    			current = this_SecurityControlDefintion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCBDL.g:1191:3: this_OverlayComplianceDeffinition_2= ruleOverlayComplianceDeffinition
                    {

                    			newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getOverlayComplianceDeffinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OverlayComplianceDeffinition_2=ruleOverlayComplianceDeffinition();

                    state._fsp--;


                    			current = this_OverlayComplianceDeffinition_2;
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleComplianceDefinition"
    // InternalCBDL.g:1203:1: entryRuleComplianceDefinition returns [EObject current=null] : iv_ruleComplianceDefinition= ruleComplianceDefinition EOF ;
    public final EObject entryRuleComplianceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplianceDefinition = null;


        try {
            // InternalCBDL.g:1203:61: (iv_ruleComplianceDefinition= ruleComplianceDefinition EOF )
            // InternalCBDL.g:1204:2: iv_ruleComplianceDefinition= ruleComplianceDefinition EOF
            {
             newCompositeNode(grammarAccess.getComplianceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplianceDefinition=ruleComplianceDefinition();

            state._fsp--;

             current =iv_ruleComplianceDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplianceDefinition"


    // $ANTLR start "ruleComplianceDefinition"
    // InternalCBDL.g:1210:1: ruleComplianceDefinition returns [EObject current=null] : (otherlv_0= 'compliance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= '}' ) ;
    public final EObject ruleComplianceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_definitionParameters_3_0 = null;

        EObject lv_definitionParameters_5_0 = null;

        EObject lv_standardRef_10_0 = null;

        EObject lv_standardRef_12_0 = null;

        AntlrDatatypeRuleToken lv_description_15_0 = null;

        AntlrDatatypeRuleToken lv_alloy_17_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:1216:2: ( (otherlv_0= 'compliance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= '}' ) )
            // InternalCBDL.g:1217:2: (otherlv_0= 'compliance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= '}' )
            {
            // InternalCBDL.g:1217:2: (otherlv_0= 'compliance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= '}' )
            // InternalCBDL.g:1218:3: otherlv_0= 'compliance' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComplianceDefinitionAccess().getComplianceKeyword_0());
            		
            // InternalCBDL.g:1222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCBDL.g:1223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCBDL.g:1223:4: (lv_name_1_0= RULE_ID )
            // InternalCBDL.g:1224:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComplianceDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplianceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCBDL.g:1240:3: (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCBDL.g:1241:4: otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getComplianceDefinitionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalCBDL.g:1245:4: ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) )
                    // InternalCBDL.g:1246:5: (lv_definitionParameters_3_0= ruleDefinitionParameter )
                    {
                    // InternalCBDL.g:1246:5: (lv_definitionParameters_3_0= ruleDefinitionParameter )
                    // InternalCBDL.g:1247:6: lv_definitionParameters_3_0= ruleDefinitionParameter
                    {

                    						newCompositeNode(grammarAccess.getComplianceDefinitionAccess().getDefinitionParametersDefinitionParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_definitionParameters_3_0=ruleDefinitionParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplianceDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"definitionParameters",
                    							lv_definitionParameters_3_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.DefinitionParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBDL.g:1264:4: (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCBDL.g:1265:5: otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_24); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getComplianceDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalCBDL.g:1269:5: ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) )
                    	    // InternalCBDL.g:1270:6: (lv_definitionParameters_5_0= ruleDefinitionParameter )
                    	    {
                    	    // InternalCBDL.g:1270:6: (lv_definitionParameters_5_0= ruleDefinitionParameter )
                    	    // InternalCBDL.g:1271:7: lv_definitionParameters_5_0= ruleDefinitionParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplianceDefinitionAccess().getDefinitionParametersDefinitionParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_definitionParameters_5_0=ruleDefinitionParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplianceDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"definitionParameters",
                    	    								lv_definitionParameters_5_0,
                    	    								"swarchitecture.compliance.security.cbdl.CBDL.DefinitionParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getComplianceDefinitionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getComplianceDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_8=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getComplianceDefinitionAccess().getReferenceKeyword_4());
            		
            otherlv_9=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_9, grammarAccess.getComplianceDefinitionAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCBDL.g:1306:3: ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCBDL.g:1307:4: ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )*
                    {
                    // InternalCBDL.g:1307:4: ( (lv_standardRef_10_0= ruleStandardRef ) )
                    // InternalCBDL.g:1308:5: (lv_standardRef_10_0= ruleStandardRef )
                    {
                    // InternalCBDL.g:1308:5: (lv_standardRef_10_0= ruleStandardRef )
                    // InternalCBDL.g:1309:6: lv_standardRef_10_0= ruleStandardRef
                    {

                    						newCompositeNode(grammarAccess.getComplianceDefinitionAccess().getStandardRefStandardRefParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_standardRef_10_0=ruleStandardRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplianceDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"standardRef",
                    							lv_standardRef_10_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.StandardRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBDL.g:1326:4: (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==19) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCBDL.g:1327:5: otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getComplianceDefinitionAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalCBDL.g:1331:5: ( (lv_standardRef_12_0= ruleStandardRef ) )
                    	    // InternalCBDL.g:1332:6: (lv_standardRef_12_0= ruleStandardRef )
                    	    {
                    	    // InternalCBDL.g:1332:6: (lv_standardRef_12_0= ruleStandardRef )
                    	    // InternalCBDL.g:1333:7: lv_standardRef_12_0= ruleStandardRef
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplianceDefinitionAccess().getStandardRefStandardRefParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_standardRef_12_0=ruleStandardRef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplianceDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"standardRef",
                    	    								lv_standardRef_12_0,
                    	    								"swarchitecture.compliance.security.cbdl.CBDL.StandardRef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_13, grammarAccess.getComplianceDefinitionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_14=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_14, grammarAccess.getComplianceDefinitionAccess().getCommentKeyword_8());
            		
            // InternalCBDL.g:1360:3: ( (lv_description_15_0= ruleEString ) )
            // InternalCBDL.g:1361:4: (lv_description_15_0= ruleEString )
            {
            // InternalCBDL.g:1361:4: (lv_description_15_0= ruleEString )
            // InternalCBDL.g:1362:5: lv_description_15_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplianceDefinitionAccess().getDescriptionEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_30);
            lv_description_15_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplianceDefinitionRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_15_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_16, grammarAccess.getComplianceDefinitionAccess().getAlloyKeyword_10());
            		
            // InternalCBDL.g:1383:3: ( (lv_alloy_17_0= ruleEString ) )
            // InternalCBDL.g:1384:4: (lv_alloy_17_0= ruleEString )
            {
            // InternalCBDL.g:1384:4: (lv_alloy_17_0= ruleEString )
            // InternalCBDL.g:1385:5: lv_alloy_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplianceDefinitionAccess().getAlloyEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_31);
            lv_alloy_17_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplianceDefinitionRule());
            					}
            					set(
            						current,
            						"alloy",
            						lv_alloy_17_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getComplianceDefinitionAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleComplianceDefinition"


    // $ANTLR start "entryRuleOverlayComplianceDeffinition"
    // InternalCBDL.g:1410:1: entryRuleOverlayComplianceDeffinition returns [EObject current=null] : iv_ruleOverlayComplianceDeffinition= ruleOverlayComplianceDeffinition EOF ;
    public final EObject entryRuleOverlayComplianceDeffinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverlayComplianceDeffinition = null;


        try {
            // InternalCBDL.g:1410:69: (iv_ruleOverlayComplianceDeffinition= ruleOverlayComplianceDeffinition EOF )
            // InternalCBDL.g:1411:2: iv_ruleOverlayComplianceDeffinition= ruleOverlayComplianceDeffinition EOF
            {
             newCompositeNode(grammarAccess.getOverlayComplianceDeffinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOverlayComplianceDeffinition=ruleOverlayComplianceDeffinition();

            state._fsp--;

             current =iv_ruleOverlayComplianceDeffinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOverlayComplianceDeffinition"


    // $ANTLR start "ruleOverlayComplianceDeffinition"
    // InternalCBDL.g:1417:1: ruleOverlayComplianceDeffinition returns [EObject current=null] : (otherlv_0= 'overlay' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'instance' otherlv_9= '(' ( ( (lv_instance_10_0= ruleOverlayInstance ) ) (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )* otherlv_13= ')' )? otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= '}' )? ) ;
    public final EObject ruleOverlayComplianceDeffinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_definitionParameters_3_0 = null;

        EObject lv_definitionParameters_5_0 = null;

        EObject lv_instance_10_0 = null;

        EObject lv_instance_12_0 = null;

        AntlrDatatypeRuleToken lv_description_15_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:1423:2: ( (otherlv_0= 'overlay' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'instance' otherlv_9= '(' ( ( (lv_instance_10_0= ruleOverlayInstance ) ) (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )* otherlv_13= ')' )? otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= '}' )? ) )
            // InternalCBDL.g:1424:2: (otherlv_0= 'overlay' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'instance' otherlv_9= '(' ( ( (lv_instance_10_0= ruleOverlayInstance ) ) (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )* otherlv_13= ')' )? otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= '}' )? )
            {
            // InternalCBDL.g:1424:2: (otherlv_0= 'overlay' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'instance' otherlv_9= '(' ( ( (lv_instance_10_0= ruleOverlayInstance ) ) (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )* otherlv_13= ')' )? otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= '}' )? )
            // InternalCBDL.g:1425:3: otherlv_0= 'overlay' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'instance' otherlv_9= '(' ( ( (lv_instance_10_0= ruleOverlayInstance ) ) (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )* otherlv_13= ')' )? otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getOverlayComplianceDeffinitionAccess().getOverlayKeyword_0());
            		
            // InternalCBDL.g:1429:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCBDL.g:1430:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCBDL.g:1430:4: (lv_name_1_0= RULE_ID )
            // InternalCBDL.g:1431:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOverlayComplianceDeffinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOverlayComplianceDeffinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCBDL.g:1447:3: (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCBDL.g:1448:4: otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getOverlayComplianceDeffinitionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalCBDL.g:1452:4: ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) )
                    // InternalCBDL.g:1453:5: (lv_definitionParameters_3_0= ruleDefinitionParameter )
                    {
                    // InternalCBDL.g:1453:5: (lv_definitionParameters_3_0= ruleDefinitionParameter )
                    // InternalCBDL.g:1454:6: lv_definitionParameters_3_0= ruleDefinitionParameter
                    {

                    						newCompositeNode(grammarAccess.getOverlayComplianceDeffinitionAccess().getDefinitionParametersDefinitionParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_definitionParameters_3_0=ruleDefinitionParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOverlayComplianceDeffinitionRule());
                    						}
                    						add(
                    							current,
                    							"definitionParameters",
                    							lv_definitionParameters_3_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.DefinitionParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBDL.g:1471:4: (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==19) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalCBDL.g:1472:5: otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_24); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOverlayComplianceDeffinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalCBDL.g:1476:5: ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) )
                    	    // InternalCBDL.g:1477:6: (lv_definitionParameters_5_0= ruleDefinitionParameter )
                    	    {
                    	    // InternalCBDL.g:1477:6: (lv_definitionParameters_5_0= ruleDefinitionParameter )
                    	    // InternalCBDL.g:1478:7: lv_definitionParameters_5_0= ruleDefinitionParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOverlayComplianceDeffinitionAccess().getDefinitionParametersDefinitionParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_definitionParameters_5_0=ruleDefinitionParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOverlayComplianceDeffinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"definitionParameters",
                    	    								lv_definitionParameters_5_0,
                    	    								"swarchitecture.compliance.security.cbdl.CBDL.DefinitionParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getOverlayComplianceDeffinitionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalCBDL.g:1501:3: (otherlv_7= '{' otherlv_8= 'instance' otherlv_9= '(' ( ( (lv_instance_10_0= ruleOverlayInstance ) ) (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )* otherlv_13= ')' )? otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCBDL.g:1502:4: otherlv_7= '{' otherlv_8= 'instance' otherlv_9= '(' ( ( (lv_instance_10_0= ruleOverlayInstance ) ) (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )* otherlv_13= ')' )? otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= '}'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_34); 

                    				newLeafNode(otherlv_7, grammarAccess.getOverlayComplianceDeffinitionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,35,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getOverlayComplianceDeffinitionAccess().getInstanceKeyword_3_1());
                    			
                    otherlv_9=(Token)match(input,29,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getOverlayComplianceDeffinitionAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalCBDL.g:1514:4: ( ( (lv_instance_10_0= ruleOverlayInstance ) ) (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )* otherlv_13= ')' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalCBDL.g:1515:5: ( (lv_instance_10_0= ruleOverlayInstance ) ) (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )* otherlv_13= ')'
                            {
                            // InternalCBDL.g:1515:5: ( (lv_instance_10_0= ruleOverlayInstance ) )
                            // InternalCBDL.g:1516:6: (lv_instance_10_0= ruleOverlayInstance )
                            {
                            // InternalCBDL.g:1516:6: (lv_instance_10_0= ruleOverlayInstance )
                            // InternalCBDL.g:1517:7: lv_instance_10_0= ruleOverlayInstance
                            {

                            							newCompositeNode(grammarAccess.getOverlayComplianceDeffinitionAccess().getInstanceOverlayInstanceParserRuleCall_3_3_0_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_instance_10_0=ruleOverlayInstance();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOverlayComplianceDeffinitionRule());
                            							}
                            							add(
                            								current,
                            								"instance",
                            								lv_instance_10_0,
                            								"swarchitecture.compliance.security.cbdl.CBDL.OverlayInstance");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalCBDL.g:1534:5: (otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==19) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalCBDL.g:1535:6: otherlv_11= ',' ( (lv_instance_12_0= ruleOverlayInstance ) )
                            	    {
                            	    otherlv_11=(Token)match(input,19,FOLLOW_11); 

                            	    						newLeafNode(otherlv_11, grammarAccess.getOverlayComplianceDeffinitionAccess().getCommaKeyword_3_3_1_0());
                            	    					
                            	    // InternalCBDL.g:1539:6: ( (lv_instance_12_0= ruleOverlayInstance ) )
                            	    // InternalCBDL.g:1540:7: (lv_instance_12_0= ruleOverlayInstance )
                            	    {
                            	    // InternalCBDL.g:1540:7: (lv_instance_12_0= ruleOverlayInstance )
                            	    // InternalCBDL.g:1541:8: lv_instance_12_0= ruleOverlayInstance
                            	    {

                            	    								newCompositeNode(grammarAccess.getOverlayComplianceDeffinitionAccess().getInstanceOverlayInstanceParserRuleCall_3_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    lv_instance_12_0=ruleOverlayInstance();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getOverlayComplianceDeffinitionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"instance",
                            	    									lv_instance_12_0,
                            	    									"swarchitecture.compliance.security.cbdl.CBDL.OverlayInstance");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,30,FOLLOW_29); 

                            					newLeafNode(otherlv_13, grammarAccess.getOverlayComplianceDeffinitionAccess().getRightParenthesisKeyword_3_3_2());
                            				

                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getOverlayComplianceDeffinitionAccess().getCommentKeyword_3_4());
                    			
                    // InternalCBDL.g:1568:4: ( (lv_description_15_0= ruleEString ) )
                    // InternalCBDL.g:1569:5: (lv_description_15_0= ruleEString )
                    {
                    // InternalCBDL.g:1569:5: (lv_description_15_0= ruleEString )
                    // InternalCBDL.g:1570:6: lv_description_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOverlayComplianceDeffinitionAccess().getDescriptionEStringParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_description_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOverlayComplianceDeffinitionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_15_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getOverlayComplianceDeffinitionAccess().getRightCurlyBracketKeyword_3_6());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleOverlayComplianceDeffinition"


    // $ANTLR start "entryRuleOverlayInstance"
    // InternalCBDL.g:1596:1: entryRuleOverlayInstance returns [EObject current=null] : iv_ruleOverlayInstance= ruleOverlayInstance EOF ;
    public final EObject entryRuleOverlayInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverlayInstance = null;


        try {
            // InternalCBDL.g:1596:56: (iv_ruleOverlayInstance= ruleOverlayInstance EOF )
            // InternalCBDL.g:1597:2: iv_ruleOverlayInstance= ruleOverlayInstance EOF
            {
             newCompositeNode(grammarAccess.getOverlayInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOverlayInstance=ruleOverlayInstance();

            state._fsp--;

             current =iv_ruleOverlayInstance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOverlayInstance"


    // $ANTLR start "ruleOverlayInstance"
    // InternalCBDL.g:1603:1: ruleOverlayInstance returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEString ) )* )? ) otherlv_5= ')' ) ;
    public final EObject ruleOverlayInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_parameters_2_0 = null;

        AntlrDatatypeRuleToken lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:1609:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEString ) )* )? ) otherlv_5= ')' ) )
            // InternalCBDL.g:1610:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEString ) )* )? ) otherlv_5= ')' )
            {
            // InternalCBDL.g:1610:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEString ) )* )? ) otherlv_5= ')' )
            // InternalCBDL.g:1611:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEString ) )* )? ) otherlv_5= ')'
            {
            // InternalCBDL.g:1611:3: ( ( ruleQualifiedName ) )
            // InternalCBDL.g:1612:4: ( ruleQualifiedName )
            {
            // InternalCBDL.g:1612:4: ( ruleQualifiedName )
            // InternalCBDL.g:1613:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOverlayInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOverlayInstanceAccess().getPropertyDefinitionPropertyDefinitionCrossReference_0_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOverlayInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCBDL.g:1631:3: ( ( (lv_parameters_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEString ) )* )? )
            // InternalCBDL.g:1632:4: ( (lv_parameters_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEString ) )* )?
            {
            // InternalCBDL.g:1632:4: ( (lv_parameters_2_0= ruleEString ) )
            // InternalCBDL.g:1633:5: (lv_parameters_2_0= ruleEString )
            {
            // InternalCBDL.g:1633:5: (lv_parameters_2_0= ruleEString )
            // InternalCBDL.g:1634:6: lv_parameters_2_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getOverlayInstanceAccess().getParametersEStringParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_25);
            lv_parameters_2_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getOverlayInstanceRule());
            						}
            						add(
            							current,
            							"parameters",
            							lv_parameters_2_0,
            							"swarchitecture.compliance.security.cbdl.CBDL.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalCBDL.g:1651:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleEString ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCBDL.g:1652:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleEString ) )*
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_28); 

                    					newLeafNode(otherlv_3, grammarAccess.getOverlayInstanceAccess().getCommaKeyword_2_1_0());
                    				
                    // InternalCBDL.g:1656:5: ( (lv_parameters_4_0= ruleEString ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCBDL.g:1657:6: (lv_parameters_4_0= ruleEString )
                    	    {
                    	    // InternalCBDL.g:1657:6: (lv_parameters_4_0= ruleEString )
                    	    // InternalCBDL.g:1658:7: lv_parameters_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getOverlayInstanceAccess().getParametersEStringParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_parameters_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOverlayInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"swarchitecture.compliance.security.cbdl.CBDL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOverlayInstanceAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleOverlayInstance"


    // $ANTLR start "entryRuleStandardRef"
    // InternalCBDL.g:1685:1: entryRuleStandardRef returns [EObject current=null] : iv_ruleStandardRef= ruleStandardRef EOF ;
    public final EObject entryRuleStandardRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardRef = null;


        try {
            // InternalCBDL.g:1685:52: (iv_ruleStandardRef= ruleStandardRef EOF )
            // InternalCBDL.g:1686:2: iv_ruleStandardRef= ruleStandardRef EOF
            {
             newCompositeNode(grammarAccess.getStandardRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStandardRef=ruleStandardRef();

            state._fsp--;

             current =iv_ruleStandardRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStandardRef"


    // $ANTLR start "ruleStandardRef"
    // InternalCBDL.g:1692:1: ruleStandardRef returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_url_2_0= ruleEString ) ) )? ) ;
    public final EObject ruleStandardRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_url_2_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:1698:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_url_2_0= ruleEString ) ) )? ) )
            // InternalCBDL.g:1699:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_url_2_0= ruleEString ) ) )? )
            {
            // InternalCBDL.g:1699:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_url_2_0= ruleEString ) ) )? )
            // InternalCBDL.g:1700:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_url_2_0= ruleEString ) ) )?
            {
            // InternalCBDL.g:1700:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCBDL.g:1701:4: (lv_name_0_0= ruleEString )
            {
            // InternalCBDL.g:1701:4: (lv_name_0_0= ruleEString )
            // InternalCBDL.g:1702:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStandardRefAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStandardRefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBDL.g:1719:3: (otherlv_1= ':' ( (lv_url_2_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCBDL.g:1720:4: otherlv_1= ':' ( (lv_url_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getStandardRefAccess().getColonKeyword_1_0());
                    			
                    // InternalCBDL.g:1724:4: ( (lv_url_2_0= ruleEString ) )
                    // InternalCBDL.g:1725:5: (lv_url_2_0= ruleEString )
                    {
                    // InternalCBDL.g:1725:5: (lv_url_2_0= ruleEString )
                    // InternalCBDL.g:1726:6: lv_url_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStandardRefAccess().getUrlEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_url_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStandardRefRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_2_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleStandardRef"


    // $ANTLR start "entryRuleSecurityControlDefintion"
    // InternalCBDL.g:1748:1: entryRuleSecurityControlDefintion returns [EObject current=null] : iv_ruleSecurityControlDefintion= ruleSecurityControlDefintion EOF ;
    public final EObject entryRuleSecurityControlDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityControlDefintion = null;


        try {
            // InternalCBDL.g:1748:65: (iv_ruleSecurityControlDefintion= ruleSecurityControlDefintion EOF )
            // InternalCBDL.g:1749:2: iv_ruleSecurityControlDefintion= ruleSecurityControlDefintion EOF
            {
             newCompositeNode(grammarAccess.getSecurityControlDefintionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecurityControlDefintion=ruleSecurityControlDefintion();

            state._fsp--;

             current =iv_ruleSecurityControlDefintion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSecurityControlDefintion"


    // $ANTLR start "ruleSecurityControlDefintion"
    // InternalCBDL.g:1755:1: ruleSecurityControlDefintion returns [EObject current=null] : (otherlv_0= 'securityControl' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= 'enforce' otherlv_19= '(' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ')' otherlv_24= '}' )? ) ;
    public final EObject ruleSecurityControlDefintion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_definitionParameters_3_0 = null;

        EObject lv_definitionParameters_5_0 = null;

        EObject lv_standardRef_10_0 = null;

        EObject lv_standardRef_12_0 = null;

        AntlrDatatypeRuleToken lv_description_15_0 = null;

        AntlrDatatypeRuleToken lv_alloy_17_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:1761:2: ( (otherlv_0= 'securityControl' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= 'enforce' otherlv_19= '(' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ')' otherlv_24= '}' )? ) )
            // InternalCBDL.g:1762:2: (otherlv_0= 'securityControl' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= 'enforce' otherlv_19= '(' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ')' otherlv_24= '}' )? )
            {
            // InternalCBDL.g:1762:2: (otherlv_0= 'securityControl' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= 'enforce' otherlv_19= '(' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ')' otherlv_24= '}' )? )
            // InternalCBDL.g:1763:3: otherlv_0= 'securityControl' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )? (otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= 'enforce' otherlv_19= '(' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ')' otherlv_24= '}' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSecurityControlDefintionAccess().getSecurityControlKeyword_0());
            		
            // InternalCBDL.g:1767:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCBDL.g:1768:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCBDL.g:1768:4: (lv_name_1_0= RULE_ID )
            // InternalCBDL.g:1769:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSecurityControlDefintionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecurityControlDefintionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCBDL.g:1785:3: (otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCBDL.g:1786:4: otherlv_2= '(' ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) ) (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getSecurityControlDefintionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalCBDL.g:1790:4: ( (lv_definitionParameters_3_0= ruleDefinitionParameter ) )
                    // InternalCBDL.g:1791:5: (lv_definitionParameters_3_0= ruleDefinitionParameter )
                    {
                    // InternalCBDL.g:1791:5: (lv_definitionParameters_3_0= ruleDefinitionParameter )
                    // InternalCBDL.g:1792:6: lv_definitionParameters_3_0= ruleDefinitionParameter
                    {

                    						newCompositeNode(grammarAccess.getSecurityControlDefintionAccess().getDefinitionParametersDefinitionParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_definitionParameters_3_0=ruleDefinitionParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecurityControlDefintionRule());
                    						}
                    						add(
                    							current,
                    							"definitionParameters",
                    							lv_definitionParameters_3_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.DefinitionParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBDL.g:1809:4: (otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==19) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalCBDL.g:1810:5: otherlv_4= ',' ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_24); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSecurityControlDefintionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalCBDL.g:1814:5: ( (lv_definitionParameters_5_0= ruleDefinitionParameter ) )
                    	    // InternalCBDL.g:1815:6: (lv_definitionParameters_5_0= ruleDefinitionParameter )
                    	    {
                    	    // InternalCBDL.g:1815:6: (lv_definitionParameters_5_0= ruleDefinitionParameter )
                    	    // InternalCBDL.g:1816:7: lv_definitionParameters_5_0= ruleDefinitionParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSecurityControlDefintionAccess().getDefinitionParametersDefinitionParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_definitionParameters_5_0=ruleDefinitionParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSecurityControlDefintionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"definitionParameters",
                    	    								lv_definitionParameters_5_0,
                    	    								"swarchitecture.compliance.security.cbdl.CBDL.DefinitionParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getSecurityControlDefintionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalCBDL.g:1839:3: (otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= 'enforce' otherlv_19= '(' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ')' otherlv_24= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCBDL.g:1840:4: otherlv_7= '{' otherlv_8= 'reference' otherlv_9= '(' ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )? otherlv_13= ')' otherlv_14= 'comment' ( (lv_description_15_0= ruleEString ) ) otherlv_16= 'alloy' ( (lv_alloy_17_0= ruleEString ) ) otherlv_18= 'enforce' otherlv_19= '(' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ')' otherlv_24= '}'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getSecurityControlDefintionAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getSecurityControlDefintionAccess().getReferenceKeyword_3_1());
                    			
                    otherlv_9=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getSecurityControlDefintionAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalCBDL.g:1852:4: ( ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalCBDL.g:1853:5: ( (lv_standardRef_10_0= ruleStandardRef ) ) (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )*
                            {
                            // InternalCBDL.g:1853:5: ( (lv_standardRef_10_0= ruleStandardRef ) )
                            // InternalCBDL.g:1854:6: (lv_standardRef_10_0= ruleStandardRef )
                            {
                            // InternalCBDL.g:1854:6: (lv_standardRef_10_0= ruleStandardRef )
                            // InternalCBDL.g:1855:7: lv_standardRef_10_0= ruleStandardRef
                            {

                            							newCompositeNode(grammarAccess.getSecurityControlDefintionAccess().getStandardRefStandardRefParserRuleCall_3_3_0_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_standardRef_10_0=ruleStandardRef();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSecurityControlDefintionRule());
                            							}
                            							add(
                            								current,
                            								"standardRef",
                            								lv_standardRef_10_0,
                            								"swarchitecture.compliance.security.cbdl.CBDL.StandardRef");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalCBDL.g:1872:5: (otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==19) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalCBDL.g:1873:6: otherlv_11= ',' ( (lv_standardRef_12_0= ruleStandardRef ) )
                            	    {
                            	    otherlv_11=(Token)match(input,19,FOLLOW_8); 

                            	    						newLeafNode(otherlv_11, grammarAccess.getSecurityControlDefintionAccess().getCommaKeyword_3_3_1_0());
                            	    					
                            	    // InternalCBDL.g:1877:6: ( (lv_standardRef_12_0= ruleStandardRef ) )
                            	    // InternalCBDL.g:1878:7: (lv_standardRef_12_0= ruleStandardRef )
                            	    {
                            	    // InternalCBDL.g:1878:7: (lv_standardRef_12_0= ruleStandardRef )
                            	    // InternalCBDL.g:1879:8: lv_standardRef_12_0= ruleStandardRef
                            	    {

                            	    								newCompositeNode(grammarAccess.getSecurityControlDefintionAccess().getStandardRefStandardRefParserRuleCall_3_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    lv_standardRef_12_0=ruleStandardRef();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSecurityControlDefintionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"standardRef",
                            	    									lv_standardRef_12_0,
                            	    									"swarchitecture.compliance.security.cbdl.CBDL.StandardRef");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,30,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getSecurityControlDefintionAccess().getRightParenthesisKeyword_3_4());
                    			
                    otherlv_14=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getSecurityControlDefintionAccess().getCommentKeyword_3_5());
                    			
                    // InternalCBDL.g:1906:4: ( (lv_description_15_0= ruleEString ) )
                    // InternalCBDL.g:1907:5: (lv_description_15_0= ruleEString )
                    {
                    // InternalCBDL.g:1907:5: (lv_description_15_0= ruleEString )
                    // InternalCBDL.g:1908:6: lv_description_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSecurityControlDefintionAccess().getDescriptionEStringParserRuleCall_3_6_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_description_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecurityControlDefintionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_15_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getSecurityControlDefintionAccess().getAlloyKeyword_3_7());
                    			
                    // InternalCBDL.g:1929:4: ( (lv_alloy_17_0= ruleEString ) )
                    // InternalCBDL.g:1930:5: (lv_alloy_17_0= ruleEString )
                    {
                    // InternalCBDL.g:1930:5: (lv_alloy_17_0= ruleEString )
                    // InternalCBDL.g:1931:6: lv_alloy_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSecurityControlDefintionAccess().getAlloyEStringParserRuleCall_3_8_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_alloy_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecurityControlDefintionRule());
                    						}
                    						set(
                    							current,
                    							"alloy",
                    							lv_alloy_17_0,
                    							"swarchitecture.compliance.security.cbdl.CBDL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,37,FOLLOW_27); 

                    				newLeafNode(otherlv_18, grammarAccess.getSecurityControlDefintionAccess().getEnforceKeyword_3_9());
                    			
                    otherlv_19=(Token)match(input,29,FOLLOW_38); 

                    				newLeafNode(otherlv_19, grammarAccess.getSecurityControlDefintionAccess().getLeftParenthesisKeyword_3_10());
                    			
                    // InternalCBDL.g:1956:4: ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalCBDL.g:1957:5: ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalCBDL.g:1957:5: ( ( ruleQualifiedName ) )
                            // InternalCBDL.g:1958:6: ( ruleQualifiedName )
                            {
                            // InternalCBDL.g:1958:6: ( ruleQualifiedName )
                            // InternalCBDL.g:1959:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSecurityControlDefintionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getSecurityControlDefintionAccess().getEnforcePropertyDefinitionCrossReference_3_11_0_0());
                            						
                            pushFollow(FOLLOW_25);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalCBDL.g:1973:5: (otherlv_21= ',' ( ( ruleQualifiedName ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==19) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // InternalCBDL.g:1974:6: otherlv_21= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_21=(Token)match(input,19,FOLLOW_11); 

                            	    						newLeafNode(otherlv_21, grammarAccess.getSecurityControlDefintionAccess().getCommaKeyword_3_11_1_0());
                            	    					
                            	    // InternalCBDL.g:1978:6: ( ( ruleQualifiedName ) )
                            	    // InternalCBDL.g:1979:7: ( ruleQualifiedName )
                            	    {
                            	    // InternalCBDL.g:1979:7: ( ruleQualifiedName )
                            	    // InternalCBDL.g:1980:8: ruleQualifiedName
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getSecurityControlDefintionRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getSecurityControlDefintionAccess().getEnforcePropertyDefinitionCrossReference_3_11_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,30,FOLLOW_31); 

                    				newLeafNode(otherlv_23, grammarAccess.getSecurityControlDefintionAccess().getRightParenthesisKeyword_3_12());
                    			
                    otherlv_24=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getSecurityControlDefintionAccess().getRightCurlyBracketKeyword_3_13());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleSecurityControlDefintion"


    // $ANTLR start "entryRuleDefinitionParameter"
    // InternalCBDL.g:2009:1: entryRuleDefinitionParameter returns [EObject current=null] : iv_ruleDefinitionParameter= ruleDefinitionParameter EOF ;
    public final EObject entryRuleDefinitionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionParameter = null;


        try {
            // InternalCBDL.g:2009:60: (iv_ruleDefinitionParameter= ruleDefinitionParameter EOF )
            // InternalCBDL.g:2010:2: iv_ruleDefinitionParameter= ruleDefinitionParameter EOF
            {
             newCompositeNode(grammarAccess.getDefinitionParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionParameter=ruleDefinitionParameter();

            state._fsp--;

             current =iv_ruleDefinitionParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefinitionParameter"


    // $ANTLR start "ruleDefinitionParameter"
    // InternalCBDL.g:2016:1: ruleDefinitionParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleParameterType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefinitionParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalCBDL.g:2022:2: ( ( ( (lv_type_0_0= ruleParameterType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCBDL.g:2023:2: ( ( (lv_type_0_0= ruleParameterType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCBDL.g:2023:2: ( ( (lv_type_0_0= ruleParameterType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCBDL.g:2024:3: ( (lv_type_0_0= ruleParameterType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalCBDL.g:2024:3: ( (lv_type_0_0= ruleParameterType ) )
            // InternalCBDL.g:2025:4: (lv_type_0_0= ruleParameterType )
            {
            // InternalCBDL.g:2025:4: (lv_type_0_0= ruleParameterType )
            // InternalCBDL.g:2026:5: lv_type_0_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getDefinitionParameterAccess().getTypeParameterTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_0_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"swarchitecture.compliance.security.cbdl.CBDL.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCBDL.g:2043:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCBDL.g:2044:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCBDL.g:2044:4: (lv_name_1_0= RULE_ID )
            // InternalCBDL.g:2045:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefinitionParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDefinitionParameter"


    // $ANTLR start "entryRuleComplianceInstance"
    // InternalCBDL.g:2065:1: entryRuleComplianceInstance returns [EObject current=null] : iv_ruleComplianceInstance= ruleComplianceInstance EOF ;
    public final EObject entryRuleComplianceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplianceInstance = null;


        try {
            // InternalCBDL.g:2065:59: (iv_ruleComplianceInstance= ruleComplianceInstance EOF )
            // InternalCBDL.g:2066:2: iv_ruleComplianceInstance= ruleComplianceInstance EOF
            {
             newCompositeNode(grammarAccess.getComplianceInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplianceInstance=ruleComplianceInstance();

            state._fsp--;

             current =iv_ruleComplianceInstance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplianceInstance"


    // $ANTLR start "ruleComplianceInstance"
    // InternalCBDL.g:2072:1: ruleComplianceInstance returns [EObject current=null] : (otherlv_0= 'atomic' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleComplianceInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCBDL.g:2078:2: ( (otherlv_0= 'atomic' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) )
            // InternalCBDL.g:2079:2: (otherlv_0= 'atomic' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalCBDL.g:2079:2: (otherlv_0= 'atomic' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            // InternalCBDL.g:2080:3: otherlv_0= 'atomic' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComplianceInstanceAccess().getAtomicKeyword_0());
            		
            // InternalCBDL.g:2084:3: ( ( ruleQualifiedName ) )
            // InternalCBDL.g:2085:4: ( ruleQualifiedName )
            {
            // InternalCBDL.g:2085:4: ( ruleQualifiedName )
            // InternalCBDL.g:2086:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplianceInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComplianceInstanceAccess().getPropertyDefinitionPropertyDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getComplianceInstanceAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCBDL.g:2104:3: ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCBDL.g:2105:4: ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalCBDL.g:2105:4: ( ( ruleQualifiedName ) )
                    // InternalCBDL.g:2106:5: ( ruleQualifiedName )
                    {
                    // InternalCBDL.g:2106:5: ( ruleQualifiedName )
                    // InternalCBDL.g:2107:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComplianceInstanceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComplianceInstanceAccess().getParametersEObjectCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBDL.g:2121:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==19) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalCBDL.g:2122:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getComplianceInstanceAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCBDL.g:2126:5: ( ( ruleQualifiedName ) )
                    	    // InternalCBDL.g:2127:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalCBDL.g:2127:6: ( ruleQualifiedName )
                    	    // InternalCBDL.g:2128:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComplianceInstanceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComplianceInstanceAccess().getParametersEObjectCrossReference_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getComplianceInstanceAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComplianceInstanceAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleComplianceInstance"


    // $ANTLR start "entryRuleOverlayComplianceInstance"
    // InternalCBDL.g:2156:1: entryRuleOverlayComplianceInstance returns [EObject current=null] : iv_ruleOverlayComplianceInstance= ruleOverlayComplianceInstance EOF ;
    public final EObject entryRuleOverlayComplianceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverlayComplianceInstance = null;


        try {
            // InternalCBDL.g:2156:66: (iv_ruleOverlayComplianceInstance= ruleOverlayComplianceInstance EOF )
            // InternalCBDL.g:2157:2: iv_ruleOverlayComplianceInstance= ruleOverlayComplianceInstance EOF
            {
             newCompositeNode(grammarAccess.getOverlayComplianceInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOverlayComplianceInstance=ruleOverlayComplianceInstance();

            state._fsp--;

             current =iv_ruleOverlayComplianceInstance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOverlayComplianceInstance"


    // $ANTLR start "ruleOverlayComplianceInstance"
    // InternalCBDL.g:2163:1: ruleOverlayComplianceInstance returns [EObject current=null] : (otherlv_0= 'overlay' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleOverlayComplianceInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCBDL.g:2169:2: ( (otherlv_0= 'overlay' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) )
            // InternalCBDL.g:2170:2: (otherlv_0= 'overlay' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalCBDL.g:2170:2: (otherlv_0= 'overlay' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            // InternalCBDL.g:2171:3: otherlv_0= 'overlay' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getOverlayComplianceInstanceAccess().getOverlayKeyword_0());
            		
            // InternalCBDL.g:2175:3: ( ( ruleQualifiedName ) )
            // InternalCBDL.g:2176:4: ( ruleQualifiedName )
            {
            // InternalCBDL.g:2176:4: ( ruleQualifiedName )
            // InternalCBDL.g:2177:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOverlayComplianceInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOverlayComplianceInstanceAccess().getPropertyDefinitionPropertyDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getOverlayComplianceInstanceAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCBDL.g:2195:3: ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCBDL.g:2196:4: ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalCBDL.g:2196:4: ( ( ruleQualifiedName ) )
                    // InternalCBDL.g:2197:5: ( ruleQualifiedName )
                    {
                    // InternalCBDL.g:2197:5: ( ruleQualifiedName )
                    // InternalCBDL.g:2198:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOverlayComplianceInstanceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOverlayComplianceInstanceAccess().getParametersEObjectCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBDL.g:2212:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==19) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalCBDL.g:2213:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOverlayComplianceInstanceAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCBDL.g:2217:5: ( ( ruleQualifiedName ) )
                    	    // InternalCBDL.g:2218:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalCBDL.g:2218:6: ( ruleQualifiedName )
                    	    // InternalCBDL.g:2219:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOverlayComplianceInstanceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getOverlayComplianceInstanceAccess().getParametersEObjectCrossReference_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getOverlayComplianceInstanceAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOverlayComplianceInstanceAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleOverlayComplianceInstance"


    // $ANTLR start "entryRuleSecurityControlInstance"
    // InternalCBDL.g:2247:1: entryRuleSecurityControlInstance returns [EObject current=null] : iv_ruleSecurityControlInstance= ruleSecurityControlInstance EOF ;
    public final EObject entryRuleSecurityControlInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityControlInstance = null;


        try {
            // InternalCBDL.g:2247:64: (iv_ruleSecurityControlInstance= ruleSecurityControlInstance EOF )
            // InternalCBDL.g:2248:2: iv_ruleSecurityControlInstance= ruleSecurityControlInstance EOF
            {
             newCompositeNode(grammarAccess.getSecurityControlInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecurityControlInstance=ruleSecurityControlInstance();

            state._fsp--;

             current =iv_ruleSecurityControlInstance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSecurityControlInstance"


    // $ANTLR start "ruleSecurityControlInstance"
    // InternalCBDL.g:2254:1: ruleSecurityControlInstance returns [EObject current=null] : (otherlv_0= 'securityReq' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleSecurityControlInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCBDL.g:2260:2: ( (otherlv_0= 'securityReq' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) )
            // InternalCBDL.g:2261:2: (otherlv_0= 'securityReq' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalCBDL.g:2261:2: (otherlv_0= 'securityReq' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            // InternalCBDL.g:2262:3: otherlv_0= 'securityReq' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSecurityControlInstanceAccess().getSecurityReqKeyword_0());
            		
            // InternalCBDL.g:2266:3: ( ( ruleQualifiedName ) )
            // InternalCBDL.g:2267:4: ( ruleQualifiedName )
            {
            // InternalCBDL.g:2267:4: ( ruleQualifiedName )
            // InternalCBDL.g:2268:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecurityControlInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSecurityControlInstanceAccess().getPropertyDefinitionPropertyDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSecurityControlInstanceAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCBDL.g:2286:3: ( ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCBDL.g:2287:4: ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalCBDL.g:2287:4: ( ( ruleQualifiedName ) )
                    // InternalCBDL.g:2288:5: ( ruleQualifiedName )
                    {
                    // InternalCBDL.g:2288:5: ( ruleQualifiedName )
                    // InternalCBDL.g:2289:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSecurityControlInstanceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSecurityControlInstanceAccess().getParametersEObjectCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCBDL.g:2303:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==19) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalCBDL.g:2304:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSecurityControlInstanceAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCBDL.g:2308:5: ( ( ruleQualifiedName ) )
                    	    // InternalCBDL.g:2309:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalCBDL.g:2309:6: ( ruleQualifiedName )
                    	    // InternalCBDL.g:2310:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSecurityControlInstanceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSecurityControlInstanceAccess().getParametersEObjectCrossReference_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getSecurityControlInstanceAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSecurityControlInstanceAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleSecurityControlInstance"


    // $ANTLR start "ruleInput"
    // InternalCBDL.g:2338:1: ruleInput returns [Enumerator current=null] : (enumLiteral_0= '<-' ) ;
    public final Enumerator ruleInput() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCBDL.g:2344:2: ( (enumLiteral_0= '<-' ) )
            // InternalCBDL.g:2345:2: (enumLiteral_0= '<-' )
            {
            // InternalCBDL.g:2345:2: (enumLiteral_0= '<-' )
            // InternalCBDL.g:2346:3: enumLiteral_0= '<-'
            {
            enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

            			current = grammarAccess.getInputAccess().getINPUTEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getInputAccess().getINPUTEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "ruleOutput"
    // InternalCBDL.g:2355:1: ruleOutput returns [Enumerator current=null] : (enumLiteral_0= '->' ) ;
    public final Enumerator ruleOutput() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCBDL.g:2361:2: ( (enumLiteral_0= '->' ) )
            // InternalCBDL.g:2362:2: (enumLiteral_0= '->' )
            {
            // InternalCBDL.g:2362:2: (enumLiteral_0= '->' )
            // InternalCBDL.g:2363:3: enumLiteral_0= '->'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

            			current = grammarAccess.getOutputAccess().getOUTPUTEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOutputAccess().getOUTPUTEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "ruleParameterType"
    // InternalCBDL.g:2372:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'COMPONENT' ) | (enumLiteral_1= 'PORT' ) | (enumLiteral_2= 'CONNECTOR' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCBDL.g:2378:2: ( ( (enumLiteral_0= 'COMPONENT' ) | (enumLiteral_1= 'PORT' ) | (enumLiteral_2= 'CONNECTOR' ) ) )
            // InternalCBDL.g:2379:2: ( (enumLiteral_0= 'COMPONENT' ) | (enumLiteral_1= 'PORT' ) | (enumLiteral_2= 'CONNECTOR' ) )
            {
            // InternalCBDL.g:2379:2: ( (enumLiteral_0= 'COMPONENT' ) | (enumLiteral_1= 'PORT' ) | (enumLiteral_2= 'CONNECTOR' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt41=1;
                }
                break;
            case 43:
                {
                alt41=2;
                }
                break;
            case 44:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalCBDL.g:2380:3: (enumLiteral_0= 'COMPONENT' )
                    {
                    // InternalCBDL.g:2380:3: (enumLiteral_0= 'COMPONENT' )
                    // InternalCBDL.g:2381:4: enumLiteral_0= 'COMPONENT'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getComponentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getComponentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCBDL.g:2388:3: (enumLiteral_1= 'PORT' )
                    {
                    // InternalCBDL.g:2388:3: (enumLiteral_1= 'PORT' )
                    // InternalCBDL.g:2389:4: enumLiteral_1= 'PORT'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getPortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getPortEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCBDL.g:2396:3: (enumLiteral_2= 'CONNECTOR' )
                    {
                    // InternalCBDL.g:2396:3: (enumLiteral_2= 'CONNECTOR' )
                    // InternalCBDL.g:2397:4: enumLiteral_2= 'CONNECTOR'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getConnectorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getConnectorEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleParameterType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008006411800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002410002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000260000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001410100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020040002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040000010L});

}