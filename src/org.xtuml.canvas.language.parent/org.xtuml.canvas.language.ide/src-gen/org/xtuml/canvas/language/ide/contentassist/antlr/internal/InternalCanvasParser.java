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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'render:'", "'properties:'", "'viewport:'", "'shapes:'", "'shape:'", "'texts:'", "'text:'", "'true'", "'false'", "'connectors:'", "'connector:'", "'anchors:'", "'start:'", "'end'", "'shapeAnchor:'", "'segmentAnchor:'", "'polyline:'", "'segment:'", "'rectangle:'", "'render'", "':'", "'import'", "'zoom'", "'properties'", "'viewport'", "'shapes'", "'shape'", "'texts'", "'text'", "'container'", "'color'", "'connectors'", "'connector'", "'anchors'", "'start'", "'shapeAnchor'", "'segmentAnchor'", "'polyline'", "','", "'segment'", "'x'", "'y'", "'width'", "'height'", "'rectangle'"
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
    public static final int T__13=13;
    public static final int T__14=14;
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


    // $ANTLR start "entryRuleShapeProps"
    // InternalCanvas.g:253:1: entryRuleShapeProps : ruleShapeProps EOF ;
    public final void entryRuleShapeProps() throws RecognitionException {
        try {
            // InternalCanvas.g:254:1: ( ruleShapeProps EOF )
            // InternalCanvas.g:255:1: ruleShapeProps EOF
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
    // InternalCanvas.g:262:1: ruleShapeProps : ( ( rule__ShapeProps__Group__0 ) ) ;
    public final void ruleShapeProps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:266:2: ( ( ( rule__ShapeProps__Group__0 ) ) )
            // InternalCanvas.g:267:2: ( ( rule__ShapeProps__Group__0 ) )
            {
            // InternalCanvas.g:267:2: ( ( rule__ShapeProps__Group__0 ) )
            // InternalCanvas.g:268:3: ( rule__ShapeProps__Group__0 )
            {
             before(grammarAccess.getShapePropsAccess().getGroup()); 
            // InternalCanvas.g:269:3: ( rule__ShapeProps__Group__0 )
            // InternalCanvas.g:269:4: rule__ShapeProps__Group__0
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
    // InternalCanvas.g:278:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalCanvas.g:279:1: ( ruleContainer EOF )
            // InternalCanvas.g:280:1: ruleContainer EOF
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
    // InternalCanvas.g:287:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:291:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalCanvas.g:292:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalCanvas.g:292:2: ( ( rule__Container__Group__0 ) )
            // InternalCanvas.g:293:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalCanvas.g:294:3: ( rule__Container__Group__0 )
            // InternalCanvas.g:294:4: rule__Container__Group__0
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
    // InternalCanvas.g:303:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalCanvas.g:304:1: ( ruleColor EOF )
            // InternalCanvas.g:305:1: ruleColor EOF
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
    // InternalCanvas.g:312:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:316:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalCanvas.g:317:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalCanvas.g:317:2: ( ( rule__Color__Group__0 ) )
            // InternalCanvas.g:318:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalCanvas.g:319:3: ( rule__Color__Group__0 )
            // InternalCanvas.g:319:4: rule__Color__Group__0
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
    // InternalCanvas.g:328:1: entryRuleConnectors : ruleConnectors EOF ;
    public final void entryRuleConnectors() throws RecognitionException {
        try {
            // InternalCanvas.g:329:1: ( ruleConnectors EOF )
            // InternalCanvas.g:330:1: ruleConnectors EOF
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
    // InternalCanvas.g:337:1: ruleConnectors : ( ( rule__Connectors__Group__0 ) ) ;
    public final void ruleConnectors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:341:2: ( ( ( rule__Connectors__Group__0 ) ) )
            // InternalCanvas.g:342:2: ( ( rule__Connectors__Group__0 ) )
            {
            // InternalCanvas.g:342:2: ( ( rule__Connectors__Group__0 ) )
            // InternalCanvas.g:343:3: ( rule__Connectors__Group__0 )
            {
             before(grammarAccess.getConnectorsAccess().getGroup()); 
            // InternalCanvas.g:344:3: ( rule__Connectors__Group__0 )
            // InternalCanvas.g:344:4: rule__Connectors__Group__0
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
    // InternalCanvas.g:353:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalCanvas.g:354:1: ( ruleConnector EOF )
            // InternalCanvas.g:355:1: ruleConnector EOF
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
    // InternalCanvas.g:362:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:366:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalCanvas.g:367:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalCanvas.g:367:2: ( ( rule__Connector__Group__0 ) )
            // InternalCanvas.g:368:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalCanvas.g:369:3: ( rule__Connector__Group__0 )
            // InternalCanvas.g:369:4: rule__Connector__Group__0
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
    // InternalCanvas.g:378:1: entryRuleAnchors : ruleAnchors EOF ;
    public final void entryRuleAnchors() throws RecognitionException {
        try {
            // InternalCanvas.g:379:1: ( ruleAnchors EOF )
            // InternalCanvas.g:380:1: ruleAnchors EOF
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
    // InternalCanvas.g:387:1: ruleAnchors : ( ( rule__Anchors__Group__0 ) ) ;
    public final void ruleAnchors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:391:2: ( ( ( rule__Anchors__Group__0 ) ) )
            // InternalCanvas.g:392:2: ( ( rule__Anchors__Group__0 ) )
            {
            // InternalCanvas.g:392:2: ( ( rule__Anchors__Group__0 ) )
            // InternalCanvas.g:393:3: ( rule__Anchors__Group__0 )
            {
             before(grammarAccess.getAnchorsAccess().getGroup()); 
            // InternalCanvas.g:394:3: ( rule__Anchors__Group__0 )
            // InternalCanvas.g:394:4: rule__Anchors__Group__0
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
    // InternalCanvas.g:403:1: entryRuleStartAnchor : ruleStartAnchor EOF ;
    public final void entryRuleStartAnchor() throws RecognitionException {
        try {
            // InternalCanvas.g:404:1: ( ruleStartAnchor EOF )
            // InternalCanvas.g:405:1: ruleStartAnchor EOF
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
    // InternalCanvas.g:412:1: ruleStartAnchor : ( ( rule__StartAnchor__Group__0 ) ) ;
    public final void ruleStartAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:416:2: ( ( ( rule__StartAnchor__Group__0 ) ) )
            // InternalCanvas.g:417:2: ( ( rule__StartAnchor__Group__0 ) )
            {
            // InternalCanvas.g:417:2: ( ( rule__StartAnchor__Group__0 ) )
            // InternalCanvas.g:418:3: ( rule__StartAnchor__Group__0 )
            {
             before(grammarAccess.getStartAnchorAccess().getGroup()); 
            // InternalCanvas.g:419:3: ( rule__StartAnchor__Group__0 )
            // InternalCanvas.g:419:4: rule__StartAnchor__Group__0
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
    // InternalCanvas.g:428:1: entryRuleEndAnchor : ruleEndAnchor EOF ;
    public final void entryRuleEndAnchor() throws RecognitionException {
        try {
            // InternalCanvas.g:429:1: ( ruleEndAnchor EOF )
            // InternalCanvas.g:430:1: ruleEndAnchor EOF
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
    // InternalCanvas.g:437:1: ruleEndAnchor : ( ( rule__EndAnchor__Group__0 ) ) ;
    public final void ruleEndAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:441:2: ( ( ( rule__EndAnchor__Group__0 ) ) )
            // InternalCanvas.g:442:2: ( ( rule__EndAnchor__Group__0 ) )
            {
            // InternalCanvas.g:442:2: ( ( rule__EndAnchor__Group__0 ) )
            // InternalCanvas.g:443:3: ( rule__EndAnchor__Group__0 )
            {
             before(grammarAccess.getEndAnchorAccess().getGroup()); 
            // InternalCanvas.g:444:3: ( rule__EndAnchor__Group__0 )
            // InternalCanvas.g:444:4: rule__EndAnchor__Group__0
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
    // InternalCanvas.g:453:1: entryRuleAnchor : ruleAnchor EOF ;
    public final void entryRuleAnchor() throws RecognitionException {
        try {
            // InternalCanvas.g:454:1: ( ruleAnchor EOF )
            // InternalCanvas.g:455:1: ruleAnchor EOF
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
    // InternalCanvas.g:462:1: ruleAnchor : ( ( rule__Anchor__Alternatives ) ) ;
    public final void ruleAnchor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:466:2: ( ( ( rule__Anchor__Alternatives ) ) )
            // InternalCanvas.g:467:2: ( ( rule__Anchor__Alternatives ) )
            {
            // InternalCanvas.g:467:2: ( ( rule__Anchor__Alternatives ) )
            // InternalCanvas.g:468:3: ( rule__Anchor__Alternatives )
            {
             before(grammarAccess.getAnchorAccess().getAlternatives()); 
            // InternalCanvas.g:469:3: ( rule__Anchor__Alternatives )
            // InternalCanvas.g:469:4: rule__Anchor__Alternatives
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
    // InternalCanvas.g:478:1: entryRuleShapeAnchorElement : ruleShapeAnchorElement EOF ;
    public final void entryRuleShapeAnchorElement() throws RecognitionException {
        try {
            // InternalCanvas.g:479:1: ( ruleShapeAnchorElement EOF )
            // InternalCanvas.g:480:1: ruleShapeAnchorElement EOF
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
    // InternalCanvas.g:487:1: ruleShapeAnchorElement : ( ( rule__ShapeAnchorElement__Group__0 ) ) ;
    public final void ruleShapeAnchorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:491:2: ( ( ( rule__ShapeAnchorElement__Group__0 ) ) )
            // InternalCanvas.g:492:2: ( ( rule__ShapeAnchorElement__Group__0 ) )
            {
            // InternalCanvas.g:492:2: ( ( rule__ShapeAnchorElement__Group__0 ) )
            // InternalCanvas.g:493:3: ( rule__ShapeAnchorElement__Group__0 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getGroup()); 
            // InternalCanvas.g:494:3: ( rule__ShapeAnchorElement__Group__0 )
            // InternalCanvas.g:494:4: rule__ShapeAnchorElement__Group__0
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
    // InternalCanvas.g:503:1: entryRuleConnectorAnchorElement : ruleConnectorAnchorElement EOF ;
    public final void entryRuleConnectorAnchorElement() throws RecognitionException {
        try {
            // InternalCanvas.g:504:1: ( ruleConnectorAnchorElement EOF )
            // InternalCanvas.g:505:1: ruleConnectorAnchorElement EOF
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
    // InternalCanvas.g:512:1: ruleConnectorAnchorElement : ( ( rule__ConnectorAnchorElement__Group__0 ) ) ;
    public final void ruleConnectorAnchorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:516:2: ( ( ( rule__ConnectorAnchorElement__Group__0 ) ) )
            // InternalCanvas.g:517:2: ( ( rule__ConnectorAnchorElement__Group__0 ) )
            {
            // InternalCanvas.g:517:2: ( ( rule__ConnectorAnchorElement__Group__0 ) )
            // InternalCanvas.g:518:3: ( rule__ConnectorAnchorElement__Group__0 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getGroup()); 
            // InternalCanvas.g:519:3: ( rule__ConnectorAnchorElement__Group__0 )
            // InternalCanvas.g:519:4: rule__ConnectorAnchorElement__Group__0
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
    // InternalCanvas.g:528:1: entryRuleConnectorProps : ruleConnectorProps EOF ;
    public final void entryRuleConnectorProps() throws RecognitionException {
        try {
            // InternalCanvas.g:529:1: ( ruleConnectorProps EOF )
            // InternalCanvas.g:530:1: ruleConnectorProps EOF
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
    // InternalCanvas.g:537:1: ruleConnectorProps : ( ( rule__ConnectorProps__Group__0 ) ) ;
    public final void ruleConnectorProps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:541:2: ( ( ( rule__ConnectorProps__Group__0 ) ) )
            // InternalCanvas.g:542:2: ( ( rule__ConnectorProps__Group__0 ) )
            {
            // InternalCanvas.g:542:2: ( ( rule__ConnectorProps__Group__0 ) )
            // InternalCanvas.g:543:3: ( rule__ConnectorProps__Group__0 )
            {
             before(grammarAccess.getConnectorPropsAccess().getGroup()); 
            // InternalCanvas.g:544:3: ( rule__ConnectorProps__Group__0 )
            // InternalCanvas.g:544:4: rule__ConnectorProps__Group__0
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
    // InternalCanvas.g:553:1: entryRulePolyline : rulePolyline EOF ;
    public final void entryRulePolyline() throws RecognitionException {
        try {
            // InternalCanvas.g:554:1: ( rulePolyline EOF )
            // InternalCanvas.g:555:1: rulePolyline EOF
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
    // InternalCanvas.g:562:1: rulePolyline : ( ( rule__Polyline__Group__0 ) ) ;
    public final void rulePolyline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:566:2: ( ( ( rule__Polyline__Group__0 ) ) )
            // InternalCanvas.g:567:2: ( ( rule__Polyline__Group__0 ) )
            {
            // InternalCanvas.g:567:2: ( ( rule__Polyline__Group__0 ) )
            // InternalCanvas.g:568:3: ( rule__Polyline__Group__0 )
            {
             before(grammarAccess.getPolylineAccess().getGroup()); 
            // InternalCanvas.g:569:3: ( rule__Polyline__Group__0 )
            // InternalCanvas.g:569:4: rule__Polyline__Group__0
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
    // InternalCanvas.g:578:1: entryRuleSegment : ruleSegment EOF ;
    public final void entryRuleSegment() throws RecognitionException {
        try {
            // InternalCanvas.g:579:1: ( ruleSegment EOF )
            // InternalCanvas.g:580:1: ruleSegment EOF
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
    // InternalCanvas.g:587:1: ruleSegment : ( ( rule__Segment__Group__0 ) ) ;
    public final void ruleSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:591:2: ( ( ( rule__Segment__Group__0 ) ) )
            // InternalCanvas.g:592:2: ( ( rule__Segment__Group__0 ) )
            {
            // InternalCanvas.g:592:2: ( ( rule__Segment__Group__0 ) )
            // InternalCanvas.g:593:3: ( rule__Segment__Group__0 )
            {
             before(grammarAccess.getSegmentAccess().getGroup()); 
            // InternalCanvas.g:594:3: ( rule__Segment__Group__0 )
            // InternalCanvas.g:594:4: rule__Segment__Group__0
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
    // InternalCanvas.g:603:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalCanvas.g:604:1: ( rulePoint EOF )
            // InternalCanvas.g:605:1: rulePoint EOF
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
    // InternalCanvas.g:612:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:616:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalCanvas.g:617:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalCanvas.g:617:2: ( ( rule__Point__Group__0 ) )
            // InternalCanvas.g:618:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalCanvas.g:619:3: ( rule__Point__Group__0 )
            // InternalCanvas.g:619:4: rule__Point__Group__0
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
    // InternalCanvas.g:628:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalCanvas.g:629:1: ( ruleRectangle EOF )
            // InternalCanvas.g:630:1: ruleRectangle EOF
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
    // InternalCanvas.g:637:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:641:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalCanvas.g:642:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalCanvas.g:642:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalCanvas.g:643:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalCanvas.g:644:3: ( rule__Rectangle__Group__0 )
            // InternalCanvas.g:644:4: rule__Rectangle__Group__0
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
    // InternalCanvas.g:652:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__Group_1_0__0 ) ) | ( 'render:' ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:656:1: ( ( ( rule__Model__Group_1_0__0 ) ) | ( 'render:' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
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
                    // InternalCanvas.g:657:2: ( ( rule__Model__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:657:2: ( ( rule__Model__Group_1_0__0 ) )
                    // InternalCanvas.g:658:3: ( rule__Model__Group_1_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_1_0()); 
                    // InternalCanvas.g:659:3: ( rule__Model__Group_1_0__0 )
                    // InternalCanvas.g:659:4: rule__Model__Group_1_0__0
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
                    // InternalCanvas.g:663:2: ( 'render:' )
                    {
                    // InternalCanvas.g:663:2: ( 'render:' )
                    // InternalCanvas.g:664:3: 'render:'
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
    // InternalCanvas.g:673:1: rule__ModelProperties__Alternatives_0 : ( ( ( rule__ModelProperties__Group_0_0__0 ) ) | ( 'properties:' ) );
    public final void rule__ModelProperties__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:677:1: ( ( ( rule__ModelProperties__Group_0_0__0 ) ) | ( 'properties:' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
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
                    // InternalCanvas.g:678:2: ( ( rule__ModelProperties__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:678:2: ( ( rule__ModelProperties__Group_0_0__0 ) )
                    // InternalCanvas.g:679:3: ( rule__ModelProperties__Group_0_0__0 )
                    {
                     before(grammarAccess.getModelPropertiesAccess().getGroup_0_0()); 
                    // InternalCanvas.g:680:3: ( rule__ModelProperties__Group_0_0__0 )
                    // InternalCanvas.g:680:4: rule__ModelProperties__Group_0_0__0
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
                    // InternalCanvas.g:684:2: ( 'properties:' )
                    {
                    // InternalCanvas.g:684:2: ( 'properties:' )
                    // InternalCanvas.g:685:3: 'properties:'
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
    // InternalCanvas.g:694:1: rule__ModelProperties__Alternatives_1 : ( ( ( rule__ModelProperties__Group_1_0__0 ) ) | ( 'viewport:' ) );
    public final void rule__ModelProperties__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:698:1: ( ( ( rule__ModelProperties__Group_1_0__0 ) ) | ( 'viewport:' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
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
                    // InternalCanvas.g:699:2: ( ( rule__ModelProperties__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:699:2: ( ( rule__ModelProperties__Group_1_0__0 ) )
                    // InternalCanvas.g:700:3: ( rule__ModelProperties__Group_1_0__0 )
                    {
                     before(grammarAccess.getModelPropertiesAccess().getGroup_1_0()); 
                    // InternalCanvas.g:701:3: ( rule__ModelProperties__Group_1_0__0 )
                    // InternalCanvas.g:701:4: rule__ModelProperties__Group_1_0__0
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
                    // InternalCanvas.g:705:2: ( 'viewport:' )
                    {
                    // InternalCanvas.g:705:2: ( 'viewport:' )
                    // InternalCanvas.g:706:3: 'viewport:'
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
    // InternalCanvas.g:715:1: rule__GraphicalElement__Alternatives : ( ( ruleShapes ) | ( ruleFloatingTexts ) | ( ruleConnectors ) );
    public final void rule__GraphicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:719:1: ( ( ruleShapes ) | ( ruleFloatingTexts ) | ( ruleConnectors ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
            case 36:
                {
                alt4=1;
                }
                break;
            case 16:
            case 38:
                {
                alt4=2;
                }
                break;
            case 20:
            case 42:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCanvas.g:720:2: ( ruleShapes )
                    {
                    // InternalCanvas.g:720:2: ( ruleShapes )
                    // InternalCanvas.g:721:3: ruleShapes
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
                    // InternalCanvas.g:726:2: ( ruleFloatingTexts )
                    {
                    // InternalCanvas.g:726:2: ( ruleFloatingTexts )
                    // InternalCanvas.g:727:3: ruleFloatingTexts
                    {
                     before(grammarAccess.getGraphicalElementAccess().getFloatingTextsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatingTexts();

                    state._fsp--;

                     after(grammarAccess.getGraphicalElementAccess().getFloatingTextsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCanvas.g:732:2: ( ruleConnectors )
                    {
                    // InternalCanvas.g:732:2: ( ruleConnectors )
                    // InternalCanvas.g:733:3: ruleConnectors
                    {
                     before(grammarAccess.getGraphicalElementAccess().getConnectorsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConnectors();

                    state._fsp--;

                     after(grammarAccess.getGraphicalElementAccess().getConnectorsParserRuleCall_2()); 

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
    // InternalCanvas.g:742:1: rule__Shapes__Alternatives_1 : ( ( ( rule__Shapes__Group_1_0__0 ) ) | ( 'shapes:' ) );
    public final void rule__Shapes__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:746:1: ( ( ( rule__Shapes__Group_1_0__0 ) ) | ( 'shapes:' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
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
                    // InternalCanvas.g:747:2: ( ( rule__Shapes__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:747:2: ( ( rule__Shapes__Group_1_0__0 ) )
                    // InternalCanvas.g:748:3: ( rule__Shapes__Group_1_0__0 )
                    {
                     before(grammarAccess.getShapesAccess().getGroup_1_0()); 
                    // InternalCanvas.g:749:3: ( rule__Shapes__Group_1_0__0 )
                    // InternalCanvas.g:749:4: rule__Shapes__Group_1_0__0
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
                    // InternalCanvas.g:753:2: ( 'shapes:' )
                    {
                    // InternalCanvas.g:753:2: ( 'shapes:' )
                    // InternalCanvas.g:754:3: 'shapes:'
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
    // InternalCanvas.g:763:1: rule__Shape__Alternatives_1 : ( ( ( rule__Shape__Group_1_0__0 ) ) | ( 'shape:' ) );
    public final void rule__Shape__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:767:1: ( ( ( rule__Shape__Group_1_0__0 ) ) | ( 'shape:' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
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
                    // InternalCanvas.g:768:2: ( ( rule__Shape__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:768:2: ( ( rule__Shape__Group_1_0__0 ) )
                    // InternalCanvas.g:769:3: ( rule__Shape__Group_1_0__0 )
                    {
                     before(grammarAccess.getShapeAccess().getGroup_1_0()); 
                    // InternalCanvas.g:770:3: ( rule__Shape__Group_1_0__0 )
                    // InternalCanvas.g:770:4: rule__Shape__Group_1_0__0
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
                    // InternalCanvas.g:774:2: ( 'shape:' )
                    {
                    // InternalCanvas.g:774:2: ( 'shape:' )
                    // InternalCanvas.g:775:3: 'shape:'
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


    // $ANTLR start "rule__Shape__Alternatives_5"
    // InternalCanvas.g:784:1: rule__Shape__Alternatives_5 : ( ( ( rule__Shape__Group_5_0__0 ) ) | ( 'render:' ) );
    public final void rule__Shape__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:788:1: ( ( ( rule__Shape__Group_5_0__0 ) ) | ( 'render:' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
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
                    // InternalCanvas.g:789:2: ( ( rule__Shape__Group_5_0__0 ) )
                    {
                    // InternalCanvas.g:789:2: ( ( rule__Shape__Group_5_0__0 ) )
                    // InternalCanvas.g:790:3: ( rule__Shape__Group_5_0__0 )
                    {
                     before(grammarAccess.getShapeAccess().getGroup_5_0()); 
                    // InternalCanvas.g:791:3: ( rule__Shape__Group_5_0__0 )
                    // InternalCanvas.g:791:4: rule__Shape__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shape__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getShapeAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:795:2: ( 'render:' )
                    {
                    // InternalCanvas.g:795:2: ( 'render:' )
                    // InternalCanvas.g:796:3: 'render:'
                    {
                     before(grammarAccess.getShapeAccess().getRenderKeyword_5_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getShapeAccess().getRenderKeyword_5_1()); 

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
    // $ANTLR end "rule__Shape__Alternatives_5"


    // $ANTLR start "rule__FloatingTexts__Alternatives_1"
    // InternalCanvas.g:805:1: rule__FloatingTexts__Alternatives_1 : ( ( ( rule__FloatingTexts__Group_1_0__0 ) ) | ( 'texts:' ) );
    public final void rule__FloatingTexts__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:809:1: ( ( ( rule__FloatingTexts__Group_1_0__0 ) ) | ( 'texts:' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
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
                    // InternalCanvas.g:810:2: ( ( rule__FloatingTexts__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:810:2: ( ( rule__FloatingTexts__Group_1_0__0 ) )
                    // InternalCanvas.g:811:3: ( rule__FloatingTexts__Group_1_0__0 )
                    {
                     before(grammarAccess.getFloatingTextsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:812:3: ( rule__FloatingTexts__Group_1_0__0 )
                    // InternalCanvas.g:812:4: rule__FloatingTexts__Group_1_0__0
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
                    // InternalCanvas.g:816:2: ( 'texts:' )
                    {
                    // InternalCanvas.g:816:2: ( 'texts:' )
                    // InternalCanvas.g:817:3: 'texts:'
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
    // InternalCanvas.g:826:1: rule__FloatingText__Alternatives_1 : ( ( ( rule__FloatingText__Group_1_0__0 ) ) | ( 'text:' ) );
    public final void rule__FloatingText__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:830:1: ( ( ( rule__FloatingText__Group_1_0__0 ) ) | ( 'text:' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
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
                    // InternalCanvas.g:831:2: ( ( rule__FloatingText__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:831:2: ( ( rule__FloatingText__Group_1_0__0 ) )
                    // InternalCanvas.g:832:3: ( rule__FloatingText__Group_1_0__0 )
                    {
                     before(grammarAccess.getFloatingTextAccess().getGroup_1_0()); 
                    // InternalCanvas.g:833:3: ( rule__FloatingText__Group_1_0__0 )
                    // InternalCanvas.g:833:4: rule__FloatingText__Group_1_0__0
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
                    // InternalCanvas.g:837:2: ( 'text:' )
                    {
                    // InternalCanvas.g:837:2: ( 'text:' )
                    // InternalCanvas.g:838:3: 'text:'
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


    // $ANTLR start "rule__FloatingText__AssociatedAlternatives_3_0"
    // InternalCanvas.g:847:1: rule__FloatingText__AssociatedAlternatives_3_0 : ( ( ruleShape ) | ( ruleConnector ) );
    public final void rule__FloatingText__AssociatedAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:851:1: ( ( ruleShape ) | ( ruleConnector ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15||LA10_0==37) ) {
                alt10=1;
            }
            else if ( (LA10_0==21||LA10_0==43) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCanvas.g:852:2: ( ruleShape )
                    {
                    // InternalCanvas.g:852:2: ( ruleShape )
                    // InternalCanvas.g:853:3: ruleShape
                    {
                     before(grammarAccess.getFloatingTextAccess().getAssociatedShapeParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleShape();

                    state._fsp--;

                     after(grammarAccess.getFloatingTextAccess().getAssociatedShapeParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:858:2: ( ruleConnector )
                    {
                    // InternalCanvas.g:858:2: ( ruleConnector )
                    // InternalCanvas.g:859:3: ruleConnector
                    {
                     before(grammarAccess.getFloatingTextAccess().getAssociatedConnectorParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConnector();

                    state._fsp--;

                     after(grammarAccess.getFloatingTextAccess().getAssociatedConnectorParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__FloatingText__AssociatedAlternatives_3_0"


    // $ANTLR start "rule__ShapeProps__Alternatives_1"
    // InternalCanvas.g:868:1: rule__ShapeProps__Alternatives_1 : ( ( ( rule__ShapeProps__Group_1_0__0 ) ) | ( 'properties:' ) );
    public final void rule__ShapeProps__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:872:1: ( ( ( rule__ShapeProps__Group_1_0__0 ) ) | ( 'properties:' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
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
                    // InternalCanvas.g:873:2: ( ( rule__ShapeProps__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:873:2: ( ( rule__ShapeProps__Group_1_0__0 ) )
                    // InternalCanvas.g:874:3: ( rule__ShapeProps__Group_1_0__0 )
                    {
                     before(grammarAccess.getShapePropsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:875:3: ( rule__ShapeProps__Group_1_0__0 )
                    // InternalCanvas.g:875:4: rule__ShapeProps__Group_1_0__0
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
                    // InternalCanvas.g:879:2: ( 'properties:' )
                    {
                    // InternalCanvas.g:879:2: ( 'properties:' )
                    // InternalCanvas.g:880:3: 'properties:'
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
    // InternalCanvas.g:889:1: rule__Container__Alternatives_2 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Container__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:893:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCanvas.g:894:2: ( 'true' )
                    {
                    // InternalCanvas.g:894:2: ( 'true' )
                    // InternalCanvas.g:895:3: 'true'
                    {
                     before(grammarAccess.getContainerAccess().getTrueKeyword_2_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getContainerAccess().getTrueKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:900:2: ( 'false' )
                    {
                    // InternalCanvas.g:900:2: ( 'false' )
                    // InternalCanvas.g:901:3: 'false'
                    {
                     before(grammarAccess.getContainerAccess().getFalseKeyword_2_1()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalCanvas.g:910:1: rule__Connectors__Alternatives_1 : ( ( ( rule__Connectors__Group_1_0__0 ) ) | ( 'connectors:' ) );
    public final void rule__Connectors__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:914:1: ( ( ( rule__Connectors__Group_1_0__0 ) ) | ( 'connectors:' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCanvas.g:915:2: ( ( rule__Connectors__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:915:2: ( ( rule__Connectors__Group_1_0__0 ) )
                    // InternalCanvas.g:916:3: ( rule__Connectors__Group_1_0__0 )
                    {
                     before(grammarAccess.getConnectorsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:917:3: ( rule__Connectors__Group_1_0__0 )
                    // InternalCanvas.g:917:4: rule__Connectors__Group_1_0__0
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
                    // InternalCanvas.g:921:2: ( 'connectors:' )
                    {
                    // InternalCanvas.g:921:2: ( 'connectors:' )
                    // InternalCanvas.g:922:3: 'connectors:'
                    {
                     before(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalCanvas.g:931:1: rule__Connector__Alternatives_0 : ( ( ( rule__Connector__Group_0_0__0 ) ) | ( 'connector:' ) );
    public final void rule__Connector__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:935:1: ( ( ( rule__Connector__Group_0_0__0 ) ) | ( 'connector:' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            else if ( (LA14_0==21) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCanvas.g:936:2: ( ( rule__Connector__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:936:2: ( ( rule__Connector__Group_0_0__0 ) )
                    // InternalCanvas.g:937:3: ( rule__Connector__Group_0_0__0 )
                    {
                     before(grammarAccess.getConnectorAccess().getGroup_0_0()); 
                    // InternalCanvas.g:938:3: ( rule__Connector__Group_0_0__0 )
                    // InternalCanvas.g:938:4: rule__Connector__Group_0_0__0
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
                    // InternalCanvas.g:942:2: ( 'connector:' )
                    {
                    // InternalCanvas.g:942:2: ( 'connector:' )
                    // InternalCanvas.g:943:3: 'connector:'
                    {
                     before(grammarAccess.getConnectorAccess().getConnectorKeyword_0_1()); 
                    match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__Connector__Alternatives_5"
    // InternalCanvas.g:952:1: rule__Connector__Alternatives_5 : ( ( ( rule__Connector__Group_5_0__0 ) ) | ( 'render:' ) );
    public final void rule__Connector__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:956:1: ( ( ( rule__Connector__Group_5_0__0 ) ) | ( 'render:' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
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
                    // InternalCanvas.g:957:2: ( ( rule__Connector__Group_5_0__0 ) )
                    {
                    // InternalCanvas.g:957:2: ( ( rule__Connector__Group_5_0__0 ) )
                    // InternalCanvas.g:958:3: ( rule__Connector__Group_5_0__0 )
                    {
                     before(grammarAccess.getConnectorAccess().getGroup_5_0()); 
                    // InternalCanvas.g:959:3: ( rule__Connector__Group_5_0__0 )
                    // InternalCanvas.g:959:4: rule__Connector__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connector__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectorAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCanvas.g:963:2: ( 'render:' )
                    {
                    // InternalCanvas.g:963:2: ( 'render:' )
                    // InternalCanvas.g:964:3: 'render:'
                    {
                     before(grammarAccess.getConnectorAccess().getRenderKeyword_5_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getRenderKeyword_5_1()); 

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
    // $ANTLR end "rule__Connector__Alternatives_5"


    // $ANTLR start "rule__Anchors__Alternatives_0"
    // InternalCanvas.g:973:1: rule__Anchors__Alternatives_0 : ( ( ( rule__Anchors__Group_0_0__0 ) ) | ( 'anchors:' ) );
    public final void rule__Anchors__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:977:1: ( ( ( rule__Anchors__Group_0_0__0 ) ) | ( 'anchors:' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            else if ( (LA16_0==22) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCanvas.g:978:2: ( ( rule__Anchors__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:978:2: ( ( rule__Anchors__Group_0_0__0 ) )
                    // InternalCanvas.g:979:3: ( rule__Anchors__Group_0_0__0 )
                    {
                     before(grammarAccess.getAnchorsAccess().getGroup_0_0()); 
                    // InternalCanvas.g:980:3: ( rule__Anchors__Group_0_0__0 )
                    // InternalCanvas.g:980:4: rule__Anchors__Group_0_0__0
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
                    // InternalCanvas.g:984:2: ( 'anchors:' )
                    {
                    // InternalCanvas.g:984:2: ( 'anchors:' )
                    // InternalCanvas.g:985:3: 'anchors:'
                    {
                     before(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalCanvas.g:994:1: rule__StartAnchor__Alternatives_0 : ( ( ( rule__StartAnchor__Group_0_0__0 ) ) | ( 'start:' ) );
    public final void rule__StartAnchor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:998:1: ( ( ( rule__StartAnchor__Group_0_0__0 ) ) | ( 'start:' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            else if ( (LA17_0==23) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCanvas.g:999:2: ( ( rule__StartAnchor__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:999:2: ( ( rule__StartAnchor__Group_0_0__0 ) )
                    // InternalCanvas.g:1000:3: ( rule__StartAnchor__Group_0_0__0 )
                    {
                     before(grammarAccess.getStartAnchorAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1001:3: ( rule__StartAnchor__Group_0_0__0 )
                    // InternalCanvas.g:1001:4: rule__StartAnchor__Group_0_0__0
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
                    // InternalCanvas.g:1005:2: ( 'start:' )
                    {
                    // InternalCanvas.g:1005:2: ( 'start:' )
                    // InternalCanvas.g:1006:3: 'start:'
                    {
                     before(grammarAccess.getStartAnchorAccess().getStartKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalCanvas.g:1015:1: rule__EndAnchor__Alternatives_0 : ( ( ( rule__EndAnchor__Group_0_0__0 ) ) | ( 'end' ) );
    public final void rule__EndAnchor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1019:1: ( ( ( rule__EndAnchor__Group_0_0__0 ) ) | ( 'end' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==31) ) {
                    alt18=1;
                }
                else if ( (LA18_1==51) ) {
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
                    // InternalCanvas.g:1020:2: ( ( rule__EndAnchor__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1020:2: ( ( rule__EndAnchor__Group_0_0__0 ) )
                    // InternalCanvas.g:1021:3: ( rule__EndAnchor__Group_0_0__0 )
                    {
                     before(grammarAccess.getEndAnchorAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1022:3: ( rule__EndAnchor__Group_0_0__0 )
                    // InternalCanvas.g:1022:4: rule__EndAnchor__Group_0_0__0
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
                    // InternalCanvas.g:1026:2: ( 'end' )
                    {
                    // InternalCanvas.g:1026:2: ( 'end' )
                    // InternalCanvas.g:1027:3: 'end'
                    {
                     before(grammarAccess.getEndAnchorAccess().getEndKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
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
    // InternalCanvas.g:1036:1: rule__Anchor__Alternatives : ( ( ruleShapeAnchorElement ) | ( ruleConnectorAnchorElement ) );
    public final void rule__Anchor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1040:1: ( ( ruleShapeAnchorElement ) | ( ruleConnectorAnchorElement ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25||LA19_0==46) ) {
                alt19=1;
            }
            else if ( (LA19_0==26||LA19_0==47) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCanvas.g:1041:2: ( ruleShapeAnchorElement )
                    {
                    // InternalCanvas.g:1041:2: ( ruleShapeAnchorElement )
                    // InternalCanvas.g:1042:3: ruleShapeAnchorElement
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
                    // InternalCanvas.g:1047:2: ( ruleConnectorAnchorElement )
                    {
                    // InternalCanvas.g:1047:2: ( ruleConnectorAnchorElement )
                    // InternalCanvas.g:1048:3: ruleConnectorAnchorElement
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
    // InternalCanvas.g:1057:1: rule__ShapeAnchorElement__Alternatives_0 : ( ( ( rule__ShapeAnchorElement__Group_0_0__0 ) ) | ( 'shapeAnchor:' ) );
    public final void rule__ShapeAnchorElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1061:1: ( ( ( rule__ShapeAnchorElement__Group_0_0__0 ) ) | ( 'shapeAnchor:' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            else if ( (LA20_0==25) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCanvas.g:1062:2: ( ( rule__ShapeAnchorElement__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1062:2: ( ( rule__ShapeAnchorElement__Group_0_0__0 ) )
                    // InternalCanvas.g:1063:3: ( rule__ShapeAnchorElement__Group_0_0__0 )
                    {
                     before(grammarAccess.getShapeAnchorElementAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1064:3: ( rule__ShapeAnchorElement__Group_0_0__0 )
                    // InternalCanvas.g:1064:4: rule__ShapeAnchorElement__Group_0_0__0
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
                    // InternalCanvas.g:1068:2: ( 'shapeAnchor:' )
                    {
                    // InternalCanvas.g:1068:2: ( 'shapeAnchor:' )
                    // InternalCanvas.g:1069:3: 'shapeAnchor:'
                    {
                     before(grammarAccess.getShapeAnchorElementAccess().getShapeAnchorKeyword_0_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalCanvas.g:1078:1: rule__ConnectorAnchorElement__Alternatives_0 : ( ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) ) | ( 'segmentAnchor:' ) );
    public final void rule__ConnectorAnchorElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1082:1: ( ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) ) | ( 'segmentAnchor:' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalCanvas.g:1083:2: ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1083:2: ( ( rule__ConnectorAnchorElement__Group_0_0__0 ) )
                    // InternalCanvas.g:1084:3: ( rule__ConnectorAnchorElement__Group_0_0__0 )
                    {
                     before(grammarAccess.getConnectorAnchorElementAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1085:3: ( rule__ConnectorAnchorElement__Group_0_0__0 )
                    // InternalCanvas.g:1085:4: rule__ConnectorAnchorElement__Group_0_0__0
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
                    // InternalCanvas.g:1089:2: ( 'segmentAnchor:' )
                    {
                    // InternalCanvas.g:1089:2: ( 'segmentAnchor:' )
                    // InternalCanvas.g:1090:3: 'segmentAnchor:'
                    {
                     before(grammarAccess.getConnectorAnchorElementAccess().getSegmentAnchorKeyword_0_1()); 
                    match(input,26,FOLLOW_2); 
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
    // InternalCanvas.g:1099:1: rule__ConnectorProps__Alternatives_1 : ( ( ( rule__ConnectorProps__Group_1_0__0 ) ) | ( 'properties:' ) );
    public final void rule__ConnectorProps__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1103:1: ( ( ( rule__ConnectorProps__Group_1_0__0 ) ) | ( 'properties:' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
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
                    // InternalCanvas.g:1104:2: ( ( rule__ConnectorProps__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:1104:2: ( ( rule__ConnectorProps__Group_1_0__0 ) )
                    // InternalCanvas.g:1105:3: ( rule__ConnectorProps__Group_1_0__0 )
                    {
                     before(grammarAccess.getConnectorPropsAccess().getGroup_1_0()); 
                    // InternalCanvas.g:1106:3: ( rule__ConnectorProps__Group_1_0__0 )
                    // InternalCanvas.g:1106:4: rule__ConnectorProps__Group_1_0__0
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
                    // InternalCanvas.g:1110:2: ( 'properties:' )
                    {
                    // InternalCanvas.g:1110:2: ( 'properties:' )
                    // InternalCanvas.g:1111:3: 'properties:'
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
    // InternalCanvas.g:1120:1: rule__Polyline__Alternatives_1 : ( ( ( rule__Polyline__Group_1_0__0 ) ) | ( 'polyline:' ) );
    public final void rule__Polyline__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1124:1: ( ( ( rule__Polyline__Group_1_0__0 ) ) | ( 'polyline:' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            else if ( (LA23_0==27) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalCanvas.g:1125:2: ( ( rule__Polyline__Group_1_0__0 ) )
                    {
                    // InternalCanvas.g:1125:2: ( ( rule__Polyline__Group_1_0__0 ) )
                    // InternalCanvas.g:1126:3: ( rule__Polyline__Group_1_0__0 )
                    {
                     before(grammarAccess.getPolylineAccess().getGroup_1_0()); 
                    // InternalCanvas.g:1127:3: ( rule__Polyline__Group_1_0__0 )
                    // InternalCanvas.g:1127:4: rule__Polyline__Group_1_0__0
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
                    // InternalCanvas.g:1131:2: ( 'polyline:' )
                    {
                    // InternalCanvas.g:1131:2: ( 'polyline:' )
                    // InternalCanvas.g:1132:3: 'polyline:'
                    {
                     before(grammarAccess.getPolylineAccess().getPolylineKeyword_1_1()); 
                    match(input,27,FOLLOW_2); 
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
    // InternalCanvas.g:1141:1: rule__Segment__Alternatives_0 : ( ( ( rule__Segment__Group_0_0__0 ) ) | ( 'segment:' ) );
    public final void rule__Segment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1145:1: ( ( ( rule__Segment__Group_0_0__0 ) ) | ( 'segment:' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            else if ( (LA24_0==28) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCanvas.g:1146:2: ( ( rule__Segment__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1146:2: ( ( rule__Segment__Group_0_0__0 ) )
                    // InternalCanvas.g:1147:3: ( rule__Segment__Group_0_0__0 )
                    {
                     before(grammarAccess.getSegmentAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1148:3: ( rule__Segment__Group_0_0__0 )
                    // InternalCanvas.g:1148:4: rule__Segment__Group_0_0__0
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
                    // InternalCanvas.g:1152:2: ( 'segment:' )
                    {
                    // InternalCanvas.g:1152:2: ( 'segment:' )
                    // InternalCanvas.g:1153:3: 'segment:'
                    {
                     before(grammarAccess.getSegmentAccess().getSegmentKeyword_0_1()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalCanvas.g:1162:1: rule__Rectangle__Alternatives_0 : ( ( ( rule__Rectangle__Group_0_0__0 ) ) | ( 'rectangle:' ) );
    public final void rule__Rectangle__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1166:1: ( ( ( rule__Rectangle__Group_0_0__0 ) ) | ( 'rectangle:' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==55) ) {
                alt25=1;
            }
            else if ( (LA25_0==29) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCanvas.g:1167:2: ( ( rule__Rectangle__Group_0_0__0 ) )
                    {
                    // InternalCanvas.g:1167:2: ( ( rule__Rectangle__Group_0_0__0 ) )
                    // InternalCanvas.g:1168:3: ( rule__Rectangle__Group_0_0__0 )
                    {
                     before(grammarAccess.getRectangleAccess().getGroup_0_0()); 
                    // InternalCanvas.g:1169:3: ( rule__Rectangle__Group_0_0__0 )
                    // InternalCanvas.g:1169:4: rule__Rectangle__Group_0_0__0
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
                    // InternalCanvas.g:1173:2: ( 'rectangle:' )
                    {
                    // InternalCanvas.g:1173:2: ( 'rectangle:' )
                    // InternalCanvas.g:1174:3: 'rectangle:'
                    {
                     before(grammarAccess.getRectangleAccess().getRectangleKeyword_0_1()); 
                    match(input,29,FOLLOW_2); 
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
    // InternalCanvas.g:1183:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1187:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCanvas.g:1188:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalCanvas.g:1195:1: rule__Model__Group__0__Impl : ( ( rule__Model__SemanticsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1199:1: ( ( ( rule__Model__SemanticsAssignment_0 )* ) )
            // InternalCanvas.g:1200:1: ( ( rule__Model__SemanticsAssignment_0 )* )
            {
            // InternalCanvas.g:1200:1: ( ( rule__Model__SemanticsAssignment_0 )* )
            // InternalCanvas.g:1201:2: ( rule__Model__SemanticsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getSemanticsAssignment_0()); 
            // InternalCanvas.g:1202:2: ( rule__Model__SemanticsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCanvas.g:1202:3: rule__Model__SemanticsAssignment_0
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
    // InternalCanvas.g:1210:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1214:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalCanvas.g:1215:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalCanvas.g:1222:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1226:1: ( ( ( rule__Model__Alternatives_1 ) ) )
            // InternalCanvas.g:1227:1: ( ( rule__Model__Alternatives_1 ) )
            {
            // InternalCanvas.g:1227:1: ( ( rule__Model__Alternatives_1 ) )
            // InternalCanvas.g:1228:2: ( rule__Model__Alternatives_1 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalCanvas.g:1229:2: ( rule__Model__Alternatives_1 )
            // InternalCanvas.g:1229:3: rule__Model__Alternatives_1
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
    // InternalCanvas.g:1237:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1241:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalCanvas.g:1242:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalCanvas.g:1249:1: rule__Model__Group__2__Impl : ( ( rule__Model__RepresentsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1253:1: ( ( ( rule__Model__RepresentsAssignment_2 ) ) )
            // InternalCanvas.g:1254:1: ( ( rule__Model__RepresentsAssignment_2 ) )
            {
            // InternalCanvas.g:1254:1: ( ( rule__Model__RepresentsAssignment_2 ) )
            // InternalCanvas.g:1255:2: ( rule__Model__RepresentsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getRepresentsAssignment_2()); 
            // InternalCanvas.g:1256:2: ( rule__Model__RepresentsAssignment_2 )
            // InternalCanvas.g:1256:3: rule__Model__RepresentsAssignment_2
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
    // InternalCanvas.g:1264:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1268:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalCanvas.g:1269:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalCanvas.g:1276:1: rule__Model__Group__3__Impl : ( ( rule__Model__PropertiesAssignment_3 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1280:1: ( ( ( rule__Model__PropertiesAssignment_3 )? ) )
            // InternalCanvas.g:1281:1: ( ( rule__Model__PropertiesAssignment_3 )? )
            {
            // InternalCanvas.g:1281:1: ( ( rule__Model__PropertiesAssignment_3 )? )
            // InternalCanvas.g:1282:2: ( rule__Model__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment_3()); 
            // InternalCanvas.g:1283:2: ( rule__Model__PropertiesAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12||LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCanvas.g:1283:3: rule__Model__PropertiesAssignment_3
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
    // InternalCanvas.g:1291:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1295:1: ( rule__Model__Group__4__Impl )
            // InternalCanvas.g:1296:2: rule__Model__Group__4__Impl
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
    // InternalCanvas.g:1302:1: rule__Model__Group__4__Impl : ( ( rule__Model__ElementsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1306:1: ( ( ( rule__Model__ElementsAssignment_4 )* ) )
            // InternalCanvas.g:1307:1: ( ( rule__Model__ElementsAssignment_4 )* )
            {
            // InternalCanvas.g:1307:1: ( ( rule__Model__ElementsAssignment_4 )* )
            // InternalCanvas.g:1308:2: ( rule__Model__ElementsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_4()); 
            // InternalCanvas.g:1309:2: ( rule__Model__ElementsAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14||LA28_0==16||LA28_0==20||LA28_0==36||LA28_0==38||LA28_0==42) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCanvas.g:1309:3: rule__Model__ElementsAssignment_4
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
    // InternalCanvas.g:1318:1: rule__Model__Group_1_0__0 : rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 ;
    public final void rule__Model__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1322:1: ( rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1 )
            // InternalCanvas.g:1323:2: rule__Model__Group_1_0__0__Impl rule__Model__Group_1_0__1
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
    // InternalCanvas.g:1330:1: rule__Model__Group_1_0__0__Impl : ( 'render' ) ;
    public final void rule__Model__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1334:1: ( ( 'render' ) )
            // InternalCanvas.g:1335:1: ( 'render' )
            {
            // InternalCanvas.g:1335:1: ( 'render' )
            // InternalCanvas.g:1336:2: 'render'
            {
             before(grammarAccess.getModelAccess().getRenderKeyword_1_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCanvas.g:1345:1: rule__Model__Group_1_0__1 : rule__Model__Group_1_0__1__Impl ;
    public final void rule__Model__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1349:1: ( rule__Model__Group_1_0__1__Impl )
            // InternalCanvas.g:1350:2: rule__Model__Group_1_0__1__Impl
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
    // InternalCanvas.g:1356:1: rule__Model__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Model__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1360:1: ( ( ':' ) )
            // InternalCanvas.g:1361:1: ( ':' )
            {
            // InternalCanvas.g:1361:1: ( ':' )
            // InternalCanvas.g:1362:2: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:1372:1: rule__SemanticModel__Group__0 : rule__SemanticModel__Group__0__Impl rule__SemanticModel__Group__1 ;
    public final void rule__SemanticModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1376:1: ( rule__SemanticModel__Group__0__Impl rule__SemanticModel__Group__1 )
            // InternalCanvas.g:1377:2: rule__SemanticModel__Group__0__Impl rule__SemanticModel__Group__1
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
    // InternalCanvas.g:1384:1: rule__SemanticModel__Group__0__Impl : ( 'import' ) ;
    public final void rule__SemanticModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1388:1: ( ( 'import' ) )
            // InternalCanvas.g:1389:1: ( 'import' )
            {
            // InternalCanvas.g:1389:1: ( 'import' )
            // InternalCanvas.g:1390:2: 'import'
            {
             before(grammarAccess.getSemanticModelAccess().getImportKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCanvas.g:1399:1: rule__SemanticModel__Group__1 : rule__SemanticModel__Group__1__Impl ;
    public final void rule__SemanticModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1403:1: ( rule__SemanticModel__Group__1__Impl )
            // InternalCanvas.g:1404:2: rule__SemanticModel__Group__1__Impl
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
    // InternalCanvas.g:1410:1: rule__SemanticModel__Group__1__Impl : ( ( rule__SemanticModel__ImportURIAssignment_1 ) ) ;
    public final void rule__SemanticModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1414:1: ( ( ( rule__SemanticModel__ImportURIAssignment_1 ) ) )
            // InternalCanvas.g:1415:1: ( ( rule__SemanticModel__ImportURIAssignment_1 ) )
            {
            // InternalCanvas.g:1415:1: ( ( rule__SemanticModel__ImportURIAssignment_1 ) )
            // InternalCanvas.g:1416:2: ( rule__SemanticModel__ImportURIAssignment_1 )
            {
             before(grammarAccess.getSemanticModelAccess().getImportURIAssignment_1()); 
            // InternalCanvas.g:1417:2: ( rule__SemanticModel__ImportURIAssignment_1 )
            // InternalCanvas.g:1417:3: rule__SemanticModel__ImportURIAssignment_1
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
    // InternalCanvas.g:1426:1: rule__ModelProperties__Group__0 : rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1 ;
    public final void rule__ModelProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1430:1: ( rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1 )
            // InternalCanvas.g:1431:2: rule__ModelProperties__Group__0__Impl rule__ModelProperties__Group__1
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
    // InternalCanvas.g:1438:1: rule__ModelProperties__Group__0__Impl : ( ( rule__ModelProperties__Alternatives_0 ) ) ;
    public final void rule__ModelProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1442:1: ( ( ( rule__ModelProperties__Alternatives_0 ) ) )
            // InternalCanvas.g:1443:1: ( ( rule__ModelProperties__Alternatives_0 ) )
            {
            // InternalCanvas.g:1443:1: ( ( rule__ModelProperties__Alternatives_0 ) )
            // InternalCanvas.g:1444:2: ( rule__ModelProperties__Alternatives_0 )
            {
             before(grammarAccess.getModelPropertiesAccess().getAlternatives_0()); 
            // InternalCanvas.g:1445:2: ( rule__ModelProperties__Alternatives_0 )
            // InternalCanvas.g:1445:3: rule__ModelProperties__Alternatives_0
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
    // InternalCanvas.g:1453:1: rule__ModelProperties__Group__1 : rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2 ;
    public final void rule__ModelProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1457:1: ( rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2 )
            // InternalCanvas.g:1458:2: rule__ModelProperties__Group__1__Impl rule__ModelProperties__Group__2
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
    // InternalCanvas.g:1465:1: rule__ModelProperties__Group__1__Impl : ( ( rule__ModelProperties__Alternatives_1 ) ) ;
    public final void rule__ModelProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1469:1: ( ( ( rule__ModelProperties__Alternatives_1 ) ) )
            // InternalCanvas.g:1470:1: ( ( rule__ModelProperties__Alternatives_1 ) )
            {
            // InternalCanvas.g:1470:1: ( ( rule__ModelProperties__Alternatives_1 ) )
            // InternalCanvas.g:1471:2: ( rule__ModelProperties__Alternatives_1 )
            {
             before(grammarAccess.getModelPropertiesAccess().getAlternatives_1()); 
            // InternalCanvas.g:1472:2: ( rule__ModelProperties__Alternatives_1 )
            // InternalCanvas.g:1472:3: rule__ModelProperties__Alternatives_1
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
    // InternalCanvas.g:1480:1: rule__ModelProperties__Group__2 : rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3 ;
    public final void rule__ModelProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1484:1: ( rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3 )
            // InternalCanvas.g:1485:2: rule__ModelProperties__Group__2__Impl rule__ModelProperties__Group__3
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
    // InternalCanvas.g:1492:1: rule__ModelProperties__Group__2__Impl : ( ( rule__ModelProperties__PointAssignment_2 ) ) ;
    public final void rule__ModelProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1496:1: ( ( ( rule__ModelProperties__PointAssignment_2 ) ) )
            // InternalCanvas.g:1497:1: ( ( rule__ModelProperties__PointAssignment_2 ) )
            {
            // InternalCanvas.g:1497:1: ( ( rule__ModelProperties__PointAssignment_2 ) )
            // InternalCanvas.g:1498:2: ( rule__ModelProperties__PointAssignment_2 )
            {
             before(grammarAccess.getModelPropertiesAccess().getPointAssignment_2()); 
            // InternalCanvas.g:1499:2: ( rule__ModelProperties__PointAssignment_2 )
            // InternalCanvas.g:1499:3: rule__ModelProperties__PointAssignment_2
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
    // InternalCanvas.g:1507:1: rule__ModelProperties__Group__3 : rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4 ;
    public final void rule__ModelProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1511:1: ( rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4 )
            // InternalCanvas.g:1512:2: rule__ModelProperties__Group__3__Impl rule__ModelProperties__Group__4
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
    // InternalCanvas.g:1519:1: rule__ModelProperties__Group__3__Impl : ( 'zoom' ) ;
    public final void rule__ModelProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1523:1: ( ( 'zoom' ) )
            // InternalCanvas.g:1524:1: ( 'zoom' )
            {
            // InternalCanvas.g:1524:1: ( 'zoom' )
            // InternalCanvas.g:1525:2: 'zoom'
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCanvas.g:1534:1: rule__ModelProperties__Group__4 : rule__ModelProperties__Group__4__Impl ;
    public final void rule__ModelProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1538:1: ( rule__ModelProperties__Group__4__Impl )
            // InternalCanvas.g:1539:2: rule__ModelProperties__Group__4__Impl
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
    // InternalCanvas.g:1545:1: rule__ModelProperties__Group__4__Impl : ( ( rule__ModelProperties__ZoomAssignment_4 ) ) ;
    public final void rule__ModelProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1549:1: ( ( ( rule__ModelProperties__ZoomAssignment_4 ) ) )
            // InternalCanvas.g:1550:1: ( ( rule__ModelProperties__ZoomAssignment_4 ) )
            {
            // InternalCanvas.g:1550:1: ( ( rule__ModelProperties__ZoomAssignment_4 ) )
            // InternalCanvas.g:1551:2: ( rule__ModelProperties__ZoomAssignment_4 )
            {
             before(grammarAccess.getModelPropertiesAccess().getZoomAssignment_4()); 
            // InternalCanvas.g:1552:2: ( rule__ModelProperties__ZoomAssignment_4 )
            // InternalCanvas.g:1552:3: rule__ModelProperties__ZoomAssignment_4
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
    // InternalCanvas.g:1561:1: rule__ModelProperties__Group_0_0__0 : rule__ModelProperties__Group_0_0__0__Impl rule__ModelProperties__Group_0_0__1 ;
    public final void rule__ModelProperties__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1565:1: ( rule__ModelProperties__Group_0_0__0__Impl rule__ModelProperties__Group_0_0__1 )
            // InternalCanvas.g:1566:2: rule__ModelProperties__Group_0_0__0__Impl rule__ModelProperties__Group_0_0__1
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
    // InternalCanvas.g:1573:1: rule__ModelProperties__Group_0_0__0__Impl : ( 'properties' ) ;
    public final void rule__ModelProperties__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1577:1: ( ( 'properties' ) )
            // InternalCanvas.g:1578:1: ( 'properties' )
            {
            // InternalCanvas.g:1578:1: ( 'properties' )
            // InternalCanvas.g:1579:2: 'properties'
            {
             before(grammarAccess.getModelPropertiesAccess().getPropertiesKeyword_0_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCanvas.g:1588:1: rule__ModelProperties__Group_0_0__1 : rule__ModelProperties__Group_0_0__1__Impl ;
    public final void rule__ModelProperties__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1592:1: ( rule__ModelProperties__Group_0_0__1__Impl )
            // InternalCanvas.g:1593:2: rule__ModelProperties__Group_0_0__1__Impl
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
    // InternalCanvas.g:1599:1: rule__ModelProperties__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1603:1: ( ( ':' ) )
            // InternalCanvas.g:1604:1: ( ':' )
            {
            // InternalCanvas.g:1604:1: ( ':' )
            // InternalCanvas.g:1605:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_0_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:1615:1: rule__ModelProperties__Group_1_0__0 : rule__ModelProperties__Group_1_0__0__Impl rule__ModelProperties__Group_1_0__1 ;
    public final void rule__ModelProperties__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1619:1: ( rule__ModelProperties__Group_1_0__0__Impl rule__ModelProperties__Group_1_0__1 )
            // InternalCanvas.g:1620:2: rule__ModelProperties__Group_1_0__0__Impl rule__ModelProperties__Group_1_0__1
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
    // InternalCanvas.g:1627:1: rule__ModelProperties__Group_1_0__0__Impl : ( 'viewport' ) ;
    public final void rule__ModelProperties__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1631:1: ( ( 'viewport' ) )
            // InternalCanvas.g:1632:1: ( 'viewport' )
            {
            // InternalCanvas.g:1632:1: ( 'viewport' )
            // InternalCanvas.g:1633:2: 'viewport'
            {
             before(grammarAccess.getModelPropertiesAccess().getViewportKeyword_1_0_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCanvas.g:1642:1: rule__ModelProperties__Group_1_0__1 : rule__ModelProperties__Group_1_0__1__Impl ;
    public final void rule__ModelProperties__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1646:1: ( rule__ModelProperties__Group_1_0__1__Impl )
            // InternalCanvas.g:1647:2: rule__ModelProperties__Group_1_0__1__Impl
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
    // InternalCanvas.g:1653:1: rule__ModelProperties__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__ModelProperties__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1657:1: ( ( ':' ) )
            // InternalCanvas.g:1658:1: ( ':' )
            {
            // InternalCanvas.g:1658:1: ( ':' )
            // InternalCanvas.g:1659:2: ':'
            {
             before(grammarAccess.getModelPropertiesAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:1669:1: rule__Shapes__Group__0 : rule__Shapes__Group__0__Impl rule__Shapes__Group__1 ;
    public final void rule__Shapes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1673:1: ( rule__Shapes__Group__0__Impl rule__Shapes__Group__1 )
            // InternalCanvas.g:1674:2: rule__Shapes__Group__0__Impl rule__Shapes__Group__1
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
    // InternalCanvas.g:1681:1: rule__Shapes__Group__0__Impl : ( () ) ;
    public final void rule__Shapes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1685:1: ( ( () ) )
            // InternalCanvas.g:1686:1: ( () )
            {
            // InternalCanvas.g:1686:1: ( () )
            // InternalCanvas.g:1687:2: ()
            {
             before(grammarAccess.getShapesAccess().getShapesAction_0()); 
            // InternalCanvas.g:1688:2: ()
            // InternalCanvas.g:1688:3: 
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
    // InternalCanvas.g:1696:1: rule__Shapes__Group__1 : rule__Shapes__Group__1__Impl rule__Shapes__Group__2 ;
    public final void rule__Shapes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1700:1: ( rule__Shapes__Group__1__Impl rule__Shapes__Group__2 )
            // InternalCanvas.g:1701:2: rule__Shapes__Group__1__Impl rule__Shapes__Group__2
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
    // InternalCanvas.g:1708:1: rule__Shapes__Group__1__Impl : ( ( rule__Shapes__Alternatives_1 ) ) ;
    public final void rule__Shapes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1712:1: ( ( ( rule__Shapes__Alternatives_1 ) ) )
            // InternalCanvas.g:1713:1: ( ( rule__Shapes__Alternatives_1 ) )
            {
            // InternalCanvas.g:1713:1: ( ( rule__Shapes__Alternatives_1 ) )
            // InternalCanvas.g:1714:2: ( rule__Shapes__Alternatives_1 )
            {
             before(grammarAccess.getShapesAccess().getAlternatives_1()); 
            // InternalCanvas.g:1715:2: ( rule__Shapes__Alternatives_1 )
            // InternalCanvas.g:1715:3: rule__Shapes__Alternatives_1
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
    // InternalCanvas.g:1723:1: rule__Shapes__Group__2 : rule__Shapes__Group__2__Impl ;
    public final void rule__Shapes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1727:1: ( rule__Shapes__Group__2__Impl )
            // InternalCanvas.g:1728:2: rule__Shapes__Group__2__Impl
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
    // InternalCanvas.g:1734:1: rule__Shapes__Group__2__Impl : ( ( rule__Shapes__ShapesAssignment_2 )* ) ;
    public final void rule__Shapes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1738:1: ( ( ( rule__Shapes__ShapesAssignment_2 )* ) )
            // InternalCanvas.g:1739:1: ( ( rule__Shapes__ShapesAssignment_2 )* )
            {
            // InternalCanvas.g:1739:1: ( ( rule__Shapes__ShapesAssignment_2 )* )
            // InternalCanvas.g:1740:2: ( rule__Shapes__ShapesAssignment_2 )*
            {
             before(grammarAccess.getShapesAccess().getShapesAssignment_2()); 
            // InternalCanvas.g:1741:2: ( rule__Shapes__ShapesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15||LA29_0==37) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCanvas.g:1741:3: rule__Shapes__ShapesAssignment_2
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
    // InternalCanvas.g:1750:1: rule__Shapes__Group_1_0__0 : rule__Shapes__Group_1_0__0__Impl rule__Shapes__Group_1_0__1 ;
    public final void rule__Shapes__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1754:1: ( rule__Shapes__Group_1_0__0__Impl rule__Shapes__Group_1_0__1 )
            // InternalCanvas.g:1755:2: rule__Shapes__Group_1_0__0__Impl rule__Shapes__Group_1_0__1
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
    // InternalCanvas.g:1762:1: rule__Shapes__Group_1_0__0__Impl : ( 'shapes' ) ;
    public final void rule__Shapes__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1766:1: ( ( 'shapes' ) )
            // InternalCanvas.g:1767:1: ( 'shapes' )
            {
            // InternalCanvas.g:1767:1: ( 'shapes' )
            // InternalCanvas.g:1768:2: 'shapes'
            {
             before(grammarAccess.getShapesAccess().getShapesKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCanvas.g:1777:1: rule__Shapes__Group_1_0__1 : rule__Shapes__Group_1_0__1__Impl ;
    public final void rule__Shapes__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1781:1: ( rule__Shapes__Group_1_0__1__Impl )
            // InternalCanvas.g:1782:2: rule__Shapes__Group_1_0__1__Impl
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
    // InternalCanvas.g:1788:1: rule__Shapes__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Shapes__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1792:1: ( ( ':' ) )
            // InternalCanvas.g:1793:1: ( ':' )
            {
            // InternalCanvas.g:1793:1: ( ':' )
            // InternalCanvas.g:1794:2: ':'
            {
             before(grammarAccess.getShapesAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:1804:1: rule__Shape__Group__0 : rule__Shape__Group__0__Impl rule__Shape__Group__1 ;
    public final void rule__Shape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1808:1: ( rule__Shape__Group__0__Impl rule__Shape__Group__1 )
            // InternalCanvas.g:1809:2: rule__Shape__Group__0__Impl rule__Shape__Group__1
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
    // InternalCanvas.g:1816:1: rule__Shape__Group__0__Impl : ( () ) ;
    public final void rule__Shape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1820:1: ( ( () ) )
            // InternalCanvas.g:1821:1: ( () )
            {
            // InternalCanvas.g:1821:1: ( () )
            // InternalCanvas.g:1822:2: ()
            {
             before(grammarAccess.getShapeAccess().getShapeAction_0()); 
            // InternalCanvas.g:1823:2: ()
            // InternalCanvas.g:1823:3: 
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
    // InternalCanvas.g:1831:1: rule__Shape__Group__1 : rule__Shape__Group__1__Impl rule__Shape__Group__2 ;
    public final void rule__Shape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1835:1: ( rule__Shape__Group__1__Impl rule__Shape__Group__2 )
            // InternalCanvas.g:1836:2: rule__Shape__Group__1__Impl rule__Shape__Group__2
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
    // InternalCanvas.g:1843:1: rule__Shape__Group__1__Impl : ( ( rule__Shape__Alternatives_1 ) ) ;
    public final void rule__Shape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1847:1: ( ( ( rule__Shape__Alternatives_1 ) ) )
            // InternalCanvas.g:1848:1: ( ( rule__Shape__Alternatives_1 ) )
            {
            // InternalCanvas.g:1848:1: ( ( rule__Shape__Alternatives_1 ) )
            // InternalCanvas.g:1849:2: ( rule__Shape__Alternatives_1 )
            {
             before(grammarAccess.getShapeAccess().getAlternatives_1()); 
            // InternalCanvas.g:1850:2: ( rule__Shape__Alternatives_1 )
            // InternalCanvas.g:1850:3: rule__Shape__Alternatives_1
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
    // InternalCanvas.g:1858:1: rule__Shape__Group__2 : rule__Shape__Group__2__Impl rule__Shape__Group__3 ;
    public final void rule__Shape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1862:1: ( rule__Shape__Group__2__Impl rule__Shape__Group__3 )
            // InternalCanvas.g:1863:2: rule__Shape__Group__2__Impl rule__Shape__Group__3
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
    // InternalCanvas.g:1870:1: rule__Shape__Group__2__Impl : ( ( rule__Shape__NameAssignment_2 ) ) ;
    public final void rule__Shape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1874:1: ( ( ( rule__Shape__NameAssignment_2 ) ) )
            // InternalCanvas.g:1875:1: ( ( rule__Shape__NameAssignment_2 ) )
            {
            // InternalCanvas.g:1875:1: ( ( rule__Shape__NameAssignment_2 ) )
            // InternalCanvas.g:1876:2: ( rule__Shape__NameAssignment_2 )
            {
             before(grammarAccess.getShapeAccess().getNameAssignment_2()); 
            // InternalCanvas.g:1877:2: ( rule__Shape__NameAssignment_2 )
            // InternalCanvas.g:1877:3: rule__Shape__NameAssignment_2
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
    // InternalCanvas.g:1885:1: rule__Shape__Group__3 : rule__Shape__Group__3__Impl rule__Shape__Group__4 ;
    public final void rule__Shape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1889:1: ( rule__Shape__Group__3__Impl rule__Shape__Group__4 )
            // InternalCanvas.g:1890:2: rule__Shape__Group__3__Impl rule__Shape__Group__4
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
    // InternalCanvas.g:1897:1: rule__Shape__Group__3__Impl : ( ( rule__Shape__PropsAssignment_3 )? ) ;
    public final void rule__Shape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1901:1: ( ( ( rule__Shape__PropsAssignment_3 )? ) )
            // InternalCanvas.g:1902:1: ( ( rule__Shape__PropsAssignment_3 )? )
            {
            // InternalCanvas.g:1902:1: ( ( rule__Shape__PropsAssignment_3 )? )
            // InternalCanvas.g:1903:2: ( rule__Shape__PropsAssignment_3 )?
            {
             before(grammarAccess.getShapeAccess().getPropsAssignment_3()); 
            // InternalCanvas.g:1904:2: ( rule__Shape__PropsAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==12||LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCanvas.g:1904:3: rule__Shape__PropsAssignment_3
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
    // InternalCanvas.g:1912:1: rule__Shape__Group__4 : rule__Shape__Group__4__Impl rule__Shape__Group__5 ;
    public final void rule__Shape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1916:1: ( rule__Shape__Group__4__Impl rule__Shape__Group__5 )
            // InternalCanvas.g:1917:2: rule__Shape__Group__4__Impl rule__Shape__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalCanvas.g:1924:1: rule__Shape__Group__4__Impl : ( ( rule__Shape__RectAssignment_4 ) ) ;
    public final void rule__Shape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1928:1: ( ( ( rule__Shape__RectAssignment_4 ) ) )
            // InternalCanvas.g:1929:1: ( ( rule__Shape__RectAssignment_4 ) )
            {
            // InternalCanvas.g:1929:1: ( ( rule__Shape__RectAssignment_4 ) )
            // InternalCanvas.g:1930:2: ( rule__Shape__RectAssignment_4 )
            {
             before(grammarAccess.getShapeAccess().getRectAssignment_4()); 
            // InternalCanvas.g:1931:2: ( rule__Shape__RectAssignment_4 )
            // InternalCanvas.g:1931:3: rule__Shape__RectAssignment_4
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
    // InternalCanvas.g:1939:1: rule__Shape__Group__5 : rule__Shape__Group__5__Impl rule__Shape__Group__6 ;
    public final void rule__Shape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1943:1: ( rule__Shape__Group__5__Impl rule__Shape__Group__6 )
            // InternalCanvas.g:1944:2: rule__Shape__Group__5__Impl rule__Shape__Group__6
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
    // InternalCanvas.g:1951:1: rule__Shape__Group__5__Impl : ( ( rule__Shape__Alternatives_5 ) ) ;
    public final void rule__Shape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1955:1: ( ( ( rule__Shape__Alternatives_5 ) ) )
            // InternalCanvas.g:1956:1: ( ( rule__Shape__Alternatives_5 ) )
            {
            // InternalCanvas.g:1956:1: ( ( rule__Shape__Alternatives_5 ) )
            // InternalCanvas.g:1957:2: ( rule__Shape__Alternatives_5 )
            {
             before(grammarAccess.getShapeAccess().getAlternatives_5()); 
            // InternalCanvas.g:1958:2: ( rule__Shape__Alternatives_5 )
            // InternalCanvas.g:1958:3: rule__Shape__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getAlternatives_5()); 

            }


            }

        }
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
    // InternalCanvas.g:1966:1: rule__Shape__Group__6 : rule__Shape__Group__6__Impl ;
    public final void rule__Shape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1970:1: ( rule__Shape__Group__6__Impl )
            // InternalCanvas.g:1971:2: rule__Shape__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalCanvas.g:1977:1: rule__Shape__Group__6__Impl : ( ( rule__Shape__RepresentsAssignment_6 ) ) ;
    public final void rule__Shape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1981:1: ( ( ( rule__Shape__RepresentsAssignment_6 ) ) )
            // InternalCanvas.g:1982:1: ( ( rule__Shape__RepresentsAssignment_6 ) )
            {
            // InternalCanvas.g:1982:1: ( ( rule__Shape__RepresentsAssignment_6 ) )
            // InternalCanvas.g:1983:2: ( rule__Shape__RepresentsAssignment_6 )
            {
             before(grammarAccess.getShapeAccess().getRepresentsAssignment_6()); 
            // InternalCanvas.g:1984:2: ( rule__Shape__RepresentsAssignment_6 )
            // InternalCanvas.g:1984:3: rule__Shape__RepresentsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Shape__RepresentsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getRepresentsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Shape__Group_1_0__0"
    // InternalCanvas.g:1993:1: rule__Shape__Group_1_0__0 : rule__Shape__Group_1_0__0__Impl rule__Shape__Group_1_0__1 ;
    public final void rule__Shape__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:1997:1: ( rule__Shape__Group_1_0__0__Impl rule__Shape__Group_1_0__1 )
            // InternalCanvas.g:1998:2: rule__Shape__Group_1_0__0__Impl rule__Shape__Group_1_0__1
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
    // InternalCanvas.g:2005:1: rule__Shape__Group_1_0__0__Impl : ( 'shape' ) ;
    public final void rule__Shape__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2009:1: ( ( 'shape' ) )
            // InternalCanvas.g:2010:1: ( 'shape' )
            {
            // InternalCanvas.g:2010:1: ( 'shape' )
            // InternalCanvas.g:2011:2: 'shape'
            {
             before(grammarAccess.getShapeAccess().getShapeKeyword_1_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCanvas.g:2020:1: rule__Shape__Group_1_0__1 : rule__Shape__Group_1_0__1__Impl ;
    public final void rule__Shape__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2024:1: ( rule__Shape__Group_1_0__1__Impl )
            // InternalCanvas.g:2025:2: rule__Shape__Group_1_0__1__Impl
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
    // InternalCanvas.g:2031:1: rule__Shape__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Shape__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2035:1: ( ( ':' ) )
            // InternalCanvas.g:2036:1: ( ':' )
            {
            // InternalCanvas.g:2036:1: ( ':' )
            // InternalCanvas.g:2037:2: ':'
            {
             before(grammarAccess.getShapeAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__Shape__Group_5_0__0"
    // InternalCanvas.g:2047:1: rule__Shape__Group_5_0__0 : rule__Shape__Group_5_0__0__Impl rule__Shape__Group_5_0__1 ;
    public final void rule__Shape__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2051:1: ( rule__Shape__Group_5_0__0__Impl rule__Shape__Group_5_0__1 )
            // InternalCanvas.g:2052:2: rule__Shape__Group_5_0__0__Impl rule__Shape__Group_5_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Shape__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shape__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_5_0__0"


    // $ANTLR start "rule__Shape__Group_5_0__0__Impl"
    // InternalCanvas.g:2059:1: rule__Shape__Group_5_0__0__Impl : ( 'render' ) ;
    public final void rule__Shape__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2063:1: ( ( 'render' ) )
            // InternalCanvas.g:2064:1: ( 'render' )
            {
            // InternalCanvas.g:2064:1: ( 'render' )
            // InternalCanvas.g:2065:2: 'render'
            {
             before(grammarAccess.getShapeAccess().getRenderKeyword_5_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getRenderKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_5_0__0__Impl"


    // $ANTLR start "rule__Shape__Group_5_0__1"
    // InternalCanvas.g:2074:1: rule__Shape__Group_5_0__1 : rule__Shape__Group_5_0__1__Impl ;
    public final void rule__Shape__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2078:1: ( rule__Shape__Group_5_0__1__Impl )
            // InternalCanvas.g:2079:2: rule__Shape__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Group_5_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_5_0__1"


    // $ANTLR start "rule__Shape__Group_5_0__1__Impl"
    // InternalCanvas.g:2085:1: rule__Shape__Group_5_0__1__Impl : ( ':' ) ;
    public final void rule__Shape__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2089:1: ( ( ':' ) )
            // InternalCanvas.g:2090:1: ( ':' )
            {
            // InternalCanvas.g:2090:1: ( ':' )
            // InternalCanvas.g:2091:2: ':'
            {
             before(grammarAccess.getShapeAccess().getColonKeyword_5_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getColonKeyword_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Group_5_0__1__Impl"


    // $ANTLR start "rule__FloatingTexts__Group__0"
    // InternalCanvas.g:2101:1: rule__FloatingTexts__Group__0 : rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1 ;
    public final void rule__FloatingTexts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2105:1: ( rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1 )
            // InternalCanvas.g:2106:2: rule__FloatingTexts__Group__0__Impl rule__FloatingTexts__Group__1
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
    // InternalCanvas.g:2113:1: rule__FloatingTexts__Group__0__Impl : ( () ) ;
    public final void rule__FloatingTexts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2117:1: ( ( () ) )
            // InternalCanvas.g:2118:1: ( () )
            {
            // InternalCanvas.g:2118:1: ( () )
            // InternalCanvas.g:2119:2: ()
            {
             before(grammarAccess.getFloatingTextsAccess().getFloatingTextsAction_0()); 
            // InternalCanvas.g:2120:2: ()
            // InternalCanvas.g:2120:3: 
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
    // InternalCanvas.g:2128:1: rule__FloatingTexts__Group__1 : rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2 ;
    public final void rule__FloatingTexts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2132:1: ( rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2 )
            // InternalCanvas.g:2133:2: rule__FloatingTexts__Group__1__Impl rule__FloatingTexts__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalCanvas.g:2140:1: rule__FloatingTexts__Group__1__Impl : ( ( rule__FloatingTexts__Alternatives_1 ) ) ;
    public final void rule__FloatingTexts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2144:1: ( ( ( rule__FloatingTexts__Alternatives_1 ) ) )
            // InternalCanvas.g:2145:1: ( ( rule__FloatingTexts__Alternatives_1 ) )
            {
            // InternalCanvas.g:2145:1: ( ( rule__FloatingTexts__Alternatives_1 ) )
            // InternalCanvas.g:2146:2: ( rule__FloatingTexts__Alternatives_1 )
            {
             before(grammarAccess.getFloatingTextsAccess().getAlternatives_1()); 
            // InternalCanvas.g:2147:2: ( rule__FloatingTexts__Alternatives_1 )
            // InternalCanvas.g:2147:3: rule__FloatingTexts__Alternatives_1
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
    // InternalCanvas.g:2155:1: rule__FloatingTexts__Group__2 : rule__FloatingTexts__Group__2__Impl ;
    public final void rule__FloatingTexts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2159:1: ( rule__FloatingTexts__Group__2__Impl )
            // InternalCanvas.g:2160:2: rule__FloatingTexts__Group__2__Impl
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
    // InternalCanvas.g:2166:1: rule__FloatingTexts__Group__2__Impl : ( ( rule__FloatingTexts__TextsAssignment_2 )* ) ;
    public final void rule__FloatingTexts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2170:1: ( ( ( rule__FloatingTexts__TextsAssignment_2 )* ) )
            // InternalCanvas.g:2171:1: ( ( rule__FloatingTexts__TextsAssignment_2 )* )
            {
            // InternalCanvas.g:2171:1: ( ( rule__FloatingTexts__TextsAssignment_2 )* )
            // InternalCanvas.g:2172:2: ( rule__FloatingTexts__TextsAssignment_2 )*
            {
             before(grammarAccess.getFloatingTextsAccess().getTextsAssignment_2()); 
            // InternalCanvas.g:2173:2: ( rule__FloatingTexts__TextsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17||LA31_0==39) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCanvas.g:2173:3: rule__FloatingTexts__TextsAssignment_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FloatingTexts__TextsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalCanvas.g:2182:1: rule__FloatingTexts__Group_1_0__0 : rule__FloatingTexts__Group_1_0__0__Impl rule__FloatingTexts__Group_1_0__1 ;
    public final void rule__FloatingTexts__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2186:1: ( rule__FloatingTexts__Group_1_0__0__Impl rule__FloatingTexts__Group_1_0__1 )
            // InternalCanvas.g:2187:2: rule__FloatingTexts__Group_1_0__0__Impl rule__FloatingTexts__Group_1_0__1
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
    // InternalCanvas.g:2194:1: rule__FloatingTexts__Group_1_0__0__Impl : ( 'texts' ) ;
    public final void rule__FloatingTexts__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2198:1: ( ( 'texts' ) )
            // InternalCanvas.g:2199:1: ( 'texts' )
            {
            // InternalCanvas.g:2199:1: ( 'texts' )
            // InternalCanvas.g:2200:2: 'texts'
            {
             before(grammarAccess.getFloatingTextsAccess().getTextsKeyword_1_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCanvas.g:2209:1: rule__FloatingTexts__Group_1_0__1 : rule__FloatingTexts__Group_1_0__1__Impl ;
    public final void rule__FloatingTexts__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2213:1: ( rule__FloatingTexts__Group_1_0__1__Impl )
            // InternalCanvas.g:2214:2: rule__FloatingTexts__Group_1_0__1__Impl
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
    // InternalCanvas.g:2220:1: rule__FloatingTexts__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__FloatingTexts__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2224:1: ( ( ':' ) )
            // InternalCanvas.g:2225:1: ( ':' )
            {
            // InternalCanvas.g:2225:1: ( ':' )
            // InternalCanvas.g:2226:2: ':'
            {
             before(grammarAccess.getFloatingTextsAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:2236:1: rule__FloatingText__Group__0 : rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1 ;
    public final void rule__FloatingText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2240:1: ( rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1 )
            // InternalCanvas.g:2241:2: rule__FloatingText__Group__0__Impl rule__FloatingText__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCanvas.g:2248:1: rule__FloatingText__Group__0__Impl : ( () ) ;
    public final void rule__FloatingText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2252:1: ( ( () ) )
            // InternalCanvas.g:2253:1: ( () )
            {
            // InternalCanvas.g:2253:1: ( () )
            // InternalCanvas.g:2254:2: ()
            {
             before(grammarAccess.getFloatingTextAccess().getFloatingTextAction_0()); 
            // InternalCanvas.g:2255:2: ()
            // InternalCanvas.g:2255:3: 
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
    // InternalCanvas.g:2263:1: rule__FloatingText__Group__1 : rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2 ;
    public final void rule__FloatingText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2267:1: ( rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2 )
            // InternalCanvas.g:2268:2: rule__FloatingText__Group__1__Impl rule__FloatingText__Group__2
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
    // InternalCanvas.g:2275:1: rule__FloatingText__Group__1__Impl : ( ( rule__FloatingText__Alternatives_1 ) ) ;
    public final void rule__FloatingText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2279:1: ( ( ( rule__FloatingText__Alternatives_1 ) ) )
            // InternalCanvas.g:2280:1: ( ( rule__FloatingText__Alternatives_1 ) )
            {
            // InternalCanvas.g:2280:1: ( ( rule__FloatingText__Alternatives_1 ) )
            // InternalCanvas.g:2281:2: ( rule__FloatingText__Alternatives_1 )
            {
             before(grammarAccess.getFloatingTextAccess().getAlternatives_1()); 
            // InternalCanvas.g:2282:2: ( rule__FloatingText__Alternatives_1 )
            // InternalCanvas.g:2282:3: rule__FloatingText__Alternatives_1
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
    // InternalCanvas.g:2290:1: rule__FloatingText__Group__2 : rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3 ;
    public final void rule__FloatingText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2294:1: ( rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3 )
            // InternalCanvas.g:2295:2: rule__FloatingText__Group__2__Impl rule__FloatingText__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalCanvas.g:2302:1: rule__FloatingText__Group__2__Impl : ( ( rule__FloatingText__RectAssignment_2 ) ) ;
    public final void rule__FloatingText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2306:1: ( ( ( rule__FloatingText__RectAssignment_2 ) ) )
            // InternalCanvas.g:2307:1: ( ( rule__FloatingText__RectAssignment_2 ) )
            {
            // InternalCanvas.g:2307:1: ( ( rule__FloatingText__RectAssignment_2 ) )
            // InternalCanvas.g:2308:2: ( rule__FloatingText__RectAssignment_2 )
            {
             before(grammarAccess.getFloatingTextAccess().getRectAssignment_2()); 
            // InternalCanvas.g:2309:2: ( rule__FloatingText__RectAssignment_2 )
            // InternalCanvas.g:2309:3: rule__FloatingText__RectAssignment_2
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
    // InternalCanvas.g:2317:1: rule__FloatingText__Group__3 : rule__FloatingText__Group__3__Impl ;
    public final void rule__FloatingText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2321:1: ( rule__FloatingText__Group__3__Impl )
            // InternalCanvas.g:2322:2: rule__FloatingText__Group__3__Impl
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
    // InternalCanvas.g:2328:1: rule__FloatingText__Group__3__Impl : ( ( rule__FloatingText__AssociatedAssignment_3 ) ) ;
    public final void rule__FloatingText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2332:1: ( ( ( rule__FloatingText__AssociatedAssignment_3 ) ) )
            // InternalCanvas.g:2333:1: ( ( rule__FloatingText__AssociatedAssignment_3 ) )
            {
            // InternalCanvas.g:2333:1: ( ( rule__FloatingText__AssociatedAssignment_3 ) )
            // InternalCanvas.g:2334:2: ( rule__FloatingText__AssociatedAssignment_3 )
            {
             before(grammarAccess.getFloatingTextAccess().getAssociatedAssignment_3()); 
            // InternalCanvas.g:2335:2: ( rule__FloatingText__AssociatedAssignment_3 )
            // InternalCanvas.g:2335:3: rule__FloatingText__AssociatedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__AssociatedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextAccess().getAssociatedAssignment_3()); 

            }


            }

        }
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
    // InternalCanvas.g:2344:1: rule__FloatingText__Group_1_0__0 : rule__FloatingText__Group_1_0__0__Impl rule__FloatingText__Group_1_0__1 ;
    public final void rule__FloatingText__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2348:1: ( rule__FloatingText__Group_1_0__0__Impl rule__FloatingText__Group_1_0__1 )
            // InternalCanvas.g:2349:2: rule__FloatingText__Group_1_0__0__Impl rule__FloatingText__Group_1_0__1
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
    // InternalCanvas.g:2356:1: rule__FloatingText__Group_1_0__0__Impl : ( 'text' ) ;
    public final void rule__FloatingText__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2360:1: ( ( 'text' ) )
            // InternalCanvas.g:2361:1: ( 'text' )
            {
            // InternalCanvas.g:2361:1: ( 'text' )
            // InternalCanvas.g:2362:2: 'text'
            {
             before(grammarAccess.getFloatingTextAccess().getTextKeyword_1_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCanvas.g:2371:1: rule__FloatingText__Group_1_0__1 : rule__FloatingText__Group_1_0__1__Impl ;
    public final void rule__FloatingText__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2375:1: ( rule__FloatingText__Group_1_0__1__Impl )
            // InternalCanvas.g:2376:2: rule__FloatingText__Group_1_0__1__Impl
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
    // InternalCanvas.g:2382:1: rule__FloatingText__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__FloatingText__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2386:1: ( ( ':' ) )
            // InternalCanvas.g:2387:1: ( ':' )
            {
            // InternalCanvas.g:2387:1: ( ':' )
            // InternalCanvas.g:2388:2: ':'
            {
             before(grammarAccess.getFloatingTextAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:2398:1: rule__ShapeProps__Group__0 : rule__ShapeProps__Group__0__Impl rule__ShapeProps__Group__1 ;
    public final void rule__ShapeProps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2402:1: ( rule__ShapeProps__Group__0__Impl rule__ShapeProps__Group__1 )
            // InternalCanvas.g:2403:2: rule__ShapeProps__Group__0__Impl rule__ShapeProps__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCanvas.g:2410:1: rule__ShapeProps__Group__0__Impl : ( () ) ;
    public final void rule__ShapeProps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2414:1: ( ( () ) )
            // InternalCanvas.g:2415:1: ( () )
            {
            // InternalCanvas.g:2415:1: ( () )
            // InternalCanvas.g:2416:2: ()
            {
             before(grammarAccess.getShapePropsAccess().getShapePropsAction_0()); 
            // InternalCanvas.g:2417:2: ()
            // InternalCanvas.g:2417:3: 
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
    // InternalCanvas.g:2425:1: rule__ShapeProps__Group__1 : rule__ShapeProps__Group__1__Impl rule__ShapeProps__Group__2 ;
    public final void rule__ShapeProps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2429:1: ( rule__ShapeProps__Group__1__Impl rule__ShapeProps__Group__2 )
            // InternalCanvas.g:2430:2: rule__ShapeProps__Group__1__Impl rule__ShapeProps__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalCanvas.g:2437:1: rule__ShapeProps__Group__1__Impl : ( ( rule__ShapeProps__Alternatives_1 ) ) ;
    public final void rule__ShapeProps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2441:1: ( ( ( rule__ShapeProps__Alternatives_1 ) ) )
            // InternalCanvas.g:2442:1: ( ( rule__ShapeProps__Alternatives_1 ) )
            {
            // InternalCanvas.g:2442:1: ( ( rule__ShapeProps__Alternatives_1 ) )
            // InternalCanvas.g:2443:2: ( rule__ShapeProps__Alternatives_1 )
            {
             before(grammarAccess.getShapePropsAccess().getAlternatives_1()); 
            // InternalCanvas.g:2444:2: ( rule__ShapeProps__Alternatives_1 )
            // InternalCanvas.g:2444:3: rule__ShapeProps__Alternatives_1
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
    // InternalCanvas.g:2452:1: rule__ShapeProps__Group__2 : rule__ShapeProps__Group__2__Impl rule__ShapeProps__Group__3 ;
    public final void rule__ShapeProps__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2456:1: ( rule__ShapeProps__Group__2__Impl rule__ShapeProps__Group__3 )
            // InternalCanvas.g:2457:2: rule__ShapeProps__Group__2__Impl rule__ShapeProps__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalCanvas.g:2464:1: rule__ShapeProps__Group__2__Impl : ( ( rule__ShapeProps__ContainerAssignment_2 )? ) ;
    public final void rule__ShapeProps__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2468:1: ( ( ( rule__ShapeProps__ContainerAssignment_2 )? ) )
            // InternalCanvas.g:2469:1: ( ( rule__ShapeProps__ContainerAssignment_2 )? )
            {
            // InternalCanvas.g:2469:1: ( ( rule__ShapeProps__ContainerAssignment_2 )? )
            // InternalCanvas.g:2470:2: ( rule__ShapeProps__ContainerAssignment_2 )?
            {
             before(grammarAccess.getShapePropsAccess().getContainerAssignment_2()); 
            // InternalCanvas.g:2471:2: ( rule__ShapeProps__ContainerAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCanvas.g:2471:3: rule__ShapeProps__ContainerAssignment_2
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
    // InternalCanvas.g:2479:1: rule__ShapeProps__Group__3 : rule__ShapeProps__Group__3__Impl ;
    public final void rule__ShapeProps__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2483:1: ( rule__ShapeProps__Group__3__Impl )
            // InternalCanvas.g:2484:2: rule__ShapeProps__Group__3__Impl
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
    // InternalCanvas.g:2490:1: rule__ShapeProps__Group__3__Impl : ( ( rule__ShapeProps__ColorAssignment_3 )? ) ;
    public final void rule__ShapeProps__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2494:1: ( ( ( rule__ShapeProps__ColorAssignment_3 )? ) )
            // InternalCanvas.g:2495:1: ( ( rule__ShapeProps__ColorAssignment_3 )? )
            {
            // InternalCanvas.g:2495:1: ( ( rule__ShapeProps__ColorAssignment_3 )? )
            // InternalCanvas.g:2496:2: ( rule__ShapeProps__ColorAssignment_3 )?
            {
             before(grammarAccess.getShapePropsAccess().getColorAssignment_3()); 
            // InternalCanvas.g:2497:2: ( rule__ShapeProps__ColorAssignment_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCanvas.g:2497:3: rule__ShapeProps__ColorAssignment_3
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
    // InternalCanvas.g:2506:1: rule__ShapeProps__Group_1_0__0 : rule__ShapeProps__Group_1_0__0__Impl rule__ShapeProps__Group_1_0__1 ;
    public final void rule__ShapeProps__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2510:1: ( rule__ShapeProps__Group_1_0__0__Impl rule__ShapeProps__Group_1_0__1 )
            // InternalCanvas.g:2511:2: rule__ShapeProps__Group_1_0__0__Impl rule__ShapeProps__Group_1_0__1
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
    // InternalCanvas.g:2518:1: rule__ShapeProps__Group_1_0__0__Impl : ( 'properties' ) ;
    public final void rule__ShapeProps__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2522:1: ( ( 'properties' ) )
            // InternalCanvas.g:2523:1: ( 'properties' )
            {
            // InternalCanvas.g:2523:1: ( 'properties' )
            // InternalCanvas.g:2524:2: 'properties'
            {
             before(grammarAccess.getShapePropsAccess().getPropertiesKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCanvas.g:2533:1: rule__ShapeProps__Group_1_0__1 : rule__ShapeProps__Group_1_0__1__Impl ;
    public final void rule__ShapeProps__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2537:1: ( rule__ShapeProps__Group_1_0__1__Impl )
            // InternalCanvas.g:2538:2: rule__ShapeProps__Group_1_0__1__Impl
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
    // InternalCanvas.g:2544:1: rule__ShapeProps__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__ShapeProps__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2548:1: ( ( ':' ) )
            // InternalCanvas.g:2549:1: ( ':' )
            {
            // InternalCanvas.g:2549:1: ( ':' )
            // InternalCanvas.g:2550:2: ':'
            {
             before(grammarAccess.getShapePropsAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:2560:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2564:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalCanvas.g:2565:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCanvas.g:2572:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2576:1: ( ( () ) )
            // InternalCanvas.g:2577:1: ( () )
            {
            // InternalCanvas.g:2577:1: ( () )
            // InternalCanvas.g:2578:2: ()
            {
             before(grammarAccess.getContainerAccess().getShapeContainerAction_0()); 
            // InternalCanvas.g:2579:2: ()
            // InternalCanvas.g:2579:3: 
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
    // InternalCanvas.g:2587:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2591:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalCanvas.g:2592:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalCanvas.g:2599:1: rule__Container__Group__1__Impl : ( 'container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2603:1: ( ( 'container' ) )
            // InternalCanvas.g:2604:1: ( 'container' )
            {
            // InternalCanvas.g:2604:1: ( 'container' )
            // InternalCanvas.g:2605:2: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCanvas.g:2614:1: rule__Container__Group__2 : rule__Container__Group__2__Impl ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2618:1: ( rule__Container__Group__2__Impl )
            // InternalCanvas.g:2619:2: rule__Container__Group__2__Impl
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
    // InternalCanvas.g:2625:1: rule__Container__Group__2__Impl : ( ( rule__Container__Alternatives_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2629:1: ( ( ( rule__Container__Alternatives_2 ) ) )
            // InternalCanvas.g:2630:1: ( ( rule__Container__Alternatives_2 ) )
            {
            // InternalCanvas.g:2630:1: ( ( rule__Container__Alternatives_2 ) )
            // InternalCanvas.g:2631:2: ( rule__Container__Alternatives_2 )
            {
             before(grammarAccess.getContainerAccess().getAlternatives_2()); 
            // InternalCanvas.g:2632:2: ( rule__Container__Alternatives_2 )
            // InternalCanvas.g:2632:3: rule__Container__Alternatives_2
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
    // InternalCanvas.g:2641:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2645:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalCanvas.g:2646:2: rule__Color__Group__0__Impl rule__Color__Group__1
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
    // InternalCanvas.g:2653:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2657:1: ( ( 'color' ) )
            // InternalCanvas.g:2658:1: ( 'color' )
            {
            // InternalCanvas.g:2658:1: ( 'color' )
            // InternalCanvas.g:2659:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCanvas.g:2668:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2672:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalCanvas.g:2673:2: rule__Color__Group__1__Impl rule__Color__Group__2
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
    // InternalCanvas.g:2680:1: rule__Color__Group__1__Impl : ( ( rule__Color__RAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2684:1: ( ( ( rule__Color__RAssignment_1 ) ) )
            // InternalCanvas.g:2685:1: ( ( rule__Color__RAssignment_1 ) )
            {
            // InternalCanvas.g:2685:1: ( ( rule__Color__RAssignment_1 ) )
            // InternalCanvas.g:2686:2: ( rule__Color__RAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getRAssignment_1()); 
            // InternalCanvas.g:2687:2: ( rule__Color__RAssignment_1 )
            // InternalCanvas.g:2687:3: rule__Color__RAssignment_1
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
    // InternalCanvas.g:2695:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2699:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalCanvas.g:2700:2: rule__Color__Group__2__Impl rule__Color__Group__3
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
    // InternalCanvas.g:2707:1: rule__Color__Group__2__Impl : ( ( rule__Color__GAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2711:1: ( ( ( rule__Color__GAssignment_2 ) ) )
            // InternalCanvas.g:2712:1: ( ( rule__Color__GAssignment_2 ) )
            {
            // InternalCanvas.g:2712:1: ( ( rule__Color__GAssignment_2 ) )
            // InternalCanvas.g:2713:2: ( rule__Color__GAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getGAssignment_2()); 
            // InternalCanvas.g:2714:2: ( rule__Color__GAssignment_2 )
            // InternalCanvas.g:2714:3: rule__Color__GAssignment_2
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
    // InternalCanvas.g:2722:1: rule__Color__Group__3 : rule__Color__Group__3__Impl ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2726:1: ( rule__Color__Group__3__Impl )
            // InternalCanvas.g:2727:2: rule__Color__Group__3__Impl
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
    // InternalCanvas.g:2733:1: rule__Color__Group__3__Impl : ( ( rule__Color__BAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2737:1: ( ( ( rule__Color__BAssignment_3 ) ) )
            // InternalCanvas.g:2738:1: ( ( rule__Color__BAssignment_3 ) )
            {
            // InternalCanvas.g:2738:1: ( ( rule__Color__BAssignment_3 ) )
            // InternalCanvas.g:2739:2: ( rule__Color__BAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getBAssignment_3()); 
            // InternalCanvas.g:2740:2: ( rule__Color__BAssignment_3 )
            // InternalCanvas.g:2740:3: rule__Color__BAssignment_3
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
    // InternalCanvas.g:2749:1: rule__Connectors__Group__0 : rule__Connectors__Group__0__Impl rule__Connectors__Group__1 ;
    public final void rule__Connectors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2753:1: ( rule__Connectors__Group__0__Impl rule__Connectors__Group__1 )
            // InternalCanvas.g:2754:2: rule__Connectors__Group__0__Impl rule__Connectors__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCanvas.g:2761:1: rule__Connectors__Group__0__Impl : ( () ) ;
    public final void rule__Connectors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2765:1: ( ( () ) )
            // InternalCanvas.g:2766:1: ( () )
            {
            // InternalCanvas.g:2766:1: ( () )
            // InternalCanvas.g:2767:2: ()
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsAction_0()); 
            // InternalCanvas.g:2768:2: ()
            // InternalCanvas.g:2768:3: 
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
    // InternalCanvas.g:2776:1: rule__Connectors__Group__1 : rule__Connectors__Group__1__Impl rule__Connectors__Group__2 ;
    public final void rule__Connectors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2780:1: ( rule__Connectors__Group__1__Impl rule__Connectors__Group__2 )
            // InternalCanvas.g:2781:2: rule__Connectors__Group__1__Impl rule__Connectors__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCanvas.g:2788:1: rule__Connectors__Group__1__Impl : ( ( rule__Connectors__Alternatives_1 ) ) ;
    public final void rule__Connectors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2792:1: ( ( ( rule__Connectors__Alternatives_1 ) ) )
            // InternalCanvas.g:2793:1: ( ( rule__Connectors__Alternatives_1 ) )
            {
            // InternalCanvas.g:2793:1: ( ( rule__Connectors__Alternatives_1 ) )
            // InternalCanvas.g:2794:2: ( rule__Connectors__Alternatives_1 )
            {
             before(grammarAccess.getConnectorsAccess().getAlternatives_1()); 
            // InternalCanvas.g:2795:2: ( rule__Connectors__Alternatives_1 )
            // InternalCanvas.g:2795:3: rule__Connectors__Alternatives_1
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
    // InternalCanvas.g:2803:1: rule__Connectors__Group__2 : rule__Connectors__Group__2__Impl ;
    public final void rule__Connectors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2807:1: ( rule__Connectors__Group__2__Impl )
            // InternalCanvas.g:2808:2: rule__Connectors__Group__2__Impl
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
    // InternalCanvas.g:2814:1: rule__Connectors__Group__2__Impl : ( ( rule__Connectors__ConnectorsAssignment_2 )* ) ;
    public final void rule__Connectors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2818:1: ( ( ( rule__Connectors__ConnectorsAssignment_2 )* ) )
            // InternalCanvas.g:2819:1: ( ( rule__Connectors__ConnectorsAssignment_2 )* )
            {
            // InternalCanvas.g:2819:1: ( ( rule__Connectors__ConnectorsAssignment_2 )* )
            // InternalCanvas.g:2820:2: ( rule__Connectors__ConnectorsAssignment_2 )*
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsAssignment_2()); 
            // InternalCanvas.g:2821:2: ( rule__Connectors__ConnectorsAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21||LA34_0==43) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCanvas.g:2821:3: rule__Connectors__ConnectorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalCanvas.g:2830:1: rule__Connectors__Group_1_0__0 : rule__Connectors__Group_1_0__0__Impl rule__Connectors__Group_1_0__1 ;
    public final void rule__Connectors__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2834:1: ( rule__Connectors__Group_1_0__0__Impl rule__Connectors__Group_1_0__1 )
            // InternalCanvas.g:2835:2: rule__Connectors__Group_1_0__0__Impl rule__Connectors__Group_1_0__1
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
    // InternalCanvas.g:2842:1: rule__Connectors__Group_1_0__0__Impl : ( 'connectors' ) ;
    public final void rule__Connectors__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2846:1: ( ( 'connectors' ) )
            // InternalCanvas.g:2847:1: ( 'connectors' )
            {
            // InternalCanvas.g:2847:1: ( 'connectors' )
            // InternalCanvas.g:2848:2: 'connectors'
            {
             before(grammarAccess.getConnectorsAccess().getConnectorsKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCanvas.g:2857:1: rule__Connectors__Group_1_0__1 : rule__Connectors__Group_1_0__1__Impl ;
    public final void rule__Connectors__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2861:1: ( rule__Connectors__Group_1_0__1__Impl )
            // InternalCanvas.g:2862:2: rule__Connectors__Group_1_0__1__Impl
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
    // InternalCanvas.g:2868:1: rule__Connectors__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Connectors__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2872:1: ( ( ':' ) )
            // InternalCanvas.g:2873:1: ( ':' )
            {
            // InternalCanvas.g:2873:1: ( ':' )
            // InternalCanvas.g:2874:2: ':'
            {
             before(grammarAccess.getConnectorsAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:2884:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2888:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalCanvas.g:2889:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
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
    // InternalCanvas.g:2896:1: rule__Connector__Group__0__Impl : ( ( rule__Connector__Alternatives_0 ) ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2900:1: ( ( ( rule__Connector__Alternatives_0 ) ) )
            // InternalCanvas.g:2901:1: ( ( rule__Connector__Alternatives_0 ) )
            {
            // InternalCanvas.g:2901:1: ( ( rule__Connector__Alternatives_0 ) )
            // InternalCanvas.g:2902:2: ( rule__Connector__Alternatives_0 )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives_0()); 
            // InternalCanvas.g:2903:2: ( rule__Connector__Alternatives_0 )
            // InternalCanvas.g:2903:3: rule__Connector__Alternatives_0
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
    // InternalCanvas.g:2911:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2915:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalCanvas.g:2916:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalCanvas.g:2923:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2927:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // InternalCanvas.g:2928:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // InternalCanvas.g:2928:1: ( ( rule__Connector__NameAssignment_1 ) )
            // InternalCanvas.g:2929:2: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // InternalCanvas.g:2930:2: ( rule__Connector__NameAssignment_1 )
            // InternalCanvas.g:2930:3: rule__Connector__NameAssignment_1
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
    // InternalCanvas.g:2938:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2942:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalCanvas.g:2943:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalCanvas.g:2950:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__PropsAssignment_2 )? ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2954:1: ( ( ( rule__Connector__PropsAssignment_2 )? ) )
            // InternalCanvas.g:2955:1: ( ( rule__Connector__PropsAssignment_2 )? )
            {
            // InternalCanvas.g:2955:1: ( ( rule__Connector__PropsAssignment_2 )? )
            // InternalCanvas.g:2956:2: ( rule__Connector__PropsAssignment_2 )?
            {
             before(grammarAccess.getConnectorAccess().getPropsAssignment_2()); 
            // InternalCanvas.g:2957:2: ( rule__Connector__PropsAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==12||LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCanvas.g:2957:3: rule__Connector__PropsAssignment_2
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
    // InternalCanvas.g:2965:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2969:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalCanvas.g:2970:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalCanvas.g:2977:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__PolylineAssignment_3 )? ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2981:1: ( ( ( rule__Connector__PolylineAssignment_3 )? ) )
            // InternalCanvas.g:2982:1: ( ( rule__Connector__PolylineAssignment_3 )? )
            {
            // InternalCanvas.g:2982:1: ( ( rule__Connector__PolylineAssignment_3 )? )
            // InternalCanvas.g:2983:2: ( rule__Connector__PolylineAssignment_3 )?
            {
             before(grammarAccess.getConnectorAccess().getPolylineAssignment_3()); 
            // InternalCanvas.g:2984:2: ( rule__Connector__PolylineAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27||LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCanvas.g:2984:3: rule__Connector__PolylineAssignment_3
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
    // InternalCanvas.g:2992:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl rule__Connector__Group__5 ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:2996:1: ( rule__Connector__Group__4__Impl rule__Connector__Group__5 )
            // InternalCanvas.g:2997:2: rule__Connector__Group__4__Impl rule__Connector__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalCanvas.g:3004:1: rule__Connector__Group__4__Impl : ( ( rule__Connector__AnchorsAssignment_4 )? ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3008:1: ( ( ( rule__Connector__AnchorsAssignment_4 )? ) )
            // InternalCanvas.g:3009:1: ( ( rule__Connector__AnchorsAssignment_4 )? )
            {
            // InternalCanvas.g:3009:1: ( ( rule__Connector__AnchorsAssignment_4 )? )
            // InternalCanvas.g:3010:2: ( rule__Connector__AnchorsAssignment_4 )?
            {
             before(grammarAccess.getConnectorAccess().getAnchorsAssignment_4()); 
            // InternalCanvas.g:3011:2: ( rule__Connector__AnchorsAssignment_4 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22||LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCanvas.g:3011:3: rule__Connector__AnchorsAssignment_4
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
    // InternalCanvas.g:3019:1: rule__Connector__Group__5 : rule__Connector__Group__5__Impl rule__Connector__Group__6 ;
    public final void rule__Connector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3023:1: ( rule__Connector__Group__5__Impl rule__Connector__Group__6 )
            // InternalCanvas.g:3024:2: rule__Connector__Group__5__Impl rule__Connector__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalCanvas.g:3031:1: rule__Connector__Group__5__Impl : ( ( rule__Connector__Alternatives_5 ) ) ;
    public final void rule__Connector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3035:1: ( ( ( rule__Connector__Alternatives_5 ) ) )
            // InternalCanvas.g:3036:1: ( ( rule__Connector__Alternatives_5 ) )
            {
            // InternalCanvas.g:3036:1: ( ( rule__Connector__Alternatives_5 ) )
            // InternalCanvas.g:3037:2: ( rule__Connector__Alternatives_5 )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives_5()); 
            // InternalCanvas.g:3038:2: ( rule__Connector__Alternatives_5 )
            // InternalCanvas.g:3038:3: rule__Connector__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getAlternatives_5()); 

            }


            }

        }
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
    // InternalCanvas.g:3046:1: rule__Connector__Group__6 : rule__Connector__Group__6__Impl ;
    public final void rule__Connector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3050:1: ( rule__Connector__Group__6__Impl )
            // InternalCanvas.g:3051:2: rule__Connector__Group__6__Impl
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
    // InternalCanvas.g:3057:1: rule__Connector__Group__6__Impl : ( ( rule__Connector__RepresentsAssignment_6 ) ) ;
    public final void rule__Connector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3061:1: ( ( ( rule__Connector__RepresentsAssignment_6 ) ) )
            // InternalCanvas.g:3062:1: ( ( rule__Connector__RepresentsAssignment_6 ) )
            {
            // InternalCanvas.g:3062:1: ( ( rule__Connector__RepresentsAssignment_6 ) )
            // InternalCanvas.g:3063:2: ( rule__Connector__RepresentsAssignment_6 )
            {
             before(grammarAccess.getConnectorAccess().getRepresentsAssignment_6()); 
            // InternalCanvas.g:3064:2: ( rule__Connector__RepresentsAssignment_6 )
            // InternalCanvas.g:3064:3: rule__Connector__RepresentsAssignment_6
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


    // $ANTLR start "rule__Connector__Group_0_0__0"
    // InternalCanvas.g:3073:1: rule__Connector__Group_0_0__0 : rule__Connector__Group_0_0__0__Impl rule__Connector__Group_0_0__1 ;
    public final void rule__Connector__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3077:1: ( rule__Connector__Group_0_0__0__Impl rule__Connector__Group_0_0__1 )
            // InternalCanvas.g:3078:2: rule__Connector__Group_0_0__0__Impl rule__Connector__Group_0_0__1
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
    // InternalCanvas.g:3085:1: rule__Connector__Group_0_0__0__Impl : ( 'connector' ) ;
    public final void rule__Connector__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3089:1: ( ( 'connector' ) )
            // InternalCanvas.g:3090:1: ( 'connector' )
            {
            // InternalCanvas.g:3090:1: ( 'connector' )
            // InternalCanvas.g:3091:2: 'connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCanvas.g:3100:1: rule__Connector__Group_0_0__1 : rule__Connector__Group_0_0__1__Impl ;
    public final void rule__Connector__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3104:1: ( rule__Connector__Group_0_0__1__Impl )
            // InternalCanvas.g:3105:2: rule__Connector__Group_0_0__1__Impl
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
    // InternalCanvas.g:3111:1: rule__Connector__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Connector__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3115:1: ( ( ':' ) )
            // InternalCanvas.g:3116:1: ( ':' )
            {
            // InternalCanvas.g:3116:1: ( ':' )
            // InternalCanvas.g:3117:2: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_0_0_1()); 
            match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__Connector__Group_5_0__0"
    // InternalCanvas.g:3127:1: rule__Connector__Group_5_0__0 : rule__Connector__Group_5_0__0__Impl rule__Connector__Group_5_0__1 ;
    public final void rule__Connector__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3131:1: ( rule__Connector__Group_5_0__0__Impl rule__Connector__Group_5_0__1 )
            // InternalCanvas.g:3132:2: rule__Connector__Group_5_0__0__Impl rule__Connector__Group_5_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Connector__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_5_0__0"


    // $ANTLR start "rule__Connector__Group_5_0__0__Impl"
    // InternalCanvas.g:3139:1: rule__Connector__Group_5_0__0__Impl : ( 'render' ) ;
    public final void rule__Connector__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3143:1: ( ( 'render' ) )
            // InternalCanvas.g:3144:1: ( 'render' )
            {
            // InternalCanvas.g:3144:1: ( 'render' )
            // InternalCanvas.g:3145:2: 'render'
            {
             before(grammarAccess.getConnectorAccess().getRenderKeyword_5_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getRenderKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_5_0__0__Impl"


    // $ANTLR start "rule__Connector__Group_5_0__1"
    // InternalCanvas.g:3154:1: rule__Connector__Group_5_0__1 : rule__Connector__Group_5_0__1__Impl ;
    public final void rule__Connector__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3158:1: ( rule__Connector__Group_5_0__1__Impl )
            // InternalCanvas.g:3159:2: rule__Connector__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group_5_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_5_0__1"


    // $ANTLR start "rule__Connector__Group_5_0__1__Impl"
    // InternalCanvas.g:3165:1: rule__Connector__Group_5_0__1__Impl : ( ':' ) ;
    public final void rule__Connector__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3169:1: ( ( ':' ) )
            // InternalCanvas.g:3170:1: ( ':' )
            {
            // InternalCanvas.g:3170:1: ( ':' )
            // InternalCanvas.g:3171:2: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_5_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getColonKeyword_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group_5_0__1__Impl"


    // $ANTLR start "rule__Anchors__Group__0"
    // InternalCanvas.g:3181:1: rule__Anchors__Group__0 : rule__Anchors__Group__0__Impl rule__Anchors__Group__1 ;
    public final void rule__Anchors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3185:1: ( rule__Anchors__Group__0__Impl rule__Anchors__Group__1 )
            // InternalCanvas.g:3186:2: rule__Anchors__Group__0__Impl rule__Anchors__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalCanvas.g:3193:1: rule__Anchors__Group__0__Impl : ( ( rule__Anchors__Alternatives_0 ) ) ;
    public final void rule__Anchors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3197:1: ( ( ( rule__Anchors__Alternatives_0 ) ) )
            // InternalCanvas.g:3198:1: ( ( rule__Anchors__Alternatives_0 ) )
            {
            // InternalCanvas.g:3198:1: ( ( rule__Anchors__Alternatives_0 ) )
            // InternalCanvas.g:3199:2: ( rule__Anchors__Alternatives_0 )
            {
             before(grammarAccess.getAnchorsAccess().getAlternatives_0()); 
            // InternalCanvas.g:3200:2: ( rule__Anchors__Alternatives_0 )
            // InternalCanvas.g:3200:3: rule__Anchors__Alternatives_0
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
    // InternalCanvas.g:3208:1: rule__Anchors__Group__1 : rule__Anchors__Group__1__Impl rule__Anchors__Group__2 ;
    public final void rule__Anchors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3212:1: ( rule__Anchors__Group__1__Impl rule__Anchors__Group__2 )
            // InternalCanvas.g:3213:2: rule__Anchors__Group__1__Impl rule__Anchors__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalCanvas.g:3220:1: rule__Anchors__Group__1__Impl : ( ( rule__Anchors__StartAnchorAssignment_1 ) ) ;
    public final void rule__Anchors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3224:1: ( ( ( rule__Anchors__StartAnchorAssignment_1 ) ) )
            // InternalCanvas.g:3225:1: ( ( rule__Anchors__StartAnchorAssignment_1 ) )
            {
            // InternalCanvas.g:3225:1: ( ( rule__Anchors__StartAnchorAssignment_1 ) )
            // InternalCanvas.g:3226:2: ( rule__Anchors__StartAnchorAssignment_1 )
            {
             before(grammarAccess.getAnchorsAccess().getStartAnchorAssignment_1()); 
            // InternalCanvas.g:3227:2: ( rule__Anchors__StartAnchorAssignment_1 )
            // InternalCanvas.g:3227:3: rule__Anchors__StartAnchorAssignment_1
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
    // InternalCanvas.g:3235:1: rule__Anchors__Group__2 : rule__Anchors__Group__2__Impl ;
    public final void rule__Anchors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3239:1: ( rule__Anchors__Group__2__Impl )
            // InternalCanvas.g:3240:2: rule__Anchors__Group__2__Impl
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
    // InternalCanvas.g:3246:1: rule__Anchors__Group__2__Impl : ( ( rule__Anchors__EndAnchorAssignment_2 ) ) ;
    public final void rule__Anchors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3250:1: ( ( ( rule__Anchors__EndAnchorAssignment_2 ) ) )
            // InternalCanvas.g:3251:1: ( ( rule__Anchors__EndAnchorAssignment_2 ) )
            {
            // InternalCanvas.g:3251:1: ( ( rule__Anchors__EndAnchorAssignment_2 ) )
            // InternalCanvas.g:3252:2: ( rule__Anchors__EndAnchorAssignment_2 )
            {
             before(grammarAccess.getAnchorsAccess().getEndAnchorAssignment_2()); 
            // InternalCanvas.g:3253:2: ( rule__Anchors__EndAnchorAssignment_2 )
            // InternalCanvas.g:3253:3: rule__Anchors__EndAnchorAssignment_2
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
    // InternalCanvas.g:3262:1: rule__Anchors__Group_0_0__0 : rule__Anchors__Group_0_0__0__Impl rule__Anchors__Group_0_0__1 ;
    public final void rule__Anchors__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3266:1: ( rule__Anchors__Group_0_0__0__Impl rule__Anchors__Group_0_0__1 )
            // InternalCanvas.g:3267:2: rule__Anchors__Group_0_0__0__Impl rule__Anchors__Group_0_0__1
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
    // InternalCanvas.g:3274:1: rule__Anchors__Group_0_0__0__Impl : ( 'anchors' ) ;
    public final void rule__Anchors__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3278:1: ( ( 'anchors' ) )
            // InternalCanvas.g:3279:1: ( 'anchors' )
            {
            // InternalCanvas.g:3279:1: ( 'anchors' )
            // InternalCanvas.g:3280:2: 'anchors'
            {
             before(grammarAccess.getAnchorsAccess().getAnchorsKeyword_0_0_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCanvas.g:3289:1: rule__Anchors__Group_0_0__1 : rule__Anchors__Group_0_0__1__Impl ;
    public final void rule__Anchors__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3293:1: ( rule__Anchors__Group_0_0__1__Impl )
            // InternalCanvas.g:3294:2: rule__Anchors__Group_0_0__1__Impl
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
    // InternalCanvas.g:3300:1: rule__Anchors__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Anchors__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3304:1: ( ( ':' ) )
            // InternalCanvas.g:3305:1: ( ':' )
            {
            // InternalCanvas.g:3305:1: ( ':' )
            // InternalCanvas.g:3306:2: ':'
            {
             before(grammarAccess.getAnchorsAccess().getColonKeyword_0_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:3316:1: rule__StartAnchor__Group__0 : rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1 ;
    public final void rule__StartAnchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3320:1: ( rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1 )
            // InternalCanvas.g:3321:2: rule__StartAnchor__Group__0__Impl rule__StartAnchor__Group__1
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
    // InternalCanvas.g:3328:1: rule__StartAnchor__Group__0__Impl : ( ( rule__StartAnchor__Alternatives_0 ) ) ;
    public final void rule__StartAnchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3332:1: ( ( ( rule__StartAnchor__Alternatives_0 ) ) )
            // InternalCanvas.g:3333:1: ( ( rule__StartAnchor__Alternatives_0 ) )
            {
            // InternalCanvas.g:3333:1: ( ( rule__StartAnchor__Alternatives_0 ) )
            // InternalCanvas.g:3334:2: ( rule__StartAnchor__Alternatives_0 )
            {
             before(grammarAccess.getStartAnchorAccess().getAlternatives_0()); 
            // InternalCanvas.g:3335:2: ( rule__StartAnchor__Alternatives_0 )
            // InternalCanvas.g:3335:3: rule__StartAnchor__Alternatives_0
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
    // InternalCanvas.g:3343:1: rule__StartAnchor__Group__1 : rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2 ;
    public final void rule__StartAnchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3347:1: ( rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2 )
            // InternalCanvas.g:3348:2: rule__StartAnchor__Group__1__Impl rule__StartAnchor__Group__2
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
    // InternalCanvas.g:3355:1: rule__StartAnchor__Group__1__Impl : ( ( rule__StartAnchor__PointAssignment_1 ) ) ;
    public final void rule__StartAnchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3359:1: ( ( ( rule__StartAnchor__PointAssignment_1 ) ) )
            // InternalCanvas.g:3360:1: ( ( rule__StartAnchor__PointAssignment_1 ) )
            {
            // InternalCanvas.g:3360:1: ( ( rule__StartAnchor__PointAssignment_1 ) )
            // InternalCanvas.g:3361:2: ( rule__StartAnchor__PointAssignment_1 )
            {
             before(grammarAccess.getStartAnchorAccess().getPointAssignment_1()); 
            // InternalCanvas.g:3362:2: ( rule__StartAnchor__PointAssignment_1 )
            // InternalCanvas.g:3362:3: rule__StartAnchor__PointAssignment_1
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
    // InternalCanvas.g:3370:1: rule__StartAnchor__Group__2 : rule__StartAnchor__Group__2__Impl ;
    public final void rule__StartAnchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3374:1: ( rule__StartAnchor__Group__2__Impl )
            // InternalCanvas.g:3375:2: rule__StartAnchor__Group__2__Impl
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
    // InternalCanvas.g:3381:1: rule__StartAnchor__Group__2__Impl : ( ( rule__StartAnchor__AnchorAssignment_2 )? ) ;
    public final void rule__StartAnchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3385:1: ( ( ( rule__StartAnchor__AnchorAssignment_2 )? ) )
            // InternalCanvas.g:3386:1: ( ( rule__StartAnchor__AnchorAssignment_2 )? )
            {
            // InternalCanvas.g:3386:1: ( ( rule__StartAnchor__AnchorAssignment_2 )? )
            // InternalCanvas.g:3387:2: ( rule__StartAnchor__AnchorAssignment_2 )?
            {
             before(grammarAccess.getStartAnchorAccess().getAnchorAssignment_2()); 
            // InternalCanvas.g:3388:2: ( rule__StartAnchor__AnchorAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=25 && LA38_0<=26)||(LA38_0>=46 && LA38_0<=47)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCanvas.g:3388:3: rule__StartAnchor__AnchorAssignment_2
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
    // InternalCanvas.g:3397:1: rule__StartAnchor__Group_0_0__0 : rule__StartAnchor__Group_0_0__0__Impl rule__StartAnchor__Group_0_0__1 ;
    public final void rule__StartAnchor__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3401:1: ( rule__StartAnchor__Group_0_0__0__Impl rule__StartAnchor__Group_0_0__1 )
            // InternalCanvas.g:3402:2: rule__StartAnchor__Group_0_0__0__Impl rule__StartAnchor__Group_0_0__1
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
    // InternalCanvas.g:3409:1: rule__StartAnchor__Group_0_0__0__Impl : ( 'start' ) ;
    public final void rule__StartAnchor__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3413:1: ( ( 'start' ) )
            // InternalCanvas.g:3414:1: ( 'start' )
            {
            // InternalCanvas.g:3414:1: ( 'start' )
            // InternalCanvas.g:3415:2: 'start'
            {
             before(grammarAccess.getStartAnchorAccess().getStartKeyword_0_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCanvas.g:3424:1: rule__StartAnchor__Group_0_0__1 : rule__StartAnchor__Group_0_0__1__Impl ;
    public final void rule__StartAnchor__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3428:1: ( rule__StartAnchor__Group_0_0__1__Impl )
            // InternalCanvas.g:3429:2: rule__StartAnchor__Group_0_0__1__Impl
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
    // InternalCanvas.g:3435:1: rule__StartAnchor__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__StartAnchor__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3439:1: ( ( ':' ) )
            // InternalCanvas.g:3440:1: ( ':' )
            {
            // InternalCanvas.g:3440:1: ( ':' )
            // InternalCanvas.g:3441:2: ':'
            {
             before(grammarAccess.getStartAnchorAccess().getColonKeyword_0_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:3451:1: rule__EndAnchor__Group__0 : rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1 ;
    public final void rule__EndAnchor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3455:1: ( rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1 )
            // InternalCanvas.g:3456:2: rule__EndAnchor__Group__0__Impl rule__EndAnchor__Group__1
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
    // InternalCanvas.g:3463:1: rule__EndAnchor__Group__0__Impl : ( ( rule__EndAnchor__Alternatives_0 ) ) ;
    public final void rule__EndAnchor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3467:1: ( ( ( rule__EndAnchor__Alternatives_0 ) ) )
            // InternalCanvas.g:3468:1: ( ( rule__EndAnchor__Alternatives_0 ) )
            {
            // InternalCanvas.g:3468:1: ( ( rule__EndAnchor__Alternatives_0 ) )
            // InternalCanvas.g:3469:2: ( rule__EndAnchor__Alternatives_0 )
            {
             before(grammarAccess.getEndAnchorAccess().getAlternatives_0()); 
            // InternalCanvas.g:3470:2: ( rule__EndAnchor__Alternatives_0 )
            // InternalCanvas.g:3470:3: rule__EndAnchor__Alternatives_0
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
    // InternalCanvas.g:3478:1: rule__EndAnchor__Group__1 : rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2 ;
    public final void rule__EndAnchor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3482:1: ( rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2 )
            // InternalCanvas.g:3483:2: rule__EndAnchor__Group__1__Impl rule__EndAnchor__Group__2
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
    // InternalCanvas.g:3490:1: rule__EndAnchor__Group__1__Impl : ( ( rule__EndAnchor__PointAssignment_1 ) ) ;
    public final void rule__EndAnchor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3494:1: ( ( ( rule__EndAnchor__PointAssignment_1 ) ) )
            // InternalCanvas.g:3495:1: ( ( rule__EndAnchor__PointAssignment_1 ) )
            {
            // InternalCanvas.g:3495:1: ( ( rule__EndAnchor__PointAssignment_1 ) )
            // InternalCanvas.g:3496:2: ( rule__EndAnchor__PointAssignment_1 )
            {
             before(grammarAccess.getEndAnchorAccess().getPointAssignment_1()); 
            // InternalCanvas.g:3497:2: ( rule__EndAnchor__PointAssignment_1 )
            // InternalCanvas.g:3497:3: rule__EndAnchor__PointAssignment_1
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
    // InternalCanvas.g:3505:1: rule__EndAnchor__Group__2 : rule__EndAnchor__Group__2__Impl ;
    public final void rule__EndAnchor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3509:1: ( rule__EndAnchor__Group__2__Impl )
            // InternalCanvas.g:3510:2: rule__EndAnchor__Group__2__Impl
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
    // InternalCanvas.g:3516:1: rule__EndAnchor__Group__2__Impl : ( ( rule__EndAnchor__AnchorAssignment_2 )? ) ;
    public final void rule__EndAnchor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3520:1: ( ( ( rule__EndAnchor__AnchorAssignment_2 )? ) )
            // InternalCanvas.g:3521:1: ( ( rule__EndAnchor__AnchorAssignment_2 )? )
            {
            // InternalCanvas.g:3521:1: ( ( rule__EndAnchor__AnchorAssignment_2 )? )
            // InternalCanvas.g:3522:2: ( rule__EndAnchor__AnchorAssignment_2 )?
            {
             before(grammarAccess.getEndAnchorAccess().getAnchorAssignment_2()); 
            // InternalCanvas.g:3523:2: ( rule__EndAnchor__AnchorAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=25 && LA39_0<=26)||(LA39_0>=46 && LA39_0<=47)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCanvas.g:3523:3: rule__EndAnchor__AnchorAssignment_2
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
    // InternalCanvas.g:3532:1: rule__EndAnchor__Group_0_0__0 : rule__EndAnchor__Group_0_0__0__Impl rule__EndAnchor__Group_0_0__1 ;
    public final void rule__EndAnchor__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3536:1: ( rule__EndAnchor__Group_0_0__0__Impl rule__EndAnchor__Group_0_0__1 )
            // InternalCanvas.g:3537:2: rule__EndAnchor__Group_0_0__0__Impl rule__EndAnchor__Group_0_0__1
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
    // InternalCanvas.g:3544:1: rule__EndAnchor__Group_0_0__0__Impl : ( 'end' ) ;
    public final void rule__EndAnchor__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3548:1: ( ( 'end' ) )
            // InternalCanvas.g:3549:1: ( 'end' )
            {
            // InternalCanvas.g:3549:1: ( 'end' )
            // InternalCanvas.g:3550:2: 'end'
            {
             before(grammarAccess.getEndAnchorAccess().getEndKeyword_0_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCanvas.g:3559:1: rule__EndAnchor__Group_0_0__1 : rule__EndAnchor__Group_0_0__1__Impl ;
    public final void rule__EndAnchor__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3563:1: ( rule__EndAnchor__Group_0_0__1__Impl )
            // InternalCanvas.g:3564:2: rule__EndAnchor__Group_0_0__1__Impl
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
    // InternalCanvas.g:3570:1: rule__EndAnchor__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__EndAnchor__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3574:1: ( ( ':' ) )
            // InternalCanvas.g:3575:1: ( ':' )
            {
            // InternalCanvas.g:3575:1: ( ':' )
            // InternalCanvas.g:3576:2: ':'
            {
             before(grammarAccess.getEndAnchorAccess().getColonKeyword_0_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:3586:1: rule__ShapeAnchorElement__Group__0 : rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1 ;
    public final void rule__ShapeAnchorElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3590:1: ( rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1 )
            // InternalCanvas.g:3591:2: rule__ShapeAnchorElement__Group__0__Impl rule__ShapeAnchorElement__Group__1
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
    // InternalCanvas.g:3598:1: rule__ShapeAnchorElement__Group__0__Impl : ( ( rule__ShapeAnchorElement__Alternatives_0 ) ) ;
    public final void rule__ShapeAnchorElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3602:1: ( ( ( rule__ShapeAnchorElement__Alternatives_0 ) ) )
            // InternalCanvas.g:3603:1: ( ( rule__ShapeAnchorElement__Alternatives_0 ) )
            {
            // InternalCanvas.g:3603:1: ( ( rule__ShapeAnchorElement__Alternatives_0 ) )
            // InternalCanvas.g:3604:2: ( rule__ShapeAnchorElement__Alternatives_0 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getAlternatives_0()); 
            // InternalCanvas.g:3605:2: ( rule__ShapeAnchorElement__Alternatives_0 )
            // InternalCanvas.g:3605:3: rule__ShapeAnchorElement__Alternatives_0
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
    // InternalCanvas.g:3613:1: rule__ShapeAnchorElement__Group__1 : rule__ShapeAnchorElement__Group__1__Impl ;
    public final void rule__ShapeAnchorElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3617:1: ( rule__ShapeAnchorElement__Group__1__Impl )
            // InternalCanvas.g:3618:2: rule__ShapeAnchorElement__Group__1__Impl
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
    // InternalCanvas.g:3624:1: rule__ShapeAnchorElement__Group__1__Impl : ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) ) ;
    public final void rule__ShapeAnchorElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3628:1: ( ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) ) )
            // InternalCanvas.g:3629:1: ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) )
            {
            // InternalCanvas.g:3629:1: ( ( rule__ShapeAnchorElement__ElementAssignment_1 ) )
            // InternalCanvas.g:3630:2: ( rule__ShapeAnchorElement__ElementAssignment_1 )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementAssignment_1()); 
            // InternalCanvas.g:3631:2: ( rule__ShapeAnchorElement__ElementAssignment_1 )
            // InternalCanvas.g:3631:3: rule__ShapeAnchorElement__ElementAssignment_1
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
    // InternalCanvas.g:3640:1: rule__ShapeAnchorElement__Group_0_0__0 : rule__ShapeAnchorElement__Group_0_0__0__Impl rule__ShapeAnchorElement__Group_0_0__1 ;
    public final void rule__ShapeAnchorElement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3644:1: ( rule__ShapeAnchorElement__Group_0_0__0__Impl rule__ShapeAnchorElement__Group_0_0__1 )
            // InternalCanvas.g:3645:2: rule__ShapeAnchorElement__Group_0_0__0__Impl rule__ShapeAnchorElement__Group_0_0__1
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
    // InternalCanvas.g:3652:1: rule__ShapeAnchorElement__Group_0_0__0__Impl : ( 'shapeAnchor' ) ;
    public final void rule__ShapeAnchorElement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3656:1: ( ( 'shapeAnchor' ) )
            // InternalCanvas.g:3657:1: ( 'shapeAnchor' )
            {
            // InternalCanvas.g:3657:1: ( 'shapeAnchor' )
            // InternalCanvas.g:3658:2: 'shapeAnchor'
            {
             before(grammarAccess.getShapeAnchorElementAccess().getShapeAnchorKeyword_0_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCanvas.g:3667:1: rule__ShapeAnchorElement__Group_0_0__1 : rule__ShapeAnchorElement__Group_0_0__1__Impl ;
    public final void rule__ShapeAnchorElement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3671:1: ( rule__ShapeAnchorElement__Group_0_0__1__Impl )
            // InternalCanvas.g:3672:2: rule__ShapeAnchorElement__Group_0_0__1__Impl
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
    // InternalCanvas.g:3678:1: rule__ShapeAnchorElement__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ShapeAnchorElement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3682:1: ( ( ':' ) )
            // InternalCanvas.g:3683:1: ( ':' )
            {
            // InternalCanvas.g:3683:1: ( ':' )
            // InternalCanvas.g:3684:2: ':'
            {
             before(grammarAccess.getShapeAnchorElementAccess().getColonKeyword_0_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:3694:1: rule__ConnectorAnchorElement__Group__0 : rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1 ;
    public final void rule__ConnectorAnchorElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3698:1: ( rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1 )
            // InternalCanvas.g:3699:2: rule__ConnectorAnchorElement__Group__0__Impl rule__ConnectorAnchorElement__Group__1
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
    // InternalCanvas.g:3706:1: rule__ConnectorAnchorElement__Group__0__Impl : ( ( rule__ConnectorAnchorElement__Alternatives_0 ) ) ;
    public final void rule__ConnectorAnchorElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3710:1: ( ( ( rule__ConnectorAnchorElement__Alternatives_0 ) ) )
            // InternalCanvas.g:3711:1: ( ( rule__ConnectorAnchorElement__Alternatives_0 ) )
            {
            // InternalCanvas.g:3711:1: ( ( rule__ConnectorAnchorElement__Alternatives_0 ) )
            // InternalCanvas.g:3712:2: ( rule__ConnectorAnchorElement__Alternatives_0 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getAlternatives_0()); 
            // InternalCanvas.g:3713:2: ( rule__ConnectorAnchorElement__Alternatives_0 )
            // InternalCanvas.g:3713:3: rule__ConnectorAnchorElement__Alternatives_0
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
    // InternalCanvas.g:3721:1: rule__ConnectorAnchorElement__Group__1 : rule__ConnectorAnchorElement__Group__1__Impl ;
    public final void rule__ConnectorAnchorElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3725:1: ( rule__ConnectorAnchorElement__Group__1__Impl )
            // InternalCanvas.g:3726:2: rule__ConnectorAnchorElement__Group__1__Impl
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
    // InternalCanvas.g:3732:1: rule__ConnectorAnchorElement__Group__1__Impl : ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) ) ;
    public final void rule__ConnectorAnchorElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3736:1: ( ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) ) )
            // InternalCanvas.g:3737:1: ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) )
            {
            // InternalCanvas.g:3737:1: ( ( rule__ConnectorAnchorElement__ElementAssignment_1 ) )
            // InternalCanvas.g:3738:2: ( rule__ConnectorAnchorElement__ElementAssignment_1 )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementAssignment_1()); 
            // InternalCanvas.g:3739:2: ( rule__ConnectorAnchorElement__ElementAssignment_1 )
            // InternalCanvas.g:3739:3: rule__ConnectorAnchorElement__ElementAssignment_1
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
    // InternalCanvas.g:3748:1: rule__ConnectorAnchorElement__Group_0_0__0 : rule__ConnectorAnchorElement__Group_0_0__0__Impl rule__ConnectorAnchorElement__Group_0_0__1 ;
    public final void rule__ConnectorAnchorElement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3752:1: ( rule__ConnectorAnchorElement__Group_0_0__0__Impl rule__ConnectorAnchorElement__Group_0_0__1 )
            // InternalCanvas.g:3753:2: rule__ConnectorAnchorElement__Group_0_0__0__Impl rule__ConnectorAnchorElement__Group_0_0__1
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
    // InternalCanvas.g:3760:1: rule__ConnectorAnchorElement__Group_0_0__0__Impl : ( 'segmentAnchor' ) ;
    public final void rule__ConnectorAnchorElement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3764:1: ( ( 'segmentAnchor' ) )
            // InternalCanvas.g:3765:1: ( 'segmentAnchor' )
            {
            // InternalCanvas.g:3765:1: ( 'segmentAnchor' )
            // InternalCanvas.g:3766:2: 'segmentAnchor'
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getSegmentAnchorKeyword_0_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCanvas.g:3775:1: rule__ConnectorAnchorElement__Group_0_0__1 : rule__ConnectorAnchorElement__Group_0_0__1__Impl ;
    public final void rule__ConnectorAnchorElement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3779:1: ( rule__ConnectorAnchorElement__Group_0_0__1__Impl )
            // InternalCanvas.g:3780:2: rule__ConnectorAnchorElement__Group_0_0__1__Impl
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
    // InternalCanvas.g:3786:1: rule__ConnectorAnchorElement__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__ConnectorAnchorElement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3790:1: ( ( ':' ) )
            // InternalCanvas.g:3791:1: ( ':' )
            {
            // InternalCanvas.g:3791:1: ( ':' )
            // InternalCanvas.g:3792:2: ':'
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getColonKeyword_0_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:3802:1: rule__ConnectorProps__Group__0 : rule__ConnectorProps__Group__0__Impl rule__ConnectorProps__Group__1 ;
    public final void rule__ConnectorProps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3806:1: ( rule__ConnectorProps__Group__0__Impl rule__ConnectorProps__Group__1 )
            // InternalCanvas.g:3807:2: rule__ConnectorProps__Group__0__Impl rule__ConnectorProps__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCanvas.g:3814:1: rule__ConnectorProps__Group__0__Impl : ( () ) ;
    public final void rule__ConnectorProps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3818:1: ( ( () ) )
            // InternalCanvas.g:3819:1: ( () )
            {
            // InternalCanvas.g:3819:1: ( () )
            // InternalCanvas.g:3820:2: ()
            {
             before(grammarAccess.getConnectorPropsAccess().getConnectorPropsAction_0()); 
            // InternalCanvas.g:3821:2: ()
            // InternalCanvas.g:3821:3: 
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
    // InternalCanvas.g:3829:1: rule__ConnectorProps__Group__1 : rule__ConnectorProps__Group__1__Impl rule__ConnectorProps__Group__2 ;
    public final void rule__ConnectorProps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3833:1: ( rule__ConnectorProps__Group__1__Impl rule__ConnectorProps__Group__2 )
            // InternalCanvas.g:3834:2: rule__ConnectorProps__Group__1__Impl rule__ConnectorProps__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalCanvas.g:3841:1: rule__ConnectorProps__Group__1__Impl : ( ( rule__ConnectorProps__Alternatives_1 ) ) ;
    public final void rule__ConnectorProps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3845:1: ( ( ( rule__ConnectorProps__Alternatives_1 ) ) )
            // InternalCanvas.g:3846:1: ( ( rule__ConnectorProps__Alternatives_1 ) )
            {
            // InternalCanvas.g:3846:1: ( ( rule__ConnectorProps__Alternatives_1 ) )
            // InternalCanvas.g:3847:2: ( rule__ConnectorProps__Alternatives_1 )
            {
             before(grammarAccess.getConnectorPropsAccess().getAlternatives_1()); 
            // InternalCanvas.g:3848:2: ( rule__ConnectorProps__Alternatives_1 )
            // InternalCanvas.g:3848:3: rule__ConnectorProps__Alternatives_1
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
    // InternalCanvas.g:3856:1: rule__ConnectorProps__Group__2 : rule__ConnectorProps__Group__2__Impl ;
    public final void rule__ConnectorProps__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3860:1: ( rule__ConnectorProps__Group__2__Impl )
            // InternalCanvas.g:3861:2: rule__ConnectorProps__Group__2__Impl
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
    // InternalCanvas.g:3867:1: rule__ConnectorProps__Group__2__Impl : ( ( rule__ConnectorProps__ColorAssignment_2 )? ) ;
    public final void rule__ConnectorProps__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3871:1: ( ( ( rule__ConnectorProps__ColorAssignment_2 )? ) )
            // InternalCanvas.g:3872:1: ( ( rule__ConnectorProps__ColorAssignment_2 )? )
            {
            // InternalCanvas.g:3872:1: ( ( rule__ConnectorProps__ColorAssignment_2 )? )
            // InternalCanvas.g:3873:2: ( rule__ConnectorProps__ColorAssignment_2 )?
            {
             before(grammarAccess.getConnectorPropsAccess().getColorAssignment_2()); 
            // InternalCanvas.g:3874:2: ( rule__ConnectorProps__ColorAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCanvas.g:3874:3: rule__ConnectorProps__ColorAssignment_2
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
    // InternalCanvas.g:3883:1: rule__ConnectorProps__Group_1_0__0 : rule__ConnectorProps__Group_1_0__0__Impl rule__ConnectorProps__Group_1_0__1 ;
    public final void rule__ConnectorProps__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3887:1: ( rule__ConnectorProps__Group_1_0__0__Impl rule__ConnectorProps__Group_1_0__1 )
            // InternalCanvas.g:3888:2: rule__ConnectorProps__Group_1_0__0__Impl rule__ConnectorProps__Group_1_0__1
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
    // InternalCanvas.g:3895:1: rule__ConnectorProps__Group_1_0__0__Impl : ( 'properties' ) ;
    public final void rule__ConnectorProps__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3899:1: ( ( 'properties' ) )
            // InternalCanvas.g:3900:1: ( 'properties' )
            {
            // InternalCanvas.g:3900:1: ( 'properties' )
            // InternalCanvas.g:3901:2: 'properties'
            {
             before(grammarAccess.getConnectorPropsAccess().getPropertiesKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCanvas.g:3910:1: rule__ConnectorProps__Group_1_0__1 : rule__ConnectorProps__Group_1_0__1__Impl ;
    public final void rule__ConnectorProps__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3914:1: ( rule__ConnectorProps__Group_1_0__1__Impl )
            // InternalCanvas.g:3915:2: rule__ConnectorProps__Group_1_0__1__Impl
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
    // InternalCanvas.g:3921:1: rule__ConnectorProps__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__ConnectorProps__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3925:1: ( ( ':' ) )
            // InternalCanvas.g:3926:1: ( ':' )
            {
            // InternalCanvas.g:3926:1: ( ':' )
            // InternalCanvas.g:3927:2: ':'
            {
             before(grammarAccess.getConnectorPropsAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:3937:1: rule__Polyline__Group__0 : rule__Polyline__Group__0__Impl rule__Polyline__Group__1 ;
    public final void rule__Polyline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3941:1: ( rule__Polyline__Group__0__Impl rule__Polyline__Group__1 )
            // InternalCanvas.g:3942:2: rule__Polyline__Group__0__Impl rule__Polyline__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCanvas.g:3949:1: rule__Polyline__Group__0__Impl : ( () ) ;
    public final void rule__Polyline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3953:1: ( ( () ) )
            // InternalCanvas.g:3954:1: ( () )
            {
            // InternalCanvas.g:3954:1: ( () )
            // InternalCanvas.g:3955:2: ()
            {
             before(grammarAccess.getPolylineAccess().getPolylineAction_0()); 
            // InternalCanvas.g:3956:2: ()
            // InternalCanvas.g:3956:3: 
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
    // InternalCanvas.g:3964:1: rule__Polyline__Group__1 : rule__Polyline__Group__1__Impl rule__Polyline__Group__2 ;
    public final void rule__Polyline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3968:1: ( rule__Polyline__Group__1__Impl rule__Polyline__Group__2 )
            // InternalCanvas.g:3969:2: rule__Polyline__Group__1__Impl rule__Polyline__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalCanvas.g:3976:1: rule__Polyline__Group__1__Impl : ( ( rule__Polyline__Alternatives_1 ) ) ;
    public final void rule__Polyline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3980:1: ( ( ( rule__Polyline__Alternatives_1 ) ) )
            // InternalCanvas.g:3981:1: ( ( rule__Polyline__Alternatives_1 ) )
            {
            // InternalCanvas.g:3981:1: ( ( rule__Polyline__Alternatives_1 ) )
            // InternalCanvas.g:3982:2: ( rule__Polyline__Alternatives_1 )
            {
             before(grammarAccess.getPolylineAccess().getAlternatives_1()); 
            // InternalCanvas.g:3983:2: ( rule__Polyline__Alternatives_1 )
            // InternalCanvas.g:3983:3: rule__Polyline__Alternatives_1
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
    // InternalCanvas.g:3991:1: rule__Polyline__Group__2 : rule__Polyline__Group__2__Impl ;
    public final void rule__Polyline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:3995:1: ( rule__Polyline__Group__2__Impl )
            // InternalCanvas.g:3996:2: rule__Polyline__Group__2__Impl
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
    // InternalCanvas.g:4002:1: rule__Polyline__Group__2__Impl : ( ( rule__Polyline__SegmentsAssignment_2 )* ) ;
    public final void rule__Polyline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4006:1: ( ( ( rule__Polyline__SegmentsAssignment_2 )* ) )
            // InternalCanvas.g:4007:1: ( ( rule__Polyline__SegmentsAssignment_2 )* )
            {
            // InternalCanvas.g:4007:1: ( ( rule__Polyline__SegmentsAssignment_2 )* )
            // InternalCanvas.g:4008:2: ( rule__Polyline__SegmentsAssignment_2 )*
            {
             before(grammarAccess.getPolylineAccess().getSegmentsAssignment_2()); 
            // InternalCanvas.g:4009:2: ( rule__Polyline__SegmentsAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==28||LA41_0==50) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCanvas.g:4009:3: rule__Polyline__SegmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Polyline__SegmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalCanvas.g:4018:1: rule__Polyline__Group_1_0__0 : rule__Polyline__Group_1_0__0__Impl rule__Polyline__Group_1_0__1 ;
    public final void rule__Polyline__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4022:1: ( rule__Polyline__Group_1_0__0__Impl rule__Polyline__Group_1_0__1 )
            // InternalCanvas.g:4023:2: rule__Polyline__Group_1_0__0__Impl rule__Polyline__Group_1_0__1
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
    // InternalCanvas.g:4030:1: rule__Polyline__Group_1_0__0__Impl : ( 'polyline' ) ;
    public final void rule__Polyline__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4034:1: ( ( 'polyline' ) )
            // InternalCanvas.g:4035:1: ( 'polyline' )
            {
            // InternalCanvas.g:4035:1: ( 'polyline' )
            // InternalCanvas.g:4036:2: 'polyline'
            {
             before(grammarAccess.getPolylineAccess().getPolylineKeyword_1_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCanvas.g:4045:1: rule__Polyline__Group_1_0__1 : rule__Polyline__Group_1_0__1__Impl ;
    public final void rule__Polyline__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4049:1: ( rule__Polyline__Group_1_0__1__Impl )
            // InternalCanvas.g:4050:2: rule__Polyline__Group_1_0__1__Impl
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
    // InternalCanvas.g:4056:1: rule__Polyline__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Polyline__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4060:1: ( ( ':' ) )
            // InternalCanvas.g:4061:1: ( ':' )
            {
            // InternalCanvas.g:4061:1: ( ':' )
            // InternalCanvas.g:4062:2: ':'
            {
             before(grammarAccess.getPolylineAccess().getColonKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:4072:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4076:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // InternalCanvas.g:4077:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
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
    // InternalCanvas.g:4084:1: rule__Segment__Group__0__Impl : ( ( rule__Segment__Alternatives_0 ) ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4088:1: ( ( ( rule__Segment__Alternatives_0 ) ) )
            // InternalCanvas.g:4089:1: ( ( rule__Segment__Alternatives_0 ) )
            {
            // InternalCanvas.g:4089:1: ( ( rule__Segment__Alternatives_0 ) )
            // InternalCanvas.g:4090:2: ( rule__Segment__Alternatives_0 )
            {
             before(grammarAccess.getSegmentAccess().getAlternatives_0()); 
            // InternalCanvas.g:4091:2: ( rule__Segment__Alternatives_0 )
            // InternalCanvas.g:4091:3: rule__Segment__Alternatives_0
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
    // InternalCanvas.g:4099:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4103:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // InternalCanvas.g:4104:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalCanvas.g:4111:1: rule__Segment__Group__1__Impl : ( ( rule__Segment__StartPointAssignment_1 ) ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4115:1: ( ( ( rule__Segment__StartPointAssignment_1 ) ) )
            // InternalCanvas.g:4116:1: ( ( rule__Segment__StartPointAssignment_1 ) )
            {
            // InternalCanvas.g:4116:1: ( ( rule__Segment__StartPointAssignment_1 ) )
            // InternalCanvas.g:4117:2: ( rule__Segment__StartPointAssignment_1 )
            {
             before(grammarAccess.getSegmentAccess().getStartPointAssignment_1()); 
            // InternalCanvas.g:4118:2: ( rule__Segment__StartPointAssignment_1 )
            // InternalCanvas.g:4118:3: rule__Segment__StartPointAssignment_1
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
    // InternalCanvas.g:4126:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4130:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // InternalCanvas.g:4131:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
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
    // InternalCanvas.g:4138:1: rule__Segment__Group__2__Impl : ( ',' ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4142:1: ( ( ',' ) )
            // InternalCanvas.g:4143:1: ( ',' )
            {
            // InternalCanvas.g:4143:1: ( ',' )
            // InternalCanvas.g:4144:2: ','
            {
             before(grammarAccess.getSegmentAccess().getCommaKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCanvas.g:4153:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4157:1: ( rule__Segment__Group__3__Impl )
            // InternalCanvas.g:4158:2: rule__Segment__Group__3__Impl
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
    // InternalCanvas.g:4164:1: rule__Segment__Group__3__Impl : ( ( rule__Segment__EndPointAssignment_3 ) ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4168:1: ( ( ( rule__Segment__EndPointAssignment_3 ) ) )
            // InternalCanvas.g:4169:1: ( ( rule__Segment__EndPointAssignment_3 ) )
            {
            // InternalCanvas.g:4169:1: ( ( rule__Segment__EndPointAssignment_3 ) )
            // InternalCanvas.g:4170:2: ( rule__Segment__EndPointAssignment_3 )
            {
             before(grammarAccess.getSegmentAccess().getEndPointAssignment_3()); 
            // InternalCanvas.g:4171:2: ( rule__Segment__EndPointAssignment_3 )
            // InternalCanvas.g:4171:3: rule__Segment__EndPointAssignment_3
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
    // InternalCanvas.g:4180:1: rule__Segment__Group_0_0__0 : rule__Segment__Group_0_0__0__Impl rule__Segment__Group_0_0__1 ;
    public final void rule__Segment__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4184:1: ( rule__Segment__Group_0_0__0__Impl rule__Segment__Group_0_0__1 )
            // InternalCanvas.g:4185:2: rule__Segment__Group_0_0__0__Impl rule__Segment__Group_0_0__1
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
    // InternalCanvas.g:4192:1: rule__Segment__Group_0_0__0__Impl : ( 'segment' ) ;
    public final void rule__Segment__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4196:1: ( ( 'segment' ) )
            // InternalCanvas.g:4197:1: ( 'segment' )
            {
            // InternalCanvas.g:4197:1: ( 'segment' )
            // InternalCanvas.g:4198:2: 'segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_0_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCanvas.g:4207:1: rule__Segment__Group_0_0__1 : rule__Segment__Group_0_0__1__Impl ;
    public final void rule__Segment__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4211:1: ( rule__Segment__Group_0_0__1__Impl )
            // InternalCanvas.g:4212:2: rule__Segment__Group_0_0__1__Impl
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
    // InternalCanvas.g:4218:1: rule__Segment__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Segment__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4222:1: ( ( ':' ) )
            // InternalCanvas.g:4223:1: ( ':' )
            {
            // InternalCanvas.g:4223:1: ( ':' )
            // InternalCanvas.g:4224:2: ':'
            {
             before(grammarAccess.getSegmentAccess().getColonKeyword_0_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:4234:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4238:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalCanvas.g:4239:2: rule__Point__Group__0__Impl rule__Point__Group__1
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
    // InternalCanvas.g:4246:1: rule__Point__Group__0__Impl : ( 'x' ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4250:1: ( ( 'x' ) )
            // InternalCanvas.g:4251:1: ( 'x' )
            {
            // InternalCanvas.g:4251:1: ( 'x' )
            // InternalCanvas.g:4252:2: 'x'
            {
             before(grammarAccess.getPointAccess().getXKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCanvas.g:4261:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4265:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // InternalCanvas.g:4266:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalCanvas.g:4273:1: rule__Point__Group__1__Impl : ( ( rule__Point__XAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4277:1: ( ( ( rule__Point__XAssignment_1 ) ) )
            // InternalCanvas.g:4278:1: ( ( rule__Point__XAssignment_1 ) )
            {
            // InternalCanvas.g:4278:1: ( ( rule__Point__XAssignment_1 ) )
            // InternalCanvas.g:4279:2: ( rule__Point__XAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_1()); 
            // InternalCanvas.g:4280:2: ( rule__Point__XAssignment_1 )
            // InternalCanvas.g:4280:3: rule__Point__XAssignment_1
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
    // InternalCanvas.g:4288:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4292:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // InternalCanvas.g:4293:2: rule__Point__Group__2__Impl rule__Point__Group__3
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
    // InternalCanvas.g:4300:1: rule__Point__Group__2__Impl : ( 'y' ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4304:1: ( ( 'y' ) )
            // InternalCanvas.g:4305:1: ( 'y' )
            {
            // InternalCanvas.g:4305:1: ( 'y' )
            // InternalCanvas.g:4306:2: 'y'
            {
             before(grammarAccess.getPointAccess().getYKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCanvas.g:4315:1: rule__Point__Group__3 : rule__Point__Group__3__Impl ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4319:1: ( rule__Point__Group__3__Impl )
            // InternalCanvas.g:4320:2: rule__Point__Group__3__Impl
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
    // InternalCanvas.g:4326:1: rule__Point__Group__3__Impl : ( ( rule__Point__YAssignment_3 ) ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4330:1: ( ( ( rule__Point__YAssignment_3 ) ) )
            // InternalCanvas.g:4331:1: ( ( rule__Point__YAssignment_3 ) )
            {
            // InternalCanvas.g:4331:1: ( ( rule__Point__YAssignment_3 ) )
            // InternalCanvas.g:4332:2: ( rule__Point__YAssignment_3 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_3()); 
            // InternalCanvas.g:4333:2: ( rule__Point__YAssignment_3 )
            // InternalCanvas.g:4333:3: rule__Point__YAssignment_3
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
    // InternalCanvas.g:4342:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4346:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalCanvas.g:4347:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
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
    // InternalCanvas.g:4354:1: rule__Rectangle__Group__0__Impl : ( ( rule__Rectangle__Alternatives_0 ) ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4358:1: ( ( ( rule__Rectangle__Alternatives_0 ) ) )
            // InternalCanvas.g:4359:1: ( ( rule__Rectangle__Alternatives_0 ) )
            {
            // InternalCanvas.g:4359:1: ( ( rule__Rectangle__Alternatives_0 ) )
            // InternalCanvas.g:4360:2: ( rule__Rectangle__Alternatives_0 )
            {
             before(grammarAccess.getRectangleAccess().getAlternatives_0()); 
            // InternalCanvas.g:4361:2: ( rule__Rectangle__Alternatives_0 )
            // InternalCanvas.g:4361:3: rule__Rectangle__Alternatives_0
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
    // InternalCanvas.g:4369:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4373:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalCanvas.g:4374:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
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
    // InternalCanvas.g:4381:1: rule__Rectangle__Group__1__Impl : ( 'x' ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4385:1: ( ( 'x' ) )
            // InternalCanvas.g:4386:1: ( 'x' )
            {
            // InternalCanvas.g:4386:1: ( 'x' )
            // InternalCanvas.g:4387:2: 'x'
            {
             before(grammarAccess.getRectangleAccess().getXKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCanvas.g:4396:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4400:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalCanvas.g:4401:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalCanvas.g:4408:1: rule__Rectangle__Group__2__Impl : ( ( rule__Rectangle__XAssignment_2 ) ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4412:1: ( ( ( rule__Rectangle__XAssignment_2 ) ) )
            // InternalCanvas.g:4413:1: ( ( rule__Rectangle__XAssignment_2 ) )
            {
            // InternalCanvas.g:4413:1: ( ( rule__Rectangle__XAssignment_2 ) )
            // InternalCanvas.g:4414:2: ( rule__Rectangle__XAssignment_2 )
            {
             before(grammarAccess.getRectangleAccess().getXAssignment_2()); 
            // InternalCanvas.g:4415:2: ( rule__Rectangle__XAssignment_2 )
            // InternalCanvas.g:4415:3: rule__Rectangle__XAssignment_2
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
    // InternalCanvas.g:4423:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4427:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalCanvas.g:4428:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
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
    // InternalCanvas.g:4435:1: rule__Rectangle__Group__3__Impl : ( 'y' ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4439:1: ( ( 'y' ) )
            // InternalCanvas.g:4440:1: ( 'y' )
            {
            // InternalCanvas.g:4440:1: ( 'y' )
            // InternalCanvas.g:4441:2: 'y'
            {
             before(grammarAccess.getRectangleAccess().getYKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCanvas.g:4450:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4454:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalCanvas.g:4455:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalCanvas.g:4462:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__YAssignment_4 ) ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4466:1: ( ( ( rule__Rectangle__YAssignment_4 ) ) )
            // InternalCanvas.g:4467:1: ( ( rule__Rectangle__YAssignment_4 ) )
            {
            // InternalCanvas.g:4467:1: ( ( rule__Rectangle__YAssignment_4 ) )
            // InternalCanvas.g:4468:2: ( rule__Rectangle__YAssignment_4 )
            {
             before(grammarAccess.getRectangleAccess().getYAssignment_4()); 
            // InternalCanvas.g:4469:2: ( rule__Rectangle__YAssignment_4 )
            // InternalCanvas.g:4469:3: rule__Rectangle__YAssignment_4
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
    // InternalCanvas.g:4477:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4481:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalCanvas.g:4482:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
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
    // InternalCanvas.g:4489:1: rule__Rectangle__Group__5__Impl : ( 'width' ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4493:1: ( ( 'width' ) )
            // InternalCanvas.g:4494:1: ( 'width' )
            {
            // InternalCanvas.g:4494:1: ( 'width' )
            // InternalCanvas.g:4495:2: 'width'
            {
             before(grammarAccess.getRectangleAccess().getWidthKeyword_5()); 
            match(input,53,FOLLOW_2); 
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
    // InternalCanvas.g:4504:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4508:1: ( rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 )
            // InternalCanvas.g:4509:2: rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalCanvas.g:4516:1: rule__Rectangle__Group__6__Impl : ( ( rule__Rectangle__WAssignment_6 ) ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4520:1: ( ( ( rule__Rectangle__WAssignment_6 ) ) )
            // InternalCanvas.g:4521:1: ( ( rule__Rectangle__WAssignment_6 ) )
            {
            // InternalCanvas.g:4521:1: ( ( rule__Rectangle__WAssignment_6 ) )
            // InternalCanvas.g:4522:2: ( rule__Rectangle__WAssignment_6 )
            {
             before(grammarAccess.getRectangleAccess().getWAssignment_6()); 
            // InternalCanvas.g:4523:2: ( rule__Rectangle__WAssignment_6 )
            // InternalCanvas.g:4523:3: rule__Rectangle__WAssignment_6
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
    // InternalCanvas.g:4531:1: rule__Rectangle__Group__7 : rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 ;
    public final void rule__Rectangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4535:1: ( rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 )
            // InternalCanvas.g:4536:2: rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8
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
    // InternalCanvas.g:4543:1: rule__Rectangle__Group__7__Impl : ( 'height' ) ;
    public final void rule__Rectangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4547:1: ( ( 'height' ) )
            // InternalCanvas.g:4548:1: ( 'height' )
            {
            // InternalCanvas.g:4548:1: ( 'height' )
            // InternalCanvas.g:4549:2: 'height'
            {
             before(grammarAccess.getRectangleAccess().getHeightKeyword_7()); 
            match(input,54,FOLLOW_2); 
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
    // InternalCanvas.g:4558:1: rule__Rectangle__Group__8 : rule__Rectangle__Group__8__Impl ;
    public final void rule__Rectangle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4562:1: ( rule__Rectangle__Group__8__Impl )
            // InternalCanvas.g:4563:2: rule__Rectangle__Group__8__Impl
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
    // InternalCanvas.g:4569:1: rule__Rectangle__Group__8__Impl : ( ( rule__Rectangle__HAssignment_8 ) ) ;
    public final void rule__Rectangle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4573:1: ( ( ( rule__Rectangle__HAssignment_8 ) ) )
            // InternalCanvas.g:4574:1: ( ( rule__Rectangle__HAssignment_8 ) )
            {
            // InternalCanvas.g:4574:1: ( ( rule__Rectangle__HAssignment_8 ) )
            // InternalCanvas.g:4575:2: ( rule__Rectangle__HAssignment_8 )
            {
             before(grammarAccess.getRectangleAccess().getHAssignment_8()); 
            // InternalCanvas.g:4576:2: ( rule__Rectangle__HAssignment_8 )
            // InternalCanvas.g:4576:3: rule__Rectangle__HAssignment_8
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
    // InternalCanvas.g:4585:1: rule__Rectangle__Group_0_0__0 : rule__Rectangle__Group_0_0__0__Impl rule__Rectangle__Group_0_0__1 ;
    public final void rule__Rectangle__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4589:1: ( rule__Rectangle__Group_0_0__0__Impl rule__Rectangle__Group_0_0__1 )
            // InternalCanvas.g:4590:2: rule__Rectangle__Group_0_0__0__Impl rule__Rectangle__Group_0_0__1
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
    // InternalCanvas.g:4597:1: rule__Rectangle__Group_0_0__0__Impl : ( 'rectangle' ) ;
    public final void rule__Rectangle__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4601:1: ( ( 'rectangle' ) )
            // InternalCanvas.g:4602:1: ( 'rectangle' )
            {
            // InternalCanvas.g:4602:1: ( 'rectangle' )
            // InternalCanvas.g:4603:2: 'rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_0_0_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalCanvas.g:4612:1: rule__Rectangle__Group_0_0__1 : rule__Rectangle__Group_0_0__1__Impl ;
    public final void rule__Rectangle__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4616:1: ( rule__Rectangle__Group_0_0__1__Impl )
            // InternalCanvas.g:4617:2: rule__Rectangle__Group_0_0__1__Impl
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
    // InternalCanvas.g:4623:1: rule__Rectangle__Group_0_0__1__Impl : ( ':' ) ;
    public final void rule__Rectangle__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4627:1: ( ( ':' ) )
            // InternalCanvas.g:4628:1: ( ':' )
            {
            // InternalCanvas.g:4628:1: ( ':' )
            // InternalCanvas.g:4629:2: ':'
            {
             before(grammarAccess.getRectangleAccess().getColonKeyword_0_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCanvas.g:4639:1: rule__Model__SemanticsAssignment_0 : ( ruleSemanticModel ) ;
    public final void rule__Model__SemanticsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4643:1: ( ( ruleSemanticModel ) )
            // InternalCanvas.g:4644:2: ( ruleSemanticModel )
            {
            // InternalCanvas.g:4644:2: ( ruleSemanticModel )
            // InternalCanvas.g:4645:3: ruleSemanticModel
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
    // InternalCanvas.g:4654:1: rule__Model__RepresentsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Model__RepresentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4658:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4659:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4659:2: ( RULE_STRING )
            // InternalCanvas.g:4660:3: RULE_STRING
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
    // InternalCanvas.g:4669:1: rule__Model__PropertiesAssignment_3 : ( ruleModelProperties ) ;
    public final void rule__Model__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4673:1: ( ( ruleModelProperties ) )
            // InternalCanvas.g:4674:2: ( ruleModelProperties )
            {
            // InternalCanvas.g:4674:2: ( ruleModelProperties )
            // InternalCanvas.g:4675:3: ruleModelProperties
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
    // InternalCanvas.g:4684:1: rule__Model__ElementsAssignment_4 : ( ruleGraphicalElement ) ;
    public final void rule__Model__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4688:1: ( ( ruleGraphicalElement ) )
            // InternalCanvas.g:4689:2: ( ruleGraphicalElement )
            {
            // InternalCanvas.g:4689:2: ( ruleGraphicalElement )
            // InternalCanvas.g:4690:3: ruleGraphicalElement
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
    // InternalCanvas.g:4699:1: rule__SemanticModel__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SemanticModel__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4703:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4704:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4704:2: ( RULE_STRING )
            // InternalCanvas.g:4705:3: RULE_STRING
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
    // InternalCanvas.g:4714:1: rule__ModelProperties__PointAssignment_2 : ( rulePoint ) ;
    public final void rule__ModelProperties__PointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4718:1: ( ( rulePoint ) )
            // InternalCanvas.g:4719:2: ( rulePoint )
            {
            // InternalCanvas.g:4719:2: ( rulePoint )
            // InternalCanvas.g:4720:3: rulePoint
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
    // InternalCanvas.g:4729:1: rule__ModelProperties__ZoomAssignment_4 : ( RULE_INT ) ;
    public final void rule__ModelProperties__ZoomAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4733:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4734:2: ( RULE_INT )
            {
            // InternalCanvas.g:4734:2: ( RULE_INT )
            // InternalCanvas.g:4735:3: RULE_INT
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
    // InternalCanvas.g:4744:1: rule__Shapes__ShapesAssignment_2 : ( ruleShape ) ;
    public final void rule__Shapes__ShapesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4748:1: ( ( ruleShape ) )
            // InternalCanvas.g:4749:2: ( ruleShape )
            {
            // InternalCanvas.g:4749:2: ( ruleShape )
            // InternalCanvas.g:4750:3: ruleShape
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
    // InternalCanvas.g:4759:1: rule__Shape__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Shape__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4763:1: ( ( RULE_ID ) )
            // InternalCanvas.g:4764:2: ( RULE_ID )
            {
            // InternalCanvas.g:4764:2: ( RULE_ID )
            // InternalCanvas.g:4765:3: RULE_ID
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
    // InternalCanvas.g:4774:1: rule__Shape__PropsAssignment_3 : ( ruleShapeProps ) ;
    public final void rule__Shape__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4778:1: ( ( ruleShapeProps ) )
            // InternalCanvas.g:4779:2: ( ruleShapeProps )
            {
            // InternalCanvas.g:4779:2: ( ruleShapeProps )
            // InternalCanvas.g:4780:3: ruleShapeProps
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
    // InternalCanvas.g:4789:1: rule__Shape__RectAssignment_4 : ( ruleRectangle ) ;
    public final void rule__Shape__RectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4793:1: ( ( ruleRectangle ) )
            // InternalCanvas.g:4794:2: ( ruleRectangle )
            {
            // InternalCanvas.g:4794:2: ( ruleRectangle )
            // InternalCanvas.g:4795:3: ruleRectangle
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


    // $ANTLR start "rule__Shape__RepresentsAssignment_6"
    // InternalCanvas.g:4804:1: rule__Shape__RepresentsAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Shape__RepresentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4808:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:4809:2: ( RULE_STRING )
            {
            // InternalCanvas.g:4809:2: ( RULE_STRING )
            // InternalCanvas.g:4810:3: RULE_STRING
            {
             before(grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getShapeAccess().getRepresentsSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__RepresentsAssignment_6"


    // $ANTLR start "rule__FloatingTexts__TextsAssignment_2"
    // InternalCanvas.g:4819:1: rule__FloatingTexts__TextsAssignment_2 : ( ruleFloatingText ) ;
    public final void rule__FloatingTexts__TextsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4823:1: ( ( ruleFloatingText ) )
            // InternalCanvas.g:4824:2: ( ruleFloatingText )
            {
            // InternalCanvas.g:4824:2: ( ruleFloatingText )
            // InternalCanvas.g:4825:3: ruleFloatingText
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
    // InternalCanvas.g:4834:1: rule__FloatingText__RectAssignment_2 : ( ruleRectangle ) ;
    public final void rule__FloatingText__RectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4838:1: ( ( ruleRectangle ) )
            // InternalCanvas.g:4839:2: ( ruleRectangle )
            {
            // InternalCanvas.g:4839:2: ( ruleRectangle )
            // InternalCanvas.g:4840:3: ruleRectangle
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


    // $ANTLR start "rule__FloatingText__AssociatedAssignment_3"
    // InternalCanvas.g:4849:1: rule__FloatingText__AssociatedAssignment_3 : ( ( rule__FloatingText__AssociatedAlternatives_3_0 ) ) ;
    public final void rule__FloatingText__AssociatedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4853:1: ( ( ( rule__FloatingText__AssociatedAlternatives_3_0 ) ) )
            // InternalCanvas.g:4854:2: ( ( rule__FloatingText__AssociatedAlternatives_3_0 ) )
            {
            // InternalCanvas.g:4854:2: ( ( rule__FloatingText__AssociatedAlternatives_3_0 ) )
            // InternalCanvas.g:4855:3: ( rule__FloatingText__AssociatedAlternatives_3_0 )
            {
             before(grammarAccess.getFloatingTextAccess().getAssociatedAlternatives_3_0()); 
            // InternalCanvas.g:4856:3: ( rule__FloatingText__AssociatedAlternatives_3_0 )
            // InternalCanvas.g:4856:4: rule__FloatingText__AssociatedAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__FloatingText__AssociatedAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFloatingTextAccess().getAssociatedAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingText__AssociatedAssignment_3"


    // $ANTLR start "rule__ShapeProps__ContainerAssignment_2"
    // InternalCanvas.g:4864:1: rule__ShapeProps__ContainerAssignment_2 : ( ruleContainer ) ;
    public final void rule__ShapeProps__ContainerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4868:1: ( ( ruleContainer ) )
            // InternalCanvas.g:4869:2: ( ruleContainer )
            {
            // InternalCanvas.g:4869:2: ( ruleContainer )
            // InternalCanvas.g:4870:3: ruleContainer
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
    // InternalCanvas.g:4879:1: rule__ShapeProps__ColorAssignment_3 : ( ruleColor ) ;
    public final void rule__ShapeProps__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4883:1: ( ( ruleColor ) )
            // InternalCanvas.g:4884:2: ( ruleColor )
            {
            // InternalCanvas.g:4884:2: ( ruleColor )
            // InternalCanvas.g:4885:3: ruleColor
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
    // InternalCanvas.g:4894:1: rule__Color__RAssignment_1 : ( RULE_INT ) ;
    public final void rule__Color__RAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4898:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4899:2: ( RULE_INT )
            {
            // InternalCanvas.g:4899:2: ( RULE_INT )
            // InternalCanvas.g:4900:3: RULE_INT
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
    // InternalCanvas.g:4909:1: rule__Color__GAssignment_2 : ( RULE_INT ) ;
    public final void rule__Color__GAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4913:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4914:2: ( RULE_INT )
            {
            // InternalCanvas.g:4914:2: ( RULE_INT )
            // InternalCanvas.g:4915:3: RULE_INT
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
    // InternalCanvas.g:4924:1: rule__Color__BAssignment_3 : ( RULE_INT ) ;
    public final void rule__Color__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4928:1: ( ( RULE_INT ) )
            // InternalCanvas.g:4929:2: ( RULE_INT )
            {
            // InternalCanvas.g:4929:2: ( RULE_INT )
            // InternalCanvas.g:4930:3: RULE_INT
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
    // InternalCanvas.g:4939:1: rule__Connectors__ConnectorsAssignment_2 : ( ruleConnector ) ;
    public final void rule__Connectors__ConnectorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4943:1: ( ( ruleConnector ) )
            // InternalCanvas.g:4944:2: ( ruleConnector )
            {
            // InternalCanvas.g:4944:2: ( ruleConnector )
            // InternalCanvas.g:4945:3: ruleConnector
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
    // InternalCanvas.g:4954:1: rule__Connector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4958:1: ( ( RULE_ID ) )
            // InternalCanvas.g:4959:2: ( RULE_ID )
            {
            // InternalCanvas.g:4959:2: ( RULE_ID )
            // InternalCanvas.g:4960:3: RULE_ID
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
    // InternalCanvas.g:4969:1: rule__Connector__PropsAssignment_2 : ( ruleConnectorProps ) ;
    public final void rule__Connector__PropsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4973:1: ( ( ruleConnectorProps ) )
            // InternalCanvas.g:4974:2: ( ruleConnectorProps )
            {
            // InternalCanvas.g:4974:2: ( ruleConnectorProps )
            // InternalCanvas.g:4975:3: ruleConnectorProps
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
    // InternalCanvas.g:4984:1: rule__Connector__PolylineAssignment_3 : ( rulePolyline ) ;
    public final void rule__Connector__PolylineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:4988:1: ( ( rulePolyline ) )
            // InternalCanvas.g:4989:2: ( rulePolyline )
            {
            // InternalCanvas.g:4989:2: ( rulePolyline )
            // InternalCanvas.g:4990:3: rulePolyline
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
    // InternalCanvas.g:4999:1: rule__Connector__AnchorsAssignment_4 : ( ruleAnchors ) ;
    public final void rule__Connector__AnchorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5003:1: ( ( ruleAnchors ) )
            // InternalCanvas.g:5004:2: ( ruleAnchors )
            {
            // InternalCanvas.g:5004:2: ( ruleAnchors )
            // InternalCanvas.g:5005:3: ruleAnchors
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


    // $ANTLR start "rule__Connector__RepresentsAssignment_6"
    // InternalCanvas.g:5014:1: rule__Connector__RepresentsAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Connector__RepresentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5018:1: ( ( RULE_STRING ) )
            // InternalCanvas.g:5019:2: ( RULE_STRING )
            {
            // InternalCanvas.g:5019:2: ( RULE_STRING )
            // InternalCanvas.g:5020:3: RULE_STRING
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


    // $ANTLR start "rule__Anchors__StartAnchorAssignment_1"
    // InternalCanvas.g:5029:1: rule__Anchors__StartAnchorAssignment_1 : ( ruleStartAnchor ) ;
    public final void rule__Anchors__StartAnchorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5033:1: ( ( ruleStartAnchor ) )
            // InternalCanvas.g:5034:2: ( ruleStartAnchor )
            {
            // InternalCanvas.g:5034:2: ( ruleStartAnchor )
            // InternalCanvas.g:5035:3: ruleStartAnchor
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
    // InternalCanvas.g:5044:1: rule__Anchors__EndAnchorAssignment_2 : ( ruleEndAnchor ) ;
    public final void rule__Anchors__EndAnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5048:1: ( ( ruleEndAnchor ) )
            // InternalCanvas.g:5049:2: ( ruleEndAnchor )
            {
            // InternalCanvas.g:5049:2: ( ruleEndAnchor )
            // InternalCanvas.g:5050:3: ruleEndAnchor
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
    // InternalCanvas.g:5059:1: rule__StartAnchor__PointAssignment_1 : ( rulePoint ) ;
    public final void rule__StartAnchor__PointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5063:1: ( ( rulePoint ) )
            // InternalCanvas.g:5064:2: ( rulePoint )
            {
            // InternalCanvas.g:5064:2: ( rulePoint )
            // InternalCanvas.g:5065:3: rulePoint
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
    // InternalCanvas.g:5074:1: rule__StartAnchor__AnchorAssignment_2 : ( ruleAnchor ) ;
    public final void rule__StartAnchor__AnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5078:1: ( ( ruleAnchor ) )
            // InternalCanvas.g:5079:2: ( ruleAnchor )
            {
            // InternalCanvas.g:5079:2: ( ruleAnchor )
            // InternalCanvas.g:5080:3: ruleAnchor
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
    // InternalCanvas.g:5089:1: rule__EndAnchor__PointAssignment_1 : ( rulePoint ) ;
    public final void rule__EndAnchor__PointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5093:1: ( ( rulePoint ) )
            // InternalCanvas.g:5094:2: ( rulePoint )
            {
            // InternalCanvas.g:5094:2: ( rulePoint )
            // InternalCanvas.g:5095:3: rulePoint
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
    // InternalCanvas.g:5104:1: rule__EndAnchor__AnchorAssignment_2 : ( ruleAnchor ) ;
    public final void rule__EndAnchor__AnchorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5108:1: ( ( ruleAnchor ) )
            // InternalCanvas.g:5109:2: ( ruleAnchor )
            {
            // InternalCanvas.g:5109:2: ( ruleAnchor )
            // InternalCanvas.g:5110:3: ruleAnchor
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
    // InternalCanvas.g:5119:1: rule__ShapeAnchorElement__ElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ShapeAnchorElement__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5123:1: ( ( ( RULE_ID ) ) )
            // InternalCanvas.g:5124:2: ( ( RULE_ID ) )
            {
            // InternalCanvas.g:5124:2: ( ( RULE_ID ) )
            // InternalCanvas.g:5125:3: ( RULE_ID )
            {
             before(grammarAccess.getShapeAnchorElementAccess().getElementShapeCrossReference_1_0()); 
            // InternalCanvas.g:5126:3: ( RULE_ID )
            // InternalCanvas.g:5127:4: RULE_ID
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
    // InternalCanvas.g:5138:1: rule__ConnectorAnchorElement__ElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConnectorAnchorElement__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5142:1: ( ( ( RULE_ID ) ) )
            // InternalCanvas.g:5143:2: ( ( RULE_ID ) )
            {
            // InternalCanvas.g:5143:2: ( ( RULE_ID ) )
            // InternalCanvas.g:5144:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorCrossReference_1_0()); 
            // InternalCanvas.g:5145:3: ( RULE_ID )
            // InternalCanvas.g:5146:4: RULE_ID
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
    // InternalCanvas.g:5157:1: rule__ConnectorProps__ColorAssignment_2 : ( ruleColor ) ;
    public final void rule__ConnectorProps__ColorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5161:1: ( ( ruleColor ) )
            // InternalCanvas.g:5162:2: ( ruleColor )
            {
            // InternalCanvas.g:5162:2: ( ruleColor )
            // InternalCanvas.g:5163:3: ruleColor
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
    // InternalCanvas.g:5172:1: rule__Polyline__SegmentsAssignment_2 : ( ruleSegment ) ;
    public final void rule__Polyline__SegmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5176:1: ( ( ruleSegment ) )
            // InternalCanvas.g:5177:2: ( ruleSegment )
            {
            // InternalCanvas.g:5177:2: ( ruleSegment )
            // InternalCanvas.g:5178:3: ruleSegment
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
    // InternalCanvas.g:5187:1: rule__Segment__StartPointAssignment_1 : ( rulePoint ) ;
    public final void rule__Segment__StartPointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5191:1: ( ( rulePoint ) )
            // InternalCanvas.g:5192:2: ( rulePoint )
            {
            // InternalCanvas.g:5192:2: ( rulePoint )
            // InternalCanvas.g:5193:3: rulePoint
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
    // InternalCanvas.g:5202:1: rule__Segment__EndPointAssignment_3 : ( rulePoint ) ;
    public final void rule__Segment__EndPointAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5206:1: ( ( rulePoint ) )
            // InternalCanvas.g:5207:2: ( rulePoint )
            {
            // InternalCanvas.g:5207:2: ( rulePoint )
            // InternalCanvas.g:5208:3: rulePoint
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
    // InternalCanvas.g:5217:1: rule__Point__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Point__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5221:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5222:2: ( RULE_INT )
            {
            // InternalCanvas.g:5222:2: ( RULE_INT )
            // InternalCanvas.g:5223:3: RULE_INT
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
    // InternalCanvas.g:5232:1: rule__Point__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Point__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5236:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5237:2: ( RULE_INT )
            {
            // InternalCanvas.g:5237:2: ( RULE_INT )
            // InternalCanvas.g:5238:3: RULE_INT
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
    // InternalCanvas.g:5247:1: rule__Rectangle__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Rectangle__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5251:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5252:2: ( RULE_INT )
            {
            // InternalCanvas.g:5252:2: ( RULE_INT )
            // InternalCanvas.g:5253:3: RULE_INT
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
    // InternalCanvas.g:5262:1: rule__Rectangle__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Rectangle__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5266:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5267:2: ( RULE_INT )
            {
            // InternalCanvas.g:5267:2: ( RULE_INT )
            // InternalCanvas.g:5268:3: RULE_INT
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
    // InternalCanvas.g:5277:1: rule__Rectangle__WAssignment_6 : ( RULE_INT ) ;
    public final void rule__Rectangle__WAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5281:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5282:2: ( RULE_INT )
            {
            // InternalCanvas.g:5282:2: ( RULE_INT )
            // InternalCanvas.g:5283:3: RULE_INT
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
    // InternalCanvas.g:5292:1: rule__Rectangle__HAssignment_8 : ( RULE_INT ) ;
    public final void rule__Rectangle__HAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCanvas.g:5296:1: ( ( RULE_INT ) )
            // InternalCanvas.g:5297:2: ( RULE_INT )
            {
            // InternalCanvas.g:5297:2: ( RULE_INT )
            // InternalCanvas.g:5298:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000045400115000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000045000114002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000008002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0080000420001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000020002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000082000208000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000045000114000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000082000208002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001100448401800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000C00006000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000010000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});

}