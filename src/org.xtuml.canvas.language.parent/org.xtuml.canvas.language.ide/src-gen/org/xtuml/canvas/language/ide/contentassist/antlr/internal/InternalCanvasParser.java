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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'render:'", "'properties:'", "'viewport:'", "'shapes:'", "'shape:'", "'texts:'", "'text:'", "'start'", "'end'", "'middle'", "'end_fixed'", "'start_fixed'", "'none'", "'floating'", "'additional'", "'true'", "'false'", "'connectors:'", "'connector:'", "'anchors:'", "'start:'", "'shapeAnchor:'", "'segmentAnchor:'", "'polyline:'", "'segment:'", "'rectangle:'", "'render'", "':'", "'import'", "'zoom'", "'properties'", "'viewport'", "'shapes'", "'shape'", "'texts'", "'text'", "'container'", "'color'", "'connectors'", "'connector'", "'anchors'", "'shapeAnchor'", "'segmentAnchor'", "'polyline'", "','", "'segment'", "'x'", "'y'", "'width'", "'height'", "'rectangle'"
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


    // $ANTLR start "entryRuleSemanticModel"
    // InternalCanvas.g:78:1: entryRuleSemanticModel : ruleSemanticModel EOF ;
    public final void entryRuleSemanticModel() throws RecognitionException {
        try {
            // InternalCanvas.g:79:1: ( ruleSemanticModel EOF )
            // InternalCanvas.g:80:1: ruleSemanticModel EOF
            {
             before(grammarAccess.getSemanticModelRule()); 
            pushFollow(FOLLOW_1);
            ruleSemanticModel();

            state._fsp--;

             after(grammarAccess.getSemanticModelRule()); 
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
    // $ANTLR end "entryRuleSemanticModel"


    // $ANTLR start "ruleSemanticModel"
    // InternalCanvas.g:87:1: ruleSemanticModel : ( ( rule__SemanticModel__Group__0 ) ) ;
    public final void ruleSemanticModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:91:2: ( ( ( rule__SemanticModel__Group__0 ) ) )
            // InternalCanvas.g:92:2: ( ( rule__SemanticModel__Group__0 ) )
            {
            // InternalCanvas.g:92:2: ( ( rule__SemanticModel__Group__0 ) )
            // InternalCanvas.g:93:3: ( rule__SemanticModel__Group__0 )
            {
             before(grammarAccess.getSemanticModelAccess().getGroup()); 
            // InternalCanvas.g:94:3: ( rule__SemanticModel__Group__0 )
            // InternalCanvas.g:94:4: rule__SemanticModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SemanticModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSemanticModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSemanticModel"


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


    // $ANTLR start "entryRuleFloatingTexts"
    // InternalCanvas.g:203:1: entryRuleFloatingTexts : ruleFloatingTexts EOF ;
    public final void entryRuleFloatingTexts() throws RecognitionException {
        try {
            // InternalCanvas.g:204:1: ( ruleFloatingTexts EOF )
            // InternalCanvas.g:205:1: ruleFloatingTexts EOF
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
    // InternalCanvas.g:212:1: ruleFloatingTexts : ( ( rule__FloatingTexts__Group__0 ) ) ;
    public final void ruleFloatingTexts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:216:2: ( ( ( rule__FloatingTexts__Group__0 ) ) )
            // InternalCanvas.g:217:2: ( ( rule__FloatingTexts__Group__0 ) )
            {
            // InternalCanvas.g:217:2: ( ( rule__FloatingTexts__Group__0 ) )
            // InternalCanvas.g:218:3: ( rule__FloatingTexts__Group__0 )
            {
             before(grammarAccess.getFloatingTextsAccess().getGroup()); 
            // InternalCanvas.g:219:3: ( rule__FloatingTexts__Group__0 )
            // InternalCanvas.g:219:4: rule__FloatingTexts__Group__0
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
    // InternalCanvas.g:228:1: entryRuleFloatingText : ruleFloatingText EOF ;
    public final void entryRuleFloatingText() throws RecognitionException {
        try {
            // InternalCanvas.g:229:1: ( ruleFloatingText EOF )
            // InternalCanvas.g:230:1: ruleFloatingText EOF
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
    // InternalCanvas.g:237:1: ruleFloatingText : ( ( rule__FloatingText__Group__0 ) ) ;
    public final void ruleFloatingText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:241:2: ( ( ( rule__FloatingText__Group__0 ) ) )
            // InternalCanvas.g:242:2: ( ( rule__FloatingText__Group__0 ) )
            {
            // InternalCanvas.g:242:2: ( ( rule__FloatingText__Group__0 ) )
            // InternalCanvas.g:243:3: ( rule__FloatingText__Group__0 )
            {
             before(grammarAccess.getFloatingTextAccess().getGroup()); 
            // InternalCanvas.g:244:3: ( rule__FloatingText__Group__0 )
            // InternalCanvas.g:244:4: rule__FloatingText__Group__0
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
    // InternalCanvas.g:253:1: entryRuleEnumEnd : ruleEnumEnd EOF ;
    public final void entryRuleEnumEnd() throws RecognitionException {
        try {
            // InternalCanvas.g:254:1: ( ruleEnumEnd EOF )
            // InternalCanvas.g:255:1: ruleEnumEnd EOF
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
    // InternalCanvas.g:262:1: ruleEnumEnd : ( ( rule__EnumEnd__Alternatives ) ) ;
    public final void ruleEnumEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:266:2: ( ( ( rule__EnumEnd__Alternatives ) ) )
            // InternalCanvas.g:267:2: ( ( rule__EnumEnd__Alternatives ) )
            {
            // InternalCanvas.g:267:2: ( ( rule__EnumEnd__Alternatives ) )
            // InternalCanvas.g:268:3: ( rule__EnumEnd__Alternatives )
            {
             before(grammarAccess.getEnumEndAccess().getAlternatives()); 
            // InternalCanvas.g:269:3: ( rule__EnumEnd__Alternatives )
            // InternalCanvas.g:269:4: rule__EnumEnd__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnumEnd__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumEndAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleShapeProps"
    // InternalCanvas.g:278:1: entryRuleShapeProps : ruleShapeProps EOF ;
    public final void entryRuleShapeProps() throws RecognitionException {
        try {
            // InternalCanvas.g:279:1: ( ruleShapeProps EOF )
            // InternalCanvas.g:280:1: ruleShapeProps EOF
            {
             before(grammarAccess.getShapePropsRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeProps();

            state._fsp--;

             after(grammarAccess.getShapePropsRule()); 
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
    // $ANTLR end "entryRuleShapeProps"


    // $ANTLR start "ruleShapeProps"
    // InternalCanvas.g:287:1: ruleShapeProps : ( ( rule__ShapeProps__Group__0 ) ) ;
    public final void ruleShapeProps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:291:2: ( ( ( rule__ShapeProps__Group__0 ) ) )
            // InternalCanvas.g:292:2: ( ( rule__ShapeProps__Group__0 ) )
            {
            // InternalCanvas.g:292:2: ( ( rule__ShapeProps__Group__0 ) )
            // InternalCanvas.g:293:3: ( rule__ShapeProps__Group__0 )
            {
             before(grammarAccess.getShapePropsAccess().getGroup()); 
            // InternalCanvas.g:294:3: ( rule__ShapeProps__Group__0 )
            // InternalCanvas.g:294:4: rule__ShapeProps__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeProps__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapePropsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeProps"


    // $ANTLR start "entryRuleContainer"
    // InternalCanvas.g:303:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalCanvas.g:304:1: ( ruleContainer EOF )
            // InternalCanvas.g:305:1: ruleContainer EOF
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
    // InternalCanvas.g:312:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:316:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalCanvas.g:317:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalCanvas.g:317:2: ( ( rule__Container__Group__0 ) )
            // InternalCanvas.g:318:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalCanvas.g:319:3: ( rule__Container__Group__0 )
            // InternalCanvas.g:319:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleColor"
    // InternalCanvas.g:328:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalCanvas.g:329:1: ( ruleColor EOF )
            // InternalCanvas.g:330:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalCanvas.g:337:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:341:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalCanvas.g:342:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalCanvas.g:342:2: ( ( rule__Color__Group__0 ) )
            // InternalCanvas.g:343:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalCanvas.g:344:3: ( rule__Color__Group__0 )
            // InternalCanvas.g:344:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleConnectors"
    // InternalCanvas.g:353:1: entryRuleConnectors : ruleConnectors EOF ;
    public final void entryRuleConnectors() throws RecognitionException {
        try {
            // InternalCanvas.g:354:1: ( ruleConnectors EOF )
            // InternalCanvas.g:355:1: ruleConnectors EOF
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
    // InternalCanvas.g:362:1: ruleConnectors : ( ( rule__Connectors__Group__0 ) ) ;
    public final void ruleConnectors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:366:2: ( ( ( rule__Connectors__Group__0 ) ) )
            // InternalCanvas.g:367:2: ( ( rule__Connectors__Group__0 ) )
            {
            // InternalCanvas.g:367:2: ( ( rule__Connectors__Group__0 ) )
            // InternalCanvas.g:368:3: ( rule__Connectors__Group__0 )
            {
             before(grammarAccess.getConnectorsAccess().getGroup()); 
            // InternalCanvas.g:369:3: ( rule__Connectors__Group__0 )
            // InternalCanvas.g:369:4: rule__Connectors__Group__0
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
    // InternalCanvas.g:378:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCanvas.g:379:1: ( ruleConnector EOF )
            // InternalCanvas.g:380:1: ruleConnector EOF
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
    // InternalCanvas.g:387:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:391:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalCanvas.g:392:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalCanvas.g:392:2: ( ( rule__Connector__Group__0 ) )
            // InternalCanvas.g:393:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalCanvas.g:394:3: ( rule__Connector__Group__0 )
            // InternalCanvas.g:394:4: rule__Connector__Group__0
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
    // InternalCanvas.g:403:1: entryRuleAnchors : ruleAnchors EOF ;
    public final void entryRuleAnchors() throws RecognitionException {
        try {
            // InternalCanvas.g:404:1: ( ruleAnchors EOF )
            // InternalCanvas.g:405:1: ruleAnchors EOF
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
    // InternalCanvas.g:412:1: ruleAnchors : ( ( rule__Anchors__Group__0 ) ) ;
    public final void ruleAnchors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:416:2: ( ( ( rule__Anchors__Group__0 ) ) )
            // InternalCanvas.g:417:2: ( ( rule__Anchors__Group__0 ) )
            {
            // InternalCanvas.g:417:2: ( ( rule__Anchors__Group__0 ) )
            // InternalCanvas.g:418:3: ( rule__Anchors__Group__0 )
            {
             before(grammarAccess.getAnchorsAccess().getGroup()); 
            // InternalCanvas.g:419:3: ( rule__Anchors__Group__0 )
            // InternalCanvas.g:419:4: rule__Anchors__Group__0
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
    // InternalCanvas.g:428:1: entryRuleStartAnchor : ruleStartAnchor EOF ;
    public final void entryRuleStartAnchor() throws RecognitionException {
        try {
            // InternalCanvas.g:429:1: ( ruleStartAnchor EOF )
            // InternalCanvas.g:430:1: ruleStartAnchor EOF
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
    // InternalCanvas.g:437:1: ruleStartAnchor : ( ( rule__StartAnchor__Group__0 ) ) ;
    public final void ruleStartAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:441:2: ( ( ( rule__StartAnchor__Group__0 ) ) )
            // InternalCanvas.g:442:2: ( ( rule__StartAnchor__Group__0 ) )
            {
            // InternalCanvas.g:442:2: ( ( rule__StartAnchor__Group__0 ) )
            // InternalCanvas.g:443:3: ( rule__StartAnchor__Group__0 )
            {
             before(grammarAccess.getStartAnchorAccess().getGroup()); 
            // InternalCanvas.g:444:3: ( rule__StartAnchor__Group__0 )
            // InternalCanvas.g:444:4: rule__StartAnchor__Group__0
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
    // InternalCanvas.g:453:1: entryRuleEndAnchor : ruleEndAnchor EOF ;
    public final void entryRuleEndAnchor() throws RecognitionException {
        try {
            // InternalCanvas.g:454:1: ( ruleEndAnchor EOF )
            // InternalCanvas.g:455:1: ruleEndAnchor EOF
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
    // InternalCanvas.g:462:1: ruleEndAnchor : ( ( rule__EndAnchor__Group__0 ) ) ;
    public final void ruleEndAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:466:2: ( ( ( rule__EndAnchor__Group__0 ) ) )
            // InternalCanvas.g:467:2: ( ( rule__EndAnchor__Group__0 ) )
            {
            // InternalCanvas.g:467:2: ( ( rule__EndAnchor__Group__0 ) )
            // InternalCanvas.g:468:3: ( rule__EndAnchor__Group__0 )
            {
             before(grammarAccess.getEndAnchorAccess().getGroup()); 
            // InternalCanvas.g:469:3: ( rule__EndAnchor__Group__0 )
            // InternalCanvas.g:469:4: rule__EndAnchor__Group__0
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
    // InternalCanvas.g:478:1: entryRuleAnchor : ruleAnchor EOF ;
    public final void entryRuleAnchor() throws RecognitionException {
        try {
            // InternalCanvas.g:479:1: ( ruleAnchor EOF )
            // InternalCanvas.g:480:1: ruleAnchor EOF
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
    // InternalCanvas.g:487:1: ruleAnchor : ( ( rule__Anchor__Alternatives ) ) ;
    public final void ruleAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:491:2: ( ( ( rule__Anchor__Alternatives ) ) )
            // InternalCanvas.g:492:2: ( ( rule__Anchor__Alternatives ) )
            {
            // InternalCanvas.g:492:2: ( ( rule__Anchor__Alternatives ) )
            // InternalCanvas.g:493:3: ( rule__Anchor__Alternatives )
            {
             before(grammarAccess.getAnchorAccess().getAlternatives()); 
            // InternalCanvas.g:494:3: ( rule__Anchor__Alternatives )
            // InternalCanvas.g:494:4: rule__Anchor__Alternatives
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
    // InternalCanvas.g:503:1: entryRuleShapeAnchorElement : ruleShapeAnchorElement EOF ;
    public final void entryRuleShapeAnchorElement() throws RecognitionException {
        try {
            // InternalCanvas.g:504:1: ( ruleShapeAnchorElement EOF )
            // InternalCanvas.g:505:1: ruleShapeAnchorElement EOF
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
    // InternalCanvas.g:512:1: ruleShapeAnchorElement : ( ( rule__ShapeAnchorElement__Group__0 ) ) ;
    public final void ruleShapeAnchorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:516:2: ( ( ( rule__ShapeAnchorElement__Group__0 ) ) )
            // InternalCanvas.g:517:2: ( ( rule__ShapeAnchorElement__Group__0 ) )
            {
            // InternalCanvas.g:517:2: ( ( rule__ShapeAnchorElement__Group__0 ) )
            // InternalCanvas.g:518:3: ( rule__ShapeAnchorElement__Group__0 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getGroup()); 
            // InternalCanvas.g:519:3: ( rule__ShapeAnchorElement__Group__0 )
            // InternalCanvas.g:519:4: rule__ShapeAnchorElement__Group__0
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
    // InternalCanvas.g:528:1: entryRuleConnectorAnchorElement : ruleConnectorAnchorElement EOF ;
    public final void entryRuleConnectorAnchorElement() throws RecognitionException {
        try {
            // InternalCanvas.g:529:1: ( ruleConnectorAnchorElement EOF )
            // InternalCanvas.g:530:1: ruleConnectorAnchorElement EOF
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
    // InternalCanvas.g:537:1: ruleConnectorAnchorElement : ( ( rule__ConnectorAnchorElement__Group__0 ) ) ;
    public final void ruleConnectorAnchorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:541:2: ( ( ( rule__ConnectorAnchorElement__Group__0 ) ) )
            // InternalCanvas.g:542:2: ( ( rule__ConnectorAnchorElement__Group__0 ) )
            {
            // InternalCanvas.g:542:2: ( ( rule__ConnectorAnchorElement__Group__0 ) )
            // InternalCanvas.g:543:3: ( rule__ConnectorAnchorElement__Group__0 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getGroup()); 
            // InternalCanvas.g:544:3: ( rule__ConnectorAnchorElement__Group__0 )
            // InternalCanvas.g:544:4: rule__ConnectorAnchorElement__Group__0
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


    // $ANTLR start "entryRuleConnectorProps"
    // InternalCanvas.g:553:1: entryRuleConnectorProps : ruleConnectorProps EOF ;
    public final void entryRuleConnectorProps() throws RecognitionException {
        try {
            // InternalCanvas.g:554:1: ( ruleConnectorProps EOF )
            // InternalCanvas.g:555:1: ruleConnectorProps EOF
            {
             before(grammarAccess.getConnectorPropsRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectorProps();

            state._fsp--;

             after(grammarAccess.getConnectorPropsRule()); 
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
    // $ANTLR end "entryRuleConnectorProps"


    // $ANTLR start "ruleConnectorProps"
    // InternalCanvas.g:562:1: ruleConnectorProps : ( ( rule__ConnectorProps__Group__0 ) ) ;
    public final void ruleConnectorProps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:566:2: ( ( ( rule__ConnectorProps__Group__0 ) ) )
            // InternalCanvas.g:567:2: ( ( rule__ConnectorProps__Group__0 ) )
            {
            // InternalCanvas.g:567:2: ( ( rule__ConnectorProps__Group__0 ) )
            // InternalCanvas.g:568:3: ( rule__ConnectorProps__Group__0 )
            {
             before(grammarAccess.getConnectorPropsAccess().getGroup()); 
            // InternalCanvas.g:569:3: ( rule__ConnectorProps__Group__0 )
            // InternalCanvas.g:569:4: rule__ConnectorProps__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorProps__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorPropsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectorProps"


    // $ANTLR start "entryRulePolyline"
    // InternalCanvas.g:578:1: entryRulePolyline : rulePolyline EOF ;
    public final void entryRulePolyline() throws RecognitionException {
        try {
            // InternalCanvas.g:579:1: ( rulePolyline EOF )
            // InternalCanvas.g:580:1: rulePolyline EOF
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
    // InternalCanvas.g:587:1: rulePolyline : ( ( rule__Polyline__Group__0 ) ) ;
    public final void rulePolyline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:591:2: ( ( ( rule__Polyline__Group__0 ) ) )
            // InternalCanvas.g:592:2: ( ( rule__Polyline__Group__0 ) )
            {
            // InternalCanvas.g:592:2: ( ( rule__Polyline__Group__0 ) )
            // InternalCanvas.g:593:3: ( rule__Polyline__Group__0 )
            {
             before(grammarAccess.getPolylineAccess().getGroup()); 
            // InternalCanvas.g:594:3: ( rule__Polyline__Group__0 )
            // InternalCanvas.g:594:4: rule__Polyline__Group__0
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
    // InternalCanvas.g:603:1: entryRuleSegment : ruleSegment EOF ;
    public final void entryRuleSegment() throws RecognitionException {
        try {
            // InternalCanvas.g:604:1: ( ruleSegment EOF )
            // InternalCanvas.g:605:1: ruleSegment EOF
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
    // InternalCanvas.g:612:1: ruleSegment : ( ( rule__Segment__Group__0 ) ) ;
    public final void ruleSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:616:2: ( ( ( rule__Segment__Group__0 ) ) )
            // InternalCanvas.g:617:2: ( ( rule__Segment__Group__0 ) )
            {
            // InternalCanvas.g:617:2: ( ( rule__Segment__Group__0 ) )
            // InternalCanvas.g:618:3: ( rule__Segment__Group__0 )
            {
             before(grammarAccess.getSegmentAccess().getGroup()); 
            // InternalCanvas.g:619:3: ( rule__Segment__Group__0 )
            // InternalCanvas.g:619:4: rule__Segment__Group__0
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
    // InternalCanvas.g:628:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalCanvas.g:629:1: ( rulePoint EOF )
            // InternalCanvas.g:630:1: rulePoint EOF
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
    // InternalCanvas.g:637:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:641:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalCanvas.g:642:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalCanvas.g:642:2: ( ( rule__Point__Group__0 ) )
            // InternalCanvas.g:643:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalCanvas.g:644:3: ( rule__Point__Group__0 )
            // InternalCanvas.g:644:4: rule__Point__Group__0
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


    // $ANTLR start "entryRuleRectangle"
    // InternalCanvas.g:653:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalCanvas.g:654:1: ( ruleRectangle EOF )
            // InternalCanvas.g:655:1: ruleRectangle EOF
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
    // InternalCanvas.g:662:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:666:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalCanvas.g:667:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalCanvas.g:667:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalCanvas.g:668:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalCanvas.g:669:3: ( rule__Rectangle__Group__0 )
            // InternalCanvas.g:669:4: rule__Rectangle__Group__0
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


    // $ANTLR start "rule__Model__Alternatives_1"
    // InternalCanvas.g:677:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__Group_1_0__0 ) ) | ( 'render:' ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:681:1: ( ( ( rule__Model__Group_1_0__0 ) ) | ( 'render:' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCanvas.g:682:2: ( ( rule__Model__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:682:2: ( ( rule__Model__Group_1_0__0 ) )
                    // InternalCanvas.g:683:3: ( rule__Model__Group_1_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_1_0()); 
                    // InternalCanvas.g:684:3: ( rule__Model__Group_1_0__0 )
                    // InternalCanvas.g:684:4: rule__Model__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:688:2: ( 'render:' )
                    {
                    // InternalCanvas.g:688:2: ( 'render:' )
                    // InternalCanvas.g:689:3: 'render:'
                    {
                     before(grammarAccess.getModelAccess().getRenderKeyword_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getRenderKeyword_1_1()); 

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
    // $ANTLR end "rule__Model__Alternatives_1"


    // $ANTLR start "rule__ModelProperties__Alternatives_0"
    // InternalCanvas.g:698:1: rule__ModelProperties__Alternatives_0 : ( ( ( rule__ModelProperties__Group_0_0__0 ) ) | ( 'properties:' ) );
    public final void rule__ModelProperties__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:702:1: ( ( ( rule__ModelProperties__Group_0_0__0 ) ) | ( 'properties:' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCanvas.g:703:2: ( ( rule__ModelProperties__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:703:2: ( ( rule__ModelProperties__Group_0_0__0 ) )
                    // InternalCanvas.g:704:3: ( rule__ModelProperties__Group_0_0__0 )
                    {
                     before(grammarAccess.getModelPropertiesAccess().getGroup_0_0()); 
                    // InternalCanvas.g:705:3: ( rule__ModelProperties__Group_0_0__0 )
                    // InternalCanvas.g:705:4: rule__ModelProperties__Group_0_0__0
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
                    // InternalCanvas.g:709:2: ( 'properties:' )
                    {
                    // InternalCanvas.g:709:2: ( 'properties:' )
                    // InternalCanvas.g:710:3: 'properties:'
                    {
                     before(grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalCanvas.g:719:1: rule__ModelProperties__Alternatives_1 : ( ( ( rule__ModelProperties__Group_1_0__0 ) ) | ( 'viewport:' ) );
    public final void rule__ModelProperties__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:723:1: ( ( ( rule__ModelProperties__Group_1_0__0 ) ) | ( 'viewport:' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==42) ) {
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
                    // InternalCanvas.g:724:2: ( ( rule__ModelProperties__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:724:2: ( ( rule__ModelProperties__Group_1_0__0 ) )
                    // InternalCanvas.g:725:3: ( rule__ModelProperties__Group_1_0__0 )
                    {
                     before(grammarAccess.getModelPropertiesAccess().getGroup_1_0()); 
                    // InternalCanvas.g:726:3: ( rule__ModelProperties__Group_1_0__0 )
                    // InternalCanvas.g:726:4: rule__ModelProperties__Group_1_0__0
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
                    // InternalCanvas.g:730:2: ( 'viewport:' )
                    {
                    // InternalCanvas.g:730:2: ( 'viewport:' )
                    // InternalCanvas.g:731:3: 'viewport:'
                    {
                     before(grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_1()); 
                    match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__GraphicalElement__Alternatives"
    // InternalCanvas.g:740:1: rule__GraphicalElement__Alternatives : ( ( ruleShapes ) | ( ruleConnectors ) );
    public final void rule__GraphicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:744:1: ( ( ruleShapes ) | ( ruleConnectors ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14||LA4_0==43) ) {
                alt4=1;
            }
            else if ( (LA4_0==28||LA4_0==49) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCanvas.g:745:2: ( ruleShapes )
                    {
                    // InternalCanvas.g:745:2: ( ruleShapes )
                    // InternalCanvas.g:746:3: ruleShapes
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
                    // InternalCanvas.g:751:2: ( ruleConnectors )
                    {
                    // InternalCanvas.g:751:2: ( ruleConnectors )
                    // InternalCanvas.g:752:3: ruleConnectors
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
    // InternalCanvas.g:761:1: rule__Shapes__Alternatives_1 : ( ( ( rule__Shapes__Group_1_0__0 ) ) | ( 'shapes:' ) );
    public final void rule__Shapes__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:765:1: ( ( ( rule__Shapes__Group_1_0__0 ) ) | ( 'shapes:' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==43) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCanvas.g:766:2: ( ( rule__Shapes__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:766:2: ( ( rule__Shapes__Group_1_0__0 ) )
                    // InternalCanvas.g:767:3: ( rule__Shapes__Group_1_0__0 )
                    {
                     before(grammarAccess.getShapesAccess().getGroup_1_0()); 
                    // InternalCanvas.g:768:3: ( rule__Shapes__Group_1_0__0 )
                    // InternalCanvas.g:768:4: rule__Shapes__Group_1_0__0
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
                    // InternalCanvas.g:772:2: ( 'shapes:' )
                    {
                    // InternalCanvas.g:772:2: ( 'shapes:' )
                    // InternalCanvas.g:773:3: 'shapes:'
                    {
                     before(grammarAccess.getShapesAccess().getShapesKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalCanvas.g:782:1: rule__Shape__Alternatives_1 : ( ( ( rule__Shape__Group_1_0__0 ) ) | ( 'shape:' ) );
    public final void rule__Shape__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:786:1: ( ( ( rule__Shape__Group_1_0__0 ) ) | ( 'shape:' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==44) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCanvas.g:787:2: ( ( rule__Shape__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:787:2: ( ( rule__Shape__Group_1_0__0 ) )
                    // InternalCanvas.g:788:3: ( rule__Shape__Group_1_0__0 )
                    {
                     before(grammarAccess.getShapeAccess().getGroup_1_0()); 
                    // InternalCanvas.g:789:3: ( rule__Shape__Group_1_0__0 )
                    // InternalCanvas.g:789:4: rule__Shape__Group_1_0__0
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
                    // InternalCanvas.g:793:2: ( 'shape:' )
                    {
                    // InternalCanvas.g:793:2: ( 'shape:' )
                    // InternalCanvas.g:794:3: 'shape:'
                    {
                     before(grammarAccess.getShapeAccess().getShapeKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__Shape__Alternatives_6"
    // InternalCanvas.g:803:1: rule__Shape__Alternatives_6 : ( ( ( rule__Shape__Group_6_0__0 ) ) | ( 'render:' ) );
    public final void rule__Shape__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:807:1: ( ( ( rule__Shape__Group_6_0__0 ) ) | ( 'render:' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            else if ( (LA7_0==11) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCanvas.g:808:2: ( ( rule__Shape__Group_6_0__0 ) )
                    {
                    // InternalCanvas.g:808:2: ( ( rule__Shape__Group_6_0__0 ) )
                    // InternalCanvas.g:809:3: ( rule__Shape__Group_6_0__0 )
                    {
                     before(grammarAccess.getShapeAccess().getGroup_6_0()); 
                    // InternalCanvas.g:810:3: ( rule__Shape__Group_6_0__0 )
                    // InternalCanvas.g:810:4: rule__Shape__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:814:2: ( 'render:' )
                    {
                    // InternalCanvas.g:814:2: ( 'render:' )
                    // InternalCanvas.g:815:3: 'render:'
                    {
                     before(grammarAccess.getShapeAccess().getRenderKeyword_6_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getShapeAccess().getRenderKeyword_6_1()); 

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
    // $ANTLR end "rule__Shape__Alternatives_6"


    // $ANTLR start "rule__FloatingTexts__Alternatives_1"
    // InternalCanvas.g:824:1: rule__FloatingTexts__Alternatives_1 : ( ( ( rule__FloatingTexts__Group_1_0__0 ) ) | ( 'texts:' ) );
    public final void rule__FloatingTexts__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:828:1: ( ( ( rule__FloatingTexts__Group_1_0__0 ) ) | ( 'texts:' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==45) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCanvas.g:829:2: ( ( rule__FloatingTexts__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:829:2: ( ( rule__FloatingTexts__Group_1_0__0 ) )
                    // InternalCanvas.g:830:3: ( rule__FloatingTexts__Group_1_0__0 )
                    {
                     before(grammarAccess.getFloatingTextsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:831:3: ( rule__FloatingTexts__Group_1_0__0 )
                    // InternalCanvas.g:831:4: rule__FloatingTexts__Group_1_0__0
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
                    // InternalCanvas.g:835:2: ( 'texts:' )
                    {
                    // InternalCanvas.g:835:2: ( 'texts:' )
                    // InternalCanvas.g:836:3: 'texts:'
                    {
                     before(grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalCanvas.g:845:1: rule__FloatingText__Alternatives_1 : ( ( ( rule__FloatingText__Group_1_0__0 ) ) | ( 'text:' ) );
    public final void rule__FloatingText__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:849:1: ( ( ( rule__FloatingText__Group_1_0__0 ) ) | ( 'text:' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==46) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCanvas.g:850:2: ( ( rule__FloatingText__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:850:2: ( ( rule__FloatingText__Group_1_0__0 ) )
                    // InternalCanvas.g:851:3: ( rule__FloatingText__Group_1_0__0 )
                    {
                     before(grammarAccess.getFloatingTextAccess().getGroup_1_0()); 
                    // InternalCanvas.g:852:3: ( rule__FloatingText__Group_1_0__0 )
                    // InternalCanvas.g:852:4: rule__FloatingText__Group_1_0__0
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
                    // InternalCanvas.g:856:2: ( 'text:' )
                    {
                    // InternalCanvas.g:856:2: ( 'text:' )
                    // InternalCanvas.g:857:3: 'text:'
                    {
                     before(grammarAccess.getFloatingTextAccess().getTextKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__EnumEnd__Alternatives"
    // InternalCanvas.g:866:1: rule__EnumEnd__Alternatives : ( ( 'start' ) | ( 'end' ) | ( 'middle' ) | ( 'end_fixed' ) | ( 'start_fixed' ) | ( 'none' ) | ( 'floating' ) | ( 'additional' ) );
    public final void rule__EnumEnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:870:1: ( ( 'start' ) | ( 'end' ) | ( 'middle' ) | ( 'end_fixed' ) | ( 'start_fixed' ) | ( 'none' ) | ( 'floating' ) | ( 'additional' ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 22:
                {
                alt10=5;
                }
                break;
            case 23:
                {
                alt10=6;
                }
                break;
            case 24:
                {
                alt10=7;
                }
                break;
            case 25:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCanvas.g:871:2: ( 'start' )
                    {
                    // InternalCanvas.g:871:2: ( 'start' )
                    // InternalCanvas.g:872:3: 'start'
                    {
                     before(grammarAccess.getEnumEndAccess().getStartKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getStartKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:877:2: ( 'end' )
                    {
                    // InternalCanvas.g:877:2: ( 'end' )
                    // InternalCanvas.g:878:3: 'end'
                    {
                     before(grammarAccess.getEnumEndAccess().getEndKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getEndKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCanvas.g:883:2: ( 'middle' )
                    {
                    // InternalCanvas.g:883:2: ( 'middle' )
                    // InternalCanvas.g:884:3: 'middle'
                    {
                     before(grammarAccess.getEnumEndAccess().getMiddleKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getMiddleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCanvas.g:889:2: ( 'end_fixed' )
                    {
                    // InternalCanvas.g:889:2: ( 'end_fixed' )
                    // InternalCanvas.g:890:3: 'end_fixed'
                    {
                     before(grammarAccess.getEnumEndAccess().getEnd_fixedKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getEnd_fixedKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCanvas.g:895:2: ( 'start_fixed' )
                    {
                    // InternalCanvas.g:895:2: ( 'start_fixed' )
                    // InternalCanvas.g:896:3: 'start_fixed'
                    {
                     before(grammarAccess.getEnumEndAccess().getStart_fixedKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getStart_fixedKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCanvas.g:901:2: ( 'none' )
                    {
                    // InternalCanvas.g:901:2: ( 'none' )
                    // InternalCanvas.g:902:3: 'none'
                    {
                     before(grammarAccess.getEnumEndAccess().getNoneKeyword_5()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getNoneKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCanvas.g:907:2: ( 'floating' )
                    {
                    // InternalCanvas.g:907:2: ( 'floating' )
                    // InternalCanvas.g:908:3: 'floating'
                    {
                     before(grammarAccess.getEnumEndAccess().getFloatingKeyword_6()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getFloatingKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCanvas.g:913:2: ( 'additional' )
                    {
                    // InternalCanvas.g:913:2: ( 'additional' )
                    // InternalCanvas.g:914:3: 'additional'
                    {
                     before(grammarAccess.getEnumEndAccess().getAdditionalKeyword_7()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getEnumEndAccess().getAdditionalKeyword_7()); 

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
    // $ANTLR end "rule__EnumEnd__Alternatives"


    // $ANTLR start "rule__ShapeProps__Alternatives_1"
    // InternalCanvas.g:923:1: rule__ShapeProps__Alternatives_1 : ( ( ( rule__ShapeProps__Group_1_0__0 ) ) | ( 'properties:' ) );
    public final void rule__ShapeProps__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:927:1: ( ( ( rule__ShapeProps__Group_1_0__0 ) ) | ( 'properties:' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCanvas.g:928:2: ( ( rule__ShapeProps__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:928:2: ( ( rule__ShapeProps__Group_1_0__0 ) )
                    // InternalCanvas.g:929:3: ( rule__ShapeProps__Group_1_0__0 )
                    {
                     before(grammarAccess.getShapePropsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:930:3: ( rule__ShapeProps__Group_1_0__0 )
                    // InternalCanvas.g:930:4: rule__ShapeProps__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeProps__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapePropsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:934:2: ( 'properties:' )
                    {
                    // InternalCanvas.g:934:2: ( 'properties:' )
                    // InternalCanvas.g:935:3: 'properties:'
                    {
                     before(grammarAccess.getShapePropsAccess().getPropertiesKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getShapePropsAccess().getPropertiesKeyword_1_1()); 

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
    // $ANTLR end "rule__ShapeProps__Alternatives_1"


    // $ANTLR start "rule__Container__Alternatives_2"
    // InternalCanvas.g:944:1: rule__Container__Alternatives_2 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Container__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:948:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCanvas.g:949:2: ( 'true' )
                    {
                    // InternalCanvas.g:949:2: ( 'true' )
                    // InternalCanvas.g:950:3: 'true'
                    {
                     before(grammarAccess.getContainerAccess().getTrueKeyword_2_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getContainerAccess().getTrueKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:955:2: ( 'false' )
                    {
                    // InternalCanvas.g:955:2: ( 'false' )
                    // InternalCanvas.g:956:3: 'false'
                    {
                     before(grammarAccess.getContainerAccess().getFalseKeyword_2_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getContainerAccess().getFalseKeyword_2_1()); 

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
    // $ANTLR end "rule__Container__Alternatives_2"


    // $ANTLR start "rule__Connectors__Alternatives_1"
    // InternalCanvas.g:965:1: rule__Connectors__Alternatives_1 : ( ( ( rule__Connectors__Group_1_0__0 ) ) | ( 'connectors:' ) );
    public final void rule__Connectors__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:969:1: ( ( ( rule__Connectors__Group_1_0__0 ) ) | ( 'connectors:' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCanvas.g:970:2: ( ( rule__Connectors__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:970:2: ( ( rule__Connectors__Group_1_0__0 ) )
                    // InternalCanvas.g:971:3: ( rule__Connectors__Group_1_0__0 )
                    {
                     before(grammarAccess.getConnectorsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:972:3: ( rule__Connectors__Group_1_0__0 )
                    // InternalCanvas.g:972:4: rule__Connectors__Group_1_0__0
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
                    // InternalCanvas.g:976:2: ( 'connectors:' )
                    {
                    // InternalCanvas.g:976:2: ( 'connectors:' )
                    // InternalCanvas.g:977:3: 'connectors:'
                    {
                     before(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_1()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalCanvas.g:986:1: rule__Connector__Alternatives_0 : ( ( ( rule__Connector__Group_0_0__0 ) ) | ( 'connector:' ) );
    public final void rule__Connector__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:990:1: ( ( ( rule__Connector__Group_0_0__0 ) ) | ( 'connector:' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==50) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCanvas.g:991:2: ( ( rule__Connector__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:991:2: ( ( rule__Connector__Group_0_0__0 ) )
                    // InternalCanvas.g:992:3: ( rule__Connector__Group_0_0__0 )
                    {
                     before(grammarAccess.getConnectorAccess().getGroup_0_0()); 
                    // InternalCanvas.g:993:3: ( rule__Connector__Group_0_0__0 )
                    // InternalCanvas.g:993:4: rule__Connector__Group_0_0__0
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
                    // InternalCanvas.g:997:2: ( 'connector:' )
                    {
                    // InternalCanvas.g:997:2: ( 'connector:' )
                    // InternalCanvas.g:998:3: 'connector:'
                    {
                     before(grammarAccess.getConnectorAccess().getConnectorKeyword_0_1()); 
                    match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__Connector__Alternatives_6"
    // InternalCanvas.g:1007:1: rule__Connector__Alternatives_6 : ( ( ( rule__Connector__Group_6_0__0 ) ) | ( 'render:' ) );
    public final void rule__Connector__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1011:1: ( ( ( rule__Connector__Group_6_0__0 ) ) | ( 'render:' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            else if ( (LA15_0==11) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCanvas.g:1012:2: ( ( rule__Connector__Group_6_0__0 ) )
                    {
                    // InternalCanvas.g:1012:2: ( ( rule__Connector__Group_6_0__0 ) )
                    // InternalCanvas.g:1013:3: ( rule__Connector__Group_6_0__0 )
                    {
                     before(grammarAccess.getConnectorAccess().getGroup_6_0()); 
                    // InternalCanvas.g:1014:3: ( rule__Connector__Group_6_0__0 )
                    // InternalCanvas.g:1014:4: rule__Connector__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectorAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1018:2: ( 'render:' )
                    {
                    // InternalCanvas.g:1018:2: ( 'render:' )
                    // InternalCanvas.g:1019:3: 'render:'
                    {
                     before(grammarAccess.getConnectorAccess().getRenderKeyword_6_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getRenderKeyword_6_1()); 

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
    // $ANTLR end "rule__Connector__Alternatives_6"


    // $ANTLR start "rule__Anchors__Alternatives_0"
    // InternalCanvas.g:1028:1: rule__Anchors__Alternatives_0 : ( ( ( rule__Anchors__Group_0_0__0 ) ) | ( 'anchors:' ) );
    public final void rule__Anchors__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1032:1: ( ( ( rule__Anchors__Group_0_0__0 ) ) | ( 'anchors:' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCanvas.g:1033:2: ( ( rule__Anchors__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1033:2: ( ( rule__Anchors__Group_0_0__0 ) )
                    // InternalCanvas.g:1034:3: ( rule__Anchors__Group_0_0__0 )
                    {
                     before(grammarAccess.getAnchorsAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1035:3: ( rule__Anchors__Group_0_0__0 )
                    // InternalCanvas.g:1035:4: rule__Anchors__Group_0_0__0
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
                    // InternalCanvas.g:1039:2: ( 'anchors:' )
                    {
                    // InternalCanvas.g:1039:2: ( 'anchors:' )
                    // InternalCanvas.g:1040:3: 'anchors:'
                    {
                     before(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
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
    // InternalCanvas.g:1049:1: rule__StartAnchor__Alternatives_0 : ( ( ( rule__StartAnchor__Group_0_0__0 ) ) | ( 'start:' ) );
    public final void rule__StartAnchor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1053:1: ( ( ( rule__StartAnchor__Group_0_0__0 ) ) | ( 'start:' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            else if ( (LA17_0==31) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCanvas.g:1054:2: ( ( rule__StartAnchor__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1054:2: ( ( rule__StartAnchor__Group_0_0__0 ) )
                    // InternalCanvas.g:1055:3: ( rule__StartAnchor__Group_0_0__0 )
                    {
                     before(grammarAccess.getStartAnchorAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1056:3: ( rule__StartAnchor__Group_0_0__0 )
                    // InternalCanvas.g:1056:4: rule__StartAnchor__Group_0_0__0
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
                    // InternalCanvas.g:1060:2: ( 'start:' )
                    {
                    // InternalCanvas.g:1060:2: ( 'start:' )
                    // InternalCanvas.g:1061:3: 'start:'
                    {
                     before(grammarAccess.getStartAnchorAccess().getStartKeyword_0_1()); 
                    match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:1070:1: rule__EndAnchor__Alternatives_0 : ( ( ( rule__EndAnchor__Group_0_0__0 ) ) | ( 'end' ) );
    public final void rule__EndAnchor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1074:1: ( ( ( rule__EndAnchor__Group_0_0__0 ) ) | ( 'end' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==38) ) {
                    alt18=1;
                }
                else if ( (LA18_1==57) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCanvas.g:1075:2: ( ( rule__EndAnchor__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1075:2: ( ( rule__EndAnchor__Group_0_0__0 ) )
                    // InternalCanvas.g:1076:3: ( rule__EndAnchor__Group_0_0__0 )
                    {
                     before(grammarAccess.getEndAnchorAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1077:3: ( rule__EndAnchor__Group_0_0__0 )
                    // InternalCanvas.g:1077:4: rule__EndAnchor__Group_0_0__0
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
                    // InternalCanvas.g:1081:2: ( 'end' )
                    {
                    // InternalCanvas.g:1081:2: ( 'end' )
                    // InternalCanvas.g:1082:3: 'end'
                    {
                     before(grammarAccess.getEndAnchorAccess().getEndKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalCanvas.g:1091:1: rule__Anchor__Alternatives : ( ( ruleShapeAnchorElement ) | ( ruleConnectorAnchorElement ) );
    public final void rule__Anchor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1095:1: ( ( ruleShapeAnchorElement ) | ( ruleConnectorAnchorElement ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32||LA19_0==52) ) {
                alt19=1;
            }
            else if ( (LA19_0==33||LA19_0==53) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCanvas.g:1096:2: ( ruleShapeAnchorElement )
                    {
                    // InternalCanvas.g:1096:2: ( ruleShapeAnchorElement )
                    // InternalCanvas.g:1097:3: ruleShapeAnchorElement
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
                    // InternalCanvas.g:1102:2: ( ruleConnectorAnchorElement )
                    {
                    // InternalCanvas.g:1102:2: ( ruleConnectorAnchorElement )
                    // InternalCanvas.g:1103:3: ruleConnectorAnchorElement
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
    // InternalCanvas.g:1112:1: rule__ShapeAnchorElement__Alternatives_0 : ( ( ( rule__ShapeAnchorElement__Group_0_0__0 ) ) | ( 'shapeAnchor:' ) );
    public final void rule__ShapeAnchorElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1116:1: ( ( ( rule__ShapeAnchorElement__Group_0_0__0 ) ) | ( 'shapeAnchor:' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCanvas.g:1117:2: ( ( rule__ShapeAnchorElement__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1117:2: ( ( rule__ShapeAnchorElement__Group_0_0__0 ) )
                    // InternalCanvas.g:1118:3: ( rule__ShapeAnchorElement__Group_0_0__0 )
                    {
                     before(grammarAccess.getShapeAnchorElementAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1119:3: ( rule__ShapeAnchorElement__Group_0_0__0 )
                    // InternalCanvas.g:1119:4: rule__ShapeAnchorElement__Group_0_0__0
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
                    // InternalCanvas.g:1123:2: ( 'shapeAnchor:' )
                    {
                    // InternalCanvas.g:1123:2: ( 'shapeAnchor:' )
                    // InternalCanvas.g:1124:3: 'shapeAnchor:'
                    {
                     before(grammarAccess.getShapeAnchorElementAccess().getShapeAnchorKeyword_0_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getShapeAnchorElementAccess().getShapeAnchorKeyword_0_1()); 

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
    // InternalCanvas.g:1133:1: rule__ConnectorAnchorElement__Alternatives_0 : ( ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) ) | ( 'segmentAnchor:' ) );
    public final void rule__ConnectorAnchorElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1137:1: ( ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) ) | ( 'segmentAnchor:' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==53) ) {
                alt21=1;
            }
            else if ( (LA21_0==33) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalCanvas.g:1138:2: ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1138:2: ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) )
                    // InternalCanvas.g:1139:3: ( rule__ConnectorAnchorElement__Group_0_0__0 )
                    {
                     before(grammarAccess.getConnectorAnchorElementAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1140:3: ( rule__ConnectorAnchorElement__Group_0_0__0 )
                    // InternalCanvas.g:1140:4: rule__ConnectorAnchorElement__Group_0_0__0
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
                    // InternalCanvas.g:1144:2: ( 'segmentAnchor:' )
                    {
                    // InternalCanvas.g:1144:2: ( 'segmentAnchor:' )
                    // InternalCanvas.g:1145:3: 'segmentAnchor:'
                    {
                     before(grammarAccess.getConnectorAnchorElementAccess().getSegmentAnchorKeyword_0_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getConnectorAnchorElementAccess().getSegmentAnchorKeyword_0_1()); 

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


    // $ANTLR start "rule__ConnectorProps__Alternatives_1"
    // InternalCanvas.g:1154:1: rule__ConnectorProps__Alternatives_1 : ( ( ( rule__ConnectorProps__Group_1_0__0 ) ) | ( 'properties:' ) );
    public final void rule__ConnectorProps__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1158:1: ( ( ( rule__ConnectorProps__Group_1_0__0 ) ) | ( 'properties:' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            else if ( (LA22_0==12) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCanvas.g:1159:2: ( ( rule__ConnectorProps__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:1159:2: ( ( rule__ConnectorProps__Group_1_0__0 ) )
                    // InternalCanvas.g:1160:3: ( rule__ConnectorProps__Group_1_0__0 )
                    {
                     before(grammarAccess.getConnectorPropsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:1161:3: ( rule__ConnectorProps__Group_1_0__0 )
                    // InternalCanvas.g:1161:4: rule__ConnectorProps__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorProps__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectorPropsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:1165:2: ( 'properties:' )
                    {
                    // InternalCanvas.g:1165:2: ( 'properties:' )
                    // InternalCanvas.g:1166:3: 'properties:'
                    {
                     before(grammarAccess.getConnectorPropsAccess().getPropertiesKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConnectorPropsAccess().getPropertiesKeyword_1_1()); 

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
    // $ANTLR end "rule__ConnectorProps__Alternatives_1"


    // $ANTLR start "rule__Polyline__Alternatives_1"
    // InternalCanvas.g:1175:1: rule__Polyline__Alternatives_1 : ( ( ( rule__Polyline__Group_1_0__0 ) ) | ( 'polyline:' ) );
    public final void rule__Polyline__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1179:1: ( ( ( rule__Polyline__Group_1_0__0 ) ) | ( 'polyline:' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            else if ( (LA23_0==34) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalCanvas.g:1180:2: ( ( rule__Polyline__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:1180:2: ( ( rule__Polyline__Group_1_0__0 ) )
                    // InternalCanvas.g:1181:3: ( rule__Polyline__Group_1_0__0 )
                    {
                     before(grammarAccess.getPolylineAccess().getGroup_1_0()); 
                    // InternalCanvas.g:1182:3: ( rule__Polyline__Group_1_0__0 )
                    // InternalCanvas.g:1182:4: rule__Polyline__Group_1_0__0
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
                    // InternalCanvas.g:1186:2: ( 'polyline:' )
                    {
                    // InternalCanvas.g:1186:2: ( 'polyline:' )
                    // InternalCanvas.g:1187:3: 'polyline:'
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
    // InternalCanvas.g:1196:1: rule__Segment__Alternatives_0 : ( ( ( rule__Segment__Group_0_0__0 ) ) | ( 'segment:' ) );
    public final void rule__Segment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1200:1: ( ( ( rule__Segment__Group_0_0__0 ) ) | ( 'segment:' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==56) ) {
                alt24=1;
            }
            else if ( (LA24_0==35) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCanvas.g:1201:2: ( ( rule__Segment__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1201:2: ( ( rule__Segment__Group_0_0__0 ) )
                    // InternalCanvas.g:1202:3: ( rule__Segment__Group_0_0__0 )
                    {
                     before(grammarAccess.getSegmentAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1203:3: ( rule__Segment__Group_0_0__0 )
                    // InternalCanvas.g:1203:4: rule__Segment__Group_0_0__0
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
                    // InternalCanvas.g:1207:2: ( 'segment:' )
                    {
                    // InternalCanvas.g:1207:2: ( 'segment:' )
                    // InternalCanvas.g:1208:3: 'segment:'
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


    // $ANTLR start "rule__Rectangle__Alternatives_0"
    // InternalCanvas.g:1217:1: rule__Rectangle__Alternatives_0 : ( ( ( rule__Rectangle__Group_0_0__0 ) ) | ( 'rectangle:' ) );
    public final void rule__Rectangle__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1221:1: ( ( ( rule__Rectangle__Group_0_0__0 ) ) | ( 'rectangle:' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==61) ) {
                alt25=1;
            }
            else if ( (LA25_0==36) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCanvas.g:1222:2: ( ( rule__Rectangle__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1222:2: ( ( rule__Rectangle__Group_0_0__0 ) )
                    // InternalCanvas.g:1223:3: ( rule__Rectangle__Group_0_0__0 )
                    {
                     before(grammarAccess.getRectangleAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1224:3: ( rule__Rectangle__Group_0_0__0 )
                    // InternalCanvas.g:1224:4: rule__Rectangle__Group_0_0__0
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
                    // InternalCanvas.g:1228:2: ( 'rectangle:' )
                    {
                    // InternalCanvas.g:1228:2: ( 'rectangle:' )
                    // InternalCanvas.g:1229:3: 'rectangle:'
                    {
                     before(grammarAccess.getRectangleAccess().getRectangleKeyword_0_1()); 
                    match(input,36,FOLLOW_2); 
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
    // InternalCanvas.g:1238:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1242:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCanvas.g:1243:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalCanvas.g:1250:1: rule__Model__Group__0__Impl : ( ( rule__Model__SemanticsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1254:1: ( ( ( rule__Model__SemanticsAssignment_0 )* ) )
            // InternalCanvas.g:1255:1: ( ( rule__Model__SemanticsAssignment_0 )* )
            {
            // InternalCanvas.g:1255:1: ( ( rule__Model__SemanticsAssignment_0 )* )
            // InternalCanvas.g:1256:2: ( rule__Model__SemanticsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getSemanticsAssignment_0()); 
            // InternalCanvas.g:1257:2: ( rule__Model__SemanticsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==39) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCanvas.g:1257:3: rule__Model__SemanticsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__SemanticsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSemanticsAssignment_0()); 

            }


            }

        }
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
    // InternalCanvas.g:1265:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1269:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalCanvas.g:1270:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCanvas.g:1277:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1281:1: ( ( ( rule__Model__Alternatives_1 ) ) )
            // InternalCanvas.g:1282:1: ( ( rule__Model__Alternatives_1 ) )
            {
            // InternalCanvas.g:1282:1: ( ( rule__Model__Alternatives_1 ) )
            // InternalCanvas.g:1283:2: ( rule__Model__Alternatives_1 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalCanvas.g:1284:2: ( rule__Model__Alternatives_1 )
            // InternalCanvas.g:1284:3: rule__Model__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalCanvas.g:1292:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1296:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalCanvas.g:1297:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:1304:1: rule__Model__Group__2__Impl : ( ( rule__Model__RepresentsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1308:1: ( ( ( rule__Model__RepresentsAssignment_2 ) ) )
            // InternalCanvas.g:1309:1: ( ( rule__Model__RepresentsAssignment_2 ) )
            {
            // InternalCanvas.g:1309:1: ( ( rule__Model__RepresentsAssignment_2 ) )
            // InternalCanvas.g:1310:2: ( rule__Model__RepresentsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getRepresentsAssignment_2()); 
            // InternalCanvas.g:1311:2: ( rule__Model__RepresentsAssignment_2 )
            // InternalCanvas.g:1311:3: rule__Model__RepresentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__RepresentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRepresentsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__3"
    // InternalCanvas.g:1319:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1323:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalCanvas.g:1324:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalCanvas.g:1331:1: rule__Model__Group__3__Impl : ( ( rule__Model__PropertiesAssignment_3 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1335:1: ( ( ( rule__Model__PropertiesAssignment_3 )? ) )
            // InternalCanvas.g:1336:1: ( ( rule__Model__PropertiesAssignment_3 )? )
            {
            // InternalCanvas.g:1336:1: ( ( rule__Model__PropertiesAssignment_3 )? )
            // InternalCanvas.g:1337:2: ( rule__Model__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_3()); 
            // InternalCanvas.g:1338:2: ( rule__Model__PropertiesAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12||LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCanvas.g:1338:3: rule__Model__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalCanvas.g:1346:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1350:1: ( rule__Model__Group__4__Impl )
            // InternalCanvas.g:1351:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalCanvas.g:1357:1: rule__Model__Group__4__Impl : ( ( rule__Model__ElementsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1361:1: ( ( ( rule__Model__ElementsAssignment_4 )* ) )
            // InternalCanvas.g:1362:1: ( ( rule__Model__ElementsAssignment_4 )* )
            {
            // InternalCanvas.g:1362:1: ( ( rule__Model__ElementsAssignment_4 )* )
            // InternalCanvas.g:1363:2: ( rule__Model__ElementsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_4()); 
            // InternalCanvas.g:1364:2: ( rule__Model__ElementsAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14||LA28_0==28||LA28_0==43||LA28_0==49) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCanvas.g:1364:3: rule__Model__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_1_0__0"
    // InternalCanvas.g:1373:1: rule__Model__Group_1_0__0 : rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 ;
    public final void rule__Model__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1377:1: ( rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 )
            // InternalCanvas.g:1378:2: rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1_0__0"


    // $ANTLR start "rule__Model__Group_1_0__0__Impl"
    // InternalCanvas.g:1385:1: rule__Model__Group_1_0__0__Impl : ( 'render' ) ;
    public final void rule__Model__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1389:1: ( ( 'render' ) )
            // InternalCanvas.g:1390:1: ( 'render' )
            {
            // InternalCanvas.g:1390:1: ( 'render' )
            // InternalCanvas.g:1391:2: 'render'
            {
             before(grammarAccess.getModelAccess().getRenderKeyword_1_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRenderKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1_0__0__Impl"


    // $ANTLR start "rule__Model__Group_1_0__1"
    // InternalCanvas.g:1400:1: rule__Model__Group_1_0__1 : rule__Model__Group_1_0__1__Impl ;
    public final void rule__Model__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1404:1: ( rule__Model__Group_1_0__1__Impl )
            // InternalCanvas.g:1405:2: rule__Model__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1_0__1"


    // $ANTLR start "rule__Model__Group_1_0__1__Impl"
    // InternalCanvas.g:1411:1: rule__Model__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Model__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1415:1: ( ( ':' ) )
            // InternalCanvas.g:1416:1: ( ':' )
            {
            // InternalCanvas.g:1416:1: ( ':' )
            // InternalCanvas.g:1417:2: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1_0__1__Impl"


    // $ANTLR start "rule__SemanticModel__Group__0"
    // InternalCanvas.g:1427:1: rule__SemanticModel__Group__0 : rule__SemanticModel__Group__0__Impl rule__SemanticModel__Group__1 ;
    public final void rule__SemanticModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1431:1: ( rule__SemanticModel__Group__0__Impl rule__SemanticModel__Group__1 )
            // InternalCanvas.g:1432:2: rule__SemanticModel__Group__0__Impl rule__SemanticModel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SemanticModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticModel__Group__0"


    // $ANTLR start "rule__SemanticModel__Group__0__Impl"
    // InternalCanvas.g:1439:1: rule__SemanticModel__Group__0__Impl : ( 'import' ) ;
    public final void rule__SemanticModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1443:1: ( ( 'import' ) )
            // InternalCanvas.g:1444:1: ( 'import' )
            {
            // InternalCanvas.g:1444:1: ( 'import' )
            // InternalCanvas.g:1445:2: 'import'
            {
             before(grammarAccess.getSemanticModelAccess().getImportKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSemanticModelAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticModel__Group__0__Impl"


    // $ANTLR start "rule__SemanticModel__Group__1"
    // InternalCanvas.g:1454:1: rule__SemanticModel__Group__1 : rule__SemanticModel__Group__1__Impl ;
    public final void rule__SemanticModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1458:1: ( rule__SemanticModel__Group__1__Impl )
            // InternalCanvas.g:1459:2: rule__SemanticModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticModel__Group__1"


    // $ANTLR start "rule__SemanticModel__Group__1__Impl"
    // InternalCanvas.g:1465:1: rule__SemanticModel__Group__1__Impl : ( ( rule__SemanticModel__ImportURIAssignment_1 ) ) ;
    public final void rule__SemanticModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1469:1: ( ( ( rule__SemanticModel__ImportURIAssignment_1 ) ) )
            // InternalCanvas.g:1470:1: ( ( rule__SemanticModel__ImportURIAssignment_1 ) )
            {
            // InternalCanvas.g:1470:1: ( ( rule__SemanticModel__ImportURIAssignment_1 ) )
            // InternalCanvas.g:1471:2: ( rule__SemanticModel__ImportURIAssignment_1 )
            {
             before(grammarAccess.getSemanticModelAccess().getImportURIAssignment_1()); 
            // InternalCanvas.g:1472:2: ( rule__SemanticModel__ImportURIAssignment_1 )
            // InternalCanvas.g:1472:3: rule__SemanticModel__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SemanticModel__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSemanticModelAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticModel__Group__1__Impl"


    // $ANTLR start "rule__ModelProperties__Group__0"
    // InternalCanvas.g:1481:1: rule__ModelProperties__Group__0 : rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1 ;
    public final void rule__ModelProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1485:1: ( rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1 )
            // InternalCanvas.g:1486:2: rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCanvas.g:1493:1: rule__ModelProperties__Group__0__Impl : ( ( rule__ModelProperties__Alternatives_0 ) ) ;
    public final void rule__ModelProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1497:1: ( ( ( rule__ModelProperties__Alternatives_0 ) ) )
            // InternalCanvas.g:1498:1: ( ( rule__ModelProperties__Alternatives_0 ) )
            {
            // InternalCanvas.g:1498:1: ( ( rule__ModelProperties__Alternatives_0 ) )
            // InternalCanvas.g:1499:2: ( rule__ModelProperties__Alternatives_0 )
            {
             before(grammarAccess.getModelPropertiesAccess().getAlternatives_0()); 
            // InternalCanvas.g:1500:2: ( rule__ModelProperties__Alternatives_0 )
            // InternalCanvas.g:1500:3: rule__ModelProperties__Alternatives_0
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
    // InternalCanvas.g:1508:1: rule__ModelProperties__Group__1 : rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2 ;
    public final void rule__ModelProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1512:1: ( rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2 )
            // InternalCanvas.g:1513:2: rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:1520:1: rule__ModelProperties__Group__1__Impl : ( ( rule__ModelProperties__Alternatives_1 ) ) ;
    public final void rule__ModelProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1524:1: ( ( ( rule__ModelProperties__Alternatives_1 ) ) )
            // InternalCanvas.g:1525:1: ( ( rule__ModelProperties__Alternatives_1 ) )
            {
            // InternalCanvas.g:1525:1: ( ( rule__ModelProperties__Alternatives_1 ) )
            // InternalCanvas.g:1526:2: ( rule__ModelProperties__Alternatives_1 )
            {
             before(grammarAccess.getModelPropertiesAccess().getAlternatives_1()); 
            // InternalCanvas.g:1527:2: ( rule__ModelProperties__Alternatives_1 )
            // InternalCanvas.g:1527:3: rule__ModelProperties__Alternatives_1
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
    // InternalCanvas.g:1535:1: rule__ModelProperties__Group__2 : rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3 ;
    public final void rule__ModelProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1539:1: ( rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3 )
            // InternalCanvas.g:1540:2: rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCanvas.g:1547:1: rule__ModelProperties__Group__2__Impl : ( ( rule__ModelProperties__PointAssignment_2 ) ) ;
    public final void rule__ModelProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1551:1: ( ( ( rule__ModelProperties__PointAssignment_2 ) ) )
            // InternalCanvas.g:1552:1: ( ( rule__ModelProperties__PointAssignment_2 ) )
            {
            // InternalCanvas.g:1552:1: ( ( rule__ModelProperties__PointAssignment_2 ) )
            // InternalCanvas.g:1553:2: ( rule__ModelProperties__PointAssignment_2 )
            {
             before(grammarAccess.getModelPropertiesAccess().getPointAssignment_2()); 
            // InternalCanvas.g:1554:2: ( rule__ModelProperties__PointAssignment_2 )
            // InternalCanvas.g:1554:3: rule__ModelProperties__PointAssignment_2
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
    // InternalCanvas.g:1562:1: rule__ModelProperties__Group__3 : rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4 ;
    public final void rule__ModelProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1566:1: ( rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4 )
            // InternalCanvas.g:1567:2: rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalCanvas.g:1574:1: rule__ModelProperties__Group__3__Impl : ( 'zoom' ) ;
    public final void rule__ModelProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1578:1: ( ( 'zoom' ) )
            // InternalCanvas.g:1579:1: ( 'zoom' )
            {
            // InternalCanvas.g:1579:1: ( 'zoom' )
            // InternalCanvas.g:1580:2: 'zoom'
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getModelPropertiesAccess().getZoomKeyword_3()); 

            }


            }

        }
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
    // InternalCanvas.g:1589:1: rule__ModelProperties__Group__4 : rule__ModelProperties__Group__4__Impl ;
    public final void rule__ModelProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1593:1: ( rule__ModelProperties__Group__4__Impl )
            // InternalCanvas.g:1594:2: rule__ModelProperties__Group__4__Impl
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
    // InternalCanvas.g:1600:1: rule__ModelProperties__Group__4__Impl : ( ( rule__ModelProperties__ZoomAssignment_4 ) ) ;
    public final void rule__ModelProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1604:1: ( ( ( rule__ModelProperties__ZoomAssignment_4 ) ) )
            // InternalCanvas.g:1605:1: ( ( rule__ModelProperties__ZoomAssignment_4 ) )
            {
            // InternalCanvas.g:1605:1: ( ( rule__ModelProperties__ZoomAssignment_4 ) )
            // InternalCanvas.g:1606:2: ( rule__ModelProperties__ZoomAssignment_4 )
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomAssignment_4()); 
            // InternalCanvas.g:1607:2: ( rule__ModelProperties__ZoomAssignment_4 )
            // InternalCanvas.g:1607:3: rule__ModelProperties__ZoomAssignment_4
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
    // InternalCanvas.g:1616:1: rule__ModelProperties__Group_0_0__0 : rule__ModelProperties__Group_0_0__0__Impl rule__ModelProperties__Group_0_0__1 ;
    public final void rule__ModelProperties__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1620:1: ( rule__ModelProperties__Group_0_0__0__Impl rule__ModelProperties__Group_0_0__1 )
            // InternalCanvas.g:1621:2: rule__ModelProperties__Group_0_0__0__Impl rule__ModelProperties__Group_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:1628:1: rule__ModelProperties__Group_0_0__0__Impl : ( 'properties' ) ;
    public final void rule__ModelProperties__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1632:1: ( ( 'properties' ) )
            // InternalCanvas.g:1633:1: ( 'properties' )
            {
            // InternalCanvas.g:1633:1: ( 'properties' )
            // InternalCanvas.g:1634:2: 'properties'
            {
             before(grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCanvas.g:1643:1: rule__ModelProperties__Group_0_0__1 : rule__ModelProperties__Group_0_0__1__Impl ;
    public final void rule__ModelProperties__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1647:1: ( rule__ModelProperties__Group_0_0__1__Impl )
            // InternalCanvas.g:1648:2: rule__ModelProperties__Group_0_0__1__Impl
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
    // InternalCanvas.g:1654:1: rule__ModelProperties__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1658:1: ( ( ':' ) )
            // InternalCanvas.g:1659:1: ( ':' )
            {
            // InternalCanvas.g:1659:1: ( ':' )
            // InternalCanvas.g:1660:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_0_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:1670:1: rule__ModelProperties__Group_1_0__0 : rule__ModelProperties__Group_1_0__0__Impl rule__ModelProperties__Group_1_0__1 ;
    public final void rule__ModelProperties__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1674:1: ( rule__ModelProperties__Group_1_0__0__Impl rule__ModelProperties__Group_1_0__1 )
            // InternalCanvas.g:1675:2: rule__ModelProperties__Group_1_0__0__Impl rule__ModelProperties__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:1682:1: rule__ModelProperties__Group_1_0__0__Impl : ( 'viewport' ) ;
    public final void rule__ModelProperties__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1686:1: ( ( 'viewport' ) )
            // InternalCanvas.g:1687:1: ( 'viewport' )
            {
            // InternalCanvas.g:1687:1: ( 'viewport' )
            // InternalCanvas.g:1688:2: 'viewport'
            {
             before(grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCanvas.g:1697:1: rule__ModelProperties__Group_1_0__1 : rule__ModelProperties__Group_1_0__1__Impl ;
    public final void rule__ModelProperties__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1701:1: ( rule__ModelProperties__Group_1_0__1__Impl )
            // InternalCanvas.g:1702:2: rule__ModelProperties__Group_1_0__1__Impl
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
    // InternalCanvas.g:1708:1: rule__ModelProperties__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1712:1: ( ( ':' ) )
            // InternalCanvas.g:1713:1: ( ':' )
            {
            // InternalCanvas.g:1713:1: ( ':' )
            // InternalCanvas.g:1714:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__Shapes__Group__0"
    // InternalCanvas.g:1724:1: rule__Shapes__Group__0 : rule__Shapes__Group__0__Impl rule__Shapes__Group__1 ;
    public final void rule__Shapes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1728:1: ( rule__Shapes__Group__0__Impl rule__Shapes__Group__1 )
            // InternalCanvas.g:1729:2: rule__Shapes__Group__0__Impl rule__Shapes__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCanvas.g:1736:1: rule__Shapes__Group__0__Impl : ( () ) ;
    public final void rule__Shapes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1740:1: ( ( () ) )
            // InternalCanvas.g:1741:1: ( () )
            {
            // InternalCanvas.g:1741:1: ( () )
            // InternalCanvas.g:1742:2: ()
            {
             before(grammarAccess.getShapesAccess().getShapesAction_0()); 
            // InternalCanvas.g:1743:2: ()
            // InternalCanvas.g:1743:3: 
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
    // InternalCanvas.g:1751:1: rule__Shapes__Group__1 : rule__Shapes__Group__1__Impl rule__Shapes__Group__2 ;
    public final void rule__Shapes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1755:1: ( rule__Shapes__Group__1__Impl rule__Shapes__Group__2 )
            // InternalCanvas.g:1756:2: rule__Shapes__Group__1__Impl rule__Shapes__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCanvas.g:1763:1: rule__Shapes__Group__1__Impl : ( ( rule__Shapes__Alternatives_1 ) ) ;
    public final void rule__Shapes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1767:1: ( ( ( rule__Shapes__Alternatives_1 ) ) )
            // InternalCanvas.g:1768:1: ( ( rule__Shapes__Alternatives_1 ) )
            {
            // InternalCanvas.g:1768:1: ( ( rule__Shapes__Alternatives_1 ) )
            // InternalCanvas.g:1769:2: ( rule__Shapes__Alternatives_1 )
            {
             before(grammarAccess.getShapesAccess().getAlternatives_1()); 
            // InternalCanvas.g:1770:2: ( rule__Shapes__Alternatives_1 )
            // InternalCanvas.g:1770:3: rule__Shapes__Alternatives_1
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
    // InternalCanvas.g:1778:1: rule__Shapes__Group__2 : rule__Shapes__Group__2__Impl ;
    public final void rule__Shapes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1782:1: ( rule__Shapes__Group__2__Impl )
            // InternalCanvas.g:1783:2: rule__Shapes__Group__2__Impl
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
    // InternalCanvas.g:1789:1: rule__Shapes__Group__2__Impl : ( ( rule__Shapes__ShapesAssignment_2 )* ) ;
    public final void rule__Shapes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1793:1: ( ( ( rule__Shapes__ShapesAssignment_2 )* ) )
            // InternalCanvas.g:1794:1: ( ( rule__Shapes__ShapesAssignment_2 )* )
            {
            // InternalCanvas.g:1794:1: ( ( rule__Shapes__ShapesAssignment_2 )* )
            // InternalCanvas.g:1795:2: ( rule__Shapes__ShapesAssignment_2 )*
            {
             before(grammarAccess.getShapesAccess().getShapesAssignment_2()); 
            // InternalCanvas.g:1796:2: ( rule__Shapes__ShapesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15||LA29_0==44) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCanvas.g:1796:3: rule__Shapes__ShapesAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Shapes__ShapesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalCanvas.g:1805:1: rule__Shapes__Group_1_0__0 : rule__Shapes__Group_1_0__0__Impl rule__Shapes__Group_1_0__1 ;
    public final void rule__Shapes__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1809:1: ( rule__Shapes__Group_1_0__0__Impl rule__Shapes__Group_1_0__1 )
            // InternalCanvas.g:1810:2: rule__Shapes__Group_1_0__0__Impl rule__Shapes__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:1817:1: rule__Shapes__Group_1_0__0__Impl : ( 'shapes' ) ;
    public final void rule__Shapes__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1821:1: ( ( 'shapes' ) )
            // InternalCanvas.g:1822:1: ( 'shapes' )
            {
            // InternalCanvas.g:1822:1: ( 'shapes' )
            // InternalCanvas.g:1823:2: 'shapes'
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
    // InternalCanvas.g:1832:1: rule__Shapes__Group_1_0__1 : rule__Shapes__Group_1_0__1__Impl ;
    public final void rule__Shapes__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1836:1: ( rule__Shapes__Group_1_0__1__Impl )
            // InternalCanvas.g:1837:2: rule__Shapes__Group_1_0__1__Impl
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
    // InternalCanvas.g:1843:1: rule__Shapes__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Shapes__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1847:1: ( ( ':' ) )
            // InternalCanvas.g:1848:1: ( ':' )
            {
            // InternalCanvas.g:1848:1: ( ':' )
            // InternalCanvas.g:1849:2: ':'
            {
             before(grammarAccess.getShapesAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:1859:1: rule__Shape__Group__0 : rule__Shape__Group__0__Impl rule__Shape__Group__1 ;
    public final void rule__Shape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1863:1: ( rule__Shape__Group__0__Impl rule__Shape__Group__1 )
            // InternalCanvas.g:1864:2: rule__Shape__Group__0__Impl rule__Shape__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCanvas.g:1871:1: rule__Shape__Group__0__Impl : ( () ) ;
    public final void rule__Shape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1875:1: ( ( () ) )
            // InternalCanvas.g:1876:1: ( () )
            {
            // InternalCanvas.g:1876:1: ( () )
            // InternalCanvas.g:1877:2: ()
            {
             before(grammarAccess.getShapeAccess().getShapeAction_0()); 
            // InternalCanvas.g:1878:2: ()
            // InternalCanvas.g:1878:3: 
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
    // InternalCanvas.g:1886:1: rule__Shape__Group__1 : rule__Shape__Group__1__Impl rule__Shape__Group__2 ;
    public final void rule__Shape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1890:1: ( rule__Shape__Group__1__Impl rule__Shape__Group__2 )
            // InternalCanvas.g:1891:2: rule__Shape__Group__1__Impl rule__Shape__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCanvas.g:1898:1: rule__Shape__Group__1__Impl : ( ( rule__Shape__Alternatives_1 ) ) ;
    public final void rule__Shape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1902:1: ( ( ( rule__Shape__Alternatives_1 ) ) )
            // InternalCanvas.g:1903:1: ( ( rule__Shape__Alternatives_1 ) )
            {
            // InternalCanvas.g:1903:1: ( ( rule__Shape__Alternatives_1 ) )
            // InternalCanvas.g:1904:2: ( rule__Shape__Alternatives_1 )
            {
             before(grammarAccess.getShapeAccess().getAlternatives_1()); 
            // InternalCanvas.g:1905:2: ( rule__Shape__Alternatives_1 )
            // InternalCanvas.g:1905:3: rule__Shape__Alternatives_1
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
    // InternalCanvas.g:1913:1: rule__Shape__Group__2 : rule__Shape__Group__2__Impl rule__Shape__Group__3 ;
    public final void rule__Shape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1917:1: ( rule__Shape__Group__2__Impl rule__Shape__Group__3 )
            // InternalCanvas.g:1918:2: rule__Shape__Group__2__Impl rule__Shape__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalCanvas.g:1925:1: rule__Shape__Group__2__Impl : ( ( rule__Shape__NameAssignment_2 ) ) ;
    public final void rule__Shape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1929:1: ( ( ( rule__Shape__NameAssignment_2 ) ) )
            // InternalCanvas.g:1930:1: ( ( rule__Shape__NameAssignment_2 ) )
            {
            // InternalCanvas.g:1930:1: ( ( rule__Shape__NameAssignment_2 ) )
            // InternalCanvas.g:1931:2: ( rule__Shape__NameAssignment_2 )
            {
             before(grammarAccess.getShapeAccess().getNameAssignment_2()); 
            // InternalCanvas.g:1932:2: ( rule__Shape__NameAssignment_2 )
            // InternalCanvas.g:1932:3: rule__Shape__NameAssignment_2
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
    // InternalCanvas.g:1940:1: rule__Shape__Group__3 : rule__Shape__Group__3__Impl rule__Shape__Group__4 ;
    public final void rule__Shape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1944:1: ( rule__Shape__Group__3__Impl rule__Shape__Group__4 )
            // InternalCanvas.g:1945:2: rule__Shape__Group__3__Impl rule__Shape__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalCanvas.g:1952:1: rule__Shape__Group__3__Impl : ( ( rule__Shape__PropsAssignment_3 )? ) ;
    public final void rule__Shape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1956:1: ( ( ( rule__Shape__PropsAssignment_3 )? ) )
            // InternalCanvas.g:1957:1: ( ( rule__Shape__PropsAssignment_3 )? )
            {
            // InternalCanvas.g:1957:1: ( ( rule__Shape__PropsAssignment_3 )? )
            // InternalCanvas.g:1958:2: ( rule__Shape__PropsAssignment_3 )?
            {
             before(grammarAccess.getShapeAccess().getPropsAssignment_3()); 
            // InternalCanvas.g:1959:2: ( rule__Shape__PropsAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==12||LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCanvas.g:1959:3: rule__Shape__PropsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__PropsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeAccess().getPropsAssignment_3()); 

            }


            }

        }
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
    // InternalCanvas.g:1967:1: rule__Shape__Group__4 : rule__Shape__Group__4__Impl rule__Shape__Group__5 ;
    public final void rule__Shape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1971:1: ( rule__Shape__Group__4__Impl rule__Shape__Group__5 )
            // InternalCanvas.g:1972:2: rule__Shape__Group__4__Impl rule__Shape__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalCanvas.g:1979:1: rule__Shape__Group__4__Impl : ( ( rule__Shape__RectAssignment_4 ) ) ;
    public final void rule__Shape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1983:1: ( ( ( rule__Shape__RectAssignment_4 ) ) )
            // InternalCanvas.g:1984:1: ( ( rule__Shape__RectAssignment_4 ) )
            {
            // InternalCanvas.g:1984:1: ( ( rule__Shape__RectAssignment_4 ) )
            // InternalCanvas.g:1985:2: ( rule__Shape__RectAssignment_4 )
            {
             before(grammarAccess.getShapeAccess().getRectAssignment_4()); 
            // InternalCanvas.g:1986:2: ( rule__Shape__RectAssignment_4 )
            // InternalCanvas.g:1986:3: rule__Shape__RectAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Shape__RectAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getRectAssignment_4()); 

            }


            }

        }
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
    // InternalCanvas.g:1994:1: rule__Shape__Group__5 : rule__Shape__Group__5__Impl rule__Shape__Group__6 ;
    public final void rule__Shape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1998:1: ( rule__Shape__Group__5__Impl rule__Shape__Group__6 )
            // InternalCanvas.g:1999:2: rule__Shape__Group__5__Impl rule__Shape__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalCanvas.g:2006:1: rule__Shape__Group__5__Impl : ( ( rule__Shape__TextAssignment_5 )? ) ;
    public final void rule__Shape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2010:1: ( ( ( rule__Shape__TextAssignment_5 )? ) )
            // InternalCanvas.g:2011:1: ( ( rule__Shape__TextAssignment_5 )? )
            {
            // InternalCanvas.g:2011:1: ( ( rule__Shape__TextAssignment_5 )? )
            // InternalCanvas.g:2012:2: ( rule__Shape__TextAssignment_5 )?
            {
             before(grammarAccess.getShapeAccess().getTextAssignment_5()); 
            // InternalCanvas.g:2013:2: ( rule__Shape__TextAssignment_5 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17||LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCanvas.g:2013:3: rule__Shape__TextAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__TextAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeAccess().getTextAssignment_5()); 

            }


            }

        }
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
    // InternalCanvas.g:2021:1: rule__Shape__Group__6 : rule__Shape__Group__6__Impl rule__Shape__Group__7 ;
    public final void rule__Shape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2025:1: ( rule__Shape__Group__6__Impl rule__Shape__Group__7 )
            // InternalCanvas.g:2026:2: rule__Shape__Group__6__Impl rule__Shape__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalCanvas.g:2033:1: rule__Shape__Group__6__Impl : ( ( rule__Shape__Alternatives_6 ) ) ;
    public final void rule__Shape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2037:1: ( ( ( rule__Shape__Alternatives_6 ) ) )
            // InternalCanvas.g:2038:1: ( ( rule__Shape__Alternatives_6 ) )
            {
            // InternalCanvas.g:2038:1: ( ( rule__Shape__Alternatives_6 ) )
            // InternalCanvas.g:2039:2: ( rule__Shape__Alternatives_6 )
            {
             before(grammarAccess.getShapeAccess().getAlternatives_6()); 
            // InternalCanvas.g:2040:2: ( rule__Shape__Alternatives_6 )
            // InternalCanvas.g:2040:3: rule__Shape__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getAlternatives_6()); 

            }


            }

        }
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
    // InternalCanvas.g:2048:1: rule__Shape__Group__7 : rule__Shape__Group__7__Impl ;
    public final void rule__Shape__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2052:1: ( rule__Shape__Group__7__Impl )
            // InternalCanvas.g:2053:2: rule__Shape__Group__7__Impl
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
    // InternalCanvas.g:2059:1: rule__Shape__Group__7__Impl : ( ( rule__Shape__RepresentsAssignment_7 ) ) ;
    public final void rule__Shape__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2063:1: ( ( ( rule__Shape__RepresentsAssignment_7 ) ) )
            // InternalCanvas.g:2064:1: ( ( rule__Shape__RepresentsAssignment_7 ) )
            {
            // InternalCanvas.g:2064:1: ( ( rule__Shape__RepresentsAssignment_7 ) )
            // InternalCanvas.g:2065:2: ( rule__Shape__RepresentsAssignment_7 )
            {
             before(grammarAccess.getShapeAccess().getRepresentsAssignment_7()); 
            // InternalCanvas.g:2066:2: ( rule__Shape__RepresentsAssignment_7 )
            // InternalCanvas.g:2066:3: rule__Shape__RepresentsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Shape__RepresentsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getRepresentsAssignment_7()); 

            }


            }

        }
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
    // InternalCanvas.g:2075:1: rule__Shape__Group_1_0__0 : rule__Shape__Group_1_0__0__Impl rule__Shape__Group_1_0__1 ;
    public final void rule__Shape__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2079:1: ( rule__Shape__Group_1_0__0__Impl rule__Shape__Group_1_0__1 )
            // InternalCanvas.g:2080:2: rule__Shape__Group_1_0__0__Impl rule__Shape__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:2087:1: rule__Shape__Group_1_0__0__Impl : ( 'shape' ) ;
    public final void rule__Shape__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2091:1: ( ( 'shape' ) )
            // InternalCanvas.g:2092:1: ( 'shape' )
            {
            // InternalCanvas.g:2092:1: ( 'shape' )
            // InternalCanvas.g:2093:2: 'shape'
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
    // InternalCanvas.g:2102:1: rule__Shape__Group_1_0__1 : rule__Shape__Group_1_0__1__Impl ;
    public final void rule__Shape__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2106:1: ( rule__Shape__Group_1_0__1__Impl )
            // InternalCanvas.g:2107:2: rule__Shape__Group_1_0__1__Impl
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
    // InternalCanvas.g:2113:1: rule__Shape__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Shape__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2117:1: ( ( ':' ) )
            // InternalCanvas.g:2118:1: ( ':' )
            {
            // InternalCanvas.g:2118:1: ( ':' )
            // InternalCanvas.g:2119:2: ':'
            {
             before(grammarAccess.getShapeAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__Shape__Group_6_0__0"
    // InternalCanvas.g:2129:1: rule__Shape__Group_6_0__0 : rule__Shape__Group_6_0__0__Impl rule__Shape__Group_6_0__1 ;
    public final void rule__Shape__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2133:1: ( rule__Shape__Group_6_0__0__Impl rule__Shape__Group_6_0__1 )
            // InternalCanvas.g:2134:2: rule__Shape__Group_6_0__0__Impl rule__Shape__Group_6_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Shape__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_6_0__0"


    // $ANTLR start "rule__Shape__Group_6_0__0__Impl"
    // InternalCanvas.g:2141:1: rule__Shape__Group_6_0__0__Impl : ( 'render' ) ;
    public final void rule__Shape__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2145:1: ( ( 'render' ) )
            // InternalCanvas.g:2146:1: ( 'render' )
            {
            // InternalCanvas.g:2146:1: ( 'render' )
            // InternalCanvas.g:2147:2: 'render'
            {
             before(grammarAccess.getShapeAccess().getRenderKeyword_6_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getRenderKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_6_0__0__Impl"


    // $ANTLR start "rule__Shape__Group_6_0__1"
    // InternalCanvas.g:2156:1: rule__Shape__Group_6_0__1 : rule__Shape__Group_6_0__1__Impl ;
    public final void rule__Shape__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2160:1: ( rule__Shape__Group_6_0__1__Impl )
            // InternalCanvas.g:2161:2: rule__Shape__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_6_0__1"


    // $ANTLR start "rule__Shape__Group_6_0__1__Impl"
    // InternalCanvas.g:2167:1: rule__Shape__Group_6_0__1__Impl : ( ':' ) ;
    public final void rule__Shape__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2171:1: ( ( ':' ) )
            // InternalCanvas.g:2172:1: ( ':' )
            {
            // InternalCanvas.g:2172:1: ( ':' )
            // InternalCanvas.g:2173:2: ':'
            {
             before(grammarAccess.getShapeAccess().getColonKeyword_6_0_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getColonKeyword_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_6_0__1__Impl"


    // $ANTLR start "rule__FloatingTexts__Group__0"
    // InternalCanvas.g:2183:1: rule__FloatingTexts__Group__0 : rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1 ;
    public final void rule__FloatingTexts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2187:1: ( rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1 )
            // InternalCanvas.g:2188:2: rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1
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
    // InternalCanvas.g:2195:1: rule__FloatingTexts__Group__0__Impl : ( () ) ;
    public final void rule__FloatingTexts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2199:1: ( ( () ) )
            // InternalCanvas.g:2200:1: ( () )
            {
            // InternalCanvas.g:2200:1: ( () )
            // InternalCanvas.g:2201:2: ()
            {
             before(grammarAccess.getFloatingTextsAccess().getFloatingTextsAction_0()); 
            // InternalCanvas.g:2202:2: ()
            // InternalCanvas.g:2202:3: 
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
    // InternalCanvas.g:2210:1: rule__FloatingTexts__Group__1 : rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2 ;
    public final void rule__FloatingTexts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2214:1: ( rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2 )
            // InternalCanvas.g:2215:2: rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalCanvas.g:2222:1: rule__FloatingTexts__Group__1__Impl : ( ( rule__FloatingTexts__Alternatives_1 ) ) ;
    public final void rule__FloatingTexts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2226:1: ( ( ( rule__FloatingTexts__Alternatives_1 ) ) )
            // InternalCanvas.g:2227:1: ( ( rule__FloatingTexts__Alternatives_1 ) )
            {
            // InternalCanvas.g:2227:1: ( ( rule__FloatingTexts__Alternatives_1 ) )
            // InternalCanvas.g:2228:2: ( rule__FloatingTexts__Alternatives_1 )
            {
             before(grammarAccess.getFloatingTextsAccess().getAlternatives_1()); 
            // InternalCanvas.g:2229:2: ( rule__FloatingTexts__Alternatives_1 )
            // InternalCanvas.g:2229:3: rule__FloatingTexts__Alternatives_1
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
    // InternalCanvas.g:2237:1: rule__FloatingTexts__Group__2 : rule__FloatingTexts__Group__2__Impl ;
    public final void rule__FloatingTexts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2241:1: ( rule__FloatingTexts__Group__2__Impl )
            // InternalCanvas.g:2242:2: rule__FloatingTexts__Group__2__Impl
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
    // InternalCanvas.g:2248:1: rule__FloatingTexts__Group__2__Impl : ( ( rule__FloatingTexts__TextsAssignment_2 )* ) ;
    public final void rule__FloatingTexts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2252:1: ( ( ( rule__FloatingTexts__TextsAssignment_2 )* ) )
            // InternalCanvas.g:2253:1: ( ( rule__FloatingTexts__TextsAssignment_2 )* )
            {
            // InternalCanvas.g:2253:1: ( ( rule__FloatingTexts__TextsAssignment_2 )* )
            // InternalCanvas.g:2254:2: ( rule__FloatingTexts__TextsAssignment_2 )*
            {
             before(grammarAccess.getFloatingTextsAccess().getTextsAssignment_2()); 
            // InternalCanvas.g:2255:2: ( rule__FloatingTexts__TextsAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==17||LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCanvas.g:2255:3: rule__FloatingTexts__TextsAssignment_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__FloatingTexts__TextsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalCanvas.g:2264:1: rule__FloatingTexts__Group_1_0__0 : rule__FloatingTexts__Group_1_0__0__Impl rule__FloatingTexts__Group_1_0__1 ;
    public final void rule__FloatingTexts__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2268:1: ( rule__FloatingTexts__Group_1_0__0__Impl rule__FloatingTexts__Group_1_0__1 )
            // InternalCanvas.g:2269:2: rule__FloatingTexts__Group_1_0__0__Impl rule__FloatingTexts__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:2276:1: rule__FloatingTexts__Group_1_0__0__Impl : ( 'texts' ) ;
    public final void rule__FloatingTexts__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2280:1: ( ( 'texts' ) )
            // InternalCanvas.g:2281:1: ( 'texts' )
            {
            // InternalCanvas.g:2281:1: ( 'texts' )
            // InternalCanvas.g:2282:2: 'texts'
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
    // InternalCanvas.g:2291:1: rule__FloatingTexts__Group_1_0__1 : rule__FloatingTexts__Group_1_0__1__Impl ;
    public final void rule__FloatingTexts__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2295:1: ( rule__FloatingTexts__Group_1_0__1__Impl )
            // InternalCanvas.g:2296:2: rule__FloatingTexts__Group_1_0__1__Impl
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
    // InternalCanvas.g:2302:1: rule__FloatingTexts__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__FloatingTexts__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2306:1: ( ( ':' ) )
            // InternalCanvas.g:2307:1: ( ':' )
            {
            // InternalCanvas.g:2307:1: ( ':' )
            // InternalCanvas.g:2308:2: ':'
            {
             before(grammarAccess.getFloatingTextsAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:2318:1: rule__FloatingText__Group__0 : rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1 ;
    public final void rule__FloatingText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2322:1: ( rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1 )
            // InternalCanvas.g:2323:2: rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCanvas.g:2330:1: rule__FloatingText__Group__0__Impl : ( () ) ;
    public final void rule__FloatingText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2334:1: ( ( () ) )
            // InternalCanvas.g:2335:1: ( () )
            {
            // InternalCanvas.g:2335:1: ( () )
            // InternalCanvas.g:2336:2: ()
            {
             before(grammarAccess.getFloatingTextAccess().getFloatingTextAction_0()); 
            // InternalCanvas.g:2337:2: ()
            // InternalCanvas.g:2337:3: 
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
    // InternalCanvas.g:2345:1: rule__FloatingText__Group__1 : rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2 ;
    public final void rule__FloatingText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2349:1: ( rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2 )
            // InternalCanvas.g:2350:2: rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCanvas.g:2357:1: rule__FloatingText__Group__1__Impl : ( ( rule__FloatingText__Alternatives_1 ) ) ;
    public final void rule__FloatingText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2361:1: ( ( ( rule__FloatingText__Alternatives_1 ) ) )
            // InternalCanvas.g:2362:1: ( ( rule__FloatingText__Alternatives_1 ) )
            {
            // InternalCanvas.g:2362:1: ( ( rule__FloatingText__Alternatives_1 ) )
            // InternalCanvas.g:2363:2: ( rule__FloatingText__Alternatives_1 )
            {
             before(grammarAccess.getFloatingTextAccess().getAlternatives_1()); 
            // InternalCanvas.g:2364:2: ( rule__FloatingText__Alternatives_1 )
            // InternalCanvas.g:2364:3: rule__FloatingText__Alternatives_1
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
    // InternalCanvas.g:2372:1: rule__FloatingText__Group__2 : rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3 ;
    public final void rule__FloatingText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2376:1: ( rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3 )
            // InternalCanvas.g:2377:2: rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalCanvas.g:2384:1: rule__FloatingText__Group__2__Impl : ( ( rule__FloatingText__RectAssignment_2 ) ) ;
    public final void rule__FloatingText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2388:1: ( ( ( rule__FloatingText__RectAssignment_2 ) ) )
            // InternalCanvas.g:2389:1: ( ( rule__FloatingText__RectAssignment_2 ) )
            {
            // InternalCanvas.g:2389:1: ( ( rule__FloatingText__RectAssignment_2 ) )
            // InternalCanvas.g:2390:2: ( rule__FloatingText__RectAssignment_2 )
            {
             before(grammarAccess.getFloatingTextAccess().getRectAssignment_2()); 
            // InternalCanvas.g:2391:2: ( rule__FloatingText__RectAssignment_2 )
            // InternalCanvas.g:2391:3: rule__FloatingText__RectAssignment_2
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
    // InternalCanvas.g:2399:1: rule__FloatingText__Group__3 : rule__FloatingText__Group__3__Impl ;
    public final void rule__FloatingText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2403:1: ( rule__FloatingText__Group__3__Impl )
            // InternalCanvas.g:2404:2: rule__FloatingText__Group__3__Impl
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
    // InternalCanvas.g:2410:1: rule__FloatingText__Group__3__Impl : ( ( rule__FloatingText__EndAssignment_3 ) ) ;
    public final void rule__FloatingText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2414:1: ( ( ( rule__FloatingText__EndAssignment_3 ) ) )
            // InternalCanvas.g:2415:1: ( ( rule__FloatingText__EndAssignment_3 ) )
            {
            // InternalCanvas.g:2415:1: ( ( rule__FloatingText__EndAssignment_3 ) )
            // InternalCanvas.g:2416:2: ( rule__FloatingText__EndAssignment_3 )
            {
             before(grammarAccess.getFloatingTextAccess().getEndAssignment_3()); 
            // InternalCanvas.g:2417:2: ( rule__FloatingText__EndAssignment_3 )
            // InternalCanvas.g:2417:3: rule__FloatingText__EndAssignment_3
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
    // InternalCanvas.g:2426:1: rule__FloatingText__Group_1_0__0 : rule__FloatingText__Group_1_0__0__Impl rule__FloatingText__Group_1_0__1 ;
    public final void rule__FloatingText__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2430:1: ( rule__FloatingText__Group_1_0__0__Impl rule__FloatingText__Group_1_0__1 )
            // InternalCanvas.g:2431:2: rule__FloatingText__Group_1_0__0__Impl rule__FloatingText__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:2438:1: rule__FloatingText__Group_1_0__0__Impl : ( 'text' ) ;
    public final void rule__FloatingText__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2442:1: ( ( 'text' ) )
            // InternalCanvas.g:2443:1: ( 'text' )
            {
            // InternalCanvas.g:2443:1: ( 'text' )
            // InternalCanvas.g:2444:2: 'text'
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
    // InternalCanvas.g:2453:1: rule__FloatingText__Group_1_0__1 : rule__FloatingText__Group_1_0__1__Impl ;
    public final void rule__FloatingText__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2457:1: ( rule__FloatingText__Group_1_0__1__Impl )
            // InternalCanvas.g:2458:2: rule__FloatingText__Group_1_0__1__Impl
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
    // InternalCanvas.g:2464:1: rule__FloatingText__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__FloatingText__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2468:1: ( ( ':' ) )
            // InternalCanvas.g:2469:1: ( ':' )
            {
            // InternalCanvas.g:2469:1: ( ':' )
            // InternalCanvas.g:2470:2: ':'
            {
             before(grammarAccess.getFloatingTextAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__ShapeProps__Group__0"
    // InternalCanvas.g:2480:1: rule__ShapeProps__Group__0 : rule__ShapeProps__Group__0__Impl rule__ShapeProps__Group__1 ;
    public final void rule__ShapeProps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2484:1: ( rule__ShapeProps__Group__0__Impl rule__ShapeProps__Group__1 )
            // InternalCanvas.g:2485:2: rule__ShapeProps__Group__0__Impl rule__ShapeProps__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ShapeProps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeProps__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group__0"


    // $ANTLR start "rule__ShapeProps__Group__0__Impl"
    // InternalCanvas.g:2492:1: rule__ShapeProps__Group__0__Impl : ( () ) ;
    public final void rule__ShapeProps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2496:1: ( ( () ) )
            // InternalCanvas.g:2497:1: ( () )
            {
            // InternalCanvas.g:2497:1: ( () )
            // InternalCanvas.g:2498:2: ()
            {
             before(grammarAccess.getShapePropsAccess().getShapePropsAction_0()); 
            // InternalCanvas.g:2499:2: ()
            // InternalCanvas.g:2499:3: 
            {
            }

             after(grammarAccess.getShapePropsAccess().getShapePropsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group__0__Impl"


    // $ANTLR start "rule__ShapeProps__Group__1"
    // InternalCanvas.g:2507:1: rule__ShapeProps__Group__1 : rule__ShapeProps__Group__1__Impl rule__ShapeProps__Group__2 ;
    public final void rule__ShapeProps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2511:1: ( rule__ShapeProps__Group__1__Impl rule__ShapeProps__Group__2 )
            // InternalCanvas.g:2512:2: rule__ShapeProps__Group__1__Impl rule__ShapeProps__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ShapeProps__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeProps__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group__1"


    // $ANTLR start "rule__ShapeProps__Group__1__Impl"
    // InternalCanvas.g:2519:1: rule__ShapeProps__Group__1__Impl : ( ( rule__ShapeProps__Alternatives_1 ) ) ;
    public final void rule__ShapeProps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2523:1: ( ( ( rule__ShapeProps__Alternatives_1 ) ) )
            // InternalCanvas.g:2524:1: ( ( rule__ShapeProps__Alternatives_1 ) )
            {
            // InternalCanvas.g:2524:1: ( ( rule__ShapeProps__Alternatives_1 ) )
            // InternalCanvas.g:2525:2: ( rule__ShapeProps__Alternatives_1 )
            {
             before(grammarAccess.getShapePropsAccess().getAlternatives_1()); 
            // InternalCanvas.g:2526:2: ( rule__ShapeProps__Alternatives_1 )
            // InternalCanvas.g:2526:3: rule__ShapeProps__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeProps__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getShapePropsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group__1__Impl"


    // $ANTLR start "rule__ShapeProps__Group__2"
    // InternalCanvas.g:2534:1: rule__ShapeProps__Group__2 : rule__ShapeProps__Group__2__Impl rule__ShapeProps__Group__3 ;
    public final void rule__ShapeProps__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2538:1: ( rule__ShapeProps__Group__2__Impl rule__ShapeProps__Group__3 )
            // InternalCanvas.g:2539:2: rule__ShapeProps__Group__2__Impl rule__ShapeProps__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ShapeProps__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeProps__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group__2"


    // $ANTLR start "rule__ShapeProps__Group__2__Impl"
    // InternalCanvas.g:2546:1: rule__ShapeProps__Group__2__Impl : ( ( rule__ShapeProps__ContainerAssignment_2 )? ) ;
    public final void rule__ShapeProps__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2550:1: ( ( ( rule__ShapeProps__ContainerAssignment_2 )? ) )
            // InternalCanvas.g:2551:1: ( ( rule__ShapeProps__ContainerAssignment_2 )? )
            {
            // InternalCanvas.g:2551:1: ( ( rule__ShapeProps__ContainerAssignment_2 )? )
            // InternalCanvas.g:2552:2: ( rule__ShapeProps__ContainerAssignment_2 )?
            {
             before(grammarAccess.getShapePropsAccess().getContainerAssignment_2()); 
            // InternalCanvas.g:2553:2: ( rule__ShapeProps__ContainerAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCanvas.g:2553:3: rule__ShapeProps__ContainerAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeProps__ContainerAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapePropsAccess().getContainerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group__2__Impl"


    // $ANTLR start "rule__ShapeProps__Group__3"
    // InternalCanvas.g:2561:1: rule__ShapeProps__Group__3 : rule__ShapeProps__Group__3__Impl ;
    public final void rule__ShapeProps__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2565:1: ( rule__ShapeProps__Group__3__Impl )
            // InternalCanvas.g:2566:2: rule__ShapeProps__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeProps__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group__3"


    // $ANTLR start "rule__ShapeProps__Group__3__Impl"
    // InternalCanvas.g:2572:1: rule__ShapeProps__Group__3__Impl : ( ( rule__ShapeProps__ColorAssignment_3 )? ) ;
    public final void rule__ShapeProps__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2576:1: ( ( ( rule__ShapeProps__ColorAssignment_3 )? ) )
            // InternalCanvas.g:2577:1: ( ( rule__ShapeProps__ColorAssignment_3 )? )
            {
            // InternalCanvas.g:2577:1: ( ( rule__ShapeProps__ColorAssignment_3 )? )
            // InternalCanvas.g:2578:2: ( rule__ShapeProps__ColorAssignment_3 )?
            {
             before(grammarAccess.getShapePropsAccess().getColorAssignment_3()); 
            // InternalCanvas.g:2579:2: ( rule__ShapeProps__ColorAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCanvas.g:2579:3: rule__ShapeProps__ColorAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeProps__ColorAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapePropsAccess().getColorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group__3__Impl"


    // $ANTLR start "rule__ShapeProps__Group_1_0__0"
    // InternalCanvas.g:2588:1: rule__ShapeProps__Group_1_0__0 : rule__ShapeProps__Group_1_0__0__Impl rule__ShapeProps__Group_1_0__1 ;
    public final void rule__ShapeProps__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2592:1: ( rule__ShapeProps__Group_1_0__0__Impl rule__ShapeProps__Group_1_0__1 )
            // InternalCanvas.g:2593:2: rule__ShapeProps__Group_1_0__0__Impl rule__ShapeProps__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ShapeProps__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeProps__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group_1_0__0"


    // $ANTLR start "rule__ShapeProps__Group_1_0__0__Impl"
    // InternalCanvas.g:2600:1: rule__ShapeProps__Group_1_0__0__Impl : ( 'properties' ) ;
    public final void rule__ShapeProps__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2604:1: ( ( 'properties' ) )
            // InternalCanvas.g:2605:1: ( 'properties' )
            {
            // InternalCanvas.g:2605:1: ( 'properties' )
            // InternalCanvas.g:2606:2: 'properties'
            {
             before(grammarAccess.getShapePropsAccess().getPropertiesKeyword_1_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getShapePropsAccess().getPropertiesKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group_1_0__0__Impl"


    // $ANTLR start "rule__ShapeProps__Group_1_0__1"
    // InternalCanvas.g:2615:1: rule__ShapeProps__Group_1_0__1 : rule__ShapeProps__Group_1_0__1__Impl ;
    public final void rule__ShapeProps__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2619:1: ( rule__ShapeProps__Group_1_0__1__Impl )
            // InternalCanvas.g:2620:2: rule__ShapeProps__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeProps__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group_1_0__1"


    // $ANTLR start "rule__ShapeProps__Group_1_0__1__Impl"
    // InternalCanvas.g:2626:1: rule__ShapeProps__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__ShapeProps__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2630:1: ( ( ':' ) )
            // InternalCanvas.g:2631:1: ( ':' )
            {
            // InternalCanvas.g:2631:1: ( ':' )
            // InternalCanvas.g:2632:2: ':'
            {
             before(grammarAccess.getShapePropsAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getShapePropsAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__Group_1_0__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalCanvas.g:2642:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2646:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalCanvas.g:2647:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalCanvas.g:2654:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2658:1: ( ( () ) )
            // InternalCanvas.g:2659:1: ( () )
            {
            // InternalCanvas.g:2659:1: ( () )
            // InternalCanvas.g:2660:2: ()
            {
             before(grammarAccess.getContainerAccess().getShapeContainerAction_0()); 
            // InternalCanvas.g:2661:2: ()
            // InternalCanvas.g:2661:3: 
            {
            }

             after(grammarAccess.getContainerAccess().getShapeContainerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalCanvas.g:2669:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2673:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalCanvas.g:2674:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalCanvas.g:2681:1: rule__Container__Group__1__Impl : ( 'container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2685:1: ( ( 'container' ) )
            // InternalCanvas.g:2686:1: ( 'container' )
            {
            // InternalCanvas.g:2686:1: ( 'container' )
            // InternalCanvas.g:2687:2: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalCanvas.g:2696:1: rule__Container__Group__2 : rule__Container__Group__2__Impl ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2700:1: ( rule__Container__Group__2__Impl )
            // InternalCanvas.g:2701:2: rule__Container__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalCanvas.g:2707:1: rule__Container__Group__2__Impl : ( ( rule__Container__Alternatives_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2711:1: ( ( ( rule__Container__Alternatives_2 ) ) )
            // InternalCanvas.g:2712:1: ( ( rule__Container__Alternatives_2 ) )
            {
            // InternalCanvas.g:2712:1: ( ( rule__Container__Alternatives_2 ) )
            // InternalCanvas.g:2713:2: ( rule__Container__Alternatives_2 )
            {
             before(grammarAccess.getContainerAccess().getAlternatives_2()); 
            // InternalCanvas.g:2714:2: ( rule__Container__Alternatives_2 )
            // InternalCanvas.g:2714:3: rule__Container__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalCanvas.g:2723:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2727:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalCanvas.g:2728:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalCanvas.g:2735:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2739:1: ( ( 'color' ) )
            // InternalCanvas.g:2740:1: ( 'color' )
            {
            // InternalCanvas.g:2740:1: ( 'color' )
            // InternalCanvas.g:2741:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalCanvas.g:2750:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2754:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalCanvas.g:2755:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalCanvas.g:2762:1: rule__Color__Group__1__Impl : ( ( rule__Color__RAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2766:1: ( ( ( rule__Color__RAssignment_1 ) ) )
            // InternalCanvas.g:2767:1: ( ( rule__Color__RAssignment_1 ) )
            {
            // InternalCanvas.g:2767:1: ( ( rule__Color__RAssignment_1 ) )
            // InternalCanvas.g:2768:2: ( rule__Color__RAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getRAssignment_1()); 
            // InternalCanvas.g:2769:2: ( rule__Color__RAssignment_1 )
            // InternalCanvas.g:2769:3: rule__Color__RAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__RAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalCanvas.g:2777:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2781:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalCanvas.g:2782:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalCanvas.g:2789:1: rule__Color__Group__2__Impl : ( ( rule__Color__GAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2793:1: ( ( ( rule__Color__GAssignment_2 ) ) )
            // InternalCanvas.g:2794:1: ( ( rule__Color__GAssignment_2 ) )
            {
            // InternalCanvas.g:2794:1: ( ( rule__Color__GAssignment_2 ) )
            // InternalCanvas.g:2795:2: ( rule__Color__GAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getGAssignment_2()); 
            // InternalCanvas.g:2796:2: ( rule__Color__GAssignment_2 )
            // InternalCanvas.g:2796:3: rule__Color__GAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Color__GAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalCanvas.g:2804:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2808:1: ( rule__Color__Group__3__Impl )
            // InternalCanvas.g:2809:2: rule__Color__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalCanvas.g:2815:1: rule__Color__Group__3__Impl : ( ( rule__Color__BAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2819:1: ( ( ( rule__Color__BAssignment_3 ) ) )
            // InternalCanvas.g:2820:1: ( ( rule__Color__BAssignment_3 ) )
            {
            // InternalCanvas.g:2820:1: ( ( rule__Color__BAssignment_3 ) )
            // InternalCanvas.g:2821:2: ( rule__Color__BAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getBAssignment_3()); 
            // InternalCanvas.g:2822:2: ( rule__Color__BAssignment_3 )
            // InternalCanvas.g:2822:3: rule__Color__BAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Color__BAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Connectors__Group__0"
    // InternalCanvas.g:2831:1: rule__Connectors__Group__0 : rule__Connectors__Group__0__Impl rule__Connectors__Group__1 ;
    public final void rule__Connectors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2835:1: ( rule__Connectors__Group__0__Impl rule__Connectors__Group__1 )
            // InternalCanvas.g:2836:2: rule__Connectors__Group__0__Impl rule__Connectors__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCanvas.g:2843:1: rule__Connectors__Group__0__Impl : ( () ) ;
    public final void rule__Connectors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2847:1: ( ( () ) )
            // InternalCanvas.g:2848:1: ( () )
            {
            // InternalCanvas.g:2848:1: ( () )
            // InternalCanvas.g:2849:2: ()
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsAction_0()); 
            // InternalCanvas.g:2850:2: ()
            // InternalCanvas.g:2850:3: 
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
    // InternalCanvas.g:2858:1: rule__Connectors__Group__1 : rule__Connectors__Group__1__Impl rule__Connectors__Group__2 ;
    public final void rule__Connectors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2862:1: ( rule__Connectors__Group__1__Impl rule__Connectors__Group__2 )
            // InternalCanvas.g:2863:2: rule__Connectors__Group__1__Impl rule__Connectors__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalCanvas.g:2870:1: rule__Connectors__Group__1__Impl : ( ( rule__Connectors__Alternatives_1 ) ) ;
    public final void rule__Connectors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2874:1: ( ( ( rule__Connectors__Alternatives_1 ) ) )
            // InternalCanvas.g:2875:1: ( ( rule__Connectors__Alternatives_1 ) )
            {
            // InternalCanvas.g:2875:1: ( ( rule__Connectors__Alternatives_1 ) )
            // InternalCanvas.g:2876:2: ( rule__Connectors__Alternatives_1 )
            {
             before(grammarAccess.getConnectorsAccess().getAlternatives_1()); 
            // InternalCanvas.g:2877:2: ( rule__Connectors__Alternatives_1 )
            // InternalCanvas.g:2877:3: rule__Connectors__Alternatives_1
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
    // InternalCanvas.g:2885:1: rule__Connectors__Group__2 : rule__Connectors__Group__2__Impl ;
    public final void rule__Connectors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2889:1: ( rule__Connectors__Group__2__Impl )
            // InternalCanvas.g:2890:2: rule__Connectors__Group__2__Impl
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
    // InternalCanvas.g:2896:1: rule__Connectors__Group__2__Impl : ( ( rule__Connectors__ConnectorsAssignment_2 )* ) ;
    public final void rule__Connectors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2900:1: ( ( ( rule__Connectors__ConnectorsAssignment_2 )* ) )
            // InternalCanvas.g:2901:1: ( ( rule__Connectors__ConnectorsAssignment_2 )* )
            {
            // InternalCanvas.g:2901:1: ( ( rule__Connectors__ConnectorsAssignment_2 )* )
            // InternalCanvas.g:2902:2: ( rule__Connectors__ConnectorsAssignment_2 )*
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsAssignment_2()); 
            // InternalCanvas.g:2903:2: ( rule__Connectors__ConnectorsAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==29||LA35_0==50) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCanvas.g:2903:3: rule__Connectors__ConnectorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Connectors__ConnectorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalCanvas.g:2912:1: rule__Connectors__Group_1_0__0 : rule__Connectors__Group_1_0__0__Impl rule__Connectors__Group_1_0__1 ;
    public final void rule__Connectors__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2916:1: ( rule__Connectors__Group_1_0__0__Impl rule__Connectors__Group_1_0__1 )
            // InternalCanvas.g:2917:2: rule__Connectors__Group_1_0__0__Impl rule__Connectors__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:2924:1: rule__Connectors__Group_1_0__0__Impl : ( 'connectors' ) ;
    public final void rule__Connectors__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2928:1: ( ( 'connectors' ) )
            // InternalCanvas.g:2929:1: ( 'connectors' )
            {
            // InternalCanvas.g:2929:1: ( 'connectors' )
            // InternalCanvas.g:2930:2: 'connectors'
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCanvas.g:2939:1: rule__Connectors__Group_1_0__1 : rule__Connectors__Group_1_0__1__Impl ;
    public final void rule__Connectors__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2943:1: ( rule__Connectors__Group_1_0__1__Impl )
            // InternalCanvas.g:2944:2: rule__Connectors__Group_1_0__1__Impl
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
    // InternalCanvas.g:2950:1: rule__Connectors__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Connectors__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2954:1: ( ( ':' ) )
            // InternalCanvas.g:2955:1: ( ':' )
            {
            // InternalCanvas.g:2955:1: ( ':' )
            // InternalCanvas.g:2956:2: ':'
            {
             before(grammarAccess.getConnectorsAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:2966:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2970:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalCanvas.g:2971:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCanvas.g:2978:1: rule__Connector__Group__0__Impl : ( ( rule__Connector__Alternatives_0 ) ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2982:1: ( ( ( rule__Connector__Alternatives_0 ) ) )
            // InternalCanvas.g:2983:1: ( ( rule__Connector__Alternatives_0 ) )
            {
            // InternalCanvas.g:2983:1: ( ( rule__Connector__Alternatives_0 ) )
            // InternalCanvas.g:2984:2: ( rule__Connector__Alternatives_0 )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives_0()); 
            // InternalCanvas.g:2985:2: ( rule__Connector__Alternatives_0 )
            // InternalCanvas.g:2985:3: rule__Connector__Alternatives_0
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
    // InternalCanvas.g:2993:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2997:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalCanvas.g:2998:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalCanvas.g:3005:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3009:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // InternalCanvas.g:3010:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // InternalCanvas.g:3010:1: ( ( rule__Connector__NameAssignment_1 ) )
            // InternalCanvas.g:3011:2: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // InternalCanvas.g:3012:2: ( rule__Connector__NameAssignment_1 )
            // InternalCanvas.g:3012:3: rule__Connector__NameAssignment_1
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
    // InternalCanvas.g:3020:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3024:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalCanvas.g:3025:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalCanvas.g:3032:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__PropsAssignment_2 )? ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3036:1: ( ( ( rule__Connector__PropsAssignment_2 )? ) )
            // InternalCanvas.g:3037:1: ( ( rule__Connector__PropsAssignment_2 )? )
            {
            // InternalCanvas.g:3037:1: ( ( rule__Connector__PropsAssignment_2 )? )
            // InternalCanvas.g:3038:2: ( rule__Connector__PropsAssignment_2 )?
            {
             before(grammarAccess.getConnectorAccess().getPropsAssignment_2()); 
            // InternalCanvas.g:3039:2: ( rule__Connector__PropsAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==12||LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCanvas.g:3039:3: rule__Connector__PropsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__PropsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorAccess().getPropsAssignment_2()); 

            }


            }

        }
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
    // InternalCanvas.g:3047:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3051:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalCanvas.g:3052:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalCanvas.g:3059:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__PolylineAssignment_3 )? ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3063:1: ( ( ( rule__Connector__PolylineAssignment_3 )? ) )
            // InternalCanvas.g:3064:1: ( ( rule__Connector__PolylineAssignment_3 )? )
            {
            // InternalCanvas.g:3064:1: ( ( rule__Connector__PolylineAssignment_3 )? )
            // InternalCanvas.g:3065:2: ( rule__Connector__PolylineAssignment_3 )?
            {
             before(grammarAccess.getConnectorAccess().getPolylineAssignment_3()); 
            // InternalCanvas.g:3066:2: ( rule__Connector__PolylineAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34||LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCanvas.g:3066:3: rule__Connector__PolylineAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__PolylineAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorAccess().getPolylineAssignment_3()); 

            }


            }

        }
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
    // InternalCanvas.g:3074:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl rule__Connector__Group__5 ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3078:1: ( rule__Connector__Group__4__Impl rule__Connector__Group__5 )
            // InternalCanvas.g:3079:2: rule__Connector__Group__4__Impl rule__Connector__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalCanvas.g:3086:1: rule__Connector__Group__4__Impl : ( ( rule__Connector__AnchorsAssignment_4 )? ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3090:1: ( ( ( rule__Connector__AnchorsAssignment_4 )? ) )
            // InternalCanvas.g:3091:1: ( ( rule__Connector__AnchorsAssignment_4 )? )
            {
            // InternalCanvas.g:3091:1: ( ( rule__Connector__AnchorsAssignment_4 )? )
            // InternalCanvas.g:3092:2: ( rule__Connector__AnchorsAssignment_4 )?
            {
             before(grammarAccess.getConnectorAccess().getAnchorsAssignment_4()); 
            // InternalCanvas.g:3093:2: ( rule__Connector__AnchorsAssignment_4 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30||LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCanvas.g:3093:3: rule__Connector__AnchorsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__AnchorsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorAccess().getAnchorsAssignment_4()); 

            }


            }

        }
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
    // InternalCanvas.g:3101:1: rule__Connector__Group__5 : rule__Connector__Group__5__Impl rule__Connector__Group__6 ;
    public final void rule__Connector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3105:1: ( rule__Connector__Group__5__Impl rule__Connector__Group__6 )
            // InternalCanvas.g:3106:2: rule__Connector__Group__5__Impl rule__Connector__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalCanvas.g:3113:1: rule__Connector__Group__5__Impl : ( ( rule__Connector__TextsAssignment_5 ) ) ;
    public final void rule__Connector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3117:1: ( ( ( rule__Connector__TextsAssignment_5 ) ) )
            // InternalCanvas.g:3118:1: ( ( rule__Connector__TextsAssignment_5 ) )
            {
            // InternalCanvas.g:3118:1: ( ( rule__Connector__TextsAssignment_5 ) )
            // InternalCanvas.g:3119:2: ( rule__Connector__TextsAssignment_5 )
            {
             before(grammarAccess.getConnectorAccess().getTextsAssignment_5()); 
            // InternalCanvas.g:3120:2: ( rule__Connector__TextsAssignment_5 )
            // InternalCanvas.g:3120:3: rule__Connector__TextsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Connector__TextsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTextsAssignment_5()); 

            }


            }

        }
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
    // InternalCanvas.g:3128:1: rule__Connector__Group__6 : rule__Connector__Group__6__Impl rule__Connector__Group__7 ;
    public final void rule__Connector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3132:1: ( rule__Connector__Group__6__Impl rule__Connector__Group__7 )
            // InternalCanvas.g:3133:2: rule__Connector__Group__6__Impl rule__Connector__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalCanvas.g:3140:1: rule__Connector__Group__6__Impl : ( ( rule__Connector__Alternatives_6 ) ) ;
    public final void rule__Connector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3144:1: ( ( ( rule__Connector__Alternatives_6 ) ) )
            // InternalCanvas.g:3145:1: ( ( rule__Connector__Alternatives_6 ) )
            {
            // InternalCanvas.g:3145:1: ( ( rule__Connector__Alternatives_6 ) )
            // InternalCanvas.g:3146:2: ( rule__Connector__Alternatives_6 )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives_6()); 
            // InternalCanvas.g:3147:2: ( rule__Connector__Alternatives_6 )
            // InternalCanvas.g:3147:3: rule__Connector__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getAlternatives_6()); 

            }


            }

        }
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
    // InternalCanvas.g:3155:1: rule__Connector__Group__7 : rule__Connector__Group__7__Impl ;
    public final void rule__Connector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3159:1: ( rule__Connector__Group__7__Impl )
            // InternalCanvas.g:3160:2: rule__Connector__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:3166:1: rule__Connector__Group__7__Impl : ( ( rule__Connector__RepresentsAssignment_7 ) ) ;
    public final void rule__Connector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3170:1: ( ( ( rule__Connector__RepresentsAssignment_7 ) ) )
            // InternalCanvas.g:3171:1: ( ( rule__Connector__RepresentsAssignment_7 ) )
            {
            // InternalCanvas.g:3171:1: ( ( rule__Connector__RepresentsAssignment_7 ) )
            // InternalCanvas.g:3172:2: ( rule__Connector__RepresentsAssignment_7 )
            {
             before(grammarAccess.getConnectorAccess().getRepresentsAssignment_7()); 
            // InternalCanvas.g:3173:2: ( rule__Connector__RepresentsAssignment_7 )
            // InternalCanvas.g:3173:3: rule__Connector__RepresentsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Connector__RepresentsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getRepresentsAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Connector__Group_0_0__0"
    // InternalCanvas.g:3182:1: rule__Connector__Group_0_0__0 : rule__Connector__Group_0_0__0__Impl rule__Connector__Group_0_0__1 ;
    public final void rule__Connector__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3186:1: ( rule__Connector__Group_0_0__0__Impl rule__Connector__Group_0_0__1 )
            // InternalCanvas.g:3187:2: rule__Connector__Group_0_0__0__Impl rule__Connector__Group_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:3194:1: rule__Connector__Group_0_0__0__Impl : ( 'connector' ) ;
    public final void rule__Connector__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3198:1: ( ( 'connector' ) )
            // InternalCanvas.g:3199:1: ( 'connector' )
            {
            // InternalCanvas.g:3199:1: ( 'connector' )
            // InternalCanvas.g:3200:2: 'connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCanvas.g:3209:1: rule__Connector__Group_0_0__1 : rule__Connector__Group_0_0__1__Impl ;
    public final void rule__Connector__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3213:1: ( rule__Connector__Group_0_0__1__Impl )
            // InternalCanvas.g:3214:2: rule__Connector__Group_0_0__1__Impl
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
    // InternalCanvas.g:3220:1: rule__Connector__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Connector__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3224:1: ( ( ':' ) )
            // InternalCanvas.g:3225:1: ( ':' )
            {
            // InternalCanvas.g:3225:1: ( ':' )
            // InternalCanvas.g:3226:2: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_0_0_1()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__Connector__Group_6_0__0"
    // InternalCanvas.g:3236:1: rule__Connector__Group_6_0__0 : rule__Connector__Group_6_0__0__Impl rule__Connector__Group_6_0__1 ;
    public final void rule__Connector__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3240:1: ( rule__Connector__Group_6_0__0__Impl rule__Connector__Group_6_0__1 )
            // InternalCanvas.g:3241:2: rule__Connector__Group_6_0__0__Impl rule__Connector__Group_6_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Connector__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_6_0__0"


    // $ANTLR start "rule__Connector__Group_6_0__0__Impl"
    // InternalCanvas.g:3248:1: rule__Connector__Group_6_0__0__Impl : ( 'render' ) ;
    public final void rule__Connector__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3252:1: ( ( 'render' ) )
            // InternalCanvas.g:3253:1: ( 'render' )
            {
            // InternalCanvas.g:3253:1: ( 'render' )
            // InternalCanvas.g:3254:2: 'render'
            {
             before(grammarAccess.getConnectorAccess().getRenderKeyword_6_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRenderKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_6_0__0__Impl"


    // $ANTLR start "rule__Connector__Group_6_0__1"
    // InternalCanvas.g:3263:1: rule__Connector__Group_6_0__1 : rule__Connector__Group_6_0__1__Impl ;
    public final void rule__Connector__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3267:1: ( rule__Connector__Group_6_0__1__Impl )
            // InternalCanvas.g:3268:2: rule__Connector__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_6_0__1"


    // $ANTLR start "rule__Connector__Group_6_0__1__Impl"
    // InternalCanvas.g:3274:1: rule__Connector__Group_6_0__1__Impl : ( ':' ) ;
    public final void rule__Connector__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3278:1: ( ( ':' ) )
            // InternalCanvas.g:3279:1: ( ':' )
            {
            // InternalCanvas.g:3279:1: ( ':' )
            // InternalCanvas.g:3280:2: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_6_0_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getColonKeyword_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_6_0__1__Impl"


    // $ANTLR start "rule__Anchors__Group__0"
    // InternalCanvas.g:3290:1: rule__Anchors__Group__0 : rule__Anchors__Group__0__Impl rule__Anchors__Group__1 ;
    public final void rule__Anchors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3294:1: ( rule__Anchors__Group__0__Impl rule__Anchors__Group__1 )
            // InternalCanvas.g:3295:2: rule__Anchors__Group__0__Impl rule__Anchors__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalCanvas.g:3302:1: rule__Anchors__Group__0__Impl : ( ( rule__Anchors__Alternatives_0 ) ) ;
    public final void rule__Anchors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3306:1: ( ( ( rule__Anchors__Alternatives_0 ) ) )
            // InternalCanvas.g:3307:1: ( ( rule__Anchors__Alternatives_0 ) )
            {
            // InternalCanvas.g:3307:1: ( ( rule__Anchors__Alternatives_0 ) )
            // InternalCanvas.g:3308:2: ( rule__Anchors__Alternatives_0 )
            {
             before(grammarAccess.getAnchorsAccess().getAlternatives_0()); 
            // InternalCanvas.g:3309:2: ( rule__Anchors__Alternatives_0 )
            // InternalCanvas.g:3309:3: rule__Anchors__Alternatives_0
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
    // InternalCanvas.g:3317:1: rule__Anchors__Group__1 : rule__Anchors__Group__1__Impl rule__Anchors__Group__2 ;
    public final void rule__Anchors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3321:1: ( rule__Anchors__Group__1__Impl rule__Anchors__Group__2 )
            // InternalCanvas.g:3322:2: rule__Anchors__Group__1__Impl rule__Anchors__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalCanvas.g:3329:1: rule__Anchors__Group__1__Impl : ( ( rule__Anchors__StartAnchorAssignment_1 ) ) ;
    public final void rule__Anchors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3333:1: ( ( ( rule__Anchors__StartAnchorAssignment_1 ) ) )
            // InternalCanvas.g:3334:1: ( ( rule__Anchors__StartAnchorAssignment_1 ) )
            {
            // InternalCanvas.g:3334:1: ( ( rule__Anchors__StartAnchorAssignment_1 ) )
            // InternalCanvas.g:3335:2: ( rule__Anchors__StartAnchorAssignment_1 )
            {
             before(grammarAccess.getAnchorsAccess().getStartAnchorAssignment_1()); 
            // InternalCanvas.g:3336:2: ( rule__Anchors__StartAnchorAssignment_1 )
            // InternalCanvas.g:3336:3: rule__Anchors__StartAnchorAssignment_1
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
    // InternalCanvas.g:3344:1: rule__Anchors__Group__2 : rule__Anchors__Group__2__Impl ;
    public final void rule__Anchors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3348:1: ( rule__Anchors__Group__2__Impl )
            // InternalCanvas.g:3349:2: rule__Anchors__Group__2__Impl
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
    // InternalCanvas.g:3355:1: rule__Anchors__Group__2__Impl : ( ( rule__Anchors__EndAnchorAssignment_2 ) ) ;
    public final void rule__Anchors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3359:1: ( ( ( rule__Anchors__EndAnchorAssignment_2 ) ) )
            // InternalCanvas.g:3360:1: ( ( rule__Anchors__EndAnchorAssignment_2 ) )
            {
            // InternalCanvas.g:3360:1: ( ( rule__Anchors__EndAnchorAssignment_2 ) )
            // InternalCanvas.g:3361:2: ( rule__Anchors__EndAnchorAssignment_2 )
            {
             before(grammarAccess.getAnchorsAccess().getEndAnchorAssignment_2()); 
            // InternalCanvas.g:3362:2: ( rule__Anchors__EndAnchorAssignment_2 )
            // InternalCanvas.g:3362:3: rule__Anchors__EndAnchorAssignment_2
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
    // InternalCanvas.g:3371:1: rule__Anchors__Group_0_0__0 : rule__Anchors__Group_0_0__0__Impl rule__Anchors__Group_0_0__1 ;
    public final void rule__Anchors__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3375:1: ( rule__Anchors__Group_0_0__0__Impl rule__Anchors__Group_0_0__1 )
            // InternalCanvas.g:3376:2: rule__Anchors__Group_0_0__0__Impl rule__Anchors__Group_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:3383:1: rule__Anchors__Group_0_0__0__Impl : ( 'anchors' ) ;
    public final void rule__Anchors__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3387:1: ( ( 'anchors' ) )
            // InternalCanvas.g:3388:1: ( 'anchors' )
            {
            // InternalCanvas.g:3388:1: ( 'anchors' )
            // InternalCanvas.g:3389:2: 'anchors'
            {
             before(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCanvas.g:3398:1: rule__Anchors__Group_0_0__1 : rule__Anchors__Group_0_0__1__Impl ;
    public final void rule__Anchors__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3402:1: ( rule__Anchors__Group_0_0__1__Impl )
            // InternalCanvas.g:3403:2: rule__Anchors__Group_0_0__1__Impl
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
    // InternalCanvas.g:3409:1: rule__Anchors__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Anchors__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3413:1: ( ( ':' ) )
            // InternalCanvas.g:3414:1: ( ':' )
            {
            // InternalCanvas.g:3414:1: ( ':' )
            // InternalCanvas.g:3415:2: ':'
            {
             before(grammarAccess.getAnchorsAccess().getColonKeyword_0_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:3425:1: rule__StartAnchor__Group__0 : rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1 ;
    public final void rule__StartAnchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3429:1: ( rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1 )
            // InternalCanvas.g:3430:2: rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:3437:1: rule__StartAnchor__Group__0__Impl : ( ( rule__StartAnchor__Alternatives_0 ) ) ;
    public final void rule__StartAnchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3441:1: ( ( ( rule__StartAnchor__Alternatives_0 ) ) )
            // InternalCanvas.g:3442:1: ( ( rule__StartAnchor__Alternatives_0 ) )
            {
            // InternalCanvas.g:3442:1: ( ( rule__StartAnchor__Alternatives_0 ) )
            // InternalCanvas.g:3443:2: ( rule__StartAnchor__Alternatives_0 )
            {
             before(grammarAccess.getStartAnchorAccess().getAlternatives_0()); 
            // InternalCanvas.g:3444:2: ( rule__StartAnchor__Alternatives_0 )
            // InternalCanvas.g:3444:3: rule__StartAnchor__Alternatives_0
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
    // InternalCanvas.g:3452:1: rule__StartAnchor__Group__1 : rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2 ;
    public final void rule__StartAnchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3456:1: ( rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2 )
            // InternalCanvas.g:3457:2: rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalCanvas.g:3464:1: rule__StartAnchor__Group__1__Impl : ( ( rule__StartAnchor__PointAssignment_1 ) ) ;
    public final void rule__StartAnchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3468:1: ( ( ( rule__StartAnchor__PointAssignment_1 ) ) )
            // InternalCanvas.g:3469:1: ( ( rule__StartAnchor__PointAssignment_1 ) )
            {
            // InternalCanvas.g:3469:1: ( ( rule__StartAnchor__PointAssignment_1 ) )
            // InternalCanvas.g:3470:2: ( rule__StartAnchor__PointAssignment_1 )
            {
             before(grammarAccess.getStartAnchorAccess().getPointAssignment_1()); 
            // InternalCanvas.g:3471:2: ( rule__StartAnchor__PointAssignment_1 )
            // InternalCanvas.g:3471:3: rule__StartAnchor__PointAssignment_1
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
    // InternalCanvas.g:3479:1: rule__StartAnchor__Group__2 : rule__StartAnchor__Group__2__Impl ;
    public final void rule__StartAnchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3483:1: ( rule__StartAnchor__Group__2__Impl )
            // InternalCanvas.g:3484:2: rule__StartAnchor__Group__2__Impl
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
    // InternalCanvas.g:3490:1: rule__StartAnchor__Group__2__Impl : ( ( rule__StartAnchor__AnchorAssignment_2 )? ) ;
    public final void rule__StartAnchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3494:1: ( ( ( rule__StartAnchor__AnchorAssignment_2 )? ) )
            // InternalCanvas.g:3495:1: ( ( rule__StartAnchor__AnchorAssignment_2 )? )
            {
            // InternalCanvas.g:3495:1: ( ( rule__StartAnchor__AnchorAssignment_2 )? )
            // InternalCanvas.g:3496:2: ( rule__StartAnchor__AnchorAssignment_2 )?
            {
             before(grammarAccess.getStartAnchorAccess().getAnchorAssignment_2()); 
            // InternalCanvas.g:3497:2: ( rule__StartAnchor__AnchorAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=32 && LA39_0<=33)||(LA39_0>=52 && LA39_0<=53)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCanvas.g:3497:3: rule__StartAnchor__AnchorAssignment_2
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
    // InternalCanvas.g:3506:1: rule__StartAnchor__Group_0_0__0 : rule__StartAnchor__Group_0_0__0__Impl rule__StartAnchor__Group_0_0__1 ;
    public final void rule__StartAnchor__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3510:1: ( rule__StartAnchor__Group_0_0__0__Impl rule__StartAnchor__Group_0_0__1 )
            // InternalCanvas.g:3511:2: rule__StartAnchor__Group_0_0__0__Impl rule__StartAnchor__Group_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:3518:1: rule__StartAnchor__Group_0_0__0__Impl : ( 'start' ) ;
    public final void rule__StartAnchor__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3522:1: ( ( 'start' ) )
            // InternalCanvas.g:3523:1: ( 'start' )
            {
            // InternalCanvas.g:3523:1: ( 'start' )
            // InternalCanvas.g:3524:2: 'start'
            {
             before(grammarAccess.getStartAnchorAccess().getStartKeyword_0_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCanvas.g:3533:1: rule__StartAnchor__Group_0_0__1 : rule__StartAnchor__Group_0_0__1__Impl ;
    public final void rule__StartAnchor__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3537:1: ( rule__StartAnchor__Group_0_0__1__Impl )
            // InternalCanvas.g:3538:2: rule__StartAnchor__Group_0_0__1__Impl
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
    // InternalCanvas.g:3544:1: rule__StartAnchor__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__StartAnchor__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3548:1: ( ( ':' ) )
            // InternalCanvas.g:3549:1: ( ':' )
            {
            // InternalCanvas.g:3549:1: ( ':' )
            // InternalCanvas.g:3550:2: ':'
            {
             before(grammarAccess.getStartAnchorAccess().getColonKeyword_0_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:3560:1: rule__EndAnchor__Group__0 : rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1 ;
    public final void rule__EndAnchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3564:1: ( rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1 )
            // InternalCanvas.g:3565:2: rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:3572:1: rule__EndAnchor__Group__0__Impl : ( ( rule__EndAnchor__Alternatives_0 ) ) ;
    public final void rule__EndAnchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3576:1: ( ( ( rule__EndAnchor__Alternatives_0 ) ) )
            // InternalCanvas.g:3577:1: ( ( rule__EndAnchor__Alternatives_0 ) )
            {
            // InternalCanvas.g:3577:1: ( ( rule__EndAnchor__Alternatives_0 ) )
            // InternalCanvas.g:3578:2: ( rule__EndAnchor__Alternatives_0 )
            {
             before(grammarAccess.getEndAnchorAccess().getAlternatives_0()); 
            // InternalCanvas.g:3579:2: ( rule__EndAnchor__Alternatives_0 )
            // InternalCanvas.g:3579:3: rule__EndAnchor__Alternatives_0
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
    // InternalCanvas.g:3587:1: rule__EndAnchor__Group__1 : rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2 ;
    public final void rule__EndAnchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3591:1: ( rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2 )
            // InternalCanvas.g:3592:2: rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalCanvas.g:3599:1: rule__EndAnchor__Group__1__Impl : ( ( rule__EndAnchor__PointAssignment_1 ) ) ;
    public final void rule__EndAnchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3603:1: ( ( ( rule__EndAnchor__PointAssignment_1 ) ) )
            // InternalCanvas.g:3604:1: ( ( rule__EndAnchor__PointAssignment_1 ) )
            {
            // InternalCanvas.g:3604:1: ( ( rule__EndAnchor__PointAssignment_1 ) )
            // InternalCanvas.g:3605:2: ( rule__EndAnchor__PointAssignment_1 )
            {
             before(grammarAccess.getEndAnchorAccess().getPointAssignment_1()); 
            // InternalCanvas.g:3606:2: ( rule__EndAnchor__PointAssignment_1 )
            // InternalCanvas.g:3606:3: rule__EndAnchor__PointAssignment_1
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
    // InternalCanvas.g:3614:1: rule__EndAnchor__Group__2 : rule__EndAnchor__Group__2__Impl ;
    public final void rule__EndAnchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3618:1: ( rule__EndAnchor__Group__2__Impl )
            // InternalCanvas.g:3619:2: rule__EndAnchor__Group__2__Impl
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
    // InternalCanvas.g:3625:1: rule__EndAnchor__Group__2__Impl : ( ( rule__EndAnchor__AnchorAssignment_2 )? ) ;
    public final void rule__EndAnchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3629:1: ( ( ( rule__EndAnchor__AnchorAssignment_2 )? ) )
            // InternalCanvas.g:3630:1: ( ( rule__EndAnchor__AnchorAssignment_2 )? )
            {
            // InternalCanvas.g:3630:1: ( ( rule__EndAnchor__AnchorAssignment_2 )? )
            // InternalCanvas.g:3631:2: ( rule__EndAnchor__AnchorAssignment_2 )?
            {
             before(grammarAccess.getEndAnchorAccess().getAnchorAssignment_2()); 
            // InternalCanvas.g:3632:2: ( rule__EndAnchor__AnchorAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=32 && LA40_0<=33)||(LA40_0>=52 && LA40_0<=53)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCanvas.g:3632:3: rule__EndAnchor__AnchorAssignment_2
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
    // InternalCanvas.g:3641:1: rule__EndAnchor__Group_0_0__0 : rule__EndAnchor__Group_0_0__0__Impl rule__EndAnchor__Group_0_0__1 ;
    public final void rule__EndAnchor__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3645:1: ( rule__EndAnchor__Group_0_0__0__Impl rule__EndAnchor__Group_0_0__1 )
            // InternalCanvas.g:3646:2: rule__EndAnchor__Group_0_0__0__Impl rule__EndAnchor__Group_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:3653:1: rule__EndAnchor__Group_0_0__0__Impl : ( 'end' ) ;
    public final void rule__EndAnchor__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3657:1: ( ( 'end' ) )
            // InternalCanvas.g:3658:1: ( 'end' )
            {
            // InternalCanvas.g:3658:1: ( 'end' )
            // InternalCanvas.g:3659:2: 'end'
            {
             before(grammarAccess.getEndAnchorAccess().getEndKeyword_0_0_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCanvas.g:3668:1: rule__EndAnchor__Group_0_0__1 : rule__EndAnchor__Group_0_0__1__Impl ;
    public final void rule__EndAnchor__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3672:1: ( rule__EndAnchor__Group_0_0__1__Impl )
            // InternalCanvas.g:3673:2: rule__EndAnchor__Group_0_0__1__Impl
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
    // InternalCanvas.g:3679:1: rule__EndAnchor__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__EndAnchor__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3683:1: ( ( ':' ) )
            // InternalCanvas.g:3684:1: ( ':' )
            {
            // InternalCanvas.g:3684:1: ( ':' )
            // InternalCanvas.g:3685:2: ':'
            {
             before(grammarAccess.getEndAnchorAccess().getColonKeyword_0_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:3695:1: rule__ShapeAnchorElement__Group__0 : rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1 ;
    public final void rule__ShapeAnchorElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3699:1: ( rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1 )
            // InternalCanvas.g:3700:2: rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCanvas.g:3707:1: rule__ShapeAnchorElement__Group__0__Impl : ( ( rule__ShapeAnchorElement__Alternatives_0 ) ) ;
    public final void rule__ShapeAnchorElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3711:1: ( ( ( rule__ShapeAnchorElement__Alternatives_0 ) ) )
            // InternalCanvas.g:3712:1: ( ( rule__ShapeAnchorElement__Alternatives_0 ) )
            {
            // InternalCanvas.g:3712:1: ( ( rule__ShapeAnchorElement__Alternatives_0 ) )
            // InternalCanvas.g:3713:2: ( rule__ShapeAnchorElement__Alternatives_0 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getAlternatives_0()); 
            // InternalCanvas.g:3714:2: ( rule__ShapeAnchorElement__Alternatives_0 )
            // InternalCanvas.g:3714:3: rule__ShapeAnchorElement__Alternatives_0
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
    // InternalCanvas.g:3722:1: rule__ShapeAnchorElement__Group__1 : rule__ShapeAnchorElement__Group__1__Impl ;
    public final void rule__ShapeAnchorElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3726:1: ( rule__ShapeAnchorElement__Group__1__Impl )
            // InternalCanvas.g:3727:2: rule__ShapeAnchorElement__Group__1__Impl
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
    // InternalCanvas.g:3733:1: rule__ShapeAnchorElement__Group__1__Impl : ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) ) ;
    public final void rule__ShapeAnchorElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3737:1: ( ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) ) )
            // InternalCanvas.g:3738:1: ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) )
            {
            // InternalCanvas.g:3738:1: ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) )
            // InternalCanvas.g:3739:2: ( rule__ShapeAnchorElement__ElementAssignment_1 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementAssignment_1()); 
            // InternalCanvas.g:3740:2: ( rule__ShapeAnchorElement__ElementAssignment_1 )
            // InternalCanvas.g:3740:3: rule__ShapeAnchorElement__ElementAssignment_1
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
    // InternalCanvas.g:3749:1: rule__ShapeAnchorElement__Group_0_0__0 : rule__ShapeAnchorElement__Group_0_0__0__Impl rule__ShapeAnchorElement__Group_0_0__1 ;
    public final void rule__ShapeAnchorElement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3753:1: ( rule__ShapeAnchorElement__Group_0_0__0__Impl rule__ShapeAnchorElement__Group_0_0__1 )
            // InternalCanvas.g:3754:2: rule__ShapeAnchorElement__Group_0_0__0__Impl rule__ShapeAnchorElement__Group_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:3761:1: rule__ShapeAnchorElement__Group_0_0__0__Impl : ( 'shapeAnchor' ) ;
    public final void rule__ShapeAnchorElement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3765:1: ( ( 'shapeAnchor' ) )
            // InternalCanvas.g:3766:1: ( 'shapeAnchor' )
            {
            // InternalCanvas.g:3766:1: ( 'shapeAnchor' )
            // InternalCanvas.g:3767:2: 'shapeAnchor'
            {
             before(grammarAccess.getShapeAnchorElementAccess().getShapeAnchorKeyword_0_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getShapeAnchorElementAccess().getShapeAnchorKeyword_0_0_0()); 

            }


            }

        }
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
    // InternalCanvas.g:3776:1: rule__ShapeAnchorElement__Group_0_0__1 : rule__ShapeAnchorElement__Group_0_0__1__Impl ;
    public final void rule__ShapeAnchorElement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3780:1: ( rule__ShapeAnchorElement__Group_0_0__1__Impl )
            // InternalCanvas.g:3781:2: rule__ShapeAnchorElement__Group_0_0__1__Impl
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
    // InternalCanvas.g:3787:1: rule__ShapeAnchorElement__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ShapeAnchorElement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3791:1: ( ( ':' ) )
            // InternalCanvas.g:3792:1: ( ':' )
            {
            // InternalCanvas.g:3792:1: ( ':' )
            // InternalCanvas.g:3793:2: ':'
            {
             before(grammarAccess.getShapeAnchorElementAccess().getColonKeyword_0_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:3803:1: rule__ConnectorAnchorElement__Group__0 : rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1 ;
    public final void rule__ConnectorAnchorElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3807:1: ( rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1 )
            // InternalCanvas.g:3808:2: rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCanvas.g:3815:1: rule__ConnectorAnchorElement__Group__0__Impl : ( ( rule__ConnectorAnchorElement__Alternatives_0 ) ) ;
    public final void rule__ConnectorAnchorElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3819:1: ( ( ( rule__ConnectorAnchorElement__Alternatives_0 ) ) )
            // InternalCanvas.g:3820:1: ( ( rule__ConnectorAnchorElement__Alternatives_0 ) )
            {
            // InternalCanvas.g:3820:1: ( ( rule__ConnectorAnchorElement__Alternatives_0 ) )
            // InternalCanvas.g:3821:2: ( rule__ConnectorAnchorElement__Alternatives_0 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getAlternatives_0()); 
            // InternalCanvas.g:3822:2: ( rule__ConnectorAnchorElement__Alternatives_0 )
            // InternalCanvas.g:3822:3: rule__ConnectorAnchorElement__Alternatives_0
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
    // InternalCanvas.g:3830:1: rule__ConnectorAnchorElement__Group__1 : rule__ConnectorAnchorElement__Group__1__Impl ;
    public final void rule__ConnectorAnchorElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3834:1: ( rule__ConnectorAnchorElement__Group__1__Impl )
            // InternalCanvas.g:3835:2: rule__ConnectorAnchorElement__Group__1__Impl
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
    // InternalCanvas.g:3841:1: rule__ConnectorAnchorElement__Group__1__Impl : ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) ) ;
    public final void rule__ConnectorAnchorElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3845:1: ( ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) ) )
            // InternalCanvas.g:3846:1: ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) )
            {
            // InternalCanvas.g:3846:1: ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) )
            // InternalCanvas.g:3847:2: ( rule__ConnectorAnchorElement__ElementAssignment_1 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementAssignment_1()); 
            // InternalCanvas.g:3848:2: ( rule__ConnectorAnchorElement__ElementAssignment_1 )
            // InternalCanvas.g:3848:3: rule__ConnectorAnchorElement__ElementAssignment_1
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
    // InternalCanvas.g:3857:1: rule__ConnectorAnchorElement__Group_0_0__0 : rule__ConnectorAnchorElement__Group_0_0__0__Impl rule__ConnectorAnchorElement__Group_0_0__1 ;
    public final void rule__ConnectorAnchorElement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3861:1: ( rule__ConnectorAnchorElement__Group_0_0__0__Impl rule__ConnectorAnchorElement__Group_0_0__1 )
            // InternalCanvas.g:3862:2: rule__ConnectorAnchorElement__Group_0_0__0__Impl rule__ConnectorAnchorElement__Group_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:3869:1: rule__ConnectorAnchorElement__Group_0_0__0__Impl : ( 'segmentAnchor' ) ;
    public final void rule__ConnectorAnchorElement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3873:1: ( ( 'segmentAnchor' ) )
            // InternalCanvas.g:3874:1: ( 'segmentAnchor' )
            {
            // InternalCanvas.g:3874:1: ( 'segmentAnchor' )
            // InternalCanvas.g:3875:2: 'segmentAnchor'
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getSegmentAnchorKeyword_0_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getConnectorAnchorElementAccess().getSegmentAnchorKeyword_0_0_0()); 

            }


            }

        }
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
    // InternalCanvas.g:3884:1: rule__ConnectorAnchorElement__Group_0_0__1 : rule__ConnectorAnchorElement__Group_0_0__1__Impl ;
    public final void rule__ConnectorAnchorElement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3888:1: ( rule__ConnectorAnchorElement__Group_0_0__1__Impl )
            // InternalCanvas.g:3889:2: rule__ConnectorAnchorElement__Group_0_0__1__Impl
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
    // InternalCanvas.g:3895:1: rule__ConnectorAnchorElement__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ConnectorAnchorElement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3899:1: ( ( ':' ) )
            // InternalCanvas.g:3900:1: ( ':' )
            {
            // InternalCanvas.g:3900:1: ( ':' )
            // InternalCanvas.g:3901:2: ':'
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getColonKeyword_0_0_1()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__ConnectorProps__Group__0"
    // InternalCanvas.g:3911:1: rule__ConnectorProps__Group__0 : rule__ConnectorProps__Group__0__Impl rule__ConnectorProps__Group__1 ;
    public final void rule__ConnectorProps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3915:1: ( rule__ConnectorProps__Group__0__Impl rule__ConnectorProps__Group__1 )
            // InternalCanvas.g:3916:2: rule__ConnectorProps__Group__0__Impl rule__ConnectorProps__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ConnectorProps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorProps__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group__0"


    // $ANTLR start "rule__ConnectorProps__Group__0__Impl"
    // InternalCanvas.g:3923:1: rule__ConnectorProps__Group__0__Impl : ( () ) ;
    public final void rule__ConnectorProps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3927:1: ( ( () ) )
            // InternalCanvas.g:3928:1: ( () )
            {
            // InternalCanvas.g:3928:1: ( () )
            // InternalCanvas.g:3929:2: ()
            {
             before(grammarAccess.getConnectorPropsAccess().getConnectorPropsAction_0()); 
            // InternalCanvas.g:3930:2: ()
            // InternalCanvas.g:3930:3: 
            {
            }

             after(grammarAccess.getConnectorPropsAccess().getConnectorPropsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group__0__Impl"


    // $ANTLR start "rule__ConnectorProps__Group__1"
    // InternalCanvas.g:3938:1: rule__ConnectorProps__Group__1 : rule__ConnectorProps__Group__1__Impl rule__ConnectorProps__Group__2 ;
    public final void rule__ConnectorProps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3942:1: ( rule__ConnectorProps__Group__1__Impl rule__ConnectorProps__Group__2 )
            // InternalCanvas.g:3943:2: rule__ConnectorProps__Group__1__Impl rule__ConnectorProps__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ConnectorProps__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorProps__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group__1"


    // $ANTLR start "rule__ConnectorProps__Group__1__Impl"
    // InternalCanvas.g:3950:1: rule__ConnectorProps__Group__1__Impl : ( ( rule__ConnectorProps__Alternatives_1 ) ) ;
    public final void rule__ConnectorProps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3954:1: ( ( ( rule__ConnectorProps__Alternatives_1 ) ) )
            // InternalCanvas.g:3955:1: ( ( rule__ConnectorProps__Alternatives_1 ) )
            {
            // InternalCanvas.g:3955:1: ( ( rule__ConnectorProps__Alternatives_1 ) )
            // InternalCanvas.g:3956:2: ( rule__ConnectorProps__Alternatives_1 )
            {
             before(grammarAccess.getConnectorPropsAccess().getAlternatives_1()); 
            // InternalCanvas.g:3957:2: ( rule__ConnectorProps__Alternatives_1 )
            // InternalCanvas.g:3957:3: rule__ConnectorProps__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorProps__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorPropsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group__1__Impl"


    // $ANTLR start "rule__ConnectorProps__Group__2"
    // InternalCanvas.g:3965:1: rule__ConnectorProps__Group__2 : rule__ConnectorProps__Group__2__Impl ;
    public final void rule__ConnectorProps__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3969:1: ( rule__ConnectorProps__Group__2__Impl )
            // InternalCanvas.g:3970:2: rule__ConnectorProps__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorProps__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group__2"


    // $ANTLR start "rule__ConnectorProps__Group__2__Impl"
    // InternalCanvas.g:3976:1: rule__ConnectorProps__Group__2__Impl : ( ( rule__ConnectorProps__ColorAssignment_2 )? ) ;
    public final void rule__ConnectorProps__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3980:1: ( ( ( rule__ConnectorProps__ColorAssignment_2 )? ) )
            // InternalCanvas.g:3981:1: ( ( rule__ConnectorProps__ColorAssignment_2 )? )
            {
            // InternalCanvas.g:3981:1: ( ( rule__ConnectorProps__ColorAssignment_2 )? )
            // InternalCanvas.g:3982:2: ( rule__ConnectorProps__ColorAssignment_2 )?
            {
             before(grammarAccess.getConnectorPropsAccess().getColorAssignment_2()); 
            // InternalCanvas.g:3983:2: ( rule__ConnectorProps__ColorAssignment_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCanvas.g:3983:3: rule__ConnectorProps__ColorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectorProps__ColorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectorPropsAccess().getColorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group__2__Impl"


    // $ANTLR start "rule__ConnectorProps__Group_1_0__0"
    // InternalCanvas.g:3992:1: rule__ConnectorProps__Group_1_0__0 : rule__ConnectorProps__Group_1_0__0__Impl rule__ConnectorProps__Group_1_0__1 ;
    public final void rule__ConnectorProps__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3996:1: ( rule__ConnectorProps__Group_1_0__0__Impl rule__ConnectorProps__Group_1_0__1 )
            // InternalCanvas.g:3997:2: rule__ConnectorProps__Group_1_0__0__Impl rule__ConnectorProps__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ConnectorProps__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectorProps__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group_1_0__0"


    // $ANTLR start "rule__ConnectorProps__Group_1_0__0__Impl"
    // InternalCanvas.g:4004:1: rule__ConnectorProps__Group_1_0__0__Impl : ( 'properties' ) ;
    public final void rule__ConnectorProps__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4008:1: ( ( 'properties' ) )
            // InternalCanvas.g:4009:1: ( 'properties' )
            {
            // InternalCanvas.g:4009:1: ( 'properties' )
            // InternalCanvas.g:4010:2: 'properties'
            {
             before(grammarAccess.getConnectorPropsAccess().getPropertiesKeyword_1_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConnectorPropsAccess().getPropertiesKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group_1_0__0__Impl"


    // $ANTLR start "rule__ConnectorProps__Group_1_0__1"
    // InternalCanvas.g:4019:1: rule__ConnectorProps__Group_1_0__1 : rule__ConnectorProps__Group_1_0__1__Impl ;
    public final void rule__ConnectorProps__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4023:1: ( rule__ConnectorProps__Group_1_0__1__Impl )
            // InternalCanvas.g:4024:2: rule__ConnectorProps__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectorProps__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group_1_0__1"


    // $ANTLR start "rule__ConnectorProps__Group_1_0__1__Impl"
    // InternalCanvas.g:4030:1: rule__ConnectorProps__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__ConnectorProps__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4034:1: ( ( ':' ) )
            // InternalCanvas.g:4035:1: ( ':' )
            {
            // InternalCanvas.g:4035:1: ( ':' )
            // InternalCanvas.g:4036:2: ':'
            {
             before(grammarAccess.getConnectorPropsAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConnectorPropsAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__Group_1_0__1__Impl"


    // $ANTLR start "rule__Polyline__Group__0"
    // InternalCanvas.g:4046:1: rule__Polyline__Group__0 : rule__Polyline__Group__0__Impl rule__Polyline__Group__1 ;
    public final void rule__Polyline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4050:1: ( rule__Polyline__Group__0__Impl rule__Polyline__Group__1 )
            // InternalCanvas.g:4051:2: rule__Polyline__Group__0__Impl rule__Polyline__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalCanvas.g:4058:1: rule__Polyline__Group__0__Impl : ( () ) ;
    public final void rule__Polyline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4062:1: ( ( () ) )
            // InternalCanvas.g:4063:1: ( () )
            {
            // InternalCanvas.g:4063:1: ( () )
            // InternalCanvas.g:4064:2: ()
            {
             before(grammarAccess.getPolylineAccess().getPolylineAction_0()); 
            // InternalCanvas.g:4065:2: ()
            // InternalCanvas.g:4065:3: 
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
    // InternalCanvas.g:4073:1: rule__Polyline__Group__1 : rule__Polyline__Group__1__Impl rule__Polyline__Group__2 ;
    public final void rule__Polyline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4077:1: ( rule__Polyline__Group__1__Impl rule__Polyline__Group__2 )
            // InternalCanvas.g:4078:2: rule__Polyline__Group__1__Impl rule__Polyline__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalCanvas.g:4085:1: rule__Polyline__Group__1__Impl : ( ( rule__Polyline__Alternatives_1 ) ) ;
    public final void rule__Polyline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4089:1: ( ( ( rule__Polyline__Alternatives_1 ) ) )
            // InternalCanvas.g:4090:1: ( ( rule__Polyline__Alternatives_1 ) )
            {
            // InternalCanvas.g:4090:1: ( ( rule__Polyline__Alternatives_1 ) )
            // InternalCanvas.g:4091:2: ( rule__Polyline__Alternatives_1 )
            {
             before(grammarAccess.getPolylineAccess().getAlternatives_1()); 
            // InternalCanvas.g:4092:2: ( rule__Polyline__Alternatives_1 )
            // InternalCanvas.g:4092:3: rule__Polyline__Alternatives_1
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
    // InternalCanvas.g:4100:1: rule__Polyline__Group__2 : rule__Polyline__Group__2__Impl ;
    public final void rule__Polyline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4104:1: ( rule__Polyline__Group__2__Impl )
            // InternalCanvas.g:4105:2: rule__Polyline__Group__2__Impl
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
    // InternalCanvas.g:4111:1: rule__Polyline__Group__2__Impl : ( ( rule__Polyline__SegmentsAssignment_2 )* ) ;
    public final void rule__Polyline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4115:1: ( ( ( rule__Polyline__SegmentsAssignment_2 )* ) )
            // InternalCanvas.g:4116:1: ( ( rule__Polyline__SegmentsAssignment_2 )* )
            {
            // InternalCanvas.g:4116:1: ( ( rule__Polyline__SegmentsAssignment_2 )* )
            // InternalCanvas.g:4117:2: ( rule__Polyline__SegmentsAssignment_2 )*
            {
             before(grammarAccess.getPolylineAccess().getSegmentsAssignment_2()); 
            // InternalCanvas.g:4118:2: ( rule__Polyline__SegmentsAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==35||LA42_0==56) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCanvas.g:4118:3: rule__Polyline__SegmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Polyline__SegmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalCanvas.g:4127:1: rule__Polyline__Group_1_0__0 : rule__Polyline__Group_1_0__0__Impl rule__Polyline__Group_1_0__1 ;
    public final void rule__Polyline__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4131:1: ( rule__Polyline__Group_1_0__0__Impl rule__Polyline__Group_1_0__1 )
            // InternalCanvas.g:4132:2: rule__Polyline__Group_1_0__0__Impl rule__Polyline__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:4139:1: rule__Polyline__Group_1_0__0__Impl : ( 'polyline' ) ;
    public final void rule__Polyline__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4143:1: ( ( 'polyline' ) )
            // InternalCanvas.g:4144:1: ( 'polyline' )
            {
            // InternalCanvas.g:4144:1: ( 'polyline' )
            // InternalCanvas.g:4145:2: 'polyline'
            {
             before(grammarAccess.getPolylineAccess().getPolylineKeyword_1_0_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalCanvas.g:4154:1: rule__Polyline__Group_1_0__1 : rule__Polyline__Group_1_0__1__Impl ;
    public final void rule__Polyline__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4158:1: ( rule__Polyline__Group_1_0__1__Impl )
            // InternalCanvas.g:4159:2: rule__Polyline__Group_1_0__1__Impl
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
    // InternalCanvas.g:4165:1: rule__Polyline__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Polyline__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4169:1: ( ( ':' ) )
            // InternalCanvas.g:4170:1: ( ':' )
            {
            // InternalCanvas.g:4170:1: ( ':' )
            // InternalCanvas.g:4171:2: ':'
            {
             before(grammarAccess.getPolylineAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:4181:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4185:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // InternalCanvas.g:4186:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:4193:1: rule__Segment__Group__0__Impl : ( ( rule__Segment__Alternatives_0 ) ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4197:1: ( ( ( rule__Segment__Alternatives_0 ) ) )
            // InternalCanvas.g:4198:1: ( ( rule__Segment__Alternatives_0 ) )
            {
            // InternalCanvas.g:4198:1: ( ( rule__Segment__Alternatives_0 ) )
            // InternalCanvas.g:4199:2: ( rule__Segment__Alternatives_0 )
            {
             before(grammarAccess.getSegmentAccess().getAlternatives_0()); 
            // InternalCanvas.g:4200:2: ( rule__Segment__Alternatives_0 )
            // InternalCanvas.g:4200:3: rule__Segment__Alternatives_0
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
    // InternalCanvas.g:4208:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4212:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // InternalCanvas.g:4213:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalCanvas.g:4220:1: rule__Segment__Group__1__Impl : ( ( rule__Segment__StartPointAssignment_1 ) ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4224:1: ( ( ( rule__Segment__StartPointAssignment_1 ) ) )
            // InternalCanvas.g:4225:1: ( ( rule__Segment__StartPointAssignment_1 ) )
            {
            // InternalCanvas.g:4225:1: ( ( rule__Segment__StartPointAssignment_1 ) )
            // InternalCanvas.g:4226:2: ( rule__Segment__StartPointAssignment_1 )
            {
             before(grammarAccess.getSegmentAccess().getStartPointAssignment_1()); 
            // InternalCanvas.g:4227:2: ( rule__Segment__StartPointAssignment_1 )
            // InternalCanvas.g:4227:3: rule__Segment__StartPointAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Segment__StartPointAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getStartPointAssignment_1()); 

            }


            }

        }
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
    // InternalCanvas.g:4235:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4239:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // InternalCanvas.g:4240:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:4247:1: rule__Segment__Group__2__Impl : ( ',' ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4251:1: ( ( ',' ) )
            // InternalCanvas.g:4252:1: ( ',' )
            {
            // InternalCanvas.g:4252:1: ( ',' )
            // InternalCanvas.g:4253:2: ','
            {
             before(grammarAccess.getSegmentAccess().getCommaKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getCommaKeyword_2()); 

            }


            }

        }
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
    // InternalCanvas.g:4262:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4266:1: ( rule__Segment__Group__3__Impl )
            // InternalCanvas.g:4267:2: rule__Segment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:4273:1: rule__Segment__Group__3__Impl : ( ( rule__Segment__EndPointAssignment_3 ) ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4277:1: ( ( ( rule__Segment__EndPointAssignment_3 ) ) )
            // InternalCanvas.g:4278:1: ( ( rule__Segment__EndPointAssignment_3 ) )
            {
            // InternalCanvas.g:4278:1: ( ( rule__Segment__EndPointAssignment_3 ) )
            // InternalCanvas.g:4279:2: ( rule__Segment__EndPointAssignment_3 )
            {
             before(grammarAccess.getSegmentAccess().getEndPointAssignment_3()); 
            // InternalCanvas.g:4280:2: ( rule__Segment__EndPointAssignment_3 )
            // InternalCanvas.g:4280:3: rule__Segment__EndPointAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Segment__EndPointAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getEndPointAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Segment__Group_0_0__0"
    // InternalCanvas.g:4289:1: rule__Segment__Group_0_0__0 : rule__Segment__Group_0_0__0__Impl rule__Segment__Group_0_0__1 ;
    public final void rule__Segment__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4293:1: ( rule__Segment__Group_0_0__0__Impl rule__Segment__Group_0_0__1 )
            // InternalCanvas.g:4294:2: rule__Segment__Group_0_0__0__Impl rule__Segment__Group_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:4301:1: rule__Segment__Group_0_0__0__Impl : ( 'segment' ) ;
    public final void rule__Segment__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4305:1: ( ( 'segment' ) )
            // InternalCanvas.g:4306:1: ( 'segment' )
            {
            // InternalCanvas.g:4306:1: ( 'segment' )
            // InternalCanvas.g:4307:2: 'segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_0_0_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalCanvas.g:4316:1: rule__Segment__Group_0_0__1 : rule__Segment__Group_0_0__1__Impl ;
    public final void rule__Segment__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4320:1: ( rule__Segment__Group_0_0__1__Impl )
            // InternalCanvas.g:4321:2: rule__Segment__Group_0_0__1__Impl
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
    // InternalCanvas.g:4327:1: rule__Segment__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Segment__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4331:1: ( ( ':' ) )
            // InternalCanvas.g:4332:1: ( ':' )
            {
            // InternalCanvas.g:4332:1: ( ':' )
            // InternalCanvas.g:4333:2: ':'
            {
             before(grammarAccess.getSegmentAccess().getColonKeyword_0_0_1()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__Point__Group__0"
    // InternalCanvas.g:4343:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4347:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalCanvas.g:4348:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCanvas.g:4355:1: rule__Point__Group__0__Impl : ( 'x' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4359:1: ( ( 'x' ) )
            // InternalCanvas.g:4360:1: ( 'x' )
            {
            // InternalCanvas.g:4360:1: ( 'x' )
            // InternalCanvas.g:4361:2: 'x'
            {
             before(grammarAccess.getPointAccess().getXKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalCanvas.g:4370:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4374:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalCanvas.g:4375:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalCanvas.g:4382:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4386:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalCanvas.g:4387:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalCanvas.g:4387:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalCanvas.g:4388:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalCanvas.g:4389:2: ( rule__Point__XAssignment_1 )
            // InternalCanvas.g:4389:3: rule__Point__XAssignment_1
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
    // InternalCanvas.g:4397:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4401:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalCanvas.g:4402:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalCanvas.g:4409:1: rule__Point__Group__2__Impl : ( 'y' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4413:1: ( ( 'y' ) )
            // InternalCanvas.g:4414:1: ( 'y' )
            {
            // InternalCanvas.g:4414:1: ( 'y' )
            // InternalCanvas.g:4415:2: 'y'
            {
             before(grammarAccess.getPointAccess().getYKeyword_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalCanvas.g:4424:1: rule__Point__Group__3 : rule__Point__Group__3__Impl ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4428:1: ( rule__Point__Group__3__Impl )
            // InternalCanvas.g:4429:2: rule__Point__Group__3__Impl
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
    // InternalCanvas.g:4435:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4439:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalCanvas.g:4440:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalCanvas.g:4440:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalCanvas.g:4441:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalCanvas.g:4442:2: ( rule__Point__YAssignment_3 )
            // InternalCanvas.g:4442:3: rule__Point__YAssignment_3
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


    // $ANTLR start "rule__Rectangle__Group__0"
    // InternalCanvas.g:4451:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4455:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalCanvas.g:4456:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCanvas.g:4463:1: rule__Rectangle__Group__0__Impl : ( ( rule__Rectangle__Alternatives_0 ) ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4467:1: ( ( ( rule__Rectangle__Alternatives_0 ) ) )
            // InternalCanvas.g:4468:1: ( ( rule__Rectangle__Alternatives_0 ) )
            {
            // InternalCanvas.g:4468:1: ( ( rule__Rectangle__Alternatives_0 ) )
            // InternalCanvas.g:4469:2: ( rule__Rectangle__Alternatives_0 )
            {
             before(grammarAccess.getRectangleAccess().getAlternatives_0()); 
            // InternalCanvas.g:4470:2: ( rule__Rectangle__Alternatives_0 )
            // InternalCanvas.g:4470:3: rule__Rectangle__Alternatives_0
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
    // InternalCanvas.g:4478:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4482:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalCanvas.g:4483:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalCanvas.g:4490:1: rule__Rectangle__Group__1__Impl : ( 'x' ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4494:1: ( ( 'x' ) )
            // InternalCanvas.g:4495:1: ( 'x' )
            {
            // InternalCanvas.g:4495:1: ( 'x' )
            // InternalCanvas.g:4496:2: 'x'
            {
             before(grammarAccess.getRectangleAccess().getXKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalCanvas.g:4505:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4509:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalCanvas.g:4510:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalCanvas.g:4517:1: rule__Rectangle__Group__2__Impl : ( ( rule__Rectangle__XAssignment_2 ) ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4521:1: ( ( ( rule__Rectangle__XAssignment_2 ) ) )
            // InternalCanvas.g:4522:1: ( ( rule__Rectangle__XAssignment_2 ) )
            {
            // InternalCanvas.g:4522:1: ( ( rule__Rectangle__XAssignment_2 ) )
            // InternalCanvas.g:4523:2: ( rule__Rectangle__XAssignment_2 )
            {
             before(grammarAccess.getRectangleAccess().getXAssignment_2()); 
            // InternalCanvas.g:4524:2: ( rule__Rectangle__XAssignment_2 )
            // InternalCanvas.g:4524:3: rule__Rectangle__XAssignment_2
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
    // InternalCanvas.g:4532:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4536:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalCanvas.g:4537:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalCanvas.g:4544:1: rule__Rectangle__Group__3__Impl : ( 'y' ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4548:1: ( ( 'y' ) )
            // InternalCanvas.g:4549:1: ( 'y' )
            {
            // InternalCanvas.g:4549:1: ( 'y' )
            // InternalCanvas.g:4550:2: 'y'
            {
             before(grammarAccess.getRectangleAccess().getYKeyword_3()); 
            match(input,58,FOLLOW_2); 
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
    // InternalCanvas.g:4559:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4563:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalCanvas.g:4564:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalCanvas.g:4571:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__YAssignment_4 ) ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4575:1: ( ( ( rule__Rectangle__YAssignment_4 ) ) )
            // InternalCanvas.g:4576:1: ( ( rule__Rectangle__YAssignment_4 ) )
            {
            // InternalCanvas.g:4576:1: ( ( rule__Rectangle__YAssignment_4 ) )
            // InternalCanvas.g:4577:2: ( rule__Rectangle__YAssignment_4 )
            {
             before(grammarAccess.getRectangleAccess().getYAssignment_4()); 
            // InternalCanvas.g:4578:2: ( rule__Rectangle__YAssignment_4 )
            // InternalCanvas.g:4578:3: rule__Rectangle__YAssignment_4
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
    // InternalCanvas.g:4586:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4590:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalCanvas.g:4591:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalCanvas.g:4598:1: rule__Rectangle__Group__5__Impl : ( 'width' ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4602:1: ( ( 'width' ) )
            // InternalCanvas.g:4603:1: ( 'width' )
            {
            // InternalCanvas.g:4603:1: ( 'width' )
            // InternalCanvas.g:4604:2: 'width'
            {
             before(grammarAccess.getRectangleAccess().getWidthKeyword_5()); 
            match(input,59,FOLLOW_2); 
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
    // InternalCanvas.g:4613:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4617:1: ( rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 )
            // InternalCanvas.g:4618:2: rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7
            {
            pushFollow(FOLLOW_41);
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
    // InternalCanvas.g:4625:1: rule__Rectangle__Group__6__Impl : ( ( rule__Rectangle__WAssignment_6 ) ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4629:1: ( ( ( rule__Rectangle__WAssignment_6 ) ) )
            // InternalCanvas.g:4630:1: ( ( rule__Rectangle__WAssignment_6 ) )
            {
            // InternalCanvas.g:4630:1: ( ( rule__Rectangle__WAssignment_6 ) )
            // InternalCanvas.g:4631:2: ( rule__Rectangle__WAssignment_6 )
            {
             before(grammarAccess.getRectangleAccess().getWAssignment_6()); 
            // InternalCanvas.g:4632:2: ( rule__Rectangle__WAssignment_6 )
            // InternalCanvas.g:4632:3: rule__Rectangle__WAssignment_6
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
    // InternalCanvas.g:4640:1: rule__Rectangle__Group__7 : rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 ;
    public final void rule__Rectangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4644:1: ( rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 )
            // InternalCanvas.g:4645:2: rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalCanvas.g:4652:1: rule__Rectangle__Group__7__Impl : ( 'height' ) ;
    public final void rule__Rectangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4656:1: ( ( 'height' ) )
            // InternalCanvas.g:4657:1: ( 'height' )
            {
            // InternalCanvas.g:4657:1: ( 'height' )
            // InternalCanvas.g:4658:2: 'height'
            {
             before(grammarAccess.getRectangleAccess().getHeightKeyword_7()); 
            match(input,60,FOLLOW_2); 
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
    // InternalCanvas.g:4667:1: rule__Rectangle__Group__8 : rule__Rectangle__Group__8__Impl ;
    public final void rule__Rectangle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4671:1: ( rule__Rectangle__Group__8__Impl )
            // InternalCanvas.g:4672:2: rule__Rectangle__Group__8__Impl
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
    // InternalCanvas.g:4678:1: rule__Rectangle__Group__8__Impl : ( ( rule__Rectangle__HAssignment_8 ) ) ;
    public final void rule__Rectangle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4682:1: ( ( ( rule__Rectangle__HAssignment_8 ) ) )
            // InternalCanvas.g:4683:1: ( ( rule__Rectangle__HAssignment_8 ) )
            {
            // InternalCanvas.g:4683:1: ( ( rule__Rectangle__HAssignment_8 ) )
            // InternalCanvas.g:4684:2: ( rule__Rectangle__HAssignment_8 )
            {
             before(grammarAccess.getRectangleAccess().getHAssignment_8()); 
            // InternalCanvas.g:4685:2: ( rule__Rectangle__HAssignment_8 )
            // InternalCanvas.g:4685:3: rule__Rectangle__HAssignment_8
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
    // InternalCanvas.g:4694:1: rule__Rectangle__Group_0_0__0 : rule__Rectangle__Group_0_0__0__Impl rule__Rectangle__Group_0_0__1 ;
    public final void rule__Rectangle__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4698:1: ( rule__Rectangle__Group_0_0__0__Impl rule__Rectangle__Group_0_0__1 )
            // InternalCanvas.g:4699:2: rule__Rectangle__Group_0_0__0__Impl rule__Rectangle__Group_0_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCanvas.g:4706:1: rule__Rectangle__Group_0_0__0__Impl : ( 'rectangle' ) ;
    public final void rule__Rectangle__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4710:1: ( ( 'rectangle' ) )
            // InternalCanvas.g:4711:1: ( 'rectangle' )
            {
            // InternalCanvas.g:4711:1: ( 'rectangle' )
            // InternalCanvas.g:4712:2: 'rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_0_0_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalCanvas.g:4721:1: rule__Rectangle__Group_0_0__1 : rule__Rectangle__Group_0_0__1__Impl ;
    public final void rule__Rectangle__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4725:1: ( rule__Rectangle__Group_0_0__1__Impl )
            // InternalCanvas.g:4726:2: rule__Rectangle__Group_0_0__1__Impl
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
    // InternalCanvas.g:4732:1: rule__Rectangle__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Rectangle__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4736:1: ( ( ':' ) )
            // InternalCanvas.g:4737:1: ( ':' )
            {
            // InternalCanvas.g:4737:1: ( ':' )
            // InternalCanvas.g:4738:2: ':'
            {
             before(grammarAccess.getRectangleAccess().getColonKeyword_0_0_1()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__SemanticsAssignment_0"
    // InternalCanvas.g:4748:1: rule__Model__SemanticsAssignment_0 : ( ruleSemanticModel ) ;
    public final void rule__Model__SemanticsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4752:1: ( ( ruleSemanticModel ) )
            // InternalCanvas.g:4753:2: ( ruleSemanticModel )
            {
            // InternalCanvas.g:4753:2: ( ruleSemanticModel )
            // InternalCanvas.g:4754:3: ruleSemanticModel
            {
             before(grammarAccess.getModelAccess().getSemanticsSemanticModelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSemanticModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSemanticsSemanticModelParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SemanticsAssignment_0"


    // $ANTLR start "rule__Model__RepresentsAssignment_2"
    // InternalCanvas.g:4763:1: rule__Model__RepresentsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Model__RepresentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4767:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4768:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4768:2: ( RULE_STRING )
            // InternalCanvas.g:4769:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getRepresentsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRepresentsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RepresentsAssignment_2"


    // $ANTLR start "rule__Model__PropertiesAssignment_3"
    // InternalCanvas.g:4778:1: rule__Model__PropertiesAssignment_3 : ( ruleModelProperties ) ;
    public final void rule__Model__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4782:1: ( ( ruleModelProperties ) )
            // InternalCanvas.g:4783:2: ( ruleModelProperties )
            {
            // InternalCanvas.g:4783:2: ( ruleModelProperties )
            // InternalCanvas.g:4784:3: ruleModelProperties
            {
             before(grammarAccess.getModelAccess().getPropertiesModelPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModelProperties();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPropertiesModelPropertiesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PropertiesAssignment_3"


    // $ANTLR start "rule__Model__ElementsAssignment_4"
    // InternalCanvas.g:4793:1: rule__Model__ElementsAssignment_4 : ( ruleGraphicalElement ) ;
    public final void rule__Model__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4797:1: ( ( ruleGraphicalElement ) )
            // InternalCanvas.g:4798:2: ( ruleGraphicalElement )
            {
            // InternalCanvas.g:4798:2: ( ruleGraphicalElement )
            // InternalCanvas.g:4799:3: ruleGraphicalElement
            {
             before(grammarAccess.getModelAccess().getElementsGraphicalElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphicalElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsGraphicalElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_4"


    // $ANTLR start "rule__SemanticModel__ImportURIAssignment_1"
    // InternalCanvas.g:4808:1: rule__SemanticModel__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SemanticModel__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4812:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4813:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4813:2: ( RULE_STRING )
            // InternalCanvas.g:4814:3: RULE_STRING
            {
             before(grammarAccess.getSemanticModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSemanticModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticModel__ImportURIAssignment_1"


    // $ANTLR start "rule__ModelProperties__PointAssignment_2"
    // InternalCanvas.g:4823:1: rule__ModelProperties__PointAssignment_2 : ( rulePoint ) ;
    public final void rule__ModelProperties__PointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4827:1: ( ( rulePoint ) )
            // InternalCanvas.g:4828:2: ( rulePoint )
            {
            // InternalCanvas.g:4828:2: ( rulePoint )
            // InternalCanvas.g:4829:3: rulePoint
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
    // InternalCanvas.g:4838:1: rule__ModelProperties__ZoomAssignment_4 : ( RULE_INT ) ;
    public final void rule__ModelProperties__ZoomAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4842:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4843:2: ( RULE_INT )
            {
            // InternalCanvas.g:4843:2: ( RULE_INT )
            // InternalCanvas.g:4844:3: RULE_INT
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
    // InternalCanvas.g:4853:1: rule__Shapes__ShapesAssignment_2 : ( ruleShape ) ;
    public final void rule__Shapes__ShapesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4857:1: ( ( ruleShape ) )
            // InternalCanvas.g:4858:2: ( ruleShape )
            {
            // InternalCanvas.g:4858:2: ( ruleShape )
            // InternalCanvas.g:4859:3: ruleShape
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
    // InternalCanvas.g:4868:1: rule__Shape__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Shape__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4872:1: ( ( RULE_ID ) )
            // InternalCanvas.g:4873:2: ( RULE_ID )
            {
            // InternalCanvas.g:4873:2: ( RULE_ID )
            // InternalCanvas.g:4874:3: RULE_ID
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


    // $ANTLR start "rule__Shape__PropsAssignment_3"
    // InternalCanvas.g:4883:1: rule__Shape__PropsAssignment_3 : ( ruleShapeProps ) ;
    public final void rule__Shape__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4887:1: ( ( ruleShapeProps ) )
            // InternalCanvas.g:4888:2: ( ruleShapeProps )
            {
            // InternalCanvas.g:4888:2: ( ruleShapeProps )
            // InternalCanvas.g:4889:3: ruleShapeProps
            {
             before(grammarAccess.getShapeAccess().getPropsShapePropsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeProps();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getPropsShapePropsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__PropsAssignment_3"


    // $ANTLR start "rule__Shape__RectAssignment_4"
    // InternalCanvas.g:4898:1: rule__Shape__RectAssignment_4 : ( ruleRectangle ) ;
    public final void rule__Shape__RectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4902:1: ( ( ruleRectangle ) )
            // InternalCanvas.g:4903:2: ( ruleRectangle )
            {
            // InternalCanvas.g:4903:2: ( ruleRectangle )
            // InternalCanvas.g:4904:3: ruleRectangle
            {
             before(grammarAccess.getShapeAccess().getRectRectangleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRectangle();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getRectRectangleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__RectAssignment_4"


    // $ANTLR start "rule__Shape__TextAssignment_5"
    // InternalCanvas.g:4913:1: rule__Shape__TextAssignment_5 : ( ruleFloatingText ) ;
    public final void rule__Shape__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4917:1: ( ( ruleFloatingText ) )
            // InternalCanvas.g:4918:2: ( ruleFloatingText )
            {
            // InternalCanvas.g:4918:2: ( ruleFloatingText )
            // InternalCanvas.g:4919:3: ruleFloatingText
            {
             before(grammarAccess.getShapeAccess().getTextFloatingTextParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatingText();

            state._fsp--;

             after(grammarAccess.getShapeAccess().getTextFloatingTextParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__TextAssignment_5"


    // $ANTLR start "rule__Shape__RepresentsAssignment_7"
    // InternalCanvas.g:4928:1: rule__Shape__RepresentsAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Shape__RepresentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4932:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4933:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4933:2: ( RULE_STRING )
            // InternalCanvas.g:4934:3: RULE_STRING
            {
             before(grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__RepresentsAssignment_7"


    // $ANTLR start "rule__FloatingTexts__TextsAssignment_2"
    // InternalCanvas.g:4943:1: rule__FloatingTexts__TextsAssignment_2 : ( ruleFloatingText ) ;
    public final void rule__FloatingTexts__TextsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4947:1: ( ( ruleFloatingText ) )
            // InternalCanvas.g:4948:2: ( ruleFloatingText )
            {
            // InternalCanvas.g:4948:2: ( ruleFloatingText )
            // InternalCanvas.g:4949:3: ruleFloatingText
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
    // InternalCanvas.g:4958:1: rule__FloatingText__RectAssignment_2 : ( ruleRectangle ) ;
    public final void rule__FloatingText__RectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4962:1: ( ( ruleRectangle ) )
            // InternalCanvas.g:4963:2: ( ruleRectangle )
            {
            // InternalCanvas.g:4963:2: ( ruleRectangle )
            // InternalCanvas.g:4964:3: ruleRectangle
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
    // InternalCanvas.g:4973:1: rule__FloatingText__EndAssignment_3 : ( ruleEnumEnd ) ;
    public final void rule__FloatingText__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4977:1: ( ( ruleEnumEnd ) )
            // InternalCanvas.g:4978:2: ( ruleEnumEnd )
            {
            // InternalCanvas.g:4978:2: ( ruleEnumEnd )
            // InternalCanvas.g:4979:3: ruleEnumEnd
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


    // $ANTLR start "rule__ShapeProps__ContainerAssignment_2"
    // InternalCanvas.g:4988:1: rule__ShapeProps__ContainerAssignment_2 : ( ruleContainer ) ;
    public final void rule__ShapeProps__ContainerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4992:1: ( ( ruleContainer ) )
            // InternalCanvas.g:4993:2: ( ruleContainer )
            {
            // InternalCanvas.g:4993:2: ( ruleContainer )
            // InternalCanvas.g:4994:3: ruleContainer
            {
             before(grammarAccess.getShapePropsAccess().getContainerContainerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getShapePropsAccess().getContainerContainerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__ContainerAssignment_2"


    // $ANTLR start "rule__ShapeProps__ColorAssignment_3"
    // InternalCanvas.g:5003:1: rule__ShapeProps__ColorAssignment_3 : ( ruleColor ) ;
    public final void rule__ShapeProps__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5007:1: ( ( ruleColor ) )
            // InternalCanvas.g:5008:2: ( ruleColor )
            {
            // InternalCanvas.g:5008:2: ( ruleColor )
            // InternalCanvas.g:5009:3: ruleColor
            {
             before(grammarAccess.getShapePropsAccess().getColorColorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getShapePropsAccess().getColorColorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeProps__ColorAssignment_3"


    // $ANTLR start "rule__Color__RAssignment_1"
    // InternalCanvas.g:5018:1: rule__Color__RAssignment_1 : ( RULE_INT ) ;
    public final void rule__Color__RAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5022:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5023:2: ( RULE_INT )
            {
            // InternalCanvas.g:5023:2: ( RULE_INT )
            // InternalCanvas.g:5024:3: RULE_INT
            {
             before(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__RAssignment_1"


    // $ANTLR start "rule__Color__GAssignment_2"
    // InternalCanvas.g:5033:1: rule__Color__GAssignment_2 : ( RULE_INT ) ;
    public final void rule__Color__GAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5037:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5038:2: ( RULE_INT )
            {
            // InternalCanvas.g:5038:2: ( RULE_INT )
            // InternalCanvas.g:5039:3: RULE_INT
            {
             before(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getGINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__GAssignment_2"


    // $ANTLR start "rule__Color__BAssignment_3"
    // InternalCanvas.g:5048:1: rule__Color__BAssignment_3 : ( RULE_INT ) ;
    public final void rule__Color__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5052:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5053:2: ( RULE_INT )
            {
            // InternalCanvas.g:5053:2: ( RULE_INT )
            // InternalCanvas.g:5054:3: RULE_INT
            {
             before(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getBINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__BAssignment_3"


    // $ANTLR start "rule__Connectors__ConnectorsAssignment_2"
    // InternalCanvas.g:5063:1: rule__Connectors__ConnectorsAssignment_2 : ( ruleConnector ) ;
    public final void rule__Connectors__ConnectorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5067:1: ( ( ruleConnector ) )
            // InternalCanvas.g:5068:2: ( ruleConnector )
            {
            // InternalCanvas.g:5068:2: ( ruleConnector )
            // InternalCanvas.g:5069:3: ruleConnector
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
    // InternalCanvas.g:5078:1: rule__Connector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5082:1: ( ( RULE_ID ) )
            // InternalCanvas.g:5083:2: ( RULE_ID )
            {
            // InternalCanvas.g:5083:2: ( RULE_ID )
            // InternalCanvas.g:5084:3: RULE_ID
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


    // $ANTLR start "rule__Connector__PropsAssignment_2"
    // InternalCanvas.g:5093:1: rule__Connector__PropsAssignment_2 : ( ruleConnectorProps ) ;
    public final void rule__Connector__PropsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5097:1: ( ( ruleConnectorProps ) )
            // InternalCanvas.g:5098:2: ( ruleConnectorProps )
            {
            // InternalCanvas.g:5098:2: ( ruleConnectorProps )
            // InternalCanvas.g:5099:3: ruleConnectorProps
            {
             before(grammarAccess.getConnectorAccess().getPropsConnectorPropsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectorProps();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getPropsConnectorPropsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__PropsAssignment_2"


    // $ANTLR start "rule__Connector__PolylineAssignment_3"
    // InternalCanvas.g:5108:1: rule__Connector__PolylineAssignment_3 : ( rulePolyline ) ;
    public final void rule__Connector__PolylineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5112:1: ( ( rulePolyline ) )
            // InternalCanvas.g:5113:2: ( rulePolyline )
            {
            // InternalCanvas.g:5113:2: ( rulePolyline )
            // InternalCanvas.g:5114:3: rulePolyline
            {
             before(grammarAccess.getConnectorAccess().getPolylinePolylineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePolyline();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getPolylinePolylineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__PolylineAssignment_3"


    // $ANTLR start "rule__Connector__AnchorsAssignment_4"
    // InternalCanvas.g:5123:1: rule__Connector__AnchorsAssignment_4 : ( ruleAnchors ) ;
    public final void rule__Connector__AnchorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5127:1: ( ( ruleAnchors ) )
            // InternalCanvas.g:5128:2: ( ruleAnchors )
            {
            // InternalCanvas.g:5128:2: ( ruleAnchors )
            // InternalCanvas.g:5129:3: ruleAnchors
            {
             before(grammarAccess.getConnectorAccess().getAnchorsAnchorsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAnchors();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getAnchorsAnchorsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__AnchorsAssignment_4"


    // $ANTLR start "rule__Connector__TextsAssignment_5"
    // InternalCanvas.g:5138:1: rule__Connector__TextsAssignment_5 : ( ruleFloatingTexts ) ;
    public final void rule__Connector__TextsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5142:1: ( ( ruleFloatingTexts ) )
            // InternalCanvas.g:5143:2: ( ruleFloatingTexts )
            {
            // InternalCanvas.g:5143:2: ( ruleFloatingTexts )
            // InternalCanvas.g:5144:3: ruleFloatingTexts
            {
             before(grammarAccess.getConnectorAccess().getTextsFloatingTextsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFloatingTexts();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getTextsFloatingTextsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__TextsAssignment_5"


    // $ANTLR start "rule__Connector__RepresentsAssignment_7"
    // InternalCanvas.g:5153:1: rule__Connector__RepresentsAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Connector__RepresentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5157:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:5158:2: ( RULE_STRING )
            {
            // InternalCanvas.g:5158:2: ( RULE_STRING )
            // InternalCanvas.g:5159:3: RULE_STRING
            {
             before(grammarAccess.getConnectorAccess().getRepresentsSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRepresentsSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__RepresentsAssignment_7"


    // $ANTLR start "rule__Anchors__StartAnchorAssignment_1"
    // InternalCanvas.g:5168:1: rule__Anchors__StartAnchorAssignment_1 : ( ruleStartAnchor ) ;
    public final void rule__Anchors__StartAnchorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5172:1: ( ( ruleStartAnchor ) )
            // InternalCanvas.g:5173:2: ( ruleStartAnchor )
            {
            // InternalCanvas.g:5173:2: ( ruleStartAnchor )
            // InternalCanvas.g:5174:3: ruleStartAnchor
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
    // InternalCanvas.g:5183:1: rule__Anchors__EndAnchorAssignment_2 : ( ruleEndAnchor ) ;
    public final void rule__Anchors__EndAnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5187:1: ( ( ruleEndAnchor ) )
            // InternalCanvas.g:5188:2: ( ruleEndAnchor )
            {
            // InternalCanvas.g:5188:2: ( ruleEndAnchor )
            // InternalCanvas.g:5189:3: ruleEndAnchor
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
    // InternalCanvas.g:5198:1: rule__StartAnchor__PointAssignment_1 : ( rulePoint ) ;
    public final void rule__StartAnchor__PointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5202:1: ( ( rulePoint ) )
            // InternalCanvas.g:5203:2: ( rulePoint )
            {
            // InternalCanvas.g:5203:2: ( rulePoint )
            // InternalCanvas.g:5204:3: rulePoint
            {
             before(grammarAccess.getStartAnchorAccess().getPointPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getStartAnchorAccess().getPointPointParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCanvas.g:5213:1: rule__StartAnchor__AnchorAssignment_2 : ( ruleAnchor ) ;
    public final void rule__StartAnchor__AnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5217:1: ( ( ruleAnchor ) )
            // InternalCanvas.g:5218:2: ( ruleAnchor )
            {
            // InternalCanvas.g:5218:2: ( ruleAnchor )
            // InternalCanvas.g:5219:3: ruleAnchor
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
    // InternalCanvas.g:5228:1: rule__EndAnchor__PointAssignment_1 : ( rulePoint ) ;
    public final void rule__EndAnchor__PointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5232:1: ( ( rulePoint ) )
            // InternalCanvas.g:5233:2: ( rulePoint )
            {
            // InternalCanvas.g:5233:2: ( rulePoint )
            // InternalCanvas.g:5234:3: rulePoint
            {
             before(grammarAccess.getEndAnchorAccess().getPointPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getEndAnchorAccess().getPointPointParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCanvas.g:5243:1: rule__EndAnchor__AnchorAssignment_2 : ( ruleAnchor ) ;
    public final void rule__EndAnchor__AnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5247:1: ( ( ruleAnchor ) )
            // InternalCanvas.g:5248:2: ( ruleAnchor )
            {
            // InternalCanvas.g:5248:2: ( ruleAnchor )
            // InternalCanvas.g:5249:3: ruleAnchor
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
    // InternalCanvas.g:5258:1: rule__ShapeAnchorElement__ElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ShapeAnchorElement__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5262:1: ( ( ( RULE_ID ) ) )
            // InternalCanvas.g:5263:2: ( ( RULE_ID ) )
            {
            // InternalCanvas.g:5263:2: ( ( RULE_ID ) )
            // InternalCanvas.g:5264:3: ( RULE_ID )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementShapeCrossReference_1_0()); 
            // InternalCanvas.g:5265:3: ( RULE_ID )
            // InternalCanvas.g:5266:4: RULE_ID
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
    // InternalCanvas.g:5277:1: rule__ConnectorAnchorElement__ElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectorAnchorElement__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5281:1: ( ( ( RULE_ID ) ) )
            // InternalCanvas.g:5282:2: ( ( RULE_ID ) )
            {
            // InternalCanvas.g:5282:2: ( ( RULE_ID ) )
            // InternalCanvas.g:5283:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorCrossReference_1_0()); 
            // InternalCanvas.g:5284:3: ( RULE_ID )
            // InternalCanvas.g:5285:4: RULE_ID
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


    // $ANTLR start "rule__ConnectorProps__ColorAssignment_2"
    // InternalCanvas.g:5296:1: rule__ConnectorProps__ColorAssignment_2 : ( ruleColor ) ;
    public final void rule__ConnectorProps__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5300:1: ( ( ruleColor ) )
            // InternalCanvas.g:5301:2: ( ruleColor )
            {
            // InternalCanvas.g:5301:2: ( ruleColor )
            // InternalCanvas.g:5302:3: ruleColor
            {
             before(grammarAccess.getConnectorPropsAccess().getColorColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getConnectorPropsAccess().getColorColorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectorProps__ColorAssignment_2"


    // $ANTLR start "rule__Polyline__SegmentsAssignment_2"
    // InternalCanvas.g:5311:1: rule__Polyline__SegmentsAssignment_2 : ( ruleSegment ) ;
    public final void rule__Polyline__SegmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5315:1: ( ( ruleSegment ) )
            // InternalCanvas.g:5316:2: ( ruleSegment )
            {
            // InternalCanvas.g:5316:2: ( ruleSegment )
            // InternalCanvas.g:5317:3: ruleSegment
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


    // $ANTLR start "rule__Segment__StartPointAssignment_1"
    // InternalCanvas.g:5326:1: rule__Segment__StartPointAssignment_1 : ( rulePoint ) ;
    public final void rule__Segment__StartPointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5330:1: ( ( rulePoint ) )
            // InternalCanvas.g:5331:2: ( rulePoint )
            {
            // InternalCanvas.g:5331:2: ( rulePoint )
            // InternalCanvas.g:5332:3: rulePoint
            {
             before(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__StartPointAssignment_1"


    // $ANTLR start "rule__Segment__EndPointAssignment_3"
    // InternalCanvas.g:5341:1: rule__Segment__EndPointAssignment_3 : ( rulePoint ) ;
    public final void rule__Segment__EndPointAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5345:1: ( ( rulePoint ) )
            // InternalCanvas.g:5346:2: ( rulePoint )
            {
            // InternalCanvas.g:5346:2: ( rulePoint )
            // InternalCanvas.g:5347:3: rulePoint
            {
             before(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__EndPointAssignment_3"


    // $ANTLR start "rule__Point__XAssignment_1"
    // InternalCanvas.g:5356:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5360:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5361:2: ( RULE_INT )
            {
            // InternalCanvas.g:5361:2: ( RULE_INT )
            // InternalCanvas.g:5362:3: RULE_INT
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
    // InternalCanvas.g:5371:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5375:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5376:2: ( RULE_INT )
            {
            // InternalCanvas.g:5376:2: ( RULE_INT )
            // InternalCanvas.g:5377:3: RULE_INT
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


    // $ANTLR start "rule__Rectangle__XAssignment_2"
    // InternalCanvas.g:5386:1: rule__Rectangle__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Rectangle__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5390:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5391:2: ( RULE_INT )
            {
            // InternalCanvas.g:5391:2: ( RULE_INT )
            // InternalCanvas.g:5392:3: RULE_INT
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
    // InternalCanvas.g:5401:1: rule__Rectangle__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Rectangle__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5405:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5406:2: ( RULE_INT )
            {
            // InternalCanvas.g:5406:2: ( RULE_INT )
            // InternalCanvas.g:5407:3: RULE_INT
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
    // InternalCanvas.g:5416:1: rule__Rectangle__WAssignment_6 : ( RULE_INT ) ;
    public final void rule__Rectangle__WAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5420:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5421:2: ( RULE_INT )
            {
            // InternalCanvas.g:5421:2: ( RULE_INT )
            // InternalCanvas.g:5422:3: RULE_INT
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
    // InternalCanvas.g:5431:1: rule__Rectangle__HAssignment_8 : ( RULE_INT ) ;
    public final void rule__Rectangle__HAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5435:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5436:2: ( RULE_INT )
            {
            // InternalCanvas.g:5436:2: ( RULE_INT )
            // InternalCanvas.g:5437:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00020A0010005000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0002080010004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000008002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x2000021000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000402000020800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000020002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003FC0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002080010004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0048220440011000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0030000300000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000800000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L});

}