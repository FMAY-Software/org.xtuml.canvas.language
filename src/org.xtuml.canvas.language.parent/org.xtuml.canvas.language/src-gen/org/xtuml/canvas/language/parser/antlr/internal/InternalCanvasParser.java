package org.xtuml.canvas.language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtuml.canvas.language.services.CanvasGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCanvasParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'render'", "':'", "'render:'", "'import'", "'properties'", "'properties:'", "'viewport'", "'viewport:'", "'zoom'", "'shapes'", "'shapes:'", "'shape'", "'shape:'", "'texts'", "'texts:'", "'text'", "'text:'", "'start'", "'end'", "'middle'", "'end_fixed'", "'start_fixed'", "'none'", "'floating'", "'additional'", "'container'", "'true'", "'false'", "'color'", "'connectors'", "'connectors:'", "'connector'", "'connector:'", "'anchors'", "'anchors:'", "'start:'", "'shapeAnchor'", "'shapeAnchor:'", "'segmentAnchor'", "'segmentAnchor:'", "'polyline'", "'polyline:'", "'segment'", "'segment:'", "','", "'x'", "'y'", "'rectangle'", "'rectangle:'", "'width'", "'height'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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

    // delegates
    // delegators


        public InternalCanvasParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCanvasParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCanvasParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCanvas.g"; }



     	private CanvasGrammarAccess grammarAccess;

        public InternalCanvasParser(TokenStream input, CanvasGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CanvasGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCanvas.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCanvas.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCanvas.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCanvas.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_semantics_0_0= ruleSemanticModel ) )* ( (otherlv_1= 'render' otherlv_2= ':' ) | otherlv_3= 'render:' ) ( (lv_represents_4_0= RULE_STRING ) ) ( (lv_properties_5_0= ruleModelProperties ) )? ( (lv_elements_6_0= ruleGraphicalElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_represents_4_0=null;
        EObject lv_semantics_0_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:77:2: ( ( ( (lv_semantics_0_0= ruleSemanticModel ) )* ( (otherlv_1= 'render' otherlv_2= ':' ) | otherlv_3= 'render:' ) ( (lv_represents_4_0= RULE_STRING ) ) ( (lv_properties_5_0= ruleModelProperties ) )? ( (lv_elements_6_0= ruleGraphicalElement ) )* ) )
            // InternalCanvas.g:78:2: ( ( (lv_semantics_0_0= ruleSemanticModel ) )* ( (otherlv_1= 'render' otherlv_2= ':' ) | otherlv_3= 'render:' ) ( (lv_represents_4_0= RULE_STRING ) ) ( (lv_properties_5_0= ruleModelProperties ) )? ( (lv_elements_6_0= ruleGraphicalElement ) )* )
            {
            // InternalCanvas.g:78:2: ( ( (lv_semantics_0_0= ruleSemanticModel ) )* ( (otherlv_1= 'render' otherlv_2= ':' ) | otherlv_3= 'render:' ) ( (lv_represents_4_0= RULE_STRING ) ) ( (lv_properties_5_0= ruleModelProperties ) )? ( (lv_elements_6_0= ruleGraphicalElement ) )* )
            // InternalCanvas.g:79:3: ( (lv_semantics_0_0= ruleSemanticModel ) )* ( (otherlv_1= 'render' otherlv_2= ':' ) | otherlv_3= 'render:' ) ( (lv_represents_4_0= RULE_STRING ) ) ( (lv_properties_5_0= ruleModelProperties ) )? ( (lv_elements_6_0= ruleGraphicalElement ) )*
            {
            // InternalCanvas.g:79:3: ( (lv_semantics_0_0= ruleSemanticModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCanvas.g:80:4: (lv_semantics_0_0= ruleSemanticModel )
            	    {
            	    // InternalCanvas.g:80:4: (lv_semantics_0_0= ruleSemanticModel )
            	    // InternalCanvas.g:81:5: lv_semantics_0_0= ruleSemanticModel
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSemanticsSemanticModelParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_semantics_0_0=ruleSemanticModel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"semantics",
            	    						lv_semantics_0_0,
            	    						"org.xtuml.canvas.language.Canvas.SemanticModel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCanvas.g:98:3: ( (otherlv_1= 'render' otherlv_2= ':' ) | otherlv_3= 'render:' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCanvas.g:99:4: (otherlv_1= 'render' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:99:4: (otherlv_1= 'render' otherlv_2= ':' )
                    // InternalCanvas.g:100:5: otherlv_1= 'render' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getModelAccess().getRenderKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getModelAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:110:4: otherlv_3= 'render:'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRenderKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:115:3: ( (lv_represents_4_0= RULE_STRING ) )
            // InternalCanvas.g:116:4: (lv_represents_4_0= RULE_STRING )
            {
            // InternalCanvas.g:116:4: (lv_represents_4_0= RULE_STRING )
            // InternalCanvas.g:117:5: lv_represents_4_0= RULE_STRING
            {
            lv_represents_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_represents_4_0, grammarAccess.getModelAccess().getRepresentsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"represents",
            						lv_represents_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCanvas.g:133:3: ( (lv_properties_5_0= ruleModelProperties ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCanvas.g:134:4: (lv_properties_5_0= ruleModelProperties )
                    {
                    // InternalCanvas.g:134:4: (lv_properties_5_0= ruleModelProperties )
                    // InternalCanvas.g:135:5: lv_properties_5_0= ruleModelProperties
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertiesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_properties_5_0=ruleModelProperties();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"properties",
                    						lv_properties_5_0,
                    						"org.xtuml.canvas.language.Canvas.ModelProperties");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:152:3: ( (lv_elements_6_0= ruleGraphicalElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=21)||(LA4_0>=40 && LA4_0<=41)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCanvas.g:153:4: (lv_elements_6_0= ruleGraphicalElement )
            	    {
            	    // InternalCanvas.g:153:4: (lv_elements_6_0= ruleGraphicalElement )
            	    // InternalCanvas.g:154:5: lv_elements_6_0= ruleGraphicalElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsGraphicalElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_6_0=ruleGraphicalElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"org.xtuml.canvas.language.Canvas.GraphicalElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSemanticModel"
    // InternalCanvas.g:175:1: entryRuleSemanticModel returns [EObject current=null] : iv_ruleSemanticModel= ruleSemanticModel EOF ;
    public final EObject entryRuleSemanticModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticModel = null;


        try {
            // InternalCanvas.g:175:54: (iv_ruleSemanticModel= ruleSemanticModel EOF )
            // InternalCanvas.g:176:2: iv_ruleSemanticModel= ruleSemanticModel EOF
            {
             newCompositeNode(grammarAccess.getSemanticModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSemanticModel=ruleSemanticModel();

            state._fsp--;

             current =iv_ruleSemanticModel; 
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
    // $ANTLR end "entryRuleSemanticModel"


    // $ANTLR start "ruleSemanticModel"
    // InternalCanvas.g:182:1: ruleSemanticModel returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSemanticModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:188:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalCanvas.g:189:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalCanvas.g:189:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalCanvas.g:190:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSemanticModelAccess().getImportKeyword_0());
            		
            // InternalCanvas.g:194:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalCanvas.g:195:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalCanvas.g:195:4: (lv_importURI_1_0= RULE_STRING )
            // InternalCanvas.g:196:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getSemanticModelAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSemanticModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSemanticModel"


    // $ANTLR start "entryRuleModelProperties"
    // InternalCanvas.g:216:1: entryRuleModelProperties returns [EObject current=null] : iv_ruleModelProperties= ruleModelProperties EOF ;
    public final EObject entryRuleModelProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperties = null;


        try {
            // InternalCanvas.g:216:56: (iv_ruleModelProperties= ruleModelProperties EOF )
            // InternalCanvas.g:217:2: iv_ruleModelProperties= ruleModelProperties EOF
            {
             newCompositeNode(grammarAccess.getModelPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelProperties=ruleModelProperties();

            state._fsp--;

             current =iv_ruleModelProperties; 
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
    // $ANTLR end "entryRuleModelProperties"


    // $ANTLR start "ruleModelProperties"
    // InternalCanvas.g:223:1: ruleModelProperties returns [EObject current=null] : ( ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) otherlv_7= 'zoom' ( (lv_zoom_8_0= RULE_INT ) ) ) ;
    public final EObject ruleModelProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_zoom_8_0=null;
        EObject lv_point_6_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:229:2: ( ( ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) otherlv_7= 'zoom' ( (lv_zoom_8_0= RULE_INT ) ) ) )
            // InternalCanvas.g:230:2: ( ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) otherlv_7= 'zoom' ( (lv_zoom_8_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:230:2: ( ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) otherlv_7= 'zoom' ( (lv_zoom_8_0= RULE_INT ) ) )
            // InternalCanvas.g:231:3: ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) otherlv_7= 'zoom' ( (lv_zoom_8_0= RULE_INT ) )
            {
            // InternalCanvas.g:231:3: ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCanvas.g:232:4: (otherlv_0= 'properties' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:232:4: (otherlv_0= 'properties' otherlv_1= ':' )
                    // InternalCanvas.g:233:5: otherlv_0= 'properties' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getModelPropertiesAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:243:4: otherlv_2= 'properties:'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:248:3: ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCanvas.g:249:4: (otherlv_3= 'viewport' otherlv_4= ':' )
                    {
                    // InternalCanvas.g:249:4: (otherlv_3= 'viewport' otherlv_4= ':' )
                    // InternalCanvas.g:250:5: otherlv_3= 'viewport' otherlv_4= ':'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_0_0());
                    				
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    					newLeafNode(otherlv_4, grammarAccess.getModelPropertiesAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:260:4: otherlv_5= 'viewport:'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:265:3: ( (lv_point_6_0= rulePoint ) )
            // InternalCanvas.g:266:4: (lv_point_6_0= rulePoint )
            {
            // InternalCanvas.g:266:4: (lv_point_6_0= rulePoint )
            // InternalCanvas.g:267:5: lv_point_6_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getModelPropertiesAccess().getPointPointParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_point_6_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelPropertiesRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_6_0,
            						"org.xtuml.canvas.language.Canvas.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getModelPropertiesAccess().getZoomKeyword_3());
            		
            // InternalCanvas.g:288:3: ( (lv_zoom_8_0= RULE_INT ) )
            // InternalCanvas.g:289:4: (lv_zoom_8_0= RULE_INT )
            {
            // InternalCanvas.g:289:4: (lv_zoom_8_0= RULE_INT )
            // InternalCanvas.g:290:5: lv_zoom_8_0= RULE_INT
            {
            lv_zoom_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_zoom_8_0, grammarAccess.getModelPropertiesAccess().getZoomINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"zoom",
            						lv_zoom_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleModelProperties"


    // $ANTLR start "entryRuleGraphicalElement"
    // InternalCanvas.g:310:1: entryRuleGraphicalElement returns [EObject current=null] : iv_ruleGraphicalElement= ruleGraphicalElement EOF ;
    public final EObject entryRuleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicalElement = null;


        try {
            // InternalCanvas.g:310:57: (iv_ruleGraphicalElement= ruleGraphicalElement EOF )
            // InternalCanvas.g:311:2: iv_ruleGraphicalElement= ruleGraphicalElement EOF
            {
             newCompositeNode(grammarAccess.getGraphicalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicalElement=ruleGraphicalElement();

            state._fsp--;

             current =iv_ruleGraphicalElement; 
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
    // $ANTLR end "entryRuleGraphicalElement"


    // $ANTLR start "ruleGraphicalElement"
    // InternalCanvas.g:317:1: ruleGraphicalElement returns [EObject current=null] : (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors ) ;
    public final EObject ruleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Shapes_0 = null;

        EObject this_Connectors_1 = null;



        	enterRule();

        try {
            // InternalCanvas.g:323:2: ( (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors ) )
            // InternalCanvas.g:324:2: (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors )
            {
            // InternalCanvas.g:324:2: (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=40 && LA7_0<=41)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCanvas.g:325:3: this_Shapes_0= ruleShapes
                    {

                    			newCompositeNode(grammarAccess.getGraphicalElementAccess().getShapesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shapes_0=ruleShapes();

                    state._fsp--;


                    			current = this_Shapes_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCanvas.g:334:3: this_Connectors_1= ruleConnectors
                    {

                    			newCompositeNode(grammarAccess.getGraphicalElementAccess().getConnectorsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connectors_1=ruleConnectors();

                    state._fsp--;


                    			current = this_Connectors_1;
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
    // $ANTLR end "ruleGraphicalElement"


    // $ANTLR start "entryRuleShapes"
    // InternalCanvas.g:346:1: entryRuleShapes returns [EObject current=null] : iv_ruleShapes= ruleShapes EOF ;
    public final EObject entryRuleShapes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapes = null;


        try {
            // InternalCanvas.g:346:47: (iv_ruleShapes= ruleShapes EOF )
            // InternalCanvas.g:347:2: iv_ruleShapes= ruleShapes EOF
            {
             newCompositeNode(grammarAccess.getShapesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapes=ruleShapes();

            state._fsp--;

             current =iv_ruleShapes; 
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
    // $ANTLR end "entryRuleShapes"


    // $ANTLR start "ruleShapes"
    // InternalCanvas.g:353:1: ruleShapes returns [EObject current=null] : ( () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )* ) ;
    public final EObject ruleShapes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_shapes_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:359:2: ( ( () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )* ) )
            // InternalCanvas.g:360:2: ( () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )* )
            {
            // InternalCanvas.g:360:2: ( () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )* )
            // InternalCanvas.g:361:3: () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )*
            {
            // InternalCanvas.g:361:3: ()
            // InternalCanvas.g:362:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapesAccess().getShapesAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:368:3: ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCanvas.g:369:4: (otherlv_1= 'shapes' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:369:4: (otherlv_1= 'shapes' otherlv_2= ':' )
                    // InternalCanvas.g:370:5: otherlv_1= 'shapes' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getShapesAccess().getShapesKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_2, grammarAccess.getShapesAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:380:4: otherlv_3= 'shapes:'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getShapesAccess().getShapesKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:385:3: ( (lv_shapes_4_0= ruleShape ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=22 && LA9_0<=23)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCanvas.g:386:4: (lv_shapes_4_0= ruleShape )
            	    {
            	    // InternalCanvas.g:386:4: (lv_shapes_4_0= ruleShape )
            	    // InternalCanvas.g:387:5: lv_shapes_4_0= ruleShape
            	    {

            	    					newCompositeNode(grammarAccess.getShapesAccess().getShapesShapeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_shapes_4_0=ruleShape();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShapesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shapes",
            	    						lv_shapes_4_0,
            	    						"org.xtuml.canvas.language.Canvas.Shape");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleShapes"


    // $ANTLR start "entryRuleShape"
    // InternalCanvas.g:408:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // InternalCanvas.g:408:46: (iv_ruleShape= ruleShape EOF )
            // InternalCanvas.g:409:2: iv_ruleShape= ruleShape EOF
            {
             newCompositeNode(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShape=ruleShape();

            state._fsp--;

             current =iv_ruleShape; 
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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalCanvas.g:415:1: ruleShape returns [EObject current=null] : ( () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_props_5_0= ruleShapeProps ) )? ( (lv_rect_6_0= ruleRectangle ) ) ( (lv_text_7_0= ruleFloatingText ) )? ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) ) ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_represents_11_0=null;
        EObject lv_props_5_0 = null;

        EObject lv_rect_6_0 = null;

        EObject lv_text_7_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:421:2: ( ( () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_props_5_0= ruleShapeProps ) )? ( (lv_rect_6_0= ruleRectangle ) ) ( (lv_text_7_0= ruleFloatingText ) )? ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) ) ) )
            // InternalCanvas.g:422:2: ( () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_props_5_0= ruleShapeProps ) )? ( (lv_rect_6_0= ruleRectangle ) ) ( (lv_text_7_0= ruleFloatingText ) )? ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) ) )
            {
            // InternalCanvas.g:422:2: ( () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_props_5_0= ruleShapeProps ) )? ( (lv_rect_6_0= ruleRectangle ) ) ( (lv_text_7_0= ruleFloatingText ) )? ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) ) )
            // InternalCanvas.g:423:3: () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_props_5_0= ruleShapeProps ) )? ( (lv_rect_6_0= ruleRectangle ) ) ( (lv_text_7_0= ruleFloatingText ) )? ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) )
            {
            // InternalCanvas.g:423:3: ()
            // InternalCanvas.g:424:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeAccess().getShapeAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:430:3: ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCanvas.g:431:4: (otherlv_1= 'shape' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:431:4: (otherlv_1= 'shape' otherlv_2= ':' )
                    // InternalCanvas.g:432:5: otherlv_1= 'shape' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getShapeAccess().getShapeKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_13); 

                    					newLeafNode(otherlv_2, grammarAccess.getShapeAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:442:4: otherlv_3= 'shape:'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getShapeAccess().getShapeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:447:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCanvas.g:448:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCanvas.g:448:4: (lv_name_4_0= RULE_ID )
            // InternalCanvas.g:449:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_4_0, grammarAccess.getShapeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCanvas.g:465:3: ( (lv_props_5_0= ruleShapeProps ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=15 && LA11_0<=16)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCanvas.g:466:4: (lv_props_5_0= ruleShapeProps )
                    {
                    // InternalCanvas.g:466:4: (lv_props_5_0= ruleShapeProps )
                    // InternalCanvas.g:467:5: lv_props_5_0= ruleShapeProps
                    {

                    					newCompositeNode(grammarAccess.getShapeAccess().getPropsShapePropsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_props_5_0=ruleShapeProps();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapeRule());
                    					}
                    					set(
                    						current,
                    						"props",
                    						lv_props_5_0,
                    						"org.xtuml.canvas.language.Canvas.ShapeProps");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:484:3: ( (lv_rect_6_0= ruleRectangle ) )
            // InternalCanvas.g:485:4: (lv_rect_6_0= ruleRectangle )
            {
            // InternalCanvas.g:485:4: (lv_rect_6_0= ruleRectangle )
            // InternalCanvas.g:486:5: lv_rect_6_0= ruleRectangle
            {

            					newCompositeNode(grammarAccess.getShapeAccess().getRectRectangleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_rect_6_0=ruleRectangle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeRule());
            					}
            					set(
            						current,
            						"rect",
            						lv_rect_6_0,
            						"org.xtuml.canvas.language.Canvas.Rectangle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:503:3: ( (lv_text_7_0= ruleFloatingText ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=26 && LA12_0<=27)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCanvas.g:504:4: (lv_text_7_0= ruleFloatingText )
                    {
                    // InternalCanvas.g:504:4: (lv_text_7_0= ruleFloatingText )
                    // InternalCanvas.g:505:5: lv_text_7_0= ruleFloatingText
                    {

                    					newCompositeNode(grammarAccess.getShapeAccess().getTextFloatingTextParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_text_7_0=ruleFloatingText();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapeRule());
                    					}
                    					set(
                    						current,
                    						"text",
                    						lv_text_7_0,
                    						"org.xtuml.canvas.language.Canvas.FloatingText");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:522:3: ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            else if ( (LA13_0==13) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCanvas.g:523:4: (otherlv_8= 'render' otherlv_9= ':' )
                    {
                    // InternalCanvas.g:523:4: (otherlv_8= 'render' otherlv_9= ':' )
                    // InternalCanvas.g:524:5: otherlv_8= 'render' otherlv_9= ':'
                    {
                    otherlv_8=(Token)match(input,11,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getShapeAccess().getRenderKeyword_6_0_0());
                    				
                    otherlv_9=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(otherlv_9, grammarAccess.getShapeAccess().getColonKeyword_6_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:534:4: otherlv_10= 'render:'
                    {
                    otherlv_10=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getShapeAccess().getRenderKeyword_6_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:539:3: ( (lv_represents_11_0= RULE_STRING ) )
            // InternalCanvas.g:540:4: (lv_represents_11_0= RULE_STRING )
            {
            // InternalCanvas.g:540:4: (lv_represents_11_0= RULE_STRING )
            // InternalCanvas.g:541:5: lv_represents_11_0= RULE_STRING
            {
            lv_represents_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_represents_11_0, grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"represents",
            						lv_represents_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleFloatingTexts"
    // InternalCanvas.g:561:1: entryRuleFloatingTexts returns [EObject current=null] : iv_ruleFloatingTexts= ruleFloatingTexts EOF ;
    public final EObject entryRuleFloatingTexts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatingTexts = null;


        try {
            // InternalCanvas.g:561:54: (iv_ruleFloatingTexts= ruleFloatingTexts EOF )
            // InternalCanvas.g:562:2: iv_ruleFloatingTexts= ruleFloatingTexts EOF
            {
             newCompositeNode(grammarAccess.getFloatingTextsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatingTexts=ruleFloatingTexts();

            state._fsp--;

             current =iv_ruleFloatingTexts; 
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
    // $ANTLR end "entryRuleFloatingTexts"


    // $ANTLR start "ruleFloatingTexts"
    // InternalCanvas.g:568:1: ruleFloatingTexts returns [EObject current=null] : ( () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )* ) ;
    public final EObject ruleFloatingTexts() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_texts_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:574:2: ( ( () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )* ) )
            // InternalCanvas.g:575:2: ( () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )* )
            {
            // InternalCanvas.g:575:2: ( () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )* )
            // InternalCanvas.g:576:3: () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )*
            {
            // InternalCanvas.g:576:3: ()
            // InternalCanvas.g:577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatingTextsAccess().getFloatingTextsAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:583:3: ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==25) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCanvas.g:584:4: (otherlv_1= 'texts' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:584:4: (otherlv_1= 'texts' otherlv_2= ':' )
                    // InternalCanvas.g:585:5: otherlv_1= 'texts' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_17); 

                    					newLeafNode(otherlv_2, grammarAccess.getFloatingTextsAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:595:4: otherlv_3= 'texts:'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:600:3: ( (lv_texts_4_0= ruleFloatingText ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=26 && LA15_0<=27)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCanvas.g:601:4: (lv_texts_4_0= ruleFloatingText )
            	    {
            	    // InternalCanvas.g:601:4: (lv_texts_4_0= ruleFloatingText )
            	    // InternalCanvas.g:602:5: lv_texts_4_0= ruleFloatingText
            	    {

            	    					newCompositeNode(grammarAccess.getFloatingTextsAccess().getTextsFloatingTextParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_texts_4_0=ruleFloatingText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFloatingTextsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"texts",
            	    						lv_texts_4_0,
            	    						"org.xtuml.canvas.language.Canvas.FloatingText");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleFloatingTexts"


    // $ANTLR start "entryRuleFloatingText"
    // InternalCanvas.g:623:1: entryRuleFloatingText returns [EObject current=null] : iv_ruleFloatingText= ruleFloatingText EOF ;
    public final EObject entryRuleFloatingText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatingText = null;


        try {
            // InternalCanvas.g:623:53: (iv_ruleFloatingText= ruleFloatingText EOF )
            // InternalCanvas.g:624:2: iv_ruleFloatingText= ruleFloatingText EOF
            {
             newCompositeNode(grammarAccess.getFloatingTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatingText=ruleFloatingText();

            state._fsp--;

             current =iv_ruleFloatingText; 
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
    // $ANTLR end "entryRuleFloatingText"


    // $ANTLR start "ruleFloatingText"
    // InternalCanvas.g:630:1: ruleFloatingText returns [EObject current=null] : ( () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) ) ) ;
    public final EObject ruleFloatingText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_rect_4_0 = null;

        AntlrDatatypeRuleToken lv_end_5_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:636:2: ( ( () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) ) ) )
            // InternalCanvas.g:637:2: ( () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) ) )
            {
            // InternalCanvas.g:637:2: ( () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) ) )
            // InternalCanvas.g:638:3: () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) )
            {
            // InternalCanvas.g:638:3: ()
            // InternalCanvas.g:639:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatingTextAccess().getFloatingTextAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:645:3: ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCanvas.g:646:4: (otherlv_1= 'text' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:646:4: (otherlv_1= 'text' otherlv_2= ':' )
                    // InternalCanvas.g:647:5: otherlv_1= 'text' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getFloatingTextAccess().getTextKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_14); 

                    					newLeafNode(otherlv_2, grammarAccess.getFloatingTextAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:657:4: otherlv_3= 'text:'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getFloatingTextAccess().getTextKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:662:3: ( (lv_rect_4_0= ruleRectangle ) )
            // InternalCanvas.g:663:4: (lv_rect_4_0= ruleRectangle )
            {
            // InternalCanvas.g:663:4: (lv_rect_4_0= ruleRectangle )
            // InternalCanvas.g:664:5: lv_rect_4_0= ruleRectangle
            {

            					newCompositeNode(grammarAccess.getFloatingTextAccess().getRectRectangleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_rect_4_0=ruleRectangle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatingTextRule());
            					}
            					set(
            						current,
            						"rect",
            						lv_rect_4_0,
            						"org.xtuml.canvas.language.Canvas.Rectangle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:681:3: ( (lv_end_5_0= ruleEnumEnd ) )
            // InternalCanvas.g:682:4: (lv_end_5_0= ruleEnumEnd )
            {
            // InternalCanvas.g:682:4: (lv_end_5_0= ruleEnumEnd )
            // InternalCanvas.g:683:5: lv_end_5_0= ruleEnumEnd
            {

            					newCompositeNode(grammarAccess.getFloatingTextAccess().getEndEnumEndParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_5_0=ruleEnumEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatingTextRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_5_0,
            						"org.xtuml.canvas.language.Canvas.EnumEnd");
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
    // $ANTLR end "ruleFloatingText"


    // $ANTLR start "entryRuleEnumEnd"
    // InternalCanvas.g:704:1: entryRuleEnumEnd returns [String current=null] : iv_ruleEnumEnd= ruleEnumEnd EOF ;
    public final String entryRuleEnumEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumEnd = null;


        try {
            // InternalCanvas.g:704:47: (iv_ruleEnumEnd= ruleEnumEnd EOF )
            // InternalCanvas.g:705:2: iv_ruleEnumEnd= ruleEnumEnd EOF
            {
             newCompositeNode(grammarAccess.getEnumEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumEnd=ruleEnumEnd();

            state._fsp--;

             current =iv_ruleEnumEnd.getText(); 
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
    // $ANTLR end "entryRuleEnumEnd"


    // $ANTLR start "ruleEnumEnd"
    // InternalCanvas.g:711:1: ruleEnumEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'start' | kw= 'end' | kw= 'middle' | kw= 'end_fixed' | kw= 'start_fixed' | kw= 'none' | kw= 'floating' | kw= 'additional' ) ;
    public final AntlrDatatypeRuleToken ruleEnumEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCanvas.g:717:2: ( (kw= 'start' | kw= 'end' | kw= 'middle' | kw= 'end_fixed' | kw= 'start_fixed' | kw= 'none' | kw= 'floating' | kw= 'additional' ) )
            // InternalCanvas.g:718:2: (kw= 'start' | kw= 'end' | kw= 'middle' | kw= 'end_fixed' | kw= 'start_fixed' | kw= 'none' | kw= 'floating' | kw= 'additional' )
            {
            // InternalCanvas.g:718:2: (kw= 'start' | kw= 'end' | kw= 'middle' | kw= 'end_fixed' | kw= 'start_fixed' | kw= 'none' | kw= 'floating' | kw= 'additional' )
            int alt17=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                alt17=4;
                }
                break;
            case 32:
                {
                alt17=5;
                }
                break;
            case 33:
                {
                alt17=6;
                }
                break;
            case 34:
                {
                alt17=7;
                }
                break;
            case 35:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalCanvas.g:719:3: kw= 'start'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEnumEndAccess().getStartKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCanvas.g:725:3: kw= 'end'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEnumEndAccess().getEndKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCanvas.g:731:3: kw= 'middle'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEnumEndAccess().getMiddleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCanvas.g:737:3: kw= 'end_fixed'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEnumEndAccess().getEnd_fixedKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCanvas.g:743:3: kw= 'start_fixed'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEnumEndAccess().getStart_fixedKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalCanvas.g:749:3: kw= 'none'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEnumEndAccess().getNoneKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalCanvas.g:755:3: kw= 'floating'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEnumEndAccess().getFloatingKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalCanvas.g:761:3: kw= 'additional'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEnumEndAccess().getAdditionalKeyword_7());
                    		

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
    // $ANTLR end "ruleEnumEnd"


    // $ANTLR start "entryRuleShapeProps"
    // InternalCanvas.g:770:1: entryRuleShapeProps returns [EObject current=null] : iv_ruleShapeProps= ruleShapeProps EOF ;
    public final EObject entryRuleShapeProps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeProps = null;


        try {
            // InternalCanvas.g:770:51: (iv_ruleShapeProps= ruleShapeProps EOF )
            // InternalCanvas.g:771:2: iv_ruleShapeProps= ruleShapeProps EOF
            {
             newCompositeNode(grammarAccess.getShapePropsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeProps=ruleShapeProps();

            state._fsp--;

             current =iv_ruleShapeProps; 
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
    // $ANTLR end "entryRuleShapeProps"


    // $ANTLR start "ruleShapeProps"
    // InternalCanvas.g:777:1: ruleShapeProps returns [EObject current=null] : ( () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_container_4_0= ruleContainer ) )? ( (lv_color_5_0= ruleColor ) )? ) ;
    public final EObject ruleShapeProps() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_container_4_0 = null;

        EObject lv_color_5_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:783:2: ( ( () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_container_4_0= ruleContainer ) )? ( (lv_color_5_0= ruleColor ) )? ) )
            // InternalCanvas.g:784:2: ( () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_container_4_0= ruleContainer ) )? ( (lv_color_5_0= ruleColor ) )? )
            {
            // InternalCanvas.g:784:2: ( () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_container_4_0= ruleContainer ) )? ( (lv_color_5_0= ruleColor ) )? )
            // InternalCanvas.g:785:3: () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_container_4_0= ruleContainer ) )? ( (lv_color_5_0= ruleColor ) )?
            {
            // InternalCanvas.g:785:3: ()
            // InternalCanvas.g:786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapePropsAccess().getShapePropsAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:792:3: ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            else if ( (LA18_0==16) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCanvas.g:793:4: (otherlv_1= 'properties' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:793:4: (otherlv_1= 'properties' otherlv_2= ':' )
                    // InternalCanvas.g:794:5: otherlv_1= 'properties' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getShapePropsAccess().getPropertiesKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_19); 

                    					newLeafNode(otherlv_2, grammarAccess.getShapePropsAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:804:4: otherlv_3= 'properties:'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getShapePropsAccess().getPropertiesKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:809:3: ( (lv_container_4_0= ruleContainer ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCanvas.g:810:4: (lv_container_4_0= ruleContainer )
                    {
                    // InternalCanvas.g:810:4: (lv_container_4_0= ruleContainer )
                    // InternalCanvas.g:811:5: lv_container_4_0= ruleContainer
                    {

                    					newCompositeNode(grammarAccess.getShapePropsAccess().getContainerContainerParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_container_4_0=ruleContainer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapePropsRule());
                    					}
                    					set(
                    						current,
                    						"container",
                    						lv_container_4_0,
                    						"org.xtuml.canvas.language.Canvas.Container");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:828:3: ( (lv_color_5_0= ruleColor ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCanvas.g:829:4: (lv_color_5_0= ruleColor )
                    {
                    // InternalCanvas.g:829:4: (lv_color_5_0= ruleColor )
                    // InternalCanvas.g:830:5: lv_color_5_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getShapePropsAccess().getColorColorParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_color_5_0=ruleColor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapePropsRule());
                    					}
                    					set(
                    						current,
                    						"color",
                    						lv_color_5_0,
                    						"org.xtuml.canvas.language.Canvas.Color");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleShapeProps"


    // $ANTLR start "entryRuleContainer"
    // InternalCanvas.g:851:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalCanvas.g:851:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalCanvas.g:852:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalCanvas.g:858:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'container' (otherlv_2= 'true' | otherlv_3= 'false' ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCanvas.g:864:2: ( ( () otherlv_1= 'container' (otherlv_2= 'true' | otherlv_3= 'false' ) ) )
            // InternalCanvas.g:865:2: ( () otherlv_1= 'container' (otherlv_2= 'true' | otherlv_3= 'false' ) )
            {
            // InternalCanvas.g:865:2: ( () otherlv_1= 'container' (otherlv_2= 'true' | otherlv_3= 'false' ) )
            // InternalCanvas.g:866:3: () otherlv_1= 'container' (otherlv_2= 'true' | otherlv_3= 'false' )
            {
            // InternalCanvas.g:866:3: ()
            // InternalCanvas.g:867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getShapeContainerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalCanvas.g:877:3: (otherlv_2= 'true' | otherlv_3= 'false' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalCanvas.g:878:4: otherlv_2= 'true'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getTrueKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCanvas.g:883:4: otherlv_3= 'false'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getFalseKeyword_2_1());
                    			

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleColor"
    // InternalCanvas.g:892:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalCanvas.g:892:46: (iv_ruleColor= ruleColor EOF )
            // InternalCanvas.g:893:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalCanvas.g:899:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_r_1_0=null;
        Token lv_g_2_0=null;
        Token lv_b_3_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:905:2: ( (otherlv_0= 'color' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) ) )
            // InternalCanvas.g:906:2: (otherlv_0= 'color' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:906:2: (otherlv_0= 'color' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) ) )
            // InternalCanvas.g:907:3: otherlv_0= 'color' ( (lv_r_1_0= RULE_INT ) ) ( (lv_g_2_0= RULE_INT ) ) ( (lv_b_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            // InternalCanvas.g:911:3: ( (lv_r_1_0= RULE_INT ) )
            // InternalCanvas.g:912:4: (lv_r_1_0= RULE_INT )
            {
            // InternalCanvas.g:912:4: (lv_r_1_0= RULE_INT )
            // InternalCanvas.g:913:5: lv_r_1_0= RULE_INT
            {
            lv_r_1_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_r_1_0, grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"r",
            						lv_r_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCanvas.g:929:3: ( (lv_g_2_0= RULE_INT ) )
            // InternalCanvas.g:930:4: (lv_g_2_0= RULE_INT )
            {
            // InternalCanvas.g:930:4: (lv_g_2_0= RULE_INT )
            // InternalCanvas.g:931:5: lv_g_2_0= RULE_INT
            {
            lv_g_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_g_2_0, grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"g",
            						lv_g_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCanvas.g:947:3: ( (lv_b_3_0= RULE_INT ) )
            // InternalCanvas.g:948:4: (lv_b_3_0= RULE_INT )
            {
            // InternalCanvas.g:948:4: (lv_b_3_0= RULE_INT )
            // InternalCanvas.g:949:5: lv_b_3_0= RULE_INT
            {
            lv_b_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_b_3_0, grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"b",
            						lv_b_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleConnectors"
    // InternalCanvas.g:969:1: entryRuleConnectors returns [EObject current=null] : iv_ruleConnectors= ruleConnectors EOF ;
    public final EObject entryRuleConnectors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectors = null;


        try {
            // InternalCanvas.g:969:51: (iv_ruleConnectors= ruleConnectors EOF )
            // InternalCanvas.g:970:2: iv_ruleConnectors= ruleConnectors EOF
            {
             newCompositeNode(grammarAccess.getConnectorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectors=ruleConnectors();

            state._fsp--;

             current =iv_ruleConnectors; 
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
    // $ANTLR end "entryRuleConnectors"


    // $ANTLR start "ruleConnectors"
    // InternalCanvas.g:976:1: ruleConnectors returns [EObject current=null] : ( () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )* ) ;
    public final EObject ruleConnectors() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_connectors_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:982:2: ( ( () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )* ) )
            // InternalCanvas.g:983:2: ( () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )* )
            {
            // InternalCanvas.g:983:2: ( () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )* )
            // InternalCanvas.g:984:3: () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )*
            {
            // InternalCanvas.g:984:3: ()
            // InternalCanvas.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectorsAccess().getConnectorsAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:991:3: ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            else if ( (LA22_0==41) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCanvas.g:992:4: (otherlv_1= 'connectors' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:992:4: (otherlv_1= 'connectors' otherlv_2= ':' )
                    // InternalCanvas.g:993:5: otherlv_1= 'connectors' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_22); 

                    					newLeafNode(otherlv_2, grammarAccess.getConnectorsAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1003:4: otherlv_3= 'connectors:'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1008:3: ( (lv_connectors_4_0= ruleConnector ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=42 && LA23_0<=43)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCanvas.g:1009:4: (lv_connectors_4_0= ruleConnector )
            	    {
            	    // InternalCanvas.g:1009:4: (lv_connectors_4_0= ruleConnector )
            	    // InternalCanvas.g:1010:5: lv_connectors_4_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getConnectorsAccess().getConnectorsConnectorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_connectors_4_0=ruleConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConnectorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_4_0,
            	    						"org.xtuml.canvas.language.Canvas.Connector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleConnectors"


    // $ANTLR start "entryRuleConnector"
    // InternalCanvas.g:1031:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCanvas.g:1031:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCanvas.g:1032:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalCanvas.g:1038:1: ruleConnector returns [EObject current=null] : ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_props_4_0= ruleConnectorProps ) )? ( (lv_polyline_5_0= rulePolyline ) )? ( (lv_anchors_6_0= ruleAnchors ) )? ( (lv_texts_7_0= ruleFloatingTexts ) ) ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) ) ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_represents_11_0=null;
        EObject lv_props_4_0 = null;

        EObject lv_polyline_5_0 = null;

        EObject lv_anchors_6_0 = null;

        EObject lv_texts_7_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1044:2: ( ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_props_4_0= ruleConnectorProps ) )? ( (lv_polyline_5_0= rulePolyline ) )? ( (lv_anchors_6_0= ruleAnchors ) )? ( (lv_texts_7_0= ruleFloatingTexts ) ) ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) ) ) )
            // InternalCanvas.g:1045:2: ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_props_4_0= ruleConnectorProps ) )? ( (lv_polyline_5_0= rulePolyline ) )? ( (lv_anchors_6_0= ruleAnchors ) )? ( (lv_texts_7_0= ruleFloatingTexts ) ) ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) ) )
            {
            // InternalCanvas.g:1045:2: ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_props_4_0= ruleConnectorProps ) )? ( (lv_polyline_5_0= rulePolyline ) )? ( (lv_anchors_6_0= ruleAnchors ) )? ( (lv_texts_7_0= ruleFloatingTexts ) ) ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) ) )
            // InternalCanvas.g:1046:3: ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_props_4_0= ruleConnectorProps ) )? ( (lv_polyline_5_0= rulePolyline ) )? ( (lv_anchors_6_0= ruleAnchors ) )? ( (lv_texts_7_0= ruleFloatingTexts ) ) ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' ) ( (lv_represents_11_0= RULE_STRING ) )
            {
            // InternalCanvas.g:1046:3: ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            else if ( (LA24_0==43) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCanvas.g:1047:4: (otherlv_0= 'connector' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1047:4: (otherlv_0= 'connector' otherlv_1= ':' )
                    // InternalCanvas.g:1048:5: otherlv_0= 'connector' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_13); 

                    					newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1058:4: otherlv_2= 'connector:'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getConnectorKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1063:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCanvas.g:1064:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCanvas.g:1064:4: (lv_name_3_0= RULE_ID )
            // InternalCanvas.g:1065:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_3_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCanvas.g:1081:3: ( (lv_props_4_0= ruleConnectorProps ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=15 && LA25_0<=16)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCanvas.g:1082:4: (lv_props_4_0= ruleConnectorProps )
                    {
                    // InternalCanvas.g:1082:4: (lv_props_4_0= ruleConnectorProps )
                    // InternalCanvas.g:1083:5: lv_props_4_0= ruleConnectorProps
                    {

                    					newCompositeNode(grammarAccess.getConnectorAccess().getPropsConnectorPropsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_props_4_0=ruleConnectorProps();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorRule());
                    					}
                    					set(
                    						current,
                    						"props",
                    						lv_props_4_0,
                    						"org.xtuml.canvas.language.Canvas.ConnectorProps");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:1100:3: ( (lv_polyline_5_0= rulePolyline ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=51 && LA26_0<=52)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCanvas.g:1101:4: (lv_polyline_5_0= rulePolyline )
                    {
                    // InternalCanvas.g:1101:4: (lv_polyline_5_0= rulePolyline )
                    // InternalCanvas.g:1102:5: lv_polyline_5_0= rulePolyline
                    {

                    					newCompositeNode(grammarAccess.getConnectorAccess().getPolylinePolylineParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_polyline_5_0=rulePolyline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorRule());
                    					}
                    					set(
                    						current,
                    						"polyline",
                    						lv_polyline_5_0,
                    						"org.xtuml.canvas.language.Canvas.Polyline");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:1119:3: ( (lv_anchors_6_0= ruleAnchors ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=44 && LA27_0<=45)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCanvas.g:1120:4: (lv_anchors_6_0= ruleAnchors )
                    {
                    // InternalCanvas.g:1120:4: (lv_anchors_6_0= ruleAnchors )
                    // InternalCanvas.g:1121:5: lv_anchors_6_0= ruleAnchors
                    {

                    					newCompositeNode(grammarAccess.getConnectorAccess().getAnchorsAnchorsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_anchors_6_0=ruleAnchors();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorRule());
                    					}
                    					set(
                    						current,
                    						"anchors",
                    						lv_anchors_6_0,
                    						"org.xtuml.canvas.language.Canvas.Anchors");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:1138:3: ( (lv_texts_7_0= ruleFloatingTexts ) )
            // InternalCanvas.g:1139:4: (lv_texts_7_0= ruleFloatingTexts )
            {
            // InternalCanvas.g:1139:4: (lv_texts_7_0= ruleFloatingTexts )
            // InternalCanvas.g:1140:5: lv_texts_7_0= ruleFloatingTexts
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getTextsFloatingTextsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_texts_7_0=ruleFloatingTexts();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"texts",
            						lv_texts_7_0,
            						"org.xtuml.canvas.language.Canvas.FloatingTexts");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1157:3: ( (otherlv_8= 'render' otherlv_9= ':' ) | otherlv_10= 'render:' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==11) ) {
                alt28=1;
            }
            else if ( (LA28_0==13) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalCanvas.g:1158:4: (otherlv_8= 'render' otherlv_9= ':' )
                    {
                    // InternalCanvas.g:1158:4: (otherlv_8= 'render' otherlv_9= ':' )
                    // InternalCanvas.g:1159:5: otherlv_8= 'render' otherlv_9= ':'
                    {
                    otherlv_8=(Token)match(input,11,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getRenderKeyword_6_0_0());
                    				
                    otherlv_9=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(otherlv_9, grammarAccess.getConnectorAccess().getColonKeyword_6_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1169:4: otherlv_10= 'render:'
                    {
                    otherlv_10=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getConnectorAccess().getRenderKeyword_6_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1174:3: ( (lv_represents_11_0= RULE_STRING ) )
            // InternalCanvas.g:1175:4: (lv_represents_11_0= RULE_STRING )
            {
            // InternalCanvas.g:1175:4: (lv_represents_11_0= RULE_STRING )
            // InternalCanvas.g:1176:5: lv_represents_11_0= RULE_STRING
            {
            lv_represents_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_represents_11_0, grammarAccess.getConnectorAccess().getRepresentsSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"represents",
            						lv_represents_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleAnchors"
    // InternalCanvas.g:1196:1: entryRuleAnchors returns [EObject current=null] : iv_ruleAnchors= ruleAnchors EOF ;
    public final EObject entryRuleAnchors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchors = null;


        try {
            // InternalCanvas.g:1196:48: (iv_ruleAnchors= ruleAnchors EOF )
            // InternalCanvas.g:1197:2: iv_ruleAnchors= ruleAnchors EOF
            {
             newCompositeNode(grammarAccess.getAnchorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnchors=ruleAnchors();

            state._fsp--;

             current =iv_ruleAnchors; 
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
    // $ANTLR end "entryRuleAnchors"


    // $ANTLR start "ruleAnchors"
    // InternalCanvas.g:1203:1: ruleAnchors returns [EObject current=null] : ( ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) ) ) ;
    public final EObject ruleAnchors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_startAnchor_3_0 = null;

        EObject lv_endAnchor_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1209:2: ( ( ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) ) ) )
            // InternalCanvas.g:1210:2: ( ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) ) )
            {
            // InternalCanvas.g:1210:2: ( ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) ) )
            // InternalCanvas.g:1211:3: ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) )
            {
            // InternalCanvas.g:1211:3: ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            else if ( (LA29_0==45) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCanvas.g:1212:4: (otherlv_0= 'anchors' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1212:4: (otherlv_0= 'anchors' otherlv_1= ':' )
                    // InternalCanvas.g:1213:5: otherlv_0= 'anchors' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_24); 

                    					newLeafNode(otherlv_1, grammarAccess.getAnchorsAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1223:4: otherlv_2= 'anchors:'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1228:3: ( (lv_startAnchor_3_0= ruleStartAnchor ) )
            // InternalCanvas.g:1229:4: (lv_startAnchor_3_0= ruleStartAnchor )
            {
            // InternalCanvas.g:1229:4: (lv_startAnchor_3_0= ruleStartAnchor )
            // InternalCanvas.g:1230:5: lv_startAnchor_3_0= ruleStartAnchor
            {

            					newCompositeNode(grammarAccess.getAnchorsAccess().getStartAnchorStartAnchorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_startAnchor_3_0=ruleStartAnchor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnchorsRule());
            					}
            					set(
            						current,
            						"startAnchor",
            						lv_startAnchor_3_0,
            						"org.xtuml.canvas.language.Canvas.StartAnchor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1247:3: ( (lv_endAnchor_4_0= ruleEndAnchor ) )
            // InternalCanvas.g:1248:4: (lv_endAnchor_4_0= ruleEndAnchor )
            {
            // InternalCanvas.g:1248:4: (lv_endAnchor_4_0= ruleEndAnchor )
            // InternalCanvas.g:1249:5: lv_endAnchor_4_0= ruleEndAnchor
            {

            					newCompositeNode(grammarAccess.getAnchorsAccess().getEndAnchorEndAnchorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_endAnchor_4_0=ruleEndAnchor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnchorsRule());
            					}
            					set(
            						current,
            						"endAnchor",
            						lv_endAnchor_4_0,
            						"org.xtuml.canvas.language.Canvas.EndAnchor");
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
    // $ANTLR end "ruleAnchors"


    // $ANTLR start "entryRuleStartAnchor"
    // InternalCanvas.g:1270:1: entryRuleStartAnchor returns [EObject current=null] : iv_ruleStartAnchor= ruleStartAnchor EOF ;
    public final EObject entryRuleStartAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartAnchor = null;


        try {
            // InternalCanvas.g:1270:52: (iv_ruleStartAnchor= ruleStartAnchor EOF )
            // InternalCanvas.g:1271:2: iv_ruleStartAnchor= ruleStartAnchor EOF
            {
             newCompositeNode(grammarAccess.getStartAnchorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartAnchor=ruleStartAnchor();

            state._fsp--;

             current =iv_ruleStartAnchor; 
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
    // $ANTLR end "entryRuleStartAnchor"


    // $ANTLR start "ruleStartAnchor"
    // InternalCanvas.g:1277:1: ruleStartAnchor returns [EObject current=null] : ( ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )? ) ;
    public final EObject ruleStartAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_point_3_0 = null;

        EObject lv_anchor_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1283:2: ( ( ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )? ) )
            // InternalCanvas.g:1284:2: ( ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )? )
            {
            // InternalCanvas.g:1284:2: ( ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )? )
            // InternalCanvas.g:1285:3: ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )?
            {
            // InternalCanvas.g:1285:3: ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            else if ( (LA30_0==46) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCanvas.g:1286:4: (otherlv_0= 'start' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1286:4: (otherlv_0= 'start' otherlv_1= ':' )
                    // InternalCanvas.g:1287:5: otherlv_0= 'start' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getStartAnchorAccess().getStartKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getStartAnchorAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1297:4: otherlv_2= 'start:'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getStartAnchorAccess().getStartKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1302:3: ( (lv_point_3_0= rulePoint ) )
            // InternalCanvas.g:1303:4: (lv_point_3_0= rulePoint )
            {
            // InternalCanvas.g:1303:4: (lv_point_3_0= rulePoint )
            // InternalCanvas.g:1304:5: lv_point_3_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getStartAnchorAccess().getPointPointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_point_3_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartAnchorRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_3_0,
            						"org.xtuml.canvas.language.Canvas.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1321:3: ( (lv_anchor_4_0= ruleAnchor ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=47 && LA31_0<=50)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCanvas.g:1322:4: (lv_anchor_4_0= ruleAnchor )
                    {
                    // InternalCanvas.g:1322:4: (lv_anchor_4_0= ruleAnchor )
                    // InternalCanvas.g:1323:5: lv_anchor_4_0= ruleAnchor
                    {

                    					newCompositeNode(grammarAccess.getStartAnchorAccess().getAnchorAnchorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_anchor_4_0=ruleAnchor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStartAnchorRule());
                    					}
                    					set(
                    						current,
                    						"anchor",
                    						lv_anchor_4_0,
                    						"org.xtuml.canvas.language.Canvas.Anchor");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleStartAnchor"


    // $ANTLR start "entryRuleEndAnchor"
    // InternalCanvas.g:1344:1: entryRuleEndAnchor returns [EObject current=null] : iv_ruleEndAnchor= ruleEndAnchor EOF ;
    public final EObject entryRuleEndAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndAnchor = null;


        try {
            // InternalCanvas.g:1344:50: (iv_ruleEndAnchor= ruleEndAnchor EOF )
            // InternalCanvas.g:1345:2: iv_ruleEndAnchor= ruleEndAnchor EOF
            {
             newCompositeNode(grammarAccess.getEndAnchorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndAnchor=ruleEndAnchor();

            state._fsp--;

             current =iv_ruleEndAnchor; 
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
    // $ANTLR end "entryRuleEndAnchor"


    // $ANTLR start "ruleEndAnchor"
    // InternalCanvas.g:1351:1: ruleEndAnchor returns [EObject current=null] : ( ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )? ) ;
    public final EObject ruleEndAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_point_3_0 = null;

        EObject lv_anchor_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1357:2: ( ( ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )? ) )
            // InternalCanvas.g:1358:2: ( ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )? )
            {
            // InternalCanvas.g:1358:2: ( ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )? )
            // InternalCanvas.g:1359:3: ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end' ) ( (lv_point_3_0= rulePoint ) ) ( (lv_anchor_4_0= ruleAnchor ) )?
            {
            // InternalCanvas.g:1359:3: ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==56) ) {
                    alt32=2;
                }
                else if ( (LA32_1==12) ) {
                    alt32=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCanvas.g:1360:4: (otherlv_0= 'end' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1360:4: (otherlv_0= 'end' otherlv_1= ':' )
                    // InternalCanvas.g:1361:5: otherlv_0= 'end' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getEndAnchorAccess().getEndKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getEndAnchorAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1371:4: otherlv_2= 'end'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getEndAnchorAccess().getEndKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1376:3: ( (lv_point_3_0= rulePoint ) )
            // InternalCanvas.g:1377:4: (lv_point_3_0= rulePoint )
            {
            // InternalCanvas.g:1377:4: (lv_point_3_0= rulePoint )
            // InternalCanvas.g:1378:5: lv_point_3_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getEndAnchorAccess().getPointPointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_point_3_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndAnchorRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_3_0,
            						"org.xtuml.canvas.language.Canvas.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1395:3: ( (lv_anchor_4_0= ruleAnchor ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=47 && LA33_0<=50)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCanvas.g:1396:4: (lv_anchor_4_0= ruleAnchor )
                    {
                    // InternalCanvas.g:1396:4: (lv_anchor_4_0= ruleAnchor )
                    // InternalCanvas.g:1397:5: lv_anchor_4_0= ruleAnchor
                    {

                    					newCompositeNode(grammarAccess.getEndAnchorAccess().getAnchorAnchorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_anchor_4_0=ruleAnchor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEndAnchorRule());
                    					}
                    					set(
                    						current,
                    						"anchor",
                    						lv_anchor_4_0,
                    						"org.xtuml.canvas.language.Canvas.Anchor");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleEndAnchor"


    // $ANTLR start "entryRuleAnchor"
    // InternalCanvas.g:1418:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // InternalCanvas.g:1418:47: (iv_ruleAnchor= ruleAnchor EOF )
            // InternalCanvas.g:1419:2: iv_ruleAnchor= ruleAnchor EOF
            {
             newCompositeNode(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnchor=ruleAnchor();

            state._fsp--;

             current =iv_ruleAnchor; 
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
    // $ANTLR end "entryRuleAnchor"


    // $ANTLR start "ruleAnchor"
    // InternalCanvas.g:1425:1: ruleAnchor returns [EObject current=null] : (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        EObject this_ShapeAnchorElement_0 = null;

        EObject this_ConnectorAnchorElement_1 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1431:2: ( (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement ) )
            // InternalCanvas.g:1432:2: (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement )
            {
            // InternalCanvas.g:1432:2: (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=47 && LA34_0<=48)) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=49 && LA34_0<=50)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalCanvas.g:1433:3: this_ShapeAnchorElement_0= ruleShapeAnchorElement
                    {

                    			newCompositeNode(grammarAccess.getAnchorAccess().getShapeAnchorElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShapeAnchorElement_0=ruleShapeAnchorElement();

                    state._fsp--;


                    			current = this_ShapeAnchorElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1442:3: this_ConnectorAnchorElement_1= ruleConnectorAnchorElement
                    {

                    			newCompositeNode(grammarAccess.getAnchorAccess().getConnectorAnchorElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConnectorAnchorElement_1=ruleConnectorAnchorElement();

                    state._fsp--;


                    			current = this_ConnectorAnchorElement_1;
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
    // $ANTLR end "ruleAnchor"


    // $ANTLR start "entryRuleShapeAnchorElement"
    // InternalCanvas.g:1454:1: entryRuleShapeAnchorElement returns [EObject current=null] : iv_ruleShapeAnchorElement= ruleShapeAnchorElement EOF ;
    public final EObject entryRuleShapeAnchorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeAnchorElement = null;


        try {
            // InternalCanvas.g:1454:59: (iv_ruleShapeAnchorElement= ruleShapeAnchorElement EOF )
            // InternalCanvas.g:1455:2: iv_ruleShapeAnchorElement= ruleShapeAnchorElement EOF
            {
             newCompositeNode(grammarAccess.getShapeAnchorElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeAnchorElement=ruleShapeAnchorElement();

            state._fsp--;

             current =iv_ruleShapeAnchorElement; 
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
    // $ANTLR end "entryRuleShapeAnchorElement"


    // $ANTLR start "ruleShapeAnchorElement"
    // InternalCanvas.g:1461:1: ruleShapeAnchorElement returns [EObject current=null] : ( ( (otherlv_0= 'shapeAnchor' otherlv_1= ':' ) | otherlv_2= 'shapeAnchor:' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleShapeAnchorElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCanvas.g:1467:2: ( ( ( (otherlv_0= 'shapeAnchor' otherlv_1= ':' ) | otherlv_2= 'shapeAnchor:' ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalCanvas.g:1468:2: ( ( (otherlv_0= 'shapeAnchor' otherlv_1= ':' ) | otherlv_2= 'shapeAnchor:' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalCanvas.g:1468:2: ( ( (otherlv_0= 'shapeAnchor' otherlv_1= ':' ) | otherlv_2= 'shapeAnchor:' ) ( (otherlv_3= RULE_ID ) ) )
            // InternalCanvas.g:1469:3: ( (otherlv_0= 'shapeAnchor' otherlv_1= ':' ) | otherlv_2= 'shapeAnchor:' ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalCanvas.g:1469:3: ( (otherlv_0= 'shapeAnchor' otherlv_1= ':' ) | otherlv_2= 'shapeAnchor:' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            else if ( (LA35_0==48) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalCanvas.g:1470:4: (otherlv_0= 'shapeAnchor' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1470:4: (otherlv_0= 'shapeAnchor' otherlv_1= ':' )
                    // InternalCanvas.g:1471:5: otherlv_0= 'shapeAnchor' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getShapeAnchorElementAccess().getShapeAnchorKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_13); 

                    					newLeafNode(otherlv_1, grammarAccess.getShapeAnchorElementAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1481:4: otherlv_2= 'shapeAnchor:'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getShapeAnchorElementAccess().getShapeAnchorKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1486:3: ( (otherlv_3= RULE_ID ) )
            // InternalCanvas.g:1487:4: (otherlv_3= RULE_ID )
            {
            // InternalCanvas.g:1487:4: (otherlv_3= RULE_ID )
            // InternalCanvas.g:1488:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeAnchorElementRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getShapeAnchorElementAccess().getElementShapeCrossReference_1_0());
            				

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
    // $ANTLR end "ruleShapeAnchorElement"


    // $ANTLR start "entryRuleConnectorAnchorElement"
    // InternalCanvas.g:1503:1: entryRuleConnectorAnchorElement returns [EObject current=null] : iv_ruleConnectorAnchorElement= ruleConnectorAnchorElement EOF ;
    public final EObject entryRuleConnectorAnchorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorAnchorElement = null;


        try {
            // InternalCanvas.g:1503:63: (iv_ruleConnectorAnchorElement= ruleConnectorAnchorElement EOF )
            // InternalCanvas.g:1504:2: iv_ruleConnectorAnchorElement= ruleConnectorAnchorElement EOF
            {
             newCompositeNode(grammarAccess.getConnectorAnchorElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorAnchorElement=ruleConnectorAnchorElement();

            state._fsp--;

             current =iv_ruleConnectorAnchorElement; 
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
    // $ANTLR end "entryRuleConnectorAnchorElement"


    // $ANTLR start "ruleConnectorAnchorElement"
    // InternalCanvas.g:1510:1: ruleConnectorAnchorElement returns [EObject current=null] : ( ( (otherlv_0= 'segmentAnchor' otherlv_1= ':' ) | otherlv_2= 'segmentAnchor:' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleConnectorAnchorElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCanvas.g:1516:2: ( ( ( (otherlv_0= 'segmentAnchor' otherlv_1= ':' ) | otherlv_2= 'segmentAnchor:' ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalCanvas.g:1517:2: ( ( (otherlv_0= 'segmentAnchor' otherlv_1= ':' ) | otherlv_2= 'segmentAnchor:' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalCanvas.g:1517:2: ( ( (otherlv_0= 'segmentAnchor' otherlv_1= ':' ) | otherlv_2= 'segmentAnchor:' ) ( (otherlv_3= RULE_ID ) ) )
            // InternalCanvas.g:1518:3: ( (otherlv_0= 'segmentAnchor' otherlv_1= ':' ) | otherlv_2= 'segmentAnchor:' ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalCanvas.g:1518:3: ( (otherlv_0= 'segmentAnchor' otherlv_1= ':' ) | otherlv_2= 'segmentAnchor:' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            else if ( (LA36_0==50) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalCanvas.g:1519:4: (otherlv_0= 'segmentAnchor' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1519:4: (otherlv_0= 'segmentAnchor' otherlv_1= ':' )
                    // InternalCanvas.g:1520:5: otherlv_0= 'segmentAnchor' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getConnectorAnchorElementAccess().getSegmentAnchorKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_13); 

                    					newLeafNode(otherlv_1, grammarAccess.getConnectorAnchorElementAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1530:4: otherlv_2= 'segmentAnchor:'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getConnectorAnchorElementAccess().getSegmentAnchorKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1535:3: ( (otherlv_3= RULE_ID ) )
            // InternalCanvas.g:1536:4: (otherlv_3= RULE_ID )
            {
            // InternalCanvas.g:1536:4: (otherlv_3= RULE_ID )
            // InternalCanvas.g:1537:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorAnchorElementRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getConnectorAnchorElementAccess().getElementConnectorCrossReference_1_0());
            				

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
    // $ANTLR end "ruleConnectorAnchorElement"


    // $ANTLR start "entryRuleConnectorProps"
    // InternalCanvas.g:1552:1: entryRuleConnectorProps returns [EObject current=null] : iv_ruleConnectorProps= ruleConnectorProps EOF ;
    public final EObject entryRuleConnectorProps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorProps = null;


        try {
            // InternalCanvas.g:1552:55: (iv_ruleConnectorProps= ruleConnectorProps EOF )
            // InternalCanvas.g:1553:2: iv_ruleConnectorProps= ruleConnectorProps EOF
            {
             newCompositeNode(grammarAccess.getConnectorPropsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorProps=ruleConnectorProps();

            state._fsp--;

             current =iv_ruleConnectorProps; 
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
    // $ANTLR end "entryRuleConnectorProps"


    // $ANTLR start "ruleConnectorProps"
    // InternalCanvas.g:1559:1: ruleConnectorProps returns [EObject current=null] : ( () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_color_4_0= ruleColor ) )? ) ;
    public final EObject ruleConnectorProps() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_color_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1565:2: ( ( () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_color_4_0= ruleColor ) )? ) )
            // InternalCanvas.g:1566:2: ( () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_color_4_0= ruleColor ) )? )
            {
            // InternalCanvas.g:1566:2: ( () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_color_4_0= ruleColor ) )? )
            // InternalCanvas.g:1567:3: () ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' ) ( (lv_color_4_0= ruleColor ) )?
            {
            // InternalCanvas.g:1567:3: ()
            // InternalCanvas.g:1568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectorPropsAccess().getConnectorPropsAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:1574:3: ( (otherlv_1= 'properties' otherlv_2= ':' ) | otherlv_3= 'properties:' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                alt37=1;
            }
            else if ( (LA37_0==16) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalCanvas.g:1575:4: (otherlv_1= 'properties' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:1575:4: (otherlv_1= 'properties' otherlv_2= ':' )
                    // InternalCanvas.g:1576:5: otherlv_1= 'properties' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getConnectorPropsAccess().getPropertiesKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_20); 

                    					newLeafNode(otherlv_2, grammarAccess.getConnectorPropsAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1586:4: otherlv_3= 'properties:'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectorPropsAccess().getPropertiesKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1591:3: ( (lv_color_4_0= ruleColor ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCanvas.g:1592:4: (lv_color_4_0= ruleColor )
                    {
                    // InternalCanvas.g:1592:4: (lv_color_4_0= ruleColor )
                    // InternalCanvas.g:1593:5: lv_color_4_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getConnectorPropsAccess().getColorColorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_color_4_0=ruleColor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorPropsRule());
                    					}
                    					set(
                    						current,
                    						"color",
                    						lv_color_4_0,
                    						"org.xtuml.canvas.language.Canvas.Color");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleConnectorProps"


    // $ANTLR start "entryRulePolyline"
    // InternalCanvas.g:1614:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // InternalCanvas.g:1614:49: (iv_rulePolyline= rulePolyline EOF )
            // InternalCanvas.g:1615:2: iv_rulePolyline= rulePolyline EOF
            {
             newCompositeNode(grammarAccess.getPolylineRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolyline=rulePolyline();

            state._fsp--;

             current =iv_rulePolyline; 
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
    // $ANTLR end "entryRulePolyline"


    // $ANTLR start "rulePolyline"
    // InternalCanvas.g:1621:1: rulePolyline returns [EObject current=null] : ( () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )* ) ;
    public final EObject rulePolyline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_segments_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1627:2: ( ( () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )* ) )
            // InternalCanvas.g:1628:2: ( () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )* )
            {
            // InternalCanvas.g:1628:2: ( () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )* )
            // InternalCanvas.g:1629:3: () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )*
            {
            // InternalCanvas.g:1629:3: ()
            // InternalCanvas.g:1630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPolylineAccess().getPolylineAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:1636:3: ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            else if ( (LA39_0==52) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalCanvas.g:1637:4: (otherlv_1= 'polyline' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:1637:4: (otherlv_1= 'polyline' otherlv_2= ':' )
                    // InternalCanvas.g:1638:5: otherlv_1= 'polyline' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_4); 

                    					newLeafNode(otherlv_1, grammarAccess.getPolylineAccess().getPolylineKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_27); 

                    					newLeafNode(otherlv_2, grammarAccess.getPolylineAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1648:4: otherlv_3= 'polyline:'
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getPolylineAccess().getPolylineKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1653:3: ( (lv_segments_4_0= ruleSegment ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=53 && LA40_0<=54)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCanvas.g:1654:4: (lv_segments_4_0= ruleSegment )
            	    {
            	    // InternalCanvas.g:1654:4: (lv_segments_4_0= ruleSegment )
            	    // InternalCanvas.g:1655:5: lv_segments_4_0= ruleSegment
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getSegmentsSegmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_segments_4_0=ruleSegment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"segments",
            	    						lv_segments_4_0,
            	    						"org.xtuml.canvas.language.Canvas.Segment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "rulePolyline"


    // $ANTLR start "entryRuleSegment"
    // InternalCanvas.g:1676:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // InternalCanvas.g:1676:48: (iv_ruleSegment= ruleSegment EOF )
            // InternalCanvas.g:1677:2: iv_ruleSegment= ruleSegment EOF
            {
             newCompositeNode(grammarAccess.getSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSegment=ruleSegment();

            state._fsp--;

             current =iv_ruleSegment; 
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
    // $ANTLR end "entryRuleSegment"


    // $ANTLR start "ruleSegment"
    // InternalCanvas.g:1683:1: ruleSegment returns [EObject current=null] : ( ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (lv_startPoint_3_0= rulePoint ) ) otherlv_4= ',' ( (lv_endPoint_5_0= rulePoint ) ) ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_startPoint_3_0 = null;

        EObject lv_endPoint_5_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1689:2: ( ( ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (lv_startPoint_3_0= rulePoint ) ) otherlv_4= ',' ( (lv_endPoint_5_0= rulePoint ) ) ) )
            // InternalCanvas.g:1690:2: ( ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (lv_startPoint_3_0= rulePoint ) ) otherlv_4= ',' ( (lv_endPoint_5_0= rulePoint ) ) )
            {
            // InternalCanvas.g:1690:2: ( ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (lv_startPoint_3_0= rulePoint ) ) otherlv_4= ',' ( (lv_endPoint_5_0= rulePoint ) ) )
            // InternalCanvas.g:1691:3: ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (lv_startPoint_3_0= rulePoint ) ) otherlv_4= ',' ( (lv_endPoint_5_0= rulePoint ) )
            {
            // InternalCanvas.g:1691:3: ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            else if ( (LA41_0==54) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalCanvas.g:1692:4: (otherlv_0= 'segment' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1692:4: (otherlv_0= 'segment' otherlv_1= ':' )
                    // InternalCanvas.g:1693:5: otherlv_0= 'segment' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,53,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getSegmentAccess().getSegmentKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getSegmentAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1703:4: otherlv_2= 'segment:'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getSegmentAccess().getSegmentKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1708:3: ( (lv_startPoint_3_0= rulePoint ) )
            // InternalCanvas.g:1709:4: (lv_startPoint_3_0= rulePoint )
            {
            // InternalCanvas.g:1709:4: (lv_startPoint_3_0= rulePoint )
            // InternalCanvas.g:1710:5: lv_startPoint_3_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_startPoint_3_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSegmentRule());
            					}
            					set(
            						current,
            						"startPoint",
            						lv_startPoint_3_0,
            						"org.xtuml.canvas.language.Canvas.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSegmentAccess().getCommaKeyword_2());
            		
            // InternalCanvas.g:1731:3: ( (lv_endPoint_5_0= rulePoint ) )
            // InternalCanvas.g:1732:4: (lv_endPoint_5_0= rulePoint )
            {
            // InternalCanvas.g:1732:4: (lv_endPoint_5_0= rulePoint )
            // InternalCanvas.g:1733:5: lv_endPoint_5_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_endPoint_5_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSegmentRule());
            					}
            					set(
            						current,
            						"endPoint",
            						lv_endPoint_5_0,
            						"org.xtuml.canvas.language.Canvas.Point");
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
    // $ANTLR end "ruleSegment"


    // $ANTLR start "entryRulePoint"
    // InternalCanvas.g:1754:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalCanvas.g:1754:46: (iv_rulePoint= rulePoint EOF )
            // InternalCanvas.g:1755:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalCanvas.g:1761:1: rulePoint returns [EObject current=null] : (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:1767:2: ( (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) ) )
            // InternalCanvas.g:1768:2: (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:1768:2: (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) )
            // InternalCanvas.g:1769:3: otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getXKeyword_0());
            		
            // InternalCanvas.g:1773:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalCanvas.g:1774:4: (lv_x_1_0= RULE_INT )
            {
            // InternalCanvas.g:1774:4: (lv_x_1_0= RULE_INT )
            // InternalCanvas.g:1775:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_x_1_0, grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getYKeyword_2());
            		
            // InternalCanvas.g:1795:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalCanvas.g:1796:4: (lv_y_3_0= RULE_INT )
            {
            // InternalCanvas.g:1796:4: (lv_y_3_0= RULE_INT )
            // InternalCanvas.g:1797:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_3_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleRectangle"
    // InternalCanvas.g:1817:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalCanvas.g:1817:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalCanvas.g:1818:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
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
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // InternalCanvas.g:1824:1: ruleRectangle returns [EObject current=null] : ( ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) ) ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token lv_y_6_0=null;
        Token otherlv_7=null;
        Token lv_w_8_0=null;
        Token otherlv_9=null;
        Token lv_h_10_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:1830:2: ( ( ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) ) ) )
            // InternalCanvas.g:1831:2: ( ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:1831:2: ( ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) ) )
            // InternalCanvas.g:1832:3: ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) )
            {
            // InternalCanvas.g:1832:3: ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==58) ) {
                alt42=1;
            }
            else if ( (LA42_0==59) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalCanvas.g:1833:4: (otherlv_0= 'rectangle' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1833:4: (otherlv_0= 'rectangle' otherlv_1= ':' )
                    // InternalCanvas.g:1834:5: otherlv_0= 'rectangle' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,58,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getRectangleAccess().getRectangleKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getRectangleAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1844:4: otherlv_2= 'rectangle:'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRectangleAccess().getRectangleKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,56,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getXKeyword_1());
            		
            // InternalCanvas.g:1853:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalCanvas.g:1854:4: (lv_x_4_0= RULE_INT )
            {
            // InternalCanvas.g:1854:4: (lv_x_4_0= RULE_INT )
            // InternalCanvas.g:1855:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_x_4_0, grammarAccess.getRectangleAccess().getXINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectangleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,57,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getRectangleAccess().getYKeyword_3());
            		
            // InternalCanvas.g:1875:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalCanvas.g:1876:4: (lv_y_6_0= RULE_INT )
            {
            // InternalCanvas.g:1876:4: (lv_y_6_0= RULE_INT )
            // InternalCanvas.g:1877:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_y_6_0, grammarAccess.getRectangleAccess().getYINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectangleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,60,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getRectangleAccess().getWidthKeyword_5());
            		
            // InternalCanvas.g:1897:3: ( (lv_w_8_0= RULE_INT ) )
            // InternalCanvas.g:1898:4: (lv_w_8_0= RULE_INT )
            {
            // InternalCanvas.g:1898:4: (lv_w_8_0= RULE_INT )
            // InternalCanvas.g:1899:5: lv_w_8_0= RULE_INT
            {
            lv_w_8_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            					newLeafNode(lv_w_8_0, grammarAccess.getRectangleAccess().getWINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectangleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"w",
            						lv_w_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,61,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getRectangleAccess().getHeightKeyword_7());
            		
            // InternalCanvas.g:1919:3: ( (lv_h_10_0= RULE_INT ) )
            // InternalCanvas.g:1920:4: (lv_h_10_0= RULE_INT )
            {
            // InternalCanvas.g:1920:4: (lv_h_10_0= RULE_INT )
            // InternalCanvas.g:1921:5: lv_h_10_0= RULE_INT
            {
            lv_h_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_h_10_0, grammarAccess.getRectangleAccess().getHINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRectangleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"h",
            						lv_h_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRectangle"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000030000318002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000030000300002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0C00000000018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C002800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FF0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000009000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0018300003018000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000000L});

}