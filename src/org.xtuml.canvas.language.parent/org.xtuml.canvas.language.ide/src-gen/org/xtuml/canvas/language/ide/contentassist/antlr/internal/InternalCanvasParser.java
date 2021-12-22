package org.xtuml.canvas.language.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtuml.canvas.language.services.CanvasGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCanvasParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'container'", "'start'", "'end'", "'middle'", "'end_fixed'", "'start_fixed'", "'none'", "'floating'", "'additional'", "'access_path'", "'association'", "'associative_link'", "'class'", "'communication_path'", "'data_type'", "'derived_access_path'", "'derived_communication_path'", "'ee'", "'enumeration_data_type'", "'imported_class'", "'state'", "'state_machine'", "'subsystem'", "'transition'", "'user_data_type'", "'subtype'", "'supertype'", "'creation_transition'", "'sequence'", "'lifeline'", "'timing_mark'", "'time_span'", "'synchronous_message'", "'class_instance_participant'", "'external_entity_participant'", "'class_participant'", "'actor'", "'asynchronous_message'", "'return_message'", "'communication'", "'communication_link'", "'communication_return_message'", "'communication_asynchronous_message'", "'communication_synchronous_message'", "'use_case'", "'use_case_diagram'", "'use_case_binary_association'", "'generalization'", "'include'", "'extend'", "'forkJoin'", "'activity'", "'initial_node'", "'activity_edge'", "'activity_final_node'", "'flow_final_node'", "'generic_action'", "'decision_merge_node'", "'object_node'", "'accept_event_action'", "'send_signal_action'", "'accept_time_event_action'", "'partition'", "'component'", "'provided_interface'", "'required_interface'", "'interface'", "'system_model'", "'structured_data_type'", "'component_reference'", "'component_diagram'", "'delegation'", "'component_container'", "'imported_provided_interface'", "'imported_required_interface'", "'component_participant'", "'package'", "'constant_specification'", "'package_participant'", "'shape'", "'connector'", "'diagram'", "'exception'", "'satisfaction'", "'deployment'", "'render'", "':'", "'properties'", "'viewport'", "'zoom'", "'shapes'", "'texts'", "'text'", "'where'", "'connectors'", "'anchors'", "'polyline'", "'segment'", "'x'", "'y'", "'point'", "'bounds'", "'width'", "'height'"
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

    	public void setGrammarAccess(CanvasGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalCanvas.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCanvas.g:54:1: ( ruleModel EOF )
            // InternalCanvas.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCanvas.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalCanvas.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalCanvas.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalCanvas.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalCanvas.g:69:3: ( rule__Model__Group__0 )
            // InternalCanvas.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelRender"
    // InternalCanvas.g:78:1: entryRuleModelRender : ruleModelRender EOF ;
    public final void entryRuleModelRender() throws RecognitionException {
        try {
            // InternalCanvas.g:79:1: ( ruleModelRender EOF )
            // InternalCanvas.g:80:1: ruleModelRender EOF
            {
             before(grammarAccess.getModelRenderRule()); 
            pushFollow(FOLLOW_1);
            ruleModelRender();

            state._fsp--;

             after(grammarAccess.getModelRenderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelRender"


    // $ANTLR start "ruleModelRender"
    // InternalCanvas.g:87:1: ruleModelRender : ( ( rule__ModelRender__Group__0 ) ) ;
    public final void ruleModelRender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:91:2: ( ( ( rule__ModelRender__Group__0 ) ) )
            // InternalCanvas.g:92:2: ( ( rule__ModelRender__Group__0 ) )
            {
            // InternalCanvas.g:92:2: ( ( rule__ModelRender__Group__0 ) )
            // InternalCanvas.g:93:3: ( rule__ModelRender__Group__0 )
            {
             before(grammarAccess.getModelRenderAccess().getGroup()); 
            // InternalCanvas.g:94:3: ( rule__ModelRender__Group__0 )
            // InternalCanvas.g:94:4: rule__ModelRender__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelRender__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelRenderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelRender"


    // $ANTLR start "entryRuleModelProperties"
    // InternalCanvas.g:103:1: entryRuleModelProperties : ruleModelProperties EOF ;
    public final void entryRuleModelProperties() throws RecognitionException {
        try {
            // InternalCanvas.g:104:1: ( ruleModelProperties EOF )
            // InternalCanvas.g:105:1: ruleModelProperties EOF
            {
             before(grammarAccess.getModelPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleModelProperties();

            state._fsp--;

             after(grammarAccess.getModelPropertiesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelProperties"


    // $ANTLR start "ruleModelProperties"
    // InternalCanvas.g:112:1: ruleModelProperties : ( ( rule__ModelProperties__Group__0 ) ) ;
    public final void ruleModelProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:116:2: ( ( ( rule__ModelProperties__Group__0 ) ) )
            // InternalCanvas.g:117:2: ( ( rule__ModelProperties__Group__0 ) )
            {
            // InternalCanvas.g:117:2: ( ( rule__ModelProperties__Group__0 ) )
            // InternalCanvas.g:118:3: ( rule__ModelProperties__Group__0 )
            {
             before(grammarAccess.getModelPropertiesAccess().getGroup()); 
            // InternalCanvas.g:119:3: ( rule__ModelProperties__Group__0 )
            // InternalCanvas.g:119:4: rule__ModelProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelProperties"


    // $ANTLR start "entryRuleGraphicalElement"
    // InternalCanvas.g:128:1: entryRuleGraphicalElement : ruleGraphicalElement EOF ;
    public final void entryRuleGraphicalElement() throws RecognitionException {
        try {
            // InternalCanvas.g:129:1: ( ruleGraphicalElement EOF )
            // InternalCanvas.g:130:1: ruleGraphicalElement EOF
            {
             before(grammarAccess.getGraphicalElementRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicalElement();

            state._fsp--;

             after(grammarAccess.getGraphicalElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGraphicalElement"


    // $ANTLR start "ruleGraphicalElement"
    // InternalCanvas.g:137:1: ruleGraphicalElement : ( ( rule__GraphicalElement__Alternatives ) ) ;
    public final void ruleGraphicalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:141:2: ( ( ( rule__GraphicalElement__Alternatives ) ) )
            // InternalCanvas.g:142:2: ( ( rule__GraphicalElement__Alternatives ) )
            {
            // InternalCanvas.g:142:2: ( ( rule__GraphicalElement__Alternatives ) )
            // InternalCanvas.g:143:3: ( rule__GraphicalElement__Alternatives )
            {
             before(grammarAccess.getGraphicalElementAccess().getAlternatives()); 
            // InternalCanvas.g:144:3: ( rule__GraphicalElement__Alternatives )
            // InternalCanvas.g:144:4: rule__GraphicalElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphicalElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphicalElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicalElement"


    // $ANTLR start "entryRuleShapes"
    // InternalCanvas.g:153:1: entryRuleShapes : ruleShapes EOF ;
    public final void entryRuleShapes() throws RecognitionException {
        try {
            // InternalCanvas.g:154:1: ( ruleShapes EOF )
            // InternalCanvas.g:155:1: ruleShapes EOF
            {
             before(grammarAccess.getShapesRule()); 
            pushFollow(FOLLOW_1);
            ruleShapes();

            state._fsp--;

             after(grammarAccess.getShapesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShapes"


    // $ANTLR start "ruleShapes"
    // InternalCanvas.g:162:1: ruleShapes : ( ( rule__Shapes__Group__0 ) ) ;
    public final void ruleShapes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:166:2: ( ( ( rule__Shapes__Group__0 ) ) )
            // InternalCanvas.g:167:2: ( ( rule__Shapes__Group__0 ) )
            {
            // InternalCanvas.g:167:2: ( ( rule__Shapes__Group__0 ) )
            // InternalCanvas.g:168:3: ( rule__Shapes__Group__0 )
            {
             before(grammarAccess.getShapesAccess().getGroup()); 
            // InternalCanvas.g:169:3: ( rule__Shapes__Group__0 )
            // InternalCanvas.g:169:4: rule__Shapes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shapes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapes"


    // $ANTLR start "entryRuleShape"
    // InternalCanvas.g:178:1: entryRuleShape : ruleShape EOF ;
    public final void entryRuleShape() throws RecognitionException {
        try {
            // InternalCanvas.g:179:1: ( ruleShape EOF )
            // InternalCanvas.g:180:1: ruleShape EOF
            {
             before(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalCanvas.g:187:1: ruleShape : ( ( rule__Shape__Group__0 ) ) ;
    public final void ruleShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:191:2: ( ( ( rule__Shape__Group__0 ) ) )
            // InternalCanvas.g:192:2: ( ( rule__Shape__Group__0 ) )
            {
            // InternalCanvas.g:192:2: ( ( rule__Shape__Group__0 ) )
            // InternalCanvas.g:193:3: ( rule__Shape__Group__0 )
            {
             before(grammarAccess.getShapeAccess().getGroup()); 
            // InternalCanvas.g:194:3: ( rule__Shape__Group__0 )
            // InternalCanvas.g:194:4: rule__Shape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleContainer"
    // InternalCanvas.g:203:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalCanvas.g:204:1: ( ruleContainer EOF )
            // InternalCanvas.g:205:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalCanvas.g:212:1: ruleContainer : ( 'container' ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:216:2: ( ( 'container' ) )
            // InternalCanvas.g:217:2: ( 'container' )
            {
            // InternalCanvas.g:217:2: ( 'container' )
            // InternalCanvas.g:218:3: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleFloatingTexts"
    // InternalCanvas.g:228:1: entryRuleFloatingTexts : ruleFloatingTexts EOF ;
    public final void entryRuleFloatingTexts() throws RecognitionException {
        try {
            // InternalCanvas.g:229:1: ( ruleFloatingTexts EOF )
            // InternalCanvas.g:230:1: ruleFloatingTexts EOF
            {
             before(grammarAccess.getFloatingTextsRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatingTexts();

            state._fsp--;

             after(grammarAccess.getFloatingTextsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFloatingTexts"


    // $ANTLR start "ruleFloatingTexts"
    // InternalCanvas.g:237:1: ruleFloatingTexts : ( ( rule__FloatingTexts__Group__0 ) ) ;
    public final void ruleFloatingTexts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:241:2: ( ( ( rule__FloatingTexts__Group__0 ) ) )
            // InternalCanvas.g:242:2: ( ( rule__FloatingTexts__Group__0 ) )
            {
            // InternalCanvas.g:242:2: ( ( rule__FloatingTexts__Group__0 ) )
            // InternalCanvas.g:243:3: ( rule__FloatingTexts__Group__0 )
            {
             before(grammarAccess.getFloatingTextsAccess().getGroup()); 
            // InternalCanvas.g:244:3: ( rule__FloatingTexts__Group__0 )
            // InternalCanvas.g:244:4: rule__FloatingTexts__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FloatingTexts__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatingTexts"


    // $ANTLR start "entryRuleFloatingText"
    // InternalCanvas.g:253:1: entryRuleFloatingText : ruleFloatingText EOF ;
    public final void entryRuleFloatingText() throws RecognitionException {
        try {
            // InternalCanvas.g:254:1: ( ruleFloatingText EOF )
            // InternalCanvas.g:255:1: ruleFloatingText EOF
            {
             before(grammarAccess.getFloatingTextRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatingText();

            state._fsp--;

             after(grammarAccess.getFloatingTextRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFloatingText"


    // $ANTLR start "ruleFloatingText"
    // InternalCanvas.g:262:1: ruleFloatingText : ( ( rule__FloatingText__Group__0 ) ) ;
    public final void ruleFloatingText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:266:2: ( ( ( rule__FloatingText__Group__0 ) ) )
            // InternalCanvas.g:267:2: ( ( rule__FloatingText__Group__0 ) )
            {
            // InternalCanvas.g:267:2: ( ( rule__FloatingText__Group__0 ) )
            // InternalCanvas.g:268:3: ( rule__FloatingText__Group__0 )
            {
             before(grammarAccess.getFloatingTextAccess().getGroup()); 
            // InternalCanvas.g:269:3: ( rule__FloatingText__Group__0 )
            // InternalCanvas.g:269:4: rule__FloatingText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatingText"


    // $ANTLR start "entryRuleEnumEnd"
    // InternalCanvas.g:278:1: entryRuleEnumEnd : ruleEnumEnd EOF ;
    public final void entryRuleEnumEnd() throws RecognitionException {
        try {
            // InternalCanvas.g:279:1: ( ruleEnumEnd EOF )
            // InternalCanvas.g:280:1: ruleEnumEnd EOF
            {
             before(grammarAccess.getEnumEndRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumEnd();

            state._fsp--;

             after(grammarAccess.getEnumEndRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnumEnd"


    // $ANTLR start "ruleEnumEnd"
    // InternalCanvas.g:287:1: ruleEnumEnd : ( ( rule__EnumEnd__Group__0 ) ) ;
    public final void ruleEnumEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:291:2: ( ( ( rule__EnumEnd__Group__0 ) ) )
            // InternalCanvas.g:292:2: ( ( rule__EnumEnd__Group__0 ) )
            {
            // InternalCanvas.g:292:2: ( ( rule__EnumEnd__Group__0 ) )
            // InternalCanvas.g:293:3: ( rule__EnumEnd__Group__0 )
            {
             before(grammarAccess.getEnumEndAccess().getGroup()); 
            // InternalCanvas.g:294:3: ( rule__EnumEnd__Group__0 )
            // InternalCanvas.g:294:4: rule__EnumEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumEnd"


    // $ANTLR start "entryRuleConnectors"
    // InternalCanvas.g:303:1: entryRuleConnectors : ruleConnectors EOF ;
    public final void entryRuleConnectors() throws RecognitionException {
        try {
            // InternalCanvas.g:304:1: ( ruleConnectors EOF )
            // InternalCanvas.g:305:1: ruleConnectors EOF
            {
             before(grammarAccess.getConnectorsRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectors();

            state._fsp--;

             after(grammarAccess.getConnectorsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectors"


    // $ANTLR start "ruleConnectors"
    // InternalCanvas.g:312:1: ruleConnectors : ( ( rule__Connectors__Group__0 ) ) ;
    public final void ruleConnectors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:316:2: ( ( ( rule__Connectors__Group__0 ) ) )
            // InternalCanvas.g:317:2: ( ( rule__Connectors__Group__0 ) )
            {
            // InternalCanvas.g:317:2: ( ( rule__Connectors__Group__0 ) )
            // InternalCanvas.g:318:3: ( rule__Connectors__Group__0 )
            {
             before(grammarAccess.getConnectorsAccess().getGroup()); 
            // InternalCanvas.g:319:3: ( rule__Connectors__Group__0 )
            // InternalCanvas.g:319:4: rule__Connectors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connectors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectors"


    // $ANTLR start "entryRuleConnector"
    // InternalCanvas.g:328:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCanvas.g:329:1: ( ruleConnector EOF )
            // InternalCanvas.g:330:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalCanvas.g:337:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:341:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalCanvas.g:342:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalCanvas.g:342:2: ( ( rule__Connector__Group__0 ) )
            // InternalCanvas.g:343:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalCanvas.g:344:3: ( rule__Connector__Group__0 )
            // InternalCanvas.g:344:4: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleAnchors"
    // InternalCanvas.g:353:1: entryRuleAnchors : ruleAnchors EOF ;
    public final void entryRuleAnchors() throws RecognitionException {
        try {
            // InternalCanvas.g:354:1: ( ruleAnchors EOF )
            // InternalCanvas.g:355:1: ruleAnchors EOF
            {
             before(grammarAccess.getAnchorsRule()); 
            pushFollow(FOLLOW_1);
            ruleAnchors();

            state._fsp--;

             after(grammarAccess.getAnchorsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnchors"


    // $ANTLR start "ruleAnchors"
    // InternalCanvas.g:362:1: ruleAnchors : ( ( rule__Anchors__Group__0 ) ) ;
    public final void ruleAnchors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:366:2: ( ( ( rule__Anchors__Group__0 ) ) )
            // InternalCanvas.g:367:2: ( ( rule__Anchors__Group__0 ) )
            {
            // InternalCanvas.g:367:2: ( ( rule__Anchors__Group__0 ) )
            // InternalCanvas.g:368:3: ( rule__Anchors__Group__0 )
            {
             before(grammarAccess.getAnchorsAccess().getGroup()); 
            // InternalCanvas.g:369:3: ( rule__Anchors__Group__0 )
            // InternalCanvas.g:369:4: rule__Anchors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Anchors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnchorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnchors"


    // $ANTLR start "entryRuleStartAnchor"
    // InternalCanvas.g:378:1: entryRuleStartAnchor : ruleStartAnchor EOF ;
    public final void entryRuleStartAnchor() throws RecognitionException {
        try {
            // InternalCanvas.g:379:1: ( ruleStartAnchor EOF )
            // InternalCanvas.g:380:1: ruleStartAnchor EOF
            {
             before(grammarAccess.getStartAnchorRule()); 
            pushFollow(FOLLOW_1);
            ruleStartAnchor();

            state._fsp--;

             after(grammarAccess.getStartAnchorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStartAnchor"


    // $ANTLR start "ruleStartAnchor"
    // InternalCanvas.g:387:1: ruleStartAnchor : ( ( rule__StartAnchor__Group__0 ) ) ;
    public final void ruleStartAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:391:2: ( ( ( rule__StartAnchor__Group__0 ) ) )
            // InternalCanvas.g:392:2: ( ( rule__StartAnchor__Group__0 ) )
            {
            // InternalCanvas.g:392:2: ( ( rule__StartAnchor__Group__0 ) )
            // InternalCanvas.g:393:3: ( rule__StartAnchor__Group__0 )
            {
             before(grammarAccess.getStartAnchorAccess().getGroup()); 
            // InternalCanvas.g:394:3: ( rule__StartAnchor__Group__0 )
            // InternalCanvas.g:394:4: rule__StartAnchor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartAnchor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartAnchorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartAnchor"


    // $ANTLR start "entryRuleEndAnchor"
    // InternalCanvas.g:403:1: entryRuleEndAnchor : ruleEndAnchor EOF ;
    public final void entryRuleEndAnchor() throws RecognitionException {
        try {
            // InternalCanvas.g:404:1: ( ruleEndAnchor EOF )
            // InternalCanvas.g:405:1: ruleEndAnchor EOF
            {
             before(grammarAccess.getEndAnchorRule()); 
            pushFollow(FOLLOW_1);
            ruleEndAnchor();

            state._fsp--;

             after(grammarAccess.getEndAnchorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEndAnchor"


    // $ANTLR start "ruleEndAnchor"
    // InternalCanvas.g:412:1: ruleEndAnchor : ( ( rule__EndAnchor__Group__0 ) ) ;
    public final void ruleEndAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:416:2: ( ( ( rule__EndAnchor__Group__0 ) ) )
            // InternalCanvas.g:417:2: ( ( rule__EndAnchor__Group__0 ) )
            {
            // InternalCanvas.g:417:2: ( ( rule__EndAnchor__Group__0 ) )
            // InternalCanvas.g:418:3: ( rule__EndAnchor__Group__0 )
            {
             before(grammarAccess.getEndAnchorAccess().getGroup()); 
            // InternalCanvas.g:419:3: ( rule__EndAnchor__Group__0 )
            // InternalCanvas.g:419:4: rule__EndAnchor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndAnchor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndAnchorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndAnchor"


    // $ANTLR start "entryRuleAnchor"
    // InternalCanvas.g:428:1: entryRuleAnchor : ruleAnchor EOF ;
    public final void entryRuleAnchor() throws RecognitionException {
        try {
            // InternalCanvas.g:429:1: ( ruleAnchor EOF )
            // InternalCanvas.g:430:1: ruleAnchor EOF
            {
             before(grammarAccess.getAnchorRule()); 
            pushFollow(FOLLOW_1);
            ruleAnchor();

            state._fsp--;

             after(grammarAccess.getAnchorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnchor"


    // $ANTLR start "ruleAnchor"
    // InternalCanvas.g:437:1: ruleAnchor : ( ( rule__Anchor__Alternatives ) ) ;
    public final void ruleAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:441:2: ( ( ( rule__Anchor__Alternatives ) ) )
            // InternalCanvas.g:442:2: ( ( rule__Anchor__Alternatives ) )
            {
            // InternalCanvas.g:442:2: ( ( rule__Anchor__Alternatives ) )
            // InternalCanvas.g:443:3: ( rule__Anchor__Alternatives )
            {
             before(grammarAccess.getAnchorAccess().getAlternatives()); 
            // InternalCanvas.g:444:3: ( rule__Anchor__Alternatives )
            // InternalCanvas.g:444:4: rule__Anchor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Anchor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnchorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnchor"


    // $ANTLR start "entryRuleShapeAnchorElement"
    // InternalCanvas.g:453:1: entryRuleShapeAnchorElement : ruleShapeAnchorElement EOF ;
    public final void entryRuleShapeAnchorElement() throws RecognitionException {
        try {
            // InternalCanvas.g:454:1: ( ruleShapeAnchorElement EOF )
            // InternalCanvas.g:455:1: ruleShapeAnchorElement EOF
            {
             before(grammarAccess.getShapeAnchorElementRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeAnchorElement();

            state._fsp--;

             after(grammarAccess.getShapeAnchorElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShapeAnchorElement"


    // $ANTLR start "ruleShapeAnchorElement"
    // InternalCanvas.g:462:1: ruleShapeAnchorElement : ( ( rule__ShapeAnchorElement__Group__0 ) ) ;
    public final void ruleShapeAnchorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:466:2: ( ( ( rule__ShapeAnchorElement__Group__0 ) ) )
            // InternalCanvas.g:467:2: ( ( rule__ShapeAnchorElement__Group__0 ) )
            {
            // InternalCanvas.g:467:2: ( ( rule__ShapeAnchorElement__Group__0 ) )
            // InternalCanvas.g:468:3: ( rule__ShapeAnchorElement__Group__0 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getGroup()); 
            // InternalCanvas.g:469:3: ( rule__ShapeAnchorElement__Group__0 )
            // InternalCanvas.g:469:4: rule__ShapeAnchorElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeAnchorElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeAnchorElement"


    // $ANTLR start "entryRuleConnectorAnchorElement"
    // InternalCanvas.g:478:1: entryRuleConnectorAnchorElement : ruleConnectorAnchorElement EOF ;
    public final void entryRuleConnectorAnchorElement() throws RecognitionException {
        try {
            // InternalCanvas.g:479:1: ( ruleConnectorAnchorElement EOF )
            // InternalCanvas.g:480:1: ruleConnectorAnchorElement EOF
            {
             before(grammarAccess.getConnectorAnchorElementRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectorAnchorElement();

            state._fsp--;

             after(grammarAccess.getConnectorAnchorElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectorAnchorElement"


    // $ANTLR start "ruleConnectorAnchorElement"
    // InternalCanvas.g:487:1: ruleConnectorAnchorElement : ( ( rule__ConnectorAnchorElement__Group__0 ) ) ;
    public final void ruleConnectorAnchorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:491:2: ( ( ( rule__ConnectorAnchorElement__Group__0 ) ) )
            // InternalCanvas.g:492:2: ( ( rule__ConnectorAnchorElement__Group__0 ) )
            {
            // InternalCanvas.g:492:2: ( ( rule__ConnectorAnchorElement__Group__0 ) )
            // InternalCanvas.g:493:3: ( rule__ConnectorAnchorElement__Group__0 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getGroup()); 
            // InternalCanvas.g:494:3: ( rule__ConnectorAnchorElement__Group__0 )
            // InternalCanvas.g:494:4: rule__ConnectorAnchorElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAnchorElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectorAnchorElement"


    // $ANTLR start "entryRulePolyline"
    // InternalCanvas.g:503:1: entryRulePolyline : rulePolyline EOF ;
    public final void entryRulePolyline() throws RecognitionException {
        try {
            // InternalCanvas.g:504:1: ( rulePolyline EOF )
            // InternalCanvas.g:505:1: rulePolyline EOF
            {
             before(grammarAccess.getPolylineRule()); 
            pushFollow(FOLLOW_1);
            rulePolyline();

            state._fsp--;

             after(grammarAccess.getPolylineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePolyline"


    // $ANTLR start "rulePolyline"
    // InternalCanvas.g:512:1: rulePolyline : ( ( rule__Polyline__Group__0 ) ) ;
    public final void rulePolyline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:516:2: ( ( ( rule__Polyline__Group__0 ) ) )
            // InternalCanvas.g:517:2: ( ( rule__Polyline__Group__0 ) )
            {
            // InternalCanvas.g:517:2: ( ( rule__Polyline__Group__0 ) )
            // InternalCanvas.g:518:3: ( rule__Polyline__Group__0 )
            {
             before(grammarAccess.getPolylineAccess().getGroup()); 
            // InternalCanvas.g:519:3: ( rule__Polyline__Group__0 )
            // InternalCanvas.g:519:4: rule__Polyline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Polyline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolylineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolyline"


    // $ANTLR start "entryRuleSegment"
    // InternalCanvas.g:528:1: entryRuleSegment : ruleSegment EOF ;
    public final void entryRuleSegment() throws RecognitionException {
        try {
            // InternalCanvas.g:529:1: ( ruleSegment EOF )
            // InternalCanvas.g:530:1: ruleSegment EOF
            {
             before(grammarAccess.getSegmentRule()); 
            pushFollow(FOLLOW_1);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getSegmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSegment"


    // $ANTLR start "ruleSegment"
    // InternalCanvas.g:537:1: ruleSegment : ( ( rule__Segment__Group__0 ) ) ;
    public final void ruleSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:541:2: ( ( ( rule__Segment__Group__0 ) ) )
            // InternalCanvas.g:542:2: ( ( rule__Segment__Group__0 ) )
            {
            // InternalCanvas.g:542:2: ( ( rule__Segment__Group__0 ) )
            // InternalCanvas.g:543:3: ( rule__Segment__Group__0 )
            {
             before(grammarAccess.getSegmentAccess().getGroup()); 
            // InternalCanvas.g:544:3: ( rule__Segment__Group__0 )
            // InternalCanvas.g:544:4: rule__Segment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSegment"


    // $ANTLR start "entryRulePoint"
    // InternalCanvas.g:553:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalCanvas.g:554:1: ( rulePoint EOF )
            // InternalCanvas.g:555:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalCanvas.g:562:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:566:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalCanvas.g:567:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalCanvas.g:567:2: ( ( rule__Point__Group__0 ) )
            // InternalCanvas.g:568:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalCanvas.g:569:3: ( rule__Point__Group__0 )
            // InternalCanvas.g:569:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRulePointDefinition"
    // InternalCanvas.g:578:1: entryRulePointDefinition : rulePointDefinition EOF ;
    public final void entryRulePointDefinition() throws RecognitionException {
        try {
            // InternalCanvas.g:579:1: ( rulePointDefinition EOF )
            // InternalCanvas.g:580:1: rulePointDefinition EOF
            {
             before(grammarAccess.getPointDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePointDefinition();

            state._fsp--;

             after(grammarAccess.getPointDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePointDefinition"


    // $ANTLR start "rulePointDefinition"
    // InternalCanvas.g:587:1: rulePointDefinition : ( ( rule__PointDefinition__Group__0 ) ) ;
    public final void rulePointDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:591:2: ( ( ( rule__PointDefinition__Group__0 ) ) )
            // InternalCanvas.g:592:2: ( ( rule__PointDefinition__Group__0 ) )
            {
            // InternalCanvas.g:592:2: ( ( rule__PointDefinition__Group__0 ) )
            // InternalCanvas.g:593:3: ( rule__PointDefinition__Group__0 )
            {
             before(grammarAccess.getPointDefinitionAccess().getGroup()); 
            // InternalCanvas.g:594:3: ( rule__PointDefinition__Group__0 )
            // InternalCanvas.g:594:4: rule__PointDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePointDefinition"


    // $ANTLR start "entryRuleBounds"
    // InternalCanvas.g:603:1: entryRuleBounds : ruleBounds EOF ;
    public final void entryRuleBounds() throws RecognitionException {
        try {
            // InternalCanvas.g:604:1: ( ruleBounds EOF )
            // InternalCanvas.g:605:1: ruleBounds EOF
            {
             before(grammarAccess.getBoundsRule()); 
            pushFollow(FOLLOW_1);
            ruleBounds();

            state._fsp--;

             after(grammarAccess.getBoundsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBounds"


    // $ANTLR start "ruleBounds"
    // InternalCanvas.g:612:1: ruleBounds : ( ( rule__Bounds__Group__0 ) ) ;
    public final void ruleBounds() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:616:2: ( ( ( rule__Bounds__Group__0 ) ) )
            // InternalCanvas.g:617:2: ( ( rule__Bounds__Group__0 ) )
            {
            // InternalCanvas.g:617:2: ( ( rule__Bounds__Group__0 ) )
            // InternalCanvas.g:618:3: ( rule__Bounds__Group__0 )
            {
             before(grammarAccess.getBoundsAccess().getGroup()); 
            // InternalCanvas.g:619:3: ( rule__Bounds__Group__0 )
            // InternalCanvas.g:619:4: rule__Bounds__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bounds__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBounds"


    // $ANTLR start "entryRuleTypeLabel"
    // InternalCanvas.g:628:1: entryRuleTypeLabel : ruleTypeLabel EOF ;
    public final void entryRuleTypeLabel() throws RecognitionException {
        try {
            // InternalCanvas.g:629:1: ( ruleTypeLabel EOF )
            // InternalCanvas.g:630:1: ruleTypeLabel EOF
            {
             before(grammarAccess.getTypeLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeLabel();

            state._fsp--;

             after(grammarAccess.getTypeLabelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeLabel"


    // $ANTLR start "ruleTypeLabel"
    // InternalCanvas.g:637:1: ruleTypeLabel : ( ruleOOAType ) ;
    public final void ruleTypeLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:641:2: ( ( ruleOOAType ) )
            // InternalCanvas.g:642:2: ( ruleOOAType )
            {
            // InternalCanvas.g:642:2: ( ruleOOAType )
            // InternalCanvas.g:643:3: ruleOOAType
            {
             before(grammarAccess.getTypeLabelAccess().getOOATypeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOOAType();

            state._fsp--;

             after(grammarAccess.getTypeLabelAccess().getOOATypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLabel"


    // $ANTLR start "entryRuleOOAType"
    // InternalCanvas.g:653:1: entryRuleOOAType : ruleOOAType EOF ;
    public final void entryRuleOOAType() throws RecognitionException {
        try {
            // InternalCanvas.g:654:1: ( ruleOOAType EOF )
            // InternalCanvas.g:655:1: ruleOOAType EOF
            {
             before(grammarAccess.getOOATypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOOAType();

            state._fsp--;

             after(grammarAccess.getOOATypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOOAType"


    // $ANTLR start "ruleOOAType"
    // InternalCanvas.g:662:1: ruleOOAType : ( ( rule__OOAType__Alternatives ) ) ;
    public final void ruleOOAType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:666:2: ( ( ( rule__OOAType__Alternatives ) ) )
            // InternalCanvas.g:667:2: ( ( rule__OOAType__Alternatives ) )
            {
            // InternalCanvas.g:667:2: ( ( rule__OOAType__Alternatives ) )
            // InternalCanvas.g:668:3: ( rule__OOAType__Alternatives )
            {
             before(grammarAccess.getOOATypeAccess().getAlternatives()); 
            // InternalCanvas.g:669:3: ( rule__OOAType__Alternatives )
            // InternalCanvas.g:669:4: rule__OOAType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OOAType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOOATypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOOAType"


    // $ANTLR start "rule__GraphicalElement__Alternatives"
    // InternalCanvas.g:677:1: rule__GraphicalElement__Alternatives : ( ( ruleShapes ) | ( ruleConnectors ) );
    public final void rule__GraphicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:681:1: ( ( ruleShapes ) | ( ruleConnectors ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==101) ) {
                alt1=1;
            }
            else if ( (LA1_0==105) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCanvas.g:682:2: ( ruleShapes )
                    {
                    // InternalCanvas.g:682:2: ( ruleShapes )
                    // InternalCanvas.g:683:3: ruleShapes
                    {
                     before(grammarAccess.getGraphicalElementAccess().getShapesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleShapes();

                    state._fsp--;

                     after(grammarAccess.getGraphicalElementAccess().getShapesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:688:2: ( ruleConnectors )
                    {
                    // InternalCanvas.g:688:2: ( ruleConnectors )
                    // InternalCanvas.g:689:3: ruleConnectors
                    {
                     before(grammarAccess.getGraphicalElementAccess().getConnectorsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConnectors();

                    state._fsp--;

                     after(grammarAccess.getGraphicalElementAccess().getConnectorsParserRuleCall_1()); 

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
    // $ANTLR end "rule__GraphicalElement__Alternatives"


    // $ANTLR start "rule__EnumEnd__WhereAlternatives_2_0"
    // InternalCanvas.g:698:1: rule__EnumEnd__WhereAlternatives_2_0 : ( ( 'start' ) | ( 'end' ) | ( 'middle' ) | ( 'end_fixed' ) | ( 'start_fixed' ) | ( 'none' ) | ( 'floating' ) | ( 'additional' ) );
    public final void rule__EnumEnd__WhereAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:702:1: ( ( 'start' ) | ( 'end' ) | ( 'middle' ) | ( 'end_fixed' ) | ( 'start_fixed' ) | ( 'none' ) | ( 'floating' ) | ( 'additional' ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            case 19:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCanvas.g:703:2: ( 'start' )
                    {
                    // InternalCanvas.g:703:2: ( 'start' )
                    // InternalCanvas.g:704:3: 'start'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereStartKeyword_2_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereStartKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:709:2: ( 'end' )
                    {
                    // InternalCanvas.g:709:2: ( 'end' )
                    // InternalCanvas.g:710:3: 'end'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereEndKeyword_2_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereEndKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCanvas.g:715:2: ( 'middle' )
                    {
                    // InternalCanvas.g:715:2: ( 'middle' )
                    // InternalCanvas.g:716:3: 'middle'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereMiddleKeyword_2_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereMiddleKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCanvas.g:721:2: ( 'end_fixed' )
                    {
                    // InternalCanvas.g:721:2: ( 'end_fixed' )
                    // InternalCanvas.g:722:3: 'end_fixed'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereEnd_fixedKeyword_2_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereEnd_fixedKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCanvas.g:727:2: ( 'start_fixed' )
                    {
                    // InternalCanvas.g:727:2: ( 'start_fixed' )
                    // InternalCanvas.g:728:3: 'start_fixed'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereStart_fixedKeyword_2_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereStart_fixedKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCanvas.g:733:2: ( 'none' )
                    {
                    // InternalCanvas.g:733:2: ( 'none' )
                    // InternalCanvas.g:734:3: 'none'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereNoneKeyword_2_0_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereNoneKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCanvas.g:739:2: ( 'floating' )
                    {
                    // InternalCanvas.g:739:2: ( 'floating' )
                    // InternalCanvas.g:740:3: 'floating'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereFloatingKeyword_2_0_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereFloatingKeyword_2_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCanvas.g:745:2: ( 'additional' )
                    {
                    // InternalCanvas.g:745:2: ( 'additional' )
                    // InternalCanvas.g:746:3: 'additional'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereAdditionalKeyword_2_0_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereAdditionalKeyword_2_0_7()); 

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
    // $ANTLR end "rule__EnumEnd__WhereAlternatives_2_0"


    // $ANTLR start "rule__Anchor__Alternatives"
    // InternalCanvas.g:755:1: rule__Anchor__Alternatives : ( ( ruleShapeAnchorElement ) | ( ruleConnectorAnchorElement ) );
    public final void rule__Anchor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:759:1: ( ( ruleShapeAnchorElement ) | ( ruleConnectorAnchorElement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==90) ) {
                alt3=1;
            }
            else if ( (LA3_0==91) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCanvas.g:760:2: ( ruleShapeAnchorElement )
                    {
                    // InternalCanvas.g:760:2: ( ruleShapeAnchorElement )
                    // InternalCanvas.g:761:3: ruleShapeAnchorElement
                    {
                     before(grammarAccess.getAnchorAccess().getShapeAnchorElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleShapeAnchorElement();

                    state._fsp--;

                     after(grammarAccess.getAnchorAccess().getShapeAnchorElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:766:2: ( ruleConnectorAnchorElement )
                    {
                    // InternalCanvas.g:766:2: ( ruleConnectorAnchorElement )
                    // InternalCanvas.g:767:3: ruleConnectorAnchorElement
                    {
                     before(grammarAccess.getAnchorAccess().getConnectorAnchorElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConnectorAnchorElement();

                    state._fsp--;

                     after(grammarAccess.getAnchorAccess().getConnectorAnchorElementParserRuleCall_1()); 

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
    // $ANTLR end "rule__Anchor__Alternatives"


    // $ANTLR start "rule__OOAType__Alternatives"
    // InternalCanvas.g:776:1: rule__OOAType__Alternatives : ( ( 'access_path' ) | ( 'association' ) | ( 'associative_link' ) | ( 'class' ) | ( 'communication_path' ) | ( 'data_type' ) | ( 'derived_access_path' ) | ( 'derived_communication_path' ) | ( 'ee' ) | ( 'enumeration_data_type' ) | ( 'imported_class' ) | ( 'none' ) | ( 'state' ) | ( 'state_machine' ) | ( 'subsystem' ) | ( 'transition' ) | ( 'user_data_type' ) | ( 'subtype' ) | ( 'supertype' ) | ( 'creation_transition' ) | ( 'sequence' ) | ( 'lifeline' ) | ( 'timing_mark' ) | ( 'time_span' ) | ( 'synchronous_message' ) | ( 'class_instance_participant' ) | ( 'external_entity_participant' ) | ( 'class_participant' ) | ( 'actor' ) | ( 'asynchronous_message' ) | ( 'return_message' ) | ( 'communication' ) | ( 'communication_link' ) | ( 'communication_return_message' ) | ( 'communication_asynchronous_message' ) | ( 'communication_synchronous_message' ) | ( 'use_case' ) | ( 'use_case_diagram' ) | ( 'use_case_binary_association' ) | ( 'generalization' ) | ( 'include' ) | ( 'extend' ) | ( 'forkJoin' ) | ( 'activity' ) | ( 'initial_node' ) | ( 'activity_edge' ) | ( 'activity_final_node' ) | ( 'flow_final_node' ) | ( 'generic_action' ) | ( 'decision_merge_node' ) | ( 'object_node' ) | ( 'accept_event_action' ) | ( 'send_signal_action' ) | ( 'accept_time_event_action' ) | ( 'partition' ) | ( 'component' ) | ( 'provided_interface' ) | ( 'required_interface' ) | ( 'interface' ) | ( 'system_model' ) | ( 'structured_data_type' ) | ( 'component_reference' ) | ( 'component_diagram' ) | ( 'delegation' ) | ( 'component_container' ) | ( 'imported_provided_interface' ) | ( 'imported_required_interface' ) | ( 'component_participant' ) | ( 'package' ) | ( 'constant_specification' ) | ( 'package_participant' ) | ( 'shape' ) | ( 'connector' ) | ( 'diagram' ) | ( 'exception' ) | ( 'satisfaction' ) | ( 'deployment' ) );
    public final void rule__OOAType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:780:1: ( ( 'access_path' ) | ( 'association' ) | ( 'associative_link' ) | ( 'class' ) | ( 'communication_path' ) | ( 'data_type' ) | ( 'derived_access_path' ) | ( 'derived_communication_path' ) | ( 'ee' ) | ( 'enumeration_data_type' ) | ( 'imported_class' ) | ( 'none' ) | ( 'state' ) | ( 'state_machine' ) | ( 'subsystem' ) | ( 'transition' ) | ( 'user_data_type' ) | ( 'subtype' ) | ( 'supertype' ) | ( 'creation_transition' ) | ( 'sequence' ) | ( 'lifeline' ) | ( 'timing_mark' ) | ( 'time_span' ) | ( 'synchronous_message' ) | ( 'class_instance_participant' ) | ( 'external_entity_participant' ) | ( 'class_participant' ) | ( 'actor' ) | ( 'asynchronous_message' ) | ( 'return_message' ) | ( 'communication' ) | ( 'communication_link' ) | ( 'communication_return_message' ) | ( 'communication_asynchronous_message' ) | ( 'communication_synchronous_message' ) | ( 'use_case' ) | ( 'use_case_diagram' ) | ( 'use_case_binary_association' ) | ( 'generalization' ) | ( 'include' ) | ( 'extend' ) | ( 'forkJoin' ) | ( 'activity' ) | ( 'initial_node' ) | ( 'activity_edge' ) | ( 'activity_final_node' ) | ( 'flow_final_node' ) | ( 'generic_action' ) | ( 'decision_merge_node' ) | ( 'object_node' ) | ( 'accept_event_action' ) | ( 'send_signal_action' ) | ( 'accept_time_event_action' ) | ( 'partition' ) | ( 'component' ) | ( 'provided_interface' ) | ( 'required_interface' ) | ( 'interface' ) | ( 'system_model' ) | ( 'structured_data_type' ) | ( 'component_reference' ) | ( 'component_diagram' ) | ( 'delegation' ) | ( 'component_container' ) | ( 'imported_provided_interface' ) | ( 'imported_required_interface' ) | ( 'component_participant' ) | ( 'package' ) | ( 'constant_specification' ) | ( 'package_participant' ) | ( 'shape' ) | ( 'connector' ) | ( 'diagram' ) | ( 'exception' ) | ( 'satisfaction' ) | ( 'deployment' ) )
            int alt4=77;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case 26:
                {
                alt4=7;
                }
                break;
            case 27:
                {
                alt4=8;
                }
                break;
            case 28:
                {
                alt4=9;
                }
                break;
            case 29:
                {
                alt4=10;
                }
                break;
            case 30:
                {
                alt4=11;
                }
                break;
            case 17:
                {
                alt4=12;
                }
                break;
            case 31:
                {
                alt4=13;
                }
                break;
            case 32:
                {
                alt4=14;
                }
                break;
            case 33:
                {
                alt4=15;
                }
                break;
            case 34:
                {
                alt4=16;
                }
                break;
            case 35:
                {
                alt4=17;
                }
                break;
            case 36:
                {
                alt4=18;
                }
                break;
            case 37:
                {
                alt4=19;
                }
                break;
            case 38:
                {
                alt4=20;
                }
                break;
            case 39:
                {
                alt4=21;
                }
                break;
            case 40:
                {
                alt4=22;
                }
                break;
            case 41:
                {
                alt4=23;
                }
                break;
            case 42:
                {
                alt4=24;
                }
                break;
            case 43:
                {
                alt4=25;
                }
                break;
            case 44:
                {
                alt4=26;
                }
                break;
            case 45:
                {
                alt4=27;
                }
                break;
            case 46:
                {
                alt4=28;
                }
                break;
            case 47:
                {
                alt4=29;
                }
                break;
            case 48:
                {
                alt4=30;
                }
                break;
            case 49:
                {
                alt4=31;
                }
                break;
            case 50:
                {
                alt4=32;
                }
                break;
            case 51:
                {
                alt4=33;
                }
                break;
            case 52:
                {
                alt4=34;
                }
                break;
            case 53:
                {
                alt4=35;
                }
                break;
            case 54:
                {
                alt4=36;
                }
                break;
            case 55:
                {
                alt4=37;
                }
                break;
            case 56:
                {
                alt4=38;
                }
                break;
            case 57:
                {
                alt4=39;
                }
                break;
            case 58:
                {
                alt4=40;
                }
                break;
            case 59:
                {
                alt4=41;
                }
                break;
            case 60:
                {
                alt4=42;
                }
                break;
            case 61:
                {
                alt4=43;
                }
                break;
            case 62:
                {
                alt4=44;
                }
                break;
            case 63:
                {
                alt4=45;
                }
                break;
            case 64:
                {
                alt4=46;
                }
                break;
            case 65:
                {
                alt4=47;
                }
                break;
            case 66:
                {
                alt4=48;
                }
                break;
            case 67:
                {
                alt4=49;
                }
                break;
            case 68:
                {
                alt4=50;
                }
                break;
            case 69:
                {
                alt4=51;
                }
                break;
            case 70:
                {
                alt4=52;
                }
                break;
            case 71:
                {
                alt4=53;
                }
                break;
            case 72:
                {
                alt4=54;
                }
                break;
            case 73:
                {
                alt4=55;
                }
                break;
            case 74:
                {
                alt4=56;
                }
                break;
            case 75:
                {
                alt4=57;
                }
                break;
            case 76:
                {
                alt4=58;
                }
                break;
            case 77:
                {
                alt4=59;
                }
                break;
            case 78:
                {
                alt4=60;
                }
                break;
            case 79:
                {
                alt4=61;
                }
                break;
            case 80:
                {
                alt4=62;
                }
                break;
            case 81:
                {
                alt4=63;
                }
                break;
            case 82:
                {
                alt4=64;
                }
                break;
            case 83:
                {
                alt4=65;
                }
                break;
            case 84:
                {
                alt4=66;
                }
                break;
            case 85:
                {
                alt4=67;
                }
                break;
            case 86:
                {
                alt4=68;
                }
                break;
            case 87:
                {
                alt4=69;
                }
                break;
            case 88:
                {
                alt4=70;
                }
                break;
            case 89:
                {
                alt4=71;
                }
                break;
            case 90:
                {
                alt4=72;
                }
                break;
            case 91:
                {
                alt4=73;
                }
                break;
            case 92:
                {
                alt4=74;
                }
                break;
            case 93:
                {
                alt4=75;
                }
                break;
            case 94:
                {
                alt4=76;
                }
                break;
            case 95:
                {
                alt4=77;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCanvas.g:781:2: ( 'access_path' )
                    {
                    // InternalCanvas.g:781:2: ( 'access_path' )
                    // InternalCanvas.g:782:3: 'access_path'
                    {
                     before(grammarAccess.getOOATypeAccess().getAccess_pathKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getAccess_pathKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:787:2: ( 'association' )
                    {
                    // InternalCanvas.g:787:2: ( 'association' )
                    // InternalCanvas.g:788:3: 'association'
                    {
                     before(grammarAccess.getOOATypeAccess().getAssociationKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getAssociationKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCanvas.g:793:2: ( 'associative_link' )
                    {
                    // InternalCanvas.g:793:2: ( 'associative_link' )
                    // InternalCanvas.g:794:3: 'associative_link'
                    {
                     before(grammarAccess.getOOATypeAccess().getAssociative_linkKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getAssociative_linkKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCanvas.g:799:2: ( 'class' )
                    {
                    // InternalCanvas.g:799:2: ( 'class' )
                    // InternalCanvas.g:800:3: 'class'
                    {
                     before(grammarAccess.getOOATypeAccess().getClassKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getClassKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCanvas.g:805:2: ( 'communication_path' )
                    {
                    // InternalCanvas.g:805:2: ( 'communication_path' )
                    // InternalCanvas.g:806:3: 'communication_path'
                    {
                     before(grammarAccess.getOOATypeAccess().getCommunication_pathKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getCommunication_pathKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCanvas.g:811:2: ( 'data_type' )
                    {
                    // InternalCanvas.g:811:2: ( 'data_type' )
                    // InternalCanvas.g:812:3: 'data_type'
                    {
                     before(grammarAccess.getOOATypeAccess().getData_typeKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getData_typeKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCanvas.g:817:2: ( 'derived_access_path' )
                    {
                    // InternalCanvas.g:817:2: ( 'derived_access_path' )
                    // InternalCanvas.g:818:3: 'derived_access_path'
                    {
                     before(grammarAccess.getOOATypeAccess().getDerived_access_pathKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getDerived_access_pathKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCanvas.g:823:2: ( 'derived_communication_path' )
                    {
                    // InternalCanvas.g:823:2: ( 'derived_communication_path' )
                    // InternalCanvas.g:824:3: 'derived_communication_path'
                    {
                     before(grammarAccess.getOOATypeAccess().getDerived_communication_pathKeyword_7()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getDerived_communication_pathKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCanvas.g:829:2: ( 'ee' )
                    {
                    // InternalCanvas.g:829:2: ( 'ee' )
                    // InternalCanvas.g:830:3: 'ee'
                    {
                     before(grammarAccess.getOOATypeAccess().getEeKeyword_8()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getEeKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCanvas.g:835:2: ( 'enumeration_data_type' )
                    {
                    // InternalCanvas.g:835:2: ( 'enumeration_data_type' )
                    // InternalCanvas.g:836:3: 'enumeration_data_type'
                    {
                     before(grammarAccess.getOOATypeAccess().getEnumeration_data_typeKeyword_9()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getEnumeration_data_typeKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCanvas.g:841:2: ( 'imported_class' )
                    {
                    // InternalCanvas.g:841:2: ( 'imported_class' )
                    // InternalCanvas.g:842:3: 'imported_class'
                    {
                     before(grammarAccess.getOOATypeAccess().getImported_classKeyword_10()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getImported_classKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCanvas.g:847:2: ( 'none' )
                    {
                    // InternalCanvas.g:847:2: ( 'none' )
                    // InternalCanvas.g:848:3: 'none'
                    {
                     before(grammarAccess.getOOATypeAccess().getNoneKeyword_11()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getNoneKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalCanvas.g:853:2: ( 'state' )
                    {
                    // InternalCanvas.g:853:2: ( 'state' )
                    // InternalCanvas.g:854:3: 'state'
                    {
                     before(grammarAccess.getOOATypeAccess().getStateKeyword_12()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getStateKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalCanvas.g:859:2: ( 'state_machine' )
                    {
                    // InternalCanvas.g:859:2: ( 'state_machine' )
                    // InternalCanvas.g:860:3: 'state_machine'
                    {
                     before(grammarAccess.getOOATypeAccess().getState_machineKeyword_13()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getState_machineKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalCanvas.g:865:2: ( 'subsystem' )
                    {
                    // InternalCanvas.g:865:2: ( 'subsystem' )
                    // InternalCanvas.g:866:3: 'subsystem'
                    {
                     before(grammarAccess.getOOATypeAccess().getSubsystemKeyword_14()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getSubsystemKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalCanvas.g:871:2: ( 'transition' )
                    {
                    // InternalCanvas.g:871:2: ( 'transition' )
                    // InternalCanvas.g:872:3: 'transition'
                    {
                     before(grammarAccess.getOOATypeAccess().getTransitionKeyword_15()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getTransitionKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalCanvas.g:877:2: ( 'user_data_type' )
                    {
                    // InternalCanvas.g:877:2: ( 'user_data_type' )
                    // InternalCanvas.g:878:3: 'user_data_type'
                    {
                     before(grammarAccess.getOOATypeAccess().getUser_data_typeKeyword_16()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getUser_data_typeKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalCanvas.g:883:2: ( 'subtype' )
                    {
                    // InternalCanvas.g:883:2: ( 'subtype' )
                    // InternalCanvas.g:884:3: 'subtype'
                    {
                     before(grammarAccess.getOOATypeAccess().getSubtypeKeyword_17()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getSubtypeKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalCanvas.g:889:2: ( 'supertype' )
                    {
                    // InternalCanvas.g:889:2: ( 'supertype' )
                    // InternalCanvas.g:890:3: 'supertype'
                    {
                     before(grammarAccess.getOOATypeAccess().getSupertypeKeyword_18()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getSupertypeKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalCanvas.g:895:2: ( 'creation_transition' )
                    {
                    // InternalCanvas.g:895:2: ( 'creation_transition' )
                    // InternalCanvas.g:896:3: 'creation_transition'
                    {
                     before(grammarAccess.getOOATypeAccess().getCreation_transitionKeyword_19()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getCreation_transitionKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalCanvas.g:901:2: ( 'sequence' )
                    {
                    // InternalCanvas.g:901:2: ( 'sequence' )
                    // InternalCanvas.g:902:3: 'sequence'
                    {
                     before(grammarAccess.getOOATypeAccess().getSequenceKeyword_20()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getSequenceKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalCanvas.g:907:2: ( 'lifeline' )
                    {
                    // InternalCanvas.g:907:2: ( 'lifeline' )
                    // InternalCanvas.g:908:3: 'lifeline'
                    {
                     before(grammarAccess.getOOATypeAccess().getLifelineKeyword_21()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getLifelineKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalCanvas.g:913:2: ( 'timing_mark' )
                    {
                    // InternalCanvas.g:913:2: ( 'timing_mark' )
                    // InternalCanvas.g:914:3: 'timing_mark'
                    {
                     before(grammarAccess.getOOATypeAccess().getTiming_markKeyword_22()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getTiming_markKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalCanvas.g:919:2: ( 'time_span' )
                    {
                    // InternalCanvas.g:919:2: ( 'time_span' )
                    // InternalCanvas.g:920:3: 'time_span'
                    {
                     before(grammarAccess.getOOATypeAccess().getTime_spanKeyword_23()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getTime_spanKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalCanvas.g:925:2: ( 'synchronous_message' )
                    {
                    // InternalCanvas.g:925:2: ( 'synchronous_message' )
                    // InternalCanvas.g:926:3: 'synchronous_message'
                    {
                     before(grammarAccess.getOOATypeAccess().getSynchronous_messageKeyword_24()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getSynchronous_messageKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalCanvas.g:931:2: ( 'class_instance_participant' )
                    {
                    // InternalCanvas.g:931:2: ( 'class_instance_participant' )
                    // InternalCanvas.g:932:3: 'class_instance_participant'
                    {
                     before(grammarAccess.getOOATypeAccess().getClass_instance_participantKeyword_25()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getClass_instance_participantKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalCanvas.g:937:2: ( 'external_entity_participant' )
                    {
                    // InternalCanvas.g:937:2: ( 'external_entity_participant' )
                    // InternalCanvas.g:938:3: 'external_entity_participant'
                    {
                     before(grammarAccess.getOOATypeAccess().getExternal_entity_participantKeyword_26()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getExternal_entity_participantKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalCanvas.g:943:2: ( 'class_participant' )
                    {
                    // InternalCanvas.g:943:2: ( 'class_participant' )
                    // InternalCanvas.g:944:3: 'class_participant'
                    {
                     before(grammarAccess.getOOATypeAccess().getClass_participantKeyword_27()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getClass_participantKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalCanvas.g:949:2: ( 'actor' )
                    {
                    // InternalCanvas.g:949:2: ( 'actor' )
                    // InternalCanvas.g:950:3: 'actor'
                    {
                     before(grammarAccess.getOOATypeAccess().getActorKeyword_28()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getActorKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalCanvas.g:955:2: ( 'asynchronous_message' )
                    {
                    // InternalCanvas.g:955:2: ( 'asynchronous_message' )
                    // InternalCanvas.g:956:3: 'asynchronous_message'
                    {
                     before(grammarAccess.getOOATypeAccess().getAsynchronous_messageKeyword_29()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getAsynchronous_messageKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalCanvas.g:961:2: ( 'return_message' )
                    {
                    // InternalCanvas.g:961:2: ( 'return_message' )
                    // InternalCanvas.g:962:3: 'return_message'
                    {
                     before(grammarAccess.getOOATypeAccess().getReturn_messageKeyword_30()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getReturn_messageKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalCanvas.g:967:2: ( 'communication' )
                    {
                    // InternalCanvas.g:967:2: ( 'communication' )
                    // InternalCanvas.g:968:3: 'communication'
                    {
                     before(grammarAccess.getOOATypeAccess().getCommunicationKeyword_31()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getCommunicationKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalCanvas.g:973:2: ( 'communication_link' )
                    {
                    // InternalCanvas.g:973:2: ( 'communication_link' )
                    // InternalCanvas.g:974:3: 'communication_link'
                    {
                     before(grammarAccess.getOOATypeAccess().getCommunication_linkKeyword_32()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getCommunication_linkKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalCanvas.g:979:2: ( 'communication_return_message' )
                    {
                    // InternalCanvas.g:979:2: ( 'communication_return_message' )
                    // InternalCanvas.g:980:3: 'communication_return_message'
                    {
                     before(grammarAccess.getOOATypeAccess().getCommunication_return_messageKeyword_33()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getCommunication_return_messageKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalCanvas.g:985:2: ( 'communication_asynchronous_message' )
                    {
                    // InternalCanvas.g:985:2: ( 'communication_asynchronous_message' )
                    // InternalCanvas.g:986:3: 'communication_asynchronous_message'
                    {
                     before(grammarAccess.getOOATypeAccess().getCommunication_asynchronous_messageKeyword_34()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getCommunication_asynchronous_messageKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalCanvas.g:991:2: ( 'communication_synchronous_message' )
                    {
                    // InternalCanvas.g:991:2: ( 'communication_synchronous_message' )
                    // InternalCanvas.g:992:3: 'communication_synchronous_message'
                    {
                     before(grammarAccess.getOOATypeAccess().getCommunication_synchronous_messageKeyword_35()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getCommunication_synchronous_messageKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalCanvas.g:997:2: ( 'use_case' )
                    {
                    // InternalCanvas.g:997:2: ( 'use_case' )
                    // InternalCanvas.g:998:3: 'use_case'
                    {
                     before(grammarAccess.getOOATypeAccess().getUse_caseKeyword_36()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getUse_caseKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalCanvas.g:1003:2: ( 'use_case_diagram' )
                    {
                    // InternalCanvas.g:1003:2: ( 'use_case_diagram' )
                    // InternalCanvas.g:1004:3: 'use_case_diagram'
                    {
                     before(grammarAccess.getOOATypeAccess().getUse_case_diagramKeyword_37()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getUse_case_diagramKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalCanvas.g:1009:2: ( 'use_case_binary_association' )
                    {
                    // InternalCanvas.g:1009:2: ( 'use_case_binary_association' )
                    // InternalCanvas.g:1010:3: 'use_case_binary_association'
                    {
                     before(grammarAccess.getOOATypeAccess().getUse_case_binary_associationKeyword_38()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getUse_case_binary_associationKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalCanvas.g:1015:2: ( 'generalization' )
                    {
                    // InternalCanvas.g:1015:2: ( 'generalization' )
                    // InternalCanvas.g:1016:3: 'generalization'
                    {
                     before(grammarAccess.getOOATypeAccess().getGeneralizationKeyword_39()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getGeneralizationKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalCanvas.g:1021:2: ( 'include' )
                    {
                    // InternalCanvas.g:1021:2: ( 'include' )
                    // InternalCanvas.g:1022:3: 'include'
                    {
                     before(grammarAccess.getOOATypeAccess().getIncludeKeyword_40()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getIncludeKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalCanvas.g:1027:2: ( 'extend' )
                    {
                    // InternalCanvas.g:1027:2: ( 'extend' )
                    // InternalCanvas.g:1028:3: 'extend'
                    {
                     before(grammarAccess.getOOATypeAccess().getExtendKeyword_41()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getExtendKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalCanvas.g:1033:2: ( 'forkJoin' )
                    {
                    // InternalCanvas.g:1033:2: ( 'forkJoin' )
                    // InternalCanvas.g:1034:3: 'forkJoin'
                    {
                     before(grammarAccess.getOOATypeAccess().getForkJoinKeyword_42()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getForkJoinKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalCanvas.g:1039:2: ( 'activity' )
                    {
                    // InternalCanvas.g:1039:2: ( 'activity' )
                    // InternalCanvas.g:1040:3: 'activity'
                    {
                     before(grammarAccess.getOOATypeAccess().getActivityKeyword_43()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getActivityKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalCanvas.g:1045:2: ( 'initial_node' )
                    {
                    // InternalCanvas.g:1045:2: ( 'initial_node' )
                    // InternalCanvas.g:1046:3: 'initial_node'
                    {
                     before(grammarAccess.getOOATypeAccess().getInitial_nodeKeyword_44()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getInitial_nodeKeyword_44()); 

                    }


                    }
                    break;
                case 46 :
                    // InternalCanvas.g:1051:2: ( 'activity_edge' )
                    {
                    // InternalCanvas.g:1051:2: ( 'activity_edge' )
                    // InternalCanvas.g:1052:3: 'activity_edge'
                    {
                     before(grammarAccess.getOOATypeAccess().getActivity_edgeKeyword_45()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getActivity_edgeKeyword_45()); 

                    }


                    }
                    break;
                case 47 :
                    // InternalCanvas.g:1057:2: ( 'activity_final_node' )
                    {
                    // InternalCanvas.g:1057:2: ( 'activity_final_node' )
                    // InternalCanvas.g:1058:3: 'activity_final_node'
                    {
                     before(grammarAccess.getOOATypeAccess().getActivity_final_nodeKeyword_46()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getActivity_final_nodeKeyword_46()); 

                    }


                    }
                    break;
                case 48 :
                    // InternalCanvas.g:1063:2: ( 'flow_final_node' )
                    {
                    // InternalCanvas.g:1063:2: ( 'flow_final_node' )
                    // InternalCanvas.g:1064:3: 'flow_final_node'
                    {
                     before(grammarAccess.getOOATypeAccess().getFlow_final_nodeKeyword_47()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getFlow_final_nodeKeyword_47()); 

                    }


                    }
                    break;
                case 49 :
                    // InternalCanvas.g:1069:2: ( 'generic_action' )
                    {
                    // InternalCanvas.g:1069:2: ( 'generic_action' )
                    // InternalCanvas.g:1070:3: 'generic_action'
                    {
                     before(grammarAccess.getOOATypeAccess().getGeneric_actionKeyword_48()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getGeneric_actionKeyword_48()); 

                    }


                    }
                    break;
                case 50 :
                    // InternalCanvas.g:1075:2: ( 'decision_merge_node' )
                    {
                    // InternalCanvas.g:1075:2: ( 'decision_merge_node' )
                    // InternalCanvas.g:1076:3: 'decision_merge_node'
                    {
                     before(grammarAccess.getOOATypeAccess().getDecision_merge_nodeKeyword_49()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getDecision_merge_nodeKeyword_49()); 

                    }


                    }
                    break;
                case 51 :
                    // InternalCanvas.g:1081:2: ( 'object_node' )
                    {
                    // InternalCanvas.g:1081:2: ( 'object_node' )
                    // InternalCanvas.g:1082:3: 'object_node'
                    {
                     before(grammarAccess.getOOATypeAccess().getObject_nodeKeyword_50()); 
                    match(input,69,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getObject_nodeKeyword_50()); 

                    }


                    }
                    break;
                case 52 :
                    // InternalCanvas.g:1087:2: ( 'accept_event_action' )
                    {
                    // InternalCanvas.g:1087:2: ( 'accept_event_action' )
                    // InternalCanvas.g:1088:3: 'accept_event_action'
                    {
                     before(grammarAccess.getOOATypeAccess().getAccept_event_actionKeyword_51()); 
                    match(input,70,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getAccept_event_actionKeyword_51()); 

                    }


                    }
                    break;
                case 53 :
                    // InternalCanvas.g:1093:2: ( 'send_signal_action' )
                    {
                    // InternalCanvas.g:1093:2: ( 'send_signal_action' )
                    // InternalCanvas.g:1094:3: 'send_signal_action'
                    {
                     before(grammarAccess.getOOATypeAccess().getSend_signal_actionKeyword_52()); 
                    match(input,71,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getSend_signal_actionKeyword_52()); 

                    }


                    }
                    break;
                case 54 :
                    // InternalCanvas.g:1099:2: ( 'accept_time_event_action' )
                    {
                    // InternalCanvas.g:1099:2: ( 'accept_time_event_action' )
                    // InternalCanvas.g:1100:3: 'accept_time_event_action'
                    {
                     before(grammarAccess.getOOATypeAccess().getAccept_time_event_actionKeyword_53()); 
                    match(input,72,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getAccept_time_event_actionKeyword_53()); 

                    }


                    }
                    break;
                case 55 :
                    // InternalCanvas.g:1105:2: ( 'partition' )
                    {
                    // InternalCanvas.g:1105:2: ( 'partition' )
                    // InternalCanvas.g:1106:3: 'partition'
                    {
                     before(grammarAccess.getOOATypeAccess().getPartitionKeyword_54()); 
                    match(input,73,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getPartitionKeyword_54()); 

                    }


                    }
                    break;
                case 56 :
                    // InternalCanvas.g:1111:2: ( 'component' )
                    {
                    // InternalCanvas.g:1111:2: ( 'component' )
                    // InternalCanvas.g:1112:3: 'component'
                    {
                     before(grammarAccess.getOOATypeAccess().getComponentKeyword_55()); 
                    match(input,74,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getComponentKeyword_55()); 

                    }


                    }
                    break;
                case 57 :
                    // InternalCanvas.g:1117:2: ( 'provided_interface' )
                    {
                    // InternalCanvas.g:1117:2: ( 'provided_interface' )
                    // InternalCanvas.g:1118:3: 'provided_interface'
                    {
                     before(grammarAccess.getOOATypeAccess().getProvided_interfaceKeyword_56()); 
                    match(input,75,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getProvided_interfaceKeyword_56()); 

                    }


                    }
                    break;
                case 58 :
                    // InternalCanvas.g:1123:2: ( 'required_interface' )
                    {
                    // InternalCanvas.g:1123:2: ( 'required_interface' )
                    // InternalCanvas.g:1124:3: 'required_interface'
                    {
                     before(grammarAccess.getOOATypeAccess().getRequired_interfaceKeyword_57()); 
                    match(input,76,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getRequired_interfaceKeyword_57()); 

                    }


                    }
                    break;
                case 59 :
                    // InternalCanvas.g:1129:2: ( 'interface' )
                    {
                    // InternalCanvas.g:1129:2: ( 'interface' )
                    // InternalCanvas.g:1130:3: 'interface'
                    {
                     before(grammarAccess.getOOATypeAccess().getInterfaceKeyword_58()); 
                    match(input,77,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getInterfaceKeyword_58()); 

                    }


                    }
                    break;
                case 60 :
                    // InternalCanvas.g:1135:2: ( 'system_model' )
                    {
                    // InternalCanvas.g:1135:2: ( 'system_model' )
                    // InternalCanvas.g:1136:3: 'system_model'
                    {
                     before(grammarAccess.getOOATypeAccess().getSystem_modelKeyword_59()); 
                    match(input,78,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getSystem_modelKeyword_59()); 

                    }


                    }
                    break;
                case 61 :
                    // InternalCanvas.g:1141:2: ( 'structured_data_type' )
                    {
                    // InternalCanvas.g:1141:2: ( 'structured_data_type' )
                    // InternalCanvas.g:1142:3: 'structured_data_type'
                    {
                     before(grammarAccess.getOOATypeAccess().getStructured_data_typeKeyword_60()); 
                    match(input,79,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getStructured_data_typeKeyword_60()); 

                    }


                    }
                    break;
                case 62 :
                    // InternalCanvas.g:1147:2: ( 'component_reference' )
                    {
                    // InternalCanvas.g:1147:2: ( 'component_reference' )
                    // InternalCanvas.g:1148:3: 'component_reference'
                    {
                     before(grammarAccess.getOOATypeAccess().getComponent_referenceKeyword_61()); 
                    match(input,80,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getComponent_referenceKeyword_61()); 

                    }


                    }
                    break;
                case 63 :
                    // InternalCanvas.g:1153:2: ( 'component_diagram' )
                    {
                    // InternalCanvas.g:1153:2: ( 'component_diagram' )
                    // InternalCanvas.g:1154:3: 'component_diagram'
                    {
                     before(grammarAccess.getOOATypeAccess().getComponent_diagramKeyword_62()); 
                    match(input,81,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getComponent_diagramKeyword_62()); 

                    }


                    }
                    break;
                case 64 :
                    // InternalCanvas.g:1159:2: ( 'delegation' )
                    {
                    // InternalCanvas.g:1159:2: ( 'delegation' )
                    // InternalCanvas.g:1160:3: 'delegation'
                    {
                     before(grammarAccess.getOOATypeAccess().getDelegationKeyword_63()); 
                    match(input,82,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getDelegationKeyword_63()); 

                    }


                    }
                    break;
                case 65 :
                    // InternalCanvas.g:1165:2: ( 'component_container' )
                    {
                    // InternalCanvas.g:1165:2: ( 'component_container' )
                    // InternalCanvas.g:1166:3: 'component_container'
                    {
                     before(grammarAccess.getOOATypeAccess().getComponent_containerKeyword_64()); 
                    match(input,83,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getComponent_containerKeyword_64()); 

                    }


                    }
                    break;
                case 66 :
                    // InternalCanvas.g:1171:2: ( 'imported_provided_interface' )
                    {
                    // InternalCanvas.g:1171:2: ( 'imported_provided_interface' )
                    // InternalCanvas.g:1172:3: 'imported_provided_interface'
                    {
                     before(grammarAccess.getOOATypeAccess().getImported_provided_interfaceKeyword_65()); 
                    match(input,84,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getImported_provided_interfaceKeyword_65()); 

                    }


                    }
                    break;
                case 67 :
                    // InternalCanvas.g:1177:2: ( 'imported_required_interface' )
                    {
                    // InternalCanvas.g:1177:2: ( 'imported_required_interface' )
                    // InternalCanvas.g:1178:3: 'imported_required_interface'
                    {
                     before(grammarAccess.getOOATypeAccess().getImported_required_interfaceKeyword_66()); 
                    match(input,85,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getImported_required_interfaceKeyword_66()); 

                    }


                    }
                    break;
                case 68 :
                    // InternalCanvas.g:1183:2: ( 'component_participant' )
                    {
                    // InternalCanvas.g:1183:2: ( 'component_participant' )
                    // InternalCanvas.g:1184:3: 'component_participant'
                    {
                     before(grammarAccess.getOOATypeAccess().getComponent_participantKeyword_67()); 
                    match(input,86,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getComponent_participantKeyword_67()); 

                    }


                    }
                    break;
                case 69 :
                    // InternalCanvas.g:1189:2: ( 'package' )
                    {
                    // InternalCanvas.g:1189:2: ( 'package' )
                    // InternalCanvas.g:1190:3: 'package'
                    {
                     before(grammarAccess.getOOATypeAccess().getPackageKeyword_68()); 
                    match(input,87,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getPackageKeyword_68()); 

                    }


                    }
                    break;
                case 70 :
                    // InternalCanvas.g:1195:2: ( 'constant_specification' )
                    {
                    // InternalCanvas.g:1195:2: ( 'constant_specification' )
                    // InternalCanvas.g:1196:3: 'constant_specification'
                    {
                     before(grammarAccess.getOOATypeAccess().getConstant_specificationKeyword_69()); 
                    match(input,88,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getConstant_specificationKeyword_69()); 

                    }


                    }
                    break;
                case 71 :
                    // InternalCanvas.g:1201:2: ( 'package_participant' )
                    {
                    // InternalCanvas.g:1201:2: ( 'package_participant' )
                    // InternalCanvas.g:1202:3: 'package_participant'
                    {
                     before(grammarAccess.getOOATypeAccess().getPackage_participantKeyword_70()); 
                    match(input,89,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getPackage_participantKeyword_70()); 

                    }


                    }
                    break;
                case 72 :
                    // InternalCanvas.g:1207:2: ( 'shape' )
                    {
                    // InternalCanvas.g:1207:2: ( 'shape' )
                    // InternalCanvas.g:1208:3: 'shape'
                    {
                     before(grammarAccess.getOOATypeAccess().getShapeKeyword_71()); 
                    match(input,90,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getShapeKeyword_71()); 

                    }


                    }
                    break;
                case 73 :
                    // InternalCanvas.g:1213:2: ( 'connector' )
                    {
                    // InternalCanvas.g:1213:2: ( 'connector' )
                    // InternalCanvas.g:1214:3: 'connector'
                    {
                     before(grammarAccess.getOOATypeAccess().getConnectorKeyword_72()); 
                    match(input,91,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getConnectorKeyword_72()); 

                    }


                    }
                    break;
                case 74 :
                    // InternalCanvas.g:1219:2: ( 'diagram' )
                    {
                    // InternalCanvas.g:1219:2: ( 'diagram' )
                    // InternalCanvas.g:1220:3: 'diagram'
                    {
                     before(grammarAccess.getOOATypeAccess().getDiagramKeyword_73()); 
                    match(input,92,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getDiagramKeyword_73()); 

                    }


                    }
                    break;
                case 75 :
                    // InternalCanvas.g:1225:2: ( 'exception' )
                    {
                    // InternalCanvas.g:1225:2: ( 'exception' )
                    // InternalCanvas.g:1226:3: 'exception'
                    {
                     before(grammarAccess.getOOATypeAccess().getExceptionKeyword_74()); 
                    match(input,93,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getExceptionKeyword_74()); 

                    }


                    }
                    break;
                case 76 :
                    // InternalCanvas.g:1231:2: ( 'satisfaction' )
                    {
                    // InternalCanvas.g:1231:2: ( 'satisfaction' )
                    // InternalCanvas.g:1232:3: 'satisfaction'
                    {
                     before(grammarAccess.getOOATypeAccess().getSatisfactionKeyword_75()); 
                    match(input,94,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getSatisfactionKeyword_75()); 

                    }


                    }
                    break;
                case 77 :
                    // InternalCanvas.g:1237:2: ( 'deployment' )
                    {
                    // InternalCanvas.g:1237:2: ( 'deployment' )
                    // InternalCanvas.g:1238:3: 'deployment'
                    {
                     before(grammarAccess.getOOATypeAccess().getDeploymentKeyword_76()); 
                    match(input,95,FOLLOW_2); 
                     after(grammarAccess.getOOATypeAccess().getDeploymentKeyword_76()); 

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
    // $ANTLR end "rule__OOAType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalCanvas.g:1247:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1251:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCanvas.g:1252:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalCanvas.g:1259:1: rule__Model__Group__0__Impl : ( ( rule__Model__RenderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1263:1: ( ( ( rule__Model__RenderAssignment_0 ) ) )
            // InternalCanvas.g:1264:1: ( ( rule__Model__RenderAssignment_0 ) )
            {
            // InternalCanvas.g:1264:1: ( ( rule__Model__RenderAssignment_0 ) )
            // InternalCanvas.g:1265:2: ( rule__Model__RenderAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getRenderAssignment_0()); 
            // InternalCanvas.g:1266:2: ( rule__Model__RenderAssignment_0 )
            // InternalCanvas.g:1266:3: rule__Model__RenderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__RenderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRenderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalCanvas.g:1274:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1278:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalCanvas.g:1279:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalCanvas.g:1286:1: rule__Model__Group__1__Impl : ( ( rule__Model__PropertiesAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1290:1: ( ( ( rule__Model__PropertiesAssignment_1 )? ) )
            // InternalCanvas.g:1291:1: ( ( rule__Model__PropertiesAssignment_1 )? )
            {
            // InternalCanvas.g:1291:1: ( ( rule__Model__PropertiesAssignment_1 )? )
            // InternalCanvas.g:1292:2: ( rule__Model__PropertiesAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_1()); 
            // InternalCanvas.g:1293:2: ( rule__Model__PropertiesAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==98) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCanvas.g:1293:3: rule__Model__PropertiesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PropertiesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getPropertiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalCanvas.g:1301:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1305:1: ( rule__Model__Group__2__Impl )
            // InternalCanvas.g:1306:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalCanvas.g:1312:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1316:1: ( ( ( rule__Model__ElementsAssignment_2 )* ) )
            // InternalCanvas.g:1317:1: ( ( rule__Model__ElementsAssignment_2 )* )
            {
            // InternalCanvas.g:1317:1: ( ( rule__Model__ElementsAssignment_2 )* )
            // InternalCanvas.g:1318:2: ( rule__Model__ElementsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // InternalCanvas.g:1319:2: ( rule__Model__ElementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==101||LA6_0==105) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCanvas.g:1319:3: rule__Model__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__ModelRender__Group__0"
    // InternalCanvas.g:1328:1: rule__ModelRender__Group__0 : rule__ModelRender__Group__0__Impl rule__ModelRender__Group__1 ;
    public final void rule__ModelRender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1332:1: ( rule__ModelRender__Group__0__Impl rule__ModelRender__Group__1 )
            // InternalCanvas.g:1333:2: rule__ModelRender__Group__0__Impl rule__ModelRender__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelRender__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelRender__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group__0"


    // $ANTLR start "rule__ModelRender__Group__0__Impl"
    // InternalCanvas.g:1340:1: rule__ModelRender__Group__0__Impl : ( 'render' ) ;
    public final void rule__ModelRender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1344:1: ( ( 'render' ) )
            // InternalCanvas.g:1345:1: ( 'render' )
            {
            // InternalCanvas.g:1345:1: ( 'render' )
            // InternalCanvas.g:1346:2: 'render'
            {
             before(grammarAccess.getModelRenderAccess().getRenderKeyword_0()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getModelRenderAccess().getRenderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group__0__Impl"


    // $ANTLR start "rule__ModelRender__Group__1"
    // InternalCanvas.g:1355:1: rule__ModelRender__Group__1 : rule__ModelRender__Group__1__Impl rule__ModelRender__Group__2 ;
    public final void rule__ModelRender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1359:1: ( rule__ModelRender__Group__1__Impl rule__ModelRender__Group__2 )
            // InternalCanvas.g:1360:2: rule__ModelRender__Group__1__Impl rule__ModelRender__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ModelRender__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelRender__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group__1"


    // $ANTLR start "rule__ModelRender__Group__1__Impl"
    // InternalCanvas.g:1367:1: rule__ModelRender__Group__1__Impl : ( ':' ) ;
    public final void rule__ModelRender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1371:1: ( ( ':' ) )
            // InternalCanvas.g:1372:1: ( ':' )
            {
            // InternalCanvas.g:1372:1: ( ':' )
            // InternalCanvas.g:1373:2: ':'
            {
             before(grammarAccess.getModelRenderAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getModelRenderAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group__1__Impl"


    // $ANTLR start "rule__ModelRender__Group__2"
    // InternalCanvas.g:1382:1: rule__ModelRender__Group__2 : rule__ModelRender__Group__2__Impl ;
    public final void rule__ModelRender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1386:1: ( rule__ModelRender__Group__2__Impl )
            // InternalCanvas.g:1387:2: rule__ModelRender__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelRender__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group__2"


    // $ANTLR start "rule__ModelRender__Group__2__Impl"
    // InternalCanvas.g:1393:1: rule__ModelRender__Group__2__Impl : ( ( rule__ModelRender__ImportURIAssignment_2 ) ) ;
    public final void rule__ModelRender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1397:1: ( ( ( rule__ModelRender__ImportURIAssignment_2 ) ) )
            // InternalCanvas.g:1398:1: ( ( rule__ModelRender__ImportURIAssignment_2 ) )
            {
            // InternalCanvas.g:1398:1: ( ( rule__ModelRender__ImportURIAssignment_2 ) )
            // InternalCanvas.g:1399:2: ( rule__ModelRender__ImportURIAssignment_2 )
            {
             before(grammarAccess.getModelRenderAccess().getImportURIAssignment_2()); 
            // InternalCanvas.g:1400:2: ( rule__ModelRender__ImportURIAssignment_2 )
            // InternalCanvas.g:1400:3: rule__ModelRender__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelRender__ImportURIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelRenderAccess().getImportURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group__2__Impl"


    // $ANTLR start "rule__ModelProperties__Group__0"
    // InternalCanvas.g:1409:1: rule__ModelProperties__Group__0 : rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1 ;
    public final void rule__ModelProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1413:1: ( rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1 )
            // InternalCanvas.g:1414:2: rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ModelProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__0"


    // $ANTLR start "rule__ModelProperties__Group__0__Impl"
    // InternalCanvas.g:1421:1: rule__ModelProperties__Group__0__Impl : ( 'properties' ) ;
    public final void rule__ModelProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1425:1: ( ( 'properties' ) )
            // InternalCanvas.g:1426:1: ( 'properties' )
            {
            // InternalCanvas.g:1426:1: ( 'properties' )
            // InternalCanvas.g:1427:2: 'properties'
            {
             before(grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__0__Impl"


    // $ANTLR start "rule__ModelProperties__Group__1"
    // InternalCanvas.g:1436:1: rule__ModelProperties__Group__1 : rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2 ;
    public final void rule__ModelProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1440:1: ( rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2 )
            // InternalCanvas.g:1441:2: rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ModelProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__1"


    // $ANTLR start "rule__ModelProperties__Group__1__Impl"
    // InternalCanvas.g:1448:1: rule__ModelProperties__Group__1__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1452:1: ( ( ':' ) )
            // InternalCanvas.g:1453:1: ( ':' )
            {
            // InternalCanvas.g:1453:1: ( ':' )
            // InternalCanvas.g:1454:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__1__Impl"


    // $ANTLR start "rule__ModelProperties__Group__2"
    // InternalCanvas.g:1463:1: rule__ModelProperties__Group__2 : rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3 ;
    public final void rule__ModelProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1467:1: ( rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3 )
            // InternalCanvas.g:1468:2: rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ModelProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__2"


    // $ANTLR start "rule__ModelProperties__Group__2__Impl"
    // InternalCanvas.g:1475:1: rule__ModelProperties__Group__2__Impl : ( 'viewport' ) ;
    public final void rule__ModelProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1479:1: ( ( 'viewport' ) )
            // InternalCanvas.g:1480:1: ( 'viewport' )
            {
            // InternalCanvas.g:1480:1: ( 'viewport' )
            // InternalCanvas.g:1481:2: 'viewport'
            {
             before(grammarAccess.getModelPropertiesAccess().getViewportKeyword_2()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getViewportKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__2__Impl"


    // $ANTLR start "rule__ModelProperties__Group__3"
    // InternalCanvas.g:1490:1: rule__ModelProperties__Group__3 : rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4 ;
    public final void rule__ModelProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1494:1: ( rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4 )
            // InternalCanvas.g:1495:2: rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ModelProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__3"


    // $ANTLR start "rule__ModelProperties__Group__3__Impl"
    // InternalCanvas.g:1502:1: rule__ModelProperties__Group__3__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1506:1: ( ( ':' ) )
            // InternalCanvas.g:1507:1: ( ':' )
            {
            // InternalCanvas.g:1507:1: ( ':' )
            // InternalCanvas.g:1508:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_3()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__3__Impl"


    // $ANTLR start "rule__ModelProperties__Group__4"
    // InternalCanvas.g:1517:1: rule__ModelProperties__Group__4 : rule__ModelProperties__Group__4__Impl rule__ModelProperties__Group__5 ;
    public final void rule__ModelProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1521:1: ( rule__ModelProperties__Group__4__Impl rule__ModelProperties__Group__5 )
            // InternalCanvas.g:1522:2: rule__ModelProperties__Group__4__Impl rule__ModelProperties__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ModelProperties__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__4"


    // $ANTLR start "rule__ModelProperties__Group__4__Impl"
    // InternalCanvas.g:1529:1: rule__ModelProperties__Group__4__Impl : ( ( rule__ModelProperties__PointAssignment_4 ) ) ;
    public final void rule__ModelProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1533:1: ( ( ( rule__ModelProperties__PointAssignment_4 ) ) )
            // InternalCanvas.g:1534:1: ( ( rule__ModelProperties__PointAssignment_4 ) )
            {
            // InternalCanvas.g:1534:1: ( ( rule__ModelProperties__PointAssignment_4 ) )
            // InternalCanvas.g:1535:2: ( rule__ModelProperties__PointAssignment_4 )
            {
             before(grammarAccess.getModelPropertiesAccess().getPointAssignment_4()); 
            // InternalCanvas.g:1536:2: ( rule__ModelProperties__PointAssignment_4 )
            // InternalCanvas.g:1536:3: rule__ModelProperties__PointAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__PointAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertiesAccess().getPointAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__4__Impl"


    // $ANTLR start "rule__ModelProperties__Group__5"
    // InternalCanvas.g:1544:1: rule__ModelProperties__Group__5 : rule__ModelProperties__Group__5__Impl rule__ModelProperties__Group__6 ;
    public final void rule__ModelProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1548:1: ( rule__ModelProperties__Group__5__Impl rule__ModelProperties__Group__6 )
            // InternalCanvas.g:1549:2: rule__ModelProperties__Group__5__Impl rule__ModelProperties__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__ModelProperties__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__5"


    // $ANTLR start "rule__ModelProperties__Group__5__Impl"
    // InternalCanvas.g:1556:1: rule__ModelProperties__Group__5__Impl : ( 'zoom' ) ;
    public final void rule__ModelProperties__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1560:1: ( ( 'zoom' ) )
            // InternalCanvas.g:1561:1: ( 'zoom' )
            {
            // InternalCanvas.g:1561:1: ( 'zoom' )
            // InternalCanvas.g:1562:2: 'zoom'
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomKeyword_5()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getZoomKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__5__Impl"


    // $ANTLR start "rule__ModelProperties__Group__6"
    // InternalCanvas.g:1571:1: rule__ModelProperties__Group__6 : rule__ModelProperties__Group__6__Impl rule__ModelProperties__Group__7 ;
    public final void rule__ModelProperties__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1575:1: ( rule__ModelProperties__Group__6__Impl rule__ModelProperties__Group__7 )
            // InternalCanvas.g:1576:2: rule__ModelProperties__Group__6__Impl rule__ModelProperties__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__ModelProperties__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__6"


    // $ANTLR start "rule__ModelProperties__Group__6__Impl"
    // InternalCanvas.g:1583:1: rule__ModelProperties__Group__6__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1587:1: ( ( ':' ) )
            // InternalCanvas.g:1588:1: ( ':' )
            {
            // InternalCanvas.g:1588:1: ( ':' )
            // InternalCanvas.g:1589:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_6()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__6__Impl"


    // $ANTLR start "rule__ModelProperties__Group__7"
    // InternalCanvas.g:1598:1: rule__ModelProperties__Group__7 : rule__ModelProperties__Group__7__Impl ;
    public final void rule__ModelProperties__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1602:1: ( rule__ModelProperties__Group__7__Impl )
            // InternalCanvas.g:1603:2: rule__ModelProperties__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__7"


    // $ANTLR start "rule__ModelProperties__Group__7__Impl"
    // InternalCanvas.g:1609:1: rule__ModelProperties__Group__7__Impl : ( ( rule__ModelProperties__ZoomAssignment_7 ) ) ;
    public final void rule__ModelProperties__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1613:1: ( ( ( rule__ModelProperties__ZoomAssignment_7 ) ) )
            // InternalCanvas.g:1614:1: ( ( rule__ModelProperties__ZoomAssignment_7 ) )
            {
            // InternalCanvas.g:1614:1: ( ( rule__ModelProperties__ZoomAssignment_7 ) )
            // InternalCanvas.g:1615:2: ( rule__ModelProperties__ZoomAssignment_7 )
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomAssignment_7()); 
            // InternalCanvas.g:1616:2: ( rule__ModelProperties__ZoomAssignment_7 )
            // InternalCanvas.g:1616:3: rule__ModelProperties__ZoomAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__ZoomAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertiesAccess().getZoomAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group__7__Impl"


    // $ANTLR start "rule__Shapes__Group__0"
    // InternalCanvas.g:1625:1: rule__Shapes__Group__0 : rule__Shapes__Group__0__Impl rule__Shapes__Group__1 ;
    public final void rule__Shapes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1629:1: ( rule__Shapes__Group__0__Impl rule__Shapes__Group__1 )
            // InternalCanvas.g:1630:2: rule__Shapes__Group__0__Impl rule__Shapes__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Shapes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shapes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group__0"


    // $ANTLR start "rule__Shapes__Group__0__Impl"
    // InternalCanvas.g:1637:1: rule__Shapes__Group__0__Impl : ( () ) ;
    public final void rule__Shapes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1641:1: ( ( () ) )
            // InternalCanvas.g:1642:1: ( () )
            {
            // InternalCanvas.g:1642:1: ( () )
            // InternalCanvas.g:1643:2: ()
            {
             before(grammarAccess.getShapesAccess().getShapesAction_0()); 
            // InternalCanvas.g:1644:2: ()
            // InternalCanvas.g:1644:3: 
            {
            }

             after(grammarAccess.getShapesAccess().getShapesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group__0__Impl"


    // $ANTLR start "rule__Shapes__Group__1"
    // InternalCanvas.g:1652:1: rule__Shapes__Group__1 : rule__Shapes__Group__1__Impl rule__Shapes__Group__2 ;
    public final void rule__Shapes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1656:1: ( rule__Shapes__Group__1__Impl rule__Shapes__Group__2 )
            // InternalCanvas.g:1657:2: rule__Shapes__Group__1__Impl rule__Shapes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Shapes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shapes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group__1"


    // $ANTLR start "rule__Shapes__Group__1__Impl"
    // InternalCanvas.g:1664:1: rule__Shapes__Group__1__Impl : ( 'shapes' ) ;
    public final void rule__Shapes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1668:1: ( ( 'shapes' ) )
            // InternalCanvas.g:1669:1: ( 'shapes' )
            {
            // InternalCanvas.g:1669:1: ( 'shapes' )
            // InternalCanvas.g:1670:2: 'shapes'
            {
             before(grammarAccess.getShapesAccess().getShapesKeyword_1()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getShapesAccess().getShapesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group__1__Impl"


    // $ANTLR start "rule__Shapes__Group__2"
    // InternalCanvas.g:1679:1: rule__Shapes__Group__2 : rule__Shapes__Group__2__Impl rule__Shapes__Group__3 ;
    public final void rule__Shapes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1683:1: ( rule__Shapes__Group__2__Impl rule__Shapes__Group__3 )
            // InternalCanvas.g:1684:2: rule__Shapes__Group__2__Impl rule__Shapes__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Shapes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shapes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group__2"


    // $ANTLR start "rule__Shapes__Group__2__Impl"
    // InternalCanvas.g:1691:1: rule__Shapes__Group__2__Impl : ( ':' ) ;
    public final void rule__Shapes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1695:1: ( ( ':' ) )
            // InternalCanvas.g:1696:1: ( ':' )
            {
            // InternalCanvas.g:1696:1: ( ':' )
            // InternalCanvas.g:1697:2: ':'
            {
             before(grammarAccess.getShapesAccess().getColonKeyword_2()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getShapesAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group__2__Impl"


    // $ANTLR start "rule__Shapes__Group__3"
    // InternalCanvas.g:1706:1: rule__Shapes__Group__3 : rule__Shapes__Group__3__Impl ;
    public final void rule__Shapes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1710:1: ( rule__Shapes__Group__3__Impl )
            // InternalCanvas.g:1711:2: rule__Shapes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shapes__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group__3"


    // $ANTLR start "rule__Shapes__Group__3__Impl"
    // InternalCanvas.g:1717:1: rule__Shapes__Group__3__Impl : ( ( rule__Shapes__ShapesAssignment_3 )* ) ;
    public final void rule__Shapes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1721:1: ( ( ( rule__Shapes__ShapesAssignment_3 )* ) )
            // InternalCanvas.g:1722:1: ( ( rule__Shapes__ShapesAssignment_3 )* )
            {
            // InternalCanvas.g:1722:1: ( ( rule__Shapes__ShapesAssignment_3 )* )
            // InternalCanvas.g:1723:2: ( rule__Shapes__ShapesAssignment_3 )*
            {
             before(grammarAccess.getShapesAccess().getShapesAssignment_3()); 
            // InternalCanvas.g:1724:2: ( rule__Shapes__ShapesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==90) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCanvas.g:1724:3: rule__Shapes__ShapesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Shapes__ShapesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getShapesAccess().getShapesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group__3__Impl"


    // $ANTLR start "rule__Shape__Group__0"
    // InternalCanvas.g:1733:1: rule__Shape__Group__0 : rule__Shape__Group__0__Impl rule__Shape__Group__1 ;
    public final void rule__Shape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1737:1: ( rule__Shape__Group__0__Impl rule__Shape__Group__1 )
            // InternalCanvas.g:1738:2: rule__Shape__Group__0__Impl rule__Shape__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Shape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__0"


    // $ANTLR start "rule__Shape__Group__0__Impl"
    // InternalCanvas.g:1745:1: rule__Shape__Group__0__Impl : ( () ) ;
    public final void rule__Shape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1749:1: ( ( () ) )
            // InternalCanvas.g:1750:1: ( () )
            {
            // InternalCanvas.g:1750:1: ( () )
            // InternalCanvas.g:1751:2: ()
            {
             before(grammarAccess.getShapeAccess().getShapeAction_0()); 
            // InternalCanvas.g:1752:2: ()
            // InternalCanvas.g:1752:3: 
            {
            }

             after(grammarAccess.getShapeAccess().getShapeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__0__Impl"


    // $ANTLR start "rule__Shape__Group__1"
    // InternalCanvas.g:1760:1: rule__Shape__Group__1 : rule__Shape__Group__1__Impl rule__Shape__Group__2 ;
    public final void rule__Shape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1764:1: ( rule__Shape__Group__1__Impl rule__Shape__Group__2 )
            // InternalCanvas.g:1765:2: rule__Shape__Group__1__Impl rule__Shape__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Shape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__1"


    // $ANTLR start "rule__Shape__Group__1__Impl"
    // InternalCanvas.g:1772:1: rule__Shape__Group__1__Impl : ( 'shape' ) ;
    public final void rule__Shape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1776:1: ( ( 'shape' ) )
            // InternalCanvas.g:1777:1: ( 'shape' )
            {
            // InternalCanvas.g:1777:1: ( 'shape' )
            // InternalCanvas.g:1778:2: 'shape'
            {
             before(grammarAccess.getShapeAccess().getShapeKeyword_1()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getShapeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__1__Impl"


    // $ANTLR start "rule__Shape__Group__2"
    // InternalCanvas.g:1787:1: rule__Shape__Group__2 : rule__Shape__Group__2__Impl rule__Shape__Group__3 ;
    public final void rule__Shape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1791:1: ( rule__Shape__Group__2__Impl rule__Shape__Group__3 )
            // InternalCanvas.g:1792:2: rule__Shape__Group__2__Impl rule__Shape__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Shape__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__2"


    // $ANTLR start "rule__Shape__Group__2__Impl"
    // InternalCanvas.g:1799:1: rule__Shape__Group__2__Impl : ( ':' ) ;
    public final void rule__Shape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1803:1: ( ( ':' ) )
            // InternalCanvas.g:1804:1: ( ':' )
            {
            // InternalCanvas.g:1804:1: ( ':' )
            // InternalCanvas.g:1805:2: ':'
            {
             before(grammarAccess.getShapeAccess().getColonKeyword_2()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__2__Impl"


    // $ANTLR start "rule__Shape__Group__3"
    // InternalCanvas.g:1814:1: rule__Shape__Group__3 : rule__Shape__Group__3__Impl rule__Shape__Group__4 ;
    public final void rule__Shape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1818:1: ( rule__Shape__Group__3__Impl rule__Shape__Group__4 )
            // InternalCanvas.g:1819:2: rule__Shape__Group__3__Impl rule__Shape__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Shape__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__3"


    // $ANTLR start "rule__Shape__Group__3__Impl"
    // InternalCanvas.g:1826:1: rule__Shape__Group__3__Impl : ( ( rule__Shape__NameAssignment_3 ) ) ;
    public final void rule__Shape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1830:1: ( ( ( rule__Shape__NameAssignment_3 ) ) )
            // InternalCanvas.g:1831:1: ( ( rule__Shape__NameAssignment_3 ) )
            {
            // InternalCanvas.g:1831:1: ( ( rule__Shape__NameAssignment_3 ) )
            // InternalCanvas.g:1832:2: ( rule__Shape__NameAssignment_3 )
            {
             before(grammarAccess.getShapeAccess().getNameAssignment_3()); 
            // InternalCanvas.g:1833:2: ( rule__Shape__NameAssignment_3 )
            // InternalCanvas.g:1833:3: rule__Shape__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Shape__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__3__Impl"


    // $ANTLR start "rule__Shape__Group__4"
    // InternalCanvas.g:1841:1: rule__Shape__Group__4 : rule__Shape__Group__4__Impl rule__Shape__Group__5 ;
    public final void rule__Shape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1845:1: ( rule__Shape__Group__4__Impl rule__Shape__Group__5 )
            // InternalCanvas.g:1846:2: rule__Shape__Group__4__Impl rule__Shape__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Shape__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__4"


    // $ANTLR start "rule__Shape__Group__4__Impl"
    // InternalCanvas.g:1853:1: rule__Shape__Group__4__Impl : ( ( rule__Shape__ContainerAssignment_4 )? ) ;
    public final void rule__Shape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1857:1: ( ( ( rule__Shape__ContainerAssignment_4 )? ) )
            // InternalCanvas.g:1858:1: ( ( rule__Shape__ContainerAssignment_4 )? )
            {
            // InternalCanvas.g:1858:1: ( ( rule__Shape__ContainerAssignment_4 )? )
            // InternalCanvas.g:1859:2: ( rule__Shape__ContainerAssignment_4 )?
            {
             before(grammarAccess.getShapeAccess().getContainerAssignment_4()); 
            // InternalCanvas.g:1860:2: ( rule__Shape__ContainerAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCanvas.g:1860:3: rule__Shape__ContainerAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__ContainerAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeAccess().getContainerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__4__Impl"


    // $ANTLR start "rule__Shape__Group__5"
    // InternalCanvas.g:1868:1: rule__Shape__Group__5 : rule__Shape__Group__5__Impl rule__Shape__Group__6 ;
    public final void rule__Shape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1872:1: ( rule__Shape__Group__5__Impl rule__Shape__Group__6 )
            // InternalCanvas.g:1873:2: rule__Shape__Group__5__Impl rule__Shape__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Shape__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__5"


    // $ANTLR start "rule__Shape__Group__5__Impl"
    // InternalCanvas.g:1880:1: rule__Shape__Group__5__Impl : ( 'render' ) ;
    public final void rule__Shape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1884:1: ( ( 'render' ) )
            // InternalCanvas.g:1885:1: ( 'render' )
            {
            // InternalCanvas.g:1885:1: ( 'render' )
            // InternalCanvas.g:1886:2: 'render'
            {
             before(grammarAccess.getShapeAccess().getRenderKeyword_5()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getRenderKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__5__Impl"


    // $ANTLR start "rule__Shape__Group__6"
    // InternalCanvas.g:1895:1: rule__Shape__Group__6 : rule__Shape__Group__6__Impl rule__Shape__Group__7 ;
    public final void rule__Shape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1899:1: ( rule__Shape__Group__6__Impl rule__Shape__Group__7 )
            // InternalCanvas.g:1900:2: rule__Shape__Group__6__Impl rule__Shape__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Shape__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__6"


    // $ANTLR start "rule__Shape__Group__6__Impl"
    // InternalCanvas.g:1907:1: rule__Shape__Group__6__Impl : ( ':' ) ;
    public final void rule__Shape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1911:1: ( ( ':' ) )
            // InternalCanvas.g:1912:1: ( ':' )
            {
            // InternalCanvas.g:1912:1: ( ':' )
            // InternalCanvas.g:1913:2: ':'
            {
             before(grammarAccess.getShapeAccess().getColonKeyword_6()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__6__Impl"


    // $ANTLR start "rule__Shape__Group__7"
    // InternalCanvas.g:1922:1: rule__Shape__Group__7 : rule__Shape__Group__7__Impl rule__Shape__Group__8 ;
    public final void rule__Shape__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1926:1: ( rule__Shape__Group__7__Impl rule__Shape__Group__8 )
            // InternalCanvas.g:1927:2: rule__Shape__Group__7__Impl rule__Shape__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Shape__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__7"


    // $ANTLR start "rule__Shape__Group__7__Impl"
    // InternalCanvas.g:1934:1: rule__Shape__Group__7__Impl : ( ( rule__Shape__TypeAssignment_7 ) ) ;
    public final void rule__Shape__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1938:1: ( ( ( rule__Shape__TypeAssignment_7 ) ) )
            // InternalCanvas.g:1939:1: ( ( rule__Shape__TypeAssignment_7 ) )
            {
            // InternalCanvas.g:1939:1: ( ( rule__Shape__TypeAssignment_7 ) )
            // InternalCanvas.g:1940:2: ( rule__Shape__TypeAssignment_7 )
            {
             before(grammarAccess.getShapeAccess().getTypeAssignment_7()); 
            // InternalCanvas.g:1941:2: ( rule__Shape__TypeAssignment_7 )
            // InternalCanvas.g:1941:3: rule__Shape__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Shape__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__7__Impl"


    // $ANTLR start "rule__Shape__Group__8"
    // InternalCanvas.g:1949:1: rule__Shape__Group__8 : rule__Shape__Group__8__Impl rule__Shape__Group__9 ;
    public final void rule__Shape__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1953:1: ( rule__Shape__Group__8__Impl rule__Shape__Group__9 )
            // InternalCanvas.g:1954:2: rule__Shape__Group__8__Impl rule__Shape__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Shape__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__8"


    // $ANTLR start "rule__Shape__Group__8__Impl"
    // InternalCanvas.g:1961:1: rule__Shape__Group__8__Impl : ( ( rule__Shape__RepresentsAssignment_8 ) ) ;
    public final void rule__Shape__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1965:1: ( ( ( rule__Shape__RepresentsAssignment_8 ) ) )
            // InternalCanvas.g:1966:1: ( ( rule__Shape__RepresentsAssignment_8 ) )
            {
            // InternalCanvas.g:1966:1: ( ( rule__Shape__RepresentsAssignment_8 ) )
            // InternalCanvas.g:1967:2: ( rule__Shape__RepresentsAssignment_8 )
            {
             before(grammarAccess.getShapeAccess().getRepresentsAssignment_8()); 
            // InternalCanvas.g:1968:2: ( rule__Shape__RepresentsAssignment_8 )
            // InternalCanvas.g:1968:3: rule__Shape__RepresentsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Shape__RepresentsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getRepresentsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__8__Impl"


    // $ANTLR start "rule__Shape__Group__9"
    // InternalCanvas.g:1976:1: rule__Shape__Group__9 : rule__Shape__Group__9__Impl rule__Shape__Group__10 ;
    public final void rule__Shape__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1980:1: ( rule__Shape__Group__9__Impl rule__Shape__Group__10 )
            // InternalCanvas.g:1981:2: rule__Shape__Group__9__Impl rule__Shape__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Shape__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__9"


    // $ANTLR start "rule__Shape__Group__9__Impl"
    // InternalCanvas.g:1988:1: rule__Shape__Group__9__Impl : ( ( rule__Shape__BoundsAssignment_9 ) ) ;
    public final void rule__Shape__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1992:1: ( ( ( rule__Shape__BoundsAssignment_9 ) ) )
            // InternalCanvas.g:1993:1: ( ( rule__Shape__BoundsAssignment_9 ) )
            {
            // InternalCanvas.g:1993:1: ( ( rule__Shape__BoundsAssignment_9 ) )
            // InternalCanvas.g:1994:2: ( rule__Shape__BoundsAssignment_9 )
            {
             before(grammarAccess.getShapeAccess().getBoundsAssignment_9()); 
            // InternalCanvas.g:1995:2: ( rule__Shape__BoundsAssignment_9 )
            // InternalCanvas.g:1995:3: rule__Shape__BoundsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Shape__BoundsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getBoundsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__9__Impl"


    // $ANTLR start "rule__Shape__Group__10"
    // InternalCanvas.g:2003:1: rule__Shape__Group__10 : rule__Shape__Group__10__Impl ;
    public final void rule__Shape__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2007:1: ( rule__Shape__Group__10__Impl )
            // InternalCanvas.g:2008:2: rule__Shape__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__10"


    // $ANTLR start "rule__Shape__Group__10__Impl"
    // InternalCanvas.g:2014:1: rule__Shape__Group__10__Impl : ( ( rule__Shape__TextAssignment_10 )? ) ;
    public final void rule__Shape__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2018:1: ( ( ( rule__Shape__TextAssignment_10 )? ) )
            // InternalCanvas.g:2019:1: ( ( rule__Shape__TextAssignment_10 )? )
            {
            // InternalCanvas.g:2019:1: ( ( rule__Shape__TextAssignment_10 )? )
            // InternalCanvas.g:2020:2: ( rule__Shape__TextAssignment_10 )?
            {
             before(grammarAccess.getShapeAccess().getTextAssignment_10()); 
            // InternalCanvas.g:2021:2: ( rule__Shape__TextAssignment_10 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==103) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCanvas.g:2021:3: rule__Shape__TextAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__TextAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeAccess().getTextAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group__10__Impl"


    // $ANTLR start "rule__FloatingTexts__Group__0"
    // InternalCanvas.g:2030:1: rule__FloatingTexts__Group__0 : rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1 ;
    public final void rule__FloatingTexts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2034:1: ( rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1 )
            // InternalCanvas.g:2035:2: rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FloatingTexts__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatingTexts__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group__0"


    // $ANTLR start "rule__FloatingTexts__Group__0__Impl"
    // InternalCanvas.g:2042:1: rule__FloatingTexts__Group__0__Impl : ( () ) ;
    public final void rule__FloatingTexts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2046:1: ( ( () ) )
            // InternalCanvas.g:2047:1: ( () )
            {
            // InternalCanvas.g:2047:1: ( () )
            // InternalCanvas.g:2048:2: ()
            {
             before(grammarAccess.getFloatingTextsAccess().getFloatingTextsAction_0()); 
            // InternalCanvas.g:2049:2: ()
            // InternalCanvas.g:2049:3: 
            {
            }

             after(grammarAccess.getFloatingTextsAccess().getFloatingTextsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group__0__Impl"


    // $ANTLR start "rule__FloatingTexts__Group__1"
    // InternalCanvas.g:2057:1: rule__FloatingTexts__Group__1 : rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2 ;
    public final void rule__FloatingTexts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2061:1: ( rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2 )
            // InternalCanvas.g:2062:2: rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FloatingTexts__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatingTexts__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group__1"


    // $ANTLR start "rule__FloatingTexts__Group__1__Impl"
    // InternalCanvas.g:2069:1: rule__FloatingTexts__Group__1__Impl : ( 'texts' ) ;
    public final void rule__FloatingTexts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2073:1: ( ( 'texts' ) )
            // InternalCanvas.g:2074:1: ( 'texts' )
            {
            // InternalCanvas.g:2074:1: ( 'texts' )
            // InternalCanvas.g:2075:2: 'texts'
            {
             before(grammarAccess.getFloatingTextsAccess().getTextsKeyword_1()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getFloatingTextsAccess().getTextsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group__1__Impl"


    // $ANTLR start "rule__FloatingTexts__Group__2"
    // InternalCanvas.g:2084:1: rule__FloatingTexts__Group__2 : rule__FloatingTexts__Group__2__Impl rule__FloatingTexts__Group__3 ;
    public final void rule__FloatingTexts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2088:1: ( rule__FloatingTexts__Group__2__Impl rule__FloatingTexts__Group__3 )
            // InternalCanvas.g:2089:2: rule__FloatingTexts__Group__2__Impl rule__FloatingTexts__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__FloatingTexts__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatingTexts__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group__2"


    // $ANTLR start "rule__FloatingTexts__Group__2__Impl"
    // InternalCanvas.g:2096:1: rule__FloatingTexts__Group__2__Impl : ( ':' ) ;
    public final void rule__FloatingTexts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2100:1: ( ( ':' ) )
            // InternalCanvas.g:2101:1: ( ':' )
            {
            // InternalCanvas.g:2101:1: ( ':' )
            // InternalCanvas.g:2102:2: ':'
            {
             before(grammarAccess.getFloatingTextsAccess().getColonKeyword_2()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getFloatingTextsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group__2__Impl"


    // $ANTLR start "rule__FloatingTexts__Group__3"
    // InternalCanvas.g:2111:1: rule__FloatingTexts__Group__3 : rule__FloatingTexts__Group__3__Impl ;
    public final void rule__FloatingTexts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2115:1: ( rule__FloatingTexts__Group__3__Impl )
            // InternalCanvas.g:2116:2: rule__FloatingTexts__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatingTexts__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group__3"


    // $ANTLR start "rule__FloatingTexts__Group__3__Impl"
    // InternalCanvas.g:2122:1: rule__FloatingTexts__Group__3__Impl : ( ( rule__FloatingTexts__TextsAssignment_3 )* ) ;
    public final void rule__FloatingTexts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2126:1: ( ( ( rule__FloatingTexts__TextsAssignment_3 )* ) )
            // InternalCanvas.g:2127:1: ( ( rule__FloatingTexts__TextsAssignment_3 )* )
            {
            // InternalCanvas.g:2127:1: ( ( rule__FloatingTexts__TextsAssignment_3 )* )
            // InternalCanvas.g:2128:2: ( rule__FloatingTexts__TextsAssignment_3 )*
            {
             before(grammarAccess.getFloatingTextsAccess().getTextsAssignment_3()); 
            // InternalCanvas.g:2129:2: ( rule__FloatingTexts__TextsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==103) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCanvas.g:2129:3: rule__FloatingTexts__TextsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FloatingTexts__TextsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFloatingTextsAccess().getTextsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group__3__Impl"


    // $ANTLR start "rule__FloatingText__Group__0"
    // InternalCanvas.g:2138:1: rule__FloatingText__Group__0 : rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1 ;
    public final void rule__FloatingText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2142:1: ( rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1 )
            // InternalCanvas.g:2143:2: rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__FloatingText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatingText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__0"


    // $ANTLR start "rule__FloatingText__Group__0__Impl"
    // InternalCanvas.g:2150:1: rule__FloatingText__Group__0__Impl : ( () ) ;
    public final void rule__FloatingText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2154:1: ( ( () ) )
            // InternalCanvas.g:2155:1: ( () )
            {
            // InternalCanvas.g:2155:1: ( () )
            // InternalCanvas.g:2156:2: ()
            {
             before(grammarAccess.getFloatingTextAccess().getFloatingTextAction_0()); 
            // InternalCanvas.g:2157:2: ()
            // InternalCanvas.g:2157:3: 
            {
            }

             after(grammarAccess.getFloatingTextAccess().getFloatingTextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__0__Impl"


    // $ANTLR start "rule__FloatingText__Group__1"
    // InternalCanvas.g:2165:1: rule__FloatingText__Group__1 : rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2 ;
    public final void rule__FloatingText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2169:1: ( rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2 )
            // InternalCanvas.g:2170:2: rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FloatingText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatingText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__1"


    // $ANTLR start "rule__FloatingText__Group__1__Impl"
    // InternalCanvas.g:2177:1: rule__FloatingText__Group__1__Impl : ( 'text' ) ;
    public final void rule__FloatingText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2181:1: ( ( 'text' ) )
            // InternalCanvas.g:2182:1: ( 'text' )
            {
            // InternalCanvas.g:2182:1: ( 'text' )
            // InternalCanvas.g:2183:2: 'text'
            {
             before(grammarAccess.getFloatingTextAccess().getTextKeyword_1()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getFloatingTextAccess().getTextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__1__Impl"


    // $ANTLR start "rule__FloatingText__Group__2"
    // InternalCanvas.g:2192:1: rule__FloatingText__Group__2 : rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3 ;
    public final void rule__FloatingText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2196:1: ( rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3 )
            // InternalCanvas.g:2197:2: rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__FloatingText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatingText__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__2"


    // $ANTLR start "rule__FloatingText__Group__2__Impl"
    // InternalCanvas.g:2204:1: rule__FloatingText__Group__2__Impl : ( ':' ) ;
    public final void rule__FloatingText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2208:1: ( ( ':' ) )
            // InternalCanvas.g:2209:1: ( ':' )
            {
            // InternalCanvas.g:2209:1: ( ':' )
            // InternalCanvas.g:2210:2: ':'
            {
             before(grammarAccess.getFloatingTextAccess().getColonKeyword_2()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getFloatingTextAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__2__Impl"


    // $ANTLR start "rule__FloatingText__Group__3"
    // InternalCanvas.g:2219:1: rule__FloatingText__Group__3 : rule__FloatingText__Group__3__Impl rule__FloatingText__Group__4 ;
    public final void rule__FloatingText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2223:1: ( rule__FloatingText__Group__3__Impl rule__FloatingText__Group__4 )
            // InternalCanvas.g:2224:2: rule__FloatingText__Group__3__Impl rule__FloatingText__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__FloatingText__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatingText__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__3"


    // $ANTLR start "rule__FloatingText__Group__3__Impl"
    // InternalCanvas.g:2231:1: rule__FloatingText__Group__3__Impl : ( ( rule__FloatingText__BoundsAssignment_3 ) ) ;
    public final void rule__FloatingText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2235:1: ( ( ( rule__FloatingText__BoundsAssignment_3 ) ) )
            // InternalCanvas.g:2236:1: ( ( rule__FloatingText__BoundsAssignment_3 ) )
            {
            // InternalCanvas.g:2236:1: ( ( rule__FloatingText__BoundsAssignment_3 ) )
            // InternalCanvas.g:2237:2: ( rule__FloatingText__BoundsAssignment_3 )
            {
             before(grammarAccess.getFloatingTextAccess().getBoundsAssignment_3()); 
            // InternalCanvas.g:2238:2: ( rule__FloatingText__BoundsAssignment_3 )
            // InternalCanvas.g:2238:3: rule__FloatingText__BoundsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__BoundsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextAccess().getBoundsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__3__Impl"


    // $ANTLR start "rule__FloatingText__Group__4"
    // InternalCanvas.g:2246:1: rule__FloatingText__Group__4 : rule__FloatingText__Group__4__Impl ;
    public final void rule__FloatingText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2250:1: ( rule__FloatingText__Group__4__Impl )
            // InternalCanvas.g:2251:2: rule__FloatingText__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__4"


    // $ANTLR start "rule__FloatingText__Group__4__Impl"
    // InternalCanvas.g:2257:1: rule__FloatingText__Group__4__Impl : ( ( rule__FloatingText__EndAssignment_4 ) ) ;
    public final void rule__FloatingText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2261:1: ( ( ( rule__FloatingText__EndAssignment_4 ) ) )
            // InternalCanvas.g:2262:1: ( ( rule__FloatingText__EndAssignment_4 ) )
            {
            // InternalCanvas.g:2262:1: ( ( rule__FloatingText__EndAssignment_4 ) )
            // InternalCanvas.g:2263:2: ( rule__FloatingText__EndAssignment_4 )
            {
             before(grammarAccess.getFloatingTextAccess().getEndAssignment_4()); 
            // InternalCanvas.g:2264:2: ( rule__FloatingText__EndAssignment_4 )
            // InternalCanvas.g:2264:3: rule__FloatingText__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextAccess().getEndAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group__4__Impl"


    // $ANTLR start "rule__EnumEnd__Group__0"
    // InternalCanvas.g:2273:1: rule__EnumEnd__Group__0 : rule__EnumEnd__Group__0__Impl rule__EnumEnd__Group__1 ;
    public final void rule__EnumEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2277:1: ( rule__EnumEnd__Group__0__Impl rule__EnumEnd__Group__1 )
            // InternalCanvas.g:2278:2: rule__EnumEnd__Group__0__Impl rule__EnumEnd__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumEnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group__0"


    // $ANTLR start "rule__EnumEnd__Group__0__Impl"
    // InternalCanvas.g:2285:1: rule__EnumEnd__Group__0__Impl : ( 'where' ) ;
    public final void rule__EnumEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2289:1: ( ( 'where' ) )
            // InternalCanvas.g:2290:1: ( 'where' )
            {
            // InternalCanvas.g:2290:1: ( 'where' )
            // InternalCanvas.g:2291:2: 'where'
            {
             before(grammarAccess.getEnumEndAccess().getWhereKeyword_0()); 
            match(input,104,FOLLOW_2); 
             after(grammarAccess.getEnumEndAccess().getWhereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group__0__Impl"


    // $ANTLR start "rule__EnumEnd__Group__1"
    // InternalCanvas.g:2300:1: rule__EnumEnd__Group__1 : rule__EnumEnd__Group__1__Impl rule__EnumEnd__Group__2 ;
    public final void rule__EnumEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2304:1: ( rule__EnumEnd__Group__1__Impl rule__EnumEnd__Group__2 )
            // InternalCanvas.g:2305:2: rule__EnumEnd__Group__1__Impl rule__EnumEnd__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__EnumEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumEnd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group__1"


    // $ANTLR start "rule__EnumEnd__Group__1__Impl"
    // InternalCanvas.g:2312:1: rule__EnumEnd__Group__1__Impl : ( ':' ) ;
    public final void rule__EnumEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2316:1: ( ( ':' ) )
            // InternalCanvas.g:2317:1: ( ':' )
            {
            // InternalCanvas.g:2317:1: ( ':' )
            // InternalCanvas.g:2318:2: ':'
            {
             before(grammarAccess.getEnumEndAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getEnumEndAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group__1__Impl"


    // $ANTLR start "rule__EnumEnd__Group__2"
    // InternalCanvas.g:2327:1: rule__EnumEnd__Group__2 : rule__EnumEnd__Group__2__Impl ;
    public final void rule__EnumEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2331:1: ( rule__EnumEnd__Group__2__Impl )
            // InternalCanvas.g:2332:2: rule__EnumEnd__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group__2"


    // $ANTLR start "rule__EnumEnd__Group__2__Impl"
    // InternalCanvas.g:2338:1: rule__EnumEnd__Group__2__Impl : ( ( rule__EnumEnd__WhereAssignment_2 ) ) ;
    public final void rule__EnumEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2342:1: ( ( ( rule__EnumEnd__WhereAssignment_2 ) ) )
            // InternalCanvas.g:2343:1: ( ( rule__EnumEnd__WhereAssignment_2 ) )
            {
            // InternalCanvas.g:2343:1: ( ( rule__EnumEnd__WhereAssignment_2 ) )
            // InternalCanvas.g:2344:2: ( rule__EnumEnd__WhereAssignment_2 )
            {
             before(grammarAccess.getEnumEndAccess().getWhereAssignment_2()); 
            // InternalCanvas.g:2345:2: ( rule__EnumEnd__WhereAssignment_2 )
            // InternalCanvas.g:2345:3: rule__EnumEnd__WhereAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__WhereAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumEndAccess().getWhereAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group__2__Impl"


    // $ANTLR start "rule__Connectors__Group__0"
    // InternalCanvas.g:2354:1: rule__Connectors__Group__0 : rule__Connectors__Group__0__Impl rule__Connectors__Group__1 ;
    public final void rule__Connectors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2358:1: ( rule__Connectors__Group__0__Impl rule__Connectors__Group__1 )
            // InternalCanvas.g:2359:2: rule__Connectors__Group__0__Impl rule__Connectors__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Connectors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connectors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group__0"


    // $ANTLR start "rule__Connectors__Group__0__Impl"
    // InternalCanvas.g:2366:1: rule__Connectors__Group__0__Impl : ( () ) ;
    public final void rule__Connectors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2370:1: ( ( () ) )
            // InternalCanvas.g:2371:1: ( () )
            {
            // InternalCanvas.g:2371:1: ( () )
            // InternalCanvas.g:2372:2: ()
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsAction_0()); 
            // InternalCanvas.g:2373:2: ()
            // InternalCanvas.g:2373:3: 
            {
            }

             after(grammarAccess.getConnectorsAccess().getConnectorsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group__0__Impl"


    // $ANTLR start "rule__Connectors__Group__1"
    // InternalCanvas.g:2381:1: rule__Connectors__Group__1 : rule__Connectors__Group__1__Impl rule__Connectors__Group__2 ;
    public final void rule__Connectors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2385:1: ( rule__Connectors__Group__1__Impl rule__Connectors__Group__2 )
            // InternalCanvas.g:2386:2: rule__Connectors__Group__1__Impl rule__Connectors__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Connectors__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connectors__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group__1"


    // $ANTLR start "rule__Connectors__Group__1__Impl"
    // InternalCanvas.g:2393:1: rule__Connectors__Group__1__Impl : ( 'connectors' ) ;
    public final void rule__Connectors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2397:1: ( ( 'connectors' ) )
            // InternalCanvas.g:2398:1: ( 'connectors' )
            {
            // InternalCanvas.g:2398:1: ( 'connectors' )
            // InternalCanvas.g:2399:2: 'connectors'
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1()); 
            match(input,105,FOLLOW_2); 
             after(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group__1__Impl"


    // $ANTLR start "rule__Connectors__Group__2"
    // InternalCanvas.g:2408:1: rule__Connectors__Group__2 : rule__Connectors__Group__2__Impl rule__Connectors__Group__3 ;
    public final void rule__Connectors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2412:1: ( rule__Connectors__Group__2__Impl rule__Connectors__Group__3 )
            // InternalCanvas.g:2413:2: rule__Connectors__Group__2__Impl rule__Connectors__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Connectors__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connectors__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group__2"


    // $ANTLR start "rule__Connectors__Group__2__Impl"
    // InternalCanvas.g:2420:1: rule__Connectors__Group__2__Impl : ( ':' ) ;
    public final void rule__Connectors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2424:1: ( ( ':' ) )
            // InternalCanvas.g:2425:1: ( ':' )
            {
            // InternalCanvas.g:2425:1: ( ':' )
            // InternalCanvas.g:2426:2: ':'
            {
             before(grammarAccess.getConnectorsAccess().getColonKeyword_2()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getConnectorsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group__2__Impl"


    // $ANTLR start "rule__Connectors__Group__3"
    // InternalCanvas.g:2435:1: rule__Connectors__Group__3 : rule__Connectors__Group__3__Impl ;
    public final void rule__Connectors__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2439:1: ( rule__Connectors__Group__3__Impl )
            // InternalCanvas.g:2440:2: rule__Connectors__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connectors__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group__3"


    // $ANTLR start "rule__Connectors__Group__3__Impl"
    // InternalCanvas.g:2446:1: rule__Connectors__Group__3__Impl : ( ( rule__Connectors__ConnectorsAssignment_3 )* ) ;
    public final void rule__Connectors__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2450:1: ( ( ( rule__Connectors__ConnectorsAssignment_3 )* ) )
            // InternalCanvas.g:2451:1: ( ( rule__Connectors__ConnectorsAssignment_3 )* )
            {
            // InternalCanvas.g:2451:1: ( ( rule__Connectors__ConnectorsAssignment_3 )* )
            // InternalCanvas.g:2452:2: ( rule__Connectors__ConnectorsAssignment_3 )*
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsAssignment_3()); 
            // InternalCanvas.g:2453:2: ( rule__Connectors__ConnectorsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==91) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCanvas.g:2453:3: rule__Connectors__ConnectorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Connectors__ConnectorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConnectorsAccess().getConnectorsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalCanvas.g:2462:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2466:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalCanvas.g:2467:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // InternalCanvas.g:2474:1: rule__Connector__Group__0__Impl : ( 'connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2478:1: ( ( 'connector' ) )
            // InternalCanvas.g:2479:1: ( 'connector' )
            {
            // InternalCanvas.g:2479:1: ( 'connector' )
            // InternalCanvas.g:2480:2: 'connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // InternalCanvas.g:2489:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2493:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalCanvas.g:2494:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // InternalCanvas.g:2501:1: rule__Connector__Group__1__Impl : ( ':' ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2505:1: ( ( ':' ) )
            // InternalCanvas.g:2506:1: ( ':' )
            {
            // InternalCanvas.g:2506:1: ( ':' )
            // InternalCanvas.g:2507:2: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // InternalCanvas.g:2516:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2520:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalCanvas.g:2521:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // InternalCanvas.g:2528:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__NameAssignment_2 ) ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2532:1: ( ( ( rule__Connector__NameAssignment_2 ) ) )
            // InternalCanvas.g:2533:1: ( ( rule__Connector__NameAssignment_2 ) )
            {
            // InternalCanvas.g:2533:1: ( ( rule__Connector__NameAssignment_2 ) )
            // InternalCanvas.g:2534:2: ( rule__Connector__NameAssignment_2 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_2()); 
            // InternalCanvas.g:2535:2: ( rule__Connector__NameAssignment_2 )
            // InternalCanvas.g:2535:3: rule__Connector__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connector__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__3"
    // InternalCanvas.g:2543:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2547:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalCanvas.g:2548:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3"


    // $ANTLR start "rule__Connector__Group__3__Impl"
    // InternalCanvas.g:2555:1: rule__Connector__Group__3__Impl : ( 'render' ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2559:1: ( ( 'render' ) )
            // InternalCanvas.g:2560:1: ( 'render' )
            {
            // InternalCanvas.g:2560:1: ( 'render' )
            // InternalCanvas.g:2561:2: 'render'
            {
             before(grammarAccess.getConnectorAccess().getRenderKeyword_3()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRenderKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__4"
    // InternalCanvas.g:2570:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl rule__Connector__Group__5 ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2574:1: ( rule__Connector__Group__4__Impl rule__Connector__Group__5 )
            // InternalCanvas.g:2575:2: rule__Connector__Group__4__Impl rule__Connector__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Connector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4"


    // $ANTLR start "rule__Connector__Group__4__Impl"
    // InternalCanvas.g:2582:1: rule__Connector__Group__4__Impl : ( ':' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2586:1: ( ( ':' ) )
            // InternalCanvas.g:2587:1: ( ':' )
            {
            // InternalCanvas.g:2587:1: ( ':' )
            // InternalCanvas.g:2588:2: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_4()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4__Impl"


    // $ANTLR start "rule__Connector__Group__5"
    // InternalCanvas.g:2597:1: rule__Connector__Group__5 : rule__Connector__Group__5__Impl rule__Connector__Group__6 ;
    public final void rule__Connector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2601:1: ( rule__Connector__Group__5__Impl rule__Connector__Group__6 )
            // InternalCanvas.g:2602:2: rule__Connector__Group__5__Impl rule__Connector__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Connector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__5"


    // $ANTLR start "rule__Connector__Group__5__Impl"
    // InternalCanvas.g:2609:1: rule__Connector__Group__5__Impl : ( ( rule__Connector__TypeAssignment_5 ) ) ;
    public final void rule__Connector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2613:1: ( ( ( rule__Connector__TypeAssignment_5 ) ) )
            // InternalCanvas.g:2614:1: ( ( rule__Connector__TypeAssignment_5 ) )
            {
            // InternalCanvas.g:2614:1: ( ( rule__Connector__TypeAssignment_5 ) )
            // InternalCanvas.g:2615:2: ( rule__Connector__TypeAssignment_5 )
            {
             before(grammarAccess.getConnectorAccess().getTypeAssignment_5()); 
            // InternalCanvas.g:2616:2: ( rule__Connector__TypeAssignment_5 )
            // InternalCanvas.g:2616:3: rule__Connector__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Connector__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__5__Impl"


    // $ANTLR start "rule__Connector__Group__6"
    // InternalCanvas.g:2624:1: rule__Connector__Group__6 : rule__Connector__Group__6__Impl rule__Connector__Group__7 ;
    public final void rule__Connector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2628:1: ( rule__Connector__Group__6__Impl rule__Connector__Group__7 )
            // InternalCanvas.g:2629:2: rule__Connector__Group__6__Impl rule__Connector__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Connector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__6"


    // $ANTLR start "rule__Connector__Group__6__Impl"
    // InternalCanvas.g:2636:1: rule__Connector__Group__6__Impl : ( ( rule__Connector__RepresentsAssignment_6 ) ) ;
    public final void rule__Connector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2640:1: ( ( ( rule__Connector__RepresentsAssignment_6 ) ) )
            // InternalCanvas.g:2641:1: ( ( rule__Connector__RepresentsAssignment_6 ) )
            {
            // InternalCanvas.g:2641:1: ( ( rule__Connector__RepresentsAssignment_6 ) )
            // InternalCanvas.g:2642:2: ( rule__Connector__RepresentsAssignment_6 )
            {
             before(grammarAccess.getConnectorAccess().getRepresentsAssignment_6()); 
            // InternalCanvas.g:2643:2: ( rule__Connector__RepresentsAssignment_6 )
            // InternalCanvas.g:2643:3: rule__Connector__RepresentsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Connector__RepresentsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getRepresentsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__6__Impl"


    // $ANTLR start "rule__Connector__Group__7"
    // InternalCanvas.g:2651:1: rule__Connector__Group__7 : rule__Connector__Group__7__Impl rule__Connector__Group__8 ;
    public final void rule__Connector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2655:1: ( rule__Connector__Group__7__Impl rule__Connector__Group__8 )
            // InternalCanvas.g:2656:2: rule__Connector__Group__7__Impl rule__Connector__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Connector__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__7"


    // $ANTLR start "rule__Connector__Group__7__Impl"
    // InternalCanvas.g:2663:1: rule__Connector__Group__7__Impl : ( ( rule__Connector__PolylineAssignment_7 ) ) ;
    public final void rule__Connector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2667:1: ( ( ( rule__Connector__PolylineAssignment_7 ) ) )
            // InternalCanvas.g:2668:1: ( ( rule__Connector__PolylineAssignment_7 ) )
            {
            // InternalCanvas.g:2668:1: ( ( rule__Connector__PolylineAssignment_7 ) )
            // InternalCanvas.g:2669:2: ( rule__Connector__PolylineAssignment_7 )
            {
             before(grammarAccess.getConnectorAccess().getPolylineAssignment_7()); 
            // InternalCanvas.g:2670:2: ( rule__Connector__PolylineAssignment_7 )
            // InternalCanvas.g:2670:3: rule__Connector__PolylineAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Connector__PolylineAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getPolylineAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__7__Impl"


    // $ANTLR start "rule__Connector__Group__8"
    // InternalCanvas.g:2678:1: rule__Connector__Group__8 : rule__Connector__Group__8__Impl rule__Connector__Group__9 ;
    public final void rule__Connector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2682:1: ( rule__Connector__Group__8__Impl rule__Connector__Group__9 )
            // InternalCanvas.g:2683:2: rule__Connector__Group__8__Impl rule__Connector__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Connector__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__8"


    // $ANTLR start "rule__Connector__Group__8__Impl"
    // InternalCanvas.g:2690:1: rule__Connector__Group__8__Impl : ( ( rule__Connector__AnchorsAssignment_8 )? ) ;
    public final void rule__Connector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2694:1: ( ( ( rule__Connector__AnchorsAssignment_8 )? ) )
            // InternalCanvas.g:2695:1: ( ( rule__Connector__AnchorsAssignment_8 )? )
            {
            // InternalCanvas.g:2695:1: ( ( rule__Connector__AnchorsAssignment_8 )? )
            // InternalCanvas.g:2696:2: ( rule__Connector__AnchorsAssignment_8 )?
            {
             before(grammarAccess.getConnectorAccess().getAnchorsAssignment_8()); 
            // InternalCanvas.g:2697:2: ( rule__Connector__AnchorsAssignment_8 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==106) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCanvas.g:2697:3: rule__Connector__AnchorsAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__AnchorsAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorAccess().getAnchorsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__8__Impl"


    // $ANTLR start "rule__Connector__Group__9"
    // InternalCanvas.g:2705:1: rule__Connector__Group__9 : rule__Connector__Group__9__Impl ;
    public final void rule__Connector__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2709:1: ( rule__Connector__Group__9__Impl )
            // InternalCanvas.g:2710:2: rule__Connector__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__9"


    // $ANTLR start "rule__Connector__Group__9__Impl"
    // InternalCanvas.g:2716:1: rule__Connector__Group__9__Impl : ( ( rule__Connector__TextsAssignment_9 ) ) ;
    public final void rule__Connector__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2720:1: ( ( ( rule__Connector__TextsAssignment_9 ) ) )
            // InternalCanvas.g:2721:1: ( ( rule__Connector__TextsAssignment_9 ) )
            {
            // InternalCanvas.g:2721:1: ( ( rule__Connector__TextsAssignment_9 ) )
            // InternalCanvas.g:2722:2: ( rule__Connector__TextsAssignment_9 )
            {
             before(grammarAccess.getConnectorAccess().getTextsAssignment_9()); 
            // InternalCanvas.g:2723:2: ( rule__Connector__TextsAssignment_9 )
            // InternalCanvas.g:2723:3: rule__Connector__TextsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Connector__TextsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTextsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__9__Impl"


    // $ANTLR start "rule__Anchors__Group__0"
    // InternalCanvas.g:2732:1: rule__Anchors__Group__0 : rule__Anchors__Group__0__Impl rule__Anchors__Group__1 ;
    public final void rule__Anchors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2736:1: ( rule__Anchors__Group__0__Impl rule__Anchors__Group__1 )
            // InternalCanvas.g:2737:2: rule__Anchors__Group__0__Impl rule__Anchors__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Anchors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anchors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group__0"


    // $ANTLR start "rule__Anchors__Group__0__Impl"
    // InternalCanvas.g:2744:1: rule__Anchors__Group__0__Impl : ( 'anchors' ) ;
    public final void rule__Anchors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2748:1: ( ( 'anchors' ) )
            // InternalCanvas.g:2749:1: ( 'anchors' )
            {
            // InternalCanvas.g:2749:1: ( 'anchors' )
            // InternalCanvas.g:2750:2: 'anchors'
            {
             before(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group__0__Impl"


    // $ANTLR start "rule__Anchors__Group__1"
    // InternalCanvas.g:2759:1: rule__Anchors__Group__1 : rule__Anchors__Group__1__Impl rule__Anchors__Group__2 ;
    public final void rule__Anchors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2763:1: ( rule__Anchors__Group__1__Impl rule__Anchors__Group__2 )
            // InternalCanvas.g:2764:2: rule__Anchors__Group__1__Impl rule__Anchors__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Anchors__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anchors__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group__1"


    // $ANTLR start "rule__Anchors__Group__1__Impl"
    // InternalCanvas.g:2771:1: rule__Anchors__Group__1__Impl : ( ':' ) ;
    public final void rule__Anchors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2775:1: ( ( ':' ) )
            // InternalCanvas.g:2776:1: ( ':' )
            {
            // InternalCanvas.g:2776:1: ( ':' )
            // InternalCanvas.g:2777:2: ':'
            {
             before(grammarAccess.getAnchorsAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getAnchorsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group__1__Impl"


    // $ANTLR start "rule__Anchors__Group__2"
    // InternalCanvas.g:2786:1: rule__Anchors__Group__2 : rule__Anchors__Group__2__Impl rule__Anchors__Group__3 ;
    public final void rule__Anchors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2790:1: ( rule__Anchors__Group__2__Impl rule__Anchors__Group__3 )
            // InternalCanvas.g:2791:2: rule__Anchors__Group__2__Impl rule__Anchors__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Anchors__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anchors__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group__2"


    // $ANTLR start "rule__Anchors__Group__2__Impl"
    // InternalCanvas.g:2798:1: rule__Anchors__Group__2__Impl : ( ( rule__Anchors__StartAnchorAssignment_2 ) ) ;
    public final void rule__Anchors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2802:1: ( ( ( rule__Anchors__StartAnchorAssignment_2 ) ) )
            // InternalCanvas.g:2803:1: ( ( rule__Anchors__StartAnchorAssignment_2 ) )
            {
            // InternalCanvas.g:2803:1: ( ( rule__Anchors__StartAnchorAssignment_2 ) )
            // InternalCanvas.g:2804:2: ( rule__Anchors__StartAnchorAssignment_2 )
            {
             before(grammarAccess.getAnchorsAccess().getStartAnchorAssignment_2()); 
            // InternalCanvas.g:2805:2: ( rule__Anchors__StartAnchorAssignment_2 )
            // InternalCanvas.g:2805:3: rule__Anchors__StartAnchorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Anchors__StartAnchorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnchorsAccess().getStartAnchorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group__2__Impl"


    // $ANTLR start "rule__Anchors__Group__3"
    // InternalCanvas.g:2813:1: rule__Anchors__Group__3 : rule__Anchors__Group__3__Impl ;
    public final void rule__Anchors__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2817:1: ( rule__Anchors__Group__3__Impl )
            // InternalCanvas.g:2818:2: rule__Anchors__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Anchors__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group__3"


    // $ANTLR start "rule__Anchors__Group__3__Impl"
    // InternalCanvas.g:2824:1: rule__Anchors__Group__3__Impl : ( ( rule__Anchors__EndAnchorAssignment_3 ) ) ;
    public final void rule__Anchors__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2828:1: ( ( ( rule__Anchors__EndAnchorAssignment_3 ) ) )
            // InternalCanvas.g:2829:1: ( ( rule__Anchors__EndAnchorAssignment_3 ) )
            {
            // InternalCanvas.g:2829:1: ( ( rule__Anchors__EndAnchorAssignment_3 ) )
            // InternalCanvas.g:2830:2: ( rule__Anchors__EndAnchorAssignment_3 )
            {
             before(grammarAccess.getAnchorsAccess().getEndAnchorAssignment_3()); 
            // InternalCanvas.g:2831:2: ( rule__Anchors__EndAnchorAssignment_3 )
            // InternalCanvas.g:2831:3: rule__Anchors__EndAnchorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Anchors__EndAnchorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnchorsAccess().getEndAnchorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group__3__Impl"


    // $ANTLR start "rule__StartAnchor__Group__0"
    // InternalCanvas.g:2840:1: rule__StartAnchor__Group__0 : rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1 ;
    public final void rule__StartAnchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2844:1: ( rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1 )
            // InternalCanvas.g:2845:2: rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StartAnchor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartAnchor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group__0"


    // $ANTLR start "rule__StartAnchor__Group__0__Impl"
    // InternalCanvas.g:2852:1: rule__StartAnchor__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartAnchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2856:1: ( ( 'start' ) )
            // InternalCanvas.g:2857:1: ( 'start' )
            {
            // InternalCanvas.g:2857:1: ( 'start' )
            // InternalCanvas.g:2858:2: 'start'
            {
             before(grammarAccess.getStartAnchorAccess().getStartKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStartAnchorAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group__0__Impl"


    // $ANTLR start "rule__StartAnchor__Group__1"
    // InternalCanvas.g:2867:1: rule__StartAnchor__Group__1 : rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2 ;
    public final void rule__StartAnchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2871:1: ( rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2 )
            // InternalCanvas.g:2872:2: rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__StartAnchor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartAnchor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group__1"


    // $ANTLR start "rule__StartAnchor__Group__1__Impl"
    // InternalCanvas.g:2879:1: rule__StartAnchor__Group__1__Impl : ( ':' ) ;
    public final void rule__StartAnchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2883:1: ( ( ':' ) )
            // InternalCanvas.g:2884:1: ( ':' )
            {
            // InternalCanvas.g:2884:1: ( ':' )
            // InternalCanvas.g:2885:2: ':'
            {
             before(grammarAccess.getStartAnchorAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getStartAnchorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group__1__Impl"


    // $ANTLR start "rule__StartAnchor__Group__2"
    // InternalCanvas.g:2894:1: rule__StartAnchor__Group__2 : rule__StartAnchor__Group__2__Impl rule__StartAnchor__Group__3 ;
    public final void rule__StartAnchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2898:1: ( rule__StartAnchor__Group__2__Impl rule__StartAnchor__Group__3 )
            // InternalCanvas.g:2899:2: rule__StartAnchor__Group__2__Impl rule__StartAnchor__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__StartAnchor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartAnchor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group__2"


    // $ANTLR start "rule__StartAnchor__Group__2__Impl"
    // InternalCanvas.g:2906:1: rule__StartAnchor__Group__2__Impl : ( ( rule__StartAnchor__PointAssignment_2 ) ) ;
    public final void rule__StartAnchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2910:1: ( ( ( rule__StartAnchor__PointAssignment_2 ) ) )
            // InternalCanvas.g:2911:1: ( ( rule__StartAnchor__PointAssignment_2 ) )
            {
            // InternalCanvas.g:2911:1: ( ( rule__StartAnchor__PointAssignment_2 ) )
            // InternalCanvas.g:2912:2: ( rule__StartAnchor__PointAssignment_2 )
            {
             before(grammarAccess.getStartAnchorAccess().getPointAssignment_2()); 
            // InternalCanvas.g:2913:2: ( rule__StartAnchor__PointAssignment_2 )
            // InternalCanvas.g:2913:3: rule__StartAnchor__PointAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StartAnchor__PointAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartAnchorAccess().getPointAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group__2__Impl"


    // $ANTLR start "rule__StartAnchor__Group__3"
    // InternalCanvas.g:2921:1: rule__StartAnchor__Group__3 : rule__StartAnchor__Group__3__Impl ;
    public final void rule__StartAnchor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2925:1: ( rule__StartAnchor__Group__3__Impl )
            // InternalCanvas.g:2926:2: rule__StartAnchor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartAnchor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group__3"


    // $ANTLR start "rule__StartAnchor__Group__3__Impl"
    // InternalCanvas.g:2932:1: rule__StartAnchor__Group__3__Impl : ( ( rule__StartAnchor__AnchorAssignment_3 )? ) ;
    public final void rule__StartAnchor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2936:1: ( ( ( rule__StartAnchor__AnchorAssignment_3 )? ) )
            // InternalCanvas.g:2937:1: ( ( rule__StartAnchor__AnchorAssignment_3 )? )
            {
            // InternalCanvas.g:2937:1: ( ( rule__StartAnchor__AnchorAssignment_3 )? )
            // InternalCanvas.g:2938:2: ( rule__StartAnchor__AnchorAssignment_3 )?
            {
             before(grammarAccess.getStartAnchorAccess().getAnchorAssignment_3()); 
            // InternalCanvas.g:2939:2: ( rule__StartAnchor__AnchorAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=90 && LA13_0<=91)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCanvas.g:2939:3: rule__StartAnchor__AnchorAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__StartAnchor__AnchorAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartAnchorAccess().getAnchorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group__3__Impl"


    // $ANTLR start "rule__EndAnchor__Group__0"
    // InternalCanvas.g:2948:1: rule__EndAnchor__Group__0 : rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1 ;
    public final void rule__EndAnchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2952:1: ( rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1 )
            // InternalCanvas.g:2953:2: rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EndAnchor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndAnchor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group__0"


    // $ANTLR start "rule__EndAnchor__Group__0__Impl"
    // InternalCanvas.g:2960:1: rule__EndAnchor__Group__0__Impl : ( 'end' ) ;
    public final void rule__EndAnchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2964:1: ( ( 'end' ) )
            // InternalCanvas.g:2965:1: ( 'end' )
            {
            // InternalCanvas.g:2965:1: ( 'end' )
            // InternalCanvas.g:2966:2: 'end'
            {
             before(grammarAccess.getEndAnchorAccess().getEndKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEndAnchorAccess().getEndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group__0__Impl"


    // $ANTLR start "rule__EndAnchor__Group__1"
    // InternalCanvas.g:2975:1: rule__EndAnchor__Group__1 : rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2 ;
    public final void rule__EndAnchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2979:1: ( rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2 )
            // InternalCanvas.g:2980:2: rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__EndAnchor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndAnchor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group__1"


    // $ANTLR start "rule__EndAnchor__Group__1__Impl"
    // InternalCanvas.g:2987:1: rule__EndAnchor__Group__1__Impl : ( ':' ) ;
    public final void rule__EndAnchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2991:1: ( ( ':' ) )
            // InternalCanvas.g:2992:1: ( ':' )
            {
            // InternalCanvas.g:2992:1: ( ':' )
            // InternalCanvas.g:2993:2: ':'
            {
             before(grammarAccess.getEndAnchorAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getEndAnchorAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group__1__Impl"


    // $ANTLR start "rule__EndAnchor__Group__2"
    // InternalCanvas.g:3002:1: rule__EndAnchor__Group__2 : rule__EndAnchor__Group__2__Impl rule__EndAnchor__Group__3 ;
    public final void rule__EndAnchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3006:1: ( rule__EndAnchor__Group__2__Impl rule__EndAnchor__Group__3 )
            // InternalCanvas.g:3007:2: rule__EndAnchor__Group__2__Impl rule__EndAnchor__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__EndAnchor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndAnchor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group__2"


    // $ANTLR start "rule__EndAnchor__Group__2__Impl"
    // InternalCanvas.g:3014:1: rule__EndAnchor__Group__2__Impl : ( ( rule__EndAnchor__PointAssignment_2 ) ) ;
    public final void rule__EndAnchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3018:1: ( ( ( rule__EndAnchor__PointAssignment_2 ) ) )
            // InternalCanvas.g:3019:1: ( ( rule__EndAnchor__PointAssignment_2 ) )
            {
            // InternalCanvas.g:3019:1: ( ( rule__EndAnchor__PointAssignment_2 ) )
            // InternalCanvas.g:3020:2: ( rule__EndAnchor__PointAssignment_2 )
            {
             before(grammarAccess.getEndAnchorAccess().getPointAssignment_2()); 
            // InternalCanvas.g:3021:2: ( rule__EndAnchor__PointAssignment_2 )
            // InternalCanvas.g:3021:3: rule__EndAnchor__PointAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EndAnchor__PointAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndAnchorAccess().getPointAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group__2__Impl"


    // $ANTLR start "rule__EndAnchor__Group__3"
    // InternalCanvas.g:3029:1: rule__EndAnchor__Group__3 : rule__EndAnchor__Group__3__Impl ;
    public final void rule__EndAnchor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3033:1: ( rule__EndAnchor__Group__3__Impl )
            // InternalCanvas.g:3034:2: rule__EndAnchor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndAnchor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group__3"


    // $ANTLR start "rule__EndAnchor__Group__3__Impl"
    // InternalCanvas.g:3040:1: rule__EndAnchor__Group__3__Impl : ( ( rule__EndAnchor__AnchorAssignment_3 )? ) ;
    public final void rule__EndAnchor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3044:1: ( ( ( rule__EndAnchor__AnchorAssignment_3 )? ) )
            // InternalCanvas.g:3045:1: ( ( rule__EndAnchor__AnchorAssignment_3 )? )
            {
            // InternalCanvas.g:3045:1: ( ( rule__EndAnchor__AnchorAssignment_3 )? )
            // InternalCanvas.g:3046:2: ( rule__EndAnchor__AnchorAssignment_3 )?
            {
             before(grammarAccess.getEndAnchorAccess().getAnchorAssignment_3()); 
            // InternalCanvas.g:3047:2: ( rule__EndAnchor__AnchorAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=90 && LA14_0<=91)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCanvas.g:3047:3: rule__EndAnchor__AnchorAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__EndAnchor__AnchorAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndAnchorAccess().getAnchorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group__3__Impl"


    // $ANTLR start "rule__ShapeAnchorElement__Group__0"
    // InternalCanvas.g:3056:1: rule__ShapeAnchorElement__Group__0 : rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1 ;
    public final void rule__ShapeAnchorElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3060:1: ( rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1 )
            // InternalCanvas.g:3061:2: rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ShapeAnchorElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group__0"


    // $ANTLR start "rule__ShapeAnchorElement__Group__0__Impl"
    // InternalCanvas.g:3068:1: rule__ShapeAnchorElement__Group__0__Impl : ( 'shape' ) ;
    public final void rule__ShapeAnchorElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3072:1: ( ( 'shape' ) )
            // InternalCanvas.g:3073:1: ( 'shape' )
            {
            // InternalCanvas.g:3073:1: ( 'shape' )
            // InternalCanvas.g:3074:2: 'shape'
            {
             before(grammarAccess.getShapeAnchorElementAccess().getShapeKeyword_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getShapeAnchorElementAccess().getShapeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group__0__Impl"


    // $ANTLR start "rule__ShapeAnchorElement__Group__1"
    // InternalCanvas.g:3083:1: rule__ShapeAnchorElement__Group__1 : rule__ShapeAnchorElement__Group__1__Impl rule__ShapeAnchorElement__Group__2 ;
    public final void rule__ShapeAnchorElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3087:1: ( rule__ShapeAnchorElement__Group__1__Impl rule__ShapeAnchorElement__Group__2 )
            // InternalCanvas.g:3088:2: rule__ShapeAnchorElement__Group__1__Impl rule__ShapeAnchorElement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ShapeAnchorElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group__1"


    // $ANTLR start "rule__ShapeAnchorElement__Group__1__Impl"
    // InternalCanvas.g:3095:1: rule__ShapeAnchorElement__Group__1__Impl : ( ':' ) ;
    public final void rule__ShapeAnchorElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3099:1: ( ( ':' ) )
            // InternalCanvas.g:3100:1: ( ':' )
            {
            // InternalCanvas.g:3100:1: ( ':' )
            // InternalCanvas.g:3101:2: ':'
            {
             before(grammarAccess.getShapeAnchorElementAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getShapeAnchorElementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group__1__Impl"


    // $ANTLR start "rule__ShapeAnchorElement__Group__2"
    // InternalCanvas.g:3110:1: rule__ShapeAnchorElement__Group__2 : rule__ShapeAnchorElement__Group__2__Impl ;
    public final void rule__ShapeAnchorElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3114:1: ( rule__ShapeAnchorElement__Group__2__Impl )
            // InternalCanvas.g:3115:2: rule__ShapeAnchorElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group__2"


    // $ANTLR start "rule__ShapeAnchorElement__Group__2__Impl"
    // InternalCanvas.g:3121:1: rule__ShapeAnchorElement__Group__2__Impl : ( ( rule__ShapeAnchorElement__ElementAssignment_2 ) ) ;
    public final void rule__ShapeAnchorElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3125:1: ( ( ( rule__ShapeAnchorElement__ElementAssignment_2 ) ) )
            // InternalCanvas.g:3126:1: ( ( rule__ShapeAnchorElement__ElementAssignment_2 ) )
            {
            // InternalCanvas.g:3126:1: ( ( rule__ShapeAnchorElement__ElementAssignment_2 ) )
            // InternalCanvas.g:3127:2: ( rule__ShapeAnchorElement__ElementAssignment_2 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementAssignment_2()); 
            // InternalCanvas.g:3128:2: ( rule__ShapeAnchorElement__ElementAssignment_2 )
            // InternalCanvas.g:3128:3: rule__ShapeAnchorElement__ElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__ElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeAnchorElementAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group__2__Impl"


    // $ANTLR start "rule__ConnectorAnchorElement__Group__0"
    // InternalCanvas.g:3137:1: rule__ConnectorAnchorElement__Group__0 : rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1 ;
    public final void rule__ConnectorAnchorElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3141:1: ( rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1 )
            // InternalCanvas.g:3142:2: rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ConnectorAnchorElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group__0"


    // $ANTLR start "rule__ConnectorAnchorElement__Group__0__Impl"
    // InternalCanvas.g:3149:1: rule__ConnectorAnchorElement__Group__0__Impl : ( 'connector' ) ;
    public final void rule__ConnectorAnchorElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3153:1: ( ( 'connector' ) )
            // InternalCanvas.g:3154:1: ( 'connector' )
            {
            // InternalCanvas.g:3154:1: ( 'connector' )
            // InternalCanvas.g:3155:2: 'connector'
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getConnectorKeyword_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getConnectorAnchorElementAccess().getConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group__0__Impl"


    // $ANTLR start "rule__ConnectorAnchorElement__Group__1"
    // InternalCanvas.g:3164:1: rule__ConnectorAnchorElement__Group__1 : rule__ConnectorAnchorElement__Group__1__Impl rule__ConnectorAnchorElement__Group__2 ;
    public final void rule__ConnectorAnchorElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3168:1: ( rule__ConnectorAnchorElement__Group__1__Impl rule__ConnectorAnchorElement__Group__2 )
            // InternalCanvas.g:3169:2: rule__ConnectorAnchorElement__Group__1__Impl rule__ConnectorAnchorElement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ConnectorAnchorElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group__1"


    // $ANTLR start "rule__ConnectorAnchorElement__Group__1__Impl"
    // InternalCanvas.g:3176:1: rule__ConnectorAnchorElement__Group__1__Impl : ( ':' ) ;
    public final void rule__ConnectorAnchorElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3180:1: ( ( ':' ) )
            // InternalCanvas.g:3181:1: ( ':' )
            {
            // InternalCanvas.g:3181:1: ( ':' )
            // InternalCanvas.g:3182:2: ':'
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getConnectorAnchorElementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group__1__Impl"


    // $ANTLR start "rule__ConnectorAnchorElement__Group__2"
    // InternalCanvas.g:3191:1: rule__ConnectorAnchorElement__Group__2 : rule__ConnectorAnchorElement__Group__2__Impl ;
    public final void rule__ConnectorAnchorElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3195:1: ( rule__ConnectorAnchorElement__Group__2__Impl )
            // InternalCanvas.g:3196:2: rule__ConnectorAnchorElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group__2"


    // $ANTLR start "rule__ConnectorAnchorElement__Group__2__Impl"
    // InternalCanvas.g:3202:1: rule__ConnectorAnchorElement__Group__2__Impl : ( ( rule__ConnectorAnchorElement__ElementAssignment_2 ) ) ;
    public final void rule__ConnectorAnchorElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3206:1: ( ( ( rule__ConnectorAnchorElement__ElementAssignment_2 ) ) )
            // InternalCanvas.g:3207:1: ( ( rule__ConnectorAnchorElement__ElementAssignment_2 ) )
            {
            // InternalCanvas.g:3207:1: ( ( rule__ConnectorAnchorElement__ElementAssignment_2 ) )
            // InternalCanvas.g:3208:2: ( rule__ConnectorAnchorElement__ElementAssignment_2 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementAssignment_2()); 
            // InternalCanvas.g:3209:2: ( rule__ConnectorAnchorElement__ElementAssignment_2 )
            // InternalCanvas.g:3209:3: rule__ConnectorAnchorElement__ElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__ElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAnchorElementAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group__2__Impl"


    // $ANTLR start "rule__Polyline__Group__0"
    // InternalCanvas.g:3218:1: rule__Polyline__Group__0 : rule__Polyline__Group__0__Impl rule__Polyline__Group__1 ;
    public final void rule__Polyline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3222:1: ( rule__Polyline__Group__0__Impl rule__Polyline__Group__1 )
            // InternalCanvas.g:3223:2: rule__Polyline__Group__0__Impl rule__Polyline__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Polyline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polyline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group__0"


    // $ANTLR start "rule__Polyline__Group__0__Impl"
    // InternalCanvas.g:3230:1: rule__Polyline__Group__0__Impl : ( () ) ;
    public final void rule__Polyline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3234:1: ( ( () ) )
            // InternalCanvas.g:3235:1: ( () )
            {
            // InternalCanvas.g:3235:1: ( () )
            // InternalCanvas.g:3236:2: ()
            {
             before(grammarAccess.getPolylineAccess().getPolylineAction_0()); 
            // InternalCanvas.g:3237:2: ()
            // InternalCanvas.g:3237:3: 
            {
            }

             after(grammarAccess.getPolylineAccess().getPolylineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group__0__Impl"


    // $ANTLR start "rule__Polyline__Group__1"
    // InternalCanvas.g:3245:1: rule__Polyline__Group__1 : rule__Polyline__Group__1__Impl rule__Polyline__Group__2 ;
    public final void rule__Polyline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3249:1: ( rule__Polyline__Group__1__Impl rule__Polyline__Group__2 )
            // InternalCanvas.g:3250:2: rule__Polyline__Group__1__Impl rule__Polyline__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Polyline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polyline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group__1"


    // $ANTLR start "rule__Polyline__Group__1__Impl"
    // InternalCanvas.g:3257:1: rule__Polyline__Group__1__Impl : ( 'polyline' ) ;
    public final void rule__Polyline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3261:1: ( ( 'polyline' ) )
            // InternalCanvas.g:3262:1: ( 'polyline' )
            {
            // InternalCanvas.g:3262:1: ( 'polyline' )
            // InternalCanvas.g:3263:2: 'polyline'
            {
             before(grammarAccess.getPolylineAccess().getPolylineKeyword_1()); 
            match(input,107,FOLLOW_2); 
             after(grammarAccess.getPolylineAccess().getPolylineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group__1__Impl"


    // $ANTLR start "rule__Polyline__Group__2"
    // InternalCanvas.g:3272:1: rule__Polyline__Group__2 : rule__Polyline__Group__2__Impl rule__Polyline__Group__3 ;
    public final void rule__Polyline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3276:1: ( rule__Polyline__Group__2__Impl rule__Polyline__Group__3 )
            // InternalCanvas.g:3277:2: rule__Polyline__Group__2__Impl rule__Polyline__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Polyline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polyline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group__2"


    // $ANTLR start "rule__Polyline__Group__2__Impl"
    // InternalCanvas.g:3284:1: rule__Polyline__Group__2__Impl : ( ':' ) ;
    public final void rule__Polyline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3288:1: ( ( ':' ) )
            // InternalCanvas.g:3289:1: ( ':' )
            {
            // InternalCanvas.g:3289:1: ( ':' )
            // InternalCanvas.g:3290:2: ':'
            {
             before(grammarAccess.getPolylineAccess().getColonKeyword_2()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getPolylineAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group__2__Impl"


    // $ANTLR start "rule__Polyline__Group__3"
    // InternalCanvas.g:3299:1: rule__Polyline__Group__3 : rule__Polyline__Group__3__Impl ;
    public final void rule__Polyline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3303:1: ( rule__Polyline__Group__3__Impl )
            // InternalCanvas.g:3304:2: rule__Polyline__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polyline__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group__3"


    // $ANTLR start "rule__Polyline__Group__3__Impl"
    // InternalCanvas.g:3310:1: rule__Polyline__Group__3__Impl : ( ( rule__Polyline__SegmentsAssignment_3 )* ) ;
    public final void rule__Polyline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3314:1: ( ( ( rule__Polyline__SegmentsAssignment_3 )* ) )
            // InternalCanvas.g:3315:1: ( ( rule__Polyline__SegmentsAssignment_3 )* )
            {
            // InternalCanvas.g:3315:1: ( ( rule__Polyline__SegmentsAssignment_3 )* )
            // InternalCanvas.g:3316:2: ( rule__Polyline__SegmentsAssignment_3 )*
            {
             before(grammarAccess.getPolylineAccess().getSegmentsAssignment_3()); 
            // InternalCanvas.g:3317:2: ( rule__Polyline__SegmentsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==108) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCanvas.g:3317:3: rule__Polyline__SegmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Polyline__SegmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPolylineAccess().getSegmentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group__3__Impl"


    // $ANTLR start "rule__Segment__Group__0"
    // InternalCanvas.g:3326:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3330:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // InternalCanvas.g:3331:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Segment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__0"


    // $ANTLR start "rule__Segment__Group__0__Impl"
    // InternalCanvas.g:3338:1: rule__Segment__Group__0__Impl : ( 'segment' ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3342:1: ( ( 'segment' ) )
            // InternalCanvas.g:3343:1: ( 'segment' )
            {
            // InternalCanvas.g:3343:1: ( 'segment' )
            // InternalCanvas.g:3344:2: 'segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_0()); 
            match(input,108,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getSegmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__0__Impl"


    // $ANTLR start "rule__Segment__Group__1"
    // InternalCanvas.g:3353:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3357:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // InternalCanvas.g:3358:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Segment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__1"


    // $ANTLR start "rule__Segment__Group__1__Impl"
    // InternalCanvas.g:3365:1: rule__Segment__Group__1__Impl : ( ':' ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3369:1: ( ( ':' ) )
            // InternalCanvas.g:3370:1: ( ':' )
            {
            // InternalCanvas.g:3370:1: ( ':' )
            // InternalCanvas.g:3371:2: ':'
            {
             before(grammarAccess.getSegmentAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__1__Impl"


    // $ANTLR start "rule__Segment__Group__2"
    // InternalCanvas.g:3380:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3384:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // InternalCanvas.g:3385:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Segment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__2"


    // $ANTLR start "rule__Segment__Group__2__Impl"
    // InternalCanvas.g:3392:1: rule__Segment__Group__2__Impl : ( 'start' ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3396:1: ( ( 'start' ) )
            // InternalCanvas.g:3397:1: ( 'start' )
            {
            // InternalCanvas.g:3397:1: ( 'start' )
            // InternalCanvas.g:3398:2: 'start'
            {
             before(grammarAccess.getSegmentAccess().getStartKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getStartKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__2__Impl"


    // $ANTLR start "rule__Segment__Group__3"
    // InternalCanvas.g:3407:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3411:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // InternalCanvas.g:3412:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Segment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__3"


    // $ANTLR start "rule__Segment__Group__3__Impl"
    // InternalCanvas.g:3419:1: rule__Segment__Group__3__Impl : ( ':' ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3423:1: ( ( ':' ) )
            // InternalCanvas.g:3424:1: ( ':' )
            {
            // InternalCanvas.g:3424:1: ( ':' )
            // InternalCanvas.g:3425:2: ':'
            {
             before(grammarAccess.getSegmentAccess().getColonKeyword_3()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__3__Impl"


    // $ANTLR start "rule__Segment__Group__4"
    // InternalCanvas.g:3434:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl rule__Segment__Group__5 ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3438:1: ( rule__Segment__Group__4__Impl rule__Segment__Group__5 )
            // InternalCanvas.g:3439:2: rule__Segment__Group__4__Impl rule__Segment__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Segment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__4"


    // $ANTLR start "rule__Segment__Group__4__Impl"
    // InternalCanvas.g:3446:1: rule__Segment__Group__4__Impl : ( ( rule__Segment__StartPointAssignment_4 ) ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3450:1: ( ( ( rule__Segment__StartPointAssignment_4 ) ) )
            // InternalCanvas.g:3451:1: ( ( rule__Segment__StartPointAssignment_4 ) )
            {
            // InternalCanvas.g:3451:1: ( ( rule__Segment__StartPointAssignment_4 ) )
            // InternalCanvas.g:3452:2: ( rule__Segment__StartPointAssignment_4 )
            {
             before(grammarAccess.getSegmentAccess().getStartPointAssignment_4()); 
            // InternalCanvas.g:3453:2: ( rule__Segment__StartPointAssignment_4 )
            // InternalCanvas.g:3453:3: rule__Segment__StartPointAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Segment__StartPointAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getStartPointAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__4__Impl"


    // $ANTLR start "rule__Segment__Group__5"
    // InternalCanvas.g:3461:1: rule__Segment__Group__5 : rule__Segment__Group__5__Impl rule__Segment__Group__6 ;
    public final void rule__Segment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3465:1: ( rule__Segment__Group__5__Impl rule__Segment__Group__6 )
            // InternalCanvas.g:3466:2: rule__Segment__Group__5__Impl rule__Segment__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Segment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__5"


    // $ANTLR start "rule__Segment__Group__5__Impl"
    // InternalCanvas.g:3473:1: rule__Segment__Group__5__Impl : ( 'end' ) ;
    public final void rule__Segment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3477:1: ( ( 'end' ) )
            // InternalCanvas.g:3478:1: ( 'end' )
            {
            // InternalCanvas.g:3478:1: ( 'end' )
            // InternalCanvas.g:3479:2: 'end'
            {
             before(grammarAccess.getSegmentAccess().getEndKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__5__Impl"


    // $ANTLR start "rule__Segment__Group__6"
    // InternalCanvas.g:3488:1: rule__Segment__Group__6 : rule__Segment__Group__6__Impl rule__Segment__Group__7 ;
    public final void rule__Segment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3492:1: ( rule__Segment__Group__6__Impl rule__Segment__Group__7 )
            // InternalCanvas.g:3493:2: rule__Segment__Group__6__Impl rule__Segment__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Segment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__6"


    // $ANTLR start "rule__Segment__Group__6__Impl"
    // InternalCanvas.g:3500:1: rule__Segment__Group__6__Impl : ( ':' ) ;
    public final void rule__Segment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3504:1: ( ( ':' ) )
            // InternalCanvas.g:3505:1: ( ':' )
            {
            // InternalCanvas.g:3505:1: ( ':' )
            // InternalCanvas.g:3506:2: ':'
            {
             before(grammarAccess.getSegmentAccess().getColonKeyword_6()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__6__Impl"


    // $ANTLR start "rule__Segment__Group__7"
    // InternalCanvas.g:3515:1: rule__Segment__Group__7 : rule__Segment__Group__7__Impl ;
    public final void rule__Segment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3519:1: ( rule__Segment__Group__7__Impl )
            // InternalCanvas.g:3520:2: rule__Segment__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__7"


    // $ANTLR start "rule__Segment__Group__7__Impl"
    // InternalCanvas.g:3526:1: rule__Segment__Group__7__Impl : ( ( rule__Segment__EndPointAssignment_7 ) ) ;
    public final void rule__Segment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3530:1: ( ( ( rule__Segment__EndPointAssignment_7 ) ) )
            // InternalCanvas.g:3531:1: ( ( rule__Segment__EndPointAssignment_7 ) )
            {
            // InternalCanvas.g:3531:1: ( ( rule__Segment__EndPointAssignment_7 ) )
            // InternalCanvas.g:3532:2: ( rule__Segment__EndPointAssignment_7 )
            {
             before(grammarAccess.getSegmentAccess().getEndPointAssignment_7()); 
            // InternalCanvas.g:3533:2: ( rule__Segment__EndPointAssignment_7 )
            // InternalCanvas.g:3533:3: rule__Segment__EndPointAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Segment__EndPointAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getEndPointAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__7__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalCanvas.g:3542:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3546:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalCanvas.g:3547:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalCanvas.g:3554:1: rule__Point__Group__0__Impl : ( 'x' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3558:1: ( ( 'x' ) )
            // InternalCanvas.g:3559:1: ( 'x' )
            {
            // InternalCanvas.g:3559:1: ( 'x' )
            // InternalCanvas.g:3560:2: 'x'
            {
             before(grammarAccess.getPointAccess().getXKeyword_0()); 
            match(input,109,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getXKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalCanvas.g:3569:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3573:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalCanvas.g:3574:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalCanvas.g:3581:1: rule__Point__Group__1__Impl : ( ':' ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3585:1: ( ( ':' ) )
            // InternalCanvas.g:3586:1: ( ':' )
            {
            // InternalCanvas.g:3586:1: ( ':' )
            // InternalCanvas.g:3587:2: ':'
            {
             before(grammarAccess.getPointAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__2"
    // InternalCanvas.g:3596:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3600:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalCanvas.g:3601:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__2"


    // $ANTLR start "rule__Point__Group__2__Impl"
    // InternalCanvas.g:3608:1: rule__Point__Group__2__Impl : ( ( rule__Point__XAssignment_2 ) ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3612:1: ( ( ( rule__Point__XAssignment_2 ) ) )
            // InternalCanvas.g:3613:1: ( ( rule__Point__XAssignment_2 ) )
            {
            // InternalCanvas.g:3613:1: ( ( rule__Point__XAssignment_2 ) )
            // InternalCanvas.g:3614:2: ( rule__Point__XAssignment_2 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_2()); 
            // InternalCanvas.g:3615:2: ( rule__Point__XAssignment_2 )
            // InternalCanvas.g:3615:3: rule__Point__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Point__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__2__Impl"


    // $ANTLR start "rule__Point__Group__3"
    // InternalCanvas.g:3623:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3627:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // InternalCanvas.g:3628:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__3"


    // $ANTLR start "rule__Point__Group__3__Impl"
    // InternalCanvas.g:3635:1: rule__Point__Group__3__Impl : ( 'y' ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3639:1: ( ( 'y' ) )
            // InternalCanvas.g:3640:1: ( 'y' )
            {
            // InternalCanvas.g:3640:1: ( 'y' )
            // InternalCanvas.g:3641:2: 'y'
            {
             before(grammarAccess.getPointAccess().getYKeyword_3()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getYKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__4"
    // InternalCanvas.g:3650:1: rule__Point__Group__4 : rule__Point__Group__4__Impl rule__Point__Group__5 ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3654:1: ( rule__Point__Group__4__Impl rule__Point__Group__5 )
            // InternalCanvas.g:3655:2: rule__Point__Group__4__Impl rule__Point__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Point__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__4"


    // $ANTLR start "rule__Point__Group__4__Impl"
    // InternalCanvas.g:3662:1: rule__Point__Group__4__Impl : ( ':' ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3666:1: ( ( ':' ) )
            // InternalCanvas.g:3667:1: ( ':' )
            {
            // InternalCanvas.g:3667:1: ( ':' )
            // InternalCanvas.g:3668:2: ':'
            {
             before(grammarAccess.getPointAccess().getColonKeyword_4()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__4__Impl"


    // $ANTLR start "rule__Point__Group__5"
    // InternalCanvas.g:3677:1: rule__Point__Group__5 : rule__Point__Group__5__Impl ;
    public final void rule__Point__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3681:1: ( rule__Point__Group__5__Impl )
            // InternalCanvas.g:3682:2: rule__Point__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__5"


    // $ANTLR start "rule__Point__Group__5__Impl"
    // InternalCanvas.g:3688:1: rule__Point__Group__5__Impl : ( ( rule__Point__YAssignment_5 ) ) ;
    public final void rule__Point__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3692:1: ( ( ( rule__Point__YAssignment_5 ) ) )
            // InternalCanvas.g:3693:1: ( ( rule__Point__YAssignment_5 ) )
            {
            // InternalCanvas.g:3693:1: ( ( rule__Point__YAssignment_5 ) )
            // InternalCanvas.g:3694:2: ( rule__Point__YAssignment_5 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_5()); 
            // InternalCanvas.g:3695:2: ( rule__Point__YAssignment_5 )
            // InternalCanvas.g:3695:3: rule__Point__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Point__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__5__Impl"


    // $ANTLR start "rule__PointDefinition__Group__0"
    // InternalCanvas.g:3704:1: rule__PointDefinition__Group__0 : rule__PointDefinition__Group__0__Impl rule__PointDefinition__Group__1 ;
    public final void rule__PointDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3708:1: ( rule__PointDefinition__Group__0__Impl rule__PointDefinition__Group__1 )
            // InternalCanvas.g:3709:2: rule__PointDefinition__Group__0__Impl rule__PointDefinition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PointDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__0"


    // $ANTLR start "rule__PointDefinition__Group__0__Impl"
    // InternalCanvas.g:3716:1: rule__PointDefinition__Group__0__Impl : ( 'point' ) ;
    public final void rule__PointDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3720:1: ( ( 'point' ) )
            // InternalCanvas.g:3721:1: ( 'point' )
            {
            // InternalCanvas.g:3721:1: ( 'point' )
            // InternalCanvas.g:3722:2: 'point'
            {
             before(grammarAccess.getPointDefinitionAccess().getPointKeyword_0()); 
            match(input,111,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getPointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__0__Impl"


    // $ANTLR start "rule__PointDefinition__Group__1"
    // InternalCanvas.g:3731:1: rule__PointDefinition__Group__1 : rule__PointDefinition__Group__1__Impl rule__PointDefinition__Group__2 ;
    public final void rule__PointDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3735:1: ( rule__PointDefinition__Group__1__Impl rule__PointDefinition__Group__2 )
            // InternalCanvas.g:3736:2: rule__PointDefinition__Group__1__Impl rule__PointDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PointDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__1"


    // $ANTLR start "rule__PointDefinition__Group__1__Impl"
    // InternalCanvas.g:3743:1: rule__PointDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__PointDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3747:1: ( ( ':' ) )
            // InternalCanvas.g:3748:1: ( ':' )
            {
            // InternalCanvas.g:3748:1: ( ':' )
            // InternalCanvas.g:3749:2: ':'
            {
             before(grammarAccess.getPointDefinitionAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__1__Impl"


    // $ANTLR start "rule__PointDefinition__Group__2"
    // InternalCanvas.g:3758:1: rule__PointDefinition__Group__2 : rule__PointDefinition__Group__2__Impl rule__PointDefinition__Group__3 ;
    public final void rule__PointDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3762:1: ( rule__PointDefinition__Group__2__Impl rule__PointDefinition__Group__3 )
            // InternalCanvas.g:3763:2: rule__PointDefinition__Group__2__Impl rule__PointDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PointDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__2"


    // $ANTLR start "rule__PointDefinition__Group__2__Impl"
    // InternalCanvas.g:3770:1: rule__PointDefinition__Group__2__Impl : ( 'x' ) ;
    public final void rule__PointDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3774:1: ( ( 'x' ) )
            // InternalCanvas.g:3775:1: ( 'x' )
            {
            // InternalCanvas.g:3775:1: ( 'x' )
            // InternalCanvas.g:3776:2: 'x'
            {
             before(grammarAccess.getPointDefinitionAccess().getXKeyword_2()); 
            match(input,109,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__2__Impl"


    // $ANTLR start "rule__PointDefinition__Group__3"
    // InternalCanvas.g:3785:1: rule__PointDefinition__Group__3 : rule__PointDefinition__Group__3__Impl rule__PointDefinition__Group__4 ;
    public final void rule__PointDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3789:1: ( rule__PointDefinition__Group__3__Impl rule__PointDefinition__Group__4 )
            // InternalCanvas.g:3790:2: rule__PointDefinition__Group__3__Impl rule__PointDefinition__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__PointDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__3"


    // $ANTLR start "rule__PointDefinition__Group__3__Impl"
    // InternalCanvas.g:3797:1: rule__PointDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__PointDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3801:1: ( ( ':' ) )
            // InternalCanvas.g:3802:1: ( ':' )
            {
            // InternalCanvas.g:3802:1: ( ':' )
            // InternalCanvas.g:3803:2: ':'
            {
             before(grammarAccess.getPointDefinitionAccess().getColonKeyword_3()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__3__Impl"


    // $ANTLR start "rule__PointDefinition__Group__4"
    // InternalCanvas.g:3812:1: rule__PointDefinition__Group__4 : rule__PointDefinition__Group__4__Impl rule__PointDefinition__Group__5 ;
    public final void rule__PointDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3816:1: ( rule__PointDefinition__Group__4__Impl rule__PointDefinition__Group__5 )
            // InternalCanvas.g:3817:2: rule__PointDefinition__Group__4__Impl rule__PointDefinition__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__PointDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__4"


    // $ANTLR start "rule__PointDefinition__Group__4__Impl"
    // InternalCanvas.g:3824:1: rule__PointDefinition__Group__4__Impl : ( ( rule__PointDefinition__XAssignment_4 ) ) ;
    public final void rule__PointDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3828:1: ( ( ( rule__PointDefinition__XAssignment_4 ) ) )
            // InternalCanvas.g:3829:1: ( ( rule__PointDefinition__XAssignment_4 ) )
            {
            // InternalCanvas.g:3829:1: ( ( rule__PointDefinition__XAssignment_4 ) )
            // InternalCanvas.g:3830:2: ( rule__PointDefinition__XAssignment_4 )
            {
             before(grammarAccess.getPointDefinitionAccess().getXAssignment_4()); 
            // InternalCanvas.g:3831:2: ( rule__PointDefinition__XAssignment_4 )
            // InternalCanvas.g:3831:3: rule__PointDefinition__XAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PointDefinition__XAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPointDefinitionAccess().getXAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__4__Impl"


    // $ANTLR start "rule__PointDefinition__Group__5"
    // InternalCanvas.g:3839:1: rule__PointDefinition__Group__5 : rule__PointDefinition__Group__5__Impl rule__PointDefinition__Group__6 ;
    public final void rule__PointDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3843:1: ( rule__PointDefinition__Group__5__Impl rule__PointDefinition__Group__6 )
            // InternalCanvas.g:3844:2: rule__PointDefinition__Group__5__Impl rule__PointDefinition__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__PointDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__5"


    // $ANTLR start "rule__PointDefinition__Group__5__Impl"
    // InternalCanvas.g:3851:1: rule__PointDefinition__Group__5__Impl : ( 'y' ) ;
    public final void rule__PointDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3855:1: ( ( 'y' ) )
            // InternalCanvas.g:3856:1: ( 'y' )
            {
            // InternalCanvas.g:3856:1: ( 'y' )
            // InternalCanvas.g:3857:2: 'y'
            {
             before(grammarAccess.getPointDefinitionAccess().getYKeyword_5()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getYKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__5__Impl"


    // $ANTLR start "rule__PointDefinition__Group__6"
    // InternalCanvas.g:3866:1: rule__PointDefinition__Group__6 : rule__PointDefinition__Group__6__Impl rule__PointDefinition__Group__7 ;
    public final void rule__PointDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3870:1: ( rule__PointDefinition__Group__6__Impl rule__PointDefinition__Group__7 )
            // InternalCanvas.g:3871:2: rule__PointDefinition__Group__6__Impl rule__PointDefinition__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__PointDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__6"


    // $ANTLR start "rule__PointDefinition__Group__6__Impl"
    // InternalCanvas.g:3878:1: rule__PointDefinition__Group__6__Impl : ( ':' ) ;
    public final void rule__PointDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3882:1: ( ( ':' ) )
            // InternalCanvas.g:3883:1: ( ':' )
            {
            // InternalCanvas.g:3883:1: ( ':' )
            // InternalCanvas.g:3884:2: ':'
            {
             before(grammarAccess.getPointDefinitionAccess().getColonKeyword_6()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__6__Impl"


    // $ANTLR start "rule__PointDefinition__Group__7"
    // InternalCanvas.g:3893:1: rule__PointDefinition__Group__7 : rule__PointDefinition__Group__7__Impl ;
    public final void rule__PointDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3897:1: ( rule__PointDefinition__Group__7__Impl )
            // InternalCanvas.g:3898:2: rule__PointDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__7"


    // $ANTLR start "rule__PointDefinition__Group__7__Impl"
    // InternalCanvas.g:3904:1: rule__PointDefinition__Group__7__Impl : ( ( rule__PointDefinition__YAssignment_7 ) ) ;
    public final void rule__PointDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3908:1: ( ( ( rule__PointDefinition__YAssignment_7 ) ) )
            // InternalCanvas.g:3909:1: ( ( rule__PointDefinition__YAssignment_7 ) )
            {
            // InternalCanvas.g:3909:1: ( ( rule__PointDefinition__YAssignment_7 ) )
            // InternalCanvas.g:3910:2: ( rule__PointDefinition__YAssignment_7 )
            {
             before(grammarAccess.getPointDefinitionAccess().getYAssignment_7()); 
            // InternalCanvas.g:3911:2: ( rule__PointDefinition__YAssignment_7 )
            // InternalCanvas.g:3911:3: rule__PointDefinition__YAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__PointDefinition__YAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPointDefinitionAccess().getYAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group__7__Impl"


    // $ANTLR start "rule__Bounds__Group__0"
    // InternalCanvas.g:3920:1: rule__Bounds__Group__0 : rule__Bounds__Group__0__Impl rule__Bounds__Group__1 ;
    public final void rule__Bounds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3924:1: ( rule__Bounds__Group__0__Impl rule__Bounds__Group__1 )
            // InternalCanvas.g:3925:2: rule__Bounds__Group__0__Impl rule__Bounds__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Bounds__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__0"


    // $ANTLR start "rule__Bounds__Group__0__Impl"
    // InternalCanvas.g:3932:1: rule__Bounds__Group__0__Impl : ( 'bounds' ) ;
    public final void rule__Bounds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3936:1: ( ( 'bounds' ) )
            // InternalCanvas.g:3937:1: ( 'bounds' )
            {
            // InternalCanvas.g:3937:1: ( 'bounds' )
            // InternalCanvas.g:3938:2: 'bounds'
            {
             before(grammarAccess.getBoundsAccess().getBoundsKeyword_0()); 
            match(input,112,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getBoundsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__0__Impl"


    // $ANTLR start "rule__Bounds__Group__1"
    // InternalCanvas.g:3947:1: rule__Bounds__Group__1 : rule__Bounds__Group__1__Impl rule__Bounds__Group__2 ;
    public final void rule__Bounds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3951:1: ( rule__Bounds__Group__1__Impl rule__Bounds__Group__2 )
            // InternalCanvas.g:3952:2: rule__Bounds__Group__1__Impl rule__Bounds__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Bounds__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__1"


    // $ANTLR start "rule__Bounds__Group__1__Impl"
    // InternalCanvas.g:3959:1: rule__Bounds__Group__1__Impl : ( ':' ) ;
    public final void rule__Bounds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3963:1: ( ( ':' ) )
            // InternalCanvas.g:3964:1: ( ':' )
            {
            // InternalCanvas.g:3964:1: ( ':' )
            // InternalCanvas.g:3965:2: ':'
            {
             before(grammarAccess.getBoundsAccess().getColonKeyword_1()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__1__Impl"


    // $ANTLR start "rule__Bounds__Group__2"
    // InternalCanvas.g:3974:1: rule__Bounds__Group__2 : rule__Bounds__Group__2__Impl rule__Bounds__Group__3 ;
    public final void rule__Bounds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3978:1: ( rule__Bounds__Group__2__Impl rule__Bounds__Group__3 )
            // InternalCanvas.g:3979:2: rule__Bounds__Group__2__Impl rule__Bounds__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Bounds__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__2"


    // $ANTLR start "rule__Bounds__Group__2__Impl"
    // InternalCanvas.g:3986:1: rule__Bounds__Group__2__Impl : ( 'x' ) ;
    public final void rule__Bounds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3990:1: ( ( 'x' ) )
            // InternalCanvas.g:3991:1: ( 'x' )
            {
            // InternalCanvas.g:3991:1: ( 'x' )
            // InternalCanvas.g:3992:2: 'x'
            {
             before(grammarAccess.getBoundsAccess().getXKeyword_2()); 
            match(input,109,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__2__Impl"


    // $ANTLR start "rule__Bounds__Group__3"
    // InternalCanvas.g:4001:1: rule__Bounds__Group__3 : rule__Bounds__Group__3__Impl rule__Bounds__Group__4 ;
    public final void rule__Bounds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4005:1: ( rule__Bounds__Group__3__Impl rule__Bounds__Group__4 )
            // InternalCanvas.g:4006:2: rule__Bounds__Group__3__Impl rule__Bounds__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Bounds__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__3"


    // $ANTLR start "rule__Bounds__Group__3__Impl"
    // InternalCanvas.g:4013:1: rule__Bounds__Group__3__Impl : ( ':' ) ;
    public final void rule__Bounds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4017:1: ( ( ':' ) )
            // InternalCanvas.g:4018:1: ( ':' )
            {
            // InternalCanvas.g:4018:1: ( ':' )
            // InternalCanvas.g:4019:2: ':'
            {
             before(grammarAccess.getBoundsAccess().getColonKeyword_3()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__3__Impl"


    // $ANTLR start "rule__Bounds__Group__4"
    // InternalCanvas.g:4028:1: rule__Bounds__Group__4 : rule__Bounds__Group__4__Impl rule__Bounds__Group__5 ;
    public final void rule__Bounds__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4032:1: ( rule__Bounds__Group__4__Impl rule__Bounds__Group__5 )
            // InternalCanvas.g:4033:2: rule__Bounds__Group__4__Impl rule__Bounds__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Bounds__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__4"


    // $ANTLR start "rule__Bounds__Group__4__Impl"
    // InternalCanvas.g:4040:1: rule__Bounds__Group__4__Impl : ( ( rule__Bounds__XAssignment_4 ) ) ;
    public final void rule__Bounds__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4044:1: ( ( ( rule__Bounds__XAssignment_4 ) ) )
            // InternalCanvas.g:4045:1: ( ( rule__Bounds__XAssignment_4 ) )
            {
            // InternalCanvas.g:4045:1: ( ( rule__Bounds__XAssignment_4 ) )
            // InternalCanvas.g:4046:2: ( rule__Bounds__XAssignment_4 )
            {
             before(grammarAccess.getBoundsAccess().getXAssignment_4()); 
            // InternalCanvas.g:4047:2: ( rule__Bounds__XAssignment_4 )
            // InternalCanvas.g:4047:3: rule__Bounds__XAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Bounds__XAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getXAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__4__Impl"


    // $ANTLR start "rule__Bounds__Group__5"
    // InternalCanvas.g:4055:1: rule__Bounds__Group__5 : rule__Bounds__Group__5__Impl rule__Bounds__Group__6 ;
    public final void rule__Bounds__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4059:1: ( rule__Bounds__Group__5__Impl rule__Bounds__Group__6 )
            // InternalCanvas.g:4060:2: rule__Bounds__Group__5__Impl rule__Bounds__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Bounds__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__5"


    // $ANTLR start "rule__Bounds__Group__5__Impl"
    // InternalCanvas.g:4067:1: rule__Bounds__Group__5__Impl : ( 'y' ) ;
    public final void rule__Bounds__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4071:1: ( ( 'y' ) )
            // InternalCanvas.g:4072:1: ( 'y' )
            {
            // InternalCanvas.g:4072:1: ( 'y' )
            // InternalCanvas.g:4073:2: 'y'
            {
             before(grammarAccess.getBoundsAccess().getYKeyword_5()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getYKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__5__Impl"


    // $ANTLR start "rule__Bounds__Group__6"
    // InternalCanvas.g:4082:1: rule__Bounds__Group__6 : rule__Bounds__Group__6__Impl rule__Bounds__Group__7 ;
    public final void rule__Bounds__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4086:1: ( rule__Bounds__Group__6__Impl rule__Bounds__Group__7 )
            // InternalCanvas.g:4087:2: rule__Bounds__Group__6__Impl rule__Bounds__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Bounds__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__6"


    // $ANTLR start "rule__Bounds__Group__6__Impl"
    // InternalCanvas.g:4094:1: rule__Bounds__Group__6__Impl : ( ':' ) ;
    public final void rule__Bounds__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4098:1: ( ( ':' ) )
            // InternalCanvas.g:4099:1: ( ':' )
            {
            // InternalCanvas.g:4099:1: ( ':' )
            // InternalCanvas.g:4100:2: ':'
            {
             before(grammarAccess.getBoundsAccess().getColonKeyword_6()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__6__Impl"


    // $ANTLR start "rule__Bounds__Group__7"
    // InternalCanvas.g:4109:1: rule__Bounds__Group__7 : rule__Bounds__Group__7__Impl rule__Bounds__Group__8 ;
    public final void rule__Bounds__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4113:1: ( rule__Bounds__Group__7__Impl rule__Bounds__Group__8 )
            // InternalCanvas.g:4114:2: rule__Bounds__Group__7__Impl rule__Bounds__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__Bounds__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__7"


    // $ANTLR start "rule__Bounds__Group__7__Impl"
    // InternalCanvas.g:4121:1: rule__Bounds__Group__7__Impl : ( ( rule__Bounds__YAssignment_7 ) ) ;
    public final void rule__Bounds__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4125:1: ( ( ( rule__Bounds__YAssignment_7 ) ) )
            // InternalCanvas.g:4126:1: ( ( rule__Bounds__YAssignment_7 ) )
            {
            // InternalCanvas.g:4126:1: ( ( rule__Bounds__YAssignment_7 ) )
            // InternalCanvas.g:4127:2: ( rule__Bounds__YAssignment_7 )
            {
             before(grammarAccess.getBoundsAccess().getYAssignment_7()); 
            // InternalCanvas.g:4128:2: ( rule__Bounds__YAssignment_7 )
            // InternalCanvas.g:4128:3: rule__Bounds__YAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Bounds__YAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getYAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__7__Impl"


    // $ANTLR start "rule__Bounds__Group__8"
    // InternalCanvas.g:4136:1: rule__Bounds__Group__8 : rule__Bounds__Group__8__Impl rule__Bounds__Group__9 ;
    public final void rule__Bounds__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4140:1: ( rule__Bounds__Group__8__Impl rule__Bounds__Group__9 )
            // InternalCanvas.g:4141:2: rule__Bounds__Group__8__Impl rule__Bounds__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Bounds__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__8"


    // $ANTLR start "rule__Bounds__Group__8__Impl"
    // InternalCanvas.g:4148:1: rule__Bounds__Group__8__Impl : ( 'width' ) ;
    public final void rule__Bounds__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4152:1: ( ( 'width' ) )
            // InternalCanvas.g:4153:1: ( 'width' )
            {
            // InternalCanvas.g:4153:1: ( 'width' )
            // InternalCanvas.g:4154:2: 'width'
            {
             before(grammarAccess.getBoundsAccess().getWidthKeyword_8()); 
            match(input,113,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getWidthKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__8__Impl"


    // $ANTLR start "rule__Bounds__Group__9"
    // InternalCanvas.g:4163:1: rule__Bounds__Group__9 : rule__Bounds__Group__9__Impl rule__Bounds__Group__10 ;
    public final void rule__Bounds__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4167:1: ( rule__Bounds__Group__9__Impl rule__Bounds__Group__10 )
            // InternalCanvas.g:4168:2: rule__Bounds__Group__9__Impl rule__Bounds__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Bounds__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__9"


    // $ANTLR start "rule__Bounds__Group__9__Impl"
    // InternalCanvas.g:4175:1: rule__Bounds__Group__9__Impl : ( ':' ) ;
    public final void rule__Bounds__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4179:1: ( ( ':' ) )
            // InternalCanvas.g:4180:1: ( ':' )
            {
            // InternalCanvas.g:4180:1: ( ':' )
            // InternalCanvas.g:4181:2: ':'
            {
             before(grammarAccess.getBoundsAccess().getColonKeyword_9()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__9__Impl"


    // $ANTLR start "rule__Bounds__Group__10"
    // InternalCanvas.g:4190:1: rule__Bounds__Group__10 : rule__Bounds__Group__10__Impl rule__Bounds__Group__11 ;
    public final void rule__Bounds__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4194:1: ( rule__Bounds__Group__10__Impl rule__Bounds__Group__11 )
            // InternalCanvas.g:4195:2: rule__Bounds__Group__10__Impl rule__Bounds__Group__11
            {
            pushFollow(FOLLOW_37);
            rule__Bounds__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__10"


    // $ANTLR start "rule__Bounds__Group__10__Impl"
    // InternalCanvas.g:4202:1: rule__Bounds__Group__10__Impl : ( ( rule__Bounds__WAssignment_10 ) ) ;
    public final void rule__Bounds__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4206:1: ( ( ( rule__Bounds__WAssignment_10 ) ) )
            // InternalCanvas.g:4207:1: ( ( rule__Bounds__WAssignment_10 ) )
            {
            // InternalCanvas.g:4207:1: ( ( rule__Bounds__WAssignment_10 ) )
            // InternalCanvas.g:4208:2: ( rule__Bounds__WAssignment_10 )
            {
             before(grammarAccess.getBoundsAccess().getWAssignment_10()); 
            // InternalCanvas.g:4209:2: ( rule__Bounds__WAssignment_10 )
            // InternalCanvas.g:4209:3: rule__Bounds__WAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Bounds__WAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getWAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__10__Impl"


    // $ANTLR start "rule__Bounds__Group__11"
    // InternalCanvas.g:4217:1: rule__Bounds__Group__11 : rule__Bounds__Group__11__Impl rule__Bounds__Group__12 ;
    public final void rule__Bounds__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4221:1: ( rule__Bounds__Group__11__Impl rule__Bounds__Group__12 )
            // InternalCanvas.g:4222:2: rule__Bounds__Group__11__Impl rule__Bounds__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__Bounds__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__11"


    // $ANTLR start "rule__Bounds__Group__11__Impl"
    // InternalCanvas.g:4229:1: rule__Bounds__Group__11__Impl : ( 'height' ) ;
    public final void rule__Bounds__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4233:1: ( ( 'height' ) )
            // InternalCanvas.g:4234:1: ( 'height' )
            {
            // InternalCanvas.g:4234:1: ( 'height' )
            // InternalCanvas.g:4235:2: 'height'
            {
             before(grammarAccess.getBoundsAccess().getHeightKeyword_11()); 
            match(input,114,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getHeightKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__11__Impl"


    // $ANTLR start "rule__Bounds__Group__12"
    // InternalCanvas.g:4244:1: rule__Bounds__Group__12 : rule__Bounds__Group__12__Impl rule__Bounds__Group__13 ;
    public final void rule__Bounds__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4248:1: ( rule__Bounds__Group__12__Impl rule__Bounds__Group__13 )
            // InternalCanvas.g:4249:2: rule__Bounds__Group__12__Impl rule__Bounds__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Bounds__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bounds__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__12"


    // $ANTLR start "rule__Bounds__Group__12__Impl"
    // InternalCanvas.g:4256:1: rule__Bounds__Group__12__Impl : ( ':' ) ;
    public final void rule__Bounds__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4260:1: ( ( ':' ) )
            // InternalCanvas.g:4261:1: ( ':' )
            {
            // InternalCanvas.g:4261:1: ( ':' )
            // InternalCanvas.g:4262:2: ':'
            {
             before(grammarAccess.getBoundsAccess().getColonKeyword_12()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__12__Impl"


    // $ANTLR start "rule__Bounds__Group__13"
    // InternalCanvas.g:4271:1: rule__Bounds__Group__13 : rule__Bounds__Group__13__Impl ;
    public final void rule__Bounds__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4275:1: ( rule__Bounds__Group__13__Impl )
            // InternalCanvas.g:4276:2: rule__Bounds__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bounds__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__13"


    // $ANTLR start "rule__Bounds__Group__13__Impl"
    // InternalCanvas.g:4282:1: rule__Bounds__Group__13__Impl : ( ( rule__Bounds__HAssignment_13 ) ) ;
    public final void rule__Bounds__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4286:1: ( ( ( rule__Bounds__HAssignment_13 ) ) )
            // InternalCanvas.g:4287:1: ( ( rule__Bounds__HAssignment_13 ) )
            {
            // InternalCanvas.g:4287:1: ( ( rule__Bounds__HAssignment_13 ) )
            // InternalCanvas.g:4288:2: ( rule__Bounds__HAssignment_13 )
            {
             before(grammarAccess.getBoundsAccess().getHAssignment_13()); 
            // InternalCanvas.g:4289:2: ( rule__Bounds__HAssignment_13 )
            // InternalCanvas.g:4289:3: rule__Bounds__HAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Bounds__HAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getBoundsAccess().getHAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__Group__13__Impl"


    // $ANTLR start "rule__Model__RenderAssignment_0"
    // InternalCanvas.g:4298:1: rule__Model__RenderAssignment_0 : ( ruleModelRender ) ;
    public final void rule__Model__RenderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4302:1: ( ( ruleModelRender ) )
            // InternalCanvas.g:4303:2: ( ruleModelRender )
            {
            // InternalCanvas.g:4303:2: ( ruleModelRender )
            // InternalCanvas.g:4304:3: ruleModelRender
            {
             before(grammarAccess.getModelAccess().getRenderModelRenderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModelRender();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRenderModelRenderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RenderAssignment_0"


    // $ANTLR start "rule__Model__PropertiesAssignment_1"
    // InternalCanvas.g:4313:1: rule__Model__PropertiesAssignment_1 : ( ruleModelProperties ) ;
    public final void rule__Model__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4317:1: ( ( ruleModelProperties ) )
            // InternalCanvas.g:4318:2: ( ruleModelProperties )
            {
            // InternalCanvas.g:4318:2: ( ruleModelProperties )
            // InternalCanvas.g:4319:3: ruleModelProperties
            {
             before(grammarAccess.getModelAccess().getPropertiesModelPropertiesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelProperties();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPropertiesModelPropertiesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PropertiesAssignment_1"


    // $ANTLR start "rule__Model__ElementsAssignment_2"
    // InternalCanvas.g:4328:1: rule__Model__ElementsAssignment_2 : ( ruleGraphicalElement ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4332:1: ( ( ruleGraphicalElement ) )
            // InternalCanvas.g:4333:2: ( ruleGraphicalElement )
            {
            // InternalCanvas.g:4333:2: ( ruleGraphicalElement )
            // InternalCanvas.g:4334:3: ruleGraphicalElement
            {
             before(grammarAccess.getModelAccess().getElementsGraphicalElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicalElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsGraphicalElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_2"


    // $ANTLR start "rule__ModelRender__ImportURIAssignment_2"
    // InternalCanvas.g:4343:1: rule__ModelRender__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ModelRender__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4347:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4348:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4348:2: ( RULE_STRING )
            // InternalCanvas.g:4349:3: RULE_STRING
            {
             before(grammarAccess.getModelRenderAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelRenderAccess().getImportURISTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__ImportURIAssignment_2"


    // $ANTLR start "rule__ModelProperties__PointAssignment_4"
    // InternalCanvas.g:4358:1: rule__ModelProperties__PointAssignment_4 : ( rulePoint ) ;
    public final void rule__ModelProperties__PointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4362:1: ( ( rulePoint ) )
            // InternalCanvas.g:4363:2: ( rulePoint )
            {
            // InternalCanvas.g:4363:2: ( rulePoint )
            // InternalCanvas.g:4364:3: rulePoint
            {
             before(grammarAccess.getModelPropertiesAccess().getPointPointParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getModelPropertiesAccess().getPointPointParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__PointAssignment_4"


    // $ANTLR start "rule__ModelProperties__ZoomAssignment_7"
    // InternalCanvas.g:4373:1: rule__ModelProperties__ZoomAssignment_7 : ( RULE_INT ) ;
    public final void rule__ModelProperties__ZoomAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4377:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4378:2: ( RULE_INT )
            {
            // InternalCanvas.g:4378:2: ( RULE_INT )
            // InternalCanvas.g:4379:3: RULE_INT
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getZoomINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__ZoomAssignment_7"


    // $ANTLR start "rule__Shapes__ShapesAssignment_3"
    // InternalCanvas.g:4388:1: rule__Shapes__ShapesAssignment_3 : ( ruleShape ) ;
    public final void rule__Shapes__ShapesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4392:1: ( ( ruleShape ) )
            // InternalCanvas.g:4393:2: ( ruleShape )
            {
            // InternalCanvas.g:4393:2: ( ruleShape )
            // InternalCanvas.g:4394:3: ruleShape
            {
             before(grammarAccess.getShapesAccess().getShapesShapeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapesAccess().getShapesShapeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__ShapesAssignment_3"


    // $ANTLR start "rule__Shape__NameAssignment_3"
    // InternalCanvas.g:4403:1: rule__Shape__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Shape__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4407:1: ( ( RULE_ID ) )
            // InternalCanvas.g:4408:2: ( RULE_ID )
            {
            // InternalCanvas.g:4408:2: ( RULE_ID )
            // InternalCanvas.g:4409:3: RULE_ID
            {
             before(grammarAccess.getShapeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__NameAssignment_3"


    // $ANTLR start "rule__Shape__ContainerAssignment_4"
    // InternalCanvas.g:4418:1: rule__Shape__ContainerAssignment_4 : ( ruleContainer ) ;
    public final void rule__Shape__ContainerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4422:1: ( ( ruleContainer ) )
            // InternalCanvas.g:4423:2: ( ruleContainer )
            {
            // InternalCanvas.g:4423:2: ( ruleContainer )
            // InternalCanvas.g:4424:3: ruleContainer
            {
             before(grammarAccess.getShapeAccess().getContainerContainerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getContainerContainerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__ContainerAssignment_4"


    // $ANTLR start "rule__Shape__TypeAssignment_7"
    // InternalCanvas.g:4433:1: rule__Shape__TypeAssignment_7 : ( ruleTypeLabel ) ;
    public final void rule__Shape__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4437:1: ( ( ruleTypeLabel ) )
            // InternalCanvas.g:4438:2: ( ruleTypeLabel )
            {
            // InternalCanvas.g:4438:2: ( ruleTypeLabel )
            // InternalCanvas.g:4439:3: ruleTypeLabel
            {
             before(grammarAccess.getShapeAccess().getTypeTypeLabelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeLabel();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getTypeTypeLabelParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__TypeAssignment_7"


    // $ANTLR start "rule__Shape__RepresentsAssignment_8"
    // InternalCanvas.g:4448:1: rule__Shape__RepresentsAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Shape__RepresentsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4452:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4453:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4453:2: ( RULE_STRING )
            // InternalCanvas.g:4454:3: RULE_STRING
            {
             before(grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__RepresentsAssignment_8"


    // $ANTLR start "rule__Shape__BoundsAssignment_9"
    // InternalCanvas.g:4463:1: rule__Shape__BoundsAssignment_9 : ( ruleBounds ) ;
    public final void rule__Shape__BoundsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4467:1: ( ( ruleBounds ) )
            // InternalCanvas.g:4468:2: ( ruleBounds )
            {
            // InternalCanvas.g:4468:2: ( ruleBounds )
            // InternalCanvas.g:4469:3: ruleBounds
            {
             before(grammarAccess.getShapeAccess().getBoundsBoundsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBounds();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getBoundsBoundsParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__BoundsAssignment_9"


    // $ANTLR start "rule__Shape__TextAssignment_10"
    // InternalCanvas.g:4478:1: rule__Shape__TextAssignment_10 : ( ruleFloatingText ) ;
    public final void rule__Shape__TextAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4482:1: ( ( ruleFloatingText ) )
            // InternalCanvas.g:4483:2: ( ruleFloatingText )
            {
            // InternalCanvas.g:4483:2: ( ruleFloatingText )
            // InternalCanvas.g:4484:3: ruleFloatingText
            {
             before(grammarAccess.getShapeAccess().getTextFloatingTextParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatingText();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getTextFloatingTextParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__TextAssignment_10"


    // $ANTLR start "rule__FloatingTexts__TextsAssignment_3"
    // InternalCanvas.g:4493:1: rule__FloatingTexts__TextsAssignment_3 : ( ruleFloatingText ) ;
    public final void rule__FloatingTexts__TextsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4497:1: ( ( ruleFloatingText ) )
            // InternalCanvas.g:4498:2: ( ruleFloatingText )
            {
            // InternalCanvas.g:4498:2: ( ruleFloatingText )
            // InternalCanvas.g:4499:3: ruleFloatingText
            {
             before(grammarAccess.getFloatingTextsAccess().getTextsFloatingTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatingText();

            state._fsp--;

             after(grammarAccess.getFloatingTextsAccess().getTextsFloatingTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__TextsAssignment_3"


    // $ANTLR start "rule__FloatingText__BoundsAssignment_3"
    // InternalCanvas.g:4508:1: rule__FloatingText__BoundsAssignment_3 : ( ruleBounds ) ;
    public final void rule__FloatingText__BoundsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4512:1: ( ( ruleBounds ) )
            // InternalCanvas.g:4513:2: ( ruleBounds )
            {
            // InternalCanvas.g:4513:2: ( ruleBounds )
            // InternalCanvas.g:4514:3: ruleBounds
            {
             before(grammarAccess.getFloatingTextAccess().getBoundsBoundsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBounds();

            state._fsp--;

             after(grammarAccess.getFloatingTextAccess().getBoundsBoundsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__BoundsAssignment_3"


    // $ANTLR start "rule__FloatingText__EndAssignment_4"
    // InternalCanvas.g:4523:1: rule__FloatingText__EndAssignment_4 : ( ruleEnumEnd ) ;
    public final void rule__FloatingText__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4527:1: ( ( ruleEnumEnd ) )
            // InternalCanvas.g:4528:2: ( ruleEnumEnd )
            {
            // InternalCanvas.g:4528:2: ( ruleEnumEnd )
            // InternalCanvas.g:4529:3: ruleEnumEnd
            {
             before(grammarAccess.getFloatingTextAccess().getEndEnumEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumEnd();

            state._fsp--;

             after(grammarAccess.getFloatingTextAccess().getEndEnumEndParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__EndAssignment_4"


    // $ANTLR start "rule__EnumEnd__WhereAssignment_2"
    // InternalCanvas.g:4538:1: rule__EnumEnd__WhereAssignment_2 : ( ( rule__EnumEnd__WhereAlternatives_2_0 ) ) ;
    public final void rule__EnumEnd__WhereAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4542:1: ( ( ( rule__EnumEnd__WhereAlternatives_2_0 ) ) )
            // InternalCanvas.g:4543:2: ( ( rule__EnumEnd__WhereAlternatives_2_0 ) )
            {
            // InternalCanvas.g:4543:2: ( ( rule__EnumEnd__WhereAlternatives_2_0 ) )
            // InternalCanvas.g:4544:3: ( rule__EnumEnd__WhereAlternatives_2_0 )
            {
             before(grammarAccess.getEnumEndAccess().getWhereAlternatives_2_0()); 
            // InternalCanvas.g:4545:3: ( rule__EnumEnd__WhereAlternatives_2_0 )
            // InternalCanvas.g:4545:4: rule__EnumEnd__WhereAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__WhereAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumEndAccess().getWhereAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__WhereAssignment_2"


    // $ANTLR start "rule__Connectors__ConnectorsAssignment_3"
    // InternalCanvas.g:4553:1: rule__Connectors__ConnectorsAssignment_3 : ( ruleConnector ) ;
    public final void rule__Connectors__ConnectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4557:1: ( ( ruleConnector ) )
            // InternalCanvas.g:4558:2: ( ruleConnector )
            {
            // InternalCanvas.g:4558:2: ( ruleConnector )
            // InternalCanvas.g:4559:3: ruleConnector
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsConnectorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorsAccess().getConnectorsConnectorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__ConnectorsAssignment_3"


    // $ANTLR start "rule__Connector__NameAssignment_2"
    // InternalCanvas.g:4568:1: rule__Connector__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4572:1: ( ( RULE_ID ) )
            // InternalCanvas.g:4573:2: ( RULE_ID )
            {
            // InternalCanvas.g:4573:2: ( RULE_ID )
            // InternalCanvas.g:4574:3: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__NameAssignment_2"


    // $ANTLR start "rule__Connector__TypeAssignment_5"
    // InternalCanvas.g:4583:1: rule__Connector__TypeAssignment_5 : ( ruleTypeLabel ) ;
    public final void rule__Connector__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4587:1: ( ( ruleTypeLabel ) )
            // InternalCanvas.g:4588:2: ( ruleTypeLabel )
            {
            // InternalCanvas.g:4588:2: ( ruleTypeLabel )
            // InternalCanvas.g:4589:3: ruleTypeLabel
            {
             before(grammarAccess.getConnectorAccess().getTypeTypeLabelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeLabel();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getTypeTypeLabelParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__TypeAssignment_5"


    // $ANTLR start "rule__Connector__RepresentsAssignment_6"
    // InternalCanvas.g:4598:1: rule__Connector__RepresentsAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Connector__RepresentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4602:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4603:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4603:2: ( RULE_STRING )
            // InternalCanvas.g:4604:3: RULE_STRING
            {
             before(grammarAccess.getConnectorAccess().getRepresentsSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRepresentsSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__RepresentsAssignment_6"


    // $ANTLR start "rule__Connector__PolylineAssignment_7"
    // InternalCanvas.g:4613:1: rule__Connector__PolylineAssignment_7 : ( rulePolyline ) ;
    public final void rule__Connector__PolylineAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4617:1: ( ( rulePolyline ) )
            // InternalCanvas.g:4618:2: ( rulePolyline )
            {
            // InternalCanvas.g:4618:2: ( rulePolyline )
            // InternalCanvas.g:4619:3: rulePolyline
            {
             before(grammarAccess.getConnectorAccess().getPolylinePolylineParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePolyline();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getPolylinePolylineParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__PolylineAssignment_7"


    // $ANTLR start "rule__Connector__AnchorsAssignment_8"
    // InternalCanvas.g:4628:1: rule__Connector__AnchorsAssignment_8 : ( ruleAnchors ) ;
    public final void rule__Connector__AnchorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4632:1: ( ( ruleAnchors ) )
            // InternalCanvas.g:4633:2: ( ruleAnchors )
            {
            // InternalCanvas.g:4633:2: ( ruleAnchors )
            // InternalCanvas.g:4634:3: ruleAnchors
            {
             before(grammarAccess.getConnectorAccess().getAnchorsAnchorsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAnchors();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getAnchorsAnchorsParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__AnchorsAssignment_8"


    // $ANTLR start "rule__Connector__TextsAssignment_9"
    // InternalCanvas.g:4643:1: rule__Connector__TextsAssignment_9 : ( ruleFloatingTexts ) ;
    public final void rule__Connector__TextsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4647:1: ( ( ruleFloatingTexts ) )
            // InternalCanvas.g:4648:2: ( ruleFloatingTexts )
            {
            // InternalCanvas.g:4648:2: ( ruleFloatingTexts )
            // InternalCanvas.g:4649:3: ruleFloatingTexts
            {
             before(grammarAccess.getConnectorAccess().getTextsFloatingTextsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatingTexts();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getTextsFloatingTextsParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__TextsAssignment_9"


    // $ANTLR start "rule__Anchors__StartAnchorAssignment_2"
    // InternalCanvas.g:4658:1: rule__Anchors__StartAnchorAssignment_2 : ( ruleStartAnchor ) ;
    public final void rule__Anchors__StartAnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4662:1: ( ( ruleStartAnchor ) )
            // InternalCanvas.g:4663:2: ( ruleStartAnchor )
            {
            // InternalCanvas.g:4663:2: ( ruleStartAnchor )
            // InternalCanvas.g:4664:3: ruleStartAnchor
            {
             before(grammarAccess.getAnchorsAccess().getStartAnchorStartAnchorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStartAnchor();

            state._fsp--;

             after(grammarAccess.getAnchorsAccess().getStartAnchorStartAnchorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__StartAnchorAssignment_2"


    // $ANTLR start "rule__Anchors__EndAnchorAssignment_3"
    // InternalCanvas.g:4673:1: rule__Anchors__EndAnchorAssignment_3 : ( ruleEndAnchor ) ;
    public final void rule__Anchors__EndAnchorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4677:1: ( ( ruleEndAnchor ) )
            // InternalCanvas.g:4678:2: ( ruleEndAnchor )
            {
            // InternalCanvas.g:4678:2: ( ruleEndAnchor )
            // InternalCanvas.g:4679:3: ruleEndAnchor
            {
             before(grammarAccess.getAnchorsAccess().getEndAnchorEndAnchorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEndAnchor();

            state._fsp--;

             after(grammarAccess.getAnchorsAccess().getEndAnchorEndAnchorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__EndAnchorAssignment_3"


    // $ANTLR start "rule__StartAnchor__PointAssignment_2"
    // InternalCanvas.g:4688:1: rule__StartAnchor__PointAssignment_2 : ( rulePointDefinition ) ;
    public final void rule__StartAnchor__PointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4692:1: ( ( rulePointDefinition ) )
            // InternalCanvas.g:4693:2: ( rulePointDefinition )
            {
            // InternalCanvas.g:4693:2: ( rulePointDefinition )
            // InternalCanvas.g:4694:3: rulePointDefinition
            {
             before(grammarAccess.getStartAnchorAccess().getPointPointDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePointDefinition();

            state._fsp--;

             after(grammarAccess.getStartAnchorAccess().getPointPointDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__PointAssignment_2"


    // $ANTLR start "rule__StartAnchor__AnchorAssignment_3"
    // InternalCanvas.g:4703:1: rule__StartAnchor__AnchorAssignment_3 : ( ruleAnchor ) ;
    public final void rule__StartAnchor__AnchorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4707:1: ( ( ruleAnchor ) )
            // InternalCanvas.g:4708:2: ( ruleAnchor )
            {
            // InternalCanvas.g:4708:2: ( ruleAnchor )
            // InternalCanvas.g:4709:3: ruleAnchor
            {
             before(grammarAccess.getStartAnchorAccess().getAnchorAnchorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAnchor();

            state._fsp--;

             after(grammarAccess.getStartAnchorAccess().getAnchorAnchorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__AnchorAssignment_3"


    // $ANTLR start "rule__EndAnchor__PointAssignment_2"
    // InternalCanvas.g:4718:1: rule__EndAnchor__PointAssignment_2 : ( rulePointDefinition ) ;
    public final void rule__EndAnchor__PointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4722:1: ( ( rulePointDefinition ) )
            // InternalCanvas.g:4723:2: ( rulePointDefinition )
            {
            // InternalCanvas.g:4723:2: ( rulePointDefinition )
            // InternalCanvas.g:4724:3: rulePointDefinition
            {
             before(grammarAccess.getEndAnchorAccess().getPointPointDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePointDefinition();

            state._fsp--;

             after(grammarAccess.getEndAnchorAccess().getPointPointDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__PointAssignment_2"


    // $ANTLR start "rule__EndAnchor__AnchorAssignment_3"
    // InternalCanvas.g:4733:1: rule__EndAnchor__AnchorAssignment_3 : ( ruleAnchor ) ;
    public final void rule__EndAnchor__AnchorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4737:1: ( ( ruleAnchor ) )
            // InternalCanvas.g:4738:2: ( ruleAnchor )
            {
            // InternalCanvas.g:4738:2: ( ruleAnchor )
            // InternalCanvas.g:4739:3: ruleAnchor
            {
             before(grammarAccess.getEndAnchorAccess().getAnchorAnchorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAnchor();

            state._fsp--;

             after(grammarAccess.getEndAnchorAccess().getAnchorAnchorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__AnchorAssignment_3"


    // $ANTLR start "rule__ShapeAnchorElement__ElementAssignment_2"
    // InternalCanvas.g:4748:1: rule__ShapeAnchorElement__ElementAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ShapeAnchorElement__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4752:1: ( ( ( RULE_ID ) ) )
            // InternalCanvas.g:4753:2: ( ( RULE_ID ) )
            {
            // InternalCanvas.g:4753:2: ( ( RULE_ID ) )
            // InternalCanvas.g:4754:3: ( RULE_ID )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementShapeCrossReference_2_0()); 
            // InternalCanvas.g:4755:3: ( RULE_ID )
            // InternalCanvas.g:4756:4: RULE_ID
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementShapeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShapeAnchorElementAccess().getElementShapeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getShapeAnchorElementAccess().getElementShapeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__ElementAssignment_2"


    // $ANTLR start "rule__ConnectorAnchorElement__ElementAssignment_2"
    // InternalCanvas.g:4767:1: rule__ConnectorAnchorElement__ElementAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectorAnchorElement__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4771:1: ( ( ( RULE_ID ) ) )
            // InternalCanvas.g:4772:2: ( ( RULE_ID ) )
            {
            // InternalCanvas.g:4772:2: ( ( RULE_ID ) )
            // InternalCanvas.g:4773:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorCrossReference_2_0()); 
            // InternalCanvas.g:4774:3: ( RULE_ID )
            // InternalCanvas.g:4775:4: RULE_ID
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__ElementAssignment_2"


    // $ANTLR start "rule__Polyline__SegmentsAssignment_3"
    // InternalCanvas.g:4786:1: rule__Polyline__SegmentsAssignment_3 : ( ruleSegment ) ;
    public final void rule__Polyline__SegmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4790:1: ( ( ruleSegment ) )
            // InternalCanvas.g:4791:2: ( ruleSegment )
            {
            // InternalCanvas.g:4791:2: ( ruleSegment )
            // InternalCanvas.g:4792:3: ruleSegment
            {
             before(grammarAccess.getPolylineAccess().getSegmentsSegmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getPolylineAccess().getSegmentsSegmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__SegmentsAssignment_3"


    // $ANTLR start "rule__Segment__StartPointAssignment_4"
    // InternalCanvas.g:4801:1: rule__Segment__StartPointAssignment_4 : ( rulePoint ) ;
    public final void rule__Segment__StartPointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4805:1: ( ( rulePoint ) )
            // InternalCanvas.g:4806:2: ( rulePoint )
            {
            // InternalCanvas.g:4806:2: ( rulePoint )
            // InternalCanvas.g:4807:3: rulePoint
            {
             before(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__StartPointAssignment_4"


    // $ANTLR start "rule__Segment__EndPointAssignment_7"
    // InternalCanvas.g:4816:1: rule__Segment__EndPointAssignment_7 : ( rulePoint ) ;
    public final void rule__Segment__EndPointAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4820:1: ( ( rulePoint ) )
            // InternalCanvas.g:4821:2: ( rulePoint )
            {
            // InternalCanvas.g:4821:2: ( rulePoint )
            // InternalCanvas.g:4822:3: rulePoint
            {
             before(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__EndPointAssignment_7"


    // $ANTLR start "rule__Point__XAssignment_2"
    // InternalCanvas.g:4831:1: rule__Point__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4835:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4836:2: ( RULE_INT )
            {
            // InternalCanvas.g:4836:2: ( RULE_INT )
            // InternalCanvas.g:4837:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getXINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getXINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__XAssignment_2"


    // $ANTLR start "rule__Point__YAssignment_5"
    // InternalCanvas.g:4846:1: rule__Point__YAssignment_5 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4850:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4851:2: ( RULE_INT )
            {
            // InternalCanvas.g:4851:2: ( RULE_INT )
            // InternalCanvas.g:4852:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getYINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getYINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__YAssignment_5"


    // $ANTLR start "rule__PointDefinition__XAssignment_4"
    // InternalCanvas.g:4861:1: rule__PointDefinition__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__PointDefinition__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4865:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4866:2: ( RULE_INT )
            {
            // InternalCanvas.g:4866:2: ( RULE_INT )
            // InternalCanvas.g:4867:3: RULE_INT
            {
             before(grammarAccess.getPointDefinitionAccess().getXINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getXINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__XAssignment_4"


    // $ANTLR start "rule__PointDefinition__YAssignment_7"
    // InternalCanvas.g:4876:1: rule__PointDefinition__YAssignment_7 : ( RULE_INT ) ;
    public final void rule__PointDefinition__YAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4880:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4881:2: ( RULE_INT )
            {
            // InternalCanvas.g:4881:2: ( RULE_INT )
            // InternalCanvas.g:4882:3: RULE_INT
            {
             before(grammarAccess.getPointDefinitionAccess().getYINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getYINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__YAssignment_7"


    // $ANTLR start "rule__Bounds__XAssignment_4"
    // InternalCanvas.g:4891:1: rule__Bounds__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Bounds__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4895:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4896:2: ( RULE_INT )
            {
            // InternalCanvas.g:4896:2: ( RULE_INT )
            // InternalCanvas.g:4897:3: RULE_INT
            {
             before(grammarAccess.getBoundsAccess().getXINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getXINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__XAssignment_4"


    // $ANTLR start "rule__Bounds__YAssignment_7"
    // InternalCanvas.g:4906:1: rule__Bounds__YAssignment_7 : ( RULE_INT ) ;
    public final void rule__Bounds__YAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4910:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4911:2: ( RULE_INT )
            {
            // InternalCanvas.g:4911:2: ( RULE_INT )
            // InternalCanvas.g:4912:3: RULE_INT
            {
             before(grammarAccess.getBoundsAccess().getYINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getYINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__YAssignment_7"


    // $ANTLR start "rule__Bounds__WAssignment_10"
    // InternalCanvas.g:4921:1: rule__Bounds__WAssignment_10 : ( RULE_INT ) ;
    public final void rule__Bounds__WAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4925:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4926:2: ( RULE_INT )
            {
            // InternalCanvas.g:4926:2: ( RULE_INT )
            // InternalCanvas.g:4927:3: RULE_INT
            {
             before(grammarAccess.getBoundsAccess().getWINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getWINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__WAssignment_10"


    // $ANTLR start "rule__Bounds__HAssignment_13"
    // InternalCanvas.g:4936:1: rule__Bounds__HAssignment_13 : ( RULE_INT ) ;
    public final void rule__Bounds__HAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4940:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4941:2: ( RULE_INT )
            {
            // InternalCanvas.g:4941:2: ( RULE_INT )
            // InternalCanvas.g:4942:3: RULE_INT
            {
             before(grammarAccess.getBoundsAccess().getHINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBoundsAccess().getHINTTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bounds__HAssignment_13"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000022400000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000022000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L,0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xFFFFFFFFFFF20000L,0x00000000FFFFFFFFL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000022000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000044000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});

}