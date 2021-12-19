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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'container'", "'render:'", "'properties:'", "'viewport:'", "'zoom:'", "'shapes:'", "'shape:'", "'texts:'", "'text:'", "'where:'", "'start'", "'end'", "'middle'", "'end_fixed'", "'start_fixed'", "'none'", "'floating'", "'additional'", "'connectors:'", "'connector:'", "'anchors:'", "'start:'", "'end:'", "'polyline:'", "'segment:'", "'point:'", "'rectangle:'", "'render'", "':'", "'properties'", "'viewport'", "'zoom'", "'shapes'", "'shape'", "'texts'", "'text'", "'where'", "'connectors'", "'connector'", "'anchors'", "'polyline'", "'segment'", "'x'", "'y'", "'point'", "'width'", "'height'", "'rectangle'"
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


    // $ANTLR start "entryRuleRectangle"
    // InternalCanvas.g:603:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalCanvas.g:604:1: ( ruleRectangle EOF )
            // InternalCanvas.g:605:1: ruleRectangle EOF
            {
             before(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_1);
            ruleRectangle();

            state._fsp--;

             after(grammarAccess.getRectangleRule()); 
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
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // InternalCanvas.g:612:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:616:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalCanvas.g:617:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalCanvas.g:617:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalCanvas.g:618:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalCanvas.g:619:3: ( rule__Rectangle__Group__0 )
            // InternalCanvas.g:619:4: rule__Rectangle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "rule__ModelRender__Alternatives_0"
    // InternalCanvas.g:627:1: rule__ModelRender__Alternatives_0 : ( ( ( rule__ModelRender__Group_0_0__0 ) ) | ( 'render:' ) );
    public final void rule__ModelRender__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:631:1: ( ( ( rule__ModelRender__Group_0_0__0 ) ) | ( 'render:' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==38) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCanvas.g:632:2: ( ( rule__ModelRender__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:632:2: ( ( rule__ModelRender__Group_0_0__0 ) )
                    // InternalCanvas.g:633:3: ( rule__ModelRender__Group_0_0__0 )
                    {
                     before(grammarAccess.getModelRenderAccess().getGroup_0_0()); 
                    // InternalCanvas.g:634:3: ( rule__ModelRender__Group_0_0__0 )
                    // InternalCanvas.g:634:4: rule__ModelRender__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelRender__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelRenderAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:638:2: ( 'render:' )
                    {
                    // InternalCanvas.g:638:2: ( 'render:' )
                    // InternalCanvas.g:639:3: 'render:'
                    {
                     before(grammarAccess.getModelRenderAccess().getRenderKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getModelRenderAccess().getRenderKeyword_0_1()); 

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
    // $ANTLR end "rule__ModelRender__Alternatives_0"


    // $ANTLR start "rule__ModelProperties__Alternatives_0"
    // InternalCanvas.g:648:1: rule__ModelProperties__Alternatives_0 : ( ( ( rule__ModelProperties__Group_0_0__0 ) ) | ( 'properties:' ) );
    public final void rule__ModelProperties__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:652:1: ( ( ( rule__ModelProperties__Group_0_0__0 ) ) | ( 'properties:' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
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
                    // InternalCanvas.g:653:2: ( ( rule__ModelProperties__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:653:2: ( ( rule__ModelProperties__Group_0_0__0 ) )
                    // InternalCanvas.g:654:3: ( rule__ModelProperties__Group_0_0__0 )
                    {
                     before(grammarAccess.getModelPropertiesAccess().getGroup_0_0()); 
                    // InternalCanvas.g:655:3: ( rule__ModelProperties__Group_0_0__0 )
                    // InternalCanvas.g:655:4: rule__ModelProperties__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelProperties__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelPropertiesAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:659:2: ( 'properties:' )
                    {
                    // InternalCanvas.g:659:2: ( 'properties:' )
                    // InternalCanvas.g:660:3: 'properties:'
                    {
                     before(grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_1()); 

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
    // $ANTLR end "rule__ModelProperties__Alternatives_0"


    // $ANTLR start "rule__ModelProperties__Alternatives_1"
    // InternalCanvas.g:669:1: rule__ModelProperties__Alternatives_1 : ( ( ( rule__ModelProperties__Group_1_0__0 ) ) | ( 'viewport:' ) );
    public final void rule__ModelProperties__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:673:1: ( ( ( rule__ModelProperties__Group_1_0__0 ) ) | ( 'viewport:' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCanvas.g:674:2: ( ( rule__ModelProperties__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:674:2: ( ( rule__ModelProperties__Group_1_0__0 ) )
                    // InternalCanvas.g:675:3: ( rule__ModelProperties__Group_1_0__0 )
                    {
                     before(grammarAccess.getModelPropertiesAccess().getGroup_1_0()); 
                    // InternalCanvas.g:676:3: ( rule__ModelProperties__Group_1_0__0 )
                    // InternalCanvas.g:676:4: rule__ModelProperties__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelProperties__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelPropertiesAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:680:2: ( 'viewport:' )
                    {
                    // InternalCanvas.g:680:2: ( 'viewport:' )
                    // InternalCanvas.g:681:3: 'viewport:'
                    {
                     before(grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_1()); 

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
    // $ANTLR end "rule__ModelProperties__Alternatives_1"


    // $ANTLR start "rule__ModelProperties__Alternatives_3"
    // InternalCanvas.g:690:1: rule__ModelProperties__Alternatives_3 : ( ( ( rule__ModelProperties__Group_3_0__0 ) ) | ( 'zoom:' ) );
    public final void rule__ModelProperties__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:694:1: ( ( ( rule__ModelProperties__Group_3_0__0 ) ) | ( 'zoom:' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==42) ) {
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
                    // InternalCanvas.g:695:2: ( ( rule__ModelProperties__Group_3_0__0 ) )
                    {
                    // InternalCanvas.g:695:2: ( ( rule__ModelProperties__Group_3_0__0 ) )
                    // InternalCanvas.g:696:3: ( rule__ModelProperties__Group_3_0__0 )
                    {
                     before(grammarAccess.getModelPropertiesAccess().getGroup_3_0()); 
                    // InternalCanvas.g:697:3: ( rule__ModelProperties__Group_3_0__0 )
                    // InternalCanvas.g:697:4: rule__ModelProperties__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelProperties__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelPropertiesAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:701:2: ( 'zoom:' )
                    {
                    // InternalCanvas.g:701:2: ( 'zoom:' )
                    // InternalCanvas.g:702:3: 'zoom:'
                    {
                     before(grammarAccess.getModelPropertiesAccess().getZoomKeyword_3_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getModelPropertiesAccess().getZoomKeyword_3_1()); 

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
    // $ANTLR end "rule__ModelProperties__Alternatives_3"


    // $ANTLR start "rule__GraphicalElement__Alternatives"
    // InternalCanvas.g:711:1: rule__GraphicalElement__Alternatives : ( ( ruleShapes ) | ( ruleConnectors ) );
    public final void rule__GraphicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:715:1: ( ( ruleShapes ) | ( ruleConnectors ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16||LA5_0==43) ) {
                alt5=1;
            }
            else if ( (LA5_0==29||LA5_0==48) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCanvas.g:716:2: ( ruleShapes )
                    {
                    // InternalCanvas.g:716:2: ( ruleShapes )
                    // InternalCanvas.g:717:3: ruleShapes
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
                    // InternalCanvas.g:722:2: ( ruleConnectors )
                    {
                    // InternalCanvas.g:722:2: ( ruleConnectors )
                    // InternalCanvas.g:723:3: ruleConnectors
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


    // $ANTLR start "rule__Shapes__Alternatives_1"
    // InternalCanvas.g:732:1: rule__Shapes__Alternatives_1 : ( ( ( rule__Shapes__Group_1_0__0 ) ) | ( 'shapes:' ) );
    public final void rule__Shapes__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:736:1: ( ( ( rule__Shapes__Group_1_0__0 ) ) | ( 'shapes:' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCanvas.g:737:2: ( ( rule__Shapes__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:737:2: ( ( rule__Shapes__Group_1_0__0 ) )
                    // InternalCanvas.g:738:3: ( rule__Shapes__Group_1_0__0 )
                    {
                     before(grammarAccess.getShapesAccess().getGroup_1_0()); 
                    // InternalCanvas.g:739:3: ( rule__Shapes__Group_1_0__0 )
                    // InternalCanvas.g:739:4: rule__Shapes__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shapes__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapesAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:743:2: ( 'shapes:' )
                    {
                    // InternalCanvas.g:743:2: ( 'shapes:' )
                    // InternalCanvas.g:744:3: 'shapes:'
                    {
                     before(grammarAccess.getShapesAccess().getShapesKeyword_1_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getShapesAccess().getShapesKeyword_1_1()); 

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
    // $ANTLR end "rule__Shapes__Alternatives_1"


    // $ANTLR start "rule__Shape__Alternatives_1"
    // InternalCanvas.g:753:1: rule__Shape__Alternatives_1 : ( ( ( rule__Shape__Group_1_0__0 ) ) | ( 'shape:' ) );
    public final void rule__Shape__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:757:1: ( ( ( rule__Shape__Group_1_0__0 ) ) | ( 'shape:' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCanvas.g:758:2: ( ( rule__Shape__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:758:2: ( ( rule__Shape__Group_1_0__0 ) )
                    // InternalCanvas.g:759:3: ( rule__Shape__Group_1_0__0 )
                    {
                     before(grammarAccess.getShapeAccess().getGroup_1_0()); 
                    // InternalCanvas.g:760:3: ( rule__Shape__Group_1_0__0 )
                    // InternalCanvas.g:760:4: rule__Shape__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:764:2: ( 'shape:' )
                    {
                    // InternalCanvas.g:764:2: ( 'shape:' )
                    // InternalCanvas.g:765:3: 'shape:'
                    {
                     before(grammarAccess.getShapeAccess().getShapeKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getShapeAccess().getShapeKeyword_1_1()); 

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
    // $ANTLR end "rule__Shape__Alternatives_1"


    // $ANTLR start "rule__Shape__Alternatives_4"
    // InternalCanvas.g:774:1: rule__Shape__Alternatives_4 : ( ( ( rule__Shape__Group_4_0__0 ) ) | ( 'render:' ) );
    public final void rule__Shape__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:778:1: ( ( ( rule__Shape__Group_4_0__0 ) ) | ( 'render:' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCanvas.g:779:2: ( ( rule__Shape__Group_4_0__0 ) )
                    {
                    // InternalCanvas.g:779:2: ( ( rule__Shape__Group_4_0__0 ) )
                    // InternalCanvas.g:780:3: ( rule__Shape__Group_4_0__0 )
                    {
                     before(grammarAccess.getShapeAccess().getGroup_4_0()); 
                    // InternalCanvas.g:781:3: ( rule__Shape__Group_4_0__0 )
                    // InternalCanvas.g:781:4: rule__Shape__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:785:2: ( 'render:' )
                    {
                    // InternalCanvas.g:785:2: ( 'render:' )
                    // InternalCanvas.g:786:3: 'render:'
                    {
                     before(grammarAccess.getShapeAccess().getRenderKeyword_4_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getShapeAccess().getRenderKeyword_4_1()); 

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
    // $ANTLR end "rule__Shape__Alternatives_4"


    // $ANTLR start "rule__FloatingTexts__Alternatives_1"
    // InternalCanvas.g:795:1: rule__FloatingTexts__Alternatives_1 : ( ( ( rule__FloatingTexts__Group_1_0__0 ) ) | ( 'texts:' ) );
    public final void rule__FloatingTexts__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:799:1: ( ( ( rule__FloatingTexts__Group_1_0__0 ) ) | ( 'texts:' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==45) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCanvas.g:800:2: ( ( rule__FloatingTexts__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:800:2: ( ( rule__FloatingTexts__Group_1_0__0 ) )
                    // InternalCanvas.g:801:3: ( rule__FloatingTexts__Group_1_0__0 )
                    {
                     before(grammarAccess.getFloatingTextsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:802:3: ( rule__FloatingTexts__Group_1_0__0 )
                    // InternalCanvas.g:802:4: rule__FloatingTexts__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatingTexts__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatingTextsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:806:2: ( 'texts:' )
                    {
                    // InternalCanvas.g:806:2: ( 'texts:' )
                    // InternalCanvas.g:807:3: 'texts:'
                    {
                     before(grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_1()); 

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
    // $ANTLR end "rule__FloatingTexts__Alternatives_1"


    // $ANTLR start "rule__FloatingText__Alternatives_1"
    // InternalCanvas.g:816:1: rule__FloatingText__Alternatives_1 : ( ( ( rule__FloatingText__Group_1_0__0 ) ) | ( 'text:' ) );
    public final void rule__FloatingText__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:820:1: ( ( ( rule__FloatingText__Group_1_0__0 ) ) | ( 'text:' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCanvas.g:821:2: ( ( rule__FloatingText__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:821:2: ( ( rule__FloatingText__Group_1_0__0 ) )
                    // InternalCanvas.g:822:3: ( rule__FloatingText__Group_1_0__0 )
                    {
                     before(grammarAccess.getFloatingTextAccess().getGroup_1_0()); 
                    // InternalCanvas.g:823:3: ( rule__FloatingText__Group_1_0__0 )
                    // InternalCanvas.g:823:4: rule__FloatingText__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FloatingText__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatingTextAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:827:2: ( 'text:' )
                    {
                    // InternalCanvas.g:827:2: ( 'text:' )
                    // InternalCanvas.g:828:3: 'text:'
                    {
                     before(grammarAccess.getFloatingTextAccess().getTextKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFloatingTextAccess().getTextKeyword_1_1()); 

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
    // $ANTLR end "rule__FloatingText__Alternatives_1"


    // $ANTLR start "rule__EnumEnd__Alternatives_0"
    // InternalCanvas.g:837:1: rule__EnumEnd__Alternatives_0 : ( ( ( rule__EnumEnd__Group_0_0__0 ) ) | ( 'where:' ) );
    public final void rule__EnumEnd__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:841:1: ( ( ( rule__EnumEnd__Group_0_0__0 ) ) | ( 'where:' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==47) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCanvas.g:842:2: ( ( rule__EnumEnd__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:842:2: ( ( rule__EnumEnd__Group_0_0__0 ) )
                    // InternalCanvas.g:843:3: ( rule__EnumEnd__Group_0_0__0 )
                    {
                     before(grammarAccess.getEnumEndAccess().getGroup_0_0()); 
                    // InternalCanvas.g:844:3: ( rule__EnumEnd__Group_0_0__0 )
                    // InternalCanvas.g:844:4: rule__EnumEnd__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumEnd__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumEndAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:848:2: ( 'where:' )
                    {
                    // InternalCanvas.g:848:2: ( 'where:' )
                    // InternalCanvas.g:849:3: 'where:'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereKeyword_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereKeyword_0_1()); 

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
    // $ANTLR end "rule__EnumEnd__Alternatives_0"


    // $ANTLR start "rule__EnumEnd__WhereAlternatives_1_0"
    // InternalCanvas.g:858:1: rule__EnumEnd__WhereAlternatives_1_0 : ( ( 'start' ) | ( 'end' ) | ( 'middle' ) | ( 'end_fixed' ) | ( 'start_fixed' ) | ( 'none' ) | ( 'floating' ) | ( 'additional' ) );
    public final void rule__EnumEnd__WhereAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:862:1: ( ( 'start' ) | ( 'end' ) | ( 'middle' ) | ( 'end_fixed' ) | ( 'start_fixed' ) | ( 'none' ) | ( 'floating' ) | ( 'additional' ) )
            int alt12=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt12=1;
                }
                break;
            case 22:
                {
                alt12=2;
                }
                break;
            case 23:
                {
                alt12=3;
                }
                break;
            case 24:
                {
                alt12=4;
                }
                break;
            case 25:
                {
                alt12=5;
                }
                break;
            case 26:
                {
                alt12=6;
                }
                break;
            case 27:
                {
                alt12=7;
                }
                break;
            case 28:
                {
                alt12=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCanvas.g:863:2: ( 'start' )
                    {
                    // InternalCanvas.g:863:2: ( 'start' )
                    // InternalCanvas.g:864:3: 'start'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereStartKeyword_1_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereStartKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:869:2: ( 'end' )
                    {
                    // InternalCanvas.g:869:2: ( 'end' )
                    // InternalCanvas.g:870:3: 'end'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereEndKeyword_1_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereEndKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCanvas.g:875:2: ( 'middle' )
                    {
                    // InternalCanvas.g:875:2: ( 'middle' )
                    // InternalCanvas.g:876:3: 'middle'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereMiddleKeyword_1_0_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereMiddleKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCanvas.g:881:2: ( 'end_fixed' )
                    {
                    // InternalCanvas.g:881:2: ( 'end_fixed' )
                    // InternalCanvas.g:882:3: 'end_fixed'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereEnd_fixedKeyword_1_0_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereEnd_fixedKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCanvas.g:887:2: ( 'start_fixed' )
                    {
                    // InternalCanvas.g:887:2: ( 'start_fixed' )
                    // InternalCanvas.g:888:3: 'start_fixed'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereStart_fixedKeyword_1_0_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereStart_fixedKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCanvas.g:893:2: ( 'none' )
                    {
                    // InternalCanvas.g:893:2: ( 'none' )
                    // InternalCanvas.g:894:3: 'none'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereNoneKeyword_1_0_5()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereNoneKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCanvas.g:899:2: ( 'floating' )
                    {
                    // InternalCanvas.g:899:2: ( 'floating' )
                    // InternalCanvas.g:900:3: 'floating'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereFloatingKeyword_1_0_6()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereFloatingKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCanvas.g:905:2: ( 'additional' )
                    {
                    // InternalCanvas.g:905:2: ( 'additional' )
                    // InternalCanvas.g:906:3: 'additional'
                    {
                     before(grammarAccess.getEnumEndAccess().getWhereAdditionalKeyword_1_0_7()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getWhereAdditionalKeyword_1_0_7()); 

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
    // $ANTLR end "rule__EnumEnd__WhereAlternatives_1_0"


    // $ANTLR start "rule__Connectors__Alternatives_1"
    // InternalCanvas.g:915:1: rule__Connectors__Alternatives_1 : ( ( ( rule__Connectors__Group_1_0__0 ) ) | ( 'connectors:' ) );
    public final void rule__Connectors__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:919:1: ( ( ( rule__Connectors__Group_1_0__0 ) ) | ( 'connectors:' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCanvas.g:920:2: ( ( rule__Connectors__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:920:2: ( ( rule__Connectors__Group_1_0__0 ) )
                    // InternalCanvas.g:921:3: ( rule__Connectors__Group_1_0__0 )
                    {
                     before(grammarAccess.getConnectorsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:922:3: ( rule__Connectors__Group_1_0__0 )
                    // InternalCanvas.g:922:4: rule__Connectors__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connectors__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectorsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:926:2: ( 'connectors:' )
                    {
                    // InternalCanvas.g:926:2: ( 'connectors:' )
                    // InternalCanvas.g:927:3: 'connectors:'
                    {
                     before(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_1()); 

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
    // $ANTLR end "rule__Connectors__Alternatives_1"


    // $ANTLR start "rule__Connector__Alternatives_0"
    // InternalCanvas.g:936:1: rule__Connector__Alternatives_0 : ( ( ( rule__Connector__Group_0_0__0 ) ) | ( 'connector:' ) );
    public final void rule__Connector__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:940:1: ( ( ( rule__Connector__Group_0_0__0 ) ) | ( 'connector:' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCanvas.g:941:2: ( ( rule__Connector__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:941:2: ( ( rule__Connector__Group_0_0__0 ) )
                    // InternalCanvas.g:942:3: ( rule__Connector__Group_0_0__0 )
                    {
                     before(grammarAccess.getConnectorAccess().getGroup_0_0()); 
                    // InternalCanvas.g:943:3: ( rule__Connector__Group_0_0__0 )
                    // InternalCanvas.g:943:4: rule__Connector__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectorAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:947:2: ( 'connector:' )
                    {
                    // InternalCanvas.g:947:2: ( 'connector:' )
                    // InternalCanvas.g:948:3: 'connector:'
                    {
                     before(grammarAccess.getConnectorAccess().getConnectorKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getConnectorKeyword_0_1()); 

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
    // $ANTLR end "rule__Connector__Alternatives_0"


    // $ANTLR start "rule__Connector__Alternatives_2"
    // InternalCanvas.g:957:1: rule__Connector__Alternatives_2 : ( ( ( rule__Connector__Group_2_0__0 ) ) | ( 'render:' ) );
    public final void rule__Connector__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:961:1: ( ( ( rule__Connector__Group_2_0__0 ) ) | ( 'render:' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            else if ( (LA15_0==12) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCanvas.g:962:2: ( ( rule__Connector__Group_2_0__0 ) )
                    {
                    // InternalCanvas.g:962:2: ( ( rule__Connector__Group_2_0__0 ) )
                    // InternalCanvas.g:963:3: ( rule__Connector__Group_2_0__0 )
                    {
                     before(grammarAccess.getConnectorAccess().getGroup_2_0()); 
                    // InternalCanvas.g:964:3: ( rule__Connector__Group_2_0__0 )
                    // InternalCanvas.g:964:4: rule__Connector__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectorAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:968:2: ( 'render:' )
                    {
                    // InternalCanvas.g:968:2: ( 'render:' )
                    // InternalCanvas.g:969:3: 'render:'
                    {
                     before(grammarAccess.getConnectorAccess().getRenderKeyword_2_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getRenderKeyword_2_1()); 

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
    // $ANTLR end "rule__Connector__Alternatives_2"


    // $ANTLR start "rule__Anchors__Alternatives_0"
    // InternalCanvas.g:978:1: rule__Anchors__Alternatives_0 : ( ( ( rule__Anchors__Group_0_0__0 ) ) | ( 'anchors:' ) );
    public final void rule__Anchors__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:982:1: ( ( ( rule__Anchors__Group_0_0__0 ) ) | ( 'anchors:' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==50) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCanvas.g:983:2: ( ( rule__Anchors__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:983:2: ( ( rule__Anchors__Group_0_0__0 ) )
                    // InternalCanvas.g:984:3: ( rule__Anchors__Group_0_0__0 )
                    {
                     before(grammarAccess.getAnchorsAccess().getGroup_0_0()); 
                    // InternalCanvas.g:985:3: ( rule__Anchors__Group_0_0__0 )
                    // InternalCanvas.g:985:4: rule__Anchors__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Anchors__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnchorsAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:989:2: ( 'anchors:' )
                    {
                    // InternalCanvas.g:989:2: ( 'anchors:' )
                    // InternalCanvas.g:990:3: 'anchors:'
                    {
                     before(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_1()); 

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
    // $ANTLR end "rule__Anchors__Alternatives_0"


    // $ANTLR start "rule__StartAnchor__Alternatives_0"
    // InternalCanvas.g:999:1: rule__StartAnchor__Alternatives_0 : ( ( ( rule__StartAnchor__Group_0_0__0 ) ) | ( 'start:' ) );
    public final void rule__StartAnchor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1003:1: ( ( ( rule__StartAnchor__Group_0_0__0 ) ) | ( 'start:' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCanvas.g:1004:2: ( ( rule__StartAnchor__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1004:2: ( ( rule__StartAnchor__Group_0_0__0 ) )
                    // InternalCanvas.g:1005:3: ( rule__StartAnchor__Group_0_0__0 )
                    {
                     before(grammarAccess.getStartAnchorAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1006:3: ( rule__StartAnchor__Group_0_0__0 )
                    // InternalCanvas.g:1006:4: rule__StartAnchor__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StartAnchor__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStartAnchorAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1010:2: ( 'start:' )
                    {
                    // InternalCanvas.g:1010:2: ( 'start:' )
                    // InternalCanvas.g:1011:3: 'start:'
                    {
                     before(grammarAccess.getStartAnchorAccess().getStartKeyword_0_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getStartAnchorAccess().getStartKeyword_0_1()); 

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
    // $ANTLR end "rule__StartAnchor__Alternatives_0"


    // $ANTLR start "rule__EndAnchor__Alternatives_0"
    // InternalCanvas.g:1020:1: rule__EndAnchor__Alternatives_0 : ( ( ( rule__EndAnchor__Group_0_0__0 ) ) | ( 'end:' ) );
    public final void rule__EndAnchor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1024:1: ( ( ( rule__EndAnchor__Group_0_0__0 ) ) | ( 'end:' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCanvas.g:1025:2: ( ( rule__EndAnchor__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1025:2: ( ( rule__EndAnchor__Group_0_0__0 ) )
                    // InternalCanvas.g:1026:3: ( rule__EndAnchor__Group_0_0__0 )
                    {
                     before(grammarAccess.getEndAnchorAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1027:3: ( rule__EndAnchor__Group_0_0__0 )
                    // InternalCanvas.g:1027:4: rule__EndAnchor__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EndAnchor__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEndAnchorAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1031:2: ( 'end:' )
                    {
                    // InternalCanvas.g:1031:2: ( 'end:' )
                    // InternalCanvas.g:1032:3: 'end:'
                    {
                     before(grammarAccess.getEndAnchorAccess().getEndKeyword_0_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getEndAnchorAccess().getEndKeyword_0_1()); 

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
    // $ANTLR end "rule__EndAnchor__Alternatives_0"


    // $ANTLR start "rule__Anchor__Alternatives"
    // InternalCanvas.g:1041:1: rule__Anchor__Alternatives : ( ( ruleShapeAnchorElement ) | ( ruleConnectorAnchorElement ) );
    public final void rule__Anchor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1045:1: ( ( ruleShapeAnchorElement ) | ( ruleConnectorAnchorElement ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17||LA19_0==44) ) {
                alt19=1;
            }
            else if ( (LA19_0==30||LA19_0==49) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCanvas.g:1046:2: ( ruleShapeAnchorElement )
                    {
                    // InternalCanvas.g:1046:2: ( ruleShapeAnchorElement )
                    // InternalCanvas.g:1047:3: ruleShapeAnchorElement
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
                    // InternalCanvas.g:1052:2: ( ruleConnectorAnchorElement )
                    {
                    // InternalCanvas.g:1052:2: ( ruleConnectorAnchorElement )
                    // InternalCanvas.g:1053:3: ruleConnectorAnchorElement
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


    // $ANTLR start "rule__ShapeAnchorElement__Alternatives_0"
    // InternalCanvas.g:1062:1: rule__ShapeAnchorElement__Alternatives_0 : ( ( ( rule__ShapeAnchorElement__Group_0_0__0 ) ) | ( 'shape:' ) );
    public final void rule__ShapeAnchorElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1066:1: ( ( ( rule__ShapeAnchorElement__Group_0_0__0 ) ) | ( 'shape:' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            else if ( (LA20_0==17) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCanvas.g:1067:2: ( ( rule__ShapeAnchorElement__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1067:2: ( ( rule__ShapeAnchorElement__Group_0_0__0 ) )
                    // InternalCanvas.g:1068:3: ( rule__ShapeAnchorElement__Group_0_0__0 )
                    {
                     before(grammarAccess.getShapeAnchorElementAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1069:3: ( rule__ShapeAnchorElement__Group_0_0__0 )
                    // InternalCanvas.g:1069:4: rule__ShapeAnchorElement__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeAnchorElement__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeAnchorElementAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1073:2: ( 'shape:' )
                    {
                    // InternalCanvas.g:1073:2: ( 'shape:' )
                    // InternalCanvas.g:1074:3: 'shape:'
                    {
                     before(grammarAccess.getShapeAnchorElementAccess().getShapeKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getShapeAnchorElementAccess().getShapeKeyword_0_1()); 

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
    // $ANTLR end "rule__ShapeAnchorElement__Alternatives_0"


    // $ANTLR start "rule__ConnectorAnchorElement__Alternatives_0"
    // InternalCanvas.g:1083:1: rule__ConnectorAnchorElement__Alternatives_0 : ( ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) ) | ( 'connector:' ) );
    public final void rule__ConnectorAnchorElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1087:1: ( ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) ) | ( 'connector:' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            else if ( (LA21_0==30) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalCanvas.g:1088:2: ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1088:2: ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) )
                    // InternalCanvas.g:1089:3: ( rule__ConnectorAnchorElement__Group_0_0__0 )
                    {
                     before(grammarAccess.getConnectorAnchorElementAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1090:3: ( rule__ConnectorAnchorElement__Group_0_0__0 )
                    // InternalCanvas.g:1090:4: rule__ConnectorAnchorElement__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorAnchorElement__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectorAnchorElementAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1094:2: ( 'connector:' )
                    {
                    // InternalCanvas.g:1094:2: ( 'connector:' )
                    // InternalCanvas.g:1095:3: 'connector:'
                    {
                     before(grammarAccess.getConnectorAnchorElementAccess().getConnectorKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getConnectorAnchorElementAccess().getConnectorKeyword_0_1()); 

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
    // $ANTLR end "rule__ConnectorAnchorElement__Alternatives_0"


    // $ANTLR start "rule__Polyline__Alternatives_1"
    // InternalCanvas.g:1104:1: rule__Polyline__Alternatives_1 : ( ( ( rule__Polyline__Group_1_0__0 ) ) | ( 'polyline:' ) );
    public final void rule__Polyline__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1108:1: ( ( ( rule__Polyline__Group_1_0__0 ) ) | ( 'polyline:' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==51) ) {
                alt22=1;
            }
            else if ( (LA22_0==34) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCanvas.g:1109:2: ( ( rule__Polyline__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:1109:2: ( ( rule__Polyline__Group_1_0__0 ) )
                    // InternalCanvas.g:1110:3: ( rule__Polyline__Group_1_0__0 )
                    {
                     before(grammarAccess.getPolylineAccess().getGroup_1_0()); 
                    // InternalCanvas.g:1111:3: ( rule__Polyline__Group_1_0__0 )
                    // InternalCanvas.g:1111:4: rule__Polyline__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Polyline__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPolylineAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1115:2: ( 'polyline:' )
                    {
                    // InternalCanvas.g:1115:2: ( 'polyline:' )
                    // InternalCanvas.g:1116:3: 'polyline:'
                    {
                     before(grammarAccess.getPolylineAccess().getPolylineKeyword_1_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getPolylineAccess().getPolylineKeyword_1_1()); 

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
    // $ANTLR end "rule__Polyline__Alternatives_1"


    // $ANTLR start "rule__Segment__Alternatives_0"
    // InternalCanvas.g:1125:1: rule__Segment__Alternatives_0 : ( ( ( rule__Segment__Group_0_0__0 ) ) | ( 'segment:' ) );
    public final void rule__Segment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1129:1: ( ( ( rule__Segment__Group_0_0__0 ) ) | ( 'segment:' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==52) ) {
                alt23=1;
            }
            else if ( (LA23_0==35) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalCanvas.g:1130:2: ( ( rule__Segment__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1130:2: ( ( rule__Segment__Group_0_0__0 ) )
                    // InternalCanvas.g:1131:3: ( rule__Segment__Group_0_0__0 )
                    {
                     before(grammarAccess.getSegmentAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1132:3: ( rule__Segment__Group_0_0__0 )
                    // InternalCanvas.g:1132:4: rule__Segment__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Segment__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSegmentAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1136:2: ( 'segment:' )
                    {
                    // InternalCanvas.g:1136:2: ( 'segment:' )
                    // InternalCanvas.g:1137:3: 'segment:'
                    {
                     before(grammarAccess.getSegmentAccess().getSegmentKeyword_0_1()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getSegmentAccess().getSegmentKeyword_0_1()); 

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
    // $ANTLR end "rule__Segment__Alternatives_0"


    // $ANTLR start "rule__Segment__Alternatives_1"
    // InternalCanvas.g:1146:1: rule__Segment__Alternatives_1 : ( ( ( rule__Segment__Group_1_0__0 ) ) | ( 'start:' ) );
    public final void rule__Segment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1150:1: ( ( ( rule__Segment__Group_1_0__0 ) ) | ( 'start:' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCanvas.g:1151:2: ( ( rule__Segment__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:1151:2: ( ( rule__Segment__Group_1_0__0 ) )
                    // InternalCanvas.g:1152:3: ( rule__Segment__Group_1_0__0 )
                    {
                     before(grammarAccess.getSegmentAccess().getGroup_1_0()); 
                    // InternalCanvas.g:1153:3: ( rule__Segment__Group_1_0__0 )
                    // InternalCanvas.g:1153:4: rule__Segment__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Segment__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSegmentAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1157:2: ( 'start:' )
                    {
                    // InternalCanvas.g:1157:2: ( 'start:' )
                    // InternalCanvas.g:1158:3: 'start:'
                    {
                     before(grammarAccess.getSegmentAccess().getStartKeyword_1_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSegmentAccess().getStartKeyword_1_1()); 

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
    // $ANTLR end "rule__Segment__Alternatives_1"


    // $ANTLR start "rule__Segment__Alternatives_3"
    // InternalCanvas.g:1167:1: rule__Segment__Alternatives_3 : ( ( ( rule__Segment__Group_3_0__0 ) ) | ( 'end:' ) );
    public final void rule__Segment__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1171:1: ( ( ( rule__Segment__Group_3_0__0 ) ) | ( 'end:' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            else if ( (LA25_0==33) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCanvas.g:1172:2: ( ( rule__Segment__Group_3_0__0 ) )
                    {
                    // InternalCanvas.g:1172:2: ( ( rule__Segment__Group_3_0__0 ) )
                    // InternalCanvas.g:1173:3: ( rule__Segment__Group_3_0__0 )
                    {
                     before(grammarAccess.getSegmentAccess().getGroup_3_0()); 
                    // InternalCanvas.g:1174:3: ( rule__Segment__Group_3_0__0 )
                    // InternalCanvas.g:1174:4: rule__Segment__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Segment__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSegmentAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1178:2: ( 'end:' )
                    {
                    // InternalCanvas.g:1178:2: ( 'end:' )
                    // InternalCanvas.g:1179:3: 'end:'
                    {
                     before(grammarAccess.getSegmentAccess().getEndKeyword_3_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSegmentAccess().getEndKeyword_3_1()); 

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
    // $ANTLR end "rule__Segment__Alternatives_3"


    // $ANTLR start "rule__PointDefinition__Alternatives_0"
    // InternalCanvas.g:1188:1: rule__PointDefinition__Alternatives_0 : ( ( ( rule__PointDefinition__Group_0_0__0 ) ) | ( 'point:' ) );
    public final void rule__PointDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1192:1: ( ( ( rule__PointDefinition__Group_0_0__0 ) ) | ( 'point:' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            else if ( (LA26_0==36) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCanvas.g:1193:2: ( ( rule__PointDefinition__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1193:2: ( ( rule__PointDefinition__Group_0_0__0 ) )
                    // InternalCanvas.g:1194:3: ( rule__PointDefinition__Group_0_0__0 )
                    {
                     before(grammarAccess.getPointDefinitionAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1195:3: ( rule__PointDefinition__Group_0_0__0 )
                    // InternalCanvas.g:1195:4: rule__PointDefinition__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PointDefinition__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPointDefinitionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1199:2: ( 'point:' )
                    {
                    // InternalCanvas.g:1199:2: ( 'point:' )
                    // InternalCanvas.g:1200:3: 'point:'
                    {
                     before(grammarAccess.getPointDefinitionAccess().getPointKeyword_0_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getPointDefinitionAccess().getPointKeyword_0_1()); 

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
    // $ANTLR end "rule__PointDefinition__Alternatives_0"


    // $ANTLR start "rule__Rectangle__Alternatives_0"
    // InternalCanvas.g:1209:1: rule__Rectangle__Alternatives_0 : ( ( ( rule__Rectangle__Group_0_0__0 ) ) | ( 'rectangle:' ) );
    public final void rule__Rectangle__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1213:1: ( ( ( rule__Rectangle__Group_0_0__0 ) ) | ( 'rectangle:' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            else if ( (LA27_0==37) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCanvas.g:1214:2: ( ( rule__Rectangle__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1214:2: ( ( rule__Rectangle__Group_0_0__0 ) )
                    // InternalCanvas.g:1215:3: ( rule__Rectangle__Group_0_0__0 )
                    {
                     before(grammarAccess.getRectangleAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1216:3: ( rule__Rectangle__Group_0_0__0 )
                    // InternalCanvas.g:1216:4: rule__Rectangle__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rectangle__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRectangleAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1220:2: ( 'rectangle:' )
                    {
                    // InternalCanvas.g:1220:2: ( 'rectangle:' )
                    // InternalCanvas.g:1221:3: 'rectangle:'
                    {
                     before(grammarAccess.getRectangleAccess().getRectangleKeyword_0_1()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getRectangleAccess().getRectangleKeyword_0_1()); 

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
    // $ANTLR end "rule__Rectangle__Alternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalCanvas.g:1230:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1234:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCanvas.g:1235:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalCanvas.g:1242:1: rule__Model__Group__0__Impl : ( ( rule__Model__RenderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1246:1: ( ( ( rule__Model__RenderAssignment_0 ) ) )
            // InternalCanvas.g:1247:1: ( ( rule__Model__RenderAssignment_0 ) )
            {
            // InternalCanvas.g:1247:1: ( ( rule__Model__RenderAssignment_0 ) )
            // InternalCanvas.g:1248:2: ( rule__Model__RenderAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getRenderAssignment_0()); 
            // InternalCanvas.g:1249:2: ( rule__Model__RenderAssignment_0 )
            // InternalCanvas.g:1249:3: rule__Model__RenderAssignment_0
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
    // InternalCanvas.g:1257:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1261:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalCanvas.g:1262:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalCanvas.g:1269:1: rule__Model__Group__1__Impl : ( ( rule__Model__PropertiesAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1273:1: ( ( ( rule__Model__PropertiesAssignment_1 )? ) )
            // InternalCanvas.g:1274:1: ( ( rule__Model__PropertiesAssignment_1 )? )
            {
            // InternalCanvas.g:1274:1: ( ( rule__Model__PropertiesAssignment_1 )? )
            // InternalCanvas.g:1275:2: ( rule__Model__PropertiesAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_1()); 
            // InternalCanvas.g:1276:2: ( rule__Model__PropertiesAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13||LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCanvas.g:1276:3: rule__Model__PropertiesAssignment_1
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
    // InternalCanvas.g:1284:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1288:1: ( rule__Model__Group__2__Impl )
            // InternalCanvas.g:1289:2: rule__Model__Group__2__Impl
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
    // InternalCanvas.g:1295:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1299:1: ( ( ( rule__Model__ElementsAssignment_2 )* ) )
            // InternalCanvas.g:1300:1: ( ( rule__Model__ElementsAssignment_2 )* )
            {
            // InternalCanvas.g:1300:1: ( ( rule__Model__ElementsAssignment_2 )* )
            // InternalCanvas.g:1301:2: ( rule__Model__ElementsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // InternalCanvas.g:1302:2: ( rule__Model__ElementsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16||LA29_0==29||LA29_0==43||LA29_0==48) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCanvas.g:1302:3: rule__Model__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalCanvas.g:1311:1: rule__ModelRender__Group__0 : rule__ModelRender__Group__0__Impl rule__ModelRender__Group__1 ;
    public final void rule__ModelRender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1315:1: ( rule__ModelRender__Group__0__Impl rule__ModelRender__Group__1 )
            // InternalCanvas.g:1316:2: rule__ModelRender__Group__0__Impl rule__ModelRender__Group__1
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
    // InternalCanvas.g:1323:1: rule__ModelRender__Group__0__Impl : ( ( rule__ModelRender__Alternatives_0 ) ) ;
    public final void rule__ModelRender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1327:1: ( ( ( rule__ModelRender__Alternatives_0 ) ) )
            // InternalCanvas.g:1328:1: ( ( rule__ModelRender__Alternatives_0 ) )
            {
            // InternalCanvas.g:1328:1: ( ( rule__ModelRender__Alternatives_0 ) )
            // InternalCanvas.g:1329:2: ( rule__ModelRender__Alternatives_0 )
            {
             before(grammarAccess.getModelRenderAccess().getAlternatives_0()); 
            // InternalCanvas.g:1330:2: ( rule__ModelRender__Alternatives_0 )
            // InternalCanvas.g:1330:3: rule__ModelRender__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelRender__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelRenderAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:1338:1: rule__ModelRender__Group__1 : rule__ModelRender__Group__1__Impl ;
    public final void rule__ModelRender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1342:1: ( rule__ModelRender__Group__1__Impl )
            // InternalCanvas.g:1343:2: rule__ModelRender__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelRender__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:1349:1: rule__ModelRender__Group__1__Impl : ( ( rule__ModelRender__ImportURIAssignment_1 ) ) ;
    public final void rule__ModelRender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1353:1: ( ( ( rule__ModelRender__ImportURIAssignment_1 ) ) )
            // InternalCanvas.g:1354:1: ( ( rule__ModelRender__ImportURIAssignment_1 ) )
            {
            // InternalCanvas.g:1354:1: ( ( rule__ModelRender__ImportURIAssignment_1 ) )
            // InternalCanvas.g:1355:2: ( rule__ModelRender__ImportURIAssignment_1 )
            {
             before(grammarAccess.getModelRenderAccess().getImportURIAssignment_1()); 
            // InternalCanvas.g:1356:2: ( rule__ModelRender__ImportURIAssignment_1 )
            // InternalCanvas.g:1356:3: rule__ModelRender__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelRender__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelRenderAccess().getImportURIAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ModelRender__Group_0_0__0"
    // InternalCanvas.g:1365:1: rule__ModelRender__Group_0_0__0 : rule__ModelRender__Group_0_0__0__Impl rule__ModelRender__Group_0_0__1 ;
    public final void rule__ModelRender__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1369:1: ( rule__ModelRender__Group_0_0__0__Impl rule__ModelRender__Group_0_0__1 )
            // InternalCanvas.g:1370:2: rule__ModelRender__Group_0_0__0__Impl rule__ModelRender__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ModelRender__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelRender__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group_0_0__0"


    // $ANTLR start "rule__ModelRender__Group_0_0__0__Impl"
    // InternalCanvas.g:1377:1: rule__ModelRender__Group_0_0__0__Impl : ( 'render' ) ;
    public final void rule__ModelRender__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1381:1: ( ( 'render' ) )
            // InternalCanvas.g:1382:1: ( 'render' )
            {
            // InternalCanvas.g:1382:1: ( 'render' )
            // InternalCanvas.g:1383:2: 'render'
            {
             before(grammarAccess.getModelRenderAccess().getRenderKeyword_0_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getModelRenderAccess().getRenderKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group_0_0__0__Impl"


    // $ANTLR start "rule__ModelRender__Group_0_0__1"
    // InternalCanvas.g:1392:1: rule__ModelRender__Group_0_0__1 : rule__ModelRender__Group_0_0__1__Impl ;
    public final void rule__ModelRender__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1396:1: ( rule__ModelRender__Group_0_0__1__Impl )
            // InternalCanvas.g:1397:2: rule__ModelRender__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelRender__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group_0_0__1"


    // $ANTLR start "rule__ModelRender__Group_0_0__1__Impl"
    // InternalCanvas.g:1403:1: rule__ModelRender__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ModelRender__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1407:1: ( ( ':' ) )
            // InternalCanvas.g:1408:1: ( ':' )
            {
            // InternalCanvas.g:1408:1: ( ':' )
            // InternalCanvas.g:1409:2: ':'
            {
             before(grammarAccess.getModelRenderAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getModelRenderAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__Group_0_0__1__Impl"


    // $ANTLR start "rule__ModelProperties__Group__0"
    // InternalCanvas.g:1419:1: rule__ModelProperties__Group__0 : rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1 ;
    public final void rule__ModelProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1423:1: ( rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1 )
            // InternalCanvas.g:1424:2: rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCanvas.g:1431:1: rule__ModelProperties__Group__0__Impl : ( ( rule__ModelProperties__Alternatives_0 ) ) ;
    public final void rule__ModelProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1435:1: ( ( ( rule__ModelProperties__Alternatives_0 ) ) )
            // InternalCanvas.g:1436:1: ( ( rule__ModelProperties__Alternatives_0 ) )
            {
            // InternalCanvas.g:1436:1: ( ( rule__ModelProperties__Alternatives_0 ) )
            // InternalCanvas.g:1437:2: ( rule__ModelProperties__Alternatives_0 )
            {
             before(grammarAccess.getModelPropertiesAccess().getAlternatives_0()); 
            // InternalCanvas.g:1438:2: ( rule__ModelProperties__Alternatives_0 )
            // InternalCanvas.g:1438:3: rule__ModelProperties__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertiesAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:1446:1: rule__ModelProperties__Group__1 : rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2 ;
    public final void rule__ModelProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1450:1: ( rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2 )
            // InternalCanvas.g:1451:2: rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:1458:1: rule__ModelProperties__Group__1__Impl : ( ( rule__ModelProperties__Alternatives_1 ) ) ;
    public final void rule__ModelProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1462:1: ( ( ( rule__ModelProperties__Alternatives_1 ) ) )
            // InternalCanvas.g:1463:1: ( ( rule__ModelProperties__Alternatives_1 ) )
            {
            // InternalCanvas.g:1463:1: ( ( rule__ModelProperties__Alternatives_1 ) )
            // InternalCanvas.g:1464:2: ( rule__ModelProperties__Alternatives_1 )
            {
             before(grammarAccess.getModelPropertiesAccess().getAlternatives_1()); 
            // InternalCanvas.g:1465:2: ( rule__ModelProperties__Alternatives_1 )
            // InternalCanvas.g:1465:3: rule__ModelProperties__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertiesAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCanvas.g:1473:1: rule__ModelProperties__Group__2 : rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3 ;
    public final void rule__ModelProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1477:1: ( rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3 )
            // InternalCanvas.g:1478:2: rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCanvas.g:1485:1: rule__ModelProperties__Group__2__Impl : ( ( rule__ModelProperties__PointAssignment_2 ) ) ;
    public final void rule__ModelProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1489:1: ( ( ( rule__ModelProperties__PointAssignment_2 ) ) )
            // InternalCanvas.g:1490:1: ( ( rule__ModelProperties__PointAssignment_2 ) )
            {
            // InternalCanvas.g:1490:1: ( ( rule__ModelProperties__PointAssignment_2 ) )
            // InternalCanvas.g:1491:2: ( rule__ModelProperties__PointAssignment_2 )
            {
             before(grammarAccess.getModelPropertiesAccess().getPointAssignment_2()); 
            // InternalCanvas.g:1492:2: ( rule__ModelProperties__PointAssignment_2 )
            // InternalCanvas.g:1492:3: rule__ModelProperties__PointAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__PointAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertiesAccess().getPointAssignment_2()); 

            }


            }

        }
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
    // InternalCanvas.g:1500:1: rule__ModelProperties__Group__3 : rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4 ;
    public final void rule__ModelProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1504:1: ( rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4 )
            // InternalCanvas.g:1505:2: rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:1512:1: rule__ModelProperties__Group__3__Impl : ( ( rule__ModelProperties__Alternatives_3 ) ) ;
    public final void rule__ModelProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1516:1: ( ( ( rule__ModelProperties__Alternatives_3 ) ) )
            // InternalCanvas.g:1517:1: ( ( rule__ModelProperties__Alternatives_3 ) )
            {
            // InternalCanvas.g:1517:1: ( ( rule__ModelProperties__Alternatives_3 ) )
            // InternalCanvas.g:1518:2: ( rule__ModelProperties__Alternatives_3 )
            {
             before(grammarAccess.getModelPropertiesAccess().getAlternatives_3()); 
            // InternalCanvas.g:1519:2: ( rule__ModelProperties__Alternatives_3 )
            // InternalCanvas.g:1519:3: rule__ModelProperties__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertiesAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalCanvas.g:1527:1: rule__ModelProperties__Group__4 : rule__ModelProperties__Group__4__Impl ;
    public final void rule__ModelProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1531:1: ( rule__ModelProperties__Group__4__Impl )
            // InternalCanvas.g:1532:2: rule__ModelProperties__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:1538:1: rule__ModelProperties__Group__4__Impl : ( ( rule__ModelProperties__ZoomAssignment_4 ) ) ;
    public final void rule__ModelProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1542:1: ( ( ( rule__ModelProperties__ZoomAssignment_4 ) ) )
            // InternalCanvas.g:1543:1: ( ( rule__ModelProperties__ZoomAssignment_4 ) )
            {
            // InternalCanvas.g:1543:1: ( ( rule__ModelProperties__ZoomAssignment_4 ) )
            // InternalCanvas.g:1544:2: ( rule__ModelProperties__ZoomAssignment_4 )
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomAssignment_4()); 
            // InternalCanvas.g:1545:2: ( rule__ModelProperties__ZoomAssignment_4 )
            // InternalCanvas.g:1545:3: rule__ModelProperties__ZoomAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__ZoomAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelPropertiesAccess().getZoomAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ModelProperties__Group_0_0__0"
    // InternalCanvas.g:1554:1: rule__ModelProperties__Group_0_0__0 : rule__ModelProperties__Group_0_0__0__Impl rule__ModelProperties__Group_0_0__1 ;
    public final void rule__ModelProperties__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1558:1: ( rule__ModelProperties__Group_0_0__0__Impl rule__ModelProperties__Group_0_0__1 )
            // InternalCanvas.g:1559:2: rule__ModelProperties__Group_0_0__0__Impl rule__ModelProperties__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ModelProperties__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_0_0__0"


    // $ANTLR start "rule__ModelProperties__Group_0_0__0__Impl"
    // InternalCanvas.g:1566:1: rule__ModelProperties__Group_0_0__0__Impl : ( 'properties' ) ;
    public final void rule__ModelProperties__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1570:1: ( ( 'properties' ) )
            // InternalCanvas.g:1571:1: ( 'properties' )
            {
            // InternalCanvas.g:1571:1: ( 'properties' )
            // InternalCanvas.g:1572:2: 'properties'
            {
             before(grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_0_0__0__Impl"


    // $ANTLR start "rule__ModelProperties__Group_0_0__1"
    // InternalCanvas.g:1581:1: rule__ModelProperties__Group_0_0__1 : rule__ModelProperties__Group_0_0__1__Impl ;
    public final void rule__ModelProperties__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1585:1: ( rule__ModelProperties__Group_0_0__1__Impl )
            // InternalCanvas.g:1586:2: rule__ModelProperties__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_0_0__1"


    // $ANTLR start "rule__ModelProperties__Group_0_0__1__Impl"
    // InternalCanvas.g:1592:1: rule__ModelProperties__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1596:1: ( ( ':' ) )
            // InternalCanvas.g:1597:1: ( ':' )
            {
            // InternalCanvas.g:1597:1: ( ':' )
            // InternalCanvas.g:1598:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_0_0__1__Impl"


    // $ANTLR start "rule__ModelProperties__Group_1_0__0"
    // InternalCanvas.g:1608:1: rule__ModelProperties__Group_1_0__0 : rule__ModelProperties__Group_1_0__0__Impl rule__ModelProperties__Group_1_0__1 ;
    public final void rule__ModelProperties__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1612:1: ( rule__ModelProperties__Group_1_0__0__Impl rule__ModelProperties__Group_1_0__1 )
            // InternalCanvas.g:1613:2: rule__ModelProperties__Group_1_0__0__Impl rule__ModelProperties__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ModelProperties__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_1_0__0"


    // $ANTLR start "rule__ModelProperties__Group_1_0__0__Impl"
    // InternalCanvas.g:1620:1: rule__ModelProperties__Group_1_0__0__Impl : ( 'viewport' ) ;
    public final void rule__ModelProperties__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1624:1: ( ( 'viewport' ) )
            // InternalCanvas.g:1625:1: ( 'viewport' )
            {
            // InternalCanvas.g:1625:1: ( 'viewport' )
            // InternalCanvas.g:1626:2: 'viewport'
            {
             before(grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_1_0__0__Impl"


    // $ANTLR start "rule__ModelProperties__Group_1_0__1"
    // InternalCanvas.g:1635:1: rule__ModelProperties__Group_1_0__1 : rule__ModelProperties__Group_1_0__1__Impl ;
    public final void rule__ModelProperties__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1639:1: ( rule__ModelProperties__Group_1_0__1__Impl )
            // InternalCanvas.g:1640:2: rule__ModelProperties__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_1_0__1"


    // $ANTLR start "rule__ModelProperties__Group_1_0__1__Impl"
    // InternalCanvas.g:1646:1: rule__ModelProperties__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1650:1: ( ( ':' ) )
            // InternalCanvas.g:1651:1: ( ':' )
            {
            // InternalCanvas.g:1651:1: ( ':' )
            // InternalCanvas.g:1652:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_1_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_1_0__1__Impl"


    // $ANTLR start "rule__ModelProperties__Group_3_0__0"
    // InternalCanvas.g:1662:1: rule__ModelProperties__Group_3_0__0 : rule__ModelProperties__Group_3_0__0__Impl rule__ModelProperties__Group_3_0__1 ;
    public final void rule__ModelProperties__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1666:1: ( rule__ModelProperties__Group_3_0__0__Impl rule__ModelProperties__Group_3_0__1 )
            // InternalCanvas.g:1667:2: rule__ModelProperties__Group_3_0__0__Impl rule__ModelProperties__Group_3_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ModelProperties__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_3_0__0"


    // $ANTLR start "rule__ModelProperties__Group_3_0__0__Impl"
    // InternalCanvas.g:1674:1: rule__ModelProperties__Group_3_0__0__Impl : ( 'zoom' ) ;
    public final void rule__ModelProperties__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1678:1: ( ( 'zoom' ) )
            // InternalCanvas.g:1679:1: ( 'zoom' )
            {
            // InternalCanvas.g:1679:1: ( 'zoom' )
            // InternalCanvas.g:1680:2: 'zoom'
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomKeyword_3_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getZoomKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_3_0__0__Impl"


    // $ANTLR start "rule__ModelProperties__Group_3_0__1"
    // InternalCanvas.g:1689:1: rule__ModelProperties__Group_3_0__1 : rule__ModelProperties__Group_3_0__1__Impl ;
    public final void rule__ModelProperties__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1693:1: ( rule__ModelProperties__Group_3_0__1__Impl )
            // InternalCanvas.g:1694:2: rule__ModelProperties__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperties__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_3_0__1"


    // $ANTLR start "rule__ModelProperties__Group_3_0__1__Impl"
    // InternalCanvas.g:1700:1: rule__ModelProperties__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1704:1: ( ( ':' ) )
            // InternalCanvas.g:1705:1: ( ':' )
            {
            // InternalCanvas.g:1705:1: ( ':' )
            // InternalCanvas.g:1706:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_3_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getColonKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__Group_3_0__1__Impl"


    // $ANTLR start "rule__Shapes__Group__0"
    // InternalCanvas.g:1716:1: rule__Shapes__Group__0 : rule__Shapes__Group__0__Impl rule__Shapes__Group__1 ;
    public final void rule__Shapes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1720:1: ( rule__Shapes__Group__0__Impl rule__Shapes__Group__1 )
            // InternalCanvas.g:1721:2: rule__Shapes__Group__0__Impl rule__Shapes__Group__1
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
    // InternalCanvas.g:1728:1: rule__Shapes__Group__0__Impl : ( () ) ;
    public final void rule__Shapes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1732:1: ( ( () ) )
            // InternalCanvas.g:1733:1: ( () )
            {
            // InternalCanvas.g:1733:1: ( () )
            // InternalCanvas.g:1734:2: ()
            {
             before(grammarAccess.getShapesAccess().getShapesAction_0()); 
            // InternalCanvas.g:1735:2: ()
            // InternalCanvas.g:1735:3: 
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
    // InternalCanvas.g:1743:1: rule__Shapes__Group__1 : rule__Shapes__Group__1__Impl rule__Shapes__Group__2 ;
    public final void rule__Shapes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1747:1: ( rule__Shapes__Group__1__Impl rule__Shapes__Group__2 )
            // InternalCanvas.g:1748:2: rule__Shapes__Group__1__Impl rule__Shapes__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalCanvas.g:1755:1: rule__Shapes__Group__1__Impl : ( ( rule__Shapes__Alternatives_1 ) ) ;
    public final void rule__Shapes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1759:1: ( ( ( rule__Shapes__Alternatives_1 ) ) )
            // InternalCanvas.g:1760:1: ( ( rule__Shapes__Alternatives_1 ) )
            {
            // InternalCanvas.g:1760:1: ( ( rule__Shapes__Alternatives_1 ) )
            // InternalCanvas.g:1761:2: ( rule__Shapes__Alternatives_1 )
            {
             before(grammarAccess.getShapesAccess().getAlternatives_1()); 
            // InternalCanvas.g:1762:2: ( rule__Shapes__Alternatives_1 )
            // InternalCanvas.g:1762:3: rule__Shapes__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Shapes__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getShapesAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCanvas.g:1770:1: rule__Shapes__Group__2 : rule__Shapes__Group__2__Impl ;
    public final void rule__Shapes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1774:1: ( rule__Shapes__Group__2__Impl )
            // InternalCanvas.g:1775:2: rule__Shapes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shapes__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:1781:1: rule__Shapes__Group__2__Impl : ( ( rule__Shapes__ShapesAssignment_2 )* ) ;
    public final void rule__Shapes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1785:1: ( ( ( rule__Shapes__ShapesAssignment_2 )* ) )
            // InternalCanvas.g:1786:1: ( ( rule__Shapes__ShapesAssignment_2 )* )
            {
            // InternalCanvas.g:1786:1: ( ( rule__Shapes__ShapesAssignment_2 )* )
            // InternalCanvas.g:1787:2: ( rule__Shapes__ShapesAssignment_2 )*
            {
             before(grammarAccess.getShapesAccess().getShapesAssignment_2()); 
            // InternalCanvas.g:1788:2: ( rule__Shapes__ShapesAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17||LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCanvas.g:1788:3: rule__Shapes__ShapesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Shapes__ShapesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getShapesAccess().getShapesAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Shapes__Group_1_0__0"
    // InternalCanvas.g:1797:1: rule__Shapes__Group_1_0__0 : rule__Shapes__Group_1_0__0__Impl rule__Shapes__Group_1_0__1 ;
    public final void rule__Shapes__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1801:1: ( rule__Shapes__Group_1_0__0__Impl rule__Shapes__Group_1_0__1 )
            // InternalCanvas.g:1802:2: rule__Shapes__Group_1_0__0__Impl rule__Shapes__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Shapes__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shapes__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group_1_0__0"


    // $ANTLR start "rule__Shapes__Group_1_0__0__Impl"
    // InternalCanvas.g:1809:1: rule__Shapes__Group_1_0__0__Impl : ( 'shapes' ) ;
    public final void rule__Shapes__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1813:1: ( ( 'shapes' ) )
            // InternalCanvas.g:1814:1: ( 'shapes' )
            {
            // InternalCanvas.g:1814:1: ( 'shapes' )
            // InternalCanvas.g:1815:2: 'shapes'
            {
             before(grammarAccess.getShapesAccess().getShapesKeyword_1_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getShapesAccess().getShapesKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group_1_0__0__Impl"


    // $ANTLR start "rule__Shapes__Group_1_0__1"
    // InternalCanvas.g:1824:1: rule__Shapes__Group_1_0__1 : rule__Shapes__Group_1_0__1__Impl ;
    public final void rule__Shapes__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1828:1: ( rule__Shapes__Group_1_0__1__Impl )
            // InternalCanvas.g:1829:2: rule__Shapes__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shapes__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group_1_0__1"


    // $ANTLR start "rule__Shapes__Group_1_0__1__Impl"
    // InternalCanvas.g:1835:1: rule__Shapes__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Shapes__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1839:1: ( ( ':' ) )
            // InternalCanvas.g:1840:1: ( ':' )
            {
            // InternalCanvas.g:1840:1: ( ':' )
            // InternalCanvas.g:1841:2: ':'
            {
             before(grammarAccess.getShapesAccess().getColonKeyword_1_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getShapesAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__Group_1_0__1__Impl"


    // $ANTLR start "rule__Shape__Group__0"
    // InternalCanvas.g:1851:1: rule__Shape__Group__0 : rule__Shape__Group__0__Impl rule__Shape__Group__1 ;
    public final void rule__Shape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1855:1: ( rule__Shape__Group__0__Impl rule__Shape__Group__1 )
            // InternalCanvas.g:1856:2: rule__Shape__Group__0__Impl rule__Shape__Group__1
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
    // InternalCanvas.g:1863:1: rule__Shape__Group__0__Impl : ( () ) ;
    public final void rule__Shape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1867:1: ( ( () ) )
            // InternalCanvas.g:1868:1: ( () )
            {
            // InternalCanvas.g:1868:1: ( () )
            // InternalCanvas.g:1869:2: ()
            {
             before(grammarAccess.getShapeAccess().getShapeAction_0()); 
            // InternalCanvas.g:1870:2: ()
            // InternalCanvas.g:1870:3: 
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
    // InternalCanvas.g:1878:1: rule__Shape__Group__1 : rule__Shape__Group__1__Impl rule__Shape__Group__2 ;
    public final void rule__Shape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1882:1: ( rule__Shape__Group__1__Impl rule__Shape__Group__2 )
            // InternalCanvas.g:1883:2: rule__Shape__Group__1__Impl rule__Shape__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCanvas.g:1890:1: rule__Shape__Group__1__Impl : ( ( rule__Shape__Alternatives_1 ) ) ;
    public final void rule__Shape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1894:1: ( ( ( rule__Shape__Alternatives_1 ) ) )
            // InternalCanvas.g:1895:1: ( ( rule__Shape__Alternatives_1 ) )
            {
            // InternalCanvas.g:1895:1: ( ( rule__Shape__Alternatives_1 ) )
            // InternalCanvas.g:1896:2: ( rule__Shape__Alternatives_1 )
            {
             before(grammarAccess.getShapeAccess().getAlternatives_1()); 
            // InternalCanvas.g:1897:2: ( rule__Shape__Alternatives_1 )
            // InternalCanvas.g:1897:3: rule__Shape__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCanvas.g:1905:1: rule__Shape__Group__2 : rule__Shape__Group__2__Impl rule__Shape__Group__3 ;
    public final void rule__Shape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1909:1: ( rule__Shape__Group__2__Impl rule__Shape__Group__3 )
            // InternalCanvas.g:1910:2: rule__Shape__Group__2__Impl rule__Shape__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalCanvas.g:1917:1: rule__Shape__Group__2__Impl : ( ( rule__Shape__NameAssignment_2 ) ) ;
    public final void rule__Shape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1921:1: ( ( ( rule__Shape__NameAssignment_2 ) ) )
            // InternalCanvas.g:1922:1: ( ( rule__Shape__NameAssignment_2 ) )
            {
            // InternalCanvas.g:1922:1: ( ( rule__Shape__NameAssignment_2 ) )
            // InternalCanvas.g:1923:2: ( rule__Shape__NameAssignment_2 )
            {
             before(grammarAccess.getShapeAccess().getNameAssignment_2()); 
            // InternalCanvas.g:1924:2: ( rule__Shape__NameAssignment_2 )
            // InternalCanvas.g:1924:3: rule__Shape__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Shape__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalCanvas.g:1932:1: rule__Shape__Group__3 : rule__Shape__Group__3__Impl rule__Shape__Group__4 ;
    public final void rule__Shape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1936:1: ( rule__Shape__Group__3__Impl rule__Shape__Group__4 )
            // InternalCanvas.g:1937:2: rule__Shape__Group__3__Impl rule__Shape__Group__4
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
    // InternalCanvas.g:1944:1: rule__Shape__Group__3__Impl : ( ( rule__Shape__ContainerAssignment_3 )? ) ;
    public final void rule__Shape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1948:1: ( ( ( rule__Shape__ContainerAssignment_3 )? ) )
            // InternalCanvas.g:1949:1: ( ( rule__Shape__ContainerAssignment_3 )? )
            {
            // InternalCanvas.g:1949:1: ( ( rule__Shape__ContainerAssignment_3 )? )
            // InternalCanvas.g:1950:2: ( rule__Shape__ContainerAssignment_3 )?
            {
             before(grammarAccess.getShapeAccess().getContainerAssignment_3()); 
            // InternalCanvas.g:1951:2: ( rule__Shape__ContainerAssignment_3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==11) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCanvas.g:1951:3: rule__Shape__ContainerAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__ContainerAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeAccess().getContainerAssignment_3()); 

            }


            }

        }
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
    // InternalCanvas.g:1959:1: rule__Shape__Group__4 : rule__Shape__Group__4__Impl rule__Shape__Group__5 ;
    public final void rule__Shape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1963:1: ( rule__Shape__Group__4__Impl rule__Shape__Group__5 )
            // InternalCanvas.g:1964:2: rule__Shape__Group__4__Impl rule__Shape__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalCanvas.g:1971:1: rule__Shape__Group__4__Impl : ( ( rule__Shape__Alternatives_4 ) ) ;
    public final void rule__Shape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1975:1: ( ( ( rule__Shape__Alternatives_4 ) ) )
            // InternalCanvas.g:1976:1: ( ( rule__Shape__Alternatives_4 ) )
            {
            // InternalCanvas.g:1976:1: ( ( rule__Shape__Alternatives_4 ) )
            // InternalCanvas.g:1977:2: ( rule__Shape__Alternatives_4 )
            {
             before(grammarAccess.getShapeAccess().getAlternatives_4()); 
            // InternalCanvas.g:1978:2: ( rule__Shape__Alternatives_4 )
            // InternalCanvas.g:1978:3: rule__Shape__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getAlternatives_4()); 

            }


            }

        }
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
    // InternalCanvas.g:1986:1: rule__Shape__Group__5 : rule__Shape__Group__5__Impl rule__Shape__Group__6 ;
    public final void rule__Shape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1990:1: ( rule__Shape__Group__5__Impl rule__Shape__Group__6 )
            // InternalCanvas.g:1991:2: rule__Shape__Group__5__Impl rule__Shape__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalCanvas.g:1998:1: rule__Shape__Group__5__Impl : ( ( rule__Shape__RepresentsAssignment_5 ) ) ;
    public final void rule__Shape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2002:1: ( ( ( rule__Shape__RepresentsAssignment_5 ) ) )
            // InternalCanvas.g:2003:1: ( ( rule__Shape__RepresentsAssignment_5 ) )
            {
            // InternalCanvas.g:2003:1: ( ( rule__Shape__RepresentsAssignment_5 ) )
            // InternalCanvas.g:2004:2: ( rule__Shape__RepresentsAssignment_5 )
            {
             before(grammarAccess.getShapeAccess().getRepresentsAssignment_5()); 
            // InternalCanvas.g:2005:2: ( rule__Shape__RepresentsAssignment_5 )
            // InternalCanvas.g:2005:3: rule__Shape__RepresentsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Shape__RepresentsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getRepresentsAssignment_5()); 

            }


            }

        }
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
    // InternalCanvas.g:2013:1: rule__Shape__Group__6 : rule__Shape__Group__6__Impl rule__Shape__Group__7 ;
    public final void rule__Shape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2017:1: ( rule__Shape__Group__6__Impl rule__Shape__Group__7 )
            // InternalCanvas.g:2018:2: rule__Shape__Group__6__Impl rule__Shape__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalCanvas.g:2025:1: rule__Shape__Group__6__Impl : ( ( rule__Shape__RectAssignment_6 ) ) ;
    public final void rule__Shape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2029:1: ( ( ( rule__Shape__RectAssignment_6 ) ) )
            // InternalCanvas.g:2030:1: ( ( rule__Shape__RectAssignment_6 ) )
            {
            // InternalCanvas.g:2030:1: ( ( rule__Shape__RectAssignment_6 ) )
            // InternalCanvas.g:2031:2: ( rule__Shape__RectAssignment_6 )
            {
             before(grammarAccess.getShapeAccess().getRectAssignment_6()); 
            // InternalCanvas.g:2032:2: ( rule__Shape__RectAssignment_6 )
            // InternalCanvas.g:2032:3: rule__Shape__RectAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Shape__RectAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getRectAssignment_6()); 

            }


            }

        }
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
    // InternalCanvas.g:2040:1: rule__Shape__Group__7 : rule__Shape__Group__7__Impl ;
    public final void rule__Shape__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2044:1: ( rule__Shape__Group__7__Impl )
            // InternalCanvas.g:2045:2: rule__Shape__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:2051:1: rule__Shape__Group__7__Impl : ( ( rule__Shape__TextAssignment_7 )? ) ;
    public final void rule__Shape__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2055:1: ( ( ( rule__Shape__TextAssignment_7 )? ) )
            // InternalCanvas.g:2056:1: ( ( rule__Shape__TextAssignment_7 )? )
            {
            // InternalCanvas.g:2056:1: ( ( rule__Shape__TextAssignment_7 )? )
            // InternalCanvas.g:2057:2: ( rule__Shape__TextAssignment_7 )?
            {
             before(grammarAccess.getShapeAccess().getTextAssignment_7()); 
            // InternalCanvas.g:2058:2: ( rule__Shape__TextAssignment_7 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19||LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCanvas.g:2058:3: rule__Shape__TextAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__TextAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeAccess().getTextAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Shape__Group_1_0__0"
    // InternalCanvas.g:2067:1: rule__Shape__Group_1_0__0 : rule__Shape__Group_1_0__0__Impl rule__Shape__Group_1_0__1 ;
    public final void rule__Shape__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2071:1: ( rule__Shape__Group_1_0__0__Impl rule__Shape__Group_1_0__1 )
            // InternalCanvas.g:2072:2: rule__Shape__Group_1_0__0__Impl rule__Shape__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Shape__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_1_0__0"


    // $ANTLR start "rule__Shape__Group_1_0__0__Impl"
    // InternalCanvas.g:2079:1: rule__Shape__Group_1_0__0__Impl : ( 'shape' ) ;
    public final void rule__Shape__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2083:1: ( ( 'shape' ) )
            // InternalCanvas.g:2084:1: ( 'shape' )
            {
            // InternalCanvas.g:2084:1: ( 'shape' )
            // InternalCanvas.g:2085:2: 'shape'
            {
             before(grammarAccess.getShapeAccess().getShapeKeyword_1_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getShapeKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_1_0__0__Impl"


    // $ANTLR start "rule__Shape__Group_1_0__1"
    // InternalCanvas.g:2094:1: rule__Shape__Group_1_0__1 : rule__Shape__Group_1_0__1__Impl ;
    public final void rule__Shape__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2098:1: ( rule__Shape__Group_1_0__1__Impl )
            // InternalCanvas.g:2099:2: rule__Shape__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_1_0__1"


    // $ANTLR start "rule__Shape__Group_1_0__1__Impl"
    // InternalCanvas.g:2105:1: rule__Shape__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Shape__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2109:1: ( ( ':' ) )
            // InternalCanvas.g:2110:1: ( ':' )
            {
            // InternalCanvas.g:2110:1: ( ':' )
            // InternalCanvas.g:2111:2: ':'
            {
             before(grammarAccess.getShapeAccess().getColonKeyword_1_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_1_0__1__Impl"


    // $ANTLR start "rule__Shape__Group_4_0__0"
    // InternalCanvas.g:2121:1: rule__Shape__Group_4_0__0 : rule__Shape__Group_4_0__0__Impl rule__Shape__Group_4_0__1 ;
    public final void rule__Shape__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2125:1: ( rule__Shape__Group_4_0__0__Impl rule__Shape__Group_4_0__1 )
            // InternalCanvas.g:2126:2: rule__Shape__Group_4_0__0__Impl rule__Shape__Group_4_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Shape__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_4_0__0"


    // $ANTLR start "rule__Shape__Group_4_0__0__Impl"
    // InternalCanvas.g:2133:1: rule__Shape__Group_4_0__0__Impl : ( 'render' ) ;
    public final void rule__Shape__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2137:1: ( ( 'render' ) )
            // InternalCanvas.g:2138:1: ( 'render' )
            {
            // InternalCanvas.g:2138:1: ( 'render' )
            // InternalCanvas.g:2139:2: 'render'
            {
             before(grammarAccess.getShapeAccess().getRenderKeyword_4_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getRenderKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_4_0__0__Impl"


    // $ANTLR start "rule__Shape__Group_4_0__1"
    // InternalCanvas.g:2148:1: rule__Shape__Group_4_0__1 : rule__Shape__Group_4_0__1__Impl ;
    public final void rule__Shape__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2152:1: ( rule__Shape__Group_4_0__1__Impl )
            // InternalCanvas.g:2153:2: rule__Shape__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_4_0__1"


    // $ANTLR start "rule__Shape__Group_4_0__1__Impl"
    // InternalCanvas.g:2159:1: rule__Shape__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Shape__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2163:1: ( ( ':' ) )
            // InternalCanvas.g:2164:1: ( ':' )
            {
            // InternalCanvas.g:2164:1: ( ':' )
            // InternalCanvas.g:2165:2: ':'
            {
             before(grammarAccess.getShapeAccess().getColonKeyword_4_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getColonKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_4_0__1__Impl"


    // $ANTLR start "rule__FloatingTexts__Group__0"
    // InternalCanvas.g:2175:1: rule__FloatingTexts__Group__0 : rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1 ;
    public final void rule__FloatingTexts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2179:1: ( rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1 )
            // InternalCanvas.g:2180:2: rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCanvas.g:2187:1: rule__FloatingTexts__Group__0__Impl : ( () ) ;
    public final void rule__FloatingTexts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2191:1: ( ( () ) )
            // InternalCanvas.g:2192:1: ( () )
            {
            // InternalCanvas.g:2192:1: ( () )
            // InternalCanvas.g:2193:2: ()
            {
             before(grammarAccess.getFloatingTextsAccess().getFloatingTextsAction_0()); 
            // InternalCanvas.g:2194:2: ()
            // InternalCanvas.g:2194:3: 
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
    // InternalCanvas.g:2202:1: rule__FloatingTexts__Group__1 : rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2 ;
    public final void rule__FloatingTexts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2206:1: ( rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2 )
            // InternalCanvas.g:2207:2: rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCanvas.g:2214:1: rule__FloatingTexts__Group__1__Impl : ( ( rule__FloatingTexts__Alternatives_1 ) ) ;
    public final void rule__FloatingTexts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2218:1: ( ( ( rule__FloatingTexts__Alternatives_1 ) ) )
            // InternalCanvas.g:2219:1: ( ( rule__FloatingTexts__Alternatives_1 ) )
            {
            // InternalCanvas.g:2219:1: ( ( rule__FloatingTexts__Alternatives_1 ) )
            // InternalCanvas.g:2220:2: ( rule__FloatingTexts__Alternatives_1 )
            {
             before(grammarAccess.getFloatingTextsAccess().getAlternatives_1()); 
            // InternalCanvas.g:2221:2: ( rule__FloatingTexts__Alternatives_1 )
            // InternalCanvas.g:2221:3: rule__FloatingTexts__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FloatingTexts__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextsAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCanvas.g:2229:1: rule__FloatingTexts__Group__2 : rule__FloatingTexts__Group__2__Impl ;
    public final void rule__FloatingTexts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2233:1: ( rule__FloatingTexts__Group__2__Impl )
            // InternalCanvas.g:2234:2: rule__FloatingTexts__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatingTexts__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:2240:1: rule__FloatingTexts__Group__2__Impl : ( ( rule__FloatingTexts__TextsAssignment_2 )* ) ;
    public final void rule__FloatingTexts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2244:1: ( ( ( rule__FloatingTexts__TextsAssignment_2 )* ) )
            // InternalCanvas.g:2245:1: ( ( rule__FloatingTexts__TextsAssignment_2 )* )
            {
            // InternalCanvas.g:2245:1: ( ( rule__FloatingTexts__TextsAssignment_2 )* )
            // InternalCanvas.g:2246:2: ( rule__FloatingTexts__TextsAssignment_2 )*
            {
             before(grammarAccess.getFloatingTextsAccess().getTextsAssignment_2()); 
            // InternalCanvas.g:2247:2: ( rule__FloatingTexts__TextsAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19||LA33_0==46) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCanvas.g:2247:3: rule__FloatingTexts__TextsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__FloatingTexts__TextsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getFloatingTextsAccess().getTextsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__FloatingTexts__Group_1_0__0"
    // InternalCanvas.g:2256:1: rule__FloatingTexts__Group_1_0__0 : rule__FloatingTexts__Group_1_0__0__Impl rule__FloatingTexts__Group_1_0__1 ;
    public final void rule__FloatingTexts__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2260:1: ( rule__FloatingTexts__Group_1_0__0__Impl rule__FloatingTexts__Group_1_0__1 )
            // InternalCanvas.g:2261:2: rule__FloatingTexts__Group_1_0__0__Impl rule__FloatingTexts__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__FloatingTexts__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatingTexts__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group_1_0__0"


    // $ANTLR start "rule__FloatingTexts__Group_1_0__0__Impl"
    // InternalCanvas.g:2268:1: rule__FloatingTexts__Group_1_0__0__Impl : ( 'texts' ) ;
    public final void rule__FloatingTexts__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2272:1: ( ( 'texts' ) )
            // InternalCanvas.g:2273:1: ( 'texts' )
            {
            // InternalCanvas.g:2273:1: ( 'texts' )
            // InternalCanvas.g:2274:2: 'texts'
            {
             before(grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group_1_0__0__Impl"


    // $ANTLR start "rule__FloatingTexts__Group_1_0__1"
    // InternalCanvas.g:2283:1: rule__FloatingTexts__Group_1_0__1 : rule__FloatingTexts__Group_1_0__1__Impl ;
    public final void rule__FloatingTexts__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2287:1: ( rule__FloatingTexts__Group_1_0__1__Impl )
            // InternalCanvas.g:2288:2: rule__FloatingTexts__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatingTexts__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group_1_0__1"


    // $ANTLR start "rule__FloatingTexts__Group_1_0__1__Impl"
    // InternalCanvas.g:2294:1: rule__FloatingTexts__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__FloatingTexts__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2298:1: ( ( ':' ) )
            // InternalCanvas.g:2299:1: ( ':' )
            {
            // InternalCanvas.g:2299:1: ( ':' )
            // InternalCanvas.g:2300:2: ':'
            {
             before(grammarAccess.getFloatingTextsAccess().getColonKeyword_1_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFloatingTextsAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__Group_1_0__1__Impl"


    // $ANTLR start "rule__FloatingText__Group__0"
    // InternalCanvas.g:2310:1: rule__FloatingText__Group__0 : rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1 ;
    public final void rule__FloatingText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2314:1: ( rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1 )
            // InternalCanvas.g:2315:2: rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCanvas.g:2322:1: rule__FloatingText__Group__0__Impl : ( () ) ;
    public final void rule__FloatingText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2326:1: ( ( () ) )
            // InternalCanvas.g:2327:1: ( () )
            {
            // InternalCanvas.g:2327:1: ( () )
            // InternalCanvas.g:2328:2: ()
            {
             before(grammarAccess.getFloatingTextAccess().getFloatingTextAction_0()); 
            // InternalCanvas.g:2329:2: ()
            // InternalCanvas.g:2329:3: 
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
    // InternalCanvas.g:2337:1: rule__FloatingText__Group__1 : rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2 ;
    public final void rule__FloatingText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2341:1: ( rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2 )
            // InternalCanvas.g:2342:2: rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCanvas.g:2349:1: rule__FloatingText__Group__1__Impl : ( ( rule__FloatingText__Alternatives_1 ) ) ;
    public final void rule__FloatingText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2353:1: ( ( ( rule__FloatingText__Alternatives_1 ) ) )
            // InternalCanvas.g:2354:1: ( ( rule__FloatingText__Alternatives_1 ) )
            {
            // InternalCanvas.g:2354:1: ( ( rule__FloatingText__Alternatives_1 ) )
            // InternalCanvas.g:2355:2: ( rule__FloatingText__Alternatives_1 )
            {
             before(grammarAccess.getFloatingTextAccess().getAlternatives_1()); 
            // InternalCanvas.g:2356:2: ( rule__FloatingText__Alternatives_1 )
            // InternalCanvas.g:2356:3: rule__FloatingText__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCanvas.g:2364:1: rule__FloatingText__Group__2 : rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3 ;
    public final void rule__FloatingText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2368:1: ( rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3 )
            // InternalCanvas.g:2369:2: rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalCanvas.g:2376:1: rule__FloatingText__Group__2__Impl : ( ( rule__FloatingText__RectAssignment_2 ) ) ;
    public final void rule__FloatingText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2380:1: ( ( ( rule__FloatingText__RectAssignment_2 ) ) )
            // InternalCanvas.g:2381:1: ( ( rule__FloatingText__RectAssignment_2 ) )
            {
            // InternalCanvas.g:2381:1: ( ( rule__FloatingText__RectAssignment_2 ) )
            // InternalCanvas.g:2382:2: ( rule__FloatingText__RectAssignment_2 )
            {
             before(grammarAccess.getFloatingTextAccess().getRectAssignment_2()); 
            // InternalCanvas.g:2383:2: ( rule__FloatingText__RectAssignment_2 )
            // InternalCanvas.g:2383:3: rule__FloatingText__RectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__RectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextAccess().getRectAssignment_2()); 

            }


            }

        }
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
    // InternalCanvas.g:2391:1: rule__FloatingText__Group__3 : rule__FloatingText__Group__3__Impl ;
    public final void rule__FloatingText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2395:1: ( rule__FloatingText__Group__3__Impl )
            // InternalCanvas.g:2396:2: rule__FloatingText__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:2402:1: rule__FloatingText__Group__3__Impl : ( ( rule__FloatingText__EndAssignment_3 ) ) ;
    public final void rule__FloatingText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2406:1: ( ( ( rule__FloatingText__EndAssignment_3 ) ) )
            // InternalCanvas.g:2407:1: ( ( rule__FloatingText__EndAssignment_3 ) )
            {
            // InternalCanvas.g:2407:1: ( ( rule__FloatingText__EndAssignment_3 ) )
            // InternalCanvas.g:2408:2: ( rule__FloatingText__EndAssignment_3 )
            {
             before(grammarAccess.getFloatingTextAccess().getEndAssignment_3()); 
            // InternalCanvas.g:2409:2: ( rule__FloatingText__EndAssignment_3 )
            // InternalCanvas.g:2409:3: rule__FloatingText__EndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__EndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextAccess().getEndAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__FloatingText__Group_1_0__0"
    // InternalCanvas.g:2418:1: rule__FloatingText__Group_1_0__0 : rule__FloatingText__Group_1_0__0__Impl rule__FloatingText__Group_1_0__1 ;
    public final void rule__FloatingText__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2422:1: ( rule__FloatingText__Group_1_0__0__Impl rule__FloatingText__Group_1_0__1 )
            // InternalCanvas.g:2423:2: rule__FloatingText__Group_1_0__0__Impl rule__FloatingText__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__FloatingText__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatingText__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group_1_0__0"


    // $ANTLR start "rule__FloatingText__Group_1_0__0__Impl"
    // InternalCanvas.g:2430:1: rule__FloatingText__Group_1_0__0__Impl : ( 'text' ) ;
    public final void rule__FloatingText__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2434:1: ( ( 'text' ) )
            // InternalCanvas.g:2435:1: ( 'text' )
            {
            // InternalCanvas.g:2435:1: ( 'text' )
            // InternalCanvas.g:2436:2: 'text'
            {
             before(grammarAccess.getFloatingTextAccess().getTextKeyword_1_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFloatingTextAccess().getTextKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group_1_0__0__Impl"


    // $ANTLR start "rule__FloatingText__Group_1_0__1"
    // InternalCanvas.g:2445:1: rule__FloatingText__Group_1_0__1 : rule__FloatingText__Group_1_0__1__Impl ;
    public final void rule__FloatingText__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2449:1: ( rule__FloatingText__Group_1_0__1__Impl )
            // InternalCanvas.g:2450:2: rule__FloatingText__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group_1_0__1"


    // $ANTLR start "rule__FloatingText__Group_1_0__1__Impl"
    // InternalCanvas.g:2456:1: rule__FloatingText__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__FloatingText__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2460:1: ( ( ':' ) )
            // InternalCanvas.g:2461:1: ( ':' )
            {
            // InternalCanvas.g:2461:1: ( ':' )
            // InternalCanvas.g:2462:2: ':'
            {
             before(grammarAccess.getFloatingTextAccess().getColonKeyword_1_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFloatingTextAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__Group_1_0__1__Impl"


    // $ANTLR start "rule__EnumEnd__Group__0"
    // InternalCanvas.g:2472:1: rule__EnumEnd__Group__0 : rule__EnumEnd__Group__0__Impl rule__EnumEnd__Group__1 ;
    public final void rule__EnumEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2476:1: ( rule__EnumEnd__Group__0__Impl rule__EnumEnd__Group__1 )
            // InternalCanvas.g:2477:2: rule__EnumEnd__Group__0__Impl rule__EnumEnd__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCanvas.g:2484:1: rule__EnumEnd__Group__0__Impl : ( ( rule__EnumEnd__Alternatives_0 ) ) ;
    public final void rule__EnumEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2488:1: ( ( ( rule__EnumEnd__Alternatives_0 ) ) )
            // InternalCanvas.g:2489:1: ( ( rule__EnumEnd__Alternatives_0 ) )
            {
            // InternalCanvas.g:2489:1: ( ( rule__EnumEnd__Alternatives_0 ) )
            // InternalCanvas.g:2490:2: ( rule__EnumEnd__Alternatives_0 )
            {
             before(grammarAccess.getEnumEndAccess().getAlternatives_0()); 
            // InternalCanvas.g:2491:2: ( rule__EnumEnd__Alternatives_0 )
            // InternalCanvas.g:2491:3: rule__EnumEnd__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumEndAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:2499:1: rule__EnumEnd__Group__1 : rule__EnumEnd__Group__1__Impl ;
    public final void rule__EnumEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2503:1: ( rule__EnumEnd__Group__1__Impl )
            // InternalCanvas.g:2504:2: rule__EnumEnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:2510:1: rule__EnumEnd__Group__1__Impl : ( ( rule__EnumEnd__WhereAssignment_1 ) ) ;
    public final void rule__EnumEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2514:1: ( ( ( rule__EnumEnd__WhereAssignment_1 ) ) )
            // InternalCanvas.g:2515:1: ( ( rule__EnumEnd__WhereAssignment_1 ) )
            {
            // InternalCanvas.g:2515:1: ( ( rule__EnumEnd__WhereAssignment_1 ) )
            // InternalCanvas.g:2516:2: ( rule__EnumEnd__WhereAssignment_1 )
            {
             before(grammarAccess.getEnumEndAccess().getWhereAssignment_1()); 
            // InternalCanvas.g:2517:2: ( rule__EnumEnd__WhereAssignment_1 )
            // InternalCanvas.g:2517:3: rule__EnumEnd__WhereAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__WhereAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumEndAccess().getWhereAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumEnd__Group_0_0__0"
    // InternalCanvas.g:2526:1: rule__EnumEnd__Group_0_0__0 : rule__EnumEnd__Group_0_0__0__Impl rule__EnumEnd__Group_0_0__1 ;
    public final void rule__EnumEnd__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2530:1: ( rule__EnumEnd__Group_0_0__0__Impl rule__EnumEnd__Group_0_0__1 )
            // InternalCanvas.g:2531:2: rule__EnumEnd__Group_0_0__0__Impl rule__EnumEnd__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__EnumEnd__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumEnd__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group_0_0__0"


    // $ANTLR start "rule__EnumEnd__Group_0_0__0__Impl"
    // InternalCanvas.g:2538:1: rule__EnumEnd__Group_0_0__0__Impl : ( 'where' ) ;
    public final void rule__EnumEnd__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2542:1: ( ( 'where' ) )
            // InternalCanvas.g:2543:1: ( 'where' )
            {
            // InternalCanvas.g:2543:1: ( 'where' )
            // InternalCanvas.g:2544:2: 'where'
            {
             before(grammarAccess.getEnumEndAccess().getWhereKeyword_0_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEnumEndAccess().getWhereKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group_0_0__0__Impl"


    // $ANTLR start "rule__EnumEnd__Group_0_0__1"
    // InternalCanvas.g:2553:1: rule__EnumEnd__Group_0_0__1 : rule__EnumEnd__Group_0_0__1__Impl ;
    public final void rule__EnumEnd__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2557:1: ( rule__EnumEnd__Group_0_0__1__Impl )
            // InternalCanvas.g:2558:2: rule__EnumEnd__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group_0_0__1"


    // $ANTLR start "rule__EnumEnd__Group_0_0__1__Impl"
    // InternalCanvas.g:2564:1: rule__EnumEnd__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__EnumEnd__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2568:1: ( ( ':' ) )
            // InternalCanvas.g:2569:1: ( ':' )
            {
            // InternalCanvas.g:2569:1: ( ':' )
            // InternalCanvas.g:2570:2: ':'
            {
             before(grammarAccess.getEnumEndAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEnumEndAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__Group_0_0__1__Impl"


    // $ANTLR start "rule__Connectors__Group__0"
    // InternalCanvas.g:2580:1: rule__Connectors__Group__0 : rule__Connectors__Group__0__Impl rule__Connectors__Group__1 ;
    public final void rule__Connectors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2584:1: ( rule__Connectors__Group__0__Impl rule__Connectors__Group__1 )
            // InternalCanvas.g:2585:2: rule__Connectors__Group__0__Impl rule__Connectors__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCanvas.g:2592:1: rule__Connectors__Group__0__Impl : ( () ) ;
    public final void rule__Connectors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2596:1: ( ( () ) )
            // InternalCanvas.g:2597:1: ( () )
            {
            // InternalCanvas.g:2597:1: ( () )
            // InternalCanvas.g:2598:2: ()
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsAction_0()); 
            // InternalCanvas.g:2599:2: ()
            // InternalCanvas.g:2599:3: 
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
    // InternalCanvas.g:2607:1: rule__Connectors__Group__1 : rule__Connectors__Group__1__Impl rule__Connectors__Group__2 ;
    public final void rule__Connectors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2611:1: ( rule__Connectors__Group__1__Impl rule__Connectors__Group__2 )
            // InternalCanvas.g:2612:2: rule__Connectors__Group__1__Impl rule__Connectors__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalCanvas.g:2619:1: rule__Connectors__Group__1__Impl : ( ( rule__Connectors__Alternatives_1 ) ) ;
    public final void rule__Connectors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2623:1: ( ( ( rule__Connectors__Alternatives_1 ) ) )
            // InternalCanvas.g:2624:1: ( ( rule__Connectors__Alternatives_1 ) )
            {
            // InternalCanvas.g:2624:1: ( ( rule__Connectors__Alternatives_1 ) )
            // InternalCanvas.g:2625:2: ( rule__Connectors__Alternatives_1 )
            {
             before(grammarAccess.getConnectorsAccess().getAlternatives_1()); 
            // InternalCanvas.g:2626:2: ( rule__Connectors__Alternatives_1 )
            // InternalCanvas.g:2626:3: rule__Connectors__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Connectors__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorsAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCanvas.g:2634:1: rule__Connectors__Group__2 : rule__Connectors__Group__2__Impl ;
    public final void rule__Connectors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2638:1: ( rule__Connectors__Group__2__Impl )
            // InternalCanvas.g:2639:2: rule__Connectors__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connectors__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:2645:1: rule__Connectors__Group__2__Impl : ( ( rule__Connectors__ConnectorsAssignment_2 )* ) ;
    public final void rule__Connectors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2649:1: ( ( ( rule__Connectors__ConnectorsAssignment_2 )* ) )
            // InternalCanvas.g:2650:1: ( ( rule__Connectors__ConnectorsAssignment_2 )* )
            {
            // InternalCanvas.g:2650:1: ( ( rule__Connectors__ConnectorsAssignment_2 )* )
            // InternalCanvas.g:2651:2: ( rule__Connectors__ConnectorsAssignment_2 )*
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsAssignment_2()); 
            // InternalCanvas.g:2652:2: ( rule__Connectors__ConnectorsAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==30||LA34_0==49) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCanvas.g:2652:3: rule__Connectors__ConnectorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Connectors__ConnectorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getConnectorsAccess().getConnectorsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Connectors__Group_1_0__0"
    // InternalCanvas.g:2661:1: rule__Connectors__Group_1_0__0 : rule__Connectors__Group_1_0__0__Impl rule__Connectors__Group_1_0__1 ;
    public final void rule__Connectors__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2665:1: ( rule__Connectors__Group_1_0__0__Impl rule__Connectors__Group_1_0__1 )
            // InternalCanvas.g:2666:2: rule__Connectors__Group_1_0__0__Impl rule__Connectors__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Connectors__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connectors__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group_1_0__0"


    // $ANTLR start "rule__Connectors__Group_1_0__0__Impl"
    // InternalCanvas.g:2673:1: rule__Connectors__Group_1_0__0__Impl : ( 'connectors' ) ;
    public final void rule__Connectors__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2677:1: ( ( 'connectors' ) )
            // InternalCanvas.g:2678:1: ( 'connectors' )
            {
            // InternalCanvas.g:2678:1: ( 'connectors' )
            // InternalCanvas.g:2679:2: 'connectors'
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group_1_0__0__Impl"


    // $ANTLR start "rule__Connectors__Group_1_0__1"
    // InternalCanvas.g:2688:1: rule__Connectors__Group_1_0__1 : rule__Connectors__Group_1_0__1__Impl ;
    public final void rule__Connectors__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2692:1: ( rule__Connectors__Group_1_0__1__Impl )
            // InternalCanvas.g:2693:2: rule__Connectors__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connectors__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group_1_0__1"


    // $ANTLR start "rule__Connectors__Group_1_0__1__Impl"
    // InternalCanvas.g:2699:1: rule__Connectors__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Connectors__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2703:1: ( ( ':' ) )
            // InternalCanvas.g:2704:1: ( ':' )
            {
            // InternalCanvas.g:2704:1: ( ':' )
            // InternalCanvas.g:2705:2: ':'
            {
             before(grammarAccess.getConnectorsAccess().getColonKeyword_1_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConnectorsAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__Group_1_0__1__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalCanvas.g:2715:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2719:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalCanvas.g:2720:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCanvas.g:2727:1: rule__Connector__Group__0__Impl : ( ( rule__Connector__Alternatives_0 ) ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2731:1: ( ( ( rule__Connector__Alternatives_0 ) ) )
            // InternalCanvas.g:2732:1: ( ( rule__Connector__Alternatives_0 ) )
            {
            // InternalCanvas.g:2732:1: ( ( rule__Connector__Alternatives_0 ) )
            // InternalCanvas.g:2733:2: ( rule__Connector__Alternatives_0 )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives_0()); 
            // InternalCanvas.g:2734:2: ( rule__Connector__Alternatives_0 )
            // InternalCanvas.g:2734:3: rule__Connector__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:2742:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2746:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalCanvas.g:2747:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalCanvas.g:2754:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2758:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // InternalCanvas.g:2759:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // InternalCanvas.g:2759:1: ( ( rule__Connector__NameAssignment_1 ) )
            // InternalCanvas.g:2760:2: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // InternalCanvas.g:2761:2: ( rule__Connector__NameAssignment_1 )
            // InternalCanvas.g:2761:3: rule__Connector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCanvas.g:2769:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2773:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalCanvas.g:2774:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalCanvas.g:2781:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__Alternatives_2 ) ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2785:1: ( ( ( rule__Connector__Alternatives_2 ) ) )
            // InternalCanvas.g:2786:1: ( ( rule__Connector__Alternatives_2 ) )
            {
            // InternalCanvas.g:2786:1: ( ( rule__Connector__Alternatives_2 ) )
            // InternalCanvas.g:2787:2: ( rule__Connector__Alternatives_2 )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives_2()); 
            // InternalCanvas.g:2788:2: ( rule__Connector__Alternatives_2 )
            // InternalCanvas.g:2788:3: rule__Connector__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalCanvas.g:2796:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2800:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalCanvas.g:2801:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalCanvas.g:2808:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__RepresentsAssignment_3 ) ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2812:1: ( ( ( rule__Connector__RepresentsAssignment_3 ) ) )
            // InternalCanvas.g:2813:1: ( ( rule__Connector__RepresentsAssignment_3 ) )
            {
            // InternalCanvas.g:2813:1: ( ( rule__Connector__RepresentsAssignment_3 ) )
            // InternalCanvas.g:2814:2: ( rule__Connector__RepresentsAssignment_3 )
            {
             before(grammarAccess.getConnectorAccess().getRepresentsAssignment_3()); 
            // InternalCanvas.g:2815:2: ( rule__Connector__RepresentsAssignment_3 )
            // InternalCanvas.g:2815:3: rule__Connector__RepresentsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Connector__RepresentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getRepresentsAssignment_3()); 

            }


            }

        }
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
    // InternalCanvas.g:2823:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl rule__Connector__Group__5 ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2827:1: ( rule__Connector__Group__4__Impl rule__Connector__Group__5 )
            // InternalCanvas.g:2828:2: rule__Connector__Group__4__Impl rule__Connector__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalCanvas.g:2835:1: rule__Connector__Group__4__Impl : ( ( rule__Connector__PolylineAssignment_4 ) ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2839:1: ( ( ( rule__Connector__PolylineAssignment_4 ) ) )
            // InternalCanvas.g:2840:1: ( ( rule__Connector__PolylineAssignment_4 ) )
            {
            // InternalCanvas.g:2840:1: ( ( rule__Connector__PolylineAssignment_4 ) )
            // InternalCanvas.g:2841:2: ( rule__Connector__PolylineAssignment_4 )
            {
             before(grammarAccess.getConnectorAccess().getPolylineAssignment_4()); 
            // InternalCanvas.g:2842:2: ( rule__Connector__PolylineAssignment_4 )
            // InternalCanvas.g:2842:3: rule__Connector__PolylineAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Connector__PolylineAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getPolylineAssignment_4()); 

            }


            }

        }
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
    // InternalCanvas.g:2850:1: rule__Connector__Group__5 : rule__Connector__Group__5__Impl rule__Connector__Group__6 ;
    public final void rule__Connector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2854:1: ( rule__Connector__Group__5__Impl rule__Connector__Group__6 )
            // InternalCanvas.g:2855:2: rule__Connector__Group__5__Impl rule__Connector__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalCanvas.g:2862:1: rule__Connector__Group__5__Impl : ( ( rule__Connector__AnchorsAssignment_5 )? ) ;
    public final void rule__Connector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2866:1: ( ( ( rule__Connector__AnchorsAssignment_5 )? ) )
            // InternalCanvas.g:2867:1: ( ( rule__Connector__AnchorsAssignment_5 )? )
            {
            // InternalCanvas.g:2867:1: ( ( rule__Connector__AnchorsAssignment_5 )? )
            // InternalCanvas.g:2868:2: ( rule__Connector__AnchorsAssignment_5 )?
            {
             before(grammarAccess.getConnectorAccess().getAnchorsAssignment_5()); 
            // InternalCanvas.g:2869:2: ( rule__Connector__AnchorsAssignment_5 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31||LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCanvas.g:2869:3: rule__Connector__AnchorsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__AnchorsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorAccess().getAnchorsAssignment_5()); 

            }


            }

        }
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
    // InternalCanvas.g:2877:1: rule__Connector__Group__6 : rule__Connector__Group__6__Impl ;
    public final void rule__Connector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2881:1: ( rule__Connector__Group__6__Impl )
            // InternalCanvas.g:2882:2: rule__Connector__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:2888:1: rule__Connector__Group__6__Impl : ( ( rule__Connector__TextsAssignment_6 ) ) ;
    public final void rule__Connector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2892:1: ( ( ( rule__Connector__TextsAssignment_6 ) ) )
            // InternalCanvas.g:2893:1: ( ( rule__Connector__TextsAssignment_6 ) )
            {
            // InternalCanvas.g:2893:1: ( ( rule__Connector__TextsAssignment_6 ) )
            // InternalCanvas.g:2894:2: ( rule__Connector__TextsAssignment_6 )
            {
             before(grammarAccess.getConnectorAccess().getTextsAssignment_6()); 
            // InternalCanvas.g:2895:2: ( rule__Connector__TextsAssignment_6 )
            // InternalCanvas.g:2895:3: rule__Connector__TextsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Connector__TextsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTextsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Connector__Group_0_0__0"
    // InternalCanvas.g:2904:1: rule__Connector__Group_0_0__0 : rule__Connector__Group_0_0__0__Impl rule__Connector__Group_0_0__1 ;
    public final void rule__Connector__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2908:1: ( rule__Connector__Group_0_0__0__Impl rule__Connector__Group_0_0__1 )
            // InternalCanvas.g:2909:2: rule__Connector__Group_0_0__0__Impl rule__Connector__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Connector__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_0_0__0"


    // $ANTLR start "rule__Connector__Group_0_0__0__Impl"
    // InternalCanvas.g:2916:1: rule__Connector__Group_0_0__0__Impl : ( 'connector' ) ;
    public final void rule__Connector__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2920:1: ( ( 'connector' ) )
            // InternalCanvas.g:2921:1: ( 'connector' )
            {
            // InternalCanvas.g:2921:1: ( 'connector' )
            // InternalCanvas.g:2922:2: 'connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getConnectorKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_0_0__0__Impl"


    // $ANTLR start "rule__Connector__Group_0_0__1"
    // InternalCanvas.g:2931:1: rule__Connector__Group_0_0__1 : rule__Connector__Group_0_0__1__Impl ;
    public final void rule__Connector__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2935:1: ( rule__Connector__Group_0_0__1__Impl )
            // InternalCanvas.g:2936:2: rule__Connector__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_0_0__1"


    // $ANTLR start "rule__Connector__Group_0_0__1__Impl"
    // InternalCanvas.g:2942:1: rule__Connector__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Connector__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2946:1: ( ( ':' ) )
            // InternalCanvas.g:2947:1: ( ':' )
            {
            // InternalCanvas.g:2947:1: ( ':' )
            // InternalCanvas.g:2948:2: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_0_0__1__Impl"


    // $ANTLR start "rule__Connector__Group_2_0__0"
    // InternalCanvas.g:2958:1: rule__Connector__Group_2_0__0 : rule__Connector__Group_2_0__0__Impl rule__Connector__Group_2_0__1 ;
    public final void rule__Connector__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2962:1: ( rule__Connector__Group_2_0__0__Impl rule__Connector__Group_2_0__1 )
            // InternalCanvas.g:2963:2: rule__Connector__Group_2_0__0__Impl rule__Connector__Group_2_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Connector__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_2_0__0"


    // $ANTLR start "rule__Connector__Group_2_0__0__Impl"
    // InternalCanvas.g:2970:1: rule__Connector__Group_2_0__0__Impl : ( 'render' ) ;
    public final void rule__Connector__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2974:1: ( ( 'render' ) )
            // InternalCanvas.g:2975:1: ( 'render' )
            {
            // InternalCanvas.g:2975:1: ( 'render' )
            // InternalCanvas.g:2976:2: 'render'
            {
             before(grammarAccess.getConnectorAccess().getRenderKeyword_2_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRenderKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_2_0__0__Impl"


    // $ANTLR start "rule__Connector__Group_2_0__1"
    // InternalCanvas.g:2985:1: rule__Connector__Group_2_0__1 : rule__Connector__Group_2_0__1__Impl ;
    public final void rule__Connector__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2989:1: ( rule__Connector__Group_2_0__1__Impl )
            // InternalCanvas.g:2990:2: rule__Connector__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_2_0__1"


    // $ANTLR start "rule__Connector__Group_2_0__1__Impl"
    // InternalCanvas.g:2996:1: rule__Connector__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__Connector__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3000:1: ( ( ':' ) )
            // InternalCanvas.g:3001:1: ( ':' )
            {
            // InternalCanvas.g:3001:1: ( ':' )
            // InternalCanvas.g:3002:2: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_2_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getColonKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_2_0__1__Impl"


    // $ANTLR start "rule__Anchors__Group__0"
    // InternalCanvas.g:3012:1: rule__Anchors__Group__0 : rule__Anchors__Group__0__Impl rule__Anchors__Group__1 ;
    public final void rule__Anchors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3016:1: ( rule__Anchors__Group__0__Impl rule__Anchors__Group__1 )
            // InternalCanvas.g:3017:2: rule__Anchors__Group__0__Impl rule__Anchors__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCanvas.g:3024:1: rule__Anchors__Group__0__Impl : ( ( rule__Anchors__Alternatives_0 ) ) ;
    public final void rule__Anchors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3028:1: ( ( ( rule__Anchors__Alternatives_0 ) ) )
            // InternalCanvas.g:3029:1: ( ( rule__Anchors__Alternatives_0 ) )
            {
            // InternalCanvas.g:3029:1: ( ( rule__Anchors__Alternatives_0 ) )
            // InternalCanvas.g:3030:2: ( rule__Anchors__Alternatives_0 )
            {
             before(grammarAccess.getAnchorsAccess().getAlternatives_0()); 
            // InternalCanvas.g:3031:2: ( rule__Anchors__Alternatives_0 )
            // InternalCanvas.g:3031:3: rule__Anchors__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Anchors__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAnchorsAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:3039:1: rule__Anchors__Group__1 : rule__Anchors__Group__1__Impl rule__Anchors__Group__2 ;
    public final void rule__Anchors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3043:1: ( rule__Anchors__Group__1__Impl rule__Anchors__Group__2 )
            // InternalCanvas.g:3044:2: rule__Anchors__Group__1__Impl rule__Anchors__Group__2
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
    // InternalCanvas.g:3051:1: rule__Anchors__Group__1__Impl : ( ( rule__Anchors__StartAnchorAssignment_1 ) ) ;
    public final void rule__Anchors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3055:1: ( ( ( rule__Anchors__StartAnchorAssignment_1 ) ) )
            // InternalCanvas.g:3056:1: ( ( rule__Anchors__StartAnchorAssignment_1 ) )
            {
            // InternalCanvas.g:3056:1: ( ( rule__Anchors__StartAnchorAssignment_1 ) )
            // InternalCanvas.g:3057:2: ( rule__Anchors__StartAnchorAssignment_1 )
            {
             before(grammarAccess.getAnchorsAccess().getStartAnchorAssignment_1()); 
            // InternalCanvas.g:3058:2: ( rule__Anchors__StartAnchorAssignment_1 )
            // InternalCanvas.g:3058:3: rule__Anchors__StartAnchorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Anchors__StartAnchorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnchorsAccess().getStartAnchorAssignment_1()); 

            }


            }

        }
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
    // InternalCanvas.g:3066:1: rule__Anchors__Group__2 : rule__Anchors__Group__2__Impl ;
    public final void rule__Anchors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3070:1: ( rule__Anchors__Group__2__Impl )
            // InternalCanvas.g:3071:2: rule__Anchors__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Anchors__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:3077:1: rule__Anchors__Group__2__Impl : ( ( rule__Anchors__EndAnchorAssignment_2 ) ) ;
    public final void rule__Anchors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3081:1: ( ( ( rule__Anchors__EndAnchorAssignment_2 ) ) )
            // InternalCanvas.g:3082:1: ( ( rule__Anchors__EndAnchorAssignment_2 ) )
            {
            // InternalCanvas.g:3082:1: ( ( rule__Anchors__EndAnchorAssignment_2 ) )
            // InternalCanvas.g:3083:2: ( rule__Anchors__EndAnchorAssignment_2 )
            {
             before(grammarAccess.getAnchorsAccess().getEndAnchorAssignment_2()); 
            // InternalCanvas.g:3084:2: ( rule__Anchors__EndAnchorAssignment_2 )
            // InternalCanvas.g:3084:3: rule__Anchors__EndAnchorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Anchors__EndAnchorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnchorsAccess().getEndAnchorAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Anchors__Group_0_0__0"
    // InternalCanvas.g:3093:1: rule__Anchors__Group_0_0__0 : rule__Anchors__Group_0_0__0__Impl rule__Anchors__Group_0_0__1 ;
    public final void rule__Anchors__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3097:1: ( rule__Anchors__Group_0_0__0__Impl rule__Anchors__Group_0_0__1 )
            // InternalCanvas.g:3098:2: rule__Anchors__Group_0_0__0__Impl rule__Anchors__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Anchors__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anchors__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group_0_0__0"


    // $ANTLR start "rule__Anchors__Group_0_0__0__Impl"
    // InternalCanvas.g:3105:1: rule__Anchors__Group_0_0__0__Impl : ( 'anchors' ) ;
    public final void rule__Anchors__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3109:1: ( ( 'anchors' ) )
            // InternalCanvas.g:3110:1: ( 'anchors' )
            {
            // InternalCanvas.g:3110:1: ( 'anchors' )
            // InternalCanvas.g:3111:2: 'anchors'
            {
             before(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group_0_0__0__Impl"


    // $ANTLR start "rule__Anchors__Group_0_0__1"
    // InternalCanvas.g:3120:1: rule__Anchors__Group_0_0__1 : rule__Anchors__Group_0_0__1__Impl ;
    public final void rule__Anchors__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3124:1: ( rule__Anchors__Group_0_0__1__Impl )
            // InternalCanvas.g:3125:2: rule__Anchors__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Anchors__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group_0_0__1"


    // $ANTLR start "rule__Anchors__Group_0_0__1__Impl"
    // InternalCanvas.g:3131:1: rule__Anchors__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Anchors__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3135:1: ( ( ':' ) )
            // InternalCanvas.g:3136:1: ( ':' )
            {
            // InternalCanvas.g:3136:1: ( ':' )
            // InternalCanvas.g:3137:2: ':'
            {
             before(grammarAccess.getAnchorsAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAnchorsAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__Group_0_0__1__Impl"


    // $ANTLR start "rule__StartAnchor__Group__0"
    // InternalCanvas.g:3147:1: rule__StartAnchor__Group__0 : rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1 ;
    public final void rule__StartAnchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3151:1: ( rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1 )
            // InternalCanvas.g:3152:2: rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCanvas.g:3159:1: rule__StartAnchor__Group__0__Impl : ( ( rule__StartAnchor__Alternatives_0 ) ) ;
    public final void rule__StartAnchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3163:1: ( ( ( rule__StartAnchor__Alternatives_0 ) ) )
            // InternalCanvas.g:3164:1: ( ( rule__StartAnchor__Alternatives_0 ) )
            {
            // InternalCanvas.g:3164:1: ( ( rule__StartAnchor__Alternatives_0 ) )
            // InternalCanvas.g:3165:2: ( rule__StartAnchor__Alternatives_0 )
            {
             before(grammarAccess.getStartAnchorAccess().getAlternatives_0()); 
            // InternalCanvas.g:3166:2: ( rule__StartAnchor__Alternatives_0 )
            // InternalCanvas.g:3166:3: rule__StartAnchor__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__StartAnchor__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStartAnchorAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:3174:1: rule__StartAnchor__Group__1 : rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2 ;
    public final void rule__StartAnchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3178:1: ( rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2 )
            // InternalCanvas.g:3179:2: rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2
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
    // InternalCanvas.g:3186:1: rule__StartAnchor__Group__1__Impl : ( ( rule__StartAnchor__PointAssignment_1 ) ) ;
    public final void rule__StartAnchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3190:1: ( ( ( rule__StartAnchor__PointAssignment_1 ) ) )
            // InternalCanvas.g:3191:1: ( ( rule__StartAnchor__PointAssignment_1 ) )
            {
            // InternalCanvas.g:3191:1: ( ( rule__StartAnchor__PointAssignment_1 ) )
            // InternalCanvas.g:3192:2: ( rule__StartAnchor__PointAssignment_1 )
            {
             before(grammarAccess.getStartAnchorAccess().getPointAssignment_1()); 
            // InternalCanvas.g:3193:2: ( rule__StartAnchor__PointAssignment_1 )
            // InternalCanvas.g:3193:3: rule__StartAnchor__PointAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StartAnchor__PointAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartAnchorAccess().getPointAssignment_1()); 

            }


            }

        }
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
    // InternalCanvas.g:3201:1: rule__StartAnchor__Group__2 : rule__StartAnchor__Group__2__Impl ;
    public final void rule__StartAnchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3205:1: ( rule__StartAnchor__Group__2__Impl )
            // InternalCanvas.g:3206:2: rule__StartAnchor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartAnchor__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:3212:1: rule__StartAnchor__Group__2__Impl : ( ( rule__StartAnchor__AnchorAssignment_2 )? ) ;
    public final void rule__StartAnchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3216:1: ( ( ( rule__StartAnchor__AnchorAssignment_2 )? ) )
            // InternalCanvas.g:3217:1: ( ( rule__StartAnchor__AnchorAssignment_2 )? )
            {
            // InternalCanvas.g:3217:1: ( ( rule__StartAnchor__AnchorAssignment_2 )? )
            // InternalCanvas.g:3218:2: ( rule__StartAnchor__AnchorAssignment_2 )?
            {
             before(grammarAccess.getStartAnchorAccess().getAnchorAssignment_2()); 
            // InternalCanvas.g:3219:2: ( rule__StartAnchor__AnchorAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17||LA36_0==30||LA36_0==44||LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCanvas.g:3219:3: rule__StartAnchor__AnchorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__StartAnchor__AnchorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartAnchorAccess().getAnchorAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__StartAnchor__Group_0_0__0"
    // InternalCanvas.g:3228:1: rule__StartAnchor__Group_0_0__0 : rule__StartAnchor__Group_0_0__0__Impl rule__StartAnchor__Group_0_0__1 ;
    public final void rule__StartAnchor__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3232:1: ( rule__StartAnchor__Group_0_0__0__Impl rule__StartAnchor__Group_0_0__1 )
            // InternalCanvas.g:3233:2: rule__StartAnchor__Group_0_0__0__Impl rule__StartAnchor__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__StartAnchor__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartAnchor__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group_0_0__0"


    // $ANTLR start "rule__StartAnchor__Group_0_0__0__Impl"
    // InternalCanvas.g:3240:1: rule__StartAnchor__Group_0_0__0__Impl : ( 'start' ) ;
    public final void rule__StartAnchor__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3244:1: ( ( 'start' ) )
            // InternalCanvas.g:3245:1: ( 'start' )
            {
            // InternalCanvas.g:3245:1: ( 'start' )
            // InternalCanvas.g:3246:2: 'start'
            {
             before(grammarAccess.getStartAnchorAccess().getStartKeyword_0_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStartAnchorAccess().getStartKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group_0_0__0__Impl"


    // $ANTLR start "rule__StartAnchor__Group_0_0__1"
    // InternalCanvas.g:3255:1: rule__StartAnchor__Group_0_0__1 : rule__StartAnchor__Group_0_0__1__Impl ;
    public final void rule__StartAnchor__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3259:1: ( rule__StartAnchor__Group_0_0__1__Impl )
            // InternalCanvas.g:3260:2: rule__StartAnchor__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartAnchor__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group_0_0__1"


    // $ANTLR start "rule__StartAnchor__Group_0_0__1__Impl"
    // InternalCanvas.g:3266:1: rule__StartAnchor__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__StartAnchor__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3270:1: ( ( ':' ) )
            // InternalCanvas.g:3271:1: ( ':' )
            {
            // InternalCanvas.g:3271:1: ( ':' )
            // InternalCanvas.g:3272:2: ':'
            {
             before(grammarAccess.getStartAnchorAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStartAnchorAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__Group_0_0__1__Impl"


    // $ANTLR start "rule__EndAnchor__Group__0"
    // InternalCanvas.g:3282:1: rule__EndAnchor__Group__0 : rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1 ;
    public final void rule__EndAnchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3286:1: ( rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1 )
            // InternalCanvas.g:3287:2: rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCanvas.g:3294:1: rule__EndAnchor__Group__0__Impl : ( ( rule__EndAnchor__Alternatives_0 ) ) ;
    public final void rule__EndAnchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3298:1: ( ( ( rule__EndAnchor__Alternatives_0 ) ) )
            // InternalCanvas.g:3299:1: ( ( rule__EndAnchor__Alternatives_0 ) )
            {
            // InternalCanvas.g:3299:1: ( ( rule__EndAnchor__Alternatives_0 ) )
            // InternalCanvas.g:3300:2: ( rule__EndAnchor__Alternatives_0 )
            {
             before(grammarAccess.getEndAnchorAccess().getAlternatives_0()); 
            // InternalCanvas.g:3301:2: ( rule__EndAnchor__Alternatives_0 )
            // InternalCanvas.g:3301:3: rule__EndAnchor__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__EndAnchor__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEndAnchorAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:3309:1: rule__EndAnchor__Group__1 : rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2 ;
    public final void rule__EndAnchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3313:1: ( rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2 )
            // InternalCanvas.g:3314:2: rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2
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
    // InternalCanvas.g:3321:1: rule__EndAnchor__Group__1__Impl : ( ( rule__EndAnchor__PointAssignment_1 ) ) ;
    public final void rule__EndAnchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3325:1: ( ( ( rule__EndAnchor__PointAssignment_1 ) ) )
            // InternalCanvas.g:3326:1: ( ( rule__EndAnchor__PointAssignment_1 ) )
            {
            // InternalCanvas.g:3326:1: ( ( rule__EndAnchor__PointAssignment_1 ) )
            // InternalCanvas.g:3327:2: ( rule__EndAnchor__PointAssignment_1 )
            {
             before(grammarAccess.getEndAnchorAccess().getPointAssignment_1()); 
            // InternalCanvas.g:3328:2: ( rule__EndAnchor__PointAssignment_1 )
            // InternalCanvas.g:3328:3: rule__EndAnchor__PointAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EndAnchor__PointAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEndAnchorAccess().getPointAssignment_1()); 

            }


            }

        }
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
    // InternalCanvas.g:3336:1: rule__EndAnchor__Group__2 : rule__EndAnchor__Group__2__Impl ;
    public final void rule__EndAnchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3340:1: ( rule__EndAnchor__Group__2__Impl )
            // InternalCanvas.g:3341:2: rule__EndAnchor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndAnchor__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:3347:1: rule__EndAnchor__Group__2__Impl : ( ( rule__EndAnchor__AnchorAssignment_2 )? ) ;
    public final void rule__EndAnchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3351:1: ( ( ( rule__EndAnchor__AnchorAssignment_2 )? ) )
            // InternalCanvas.g:3352:1: ( ( rule__EndAnchor__AnchorAssignment_2 )? )
            {
            // InternalCanvas.g:3352:1: ( ( rule__EndAnchor__AnchorAssignment_2 )? )
            // InternalCanvas.g:3353:2: ( rule__EndAnchor__AnchorAssignment_2 )?
            {
             before(grammarAccess.getEndAnchorAccess().getAnchorAssignment_2()); 
            // InternalCanvas.g:3354:2: ( rule__EndAnchor__AnchorAssignment_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17||LA37_0==30||LA37_0==44||LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCanvas.g:3354:3: rule__EndAnchor__AnchorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EndAnchor__AnchorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEndAnchorAccess().getAnchorAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__EndAnchor__Group_0_0__0"
    // InternalCanvas.g:3363:1: rule__EndAnchor__Group_0_0__0 : rule__EndAnchor__Group_0_0__0__Impl rule__EndAnchor__Group_0_0__1 ;
    public final void rule__EndAnchor__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3367:1: ( rule__EndAnchor__Group_0_0__0__Impl rule__EndAnchor__Group_0_0__1 )
            // InternalCanvas.g:3368:2: rule__EndAnchor__Group_0_0__0__Impl rule__EndAnchor__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__EndAnchor__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndAnchor__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group_0_0__0"


    // $ANTLR start "rule__EndAnchor__Group_0_0__0__Impl"
    // InternalCanvas.g:3375:1: rule__EndAnchor__Group_0_0__0__Impl : ( 'end' ) ;
    public final void rule__EndAnchor__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3379:1: ( ( 'end' ) )
            // InternalCanvas.g:3380:1: ( 'end' )
            {
            // InternalCanvas.g:3380:1: ( 'end' )
            // InternalCanvas.g:3381:2: 'end'
            {
             before(grammarAccess.getEndAnchorAccess().getEndKeyword_0_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEndAnchorAccess().getEndKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group_0_0__0__Impl"


    // $ANTLR start "rule__EndAnchor__Group_0_0__1"
    // InternalCanvas.g:3390:1: rule__EndAnchor__Group_0_0__1 : rule__EndAnchor__Group_0_0__1__Impl ;
    public final void rule__EndAnchor__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3394:1: ( rule__EndAnchor__Group_0_0__1__Impl )
            // InternalCanvas.g:3395:2: rule__EndAnchor__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndAnchor__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group_0_0__1"


    // $ANTLR start "rule__EndAnchor__Group_0_0__1__Impl"
    // InternalCanvas.g:3401:1: rule__EndAnchor__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__EndAnchor__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3405:1: ( ( ':' ) )
            // InternalCanvas.g:3406:1: ( ':' )
            {
            // InternalCanvas.g:3406:1: ( ':' )
            // InternalCanvas.g:3407:2: ':'
            {
             before(grammarAccess.getEndAnchorAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEndAnchorAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__Group_0_0__1__Impl"


    // $ANTLR start "rule__ShapeAnchorElement__Group__0"
    // InternalCanvas.g:3417:1: rule__ShapeAnchorElement__Group__0 : rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1 ;
    public final void rule__ShapeAnchorElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3421:1: ( rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1 )
            // InternalCanvas.g:3422:2: rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCanvas.g:3429:1: rule__ShapeAnchorElement__Group__0__Impl : ( ( rule__ShapeAnchorElement__Alternatives_0 ) ) ;
    public final void rule__ShapeAnchorElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3433:1: ( ( ( rule__ShapeAnchorElement__Alternatives_0 ) ) )
            // InternalCanvas.g:3434:1: ( ( rule__ShapeAnchorElement__Alternatives_0 ) )
            {
            // InternalCanvas.g:3434:1: ( ( rule__ShapeAnchorElement__Alternatives_0 ) )
            // InternalCanvas.g:3435:2: ( rule__ShapeAnchorElement__Alternatives_0 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getAlternatives_0()); 
            // InternalCanvas.g:3436:2: ( rule__ShapeAnchorElement__Alternatives_0 )
            // InternalCanvas.g:3436:3: rule__ShapeAnchorElement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeAnchorElementAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:3444:1: rule__ShapeAnchorElement__Group__1 : rule__ShapeAnchorElement__Group__1__Impl ;
    public final void rule__ShapeAnchorElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3448:1: ( rule__ShapeAnchorElement__Group__1__Impl )
            // InternalCanvas.g:3449:2: rule__ShapeAnchorElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:3455:1: rule__ShapeAnchorElement__Group__1__Impl : ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) ) ;
    public final void rule__ShapeAnchorElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3459:1: ( ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) ) )
            // InternalCanvas.g:3460:1: ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) )
            {
            // InternalCanvas.g:3460:1: ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) )
            // InternalCanvas.g:3461:2: ( rule__ShapeAnchorElement__ElementAssignment_1 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementAssignment_1()); 
            // InternalCanvas.g:3462:2: ( rule__ShapeAnchorElement__ElementAssignment_1 )
            // InternalCanvas.g:3462:3: rule__ShapeAnchorElement__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeAnchorElementAccess().getElementAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ShapeAnchorElement__Group_0_0__0"
    // InternalCanvas.g:3471:1: rule__ShapeAnchorElement__Group_0_0__0 : rule__ShapeAnchorElement__Group_0_0__0__Impl rule__ShapeAnchorElement__Group_0_0__1 ;
    public final void rule__ShapeAnchorElement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3475:1: ( rule__ShapeAnchorElement__Group_0_0__0__Impl rule__ShapeAnchorElement__Group_0_0__1 )
            // InternalCanvas.g:3476:2: rule__ShapeAnchorElement__Group_0_0__0__Impl rule__ShapeAnchorElement__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ShapeAnchorElement__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group_0_0__0"


    // $ANTLR start "rule__ShapeAnchorElement__Group_0_0__0__Impl"
    // InternalCanvas.g:3483:1: rule__ShapeAnchorElement__Group_0_0__0__Impl : ( 'shape' ) ;
    public final void rule__ShapeAnchorElement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3487:1: ( ( 'shape' ) )
            // InternalCanvas.g:3488:1: ( 'shape' )
            {
            // InternalCanvas.g:3488:1: ( 'shape' )
            // InternalCanvas.g:3489:2: 'shape'
            {
             before(grammarAccess.getShapeAnchorElementAccess().getShapeKeyword_0_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getShapeAnchorElementAccess().getShapeKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group_0_0__0__Impl"


    // $ANTLR start "rule__ShapeAnchorElement__Group_0_0__1"
    // InternalCanvas.g:3498:1: rule__ShapeAnchorElement__Group_0_0__1 : rule__ShapeAnchorElement__Group_0_0__1__Impl ;
    public final void rule__ShapeAnchorElement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3502:1: ( rule__ShapeAnchorElement__Group_0_0__1__Impl )
            // InternalCanvas.g:3503:2: rule__ShapeAnchorElement__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeAnchorElement__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group_0_0__1"


    // $ANTLR start "rule__ShapeAnchorElement__Group_0_0__1__Impl"
    // InternalCanvas.g:3509:1: rule__ShapeAnchorElement__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ShapeAnchorElement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3513:1: ( ( ':' ) )
            // InternalCanvas.g:3514:1: ( ':' )
            {
            // InternalCanvas.g:3514:1: ( ':' )
            // InternalCanvas.g:3515:2: ':'
            {
             before(grammarAccess.getShapeAnchorElementAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getShapeAnchorElementAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__Group_0_0__1__Impl"


    // $ANTLR start "rule__ConnectorAnchorElement__Group__0"
    // InternalCanvas.g:3525:1: rule__ConnectorAnchorElement__Group__0 : rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1 ;
    public final void rule__ConnectorAnchorElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3529:1: ( rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1 )
            // InternalCanvas.g:3530:2: rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCanvas.g:3537:1: rule__ConnectorAnchorElement__Group__0__Impl : ( ( rule__ConnectorAnchorElement__Alternatives_0 ) ) ;
    public final void rule__ConnectorAnchorElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3541:1: ( ( ( rule__ConnectorAnchorElement__Alternatives_0 ) ) )
            // InternalCanvas.g:3542:1: ( ( rule__ConnectorAnchorElement__Alternatives_0 ) )
            {
            // InternalCanvas.g:3542:1: ( ( rule__ConnectorAnchorElement__Alternatives_0 ) )
            // InternalCanvas.g:3543:2: ( rule__ConnectorAnchorElement__Alternatives_0 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getAlternatives_0()); 
            // InternalCanvas.g:3544:2: ( rule__ConnectorAnchorElement__Alternatives_0 )
            // InternalCanvas.g:3544:3: rule__ConnectorAnchorElement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAnchorElementAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:3552:1: rule__ConnectorAnchorElement__Group__1 : rule__ConnectorAnchorElement__Group__1__Impl ;
    public final void rule__ConnectorAnchorElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3556:1: ( rule__ConnectorAnchorElement__Group__1__Impl )
            // InternalCanvas.g:3557:2: rule__ConnectorAnchorElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:3563:1: rule__ConnectorAnchorElement__Group__1__Impl : ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) ) ;
    public final void rule__ConnectorAnchorElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3567:1: ( ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) ) )
            // InternalCanvas.g:3568:1: ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) )
            {
            // InternalCanvas.g:3568:1: ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) )
            // InternalCanvas.g:3569:2: ( rule__ConnectorAnchorElement__ElementAssignment_1 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementAssignment_1()); 
            // InternalCanvas.g:3570:2: ( rule__ConnectorAnchorElement__ElementAssignment_1 )
            // InternalCanvas.g:3570:3: rule__ConnectorAnchorElement__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAnchorElementAccess().getElementAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConnectorAnchorElement__Group_0_0__0"
    // InternalCanvas.g:3579:1: rule__ConnectorAnchorElement__Group_0_0__0 : rule__ConnectorAnchorElement__Group_0_0__0__Impl rule__ConnectorAnchorElement__Group_0_0__1 ;
    public final void rule__ConnectorAnchorElement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3583:1: ( rule__ConnectorAnchorElement__Group_0_0__0__Impl rule__ConnectorAnchorElement__Group_0_0__1 )
            // InternalCanvas.g:3584:2: rule__ConnectorAnchorElement__Group_0_0__0__Impl rule__ConnectorAnchorElement__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ConnectorAnchorElement__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group_0_0__0"


    // $ANTLR start "rule__ConnectorAnchorElement__Group_0_0__0__Impl"
    // InternalCanvas.g:3591:1: rule__ConnectorAnchorElement__Group_0_0__0__Impl : ( 'connector' ) ;
    public final void rule__ConnectorAnchorElement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3595:1: ( ( 'connector' ) )
            // InternalCanvas.g:3596:1: ( 'connector' )
            {
            // InternalCanvas.g:3596:1: ( 'connector' )
            // InternalCanvas.g:3597:2: 'connector'
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getConnectorKeyword_0_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getConnectorAnchorElementAccess().getConnectorKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group_0_0__0__Impl"


    // $ANTLR start "rule__ConnectorAnchorElement__Group_0_0__1"
    // InternalCanvas.g:3606:1: rule__ConnectorAnchorElement__Group_0_0__1 : rule__ConnectorAnchorElement__Group_0_0__1__Impl ;
    public final void rule__ConnectorAnchorElement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3610:1: ( rule__ConnectorAnchorElement__Group_0_0__1__Impl )
            // InternalCanvas.g:3611:2: rule__ConnectorAnchorElement__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorAnchorElement__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group_0_0__1"


    // $ANTLR start "rule__ConnectorAnchorElement__Group_0_0__1__Impl"
    // InternalCanvas.g:3617:1: rule__ConnectorAnchorElement__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ConnectorAnchorElement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3621:1: ( ( ':' ) )
            // InternalCanvas.g:3622:1: ( ':' )
            {
            // InternalCanvas.g:3622:1: ( ':' )
            // InternalCanvas.g:3623:2: ':'
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConnectorAnchorElementAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__Group_0_0__1__Impl"


    // $ANTLR start "rule__Polyline__Group__0"
    // InternalCanvas.g:3633:1: rule__Polyline__Group__0 : rule__Polyline__Group__0__Impl rule__Polyline__Group__1 ;
    public final void rule__Polyline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3637:1: ( rule__Polyline__Group__0__Impl rule__Polyline__Group__1 )
            // InternalCanvas.g:3638:2: rule__Polyline__Group__0__Impl rule__Polyline__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCanvas.g:3645:1: rule__Polyline__Group__0__Impl : ( () ) ;
    public final void rule__Polyline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3649:1: ( ( () ) )
            // InternalCanvas.g:3650:1: ( () )
            {
            // InternalCanvas.g:3650:1: ( () )
            // InternalCanvas.g:3651:2: ()
            {
             before(grammarAccess.getPolylineAccess().getPolylineAction_0()); 
            // InternalCanvas.g:3652:2: ()
            // InternalCanvas.g:3652:3: 
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
    // InternalCanvas.g:3660:1: rule__Polyline__Group__1 : rule__Polyline__Group__1__Impl rule__Polyline__Group__2 ;
    public final void rule__Polyline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3664:1: ( rule__Polyline__Group__1__Impl rule__Polyline__Group__2 )
            // InternalCanvas.g:3665:2: rule__Polyline__Group__1__Impl rule__Polyline__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalCanvas.g:3672:1: rule__Polyline__Group__1__Impl : ( ( rule__Polyline__Alternatives_1 ) ) ;
    public final void rule__Polyline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3676:1: ( ( ( rule__Polyline__Alternatives_1 ) ) )
            // InternalCanvas.g:3677:1: ( ( rule__Polyline__Alternatives_1 ) )
            {
            // InternalCanvas.g:3677:1: ( ( rule__Polyline__Alternatives_1 ) )
            // InternalCanvas.g:3678:2: ( rule__Polyline__Alternatives_1 )
            {
             before(grammarAccess.getPolylineAccess().getAlternatives_1()); 
            // InternalCanvas.g:3679:2: ( rule__Polyline__Alternatives_1 )
            // InternalCanvas.g:3679:3: rule__Polyline__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Polyline__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPolylineAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCanvas.g:3687:1: rule__Polyline__Group__2 : rule__Polyline__Group__2__Impl ;
    public final void rule__Polyline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3691:1: ( rule__Polyline__Group__2__Impl )
            // InternalCanvas.g:3692:2: rule__Polyline__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polyline__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:3698:1: rule__Polyline__Group__2__Impl : ( ( rule__Polyline__SegmentsAssignment_2 )* ) ;
    public final void rule__Polyline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3702:1: ( ( ( rule__Polyline__SegmentsAssignment_2 )* ) )
            // InternalCanvas.g:3703:1: ( ( rule__Polyline__SegmentsAssignment_2 )* )
            {
            // InternalCanvas.g:3703:1: ( ( rule__Polyline__SegmentsAssignment_2 )* )
            // InternalCanvas.g:3704:2: ( rule__Polyline__SegmentsAssignment_2 )*
            {
             before(grammarAccess.getPolylineAccess().getSegmentsAssignment_2()); 
            // InternalCanvas.g:3705:2: ( rule__Polyline__SegmentsAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==35||LA38_0==52) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCanvas.g:3705:3: rule__Polyline__SegmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Polyline__SegmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getPolylineAccess().getSegmentsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Polyline__Group_1_0__0"
    // InternalCanvas.g:3714:1: rule__Polyline__Group_1_0__0 : rule__Polyline__Group_1_0__0__Impl rule__Polyline__Group_1_0__1 ;
    public final void rule__Polyline__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3718:1: ( rule__Polyline__Group_1_0__0__Impl rule__Polyline__Group_1_0__1 )
            // InternalCanvas.g:3719:2: rule__Polyline__Group_1_0__0__Impl rule__Polyline__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Polyline__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polyline__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group_1_0__0"


    // $ANTLR start "rule__Polyline__Group_1_0__0__Impl"
    // InternalCanvas.g:3726:1: rule__Polyline__Group_1_0__0__Impl : ( 'polyline' ) ;
    public final void rule__Polyline__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3730:1: ( ( 'polyline' ) )
            // InternalCanvas.g:3731:1: ( 'polyline' )
            {
            // InternalCanvas.g:3731:1: ( 'polyline' )
            // InternalCanvas.g:3732:2: 'polyline'
            {
             before(grammarAccess.getPolylineAccess().getPolylineKeyword_1_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPolylineAccess().getPolylineKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group_1_0__0__Impl"


    // $ANTLR start "rule__Polyline__Group_1_0__1"
    // InternalCanvas.g:3741:1: rule__Polyline__Group_1_0__1 : rule__Polyline__Group_1_0__1__Impl ;
    public final void rule__Polyline__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3745:1: ( rule__Polyline__Group_1_0__1__Impl )
            // InternalCanvas.g:3746:2: rule__Polyline__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polyline__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group_1_0__1"


    // $ANTLR start "rule__Polyline__Group_1_0__1__Impl"
    // InternalCanvas.g:3752:1: rule__Polyline__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Polyline__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3756:1: ( ( ':' ) )
            // InternalCanvas.g:3757:1: ( ':' )
            {
            // InternalCanvas.g:3757:1: ( ':' )
            // InternalCanvas.g:3758:2: ':'
            {
             before(grammarAccess.getPolylineAccess().getColonKeyword_1_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPolylineAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__Group_1_0__1__Impl"


    // $ANTLR start "rule__Segment__Group__0"
    // InternalCanvas.g:3768:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3772:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // InternalCanvas.g:3773:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCanvas.g:3780:1: rule__Segment__Group__0__Impl : ( ( rule__Segment__Alternatives_0 ) ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3784:1: ( ( ( rule__Segment__Alternatives_0 ) ) )
            // InternalCanvas.g:3785:1: ( ( rule__Segment__Alternatives_0 ) )
            {
            // InternalCanvas.g:3785:1: ( ( rule__Segment__Alternatives_0 ) )
            // InternalCanvas.g:3786:2: ( rule__Segment__Alternatives_0 )
            {
             before(grammarAccess.getSegmentAccess().getAlternatives_0()); 
            // InternalCanvas.g:3787:2: ( rule__Segment__Alternatives_0 )
            // InternalCanvas.g:3787:3: rule__Segment__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:3795:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3799:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // InternalCanvas.g:3800:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:3807:1: rule__Segment__Group__1__Impl : ( ( rule__Segment__Alternatives_1 ) ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3811:1: ( ( ( rule__Segment__Alternatives_1 ) ) )
            // InternalCanvas.g:3812:1: ( ( rule__Segment__Alternatives_1 ) )
            {
            // InternalCanvas.g:3812:1: ( ( rule__Segment__Alternatives_1 ) )
            // InternalCanvas.g:3813:2: ( rule__Segment__Alternatives_1 )
            {
             before(grammarAccess.getSegmentAccess().getAlternatives_1()); 
            // InternalCanvas.g:3814:2: ( rule__Segment__Alternatives_1 )
            // InternalCanvas.g:3814:3: rule__Segment__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCanvas.g:3822:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3826:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // InternalCanvas.g:3827:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalCanvas.g:3834:1: rule__Segment__Group__2__Impl : ( ( rule__Segment__StartPointAssignment_2 ) ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3838:1: ( ( ( rule__Segment__StartPointAssignment_2 ) ) )
            // InternalCanvas.g:3839:1: ( ( rule__Segment__StartPointAssignment_2 ) )
            {
            // InternalCanvas.g:3839:1: ( ( rule__Segment__StartPointAssignment_2 ) )
            // InternalCanvas.g:3840:2: ( rule__Segment__StartPointAssignment_2 )
            {
             before(grammarAccess.getSegmentAccess().getStartPointAssignment_2()); 
            // InternalCanvas.g:3841:2: ( rule__Segment__StartPointAssignment_2 )
            // InternalCanvas.g:3841:3: rule__Segment__StartPointAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Segment__StartPointAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getStartPointAssignment_2()); 

            }


            }

        }
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
    // InternalCanvas.g:3849:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3853:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // InternalCanvas.g:3854:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
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
    // InternalCanvas.g:3861:1: rule__Segment__Group__3__Impl : ( ( rule__Segment__Alternatives_3 ) ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3865:1: ( ( ( rule__Segment__Alternatives_3 ) ) )
            // InternalCanvas.g:3866:1: ( ( rule__Segment__Alternatives_3 ) )
            {
            // InternalCanvas.g:3866:1: ( ( rule__Segment__Alternatives_3 ) )
            // InternalCanvas.g:3867:2: ( rule__Segment__Alternatives_3 )
            {
             before(grammarAccess.getSegmentAccess().getAlternatives_3()); 
            // InternalCanvas.g:3868:2: ( rule__Segment__Alternatives_3 )
            // InternalCanvas.g:3868:3: rule__Segment__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalCanvas.g:3876:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3880:1: ( rule__Segment__Group__4__Impl )
            // InternalCanvas.g:3881:2: rule__Segment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:3887:1: rule__Segment__Group__4__Impl : ( ( rule__Segment__EndPointAssignment_4 ) ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3891:1: ( ( ( rule__Segment__EndPointAssignment_4 ) ) )
            // InternalCanvas.g:3892:1: ( ( rule__Segment__EndPointAssignment_4 ) )
            {
            // InternalCanvas.g:3892:1: ( ( rule__Segment__EndPointAssignment_4 ) )
            // InternalCanvas.g:3893:2: ( rule__Segment__EndPointAssignment_4 )
            {
             before(grammarAccess.getSegmentAccess().getEndPointAssignment_4()); 
            // InternalCanvas.g:3894:2: ( rule__Segment__EndPointAssignment_4 )
            // InternalCanvas.g:3894:3: rule__Segment__EndPointAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Segment__EndPointAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getEndPointAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Segment__Group_0_0__0"
    // InternalCanvas.g:3903:1: rule__Segment__Group_0_0__0 : rule__Segment__Group_0_0__0__Impl rule__Segment__Group_0_0__1 ;
    public final void rule__Segment__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3907:1: ( rule__Segment__Group_0_0__0__Impl rule__Segment__Group_0_0__1 )
            // InternalCanvas.g:3908:2: rule__Segment__Group_0_0__0__Impl rule__Segment__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Segment__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_0_0__0"


    // $ANTLR start "rule__Segment__Group_0_0__0__Impl"
    // InternalCanvas.g:3915:1: rule__Segment__Group_0_0__0__Impl : ( 'segment' ) ;
    public final void rule__Segment__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3919:1: ( ( 'segment' ) )
            // InternalCanvas.g:3920:1: ( 'segment' )
            {
            // InternalCanvas.g:3920:1: ( 'segment' )
            // InternalCanvas.g:3921:2: 'segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_0_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getSegmentKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_0_0__0__Impl"


    // $ANTLR start "rule__Segment__Group_0_0__1"
    // InternalCanvas.g:3930:1: rule__Segment__Group_0_0__1 : rule__Segment__Group_0_0__1__Impl ;
    public final void rule__Segment__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3934:1: ( rule__Segment__Group_0_0__1__Impl )
            // InternalCanvas.g:3935:2: rule__Segment__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_0_0__1"


    // $ANTLR start "rule__Segment__Group_0_0__1__Impl"
    // InternalCanvas.g:3941:1: rule__Segment__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Segment__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3945:1: ( ( ':' ) )
            // InternalCanvas.g:3946:1: ( ':' )
            {
            // InternalCanvas.g:3946:1: ( ':' )
            // InternalCanvas.g:3947:2: ':'
            {
             before(grammarAccess.getSegmentAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_0_0__1__Impl"


    // $ANTLR start "rule__Segment__Group_1_0__0"
    // InternalCanvas.g:3957:1: rule__Segment__Group_1_0__0 : rule__Segment__Group_1_0__0__Impl rule__Segment__Group_1_0__1 ;
    public final void rule__Segment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3961:1: ( rule__Segment__Group_1_0__0__Impl rule__Segment__Group_1_0__1 )
            // InternalCanvas.g:3962:2: rule__Segment__Group_1_0__0__Impl rule__Segment__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Segment__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_1_0__0"


    // $ANTLR start "rule__Segment__Group_1_0__0__Impl"
    // InternalCanvas.g:3969:1: rule__Segment__Group_1_0__0__Impl : ( 'start' ) ;
    public final void rule__Segment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3973:1: ( ( 'start' ) )
            // InternalCanvas.g:3974:1: ( 'start' )
            {
            // InternalCanvas.g:3974:1: ( 'start' )
            // InternalCanvas.g:3975:2: 'start'
            {
             before(grammarAccess.getSegmentAccess().getStartKeyword_1_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getStartKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_1_0__0__Impl"


    // $ANTLR start "rule__Segment__Group_1_0__1"
    // InternalCanvas.g:3984:1: rule__Segment__Group_1_0__1 : rule__Segment__Group_1_0__1__Impl ;
    public final void rule__Segment__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3988:1: ( rule__Segment__Group_1_0__1__Impl )
            // InternalCanvas.g:3989:2: rule__Segment__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_1_0__1"


    // $ANTLR start "rule__Segment__Group_1_0__1__Impl"
    // InternalCanvas.g:3995:1: rule__Segment__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Segment__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3999:1: ( ( ':' ) )
            // InternalCanvas.g:4000:1: ( ':' )
            {
            // InternalCanvas.g:4000:1: ( ':' )
            // InternalCanvas.g:4001:2: ':'
            {
             before(grammarAccess.getSegmentAccess().getColonKeyword_1_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_1_0__1__Impl"


    // $ANTLR start "rule__Segment__Group_3_0__0"
    // InternalCanvas.g:4011:1: rule__Segment__Group_3_0__0 : rule__Segment__Group_3_0__0__Impl rule__Segment__Group_3_0__1 ;
    public final void rule__Segment__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4015:1: ( rule__Segment__Group_3_0__0__Impl rule__Segment__Group_3_0__1 )
            // InternalCanvas.g:4016:2: rule__Segment__Group_3_0__0__Impl rule__Segment__Group_3_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Segment__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_3_0__0"


    // $ANTLR start "rule__Segment__Group_3_0__0__Impl"
    // InternalCanvas.g:4023:1: rule__Segment__Group_3_0__0__Impl : ( 'end' ) ;
    public final void rule__Segment__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4027:1: ( ( 'end' ) )
            // InternalCanvas.g:4028:1: ( 'end' )
            {
            // InternalCanvas.g:4028:1: ( 'end' )
            // InternalCanvas.g:4029:2: 'end'
            {
             before(grammarAccess.getSegmentAccess().getEndKeyword_3_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getEndKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_3_0__0__Impl"


    // $ANTLR start "rule__Segment__Group_3_0__1"
    // InternalCanvas.g:4038:1: rule__Segment__Group_3_0__1 : rule__Segment__Group_3_0__1__Impl ;
    public final void rule__Segment__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4042:1: ( rule__Segment__Group_3_0__1__Impl )
            // InternalCanvas.g:4043:2: rule__Segment__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_3_0__1"


    // $ANTLR start "rule__Segment__Group_3_0__1__Impl"
    // InternalCanvas.g:4049:1: rule__Segment__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__Segment__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4053:1: ( ( ':' ) )
            // InternalCanvas.g:4054:1: ( ':' )
            {
            // InternalCanvas.g:4054:1: ( ':' )
            // InternalCanvas.g:4055:2: ':'
            {
             before(grammarAccess.getSegmentAccess().getColonKeyword_3_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getColonKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group_3_0__1__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalCanvas.g:4065:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4069:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalCanvas.g:4070:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:4077:1: rule__Point__Group__0__Impl : ( 'x' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4081:1: ( ( 'x' ) )
            // InternalCanvas.g:4082:1: ( 'x' )
            {
            // InternalCanvas.g:4082:1: ( 'x' )
            // InternalCanvas.g:4083:2: 'x'
            {
             before(grammarAccess.getPointAccess().getXKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalCanvas.g:4092:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4096:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalCanvas.g:4097:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalCanvas.g:4104:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4108:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalCanvas.g:4109:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalCanvas.g:4109:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalCanvas.g:4110:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalCanvas.g:4111:2: ( rule__Point__XAssignment_1 )
            // InternalCanvas.g:4111:3: rule__Point__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getXAssignment_1()); 

            }


            }

        }
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
    // InternalCanvas.g:4119:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4123:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalCanvas.g:4124:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:4131:1: rule__Point__Group__2__Impl : ( 'y' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4135:1: ( ( 'y' ) )
            // InternalCanvas.g:4136:1: ( 'y' )
            {
            // InternalCanvas.g:4136:1: ( 'y' )
            // InternalCanvas.g:4137:2: 'y'
            {
             before(grammarAccess.getPointAccess().getYKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getYKeyword_2()); 

            }


            }

        }
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
    // InternalCanvas.g:4146:1: rule__Point__Group__3 : rule__Point__Group__3__Impl ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4150:1: ( rule__Point__Group__3__Impl )
            // InternalCanvas.g:4151:2: rule__Point__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:4157:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4161:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalCanvas.g:4162:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalCanvas.g:4162:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalCanvas.g:4163:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalCanvas.g:4164:2: ( rule__Point__YAssignment_3 )
            // InternalCanvas.g:4164:3: rule__Point__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Point__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getYAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__PointDefinition__Group__0"
    // InternalCanvas.g:4173:1: rule__PointDefinition__Group__0 : rule__PointDefinition__Group__0__Impl rule__PointDefinition__Group__1 ;
    public final void rule__PointDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4177:1: ( rule__PointDefinition__Group__0__Impl rule__PointDefinition__Group__1 )
            // InternalCanvas.g:4178:2: rule__PointDefinition__Group__0__Impl rule__PointDefinition__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:4185:1: rule__PointDefinition__Group__0__Impl : ( ( rule__PointDefinition__Alternatives_0 ) ) ;
    public final void rule__PointDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4189:1: ( ( ( rule__PointDefinition__Alternatives_0 ) ) )
            // InternalCanvas.g:4190:1: ( ( rule__PointDefinition__Alternatives_0 ) )
            {
            // InternalCanvas.g:4190:1: ( ( rule__PointDefinition__Alternatives_0 ) )
            // InternalCanvas.g:4191:2: ( rule__PointDefinition__Alternatives_0 )
            {
             before(grammarAccess.getPointDefinitionAccess().getAlternatives_0()); 
            // InternalCanvas.g:4192:2: ( rule__PointDefinition__Alternatives_0 )
            // InternalCanvas.g:4192:3: rule__PointDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PointDefinition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPointDefinitionAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalCanvas.g:4200:1: rule__PointDefinition__Group__1 : rule__PointDefinition__Group__1__Impl rule__PointDefinition__Group__2 ;
    public final void rule__PointDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4204:1: ( rule__PointDefinition__Group__1__Impl rule__PointDefinition__Group__2 )
            // InternalCanvas.g:4205:2: rule__PointDefinition__Group__1__Impl rule__PointDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:4212:1: rule__PointDefinition__Group__1__Impl : ( 'x' ) ;
    public final void rule__PointDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4216:1: ( ( 'x' ) )
            // InternalCanvas.g:4217:1: ( 'x' )
            {
            // InternalCanvas.g:4217:1: ( 'x' )
            // InternalCanvas.g:4218:2: 'x'
            {
             before(grammarAccess.getPointDefinitionAccess().getXKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getXKeyword_1()); 

            }


            }

        }
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
    // InternalCanvas.g:4227:1: rule__PointDefinition__Group__2 : rule__PointDefinition__Group__2__Impl rule__PointDefinition__Group__3 ;
    public final void rule__PointDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4231:1: ( rule__PointDefinition__Group__2__Impl rule__PointDefinition__Group__3 )
            // InternalCanvas.g:4232:2: rule__PointDefinition__Group__2__Impl rule__PointDefinition__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalCanvas.g:4239:1: rule__PointDefinition__Group__2__Impl : ( ( rule__PointDefinition__XAssignment_2 ) ) ;
    public final void rule__PointDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4243:1: ( ( ( rule__PointDefinition__XAssignment_2 ) ) )
            // InternalCanvas.g:4244:1: ( ( rule__PointDefinition__XAssignment_2 ) )
            {
            // InternalCanvas.g:4244:1: ( ( rule__PointDefinition__XAssignment_2 ) )
            // InternalCanvas.g:4245:2: ( rule__PointDefinition__XAssignment_2 )
            {
             before(grammarAccess.getPointDefinitionAccess().getXAssignment_2()); 
            // InternalCanvas.g:4246:2: ( rule__PointDefinition__XAssignment_2 )
            // InternalCanvas.g:4246:3: rule__PointDefinition__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PointDefinition__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPointDefinitionAccess().getXAssignment_2()); 

            }


            }

        }
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
    // InternalCanvas.g:4254:1: rule__PointDefinition__Group__3 : rule__PointDefinition__Group__3__Impl rule__PointDefinition__Group__4 ;
    public final void rule__PointDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4258:1: ( rule__PointDefinition__Group__3__Impl rule__PointDefinition__Group__4 )
            // InternalCanvas.g:4259:2: rule__PointDefinition__Group__3__Impl rule__PointDefinition__Group__4
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
    // InternalCanvas.g:4266:1: rule__PointDefinition__Group__3__Impl : ( 'y' ) ;
    public final void rule__PointDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4270:1: ( ( 'y' ) )
            // InternalCanvas.g:4271:1: ( 'y' )
            {
            // InternalCanvas.g:4271:1: ( 'y' )
            // InternalCanvas.g:4272:2: 'y'
            {
             before(grammarAccess.getPointDefinitionAccess().getYKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getYKeyword_3()); 

            }


            }

        }
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
    // InternalCanvas.g:4281:1: rule__PointDefinition__Group__4 : rule__PointDefinition__Group__4__Impl ;
    public final void rule__PointDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4285:1: ( rule__PointDefinition__Group__4__Impl )
            // InternalCanvas.g:4286:2: rule__PointDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:4292:1: rule__PointDefinition__Group__4__Impl : ( ( rule__PointDefinition__YAssignment_4 ) ) ;
    public final void rule__PointDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4296:1: ( ( ( rule__PointDefinition__YAssignment_4 ) ) )
            // InternalCanvas.g:4297:1: ( ( rule__PointDefinition__YAssignment_4 ) )
            {
            // InternalCanvas.g:4297:1: ( ( rule__PointDefinition__YAssignment_4 ) )
            // InternalCanvas.g:4298:2: ( rule__PointDefinition__YAssignment_4 )
            {
             before(grammarAccess.getPointDefinitionAccess().getYAssignment_4()); 
            // InternalCanvas.g:4299:2: ( rule__PointDefinition__YAssignment_4 )
            // InternalCanvas.g:4299:3: rule__PointDefinition__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PointDefinition__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPointDefinitionAccess().getYAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__PointDefinition__Group_0_0__0"
    // InternalCanvas.g:4308:1: rule__PointDefinition__Group_0_0__0 : rule__PointDefinition__Group_0_0__0__Impl rule__PointDefinition__Group_0_0__1 ;
    public final void rule__PointDefinition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4312:1: ( rule__PointDefinition__Group_0_0__0__Impl rule__PointDefinition__Group_0_0__1 )
            // InternalCanvas.g:4313:2: rule__PointDefinition__Group_0_0__0__Impl rule__PointDefinition__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__PointDefinition__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group_0_0__0"


    // $ANTLR start "rule__PointDefinition__Group_0_0__0__Impl"
    // InternalCanvas.g:4320:1: rule__PointDefinition__Group_0_0__0__Impl : ( 'point' ) ;
    public final void rule__PointDefinition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4324:1: ( ( 'point' ) )
            // InternalCanvas.g:4325:1: ( 'point' )
            {
            // InternalCanvas.g:4325:1: ( 'point' )
            // InternalCanvas.g:4326:2: 'point'
            {
             before(grammarAccess.getPointDefinitionAccess().getPointKeyword_0_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getPointKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group_0_0__0__Impl"


    // $ANTLR start "rule__PointDefinition__Group_0_0__1"
    // InternalCanvas.g:4335:1: rule__PointDefinition__Group_0_0__1 : rule__PointDefinition__Group_0_0__1__Impl ;
    public final void rule__PointDefinition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4339:1: ( rule__PointDefinition__Group_0_0__1__Impl )
            // InternalCanvas.g:4340:2: rule__PointDefinition__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PointDefinition__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group_0_0__1"


    // $ANTLR start "rule__PointDefinition__Group_0_0__1__Impl"
    // InternalCanvas.g:4346:1: rule__PointDefinition__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__PointDefinition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4350:1: ( ( ':' ) )
            // InternalCanvas.g:4351:1: ( ':' )
            {
            // InternalCanvas.g:4351:1: ( ':' )
            // InternalCanvas.g:4352:2: ':'
            {
             before(grammarAccess.getPointDefinitionAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__Group_0_0__1__Impl"


    // $ANTLR start "rule__Rectangle__Group__0"
    // InternalCanvas.g:4362:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4366:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalCanvas.g:4367:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Rectangle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__0"


    // $ANTLR start "rule__Rectangle__Group__0__Impl"
    // InternalCanvas.g:4374:1: rule__Rectangle__Group__0__Impl : ( ( rule__Rectangle__Alternatives_0 ) ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4378:1: ( ( ( rule__Rectangle__Alternatives_0 ) ) )
            // InternalCanvas.g:4379:1: ( ( rule__Rectangle__Alternatives_0 ) )
            {
            // InternalCanvas.g:4379:1: ( ( rule__Rectangle__Alternatives_0 ) )
            // InternalCanvas.g:4380:2: ( rule__Rectangle__Alternatives_0 )
            {
             before(grammarAccess.getRectangleAccess().getAlternatives_0()); 
            // InternalCanvas.g:4381:2: ( rule__Rectangle__Alternatives_0 )
            // InternalCanvas.g:4381:3: rule__Rectangle__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__0__Impl"


    // $ANTLR start "rule__Rectangle__Group__1"
    // InternalCanvas.g:4389:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4393:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalCanvas.g:4394:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rectangle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__1"


    // $ANTLR start "rule__Rectangle__Group__1__Impl"
    // InternalCanvas.g:4401:1: rule__Rectangle__Group__1__Impl : ( 'x' ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4405:1: ( ( 'x' ) )
            // InternalCanvas.g:4406:1: ( 'x' )
            {
            // InternalCanvas.g:4406:1: ( 'x' )
            // InternalCanvas.g:4407:2: 'x'
            {
             before(grammarAccess.getRectangleAccess().getXKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__1__Impl"


    // $ANTLR start "rule__Rectangle__Group__2"
    // InternalCanvas.g:4416:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4420:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalCanvas.g:4421:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Rectangle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__2"


    // $ANTLR start "rule__Rectangle__Group__2__Impl"
    // InternalCanvas.g:4428:1: rule__Rectangle__Group__2__Impl : ( ( rule__Rectangle__XAssignment_2 ) ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4432:1: ( ( ( rule__Rectangle__XAssignment_2 ) ) )
            // InternalCanvas.g:4433:1: ( ( rule__Rectangle__XAssignment_2 ) )
            {
            // InternalCanvas.g:4433:1: ( ( rule__Rectangle__XAssignment_2 ) )
            // InternalCanvas.g:4434:2: ( rule__Rectangle__XAssignment_2 )
            {
             before(grammarAccess.getRectangleAccess().getXAssignment_2()); 
            // InternalCanvas.g:4435:2: ( rule__Rectangle__XAssignment_2 )
            // InternalCanvas.g:4435:3: rule__Rectangle__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__2__Impl"


    // $ANTLR start "rule__Rectangle__Group__3"
    // InternalCanvas.g:4443:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4447:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalCanvas.g:4448:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Rectangle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__3"


    // $ANTLR start "rule__Rectangle__Group__3__Impl"
    // InternalCanvas.g:4455:1: rule__Rectangle__Group__3__Impl : ( 'y' ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4459:1: ( ( 'y' ) )
            // InternalCanvas.g:4460:1: ( 'y' )
            {
            // InternalCanvas.g:4460:1: ( 'y' )
            // InternalCanvas.g:4461:2: 'y'
            {
             before(grammarAccess.getRectangleAccess().getYKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getYKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__3__Impl"


    // $ANTLR start "rule__Rectangle__Group__4"
    // InternalCanvas.g:4470:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4474:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalCanvas.g:4475:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Rectangle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__4"


    // $ANTLR start "rule__Rectangle__Group__4__Impl"
    // InternalCanvas.g:4482:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__YAssignment_4 ) ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4486:1: ( ( ( rule__Rectangle__YAssignment_4 ) ) )
            // InternalCanvas.g:4487:1: ( ( rule__Rectangle__YAssignment_4 ) )
            {
            // InternalCanvas.g:4487:1: ( ( rule__Rectangle__YAssignment_4 ) )
            // InternalCanvas.g:4488:2: ( rule__Rectangle__YAssignment_4 )
            {
             before(grammarAccess.getRectangleAccess().getYAssignment_4()); 
            // InternalCanvas.g:4489:2: ( rule__Rectangle__YAssignment_4 )
            // InternalCanvas.g:4489:3: rule__Rectangle__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getYAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__4__Impl"


    // $ANTLR start "rule__Rectangle__Group__5"
    // InternalCanvas.g:4497:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4501:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalCanvas.g:4502:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Rectangle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__5"


    // $ANTLR start "rule__Rectangle__Group__5__Impl"
    // InternalCanvas.g:4509:1: rule__Rectangle__Group__5__Impl : ( 'width' ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4513:1: ( ( 'width' ) )
            // InternalCanvas.g:4514:1: ( 'width' )
            {
            // InternalCanvas.g:4514:1: ( 'width' )
            // InternalCanvas.g:4515:2: 'width'
            {
             before(grammarAccess.getRectangleAccess().getWidthKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getWidthKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__5__Impl"


    // $ANTLR start "rule__Rectangle__Group__6"
    // InternalCanvas.g:4524:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4528:1: ( rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 )
            // InternalCanvas.g:4529:2: rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__Rectangle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__6"


    // $ANTLR start "rule__Rectangle__Group__6__Impl"
    // InternalCanvas.g:4536:1: rule__Rectangle__Group__6__Impl : ( ( rule__Rectangle__WAssignment_6 ) ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4540:1: ( ( ( rule__Rectangle__WAssignment_6 ) ) )
            // InternalCanvas.g:4541:1: ( ( rule__Rectangle__WAssignment_6 ) )
            {
            // InternalCanvas.g:4541:1: ( ( rule__Rectangle__WAssignment_6 ) )
            // InternalCanvas.g:4542:2: ( rule__Rectangle__WAssignment_6 )
            {
             before(grammarAccess.getRectangleAccess().getWAssignment_6()); 
            // InternalCanvas.g:4543:2: ( rule__Rectangle__WAssignment_6 )
            // InternalCanvas.g:4543:3: rule__Rectangle__WAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__WAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getWAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__6__Impl"


    // $ANTLR start "rule__Rectangle__Group__7"
    // InternalCanvas.g:4551:1: rule__Rectangle__Group__7 : rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 ;
    public final void rule__Rectangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4555:1: ( rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 )
            // InternalCanvas.g:4556:2: rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Rectangle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__7"


    // $ANTLR start "rule__Rectangle__Group__7__Impl"
    // InternalCanvas.g:4563:1: rule__Rectangle__Group__7__Impl : ( 'height' ) ;
    public final void rule__Rectangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4567:1: ( ( 'height' ) )
            // InternalCanvas.g:4568:1: ( 'height' )
            {
            // InternalCanvas.g:4568:1: ( 'height' )
            // InternalCanvas.g:4569:2: 'height'
            {
             before(grammarAccess.getRectangleAccess().getHeightKeyword_7()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getHeightKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__7__Impl"


    // $ANTLR start "rule__Rectangle__Group__8"
    // InternalCanvas.g:4578:1: rule__Rectangle__Group__8 : rule__Rectangle__Group__8__Impl ;
    public final void rule__Rectangle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4582:1: ( rule__Rectangle__Group__8__Impl )
            // InternalCanvas.g:4583:2: rule__Rectangle__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__8"


    // $ANTLR start "rule__Rectangle__Group__8__Impl"
    // InternalCanvas.g:4589:1: rule__Rectangle__Group__8__Impl : ( ( rule__Rectangle__HAssignment_8 ) ) ;
    public final void rule__Rectangle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4593:1: ( ( ( rule__Rectangle__HAssignment_8 ) ) )
            // InternalCanvas.g:4594:1: ( ( rule__Rectangle__HAssignment_8 ) )
            {
            // InternalCanvas.g:4594:1: ( ( rule__Rectangle__HAssignment_8 ) )
            // InternalCanvas.g:4595:2: ( rule__Rectangle__HAssignment_8 )
            {
             before(grammarAccess.getRectangleAccess().getHAssignment_8()); 
            // InternalCanvas.g:4596:2: ( rule__Rectangle__HAssignment_8 )
            // InternalCanvas.g:4596:3: rule__Rectangle__HAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__HAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getHAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__8__Impl"


    // $ANTLR start "rule__Rectangle__Group_0_0__0"
    // InternalCanvas.g:4605:1: rule__Rectangle__Group_0_0__0 : rule__Rectangle__Group_0_0__0__Impl rule__Rectangle__Group_0_0__1 ;
    public final void rule__Rectangle__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4609:1: ( rule__Rectangle__Group_0_0__0__Impl rule__Rectangle__Group_0_0__1 )
            // InternalCanvas.g:4610:2: rule__Rectangle__Group_0_0__0__Impl rule__Rectangle__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Rectangle__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_0_0__0"


    // $ANTLR start "rule__Rectangle__Group_0_0__0__Impl"
    // InternalCanvas.g:4617:1: rule__Rectangle__Group_0_0__0__Impl : ( 'rectangle' ) ;
    public final void rule__Rectangle__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4621:1: ( ( 'rectangle' ) )
            // InternalCanvas.g:4622:1: ( 'rectangle' )
            {
            // InternalCanvas.g:4622:1: ( 'rectangle' )
            // InternalCanvas.g:4623:2: 'rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_0_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getRectangleKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_0_0__0__Impl"


    // $ANTLR start "rule__Rectangle__Group_0_0__1"
    // InternalCanvas.g:4632:1: rule__Rectangle__Group_0_0__1 : rule__Rectangle__Group_0_0__1__Impl ;
    public final void rule__Rectangle__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4636:1: ( rule__Rectangle__Group_0_0__1__Impl )
            // InternalCanvas.g:4637:2: rule__Rectangle__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_0_0__1"


    // $ANTLR start "rule__Rectangle__Group_0_0__1__Impl"
    // InternalCanvas.g:4643:1: rule__Rectangle__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Rectangle__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4647:1: ( ( ':' ) )
            // InternalCanvas.g:4648:1: ( ':' )
            {
            // InternalCanvas.g:4648:1: ( ':' )
            // InternalCanvas.g:4649:2: ':'
            {
             before(grammarAccess.getRectangleAccess().getColonKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getColonKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_0_0__1__Impl"


    // $ANTLR start "rule__Model__RenderAssignment_0"
    // InternalCanvas.g:4659:1: rule__Model__RenderAssignment_0 : ( ruleModelRender ) ;
    public final void rule__Model__RenderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4663:1: ( ( ruleModelRender ) )
            // InternalCanvas.g:4664:2: ( ruleModelRender )
            {
            // InternalCanvas.g:4664:2: ( ruleModelRender )
            // InternalCanvas.g:4665:3: ruleModelRender
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
    // InternalCanvas.g:4674:1: rule__Model__PropertiesAssignment_1 : ( ruleModelProperties ) ;
    public final void rule__Model__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4678:1: ( ( ruleModelProperties ) )
            // InternalCanvas.g:4679:2: ( ruleModelProperties )
            {
            // InternalCanvas.g:4679:2: ( ruleModelProperties )
            // InternalCanvas.g:4680:3: ruleModelProperties
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
    // InternalCanvas.g:4689:1: rule__Model__ElementsAssignment_2 : ( ruleGraphicalElement ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4693:1: ( ( ruleGraphicalElement ) )
            // InternalCanvas.g:4694:2: ( ruleGraphicalElement )
            {
            // InternalCanvas.g:4694:2: ( ruleGraphicalElement )
            // InternalCanvas.g:4695:3: ruleGraphicalElement
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


    // $ANTLR start "rule__ModelRender__ImportURIAssignment_1"
    // InternalCanvas.g:4704:1: rule__ModelRender__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ModelRender__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4708:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4709:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4709:2: ( RULE_STRING )
            // InternalCanvas.g:4710:3: RULE_STRING
            {
             before(grammarAccess.getModelRenderAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelRenderAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelRender__ImportURIAssignment_1"


    // $ANTLR start "rule__ModelProperties__PointAssignment_2"
    // InternalCanvas.g:4719:1: rule__ModelProperties__PointAssignment_2 : ( rulePoint ) ;
    public final void rule__ModelProperties__PointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4723:1: ( ( rulePoint ) )
            // InternalCanvas.g:4724:2: ( rulePoint )
            {
            // InternalCanvas.g:4724:2: ( rulePoint )
            // InternalCanvas.g:4725:3: rulePoint
            {
             before(grammarAccess.getModelPropertiesAccess().getPointPointParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getModelPropertiesAccess().getPointPointParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__PointAssignment_2"


    // $ANTLR start "rule__ModelProperties__ZoomAssignment_4"
    // InternalCanvas.g:4734:1: rule__ModelProperties__ZoomAssignment_4 : ( RULE_INT ) ;
    public final void rule__ModelProperties__ZoomAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4738:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4739:2: ( RULE_INT )
            {
            // InternalCanvas.g:4739:2: ( RULE_INT )
            // InternalCanvas.g:4740:3: RULE_INT
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getZoomINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperties__ZoomAssignment_4"


    // $ANTLR start "rule__Shapes__ShapesAssignment_2"
    // InternalCanvas.g:4749:1: rule__Shapes__ShapesAssignment_2 : ( ruleShape ) ;
    public final void rule__Shapes__ShapesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4753:1: ( ( ruleShape ) )
            // InternalCanvas.g:4754:2: ( ruleShape )
            {
            // InternalCanvas.g:4754:2: ( ruleShape )
            // InternalCanvas.g:4755:3: ruleShape
            {
             before(grammarAccess.getShapesAccess().getShapesShapeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapesAccess().getShapesShapeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shapes__ShapesAssignment_2"


    // $ANTLR start "rule__Shape__NameAssignment_2"
    // InternalCanvas.g:4764:1: rule__Shape__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Shape__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4768:1: ( ( RULE_ID ) )
            // InternalCanvas.g:4769:2: ( RULE_ID )
            {
            // InternalCanvas.g:4769:2: ( RULE_ID )
            // InternalCanvas.g:4770:3: RULE_ID
            {
             before(grammarAccess.getShapeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__NameAssignment_2"


    // $ANTLR start "rule__Shape__ContainerAssignment_3"
    // InternalCanvas.g:4779:1: rule__Shape__ContainerAssignment_3 : ( ruleContainer ) ;
    public final void rule__Shape__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4783:1: ( ( ruleContainer ) )
            // InternalCanvas.g:4784:2: ( ruleContainer )
            {
            // InternalCanvas.g:4784:2: ( ruleContainer )
            // InternalCanvas.g:4785:3: ruleContainer
            {
             before(grammarAccess.getShapeAccess().getContainerContainerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getContainerContainerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__ContainerAssignment_3"


    // $ANTLR start "rule__Shape__RepresentsAssignment_5"
    // InternalCanvas.g:4794:1: rule__Shape__RepresentsAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Shape__RepresentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4798:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4799:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4799:2: ( RULE_STRING )
            // InternalCanvas.g:4800:3: RULE_STRING
            {
             before(grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__RepresentsAssignment_5"


    // $ANTLR start "rule__Shape__RectAssignment_6"
    // InternalCanvas.g:4809:1: rule__Shape__RectAssignment_6 : ( ruleRectangle ) ;
    public final void rule__Shape__RectAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4813:1: ( ( ruleRectangle ) )
            // InternalCanvas.g:4814:2: ( ruleRectangle )
            {
            // InternalCanvas.g:4814:2: ( ruleRectangle )
            // InternalCanvas.g:4815:3: ruleRectangle
            {
             before(grammarAccess.getShapeAccess().getRectRectangleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRectangle();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getRectRectangleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__RectAssignment_6"


    // $ANTLR start "rule__Shape__TextAssignment_7"
    // InternalCanvas.g:4824:1: rule__Shape__TextAssignment_7 : ( ruleFloatingText ) ;
    public final void rule__Shape__TextAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4828:1: ( ( ruleFloatingText ) )
            // InternalCanvas.g:4829:2: ( ruleFloatingText )
            {
            // InternalCanvas.g:4829:2: ( ruleFloatingText )
            // InternalCanvas.g:4830:3: ruleFloatingText
            {
             before(grammarAccess.getShapeAccess().getTextFloatingTextParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatingText();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getTextFloatingTextParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__TextAssignment_7"


    // $ANTLR start "rule__FloatingTexts__TextsAssignment_2"
    // InternalCanvas.g:4839:1: rule__FloatingTexts__TextsAssignment_2 : ( ruleFloatingText ) ;
    public final void rule__FloatingTexts__TextsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4843:1: ( ( ruleFloatingText ) )
            // InternalCanvas.g:4844:2: ( ruleFloatingText )
            {
            // InternalCanvas.g:4844:2: ( ruleFloatingText )
            // InternalCanvas.g:4845:3: ruleFloatingText
            {
             before(grammarAccess.getFloatingTextsAccess().getTextsFloatingTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatingText();

            state._fsp--;

             after(grammarAccess.getFloatingTextsAccess().getTextsFloatingTextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingTexts__TextsAssignment_2"


    // $ANTLR start "rule__FloatingText__RectAssignment_2"
    // InternalCanvas.g:4854:1: rule__FloatingText__RectAssignment_2 : ( ruleRectangle ) ;
    public final void rule__FloatingText__RectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4858:1: ( ( ruleRectangle ) )
            // InternalCanvas.g:4859:2: ( ruleRectangle )
            {
            // InternalCanvas.g:4859:2: ( ruleRectangle )
            // InternalCanvas.g:4860:3: ruleRectangle
            {
             before(grammarAccess.getFloatingTextAccess().getRectRectangleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRectangle();

            state._fsp--;

             after(grammarAccess.getFloatingTextAccess().getRectRectangleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__RectAssignment_2"


    // $ANTLR start "rule__FloatingText__EndAssignment_3"
    // InternalCanvas.g:4869:1: rule__FloatingText__EndAssignment_3 : ( ruleEnumEnd ) ;
    public final void rule__FloatingText__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4873:1: ( ( ruleEnumEnd ) )
            // InternalCanvas.g:4874:2: ( ruleEnumEnd )
            {
            // InternalCanvas.g:4874:2: ( ruleEnumEnd )
            // InternalCanvas.g:4875:3: ruleEnumEnd
            {
             before(grammarAccess.getFloatingTextAccess().getEndEnumEndParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumEnd();

            state._fsp--;

             after(grammarAccess.getFloatingTextAccess().getEndEnumEndParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__EndAssignment_3"


    // $ANTLR start "rule__EnumEnd__WhereAssignment_1"
    // InternalCanvas.g:4884:1: rule__EnumEnd__WhereAssignment_1 : ( ( rule__EnumEnd__WhereAlternatives_1_0 ) ) ;
    public final void rule__EnumEnd__WhereAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4888:1: ( ( ( rule__EnumEnd__WhereAlternatives_1_0 ) ) )
            // InternalCanvas.g:4889:2: ( ( rule__EnumEnd__WhereAlternatives_1_0 ) )
            {
            // InternalCanvas.g:4889:2: ( ( rule__EnumEnd__WhereAlternatives_1_0 ) )
            // InternalCanvas.g:4890:3: ( rule__EnumEnd__WhereAlternatives_1_0 )
            {
             before(grammarAccess.getEnumEndAccess().getWhereAlternatives_1_0()); 
            // InternalCanvas.g:4891:3: ( rule__EnumEnd__WhereAlternatives_1_0 )
            // InternalCanvas.g:4891:4: rule__EnumEnd__WhereAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__WhereAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumEndAccess().getWhereAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumEnd__WhereAssignment_1"


    // $ANTLR start "rule__Connectors__ConnectorsAssignment_2"
    // InternalCanvas.g:4899:1: rule__Connectors__ConnectorsAssignment_2 : ( ruleConnector ) ;
    public final void rule__Connectors__ConnectorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4903:1: ( ( ruleConnector ) )
            // InternalCanvas.g:4904:2: ( ruleConnector )
            {
            // InternalCanvas.g:4904:2: ( ruleConnector )
            // InternalCanvas.g:4905:3: ruleConnector
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsConnectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorsAccess().getConnectorsConnectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connectors__ConnectorsAssignment_2"


    // $ANTLR start "rule__Connector__NameAssignment_1"
    // InternalCanvas.g:4914:1: rule__Connector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4918:1: ( ( RULE_ID ) )
            // InternalCanvas.g:4919:2: ( RULE_ID )
            {
            // InternalCanvas.g:4919:2: ( RULE_ID )
            // InternalCanvas.g:4920:3: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__NameAssignment_1"


    // $ANTLR start "rule__Connector__RepresentsAssignment_3"
    // InternalCanvas.g:4929:1: rule__Connector__RepresentsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Connector__RepresentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4933:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4934:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4934:2: ( RULE_STRING )
            // InternalCanvas.g:4935:3: RULE_STRING
            {
             before(grammarAccess.getConnectorAccess().getRepresentsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRepresentsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__RepresentsAssignment_3"


    // $ANTLR start "rule__Connector__PolylineAssignment_4"
    // InternalCanvas.g:4944:1: rule__Connector__PolylineAssignment_4 : ( rulePolyline ) ;
    public final void rule__Connector__PolylineAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4948:1: ( ( rulePolyline ) )
            // InternalCanvas.g:4949:2: ( rulePolyline )
            {
            // InternalCanvas.g:4949:2: ( rulePolyline )
            // InternalCanvas.g:4950:3: rulePolyline
            {
             before(grammarAccess.getConnectorAccess().getPolylinePolylineParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePolyline();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getPolylinePolylineParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__PolylineAssignment_4"


    // $ANTLR start "rule__Connector__AnchorsAssignment_5"
    // InternalCanvas.g:4959:1: rule__Connector__AnchorsAssignment_5 : ( ruleAnchors ) ;
    public final void rule__Connector__AnchorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4963:1: ( ( ruleAnchors ) )
            // InternalCanvas.g:4964:2: ( ruleAnchors )
            {
            // InternalCanvas.g:4964:2: ( ruleAnchors )
            // InternalCanvas.g:4965:3: ruleAnchors
            {
             before(grammarAccess.getConnectorAccess().getAnchorsAnchorsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAnchors();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getAnchorsAnchorsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__AnchorsAssignment_5"


    // $ANTLR start "rule__Connector__TextsAssignment_6"
    // InternalCanvas.g:4974:1: rule__Connector__TextsAssignment_6 : ( ruleFloatingTexts ) ;
    public final void rule__Connector__TextsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4978:1: ( ( ruleFloatingTexts ) )
            // InternalCanvas.g:4979:2: ( ruleFloatingTexts )
            {
            // InternalCanvas.g:4979:2: ( ruleFloatingTexts )
            // InternalCanvas.g:4980:3: ruleFloatingTexts
            {
             before(grammarAccess.getConnectorAccess().getTextsFloatingTextsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatingTexts();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getTextsFloatingTextsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__TextsAssignment_6"


    // $ANTLR start "rule__Anchors__StartAnchorAssignment_1"
    // InternalCanvas.g:4989:1: rule__Anchors__StartAnchorAssignment_1 : ( ruleStartAnchor ) ;
    public final void rule__Anchors__StartAnchorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4993:1: ( ( ruleStartAnchor ) )
            // InternalCanvas.g:4994:2: ( ruleStartAnchor )
            {
            // InternalCanvas.g:4994:2: ( ruleStartAnchor )
            // InternalCanvas.g:4995:3: ruleStartAnchor
            {
             before(grammarAccess.getAnchorsAccess().getStartAnchorStartAnchorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStartAnchor();

            state._fsp--;

             after(grammarAccess.getAnchorsAccess().getStartAnchorStartAnchorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__StartAnchorAssignment_1"


    // $ANTLR start "rule__Anchors__EndAnchorAssignment_2"
    // InternalCanvas.g:5004:1: rule__Anchors__EndAnchorAssignment_2 : ( ruleEndAnchor ) ;
    public final void rule__Anchors__EndAnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5008:1: ( ( ruleEndAnchor ) )
            // InternalCanvas.g:5009:2: ( ruleEndAnchor )
            {
            // InternalCanvas.g:5009:2: ( ruleEndAnchor )
            // InternalCanvas.g:5010:3: ruleEndAnchor
            {
             before(grammarAccess.getAnchorsAccess().getEndAnchorEndAnchorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEndAnchor();

            state._fsp--;

             after(grammarAccess.getAnchorsAccess().getEndAnchorEndAnchorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anchors__EndAnchorAssignment_2"


    // $ANTLR start "rule__StartAnchor__PointAssignment_1"
    // InternalCanvas.g:5019:1: rule__StartAnchor__PointAssignment_1 : ( rulePointDefinition ) ;
    public final void rule__StartAnchor__PointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5023:1: ( ( rulePointDefinition ) )
            // InternalCanvas.g:5024:2: ( rulePointDefinition )
            {
            // InternalCanvas.g:5024:2: ( rulePointDefinition )
            // InternalCanvas.g:5025:3: rulePointDefinition
            {
             before(grammarAccess.getStartAnchorAccess().getPointPointDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePointDefinition();

            state._fsp--;

             after(grammarAccess.getStartAnchorAccess().getPointPointDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__PointAssignment_1"


    // $ANTLR start "rule__StartAnchor__AnchorAssignment_2"
    // InternalCanvas.g:5034:1: rule__StartAnchor__AnchorAssignment_2 : ( ruleAnchor ) ;
    public final void rule__StartAnchor__AnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5038:1: ( ( ruleAnchor ) )
            // InternalCanvas.g:5039:2: ( ruleAnchor )
            {
            // InternalCanvas.g:5039:2: ( ruleAnchor )
            // InternalCanvas.g:5040:3: ruleAnchor
            {
             before(grammarAccess.getStartAnchorAccess().getAnchorAnchorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnchor();

            state._fsp--;

             after(grammarAccess.getStartAnchorAccess().getAnchorAnchorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAnchor__AnchorAssignment_2"


    // $ANTLR start "rule__EndAnchor__PointAssignment_1"
    // InternalCanvas.g:5049:1: rule__EndAnchor__PointAssignment_1 : ( rulePointDefinition ) ;
    public final void rule__EndAnchor__PointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5053:1: ( ( rulePointDefinition ) )
            // InternalCanvas.g:5054:2: ( rulePointDefinition )
            {
            // InternalCanvas.g:5054:2: ( rulePointDefinition )
            // InternalCanvas.g:5055:3: rulePointDefinition
            {
             before(grammarAccess.getEndAnchorAccess().getPointPointDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePointDefinition();

            state._fsp--;

             after(grammarAccess.getEndAnchorAccess().getPointPointDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__PointAssignment_1"


    // $ANTLR start "rule__EndAnchor__AnchorAssignment_2"
    // InternalCanvas.g:5064:1: rule__EndAnchor__AnchorAssignment_2 : ( ruleAnchor ) ;
    public final void rule__EndAnchor__AnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5068:1: ( ( ruleAnchor ) )
            // InternalCanvas.g:5069:2: ( ruleAnchor )
            {
            // InternalCanvas.g:5069:2: ( ruleAnchor )
            // InternalCanvas.g:5070:3: ruleAnchor
            {
             before(grammarAccess.getEndAnchorAccess().getAnchorAnchorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnchor();

            state._fsp--;

             after(grammarAccess.getEndAnchorAccess().getAnchorAnchorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndAnchor__AnchorAssignment_2"


    // $ANTLR start "rule__ShapeAnchorElement__ElementAssignment_1"
    // InternalCanvas.g:5079:1: rule__ShapeAnchorElement__ElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ShapeAnchorElement__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5083:1: ( ( ( RULE_ID ) ) )
            // InternalCanvas.g:5084:2: ( ( RULE_ID ) )
            {
            // InternalCanvas.g:5084:2: ( ( RULE_ID ) )
            // InternalCanvas.g:5085:3: ( RULE_ID )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementShapeCrossReference_1_0()); 
            // InternalCanvas.g:5086:3: ( RULE_ID )
            // InternalCanvas.g:5087:4: RULE_ID
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementShapeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShapeAnchorElementAccess().getElementShapeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getShapeAnchorElementAccess().getElementShapeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeAnchorElement__ElementAssignment_1"


    // $ANTLR start "rule__ConnectorAnchorElement__ElementAssignment_1"
    // InternalCanvas.g:5098:1: rule__ConnectorAnchorElement__ElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectorAnchorElement__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5102:1: ( ( ( RULE_ID ) ) )
            // InternalCanvas.g:5103:2: ( ( RULE_ID ) )
            {
            // InternalCanvas.g:5103:2: ( ( RULE_ID ) )
            // InternalCanvas.g:5104:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorCrossReference_1_0()); 
            // InternalCanvas.g:5105:3: ( RULE_ID )
            // InternalCanvas.g:5106:4: RULE_ID
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorAnchorElement__ElementAssignment_1"


    // $ANTLR start "rule__Polyline__SegmentsAssignment_2"
    // InternalCanvas.g:5117:1: rule__Polyline__SegmentsAssignment_2 : ( ruleSegment ) ;
    public final void rule__Polyline__SegmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5121:1: ( ( ruleSegment ) )
            // InternalCanvas.g:5122:2: ( ruleSegment )
            {
            // InternalCanvas.g:5122:2: ( ruleSegment )
            // InternalCanvas.g:5123:3: ruleSegment
            {
             before(grammarAccess.getPolylineAccess().getSegmentsSegmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getPolylineAccess().getSegmentsSegmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyline__SegmentsAssignment_2"


    // $ANTLR start "rule__Segment__StartPointAssignment_2"
    // InternalCanvas.g:5132:1: rule__Segment__StartPointAssignment_2 : ( rulePoint ) ;
    public final void rule__Segment__StartPointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5136:1: ( ( rulePoint ) )
            // InternalCanvas.g:5137:2: ( rulePoint )
            {
            // InternalCanvas.g:5137:2: ( rulePoint )
            // InternalCanvas.g:5138:3: rulePoint
            {
             before(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__StartPointAssignment_2"


    // $ANTLR start "rule__Segment__EndPointAssignment_4"
    // InternalCanvas.g:5147:1: rule__Segment__EndPointAssignment_4 : ( rulePoint ) ;
    public final void rule__Segment__EndPointAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5151:1: ( ( rulePoint ) )
            // InternalCanvas.g:5152:2: ( rulePoint )
            {
            // InternalCanvas.g:5152:2: ( rulePoint )
            // InternalCanvas.g:5153:3: rulePoint
            {
             before(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__EndPointAssignment_4"


    // $ANTLR start "rule__Point__XAssignment_1"
    // InternalCanvas.g:5162:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5166:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5167:2: ( RULE_INT )
            {
            // InternalCanvas.g:5167:2: ( RULE_INT )
            // InternalCanvas.g:5168:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__XAssignment_1"


    // $ANTLR start "rule__Point__YAssignment_3"
    // InternalCanvas.g:5177:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5181:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5182:2: ( RULE_INT )
            {
            // InternalCanvas.g:5182:2: ( RULE_INT )
            // InternalCanvas.g:5183:3: RULE_INT
            {
             before(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__YAssignment_3"


    // $ANTLR start "rule__PointDefinition__XAssignment_2"
    // InternalCanvas.g:5192:1: rule__PointDefinition__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__PointDefinition__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5196:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5197:2: ( RULE_INT )
            {
            // InternalCanvas.g:5197:2: ( RULE_INT )
            // InternalCanvas.g:5198:3: RULE_INT
            {
             before(grammarAccess.getPointDefinitionAccess().getXINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getXINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__XAssignment_2"


    // $ANTLR start "rule__PointDefinition__YAssignment_4"
    // InternalCanvas.g:5207:1: rule__PointDefinition__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__PointDefinition__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5211:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5212:2: ( RULE_INT )
            {
            // InternalCanvas.g:5212:2: ( RULE_INT )
            // InternalCanvas.g:5213:3: RULE_INT
            {
             before(grammarAccess.getPointDefinitionAccess().getYINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointDefinitionAccess().getYINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointDefinition__YAssignment_4"


    // $ANTLR start "rule__Rectangle__XAssignment_2"
    // InternalCanvas.g:5222:1: rule__Rectangle__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Rectangle__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5226:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5227:2: ( RULE_INT )
            {
            // InternalCanvas.g:5227:2: ( RULE_INT )
            // InternalCanvas.g:5228:3: RULE_INT
            {
             before(grammarAccess.getRectangleAccess().getXINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getXINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__XAssignment_2"


    // $ANTLR start "rule__Rectangle__YAssignment_4"
    // InternalCanvas.g:5237:1: rule__Rectangle__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Rectangle__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5241:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5242:2: ( RULE_INT )
            {
            // InternalCanvas.g:5242:2: ( RULE_INT )
            // InternalCanvas.g:5243:3: RULE_INT
            {
             before(grammarAccess.getRectangleAccess().getYINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getYINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__YAssignment_4"


    // $ANTLR start "rule__Rectangle__WAssignment_6"
    // InternalCanvas.g:5252:1: rule__Rectangle__WAssignment_6 : ( RULE_INT ) ;
    public final void rule__Rectangle__WAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5256:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5257:2: ( RULE_INT )
            {
            // InternalCanvas.g:5257:2: ( RULE_INT )
            // InternalCanvas.g:5258:3: RULE_INT
            {
             before(grammarAccess.getRectangleAccess().getWINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getWINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__WAssignment_6"


    // $ANTLR start "rule__Rectangle__HAssignment_8"
    // InternalCanvas.g:5267:1: rule__Rectangle__HAssignment_8 : ( RULE_INT ) ;
    public final void rule__Rectangle__HAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5271:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5272:2: ( RULE_INT )
            {
            // InternalCanvas.g:5272:2: ( RULE_INT )
            // InternalCanvas.g:5273:3: RULE_INT
            {
             before(grammarAccess.getRectangleAccess().getHINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getHINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__HAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001090020012000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001080020010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0400002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000080002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001080020010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000040000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004200080040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002100040020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});

}