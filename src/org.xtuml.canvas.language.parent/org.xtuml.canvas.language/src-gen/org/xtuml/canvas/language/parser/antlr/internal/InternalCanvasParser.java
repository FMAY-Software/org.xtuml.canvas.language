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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'render'", "':'", "'properties'", "'viewport'", "'zoom'", "'shapes'", "'shape'", "'container'", "'texts'", "'text'", "'where'", "'start'", "'end'", "'middle'", "'end_fixed'", "'start_fixed'", "'none'", "'floating'", "'additional'", "'connectors'", "'connector'", "'anchors'", "'polyline'", "'segment'", "'x'", "'y'", "'point'", "'bounds'", "'width'", "'height'", "'access_path'", "'association'", "'associative_link'", "'class'", "'communication_path'", "'data_type'", "'derived_access_path'", "'derived_communication_path'", "'ee'", "'enumeration_data_type'", "'imported_class'", "'state'", "'state_machine'", "'subsystem'", "'transition'", "'user_data_type'", "'subtype'", "'supertype'", "'creation_transition'", "'sequence'", "'lifeline'", "'timing_mark'", "'time_span'", "'synchronous_message'", "'class_instance_participant'", "'external_entity_participant'", "'class_participant'", "'actor'", "'asynchronous_message'", "'return_message'", "'communication'", "'communication_link'", "'communication_return_message'", "'communication_asynchronous_message'", "'communication_synchronous_message'", "'use_case'", "'use_case_diagram'", "'use_case_binary_association'", "'generalization'", "'include'", "'extend'", "'forkJoin'", "'activity'", "'initial_node'", "'activity_edge'", "'activity_final_node'", "'flow_final_node'", "'generic_action'", "'decision_merge_node'", "'object_node'", "'accept_event_action'", "'send_signal_action'", "'accept_time_event_action'", "'partition'", "'component'", "'provided_interface'", "'required_interface'", "'interface'", "'system_model'", "'structured_data_type'", "'component_reference'", "'component_diagram'", "'delegation'", "'component_container'", "'imported_provided_interface'", "'imported_required_interface'", "'component_participant'", "'package'", "'constant_specification'", "'package_participant'", "'diagram'", "'exception'", "'satisfaction'", "'deployment'"
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
    public static final int RULE_ID=6;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalCanvas.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_render_0_0= ruleModelRender ) ) ( (lv_properties_1_0= ruleModelProperties ) )? ( (lv_elements_2_0= ruleGraphicalElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_render_0_0 = null;

        EObject lv_properties_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:77:2: ( ( ( (lv_render_0_0= ruleModelRender ) ) ( (lv_properties_1_0= ruleModelProperties ) )? ( (lv_elements_2_0= ruleGraphicalElement ) )* ) )
            // InternalCanvas.g:78:2: ( ( (lv_render_0_0= ruleModelRender ) ) ( (lv_properties_1_0= ruleModelProperties ) )? ( (lv_elements_2_0= ruleGraphicalElement ) )* )
            {
            // InternalCanvas.g:78:2: ( ( (lv_render_0_0= ruleModelRender ) ) ( (lv_properties_1_0= ruleModelProperties ) )? ( (lv_elements_2_0= ruleGraphicalElement ) )* )
            // InternalCanvas.g:79:3: ( (lv_render_0_0= ruleModelRender ) ) ( (lv_properties_1_0= ruleModelProperties ) )? ( (lv_elements_2_0= ruleGraphicalElement ) )*
            {
            // InternalCanvas.g:79:3: ( (lv_render_0_0= ruleModelRender ) )
            // InternalCanvas.g:80:4: (lv_render_0_0= ruleModelRender )
            {
            // InternalCanvas.g:80:4: (lv_render_0_0= ruleModelRender )
            // InternalCanvas.g:81:5: lv_render_0_0= ruleModelRender
            {

            					newCompositeNode(grammarAccess.getModelAccess().getRenderModelRenderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_render_0_0=ruleModelRender();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"render",
            						lv_render_0_0,
            						"org.xtuml.canvas.language.Canvas.ModelRender");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:98:3: ( (lv_properties_1_0= ruleModelProperties ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCanvas.g:99:4: (lv_properties_1_0= ruleModelProperties )
                    {
                    // InternalCanvas.g:99:4: (lv_properties_1_0= ruleModelProperties )
                    // InternalCanvas.g:100:5: lv_properties_1_0= ruleModelProperties
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getPropertiesModelPropertiesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_properties_1_0=ruleModelProperties();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"properties",
                    						lv_properties_1_0,
                    						"org.xtuml.canvas.language.Canvas.ModelProperties");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:117:3: ( (lv_elements_2_0= ruleGraphicalElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCanvas.g:118:4: (lv_elements_2_0= ruleGraphicalElement )
            	    {
            	    // InternalCanvas.g:118:4: (lv_elements_2_0= ruleGraphicalElement )
            	    // InternalCanvas.g:119:5: lv_elements_2_0= ruleGraphicalElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsGraphicalElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleGraphicalElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtuml.canvas.language.Canvas.GraphicalElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleModelRender"
    // InternalCanvas.g:140:1: entryRuleModelRender returns [EObject current=null] : iv_ruleModelRender= ruleModelRender EOF ;
    public final EObject entryRuleModelRender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRender = null;


        try {
            // InternalCanvas.g:140:52: (iv_ruleModelRender= ruleModelRender EOF )
            // InternalCanvas.g:141:2: iv_ruleModelRender= ruleModelRender EOF
            {
             newCompositeNode(grammarAccess.getModelRenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelRender=ruleModelRender();

            state._fsp--;

             current =iv_ruleModelRender; 
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
    // $ANTLR end "entryRuleModelRender"


    // $ANTLR start "ruleModelRender"
    // InternalCanvas.g:147:1: ruleModelRender returns [EObject current=null] : (otherlv_0= 'render' otherlv_1= ':' ( (lv_importURI_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleModelRender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:153:2: ( (otherlv_0= 'render' otherlv_1= ':' ( (lv_importURI_2_0= RULE_STRING ) ) ) )
            // InternalCanvas.g:154:2: (otherlv_0= 'render' otherlv_1= ':' ( (lv_importURI_2_0= RULE_STRING ) ) )
            {
            // InternalCanvas.g:154:2: (otherlv_0= 'render' otherlv_1= ':' ( (lv_importURI_2_0= RULE_STRING ) ) )
            // InternalCanvas.g:155:3: otherlv_0= 'render' otherlv_1= ':' ( (lv_importURI_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModelRenderAccess().getRenderKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getModelRenderAccess().getColonKeyword_1());
            		
            // InternalCanvas.g:163:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalCanvas.g:164:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalCanvas.g:164:4: (lv_importURI_2_0= RULE_STRING )
            // InternalCanvas.g:165:5: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_2_0, grammarAccess.getModelRenderAccess().getImportURISTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRenderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_2_0,
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
    // $ANTLR end "ruleModelRender"


    // $ANTLR start "entryRuleModelProperties"
    // InternalCanvas.g:185:1: entryRuleModelProperties returns [EObject current=null] : iv_ruleModelProperties= ruleModelProperties EOF ;
    public final EObject entryRuleModelProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperties = null;


        try {
            // InternalCanvas.g:185:56: (iv_ruleModelProperties= ruleModelProperties EOF )
            // InternalCanvas.g:186:2: iv_ruleModelProperties= ruleModelProperties EOF
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
    // InternalCanvas.g:192:1: ruleModelProperties returns [EObject current=null] : (otherlv_0= 'properties' otherlv_1= ':' otherlv_2= 'viewport' otherlv_3= ':' ( (lv_point_4_0= rulePoint ) ) otherlv_5= 'zoom' otherlv_6= ':' ( (lv_zoom_7_0= RULE_INT ) ) ) ;
    public final EObject ruleModelProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_zoom_7_0=null;
        EObject lv_point_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:198:2: ( (otherlv_0= 'properties' otherlv_1= ':' otherlv_2= 'viewport' otherlv_3= ':' ( (lv_point_4_0= rulePoint ) ) otherlv_5= 'zoom' otherlv_6= ':' ( (lv_zoom_7_0= RULE_INT ) ) ) )
            // InternalCanvas.g:199:2: (otherlv_0= 'properties' otherlv_1= ':' otherlv_2= 'viewport' otherlv_3= ':' ( (lv_point_4_0= rulePoint ) ) otherlv_5= 'zoom' otherlv_6= ':' ( (lv_zoom_7_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:199:2: (otherlv_0= 'properties' otherlv_1= ':' otherlv_2= 'viewport' otherlv_3= ':' ( (lv_point_4_0= rulePoint ) ) otherlv_5= 'zoom' otherlv_6= ':' ( (lv_zoom_7_0= RULE_INT ) ) )
            // InternalCanvas.g:200:3: otherlv_0= 'properties' otherlv_1= ':' otherlv_2= 'viewport' otherlv_3= ':' ( (lv_point_4_0= rulePoint ) ) otherlv_5= 'zoom' otherlv_6= ':' ( (lv_zoom_7_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getModelPropertiesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelPropertiesAccess().getViewportKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getModelPropertiesAccess().getColonKeyword_3());
            		
            // InternalCanvas.g:216:3: ( (lv_point_4_0= rulePoint ) )
            // InternalCanvas.g:217:4: (lv_point_4_0= rulePoint )
            {
            // InternalCanvas.g:217:4: (lv_point_4_0= rulePoint )
            // InternalCanvas.g:218:5: lv_point_4_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getModelPropertiesAccess().getPointPointParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_point_4_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelPropertiesRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_4_0,
            						"org.xtuml.canvas.language.Canvas.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getModelPropertiesAccess().getZoomKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getModelPropertiesAccess().getColonKeyword_6());
            		
            // InternalCanvas.g:243:3: ( (lv_zoom_7_0= RULE_INT ) )
            // InternalCanvas.g:244:4: (lv_zoom_7_0= RULE_INT )
            {
            // InternalCanvas.g:244:4: (lv_zoom_7_0= RULE_INT )
            // InternalCanvas.g:245:5: lv_zoom_7_0= RULE_INT
            {
            lv_zoom_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_zoom_7_0, grammarAccess.getModelPropertiesAccess().getZoomINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"zoom",
            						lv_zoom_7_0,
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
    // InternalCanvas.g:265:1: entryRuleGraphicalElement returns [EObject current=null] : iv_ruleGraphicalElement= ruleGraphicalElement EOF ;
    public final EObject entryRuleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicalElement = null;


        try {
            // InternalCanvas.g:265:57: (iv_ruleGraphicalElement= ruleGraphicalElement EOF )
            // InternalCanvas.g:266:2: iv_ruleGraphicalElement= ruleGraphicalElement EOF
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
    // InternalCanvas.g:272:1: ruleGraphicalElement returns [EObject current=null] : (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors ) ;
    public final EObject ruleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Shapes_0 = null;

        EObject this_Connectors_1 = null;



        	enterRule();

        try {
            // InternalCanvas.g:278:2: ( (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors ) )
            // InternalCanvas.g:279:2: (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors )
            {
            // InternalCanvas.g:279:2: (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCanvas.g:280:3: this_Shapes_0= ruleShapes
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
                    // InternalCanvas.g:289:3: this_Connectors_1= ruleConnectors
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
    // InternalCanvas.g:301:1: entryRuleShapes returns [EObject current=null] : iv_ruleShapes= ruleShapes EOF ;
    public final EObject entryRuleShapes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapes = null;


        try {
            // InternalCanvas.g:301:47: (iv_ruleShapes= ruleShapes EOF )
            // InternalCanvas.g:302:2: iv_ruleShapes= ruleShapes EOF
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
    // InternalCanvas.g:308:1: ruleShapes returns [EObject current=null] : ( () otherlv_1= 'shapes' otherlv_2= ':' ( (lv_shapes_3_0= ruleShape ) )* ) ;
    public final EObject ruleShapes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_shapes_3_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:314:2: ( ( () otherlv_1= 'shapes' otherlv_2= ':' ( (lv_shapes_3_0= ruleShape ) )* ) )
            // InternalCanvas.g:315:2: ( () otherlv_1= 'shapes' otherlv_2= ':' ( (lv_shapes_3_0= ruleShape ) )* )
            {
            // InternalCanvas.g:315:2: ( () otherlv_1= 'shapes' otherlv_2= ':' ( (lv_shapes_3_0= ruleShape ) )* )
            // InternalCanvas.g:316:3: () otherlv_1= 'shapes' otherlv_2= ':' ( (lv_shapes_3_0= ruleShape ) )*
            {
            // InternalCanvas.g:316:3: ()
            // InternalCanvas.g:317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapesAccess().getShapesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getShapesAccess().getShapesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getShapesAccess().getColonKeyword_2());
            		
            // InternalCanvas.g:331:3: ( (lv_shapes_3_0= ruleShape ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCanvas.g:332:4: (lv_shapes_3_0= ruleShape )
            	    {
            	    // InternalCanvas.g:332:4: (lv_shapes_3_0= ruleShape )
            	    // InternalCanvas.g:333:5: lv_shapes_3_0= ruleShape
            	    {

            	    					newCompositeNode(grammarAccess.getShapesAccess().getShapesShapeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_shapes_3_0=ruleShape();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShapesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shapes",
            	    						lv_shapes_3_0,
            	    						"org.xtuml.canvas.language.Canvas.Shape");
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
    // $ANTLR end "ruleShapes"


    // $ANTLR start "entryRuleShape"
    // InternalCanvas.g:354:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // InternalCanvas.g:354:46: (iv_ruleShape= ruleShape EOF )
            // InternalCanvas.g:355:2: iv_ruleShape= ruleShape EOF
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
    // InternalCanvas.g:361:1: ruleShape returns [EObject current=null] : ( () otherlv_1= 'shape' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) ( (lv_container_4_0= ruleContainer ) )? otherlv_5= 'render' otherlv_6= ':' ( (lv_type_7_0= ruleTypeLabel ) ) ( (lv_represents_8_0= RULE_STRING ) ) ( (lv_bounds_9_0= ruleBounds ) ) ( (lv_text_10_0= ruleFloatingText ) )? ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_represents_8_0=null;
        AntlrDatatypeRuleToken lv_container_4_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;

        EObject lv_bounds_9_0 = null;

        EObject lv_text_10_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:367:2: ( ( () otherlv_1= 'shape' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) ( (lv_container_4_0= ruleContainer ) )? otherlv_5= 'render' otherlv_6= ':' ( (lv_type_7_0= ruleTypeLabel ) ) ( (lv_represents_8_0= RULE_STRING ) ) ( (lv_bounds_9_0= ruleBounds ) ) ( (lv_text_10_0= ruleFloatingText ) )? ) )
            // InternalCanvas.g:368:2: ( () otherlv_1= 'shape' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) ( (lv_container_4_0= ruleContainer ) )? otherlv_5= 'render' otherlv_6= ':' ( (lv_type_7_0= ruleTypeLabel ) ) ( (lv_represents_8_0= RULE_STRING ) ) ( (lv_bounds_9_0= ruleBounds ) ) ( (lv_text_10_0= ruleFloatingText ) )? )
            {
            // InternalCanvas.g:368:2: ( () otherlv_1= 'shape' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) ( (lv_container_4_0= ruleContainer ) )? otherlv_5= 'render' otherlv_6= ':' ( (lv_type_7_0= ruleTypeLabel ) ) ( (lv_represents_8_0= RULE_STRING ) ) ( (lv_bounds_9_0= ruleBounds ) ) ( (lv_text_10_0= ruleFloatingText ) )? )
            // InternalCanvas.g:369:3: () otherlv_1= 'shape' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) ( (lv_container_4_0= ruleContainer ) )? otherlv_5= 'render' otherlv_6= ':' ( (lv_type_7_0= ruleTypeLabel ) ) ( (lv_represents_8_0= RULE_STRING ) ) ( (lv_bounds_9_0= ruleBounds ) ) ( (lv_text_10_0= ruleFloatingText ) )?
            {
            // InternalCanvas.g:369:3: ()
            // InternalCanvas.g:370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeAccess().getShapeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeAccess().getShapeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getShapeAccess().getColonKeyword_2());
            		
            // InternalCanvas.g:384:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCanvas.g:385:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCanvas.g:385:4: (lv_name_3_0= RULE_ID )
            // InternalCanvas.g:386:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_3_0, grammarAccess.getShapeAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCanvas.g:402:3: ( (lv_container_4_0= ruleContainer ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCanvas.g:403:4: (lv_container_4_0= ruleContainer )
                    {
                    // InternalCanvas.g:403:4: (lv_container_4_0= ruleContainer )
                    // InternalCanvas.g:404:5: lv_container_4_0= ruleContainer
                    {

                    					newCompositeNode(grammarAccess.getShapeAccess().getContainerContainerParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_container_4_0=ruleContainer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapeRule());
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

            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getShapeAccess().getRenderKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getShapeAccess().getColonKeyword_6());
            		
            // InternalCanvas.g:429:3: ( (lv_type_7_0= ruleTypeLabel ) )
            // InternalCanvas.g:430:4: (lv_type_7_0= ruleTypeLabel )
            {
            // InternalCanvas.g:430:4: (lv_type_7_0= ruleTypeLabel )
            // InternalCanvas.g:431:5: lv_type_7_0= ruleTypeLabel
            {

            					newCompositeNode(grammarAccess.getShapeAccess().getTypeTypeLabelParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_7_0=ruleTypeLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtuml.canvas.language.Canvas.TypeLabel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:448:3: ( (lv_represents_8_0= RULE_STRING ) )
            // InternalCanvas.g:449:4: (lv_represents_8_0= RULE_STRING )
            {
            // InternalCanvas.g:449:4: (lv_represents_8_0= RULE_STRING )
            // InternalCanvas.g:450:5: lv_represents_8_0= RULE_STRING
            {
            lv_represents_8_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_represents_8_0, grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"represents",
            						lv_represents_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCanvas.g:466:3: ( (lv_bounds_9_0= ruleBounds ) )
            // InternalCanvas.g:467:4: (lv_bounds_9_0= ruleBounds )
            {
            // InternalCanvas.g:467:4: (lv_bounds_9_0= ruleBounds )
            // InternalCanvas.g:468:5: lv_bounds_9_0= ruleBounds
            {

            					newCompositeNode(grammarAccess.getShapeAccess().getBoundsBoundsParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_17);
            lv_bounds_9_0=ruleBounds();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeRule());
            					}
            					set(
            						current,
            						"bounds",
            						lv_bounds_9_0,
            						"org.xtuml.canvas.language.Canvas.Bounds");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:485:3: ( (lv_text_10_0= ruleFloatingText ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCanvas.g:486:4: (lv_text_10_0= ruleFloatingText )
                    {
                    // InternalCanvas.g:486:4: (lv_text_10_0= ruleFloatingText )
                    // InternalCanvas.g:487:5: lv_text_10_0= ruleFloatingText
                    {

                    					newCompositeNode(grammarAccess.getShapeAccess().getTextFloatingTextParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_text_10_0=ruleFloatingText();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapeRule());
                    					}
                    					set(
                    						current,
                    						"text",
                    						lv_text_10_0,
                    						"org.xtuml.canvas.language.Canvas.FloatingText");
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
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleContainer"
    // InternalCanvas.g:508:1: entryRuleContainer returns [String current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final String entryRuleContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContainer = null;


        try {
            // InternalCanvas.g:508:49: (iv_ruleContainer= ruleContainer EOF )
            // InternalCanvas.g:509:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer.getText(); 
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
    // InternalCanvas.g:515:1: ruleContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'container' ;
    public final AntlrDatatypeRuleToken ruleContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCanvas.g:521:2: (kw= 'container' )
            // InternalCanvas.g:522:2: kw= 'container'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getContainerAccess().getContainerKeyword());
            	

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


    // $ANTLR start "entryRuleFloatingTexts"
    // InternalCanvas.g:530:1: entryRuleFloatingTexts returns [EObject current=null] : iv_ruleFloatingTexts= ruleFloatingTexts EOF ;
    public final EObject entryRuleFloatingTexts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatingTexts = null;


        try {
            // InternalCanvas.g:530:54: (iv_ruleFloatingTexts= ruleFloatingTexts EOF )
            // InternalCanvas.g:531:2: iv_ruleFloatingTexts= ruleFloatingTexts EOF
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
    // InternalCanvas.g:537:1: ruleFloatingTexts returns [EObject current=null] : ( () otherlv_1= 'texts' otherlv_2= ':' ( (lv_texts_3_0= ruleFloatingText ) )* ) ;
    public final EObject ruleFloatingTexts() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_texts_3_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:543:2: ( ( () otherlv_1= 'texts' otherlv_2= ':' ( (lv_texts_3_0= ruleFloatingText ) )* ) )
            // InternalCanvas.g:544:2: ( () otherlv_1= 'texts' otherlv_2= ':' ( (lv_texts_3_0= ruleFloatingText ) )* )
            {
            // InternalCanvas.g:544:2: ( () otherlv_1= 'texts' otherlv_2= ':' ( (lv_texts_3_0= ruleFloatingText ) )* )
            // InternalCanvas.g:545:3: () otherlv_1= 'texts' otherlv_2= ':' ( (lv_texts_3_0= ruleFloatingText ) )*
            {
            // InternalCanvas.g:545:3: ()
            // InternalCanvas.g:546:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatingTextsAccess().getFloatingTextsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatingTextsAccess().getTextsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getFloatingTextsAccess().getColonKeyword_2());
            		
            // InternalCanvas.g:560:3: ( (lv_texts_3_0= ruleFloatingText ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCanvas.g:561:4: (lv_texts_3_0= ruleFloatingText )
            	    {
            	    // InternalCanvas.g:561:4: (lv_texts_3_0= ruleFloatingText )
            	    // InternalCanvas.g:562:5: lv_texts_3_0= ruleFloatingText
            	    {

            	    					newCompositeNode(grammarAccess.getFloatingTextsAccess().getTextsFloatingTextParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_texts_3_0=ruleFloatingText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFloatingTextsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"texts",
            	    						lv_texts_3_0,
            	    						"org.xtuml.canvas.language.Canvas.FloatingText");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleFloatingTexts"


    // $ANTLR start "entryRuleFloatingText"
    // InternalCanvas.g:583:1: entryRuleFloatingText returns [EObject current=null] : iv_ruleFloatingText= ruleFloatingText EOF ;
    public final EObject entryRuleFloatingText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatingText = null;


        try {
            // InternalCanvas.g:583:53: (iv_ruleFloatingText= ruleFloatingText EOF )
            // InternalCanvas.g:584:2: iv_ruleFloatingText= ruleFloatingText EOF
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
    // InternalCanvas.g:590:1: ruleFloatingText returns [EObject current=null] : ( () otherlv_1= 'text' otherlv_2= ':' ( (lv_bounds_3_0= ruleBounds ) ) ( (lv_end_4_0= ruleEnumEnd ) ) ) ;
    public final EObject ruleFloatingText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_bounds_3_0 = null;

        EObject lv_end_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:596:2: ( ( () otherlv_1= 'text' otherlv_2= ':' ( (lv_bounds_3_0= ruleBounds ) ) ( (lv_end_4_0= ruleEnumEnd ) ) ) )
            // InternalCanvas.g:597:2: ( () otherlv_1= 'text' otherlv_2= ':' ( (lv_bounds_3_0= ruleBounds ) ) ( (lv_end_4_0= ruleEnumEnd ) ) )
            {
            // InternalCanvas.g:597:2: ( () otherlv_1= 'text' otherlv_2= ':' ( (lv_bounds_3_0= ruleBounds ) ) ( (lv_end_4_0= ruleEnumEnd ) ) )
            // InternalCanvas.g:598:3: () otherlv_1= 'text' otherlv_2= ':' ( (lv_bounds_3_0= ruleBounds ) ) ( (lv_end_4_0= ruleEnumEnd ) )
            {
            // InternalCanvas.g:598:3: ()
            // InternalCanvas.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatingTextAccess().getFloatingTextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatingTextAccess().getTextKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getFloatingTextAccess().getColonKeyword_2());
            		
            // InternalCanvas.g:613:3: ( (lv_bounds_3_0= ruleBounds ) )
            // InternalCanvas.g:614:4: (lv_bounds_3_0= ruleBounds )
            {
            // InternalCanvas.g:614:4: (lv_bounds_3_0= ruleBounds )
            // InternalCanvas.g:615:5: lv_bounds_3_0= ruleBounds
            {

            					newCompositeNode(grammarAccess.getFloatingTextAccess().getBoundsBoundsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_bounds_3_0=ruleBounds();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatingTextRule());
            					}
            					set(
            						current,
            						"bounds",
            						lv_bounds_3_0,
            						"org.xtuml.canvas.language.Canvas.Bounds");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:632:3: ( (lv_end_4_0= ruleEnumEnd ) )
            // InternalCanvas.g:633:4: (lv_end_4_0= ruleEnumEnd )
            {
            // InternalCanvas.g:633:4: (lv_end_4_0= ruleEnumEnd )
            // InternalCanvas.g:634:5: lv_end_4_0= ruleEnumEnd
            {

            					newCompositeNode(grammarAccess.getFloatingTextAccess().getEndEnumEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_4_0=ruleEnumEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatingTextRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_4_0,
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
    // InternalCanvas.g:655:1: entryRuleEnumEnd returns [EObject current=null] : iv_ruleEnumEnd= ruleEnumEnd EOF ;
    public final EObject entryRuleEnumEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumEnd = null;


        try {
            // InternalCanvas.g:655:48: (iv_ruleEnumEnd= ruleEnumEnd EOF )
            // InternalCanvas.g:656:2: iv_ruleEnumEnd= ruleEnumEnd EOF
            {
             newCompositeNode(grammarAccess.getEnumEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumEnd=ruleEnumEnd();

            state._fsp--;

             current =iv_ruleEnumEnd; 
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
    // InternalCanvas.g:662:1: ruleEnumEnd returns [EObject current=null] : (otherlv_0= 'where' otherlv_1= ':' ( ( (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' ) ) ) ) ;
    public final EObject ruleEnumEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_where_2_1=null;
        Token lv_where_2_2=null;
        Token lv_where_2_3=null;
        Token lv_where_2_4=null;
        Token lv_where_2_5=null;
        Token lv_where_2_6=null;
        Token lv_where_2_7=null;
        Token lv_where_2_8=null;


        	enterRule();

        try {
            // InternalCanvas.g:668:2: ( (otherlv_0= 'where' otherlv_1= ':' ( ( (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' ) ) ) ) )
            // InternalCanvas.g:669:2: (otherlv_0= 'where' otherlv_1= ':' ( ( (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' ) ) ) )
            {
            // InternalCanvas.g:669:2: (otherlv_0= 'where' otherlv_1= ':' ( ( (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' ) ) ) )
            // InternalCanvas.g:670:3: otherlv_0= 'where' otherlv_1= ':' ( ( (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumEndAccess().getWhereKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumEndAccess().getColonKeyword_1());
            		
            // InternalCanvas.g:678:3: ( ( (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' ) ) )
            // InternalCanvas.g:679:4: ( (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' ) )
            {
            // InternalCanvas.g:679:4: ( (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' ) )
            // InternalCanvas.g:680:5: (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' )
            {
            // InternalCanvas.g:680:5: (lv_where_2_1= 'start' | lv_where_2_2= 'end' | lv_where_2_3= 'middle' | lv_where_2_4= 'end_fixed' | lv_where_2_5= 'start_fixed' | lv_where_2_6= 'none' | lv_where_2_7= 'floating' | lv_where_2_8= 'additional' )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            case 27:
                {
                alt8=6;
                }
                break;
            case 28:
                {
                alt8=7;
                }
                break;
            case 29:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCanvas.g:681:6: lv_where_2_1= 'start'
                    {
                    lv_where_2_1=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_where_2_1, grammarAccess.getEnumEndAccess().getWhereStartKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCanvas.g:692:6: lv_where_2_2= 'end'
                    {
                    lv_where_2_2=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_where_2_2, grammarAccess.getEnumEndAccess().getWhereEndKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCanvas.g:703:6: lv_where_2_3= 'middle'
                    {
                    lv_where_2_3=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_where_2_3, grammarAccess.getEnumEndAccess().getWhereMiddleKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCanvas.g:714:6: lv_where_2_4= 'end_fixed'
                    {
                    lv_where_2_4=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_where_2_4, grammarAccess.getEnumEndAccess().getWhereEnd_fixedKeyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCanvas.g:725:6: lv_where_2_5= 'start_fixed'
                    {
                    lv_where_2_5=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_where_2_5, grammarAccess.getEnumEndAccess().getWhereStart_fixedKeyword_2_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_2_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCanvas.g:736:6: lv_where_2_6= 'none'
                    {
                    lv_where_2_6=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_where_2_6, grammarAccess.getEnumEndAccess().getWhereNoneKeyword_2_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_2_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalCanvas.g:747:6: lv_where_2_7= 'floating'
                    {
                    lv_where_2_7=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_where_2_7, grammarAccess.getEnumEndAccess().getWhereFloatingKeyword_2_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_2_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalCanvas.g:758:6: lv_where_2_8= 'additional'
                    {
                    lv_where_2_8=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_where_2_8, grammarAccess.getEnumEndAccess().getWhereAdditionalKeyword_2_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_2_8, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleEnumEnd"


    // $ANTLR start "entryRuleConnectors"
    // InternalCanvas.g:775:1: entryRuleConnectors returns [EObject current=null] : iv_ruleConnectors= ruleConnectors EOF ;
    public final EObject entryRuleConnectors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectors = null;


        try {
            // InternalCanvas.g:775:51: (iv_ruleConnectors= ruleConnectors EOF )
            // InternalCanvas.g:776:2: iv_ruleConnectors= ruleConnectors EOF
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
    // InternalCanvas.g:782:1: ruleConnectors returns [EObject current=null] : ( () otherlv_1= 'connectors' otherlv_2= ':' ( (lv_connectors_3_0= ruleConnector ) )* ) ;
    public final EObject ruleConnectors() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_connectors_3_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:788:2: ( ( () otherlv_1= 'connectors' otherlv_2= ':' ( (lv_connectors_3_0= ruleConnector ) )* ) )
            // InternalCanvas.g:789:2: ( () otherlv_1= 'connectors' otherlv_2= ':' ( (lv_connectors_3_0= ruleConnector ) )* )
            {
            // InternalCanvas.g:789:2: ( () otherlv_1= 'connectors' otherlv_2= ':' ( (lv_connectors_3_0= ruleConnector ) )* )
            // InternalCanvas.g:790:3: () otherlv_1= 'connectors' otherlv_2= ':' ( (lv_connectors_3_0= ruleConnector ) )*
            {
            // InternalCanvas.g:790:3: ()
            // InternalCanvas.g:791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectorsAccess().getConnectorsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectorsAccess().getConnectorsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectorsAccess().getColonKeyword_2());
            		
            // InternalCanvas.g:805:3: ( (lv_connectors_3_0= ruleConnector ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCanvas.g:806:4: (lv_connectors_3_0= ruleConnector )
            	    {
            	    // InternalCanvas.g:806:4: (lv_connectors_3_0= ruleConnector )
            	    // InternalCanvas.g:807:5: lv_connectors_3_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getConnectorsAccess().getConnectorsConnectorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_connectors_3_0=ruleConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConnectorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_3_0,
            	    						"org.xtuml.canvas.language.Canvas.Connector");
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
    // $ANTLR end "ruleConnectors"


    // $ANTLR start "entryRuleConnector"
    // InternalCanvas.g:828:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCanvas.g:828:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCanvas.g:829:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCanvas.g:835:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'render' otherlv_4= ':' ( (lv_type_5_0= ruleTypeLabel ) ) ( (lv_represents_6_0= RULE_STRING ) ) ( (lv_polyline_7_0= rulePolyline ) ) ( (lv_anchors_8_0= ruleAnchors ) )? ( (lv_texts_9_0= ruleFloatingTexts ) ) ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_represents_6_0=null;
        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_polyline_7_0 = null;

        EObject lv_anchors_8_0 = null;

        EObject lv_texts_9_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:841:2: ( (otherlv_0= 'connector' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'render' otherlv_4= ':' ( (lv_type_5_0= ruleTypeLabel ) ) ( (lv_represents_6_0= RULE_STRING ) ) ( (lv_polyline_7_0= rulePolyline ) ) ( (lv_anchors_8_0= ruleAnchors ) )? ( (lv_texts_9_0= ruleFloatingTexts ) ) ) )
            // InternalCanvas.g:842:2: (otherlv_0= 'connector' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'render' otherlv_4= ':' ( (lv_type_5_0= ruleTypeLabel ) ) ( (lv_represents_6_0= RULE_STRING ) ) ( (lv_polyline_7_0= rulePolyline ) ) ( (lv_anchors_8_0= ruleAnchors ) )? ( (lv_texts_9_0= ruleFloatingTexts ) ) )
            {
            // InternalCanvas.g:842:2: (otherlv_0= 'connector' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'render' otherlv_4= ':' ( (lv_type_5_0= ruleTypeLabel ) ) ( (lv_represents_6_0= RULE_STRING ) ) ( (lv_polyline_7_0= rulePolyline ) ) ( (lv_anchors_8_0= ruleAnchors ) )? ( (lv_texts_9_0= ruleFloatingTexts ) ) )
            // InternalCanvas.g:843:3: otherlv_0= 'connector' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'render' otherlv_4= ':' ( (lv_type_5_0= ruleTypeLabel ) ) ( (lv_represents_6_0= RULE_STRING ) ) ( (lv_polyline_7_0= rulePolyline ) ) ( (lv_anchors_8_0= ruleAnchors ) )? ( (lv_texts_9_0= ruleFloatingTexts ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getColonKeyword_1());
            		
            // InternalCanvas.g:851:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCanvas.g:852:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCanvas.g:852:4: (lv_name_2_0= RULE_ID )
            // InternalCanvas.g:853:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getRenderKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getColonKeyword_4());
            		
            // InternalCanvas.g:877:3: ( (lv_type_5_0= ruleTypeLabel ) )
            // InternalCanvas.g:878:4: (lv_type_5_0= ruleTypeLabel )
            {
            // InternalCanvas.g:878:4: (lv_type_5_0= ruleTypeLabel )
            // InternalCanvas.g:879:5: lv_type_5_0= ruleTypeLabel
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getTypeTypeLabelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_5_0=ruleTypeLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.xtuml.canvas.language.Canvas.TypeLabel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:896:3: ( (lv_represents_6_0= RULE_STRING ) )
            // InternalCanvas.g:897:4: (lv_represents_6_0= RULE_STRING )
            {
            // InternalCanvas.g:897:4: (lv_represents_6_0= RULE_STRING )
            // InternalCanvas.g:898:5: lv_represents_6_0= RULE_STRING
            {
            lv_represents_6_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_represents_6_0, grammarAccess.getConnectorAccess().getRepresentsSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"represents",
            						lv_represents_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCanvas.g:914:3: ( (lv_polyline_7_0= rulePolyline ) )
            // InternalCanvas.g:915:4: (lv_polyline_7_0= rulePolyline )
            {
            // InternalCanvas.g:915:4: (lv_polyline_7_0= rulePolyline )
            // InternalCanvas.g:916:5: lv_polyline_7_0= rulePolyline
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getPolylinePolylineParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_polyline_7_0=rulePolyline();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"polyline",
            						lv_polyline_7_0,
            						"org.xtuml.canvas.language.Canvas.Polyline");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:933:3: ( (lv_anchors_8_0= ruleAnchors ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCanvas.g:934:4: (lv_anchors_8_0= ruleAnchors )
                    {
                    // InternalCanvas.g:934:4: (lv_anchors_8_0= ruleAnchors )
                    // InternalCanvas.g:935:5: lv_anchors_8_0= ruleAnchors
                    {

                    					newCompositeNode(grammarAccess.getConnectorAccess().getAnchorsAnchorsParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_anchors_8_0=ruleAnchors();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorRule());
                    					}
                    					set(
                    						current,
                    						"anchors",
                    						lv_anchors_8_0,
                    						"org.xtuml.canvas.language.Canvas.Anchors");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:952:3: ( (lv_texts_9_0= ruleFloatingTexts ) )
            // InternalCanvas.g:953:4: (lv_texts_9_0= ruleFloatingTexts )
            {
            // InternalCanvas.g:953:4: (lv_texts_9_0= ruleFloatingTexts )
            // InternalCanvas.g:954:5: lv_texts_9_0= ruleFloatingTexts
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getTextsFloatingTextsParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_texts_9_0=ruleFloatingTexts();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"texts",
            						lv_texts_9_0,
            						"org.xtuml.canvas.language.Canvas.FloatingTexts");
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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleAnchors"
    // InternalCanvas.g:975:1: entryRuleAnchors returns [EObject current=null] : iv_ruleAnchors= ruleAnchors EOF ;
    public final EObject entryRuleAnchors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchors = null;


        try {
            // InternalCanvas.g:975:48: (iv_ruleAnchors= ruleAnchors EOF )
            // InternalCanvas.g:976:2: iv_ruleAnchors= ruleAnchors EOF
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
    // InternalCanvas.g:982:1: ruleAnchors returns [EObject current=null] : (otherlv_0= 'anchors' otherlv_1= ':' ( (lv_startAnchor_2_0= ruleStartAnchor ) ) ( (lv_endAnchor_3_0= ruleEndAnchor ) ) ) ;
    public final EObject ruleAnchors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_startAnchor_2_0 = null;

        EObject lv_endAnchor_3_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:988:2: ( (otherlv_0= 'anchors' otherlv_1= ':' ( (lv_startAnchor_2_0= ruleStartAnchor ) ) ( (lv_endAnchor_3_0= ruleEndAnchor ) ) ) )
            // InternalCanvas.g:989:2: (otherlv_0= 'anchors' otherlv_1= ':' ( (lv_startAnchor_2_0= ruleStartAnchor ) ) ( (lv_endAnchor_3_0= ruleEndAnchor ) ) )
            {
            // InternalCanvas.g:989:2: (otherlv_0= 'anchors' otherlv_1= ':' ( (lv_startAnchor_2_0= ruleStartAnchor ) ) ( (lv_endAnchor_3_0= ruleEndAnchor ) ) )
            // InternalCanvas.g:990:3: otherlv_0= 'anchors' otherlv_1= ':' ( (lv_startAnchor_2_0= ruleStartAnchor ) ) ( (lv_endAnchor_3_0= ruleEndAnchor ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnchorsAccess().getAnchorsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAnchorsAccess().getColonKeyword_1());
            		
            // InternalCanvas.g:998:3: ( (lv_startAnchor_2_0= ruleStartAnchor ) )
            // InternalCanvas.g:999:4: (lv_startAnchor_2_0= ruleStartAnchor )
            {
            // InternalCanvas.g:999:4: (lv_startAnchor_2_0= ruleStartAnchor )
            // InternalCanvas.g:1000:5: lv_startAnchor_2_0= ruleStartAnchor
            {

            					newCompositeNode(grammarAccess.getAnchorsAccess().getStartAnchorStartAnchorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_startAnchor_2_0=ruleStartAnchor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnchorsRule());
            					}
            					set(
            						current,
            						"startAnchor",
            						lv_startAnchor_2_0,
            						"org.xtuml.canvas.language.Canvas.StartAnchor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1017:3: ( (lv_endAnchor_3_0= ruleEndAnchor ) )
            // InternalCanvas.g:1018:4: (lv_endAnchor_3_0= ruleEndAnchor )
            {
            // InternalCanvas.g:1018:4: (lv_endAnchor_3_0= ruleEndAnchor )
            // InternalCanvas.g:1019:5: lv_endAnchor_3_0= ruleEndAnchor
            {

            					newCompositeNode(grammarAccess.getAnchorsAccess().getEndAnchorEndAnchorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_endAnchor_3_0=ruleEndAnchor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnchorsRule());
            					}
            					set(
            						current,
            						"endAnchor",
            						lv_endAnchor_3_0,
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
    // InternalCanvas.g:1040:1: entryRuleStartAnchor returns [EObject current=null] : iv_ruleStartAnchor= ruleStartAnchor EOF ;
    public final EObject entryRuleStartAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartAnchor = null;


        try {
            // InternalCanvas.g:1040:52: (iv_ruleStartAnchor= ruleStartAnchor EOF )
            // InternalCanvas.g:1041:2: iv_ruleStartAnchor= ruleStartAnchor EOF
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
    // InternalCanvas.g:1047:1: ruleStartAnchor returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )? ) ;
    public final EObject ruleStartAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_point_2_0 = null;

        EObject lv_anchor_3_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1053:2: ( (otherlv_0= 'start' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )? ) )
            // InternalCanvas.g:1054:2: (otherlv_0= 'start' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )? )
            {
            // InternalCanvas.g:1054:2: (otherlv_0= 'start' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )? )
            // InternalCanvas.g:1055:3: otherlv_0= 'start' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStartAnchorAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getStartAnchorAccess().getColonKeyword_1());
            		
            // InternalCanvas.g:1063:3: ( (lv_point_2_0= rulePointDefinition ) )
            // InternalCanvas.g:1064:4: (lv_point_2_0= rulePointDefinition )
            {
            // InternalCanvas.g:1064:4: (lv_point_2_0= rulePointDefinition )
            // InternalCanvas.g:1065:5: lv_point_2_0= rulePointDefinition
            {

            					newCompositeNode(grammarAccess.getStartAnchorAccess().getPointPointDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_point_2_0=rulePointDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartAnchorRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_2_0,
            						"org.xtuml.canvas.language.Canvas.PointDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1082:3: ( (lv_anchor_3_0= ruleAnchor ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17||LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCanvas.g:1083:4: (lv_anchor_3_0= ruleAnchor )
                    {
                    // InternalCanvas.g:1083:4: (lv_anchor_3_0= ruleAnchor )
                    // InternalCanvas.g:1084:5: lv_anchor_3_0= ruleAnchor
                    {

                    					newCompositeNode(grammarAccess.getStartAnchorAccess().getAnchorAnchorParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_anchor_3_0=ruleAnchor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStartAnchorRule());
                    					}
                    					set(
                    						current,
                    						"anchor",
                    						lv_anchor_3_0,
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
    // InternalCanvas.g:1105:1: entryRuleEndAnchor returns [EObject current=null] : iv_ruleEndAnchor= ruleEndAnchor EOF ;
    public final EObject entryRuleEndAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndAnchor = null;


        try {
            // InternalCanvas.g:1105:50: (iv_ruleEndAnchor= ruleEndAnchor EOF )
            // InternalCanvas.g:1106:2: iv_ruleEndAnchor= ruleEndAnchor EOF
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
    // InternalCanvas.g:1112:1: ruleEndAnchor returns [EObject current=null] : (otherlv_0= 'end' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )? ) ;
    public final EObject ruleEndAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_point_2_0 = null;

        EObject lv_anchor_3_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1118:2: ( (otherlv_0= 'end' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )? ) )
            // InternalCanvas.g:1119:2: (otherlv_0= 'end' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )? )
            {
            // InternalCanvas.g:1119:2: (otherlv_0= 'end' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )? )
            // InternalCanvas.g:1120:3: otherlv_0= 'end' otherlv_1= ':' ( (lv_point_2_0= rulePointDefinition ) ) ( (lv_anchor_3_0= ruleAnchor ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEndAnchorAccess().getEndKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getEndAnchorAccess().getColonKeyword_1());
            		
            // InternalCanvas.g:1128:3: ( (lv_point_2_0= rulePointDefinition ) )
            // InternalCanvas.g:1129:4: (lv_point_2_0= rulePointDefinition )
            {
            // InternalCanvas.g:1129:4: (lv_point_2_0= rulePointDefinition )
            // InternalCanvas.g:1130:5: lv_point_2_0= rulePointDefinition
            {

            					newCompositeNode(grammarAccess.getEndAnchorAccess().getPointPointDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_point_2_0=rulePointDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndAnchorRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_2_0,
            						"org.xtuml.canvas.language.Canvas.PointDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1147:3: ( (lv_anchor_3_0= ruleAnchor ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17||LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCanvas.g:1148:4: (lv_anchor_3_0= ruleAnchor )
                    {
                    // InternalCanvas.g:1148:4: (lv_anchor_3_0= ruleAnchor )
                    // InternalCanvas.g:1149:5: lv_anchor_3_0= ruleAnchor
                    {

                    					newCompositeNode(grammarAccess.getEndAnchorAccess().getAnchorAnchorParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_anchor_3_0=ruleAnchor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEndAnchorRule());
                    					}
                    					set(
                    						current,
                    						"anchor",
                    						lv_anchor_3_0,
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
    // InternalCanvas.g:1170:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // InternalCanvas.g:1170:47: (iv_ruleAnchor= ruleAnchor EOF )
            // InternalCanvas.g:1171:2: iv_ruleAnchor= ruleAnchor EOF
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
    // InternalCanvas.g:1177:1: ruleAnchor returns [EObject current=null] : (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        EObject this_ShapeAnchorElement_0 = null;

        EObject this_ConnectorAnchorElement_1 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1183:2: ( (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement ) )
            // InternalCanvas.g:1184:2: (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement )
            {
            // InternalCanvas.g:1184:2: (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCanvas.g:1185:3: this_ShapeAnchorElement_0= ruleShapeAnchorElement
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
                    // InternalCanvas.g:1194:3: this_ConnectorAnchorElement_1= ruleConnectorAnchorElement
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
    // InternalCanvas.g:1206:1: entryRuleShapeAnchorElement returns [EObject current=null] : iv_ruleShapeAnchorElement= ruleShapeAnchorElement EOF ;
    public final EObject entryRuleShapeAnchorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeAnchorElement = null;


        try {
            // InternalCanvas.g:1206:59: (iv_ruleShapeAnchorElement= ruleShapeAnchorElement EOF )
            // InternalCanvas.g:1207:2: iv_ruleShapeAnchorElement= ruleShapeAnchorElement EOF
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
    // InternalCanvas.g:1213:1: ruleShapeAnchorElement returns [EObject current=null] : (otherlv_0= 'shape' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleShapeAnchorElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCanvas.g:1219:2: ( (otherlv_0= 'shape' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalCanvas.g:1220:2: (otherlv_0= 'shape' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalCanvas.g:1220:2: (otherlv_0= 'shape' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalCanvas.g:1221:3: otherlv_0= 'shape' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getShapeAnchorElementAccess().getShapeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeAnchorElementAccess().getColonKeyword_1());
            		
            // InternalCanvas.g:1229:3: ( (otherlv_2= RULE_ID ) )
            // InternalCanvas.g:1230:4: (otherlv_2= RULE_ID )
            {
            // InternalCanvas.g:1230:4: (otherlv_2= RULE_ID )
            // InternalCanvas.g:1231:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeAnchorElementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getShapeAnchorElementAccess().getElementShapeCrossReference_2_0());
            				

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
    // InternalCanvas.g:1246:1: entryRuleConnectorAnchorElement returns [EObject current=null] : iv_ruleConnectorAnchorElement= ruleConnectorAnchorElement EOF ;
    public final EObject entryRuleConnectorAnchorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorAnchorElement = null;


        try {
            // InternalCanvas.g:1246:63: (iv_ruleConnectorAnchorElement= ruleConnectorAnchorElement EOF )
            // InternalCanvas.g:1247:2: iv_ruleConnectorAnchorElement= ruleConnectorAnchorElement EOF
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
    // InternalCanvas.g:1253:1: ruleConnectorAnchorElement returns [EObject current=null] : (otherlv_0= 'connector' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleConnectorAnchorElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCanvas.g:1259:2: ( (otherlv_0= 'connector' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalCanvas.g:1260:2: (otherlv_0= 'connector' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalCanvas.g:1260:2: (otherlv_0= 'connector' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalCanvas.g:1261:3: otherlv_0= 'connector' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAnchorElementAccess().getConnectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectorAnchorElementAccess().getColonKeyword_1());
            		
            // InternalCanvas.g:1269:3: ( (otherlv_2= RULE_ID ) )
            // InternalCanvas.g:1270:4: (otherlv_2= RULE_ID )
            {
            // InternalCanvas.g:1270:4: (otherlv_2= RULE_ID )
            // InternalCanvas.g:1271:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorAnchorElementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getConnectorAnchorElementAccess().getElementConnectorCrossReference_2_0());
            				

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


    // $ANTLR start "entryRulePolyline"
    // InternalCanvas.g:1286:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // InternalCanvas.g:1286:49: (iv_rulePolyline= rulePolyline EOF )
            // InternalCanvas.g:1287:2: iv_rulePolyline= rulePolyline EOF
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
    // InternalCanvas.g:1293:1: rulePolyline returns [EObject current=null] : ( () otherlv_1= 'polyline' otherlv_2= ':' ( (lv_segments_3_0= ruleSegment ) )* ) ;
    public final EObject rulePolyline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_segments_3_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1299:2: ( ( () otherlv_1= 'polyline' otherlv_2= ':' ( (lv_segments_3_0= ruleSegment ) )* ) )
            // InternalCanvas.g:1300:2: ( () otherlv_1= 'polyline' otherlv_2= ':' ( (lv_segments_3_0= ruleSegment ) )* )
            {
            // InternalCanvas.g:1300:2: ( () otherlv_1= 'polyline' otherlv_2= ':' ( (lv_segments_3_0= ruleSegment ) )* )
            // InternalCanvas.g:1301:3: () otherlv_1= 'polyline' otherlv_2= ':' ( (lv_segments_3_0= ruleSegment ) )*
            {
            // InternalCanvas.g:1301:3: ()
            // InternalCanvas.g:1302:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPolylineAccess().getPolylineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPolylineAccess().getPolylineKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getPolylineAccess().getColonKeyword_2());
            		
            // InternalCanvas.g:1316:3: ( (lv_segments_3_0= ruleSegment ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCanvas.g:1317:4: (lv_segments_3_0= ruleSegment )
            	    {
            	    // InternalCanvas.g:1317:4: (lv_segments_3_0= ruleSegment )
            	    // InternalCanvas.g:1318:5: lv_segments_3_0= ruleSegment
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getSegmentsSegmentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_segments_3_0=ruleSegment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolylineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"segments",
            	    						lv_segments_3_0,
            	    						"org.xtuml.canvas.language.Canvas.Segment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCanvas.g:1339:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // InternalCanvas.g:1339:48: (iv_ruleSegment= ruleSegment EOF )
            // InternalCanvas.g:1340:2: iv_ruleSegment= ruleSegment EOF
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
    // InternalCanvas.g:1346:1: ruleSegment returns [EObject current=null] : (otherlv_0= 'segment' otherlv_1= ':' otherlv_2= 'start' otherlv_3= ':' ( (lv_startPoint_4_0= rulePoint ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_endPoint_7_0= rulePoint ) ) ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_startPoint_4_0 = null;

        EObject lv_endPoint_7_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1352:2: ( (otherlv_0= 'segment' otherlv_1= ':' otherlv_2= 'start' otherlv_3= ':' ( (lv_startPoint_4_0= rulePoint ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_endPoint_7_0= rulePoint ) ) ) )
            // InternalCanvas.g:1353:2: (otherlv_0= 'segment' otherlv_1= ':' otherlv_2= 'start' otherlv_3= ':' ( (lv_startPoint_4_0= rulePoint ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_endPoint_7_0= rulePoint ) ) )
            {
            // InternalCanvas.g:1353:2: (otherlv_0= 'segment' otherlv_1= ':' otherlv_2= 'start' otherlv_3= ':' ( (lv_startPoint_4_0= rulePoint ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_endPoint_7_0= rulePoint ) ) )
            // InternalCanvas.g:1354:3: otherlv_0= 'segment' otherlv_1= ':' otherlv_2= 'start' otherlv_3= ':' ( (lv_startPoint_4_0= rulePoint ) ) otherlv_5= 'end' otherlv_6= ':' ( (lv_endPoint_7_0= rulePoint ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSegmentAccess().getSegmentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getSegmentAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSegmentAccess().getStartKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSegmentAccess().getColonKeyword_3());
            		
            // InternalCanvas.g:1370:3: ( (lv_startPoint_4_0= rulePoint ) )
            // InternalCanvas.g:1371:4: (lv_startPoint_4_0= rulePoint )
            {
            // InternalCanvas.g:1371:4: (lv_startPoint_4_0= rulePoint )
            // InternalCanvas.g:1372:5: lv_startPoint_4_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_startPoint_4_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSegmentRule());
            					}
            					set(
            						current,
            						"startPoint",
            						lv_startPoint_4_0,
            						"org.xtuml.canvas.language.Canvas.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSegmentAccess().getEndKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getSegmentAccess().getColonKeyword_6());
            		
            // InternalCanvas.g:1397:3: ( (lv_endPoint_7_0= rulePoint ) )
            // InternalCanvas.g:1398:4: (lv_endPoint_7_0= rulePoint )
            {
            // InternalCanvas.g:1398:4: (lv_endPoint_7_0= rulePoint )
            // InternalCanvas.g:1399:5: lv_endPoint_7_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_endPoint_7_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSegmentRule());
            					}
            					set(
            						current,
            						"endPoint",
            						lv_endPoint_7_0,
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
    // InternalCanvas.g:1420:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalCanvas.g:1420:46: (iv_rulePoint= rulePoint EOF )
            // InternalCanvas.g:1421:2: iv_rulePoint= rulePoint EOF
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
    // InternalCanvas.g:1427:1: rulePoint returns [EObject current=null] : (otherlv_0= 'x' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y' otherlv_4= ':' ( (lv_y_5_0= RULE_INT ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:1433:2: ( (otherlv_0= 'x' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y' otherlv_4= ':' ( (lv_y_5_0= RULE_INT ) ) ) )
            // InternalCanvas.g:1434:2: (otherlv_0= 'x' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y' otherlv_4= ':' ( (lv_y_5_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:1434:2: (otherlv_0= 'x' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y' otherlv_4= ':' ( (lv_y_5_0= RULE_INT ) ) )
            // InternalCanvas.g:1435:3: otherlv_0= 'x' otherlv_1= ':' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= 'y' otherlv_4= ':' ( (lv_y_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getXKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPointAccess().getColonKeyword_1());
            		
            // InternalCanvas.g:1443:3: ( (lv_x_2_0= RULE_INT ) )
            // InternalCanvas.g:1444:4: (lv_x_2_0= RULE_INT )
            {
            // InternalCanvas.g:1444:4: (lv_x_2_0= RULE_INT )
            // InternalCanvas.g:1445:5: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_x_2_0, grammarAccess.getPointAccess().getXINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPointAccess().getYKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getColonKeyword_4());
            		
            // InternalCanvas.g:1469:3: ( (lv_y_5_0= RULE_INT ) )
            // InternalCanvas.g:1470:4: (lv_y_5_0= RULE_INT )
            {
            // InternalCanvas.g:1470:4: (lv_y_5_0= RULE_INT )
            // InternalCanvas.g:1471:5: lv_y_5_0= RULE_INT
            {
            lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_5_0, grammarAccess.getPointAccess().getYINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_5_0,
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


    // $ANTLR start "entryRulePointDefinition"
    // InternalCanvas.g:1491:1: entryRulePointDefinition returns [EObject current=null] : iv_rulePointDefinition= rulePointDefinition EOF ;
    public final EObject entryRulePointDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointDefinition = null;


        try {
            // InternalCanvas.g:1491:56: (iv_rulePointDefinition= rulePointDefinition EOF )
            // InternalCanvas.g:1492:2: iv_rulePointDefinition= rulePointDefinition EOF
            {
             newCompositeNode(grammarAccess.getPointDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointDefinition=rulePointDefinition();

            state._fsp--;

             current =iv_rulePointDefinition; 
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
    // $ANTLR end "entryRulePointDefinition"


    // $ANTLR start "rulePointDefinition"
    // InternalCanvas.g:1498:1: rulePointDefinition returns [EObject current=null] : (otherlv_0= 'point' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) ) ) ;
    public final EObject rulePointDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_y_7_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:1504:2: ( (otherlv_0= 'point' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) ) ) )
            // InternalCanvas.g:1505:2: (otherlv_0= 'point' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:1505:2: (otherlv_0= 'point' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) ) )
            // InternalCanvas.g:1506:3: otherlv_0= 'point' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPointDefinitionAccess().getPointKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPointDefinitionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPointDefinitionAccess().getXKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPointDefinitionAccess().getColonKeyword_3());
            		
            // InternalCanvas.g:1522:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalCanvas.g:1523:4: (lv_x_4_0= RULE_INT )
            {
            // InternalCanvas.g:1523:4: (lv_x_4_0= RULE_INT )
            // InternalCanvas.g:1524:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_x_4_0, grammarAccess.getPointDefinitionAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getPointDefinitionAccess().getYKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getPointDefinitionAccess().getColonKeyword_6());
            		
            // InternalCanvas.g:1548:3: ( (lv_y_7_0= RULE_INT ) )
            // InternalCanvas.g:1549:4: (lv_y_7_0= RULE_INT )
            {
            // InternalCanvas.g:1549:4: (lv_y_7_0= RULE_INT )
            // InternalCanvas.g:1550:5: lv_y_7_0= RULE_INT
            {
            lv_y_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_7_0, grammarAccess.getPointDefinitionAccess().getYINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_7_0,
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
    // $ANTLR end "rulePointDefinition"


    // $ANTLR start "entryRuleBounds"
    // InternalCanvas.g:1570:1: entryRuleBounds returns [EObject current=null] : iv_ruleBounds= ruleBounds EOF ;
    public final EObject entryRuleBounds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBounds = null;


        try {
            // InternalCanvas.g:1570:47: (iv_ruleBounds= ruleBounds EOF )
            // InternalCanvas.g:1571:2: iv_ruleBounds= ruleBounds EOF
            {
             newCompositeNode(grammarAccess.getBoundsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBounds=ruleBounds();

            state._fsp--;

             current =iv_ruleBounds; 
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
    // $ANTLR end "entryRuleBounds"


    // $ANTLR start "ruleBounds"
    // InternalCanvas.g:1577:1: ruleBounds returns [EObject current=null] : (otherlv_0= 'bounds' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= 'width' otherlv_9= ':' ( (lv_w_10_0= RULE_INT ) ) otherlv_11= 'height' otherlv_12= ':' ( (lv_h_13_0= RULE_INT ) ) ) ;
    public final EObject ruleBounds() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_y_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_w_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_h_13_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:1583:2: ( (otherlv_0= 'bounds' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= 'width' otherlv_9= ':' ( (lv_w_10_0= RULE_INT ) ) otherlv_11= 'height' otherlv_12= ':' ( (lv_h_13_0= RULE_INT ) ) ) )
            // InternalCanvas.g:1584:2: (otherlv_0= 'bounds' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= 'width' otherlv_9= ':' ( (lv_w_10_0= RULE_INT ) ) otherlv_11= 'height' otherlv_12= ':' ( (lv_h_13_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:1584:2: (otherlv_0= 'bounds' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= 'width' otherlv_9= ':' ( (lv_w_10_0= RULE_INT ) ) otherlv_11= 'height' otherlv_12= ':' ( (lv_h_13_0= RULE_INT ) ) )
            // InternalCanvas.g:1585:3: otherlv_0= 'bounds' otherlv_1= ':' otherlv_2= 'x' otherlv_3= ':' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' otherlv_6= ':' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= 'width' otherlv_9= ':' ( (lv_w_10_0= RULE_INT ) ) otherlv_11= 'height' otherlv_12= ':' ( (lv_h_13_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundsAccess().getBoundsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundsAccess().getXKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBoundsAccess().getColonKeyword_3());
            		
            // InternalCanvas.g:1601:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalCanvas.g:1602:4: (lv_x_4_0= RULE_INT )
            {
            // InternalCanvas.g:1602:4: (lv_x_4_0= RULE_INT )
            // InternalCanvas.g:1603:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_x_4_0, grammarAccess.getBoundsAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getBoundsAccess().getYKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getBoundsAccess().getColonKeyword_6());
            		
            // InternalCanvas.g:1627:3: ( (lv_y_7_0= RULE_INT ) )
            // InternalCanvas.g:1628:4: (lv_y_7_0= RULE_INT )
            {
            // InternalCanvas.g:1628:4: (lv_y_7_0= RULE_INT )
            // InternalCanvas.g:1629:5: lv_y_7_0= RULE_INT
            {
            lv_y_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_y_7_0, grammarAccess.getBoundsAccess().getYINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getBoundsAccess().getWidthKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getBoundsAccess().getColonKeyword_9());
            		
            // InternalCanvas.g:1653:3: ( (lv_w_10_0= RULE_INT ) )
            // InternalCanvas.g:1654:4: (lv_w_10_0= RULE_INT )
            {
            // InternalCanvas.g:1654:4: (lv_w_10_0= RULE_INT )
            // InternalCanvas.g:1655:5: lv_w_10_0= RULE_INT
            {
            lv_w_10_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_w_10_0, grammarAccess.getBoundsAccess().getWINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"w",
            						lv_w_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getBoundsAccess().getHeightKeyword_11());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getBoundsAccess().getColonKeyword_12());
            		
            // InternalCanvas.g:1679:3: ( (lv_h_13_0= RULE_INT ) )
            // InternalCanvas.g:1680:4: (lv_h_13_0= RULE_INT )
            {
            // InternalCanvas.g:1680:4: (lv_h_13_0= RULE_INT )
            // InternalCanvas.g:1681:5: lv_h_13_0= RULE_INT
            {
            lv_h_13_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_h_13_0, grammarAccess.getBoundsAccess().getHINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"h",
            						lv_h_13_0,
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
    // $ANTLR end "ruleBounds"


    // $ANTLR start "entryRuleTypeLabel"
    // InternalCanvas.g:1701:1: entryRuleTypeLabel returns [String current=null] : iv_ruleTypeLabel= ruleTypeLabel EOF ;
    public final String entryRuleTypeLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLabel = null;


        try {
            // InternalCanvas.g:1701:49: (iv_ruleTypeLabel= ruleTypeLabel EOF )
            // InternalCanvas.g:1702:2: iv_ruleTypeLabel= ruleTypeLabel EOF
            {
             newCompositeNode(grammarAccess.getTypeLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeLabel=ruleTypeLabel();

            state._fsp--;

             current =iv_ruleTypeLabel.getText(); 
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
    // $ANTLR end "entryRuleTypeLabel"


    // $ANTLR start "ruleTypeLabel"
    // InternalCanvas.g:1708:1: ruleTypeLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OOAType_0= ruleOOAType ;
    public final AntlrDatatypeRuleToken ruleTypeLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_OOAType_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1714:2: (this_OOAType_0= ruleOOAType )
            // InternalCanvas.g:1715:2: this_OOAType_0= ruleOOAType
            {

            		newCompositeNode(grammarAccess.getTypeLabelAccess().getOOATypeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OOAType_0=ruleOOAType();

            state._fsp--;


            		current.merge(this_OOAType_0);
            	

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
    // $ANTLR end "ruleTypeLabel"


    // $ANTLR start "entryRuleOOAType"
    // InternalCanvas.g:1728:1: entryRuleOOAType returns [String current=null] : iv_ruleOOAType= ruleOOAType EOF ;
    public final String entryRuleOOAType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOOAType = null;


        try {
            // InternalCanvas.g:1728:47: (iv_ruleOOAType= ruleOOAType EOF )
            // InternalCanvas.g:1729:2: iv_ruleOOAType= ruleOOAType EOF
            {
             newCompositeNode(grammarAccess.getOOATypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOOAType=ruleOOAType();

            state._fsp--;

             current =iv_ruleOOAType.getText(); 
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
    // $ANTLR end "entryRuleOOAType"


    // $ANTLR start "ruleOOAType"
    // InternalCanvas.g:1735:1: ruleOOAType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'access_path' | kw= 'association' | kw= 'associative_link' | kw= 'class' | kw= 'communication_path' | kw= 'data_type' | kw= 'derived_access_path' | kw= 'derived_communication_path' | kw= 'ee' | kw= 'enumeration_data_type' | kw= 'imported_class' | kw= 'none' | kw= 'state' | kw= 'state_machine' | kw= 'subsystem' | kw= 'transition' | kw= 'user_data_type' | kw= 'subtype' | kw= 'supertype' | kw= 'creation_transition' | kw= 'sequence' | kw= 'lifeline' | kw= 'timing_mark' | kw= 'time_span' | kw= 'synchronous_message' | kw= 'class_instance_participant' | kw= 'external_entity_participant' | kw= 'class_participant' | kw= 'actor' | kw= 'asynchronous_message' | kw= 'return_message' | kw= 'communication' | kw= 'communication_link' | kw= 'communication_return_message' | kw= 'communication_asynchronous_message' | kw= 'communication_synchronous_message' | kw= 'use_case' | kw= 'use_case_diagram' | kw= 'use_case_binary_association' | kw= 'generalization' | kw= 'include' | kw= 'extend' | kw= 'forkJoin' | kw= 'activity' | kw= 'initial_node' | kw= 'activity_edge' | kw= 'activity_final_node' | kw= 'flow_final_node' | kw= 'generic_action' | kw= 'decision_merge_node' | kw= 'object_node' | kw= 'accept_event_action' | kw= 'send_signal_action' | kw= 'accept_time_event_action' | kw= 'partition' | kw= 'component' | kw= 'provided_interface' | kw= 'required_interface' | kw= 'interface' | kw= 'system_model' | kw= 'structured_data_type' | kw= 'component_reference' | kw= 'component_diagram' | kw= 'delegation' | kw= 'component_container' | kw= 'imported_provided_interface' | kw= 'imported_required_interface' | kw= 'component_participant' | kw= 'package' | kw= 'constant_specification' | kw= 'package_participant' | kw= 'shape' | kw= 'connector' | kw= 'diagram' | kw= 'exception' | kw= 'satisfaction' | kw= 'deployment' ) ;
    public final AntlrDatatypeRuleToken ruleOOAType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCanvas.g:1741:2: ( (kw= 'access_path' | kw= 'association' | kw= 'associative_link' | kw= 'class' | kw= 'communication_path' | kw= 'data_type' | kw= 'derived_access_path' | kw= 'derived_communication_path' | kw= 'ee' | kw= 'enumeration_data_type' | kw= 'imported_class' | kw= 'none' | kw= 'state' | kw= 'state_machine' | kw= 'subsystem' | kw= 'transition' | kw= 'user_data_type' | kw= 'subtype' | kw= 'supertype' | kw= 'creation_transition' | kw= 'sequence' | kw= 'lifeline' | kw= 'timing_mark' | kw= 'time_span' | kw= 'synchronous_message' | kw= 'class_instance_participant' | kw= 'external_entity_participant' | kw= 'class_participant' | kw= 'actor' | kw= 'asynchronous_message' | kw= 'return_message' | kw= 'communication' | kw= 'communication_link' | kw= 'communication_return_message' | kw= 'communication_asynchronous_message' | kw= 'communication_synchronous_message' | kw= 'use_case' | kw= 'use_case_diagram' | kw= 'use_case_binary_association' | kw= 'generalization' | kw= 'include' | kw= 'extend' | kw= 'forkJoin' | kw= 'activity' | kw= 'initial_node' | kw= 'activity_edge' | kw= 'activity_final_node' | kw= 'flow_final_node' | kw= 'generic_action' | kw= 'decision_merge_node' | kw= 'object_node' | kw= 'accept_event_action' | kw= 'send_signal_action' | kw= 'accept_time_event_action' | kw= 'partition' | kw= 'component' | kw= 'provided_interface' | kw= 'required_interface' | kw= 'interface' | kw= 'system_model' | kw= 'structured_data_type' | kw= 'component_reference' | kw= 'component_diagram' | kw= 'delegation' | kw= 'component_container' | kw= 'imported_provided_interface' | kw= 'imported_required_interface' | kw= 'component_participant' | kw= 'package' | kw= 'constant_specification' | kw= 'package_participant' | kw= 'shape' | kw= 'connector' | kw= 'diagram' | kw= 'exception' | kw= 'satisfaction' | kw= 'deployment' ) )
            // InternalCanvas.g:1742:2: (kw= 'access_path' | kw= 'association' | kw= 'associative_link' | kw= 'class' | kw= 'communication_path' | kw= 'data_type' | kw= 'derived_access_path' | kw= 'derived_communication_path' | kw= 'ee' | kw= 'enumeration_data_type' | kw= 'imported_class' | kw= 'none' | kw= 'state' | kw= 'state_machine' | kw= 'subsystem' | kw= 'transition' | kw= 'user_data_type' | kw= 'subtype' | kw= 'supertype' | kw= 'creation_transition' | kw= 'sequence' | kw= 'lifeline' | kw= 'timing_mark' | kw= 'time_span' | kw= 'synchronous_message' | kw= 'class_instance_participant' | kw= 'external_entity_participant' | kw= 'class_participant' | kw= 'actor' | kw= 'asynchronous_message' | kw= 'return_message' | kw= 'communication' | kw= 'communication_link' | kw= 'communication_return_message' | kw= 'communication_asynchronous_message' | kw= 'communication_synchronous_message' | kw= 'use_case' | kw= 'use_case_diagram' | kw= 'use_case_binary_association' | kw= 'generalization' | kw= 'include' | kw= 'extend' | kw= 'forkJoin' | kw= 'activity' | kw= 'initial_node' | kw= 'activity_edge' | kw= 'activity_final_node' | kw= 'flow_final_node' | kw= 'generic_action' | kw= 'decision_merge_node' | kw= 'object_node' | kw= 'accept_event_action' | kw= 'send_signal_action' | kw= 'accept_time_event_action' | kw= 'partition' | kw= 'component' | kw= 'provided_interface' | kw= 'required_interface' | kw= 'interface' | kw= 'system_model' | kw= 'structured_data_type' | kw= 'component_reference' | kw= 'component_diagram' | kw= 'delegation' | kw= 'component_container' | kw= 'imported_provided_interface' | kw= 'imported_required_interface' | kw= 'component_participant' | kw= 'package' | kw= 'constant_specification' | kw= 'package_participant' | kw= 'shape' | kw= 'connector' | kw= 'diagram' | kw= 'exception' | kw= 'satisfaction' | kw= 'deployment' )
            {
            // InternalCanvas.g:1742:2: (kw= 'access_path' | kw= 'association' | kw= 'associative_link' | kw= 'class' | kw= 'communication_path' | kw= 'data_type' | kw= 'derived_access_path' | kw= 'derived_communication_path' | kw= 'ee' | kw= 'enumeration_data_type' | kw= 'imported_class' | kw= 'none' | kw= 'state' | kw= 'state_machine' | kw= 'subsystem' | kw= 'transition' | kw= 'user_data_type' | kw= 'subtype' | kw= 'supertype' | kw= 'creation_transition' | kw= 'sequence' | kw= 'lifeline' | kw= 'timing_mark' | kw= 'time_span' | kw= 'synchronous_message' | kw= 'class_instance_participant' | kw= 'external_entity_participant' | kw= 'class_participant' | kw= 'actor' | kw= 'asynchronous_message' | kw= 'return_message' | kw= 'communication' | kw= 'communication_link' | kw= 'communication_return_message' | kw= 'communication_asynchronous_message' | kw= 'communication_synchronous_message' | kw= 'use_case' | kw= 'use_case_diagram' | kw= 'use_case_binary_association' | kw= 'generalization' | kw= 'include' | kw= 'extend' | kw= 'forkJoin' | kw= 'activity' | kw= 'initial_node' | kw= 'activity_edge' | kw= 'activity_final_node' | kw= 'flow_final_node' | kw= 'generic_action' | kw= 'decision_merge_node' | kw= 'object_node' | kw= 'accept_event_action' | kw= 'send_signal_action' | kw= 'accept_time_event_action' | kw= 'partition' | kw= 'component' | kw= 'provided_interface' | kw= 'required_interface' | kw= 'interface' | kw= 'system_model' | kw= 'structured_data_type' | kw= 'component_reference' | kw= 'component_diagram' | kw= 'delegation' | kw= 'component_container' | kw= 'imported_provided_interface' | kw= 'imported_required_interface' | kw= 'component_participant' | kw= 'package' | kw= 'constant_specification' | kw= 'package_participant' | kw= 'shape' | kw= 'connector' | kw= 'diagram' | kw= 'exception' | kw= 'satisfaction' | kw= 'deployment' )
            int alt15=77;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt15=1;
                }
                break;
            case 42:
                {
                alt15=2;
                }
                break;
            case 43:
                {
                alt15=3;
                }
                break;
            case 44:
                {
                alt15=4;
                }
                break;
            case 45:
                {
                alt15=5;
                }
                break;
            case 46:
                {
                alt15=6;
                }
                break;
            case 47:
                {
                alt15=7;
                }
                break;
            case 48:
                {
                alt15=8;
                }
                break;
            case 49:
                {
                alt15=9;
                }
                break;
            case 50:
                {
                alt15=10;
                }
                break;
            case 51:
                {
                alt15=11;
                }
                break;
            case 27:
                {
                alt15=12;
                }
                break;
            case 52:
                {
                alt15=13;
                }
                break;
            case 53:
                {
                alt15=14;
                }
                break;
            case 54:
                {
                alt15=15;
                }
                break;
            case 55:
                {
                alt15=16;
                }
                break;
            case 56:
                {
                alt15=17;
                }
                break;
            case 57:
                {
                alt15=18;
                }
                break;
            case 58:
                {
                alt15=19;
                }
                break;
            case 59:
                {
                alt15=20;
                }
                break;
            case 60:
                {
                alt15=21;
                }
                break;
            case 61:
                {
                alt15=22;
                }
                break;
            case 62:
                {
                alt15=23;
                }
                break;
            case 63:
                {
                alt15=24;
                }
                break;
            case 64:
                {
                alt15=25;
                }
                break;
            case 65:
                {
                alt15=26;
                }
                break;
            case 66:
                {
                alt15=27;
                }
                break;
            case 67:
                {
                alt15=28;
                }
                break;
            case 68:
                {
                alt15=29;
                }
                break;
            case 69:
                {
                alt15=30;
                }
                break;
            case 70:
                {
                alt15=31;
                }
                break;
            case 71:
                {
                alt15=32;
                }
                break;
            case 72:
                {
                alt15=33;
                }
                break;
            case 73:
                {
                alt15=34;
                }
                break;
            case 74:
                {
                alt15=35;
                }
                break;
            case 75:
                {
                alt15=36;
                }
                break;
            case 76:
                {
                alt15=37;
                }
                break;
            case 77:
                {
                alt15=38;
                }
                break;
            case 78:
                {
                alt15=39;
                }
                break;
            case 79:
                {
                alt15=40;
                }
                break;
            case 80:
                {
                alt15=41;
                }
                break;
            case 81:
                {
                alt15=42;
                }
                break;
            case 82:
                {
                alt15=43;
                }
                break;
            case 83:
                {
                alt15=44;
                }
                break;
            case 84:
                {
                alt15=45;
                }
                break;
            case 85:
                {
                alt15=46;
                }
                break;
            case 86:
                {
                alt15=47;
                }
                break;
            case 87:
                {
                alt15=48;
                }
                break;
            case 88:
                {
                alt15=49;
                }
                break;
            case 89:
                {
                alt15=50;
                }
                break;
            case 90:
                {
                alt15=51;
                }
                break;
            case 91:
                {
                alt15=52;
                }
                break;
            case 92:
                {
                alt15=53;
                }
                break;
            case 93:
                {
                alt15=54;
                }
                break;
            case 94:
                {
                alt15=55;
                }
                break;
            case 95:
                {
                alt15=56;
                }
                break;
            case 96:
                {
                alt15=57;
                }
                break;
            case 97:
                {
                alt15=58;
                }
                break;
            case 98:
                {
                alt15=59;
                }
                break;
            case 99:
                {
                alt15=60;
                }
                break;
            case 100:
                {
                alt15=61;
                }
                break;
            case 101:
                {
                alt15=62;
                }
                break;
            case 102:
                {
                alt15=63;
                }
                break;
            case 103:
                {
                alt15=64;
                }
                break;
            case 104:
                {
                alt15=65;
                }
                break;
            case 105:
                {
                alt15=66;
                }
                break;
            case 106:
                {
                alt15=67;
                }
                break;
            case 107:
                {
                alt15=68;
                }
                break;
            case 108:
                {
                alt15=69;
                }
                break;
            case 109:
                {
                alt15=70;
                }
                break;
            case 110:
                {
                alt15=71;
                }
                break;
            case 17:
                {
                alt15=72;
                }
                break;
            case 31:
                {
                alt15=73;
                }
                break;
            case 111:
                {
                alt15=74;
                }
                break;
            case 112:
                {
                alt15=75;
                }
                break;
            case 113:
                {
                alt15=76;
                }
                break;
            case 114:
                {
                alt15=77;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalCanvas.g:1743:3: kw= 'access_path'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getAccess_pathKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1749:3: kw= 'association'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getAssociationKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCanvas.g:1755:3: kw= 'associative_link'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getAssociative_linkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCanvas.g:1761:3: kw= 'class'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getClassKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCanvas.g:1767:3: kw= 'communication_path'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getCommunication_pathKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalCanvas.g:1773:3: kw= 'data_type'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getData_typeKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalCanvas.g:1779:3: kw= 'derived_access_path'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getDerived_access_pathKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalCanvas.g:1785:3: kw= 'derived_communication_path'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getDerived_communication_pathKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalCanvas.g:1791:3: kw= 'ee'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getEeKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalCanvas.g:1797:3: kw= 'enumeration_data_type'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getEnumeration_data_typeKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalCanvas.g:1803:3: kw= 'imported_class'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getImported_classKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalCanvas.g:1809:3: kw= 'none'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getNoneKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalCanvas.g:1815:3: kw= 'state'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getStateKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalCanvas.g:1821:3: kw= 'state_machine'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getState_machineKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalCanvas.g:1827:3: kw= 'subsystem'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getSubsystemKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalCanvas.g:1833:3: kw= 'transition'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getTransitionKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalCanvas.g:1839:3: kw= 'user_data_type'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getUser_data_typeKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalCanvas.g:1845:3: kw= 'subtype'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getSubtypeKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalCanvas.g:1851:3: kw= 'supertype'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getSupertypeKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalCanvas.g:1857:3: kw= 'creation_transition'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getCreation_transitionKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalCanvas.g:1863:3: kw= 'sequence'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getSequenceKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalCanvas.g:1869:3: kw= 'lifeline'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getLifelineKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalCanvas.g:1875:3: kw= 'timing_mark'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getTiming_markKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalCanvas.g:1881:3: kw= 'time_span'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getTime_spanKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalCanvas.g:1887:3: kw= 'synchronous_message'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getSynchronous_messageKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalCanvas.g:1893:3: kw= 'class_instance_participant'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getClass_instance_participantKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalCanvas.g:1899:3: kw= 'external_entity_participant'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getExternal_entity_participantKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalCanvas.g:1905:3: kw= 'class_participant'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getClass_participantKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalCanvas.g:1911:3: kw= 'actor'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getActorKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalCanvas.g:1917:3: kw= 'asynchronous_message'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getAsynchronous_messageKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalCanvas.g:1923:3: kw= 'return_message'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getReturn_messageKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalCanvas.g:1929:3: kw= 'communication'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getCommunicationKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalCanvas.g:1935:3: kw= 'communication_link'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getCommunication_linkKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalCanvas.g:1941:3: kw= 'communication_return_message'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getCommunication_return_messageKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalCanvas.g:1947:3: kw= 'communication_asynchronous_message'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getCommunication_asynchronous_messageKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalCanvas.g:1953:3: kw= 'communication_synchronous_message'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getCommunication_synchronous_messageKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalCanvas.g:1959:3: kw= 'use_case'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getUse_caseKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalCanvas.g:1965:3: kw= 'use_case_diagram'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getUse_case_diagramKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalCanvas.g:1971:3: kw= 'use_case_binary_association'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getUse_case_binary_associationKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalCanvas.g:1977:3: kw= 'generalization'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getGeneralizationKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalCanvas.g:1983:3: kw= 'include'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getIncludeKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalCanvas.g:1989:3: kw= 'extend'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getExtendKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalCanvas.g:1995:3: kw= 'forkJoin'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getForkJoinKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalCanvas.g:2001:3: kw= 'activity'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getActivityKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalCanvas.g:2007:3: kw= 'initial_node'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getInitial_nodeKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalCanvas.g:2013:3: kw= 'activity_edge'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getActivity_edgeKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalCanvas.g:2019:3: kw= 'activity_final_node'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getActivity_final_nodeKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalCanvas.g:2025:3: kw= 'flow_final_node'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getFlow_final_nodeKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalCanvas.g:2031:3: kw= 'generic_action'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getGeneric_actionKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalCanvas.g:2037:3: kw= 'decision_merge_node'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getDecision_merge_nodeKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalCanvas.g:2043:3: kw= 'object_node'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getObject_nodeKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalCanvas.g:2049:3: kw= 'accept_event_action'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getAccept_event_actionKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalCanvas.g:2055:3: kw= 'send_signal_action'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getSend_signal_actionKeyword_52());
                    		

                    }
                    break;
                case 54 :
                    // InternalCanvas.g:2061:3: kw= 'accept_time_event_action'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getAccept_time_event_actionKeyword_53());
                    		

                    }
                    break;
                case 55 :
                    // InternalCanvas.g:2067:3: kw= 'partition'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getPartitionKeyword_54());
                    		

                    }
                    break;
                case 56 :
                    // InternalCanvas.g:2073:3: kw= 'component'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getComponentKeyword_55());
                    		

                    }
                    break;
                case 57 :
                    // InternalCanvas.g:2079:3: kw= 'provided_interface'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getProvided_interfaceKeyword_56());
                    		

                    }
                    break;
                case 58 :
                    // InternalCanvas.g:2085:3: kw= 'required_interface'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getRequired_interfaceKeyword_57());
                    		

                    }
                    break;
                case 59 :
                    // InternalCanvas.g:2091:3: kw= 'interface'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getInterfaceKeyword_58());
                    		

                    }
                    break;
                case 60 :
                    // InternalCanvas.g:2097:3: kw= 'system_model'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getSystem_modelKeyword_59());
                    		

                    }
                    break;
                case 61 :
                    // InternalCanvas.g:2103:3: kw= 'structured_data_type'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getStructured_data_typeKeyword_60());
                    		

                    }
                    break;
                case 62 :
                    // InternalCanvas.g:2109:3: kw= 'component_reference'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getComponent_referenceKeyword_61());
                    		

                    }
                    break;
                case 63 :
                    // InternalCanvas.g:2115:3: kw= 'component_diagram'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getComponent_diagramKeyword_62());
                    		

                    }
                    break;
                case 64 :
                    // InternalCanvas.g:2121:3: kw= 'delegation'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getDelegationKeyword_63());
                    		

                    }
                    break;
                case 65 :
                    // InternalCanvas.g:2127:3: kw= 'component_container'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getComponent_containerKeyword_64());
                    		

                    }
                    break;
                case 66 :
                    // InternalCanvas.g:2133:3: kw= 'imported_provided_interface'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getImported_provided_interfaceKeyword_65());
                    		

                    }
                    break;
                case 67 :
                    // InternalCanvas.g:2139:3: kw= 'imported_required_interface'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getImported_required_interfaceKeyword_66());
                    		

                    }
                    break;
                case 68 :
                    // InternalCanvas.g:2145:3: kw= 'component_participant'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getComponent_participantKeyword_67());
                    		

                    }
                    break;
                case 69 :
                    // InternalCanvas.g:2151:3: kw= 'package'
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getPackageKeyword_68());
                    		

                    }
                    break;
                case 70 :
                    // InternalCanvas.g:2157:3: kw= 'constant_specification'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getConstant_specificationKeyword_69());
                    		

                    }
                    break;
                case 71 :
                    // InternalCanvas.g:2163:3: kw= 'package_participant'
                    {
                    kw=(Token)match(input,110,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getPackage_participantKeyword_70());
                    		

                    }
                    break;
                case 72 :
                    // InternalCanvas.g:2169:3: kw= 'shape'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getShapeKeyword_71());
                    		

                    }
                    break;
                case 73 :
                    // InternalCanvas.g:2175:3: kw= 'connector'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getConnectorKeyword_72());
                    		

                    }
                    break;
                case 74 :
                    // InternalCanvas.g:2181:3: kw= 'diagram'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getDiagramKeyword_73());
                    		

                    }
                    break;
                case 75 :
                    // InternalCanvas.g:2187:3: kw= 'exception'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getExceptionKeyword_74());
                    		

                    }
                    break;
                case 76 :
                    // InternalCanvas.g:2193:3: kw= 'satisfaction'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getSatisfactionKeyword_75());
                    		

                    }
                    break;
                case 77 :
                    // InternalCanvas.g:2199:3: kw= 'deployment'
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOOATypeAccess().getDeploymentKeyword_76());
                    		

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
    // $ANTLR end "ruleOOAType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040012002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFFFFFE0088020000L,0x0007FFFFFFFFFFFFL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080020002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});

}