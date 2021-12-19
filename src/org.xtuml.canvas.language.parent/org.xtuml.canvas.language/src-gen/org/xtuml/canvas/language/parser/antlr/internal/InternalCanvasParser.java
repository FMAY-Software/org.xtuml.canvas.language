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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'render'", "':'", "'render:'", "'properties'", "'properties:'", "'viewport'", "'viewport:'", "'zoom'", "'zoom:'", "'shapes'", "'shapes:'", "'shape'", "'shape:'", "'container'", "'texts'", "'texts:'", "'text'", "'text:'", "'where'", "'where:'", "'start'", "'end'", "'middle'", "'end_fixed'", "'start_fixed'", "'none'", "'floating'", "'additional'", "'connectors'", "'connectors:'", "'connector'", "'connector:'", "'anchors'", "'anchors:'", "'start:'", "'end:'", "'polyline'", "'polyline:'", "'segment'", "'segment:'", "'x'", "'y'", "'point'", "'point:'", "'rectangle'", "'rectangle:'", "'width'", "'height'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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

            if ( ((LA1_0>=14 && LA1_0<=15)) ) {
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

                if ( ((LA2_0>=20 && LA2_0<=21)||(LA2_0>=39 && LA2_0<=40)) ) {
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
    // InternalCanvas.g:147:1: ruleModelRender returns [EObject current=null] : ( ( (otherlv_0= 'render' otherlv_1= ':' ) | otherlv_2= 'render:' ) ( (lv_importURI_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleModelRender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_importURI_3_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:153:2: ( ( ( (otherlv_0= 'render' otherlv_1= ':' ) | otherlv_2= 'render:' ) ( (lv_importURI_3_0= RULE_STRING ) ) ) )
            // InternalCanvas.g:154:2: ( ( (otherlv_0= 'render' otherlv_1= ':' ) | otherlv_2= 'render:' ) ( (lv_importURI_3_0= RULE_STRING ) ) )
            {
            // InternalCanvas.g:154:2: ( ( (otherlv_0= 'render' otherlv_1= ':' ) | otherlv_2= 'render:' ) ( (lv_importURI_3_0= RULE_STRING ) ) )
            // InternalCanvas.g:155:3: ( (otherlv_0= 'render' otherlv_1= ':' ) | otherlv_2= 'render:' ) ( (lv_importURI_3_0= RULE_STRING ) )
            {
            // InternalCanvas.g:155:3: ( (otherlv_0= 'render' otherlv_1= ':' ) | otherlv_2= 'render:' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCanvas.g:156:4: (otherlv_0= 'render' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:156:4: (otherlv_0= 'render' otherlv_1= ':' )
                    // InternalCanvas.g:157:5: otherlv_0= 'render' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getModelRenderAccess().getRenderKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_6); 

                    					newLeafNode(otherlv_1, grammarAccess.getModelRenderAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:167:4: otherlv_2= 'render:'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelRenderAccess().getRenderKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:172:3: ( (lv_importURI_3_0= RULE_STRING ) )
            // InternalCanvas.g:173:4: (lv_importURI_3_0= RULE_STRING )
            {
            // InternalCanvas.g:173:4: (lv_importURI_3_0= RULE_STRING )
            // InternalCanvas.g:174:5: lv_importURI_3_0= RULE_STRING
            {
            lv_importURI_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_3_0, grammarAccess.getModelRenderAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRenderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_3_0,
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
    // InternalCanvas.g:194:1: entryRuleModelProperties returns [EObject current=null] : iv_ruleModelProperties= ruleModelProperties EOF ;
    public final EObject entryRuleModelProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperties = null;


        try {
            // InternalCanvas.g:194:56: (iv_ruleModelProperties= ruleModelProperties EOF )
            // InternalCanvas.g:195:2: iv_ruleModelProperties= ruleModelProperties EOF
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
    // InternalCanvas.g:201:1: ruleModelProperties returns [EObject current=null] : ( ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) ( (otherlv_7= 'zoom' otherlv_8= ':' ) | otherlv_9= 'zoom:' ) ( (lv_zoom_10_0= RULE_INT ) ) ) ;
    public final EObject ruleModelProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_zoom_10_0=null;
        EObject lv_point_6_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:207:2: ( ( ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) ( (otherlv_7= 'zoom' otherlv_8= ':' ) | otherlv_9= 'zoom:' ) ( (lv_zoom_10_0= RULE_INT ) ) ) )
            // InternalCanvas.g:208:2: ( ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) ( (otherlv_7= 'zoom' otherlv_8= ':' ) | otherlv_9= 'zoom:' ) ( (lv_zoom_10_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:208:2: ( ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) ( (otherlv_7= 'zoom' otherlv_8= ':' ) | otherlv_9= 'zoom:' ) ( (lv_zoom_10_0= RULE_INT ) ) )
            // InternalCanvas.g:209:3: ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' ) ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' ) ( (lv_point_6_0= rulePoint ) ) ( (otherlv_7= 'zoom' otherlv_8= ':' ) | otherlv_9= 'zoom:' ) ( (lv_zoom_10_0= RULE_INT ) )
            {
            // InternalCanvas.g:209:3: ( (otherlv_0= 'properties' otherlv_1= ':' ) | otherlv_2= 'properties:' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCanvas.g:210:4: (otherlv_0= 'properties' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:210:4: (otherlv_0= 'properties' otherlv_1= ':' )
                    // InternalCanvas.g:211:5: otherlv_0= 'properties' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_7); 

                    					newLeafNode(otherlv_1, grammarAccess.getModelPropertiesAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:221:4: otherlv_2= 'properties:'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:226:3: ( (otherlv_3= 'viewport' otherlv_4= ':' ) | otherlv_5= 'viewport:' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCanvas.g:227:4: (otherlv_3= 'viewport' otherlv_4= ':' )
                    {
                    // InternalCanvas.g:227:4: (otherlv_3= 'viewport' otherlv_4= ':' )
                    // InternalCanvas.g:228:5: otherlv_3= 'viewport' otherlv_4= ':'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_0_0());
                    				
                    otherlv_4=(Token)match(input,12,FOLLOW_8); 

                    					newLeafNode(otherlv_4, grammarAccess.getModelPropertiesAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:238:4: otherlv_5= 'viewport:'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:243:3: ( (lv_point_6_0= rulePoint ) )
            // InternalCanvas.g:244:4: (lv_point_6_0= rulePoint )
            {
            // InternalCanvas.g:244:4: (lv_point_6_0= rulePoint )
            // InternalCanvas.g:245:5: lv_point_6_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getModelPropertiesAccess().getPointPointParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalCanvas.g:262:3: ( (otherlv_7= 'zoom' otherlv_8= ':' ) | otherlv_9= 'zoom:' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCanvas.g:263:4: (otherlv_7= 'zoom' otherlv_8= ':' )
                    {
                    // InternalCanvas.g:263:4: (otherlv_7= 'zoom' otherlv_8= ':' )
                    // InternalCanvas.g:264:5: otherlv_7= 'zoom' otherlv_8= ':'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_5); 

                    					newLeafNode(otherlv_7, grammarAccess.getModelPropertiesAccess().getZoomKeyword_3_0_0());
                    				
                    otherlv_8=(Token)match(input,12,FOLLOW_10); 

                    					newLeafNode(otherlv_8, grammarAccess.getModelPropertiesAccess().getColonKeyword_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:274:4: otherlv_9= 'zoom:'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelPropertiesAccess().getZoomKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:279:3: ( (lv_zoom_10_0= RULE_INT ) )
            // InternalCanvas.g:280:4: (lv_zoom_10_0= RULE_INT )
            {
            // InternalCanvas.g:280:4: (lv_zoom_10_0= RULE_INT )
            // InternalCanvas.g:281:5: lv_zoom_10_0= RULE_INT
            {
            lv_zoom_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_zoom_10_0, grammarAccess.getModelPropertiesAccess().getZoomINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelPropertiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"zoom",
            						lv_zoom_10_0,
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
    // InternalCanvas.g:301:1: entryRuleGraphicalElement returns [EObject current=null] : iv_ruleGraphicalElement= ruleGraphicalElement EOF ;
    public final EObject entryRuleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicalElement = null;


        try {
            // InternalCanvas.g:301:57: (iv_ruleGraphicalElement= ruleGraphicalElement EOF )
            // InternalCanvas.g:302:2: iv_ruleGraphicalElement= ruleGraphicalElement EOF
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
    // InternalCanvas.g:308:1: ruleGraphicalElement returns [EObject current=null] : (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors ) ;
    public final EObject ruleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Shapes_0 = null;

        EObject this_Connectors_1 = null;



        	enterRule();

        try {
            // InternalCanvas.g:314:2: ( (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors ) )
            // InternalCanvas.g:315:2: (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors )
            {
            // InternalCanvas.g:315:2: (this_Shapes_0= ruleShapes | this_Connectors_1= ruleConnectors )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=39 && LA7_0<=40)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCanvas.g:316:3: this_Shapes_0= ruleShapes
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
                    // InternalCanvas.g:325:3: this_Connectors_1= ruleConnectors
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
    // InternalCanvas.g:337:1: entryRuleShapes returns [EObject current=null] : iv_ruleShapes= ruleShapes EOF ;
    public final EObject entryRuleShapes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapes = null;


        try {
            // InternalCanvas.g:337:47: (iv_ruleShapes= ruleShapes EOF )
            // InternalCanvas.g:338:2: iv_ruleShapes= ruleShapes EOF
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
    // InternalCanvas.g:344:1: ruleShapes returns [EObject current=null] : ( () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )* ) ;
    public final EObject ruleShapes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_shapes_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:350:2: ( ( () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )* ) )
            // InternalCanvas.g:351:2: ( () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )* )
            {
            // InternalCanvas.g:351:2: ( () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )* )
            // InternalCanvas.g:352:3: () ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' ) ( (lv_shapes_4_0= ruleShape ) )*
            {
            // InternalCanvas.g:352:3: ()
            // InternalCanvas.g:353:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapesAccess().getShapesAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:359:3: ( (otherlv_1= 'shapes' otherlv_2= ':' ) | otherlv_3= 'shapes:' )
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
                    // InternalCanvas.g:360:4: (otherlv_1= 'shapes' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:360:4: (otherlv_1= 'shapes' otherlv_2= ':' )
                    // InternalCanvas.g:361:5: otherlv_1= 'shapes' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getShapesAccess().getShapesKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_11); 

                    					newLeafNode(otherlv_2, grammarAccess.getShapesAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:371:4: otherlv_3= 'shapes:'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getShapesAccess().getShapesKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:376:3: ( (lv_shapes_4_0= ruleShape ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=22 && LA9_0<=23)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCanvas.g:377:4: (lv_shapes_4_0= ruleShape )
            	    {
            	    // InternalCanvas.g:377:4: (lv_shapes_4_0= ruleShape )
            	    // InternalCanvas.g:378:5: lv_shapes_4_0= ruleShape
            	    {

            	    					newCompositeNode(grammarAccess.getShapesAccess().getShapesShapeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
    // InternalCanvas.g:399:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // InternalCanvas.g:399:46: (iv_ruleShape= ruleShape EOF )
            // InternalCanvas.g:400:2: iv_ruleShape= ruleShape EOF
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
    // InternalCanvas.g:406:1: ruleShape returns [EObject current=null] : ( () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_container_5_0= ruleContainer ) )? ( (otherlv_6= 'render' otherlv_7= ':' ) | otherlv_8= 'render:' ) ( (lv_represents_9_0= RULE_STRING ) ) ( (lv_rect_10_0= ruleRectangle ) ) ( (lv_text_11_0= ruleFloatingText ) )? ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_represents_9_0=null;
        AntlrDatatypeRuleToken lv_container_5_0 = null;

        EObject lv_rect_10_0 = null;

        EObject lv_text_11_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:412:2: ( ( () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_container_5_0= ruleContainer ) )? ( (otherlv_6= 'render' otherlv_7= ':' ) | otherlv_8= 'render:' ) ( (lv_represents_9_0= RULE_STRING ) ) ( (lv_rect_10_0= ruleRectangle ) ) ( (lv_text_11_0= ruleFloatingText ) )? ) )
            // InternalCanvas.g:413:2: ( () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_container_5_0= ruleContainer ) )? ( (otherlv_6= 'render' otherlv_7= ':' ) | otherlv_8= 'render:' ) ( (lv_represents_9_0= RULE_STRING ) ) ( (lv_rect_10_0= ruleRectangle ) ) ( (lv_text_11_0= ruleFloatingText ) )? )
            {
            // InternalCanvas.g:413:2: ( () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_container_5_0= ruleContainer ) )? ( (otherlv_6= 'render' otherlv_7= ':' ) | otherlv_8= 'render:' ) ( (lv_represents_9_0= RULE_STRING ) ) ( (lv_rect_10_0= ruleRectangle ) ) ( (lv_text_11_0= ruleFloatingText ) )? )
            // InternalCanvas.g:414:3: () ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_container_5_0= ruleContainer ) )? ( (otherlv_6= 'render' otherlv_7= ':' ) | otherlv_8= 'render:' ) ( (lv_represents_9_0= RULE_STRING ) ) ( (lv_rect_10_0= ruleRectangle ) ) ( (lv_text_11_0= ruleFloatingText ) )?
            {
            // InternalCanvas.g:414:3: ()
            // InternalCanvas.g:415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeAccess().getShapeAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:421:3: ( (otherlv_1= 'shape' otherlv_2= ':' ) | otherlv_3= 'shape:' )
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
                    // InternalCanvas.g:422:4: (otherlv_1= 'shape' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:422:4: (otherlv_1= 'shape' otherlv_2= ':' )
                    // InternalCanvas.g:423:5: otherlv_1= 'shape' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getShapeAccess().getShapeKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_2, grammarAccess.getShapeAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:433:4: otherlv_3= 'shape:'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getShapeAccess().getShapeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:438:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCanvas.g:439:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCanvas.g:439:4: (lv_name_4_0= RULE_ID )
            // InternalCanvas.g:440:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalCanvas.g:456:3: ( (lv_container_5_0= ruleContainer ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCanvas.g:457:4: (lv_container_5_0= ruleContainer )
                    {
                    // InternalCanvas.g:457:4: (lv_container_5_0= ruleContainer )
                    // InternalCanvas.g:458:5: lv_container_5_0= ruleContainer
                    {

                    					newCompositeNode(grammarAccess.getShapeAccess().getContainerContainerParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_container_5_0=ruleContainer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapeRule());
                    					}
                    					set(
                    						current,
                    						"container",
                    						lv_container_5_0,
                    						"org.xtuml.canvas.language.Canvas.Container");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:475:3: ( (otherlv_6= 'render' otherlv_7= ':' ) | otherlv_8= 'render:' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            else if ( (LA12_0==13) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCanvas.g:476:4: (otherlv_6= 'render' otherlv_7= ':' )
                    {
                    // InternalCanvas.g:476:4: (otherlv_6= 'render' otherlv_7= ':' )
                    // InternalCanvas.g:477:5: otherlv_6= 'render' otherlv_7= ':'
                    {
                    otherlv_6=(Token)match(input,11,FOLLOW_5); 

                    					newLeafNode(otherlv_6, grammarAccess.getShapeAccess().getRenderKeyword_4_0_0());
                    				
                    otherlv_7=(Token)match(input,12,FOLLOW_6); 

                    					newLeafNode(otherlv_7, grammarAccess.getShapeAccess().getColonKeyword_4_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:487:4: otherlv_8= 'render:'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getShapeAccess().getRenderKeyword_4_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:492:3: ( (lv_represents_9_0= RULE_STRING ) )
            // InternalCanvas.g:493:4: (lv_represents_9_0= RULE_STRING )
            {
            // InternalCanvas.g:493:4: (lv_represents_9_0= RULE_STRING )
            // InternalCanvas.g:494:5: lv_represents_9_0= RULE_STRING
            {
            lv_represents_9_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_represents_9_0, grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"represents",
            						lv_represents_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCanvas.g:510:3: ( (lv_rect_10_0= ruleRectangle ) )
            // InternalCanvas.g:511:4: (lv_rect_10_0= ruleRectangle )
            {
            // InternalCanvas.g:511:4: (lv_rect_10_0= ruleRectangle )
            // InternalCanvas.g:512:5: lv_rect_10_0= ruleRectangle
            {

            					newCompositeNode(grammarAccess.getShapeAccess().getRectRectangleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_rect_10_0=ruleRectangle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeRule());
            					}
            					set(
            						current,
            						"rect",
            						lv_rect_10_0,
            						"org.xtuml.canvas.language.Canvas.Rectangle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:529:3: ( (lv_text_11_0= ruleFloatingText ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=27 && LA13_0<=28)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCanvas.g:530:4: (lv_text_11_0= ruleFloatingText )
                    {
                    // InternalCanvas.g:530:4: (lv_text_11_0= ruleFloatingText )
                    // InternalCanvas.g:531:5: lv_text_11_0= ruleFloatingText
                    {

                    					newCompositeNode(grammarAccess.getShapeAccess().getTextFloatingTextParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_text_11_0=ruleFloatingText();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapeRule());
                    					}
                    					set(
                    						current,
                    						"text",
                    						lv_text_11_0,
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
    // InternalCanvas.g:552:1: entryRuleContainer returns [String current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final String entryRuleContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContainer = null;


        try {
            // InternalCanvas.g:552:49: (iv_ruleContainer= ruleContainer EOF )
            // InternalCanvas.g:553:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalCanvas.g:559:1: ruleContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'container' ;
    public final AntlrDatatypeRuleToken ruleContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCanvas.g:565:2: (kw= 'container' )
            // InternalCanvas.g:566:2: kw= 'container'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalCanvas.g:574:1: entryRuleFloatingTexts returns [EObject current=null] : iv_ruleFloatingTexts= ruleFloatingTexts EOF ;
    public final EObject entryRuleFloatingTexts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatingTexts = null;


        try {
            // InternalCanvas.g:574:54: (iv_ruleFloatingTexts= ruleFloatingTexts EOF )
            // InternalCanvas.g:575:2: iv_ruleFloatingTexts= ruleFloatingTexts EOF
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
    // InternalCanvas.g:581:1: ruleFloatingTexts returns [EObject current=null] : ( () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )* ) ;
    public final EObject ruleFloatingTexts() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_texts_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:587:2: ( ( () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )* ) )
            // InternalCanvas.g:588:2: ( () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )* )
            {
            // InternalCanvas.g:588:2: ( () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )* )
            // InternalCanvas.g:589:3: () ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' ) ( (lv_texts_4_0= ruleFloatingText ) )*
            {
            // InternalCanvas.g:589:3: ()
            // InternalCanvas.g:590:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatingTextsAccess().getFloatingTextsAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:596:3: ( (otherlv_1= 'texts' otherlv_2= ':' ) | otherlv_3= 'texts:' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCanvas.g:597:4: (otherlv_1= 'texts' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:597:4: (otherlv_1= 'texts' otherlv_2= ':' )
                    // InternalCanvas.g:598:5: otherlv_1= 'texts' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_16); 

                    					newLeafNode(otherlv_2, grammarAccess.getFloatingTextsAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:608:4: otherlv_3= 'texts:'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:613:3: ( (lv_texts_4_0= ruleFloatingText ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=27 && LA15_0<=28)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCanvas.g:614:4: (lv_texts_4_0= ruleFloatingText )
            	    {
            	    // InternalCanvas.g:614:4: (lv_texts_4_0= ruleFloatingText )
            	    // InternalCanvas.g:615:5: lv_texts_4_0= ruleFloatingText
            	    {

            	    					newCompositeNode(grammarAccess.getFloatingTextsAccess().getTextsFloatingTextParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
    // InternalCanvas.g:636:1: entryRuleFloatingText returns [EObject current=null] : iv_ruleFloatingText= ruleFloatingText EOF ;
    public final EObject entryRuleFloatingText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatingText = null;


        try {
            // InternalCanvas.g:636:53: (iv_ruleFloatingText= ruleFloatingText EOF )
            // InternalCanvas.g:637:2: iv_ruleFloatingText= ruleFloatingText EOF
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
    // InternalCanvas.g:643:1: ruleFloatingText returns [EObject current=null] : ( () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) ) ) ;
    public final EObject ruleFloatingText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_rect_4_0 = null;

        EObject lv_end_5_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:649:2: ( ( () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) ) ) )
            // InternalCanvas.g:650:2: ( () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) ) )
            {
            // InternalCanvas.g:650:2: ( () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) ) )
            // InternalCanvas.g:651:3: () ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' ) ( (lv_rect_4_0= ruleRectangle ) ) ( (lv_end_5_0= ruleEnumEnd ) )
            {
            // InternalCanvas.g:651:3: ()
            // InternalCanvas.g:652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatingTextAccess().getFloatingTextAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:658:3: ( (otherlv_1= 'text' otherlv_2= ':' ) | otherlv_3= 'text:' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCanvas.g:659:4: (otherlv_1= 'text' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:659:4: (otherlv_1= 'text' otherlv_2= ':' )
                    // InternalCanvas.g:660:5: otherlv_1= 'text' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getFloatingTextAccess().getTextKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_15); 

                    					newLeafNode(otherlv_2, grammarAccess.getFloatingTextAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:670:4: otherlv_3= 'text:'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getFloatingTextAccess().getTextKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:675:3: ( (lv_rect_4_0= ruleRectangle ) )
            // InternalCanvas.g:676:4: (lv_rect_4_0= ruleRectangle )
            {
            // InternalCanvas.g:676:4: (lv_rect_4_0= ruleRectangle )
            // InternalCanvas.g:677:5: lv_rect_4_0= ruleRectangle
            {

            					newCompositeNode(grammarAccess.getFloatingTextAccess().getRectRectangleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalCanvas.g:694:3: ( (lv_end_5_0= ruleEnumEnd ) )
            // InternalCanvas.g:695:4: (lv_end_5_0= ruleEnumEnd )
            {
            // InternalCanvas.g:695:4: (lv_end_5_0= ruleEnumEnd )
            // InternalCanvas.g:696:5: lv_end_5_0= ruleEnumEnd
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
    // InternalCanvas.g:717:1: entryRuleEnumEnd returns [EObject current=null] : iv_ruleEnumEnd= ruleEnumEnd EOF ;
    public final EObject entryRuleEnumEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumEnd = null;


        try {
            // InternalCanvas.g:717:48: (iv_ruleEnumEnd= ruleEnumEnd EOF )
            // InternalCanvas.g:718:2: iv_ruleEnumEnd= ruleEnumEnd EOF
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
    // InternalCanvas.g:724:1: ruleEnumEnd returns [EObject current=null] : ( ( (otherlv_0= 'where' otherlv_1= ':' ) | otherlv_2= 'where:' ) ( ( (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' ) ) ) ) ;
    public final EObject ruleEnumEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_where_3_1=null;
        Token lv_where_3_2=null;
        Token lv_where_3_3=null;
        Token lv_where_3_4=null;
        Token lv_where_3_5=null;
        Token lv_where_3_6=null;
        Token lv_where_3_7=null;
        Token lv_where_3_8=null;


        	enterRule();

        try {
            // InternalCanvas.g:730:2: ( ( ( (otherlv_0= 'where' otherlv_1= ':' ) | otherlv_2= 'where:' ) ( ( (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' ) ) ) ) )
            // InternalCanvas.g:731:2: ( ( (otherlv_0= 'where' otherlv_1= ':' ) | otherlv_2= 'where:' ) ( ( (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' ) ) ) )
            {
            // InternalCanvas.g:731:2: ( ( (otherlv_0= 'where' otherlv_1= ':' ) | otherlv_2= 'where:' ) ( ( (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' ) ) ) )
            // InternalCanvas.g:732:3: ( (otherlv_0= 'where' otherlv_1= ':' ) | otherlv_2= 'where:' ) ( ( (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' ) ) )
            {
            // InternalCanvas.g:732:3: ( (otherlv_0= 'where' otherlv_1= ':' ) | otherlv_2= 'where:' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCanvas.g:733:4: (otherlv_0= 'where' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:733:4: (otherlv_0= 'where' otherlv_1= ':' )
                    // InternalCanvas.g:734:5: otherlv_0= 'where' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getEnumEndAccess().getWhereKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_18); 

                    					newLeafNode(otherlv_1, grammarAccess.getEnumEndAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:744:4: otherlv_2= 'where:'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnumEndAccess().getWhereKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:749:3: ( ( (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' ) ) )
            // InternalCanvas.g:750:4: ( (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' ) )
            {
            // InternalCanvas.g:750:4: ( (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' ) )
            // InternalCanvas.g:751:5: (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' )
            {
            // InternalCanvas.g:751:5: (lv_where_3_1= 'start' | lv_where_3_2= 'end' | lv_where_3_3= 'middle' | lv_where_3_4= 'end_fixed' | lv_where_3_5= 'start_fixed' | lv_where_3_6= 'none' | lv_where_3_7= 'floating' | lv_where_3_8= 'additional' )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case 34:
                {
                alt18=4;
                }
                break;
            case 35:
                {
                alt18=5;
                }
                break;
            case 36:
                {
                alt18=6;
                }
                break;
            case 37:
                {
                alt18=7;
                }
                break;
            case 38:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCanvas.g:752:6: lv_where_3_1= 'start'
                    {
                    lv_where_3_1=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_where_3_1, grammarAccess.getEnumEndAccess().getWhereStartKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalCanvas.g:763:6: lv_where_3_2= 'end'
                    {
                    lv_where_3_2=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_where_3_2, grammarAccess.getEnumEndAccess().getWhereEndKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalCanvas.g:774:6: lv_where_3_3= 'middle'
                    {
                    lv_where_3_3=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_where_3_3, grammarAccess.getEnumEndAccess().getWhereMiddleKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_3_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalCanvas.g:785:6: lv_where_3_4= 'end_fixed'
                    {
                    lv_where_3_4=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_where_3_4, grammarAccess.getEnumEndAccess().getWhereEnd_fixedKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_3_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalCanvas.g:796:6: lv_where_3_5= 'start_fixed'
                    {
                    lv_where_3_5=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_where_3_5, grammarAccess.getEnumEndAccess().getWhereStart_fixedKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_3_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalCanvas.g:807:6: lv_where_3_6= 'none'
                    {
                    lv_where_3_6=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_where_3_6, grammarAccess.getEnumEndAccess().getWhereNoneKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_3_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalCanvas.g:818:6: lv_where_3_7= 'floating'
                    {
                    lv_where_3_7=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_where_3_7, grammarAccess.getEnumEndAccess().getWhereFloatingKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_3_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalCanvas.g:829:6: lv_where_3_8= 'additional'
                    {
                    lv_where_3_8=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_where_3_8, grammarAccess.getEnumEndAccess().getWhereAdditionalKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumEndRule());
                    						}
                    						setWithLastConsumed(current, "where", lv_where_3_8, null);
                    					

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
    // InternalCanvas.g:846:1: entryRuleConnectors returns [EObject current=null] : iv_ruleConnectors= ruleConnectors EOF ;
    public final EObject entryRuleConnectors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectors = null;


        try {
            // InternalCanvas.g:846:51: (iv_ruleConnectors= ruleConnectors EOF )
            // InternalCanvas.g:847:2: iv_ruleConnectors= ruleConnectors EOF
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
    // InternalCanvas.g:853:1: ruleConnectors returns [EObject current=null] : ( () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )* ) ;
    public final EObject ruleConnectors() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_connectors_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:859:2: ( ( () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )* ) )
            // InternalCanvas.g:860:2: ( () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )* )
            {
            // InternalCanvas.g:860:2: ( () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )* )
            // InternalCanvas.g:861:3: () ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' ) ( (lv_connectors_4_0= ruleConnector ) )*
            {
            // InternalCanvas.g:861:3: ()
            // InternalCanvas.g:862:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectorsAccess().getConnectorsAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:868:3: ( (otherlv_1= 'connectors' otherlv_2= ':' ) | otherlv_3= 'connectors:' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            else if ( (LA19_0==40) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCanvas.g:869:4: (otherlv_1= 'connectors' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:869:4: (otherlv_1= 'connectors' otherlv_2= ':' )
                    // InternalCanvas.g:870:5: otherlv_1= 'connectors' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_19); 

                    					newLeafNode(otherlv_2, grammarAccess.getConnectorsAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:880:4: otherlv_3= 'connectors:'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:885:3: ( (lv_connectors_4_0= ruleConnector ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=41 && LA20_0<=42)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCanvas.g:886:4: (lv_connectors_4_0= ruleConnector )
            	    {
            	    // InternalCanvas.g:886:4: (lv_connectors_4_0= ruleConnector )
            	    // InternalCanvas.g:887:5: lv_connectors_4_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getConnectorsAccess().getConnectorsConnectorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop20;
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
    // InternalCanvas.g:908:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalCanvas.g:908:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalCanvas.g:909:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalCanvas.g:915:1: ruleConnector returns [EObject current=null] : ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'render' otherlv_5= ':' ) | otherlv_6= 'render:' ) ( (lv_represents_7_0= RULE_STRING ) ) ( (lv_polyline_8_0= rulePolyline ) ) ( (lv_anchors_9_0= ruleAnchors ) )? ( (lv_texts_10_0= ruleFloatingTexts ) ) ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_represents_7_0=null;
        EObject lv_polyline_8_0 = null;

        EObject lv_anchors_9_0 = null;

        EObject lv_texts_10_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:921:2: ( ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'render' otherlv_5= ':' ) | otherlv_6= 'render:' ) ( (lv_represents_7_0= RULE_STRING ) ) ( (lv_polyline_8_0= rulePolyline ) ) ( (lv_anchors_9_0= ruleAnchors ) )? ( (lv_texts_10_0= ruleFloatingTexts ) ) ) )
            // InternalCanvas.g:922:2: ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'render' otherlv_5= ':' ) | otherlv_6= 'render:' ) ( (lv_represents_7_0= RULE_STRING ) ) ( (lv_polyline_8_0= rulePolyline ) ) ( (lv_anchors_9_0= ruleAnchors ) )? ( (lv_texts_10_0= ruleFloatingTexts ) ) )
            {
            // InternalCanvas.g:922:2: ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'render' otherlv_5= ':' ) | otherlv_6= 'render:' ) ( (lv_represents_7_0= RULE_STRING ) ) ( (lv_polyline_8_0= rulePolyline ) ) ( (lv_anchors_9_0= ruleAnchors ) )? ( (lv_texts_10_0= ruleFloatingTexts ) ) )
            // InternalCanvas.g:923:3: ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= 'render' otherlv_5= ':' ) | otherlv_6= 'render:' ) ( (lv_represents_7_0= RULE_STRING ) ) ( (lv_polyline_8_0= rulePolyline ) ) ( (lv_anchors_9_0= ruleAnchors ) )? ( (lv_texts_10_0= ruleFloatingTexts ) )
            {
            // InternalCanvas.g:923:3: ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            else if ( (LA21_0==42) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalCanvas.g:924:4: (otherlv_0= 'connector' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:924:4: (otherlv_0= 'connector' otherlv_1= ':' )
                    // InternalCanvas.g:925:5: otherlv_0= 'connector' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:935:4: otherlv_2= 'connector:'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getConnectorKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:940:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCanvas.g:941:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCanvas.g:941:4: (lv_name_3_0= RULE_ID )
            // InternalCanvas.g:942:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalCanvas.g:958:3: ( (otherlv_4= 'render' otherlv_5= ':' ) | otherlv_6= 'render:' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==11) ) {
                alt22=1;
            }
            else if ( (LA22_0==13) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCanvas.g:959:4: (otherlv_4= 'render' otherlv_5= ':' )
                    {
                    // InternalCanvas.g:959:4: (otherlv_4= 'render' otherlv_5= ':' )
                    // InternalCanvas.g:960:5: otherlv_4= 'render' otherlv_5= ':'
                    {
                    otherlv_4=(Token)match(input,11,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getRenderKeyword_2_0_0());
                    				
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getColonKeyword_2_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:970:4: otherlv_6= 'render:'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getConnectorAccess().getRenderKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:975:3: ( (lv_represents_7_0= RULE_STRING ) )
            // InternalCanvas.g:976:4: (lv_represents_7_0= RULE_STRING )
            {
            // InternalCanvas.g:976:4: (lv_represents_7_0= RULE_STRING )
            // InternalCanvas.g:977:5: lv_represents_7_0= RULE_STRING
            {
            lv_represents_7_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_represents_7_0, grammarAccess.getConnectorAccess().getRepresentsSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"represents",
            						lv_represents_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCanvas.g:993:3: ( (lv_polyline_8_0= rulePolyline ) )
            // InternalCanvas.g:994:4: (lv_polyline_8_0= rulePolyline )
            {
            // InternalCanvas.g:994:4: (lv_polyline_8_0= rulePolyline )
            // InternalCanvas.g:995:5: lv_polyline_8_0= rulePolyline
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getPolylinePolylineParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_polyline_8_0=rulePolyline();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"polyline",
            						lv_polyline_8_0,
            						"org.xtuml.canvas.language.Canvas.Polyline");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1012:3: ( (lv_anchors_9_0= ruleAnchors ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=43 && LA23_0<=44)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCanvas.g:1013:4: (lv_anchors_9_0= ruleAnchors )
                    {
                    // InternalCanvas.g:1013:4: (lv_anchors_9_0= ruleAnchors )
                    // InternalCanvas.g:1014:5: lv_anchors_9_0= ruleAnchors
                    {

                    					newCompositeNode(grammarAccess.getConnectorAccess().getAnchorsAnchorsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_anchors_9_0=ruleAnchors();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConnectorRule());
                    					}
                    					set(
                    						current,
                    						"anchors",
                    						lv_anchors_9_0,
                    						"org.xtuml.canvas.language.Canvas.Anchors");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCanvas.g:1031:3: ( (lv_texts_10_0= ruleFloatingTexts ) )
            // InternalCanvas.g:1032:4: (lv_texts_10_0= ruleFloatingTexts )
            {
            // InternalCanvas.g:1032:4: (lv_texts_10_0= ruleFloatingTexts )
            // InternalCanvas.g:1033:5: lv_texts_10_0= ruleFloatingTexts
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getTextsFloatingTextsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_texts_10_0=ruleFloatingTexts();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"texts",
            						lv_texts_10_0,
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
    // InternalCanvas.g:1054:1: entryRuleAnchors returns [EObject current=null] : iv_ruleAnchors= ruleAnchors EOF ;
    public final EObject entryRuleAnchors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchors = null;


        try {
            // InternalCanvas.g:1054:48: (iv_ruleAnchors= ruleAnchors EOF )
            // InternalCanvas.g:1055:2: iv_ruleAnchors= ruleAnchors EOF
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
    // InternalCanvas.g:1061:1: ruleAnchors returns [EObject current=null] : ( ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) ) ) ;
    public final EObject ruleAnchors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_startAnchor_3_0 = null;

        EObject lv_endAnchor_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1067:2: ( ( ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) ) ) )
            // InternalCanvas.g:1068:2: ( ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) ) )
            {
            // InternalCanvas.g:1068:2: ( ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) ) )
            // InternalCanvas.g:1069:3: ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' ) ( (lv_startAnchor_3_0= ruleStartAnchor ) ) ( (lv_endAnchor_4_0= ruleEndAnchor ) )
            {
            // InternalCanvas.g:1069:3: ( (otherlv_0= 'anchors' otherlv_1= ':' ) | otherlv_2= 'anchors:' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            else if ( (LA24_0==44) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCanvas.g:1070:4: (otherlv_0= 'anchors' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1070:4: (otherlv_0= 'anchors' otherlv_1= ':' )
                    // InternalCanvas.g:1071:5: otherlv_0= 'anchors' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_22); 

                    					newLeafNode(otherlv_1, grammarAccess.getAnchorsAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1081:4: otherlv_2= 'anchors:'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1086:3: ( (lv_startAnchor_3_0= ruleStartAnchor ) )
            // InternalCanvas.g:1087:4: (lv_startAnchor_3_0= ruleStartAnchor )
            {
            // InternalCanvas.g:1087:4: (lv_startAnchor_3_0= ruleStartAnchor )
            // InternalCanvas.g:1088:5: lv_startAnchor_3_0= ruleStartAnchor
            {

            					newCompositeNode(grammarAccess.getAnchorsAccess().getStartAnchorStartAnchorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalCanvas.g:1105:3: ( (lv_endAnchor_4_0= ruleEndAnchor ) )
            // InternalCanvas.g:1106:4: (lv_endAnchor_4_0= ruleEndAnchor )
            {
            // InternalCanvas.g:1106:4: (lv_endAnchor_4_0= ruleEndAnchor )
            // InternalCanvas.g:1107:5: lv_endAnchor_4_0= ruleEndAnchor
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
    // InternalCanvas.g:1128:1: entryRuleStartAnchor returns [EObject current=null] : iv_ruleStartAnchor= ruleStartAnchor EOF ;
    public final EObject entryRuleStartAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartAnchor = null;


        try {
            // InternalCanvas.g:1128:52: (iv_ruleStartAnchor= ruleStartAnchor EOF )
            // InternalCanvas.g:1129:2: iv_ruleStartAnchor= ruleStartAnchor EOF
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
    // InternalCanvas.g:1135:1: ruleStartAnchor returns [EObject current=null] : ( ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )? ) ;
    public final EObject ruleStartAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_point_3_0 = null;

        EObject lv_anchor_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1141:2: ( ( ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )? ) )
            // InternalCanvas.g:1142:2: ( ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )? )
            {
            // InternalCanvas.g:1142:2: ( ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )? )
            // InternalCanvas.g:1143:3: ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )?
            {
            // InternalCanvas.g:1143:3: ( (otherlv_0= 'start' otherlv_1= ':' ) | otherlv_2= 'start:' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            else if ( (LA25_0==45) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCanvas.g:1144:4: (otherlv_0= 'start' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1144:4: (otherlv_0= 'start' otherlv_1= ':' )
                    // InternalCanvas.g:1145:5: otherlv_0= 'start' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getStartAnchorAccess().getStartKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_24); 

                    					newLeafNode(otherlv_1, grammarAccess.getStartAnchorAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1155:4: otherlv_2= 'start:'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getStartAnchorAccess().getStartKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1160:3: ( (lv_point_3_0= rulePointDefinition ) )
            // InternalCanvas.g:1161:4: (lv_point_3_0= rulePointDefinition )
            {
            // InternalCanvas.g:1161:4: (lv_point_3_0= rulePointDefinition )
            // InternalCanvas.g:1162:5: lv_point_3_0= rulePointDefinition
            {

            					newCompositeNode(grammarAccess.getStartAnchorAccess().getPointPointDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_point_3_0=rulePointDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartAnchorRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_3_0,
            						"org.xtuml.canvas.language.Canvas.PointDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1179:3: ( (lv_anchor_4_0= ruleAnchor ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=22 && LA26_0<=23)||(LA26_0>=41 && LA26_0<=42)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCanvas.g:1180:4: (lv_anchor_4_0= ruleAnchor )
                    {
                    // InternalCanvas.g:1180:4: (lv_anchor_4_0= ruleAnchor )
                    // InternalCanvas.g:1181:5: lv_anchor_4_0= ruleAnchor
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
    // InternalCanvas.g:1202:1: entryRuleEndAnchor returns [EObject current=null] : iv_ruleEndAnchor= ruleEndAnchor EOF ;
    public final EObject entryRuleEndAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndAnchor = null;


        try {
            // InternalCanvas.g:1202:50: (iv_ruleEndAnchor= ruleEndAnchor EOF )
            // InternalCanvas.g:1203:2: iv_ruleEndAnchor= ruleEndAnchor EOF
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
    // InternalCanvas.g:1209:1: ruleEndAnchor returns [EObject current=null] : ( ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )? ) ;
    public final EObject ruleEndAnchor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_point_3_0 = null;

        EObject lv_anchor_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1215:2: ( ( ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )? ) )
            // InternalCanvas.g:1216:2: ( ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )? )
            {
            // InternalCanvas.g:1216:2: ( ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )? )
            // InternalCanvas.g:1217:3: ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end:' ) ( (lv_point_3_0= rulePointDefinition ) ) ( (lv_anchor_4_0= ruleAnchor ) )?
            {
            // InternalCanvas.g:1217:3: ( (otherlv_0= 'end' otherlv_1= ':' ) | otherlv_2= 'end:' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCanvas.g:1218:4: (otherlv_0= 'end' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1218:4: (otherlv_0= 'end' otherlv_1= ':' )
                    // InternalCanvas.g:1219:5: otherlv_0= 'end' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getEndAnchorAccess().getEndKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_24); 

                    					newLeafNode(otherlv_1, grammarAccess.getEndAnchorAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1229:4: otherlv_2= 'end:'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getEndAnchorAccess().getEndKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1234:3: ( (lv_point_3_0= rulePointDefinition ) )
            // InternalCanvas.g:1235:4: (lv_point_3_0= rulePointDefinition )
            {
            // InternalCanvas.g:1235:4: (lv_point_3_0= rulePointDefinition )
            // InternalCanvas.g:1236:5: lv_point_3_0= rulePointDefinition
            {

            					newCompositeNode(grammarAccess.getEndAnchorAccess().getPointPointDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_point_3_0=rulePointDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndAnchorRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_3_0,
            						"org.xtuml.canvas.language.Canvas.PointDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1253:3: ( (lv_anchor_4_0= ruleAnchor ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=22 && LA28_0<=23)||(LA28_0>=41 && LA28_0<=42)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCanvas.g:1254:4: (lv_anchor_4_0= ruleAnchor )
                    {
                    // InternalCanvas.g:1254:4: (lv_anchor_4_0= ruleAnchor )
                    // InternalCanvas.g:1255:5: lv_anchor_4_0= ruleAnchor
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
    // InternalCanvas.g:1276:1: entryRuleAnchor returns [EObject current=null] : iv_ruleAnchor= ruleAnchor EOF ;
    public final EObject entryRuleAnchor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnchor = null;


        try {
            // InternalCanvas.g:1276:47: (iv_ruleAnchor= ruleAnchor EOF )
            // InternalCanvas.g:1277:2: iv_ruleAnchor= ruleAnchor EOF
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
    // InternalCanvas.g:1283:1: ruleAnchor returns [EObject current=null] : (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement ) ;
    public final EObject ruleAnchor() throws RecognitionException {
        EObject current = null;

        EObject this_ShapeAnchorElement_0 = null;

        EObject this_ConnectorAnchorElement_1 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1289:2: ( (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement ) )
            // InternalCanvas.g:1290:2: (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement )
            {
            // InternalCanvas.g:1290:2: (this_ShapeAnchorElement_0= ruleShapeAnchorElement | this_ConnectorAnchorElement_1= ruleConnectorAnchorElement )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=22 && LA29_0<=23)) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=41 && LA29_0<=42)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCanvas.g:1291:3: this_ShapeAnchorElement_0= ruleShapeAnchorElement
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
                    // InternalCanvas.g:1300:3: this_ConnectorAnchorElement_1= ruleConnectorAnchorElement
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
    // InternalCanvas.g:1312:1: entryRuleShapeAnchorElement returns [EObject current=null] : iv_ruleShapeAnchorElement= ruleShapeAnchorElement EOF ;
    public final EObject entryRuleShapeAnchorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeAnchorElement = null;


        try {
            // InternalCanvas.g:1312:59: (iv_ruleShapeAnchorElement= ruleShapeAnchorElement EOF )
            // InternalCanvas.g:1313:2: iv_ruleShapeAnchorElement= ruleShapeAnchorElement EOF
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
    // InternalCanvas.g:1319:1: ruleShapeAnchorElement returns [EObject current=null] : ( ( (otherlv_0= 'shape' otherlv_1= ':' ) | otherlv_2= 'shape:' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleShapeAnchorElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCanvas.g:1325:2: ( ( ( (otherlv_0= 'shape' otherlv_1= ':' ) | otherlv_2= 'shape:' ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalCanvas.g:1326:2: ( ( (otherlv_0= 'shape' otherlv_1= ':' ) | otherlv_2= 'shape:' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalCanvas.g:1326:2: ( ( (otherlv_0= 'shape' otherlv_1= ':' ) | otherlv_2= 'shape:' ) ( (otherlv_3= RULE_ID ) ) )
            // InternalCanvas.g:1327:3: ( (otherlv_0= 'shape' otherlv_1= ':' ) | otherlv_2= 'shape:' ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalCanvas.g:1327:3: ( (otherlv_0= 'shape' otherlv_1= ':' ) | otherlv_2= 'shape:' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            else if ( (LA30_0==23) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCanvas.g:1328:4: (otherlv_0= 'shape' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1328:4: (otherlv_0= 'shape' otherlv_1= ':' )
                    // InternalCanvas.g:1329:5: otherlv_0= 'shape' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getShapeAnchorElementAccess().getShapeKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_1, grammarAccess.getShapeAnchorElementAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1339:4: otherlv_2= 'shape:'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getShapeAnchorElementAccess().getShapeKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1344:3: ( (otherlv_3= RULE_ID ) )
            // InternalCanvas.g:1345:4: (otherlv_3= RULE_ID )
            {
            // InternalCanvas.g:1345:4: (otherlv_3= RULE_ID )
            // InternalCanvas.g:1346:5: otherlv_3= RULE_ID
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
    // InternalCanvas.g:1361:1: entryRuleConnectorAnchorElement returns [EObject current=null] : iv_ruleConnectorAnchorElement= ruleConnectorAnchorElement EOF ;
    public final EObject entryRuleConnectorAnchorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorAnchorElement = null;


        try {
            // InternalCanvas.g:1361:63: (iv_ruleConnectorAnchorElement= ruleConnectorAnchorElement EOF )
            // InternalCanvas.g:1362:2: iv_ruleConnectorAnchorElement= ruleConnectorAnchorElement EOF
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
    // InternalCanvas.g:1368:1: ruleConnectorAnchorElement returns [EObject current=null] : ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleConnectorAnchorElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCanvas.g:1374:2: ( ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalCanvas.g:1375:2: ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalCanvas.g:1375:2: ( ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (otherlv_3= RULE_ID ) ) )
            // InternalCanvas.g:1376:3: ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalCanvas.g:1376:3: ( (otherlv_0= 'connector' otherlv_1= ':' ) | otherlv_2= 'connector:' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            else if ( (LA31_0==42) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCanvas.g:1377:4: (otherlv_0= 'connector' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1377:4: (otherlv_0= 'connector' otherlv_1= ':' )
                    // InternalCanvas.g:1378:5: otherlv_0= 'connector' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getConnectorAnchorElementAccess().getConnectorKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_12); 

                    					newLeafNode(otherlv_1, grammarAccess.getConnectorAnchorElementAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1388:4: otherlv_2= 'connector:'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getConnectorAnchorElementAccess().getConnectorKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1393:3: ( (otherlv_3= RULE_ID ) )
            // InternalCanvas.g:1394:4: (otherlv_3= RULE_ID )
            {
            // InternalCanvas.g:1394:4: (otherlv_3= RULE_ID )
            // InternalCanvas.g:1395:5: otherlv_3= RULE_ID
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


    // $ANTLR start "entryRulePolyline"
    // InternalCanvas.g:1410:1: entryRulePolyline returns [EObject current=null] : iv_rulePolyline= rulePolyline EOF ;
    public final EObject entryRulePolyline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyline = null;


        try {
            // InternalCanvas.g:1410:49: (iv_rulePolyline= rulePolyline EOF )
            // InternalCanvas.g:1411:2: iv_rulePolyline= rulePolyline EOF
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
    // InternalCanvas.g:1417:1: rulePolyline returns [EObject current=null] : ( () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )* ) ;
    public final EObject rulePolyline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_segments_4_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1423:2: ( ( () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )* ) )
            // InternalCanvas.g:1424:2: ( () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )* )
            {
            // InternalCanvas.g:1424:2: ( () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )* )
            // InternalCanvas.g:1425:3: () ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' ) ( (lv_segments_4_0= ruleSegment ) )*
            {
            // InternalCanvas.g:1425:3: ()
            // InternalCanvas.g:1426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPolylineAccess().getPolylineAction_0(),
            					current);
            			

            }

            // InternalCanvas.g:1432:3: ( (otherlv_1= 'polyline' otherlv_2= ':' ) | otherlv_3= 'polyline:' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            else if ( (LA32_0==48) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCanvas.g:1433:4: (otherlv_1= 'polyline' otherlv_2= ':' )
                    {
                    // InternalCanvas.g:1433:4: (otherlv_1= 'polyline' otherlv_2= ':' )
                    // InternalCanvas.g:1434:5: otherlv_1= 'polyline' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getPolylineAccess().getPolylineKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,12,FOLLOW_26); 

                    					newLeafNode(otherlv_2, grammarAccess.getPolylineAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1444:4: otherlv_3= 'polyline:'
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getPolylineAccess().getPolylineKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1449:3: ( (lv_segments_4_0= ruleSegment ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=49 && LA33_0<=50)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCanvas.g:1450:4: (lv_segments_4_0= ruleSegment )
            	    {
            	    // InternalCanvas.g:1450:4: (lv_segments_4_0= ruleSegment )
            	    // InternalCanvas.g:1451:5: lv_segments_4_0= ruleSegment
            	    {

            	    					newCompositeNode(grammarAccess.getPolylineAccess().getSegmentsSegmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop33;
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
    // InternalCanvas.g:1472:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // InternalCanvas.g:1472:48: (iv_ruleSegment= ruleSegment EOF )
            // InternalCanvas.g:1473:2: iv_ruleSegment= ruleSegment EOF
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
    // InternalCanvas.g:1479:1: ruleSegment returns [EObject current=null] : ( ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (otherlv_3= 'start' otherlv_4= ':' ) | otherlv_5= 'start:' ) ( (lv_startPoint_6_0= rulePoint ) ) ( (otherlv_7= 'end' otherlv_8= ':' ) | otherlv_9= 'end:' ) ( (lv_endPoint_10_0= rulePoint ) ) ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_startPoint_6_0 = null;

        EObject lv_endPoint_10_0 = null;



        	enterRule();

        try {
            // InternalCanvas.g:1485:2: ( ( ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (otherlv_3= 'start' otherlv_4= ':' ) | otherlv_5= 'start:' ) ( (lv_startPoint_6_0= rulePoint ) ) ( (otherlv_7= 'end' otherlv_8= ':' ) | otherlv_9= 'end:' ) ( (lv_endPoint_10_0= rulePoint ) ) ) )
            // InternalCanvas.g:1486:2: ( ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (otherlv_3= 'start' otherlv_4= ':' ) | otherlv_5= 'start:' ) ( (lv_startPoint_6_0= rulePoint ) ) ( (otherlv_7= 'end' otherlv_8= ':' ) | otherlv_9= 'end:' ) ( (lv_endPoint_10_0= rulePoint ) ) )
            {
            // InternalCanvas.g:1486:2: ( ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (otherlv_3= 'start' otherlv_4= ':' ) | otherlv_5= 'start:' ) ( (lv_startPoint_6_0= rulePoint ) ) ( (otherlv_7= 'end' otherlv_8= ':' ) | otherlv_9= 'end:' ) ( (lv_endPoint_10_0= rulePoint ) ) )
            // InternalCanvas.g:1487:3: ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' ) ( (otherlv_3= 'start' otherlv_4= ':' ) | otherlv_5= 'start:' ) ( (lv_startPoint_6_0= rulePoint ) ) ( (otherlv_7= 'end' otherlv_8= ':' ) | otherlv_9= 'end:' ) ( (lv_endPoint_10_0= rulePoint ) )
            {
            // InternalCanvas.g:1487:3: ( (otherlv_0= 'segment' otherlv_1= ':' ) | otherlv_2= 'segment:' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            else if ( (LA34_0==50) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalCanvas.g:1488:4: (otherlv_0= 'segment' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1488:4: (otherlv_0= 'segment' otherlv_1= ':' )
                    // InternalCanvas.g:1489:5: otherlv_0= 'segment' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getSegmentAccess().getSegmentKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_22); 

                    					newLeafNode(otherlv_1, grammarAccess.getSegmentAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1499:4: otherlv_2= 'segment:'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getSegmentAccess().getSegmentKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1504:3: ( (otherlv_3= 'start' otherlv_4= ':' ) | otherlv_5= 'start:' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            else if ( (LA35_0==45) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalCanvas.g:1505:4: (otherlv_3= 'start' otherlv_4= ':' )
                    {
                    // InternalCanvas.g:1505:4: (otherlv_3= 'start' otherlv_4= ':' )
                    // InternalCanvas.g:1506:5: otherlv_3= 'start' otherlv_4= ':'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getSegmentAccess().getStartKeyword_1_0_0());
                    				
                    otherlv_4=(Token)match(input,12,FOLLOW_8); 

                    					newLeafNode(otherlv_4, grammarAccess.getSegmentAccess().getColonKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1516:4: otherlv_5= 'start:'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSegmentAccess().getStartKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1521:3: ( (lv_startPoint_6_0= rulePoint ) )
            // InternalCanvas.g:1522:4: (lv_startPoint_6_0= rulePoint )
            {
            // InternalCanvas.g:1522:4: (lv_startPoint_6_0= rulePoint )
            // InternalCanvas.g:1523:5: lv_startPoint_6_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_startPoint_6_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSegmentRule());
            					}
            					set(
            						current,
            						"startPoint",
            						lv_startPoint_6_0,
            						"org.xtuml.canvas.language.Canvas.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanvas.g:1540:3: ( (otherlv_7= 'end' otherlv_8= ':' ) | otherlv_9= 'end:' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            else if ( (LA36_0==46) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalCanvas.g:1541:4: (otherlv_7= 'end' otherlv_8= ':' )
                    {
                    // InternalCanvas.g:1541:4: (otherlv_7= 'end' otherlv_8= ':' )
                    // InternalCanvas.g:1542:5: otherlv_7= 'end' otherlv_8= ':'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_5); 

                    					newLeafNode(otherlv_7, grammarAccess.getSegmentAccess().getEndKeyword_3_0_0());
                    				
                    otherlv_8=(Token)match(input,12,FOLLOW_8); 

                    					newLeafNode(otherlv_8, grammarAccess.getSegmentAccess().getColonKeyword_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1552:4: otherlv_9= 'end:'
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getSegmentAccess().getEndKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalCanvas.g:1557:3: ( (lv_endPoint_10_0= rulePoint ) )
            // InternalCanvas.g:1558:4: (lv_endPoint_10_0= rulePoint )
            {
            // InternalCanvas.g:1558:4: (lv_endPoint_10_0= rulePoint )
            // InternalCanvas.g:1559:5: lv_endPoint_10_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_endPoint_10_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSegmentRule());
            					}
            					set(
            						current,
            						"endPoint",
            						lv_endPoint_10_0,
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
    // InternalCanvas.g:1580:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalCanvas.g:1580:46: (iv_rulePoint= rulePoint EOF )
            // InternalCanvas.g:1581:2: iv_rulePoint= rulePoint EOF
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
    // InternalCanvas.g:1587:1: rulePoint returns [EObject current=null] : (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:1593:2: ( (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) ) )
            // InternalCanvas.g:1594:2: (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:1594:2: (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) )
            // InternalCanvas.g:1595:3: otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPointAccess().getXKeyword_0());
            		
            // InternalCanvas.g:1599:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalCanvas.g:1600:4: (lv_x_1_0= RULE_INT )
            {
            // InternalCanvas.g:1600:4: (lv_x_1_0= RULE_INT )
            // InternalCanvas.g:1601:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_2=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getYKeyword_2());
            		
            // InternalCanvas.g:1621:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalCanvas.g:1622:4: (lv_y_3_0= RULE_INT )
            {
            // InternalCanvas.g:1622:4: (lv_y_3_0= RULE_INT )
            // InternalCanvas.g:1623:5: lv_y_3_0= RULE_INT
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


    // $ANTLR start "entryRulePointDefinition"
    // InternalCanvas.g:1643:1: entryRulePointDefinition returns [EObject current=null] : iv_rulePointDefinition= rulePointDefinition EOF ;
    public final EObject entryRulePointDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointDefinition = null;


        try {
            // InternalCanvas.g:1643:56: (iv_rulePointDefinition= rulePointDefinition EOF )
            // InternalCanvas.g:1644:2: iv_rulePointDefinition= rulePointDefinition EOF
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
    // InternalCanvas.g:1650:1: rulePointDefinition returns [EObject current=null] : ( ( (otherlv_0= 'point' otherlv_1= ':' ) | otherlv_2= 'point:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) ) ;
    public final EObject rulePointDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token lv_y_6_0=null;


        	enterRule();

        try {
            // InternalCanvas.g:1656:2: ( ( ( (otherlv_0= 'point' otherlv_1= ':' ) | otherlv_2= 'point:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) ) )
            // InternalCanvas.g:1657:2: ( ( (otherlv_0= 'point' otherlv_1= ':' ) | otherlv_2= 'point:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:1657:2: ( ( (otherlv_0= 'point' otherlv_1= ':' ) | otherlv_2= 'point:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) )
            // InternalCanvas.g:1658:3: ( (otherlv_0= 'point' otherlv_1= ':' ) | otherlv_2= 'point:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) )
            {
            // InternalCanvas.g:1658:3: ( (otherlv_0= 'point' otherlv_1= ':' ) | otherlv_2= 'point:' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            else if ( (LA37_0==54) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalCanvas.g:1659:4: (otherlv_0= 'point' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1659:4: (otherlv_0= 'point' otherlv_1= ':' )
                    // InternalCanvas.g:1660:5: otherlv_0= 'point' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,53,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getPointDefinitionAccess().getPointKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getPointDefinitionAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1670:4: otherlv_2= 'point:'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getPointDefinitionAccess().getPointKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPointDefinitionAccess().getXKeyword_1());
            		
            // InternalCanvas.g:1679:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalCanvas.g:1680:4: (lv_x_4_0= RULE_INT )
            {
            // InternalCanvas.g:1680:4: (lv_x_4_0= RULE_INT )
            // InternalCanvas.g:1681:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_x_4_0, grammarAccess.getPointDefinitionAccess().getXINTTerminalRuleCall_2_0());
            				

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

            otherlv_5=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getPointDefinitionAccess().getYKeyword_3());
            		
            // InternalCanvas.g:1701:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalCanvas.g:1702:4: (lv_y_6_0= RULE_INT )
            {
            // InternalCanvas.g:1702:4: (lv_y_6_0= RULE_INT )
            // InternalCanvas.g:1703:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_6_0, grammarAccess.getPointDefinitionAccess().getYINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_6_0,
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


    // $ANTLR start "entryRuleRectangle"
    // InternalCanvas.g:1723:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalCanvas.g:1723:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalCanvas.g:1724:2: iv_ruleRectangle= ruleRectangle EOF
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
    // InternalCanvas.g:1730:1: ruleRectangle returns [EObject current=null] : ( ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) ) ) ;
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
            // InternalCanvas.g:1736:2: ( ( ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) ) ) )
            // InternalCanvas.g:1737:2: ( ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) ) )
            {
            // InternalCanvas.g:1737:2: ( ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) ) )
            // InternalCanvas.g:1738:3: ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' ) otherlv_3= 'x' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= 'y' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= 'width' ( (lv_w_8_0= RULE_INT ) ) otherlv_9= 'height' ( (lv_h_10_0= RULE_INT ) )
            {
            // InternalCanvas.g:1738:3: ( (otherlv_0= 'rectangle' otherlv_1= ':' ) | otherlv_2= 'rectangle:' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            else if ( (LA38_0==56) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalCanvas.g:1739:4: (otherlv_0= 'rectangle' otherlv_1= ':' )
                    {
                    // InternalCanvas.g:1739:4: (otherlv_0= 'rectangle' otherlv_1= ':' )
                    // InternalCanvas.g:1740:5: otherlv_0= 'rectangle' otherlv_1= ':'
                    {
                    otherlv_0=(Token)match(input,55,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getRectangleAccess().getRectangleKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getRectangleAccess().getColonKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1750:4: otherlv_2= 'rectangle:'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getRectangleAccess().getRectangleKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getXKeyword_1());
            		
            // InternalCanvas.g:1759:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalCanvas.g:1760:4: (lv_x_4_0= RULE_INT )
            {
            // InternalCanvas.g:1760:4: (lv_x_4_0= RULE_INT )
            // InternalCanvas.g:1761:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,52,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getRectangleAccess().getYKeyword_3());
            		
            // InternalCanvas.g:1781:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalCanvas.g:1782:4: (lv_y_6_0= RULE_INT )
            {
            // InternalCanvas.g:1782:4: (lv_y_6_0= RULE_INT )
            // InternalCanvas.g:1783:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_7=(Token)match(input,57,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getRectangleAccess().getWidthKeyword_5());
            		
            // InternalCanvas.g:1803:3: ( (lv_w_8_0= RULE_INT ) )
            // InternalCanvas.g:1804:4: (lv_w_8_0= RULE_INT )
            {
            // InternalCanvas.g:1804:4: (lv_w_8_0= RULE_INT )
            // InternalCanvas.g:1805:5: lv_w_8_0= RULE_INT
            {
            lv_w_8_0=(Token)match(input,RULE_INT,FOLLOW_29); 

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

            otherlv_9=(Token)match(input,58,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getRectangleAccess().getHeightKeyword_7());
            		
            // InternalCanvas.g:1825:3: ( (lv_h_10_0= RULE_INT ) )
            // InternalCanvas.g:1826:4: (lv_h_10_0= RULE_INT )
            {
            // InternalCanvas.g:1826:4: (lv_h_10_0= RULE_INT )
            // InternalCanvas.g:1827:5: lv_h_10_0= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001800030C002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000018000300002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001002800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007F80000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000180006000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000060000C00002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});

}