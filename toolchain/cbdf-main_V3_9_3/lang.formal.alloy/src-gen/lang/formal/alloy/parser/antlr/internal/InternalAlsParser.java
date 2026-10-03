package lang.formal.alloy.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lang.formal.alloy.services.AlsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAlsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_NEGATIVE_INTEGER", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'exactly'", "'/'", "'as'", "'fun'", "'private'", "'pred'", "':'", "'run'", "'check'", "'for'", "'but'", "'expect'", "'this'", "'int'", "'seq'", "'='", "'var'", "'abstract'", "'sig'", "'{'", "','", "'}'", "'lone'", "'one'", "'some'", "'extends'", "'in'", "'+'", "'!'", "'not'", "'=>'", "'implies'", "'else'", "'['", "']'", "'('", "')'", "'let'", "'none'", "'iden'", "'univ'", "'Int'", "'seq/Int'", "'@'", "'disj'", "'all'", "'sum'", "'||'", "'or'", "'&&'", "'and'", "'&'", "'<=>'", "'iff'", "'-'", "'++'", "'<:'", "':>'", "'<<'", "'>>'", "'>>>'", "'until'", "'releases'", "'since'", "'triggered'", "'set'", "'#'", "'~'", "'*'", "'^'", "'always'", "'eventually'", "'after'", "'before'", "'historically'", "'once'", "'no'", "'<'", "'>'", "'=<'", "'<='", "'>='", "'->'", "'|'", "'open'", "'fact'", "'assert'", "'enum'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_NEGATIVE_INTEGER=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalAlsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAls.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private AlsGrammarAccess grammarAccess;

        public InternalAlsParser(TokenStream input, AlsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Specification";
       	}

       	@Override
       	protected AlsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSpecification"
    // InternalAls.g:70:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalAls.g:70:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalAls.g:71:2: iv_ruleSpecification= ruleSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalAls.g:77:1: ruleSpecification returns [EObject current=null] : ( ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )* ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_module_0_0 = null;

        EObject lv_open_1_0 = null;

        EObject lv_paragraph_2_0 = null;



        	enterRule();

        try {
            // InternalAls.g:83:2: ( ( ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )* ) )
            // InternalAls.g:84:2: ( ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )* )
            {
            // InternalAls.g:84:2: ( ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )* )
            // InternalAls.g:85:3: ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )*
            {
            // InternalAls.g:85:3: ( (lv_module_0_0= ruleModule ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAls.g:86:4: (lv_module_0_0= ruleModule )
                    {
                    // InternalAls.g:86:4: (lv_module_0_0= ruleModule )
                    // InternalAls.g:87:5: lv_module_0_0= ruleModule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecificationAccess().getModuleModuleParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_module_0_0=ruleModule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                      					}
                      					set(
                      						current,
                      						"module",
                      						lv_module_0_0,
                      						"lang.formal.alloy.Als.Module");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAls.g:104:3: ( (lv_open_1_0= ruleOpen ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==97) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAls.g:105:4: (lv_open_1_0= ruleOpen )
            	    {
            	    // InternalAls.g:105:4: (lv_open_1_0= ruleOpen )
            	    // InternalAls.g:106:5: lv_open_1_0= ruleOpen
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSpecificationAccess().getOpenOpenParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_open_1_0=ruleOpen();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"open",
            	      						lv_open_1_0,
            	      						"lang.formal.alloy.Als.Open");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAls.g:123:3: ( (lv_paragraph_2_0= ruleParagraph ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=16 && LA3_0<=18)||(LA3_0>=20 && LA3_0<=21)||(LA3_0>=29 && LA3_0<=31)||(LA3_0>=35 && LA3_0<=37)||LA3_0==50||(LA3_0>=98 && LA3_0<=100)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAls.g:124:4: (lv_paragraph_2_0= ruleParagraph )
            	    {
            	    // InternalAls.g:124:4: (lv_paragraph_2_0= ruleParagraph )
            	    // InternalAls.g:125:5: lv_paragraph_2_0= ruleParagraph
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSpecificationAccess().getParagraphParagraphParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_paragraph_2_0=ruleParagraph();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"paragraph",
            	      						lv_paragraph_2_0,
            	      						"lang.formal.alloy.Als.Paragraph");
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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleModule"
    // InternalAls.g:146:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalAls.g:146:47: (iv_ruleModule= ruleModule EOF )
            // InternalAls.g:147:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalAls.g:153:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_exactly_3_0=null;
        Token lv_exactly_6_0=null;
        Token lv_number_7_0=null;
        AntlrDatatypeRuleToken lv_moduleName_1_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_name_4_0 = null;

        EObject lv_comma_5_0 = null;

        EObject lv_name_8_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalAls.g:159:2: ( (otherlv_0= 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )? ) )
            // InternalAls.g:160:2: (otherlv_0= 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )? )
            {
            // InternalAls.g:160:2: (otherlv_0= 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )? )
            // InternalAls.g:161:3: otherlv_0= 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
              		
            }
            // InternalAls.g:165:3: ( (lv_moduleName_1_0= ruleName ) )
            // InternalAls.g:166:4: (lv_moduleName_1_0= ruleName )
            {
            // InternalAls.g:166:4: (lv_moduleName_1_0= ruleName )
            // InternalAls.g:167:5: lv_moduleName_1_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleAccess().getModuleNameNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_moduleName_1_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModuleRule());
              					}
              					set(
              						current,
              						"moduleName",
              						lv_moduleName_1_0,
              						"lang.formal.alloy.Als.Name");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:184:3: ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==46) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAls.g:185:4: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // InternalAls.g:185:4: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) )
                    // InternalAls.g:186:5: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    {
                    // InternalAls.g:186:5: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    // InternalAls.g:187:6: lv_left_2_0= ruleLeftSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleAccess().getLeftLeftSquareBracketKeywordParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_left_2_0=ruleLeftSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModuleRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_2_0,
                      							"lang.formal.alloy.Als.LeftSquareBracketKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:204:4: ( (lv_exactly_3_0= 'exactly' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==13) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalAls.g:205:5: (lv_exactly_3_0= 'exactly' )
                            {
                            // InternalAls.g:205:5: (lv_exactly_3_0= 'exactly' )
                            // InternalAls.g:206:6: lv_exactly_3_0= 'exactly'
                            {
                            lv_exactly_3_0=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_exactly_3_0, grammarAccess.getModuleAccess().getExactlyExactlyKeyword_2_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getModuleRule());
                              						}
                              						addWithLastConsumed(current, "exactly", lv_exactly_3_0, "exactly");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalAls.g:218:4: ( (lv_name_4_0= ruleExactlyName ) )
                    // InternalAls.g:219:5: (lv_name_4_0= ruleExactlyName )
                    {
                    // InternalAls.g:219:5: (lv_name_4_0= ruleExactlyName )
                    // InternalAls.g:220:6: lv_name_4_0= ruleExactlyName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleAccess().getNameExactlyNameParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_name_4_0=ruleExactlyName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModuleRule());
                      						}
                      						add(
                      							current,
                      							"name",
                      							lv_name_4_0,
                      							"lang.formal.alloy.Als.ExactlyName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:237:4: ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==33) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAls.g:238:5: ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) )
                    	    {
                    	    // InternalAls.g:238:5: ( (lv_comma_5_0= ruleComma ) )
                    	    // InternalAls.g:239:6: (lv_comma_5_0= ruleComma )
                    	    {
                    	    // InternalAls.g:239:6: (lv_comma_5_0= ruleComma )
                    	    // InternalAls.g:240:7: lv_comma_5_0= ruleComma
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getModuleAccess().getCommaCommaParserRuleCall_2_3_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_comma_5_0=ruleComma();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getModuleRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"comma",
                    	      								lv_comma_5_0,
                    	      								"lang.formal.alloy.Als.Comma");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalAls.g:257:5: ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==RULE_INT||LA6_0==13) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==RULE_ID||LA6_0==25) ) {
                    	        alt6=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 6, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalAls.g:258:6: ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )
                    	            {
                    	            // InternalAls.g:258:6: ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )
                    	            // InternalAls.g:259:7: ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) )
                    	            {
                    	            // InternalAls.g:259:7: ( (lv_exactly_6_0= 'exactly' ) )?
                    	            int alt5=2;
                    	            int LA5_0 = input.LA(1);

                    	            if ( (LA5_0==13) ) {
                    	                alt5=1;
                    	            }
                    	            switch (alt5) {
                    	                case 1 :
                    	                    // InternalAls.g:260:8: (lv_exactly_6_0= 'exactly' )
                    	                    {
                    	                    // InternalAls.g:260:8: (lv_exactly_6_0= 'exactly' )
                    	                    // InternalAls.g:261:9: lv_exactly_6_0= 'exactly'
                    	                    {
                    	                    lv_exactly_6_0=(Token)match(input,13,FOLLOW_10); if (state.failed) return current;
                    	                    if ( state.backtracking==0 ) {

                    	                      									newLeafNode(lv_exactly_6_0, grammarAccess.getModuleAccess().getExactlyExactlyKeyword_2_3_1_0_0_0());
                    	                      								
                    	                    }
                    	                    if ( state.backtracking==0 ) {

                    	                      									if (current==null) {
                    	                      										current = createModelElement(grammarAccess.getModuleRule());
                    	                      									}
                    	                      									addWithLastConsumed(current, "exactly", lv_exactly_6_0, "exactly");
                    	                      								
                    	                    }

                    	                    }


                    	                    }
                    	                    break;

                    	            }

                    	            // InternalAls.g:273:7: ( (lv_number_7_0= RULE_INT ) )
                    	            // InternalAls.g:274:8: (lv_number_7_0= RULE_INT )
                    	            {
                    	            // InternalAls.g:274:8: (lv_number_7_0= RULE_INT )
                    	            // InternalAls.g:275:9: lv_number_7_0= RULE_INT
                    	            {
                    	            lv_number_7_0=(Token)match(input,RULE_INT,FOLLOW_8); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              									newLeafNode(lv_number_7_0, grammarAccess.getModuleAccess().getNumberINTTerminalRuleCall_2_3_1_0_1_0());
                    	              								
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              									if (current==null) {
                    	              										current = createModelElement(grammarAccess.getModuleRule());
                    	              									}
                    	              									addWithLastConsumed(
                    	              										current,
                    	              										"number",
                    	              										lv_number_7_0,
                    	              										"org.eclipse.xtext.common.Terminals.INT");
                    	              								
                    	            }

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalAls.g:293:6: ( (lv_name_8_0= ruleExactlyName ) )
                    	            {
                    	            // InternalAls.g:293:6: ( (lv_name_8_0= ruleExactlyName ) )
                    	            // InternalAls.g:294:7: (lv_name_8_0= ruleExactlyName )
                    	            {
                    	            // InternalAls.g:294:7: (lv_name_8_0= ruleExactlyName )
                    	            // InternalAls.g:295:8: lv_name_8_0= ruleExactlyName
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getModuleAccess().getNameExactlyNameParserRuleCall_2_3_1_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_8);
                    	            lv_name_8_0=ruleExactlyName();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getModuleRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"name",
                    	              									lv_name_8_0,
                    	              									"lang.formal.alloy.Als.ExactlyName");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // InternalAls.g:314:4: ( (lv_right_9_0= ruleRightSquareBracketKeyword ) )
                    // InternalAls.g:315:5: (lv_right_9_0= ruleRightSquareBracketKeyword )
                    {
                    // InternalAls.g:315:5: (lv_right_9_0= ruleRightSquareBracketKeyword )
                    // InternalAls.g:316:6: lv_right_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleAccess().getRightRightSquareBracketKeywordParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_9_0=ruleRightSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModuleRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_9_0,
                      							"lang.formal.alloy.Als.RightSquareBracketKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleOpen"
    // InternalAls.g:338:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // InternalAls.g:338:45: (iv_ruleOpen= ruleOpen EOF )
            // InternalAls.g:339:2: iv_ruleOpen= ruleOpen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpen=ruleOpen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpen; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // InternalAls.g:345:1: ruleOpen returns [EObject current=null] : ( ( (lv_openName_0_0= ruleOpenName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/' )? ( (lv_refname_4_0= ruleReferencesName ) ) ( (lv_right_5_0= ruleRightSquareBracketKeyword ) ) )? (otherlv_6= 'as' ( (lv_nameAs_7_0= ruleAsName ) ) )? ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_openName_0_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_previousNameAs_2_0 = null;

        EObject lv_refname_4_0 = null;

        EObject lv_right_5_0 = null;

        EObject lv_nameAs_7_0 = null;



        	enterRule();

        try {
            // InternalAls.g:351:2: ( ( ( (lv_openName_0_0= ruleOpenName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/' )? ( (lv_refname_4_0= ruleReferencesName ) ) ( (lv_right_5_0= ruleRightSquareBracketKeyword ) ) )? (otherlv_6= 'as' ( (lv_nameAs_7_0= ruleAsName ) ) )? ) )
            // InternalAls.g:352:2: ( ( (lv_openName_0_0= ruleOpenName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/' )? ( (lv_refname_4_0= ruleReferencesName ) ) ( (lv_right_5_0= ruleRightSquareBracketKeyword ) ) )? (otherlv_6= 'as' ( (lv_nameAs_7_0= ruleAsName ) ) )? )
            {
            // InternalAls.g:352:2: ( ( (lv_openName_0_0= ruleOpenName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/' )? ( (lv_refname_4_0= ruleReferencesName ) ) ( (lv_right_5_0= ruleRightSquareBracketKeyword ) ) )? (otherlv_6= 'as' ( (lv_nameAs_7_0= ruleAsName ) ) )? )
            // InternalAls.g:353:3: ( (lv_openName_0_0= ruleOpenName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/' )? ( (lv_refname_4_0= ruleReferencesName ) ) ( (lv_right_5_0= ruleRightSquareBracketKeyword ) ) )? (otherlv_6= 'as' ( (lv_nameAs_7_0= ruleAsName ) ) )?
            {
            // InternalAls.g:353:3: ( (lv_openName_0_0= ruleOpenName ) )
            // InternalAls.g:354:4: (lv_openName_0_0= ruleOpenName )
            {
            // InternalAls.g:354:4: (lv_openName_0_0= ruleOpenName )
            // InternalAls.g:355:5: lv_openName_0_0= ruleOpenName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOpenAccess().getOpenNameOpenNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_openName_0_0=ruleOpenName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOpenRule());
              					}
              					set(
              						current,
              						"openName",
              						lv_openName_0_0,
              						"lang.formal.alloy.Als.OpenName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:372:3: ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/' )? ( (lv_refname_4_0= ruleReferencesName ) ) ( (lv_right_5_0= ruleRightSquareBracketKeyword ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAls.g:373:4: ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/' )? ( (lv_refname_4_0= ruleReferencesName ) ) ( (lv_right_5_0= ruleRightSquareBracketKeyword ) )
                    {
                    // InternalAls.g:373:4: ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) )
                    // InternalAls.g:374:5: (lv_left_1_0= ruleLeftSquareBracketKeyword )
                    {
                    // InternalAls.g:374:5: (lv_left_1_0= ruleLeftSquareBracketKeyword )
                    // InternalAls.g:375:6: lv_left_1_0= ruleLeftSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpenAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_left_1_0=ruleLeftSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOpenRule());
                      						}
                      						set(
                      							current,
                      							"left",
                      							lv_left_1_0,
                      							"lang.formal.alloy.Als.LeftSquareBracketKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:392:4: ( ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==14) ) {
                            int LA9_3 = input.LA(3);

                            if ( (LA9_3==RULE_ID) ) {
                                int LA9_4 = input.LA(4);

                                if ( (synpred9_InternalAls()) ) {
                                    alt9=1;
                                }
                            }
                            else if ( (LA9_3==25||LA9_3==50||LA9_3==98||LA9_3==100) ) {
                                alt9=1;
                            }
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAls.g:393:5: ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/'
                            {
                            // InternalAls.g:393:5: ( (lv_previousNameAs_2_0= ruleAsName ) )
                            // InternalAls.g:394:6: (lv_previousNameAs_2_0= ruleAsName )
                            {
                            // InternalAls.g:394:6: (lv_previousNameAs_2_0= ruleAsName )
                            // InternalAls.g:395:7: lv_previousNameAs_2_0= ruleAsName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOpenAccess().getPreviousNameAsAsNameParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_13);
                            lv_previousNameAs_2_0=ruleAsName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getOpenRule());
                              							}
                              							set(
                              								current,
                              								"previousNameAs",
                              								lv_previousNameAs_2_0,
                              								"lang.formal.alloy.Als.AsName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getSolidusKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalAls.g:417:4: ( (lv_refname_4_0= ruleReferencesName ) )
                    // InternalAls.g:418:5: (lv_refname_4_0= ruleReferencesName )
                    {
                    // InternalAls.g:418:5: (lv_refname_4_0= ruleReferencesName )
                    // InternalAls.g:419:6: lv_refname_4_0= ruleReferencesName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpenAccess().getRefnameReferencesNameParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_refname_4_0=ruleReferencesName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOpenRule());
                      						}
                      						set(
                      							current,
                      							"refname",
                      							lv_refname_4_0,
                      							"lang.formal.alloy.Als.ReferencesName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:436:4: ( (lv_right_5_0= ruleRightSquareBracketKeyword ) )
                    // InternalAls.g:437:5: (lv_right_5_0= ruleRightSquareBracketKeyword )
                    {
                    // InternalAls.g:437:5: (lv_right_5_0= ruleRightSquareBracketKeyword )
                    // InternalAls.g:438:6: lv_right_5_0= ruleRightSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpenAccess().getRightRightSquareBracketKeywordParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_right_5_0=ruleRightSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOpenRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_5_0,
                      							"lang.formal.alloy.Als.RightSquareBracketKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:456:3: (otherlv_6= 'as' ( (lv_nameAs_7_0= ruleAsName ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAls.g:457:4: otherlv_6= 'as' ( (lv_nameAs_7_0= ruleAsName ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getAsKeyword_2_0());
                      			
                    }
                    // InternalAls.g:461:4: ( (lv_nameAs_7_0= ruleAsName ) )
                    // InternalAls.g:462:5: (lv_nameAs_7_0= ruleAsName )
                    {
                    // InternalAls.g:462:5: (lv_nameAs_7_0= ruleAsName )
                    // InternalAls.g:463:6: lv_nameAs_7_0= ruleAsName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOpenAccess().getNameAsAsNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_nameAs_7_0=ruleAsName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOpenRule());
                      						}
                      						set(
                      							current,
                      							"nameAs",
                      							lv_nameAs_7_0,
                      							"lang.formal.alloy.Als.AsName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleParagraph"
    // InternalAls.g:485:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // InternalAls.g:485:50: (iv_ruleParagraph= ruleParagraph EOF )
            // InternalAls.g:486:2: iv_ruleParagraph= ruleParagraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParagraphRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParagraph; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalAls.g:492:1: ruleParagraph returns [EObject current=null] : (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        EObject this_FactDecl_0 = null;

        EObject this_AssertDecl_1 = null;

        EObject this_FunDecl_2 = null;

        EObject this_PredDecl_3 = null;

        EObject this_RunDecl_4 = null;

        EObject this_FunDeclWParam_5 = null;

        EObject this_CheckDecl_6 = null;

        EObject this_EnumDecl_7 = null;

        EObject this_LetOutDecl_8 = null;

        EObject this_SigDecl_9 = null;



        	enterRule();

        try {
            // InternalAls.g:498:2: ( (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl ) )
            // InternalAls.g:499:2: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl )
            {
            // InternalAls.g:499:2: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAls.g:500:3: this_FactDecl_0= ruleFactDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getFactDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FactDecl_0=ruleFactDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FactDecl_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:512:3: this_AssertDecl_1= ruleAssertDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getAssertDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AssertDecl_1=ruleAssertDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssertDecl_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:524:3: this_FunDecl_2= ruleFunDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getFunDeclParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunDecl_2=ruleFunDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunDecl_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAls.g:536:3: this_PredDecl_3= rulePredDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getPredDeclParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PredDecl_3=rulePredDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PredDecl_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAls.g:548:3: this_RunDecl_4= ruleRunDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getRunDeclParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RunDecl_4=ruleRunDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RunDecl_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAls.g:560:3: this_FunDeclWParam_5= ruleFunDeclWParam
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getFunDeclWParamParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunDeclWParam_5=ruleFunDeclWParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunDeclWParam_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAls.g:572:3: this_CheckDecl_6= ruleCheckDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getCheckDeclParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CheckDecl_6=ruleCheckDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CheckDecl_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAls.g:584:3: this_EnumDecl_7= ruleEnumDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getEnumDeclParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumDecl_7=ruleEnumDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumDecl_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAls.g:596:3: this_LetOutDecl_8= ruleLetOutDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getLetOutDeclParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LetOutDecl_8=ruleLetOutDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetOutDecl_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAls.g:608:3: this_SigDecl_9= ruleSigDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParagraphAccess().getSigDeclParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SigDecl_9=ruleSigDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SigDecl_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleFactDecl"
    // InternalAls.g:623:1: entryRuleFactDecl returns [EObject current=null] : iv_ruleFactDecl= ruleFactDecl EOF ;
    public final EObject entryRuleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactDecl = null;


        try {
            // InternalAls.g:623:49: (iv_ruleFactDecl= ruleFactDecl EOF )
            // InternalAls.g:624:2: iv_ruleFactDecl= ruleFactDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFactDecl=ruleFactDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFactDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFactDecl"


    // $ANTLR start "ruleFactDecl"
    // InternalAls.g:630:1: ruleFactDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalAls.g:636:2: ( ( ( (lv_name_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // InternalAls.g:637:2: ( ( (lv_name_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // InternalAls.g:637:2: ( ( (lv_name_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // InternalAls.g:638:3: ( (lv_name_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // InternalAls.g:638:3: ( (lv_name_0_0= ruleFactName ) )
            // InternalAls.g:639:4: (lv_name_0_0= ruleFactName )
            {
            // InternalAls.g:639:4: (lv_name_0_0= ruleFactName )
            // InternalAls.g:640:5: lv_name_0_0= ruleFactName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFactDeclAccess().getNameFactNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_name_0_0=ruleFactName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFactDeclRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"lang.formal.alloy.Als.FactName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:657:3: ( (lv_block_1_0= ruleBlock ) )
            // InternalAls.g:658:4: (lv_block_1_0= ruleBlock )
            {
            // InternalAls.g:658:4: (lv_block_1_0= ruleBlock )
            // InternalAls.g:659:5: lv_block_1_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFactDeclAccess().getBlockBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_1_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFactDeclRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_1_0,
              						"lang.formal.alloy.Als.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFactDecl"


    // $ANTLR start "entryRuleAssertDecl"
    // InternalAls.g:680:1: entryRuleAssertDecl returns [EObject current=null] : iv_ruleAssertDecl= ruleAssertDecl EOF ;
    public final EObject entryRuleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertDecl = null;


        try {
            // InternalAls.g:680:51: (iv_ruleAssertDecl= ruleAssertDecl EOF )
            // InternalAls.g:681:2: iv_ruleAssertDecl= ruleAssertDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssertDecl=ruleAssertDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssertDecl"


    // $ANTLR start "ruleAssertDecl"
    // InternalAls.g:687:1: ruleAssertDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalAls.g:693:2: ( ( ( (lv_name_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // InternalAls.g:694:2: ( ( (lv_name_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // InternalAls.g:694:2: ( ( (lv_name_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // InternalAls.g:695:3: ( (lv_name_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // InternalAls.g:695:3: ( (lv_name_0_0= ruleAssertionName ) )
            // InternalAls.g:696:4: (lv_name_0_0= ruleAssertionName )
            {
            // InternalAls.g:696:4: (lv_name_0_0= ruleAssertionName )
            // InternalAls.g:697:5: lv_name_0_0= ruleAssertionName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssertDeclAccess().getNameAssertionNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_name_0_0=ruleAssertionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssertDeclRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"lang.formal.alloy.Als.AssertionName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:714:3: ( (lv_block_1_0= ruleBlock ) )
            // InternalAls.g:715:4: (lv_block_1_0= ruleBlock )
            {
            // InternalAls.g:715:4: (lv_block_1_0= ruleBlock )
            // InternalAls.g:716:5: lv_block_1_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssertDeclAccess().getBlockBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_1_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssertDeclRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_1_0,
              						"lang.formal.alloy.Als.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssertDecl"


    // $ANTLR start "entryRuleFunDecl"
    // InternalAls.g:737:1: entryRuleFunDecl returns [EObject current=null] : iv_ruleFunDecl= ruleFunDecl EOF ;
    public final EObject entryRuleFunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDecl = null;


        try {
            // InternalAls.g:737:48: (iv_ruleFunDecl= ruleFunDecl EOF )
            // InternalAls.g:738:2: iv_ruleFunDecl= ruleFunDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunDecl=ruleFunDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunDecl"


    // $ANTLR start "ruleFunDecl"
    // InternalAls.g:744:1: ruleFunDecl returns [EObject current=null] : (otherlv_0= 'fun' ( ( (lv_ref_1_0= ruleRef ) ) ( (lv_dot_2_0= ruleDot ) ) )? ( (lv_name_3_0= ruleFunctionName ) ) ( ( ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )? ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_9_0= ruleLeftParenthesis ) ) ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )? ( (lv_rightP_13_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_14_0= ruleColon ) ) ( (lv_expr_15_0= ruleExpression ) ) ( (lv_block_16_0= ruleBlock ) ) ) ;
    public final EObject ruleFunDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ref_1_0 = null;

        EObject lv_dot_2_0 = null;

        EObject lv_name_3_0 = null;

        EObject lv_leftS_4_0 = null;

        EObject lv_decl_5_0 = null;

        EObject lv_comma_6_0 = null;

        EObject lv_decl_7_0 = null;

        EObject lv_rightS_8_0 = null;

        EObject lv_leftP_9_0 = null;

        EObject lv_decl_10_0 = null;

        EObject lv_comma_11_0 = null;

        EObject lv_decl_12_0 = null;

        EObject lv_rightP_13_0 = null;

        EObject lv_colon_14_0 = null;

        EObject lv_expr_15_0 = null;

        EObject lv_block_16_0 = null;



        	enterRule();

        try {
            // InternalAls.g:750:2: ( (otherlv_0= 'fun' ( ( (lv_ref_1_0= ruleRef ) ) ( (lv_dot_2_0= ruleDot ) ) )? ( (lv_name_3_0= ruleFunctionName ) ) ( ( ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )? ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_9_0= ruleLeftParenthesis ) ) ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )? ( (lv_rightP_13_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_14_0= ruleColon ) ) ( (lv_expr_15_0= ruleExpression ) ) ( (lv_block_16_0= ruleBlock ) ) ) )
            // InternalAls.g:751:2: (otherlv_0= 'fun' ( ( (lv_ref_1_0= ruleRef ) ) ( (lv_dot_2_0= ruleDot ) ) )? ( (lv_name_3_0= ruleFunctionName ) ) ( ( ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )? ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_9_0= ruleLeftParenthesis ) ) ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )? ( (lv_rightP_13_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_14_0= ruleColon ) ) ( (lv_expr_15_0= ruleExpression ) ) ( (lv_block_16_0= ruleBlock ) ) )
            {
            // InternalAls.g:751:2: (otherlv_0= 'fun' ( ( (lv_ref_1_0= ruleRef ) ) ( (lv_dot_2_0= ruleDot ) ) )? ( (lv_name_3_0= ruleFunctionName ) ) ( ( ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )? ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_9_0= ruleLeftParenthesis ) ) ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )? ( (lv_rightP_13_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_14_0= ruleColon ) ) ( (lv_expr_15_0= ruleExpression ) ) ( (lv_block_16_0= ruleBlock ) ) )
            // InternalAls.g:752:3: otherlv_0= 'fun' ( ( (lv_ref_1_0= ruleRef ) ) ( (lv_dot_2_0= ruleDot ) ) )? ( (lv_name_3_0= ruleFunctionName ) ) ( ( ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )? ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_9_0= ruleLeftParenthesis ) ) ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )? ( (lv_rightP_13_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_14_0= ruleColon ) ) ( (lv_expr_15_0= ruleExpression ) ) ( (lv_block_16_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunDeclAccess().getFunKeyword_0());
              		
            }
            // InternalAls.g:756:3: ( ( (lv_ref_1_0= ruleRef ) ) ( (lv_dot_2_0= ruleDot ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==101) ) {
                    alt13=1;
                }
            }
            else if ( ((LA13_0>=53 && LA13_0<=55)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAls.g:757:4: ( (lv_ref_1_0= ruleRef ) ) ( (lv_dot_2_0= ruleDot ) )
                    {
                    // InternalAls.g:757:4: ( (lv_ref_1_0= ruleRef ) )
                    // InternalAls.g:758:5: (lv_ref_1_0= ruleRef )
                    {
                    // InternalAls.g:758:5: (lv_ref_1_0= ruleRef )
                    // InternalAls.g:759:6: lv_ref_1_0= ruleRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunDeclAccess().getRefRefParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_ref_1_0=ruleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunDeclRule());
                      						}
                      						set(
                      							current,
                      							"ref",
                      							lv_ref_1_0,
                      							"lang.formal.alloy.Als.Ref");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:776:4: ( (lv_dot_2_0= ruleDot ) )
                    // InternalAls.g:777:5: (lv_dot_2_0= ruleDot )
                    {
                    // InternalAls.g:777:5: (lv_dot_2_0= ruleDot )
                    // InternalAls.g:778:6: lv_dot_2_0= ruleDot
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunDeclAccess().getDotDotParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_dot_2_0=ruleDot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunDeclRule());
                      						}
                      						set(
                      							current,
                      							"dot",
                      							lv_dot_2_0,
                      							"lang.formal.alloy.Als.Dot");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:796:3: ( (lv_name_3_0= ruleFunctionName ) )
            // InternalAls.g:797:4: (lv_name_3_0= ruleFunctionName )
            {
            // InternalAls.g:797:4: (lv_name_3_0= ruleFunctionName )
            // InternalAls.g:798:5: lv_name_3_0= ruleFunctionName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunDeclAccess().getNameFunctionNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_name_3_0=ruleFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunDeclRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"lang.formal.alloy.Als.FunctionName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:815:3: ( ( ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )? ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_9_0= ruleLeftParenthesis ) ) ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )? ( (lv_rightP_13_0= ruleRightParenthesis ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            else if ( (LA18_0==48) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAls.g:816:4: ( ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )? ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // InternalAls.g:816:4: ( ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )? ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) ) )
                    // InternalAls.g:817:5: ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )? ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) )
                    {
                    // InternalAls.g:817:5: ( (lv_leftS_4_0= ruleLeftSquareBracketKeyword ) )
                    // InternalAls.g:818:6: (lv_leftS_4_0= ruleLeftSquareBracketKeyword )
                    {
                    // InternalAls.g:818:6: (lv_leftS_4_0= ruleLeftSquareBracketKeyword )
                    // InternalAls.g:819:7: lv_leftS_4_0= ruleLeftSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_3_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_20);
                    lv_leftS_4_0=ruleLeftSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunDeclRule());
                      							}
                      							set(
                      								current,
                      								"leftS",
                      								lv_leftS_4_0,
                      								"lang.formal.alloy.Als.LeftSquareBracketKeyword");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAls.g:836:5: ( ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID||LA15_0==25||LA15_0==57) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAls.g:837:6: ( (lv_decl_5_0= ruleDecl ) ) ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )*
                            {
                            // InternalAls.g:837:6: ( (lv_decl_5_0= ruleDecl ) )
                            // InternalAls.g:838:7: (lv_decl_5_0= ruleDecl )
                            {
                            // InternalAls.g:838:7: (lv_decl_5_0= ruleDecl )
                            // InternalAls.g:839:8: lv_decl_5_0= ruleDecl
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_3_0_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_decl_5_0=ruleDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getFunDeclRule());
                              								}
                              								add(
                              									current,
                              									"decl",
                              									lv_decl_5_0,
                              									"lang.formal.alloy.Als.Decl");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalAls.g:856:6: ( ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==33) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalAls.g:857:7: ( (lv_comma_6_0= ruleComma ) ) ( (lv_decl_7_0= ruleDecl ) )
                            	    {
                            	    // InternalAls.g:857:7: ( (lv_comma_6_0= ruleComma ) )
                            	    // InternalAls.g:858:8: (lv_comma_6_0= ruleComma )
                            	    {
                            	    // InternalAls.g:858:8: (lv_comma_6_0= ruleComma )
                            	    // InternalAls.g:859:9: lv_comma_6_0= ruleComma
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_3_0_1_1_0_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_comma_6_0=ruleComma();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getFunDeclRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"comma",
                            	      										lv_comma_6_0,
                            	      										"lang.formal.alloy.Als.Comma");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }

                            	    // InternalAls.g:876:7: ( (lv_decl_7_0= ruleDecl ) )
                            	    // InternalAls.g:877:8: (lv_decl_7_0= ruleDecl )
                            	    {
                            	    // InternalAls.g:877:8: (lv_decl_7_0= ruleDecl )
                            	    // InternalAls.g:878:9: lv_decl_7_0= ruleDecl
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_3_0_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_8);
                            	    lv_decl_7_0=ruleDecl();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getFunDeclRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"decl",
                            	      										lv_decl_7_0,
                            	      										"lang.formal.alloy.Als.Decl");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalAls.g:897:5: ( (lv_rightS_8_0= ruleRightSquareBracketKeyword ) )
                    // InternalAls.g:898:6: (lv_rightS_8_0= ruleRightSquareBracketKeyword )
                    {
                    // InternalAls.g:898:6: (lv_rightS_8_0= ruleRightSquareBracketKeyword )
                    // InternalAls.g:899:7: lv_rightS_8_0= ruleRightSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_3_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
                    lv_rightS_8_0=ruleRightSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunDeclRule());
                      							}
                      							set(
                      								current,
                      								"rightS",
                      								lv_rightS_8_0,
                      								"lang.formal.alloy.Als.RightSquareBracketKeyword");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:918:4: ( ( (lv_leftP_9_0= ruleLeftParenthesis ) ) ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )? ( (lv_rightP_13_0= ruleRightParenthesis ) ) )
                    {
                    // InternalAls.g:918:4: ( ( (lv_leftP_9_0= ruleLeftParenthesis ) ) ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )? ( (lv_rightP_13_0= ruleRightParenthesis ) ) )
                    // InternalAls.g:919:5: ( (lv_leftP_9_0= ruleLeftParenthesis ) ) ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )? ( (lv_rightP_13_0= ruleRightParenthesis ) )
                    {
                    // InternalAls.g:919:5: ( (lv_leftP_9_0= ruleLeftParenthesis ) )
                    // InternalAls.g:920:6: (lv_leftP_9_0= ruleLeftParenthesis )
                    {
                    // InternalAls.g:920:6: (lv_leftP_9_0= ruleLeftParenthesis )
                    // InternalAls.g:921:7: lv_leftP_9_0= ruleLeftParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunDeclAccess().getLeftPLeftParenthesisParserRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_leftP_9_0=ruleLeftParenthesis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunDeclRule());
                      							}
                      							set(
                      								current,
                      								"leftP",
                      								lv_leftP_9_0,
                      								"lang.formal.alloy.Als.LeftParenthesis");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAls.g:938:5: ( ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID||LA17_0==25||LA17_0==57) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAls.g:939:6: ( (lv_decl_10_0= ruleDecl ) ) ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )*
                            {
                            // InternalAls.g:939:6: ( (lv_decl_10_0= ruleDecl ) )
                            // InternalAls.g:940:7: (lv_decl_10_0= ruleDecl )
                            {
                            // InternalAls.g:940:7: (lv_decl_10_0= ruleDecl )
                            // InternalAls.g:941:8: lv_decl_10_0= ruleDecl
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_3_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_24);
                            lv_decl_10_0=ruleDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getFunDeclRule());
                              								}
                              								add(
                              									current,
                              									"decl",
                              									lv_decl_10_0,
                              									"lang.formal.alloy.Als.Decl");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalAls.g:958:6: ( ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==33) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalAls.g:959:7: ( (lv_comma_11_0= ruleComma ) ) ( (lv_decl_12_0= ruleDecl ) )
                            	    {
                            	    // InternalAls.g:959:7: ( (lv_comma_11_0= ruleComma ) )
                            	    // InternalAls.g:960:8: (lv_comma_11_0= ruleComma )
                            	    {
                            	    // InternalAls.g:960:8: (lv_comma_11_0= ruleComma )
                            	    // InternalAls.g:961:9: lv_comma_11_0= ruleComma
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_3_1_1_1_0_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_comma_11_0=ruleComma();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getFunDeclRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"comma",
                            	      										lv_comma_11_0,
                            	      										"lang.formal.alloy.Als.Comma");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }

                            	    // InternalAls.g:978:7: ( (lv_decl_12_0= ruleDecl ) )
                            	    // InternalAls.g:979:8: (lv_decl_12_0= ruleDecl )
                            	    {
                            	    // InternalAls.g:979:8: (lv_decl_12_0= ruleDecl )
                            	    // InternalAls.g:980:9: lv_decl_12_0= ruleDecl
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_3_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_24);
                            	    lv_decl_12_0=ruleDecl();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getFunDeclRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"decl",
                            	      										lv_decl_12_0,
                            	      										"lang.formal.alloy.Als.Decl");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalAls.g:999:5: ( (lv_rightP_13_0= ruleRightParenthesis ) )
                    // InternalAls.g:1000:6: (lv_rightP_13_0= ruleRightParenthesis )
                    {
                    // InternalAls.g:1000:6: (lv_rightP_13_0= ruleRightParenthesis )
                    // InternalAls.g:1001:7: lv_rightP_13_0= ruleRightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunDeclAccess().getRightPRightParenthesisParserRuleCall_3_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
                    lv_rightP_13_0=ruleRightParenthesis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunDeclRule());
                      							}
                      							set(
                      								current,
                      								"rightP",
                      								lv_rightP_13_0,
                      								"lang.formal.alloy.Als.RightParenthesis");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:1020:3: ( (lv_colon_14_0= ruleColon ) )
            // InternalAls.g:1021:4: (lv_colon_14_0= ruleColon )
            {
            // InternalAls.g:1021:4: (lv_colon_14_0= ruleColon )
            // InternalAls.g:1022:5: lv_colon_14_0= ruleColon
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunDeclAccess().getColonColonParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_colon_14_0=ruleColon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunDeclRule());
              					}
              					set(
              						current,
              						"colon",
              						lv_colon_14_0,
              						"lang.formal.alloy.Als.Colon");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:1039:3: ( (lv_expr_15_0= ruleExpression ) )
            // InternalAls.g:1040:4: (lv_expr_15_0= ruleExpression )
            {
            // InternalAls.g:1040:4: (lv_expr_15_0= ruleExpression )
            // InternalAls.g:1041:5: lv_expr_15_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunDeclAccess().getExprExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_expr_15_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunDeclRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_15_0,
              						"lang.formal.alloy.Als.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:1058:3: ( (lv_block_16_0= ruleBlock ) )
            // InternalAls.g:1059:4: (lv_block_16_0= ruleBlock )
            {
            // InternalAls.g:1059:4: (lv_block_16_0= ruleBlock )
            // InternalAls.g:1060:5: lv_block_16_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunDeclAccess().getBlockBlockParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_16_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunDeclRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_16_0,
              						"lang.formal.alloy.Als.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunDecl"


    // $ANTLR start "entryRuleFunDeclWParam"
    // InternalAls.g:1081:1: entryRuleFunDeclWParam returns [EObject current=null] : iv_ruleFunDeclWParam= ruleFunDeclWParam EOF ;
    public final EObject entryRuleFunDeclWParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDeclWParam = null;


        try {
            // InternalAls.g:1081:54: (iv_ruleFunDeclWParam= ruleFunDeclWParam EOF )
            // InternalAls.g:1082:2: iv_ruleFunDeclWParam= ruleFunDeclWParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunDeclWParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunDeclWParam=ruleFunDeclWParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunDeclWParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunDeclWParam"


    // $ANTLR start "ruleFunDeclWParam"
    // InternalAls.g:1088:1: ruleFunDeclWParam returns [EObject current=null] : ( (otherlv_0= 'private' )? otherlv_1= 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) ) ) ;
    public final EObject ruleFunDeclWParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_ref_2_0 = null;

        EObject lv_dot_3_0 = null;

        EObject lv_name_4_0 = null;

        EObject lv_colon_5_0 = null;

        EObject lv_expr_6_0 = null;

        EObject lv_block_7_0 = null;



        	enterRule();

        try {
            // InternalAls.g:1094:2: ( ( (otherlv_0= 'private' )? otherlv_1= 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) ) ) )
            // InternalAls.g:1095:2: ( (otherlv_0= 'private' )? otherlv_1= 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) ) )
            {
            // InternalAls.g:1095:2: ( (otherlv_0= 'private' )? otherlv_1= 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) ) )
            // InternalAls.g:1096:3: (otherlv_0= 'private' )? otherlv_1= 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) )
            {
            // InternalAls.g:1096:3: (otherlv_0= 'private' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAls.g:1097:4: otherlv_0= 'private'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunDeclWParamAccess().getPrivateKeyword_0());
                      			
                    }

                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunDeclWParamAccess().getFunKeyword_1());
              		
            }
            // InternalAls.g:1106:3: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==101) ) {
                    alt20=1;
                }
            }
            else if ( ((LA20_0>=53 && LA20_0<=55)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAls.g:1107:4: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // InternalAls.g:1107:4: ( (lv_ref_2_0= ruleRef ) )
                    // InternalAls.g:1108:5: (lv_ref_2_0= ruleRef )
                    {
                    // InternalAls.g:1108:5: (lv_ref_2_0= ruleRef )
                    // InternalAls.g:1109:6: lv_ref_2_0= ruleRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunDeclWParamAccess().getRefRefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_ref_2_0=ruleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunDeclWParamRule());
                      						}
                      						set(
                      							current,
                      							"ref",
                      							lv_ref_2_0,
                      							"lang.formal.alloy.Als.Ref");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:1126:4: ( (lv_dot_3_0= ruleDot ) )
                    // InternalAls.g:1127:5: (lv_dot_3_0= ruleDot )
                    {
                    // InternalAls.g:1127:5: (lv_dot_3_0= ruleDot )
                    // InternalAls.g:1128:6: lv_dot_3_0= ruleDot
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunDeclWParamAccess().getDotDotParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_dot_3_0=ruleDot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunDeclWParamRule());
                      						}
                      						set(
                      							current,
                      							"dot",
                      							lv_dot_3_0,
                      							"lang.formal.alloy.Als.Dot");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:1146:3: ( (lv_name_4_0= ruleFunctionNamewParam ) )
            // InternalAls.g:1147:4: (lv_name_4_0= ruleFunctionNamewParam )
            {
            // InternalAls.g:1147:4: (lv_name_4_0= ruleFunctionNamewParam )
            // InternalAls.g:1148:5: lv_name_4_0= ruleFunctionNamewParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunDeclWParamAccess().getNameFunctionNamewParamParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_name_4_0=ruleFunctionNamewParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunDeclWParamRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_4_0,
              						"lang.formal.alloy.Als.FunctionNamewParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:1165:3: ( (lv_colon_5_0= ruleColon ) )
            // InternalAls.g:1166:4: (lv_colon_5_0= ruleColon )
            {
            // InternalAls.g:1166:4: (lv_colon_5_0= ruleColon )
            // InternalAls.g:1167:5: lv_colon_5_0= ruleColon
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunDeclWParamAccess().getColonColonParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_colon_5_0=ruleColon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunDeclWParamRule());
              					}
              					set(
              						current,
              						"colon",
              						lv_colon_5_0,
              						"lang.formal.alloy.Als.Colon");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:1184:3: ( (lv_expr_6_0= ruleExpression ) )
            // InternalAls.g:1185:4: (lv_expr_6_0= ruleExpression )
            {
            // InternalAls.g:1185:4: (lv_expr_6_0= ruleExpression )
            // InternalAls.g:1186:5: lv_expr_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunDeclWParamAccess().getExprExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_expr_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunDeclWParamRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_6_0,
              						"lang.formal.alloy.Als.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:1203:3: ( (lv_block_7_0= ruleBlock ) )
            // InternalAls.g:1204:4: (lv_block_7_0= ruleBlock )
            {
            // InternalAls.g:1204:4: (lv_block_7_0= ruleBlock )
            // InternalAls.g:1205:5: lv_block_7_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunDeclWParamAccess().getBlockBlockParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_7_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunDeclWParamRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_7_0,
              						"lang.formal.alloy.Als.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunDeclWParam"


    // $ANTLR start "entryRulePredDecl"
    // InternalAls.g:1226:1: entryRulePredDecl returns [EObject current=null] : iv_rulePredDecl= rulePredDecl EOF ;
    public final EObject entryRulePredDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredDecl = null;


        try {
            // InternalAls.g:1226:49: (iv_rulePredDecl= rulePredDecl EOF )
            // InternalAls.g:1227:2: iv_rulePredDecl= rulePredDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredDecl=rulePredDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePredDecl"


    // $ANTLR start "rulePredDecl"
    // InternalAls.g:1233:1: rulePredDecl returns [EObject current=null] : ( (otherlv_0= 'private' )? otherlv_1= 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) ;
    public final EObject rulePredDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_ref_2_0 = null;

        EObject lv_dot_3_0 = null;

        EObject lv_name_4_0 = null;

        EObject lv_leftS_5_0 = null;

        EObject lv_decl_6_0 = null;

        EObject lv_comma_7_0 = null;

        EObject lv_decl_8_0 = null;

        EObject lv_rightS_9_0 = null;

        EObject lv_leftP_10_0 = null;

        EObject lv_decl_11_0 = null;

        EObject lv_comma_12_0 = null;

        EObject lv_decl_13_0 = null;

        EObject lv_rightP_14_0 = null;

        EObject lv_block_15_0 = null;



        	enterRule();

        try {
            // InternalAls.g:1239:2: ( ( (otherlv_0= 'private' )? otherlv_1= 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) )
            // InternalAls.g:1240:2: ( (otherlv_0= 'private' )? otherlv_1= 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            {
            // InternalAls.g:1240:2: ( (otherlv_0= 'private' )? otherlv_1= 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            // InternalAls.g:1241:3: (otherlv_0= 'private' )? otherlv_1= 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_name_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) )
            {
            // InternalAls.g:1241:3: (otherlv_0= 'private' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAls.g:1242:4: otherlv_0= 'private'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPredDeclAccess().getPrivateKeyword_0());
                      			
                    }

                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPredDeclAccess().getPredKeyword_1());
              		
            }
            // InternalAls.g:1251:3: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==101) ) {
                    alt22=1;
                }
            }
            else if ( ((LA22_0>=53 && LA22_0<=55)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAls.g:1252:4: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // InternalAls.g:1252:4: ( (lv_ref_2_0= ruleRef ) )
                    // InternalAls.g:1253:5: (lv_ref_2_0= ruleRef )
                    {
                    // InternalAls.g:1253:5: (lv_ref_2_0= ruleRef )
                    // InternalAls.g:1254:6: lv_ref_2_0= ruleRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPredDeclAccess().getRefRefParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_ref_2_0=ruleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPredDeclRule());
                      						}
                      						set(
                      							current,
                      							"ref",
                      							lv_ref_2_0,
                      							"lang.formal.alloy.Als.Ref");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:1271:4: ( (lv_dot_3_0= ruleDot ) )
                    // InternalAls.g:1272:5: (lv_dot_3_0= ruleDot )
                    {
                    // InternalAls.g:1272:5: (lv_dot_3_0= ruleDot )
                    // InternalAls.g:1273:6: lv_dot_3_0= ruleDot
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPredDeclAccess().getDotDotParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_dot_3_0=ruleDot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPredDeclRule());
                      						}
                      						set(
                      							current,
                      							"dot",
                      							lv_dot_3_0,
                      							"lang.formal.alloy.Als.Dot");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:1291:3: ( (lv_name_4_0= rulePredicateName ) )
            // InternalAls.g:1292:4: (lv_name_4_0= rulePredicateName )
            {
            // InternalAls.g:1292:4: (lv_name_4_0= rulePredicateName )
            // InternalAls.g:1293:5: lv_name_4_0= rulePredicateName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredDeclAccess().getNamePredicateNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_name_4_0=rulePredicateName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredDeclRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_4_0,
              						"lang.formal.alloy.Als.PredicateName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:1310:3: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            else if ( (LA27_0==48) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // InternalAls.g:1311:4: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // InternalAls.g:1311:4: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    // InternalAls.g:1312:5: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // InternalAls.g:1312:5: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) )
                    // InternalAls.g:1313:6: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    {
                    // InternalAls.g:1313:6: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    // InternalAls.g:1314:7: lv_leftS_5_0= ruleLeftSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPredDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_4_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_20);
                    lv_leftS_5_0=ruleLeftSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPredDeclRule());
                      							}
                      							set(
                      								current,
                      								"leftS",
                      								lv_leftS_5_0,
                      								"lang.formal.alloy.Als.LeftSquareBracketKeyword");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAls.g:1331:5: ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID||LA24_0==25||LA24_0==57) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAls.g:1332:6: ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            {
                            // InternalAls.g:1332:6: ( (lv_decl_6_0= ruleDecl ) )
                            // InternalAls.g:1333:7: (lv_decl_6_0= ruleDecl )
                            {
                            // InternalAls.g:1333:7: (lv_decl_6_0= ruleDecl )
                            // InternalAls.g:1334:8: lv_decl_6_0= ruleDecl
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_8);
                            lv_decl_6_0=ruleDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPredDeclRule());
                              								}
                              								add(
                              									current,
                              									"decl",
                              									lv_decl_6_0,
                              									"lang.formal.alloy.Als.Decl");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalAls.g:1351:6: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==33) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalAls.g:1352:7: ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) )
                            	    {
                            	    // InternalAls.g:1352:7: ( (lv_comma_7_0= ruleComma ) )
                            	    // InternalAls.g:1353:8: (lv_comma_7_0= ruleComma )
                            	    {
                            	    // InternalAls.g:1353:8: (lv_comma_7_0= ruleComma )
                            	    // InternalAls.g:1354:9: lv_comma_7_0= ruleComma
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_0_1_1_0_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_comma_7_0=ruleComma();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getPredDeclRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"comma",
                            	      										lv_comma_7_0,
                            	      										"lang.formal.alloy.Als.Comma");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }

                            	    // InternalAls.g:1371:7: ( (lv_decl_8_0= ruleDecl ) )
                            	    // InternalAls.g:1372:8: (lv_decl_8_0= ruleDecl )
                            	    {
                            	    // InternalAls.g:1372:8: (lv_decl_8_0= ruleDecl )
                            	    // InternalAls.g:1373:9: lv_decl_8_0= ruleDecl
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_8);
                            	    lv_decl_8_0=ruleDecl();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getPredDeclRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"decl",
                            	      										lv_decl_8_0,
                            	      										"lang.formal.alloy.Als.Decl");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalAls.g:1392:5: ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    // InternalAls.g:1393:6: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    {
                    // InternalAls.g:1393:6: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    // InternalAls.g:1394:7: lv_rightS_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPredDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_4_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_16);
                    lv_rightS_9_0=ruleRightSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPredDeclRule());
                      							}
                      							set(
                      								current,
                      								"rightS",
                      								lv_rightS_9_0,
                      								"lang.formal.alloy.Als.RightSquareBracketKeyword");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:1413:4: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    {
                    // InternalAls.g:1413:4: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    // InternalAls.g:1414:5: ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    {
                    // InternalAls.g:1414:5: ( (lv_leftP_10_0= ruleLeftParenthesis ) )
                    // InternalAls.g:1415:6: (lv_leftP_10_0= ruleLeftParenthesis )
                    {
                    // InternalAls.g:1415:6: (lv_leftP_10_0= ruleLeftParenthesis )
                    // InternalAls.g:1416:7: lv_leftP_10_0= ruleLeftParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPredDeclAccess().getLeftPLeftParenthesisParserRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_leftP_10_0=ruleLeftParenthesis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPredDeclRule());
                      							}
                      							set(
                      								current,
                      								"leftP",
                      								lv_leftP_10_0,
                      								"lang.formal.alloy.Als.LeftParenthesis");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAls.g:1433:5: ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID||LA26_0==25||LA26_0==57) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAls.g:1434:6: ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            {
                            // InternalAls.g:1434:6: ( (lv_decl_11_0= ruleDecl ) )
                            // InternalAls.g:1435:7: (lv_decl_11_0= ruleDecl )
                            {
                            // InternalAls.g:1435:7: (lv_decl_11_0= ruleDecl )
                            // InternalAls.g:1436:8: lv_decl_11_0= ruleDecl
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_24);
                            lv_decl_11_0=ruleDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getPredDeclRule());
                              								}
                              								add(
                              									current,
                              									"decl",
                              									lv_decl_11_0,
                              									"lang.formal.alloy.Als.Decl");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalAls.g:1453:6: ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==33) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalAls.g:1454:7: ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) )
                            	    {
                            	    // InternalAls.g:1454:7: ( (lv_comma_12_0= ruleComma ) )
                            	    // InternalAls.g:1455:8: (lv_comma_12_0= ruleComma )
                            	    {
                            	    // InternalAls.g:1455:8: (lv_comma_12_0= ruleComma )
                            	    // InternalAls.g:1456:9: lv_comma_12_0= ruleComma
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_1_1_1_0_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_comma_12_0=ruleComma();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getPredDeclRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"comma",
                            	      										lv_comma_12_0,
                            	      										"lang.formal.alloy.Als.Comma");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }

                            	    // InternalAls.g:1473:7: ( (lv_decl_13_0= ruleDecl ) )
                            	    // InternalAls.g:1474:8: (lv_decl_13_0= ruleDecl )
                            	    {
                            	    // InternalAls.g:1474:8: (lv_decl_13_0= ruleDecl )
                            	    // InternalAls.g:1475:9: lv_decl_13_0= ruleDecl
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_24);
                            	    lv_decl_13_0=ruleDecl();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getPredDeclRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"decl",
                            	      										lv_decl_13_0,
                            	      										"lang.formal.alloy.Als.Decl");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


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

                    // InternalAls.g:1494:5: ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    // InternalAls.g:1495:6: (lv_rightP_14_0= ruleRightParenthesis )
                    {
                    // InternalAls.g:1495:6: (lv_rightP_14_0= ruleRightParenthesis )
                    // InternalAls.g:1496:7: lv_rightP_14_0= ruleRightParenthesis
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPredDeclAccess().getRightPRightParenthesisParserRuleCall_4_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_16);
                    lv_rightP_14_0=ruleRightParenthesis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPredDeclRule());
                      							}
                      							set(
                      								current,
                      								"rightP",
                      								lv_rightP_14_0,
                      								"lang.formal.alloy.Als.RightParenthesis");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:1515:3: ( (lv_block_15_0= ruleBlock ) )
            // InternalAls.g:1516:4: (lv_block_15_0= ruleBlock )
            {
            // InternalAls.g:1516:4: (lv_block_15_0= ruleBlock )
            // InternalAls.g:1517:5: lv_block_15_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredDeclAccess().getBlockBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_15_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredDeclRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_15_0,
              						"lang.formal.alloy.Als.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePredDecl"


    // $ANTLR start "entryRuleRunDecl"
    // InternalAls.g:1538:1: entryRuleRunDecl returns [EObject current=null] : iv_ruleRunDecl= ruleRunDecl EOF ;
    public final EObject entryRuleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunDecl = null;


        try {
            // InternalAls.g:1538:48: (iv_ruleRunDecl= ruleRunDecl EOF )
            // InternalAls.g:1539:2: iv_ruleRunDecl= ruleRunDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRunDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRunDecl=ruleRunDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRunDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRunDecl"


    // $ANTLR start "ruleRunDecl"
    // InternalAls.g:1545:1: ruleRunDecl returns [EObject current=null] : ( ( ( (lv_runName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'run' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleRunDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_runName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;



        	enterRule();

        try {
            // InternalAls.g:1551:2: ( ( ( ( (lv_runName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'run' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // InternalAls.g:1552:2: ( ( ( (lv_runName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'run' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // InternalAls.g:1552:2: ( ( ( (lv_runName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'run' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // InternalAls.g:1553:3: ( ( (lv_runName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'run' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // InternalAls.g:1553:3: ( ( (lv_runName_0_0= ruleAlias ) ) otherlv_1= ':' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAls.g:1554:4: ( (lv_runName_0_0= ruleAlias ) ) otherlv_1= ':'
                    {
                    // InternalAls.g:1554:4: ( (lv_runName_0_0= ruleAlias ) )
                    // InternalAls.g:1555:5: (lv_runName_0_0= ruleAlias )
                    {
                    // InternalAls.g:1555:5: (lv_runName_0_0= ruleAlias )
                    // InternalAls.g:1556:6: lv_runName_0_0= ruleAlias
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRunDeclAccess().getRunNameAliasParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_runName_0_0=ruleAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRunDeclRule());
                      						}
                      						set(
                      							current,
                      							"runName",
                      							lv_runName_0_0,
                      							"lang.formal.alloy.Als.Alias");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRunDeclAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRunDeclAccess().getRunKeyword_1());
              		
            }
            // InternalAls.g:1582:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==32) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAls.g:1583:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalAls.g:1583:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAls.g:1584:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAls.g:1584:5: (otherlv_3= RULE_ID )
                    // InternalAls.g:1585:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRunDeclRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getRunDeclAccess().getNamePredicateNameCrossReference_2_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:1600:4: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // InternalAls.g:1600:4: ( (lv_block_4_0= ruleBlock ) )
                    // InternalAls.g:1601:5: (lv_block_4_0= ruleBlock )
                    {
                    // InternalAls.g:1601:5: (lv_block_4_0= ruleBlock )
                    // InternalAls.g:1602:6: lv_block_4_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRunDeclAccess().getBlockBlockParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_block_4_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRunDeclRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_4_0,
                      							"lang.formal.alloy.Als.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:1620:3: ( (lv_scope_5_0= ruleScope ) )
            // InternalAls.g:1621:4: (lv_scope_5_0= ruleScope )
            {
            // InternalAls.g:1621:4: (lv_scope_5_0= ruleScope )
            // InternalAls.g:1622:5: lv_scope_5_0= ruleScope
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRunDeclAccess().getScopeScopeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_scope_5_0=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRunDeclRule());
              					}
              					set(
              						current,
              						"scope",
              						lv_scope_5_0,
              						"lang.formal.alloy.Als.Scope");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRunDecl"


    // $ANTLR start "entryRuleCheckDecl"
    // InternalAls.g:1643:1: entryRuleCheckDecl returns [EObject current=null] : iv_ruleCheckDecl= ruleCheckDecl EOF ;
    public final EObject entryRuleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckDecl = null;


        try {
            // InternalAls.g:1643:50: (iv_ruleCheckDecl= ruleCheckDecl EOF )
            // InternalAls.g:1644:2: iv_ruleCheckDecl= ruleCheckDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCheckDecl=ruleCheckDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCheckDecl"


    // $ANTLR start "ruleCheckDecl"
    // InternalAls.g:1650:1: ruleCheckDecl returns [EObject current=null] : ( ( ( (lv_checkName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'check' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleCheckDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_checkName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;



        	enterRule();

        try {
            // InternalAls.g:1656:2: ( ( ( ( (lv_checkName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'check' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // InternalAls.g:1657:2: ( ( ( (lv_checkName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'check' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // InternalAls.g:1657:2: ( ( ( (lv_checkName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'check' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // InternalAls.g:1658:3: ( ( (lv_checkName_0_0= ruleAlias ) ) otherlv_1= ':' )? otherlv_2= 'check' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // InternalAls.g:1658:3: ( ( (lv_checkName_0_0= ruleAlias ) ) otherlv_1= ':' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAls.g:1659:4: ( (lv_checkName_0_0= ruleAlias ) ) otherlv_1= ':'
                    {
                    // InternalAls.g:1659:4: ( (lv_checkName_0_0= ruleAlias ) )
                    // InternalAls.g:1660:5: (lv_checkName_0_0= ruleAlias )
                    {
                    // InternalAls.g:1660:5: (lv_checkName_0_0= ruleAlias )
                    // InternalAls.g:1661:6: lv_checkName_0_0= ruleAlias
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCheckDeclAccess().getCheckNameAliasParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_checkName_0_0=ruleAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCheckDeclRule());
                      						}
                      						set(
                      							current,
                      							"checkName",
                      							lv_checkName_0_0,
                      							"lang.formal.alloy.Als.Alias");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCheckDeclAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCheckDeclAccess().getCheckKeyword_1());
              		
            }
            // InternalAls.g:1687:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==32) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalAls.g:1688:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalAls.g:1688:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAls.g:1689:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAls.g:1689:5: (otherlv_3= RULE_ID )
                    // InternalAls.g:1690:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCheckDeclRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getCheckDeclAccess().getNameAssertionNameCrossReference_2_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:1705:4: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // InternalAls.g:1705:4: ( (lv_block_4_0= ruleBlock ) )
                    // InternalAls.g:1706:5: (lv_block_4_0= ruleBlock )
                    {
                    // InternalAls.g:1706:5: (lv_block_4_0= ruleBlock )
                    // InternalAls.g:1707:6: lv_block_4_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCheckDeclAccess().getBlockBlockParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_block_4_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCheckDeclRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_4_0,
                      							"lang.formal.alloy.Als.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:1725:3: ( (lv_scope_5_0= ruleScope ) )
            // InternalAls.g:1726:4: (lv_scope_5_0= ruleScope )
            {
            // InternalAls.g:1726:4: (lv_scope_5_0= ruleScope )
            // InternalAls.g:1727:5: lv_scope_5_0= ruleScope
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCheckDeclAccess().getScopeScopeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_scope_5_0=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCheckDeclRule());
              					}
              					set(
              						current,
              						"scope",
              						lv_scope_5_0,
              						"lang.formal.alloy.Als.Scope");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCheckDecl"


    // $ANTLR start "entryRuleScope"
    // InternalAls.g:1748:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalAls.g:1748:46: (iv_ruleScope= ruleScope EOF )
            // InternalAls.g:1749:2: iv_ruleScope= ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalAls.g:1755:1: ruleScope returns [EObject current=null] : ( ( () ( (lv_for_1_0= 'for' ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () ( (lv_for_5_0= 'for' ) ) ( (lv_value_6_0= RULE_INT ) ) ( (lv_but_7_0= 'but' ) ) ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () ( (lv_for_13_0= 'for' ) ) ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_for_1_0=null;
        Token lv_value_2_0=null;
        Token lv_for_5_0=null;
        Token lv_value_6_0=null;
        Token lv_but_7_0=null;
        Token lv_for_13_0=null;
        EObject lv_expect_3_0 = null;

        EObject lv_typescope_8_0 = null;

        EObject lv_comma_9_0 = null;

        EObject lv_typescope_10_0 = null;

        EObject lv_expect_11_0 = null;

        EObject lv_typescope_14_0 = null;

        EObject lv_comma_15_0 = null;

        EObject lv_typescope_16_0 = null;

        EObject lv_expect_17_0 = null;

        EObject lv_expect_19_0 = null;



        	enterRule();

        try {
            // InternalAls.g:1761:2: ( ( ( () ( (lv_for_1_0= 'for' ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () ( (lv_for_5_0= 'for' ) ) ( (lv_value_6_0= RULE_INT ) ) ( (lv_but_7_0= 'but' ) ) ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () ( (lv_for_13_0= 'for' ) ) ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) )
            // InternalAls.g:1762:2: ( ( () ( (lv_for_1_0= 'for' ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () ( (lv_for_5_0= 'for' ) ) ( (lv_value_6_0= RULE_INT ) ) ( (lv_but_7_0= 'but' ) ) ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () ( (lv_for_13_0= 'for' ) ) ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            {
            // InternalAls.g:1762:2: ( ( () ( (lv_for_1_0= 'for' ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () ( (lv_for_5_0= 'for' ) ) ( (lv_value_6_0= RULE_INT ) ) ( (lv_but_7_0= 'but' ) ) ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () ( (lv_for_13_0= 'for' ) ) ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            int alt38=4;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalAls.g:1763:3: ( () ( (lv_for_1_0= 'for' ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_expect_3_0= ruleExpectation ) )? )
                    {
                    // InternalAls.g:1763:3: ( () ( (lv_for_1_0= 'for' ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_expect_3_0= ruleExpectation ) )? )
                    // InternalAls.g:1764:4: () ( (lv_for_1_0= 'for' ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_expect_3_0= ruleExpectation ) )?
                    {
                    // InternalAls.g:1764:4: ()
                    // InternalAls.g:1765:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScopeAccess().getScopeAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:1774:4: ( (lv_for_1_0= 'for' ) )
                    // InternalAls.g:1775:5: (lv_for_1_0= 'for' )
                    {
                    // InternalAls.g:1775:5: (lv_for_1_0= 'for' )
                    // InternalAls.g:1776:6: lv_for_1_0= 'for'
                    {
                    lv_for_1_0=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_for_1_0, grammarAccess.getScopeAccess().getForForKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getScopeRule());
                      						}
                      						setWithLastConsumed(current, "for", lv_for_1_0, "for");
                      					
                    }

                    }


                    }

                    // InternalAls.g:1788:4: ( (lv_value_2_0= RULE_INT ) )
                    // InternalAls.g:1789:5: (lv_value_2_0= RULE_INT )
                    {
                    // InternalAls.g:1789:5: (lv_value_2_0= RULE_INT )
                    // InternalAls.g:1790:6: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getScopeAccess().getValueINTTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getScopeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    // InternalAls.g:1806:4: ( (lv_expect_3_0= ruleExpectation ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==24) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalAls.g:1807:5: (lv_expect_3_0= ruleExpectation )
                            {
                            // InternalAls.g:1807:5: (lv_expect_3_0= ruleExpectation )
                            // InternalAls.g:1808:6: lv_expect_3_0= ruleExpectation
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_0_3_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_expect_3_0=ruleExpectation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getScopeRule());
                              						}
                              						set(
                              							current,
                              							"expect",
                              							lv_expect_3_0,
                              							"lang.formal.alloy.Als.Expectation");
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
                    // InternalAls.g:1827:3: ( () ( (lv_for_5_0= 'for' ) ) ( (lv_value_6_0= RULE_INT ) ) ( (lv_but_7_0= 'but' ) ) ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    {
                    // InternalAls.g:1827:3: ( () ( (lv_for_5_0= 'for' ) ) ( (lv_value_6_0= RULE_INT ) ) ( (lv_but_7_0= 'but' ) ) ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    // InternalAls.g:1828:4: () ( (lv_for_5_0= 'for' ) ) ( (lv_value_6_0= RULE_INT ) ) ( (lv_but_7_0= 'but' ) ) ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )?
                    {
                    // InternalAls.g:1828:4: ()
                    // InternalAls.g:1829:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScopeAccess().getScopeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:1838:4: ( (lv_for_5_0= 'for' ) )
                    // InternalAls.g:1839:5: (lv_for_5_0= 'for' )
                    {
                    // InternalAls.g:1839:5: (lv_for_5_0= 'for' )
                    // InternalAls.g:1840:6: lv_for_5_0= 'for'
                    {
                    lv_for_5_0=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_for_5_0, grammarAccess.getScopeAccess().getForForKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getScopeRule());
                      						}
                      						setWithLastConsumed(current, "for", lv_for_5_0, "for");
                      					
                    }

                    }


                    }

                    // InternalAls.g:1852:4: ( (lv_value_6_0= RULE_INT ) )
                    // InternalAls.g:1853:5: (lv_value_6_0= RULE_INT )
                    {
                    // InternalAls.g:1853:5: (lv_value_6_0= RULE_INT )
                    // InternalAls.g:1854:6: lv_value_6_0= RULE_INT
                    {
                    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_6_0, grammarAccess.getScopeAccess().getValueINTTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getScopeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_6_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    // InternalAls.g:1870:4: ( (lv_but_7_0= 'but' ) )
                    // InternalAls.g:1871:5: (lv_but_7_0= 'but' )
                    {
                    // InternalAls.g:1871:5: (lv_but_7_0= 'but' )
                    // InternalAls.g:1872:6: lv_but_7_0= 'but'
                    {
                    lv_but_7_0=(Token)match(input,23,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_but_7_0, grammarAccess.getScopeAccess().getButButKeyword_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getScopeRule());
                      						}
                      						setWithLastConsumed(current, "but", lv_but_7_0, "but");
                      					
                    }

                    }


                    }

                    // InternalAls.g:1884:4: ( (lv_typescope_8_0= ruleTypescope ) )
                    // InternalAls.g:1885:5: (lv_typescope_8_0= ruleTypescope )
                    {
                    // InternalAls.g:1885:5: (lv_typescope_8_0= ruleTypescope )
                    // InternalAls.g:1886:6: lv_typescope_8_0= ruleTypescope
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_typescope_8_0=ruleTypescope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getScopeRule());
                      						}
                      						add(
                      							current,
                      							"typescope",
                      							lv_typescope_8_0,
                      							"lang.formal.alloy.Als.Typescope");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:1903:4: ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==33) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalAls.g:1904:5: ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) )
                    	    {
                    	    // InternalAls.g:1904:5: ( (lv_comma_9_0= ruleComma ) )
                    	    // InternalAls.g:1905:6: (lv_comma_9_0= ruleComma )
                    	    {
                    	    // InternalAls.g:1905:6: (lv_comma_9_0= ruleComma )
                    	    // InternalAls.g:1906:7: lv_comma_9_0= ruleComma
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_1_5_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_comma_9_0=ruleComma();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getScopeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"comma",
                    	      								lv_comma_9_0,
                    	      								"lang.formal.alloy.Als.Comma");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalAls.g:1923:5: ( (lv_typescope_10_0= ruleTypescope ) )
                    	    // InternalAls.g:1924:6: (lv_typescope_10_0= ruleTypescope )
                    	    {
                    	    // InternalAls.g:1924:6: (lv_typescope_10_0= ruleTypescope )
                    	    // InternalAls.g:1925:7: lv_typescope_10_0= ruleTypescope
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_5_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_typescope_10_0=ruleTypescope();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getScopeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"typescope",
                    	      								lv_typescope_10_0,
                    	      								"lang.formal.alloy.Als.Typescope");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    // InternalAls.g:1943:4: ( (lv_expect_11_0= ruleExpectation ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==24) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAls.g:1944:5: (lv_expect_11_0= ruleExpectation )
                            {
                            // InternalAls.g:1944:5: (lv_expect_11_0= ruleExpectation )
                            // InternalAls.g:1945:6: lv_expect_11_0= ruleExpectation
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_1_6_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_expect_11_0=ruleExpectation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getScopeRule());
                              						}
                              						set(
                              							current,
                              							"expect",
                              							lv_expect_11_0,
                              							"lang.formal.alloy.Als.Expectation");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAls.g:1964:3: ( () ( (lv_for_13_0= 'for' ) ) ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    {
                    // InternalAls.g:1964:3: ( () ( (lv_for_13_0= 'for' ) ) ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    // InternalAls.g:1965:4: () ( (lv_for_13_0= 'for' ) ) ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )?
                    {
                    // InternalAls.g:1965:4: ()
                    // InternalAls.g:1966:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScopeAccess().getScopeAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:1975:4: ( (lv_for_13_0= 'for' ) )
                    // InternalAls.g:1976:5: (lv_for_13_0= 'for' )
                    {
                    // InternalAls.g:1976:5: (lv_for_13_0= 'for' )
                    // InternalAls.g:1977:6: lv_for_13_0= 'for'
                    {
                    lv_for_13_0=(Token)match(input,22,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_for_13_0, grammarAccess.getScopeAccess().getForForKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getScopeRule());
                      						}
                      						setWithLastConsumed(current, "for", lv_for_13_0, "for");
                      					
                    }

                    }


                    }

                    // InternalAls.g:1989:4: ( (lv_typescope_14_0= ruleTypescope ) )
                    // InternalAls.g:1990:5: (lv_typescope_14_0= ruleTypescope )
                    {
                    // InternalAls.g:1990:5: (lv_typescope_14_0= ruleTypescope )
                    // InternalAls.g:1991:6: lv_typescope_14_0= ruleTypescope
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_typescope_14_0=ruleTypescope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getScopeRule());
                      						}
                      						add(
                      							current,
                      							"typescope",
                      							lv_typescope_14_0,
                      							"lang.formal.alloy.Als.Typescope");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:2008:4: ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==33) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAls.g:2009:5: ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) )
                    	    {
                    	    // InternalAls.g:2009:5: ( (lv_comma_15_0= ruleComma ) )
                    	    // InternalAls.g:2010:6: (lv_comma_15_0= ruleComma )
                    	    {
                    	    // InternalAls.g:2010:6: (lv_comma_15_0= ruleComma )
                    	    // InternalAls.g:2011:7: lv_comma_15_0= ruleComma
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_2_3_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_comma_15_0=ruleComma();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getScopeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"comma",
                    	      								lv_comma_15_0,
                    	      								"lang.formal.alloy.Als.Comma");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalAls.g:2028:5: ( (lv_typescope_16_0= ruleTypescope ) )
                    	    // InternalAls.g:2029:6: (lv_typescope_16_0= ruleTypescope )
                    	    {
                    	    // InternalAls.g:2029:6: (lv_typescope_16_0= ruleTypescope )
                    	    // InternalAls.g:2030:7: lv_typescope_16_0= ruleTypescope
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_typescope_16_0=ruleTypescope();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getScopeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"typescope",
                    	      								lv_typescope_16_0,
                    	      								"lang.formal.alloy.Als.Typescope");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // InternalAls.g:2048:4: ( (lv_expect_17_0= ruleExpectation ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==24) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAls.g:2049:5: (lv_expect_17_0= ruleExpectation )
                            {
                            // InternalAls.g:2049:5: (lv_expect_17_0= ruleExpectation )
                            // InternalAls.g:2050:6: lv_expect_17_0= ruleExpectation
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_2_4_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_expect_17_0=ruleExpectation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getScopeRule());
                              						}
                              						set(
                              							current,
                              							"expect",
                              							lv_expect_17_0,
                              							"lang.formal.alloy.Als.Expectation");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAls.g:2069:3: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    {
                    // InternalAls.g:2069:3: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    // InternalAls.g:2070:4: () ( (lv_expect_19_0= ruleExpectation ) )?
                    {
                    // InternalAls.g:2070:4: ()
                    // InternalAls.g:2071:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScopeAccess().getScopeAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:2080:4: ( (lv_expect_19_0= ruleExpectation ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==24) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalAls.g:2081:5: (lv_expect_19_0= ruleExpectation )
                            {
                            // InternalAls.g:2081:5: (lv_expect_19_0= ruleExpectation )
                            // InternalAls.g:2082:6: lv_expect_19_0= ruleExpectation
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_3_1_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_expect_19_0=ruleExpectation();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getScopeRule());
                              						}
                              						set(
                              							current,
                              							"expect",
                              							lv_expect_19_0,
                              							"lang.formal.alloy.Als.Expectation");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleExpectation"
    // InternalAls.g:2104:1: entryRuleExpectation returns [EObject current=null] : iv_ruleExpectation= ruleExpectation EOF ;
    public final EObject entryRuleExpectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectation = null;


        try {
            // InternalAls.g:2104:52: (iv_ruleExpectation= ruleExpectation EOF )
            // InternalAls.g:2105:2: iv_ruleExpectation= ruleExpectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpectationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpectation=ruleExpectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpectation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpectation"


    // $ANTLR start "ruleExpectation"
    // InternalAls.g:2111:1: ruleExpectation returns [EObject current=null] : ( ( (lv_expect_0_0= 'expect' ) ) ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleExpectation() throws RecognitionException {
        EObject current = null;

        Token lv_expect_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAls.g:2117:2: ( ( ( (lv_expect_0_0= 'expect' ) ) ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalAls.g:2118:2: ( ( (lv_expect_0_0= 'expect' ) ) ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalAls.g:2118:2: ( ( (lv_expect_0_0= 'expect' ) ) ( (lv_value_1_0= RULE_INT ) ) )
            // InternalAls.g:2119:3: ( (lv_expect_0_0= 'expect' ) ) ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalAls.g:2119:3: ( (lv_expect_0_0= 'expect' ) )
            // InternalAls.g:2120:4: (lv_expect_0_0= 'expect' )
            {
            // InternalAls.g:2120:4: (lv_expect_0_0= 'expect' )
            // InternalAls.g:2121:5: lv_expect_0_0= 'expect'
            {
            lv_expect_0_0=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_expect_0_0, grammarAccess.getExpectationAccess().getExpectExpectKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExpectationRule());
              					}
              					setWithLastConsumed(current, "expect", lv_expect_0_0, "expect");
              				
            }

            }


            }

            // InternalAls.g:2133:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalAls.g:2134:4: (lv_value_1_0= RULE_INT )
            {
            // InternalAls.g:2134:4: (lv_value_1_0= RULE_INT )
            // InternalAls.g:2135:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getExpectationAccess().getValueINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExpectationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpectation"


    // $ANTLR start "entryRuleTypescope"
    // InternalAls.g:2155:1: entryRuleTypescope returns [EObject current=null] : iv_ruleTypescope= ruleTypescope EOF ;
    public final EObject entryRuleTypescope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypescope = null;


        try {
            // InternalAls.g:2155:50: (iv_ruleTypescope= ruleTypescope EOF )
            // InternalAls.g:2156:2: iv_ruleTypescope= ruleTypescope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypescopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypescope=ruleTypescope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypescope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypescope"


    // $ANTLR start "ruleTypescope"
    // InternalAls.g:2162:1: ruleTypescope returns [EObject current=null] : ( () ( (lv_exactly_1_0= 'exactly' ) )? ( (lv_value_2_0= RULE_INT ) ) ( ( ( (lv_asname_3_0= ruleAsName ) ) | ( (lv_prev_4_0= 'fun' ) ) | ( (lv_prev_5_0= 'pred' ) ) | ( (lv_prev_6_0= 'this' ) ) ) ( (lv_sl_7_0= '/' ) ) )? ( ( (otherlv_8= RULE_ID ) ) | ( ( (lv_post_9_0= 'int' ) ) | ( (lv_post_10_0= 'seq' ) ) ) ) ) ;
    public final EObject ruleTypescope() throws RecognitionException {
        EObject current = null;

        Token lv_exactly_1_0=null;
        Token lv_value_2_0=null;
        Token lv_prev_4_0=null;
        Token lv_prev_5_0=null;
        Token lv_prev_6_0=null;
        Token lv_sl_7_0=null;
        Token otherlv_8=null;
        Token lv_post_9_0=null;
        Token lv_post_10_0=null;
        EObject lv_asname_3_0 = null;



        	enterRule();

        try {
            // InternalAls.g:2168:2: ( ( () ( (lv_exactly_1_0= 'exactly' ) )? ( (lv_value_2_0= RULE_INT ) ) ( ( ( (lv_asname_3_0= ruleAsName ) ) | ( (lv_prev_4_0= 'fun' ) ) | ( (lv_prev_5_0= 'pred' ) ) | ( (lv_prev_6_0= 'this' ) ) ) ( (lv_sl_7_0= '/' ) ) )? ( ( (otherlv_8= RULE_ID ) ) | ( ( (lv_post_9_0= 'int' ) ) | ( (lv_post_10_0= 'seq' ) ) ) ) ) )
            // InternalAls.g:2169:2: ( () ( (lv_exactly_1_0= 'exactly' ) )? ( (lv_value_2_0= RULE_INT ) ) ( ( ( (lv_asname_3_0= ruleAsName ) ) | ( (lv_prev_4_0= 'fun' ) ) | ( (lv_prev_5_0= 'pred' ) ) | ( (lv_prev_6_0= 'this' ) ) ) ( (lv_sl_7_0= '/' ) ) )? ( ( (otherlv_8= RULE_ID ) ) | ( ( (lv_post_9_0= 'int' ) ) | ( (lv_post_10_0= 'seq' ) ) ) ) )
            {
            // InternalAls.g:2169:2: ( () ( (lv_exactly_1_0= 'exactly' ) )? ( (lv_value_2_0= RULE_INT ) ) ( ( ( (lv_asname_3_0= ruleAsName ) ) | ( (lv_prev_4_0= 'fun' ) ) | ( (lv_prev_5_0= 'pred' ) ) | ( (lv_prev_6_0= 'this' ) ) ) ( (lv_sl_7_0= '/' ) ) )? ( ( (otherlv_8= RULE_ID ) ) | ( ( (lv_post_9_0= 'int' ) ) | ( (lv_post_10_0= 'seq' ) ) ) ) )
            // InternalAls.g:2170:3: () ( (lv_exactly_1_0= 'exactly' ) )? ( (lv_value_2_0= RULE_INT ) ) ( ( ( (lv_asname_3_0= ruleAsName ) ) | ( (lv_prev_4_0= 'fun' ) ) | ( (lv_prev_5_0= 'pred' ) ) | ( (lv_prev_6_0= 'this' ) ) ) ( (lv_sl_7_0= '/' ) ) )? ( ( (otherlv_8= RULE_ID ) ) | ( ( (lv_post_9_0= 'int' ) ) | ( (lv_post_10_0= 'seq' ) ) ) )
            {
            // InternalAls.g:2170:3: ()
            // InternalAls.g:2171:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTypescopeAccess().getTypescopeAction_0(),
              					current);
              			
            }

            }

            // InternalAls.g:2180:3: ( (lv_exactly_1_0= 'exactly' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAls.g:2181:4: (lv_exactly_1_0= 'exactly' )
                    {
                    // InternalAls.g:2181:4: (lv_exactly_1_0= 'exactly' )
                    // InternalAls.g:2182:5: lv_exactly_1_0= 'exactly'
                    {
                    lv_exactly_1_0=(Token)match(input,13,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_exactly_1_0, grammarAccess.getTypescopeAccess().getExactlyExactlyKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTypescopeRule());
                      					}
                      					setWithLastConsumed(current, "exactly", lv_exactly_1_0, "exactly");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAls.g:2194:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalAls.g:2195:4: (lv_value_2_0= RULE_INT )
            {
            // InternalAls.g:2195:4: (lv_value_2_0= RULE_INT )
            // InternalAls.g:2196:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getTypescopeAccess().getValueINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypescopeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalAls.g:2212:3: ( ( ( (lv_asname_3_0= ruleAsName ) ) | ( (lv_prev_4_0= 'fun' ) ) | ( (lv_prev_5_0= 'pred' ) ) | ( (lv_prev_6_0= 'this' ) ) ) ( (lv_sl_7_0= '/' ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==14) ) {
                    alt41=1;
                }
            }
            else if ( (LA41_0==16||LA41_0==18||LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAls.g:2213:4: ( ( (lv_asname_3_0= ruleAsName ) ) | ( (lv_prev_4_0= 'fun' ) ) | ( (lv_prev_5_0= 'pred' ) ) | ( (lv_prev_6_0= 'this' ) ) ) ( (lv_sl_7_0= '/' ) )
                    {
                    // InternalAls.g:2213:4: ( ( (lv_asname_3_0= ruleAsName ) ) | ( (lv_prev_4_0= 'fun' ) ) | ( (lv_prev_5_0= 'pred' ) ) | ( (lv_prev_6_0= 'this' ) ) )
                    int alt40=4;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt40=1;
                        }
                        break;
                    case 16:
                        {
                        alt40=2;
                        }
                        break;
                    case 18:
                        {
                        alt40=3;
                        }
                        break;
                    case 25:
                        {
                        alt40=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // InternalAls.g:2214:5: ( (lv_asname_3_0= ruleAsName ) )
                            {
                            // InternalAls.g:2214:5: ( (lv_asname_3_0= ruleAsName ) )
                            // InternalAls.g:2215:6: (lv_asname_3_0= ruleAsName )
                            {
                            // InternalAls.g:2215:6: (lv_asname_3_0= ruleAsName )
                            // InternalAls.g:2216:7: lv_asname_3_0= ruleAsName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypescopeAccess().getAsnameAsNameParserRuleCall_3_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_13);
                            lv_asname_3_0=ruleAsName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypescopeRule());
                              							}
                              							set(
                              								current,
                              								"asname",
                              								lv_asname_3_0,
                              								"lang.formal.alloy.Als.AsName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAls.g:2234:5: ( (lv_prev_4_0= 'fun' ) )
                            {
                            // InternalAls.g:2234:5: ( (lv_prev_4_0= 'fun' ) )
                            // InternalAls.g:2235:6: (lv_prev_4_0= 'fun' )
                            {
                            // InternalAls.g:2235:6: (lv_prev_4_0= 'fun' )
                            // InternalAls.g:2236:7: lv_prev_4_0= 'fun'
                            {
                            lv_prev_4_0=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prev_4_0, grammarAccess.getTypescopeAccess().getPrevFunKeyword_3_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypescopeRule());
                              							}
                              							setWithLastConsumed(current, "prev", lv_prev_4_0, "fun");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAls.g:2249:5: ( (lv_prev_5_0= 'pred' ) )
                            {
                            // InternalAls.g:2249:5: ( (lv_prev_5_0= 'pred' ) )
                            // InternalAls.g:2250:6: (lv_prev_5_0= 'pred' )
                            {
                            // InternalAls.g:2250:6: (lv_prev_5_0= 'pred' )
                            // InternalAls.g:2251:7: lv_prev_5_0= 'pred'
                            {
                            lv_prev_5_0=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prev_5_0, grammarAccess.getTypescopeAccess().getPrevPredKeyword_3_0_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypescopeRule());
                              							}
                              							setWithLastConsumed(current, "prev", lv_prev_5_0, "pred");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalAls.g:2264:5: ( (lv_prev_6_0= 'this' ) )
                            {
                            // InternalAls.g:2264:5: ( (lv_prev_6_0= 'this' ) )
                            // InternalAls.g:2265:6: (lv_prev_6_0= 'this' )
                            {
                            // InternalAls.g:2265:6: (lv_prev_6_0= 'this' )
                            // InternalAls.g:2266:7: lv_prev_6_0= 'this'
                            {
                            lv_prev_6_0=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prev_6_0, grammarAccess.getTypescopeAccess().getPrevThisKeyword_3_0_3_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypescopeRule());
                              							}
                              							setWithLastConsumed(current, "prev", lv_prev_6_0, "this");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalAls.g:2279:4: ( (lv_sl_7_0= '/' ) )
                    // InternalAls.g:2280:5: (lv_sl_7_0= '/' )
                    {
                    // InternalAls.g:2280:5: (lv_sl_7_0= '/' )
                    // InternalAls.g:2281:6: lv_sl_7_0= '/'
                    {
                    lv_sl_7_0=(Token)match(input,14,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_sl_7_0, grammarAccess.getTypescopeAccess().getSlSolidusKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypescopeRule());
                      						}
                      						setWithLastConsumed(current, "sl", lv_sl_7_0, "/");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:2294:3: ( ( (otherlv_8= RULE_ID ) ) | ( ( (lv_post_9_0= 'int' ) ) | ( (lv_post_10_0= 'seq' ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=26 && LA43_0<=27)) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalAls.g:2295:4: ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalAls.g:2295:4: ( (otherlv_8= RULE_ID ) )
                    // InternalAls.g:2296:5: (otherlv_8= RULE_ID )
                    {
                    // InternalAls.g:2296:5: (otherlv_8= RULE_ID )
                    // InternalAls.g:2297:6: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypescopeRule());
                      						}
                      					
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getTypescopeAccess().getNameReferencesNameCrossReference_4_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:2312:4: ( ( (lv_post_9_0= 'int' ) ) | ( (lv_post_10_0= 'seq' ) ) )
                    {
                    // InternalAls.g:2312:4: ( ( (lv_post_9_0= 'int' ) ) | ( (lv_post_10_0= 'seq' ) ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==26) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==27) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalAls.g:2313:5: ( (lv_post_9_0= 'int' ) )
                            {
                            // InternalAls.g:2313:5: ( (lv_post_9_0= 'int' ) )
                            // InternalAls.g:2314:6: (lv_post_9_0= 'int' )
                            {
                            // InternalAls.g:2314:6: (lv_post_9_0= 'int' )
                            // InternalAls.g:2315:7: lv_post_9_0= 'int'
                            {
                            lv_post_9_0=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_post_9_0, grammarAccess.getTypescopeAccess().getPostIntKeyword_4_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypescopeRule());
                              							}
                              							setWithLastConsumed(current, "post", lv_post_9_0, "int");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAls.g:2328:5: ( (lv_post_10_0= 'seq' ) )
                            {
                            // InternalAls.g:2328:5: ( (lv_post_10_0= 'seq' ) )
                            // InternalAls.g:2329:6: (lv_post_10_0= 'seq' )
                            {
                            // InternalAls.g:2329:6: (lv_post_10_0= 'seq' )
                            // InternalAls.g:2330:7: lv_post_10_0= 'seq'
                            {
                            lv_post_10_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_post_10_0, grammarAccess.getTypescopeAccess().getPostSeqKeyword_4_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypescopeRule());
                              							}
                              							setWithLastConsumed(current, "post", lv_post_10_0, "seq");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypescope"


    // $ANTLR start "entryRuleEnumDecl"
    // InternalAls.g:2348:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // InternalAls.g:2348:49: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // InternalAls.g:2349:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumDecl=ruleEnumDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumDecl"


    // $ANTLR start "ruleEnumDecl"
    // InternalAls.g:2355:1: ruleEnumDecl returns [EObject current=null] : ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) ;
    public final EObject ruleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_enumName_0_0 = null;

        EObject lv_leftC_1_0 = null;

        EObject lv_propertyEnum_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_propertyEnum_4_0 = null;

        EObject lv_rightC_5_0 = null;



        	enterRule();

        try {
            // InternalAls.g:2361:2: ( ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) )
            // InternalAls.g:2362:2: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            {
            // InternalAls.g:2362:2: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            // InternalAls.g:2363:3: ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            {
            // InternalAls.g:2363:3: ( (lv_enumName_0_0= ruleEnumName ) )
            // InternalAls.g:2364:4: (lv_enumName_0_0= ruleEnumName )
            {
            // InternalAls.g:2364:4: (lv_enumName_0_0= ruleEnumName )
            // InternalAls.g:2365:5: lv_enumName_0_0= ruleEnumName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumDeclAccess().getEnumNameEnumNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_enumName_0_0=ruleEnumName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumDeclRule());
              					}
              					set(
              						current,
              						"enumName",
              						lv_enumName_0_0,
              						"lang.formal.alloy.Als.EnumName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:2382:3: ( (lv_leftC_1_0= ruleLeftCurlyBracket ) )
            // InternalAls.g:2383:4: (lv_leftC_1_0= ruleLeftCurlyBracket )
            {
            // InternalAls.g:2383:4: (lv_leftC_1_0= ruleLeftCurlyBracket )
            // InternalAls.g:2384:5: lv_leftC_1_0= ruleLeftCurlyBracket
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumDeclAccess().getLeftCLeftCurlyBracketParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_leftC_1_0=ruleLeftCurlyBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumDeclRule());
              					}
              					set(
              						current,
              						"leftC",
              						lv_leftC_1_0,
              						"lang.formal.alloy.Als.LeftCurlyBracket");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:2401:3: ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) )
            // InternalAls.g:2402:4: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            {
            // InternalAls.g:2402:4: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            // InternalAls.g:2403:5: lv_propertyEnum_2_0= ruleEnumPropertyName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_propertyEnum_2_0=ruleEnumPropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumDeclRule());
              					}
              					add(
              						current,
              						"propertyEnum",
              						lv_propertyEnum_2_0,
              						"lang.formal.alloy.Als.EnumPropertyName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:2420:3: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==33) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAls.g:2421:4: ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    {
            	    // InternalAls.g:2421:4: ( (lv_comma_3_0= ruleComma ) )
            	    // InternalAls.g:2422:5: (lv_comma_3_0= ruleComma )
            	    {
            	    // InternalAls.g:2422:5: (lv_comma_3_0= ruleComma )
            	    // InternalAls.g:2423:6: lv_comma_3_0= ruleComma
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumDeclAccess().getCommaCommaParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_comma_3_0=ruleComma();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumDeclRule());
            	      						}
            	      						add(
            	      							current,
            	      							"comma",
            	      							lv_comma_3_0,
            	      							"lang.formal.alloy.Als.Comma");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalAls.g:2440:4: ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    // InternalAls.g:2441:5: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    {
            	    // InternalAls.g:2441:5: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    // InternalAls.g:2442:6: lv_propertyEnum_4_0= ruleEnumPropertyName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_propertyEnum_4_0=ruleEnumPropertyName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumDeclRule());
            	      						}
            	      						add(
            	      							current,
            	      							"propertyEnum",
            	      							lv_propertyEnum_4_0,
            	      							"lang.formal.alloy.Als.EnumPropertyName");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalAls.g:2460:3: ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            // InternalAls.g:2461:4: (lv_rightC_5_0= ruleRightCurlyBracket )
            {
            // InternalAls.g:2461:4: (lv_rightC_5_0= ruleRightCurlyBracket )
            // InternalAls.g:2462:5: lv_rightC_5_0= ruleRightCurlyBracket
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumDeclAccess().getRightCRightCurlyBracketParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rightC_5_0=ruleRightCurlyBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumDeclRule());
              					}
              					set(
              						current,
              						"rightC",
              						lv_rightC_5_0,
              						"lang.formal.alloy.Als.RightCurlyBracket");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumDecl"


    // $ANTLR start "entryRuleLetOutDecl"
    // InternalAls.g:2483:1: entryRuleLetOutDecl returns [EObject current=null] : iv_ruleLetOutDecl= ruleLetOutDecl EOF ;
    public final EObject entryRuleLetOutDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetOutDecl = null;


        try {
            // InternalAls.g:2483:51: (iv_ruleLetOutDecl= ruleLetOutDecl EOF )
            // InternalAls.g:2484:2: iv_ruleLetOutDecl= ruleLetOutDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetOutDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetOutDecl=ruleLetOutDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetOutDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetOutDecl"


    // $ANTLR start "ruleLetOutDecl"
    // InternalAls.g:2490:1: ruleLetOutDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | (otherlv_7= '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleLetOutDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        EObject lv_name_0_0 = null;

        EObject lv_leftS_1_0 = null;

        EObject lv_nameRef_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_nameRef_4_0 = null;

        EObject lv_rightS_5_0 = null;

        EObject lv_block_6_0 = null;

        EObject lv_exprName_8_0 = null;



        	enterRule();

        try {
            // InternalAls.g:2496:2: ( ( ( (lv_name_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | (otherlv_7= '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) ) )
            // InternalAls.g:2497:2: ( ( (lv_name_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | (otherlv_7= '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) )
            {
            // InternalAls.g:2497:2: ( ( (lv_name_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | (otherlv_7= '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) )
            // InternalAls.g:2498:3: ( (lv_name_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | (otherlv_7= '=' ( (lv_exprName_8_0= ruleExpression ) ) ) )
            {
            // InternalAls.g:2498:3: ( (lv_name_0_0= ruleLetName ) )
            // InternalAls.g:2499:4: (lv_name_0_0= ruleLetName )
            {
            // InternalAls.g:2499:4: (lv_name_0_0= ruleLetName )
            // InternalAls.g:2500:5: lv_name_0_0= ruleLetName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetOutDeclAccess().getNameLetNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_41);
            lv_name_0_0=ruleLetName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetOutDeclRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"lang.formal.alloy.Als.LetName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:2517:3: ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAls.g:2518:4: ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) )
                    {
                    // InternalAls.g:2518:4: ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) )
                    // InternalAls.g:2519:5: (lv_leftS_1_0= ruleLeftSquareBracketKeyword )
                    {
                    // InternalAls.g:2519:5: (lv_leftS_1_0= ruleLeftSquareBracketKeyword )
                    // InternalAls.g:2520:6: lv_leftS_1_0= ruleLeftSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetOutDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    lv_leftS_1_0=ruleLeftSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetOutDeclRule());
                      						}
                      						set(
                      							current,
                      							"leftS",
                      							lv_leftS_1_0,
                      							"lang.formal.alloy.Als.LeftSquareBracketKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:2537:4: ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID||LA46_0==25||LA46_0==50||LA46_0==98||LA46_0==100) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalAls.g:2538:5: ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )*
                            {
                            // InternalAls.g:2538:5: ( (lv_nameRef_2_0= ruleReferencesName ) )
                            // InternalAls.g:2539:6: (lv_nameRef_2_0= ruleReferencesName )
                            {
                            // InternalAls.g:2539:6: (lv_nameRef_2_0= ruleReferencesName )
                            // InternalAls.g:2540:7: lv_nameRef_2_0= ruleReferencesName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getLetOutDeclAccess().getNameRefReferencesNameParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_8);
                            lv_nameRef_2_0=ruleReferencesName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getLetOutDeclRule());
                              							}
                              							add(
                              								current,
                              								"nameRef",
                              								lv_nameRef_2_0,
                              								"lang.formal.alloy.Als.ReferencesName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalAls.g:2557:5: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==33) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalAls.g:2558:6: ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) )
                            	    {
                            	    // InternalAls.g:2558:6: ( (lv_comma_3_0= ruleComma ) )
                            	    // InternalAls.g:2559:7: (lv_comma_3_0= ruleComma )
                            	    {
                            	    // InternalAls.g:2559:7: (lv_comma_3_0= ruleComma )
                            	    // InternalAls.g:2560:8: lv_comma_3_0= ruleComma
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getLetOutDeclAccess().getCommaCommaParserRuleCall_1_1_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_12);
                            	    lv_comma_3_0=ruleComma();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getLetOutDeclRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"comma",
                            	      									lv_comma_3_0,
                            	      									"lang.formal.alloy.Als.Comma");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalAls.g:2577:6: ( (lv_nameRef_4_0= ruleReferencesName ) )
                            	    // InternalAls.g:2578:7: (lv_nameRef_4_0= ruleReferencesName )
                            	    {
                            	    // InternalAls.g:2578:7: (lv_nameRef_4_0= ruleReferencesName )
                            	    // InternalAls.g:2579:8: lv_nameRef_4_0= ruleReferencesName
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getLetOutDeclAccess().getNameRefReferencesNameParserRuleCall_1_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_8);
                            	    lv_nameRef_4_0=ruleReferencesName();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getLetOutDeclRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"nameRef",
                            	      									lv_nameRef_4_0,
                            	      									"lang.formal.alloy.Als.ReferencesName");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalAls.g:2598:4: ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) )
                    // InternalAls.g:2599:5: (lv_rightS_5_0= ruleRightSquareBracketKeyword )
                    {
                    // InternalAls.g:2599:5: (lv_rightS_5_0= ruleRightSquareBracketKeyword )
                    // InternalAls.g:2600:6: lv_rightS_5_0= ruleRightSquareBracketKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetOutDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
                    lv_rightS_5_0=ruleRightSquareBracketKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetOutDeclRule());
                      						}
                      						set(
                      							current,
                      							"rightS",
                      							lv_rightS_5_0,
                      							"lang.formal.alloy.Als.RightSquareBracketKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAls.g:2618:3: ( ( (lv_block_6_0= ruleBlock ) ) | (otherlv_7= '=' ( (lv_exprName_8_0= ruleExpression ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            else if ( (LA48_0==28) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalAls.g:2619:4: ( (lv_block_6_0= ruleBlock ) )
                    {
                    // InternalAls.g:2619:4: ( (lv_block_6_0= ruleBlock ) )
                    // InternalAls.g:2620:5: (lv_block_6_0= ruleBlock )
                    {
                    // InternalAls.g:2620:5: (lv_block_6_0= ruleBlock )
                    // InternalAls.g:2621:6: lv_block_6_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetOutDeclAccess().getBlockBlockParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_6_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetOutDeclRule());
                      						}
                      						set(
                      							current,
                      							"block",
                      							lv_block_6_0,
                      							"lang.formal.alloy.Als.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:2639:4: (otherlv_7= '=' ( (lv_exprName_8_0= ruleExpression ) ) )
                    {
                    // InternalAls.g:2639:4: (otherlv_7= '=' ( (lv_exprName_8_0= ruleExpression ) ) )
                    // InternalAls.g:2640:5: otherlv_7= '=' ( (lv_exprName_8_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getLetOutDeclAccess().getEqualsSignKeyword_2_1_0());
                      				
                    }
                    // InternalAls.g:2644:5: ( (lv_exprName_8_0= ruleExpression ) )
                    // InternalAls.g:2645:6: (lv_exprName_8_0= ruleExpression )
                    {
                    // InternalAls.g:2645:6: (lv_exprName_8_0= ruleExpression )
                    // InternalAls.g:2646:7: lv_exprName_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLetOutDeclAccess().getExprNameExpressionParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprName_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getLetOutDeclRule());
                      							}
                      							set(
                      								current,
                      								"exprName",
                      								lv_exprName_8_0,
                      								"lang.formal.alloy.Als.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLetOutDecl"


    // $ANTLR start "entryRuleSigDecl"
    // InternalAls.g:2669:1: entryRuleSigDecl returns [EObject current=null] : iv_ruleSigDecl= ruleSigDecl EOF ;
    public final EObject entryRuleSigDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigDecl = null;


        try {
            // InternalAls.g:2669:48: (iv_ruleSigDecl= ruleSigDecl EOF )
            // InternalAls.g:2670:2: iv_ruleSigDecl= ruleSigDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSigDecl=ruleSigDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSigDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSigDecl"


    // $ANTLR start "ruleSigDecl"
    // InternalAls.g:2676:1: ruleSigDecl returns [EObject current=null] : ( (otherlv_0= 'var' )? (otherlv_1= 'abstract' )? (this_SigQual_2= ruleSigQual )? otherlv_3= 'sig' ( (lv_signatureName_4_0= ruleSignatureName ) ) ( (lv_sigExt_5_0= ruleSigExt ) )? otherlv_6= '{' ( ( (lv_decl_7_0= ruleFieldDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? otherlv_10= '}' ( (lv_block_11_0= ruleBlock ) )? ) ;
    public final EObject ruleSigDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token lv_comma2_8_0=null;
        Token otherlv_10=null;
        EObject this_SigQual_2 = null;

        EObject lv_signatureName_4_0 = null;

        EObject lv_sigExt_5_0 = null;

        EObject lv_decl_7_0 = null;

        EObject lv_decl_9_0 = null;

        EObject lv_block_11_0 = null;



        	enterRule();

        try {
            // InternalAls.g:2682:2: ( ( (otherlv_0= 'var' )? (otherlv_1= 'abstract' )? (this_SigQual_2= ruleSigQual )? otherlv_3= 'sig' ( (lv_signatureName_4_0= ruleSignatureName ) ) ( (lv_sigExt_5_0= ruleSigExt ) )? otherlv_6= '{' ( ( (lv_decl_7_0= ruleFieldDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? otherlv_10= '}' ( (lv_block_11_0= ruleBlock ) )? ) )
            // InternalAls.g:2683:2: ( (otherlv_0= 'var' )? (otherlv_1= 'abstract' )? (this_SigQual_2= ruleSigQual )? otherlv_3= 'sig' ( (lv_signatureName_4_0= ruleSignatureName ) ) ( (lv_sigExt_5_0= ruleSigExt ) )? otherlv_6= '{' ( ( (lv_decl_7_0= ruleFieldDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? otherlv_10= '}' ( (lv_block_11_0= ruleBlock ) )? )
            {
            // InternalAls.g:2683:2: ( (otherlv_0= 'var' )? (otherlv_1= 'abstract' )? (this_SigQual_2= ruleSigQual )? otherlv_3= 'sig' ( (lv_signatureName_4_0= ruleSignatureName ) ) ( (lv_sigExt_5_0= ruleSigExt ) )? otherlv_6= '{' ( ( (lv_decl_7_0= ruleFieldDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? otherlv_10= '}' ( (lv_block_11_0= ruleBlock ) )? )
            // InternalAls.g:2684:3: (otherlv_0= 'var' )? (otherlv_1= 'abstract' )? (this_SigQual_2= ruleSigQual )? otherlv_3= 'sig' ( (lv_signatureName_4_0= ruleSignatureName ) ) ( (lv_sigExt_5_0= ruleSigExt ) )? otherlv_6= '{' ( ( (lv_decl_7_0= ruleFieldDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? otherlv_10= '}' ( (lv_block_11_0= ruleBlock ) )?
            {
            // InternalAls.g:2684:3: (otherlv_0= 'var' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAls.g:2685:4: otherlv_0= 'var'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSigDeclAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalAls.g:2690:3: (otherlv_1= 'abstract' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAls.g:2691:4: otherlv_1= 'abstract'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSigDeclAccess().getAbstractKeyword_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAls.g:2696:3: (this_SigQual_2= ruleSigQual )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=35 && LA51_0<=37)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAls.g:2697:4: this_SigQual_2= ruleSigQual
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSigDeclAccess().getSigQualParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    this_SigQual_2=ruleSigQual();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SigQual_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSigDeclAccess().getSigKeyword_3());
              		
            }
            // InternalAls.g:2713:3: ( (lv_signatureName_4_0= ruleSignatureName ) )
            // InternalAls.g:2714:4: (lv_signatureName_4_0= ruleSignatureName )
            {
            // InternalAls.g:2714:4: (lv_signatureName_4_0= ruleSignatureName )
            // InternalAls.g:2715:5: lv_signatureName_4_0= ruleSignatureName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSigDeclAccess().getSignatureNameSignatureNameParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_signatureName_4_0=ruleSignatureName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSigDeclRule());
              					}
              					add(
              						current,
              						"signatureName",
              						lv_signatureName_4_0,
              						"lang.formal.alloy.Als.SignatureName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:2732:3: ( (lv_sigExt_5_0= ruleSigExt ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=38 && LA52_0<=39)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAls.g:2733:4: (lv_sigExt_5_0= ruleSigExt )
                    {
                    // InternalAls.g:2733:4: (lv_sigExt_5_0= ruleSigExt )
                    // InternalAls.g:2734:5: lv_sigExt_5_0= ruleSigExt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSigDeclAccess().getSigExtSigExtParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_sigExt_5_0=ruleSigExt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSigDeclRule());
                      					}
                      					set(
                      						current,
                      						"sigExt",
                      						lv_sigExt_5_0,
                      						"lang.formal.alloy.Als.SigExt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSigDeclAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalAls.g:2755:3: ( ( (lv_decl_7_0= ruleFieldDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==25||LA54_0==29||LA54_0==57) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAls.g:2756:4: ( (lv_decl_7_0= ruleFieldDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    {
                    // InternalAls.g:2756:4: ( (lv_decl_7_0= ruleFieldDecl ) )
                    // InternalAls.g:2757:5: (lv_decl_7_0= ruleFieldDecl )
                    {
                    // InternalAls.g:2757:5: (lv_decl_7_0= ruleFieldDecl )
                    // InternalAls.g:2758:6: lv_decl_7_0= ruleFieldDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSigDeclAccess().getDeclFieldDeclParserRuleCall_7_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_decl_7_0=ruleFieldDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSigDeclRule());
                      						}
                      						add(
                      							current,
                      							"decl",
                      							lv_decl_7_0,
                      							"lang.formal.alloy.Als.FieldDecl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:2775:4: ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==33) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalAls.g:2776:5: ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) )
                    	    {
                    	    // InternalAls.g:2776:5: ( (lv_comma2_8_0= ',' ) )
                    	    // InternalAls.g:2777:6: (lv_comma2_8_0= ',' )
                    	    {
                    	    // InternalAls.g:2777:6: (lv_comma2_8_0= ',' )
                    	    // InternalAls.g:2778:7: lv_comma2_8_0= ','
                    	    {
                    	    lv_comma2_8_0=(Token)match(input,33,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_comma2_8_0, grammarAccess.getSigDeclAccess().getComma2CommaKeyword_7_1_0_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getSigDeclRule());
                    	      							}
                    	      							addWithLastConsumed(current, "comma2", lv_comma2_8_0, ",");
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalAls.g:2790:5: ( (lv_decl_9_0= ruleDecl ) )
                    	    // InternalAls.g:2791:6: (lv_decl_9_0= ruleDecl )
                    	    {
                    	    // InternalAls.g:2791:6: (lv_decl_9_0= ruleDecl )
                    	    // InternalAls.g:2792:7: lv_decl_9_0= ruleDecl
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_7_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_decl_9_0=ruleDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSigDeclRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"decl",
                    	      								lv_decl_9_0,
                    	      								"lang.formal.alloy.Als.Decl");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,34,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getSigDeclAccess().getRightCurlyBracketKeyword_8());
              		
            }
            // InternalAls.g:2815:3: ( (lv_block_11_0= ruleBlock ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==32) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAls.g:2816:4: (lv_block_11_0= ruleBlock )
                    {
                    // InternalAls.g:2816:4: (lv_block_11_0= ruleBlock )
                    // InternalAls.g:2817:5: lv_block_11_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSigDeclAccess().getBlockBlockParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_11_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSigDeclRule());
                      					}
                      					set(
                      						current,
                      						"block",
                      						lv_block_11_0,
                      						"lang.formal.alloy.Als.Block");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSigDecl"


    // $ANTLR start "entryRuleSigQual"
    // InternalAls.g:2838:1: entryRuleSigQual returns [EObject current=null] : iv_ruleSigQual= ruleSigQual EOF ;
    public final EObject entryRuleSigQual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigQual = null;


        try {
            // InternalAls.g:2838:48: (iv_ruleSigQual= ruleSigQual EOF )
            // InternalAls.g:2839:2: iv_ruleSigQual= ruleSigQual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigQualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSigQual=ruleSigQual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSigQual; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSigQual"


    // $ANTLR start "ruleSigQual"
    // InternalAls.g:2845:1: ruleSigQual returns [EObject current=null] : ( ( (lv_sigq_0_1= 'lone' | lv_sigq_0_2= 'one' | lv_sigq_0_3= 'some' ) ) ) ;
    public final EObject ruleSigQual() throws RecognitionException {
        EObject current = null;

        Token lv_sigq_0_1=null;
        Token lv_sigq_0_2=null;
        Token lv_sigq_0_3=null;


        	enterRule();

        try {
            // InternalAls.g:2851:2: ( ( ( (lv_sigq_0_1= 'lone' | lv_sigq_0_2= 'one' | lv_sigq_0_3= 'some' ) ) ) )
            // InternalAls.g:2852:2: ( ( (lv_sigq_0_1= 'lone' | lv_sigq_0_2= 'one' | lv_sigq_0_3= 'some' ) ) )
            {
            // InternalAls.g:2852:2: ( ( (lv_sigq_0_1= 'lone' | lv_sigq_0_2= 'one' | lv_sigq_0_3= 'some' ) ) )
            // InternalAls.g:2853:3: ( (lv_sigq_0_1= 'lone' | lv_sigq_0_2= 'one' | lv_sigq_0_3= 'some' ) )
            {
            // InternalAls.g:2853:3: ( (lv_sigq_0_1= 'lone' | lv_sigq_0_2= 'one' | lv_sigq_0_3= 'some' ) )
            // InternalAls.g:2854:4: (lv_sigq_0_1= 'lone' | lv_sigq_0_2= 'one' | lv_sigq_0_3= 'some' )
            {
            // InternalAls.g:2854:4: (lv_sigq_0_1= 'lone' | lv_sigq_0_2= 'one' | lv_sigq_0_3= 'some' )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt56=1;
                }
                break;
            case 36:
                {
                alt56=2;
                }
                break;
            case 37:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalAls.g:2855:5: lv_sigq_0_1= 'lone'
                    {
                    lv_sigq_0_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sigq_0_1, grammarAccess.getSigQualAccess().getSigqLoneKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSigQualRule());
                      					}
                      					setWithLastConsumed(current, "sigq", lv_sigq_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:2866:5: lv_sigq_0_2= 'one'
                    {
                    lv_sigq_0_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sigq_0_2, grammarAccess.getSigQualAccess().getSigqOneKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSigQualRule());
                      					}
                      					setWithLastConsumed(current, "sigq", lv_sigq_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:2877:5: lv_sigq_0_3= 'some'
                    {
                    lv_sigq_0_3=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sigq_0_3, grammarAccess.getSigQualAccess().getSigqSomeKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSigQualRule());
                      					}
                      					setWithLastConsumed(current, "sigq", lv_sigq_0_3, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSigQual"


    // $ANTLR start "entryRuleSigExt"
    // InternalAls.g:2893:1: entryRuleSigExt returns [EObject current=null] : iv_ruleSigExt= ruleSigExt EOF ;
    public final EObject entryRuleSigExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExt = null;


        try {
            // InternalAls.g:2893:47: (iv_ruleSigExt= ruleSigExt EOF )
            // InternalAls.g:2894:2: iv_ruleSigExt= ruleSigExt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigExtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSigExt=ruleSigExt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSigExt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSigExt"


    // $ANTLR start "ruleSigExt"
    // InternalAls.g:2900:1: ruleSigExt returns [EObject current=null] : ( (otherlv_0= 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | (otherlv_2= 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) (otherlv_4= '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) ;
    public final EObject ruleSigExt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ref_1_0 = null;

        EObject lv_ref_3_0 = null;

        EObject lv_ref2_5_0 = null;



        	enterRule();

        try {
            // InternalAls.g:2906:2: ( ( (otherlv_0= 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | (otherlv_2= 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) (otherlv_4= '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) )
            // InternalAls.g:2907:2: ( (otherlv_0= 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | (otherlv_2= 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) (otherlv_4= '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            {
            // InternalAls.g:2907:2: ( (otherlv_0= 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | (otherlv_2= 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) (otherlv_4= '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==38) ) {
                alt58=1;
            }
            else if ( (LA58_0==39) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalAls.g:2908:3: (otherlv_0= 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    {
                    // InternalAls.g:2908:3: (otherlv_0= 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    // InternalAls.g:2909:4: otherlv_0= 'extends' ( (lv_ref_1_0= ruleReferencesSig ) )
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSigExtAccess().getExtendsKeyword_0_0());
                      			
                    }
                    // InternalAls.g:2913:4: ( (lv_ref_1_0= ruleReferencesSig ) )
                    // InternalAls.g:2914:5: (lv_ref_1_0= ruleReferencesSig )
                    {
                    // InternalAls.g:2914:5: (lv_ref_1_0= ruleReferencesSig )
                    // InternalAls.g:2915:6: lv_ref_1_0= ruleReferencesSig
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ref_1_0=ruleReferencesSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSigExtRule());
                      						}
                      						set(
                      							current,
                      							"ref",
                      							lv_ref_1_0,
                      							"lang.formal.alloy.Als.ReferencesSig");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:2934:3: (otherlv_2= 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) (otherlv_4= '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    {
                    // InternalAls.g:2934:3: (otherlv_2= 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) (otherlv_4= '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    // InternalAls.g:2935:4: otherlv_2= 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) (otherlv_4= '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSigExtAccess().getInKeyword_1_0());
                      			
                    }
                    // InternalAls.g:2939:4: ( (lv_ref_3_0= ruleReferencesSig ) )
                    // InternalAls.g:2940:5: (lv_ref_3_0= ruleReferencesSig )
                    {
                    // InternalAls.g:2940:5: (lv_ref_3_0= ruleReferencesSig )
                    // InternalAls.g:2941:6: lv_ref_3_0= ruleReferencesSig
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
                    lv_ref_3_0=ruleReferencesSig();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSigExtRule());
                      						}
                      						set(
                      							current,
                      							"ref",
                      							lv_ref_3_0,
                      							"lang.formal.alloy.Als.ReferencesSig");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:2958:4: (otherlv_4= '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==40) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalAls.g:2959:5: otherlv_4= '+' ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    {
                    	    otherlv_4=(Token)match(input,40,FOLLOW_50); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getSigExtAccess().getPlusSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalAls.g:2963:5: ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    // InternalAls.g:2964:6: (lv_ref2_5_0= ruleReferencesSig )
                    	    {
                    	    // InternalAls.g:2964:6: (lv_ref2_5_0= ruleReferencesSig )
                    	    // InternalAls.g:2965:7: lv_ref2_5_0= ruleReferencesSig
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSigExtAccess().getRef2ReferencesSigParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_51);
                    	    lv_ref2_5_0=ruleReferencesSig();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSigExtRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ref2",
                    	      								lv_ref2_5_0,
                    	      								"lang.formal.alloy.Als.ReferencesSig");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSigExt"


    // $ANTLR start "entryRuleExpression"
    // InternalAls.g:2988:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAls.g:2988:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAls.g:2989:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAls.g:2995:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? ) | (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_binOp_1_0 = null;

        EObject lv_expr_2_0 = null;

        AntlrDatatypeRuleToken lv_cmp_5_0 = null;

        EObject lv_expr_6_0 = null;

        EObject lv_arrowOp_7_0 = null;

        EObject lv_expr_8_0 = null;

        EObject lv_par_11_0 = null;

        EObject lv_expr_12_0 = null;

        EObject lv_expr_14_0 = null;

        EObject lv_expr_16_0 = null;

        EObject lv_comma_17_0 = null;

        EObject lv_expr_18_0 = null;



        	enterRule();

        try {
            // InternalAls.g:3001:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? ) | (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' ) )* ) )
            // InternalAls.g:3002:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? ) | (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' ) )* )
            {
            // InternalAls.g:3002:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? ) | (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' ) )* )
            // InternalAls.g:3003:3: this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? ) | (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalAls.g:3014:3: ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? ) | (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' ) )*
            loop65:
            do {
                int alt65=6;
                alt65 = dfa65.predict(input);
                switch (alt65) {
            	case 1 :
            	    // InternalAls.g:3015:4: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    {
            	    // InternalAls.g:3015:4: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    // InternalAls.g:3016:5: ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) )
            	    {
            	    // InternalAls.g:3016:5: ( (lv_binOp_1_0= ruleBinOp ) )
            	    // InternalAls.g:3017:6: (lv_binOp_1_0= ruleBinOp )
            	    {
            	    // InternalAls.g:3017:6: (lv_binOp_1_0= ruleBinOp )
            	    // InternalAls.g:3018:7: lv_binOp_1_0= ruleBinOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_binOp_1_0=ruleBinOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"binOp",
            	      								lv_binOp_1_0,
            	      								"lang.formal.alloy.Als.BinOp");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalAls.g:3035:5: ( (lv_expr_2_0= ruleExpression ) )
            	    // InternalAls.g:3036:6: (lv_expr_2_0= ruleExpression )
            	    {
            	    // InternalAls.g:3036:6: (lv_expr_2_0= ruleExpression )
            	    // InternalAls.g:3037:7: lv_expr_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_expr_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"expr",
            	      								lv_expr_2_0,
            	      								"lang.formal.alloy.Als.Expression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAls.g:3056:4: ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) )
            	    {
            	    // InternalAls.g:3056:4: ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) )
            	    // InternalAls.g:3057:5: (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) )
            	    {
            	    // InternalAls.g:3057:5: (otherlv_3= '!' | otherlv_4= 'not' )?
            	    int alt59=3;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==41) ) {
            	        alt59=1;
            	    }
            	    else if ( (LA59_0==42) ) {
            	        alt59=2;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // InternalAls.g:3058:6: otherlv_3= '!'
            	            {
            	            otherlv_3=(Token)match(input,41,FOLLOW_53); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getExclamationMarkKeyword_1_1_0_0());
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAls.g:3063:6: otherlv_4= 'not'
            	            {
            	            otherlv_4=(Token)match(input,42,FOLLOW_53); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getNotKeyword_1_1_0_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalAls.g:3068:5: ( (lv_cmp_5_0= ruleCompareOp ) )
            	    // InternalAls.g:3069:6: (lv_cmp_5_0= ruleCompareOp )
            	    {
            	    // InternalAls.g:3069:6: (lv_cmp_5_0= ruleCompareOp )
            	    // InternalAls.g:3070:7: lv_cmp_5_0= ruleCompareOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_cmp_5_0=ruleCompareOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"cmp",
            	      								lv_cmp_5_0,
            	      								"lang.formal.alloy.Als.CompareOp");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalAls.g:3087:5: ( (lv_expr_6_0= ruleExpression ) )
            	    // InternalAls.g:3088:6: (lv_expr_6_0= ruleExpression )
            	    {
            	    // InternalAls.g:3088:6: (lv_expr_6_0= ruleExpression )
            	    // InternalAls.g:3089:7: lv_expr_6_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_expr_6_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"expr",
            	      								lv_expr_6_0,
            	      								"lang.formal.alloy.Als.Expression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAls.g:3108:4: ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    {
            	    // InternalAls.g:3108:4: ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    // InternalAls.g:3109:5: ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) )
            	    {
            	    // InternalAls.g:3109:5: ( (lv_arrowOp_7_0= ruleArrowOp ) )
            	    // InternalAls.g:3110:6: (lv_arrowOp_7_0= ruleArrowOp )
            	    {
            	    // InternalAls.g:3110:6: (lv_arrowOp_7_0= ruleArrowOp )
            	    // InternalAls.g:3111:7: lv_arrowOp_7_0= ruleArrowOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_2_0_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_arrowOp_7_0=ruleArrowOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"arrowOp",
            	      								lv_arrowOp_7_0,
            	      								"lang.formal.alloy.Als.ArrowOp");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalAls.g:3128:5: ( (lv_expr_8_0= ruleExpression ) )
            	    // InternalAls.g:3129:6: (lv_expr_8_0= ruleExpression )
            	    {
            	    // InternalAls.g:3129:6: (lv_expr_8_0= ruleExpression )
            	    // InternalAls.g:3130:7: lv_expr_8_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_expr_8_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"expr",
            	      								lv_expr_8_0,
            	      								"lang.formal.alloy.Als.Expression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAls.g:3149:4: ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? )
            	    {
            	    // InternalAls.g:3149:4: ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? )
            	    // InternalAls.g:3150:5: (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )?
            	    {
            	    // InternalAls.g:3150:5: (otherlv_9= '=>' | otherlv_10= 'implies' )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==43) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==44) ) {
            	        alt60=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalAls.g:3151:6: otherlv_9= '=>'
            	            {
            	            otherlv_9=(Token)match(input,43,FOLLOW_54); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0());
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalAls.g:3156:6: otherlv_10= 'implies'
            	            {
            	            otherlv_10=(Token)match(input,44,FOLLOW_54); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalAls.g:3161:5: ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )?
            	    int alt61=3;
            	    alt61 = dfa61.predict(input);
            	    switch (alt61) {
            	        case 1 :
            	            // InternalAls.g:3162:6: ( (lv_par_11_0= ruleParanthesisandExpression ) )
            	            {
            	            // InternalAls.g:3162:6: ( (lv_par_11_0= ruleParanthesisandExpression ) )
            	            // InternalAls.g:3163:7: (lv_par_11_0= ruleParanthesisandExpression )
            	            {
            	            // InternalAls.g:3163:7: (lv_par_11_0= ruleParanthesisandExpression )
            	            // InternalAls.g:3164:8: lv_par_11_0= ruleParanthesisandExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getExpressionAccess().getParParanthesisandExpressionParserRuleCall_1_3_1_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_55);
            	            lv_par_11_0=ruleParanthesisandExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getExpressionRule());
            	              								}
            	              								add(
            	              									current,
            	              									"par",
            	              									lv_par_11_0,
            	              									"lang.formal.alloy.Als.ParanthesisandExpression");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAls.g:3182:6: ( (lv_expr_12_0= ruleExpression ) )
            	            {
            	            // InternalAls.g:3182:6: ( (lv_expr_12_0= ruleExpression ) )
            	            // InternalAls.g:3183:7: (lv_expr_12_0= ruleExpression )
            	            {
            	            // InternalAls.g:3183:7: (lv_expr_12_0= ruleExpression )
            	            // InternalAls.g:3184:8: lv_expr_12_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_1_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_55);
            	            lv_expr_12_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getExpressionRule());
            	              								}
            	              								add(
            	              									current,
            	              									"expr",
            	              									lv_expr_12_0,
            	              									"lang.formal.alloy.Als.Expression");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalAls.g:3202:5: (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==45) ) {
            	        int LA62_1 = input.LA(2);

            	        if ( (synpred81_InternalAls()) ) {
            	            alt62=1;
            	        }
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // InternalAls.g:3203:6: otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) )
            	            {
            	            otherlv_13=(Token)match(input,45,FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_13, grammarAccess.getExpressionAccess().getElseKeyword_1_3_2_0());
            	              					
            	            }
            	            // InternalAls.g:3207:6: ( (lv_expr_14_0= ruleExpression ) )
            	            // InternalAls.g:3208:7: (lv_expr_14_0= ruleExpression )
            	            {
            	            // InternalAls.g:3208:7: (lv_expr_14_0= ruleExpression )
            	            // InternalAls.g:3209:8: lv_expr_14_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_52);
            	            lv_expr_14_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getExpressionRule());
            	              								}
            	              								add(
            	              									current,
            	              									"expr",
            	              									lv_expr_14_0,
            	              									"lang.formal.alloy.Als.Expression");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAls.g:3229:4: (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' )
            	    {
            	    // InternalAls.g:3229:4: (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' )
            	    // InternalAls.g:3230:5: otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']'
            	    {
            	    otherlv_15=(Token)match(input,46,FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_15, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0());
            	      				
            	    }
            	    // InternalAls.g:3234:5: ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( ((LA64_0>=RULE_INT && LA64_0<=RULE_NEGATIVE_INTEGER)||LA64_0==16||LA64_0==18||(LA64_0>=25 && LA64_0<=27)||LA64_0==32||(LA64_0>=35 && LA64_0<=37)||(LA64_0>=41 && LA64_0<=42)||LA64_0==48||(LA64_0>=50 && LA64_0<=56)||(LA64_0>=58 && LA64_0<=59)||(LA64_0>=78 && LA64_0<=89)) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalAls.g:3235:6: ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )*
            	            {
            	            // InternalAls.g:3235:6: ( (lv_expr_16_0= ruleExpression ) )
            	            // InternalAls.g:3236:7: (lv_expr_16_0= ruleExpression )
            	            {
            	            // InternalAls.g:3236:7: (lv_expr_16_0= ruleExpression )
            	            // InternalAls.g:3237:8: lv_expr_16_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_expr_16_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getExpressionRule());
            	              								}
            	              								add(
            	              									current,
            	              									"expr",
            	              									lv_expr_16_0,
            	              									"lang.formal.alloy.Als.Expression");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            // InternalAls.g:3254:6: ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )*
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);

            	                if ( (LA63_0==33) ) {
            	                    alt63=1;
            	                }


            	                switch (alt63) {
            	            	case 1 :
            	            	    // InternalAls.g:3255:7: ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) )
            	            	    {
            	            	    // InternalAls.g:3255:7: ( (lv_comma_17_0= ruleComma ) )
            	            	    // InternalAls.g:3256:8: (lv_comma_17_0= ruleComma )
            	            	    {
            	            	    // InternalAls.g:3256:8: (lv_comma_17_0= ruleComma )
            	            	    // InternalAls.g:3257:9: lv_comma_17_0= ruleComma
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      									newCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0());
            	            	      								
            	            	    }
            	            	    pushFollow(FOLLOW_25);
            	            	    lv_comma_17_0=ruleComma();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (current==null) {
            	            	      										current = createModelElementForParent(grammarAccess.getExpressionRule());
            	            	      									}
            	            	      									add(
            	            	      										current,
            	            	      										"comma",
            	            	      										lv_comma_17_0,
            	            	      										"lang.formal.alloy.Als.Comma");
            	            	      									afterParserOrEnumRuleCall();
            	            	      								
            	            	    }

            	            	    }


            	            	    }

            	            	    // InternalAls.g:3274:7: ( (lv_expr_18_0= ruleExpression ) )
            	            	    // InternalAls.g:3275:8: (lv_expr_18_0= ruleExpression )
            	            	    {
            	            	    // InternalAls.g:3275:8: (lv_expr_18_0= ruleExpression )
            	            	    // InternalAls.g:3276:9: lv_expr_18_0= ruleExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      									newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0());
            	            	      								
            	            	    }
            	            	    pushFollow(FOLLOW_8);
            	            	    lv_expr_18_0=ruleExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (current==null) {
            	            	      										current = createModelElementForParent(grammarAccess.getExpressionRule());
            	            	      									}
            	            	      									add(
            	            	      										current,
            	            	      										"expr",
            	            	      										lv_expr_18_0,
            	            	      										"lang.formal.alloy.Als.Expression");
            	            	      									afterParserOrEnumRuleCall();
            	            	      								
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop63;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_19=(Token)match(input,47,FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_19, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_4_2());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalAls.g:3305:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalAls.g:3305:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalAls.g:3306:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalAls.g:3312:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_parO_1_0= '(' ) ) ( (lv_expr_2_0= ruleExpression ) )+ ( (lv_parF_3_0= ')' ) ) ) | ( () ( (lv_let_5_0= 'let' ) ) ( (lv_letdecl_6_0= ruleLetDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_9_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_11_0= ruleQuant ) ) ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )? ) | ( () ( (lv_unOp_18_0= ruleUnOp ) ) ( (lv_expr_19_0= ruleExpression ) ) ) | ( () ( (lv_common_21_0= ruleCommonQuantUnOp ) ) ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )? ) | ( () this_INT_28= RULE_INT ) | ( () this_NEGATIVE_INTEGER_30= RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_32_0= 'none' ) ) ) | ( () ( (lv_iden_34_0= 'iden' ) ) ) | ( () ( (lv_univ_36_0= 'univ' ) ) ) | ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) ) | ( (lv_int_40_0= 'Int' ) ) | ( () ( (lv_seq_42_0= 'seq/Int' ) ) ) | ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) ) | ( () ( (lv_block_54_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket ) ) ( (lv_decl_57_0= ruleDecl ) ) ( ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) ) )* ( (lv_blockOrBar_60_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_parO_1_0=null;
        Token lv_parF_3_0=null;
        Token lv_let_5_0=null;
        Token this_INT_28=null;
        Token this_NEGATIVE_INTEGER_30=null;
        Token lv_none_32_0=null;
        Token lv_iden_34_0=null;
        Token lv_univ_36_0=null;
        Token lv_int_38_0=null;
        Token otherlv_39=null;
        Token lv_int_40_0=null;
        Token lv_seq_42_0=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        EObject lv_expr_2_0 = null;

        EObject lv_letdecl_6_0 = null;

        EObject lv_comma_7_0 = null;

        EObject lv_letdecl_8_0 = null;

        EObject lv_blockOrBar_9_0 = null;

        AntlrDatatypeRuleToken lv_quant_11_0 = null;

        EObject lv_decl_12_0 = null;

        EObject lv_comma_13_0 = null;

        EObject lv_decl_14_0 = null;

        EObject lv_blockOrBar_15_0 = null;

        EObject lv_expr_16_0 = null;

        EObject lv_unOp_18_0 = null;

        EObject lv_expr_19_0 = null;

        EObject lv_common_21_0 = null;

        EObject lv_decl_22_0 = null;

        EObject lv_comma_23_0 = null;

        EObject lv_decl_24_0 = null;

        EObject lv_blockOrBar_25_0 = null;

        EObject lv_expr_26_0 = null;

        EObject lv_asname_46_0 = null;

        EObject lv_block_54_0 = null;

        EObject lv_leftCurlyBracket_56_0 = null;

        EObject lv_decl_57_0 = null;

        EObject lv_comma_58_0 = null;

        EObject lv_decl_59_0 = null;

        EObject lv_blockOrBar_60_0 = null;

        EObject lv_rightCurlyBracket_61_0 = null;



        	enterRule();

        try {
            // InternalAls.g:3318:2: ( ( ( () ( (lv_parO_1_0= '(' ) ) ( (lv_expr_2_0= ruleExpression ) )+ ( (lv_parF_3_0= ')' ) ) ) | ( () ( (lv_let_5_0= 'let' ) ) ( (lv_letdecl_6_0= ruleLetDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_9_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_11_0= ruleQuant ) ) ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )? ) | ( () ( (lv_unOp_18_0= ruleUnOp ) ) ( (lv_expr_19_0= ruleExpression ) ) ) | ( () ( (lv_common_21_0= ruleCommonQuantUnOp ) ) ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )? ) | ( () this_INT_28= RULE_INT ) | ( () this_NEGATIVE_INTEGER_30= RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_32_0= 'none' ) ) ) | ( () ( (lv_iden_34_0= 'iden' ) ) ) | ( () ( (lv_univ_36_0= 'univ' ) ) ) | ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) ) | ( (lv_int_40_0= 'Int' ) ) | ( () ( (lv_seq_42_0= 'seq/Int' ) ) ) | ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) ) | ( () ( (lv_block_54_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket ) ) ( (lv_decl_57_0= ruleDecl ) ) ( ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) ) )* ( (lv_blockOrBar_60_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket ) ) ) ) )
            // InternalAls.g:3319:2: ( ( () ( (lv_parO_1_0= '(' ) ) ( (lv_expr_2_0= ruleExpression ) )+ ( (lv_parF_3_0= ')' ) ) ) | ( () ( (lv_let_5_0= 'let' ) ) ( (lv_letdecl_6_0= ruleLetDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_9_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_11_0= ruleQuant ) ) ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )? ) | ( () ( (lv_unOp_18_0= ruleUnOp ) ) ( (lv_expr_19_0= ruleExpression ) ) ) | ( () ( (lv_common_21_0= ruleCommonQuantUnOp ) ) ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )? ) | ( () this_INT_28= RULE_INT ) | ( () this_NEGATIVE_INTEGER_30= RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_32_0= 'none' ) ) ) | ( () ( (lv_iden_34_0= 'iden' ) ) ) | ( () ( (lv_univ_36_0= 'univ' ) ) ) | ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) ) | ( (lv_int_40_0= 'Int' ) ) | ( () ( (lv_seq_42_0= 'seq/Int' ) ) ) | ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) ) | ( () ( (lv_block_54_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket ) ) ( (lv_decl_57_0= ruleDecl ) ) ( ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) ) )* ( (lv_blockOrBar_60_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket ) ) ) )
            {
            // InternalAls.g:3319:2: ( ( () ( (lv_parO_1_0= '(' ) ) ( (lv_expr_2_0= ruleExpression ) )+ ( (lv_parF_3_0= ')' ) ) ) | ( () ( (lv_let_5_0= 'let' ) ) ( (lv_letdecl_6_0= ruleLetDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_9_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_11_0= ruleQuant ) ) ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )? ) | ( () ( (lv_unOp_18_0= ruleUnOp ) ) ( (lv_expr_19_0= ruleExpression ) ) ) | ( () ( (lv_common_21_0= ruleCommonQuantUnOp ) ) ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )? ) | ( () this_INT_28= RULE_INT ) | ( () this_NEGATIVE_INTEGER_30= RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_32_0= 'none' ) ) ) | ( () ( (lv_iden_34_0= 'iden' ) ) ) | ( () ( (lv_univ_36_0= 'univ' ) ) ) | ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) ) | ( (lv_int_40_0= 'Int' ) ) | ( () ( (lv_seq_42_0= 'seq/Int' ) ) ) | ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) ) | ( () ( (lv_block_54_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket ) ) ( (lv_decl_57_0= ruleDecl ) ) ( ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) ) )* ( (lv_blockOrBar_60_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket ) ) ) )
            int alt81=16;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // InternalAls.g:3320:3: ( () ( (lv_parO_1_0= '(' ) ) ( (lv_expr_2_0= ruleExpression ) )+ ( (lv_parF_3_0= ')' ) ) )
                    {
                    // InternalAls.g:3320:3: ( () ( (lv_parO_1_0= '(' ) ) ( (lv_expr_2_0= ruleExpression ) )+ ( (lv_parF_3_0= ')' ) ) )
                    // InternalAls.g:3321:4: () ( (lv_parO_1_0= '(' ) ) ( (lv_expr_2_0= ruleExpression ) )+ ( (lv_parF_3_0= ')' ) )
                    {
                    // InternalAls.g:3321:4: ()
                    // InternalAls.g:3322:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3331:4: ( (lv_parO_1_0= '(' ) )
                    // InternalAls.g:3332:5: (lv_parO_1_0= '(' )
                    {
                    // InternalAls.g:3332:5: (lv_parO_1_0= '(' )
                    // InternalAls.g:3333:6: lv_parO_1_0= '('
                    {
                    lv_parO_1_0=(Token)match(input,48,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_parO_1_0, grammarAccess.getTerminalExpressionAccess().getParOLeftParenthesisKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "parO", lv_parO_1_0, "(");
                      					
                    }

                    }


                    }

                    // InternalAls.g:3345:4: ( (lv_expr_2_0= ruleExpression ) )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( ((LA66_0>=RULE_INT && LA66_0<=RULE_NEGATIVE_INTEGER)||LA66_0==16||LA66_0==18||(LA66_0>=25 && LA66_0<=27)||LA66_0==32||(LA66_0>=35 && LA66_0<=37)||(LA66_0>=41 && LA66_0<=42)||LA66_0==48||(LA66_0>=50 && LA66_0<=56)||(LA66_0>=58 && LA66_0<=59)||(LA66_0>=78 && LA66_0<=89)) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalAls.g:3346:5: (lv_expr_2_0= ruleExpression )
                    	    {
                    	    // InternalAls.g:3346:5: (lv_expr_2_0= ruleExpression )
                    	    // InternalAls.g:3347:6: lv_expr_2_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_0_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_57);
                    	    lv_expr_2_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"expr",
                    	      							lv_expr_2_0,
                    	      							"lang.formal.alloy.Als.Expression");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt66 >= 1 ) break loop66;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
                    } while (true);

                    // InternalAls.g:3364:4: ( (lv_parF_3_0= ')' ) )
                    // InternalAls.g:3365:5: (lv_parF_3_0= ')' )
                    {
                    // InternalAls.g:3365:5: (lv_parF_3_0= ')' )
                    // InternalAls.g:3366:6: lv_parF_3_0= ')'
                    {
                    lv_parF_3_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_parF_3_0, grammarAccess.getTerminalExpressionAccess().getParFRightParenthesisKeyword_0_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "parF", lv_parF_3_0, ")");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:3380:3: ( () ( (lv_let_5_0= 'let' ) ) ( (lv_letdecl_6_0= ruleLetDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_9_0= ruleBlockOrBar ) ) )
                    {
                    // InternalAls.g:3380:3: ( () ( (lv_let_5_0= 'let' ) ) ( (lv_letdecl_6_0= ruleLetDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_9_0= ruleBlockOrBar ) ) )
                    // InternalAls.g:3381:4: () ( (lv_let_5_0= 'let' ) ) ( (lv_letdecl_6_0= ruleLetDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_9_0= ruleBlockOrBar ) )
                    {
                    // InternalAls.g:3381:4: ()
                    // InternalAls.g:3382:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3391:4: ( (lv_let_5_0= 'let' ) )
                    // InternalAls.g:3392:5: (lv_let_5_0= 'let' )
                    {
                    // InternalAls.g:3392:5: (lv_let_5_0= 'let' )
                    // InternalAls.g:3393:6: lv_let_5_0= 'let'
                    {
                    lv_let_5_0=(Token)match(input,50,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_let_5_0, grammarAccess.getTerminalExpressionAccess().getLetLetKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "let", lv_let_5_0, "let");
                      					
                    }

                    }


                    }

                    // InternalAls.g:3405:4: ( (lv_letdecl_6_0= ruleLetDecl ) )
                    // InternalAls.g:3406:5: (lv_letdecl_6_0= ruleLetDecl )
                    {
                    // InternalAls.g:3406:5: (lv_letdecl_6_0= ruleLetDecl )
                    // InternalAls.g:3407:6: lv_letdecl_6_0= ruleLetDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_letdecl_6_0=ruleLetDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						add(
                      							current,
                      							"letdecl",
                      							lv_letdecl_6_0,
                      							"lang.formal.alloy.Als.LetDecl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:3424:4: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==33) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalAls.g:3425:5: ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) )
                    	    {
                    	    // InternalAls.g:3425:5: ( (lv_comma_7_0= ruleComma ) )
                    	    // InternalAls.g:3426:6: (lv_comma_7_0= ruleComma )
                    	    {
                    	    // InternalAls.g:3426:6: (lv_comma_7_0= ruleComma )
                    	    // InternalAls.g:3427:7: lv_comma_7_0= ruleComma
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_1_3_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_5);
                    	    lv_comma_7_0=ruleComma();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"comma",
                    	      								lv_comma_7_0,
                    	      								"lang.formal.alloy.Als.Comma");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalAls.g:3444:5: ( (lv_letdecl_8_0= ruleLetDecl ) )
                    	    // InternalAls.g:3445:6: (lv_letdecl_8_0= ruleLetDecl )
                    	    {
                    	    // InternalAls.g:3445:6: (lv_letdecl_8_0= ruleLetDecl )
                    	    // InternalAls.g:3446:7: lv_letdecl_8_0= ruleLetDecl
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_1_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_58);
                    	    lv_letdecl_8_0=ruleLetDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"letdecl",
                    	      								lv_letdecl_8_0,
                    	      								"lang.formal.alloy.Als.LetDecl");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    // InternalAls.g:3464:4: ( (lv_blockOrBar_9_0= ruleBlockOrBar ) )
                    // InternalAls.g:3465:5: (lv_blockOrBar_9_0= ruleBlockOrBar )
                    {
                    // InternalAls.g:3465:5: (lv_blockOrBar_9_0= ruleBlockOrBar )
                    // InternalAls.g:3466:6: lv_blockOrBar_9_0= ruleBlockOrBar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_blockOrBar_9_0=ruleBlockOrBar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						add(
                      							current,
                      							"blockOrBar",
                      							lv_blockOrBar_9_0,
                      							"lang.formal.alloy.Als.BlockOrBar");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAls.g:3485:3: ( () ( (lv_quant_11_0= ruleQuant ) ) ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )? )
                    {
                    // InternalAls.g:3485:3: ( () ( (lv_quant_11_0= ruleQuant ) ) ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )? )
                    // InternalAls.g:3486:4: () ( (lv_quant_11_0= ruleQuant ) ) ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )?
                    {
                    // InternalAls.g:3486:4: ()
                    // InternalAls.g:3487:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3496:4: ( (lv_quant_11_0= ruleQuant ) )
                    // InternalAls.g:3497:5: (lv_quant_11_0= ruleQuant )
                    {
                    // InternalAls.g:3497:5: (lv_quant_11_0= ruleQuant )
                    // InternalAls.g:3498:6: lv_quant_11_0= ruleQuant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getQuantQuantParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_59);
                    lv_quant_11_0=ruleQuant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"quant",
                      							lv_quant_11_0,
                      							"lang.formal.alloy.Als.Quant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:3515:4: ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )?
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // InternalAls.g:3516:5: ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )*
                            {
                            // InternalAls.g:3516:5: ( (lv_decl_12_0= ruleDecl ) )
                            // InternalAls.g:3517:6: (lv_decl_12_0= ruleDecl )
                            {
                            // InternalAls.g:3517:6: (lv_decl_12_0= ruleDecl )
                            // InternalAls.g:3518:7: lv_decl_12_0= ruleDecl
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_2_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_60);
                            lv_decl_12_0=ruleDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							add(
                              								current,
                              								"decl",
                              								lv_decl_12_0,
                              								"lang.formal.alloy.Als.Decl");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalAls.g:3535:5: ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==33) ) {
                                    int LA68_2 = input.LA(2);

                                    if ( (synpred90_InternalAls()) ) {
                                        alt68=1;
                                    }


                                }


                                switch (alt68) {
                            	case 1 :
                            	    // InternalAls.g:3536:6: ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) )
                            	    {
                            	    // InternalAls.g:3536:6: ( (lv_comma_13_0= ruleComma ) )
                            	    // InternalAls.g:3537:7: (lv_comma_13_0= ruleComma )
                            	    {
                            	    // InternalAls.g:3537:7: (lv_comma_13_0= ruleComma )
                            	    // InternalAls.g:3538:8: lv_comma_13_0= ruleComma
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_2_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_comma_13_0=ruleComma();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"comma",
                            	      									lv_comma_13_0,
                            	      									"lang.formal.alloy.Als.Comma");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalAls.g:3555:6: ( (lv_decl_14_0= ruleDecl ) )
                            	    // InternalAls.g:3556:7: (lv_decl_14_0= ruleDecl )
                            	    {
                            	    // InternalAls.g:3556:7: (lv_decl_14_0= ruleDecl )
                            	    // InternalAls.g:3557:8: lv_decl_14_0= ruleDecl
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_2_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_60);
                            	    lv_decl_14_0=ruleDecl();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"decl",
                            	      									lv_decl_14_0,
                            	      									"lang.formal.alloy.Als.Decl");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop68;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalAls.g:3576:4: ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )?
                    int alt70=3;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // InternalAls.g:3577:5: ( (lv_blockOrBar_15_0= ruleBlockOrBar ) )
                            {
                            // InternalAls.g:3577:5: ( (lv_blockOrBar_15_0= ruleBlockOrBar ) )
                            // InternalAls.g:3578:6: (lv_blockOrBar_15_0= ruleBlockOrBar )
                            {
                            // InternalAls.g:3578:6: (lv_blockOrBar_15_0= ruleBlockOrBar )
                            // InternalAls.g:3579:7: lv_blockOrBar_15_0= ruleBlockOrBar
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_2_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_blockOrBar_15_0=ruleBlockOrBar();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							add(
                              								current,
                              								"blockOrBar",
                              								lv_blockOrBar_15_0,
                              								"lang.formal.alloy.Als.BlockOrBar");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAls.g:3597:5: ( (lv_expr_16_0= ruleExpression ) )
                            {
                            // InternalAls.g:3597:5: ( (lv_expr_16_0= ruleExpression ) )
                            // InternalAls.g:3598:6: (lv_expr_16_0= ruleExpression )
                            {
                            // InternalAls.g:3598:6: (lv_expr_16_0= ruleExpression )
                            // InternalAls.g:3599:7: lv_expr_16_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_2_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_expr_16_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							add(
                              								current,
                              								"expr",
                              								lv_expr_16_0,
                              								"lang.formal.alloy.Als.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAls.g:3619:3: ( () ( (lv_unOp_18_0= ruleUnOp ) ) ( (lv_expr_19_0= ruleExpression ) ) )
                    {
                    // InternalAls.g:3619:3: ( () ( (lv_unOp_18_0= ruleUnOp ) ) ( (lv_expr_19_0= ruleExpression ) ) )
                    // InternalAls.g:3620:4: () ( (lv_unOp_18_0= ruleUnOp ) ) ( (lv_expr_19_0= ruleExpression ) )
                    {
                    // InternalAls.g:3620:4: ()
                    // InternalAls.g:3621:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3630:4: ( (lv_unOp_18_0= ruleUnOp ) )
                    // InternalAls.g:3631:5: (lv_unOp_18_0= ruleUnOp )
                    {
                    // InternalAls.g:3631:5: (lv_unOp_18_0= ruleUnOp )
                    // InternalAls.g:3632:6: lv_unOp_18_0= ruleUnOp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getUnOpUnOpParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_unOp_18_0=ruleUnOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"unOp",
                      							lv_unOp_18_0,
                      							"lang.formal.alloy.Als.UnOp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:3649:4: ( (lv_expr_19_0= ruleExpression ) )
                    // InternalAls.g:3650:5: (lv_expr_19_0= ruleExpression )
                    {
                    // InternalAls.g:3650:5: (lv_expr_19_0= ruleExpression )
                    // InternalAls.g:3651:6: lv_expr_19_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_19_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						add(
                      							current,
                      							"expr",
                      							lv_expr_19_0,
                      							"lang.formal.alloy.Als.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAls.g:3670:3: ( () ( (lv_common_21_0= ruleCommonQuantUnOp ) ) ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )? )
                    {
                    // InternalAls.g:3670:3: ( () ( (lv_common_21_0= ruleCommonQuantUnOp ) ) ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )? )
                    // InternalAls.g:3671:4: () ( (lv_common_21_0= ruleCommonQuantUnOp ) ) ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )?
                    {
                    // InternalAls.g:3671:4: ()
                    // InternalAls.g:3672:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3681:4: ( (lv_common_21_0= ruleCommonQuantUnOp ) )
                    // InternalAls.g:3682:5: (lv_common_21_0= ruleCommonQuantUnOp )
                    {
                    // InternalAls.g:3682:5: (lv_common_21_0= ruleCommonQuantUnOp )
                    // InternalAls.g:3683:6: lv_common_21_0= ruleCommonQuantUnOp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommonCommonQuantUnOpParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_59);
                    lv_common_21_0=ruleCommonQuantUnOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						add(
                      							current,
                      							"common",
                      							lv_common_21_0,
                      							"lang.formal.alloy.Als.CommonQuantUnOp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:3700:4: ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )?
                    int alt72=2;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // InternalAls.g:3701:5: ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )*
                            {
                            // InternalAls.g:3701:5: ( (lv_decl_22_0= ruleDecl ) )
                            // InternalAls.g:3702:6: (lv_decl_22_0= ruleDecl )
                            {
                            // InternalAls.g:3702:6: (lv_decl_22_0= ruleDecl )
                            // InternalAls.g:3703:7: lv_decl_22_0= ruleDecl
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_4_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_60);
                            lv_decl_22_0=ruleDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							add(
                              								current,
                              								"decl",
                              								lv_decl_22_0,
                              								"lang.formal.alloy.Als.Decl");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalAls.g:3720:5: ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==33) ) {
                                    int LA71_2 = input.LA(2);

                                    if ( (synpred96_InternalAls()) ) {
                                        alt71=1;
                                    }


                                }


                                switch (alt71) {
                            	case 1 :
                            	    // InternalAls.g:3721:6: ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) )
                            	    {
                            	    // InternalAls.g:3721:6: ( (lv_comma_23_0= ruleComma ) )
                            	    // InternalAls.g:3722:7: (lv_comma_23_0= ruleComma )
                            	    {
                            	    // InternalAls.g:3722:7: (lv_comma_23_0= ruleComma )
                            	    // InternalAls.g:3723:8: lv_comma_23_0= ruleComma
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_4_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_comma_23_0=ruleComma();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"comma",
                            	      									lv_comma_23_0,
                            	      									"lang.formal.alloy.Als.Comma");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalAls.g:3740:6: ( (lv_decl_24_0= ruleDecl ) )
                            	    // InternalAls.g:3741:7: (lv_decl_24_0= ruleDecl )
                            	    {
                            	    // InternalAls.g:3741:7: (lv_decl_24_0= ruleDecl )
                            	    // InternalAls.g:3742:8: lv_decl_24_0= ruleDecl
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_4_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_60);
                            	    lv_decl_24_0=ruleDecl();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"decl",
                            	      									lv_decl_24_0,
                            	      									"lang.formal.alloy.Als.Decl");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalAls.g:3761:4: ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )?
                    int alt73=3;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // InternalAls.g:3762:5: ( (lv_blockOrBar_25_0= ruleBlockOrBar ) )
                            {
                            // InternalAls.g:3762:5: ( (lv_blockOrBar_25_0= ruleBlockOrBar ) )
                            // InternalAls.g:3763:6: (lv_blockOrBar_25_0= ruleBlockOrBar )
                            {
                            // InternalAls.g:3763:6: (lv_blockOrBar_25_0= ruleBlockOrBar )
                            // InternalAls.g:3764:7: lv_blockOrBar_25_0= ruleBlockOrBar
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_4_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_blockOrBar_25_0=ruleBlockOrBar();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							add(
                              								current,
                              								"blockOrBar",
                              								lv_blockOrBar_25_0,
                              								"lang.formal.alloy.Als.BlockOrBar");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAls.g:3782:5: ( (lv_expr_26_0= ruleExpression ) )
                            {
                            // InternalAls.g:3782:5: ( (lv_expr_26_0= ruleExpression ) )
                            // InternalAls.g:3783:6: (lv_expr_26_0= ruleExpression )
                            {
                            // InternalAls.g:3783:6: (lv_expr_26_0= ruleExpression )
                            // InternalAls.g:3784:7: lv_expr_26_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_4_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_expr_26_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							add(
                              								current,
                              								"expr",
                              								lv_expr_26_0,
                              								"lang.formal.alloy.Als.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAls.g:3804:3: ( () this_INT_28= RULE_INT )
                    {
                    // InternalAls.g:3804:3: ( () this_INT_28= RULE_INT )
                    // InternalAls.g:3805:4: () this_INT_28= RULE_INT
                    {
                    // InternalAls.g:3805:4: ()
                    // InternalAls.g:3806:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_5_0(),
                      						current);
                      				
                    }

                    }

                    this_INT_28=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_28, grammarAccess.getTerminalExpressionAccess().getINTTerminalRuleCall_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAls.g:3821:3: ( () this_NEGATIVE_INTEGER_30= RULE_NEGATIVE_INTEGER )
                    {
                    // InternalAls.g:3821:3: ( () this_NEGATIVE_INTEGER_30= RULE_NEGATIVE_INTEGER )
                    // InternalAls.g:3822:4: () this_NEGATIVE_INTEGER_30= RULE_NEGATIVE_INTEGER
                    {
                    // InternalAls.g:3822:4: ()
                    // InternalAls.g:3823:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_6_0(),
                      						current);
                      				
                    }

                    }

                    this_NEGATIVE_INTEGER_30=(Token)match(input,RULE_NEGATIVE_INTEGER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_NEGATIVE_INTEGER_30, grammarAccess.getTerminalExpressionAccess().getNEGATIVE_INTEGERTerminalRuleCall_6_1());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAls.g:3838:3: ( () ( (lv_none_32_0= 'none' ) ) )
                    {
                    // InternalAls.g:3838:3: ( () ( (lv_none_32_0= 'none' ) ) )
                    // InternalAls.g:3839:4: () ( (lv_none_32_0= 'none' ) )
                    {
                    // InternalAls.g:3839:4: ()
                    // InternalAls.g:3840:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3849:4: ( (lv_none_32_0= 'none' ) )
                    // InternalAls.g:3850:5: (lv_none_32_0= 'none' )
                    {
                    // InternalAls.g:3850:5: (lv_none_32_0= 'none' )
                    // InternalAls.g:3851:6: lv_none_32_0= 'none'
                    {
                    lv_none_32_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_none_32_0, grammarAccess.getTerminalExpressionAccess().getNoneNoneKeyword_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "none", lv_none_32_0, "none");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalAls.g:3865:3: ( () ( (lv_iden_34_0= 'iden' ) ) )
                    {
                    // InternalAls.g:3865:3: ( () ( (lv_iden_34_0= 'iden' ) ) )
                    // InternalAls.g:3866:4: () ( (lv_iden_34_0= 'iden' ) )
                    {
                    // InternalAls.g:3866:4: ()
                    // InternalAls.g:3867:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3876:4: ( (lv_iden_34_0= 'iden' ) )
                    // InternalAls.g:3877:5: (lv_iden_34_0= 'iden' )
                    {
                    // InternalAls.g:3877:5: (lv_iden_34_0= 'iden' )
                    // InternalAls.g:3878:6: lv_iden_34_0= 'iden'
                    {
                    lv_iden_34_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_iden_34_0, grammarAccess.getTerminalExpressionAccess().getIdenIdenKeyword_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "iden", lv_iden_34_0, "iden");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalAls.g:3892:3: ( () ( (lv_univ_36_0= 'univ' ) ) )
                    {
                    // InternalAls.g:3892:3: ( () ( (lv_univ_36_0= 'univ' ) ) )
                    // InternalAls.g:3893:4: () ( (lv_univ_36_0= 'univ' ) )
                    {
                    // InternalAls.g:3893:4: ()
                    // InternalAls.g:3894:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3903:4: ( (lv_univ_36_0= 'univ' ) )
                    // InternalAls.g:3904:5: (lv_univ_36_0= 'univ' )
                    {
                    // InternalAls.g:3904:5: (lv_univ_36_0= 'univ' )
                    // InternalAls.g:3905:6: lv_univ_36_0= 'univ'
                    {
                    lv_univ_36_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_univ_36_0, grammarAccess.getTerminalExpressionAccess().getUnivUnivKeyword_9_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "univ", lv_univ_36_0, "univ");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalAls.g:3919:3: ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) )
                    {
                    // InternalAls.g:3919:3: ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) )
                    // InternalAls.g:3920:4: () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? )
                    {
                    // InternalAls.g:3920:4: ()
                    // InternalAls.g:3921:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_10_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3930:4: ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? )
                    // InternalAls.g:3931:5: ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )?
                    {
                    // InternalAls.g:3931:5: ( (lv_int_38_0= 'int' ) )
                    // InternalAls.g:3932:6: (lv_int_38_0= 'int' )
                    {
                    // InternalAls.g:3932:6: (lv_int_38_0= 'int' )
                    // InternalAls.g:3933:7: lv_int_38_0= 'int'
                    {
                    lv_int_38_0=(Token)match(input,26,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_int_38_0, grammarAccess.getTerminalExpressionAccess().getIntIntKeyword_10_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      							}
                      							setWithLastConsumed(current, "int", lv_int_38_0, "int");
                      						
                    }

                    }


                    }

                    // InternalAls.g:3945:5: ( (otherlv_39= RULE_ID ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_ID) ) {
                        int LA74_1 = input.LA(2);

                        if ( (synpred106_InternalAls()) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalAls.g:3946:6: (otherlv_39= RULE_ID )
                            {
                            // InternalAls.g:3946:6: (otherlv_39= RULE_ID )
                            // InternalAls.g:3947:7: otherlv_39= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              							/* */
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              						
                            }
                            otherlv_39=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_39, grammarAccess.getTerminalExpressionAccess().getNameRefReferencesNameCrossReference_10_1_1_0());
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalAls.g:3964:3: ( (lv_int_40_0= 'Int' ) )
                    {
                    // InternalAls.g:3964:3: ( (lv_int_40_0= 'Int' ) )
                    // InternalAls.g:3965:4: (lv_int_40_0= 'Int' )
                    {
                    // InternalAls.g:3965:4: (lv_int_40_0= 'Int' )
                    // InternalAls.g:3966:5: lv_int_40_0= 'Int'
                    {
                    lv_int_40_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_int_40_0, grammarAccess.getTerminalExpressionAccess().getIntIntKeyword_11_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      					}
                      					setWithLastConsumed(current, "int", lv_int_40_0, "Int");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalAls.g:3979:3: ( () ( (lv_seq_42_0= 'seq/Int' ) ) )
                    {
                    // InternalAls.g:3979:3: ( () ( (lv_seq_42_0= 'seq/Int' ) ) )
                    // InternalAls.g:3980:4: () ( (lv_seq_42_0= 'seq/Int' ) )
                    {
                    // InternalAls.g:3980:4: ()
                    // InternalAls.g:3981:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_12_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:3990:4: ( (lv_seq_42_0= 'seq/Int' ) )
                    // InternalAls.g:3991:5: (lv_seq_42_0= 'seq/Int' )
                    {
                    // InternalAls.g:3991:5: (lv_seq_42_0= 'seq/Int' )
                    // InternalAls.g:3992:6: lv_seq_42_0= 'seq/Int'
                    {
                    lv_seq_42_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_seq_42_0, grammarAccess.getTerminalExpressionAccess().getSeqSeqIntKeyword_12_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "seq", lv_seq_42_0, "seq/Int");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalAls.g:4006:3: ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) )
                    {
                    // InternalAls.g:4006:3: ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) )
                    // InternalAls.g:4007:4: () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' )
                    {
                    // InternalAls.g:4007:4: ()
                    // InternalAls.g:4008:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_13_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:4017:4: (otherlv_44= '@' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==56) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalAls.g:4018:5: otherlv_44= '@'
                            {
                            otherlv_44=(Token)match(input,56,FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_44, grammarAccess.getTerminalExpressionAccess().getCommercialAtKeyword_13_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalAls.g:4023:4: (otherlv_45= 'int' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==26) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalAls.g:4024:5: otherlv_45= 'int'
                            {
                            otherlv_45=(Token)match(input,26,FOLLOW_63); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_45, grammarAccess.getTerminalExpressionAccess().getIntKeyword_13_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalAls.g:4029:4: ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )?
                    int alt78=2;
                    switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA78_1 = input.LA(2);

                            if ( (LA78_1==14) ) {
                                alt78=1;
                            }
                            }
                            break;
                        case 16:
                        case 18:
                            {
                            alt78=1;
                            }
                            break;
                        case 25:
                            {
                            int LA78_3 = input.LA(2);

                            if ( (LA78_3==14) ) {
                                alt78=1;
                            }
                            }
                            break;
                    }

                    switch (alt78) {
                        case 1 :
                            // InternalAls.g:4030:5: ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/'
                            {
                            // InternalAls.g:4030:5: ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' )
                            int alt77=4;
                            switch ( input.LA(1) ) {
                            case RULE_ID:
                                {
                                alt77=1;
                                }
                                break;
                            case 16:
                                {
                                alt77=2;
                                }
                                break;
                            case 18:
                                {
                                alt77=3;
                                }
                                break;
                            case 25:
                                {
                                alt77=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 77, 0, input);

                                throw nvae;
                            }

                            switch (alt77) {
                                case 1 :
                                    // InternalAls.g:4031:6: ( (lv_asname_46_0= ruleAsName ) )
                                    {
                                    // InternalAls.g:4031:6: ( (lv_asname_46_0= ruleAsName ) )
                                    // InternalAls.g:4032:7: (lv_asname_46_0= ruleAsName )
                                    {
                                    // InternalAls.g:4032:7: (lv_asname_46_0= ruleAsName )
                                    // InternalAls.g:4033:8: lv_asname_46_0= ruleAsName
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getAsnameAsNameParserRuleCall_13_3_0_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_13);
                                    lv_asname_46_0=ruleAsName();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                                      								}
                                      								set(
                                      									current,
                                      									"asname",
                                      									lv_asname_46_0,
                                      									"lang.formal.alloy.Als.AsName");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAls.g:4051:6: otherlv_47= 'fun'
                                    {
                                    otherlv_47=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_47, grammarAccess.getTerminalExpressionAccess().getFunKeyword_13_3_0_1());
                                      					
                                    }

                                    }
                                    break;
                                case 3 :
                                    // InternalAls.g:4056:6: otherlv_48= 'pred'
                                    {
                                    otherlv_48=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_48, grammarAccess.getTerminalExpressionAccess().getPredKeyword_13_3_0_2());
                                      					
                                    }

                                    }
                                    break;
                                case 4 :
                                    // InternalAls.g:4061:6: otherlv_49= 'this'
                                    {
                                    otherlv_49=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_49, grammarAccess.getTerminalExpressionAccess().getThisKeyword_13_3_0_3());
                                      					
                                    }

                                    }
                                    break;

                            }

                            otherlv_50=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_50, grammarAccess.getTerminalExpressionAccess().getSolidusKeyword_13_3_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalAls.g:4071:4: ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RULE_ID) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==25) ) {
                        alt79=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalAls.g:4072:5: ( (otherlv_51= RULE_ID ) )
                            {
                            // InternalAls.g:4072:5: ( (otherlv_51= RULE_ID ) )
                            // InternalAls.g:4073:6: (otherlv_51= RULE_ID )
                            {
                            // InternalAls.g:4073:6: (otherlv_51= RULE_ID )
                            // InternalAls.g:4074:7: otherlv_51= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              							/* */
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              						
                            }
                            otherlv_51=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_51, grammarAccess.getTerminalExpressionAccess().getNameRefReferencesNameCrossReference_13_4_0_0());
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAls.g:4089:5: otherlv_52= 'this'
                            {
                            otherlv_52=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_52, grammarAccess.getTerminalExpressionAccess().getThisKeyword_13_4_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalAls.g:4096:3: ( () ( (lv_block_54_0= ruleBlock ) ) )
                    {
                    // InternalAls.g:4096:3: ( () ( (lv_block_54_0= ruleBlock ) ) )
                    // InternalAls.g:4097:4: () ( (lv_block_54_0= ruleBlock ) )
                    {
                    // InternalAls.g:4097:4: ()
                    // InternalAls.g:4098:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_14_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:4107:4: ( (lv_block_54_0= ruleBlock ) )
                    // InternalAls.g:4108:5: (lv_block_54_0= ruleBlock )
                    {
                    // InternalAls.g:4108:5: (lv_block_54_0= ruleBlock )
                    // InternalAls.g:4109:6: lv_block_54_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockBlockParserRuleCall_14_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_54_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						add(
                      							current,
                      							"block",
                      							lv_block_54_0,
                      							"lang.formal.alloy.Als.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 16 :
                    // InternalAls.g:4128:3: ( () ( (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket ) ) ( (lv_decl_57_0= ruleDecl ) ) ( ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) ) )* ( (lv_blockOrBar_60_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket ) ) )
                    {
                    // InternalAls.g:4128:3: ( () ( (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket ) ) ( (lv_decl_57_0= ruleDecl ) ) ( ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) ) )* ( (lv_blockOrBar_60_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket ) ) )
                    // InternalAls.g:4129:4: () ( (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket ) ) ( (lv_decl_57_0= ruleDecl ) ) ( ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) ) )* ( (lv_blockOrBar_60_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket ) )
                    {
                    // InternalAls.g:4129:4: ()
                    // InternalAls.g:4130:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getExpressionAction_15_0(),
                      						current);
                      				
                    }

                    }

                    // InternalAls.g:4139:4: ( (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket ) )
                    // InternalAls.g:4140:5: (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket )
                    {
                    // InternalAls.g:4140:5: (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket )
                    // InternalAls.g:4141:6: lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getLeftCurlyBracketLeftCurlyBracketParserRuleCall_15_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_leftCurlyBracket_56_0=ruleLeftCurlyBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"leftCurlyBracket",
                      							lv_leftCurlyBracket_56_0,
                      							"lang.formal.alloy.Als.LeftCurlyBracket");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:4158:4: ( (lv_decl_57_0= ruleDecl ) )
                    // InternalAls.g:4159:5: (lv_decl_57_0= ruleDecl )
                    {
                    // InternalAls.g:4159:5: (lv_decl_57_0= ruleDecl )
                    // InternalAls.g:4160:6: lv_decl_57_0= ruleDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_15_2_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_decl_57_0=ruleDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						add(
                      							current,
                      							"decl",
                      							lv_decl_57_0,
                      							"lang.formal.alloy.Als.Decl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:4177:4: ( ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==33) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalAls.g:4178:5: ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) )
                    	    {
                    	    // InternalAls.g:4178:5: ( (lv_comma_58_0= ruleComma ) )
                    	    // InternalAls.g:4179:6: (lv_comma_58_0= ruleComma )
                    	    {
                    	    // InternalAls.g:4179:6: (lv_comma_58_0= ruleComma )
                    	    // InternalAls.g:4180:7: lv_comma_58_0= ruleComma
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_15_3_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_comma_58_0=ruleComma();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"comma",
                    	      								lv_comma_58_0,
                    	      								"lang.formal.alloy.Als.Comma");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalAls.g:4197:5: ( (lv_decl_59_0= ruleDecl ) )
                    	    // InternalAls.g:4198:6: (lv_decl_59_0= ruleDecl )
                    	    {
                    	    // InternalAls.g:4198:6: (lv_decl_59_0= ruleDecl )
                    	    // InternalAls.g:4199:7: lv_decl_59_0= ruleDecl
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_15_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_58);
                    	    lv_decl_59_0=ruleDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"decl",
                    	      								lv_decl_59_0,
                    	      								"lang.formal.alloy.Als.Decl");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    // InternalAls.g:4217:4: ( (lv_blockOrBar_60_0= ruleBlockOrBar ) )
                    // InternalAls.g:4218:5: (lv_blockOrBar_60_0= ruleBlockOrBar )
                    {
                    // InternalAls.g:4218:5: (lv_blockOrBar_60_0= ruleBlockOrBar )
                    // InternalAls.g:4219:6: lv_blockOrBar_60_0= ruleBlockOrBar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_15_4_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
                    lv_blockOrBar_60_0=ruleBlockOrBar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						add(
                      							current,
                      							"blockOrBar",
                      							lv_blockOrBar_60_0,
                      							"lang.formal.alloy.Als.BlockOrBar");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAls.g:4236:4: ( (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket ) )
                    // InternalAls.g:4237:5: (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket )
                    {
                    // InternalAls.g:4237:5: (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket )
                    // InternalAls.g:4238:6: lv_rightCurlyBracket_61_0= ruleRightCurlyBracket
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getRightCurlyBracketRightCurlyBracketParserRuleCall_15_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightCurlyBracket_61_0=ruleRightCurlyBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rightCurlyBracket",
                      							lv_rightCurlyBracket_61_0,
                      							"lang.formal.alloy.Als.RightCurlyBracket");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleFieldDecl"
    // InternalAls.g:4260:1: entryRuleFieldDecl returns [EObject current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final EObject entryRuleFieldDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDecl = null;


        try {
            // InternalAls.g:4260:50: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalAls.g:4261:2: iv_ruleFieldDecl= ruleFieldDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldDecl=ruleFieldDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldDecl"


    // $ANTLR start "ruleFieldDecl"
    // InternalAls.g:4267:1: ruleFieldDecl returns [EObject current=null] : ( (otherlv_0= 'var' )? this_Decl_1= ruleDecl ) ;
    public final EObject ruleFieldDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Decl_1 = null;



        	enterRule();

        try {
            // InternalAls.g:4273:2: ( ( (otherlv_0= 'var' )? this_Decl_1= ruleDecl ) )
            // InternalAls.g:4274:2: ( (otherlv_0= 'var' )? this_Decl_1= ruleDecl )
            {
            // InternalAls.g:4274:2: ( (otherlv_0= 'var' )? this_Decl_1= ruleDecl )
            // InternalAls.g:4275:3: (otherlv_0= 'var' )? this_Decl_1= ruleDecl
            {
            // InternalAls.g:4275:3: (otherlv_0= 'var' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==29) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAls.g:4276:4: otherlv_0= 'var'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFieldDeclAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFieldDeclAccess().getDeclParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Decl_1=ruleDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Decl_1;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleDecl"
    // InternalAls.g:4296:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalAls.g:4296:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalAls.g:4297:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalAls.g:4303:1: ruleDecl returns [EObject current=null] : ( (otherlv_0= 'disj' )? ( (lv_propertyName_1_0= rulePropertyName ) ) ( ( (lv_comma_2_0= ruleComma ) ) ( (lv_propertyName_3_0= rulePropertyName ) ) )* ( (lv_colon_4_0= ruleColon ) ) (otherlv_5= 'disj' )? ( (lv_expr_6_0= ruleExpression ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_propertyName_1_0 = null;

        EObject lv_comma_2_0 = null;

        EObject lv_propertyName_3_0 = null;

        EObject lv_colon_4_0 = null;

        EObject lv_expr_6_0 = null;



        	enterRule();

        try {
            // InternalAls.g:4309:2: ( ( (otherlv_0= 'disj' )? ( (lv_propertyName_1_0= rulePropertyName ) ) ( ( (lv_comma_2_0= ruleComma ) ) ( (lv_propertyName_3_0= rulePropertyName ) ) )* ( (lv_colon_4_0= ruleColon ) ) (otherlv_5= 'disj' )? ( (lv_expr_6_0= ruleExpression ) ) ) )
            // InternalAls.g:4310:2: ( (otherlv_0= 'disj' )? ( (lv_propertyName_1_0= rulePropertyName ) ) ( ( (lv_comma_2_0= ruleComma ) ) ( (lv_propertyName_3_0= rulePropertyName ) ) )* ( (lv_colon_4_0= ruleColon ) ) (otherlv_5= 'disj' )? ( (lv_expr_6_0= ruleExpression ) ) )
            {
            // InternalAls.g:4310:2: ( (otherlv_0= 'disj' )? ( (lv_propertyName_1_0= rulePropertyName ) ) ( ( (lv_comma_2_0= ruleComma ) ) ( (lv_propertyName_3_0= rulePropertyName ) ) )* ( (lv_colon_4_0= ruleColon ) ) (otherlv_5= 'disj' )? ( (lv_expr_6_0= ruleExpression ) ) )
            // InternalAls.g:4311:3: (otherlv_0= 'disj' )? ( (lv_propertyName_1_0= rulePropertyName ) ) ( ( (lv_comma_2_0= ruleComma ) ) ( (lv_propertyName_3_0= rulePropertyName ) ) )* ( (lv_colon_4_0= ruleColon ) ) (otherlv_5= 'disj' )? ( (lv_expr_6_0= ruleExpression ) )
            {
            // InternalAls.g:4311:3: (otherlv_0= 'disj' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==57) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAls.g:4312:4: otherlv_0= 'disj'
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getDeclAccess().getDisjKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalAls.g:4317:3: ( (lv_propertyName_1_0= rulePropertyName ) )
            // InternalAls.g:4318:4: (lv_propertyName_1_0= rulePropertyName )
            {
            // InternalAls.g:4318:4: (lv_propertyName_1_0= rulePropertyName )
            // InternalAls.g:4319:5: lv_propertyName_1_0= rulePropertyName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_64);
            lv_propertyName_1_0=rulePropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeclRule());
              					}
              					add(
              						current,
              						"propertyName",
              						lv_propertyName_1_0,
              						"lang.formal.alloy.Als.PropertyName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:4336:3: ( ( (lv_comma_2_0= ruleComma ) ) ( (lv_propertyName_3_0= rulePropertyName ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==33) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalAls.g:4337:4: ( (lv_comma_2_0= ruleComma ) ) ( (lv_propertyName_3_0= rulePropertyName ) )
            	    {
            	    // InternalAls.g:4337:4: ( (lv_comma_2_0= ruleComma ) )
            	    // InternalAls.g:4338:5: (lv_comma_2_0= ruleComma )
            	    {
            	    // InternalAls.g:4338:5: (lv_comma_2_0= ruleComma )
            	    // InternalAls.g:4339:6: lv_comma_2_0= ruleComma
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeclAccess().getCommaCommaParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_comma_2_0=ruleComma();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDeclRule());
            	      						}
            	      						add(
            	      							current,
            	      							"comma",
            	      							lv_comma_2_0,
            	      							"lang.formal.alloy.Als.Comma");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalAls.g:4356:4: ( (lv_propertyName_3_0= rulePropertyName ) )
            	    // InternalAls.g:4357:5: (lv_propertyName_3_0= rulePropertyName )
            	    {
            	    // InternalAls.g:4357:5: (lv_propertyName_3_0= rulePropertyName )
            	    // InternalAls.g:4358:6: lv_propertyName_3_0= rulePropertyName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_64);
            	    lv_propertyName_3_0=rulePropertyName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDeclRule());
            	      						}
            	      						add(
            	      							current,
            	      							"propertyName",
            	      							lv_propertyName_3_0,
            	      							"lang.formal.alloy.Als.PropertyName");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            // InternalAls.g:4376:3: ( (lv_colon_4_0= ruleColon ) )
            // InternalAls.g:4377:4: (lv_colon_4_0= ruleColon )
            {
            // InternalAls.g:4377:4: (lv_colon_4_0= ruleColon )
            // InternalAls.g:4378:5: lv_colon_4_0= ruleColon
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclAccess().getColonColonParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_colon_4_0=ruleColon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeclRule());
              					}
              					set(
              						current,
              						"colon",
              						lv_colon_4_0,
              						"lang.formal.alloy.Als.Colon");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:4395:3: (otherlv_5= 'disj' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==57) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAls.g:4396:4: otherlv_5= 'disj'
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDeclAccess().getDisjKeyword_4());
                      			
                    }

                    }
                    break;

            }

            // InternalAls.g:4401:3: ( (lv_expr_6_0= ruleExpression ) )
            // InternalAls.g:4402:4: (lv_expr_6_0= ruleExpression )
            {
            // InternalAls.g:4402:4: (lv_expr_6_0= ruleExpression )
            // InternalAls.g:4403:5: lv_expr_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclAccess().getExprExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeclRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_6_0,
              						"lang.formal.alloy.Als.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleLetDecl"
    // InternalAls.g:4424:1: entryRuleLetDecl returns [EObject current=null] : iv_ruleLetDecl= ruleLetDecl EOF ;
    public final EObject entryRuleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDecl = null;


        try {
            // InternalAls.g:4424:48: (iv_ruleLetDecl= ruleLetDecl EOF )
            // InternalAls.g:4425:2: iv_ruleLetDecl= ruleLetDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetDecl=ruleLetDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetDecl"


    // $ANTLR start "ruleLetDecl"
    // InternalAls.g:4431:1: ruleLetDecl returns [EObject current=null] : ( ( (lv_nameExpression_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleLetDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_nameExpression_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAls.g:4437:2: ( ( ( (lv_nameExpression_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalAls.g:4438:2: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalAls.g:4438:2: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalAls.g:4439:3: ( (lv_nameExpression_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalAls.g:4439:3: ( (lv_nameExpression_0_0= rulePropertyName ) )
            // InternalAls.g:4440:4: (lv_nameExpression_0_0= rulePropertyName )
            {
            // InternalAls.g:4440:4: (lv_nameExpression_0_0= rulePropertyName )
            // InternalAls.g:4441:5: lv_nameExpression_0_0= rulePropertyName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetDeclAccess().getNameExpressionPropertyNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_66);
            lv_nameExpression_0_0=rulePropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetDeclRule());
              					}
              					set(
              						current,
              						"nameExpression",
              						lv_nameExpression_0_0,
              						"lang.formal.alloy.Als.PropertyName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLetDeclAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalAls.g:4462:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalAls.g:4463:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalAls.g:4463:4: (lv_expr_2_0= ruleExpression )
            // InternalAls.g:4464:5: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetDeclAccess().getExprExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetDeclRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"lang.formal.alloy.Als.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLetDecl"


    // $ANTLR start "entryRuleParanthesisandExpression"
    // InternalAls.g:4485:1: entryRuleParanthesisandExpression returns [EObject current=null] : iv_ruleParanthesisandExpression= ruleParanthesisandExpression EOF ;
    public final EObject entryRuleParanthesisandExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesisandExpression = null;


        try {
            // InternalAls.g:4485:65: (iv_ruleParanthesisandExpression= ruleParanthesisandExpression EOF )
            // InternalAls.g:4486:2: iv_ruleParanthesisandExpression= ruleParanthesisandExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParanthesisandExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParanthesisandExpression=ruleParanthesisandExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParanthesisandExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParanthesisandExpression"


    // $ANTLR start "ruleParanthesisandExpression"
    // InternalAls.g:4492:1: ruleParanthesisandExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleParanthesisandExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalAls.g:4498:2: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalAls.g:4499:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalAls.g:4499:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalAls.g:4500:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParanthesisandExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAls.g:4504:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalAls.g:4505:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalAls.g:4505:4: (lv_expr_1_0= ruleExpression )
            // InternalAls.g:4506:5: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParanthesisandExpressionAccess().getExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_67);
            lv_expr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParanthesisandExpressionRule());
              					}
              					add(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"lang.formal.alloy.Als.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParanthesisandExpressionAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParanthesisandExpression"


    // $ANTLR start "entryRuleQuant"
    // InternalAls.g:4531:1: entryRuleQuant returns [String current=null] : iv_ruleQuant= ruleQuant EOF ;
    public final String entryRuleQuant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuant = null;


        try {
            // InternalAls.g:4531:45: (iv_ruleQuant= ruleQuant EOF )
            // InternalAls.g:4532:2: iv_ruleQuant= ruleQuant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuant=ruleQuant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuant.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuant"


    // $ANTLR start "ruleQuant"
    // InternalAls.g:4538:1: ruleQuant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'all' | kw= 'sum' ) ;
    public final AntlrDatatypeRuleToken ruleQuant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAls.g:4544:2: ( (kw= 'all' | kw= 'sum' ) )
            // InternalAls.g:4545:2: (kw= 'all' | kw= 'sum' )
            {
            // InternalAls.g:4545:2: (kw= 'all' | kw= 'sum' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==58) ) {
                alt86=1;
            }
            else if ( (LA86_0==59) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalAls.g:4546:3: kw= 'all'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getQuantAccess().getAllKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:4552:3: kw= 'sum'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getQuantAccess().getSumKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQuant"


    // $ANTLR start "entryRuleBinOp"
    // InternalAls.g:4561:1: entryRuleBinOp returns [EObject current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final EObject entryRuleBinOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinOp = null;


        try {
            // InternalAls.g:4561:46: (iv_ruleBinOp= ruleBinOp EOF )
            // InternalAls.g:4562:2: iv_ruleBinOp= ruleBinOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinOp=ruleBinOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinOp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinOp"


    // $ANTLR start "ruleBinOp"
    // InternalAls.g:4568:1: ruleBinOp returns [EObject current=null] : ( () (otherlv_1= '||' | otherlv_2= 'or' | otherlv_3= '&&' | otherlv_4= 'and' | otherlv_5= '&' | otherlv_6= '<=>' | otherlv_7= 'iff' | otherlv_8= '+' | otherlv_9= '-' | otherlv_10= '++' | otherlv_11= '<:' | otherlv_12= ':>' | ( (lv_dot_13_0= ruleDot ) ) | otherlv_14= '<<' | otherlv_15= '>>' | otherlv_16= '>>>' | otherlv_17= 'until' | otherlv_18= 'releases' | otherlv_19= 'since' | otherlv_20= 'triggered' ) ) ;
    public final EObject ruleBinOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_dot_13_0 = null;



        	enterRule();

        try {
            // InternalAls.g:4574:2: ( ( () (otherlv_1= '||' | otherlv_2= 'or' | otherlv_3= '&&' | otherlv_4= 'and' | otherlv_5= '&' | otherlv_6= '<=>' | otherlv_7= 'iff' | otherlv_8= '+' | otherlv_9= '-' | otherlv_10= '++' | otherlv_11= '<:' | otherlv_12= ':>' | ( (lv_dot_13_0= ruleDot ) ) | otherlv_14= '<<' | otherlv_15= '>>' | otherlv_16= '>>>' | otherlv_17= 'until' | otherlv_18= 'releases' | otherlv_19= 'since' | otherlv_20= 'triggered' ) ) )
            // InternalAls.g:4575:2: ( () (otherlv_1= '||' | otherlv_2= 'or' | otherlv_3= '&&' | otherlv_4= 'and' | otherlv_5= '&' | otherlv_6= '<=>' | otherlv_7= 'iff' | otherlv_8= '+' | otherlv_9= '-' | otherlv_10= '++' | otherlv_11= '<:' | otherlv_12= ':>' | ( (lv_dot_13_0= ruleDot ) ) | otherlv_14= '<<' | otherlv_15= '>>' | otherlv_16= '>>>' | otherlv_17= 'until' | otherlv_18= 'releases' | otherlv_19= 'since' | otherlv_20= 'triggered' ) )
            {
            // InternalAls.g:4575:2: ( () (otherlv_1= '||' | otherlv_2= 'or' | otherlv_3= '&&' | otherlv_4= 'and' | otherlv_5= '&' | otherlv_6= '<=>' | otherlv_7= 'iff' | otherlv_8= '+' | otherlv_9= '-' | otherlv_10= '++' | otherlv_11= '<:' | otherlv_12= ':>' | ( (lv_dot_13_0= ruleDot ) ) | otherlv_14= '<<' | otherlv_15= '>>' | otherlv_16= '>>>' | otherlv_17= 'until' | otherlv_18= 'releases' | otherlv_19= 'since' | otherlv_20= 'triggered' ) )
            // InternalAls.g:4576:3: () (otherlv_1= '||' | otherlv_2= 'or' | otherlv_3= '&&' | otherlv_4= 'and' | otherlv_5= '&' | otherlv_6= '<=>' | otherlv_7= 'iff' | otherlv_8= '+' | otherlv_9= '-' | otherlv_10= '++' | otherlv_11= '<:' | otherlv_12= ':>' | ( (lv_dot_13_0= ruleDot ) ) | otherlv_14= '<<' | otherlv_15= '>>' | otherlv_16= '>>>' | otherlv_17= 'until' | otherlv_18= 'releases' | otherlv_19= 'since' | otherlv_20= 'triggered' )
            {
            // InternalAls.g:4576:3: ()
            // InternalAls.g:4577:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBinOpAccess().getBinOpAction_0(),
              					current);
              			
            }

            }

            // InternalAls.g:4586:3: (otherlv_1= '||' | otherlv_2= 'or' | otherlv_3= '&&' | otherlv_4= 'and' | otherlv_5= '&' | otherlv_6= '<=>' | otherlv_7= 'iff' | otherlv_8= '+' | otherlv_9= '-' | otherlv_10= '++' | otherlv_11= '<:' | otherlv_12= ':>' | ( (lv_dot_13_0= ruleDot ) ) | otherlv_14= '<<' | otherlv_15= '>>' | otherlv_16= '>>>' | otherlv_17= 'until' | otherlv_18= 'releases' | otherlv_19= 'since' | otherlv_20= 'triggered' )
            int alt87=20;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt87=1;
                }
                break;
            case 61:
                {
                alt87=2;
                }
                break;
            case 62:
                {
                alt87=3;
                }
                break;
            case 63:
                {
                alt87=4;
                }
                break;
            case 64:
                {
                alt87=5;
                }
                break;
            case 65:
                {
                alt87=6;
                }
                break;
            case 66:
                {
                alt87=7;
                }
                break;
            case 40:
                {
                alt87=8;
                }
                break;
            case 67:
                {
                alt87=9;
                }
                break;
            case 68:
                {
                alt87=10;
                }
                break;
            case 69:
                {
                alt87=11;
                }
                break;
            case 70:
                {
                alt87=12;
                }
                break;
            case 101:
                {
                alt87=13;
                }
                break;
            case 71:
                {
                alt87=14;
                }
                break;
            case 72:
                {
                alt87=15;
                }
                break;
            case 73:
                {
                alt87=16;
                }
                break;
            case 74:
                {
                alt87=17;
                }
                break;
            case 75:
                {
                alt87=18;
                }
                break;
            case 76:
                {
                alt87=19;
                }
                break;
            case 77:
                {
                alt87=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalAls.g:4587:4: otherlv_1= '||'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBinOpAccess().getVerticalLineVerticalLineKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:4592:4: otherlv_2= 'or'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBinOpAccess().getOrKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:4597:4: otherlv_3= '&&'
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getBinOpAccess().getAmpersandAmpersandKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalAls.g:4602:4: otherlv_4= 'and'
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getBinOpAccess().getAndKeyword_1_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalAls.g:4607:4: otherlv_5= '&'
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getBinOpAccess().getAmpersandKeyword_1_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalAls.g:4612:4: otherlv_6= '<=>'
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getBinOpAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalAls.g:4617:4: otherlv_7= 'iff'
                    {
                    otherlv_7=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getBinOpAccess().getIffKeyword_1_6());
                      			
                    }

                    }
                    break;
                case 8 :
                    // InternalAls.g:4622:4: otherlv_8= '+'
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getBinOpAccess().getPlusSignKeyword_1_7());
                      			
                    }

                    }
                    break;
                case 9 :
                    // InternalAls.g:4627:4: otherlv_9= '-'
                    {
                    otherlv_9=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getBinOpAccess().getHyphenMinusKeyword_1_8());
                      			
                    }

                    }
                    break;
                case 10 :
                    // InternalAls.g:4632:4: otherlv_10= '++'
                    {
                    otherlv_10=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getBinOpAccess().getPlusSignPlusSignKeyword_1_9());
                      			
                    }

                    }
                    break;
                case 11 :
                    // InternalAls.g:4637:4: otherlv_11= '<:'
                    {
                    otherlv_11=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getBinOpAccess().getLessThanSignColonKeyword_1_10());
                      			
                    }

                    }
                    break;
                case 12 :
                    // InternalAls.g:4642:4: otherlv_12= ':>'
                    {
                    otherlv_12=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getBinOpAccess().getColonGreaterThanSignKeyword_1_11());
                      			
                    }

                    }
                    break;
                case 13 :
                    // InternalAls.g:4647:4: ( (lv_dot_13_0= ruleDot ) )
                    {
                    // InternalAls.g:4647:4: ( (lv_dot_13_0= ruleDot ) )
                    // InternalAls.g:4648:5: (lv_dot_13_0= ruleDot )
                    {
                    // InternalAls.g:4648:5: (lv_dot_13_0= ruleDot )
                    // InternalAls.g:4649:6: lv_dot_13_0= ruleDot
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBinOpAccess().getDotDotParserRuleCall_1_12_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_dot_13_0=ruleDot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBinOpRule());
                      						}
                      						set(
                      							current,
                      							"dot",
                      							lv_dot_13_0,
                      							"lang.formal.alloy.Als.Dot");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalAls.g:4667:4: otherlv_14= '<<'
                    {
                    otherlv_14=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getBinOpAccess().getLessThanSignLessThanSignKeyword_1_13());
                      			
                    }

                    }
                    break;
                case 15 :
                    // InternalAls.g:4672:4: otherlv_15= '>>'
                    {
                    otherlv_15=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getBinOpAccess().getGreaterThanSignGreaterThanSignKeyword_1_14());
                      			
                    }

                    }
                    break;
                case 16 :
                    // InternalAls.g:4677:4: otherlv_16= '>>>'
                    {
                    otherlv_16=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getBinOpAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_15());
                      			
                    }

                    }
                    break;
                case 17 :
                    // InternalAls.g:4682:4: otherlv_17= 'until'
                    {
                    otherlv_17=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getBinOpAccess().getUntilKeyword_1_16());
                      			
                    }

                    }
                    break;
                case 18 :
                    // InternalAls.g:4687:4: otherlv_18= 'releases'
                    {
                    otherlv_18=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getBinOpAccess().getReleasesKeyword_1_17());
                      			
                    }

                    }
                    break;
                case 19 :
                    // InternalAls.g:4692:4: otherlv_19= 'since'
                    {
                    otherlv_19=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getBinOpAccess().getSinceKeyword_1_18());
                      			
                    }

                    }
                    break;
                case 20 :
                    // InternalAls.g:4697:4: otherlv_20= 'triggered'
                    {
                    otherlv_20=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getBinOpAccess().getTriggeredKeyword_1_19());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBinOp"


    // $ANTLR start "entryRuleUnOp"
    // InternalAls.g:4706:1: entryRuleUnOp returns [EObject current=null] : iv_ruleUnOp= ruleUnOp EOF ;
    public final EObject entryRuleUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOp = null;


        try {
            // InternalAls.g:4706:45: (iv_ruleUnOp= ruleUnOp EOF )
            // InternalAls.g:4707:2: iv_ruleUnOp= ruleUnOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnOp=ruleUnOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnOp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnOp"


    // $ANTLR start "ruleUnOp"
    // InternalAls.g:4713:1: ruleUnOp returns [EObject current=null] : ( () (otherlv_1= 'not' | otherlv_2= 'set' | otherlv_3= 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) ) ) ) ) ;
    public final EObject ruleUnOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_op_4_1=null;
        Token lv_op_4_2=null;
        Token lv_op_4_3=null;
        Token lv_op_4_4=null;
        Token lv_op_4_5=null;
        Token lv_op_4_6=null;
        Token lv_op_4_7=null;
        Token lv_op_4_8=null;
        Token lv_op_4_9=null;
        Token lv_op_4_10=null;
        Token lv_op_4_11=null;


        	enterRule();

        try {
            // InternalAls.g:4719:2: ( ( () (otherlv_1= 'not' | otherlv_2= 'set' | otherlv_3= 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) ) ) ) ) )
            // InternalAls.g:4720:2: ( () (otherlv_1= 'not' | otherlv_2= 'set' | otherlv_3= 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) ) ) ) )
            {
            // InternalAls.g:4720:2: ( () (otherlv_1= 'not' | otherlv_2= 'set' | otherlv_3= 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) ) ) ) )
            // InternalAls.g:4721:3: () (otherlv_1= 'not' | otherlv_2= 'set' | otherlv_3= 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) ) ) )
            {
            // InternalAls.g:4721:3: ()
            // InternalAls.g:4722:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnOpAccess().getUnOpAction_0(),
              					current);
              			
            }

            }

            // InternalAls.g:4731:3: (otherlv_1= 'not' | otherlv_2= 'set' | otherlv_3= 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) ) ) )
            int alt89=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt89=1;
                }
                break;
            case 78:
                {
                alt89=2;
                }
                break;
            case 27:
                {
                alt89=3;
                }
                break;
            case 41:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
                {
                alt89=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalAls.g:4732:4: otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getUnOpAccess().getNotKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:4737:4: otherlv_2= 'set'
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getUnOpAccess().getSetKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:4742:4: otherlv_3= 'seq'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getUnOpAccess().getSeqKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalAls.g:4747:4: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) ) )
                    {
                    // InternalAls.g:4747:4: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) ) )
                    // InternalAls.g:4748:5: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) )
                    {
                    // InternalAls.g:4748:5: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' ) )
                    // InternalAls.g:4749:6: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' )
                    {
                    // InternalAls.g:4749:6: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' | lv_op_4_6= 'always' | lv_op_4_7= 'eventually' | lv_op_4_8= 'after' | lv_op_4_9= 'before' | lv_op_4_10= 'historically' | lv_op_4_11= 'once' )
                    int alt88=11;
                    switch ( input.LA(1) ) {
                    case 41:
                        {
                        alt88=1;
                        }
                        break;
                    case 79:
                        {
                        alt88=2;
                        }
                        break;
                    case 80:
                        {
                        alt88=3;
                        }
                        break;
                    case 81:
                        {
                        alt88=4;
                        }
                        break;
                    case 82:
                        {
                        alt88=5;
                        }
                        break;
                    case 83:
                        {
                        alt88=6;
                        }
                        break;
                    case 84:
                        {
                        alt88=7;
                        }
                        break;
                    case 85:
                        {
                        alt88=8;
                        }
                        break;
                    case 86:
                        {
                        alt88=9;
                        }
                        break;
                    case 87:
                        {
                        alt88=10;
                        }
                        break;
                    case 88:
                        {
                        alt88=11;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        throw nvae;
                    }

                    switch (alt88) {
                        case 1 :
                            // InternalAls.g:4750:7: lv_op_4_1= '!'
                            {
                            lv_op_4_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_1, grammarAccess.getUnOpAccess().getOpExclamationMarkKeyword_1_3_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalAls.g:4761:7: lv_op_4_2= '#'
                            {
                            lv_op_4_2=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_2, grammarAccess.getUnOpAccess().getOpNumberSignKeyword_1_3_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_2, null);
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalAls.g:4772:7: lv_op_4_3= '~'
                            {
                            lv_op_4_3=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_3, grammarAccess.getUnOpAccess().getOpTildeKeyword_1_3_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_3, null);
                              						
                            }

                            }
                            break;
                        case 4 :
                            // InternalAls.g:4783:7: lv_op_4_4= '*'
                            {
                            lv_op_4_4=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_4, grammarAccess.getUnOpAccess().getOpAsteriskKeyword_1_3_0_3());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_4, null);
                              						
                            }

                            }
                            break;
                        case 5 :
                            // InternalAls.g:4794:7: lv_op_4_5= '^'
                            {
                            lv_op_4_5=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_5, grammarAccess.getUnOpAccess().getOpCircumflexAccentKeyword_1_3_0_4());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_5, null);
                              						
                            }

                            }
                            break;
                        case 6 :
                            // InternalAls.g:4805:7: lv_op_4_6= 'always'
                            {
                            lv_op_4_6=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_6, grammarAccess.getUnOpAccess().getOpAlwaysKeyword_1_3_0_5());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_6, null);
                              						
                            }

                            }
                            break;
                        case 7 :
                            // InternalAls.g:4816:7: lv_op_4_7= 'eventually'
                            {
                            lv_op_4_7=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_7, grammarAccess.getUnOpAccess().getOpEventuallyKeyword_1_3_0_6());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_7, null);
                              						
                            }

                            }
                            break;
                        case 8 :
                            // InternalAls.g:4827:7: lv_op_4_8= 'after'
                            {
                            lv_op_4_8=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_8, grammarAccess.getUnOpAccess().getOpAfterKeyword_1_3_0_7());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_8, null);
                              						
                            }

                            }
                            break;
                        case 9 :
                            // InternalAls.g:4838:7: lv_op_4_9= 'before'
                            {
                            lv_op_4_9=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_9, grammarAccess.getUnOpAccess().getOpBeforeKeyword_1_3_0_8());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_9, null);
                              						
                            }

                            }
                            break;
                        case 10 :
                            // InternalAls.g:4849:7: lv_op_4_10= 'historically'
                            {
                            lv_op_4_10=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_10, grammarAccess.getUnOpAccess().getOpHistoricallyKeyword_1_3_0_9());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_10, null);
                              						
                            }

                            }
                            break;
                        case 11 :
                            // InternalAls.g:4860:7: lv_op_4_11= 'once'
                            {
                            lv_op_4_11=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_4_11, grammarAccess.getUnOpAccess().getOpOnceKeyword_1_3_0_10());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnOpRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_4_11, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnOp"


    // $ANTLR start "entryRuleCommonQuantUnOp"
    // InternalAls.g:4878:1: entryRuleCommonQuantUnOp returns [EObject current=null] : iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF ;
    public final EObject entryRuleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonQuantUnOp = null;


        try {
            // InternalAls.g:4878:56: (iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF )
            // InternalAls.g:4879:2: iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonQuantUnOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommonQuantUnOp=ruleCommonQuantUnOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonQuantUnOp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommonQuantUnOp"


    // $ANTLR start "ruleCommonQuantUnOp"
    // InternalAls.g:4885:1: ruleCommonQuantUnOp returns [EObject current=null] : ( () (otherlv_1= 'no' | otherlv_2= 'some' | otherlv_3= 'lone' | otherlv_4= 'one' ) ) ;
    public final EObject ruleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAls.g:4891:2: ( ( () (otherlv_1= 'no' | otherlv_2= 'some' | otherlv_3= 'lone' | otherlv_4= 'one' ) ) )
            // InternalAls.g:4892:2: ( () (otherlv_1= 'no' | otherlv_2= 'some' | otherlv_3= 'lone' | otherlv_4= 'one' ) )
            {
            // InternalAls.g:4892:2: ( () (otherlv_1= 'no' | otherlv_2= 'some' | otherlv_3= 'lone' | otherlv_4= 'one' ) )
            // InternalAls.g:4893:3: () (otherlv_1= 'no' | otherlv_2= 'some' | otherlv_3= 'lone' | otherlv_4= 'one' )
            {
            // InternalAls.g:4893:3: ()
            // InternalAls.g:4894:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCommonQuantUnOpAccess().getCommonQuantUnOpAction_0(),
              					current);
              			
            }

            }

            // InternalAls.g:4903:3: (otherlv_1= 'no' | otherlv_2= 'some' | otherlv_3= 'lone' | otherlv_4= 'one' )
            int alt90=4;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt90=1;
                }
                break;
            case 37:
                {
                alt90=2;
                }
                break;
            case 35:
                {
                alt90=3;
                }
                break;
            case 36:
                {
                alt90=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalAls.g:4904:4: otherlv_1= 'no'
                    {
                    otherlv_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCommonQuantUnOpAccess().getNoKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:4909:4: otherlv_2= 'some'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCommonQuantUnOpAccess().getSomeKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:4914:4: otherlv_3= 'lone'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCommonQuantUnOpAccess().getLoneKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalAls.g:4919:4: otherlv_4= 'one'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCommonQuantUnOpAccess().getOneKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCommonQuantUnOp"


    // $ANTLR start "entryRuleCompareOp"
    // InternalAls.g:4928:1: entryRuleCompareOp returns [String current=null] : iv_ruleCompareOp= ruleCompareOp EOF ;
    public final String entryRuleCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOp = null;


        try {
            // InternalAls.g:4928:49: (iv_ruleCompareOp= ruleCompareOp EOF )
            // InternalAls.g:4929:2: iv_ruleCompareOp= ruleCompareOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompareOp=ruleCompareOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompareOp"


    // $ANTLR start "ruleCompareOp"
    // InternalAls.g:4935:1: ruleCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAls.g:4941:2: ( (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) )
            // InternalAls.g:4942:2: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            {
            // InternalAls.g:4942:2: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            int alt91=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt91=1;
                }
                break;
            case 39:
                {
                alt91=2;
                }
                break;
            case 90:
                {
                alt91=3;
                }
                break;
            case 91:
                {
                alt91=4;
                }
                break;
            case 92:
                {
                alt91=5;
                }
                break;
            case 93:
                {
                alt91=6;
                }
                break;
            case 94:
                {
                alt91=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalAls.g:4943:3: kw= '='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompareOpAccess().getEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:4949:3: kw= 'in'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompareOpAccess().getInKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:4955:3: kw= '<'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompareOpAccess().getLessThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAls.g:4961:3: kw= '>'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompareOpAccess().getGreaterThanSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAls.g:4967:3: kw= '=<'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompareOpAccess().getEqualsSignLessThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAls.g:4973:3: kw= '<='
                    {
                    kw=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompareOpAccess().getLessThanSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAls.g:4979:3: kw= '>='
                    {
                    kw=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompareOpAccess().getGreaterThanSignEqualsSignKeyword_6());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompareOp"


    // $ANTLR start "entryRuleArrowOp"
    // InternalAls.g:4988:1: entryRuleArrowOp returns [EObject current=null] : iv_ruleArrowOp= ruleArrowOp EOF ;
    public final EObject entryRuleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOp = null;


        try {
            // InternalAls.g:4988:48: (iv_ruleArrowOp= ruleArrowOp EOF )
            // InternalAls.g:4989:2: iv_ruleArrowOp= ruleArrowOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrowOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrowOp=ruleArrowOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrowOp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrowOp"


    // $ANTLR start "ruleArrowOp"
    // InternalAls.g:4995:1: ruleArrowOp returns [EObject current=null] : ( (otherlv_0= 'some' | otherlv_1= 'one' | otherlv_2= 'lone' | otherlv_3= 'set' )? ( (lv_arrow_4_0= '->' ) ) ) ;
    public final EObject ruleArrowOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_arrow_4_0=null;


        	enterRule();

        try {
            // InternalAls.g:5001:2: ( ( (otherlv_0= 'some' | otherlv_1= 'one' | otherlv_2= 'lone' | otherlv_3= 'set' )? ( (lv_arrow_4_0= '->' ) ) ) )
            // InternalAls.g:5002:2: ( (otherlv_0= 'some' | otherlv_1= 'one' | otherlv_2= 'lone' | otherlv_3= 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            {
            // InternalAls.g:5002:2: ( (otherlv_0= 'some' | otherlv_1= 'one' | otherlv_2= 'lone' | otherlv_3= 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            // InternalAls.g:5003:3: (otherlv_0= 'some' | otherlv_1= 'one' | otherlv_2= 'lone' | otherlv_3= 'set' )? ( (lv_arrow_4_0= '->' ) )
            {
            // InternalAls.g:5003:3: (otherlv_0= 'some' | otherlv_1= 'one' | otherlv_2= 'lone' | otherlv_3= 'set' )?
            int alt92=5;
            switch ( input.LA(1) ) {
                case 37:
                    {
                    alt92=1;
                    }
                    break;
                case 36:
                    {
                    alt92=2;
                    }
                    break;
                case 35:
                    {
                    alt92=3;
                    }
                    break;
                case 78:
                    {
                    alt92=4;
                    }
                    break;
            }

            switch (alt92) {
                case 1 :
                    // InternalAls.g:5004:4: otherlv_0= 'some'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getArrowOpAccess().getSomeKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:5009:4: otherlv_1= 'one'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getArrowOpAccess().getOneKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:5014:4: otherlv_2= 'lone'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArrowOpAccess().getLoneKeyword_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalAls.g:5019:4: otherlv_3= 'set'
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrowOpAccess().getSetKeyword_0_3());
                      			
                    }

                    }
                    break;

            }

            // InternalAls.g:5024:3: ( (lv_arrow_4_0= '->' ) )
            // InternalAls.g:5025:4: (lv_arrow_4_0= '->' )
            {
            // InternalAls.g:5025:4: (lv_arrow_4_0= '->' )
            // InternalAls.g:5026:5: lv_arrow_4_0= '->'
            {
            lv_arrow_4_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_arrow_4_0, grammarAccess.getArrowOpAccess().getArrowHyphenMinusGreaterThanSignKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArrowOpRule());
              					}
              					setWithLastConsumed(current, "arrow", lv_arrow_4_0, "->");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrowOp"


    // $ANTLR start "entryRuleBlock"
    // InternalAls.g:5042:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalAls.g:5042:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalAls.g:5043:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalAls.g:5049:1: ruleBlock returns [EObject current=null] : ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_leftC_0_0 = null;

        EObject lv_expr_1_0 = null;

        EObject lv_rightC_2_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5055:2: ( ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) )
            // InternalAls.g:5056:2: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            {
            // InternalAls.g:5056:2: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            // InternalAls.g:5057:3: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            {
            // InternalAls.g:5057:3: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) )
            // InternalAls.g:5058:4: (lv_leftC_0_0= ruleLeftCurlyBracket )
            {
            // InternalAls.g:5058:4: (lv_leftC_0_0= ruleLeftCurlyBracket )
            // InternalAls.g:5059:5: lv_leftC_0_0= ruleLeftCurlyBracket
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockAccess().getLeftCLeftCurlyBracketParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_69);
            lv_leftC_0_0=ruleLeftCurlyBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockRule());
              					}
              					set(
              						current,
              						"leftC",
              						lv_leftC_0_0,
              						"lang.formal.alloy.Als.LeftCurlyBracket");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAls.g:5076:3: ( (lv_expr_1_0= ruleExpression ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=RULE_INT && LA93_0<=RULE_NEGATIVE_INTEGER)||LA93_0==16||LA93_0==18||(LA93_0>=25 && LA93_0<=27)||LA93_0==32||(LA93_0>=35 && LA93_0<=37)||(LA93_0>=41 && LA93_0<=42)||LA93_0==48||(LA93_0>=50 && LA93_0<=56)||(LA93_0>=58 && LA93_0<=59)||(LA93_0>=78 && LA93_0<=89)) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalAls.g:5077:4: (lv_expr_1_0= ruleExpression )
            	    {
            	    // InternalAls.g:5077:4: (lv_expr_1_0= ruleExpression )
            	    // InternalAls.g:5078:5: lv_expr_1_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getExprExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_69);
            	    lv_expr_1_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"expr",
            	      						lv_expr_1_0,
            	      						"lang.formal.alloy.Als.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            // InternalAls.g:5095:3: ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            // InternalAls.g:5096:4: (lv_rightC_2_0= ruleRightCurlyBracket )
            {
            // InternalAls.g:5096:4: (lv_rightC_2_0= ruleRightCurlyBracket )
            // InternalAls.g:5097:5: lv_rightC_2_0= ruleRightCurlyBracket
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockAccess().getRightCRightCurlyBracketParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rightC_2_0=ruleRightCurlyBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockRule());
              					}
              					set(
              						current,
              						"rightC",
              						lv_rightC_2_0,
              						"lang.formal.alloy.Als.RightCurlyBracket");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleBlockOrBar"
    // InternalAls.g:5118:1: entryRuleBlockOrBar returns [EObject current=null] : iv_ruleBlockOrBar= ruleBlockOrBar EOF ;
    public final EObject entryRuleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockOrBar = null;


        try {
            // InternalAls.g:5118:51: (iv_ruleBlockOrBar= ruleBlockOrBar EOF )
            // InternalAls.g:5119:2: iv_ruleBlockOrBar= ruleBlockOrBar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockOrBarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockOrBar=ruleBlockOrBar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockOrBar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlockOrBar"


    // $ANTLR start "ruleBlockOrBar"
    // InternalAls.g:5125:1: ruleBlockOrBar returns [EObject current=null] : ( ( (lv_block_0_0= ruleBlock ) ) | (otherlv_1= '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleBlockOrBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_block_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5131:2: ( ( ( (lv_block_0_0= ruleBlock ) ) | (otherlv_1= '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // InternalAls.g:5132:2: ( ( (lv_block_0_0= ruleBlock ) ) | (otherlv_1= '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // InternalAls.g:5132:2: ( ( (lv_block_0_0= ruleBlock ) ) | (otherlv_1= '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==32) ) {
                alt94=1;
            }
            else if ( (LA94_0==96) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalAls.g:5133:3: ( (lv_block_0_0= ruleBlock ) )
                    {
                    // InternalAls.g:5133:3: ( (lv_block_0_0= ruleBlock ) )
                    // InternalAls.g:5134:4: (lv_block_0_0= ruleBlock )
                    {
                    // InternalAls.g:5134:4: (lv_block_0_0= ruleBlock )
                    // InternalAls.g:5135:5: lv_block_0_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockOrBarAccess().getBlockBlockParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_0_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockOrBarRule());
                      					}
                      					set(
                      						current,
                      						"block",
                      						lv_block_0_0,
                      						"lang.formal.alloy.Als.Block");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:5153:3: (otherlv_1= '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    {
                    // InternalAls.g:5153:3: (otherlv_1= '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    // InternalAls.g:5154:4: otherlv_1= '|' ( (lv_expr_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,96,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBlockOrBarAccess().getVerticalLineKeyword_1_0());
                      			
                    }
                    // InternalAls.g:5158:4: ( (lv_expr_2_0= ruleExpression ) )
                    // InternalAls.g:5159:5: (lv_expr_2_0= ruleExpression )
                    {
                    // InternalAls.g:5159:5: (lv_expr_2_0= ruleExpression )
                    // InternalAls.g:5160:6: lv_expr_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlockOrBarAccess().getExprExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBlockOrBarRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_2_0,
                      							"lang.formal.alloy.Als.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlockOrBar"


    // $ANTLR start "entryRuleOpenName"
    // InternalAls.g:5182:1: entryRuleOpenName returns [EObject current=null] : iv_ruleOpenName= ruleOpenName EOF ;
    public final EObject entryRuleOpenName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenName = null;


        try {
            // InternalAls.g:5182:49: (iv_ruleOpenName= ruleOpenName EOF )
            // InternalAls.g:5183:2: iv_ruleOpenName= ruleOpenName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpenNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpenName=ruleOpenName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpenName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpenName"


    // $ANTLR start "ruleOpenName"
    // InternalAls.g:5189:1: ruleOpenName returns [EObject current=null] : (otherlv_0= 'open' ( (lv_importURI_1_0= ruleName ) ) ) ;
    public final EObject ruleOpenName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5195:2: ( (otherlv_0= 'open' ( (lv_importURI_1_0= ruleName ) ) ) )
            // InternalAls.g:5196:2: (otherlv_0= 'open' ( (lv_importURI_1_0= ruleName ) ) )
            {
            // InternalAls.g:5196:2: (otherlv_0= 'open' ( (lv_importURI_1_0= ruleName ) ) )
            // InternalAls.g:5197:3: otherlv_0= 'open' ( (lv_importURI_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOpenNameAccess().getOpenKeyword_0());
              		
            }
            // InternalAls.g:5201:3: ( (lv_importURI_1_0= ruleName ) )
            // InternalAls.g:5202:4: (lv_importURI_1_0= ruleName )
            {
            // InternalAls.g:5202:4: (lv_importURI_1_0= ruleName )
            // InternalAls.g:5203:5: lv_importURI_1_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOpenNameAccess().getImportURINameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importURI_1_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOpenNameRule());
              					}
              					set(
              						current,
              						"importURI",
              						lv_importURI_1_0,
              						"lang.formal.alloy.Als.Name");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOpenName"


    // $ANTLR start "entryRuleFactName"
    // InternalAls.g:5224:1: entryRuleFactName returns [EObject current=null] : iv_ruleFactName= ruleFactName EOF ;
    public final EObject entryRuleFactName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactName = null;


        try {
            // InternalAls.g:5224:49: (iv_ruleFactName= ruleFactName EOF )
            // InternalAls.g:5225:2: iv_ruleFactName= ruleFactName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFactName=ruleFactName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFactName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFactName"


    // $ANTLR start "ruleFactName"
    // InternalAls.g:5231:1: ruleFactName returns [EObject current=null] : ( () otherlv_1= 'fact' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleFactName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5237:2: ( ( () otherlv_1= 'fact' ( (lv_name_2_0= ruleName ) )? ) )
            // InternalAls.g:5238:2: ( () otherlv_1= 'fact' ( (lv_name_2_0= ruleName ) )? )
            {
            // InternalAls.g:5238:2: ( () otherlv_1= 'fact' ( (lv_name_2_0= ruleName ) )? )
            // InternalAls.g:5239:3: () otherlv_1= 'fact' ( (lv_name_2_0= ruleName ) )?
            {
            // InternalAls.g:5239:3: ()
            // InternalAls.g:5240:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFactNameAccess().getFactNameAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,98,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFactNameAccess().getFactKeyword_1());
              		
            }
            // InternalAls.g:5253:3: ( (lv_name_2_0= ruleName ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID||LA95_0==25) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalAls.g:5254:4: (lv_name_2_0= ruleName )
                    {
                    // InternalAls.g:5254:4: (lv_name_2_0= ruleName )
                    // InternalAls.g:5255:5: lv_name_2_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFactNameAccess().getNameNameParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFactNameRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_2_0,
                      						"lang.formal.alloy.Als.Name");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFactName"


    // $ANTLR start "entryRuleAssertionName"
    // InternalAls.g:5276:1: entryRuleAssertionName returns [EObject current=null] : iv_ruleAssertionName= ruleAssertionName EOF ;
    public final EObject entryRuleAssertionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionName = null;


        try {
            // InternalAls.g:5276:54: (iv_ruleAssertionName= ruleAssertionName EOF )
            // InternalAls.g:5277:2: iv_ruleAssertionName= ruleAssertionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssertionName=ruleAssertionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssertionName"


    // $ANTLR start "ruleAssertionName"
    // InternalAls.g:5283:1: ruleAssertionName returns [EObject current=null] : ( () otherlv_1= 'assert' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleAssertionName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5289:2: ( ( () otherlv_1= 'assert' ( (lv_name_2_0= ruleName ) )? ) )
            // InternalAls.g:5290:2: ( () otherlv_1= 'assert' ( (lv_name_2_0= ruleName ) )? )
            {
            // InternalAls.g:5290:2: ( () otherlv_1= 'assert' ( (lv_name_2_0= ruleName ) )? )
            // InternalAls.g:5291:3: () otherlv_1= 'assert' ( (lv_name_2_0= ruleName ) )?
            {
            // InternalAls.g:5291:3: ()
            // InternalAls.g:5292:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAssertionNameAccess().getAssertionNameAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,99,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssertionNameAccess().getAssertKeyword_1());
              		
            }
            // InternalAls.g:5305:3: ( (lv_name_2_0= ruleName ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID||LA96_0==25) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAls.g:5306:4: (lv_name_2_0= ruleName )
                    {
                    // InternalAls.g:5306:4: (lv_name_2_0= ruleName )
                    // InternalAls.g:5307:5: lv_name_2_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAssertionNameAccess().getNameNameParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAssertionNameRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_2_0,
                      						"lang.formal.alloy.Als.Name");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssertionName"


    // $ANTLR start "entryRuleFunctionName"
    // InternalAls.g:5328:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalAls.g:5328:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalAls.g:5329:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalAls.g:5335:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5341:2: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalAls.g:5342:2: ( (lv_name_0_0= ruleName ) )
            {
            // InternalAls.g:5342:2: ( (lv_name_0_0= ruleName ) )
            // InternalAls.g:5343:3: (lv_name_0_0= ruleName )
            {
            // InternalAls.g:5343:3: (lv_name_0_0= ruleName )
            // InternalAls.g:5344:4: lv_name_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFunctionNameAccess().getNameNameParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFunctionNameRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"lang.formal.alloy.Als.Name");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleFunctionNamewParam"
    // InternalAls.g:5364:1: entryRuleFunctionNamewParam returns [EObject current=null] : iv_ruleFunctionNamewParam= ruleFunctionNamewParam EOF ;
    public final EObject entryRuleFunctionNamewParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionNamewParam = null;


        try {
            // InternalAls.g:5364:59: (iv_ruleFunctionNamewParam= ruleFunctionNamewParam EOF )
            // InternalAls.g:5365:2: iv_ruleFunctionNamewParam= ruleFunctionNamewParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionNamewParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionNamewParam=ruleFunctionNamewParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionNamewParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionNamewParam"


    // $ANTLR start "ruleFunctionNamewParam"
    // InternalAls.g:5371:1: ruleFunctionNamewParam returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleFunctionNamewParam() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5377:2: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalAls.g:5378:2: ( (lv_name_0_0= ruleName ) )
            {
            // InternalAls.g:5378:2: ( (lv_name_0_0= ruleName ) )
            // InternalAls.g:5379:3: (lv_name_0_0= ruleName )
            {
            // InternalAls.g:5379:3: (lv_name_0_0= ruleName )
            // InternalAls.g:5380:4: lv_name_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFunctionNamewParamAccess().getNameNameParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFunctionNamewParamRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"lang.formal.alloy.Als.Name");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionNamewParam"


    // $ANTLR start "entryRulePredicateName"
    // InternalAls.g:5400:1: entryRulePredicateName returns [EObject current=null] : iv_rulePredicateName= rulePredicateName EOF ;
    public final EObject entryRulePredicateName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateName = null;


        try {
            // InternalAls.g:5400:54: (iv_rulePredicateName= rulePredicateName EOF )
            // InternalAls.g:5401:2: iv_rulePredicateName= rulePredicateName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredicateName=rulePredicateName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicateName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePredicateName"


    // $ANTLR start "rulePredicateName"
    // InternalAls.g:5407:1: rulePredicateName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePredicateName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5413:2: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalAls.g:5414:2: ( (lv_name_0_0= ruleName ) )
            {
            // InternalAls.g:5414:2: ( (lv_name_0_0= ruleName ) )
            // InternalAls.g:5415:3: (lv_name_0_0= ruleName )
            {
            // InternalAls.g:5415:3: (lv_name_0_0= ruleName )
            // InternalAls.g:5416:4: lv_name_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPredicateNameAccess().getNameNameParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPredicateNameRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"lang.formal.alloy.Als.Name");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePredicateName"


    // $ANTLR start "entryRuleAlias"
    // InternalAls.g:5436:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalAls.g:5436:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalAls.g:5437:2: iv_ruleAlias= ruleAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlias=ruleAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlias; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalAls.g:5443:1: ruleAlias returns [EObject current=null] : ( (lv_name_0_0= ruleNameAlias ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5449:2: ( ( (lv_name_0_0= ruleNameAlias ) ) )
            // InternalAls.g:5450:2: ( (lv_name_0_0= ruleNameAlias ) )
            {
            // InternalAls.g:5450:2: ( (lv_name_0_0= ruleNameAlias ) )
            // InternalAls.g:5451:3: (lv_name_0_0= ruleNameAlias )
            {
            // InternalAls.g:5451:3: (lv_name_0_0= ruleNameAlias )
            // InternalAls.g:5452:4: lv_name_0_0= ruleNameAlias
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAliasAccess().getNameNameAliasParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleNameAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAliasRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"lang.formal.alloy.Als.NameAlias");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleEnumName"
    // InternalAls.g:5472:1: entryRuleEnumName returns [EObject current=null] : iv_ruleEnumName= ruleEnumName EOF ;
    public final EObject entryRuleEnumName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumName = null;


        try {
            // InternalAls.g:5472:49: (iv_ruleEnumName= ruleEnumName EOF )
            // InternalAls.g:5473:2: iv_ruleEnumName= ruleEnumName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumName=ruleEnumName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumName"


    // $ANTLR start "ruleEnumName"
    // InternalAls.g:5479:1: ruleEnumName returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleEnumName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5485:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalAls.g:5486:2: (otherlv_0= 'enum' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalAls.g:5486:2: (otherlv_0= 'enum' ( (lv_name_1_0= ruleName ) ) )
            // InternalAls.g:5487:3: otherlv_0= 'enum' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,100,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumNameAccess().getEnumKeyword_0());
              		
            }
            // InternalAls.g:5491:3: ( (lv_name_1_0= ruleName ) )
            // InternalAls.g:5492:4: (lv_name_1_0= ruleName )
            {
            // InternalAls.g:5492:4: (lv_name_1_0= ruleName )
            // InternalAls.g:5493:5: lv_name_1_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumNameAccess().getNameNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumNameRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"lang.formal.alloy.Als.Name");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumName"


    // $ANTLR start "entryRuleEnumPropertyName"
    // InternalAls.g:5514:1: entryRuleEnumPropertyName returns [EObject current=null] : iv_ruleEnumPropertyName= ruleEnumPropertyName EOF ;
    public final EObject entryRuleEnumPropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumPropertyName = null;


        try {
            // InternalAls.g:5514:57: (iv_ruleEnumPropertyName= ruleEnumPropertyName EOF )
            // InternalAls.g:5515:2: iv_ruleEnumPropertyName= ruleEnumPropertyName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumPropertyNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumPropertyName=ruleEnumPropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumPropertyName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumPropertyName"


    // $ANTLR start "ruleEnumPropertyName"
    // InternalAls.g:5521:1: ruleEnumPropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleEnumPropertyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5527:2: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalAls.g:5528:2: ( (lv_name_0_0= ruleName ) )
            {
            // InternalAls.g:5528:2: ( (lv_name_0_0= ruleName ) )
            // InternalAls.g:5529:3: (lv_name_0_0= ruleName )
            {
            // InternalAls.g:5529:3: (lv_name_0_0= ruleName )
            // InternalAls.g:5530:4: lv_name_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnumPropertyNameAccess().getNameNameParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnumPropertyNameRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"lang.formal.alloy.Als.Name");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumPropertyName"


    // $ANTLR start "entryRuleLetName"
    // InternalAls.g:5550:1: entryRuleLetName returns [EObject current=null] : iv_ruleLetName= ruleLetName EOF ;
    public final EObject entryRuleLetName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetName = null;


        try {
            // InternalAls.g:5550:48: (iv_ruleLetName= ruleLetName EOF )
            // InternalAls.g:5551:2: iv_ruleLetName= ruleLetName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetName=ruleLetName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetName"


    // $ANTLR start "ruleLetName"
    // InternalAls.g:5557:1: ruleLetName returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleLetName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5563:2: ( (otherlv_0= 'let' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalAls.g:5564:2: (otherlv_0= 'let' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalAls.g:5564:2: (otherlv_0= 'let' ( (lv_name_1_0= ruleName ) ) )
            // InternalAls.g:5565:3: otherlv_0= 'let' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetNameAccess().getLetKeyword_0());
              		
            }
            // InternalAls.g:5569:3: ( (lv_name_1_0= ruleName ) )
            // InternalAls.g:5570:4: (lv_name_1_0= ruleName )
            {
            // InternalAls.g:5570:4: (lv_name_1_0= ruleName )
            // InternalAls.g:5571:5: lv_name_1_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetNameAccess().getNameNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetNameRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"lang.formal.alloy.Als.Name");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLetName"


    // $ANTLR start "entryRuleSignatureName"
    // InternalAls.g:5592:1: entryRuleSignatureName returns [EObject current=null] : iv_ruleSignatureName= ruleSignatureName EOF ;
    public final EObject entryRuleSignatureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignatureName = null;


        try {
            // InternalAls.g:5592:54: (iv_ruleSignatureName= ruleSignatureName EOF )
            // InternalAls.g:5593:2: iv_ruleSignatureName= ruleSignatureName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignatureName=ruleSignatureName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignatureName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignatureName"


    // $ANTLR start "ruleSignatureName"
    // InternalAls.g:5599:1: ruleSignatureName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleSignatureName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5605:2: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalAls.g:5606:2: ( (lv_name_0_0= ruleName ) )
            {
            // InternalAls.g:5606:2: ( (lv_name_0_0= ruleName ) )
            // InternalAls.g:5607:3: (lv_name_0_0= ruleName )
            {
            // InternalAls.g:5607:3: (lv_name_0_0= ruleName )
            // InternalAls.g:5608:4: lv_name_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSignatureNameAccess().getNameNameParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getSignatureNameRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"lang.formal.alloy.Als.Name");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSignatureName"


    // $ANTLR start "entryRulePropertyName"
    // InternalAls.g:5628:1: entryRulePropertyName returns [EObject current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final EObject entryRulePropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyName = null;


        try {
            // InternalAls.g:5628:53: (iv_rulePropertyName= rulePropertyName EOF )
            // InternalAls.g:5629:2: iv_rulePropertyName= rulePropertyName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyName=rulePropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyName"


    // $ANTLR start "rulePropertyName"
    // InternalAls.g:5635:1: rulePropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePropertyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5641:2: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalAls.g:5642:2: ( (lv_name_0_0= ruleName ) )
            {
            // InternalAls.g:5642:2: ( (lv_name_0_0= ruleName ) )
            // InternalAls.g:5643:3: (lv_name_0_0= ruleName )
            {
            // InternalAls.g:5643:3: (lv_name_0_0= ruleName )
            // InternalAls.g:5644:4: lv_name_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPropertyNameAccess().getNameNameParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPropertyNameRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"lang.formal.alloy.Als.Name");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyName"


    // $ANTLR start "entryRuleExactlyName"
    // InternalAls.g:5664:1: entryRuleExactlyName returns [EObject current=null] : iv_ruleExactlyName= ruleExactlyName EOF ;
    public final EObject entryRuleExactlyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactlyName = null;


        try {
            // InternalAls.g:5664:52: (iv_ruleExactlyName= ruleExactlyName EOF )
            // InternalAls.g:5665:2: iv_ruleExactlyName= ruleExactlyName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExactlyNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExactlyName=ruleExactlyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExactlyName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExactlyName"


    // $ANTLR start "ruleExactlyName"
    // InternalAls.g:5671:1: ruleExactlyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleExactlyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5677:2: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalAls.g:5678:2: ( (lv_name_0_0= ruleName ) )
            {
            // InternalAls.g:5678:2: ( (lv_name_0_0= ruleName ) )
            // InternalAls.g:5679:3: (lv_name_0_0= ruleName )
            {
            // InternalAls.g:5679:3: (lv_name_0_0= ruleName )
            // InternalAls.g:5680:4: lv_name_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getExactlyNameAccess().getNameNameParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getExactlyNameRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"lang.formal.alloy.Als.Name");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExactlyName"


    // $ANTLR start "entryRuleAsName"
    // InternalAls.g:5700:1: entryRuleAsName returns [EObject current=null] : iv_ruleAsName= ruleAsName EOF ;
    public final EObject entryRuleAsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsName = null;


        try {
            // InternalAls.g:5700:47: (iv_ruleAsName= ruleAsName EOF )
            // InternalAls.g:5701:2: iv_ruleAsName= ruleAsName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAsNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAsName=ruleAsName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAsName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAsName"


    // $ANTLR start "ruleAsName"
    // InternalAls.g:5707:1: ruleAsName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAsName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:5713:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAls.g:5714:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAls.g:5714:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAls.g:5715:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAls.g:5715:3: (lv_name_0_0= RULE_ID )
            // InternalAls.g:5716:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getAsNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getAsNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"lang.formal.alloy.Als.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAsName"


    // $ANTLR start "entryRuleNameAlias"
    // InternalAls.g:5735:1: entryRuleNameAlias returns [String current=null] : iv_ruleNameAlias= ruleNameAlias EOF ;
    public final String entryRuleNameAlias() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameAlias = null;


        try {
            // InternalAls.g:5735:49: (iv_ruleNameAlias= ruleNameAlias EOF )
            // InternalAls.g:5736:2: iv_ruleNameAlias= ruleNameAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNameAlias=ruleNameAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameAlias.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNameAlias"


    // $ANTLR start "ruleNameAlias"
    // InternalAls.g:5742:1: ruleNameAlias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNameAlias() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAls.g:5748:2: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // InternalAls.g:5749:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // InternalAls.g:5749:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // InternalAls.g:5750:3: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getNameAliasAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAls.g:5757:3: (kw= '/' this_ID_2= RULE_ID )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==14) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalAls.g:5758:4: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getNameAliasAccess().getSolidusKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getNameAliasAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNameAlias"


    // $ANTLR start "entryRuleName"
    // InternalAls.g:5775:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAls.g:5775:44: (iv_ruleName= ruleName EOF )
            // InternalAls.g:5776:2: iv_ruleName= ruleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalAls.g:5782:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalAls.g:5788:2: ( ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) )
            // InternalAls.g:5789:2: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            {
            // InternalAls.g:5789:2: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            // InternalAls.g:5790:3: (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )*
            {
            // InternalAls.g:5790:3: (kw= 'this' | this_ID_1= RULE_ID )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==25) ) {
                alt98=1;
            }
            else if ( (LA98_0==RULE_ID) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalAls.g:5791:4: kw= 'this'
                    {
                    kw=(Token)match(input,25,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNameAccess().getThisKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:5797:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_1, grammarAccess.getNameAccess().getIDTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAls.g:5805:3: (kw= '/' this_ID_3= RULE_ID )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==14) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalAls.g:5806:4: kw= '/' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getNameAccess().getSolidusKeyword_1_0());
            	      			
            	    }
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_3, grammarAccess.getNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleReferencesName"
    // InternalAls.g:5823:1: entryRuleReferencesName returns [EObject current=null] : iv_ruleReferencesName= ruleReferencesName EOF ;
    public final EObject entryRuleReferencesName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesName = null;


        try {
            // InternalAls.g:5823:55: (iv_ruleReferencesName= ruleReferencesName EOF )
            // InternalAls.g:5824:2: iv_ruleReferencesName= ruleReferencesName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferencesNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferencesName=ruleReferencesName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferencesName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferencesName"


    // $ANTLR start "ruleReferencesName"
    // InternalAls.g:5830:1: ruleReferencesName returns [EObject current=null] : (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName ) ;
    public final EObject ruleReferencesName() throws RecognitionException {
        EObject current = null;

        EObject this_FactName_0 = null;

        EObject this_FunctionName_1 = null;

        EObject this_FunctionNamewParam_2 = null;

        EObject this_EnumName_3 = null;

        EObject this_EnumPropertyName_4 = null;

        EObject this_SignatureName_5 = null;

        EObject this_PropertyName_6 = null;

        EObject this_ExactlyName_7 = null;

        EObject this_LetName_8 = null;

        EObject this_PredicateName_9 = null;



        	enterRule();

        try {
            // InternalAls.g:5836:2: ( (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName ) )
            // InternalAls.g:5837:2: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName )
            {
            // InternalAls.g:5837:2: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName )
            int alt100=10;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // InternalAls.g:5838:3: this_FactName_0= ruleFactName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getFactNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FactName_0=ruleFactName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FactName_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAls.g:5850:3: this_FunctionName_1= ruleFunctionName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getFunctionNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionName_1=ruleFunctionName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionName_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:5862:3: this_FunctionNamewParam_2= ruleFunctionNamewParam
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getFunctionNamewParamParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionNamewParam_2=ruleFunctionNamewParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionNamewParam_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAls.g:5874:3: this_EnumName_3= ruleEnumName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getEnumNameParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumName_3=ruleEnumName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumName_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAls.g:5886:3: this_EnumPropertyName_4= ruleEnumPropertyName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getEnumPropertyNameParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumPropertyName_4=ruleEnumPropertyName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumPropertyName_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAls.g:5898:3: this_SignatureName_5= ruleSignatureName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getSignatureNameParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SignatureName_5=ruleSignatureName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SignatureName_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAls.g:5910:3: this_PropertyName_6= rulePropertyName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getPropertyNameParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertyName_6=rulePropertyName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyName_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAls.g:5922:3: this_ExactlyName_7= ruleExactlyName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getExactlyNameParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExactlyName_7=ruleExactlyName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExactlyName_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAls.g:5934:3: this_LetName_8= ruleLetName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getLetNameParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LetName_8=ruleLetName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetName_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAls.g:5946:3: this_PredicateName_9= rulePredicateName
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReferencesNameAccess().getPredicateNameParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PredicateName_9=rulePredicateName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PredicateName_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReferencesName"


    // $ANTLR start "entryRuleReferencesSig"
    // InternalAls.g:5961:1: entryRuleReferencesSig returns [EObject current=null] : iv_ruleReferencesSig= ruleReferencesSig EOF ;
    public final EObject entryRuleReferencesSig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesSig = null;


        try {
            // InternalAls.g:5961:54: (iv_ruleReferencesSig= ruleReferencesSig EOF )
            // InternalAls.g:5962:2: iv_ruleReferencesSig= ruleReferencesSig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferencesSigRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferencesSig=ruleReferencesSig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferencesSig; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferencesSig"


    // $ANTLR start "ruleReferencesSig"
    // InternalAls.g:5968:1: ruleReferencesSig returns [EObject current=null] : ( () ( ( ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )? ( (otherlv_6= RULE_ID ) ) ) | otherlv_7= 'univ' | otherlv_8= 'Int' | otherlv_9= 'seq/Int' ) ) ;
    public final EObject ruleReferencesSig() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_asname_1_0 = null;



        	enterRule();

        try {
            // InternalAls.g:5974:2: ( ( () ( ( ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )? ( (otherlv_6= RULE_ID ) ) ) | otherlv_7= 'univ' | otherlv_8= 'Int' | otherlv_9= 'seq/Int' ) ) )
            // InternalAls.g:5975:2: ( () ( ( ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )? ( (otherlv_6= RULE_ID ) ) ) | otherlv_7= 'univ' | otherlv_8= 'Int' | otherlv_9= 'seq/Int' ) )
            {
            // InternalAls.g:5975:2: ( () ( ( ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )? ( (otherlv_6= RULE_ID ) ) ) | otherlv_7= 'univ' | otherlv_8= 'Int' | otherlv_9= 'seq/Int' ) )
            // InternalAls.g:5976:3: () ( ( ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )? ( (otherlv_6= RULE_ID ) ) ) | otherlv_7= 'univ' | otherlv_8= 'Int' | otherlv_9= 'seq/Int' )
            {
            // InternalAls.g:5976:3: ()
            // InternalAls.g:5977:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReferencesSigAccess().getReferencesSigAction_0(),
              					current);
              			
            }

            }

            // InternalAls.g:5986:3: ( ( ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )? ( (otherlv_6= RULE_ID ) ) ) | otherlv_7= 'univ' | otherlv_8= 'Int' | otherlv_9= 'seq/Int' )
            int alt103=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 16:
            case 18:
            case 25:
                {
                alt103=1;
                }
                break;
            case 53:
                {
                alt103=2;
                }
                break;
            case 54:
                {
                alt103=3;
                }
                break;
            case 55:
                {
                alt103=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalAls.g:5987:4: ( ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )? ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalAls.g:5987:4: ( ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )? ( (otherlv_6= RULE_ID ) ) )
                    // InternalAls.g:5988:5: ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )? ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalAls.g:5988:5: ( ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/' )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==RULE_ID) ) {
                        int LA102_1 = input.LA(2);

                        if ( (LA102_1==14) ) {
                            alt102=1;
                        }
                    }
                    else if ( (LA102_0==16||LA102_0==18||LA102_0==25) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalAls.g:5989:6: ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' ) otherlv_5= '/'
                            {
                            // InternalAls.g:5989:6: ( ( (lv_asname_1_0= ruleAsName ) ) | otherlv_2= 'fun' | otherlv_3= 'pred' | otherlv_4= 'this' )
                            int alt101=4;
                            switch ( input.LA(1) ) {
                            case RULE_ID:
                                {
                                alt101=1;
                                }
                                break;
                            case 16:
                                {
                                alt101=2;
                                }
                                break;
                            case 18:
                                {
                                alt101=3;
                                }
                                break;
                            case 25:
                                {
                                alt101=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 101, 0, input);

                                throw nvae;
                            }

                            switch (alt101) {
                                case 1 :
                                    // InternalAls.g:5990:7: ( (lv_asname_1_0= ruleAsName ) )
                                    {
                                    // InternalAls.g:5990:7: ( (lv_asname_1_0= ruleAsName ) )
                                    // InternalAls.g:5991:8: (lv_asname_1_0= ruleAsName )
                                    {
                                    // InternalAls.g:5991:8: (lv_asname_1_0= ruleAsName )
                                    // InternalAls.g:5992:9: lv_asname_1_0= ruleAsName
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getReferencesSigAccess().getAsnameAsNameParserRuleCall_1_0_0_0_0_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_13);
                                    lv_asname_1_0=ruleAsName();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getReferencesSigRule());
                                      									}
                                      									set(
                                      										current,
                                      										"asname",
                                      										lv_asname_1_0,
                                      										"lang.formal.alloy.Als.AsName");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAls.g:6010:7: otherlv_2= 'fun'
                                    {
                                    otherlv_2=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_2, grammarAccess.getReferencesSigAccess().getFunKeyword_1_0_0_0_1());
                                      						
                                    }

                                    }
                                    break;
                                case 3 :
                                    // InternalAls.g:6015:7: otherlv_3= 'pred'
                                    {
                                    otherlv_3=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_3, grammarAccess.getReferencesSigAccess().getPredKeyword_1_0_0_0_2());
                                      						
                                    }

                                    }
                                    break;
                                case 4 :
                                    // InternalAls.g:6020:7: otherlv_4= 'this'
                                    {
                                    otherlv_4=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_4, grammarAccess.getReferencesSigAccess().getThisKeyword_1_0_0_0_3());
                                      						
                                    }

                                    }
                                    break;

                            }

                            otherlv_5=(Token)match(input,14,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getReferencesSigAccess().getSolidusKeyword_1_0_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalAls.g:6030:5: ( (otherlv_6= RULE_ID ) )
                    // InternalAls.g:6031:6: (otherlv_6= RULE_ID )
                    {
                    // InternalAls.g:6031:6: (otherlv_6= RULE_ID )
                    // InternalAls.g:6032:7: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getReferencesSigRule());
                      							}
                      						
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_6, grammarAccess.getReferencesSigAccess().getNameRefSignatureNameCrossReference_1_0_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:6048:4: otherlv_7= 'univ'
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getReferencesSigAccess().getUnivKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:6053:4: otherlv_8= 'Int'
                    {
                    otherlv_8=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getReferencesSigAccess().getIntKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalAls.g:6058:4: otherlv_9= 'seq/Int'
                    {
                    otherlv_9=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getReferencesSigAccess().getSeqIntKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReferencesSig"


    // $ANTLR start "entryRuleRef"
    // InternalAls.g:6067:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // InternalAls.g:6067:44: (iv_ruleRef= ruleRef EOF )
            // InternalAls.g:6068:2: iv_ruleRef= ruleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRef=ruleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalAls.g:6074:1: ruleRef returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'univ' | otherlv_3= 'Int' | otherlv_4= 'seq/Int' ) ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAls.g:6080:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'univ' | otherlv_3= 'Int' | otherlv_4= 'seq/Int' ) ) )
            // InternalAls.g:6081:2: ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'univ' | otherlv_3= 'Int' | otherlv_4= 'seq/Int' ) )
            {
            // InternalAls.g:6081:2: ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'univ' | otherlv_3= 'Int' | otherlv_4= 'seq/Int' ) )
            // InternalAls.g:6082:3: () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'univ' | otherlv_3= 'Int' | otherlv_4= 'seq/Int' )
            {
            // InternalAls.g:6082:3: ()
            // InternalAls.g:6083:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRefAccess().getRefAction_0(),
              					current);
              			
            }

            }

            // InternalAls.g:6092:3: ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'univ' | otherlv_3= 'Int' | otherlv_4= 'seq/Int' )
            int alt104=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt104=1;
                }
                break;
            case 53:
                {
                alt104=2;
                }
                break;
            case 54:
                {
                alt104=3;
                }
                break;
            case 55:
                {
                alt104=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalAls.g:6093:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalAls.g:6093:4: ( (otherlv_1= RULE_ID ) )
                    // InternalAls.g:6094:5: (otherlv_1= RULE_ID )
                    {
                    // InternalAls.g:6094:5: (otherlv_1= RULE_ID )
                    // InternalAls.g:6095:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRefRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getRefAccess().getNameRefReferencesNameCrossReference_1_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAls.g:6110:4: otherlv_2= 'univ'
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRefAccess().getUnivKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalAls.g:6115:4: otherlv_3= 'Int'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getRefAccess().getIntKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalAls.g:6120:4: otherlv_4= 'seq/Int'
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getRefAccess().getSeqIntKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleLeftCurlyBracket"
    // InternalAls.g:6129:1: entryRuleLeftCurlyBracket returns [EObject current=null] : iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF ;
    public final EObject entryRuleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftCurlyBracket = null;


        try {
            // InternalAls.g:6129:57: (iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF )
            // InternalAls.g:6130:2: iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftCurlyBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeftCurlyBracket=ruleLeftCurlyBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftCurlyBracket; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLeftCurlyBracket"


    // $ANTLR start "ruleLeftCurlyBracket"
    // InternalAls.g:6136:1: ruleLeftCurlyBracket returns [EObject current=null] : ( (lv_leftCurlyBracket_0_0= '{' ) ) ;
    public final EObject ruleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_leftCurlyBracket_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:6142:2: ( ( (lv_leftCurlyBracket_0_0= '{' ) ) )
            // InternalAls.g:6143:2: ( (lv_leftCurlyBracket_0_0= '{' ) )
            {
            // InternalAls.g:6143:2: ( (lv_leftCurlyBracket_0_0= '{' ) )
            // InternalAls.g:6144:3: (lv_leftCurlyBracket_0_0= '{' )
            {
            // InternalAls.g:6144:3: (lv_leftCurlyBracket_0_0= '{' )
            // InternalAls.g:6145:4: lv_leftCurlyBracket_0_0= '{'
            {
            lv_leftCurlyBracket_0_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_leftCurlyBracket_0_0, grammarAccess.getLeftCurlyBracketAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLeftCurlyBracketRule());
              				}
              				setWithLastConsumed(current, "leftCurlyBracket", lv_leftCurlyBracket_0_0, "{");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLeftCurlyBracket"


    // $ANTLR start "entryRuleRightCurlyBracket"
    // InternalAls.g:6160:1: entryRuleRightCurlyBracket returns [EObject current=null] : iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF ;
    public final EObject entryRuleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightCurlyBracket = null;


        try {
            // InternalAls.g:6160:58: (iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF )
            // InternalAls.g:6161:2: iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightCurlyBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRightCurlyBracket=ruleRightCurlyBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightCurlyBracket; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRightCurlyBracket"


    // $ANTLR start "ruleRightCurlyBracket"
    // InternalAls.g:6167:1: ruleRightCurlyBracket returns [EObject current=null] : ( (lv_rightCurlyBracket_0_0= '}' ) ) ;
    public final EObject ruleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_rightCurlyBracket_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:6173:2: ( ( (lv_rightCurlyBracket_0_0= '}' ) ) )
            // InternalAls.g:6174:2: ( (lv_rightCurlyBracket_0_0= '}' ) )
            {
            // InternalAls.g:6174:2: ( (lv_rightCurlyBracket_0_0= '}' ) )
            // InternalAls.g:6175:3: (lv_rightCurlyBracket_0_0= '}' )
            {
            // InternalAls.g:6175:3: (lv_rightCurlyBracket_0_0= '}' )
            // InternalAls.g:6176:4: lv_rightCurlyBracket_0_0= '}'
            {
            lv_rightCurlyBracket_0_0=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_rightCurlyBracket_0_0, grammarAccess.getRightCurlyBracketAccess().getRightCurlyBracketRightCurlyBracketKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getRightCurlyBracketRule());
              				}
              				setWithLastConsumed(current, "rightCurlyBracket", lv_rightCurlyBracket_0_0, "}");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRightCurlyBracket"


    // $ANTLR start "entryRuleDot"
    // InternalAls.g:6191:1: entryRuleDot returns [EObject current=null] : iv_ruleDot= ruleDot EOF ;
    public final EObject entryRuleDot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDot = null;


        try {
            // InternalAls.g:6191:44: (iv_ruleDot= ruleDot EOF )
            // InternalAls.g:6192:2: iv_ruleDot= ruleDot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDot=ruleDot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDot"


    // $ANTLR start "ruleDot"
    // InternalAls.g:6198:1: ruleDot returns [EObject current=null] : ( (lv_dot_0_0= '.' ) ) ;
    public final EObject ruleDot() throws RecognitionException {
        EObject current = null;

        Token lv_dot_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:6204:2: ( ( (lv_dot_0_0= '.' ) ) )
            // InternalAls.g:6205:2: ( (lv_dot_0_0= '.' ) )
            {
            // InternalAls.g:6205:2: ( (lv_dot_0_0= '.' ) )
            // InternalAls.g:6206:3: (lv_dot_0_0= '.' )
            {
            // InternalAls.g:6206:3: (lv_dot_0_0= '.' )
            // InternalAls.g:6207:4: lv_dot_0_0= '.'
            {
            lv_dot_0_0=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_dot_0_0, grammarAccess.getDotAccess().getDotFullStopKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDotRule());
              				}
              				setWithLastConsumed(current, "dot", lv_dot_0_0, ".");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDot"


    // $ANTLR start "entryRuleComma"
    // InternalAls.g:6222:1: entryRuleComma returns [EObject current=null] : iv_ruleComma= ruleComma EOF ;
    public final EObject entryRuleComma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComma = null;


        try {
            // InternalAls.g:6222:46: (iv_ruleComma= ruleComma EOF )
            // InternalAls.g:6223:2: iv_ruleComma= ruleComma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComma=ruleComma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComma; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComma"


    // $ANTLR start "ruleComma"
    // InternalAls.g:6229:1: ruleComma returns [EObject current=null] : ( (lv_comma_0_0= ',' ) ) ;
    public final EObject ruleComma() throws RecognitionException {
        EObject current = null;

        Token lv_comma_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:6235:2: ( ( (lv_comma_0_0= ',' ) ) )
            // InternalAls.g:6236:2: ( (lv_comma_0_0= ',' ) )
            {
            // InternalAls.g:6236:2: ( (lv_comma_0_0= ',' ) )
            // InternalAls.g:6237:3: (lv_comma_0_0= ',' )
            {
            // InternalAls.g:6237:3: (lv_comma_0_0= ',' )
            // InternalAls.g:6238:4: lv_comma_0_0= ','
            {
            lv_comma_0_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_comma_0_0, grammarAccess.getCommaAccess().getCommaCommaKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getCommaRule());
              				}
              				setWithLastConsumed(current, "comma", lv_comma_0_0, ",");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComma"


    // $ANTLR start "entryRuleColon"
    // InternalAls.g:6253:1: entryRuleColon returns [EObject current=null] : iv_ruleColon= ruleColon EOF ;
    public final EObject entryRuleColon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColon = null;


        try {
            // InternalAls.g:6253:46: (iv_ruleColon= ruleColon EOF )
            // InternalAls.g:6254:2: iv_ruleColon= ruleColon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColon=ruleColon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColon; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColon"


    // $ANTLR start "ruleColon"
    // InternalAls.g:6260:1: ruleColon returns [EObject current=null] : ( (lv_colon_0_0= ':' ) ) ;
    public final EObject ruleColon() throws RecognitionException {
        EObject current = null;

        Token lv_colon_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:6266:2: ( ( (lv_colon_0_0= ':' ) ) )
            // InternalAls.g:6267:2: ( (lv_colon_0_0= ':' ) )
            {
            // InternalAls.g:6267:2: ( (lv_colon_0_0= ':' ) )
            // InternalAls.g:6268:3: (lv_colon_0_0= ':' )
            {
            // InternalAls.g:6268:3: (lv_colon_0_0= ':' )
            // InternalAls.g:6269:4: lv_colon_0_0= ':'
            {
            lv_colon_0_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_colon_0_0, grammarAccess.getColonAccess().getColonColonKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getColonRule());
              				}
              				setWithLastConsumed(current, "colon", lv_colon_0_0, ":");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleColon"


    // $ANTLR start "entryRuleLeftParenthesis"
    // InternalAls.g:6284:1: entryRuleLeftParenthesis returns [EObject current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final EObject entryRuleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftParenthesis = null;


        try {
            // InternalAls.g:6284:56: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // InternalAls.g:6285:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLeftParenthesis"


    // $ANTLR start "ruleLeftParenthesis"
    // InternalAls.g:6291:1: ruleLeftParenthesis returns [EObject current=null] : ( (lv_leftParenthesis_0_0= '(' ) ) ;
    public final EObject ruleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_leftParenthesis_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:6297:2: ( ( (lv_leftParenthesis_0_0= '(' ) ) )
            // InternalAls.g:6298:2: ( (lv_leftParenthesis_0_0= '(' ) )
            {
            // InternalAls.g:6298:2: ( (lv_leftParenthesis_0_0= '(' ) )
            // InternalAls.g:6299:3: (lv_leftParenthesis_0_0= '(' )
            {
            // InternalAls.g:6299:3: (lv_leftParenthesis_0_0= '(' )
            // InternalAls.g:6300:4: lv_leftParenthesis_0_0= '('
            {
            lv_leftParenthesis_0_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_leftParenthesis_0_0, grammarAccess.getLeftParenthesisAccess().getLeftParenthesisLeftParenthesisKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLeftParenthesisRule());
              				}
              				setWithLastConsumed(current, "leftParenthesis", lv_leftParenthesis_0_0, "(");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLeftParenthesis"


    // $ANTLR start "entryRuleRightParenthesis"
    // InternalAls.g:6315:1: entryRuleRightParenthesis returns [EObject current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final EObject entryRuleRightParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightParenthesis = null;


        try {
            // InternalAls.g:6315:57: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // InternalAls.g:6316:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRightParenthesis"


    // $ANTLR start "ruleRightParenthesis"
    // InternalAls.g:6322:1: ruleRightParenthesis returns [EObject current=null] : ( (lv_rightParenthesis_0_0= ')' ) ) ;
    public final EObject ruleRightParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_rightParenthesis_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:6328:2: ( ( (lv_rightParenthesis_0_0= ')' ) ) )
            // InternalAls.g:6329:2: ( (lv_rightParenthesis_0_0= ')' ) )
            {
            // InternalAls.g:6329:2: ( (lv_rightParenthesis_0_0= ')' ) )
            // InternalAls.g:6330:3: (lv_rightParenthesis_0_0= ')' )
            {
            // InternalAls.g:6330:3: (lv_rightParenthesis_0_0= ')' )
            // InternalAls.g:6331:4: lv_rightParenthesis_0_0= ')'
            {
            lv_rightParenthesis_0_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_rightParenthesis_0_0, grammarAccess.getRightParenthesisAccess().getRightParenthesisRightParenthesisKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getRightParenthesisRule());
              				}
              				setWithLastConsumed(current, "rightParenthesis", lv_rightParenthesis_0_0, ")");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRightParenthesis"


    // $ANTLR start "entryRuleLeftSquareBracketKeyword"
    // InternalAls.g:6346:1: entryRuleLeftSquareBracketKeyword returns [EObject current=null] : iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF ;
    public final EObject entryRuleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSquareBracketKeyword = null;


        try {
            // InternalAls.g:6346:65: (iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF )
            // InternalAls.g:6347:2: iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftSquareBracketKeywordRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeftSquareBracketKeyword=ruleLeftSquareBracketKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLeftSquareBracketKeyword"


    // $ANTLR start "ruleLeftSquareBracketKeyword"
    // InternalAls.g:6353:1: ruleLeftSquareBracketKeyword returns [EObject current=null] : ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) ;
    public final EObject ruleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_leftSquareBracketKeyword_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:6359:2: ( ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) )
            // InternalAls.g:6360:2: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            {
            // InternalAls.g:6360:2: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            // InternalAls.g:6361:3: (lv_leftSquareBracketKeyword_0_0= '[' )
            {
            // InternalAls.g:6361:3: (lv_leftSquareBracketKeyword_0_0= '[' )
            // InternalAls.g:6362:4: lv_leftSquareBracketKeyword_0_0= '['
            {
            lv_leftSquareBracketKeyword_0_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_leftSquareBracketKeyword_0_0, grammarAccess.getLeftSquareBracketKeywordAccess().getLeftSquareBracketKeywordLeftSquareBracketKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLeftSquareBracketKeywordRule());
              				}
              				setWithLastConsumed(current, "leftSquareBracketKeyword", lv_leftSquareBracketKeyword_0_0, "[");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLeftSquareBracketKeyword"


    // $ANTLR start "entryRuleRightSquareBracketKeyword"
    // InternalAls.g:6377:1: entryRuleRightSquareBracketKeyword returns [EObject current=null] : iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF ;
    public final EObject entryRuleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSquareBracketKeyword = null;


        try {
            // InternalAls.g:6377:66: (iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF )
            // InternalAls.g:6378:2: iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightSquareBracketKeywordRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRightSquareBracketKeyword=ruleRightSquareBracketKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRightSquareBracketKeyword"


    // $ANTLR start "ruleRightSquareBracketKeyword"
    // InternalAls.g:6384:1: ruleRightSquareBracketKeyword returns [EObject current=null] : ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) ;
    public final EObject ruleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_rightSquareBracketKeyword_0_0=null;


        	enterRule();

        try {
            // InternalAls.g:6390:2: ( ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) )
            // InternalAls.g:6391:2: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            {
            // InternalAls.g:6391:2: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            // InternalAls.g:6392:3: (lv_rightSquareBracketKeyword_0_0= ']' )
            {
            // InternalAls.g:6392:3: (lv_rightSquareBracketKeyword_0_0= ']' )
            // InternalAls.g:6393:4: lv_rightSquareBracketKeyword_0_0= ']'
            {
            lv_rightSquareBracketKeyword_0_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_rightSquareBracketKeyword_0_0, grammarAccess.getRightSquareBracketKeywordAccess().getRightSquareBracketKeywordRightSquareBracketKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getRightSquareBracketKeywordRule());
              				}
              				setWithLastConsumed(current, "rightSquareBracketKeyword", lv_rightSquareBracketKeyword_0_0, "]");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRightSquareBracketKeyword"

    // $ANTLR start synpred9_InternalAls
    public final void synpred9_InternalAls_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject lv_previousNameAs_2_0 = null;


        // InternalAls.g:393:5: ( ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/' )
        // InternalAls.g:393:5: ( (lv_previousNameAs_2_0= ruleAsName ) ) otherlv_3= '/'
        {
        // InternalAls.g:393:5: ( (lv_previousNameAs_2_0= ruleAsName ) )
        // InternalAls.g:394:6: (lv_previousNameAs_2_0= ruleAsName )
        {
        // InternalAls.g:394:6: (lv_previousNameAs_2_0= ruleAsName )
        // InternalAls.g:395:7: lv_previousNameAs_2_0= ruleAsName
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getOpenAccess().getPreviousNameAsAsNameParserRuleCall_1_1_0_0());
          						
        }
        pushFollow(FOLLOW_13);
        lv_previousNameAs_2_0=ruleAsName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalAls

    // $ANTLR start synpred73_InternalAls
    public final void synpred73_InternalAls_fragment() throws RecognitionException {   
        EObject lv_binOp_1_0 = null;

        EObject lv_expr_2_0 = null;


        // InternalAls.g:3015:4: ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )
        // InternalAls.g:3015:4: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
        {
        // InternalAls.g:3015:4: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
        // InternalAls.g:3016:5: ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) )
        {
        // InternalAls.g:3016:5: ( (lv_binOp_1_0= ruleBinOp ) )
        // InternalAls.g:3017:6: (lv_binOp_1_0= ruleBinOp )
        {
        // InternalAls.g:3017:6: (lv_binOp_1_0= ruleBinOp )
        // InternalAls.g:3018:7: lv_binOp_1_0= ruleBinOp
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0());
          						
        }
        pushFollow(FOLLOW_25);
        lv_binOp_1_0=ruleBinOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAls.g:3035:5: ( (lv_expr_2_0= ruleExpression ) )
        // InternalAls.g:3036:6: (lv_expr_2_0= ruleExpression )
        {
        // InternalAls.g:3036:6: (lv_expr_2_0= ruleExpression )
        // InternalAls.g:3037:7: lv_expr_2_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_expr_2_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred73_InternalAls

    // $ANTLR start synpred76_InternalAls
    public final void synpred76_InternalAls_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_cmp_5_0 = null;

        EObject lv_expr_6_0 = null;


        // InternalAls.g:3056:4: ( ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) ) )
        // InternalAls.g:3056:4: ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) )
        {
        // InternalAls.g:3056:4: ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) )
        // InternalAls.g:3057:5: (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) )
        {
        // InternalAls.g:3057:5: (otherlv_3= '!' | otherlv_4= 'not' )?
        int alt133=3;
        int LA133_0 = input.LA(1);

        if ( (LA133_0==41) ) {
            alt133=1;
        }
        else if ( (LA133_0==42) ) {
            alt133=2;
        }
        switch (alt133) {
            case 1 :
                // InternalAls.g:3058:6: otherlv_3= '!'
                {
                otherlv_3=(Token)match(input,41,FOLLOW_53); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalAls.g:3063:6: otherlv_4= 'not'
                {
                otherlv_4=(Token)match(input,42,FOLLOW_53); if (state.failed) return ;

                }
                break;

        }

        // InternalAls.g:3068:5: ( (lv_cmp_5_0= ruleCompareOp ) )
        // InternalAls.g:3069:6: (lv_cmp_5_0= ruleCompareOp )
        {
        // InternalAls.g:3069:6: (lv_cmp_5_0= ruleCompareOp )
        // InternalAls.g:3070:7: lv_cmp_5_0= ruleCompareOp
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_1_1_0());
          						
        }
        pushFollow(FOLLOW_25);
        lv_cmp_5_0=ruleCompareOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAls.g:3087:5: ( (lv_expr_6_0= ruleExpression ) )
        // InternalAls.g:3088:6: (lv_expr_6_0= ruleExpression )
        {
        // InternalAls.g:3088:6: (lv_expr_6_0= ruleExpression )
        // InternalAls.g:3089:7: lv_expr_6_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_2_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_expr_6_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred76_InternalAls

    // $ANTLR start synpred77_InternalAls
    public final void synpred77_InternalAls_fragment() throws RecognitionException {   
        EObject lv_arrowOp_7_0 = null;

        EObject lv_expr_8_0 = null;


        // InternalAls.g:3108:4: ( ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) )
        // InternalAls.g:3108:4: ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
        {
        // InternalAls.g:3108:4: ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
        // InternalAls.g:3109:5: ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) )
        {
        // InternalAls.g:3109:5: ( (lv_arrowOp_7_0= ruleArrowOp ) )
        // InternalAls.g:3110:6: (lv_arrowOp_7_0= ruleArrowOp )
        {
        // InternalAls.g:3110:6: (lv_arrowOp_7_0= ruleArrowOp )
        // InternalAls.g:3111:7: lv_arrowOp_7_0= ruleArrowOp
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_2_0_0());
          						
        }
        pushFollow(FOLLOW_25);
        lv_arrowOp_7_0=ruleArrowOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAls.g:3128:5: ( (lv_expr_8_0= ruleExpression ) )
        // InternalAls.g:3129:6: (lv_expr_8_0= ruleExpression )
        {
        // InternalAls.g:3129:6: (lv_expr_8_0= ruleExpression )
        // InternalAls.g:3130:7: lv_expr_8_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_expr_8_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred77_InternalAls

    // $ANTLR start synpred79_InternalAls
    public final void synpred79_InternalAls_fragment() throws RecognitionException {   
        EObject lv_par_11_0 = null;


        // InternalAls.g:3162:6: ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) )
        // InternalAls.g:3162:6: ( (lv_par_11_0= ruleParanthesisandExpression ) )
        {
        // InternalAls.g:3162:6: ( (lv_par_11_0= ruleParanthesisandExpression ) )
        // InternalAls.g:3163:7: (lv_par_11_0= ruleParanthesisandExpression )
        {
        // InternalAls.g:3163:7: (lv_par_11_0= ruleParanthesisandExpression )
        // InternalAls.g:3164:8: lv_par_11_0= ruleParanthesisandExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getExpressionAccess().getParParanthesisandExpressionParserRuleCall_1_3_1_0_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_par_11_0=ruleParanthesisandExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred79_InternalAls

    // $ANTLR start synpred80_InternalAls
    public final void synpred80_InternalAls_fragment() throws RecognitionException {   
        EObject lv_expr_12_0 = null;


        // InternalAls.g:3182:6: ( ( (lv_expr_12_0= ruleExpression ) ) )
        // InternalAls.g:3182:6: ( (lv_expr_12_0= ruleExpression ) )
        {
        // InternalAls.g:3182:6: ( (lv_expr_12_0= ruleExpression ) )
        // InternalAls.g:3183:7: (lv_expr_12_0= ruleExpression )
        {
        // InternalAls.g:3183:7: (lv_expr_12_0= ruleExpression )
        // InternalAls.g:3184:8: lv_expr_12_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_1_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_expr_12_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred80_InternalAls

    // $ANTLR start synpred81_InternalAls
    public final void synpred81_InternalAls_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        EObject lv_expr_14_0 = null;


        // InternalAls.g:3203:6: (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )
        // InternalAls.g:3203:6: otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) )
        {
        otherlv_13=(Token)match(input,45,FOLLOW_25); if (state.failed) return ;
        // InternalAls.g:3207:6: ( (lv_expr_14_0= ruleExpression ) )
        // InternalAls.g:3208:7: (lv_expr_14_0= ruleExpression )
        {
        // InternalAls.g:3208:7: (lv_expr_14_0= ruleExpression )
        // InternalAls.g:3209:8: lv_expr_14_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_expr_14_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred81_InternalAls

    // $ANTLR start synpred82_InternalAls
    public final void synpred82_InternalAls_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_par_11_0 = null;

        EObject lv_expr_12_0 = null;

        EObject lv_expr_14_0 = null;


        // InternalAls.g:3149:4: ( ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? ) )
        // InternalAls.g:3149:4: ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? )
        {
        // InternalAls.g:3149:4: ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? )
        // InternalAls.g:3150:5: (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )?
        {
        // InternalAls.g:3150:5: (otherlv_9= '=>' | otherlv_10= 'implies' )
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( (LA134_0==43) ) {
            alt134=1;
        }
        else if ( (LA134_0==44) ) {
            alt134=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 134, 0, input);

            throw nvae;
        }
        switch (alt134) {
            case 1 :
                // InternalAls.g:3151:6: otherlv_9= '=>'
                {
                otherlv_9=(Token)match(input,43,FOLLOW_72); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalAls.g:3156:6: otherlv_10= 'implies'
                {
                otherlv_10=(Token)match(input,44,FOLLOW_72); if (state.failed) return ;

                }
                break;

        }

        // InternalAls.g:3161:5: ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )?
        int alt135=3;
        alt135 = dfa135.predict(input);
        switch (alt135) {
            case 1 :
                // InternalAls.g:3162:6: ( (lv_par_11_0= ruleParanthesisandExpression ) )
                {
                // InternalAls.g:3162:6: ( (lv_par_11_0= ruleParanthesisandExpression ) )
                // InternalAls.g:3163:7: (lv_par_11_0= ruleParanthesisandExpression )
                {
                // InternalAls.g:3163:7: (lv_par_11_0= ruleParanthesisandExpression )
                // InternalAls.g:3164:8: lv_par_11_0= ruleParanthesisandExpression
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getExpressionAccess().getParParanthesisandExpressionParserRuleCall_1_3_1_0_0());
                  							
                }
                pushFollow(FOLLOW_73);
                lv_par_11_0=ruleParanthesisandExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalAls.g:3182:6: ( (lv_expr_12_0= ruleExpression ) )
                {
                // InternalAls.g:3182:6: ( (lv_expr_12_0= ruleExpression ) )
                // InternalAls.g:3183:7: (lv_expr_12_0= ruleExpression )
                {
                // InternalAls.g:3183:7: (lv_expr_12_0= ruleExpression )
                // InternalAls.g:3184:8: lv_expr_12_0= ruleExpression
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_1_0());
                  							
                }
                pushFollow(FOLLOW_73);
                lv_expr_12_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalAls.g:3202:5: (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )?
        int alt136=2;
        int LA136_0 = input.LA(1);

        if ( (LA136_0==45) ) {
            alt136=1;
        }
        switch (alt136) {
            case 1 :
                // InternalAls.g:3203:6: otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) )
                {
                otherlv_13=(Token)match(input,45,FOLLOW_25); if (state.failed) return ;
                // InternalAls.g:3207:6: ( (lv_expr_14_0= ruleExpression ) )
                // InternalAls.g:3208:7: (lv_expr_14_0= ruleExpression )
                {
                // InternalAls.g:3208:7: (lv_expr_14_0= ruleExpression )
                // InternalAls.g:3209:8: lv_expr_14_0= ruleExpression
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0());
                  							
                }
                pushFollow(FOLLOW_2);
                lv_expr_14_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred82_InternalAls

    // $ANTLR start synpred85_InternalAls
    public final void synpred85_InternalAls_fragment() throws RecognitionException {   
        Token otherlv_15=null;
        Token otherlv_19=null;
        EObject lv_expr_16_0 = null;

        EObject lv_comma_17_0 = null;

        EObject lv_expr_18_0 = null;


        // InternalAls.g:3229:4: ( (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' ) )
        // InternalAls.g:3229:4: (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' )
        {
        // InternalAls.g:3229:4: (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' )
        // InternalAls.g:3230:5: otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']'
        {
        otherlv_15=(Token)match(input,46,FOLLOW_56); if (state.failed) return ;
        // InternalAls.g:3234:5: ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )?
        int alt139=2;
        int LA139_0 = input.LA(1);

        if ( ((LA139_0>=RULE_INT && LA139_0<=RULE_NEGATIVE_INTEGER)||LA139_0==16||LA139_0==18||(LA139_0>=25 && LA139_0<=27)||LA139_0==32||(LA139_0>=35 && LA139_0<=37)||(LA139_0>=41 && LA139_0<=42)||LA139_0==48||(LA139_0>=50 && LA139_0<=56)||(LA139_0>=58 && LA139_0<=59)||(LA139_0>=78 && LA139_0<=89)) ) {
            alt139=1;
        }
        switch (alt139) {
            case 1 :
                // InternalAls.g:3235:6: ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )*
                {
                // InternalAls.g:3235:6: ( (lv_expr_16_0= ruleExpression ) )
                // InternalAls.g:3236:7: (lv_expr_16_0= ruleExpression )
                {
                // InternalAls.g:3236:7: (lv_expr_16_0= ruleExpression )
                // InternalAls.g:3237:8: lv_expr_16_0= ruleExpression
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0());
                  							
                }
                pushFollow(FOLLOW_8);
                lv_expr_16_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalAls.g:3254:6: ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )*
                loop138:
                do {
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==33) ) {
                        alt138=1;
                    }


                    switch (alt138) {
                	case 1 :
                	    // InternalAls.g:3255:7: ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) )
                	    {
                	    // InternalAls.g:3255:7: ( (lv_comma_17_0= ruleComma ) )
                	    // InternalAls.g:3256:8: (lv_comma_17_0= ruleComma )
                	    {
                	    // InternalAls.g:3256:8: (lv_comma_17_0= ruleComma )
                	    // InternalAls.g:3257:9: lv_comma_17_0= ruleComma
                	    {
                	    if ( state.backtracking==0 ) {

                	      									newCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0());
                	      								
                	    }
                	    pushFollow(FOLLOW_25);
                	    lv_comma_17_0=ruleComma();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }

                	    // InternalAls.g:3274:7: ( (lv_expr_18_0= ruleExpression ) )
                	    // InternalAls.g:3275:8: (lv_expr_18_0= ruleExpression )
                	    {
                	    // InternalAls.g:3275:8: (lv_expr_18_0= ruleExpression )
                	    // InternalAls.g:3276:9: lv_expr_18_0= ruleExpression
                	    {
                	    if ( state.backtracking==0 ) {

                	      									newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0());
                	      								
                	    }
                	    pushFollow(FOLLOW_8);
                	    lv_expr_18_0=ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop138;
                    }
                } while (true);


                }
                break;

        }

        otherlv_19=(Token)match(input,47,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred85_InternalAls

    // $ANTLR start synpred90_InternalAls
    public final void synpred90_InternalAls_fragment() throws RecognitionException {   
        EObject lv_comma_13_0 = null;

        EObject lv_decl_14_0 = null;


        // InternalAls.g:3536:6: ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )
        // InternalAls.g:3536:6: ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) )
        {
        // InternalAls.g:3536:6: ( (lv_comma_13_0= ruleComma ) )
        // InternalAls.g:3537:7: (lv_comma_13_0= ruleComma )
        {
        // InternalAls.g:3537:7: (lv_comma_13_0= ruleComma )
        // InternalAls.g:3538:8: lv_comma_13_0= ruleComma
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_2_2_1_0_0());
          							
        }
        pushFollow(FOLLOW_21);
        lv_comma_13_0=ruleComma();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAls.g:3555:6: ( (lv_decl_14_0= ruleDecl ) )
        // InternalAls.g:3556:7: (lv_decl_14_0= ruleDecl )
        {
        // InternalAls.g:3556:7: (lv_decl_14_0= ruleDecl )
        // InternalAls.g:3557:8: lv_decl_14_0= ruleDecl
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_2_2_1_1_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_decl_14_0=ruleDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred90_InternalAls

    // $ANTLR start synpred91_InternalAls
    public final void synpred91_InternalAls_fragment() throws RecognitionException {   
        EObject lv_decl_12_0 = null;

        EObject lv_comma_13_0 = null;

        EObject lv_decl_14_0 = null;


        // InternalAls.g:3516:5: ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )
        // InternalAls.g:3516:5: ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )*
        {
        // InternalAls.g:3516:5: ( (lv_decl_12_0= ruleDecl ) )
        // InternalAls.g:3517:6: (lv_decl_12_0= ruleDecl )
        {
        // InternalAls.g:3517:6: (lv_decl_12_0= ruleDecl )
        // InternalAls.g:3518:7: lv_decl_12_0= ruleDecl
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_2_2_0_0());
          						
        }
        pushFollow(FOLLOW_74);
        lv_decl_12_0=ruleDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAls.g:3535:5: ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )*
        loop142:
        do {
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==33) ) {
                alt142=1;
            }


            switch (alt142) {
        	case 1 :
        	    // InternalAls.g:3536:6: ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) )
        	    {
        	    // InternalAls.g:3536:6: ( (lv_comma_13_0= ruleComma ) )
        	    // InternalAls.g:3537:7: (lv_comma_13_0= ruleComma )
        	    {
        	    // InternalAls.g:3537:7: (lv_comma_13_0= ruleComma )
        	    // InternalAls.g:3538:8: lv_comma_13_0= ruleComma
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_2_2_1_0_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_21);
        	    lv_comma_13_0=ruleComma();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    // InternalAls.g:3555:6: ( (lv_decl_14_0= ruleDecl ) )
        	    // InternalAls.g:3556:7: (lv_decl_14_0= ruleDecl )
        	    {
        	    // InternalAls.g:3556:7: (lv_decl_14_0= ruleDecl )
        	    // InternalAls.g:3557:8: lv_decl_14_0= ruleDecl
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_2_2_1_1_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_74);
        	    lv_decl_14_0=ruleDecl();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop142;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred91_InternalAls

    // $ANTLR start synpred92_InternalAls
    public final void synpred92_InternalAls_fragment() throws RecognitionException {   
        EObject lv_blockOrBar_15_0 = null;


        // InternalAls.g:3577:5: ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) )
        // InternalAls.g:3577:5: ( (lv_blockOrBar_15_0= ruleBlockOrBar ) )
        {
        // InternalAls.g:3577:5: ( (lv_blockOrBar_15_0= ruleBlockOrBar ) )
        // InternalAls.g:3578:6: (lv_blockOrBar_15_0= ruleBlockOrBar )
        {
        // InternalAls.g:3578:6: (lv_blockOrBar_15_0= ruleBlockOrBar )
        // InternalAls.g:3579:7: lv_blockOrBar_15_0= ruleBlockOrBar
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_2_3_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_blockOrBar_15_0=ruleBlockOrBar();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred92_InternalAls

    // $ANTLR start synpred93_InternalAls
    public final void synpred93_InternalAls_fragment() throws RecognitionException {   
        EObject lv_expr_16_0 = null;


        // InternalAls.g:3597:5: ( ( (lv_expr_16_0= ruleExpression ) ) )
        // InternalAls.g:3597:5: ( (lv_expr_16_0= ruleExpression ) )
        {
        // InternalAls.g:3597:5: ( (lv_expr_16_0= ruleExpression ) )
        // InternalAls.g:3598:6: (lv_expr_16_0= ruleExpression )
        {
        // InternalAls.g:3598:6: (lv_expr_16_0= ruleExpression )
        // InternalAls.g:3599:7: lv_expr_16_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_2_3_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_expr_16_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred93_InternalAls

    // $ANTLR start synpred96_InternalAls
    public final void synpred96_InternalAls_fragment() throws RecognitionException {   
        EObject lv_comma_23_0 = null;

        EObject lv_decl_24_0 = null;


        // InternalAls.g:3721:6: ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )
        // InternalAls.g:3721:6: ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) )
        {
        // InternalAls.g:3721:6: ( (lv_comma_23_0= ruleComma ) )
        // InternalAls.g:3722:7: (lv_comma_23_0= ruleComma )
        {
        // InternalAls.g:3722:7: (lv_comma_23_0= ruleComma )
        // InternalAls.g:3723:8: lv_comma_23_0= ruleComma
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_4_2_1_0_0());
          							
        }
        pushFollow(FOLLOW_21);
        lv_comma_23_0=ruleComma();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAls.g:3740:6: ( (lv_decl_24_0= ruleDecl ) )
        // InternalAls.g:3741:7: (lv_decl_24_0= ruleDecl )
        {
        // InternalAls.g:3741:7: (lv_decl_24_0= ruleDecl )
        // InternalAls.g:3742:8: lv_decl_24_0= ruleDecl
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_4_2_1_1_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_decl_24_0=ruleDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred96_InternalAls

    // $ANTLR start synpred97_InternalAls
    public final void synpred97_InternalAls_fragment() throws RecognitionException {   
        EObject lv_decl_22_0 = null;

        EObject lv_comma_23_0 = null;

        EObject lv_decl_24_0 = null;


        // InternalAls.g:3701:5: ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )
        // InternalAls.g:3701:5: ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )*
        {
        // InternalAls.g:3701:5: ( (lv_decl_22_0= ruleDecl ) )
        // InternalAls.g:3702:6: (lv_decl_22_0= ruleDecl )
        {
        // InternalAls.g:3702:6: (lv_decl_22_0= ruleDecl )
        // InternalAls.g:3703:7: lv_decl_22_0= ruleDecl
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_4_2_0_0());
          						
        }
        pushFollow(FOLLOW_74);
        lv_decl_22_0=ruleDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAls.g:3720:5: ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )*
        loop146:
        do {
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==33) ) {
                alt146=1;
            }


            switch (alt146) {
        	case 1 :
        	    // InternalAls.g:3721:6: ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) )
        	    {
        	    // InternalAls.g:3721:6: ( (lv_comma_23_0= ruleComma ) )
        	    // InternalAls.g:3722:7: (lv_comma_23_0= ruleComma )
        	    {
        	    // InternalAls.g:3722:7: (lv_comma_23_0= ruleComma )
        	    // InternalAls.g:3723:8: lv_comma_23_0= ruleComma
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_4_2_1_0_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_21);
        	    lv_comma_23_0=ruleComma();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    // InternalAls.g:3740:6: ( (lv_decl_24_0= ruleDecl ) )
        	    // InternalAls.g:3741:7: (lv_decl_24_0= ruleDecl )
        	    {
        	    // InternalAls.g:3741:7: (lv_decl_24_0= ruleDecl )
        	    // InternalAls.g:3742:8: lv_decl_24_0= ruleDecl
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_4_2_1_1_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_74);
        	    lv_decl_24_0=ruleDecl();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop146;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred97_InternalAls

    // $ANTLR start synpred98_InternalAls
    public final void synpred98_InternalAls_fragment() throws RecognitionException {   
        EObject lv_blockOrBar_25_0 = null;


        // InternalAls.g:3762:5: ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) )
        // InternalAls.g:3762:5: ( (lv_blockOrBar_25_0= ruleBlockOrBar ) )
        {
        // InternalAls.g:3762:5: ( (lv_blockOrBar_25_0= ruleBlockOrBar ) )
        // InternalAls.g:3763:6: (lv_blockOrBar_25_0= ruleBlockOrBar )
        {
        // InternalAls.g:3763:6: (lv_blockOrBar_25_0= ruleBlockOrBar )
        // InternalAls.g:3764:7: lv_blockOrBar_25_0= ruleBlockOrBar
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_4_3_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_blockOrBar_25_0=ruleBlockOrBar();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred98_InternalAls

    // $ANTLR start synpred99_InternalAls
    public final void synpred99_InternalAls_fragment() throws RecognitionException {   
        EObject lv_expr_26_0 = null;


        // InternalAls.g:3782:5: ( ( (lv_expr_26_0= ruleExpression ) ) )
        // InternalAls.g:3782:5: ( (lv_expr_26_0= ruleExpression ) )
        {
        // InternalAls.g:3782:5: ( (lv_expr_26_0= ruleExpression ) )
        // InternalAls.g:3783:6: (lv_expr_26_0= ruleExpression )
        {
        // InternalAls.g:3783:6: (lv_expr_26_0= ruleExpression )
        // InternalAls.g:3784:7: lv_expr_26_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_4_3_1_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_expr_26_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred99_InternalAls

    // $ANTLR start synpred106_InternalAls
    public final void synpred106_InternalAls_fragment() throws RecognitionException {   
        Token otherlv_39=null;

        // InternalAls.g:3946:6: ( (otherlv_39= RULE_ID ) )
        // InternalAls.g:3946:6: (otherlv_39= RULE_ID )
        {
        // InternalAls.g:3946:6: (otherlv_39= RULE_ID )
        // InternalAls.g:3947:7: otherlv_39= RULE_ID
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }
        otherlv_39=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred106_InternalAls

    // $ANTLR start synpred107_InternalAls
    public final void synpred107_InternalAls_fragment() throws RecognitionException {   
        Token lv_int_38_0=null;
        Token otherlv_39=null;

        // InternalAls.g:3919:3: ( ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) ) )
        // InternalAls.g:3919:3: ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) )
        {
        // InternalAls.g:3919:3: ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) )
        // InternalAls.g:3920:4: () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? )
        {
        // InternalAls.g:3920:4: ()
        // InternalAls.g:3921:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalAls.g:3930:4: ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? )
        // InternalAls.g:3931:5: ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )?
        {
        // InternalAls.g:3931:5: ( (lv_int_38_0= 'int' ) )
        // InternalAls.g:3932:6: (lv_int_38_0= 'int' )
        {
        // InternalAls.g:3932:6: (lv_int_38_0= 'int' )
        // InternalAls.g:3933:7: lv_int_38_0= 'int'
        {
        lv_int_38_0=(Token)match(input,26,FOLLOW_61); if (state.failed) return ;

        }


        }

        // InternalAls.g:3945:5: ( (otherlv_39= RULE_ID ) )?
        int alt150=2;
        int LA150_0 = input.LA(1);

        if ( (LA150_0==RULE_ID) ) {
            alt150=1;
        }
        switch (alt150) {
            case 1 :
                // InternalAls.g:3946:6: (otherlv_39= RULE_ID )
                {
                // InternalAls.g:3946:6: (otherlv_39= RULE_ID )
                // InternalAls.g:3947:7: otherlv_39= RULE_ID
                {
                if ( state.backtracking==0 ) {

                  							/* */
                  						
                }
                otherlv_39=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

                }


                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred107_InternalAls

    // $ANTLR start synpred117_InternalAls
    public final void synpred117_InternalAls_fragment() throws RecognitionException {   
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        EObject lv_asname_46_0 = null;


        // InternalAls.g:4006:3: ( ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) ) )
        // InternalAls.g:4006:3: ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) )
        {
        // InternalAls.g:4006:3: ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) )
        // InternalAls.g:4007:4: () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' )
        {
        // InternalAls.g:4007:4: ()
        // InternalAls.g:4008:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalAls.g:4017:4: (otherlv_44= '@' )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==56) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // InternalAls.g:4018:5: otherlv_44= '@'
                {
                otherlv_44=(Token)match(input,56,FOLLOW_62); if (state.failed) return ;

                }
                break;

        }

        // InternalAls.g:4023:4: (otherlv_45= 'int' )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==26) ) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // InternalAls.g:4024:5: otherlv_45= 'int'
                {
                otherlv_45=(Token)match(input,26,FOLLOW_63); if (state.failed) return ;

                }
                break;

        }

        // InternalAls.g:4029:4: ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )?
        int alt155=2;
        switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA155_1 = input.LA(2);

                if ( (LA155_1==14) ) {
                    alt155=1;
                }
                }
                break;
            case 16:
            case 18:
                {
                alt155=1;
                }
                break;
            case 25:
                {
                int LA155_3 = input.LA(2);

                if ( (LA155_3==14) ) {
                    alt155=1;
                }
                }
                break;
        }

        switch (alt155) {
            case 1 :
                // InternalAls.g:4030:5: ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/'
                {
                // InternalAls.g:4030:5: ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' )
                int alt154=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt154=1;
                    }
                    break;
                case 16:
                    {
                    alt154=2;
                    }
                    break;
                case 18:
                    {
                    alt154=3;
                    }
                    break;
                case 25:
                    {
                    alt154=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 154, 0, input);

                    throw nvae;
                }

                switch (alt154) {
                    case 1 :
                        // InternalAls.g:4031:6: ( (lv_asname_46_0= ruleAsName ) )
                        {
                        // InternalAls.g:4031:6: ( (lv_asname_46_0= ruleAsName ) )
                        // InternalAls.g:4032:7: (lv_asname_46_0= ruleAsName )
                        {
                        // InternalAls.g:4032:7: (lv_asname_46_0= ruleAsName )
                        // InternalAls.g:4033:8: lv_asname_46_0= ruleAsName
                        {
                        if ( state.backtracking==0 ) {

                          								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getAsnameAsNameParserRuleCall_13_3_0_0_0());
                          							
                        }
                        pushFollow(FOLLOW_13);
                        lv_asname_46_0=ruleAsName();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }
                        break;
                    case 2 :
                        // InternalAls.g:4051:6: otherlv_47= 'fun'
                        {
                        otherlv_47=(Token)match(input,16,FOLLOW_13); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // InternalAls.g:4056:6: otherlv_48= 'pred'
                        {
                        otherlv_48=(Token)match(input,18,FOLLOW_13); if (state.failed) return ;

                        }
                        break;
                    case 4 :
                        // InternalAls.g:4061:6: otherlv_49= 'this'
                        {
                        otherlv_49=(Token)match(input,25,FOLLOW_13); if (state.failed) return ;

                        }
                        break;

                }

                otherlv_50=(Token)match(input,14,FOLLOW_5); if (state.failed) return ;

                }
                break;

        }

        // InternalAls.g:4071:4: ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' )
        int alt156=2;
        int LA156_0 = input.LA(1);

        if ( (LA156_0==RULE_ID) ) {
            alt156=1;
        }
        else if ( (LA156_0==25) ) {
            alt156=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 156, 0, input);

            throw nvae;
        }
        switch (alt156) {
            case 1 :
                // InternalAls.g:4072:5: ( (otherlv_51= RULE_ID ) )
                {
                // InternalAls.g:4072:5: ( (otherlv_51= RULE_ID ) )
                // InternalAls.g:4073:6: (otherlv_51= RULE_ID )
                {
                // InternalAls.g:4073:6: (otherlv_51= RULE_ID )
                // InternalAls.g:4074:7: otherlv_51= RULE_ID
                {
                if ( state.backtracking==0 ) {

                  							/* */
                  						
                }
                otherlv_51=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalAls.g:4089:5: otherlv_52= 'this'
                {
                otherlv_52=(Token)match(input,25,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred117_InternalAls

    // $ANTLR start synpred178_InternalAls
    public final void synpred178_InternalAls_fragment() throws RecognitionException {   
        EObject this_FunctionName_1 = null;


        // InternalAls.g:5850:3: (this_FunctionName_1= ruleFunctionName )
        // InternalAls.g:5850:3: this_FunctionName_1= ruleFunctionName
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_FunctionName_1=ruleFunctionName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred178_InternalAls

    // $ANTLR start synpred179_InternalAls
    public final void synpred179_InternalAls_fragment() throws RecognitionException {   
        EObject this_FunctionNamewParam_2 = null;


        // InternalAls.g:5862:3: (this_FunctionNamewParam_2= ruleFunctionNamewParam )
        // InternalAls.g:5862:3: this_FunctionNamewParam_2= ruleFunctionNamewParam
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_FunctionNamewParam_2=ruleFunctionNamewParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred179_InternalAls

    // $ANTLR start synpred181_InternalAls
    public final void synpred181_InternalAls_fragment() throws RecognitionException {   
        EObject this_EnumPropertyName_4 = null;


        // InternalAls.g:5886:3: (this_EnumPropertyName_4= ruleEnumPropertyName )
        // InternalAls.g:5886:3: this_EnumPropertyName_4= ruleEnumPropertyName
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_EnumPropertyName_4=ruleEnumPropertyName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_InternalAls

    // $ANTLR start synpred182_InternalAls
    public final void synpred182_InternalAls_fragment() throws RecognitionException {   
        EObject this_SignatureName_5 = null;


        // InternalAls.g:5898:3: (this_SignatureName_5= ruleSignatureName )
        // InternalAls.g:5898:3: this_SignatureName_5= ruleSignatureName
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SignatureName_5=ruleSignatureName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_InternalAls

    // $ANTLR start synpred183_InternalAls
    public final void synpred183_InternalAls_fragment() throws RecognitionException {   
        EObject this_PropertyName_6 = null;


        // InternalAls.g:5910:3: (this_PropertyName_6= rulePropertyName )
        // InternalAls.g:5910:3: this_PropertyName_6= rulePropertyName
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_PropertyName_6=rulePropertyName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_InternalAls

    // $ANTLR start synpred184_InternalAls
    public final void synpred184_InternalAls_fragment() throws RecognitionException {   
        EObject this_ExactlyName_7 = null;


        // InternalAls.g:5922:3: (this_ExactlyName_7= ruleExactlyName )
        // InternalAls.g:5922:3: this_ExactlyName_7= ruleExactlyName
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_ExactlyName_7=ruleExactlyName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_InternalAls

    // Delegated rules

    public final boolean synpred117_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred178_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred178_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred179_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred179_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred184_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred184_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred183_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred183_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred181_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred181_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred182_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred182_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalAls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalAls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA135 dfa135 = new DFA135(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\5\2\uffff\1\5\1\20\1\uffff\1\16\5\uffff\1\16\3\145\1\16\1\uffff\1\5\1\24\2\5\1\uffff\3\16";
    static final String dfa_3s = "\1\144\2\uffff\1\67\1\22\1\uffff\1\23\5\uffff\4\145\1\60\1\uffff\1\5\1\25\1\31\1\5\1\uffff\1\23\2\60";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\uffff\1\5\1\7\1\10\1\11\1\12\5\uffff\1\6\4\uffff\1\3\3\uffff";
    static final String dfa_5s = "\32\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\12\uffff\1\3\1\4\1\5\1\uffff\1\7\1\10\7\uffff\3\13\3\uffff\3\13\14\uffff\1\12\57\uffff\1\1\1\2\1\11",
            "",
            "",
            "\1\14\23\uffff\1\20\33\uffff\1\15\1\16\1\17",
            "\1\21\1\uffff\1\5",
            "",
            "\1\22\4\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "\1\25\4\uffff\1\21\32\uffff\1\26\1\uffff\1\26\64\uffff\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\25\4\uffff\1\21\32\uffff\1\26\1\uffff\1\26",
            "",
            "\1\27",
            "\1\7\1\10",
            "\1\30\23\uffff\1\20",
            "\1\31",
            "",
            "\1\22\4\uffff\1\23",
            "\1\25\4\uffff\1\21\32\uffff\1\26\1\uffff\1\26",
            "\1\25\4\uffff\1\21\32\uffff\1\26\1\uffff\1\26"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "499:2: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\2\2\uffff\1\11\2\uffff\1\4\4\uffff\1\4";
    static final String dfa_9s = "\1\5\1\4\1\uffff\1\5\2\uffff\3\5\1\uffff\2\5";
    static final String dfa_10s = "\1\144\1\15\1\uffff\1\144\2\uffff\1\144\2\67\1\uffff\1\33\1\144";
    static final String dfa_11s = "\2\uffff\1\4\1\uffff\1\3\1\2\3\uffff\1\1\2\uffff";
    static final String dfa_12s = "\14\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\12\uffff\3\2\1\uffff\2\2\1\1\1\uffff\1\2\4\uffff\3\2\3\uffff\3\2\14\uffff\1\2\57\uffff\3\2",
            "\1\3\10\uffff\1\4",
            "",
            "\1\6\12\uffff\1\7\1\11\1\10\1\uffff\2\11\1\uffff\1\5\1\11\3\4\1\uffff\3\11\3\uffff\3\11\14\uffff\1\11\57\uffff\3\11",
            "",
            "",
            "\1\4\10\uffff\1\12\1\uffff\3\4\1\11\2\4\2\uffff\1\4\4\uffff\3\4\1\uffff\1\4\1\uffff\3\4\14\uffff\1\4\57\uffff\3\4",
            "\1\11\10\uffff\1\4\12\uffff\1\11\33\uffff\3\11",
            "\1\11\10\uffff\1\4\12\uffff\1\11\33\uffff\3\11",
            "",
            "\1\13\24\uffff\2\4",
            "\1\4\10\uffff\1\11\1\uffff\3\4\1\11\2\4\2\uffff\1\4\4\uffff\3\4\1\uffff\1\4\1\uffff\3\4\14\uffff\1\4\57\uffff\3\4"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1762:2: ( ( () ( (lv_for_1_0= 'for' ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () ( (lv_for_5_0= 'for' ) ) ( (lv_value_6_0= RULE_INT ) ) ( (lv_but_7_0= 'but' ) ) ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () ( (lv_for_13_0= 'for' ) ) ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )";
        }
    }
    static final String dfa_14s = "\54\uffff";
    static final String dfa_15s = "\1\1\53\uffff";
    static final String dfa_16s = "\1\4\1\uffff\45\0\5\uffff";
    static final String dfa_17s = "\1\145\1\uffff\45\0\5\uffff";
    static final String dfa_18s = "\1\uffff\1\6\45\uffff\1\3\1\1\1\2\1\4\1\5";
    static final String dfa_19s = "\2\uffff\1\33\1\37\1\0\1\5\1\24\1\20\1\40\1\34\1\2\1\44\1\12\1\6\1\25\1\21\1\41\1\13\1\35\1\27\1\1\1\42\1\7\1\3\1\43\1\14\1\30\1\10\1\4\1\22\1\16\1\36\1\31\1\17\1\15\1\26\1\11\1\23\1\32\5\uffff}>";
    static final String[] dfa_20s = {
            "\3\1\11\uffff\3\1\1\uffff\2\1\3\uffff\3\1\1\33\6\1\1\2\1\3\1\4\1\uffff\1\34\1\14\1\31\1\32\1\44\1\45\1\1\1\46\12\1\1\uffff\2\1\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\15\1\16\1\17\1\20\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\42\13\1\1\35\1\36\1\37\1\40\1\41\1\43\1\1\1\uffff\3\1\1\21",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 3014:3: ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( (otherlv_3= '!' | otherlv_4= 'not' )? ( (lv_cmp_5_0= ruleCompareOp ) ) ( (lv_expr_6_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_7_0= ruleArrowOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( (otherlv_9= '=>' | otherlv_10= 'implies' ) ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )? (otherlv_13= 'else' ( (lv_expr_14_0= ruleExpression ) ) )? ) | (otherlv_15= '[' ( ( (lv_expr_16_0= ruleExpression ) ) ( ( (lv_comma_17_0= ruleComma ) ) ( (lv_expr_18_0= ruleExpression ) ) )* )? otherlv_19= ']' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_4 = input.LA(1);

                         
                        int index65_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalAls()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_20 = input.LA(1);

                         
                        int index65_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_10 = input.LA(1);

                         
                        int index65_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA65_23 = input.LA(1);

                         
                        int index65_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA65_28 = input.LA(1);

                         
                        int index65_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalAls()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_28);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA65_5 = input.LA(1);

                         
                        int index65_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA65_13 = input.LA(1);

                         
                        int index65_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_13);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA65_22 = input.LA(1);

                         
                        int index65_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_22);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA65_27 = input.LA(1);

                         
                        int index65_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalAls()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA65_36 = input.LA(1);

                         
                        int index65_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalAls()) ) {s = 42;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_36);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA65_12 = input.LA(1);

                         
                        int index65_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA65_17 = input.LA(1);

                         
                        int index65_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_17);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA65_25 = input.LA(1);

                         
                        int index65_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalAls()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_25);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA65_34 = input.LA(1);

                         
                        int index65_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalAls()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_34);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA65_30 = input.LA(1);

                         
                        int index65_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalAls()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_30);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA65_33 = input.LA(1);

                         
                        int index65_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalAls()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_33);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA65_7 = input.LA(1);

                         
                        int index65_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_7);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA65_15 = input.LA(1);

                         
                        int index65_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_15);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA65_29 = input.LA(1);

                         
                        int index65_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalAls()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_29);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA65_37 = input.LA(1);

                         
                        int index65_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalAls()) ) {s = 42;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_37);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA65_6 = input.LA(1);

                         
                        int index65_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_6);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA65_14 = input.LA(1);

                         
                        int index65_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_14);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA65_35 = input.LA(1);

                         
                        int index65_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalAls()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_35);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA65_19 = input.LA(1);

                         
                        int index65_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_19);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA65_26 = input.LA(1);

                         
                        int index65_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalAls()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_26);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA65_32 = input.LA(1);

                         
                        int index65_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalAls()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_32);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA65_38 = input.LA(1);

                         
                        int index65_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalAls()) ) {s = 43;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_38);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalAls()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_2);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA65_9 = input.LA(1);

                         
                        int index65_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_9);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA65_18 = input.LA(1);

                         
                        int index65_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_18);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA65_31 = input.LA(1);

                         
                        int index65_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalAls()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA65_3 = input.LA(1);

                         
                        int index65_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalAls()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_3);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA65_8 = input.LA(1);

                         
                        int index65_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_8);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA65_16 = input.LA(1);

                         
                        int index65_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_16);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA65_21 = input.LA(1);

                         
                        int index65_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_21);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA65_24 = input.LA(1);

                         
                        int index65_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_24);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA65_11 = input.LA(1);

                         
                        int index65_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalAls()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index65_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\126\uffff";
    static final String dfa_22s = "\1\45\125\uffff";
    static final String dfa_23s = "\1\4\44\0\61\uffff";
    static final String dfa_24s = "\1\145\44\0\61\uffff";
    static final String dfa_25s = "\45\uffff\1\3\56\uffff\1\1\1\2";
    static final String dfa_26s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\61\uffff}>";
    static final String[] dfa_27s = {
            "\1\27\1\40\1\30\11\uffff\1\41\1\45\1\42\1\uffff\2\45\3\uffff\1\43\1\34\1\7\4\45\1\44\2\45\1\25\1\26\1\24\1\uffff\2\45\1\10\1\5\5\45\1\1\1\45\1\2\1\31\1\32\1\33\1\35\1\36\1\37\1\uffff\1\3\1\4\22\45\1\6\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\7\45\1\uffff\4\45",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "3161:5: ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalAls()) ) {s = 84;}

                        else if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_3 = input.LA(1);

                         
                        int index61_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA61_4 = input.LA(1);

                         
                        int index61_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA61_5 = input.LA(1);

                         
                        int index61_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA61_6 = input.LA(1);

                         
                        int index61_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA61_7 = input.LA(1);

                         
                        int index61_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA61_8 = input.LA(1);

                         
                        int index61_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA61_9 = input.LA(1);

                         
                        int index61_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA61_10 = input.LA(1);

                         
                        int index61_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA61_11 = input.LA(1);

                         
                        int index61_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA61_12 = input.LA(1);

                         
                        int index61_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA61_13 = input.LA(1);

                         
                        int index61_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA61_14 = input.LA(1);

                         
                        int index61_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA61_15 = input.LA(1);

                         
                        int index61_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA61_16 = input.LA(1);

                         
                        int index61_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA61_17 = input.LA(1);

                         
                        int index61_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA61_18 = input.LA(1);

                         
                        int index61_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA61_19 = input.LA(1);

                         
                        int index61_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA61_20 = input.LA(1);

                         
                        int index61_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA61_21 = input.LA(1);

                         
                        int index61_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA61_22 = input.LA(1);

                         
                        int index61_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA61_23 = input.LA(1);

                         
                        int index61_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA61_24 = input.LA(1);

                         
                        int index61_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA61_25 = input.LA(1);

                         
                        int index61_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA61_26 = input.LA(1);

                         
                        int index61_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA61_27 = input.LA(1);

                         
                        int index61_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA61_28 = input.LA(1);

                         
                        int index61_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA61_29 = input.LA(1);

                         
                        int index61_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA61_30 = input.LA(1);

                         
                        int index61_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA61_31 = input.LA(1);

                         
                        int index61_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA61_32 = input.LA(1);

                         
                        int index61_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA61_33 = input.LA(1);

                         
                        int index61_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA61_34 = input.LA(1);

                         
                        int index61_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA61_35 = input.LA(1);

                         
                        int index61_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA61_36 = input.LA(1);

                         
                        int index61_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index61_36);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_28s = "\27\uffff";
    static final String dfa_29s = "\1\4\12\uffff\1\0\3\uffff\1\4\2\uffff\2\4\1\uffff\1\5\1\4";
    static final String dfa_30s = "\1\131\12\uffff\1\0\3\uffff\1\131\2\uffff\2\145\1\uffff\1\31\1\145";
    static final String dfa_31s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\1\15\1\16\1\uffff\1\13\1\17\2\uffff\1\20\2\uffff";
    static final String dfa_32s = "\13\uffff\1\0\13\uffff}>";
    static final String[] dfa_33s = {
            "\1\6\1\16\1\7\11\uffff\1\16\1\uffff\1\16\6\uffff\1\16\1\13\1\4\4\uffff\1\17\2\uffff\3\5\3\uffff\2\4\5\uffff\1\1\1\uffff\1\2\1\10\1\11\1\12\1\14\1\15\1\16\1\uffff\2\3\22\uffff\13\4\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\21\1\22\1\21\11\uffff\1\21\1\uffff\1\21\6\uffff\1\23\2\21\4\uffff\1\21\1\uffff\4\21\3\uffff\2\21\5\uffff\1\21\1\uffff\7\21\1\24\2\21\22\uffff\14\21",
            "",
            "",
            "\3\21\7\uffff\1\25\1\uffff\1\21\1\uffff\1\21\1\24\5\uffff\4\21\3\uffff\1\21\1\24\4\21\1\uffff\6\21\1\uffff\1\21\1\uffff\1\21\1\uffff\7\21\1\uffff\46\21\5\uffff\1\21",
            "\3\21\7\uffff\1\25\1\uffff\1\21\1\uffff\1\21\1\24\5\uffff\4\21\3\uffff\1\21\1\24\4\21\1\uffff\6\21\1\uffff\1\21\1\uffff\1\21\1\uffff\7\21\1\uffff\46\21\5\uffff\1\21",
            "",
            "\1\26\23\uffff\1\21",
            "\3\21\7\uffff\1\24\1\uffff\1\21\1\uffff\1\21\1\24\5\uffff\4\21\3\uffff\1\21\1\24\4\21\1\uffff\6\21\1\uffff\1\21\1\uffff\1\21\1\uffff\7\21\1\uffff\46\21\5\uffff\1\21"
    };

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_28;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "3319:2: ( ( () ( (lv_parO_1_0= '(' ) ) ( (lv_expr_2_0= ruleExpression ) )+ ( (lv_parF_3_0= ')' ) ) ) | ( () ( (lv_let_5_0= 'let' ) ) ( (lv_letdecl_6_0= ruleLetDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_letdecl_8_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_9_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_11_0= ruleQuant ) ) ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )? ) | ( () ( (lv_unOp_18_0= ruleUnOp ) ) ( (lv_expr_19_0= ruleExpression ) ) ) | ( () ( (lv_common_21_0= ruleCommonQuantUnOp ) ) ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )? ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )? ) | ( () this_INT_28= RULE_INT ) | ( () this_NEGATIVE_INTEGER_30= RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_32_0= 'none' ) ) ) | ( () ( (lv_iden_34_0= 'iden' ) ) ) | ( () ( (lv_univ_36_0= 'univ' ) ) ) | ( () ( ( (lv_int_38_0= 'int' ) ) ( (otherlv_39= RULE_ID ) )? ) ) | ( (lv_int_40_0= 'Int' ) ) | ( () ( (lv_seq_42_0= 'seq/Int' ) ) ) | ( () (otherlv_44= '@' )? (otherlv_45= 'int' )? ( ( ( (lv_asname_46_0= ruleAsName ) ) | otherlv_47= 'fun' | otherlv_48= 'pred' | otherlv_49= 'this' ) otherlv_50= '/' )? ( ( (otherlv_51= RULE_ID ) ) | otherlv_52= 'this' ) ) | ( () ( (lv_block_54_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_56_0= ruleLeftCurlyBracket ) ) ( (lv_decl_57_0= ruleDecl ) ) ( ( (lv_comma_58_0= ruleComma ) ) ( (lv_decl_59_0= ruleDecl ) ) )* ( (lv_blockOrBar_60_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_61_0= ruleRightCurlyBracket ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred107_InternalAls()) ) {s = 16;}

                        else if ( (synpred117_InternalAls()) ) {s = 14;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\125\uffff";
    static final String dfa_35s = "\1\4\124\uffff";
    static final String dfa_36s = "\1\4\1\uffff\2\0\121\uffff";
    static final String dfa_37s = "\1\145\1\uffff\2\0\121\uffff";
    static final String dfa_38s = "\1\uffff\1\1\2\uffff\1\2\120\uffff";
    static final String dfa_39s = "\2\uffff\1\0\1\1\121\uffff}>";
    static final String[] dfa_40s = {
            "\1\4\1\3\1\4\11\uffff\3\4\1\uffff\2\4\3\uffff\1\2\14\4\1\uffff\22\4\1\1\47\4\1\uffff\4\4",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "3515:4: ( ( (lv_decl_12_0= ruleDecl ) ) ( ( (lv_comma_13_0= ruleComma ) ) ( (lv_decl_14_0= ruleDecl ) ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalAls()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalAls()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_41s = "\1\46\125\uffff";
    static final String dfa_42s = "\1\4\45\0\60\uffff";
    static final String dfa_43s = "\1\145\45\0\60\uffff";
    static final String dfa_44s = "\46\uffff\1\3\55\uffff\1\1\1\2";
    static final String dfa_45s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\60\uffff}>";
    static final String[] dfa_46s = {
            "\1\31\1\42\1\32\11\uffff\1\43\1\46\1\44\1\uffff\2\46\3\uffff\1\45\1\36\1\11\4\46\1\1\2\46\1\27\1\30\1\26\1\uffff\2\46\1\12\1\7\5\46\1\3\1\46\1\4\1\33\1\34\1\35\1\37\1\40\1\41\1\uffff\1\5\1\6\22\46\1\10\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\6\46\1\2\1\uffff\4\46",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_21;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "3576:4: ( ( (lv_blockOrBar_15_0= ruleBlockOrBar ) ) | ( (lv_expr_16_0= ruleExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalAls()) ) {s = 84;}

                        else if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalAls()) ) {s = 84;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA70_11 = input.LA(1);

                         
                        int index70_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA70_12 = input.LA(1);

                         
                        int index70_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA70_13 = input.LA(1);

                         
                        int index70_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA70_14 = input.LA(1);

                         
                        int index70_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA70_15 = input.LA(1);

                         
                        int index70_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA70_16 = input.LA(1);

                         
                        int index70_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA70_17 = input.LA(1);

                         
                        int index70_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA70_18 = input.LA(1);

                         
                        int index70_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA70_19 = input.LA(1);

                         
                        int index70_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA70_20 = input.LA(1);

                         
                        int index70_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA70_21 = input.LA(1);

                         
                        int index70_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA70_22 = input.LA(1);

                         
                        int index70_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA70_23 = input.LA(1);

                         
                        int index70_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA70_24 = input.LA(1);

                         
                        int index70_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA70_25 = input.LA(1);

                         
                        int index70_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA70_26 = input.LA(1);

                         
                        int index70_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA70_27 = input.LA(1);

                         
                        int index70_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA70_28 = input.LA(1);

                         
                        int index70_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA70_29 = input.LA(1);

                         
                        int index70_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA70_30 = input.LA(1);

                         
                        int index70_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA70_31 = input.LA(1);

                         
                        int index70_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA70_32 = input.LA(1);

                         
                        int index70_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA70_33 = input.LA(1);

                         
                        int index70_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA70_34 = input.LA(1);

                         
                        int index70_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA70_35 = input.LA(1);

                         
                        int index70_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA70_36 = input.LA(1);

                         
                        int index70_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA70_37 = input.LA(1);

                         
                        int index70_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index70_37);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "3700:4: ( ( (lv_decl_22_0= ruleDecl ) ) ( ( (lv_comma_23_0= ruleComma ) ) ( (lv_decl_24_0= ruleDecl ) ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalAls()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_3 = input.LA(1);

                         
                        int index72_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalAls()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index72_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_21;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "3761:4: ( ( (lv_blockOrBar_25_0= ruleBlockOrBar ) ) | ( (lv_expr_26_0= ruleExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_InternalAls()) ) {s = 84;}

                        else if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_InternalAls()) ) {s = 84;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA73_27 = input.LA(1);

                         
                        int index73_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA73_28 = input.LA(1);

                         
                        int index73_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA73_29 = input.LA(1);

                         
                        int index73_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA73_30 = input.LA(1);

                         
                        int index73_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA73_31 = input.LA(1);

                         
                        int index73_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA73_32 = input.LA(1);

                         
                        int index73_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA73_33 = input.LA(1);

                         
                        int index73_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA73_34 = input.LA(1);

                         
                        int index73_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA73_35 = input.LA(1);

                         
                        int index73_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA73_36 = input.LA(1);

                         
                        int index73_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA73_37 = input.LA(1);

                         
                        int index73_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalAls()) ) {s = 85;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_37);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_47s = "\15\uffff";
    static final String dfa_48s = "\1\5\1\uffff\2\0\11\uffff";
    static final String dfa_49s = "\1\144\1\uffff\2\0\11\uffff";
    static final String dfa_50s = "\1\uffff\1\1\2\uffff\1\4\1\11\1\2\1\3\1\5\1\6\1\7\1\10\1\12";
    static final String dfa_51s = "\2\uffff\1\1\1\0\11\uffff}>";
    static final String[] dfa_52s = {
            "\1\3\23\uffff\1\2\30\uffff\1\5\57\uffff\1\1\1\uffff\1\4",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_47;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "5837:2: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA100_3 = input.LA(1);

                         
                        int index100_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalAls()) ) {s = 6;}

                        else if ( (synpred179_InternalAls()) ) {s = 7;}

                        else if ( (synpred181_InternalAls()) ) {s = 8;}

                        else if ( (synpred182_InternalAls()) ) {s = 9;}

                        else if ( (synpred183_InternalAls()) ) {s = 10;}

                        else if ( (synpred184_InternalAls()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index100_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA100_2 = input.LA(1);

                         
                        int index100_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_InternalAls()) ) {s = 6;}

                        else if ( (synpred179_InternalAls()) ) {s = 7;}

                        else if ( (synpred181_InternalAls()) ) {s = 8;}

                        else if ( (synpred182_InternalAls()) ) {s = 9;}

                        else if ( (synpred183_InternalAls()) ) {s = 10;}

                        else if ( (synpred184_InternalAls()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index100_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 100, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_53s = "\50\uffff";
    static final String dfa_54s = "\1\45\47\uffff";
    static final String dfa_55s = "\1\4\1\0\46\uffff";
    static final String dfa_56s = "\1\131\1\0\46\uffff";
    static final String dfa_57s = "\2\uffff\1\2\42\uffff\1\3\1\uffff\1\1";
    static final String dfa_58s = "\1\uffff\1\0\46\uffff}>";
    static final String[] dfa_59s = {
            "\3\2\11\uffff\1\2\1\uffff\1\2\6\uffff\3\2\4\uffff\1\2\2\uffff\3\2\3\uffff\2\2\2\uffff\1\45\2\uffff\1\1\1\uffff\7\2\1\uffff\2\2\22\uffff\14\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA135 extends DFA {

        public DFA135(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 135;
            this.eot = dfa_53;
            this.eof = dfa_54;
            this.min = dfa_55;
            this.max = dfa_56;
            this.accept = dfa_57;
            this.special = dfa_58;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "3161:5: ( ( (lv_par_11_0= ruleParanthesisandExpression ) ) | ( (lv_expr_12_0= ruleExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA135_1 = input.LA(1);

                         
                        int index135_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalAls()) ) {s = 39;}

                        else if ( (synpred80_InternalAls()) ) {s = 2;}

                         
                        input.seek(index135_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 135, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00040038E0370022L,0x0000001E00000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00040038E0370022L,0x0000001C00000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002002020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002002030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0004000002002020L,0x0000001400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00E0000002000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0200800202000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000002000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0202000002000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0202000202000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0DFD06390E050070L,0x0000000003FFC000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00E4000002002020L,0x0000001400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001400100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000201000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000E050020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400110000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004800202002020L,0x0000001400000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000038C0000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000003880000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000C100000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000422000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00E0000002050020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xF0005FB810000002L,0x00000020FC007FFFL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000068010000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xFDFD7FB91E050072L,0x00000020FFFFFFFFL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xF0007FB810000002L,0x00000020FC007FFFL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0DFD86390E050070L,0x0000000003FFC000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0DFF06390E050070L,0x0000000003FFC000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000300000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0FFD063B0E050072L,0x0000000103FFC000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0DFD063B0E050072L,0x0000000103FFC000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000006050020L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000002050020L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0FFD06390E050070L,0x0000000003FFC000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0DFD063F0E050070L,0x0000000003FFC000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0DFD26390E050072L,0x0000000003FFC000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000200000002L});

}