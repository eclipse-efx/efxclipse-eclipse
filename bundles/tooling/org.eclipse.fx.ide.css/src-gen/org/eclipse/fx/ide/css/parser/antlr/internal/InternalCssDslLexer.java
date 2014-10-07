package org.eclipse.fx.ide.css.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_IMPORTANT_SYM=12;
    public static final int T__59=59;
    public static final int RULE_CSSSTRING=4;
    public static final int RULE_UNDERSCORE=15;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_PERCENT=7;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_COMMA=6;
    public static final int RULE_COLON=5;
    public static final int RULE_HASHMARK=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_DASHMATCH=10;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int RULE_INCLUDES=9;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_ONE_HEX_LETTER=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DASH=14;
    public static final int RULE_ONE_INT=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_PLUS=13;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ONE_NON_HEX_LETTER=17;
    public static final int T__32=32;
    public static final int RULE_WS=8;
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

    public InternalCssDslLexer() {;} 
    public InternalCssDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCssDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:11:7: ( '@charset' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:11:9: '@charset'
            {
            match("@charset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:12:7: ( '@CHARSET' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:12:9: '@CHARSET'
            {
            match("@CHARSET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:13:7: ( ';' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:14:7: ( '@import' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:14:9: '@import'
            {
            match("@import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:15:7: ( '@IMPORT' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:15:9: '@IMPORT'
            {
            match("@IMPORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:16:7: ( '@page' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:16:9: '@page'
            {
            match("@page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:17:7: ( '@PAGE' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:17:9: '@PAGE'
            {
            match("@PAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:18:7: ( '{' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:19:7: ( '}' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:20:7: ( '@media' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:20:9: '@media'
            {
            match("@media"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:21:7: ( '@MEDIA' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:21:9: '@MEDIA'
            {
            match("@MEDIA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:22:7: ( '@font-face' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:22:9: '@font-face'
            {
            match("@font-face"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:23:7: ( '@FONT-FACE' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:23:9: '@FONT-FACE'
            {
            match("@FONT-FACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:24:7: ( '@keyframes' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:24:9: '@keyframes'
            {
            match("@keyframes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:25:7: ( '@KEYFRAMES' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:25:9: '@KEYFRAMES'
            {
            match("@KEYFRAMES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:26:7: ( '[' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:26:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:27:7: ( '^=' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:27:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:28:7: ( '$=' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:28:9: '$='
            {
            match("$="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:29:7: ( '*=' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:29:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:30:7: ( '=' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:31:7: ( ']' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:32:7: ( '.' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:32:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:33:7: ( '*' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:33:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:34:7: ( '|' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:34:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:35:7: ( ')' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:36:7: ( '(' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:36:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:37:7: ( 'not(' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:37:9: 'not('
            {
            match("not("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:38:7: ( '>' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:38:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:39:7: ( '~' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:39:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:40:7: ( 'url(' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:40:9: 'url('
            {
            match("url("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:41:7: ( '/' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:41:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:42:7: ( '?' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:42:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:43:7: ( '@' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:43:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:44:7: ( '!' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:44:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:45:7: ( '$' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:45:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:46:7: ( '&' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:46:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:47:7: ( 'not' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:47:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:48:7: ( 'no' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:48:9: 'no'
            {
            match("no"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:49:7: ( 'url' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:49:9: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:50:7: ( 'ur' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:50:9: 'ur'
            {
            match("ur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:51:7: ( '\\\\ ' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:51:9: '\\\\ '
            {
            match("\\ "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:52:7: ( '\\\\(' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:52:9: '\\\\('
            {
            match("\\("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:53:7: ( '\\\\)' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:53:9: '\\\\)'
            {
            match("\\)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:54:7: ( '\\\\\\'' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:54:9: '\\\\\\''
            {
            match("\\'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:55:7: ( '\\\\\"' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:55:9: '\\\\\"'
            {
            match("\\\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:56:7: ( 'FROM' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:56:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:57:7: ( 'TO' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:57:9: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_IMPORTANT_SYM"
    public final void mRULE_IMPORTANT_SYM() throws RecognitionException {
        try {
            int _type = RULE_IMPORTANT_SYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3612:20: ( '!important' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3612:22: '!important'
            {
            match("!important"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPORTANT_SYM"

    // $ANTLR start "RULE_ONE_INT"
    public final void mRULE_ONE_INT() throws RecognitionException {
        try {
            int _type = RULE_ONE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3614:14: ( '0' .. '9' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3614:16: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_INT"

    // $ANTLR start "RULE_ONE_HEX_LETTER"
    public final void mRULE_ONE_HEX_LETTER() throws RecognitionException {
        try {
            int _type = RULE_ONE_HEX_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3616:21: ( ( 'a' .. 'f' | 'A' .. 'F' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3616:23: ( 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_HEX_LETTER"

    // $ANTLR start "RULE_ONE_NON_HEX_LETTER"
    public final void mRULE_ONE_NON_HEX_LETTER() throws RecognitionException {
        try {
            int _type = RULE_ONE_NON_HEX_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3618:25: ( ( 'g' .. 'z' | 'G' .. 'Z' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3618:27: ( 'g' .. 'z' | 'G' .. 'Z' )
            {
            if ( (input.LA(1)>='G' && input.LA(1)<='Z')||(input.LA(1)>='g' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_NON_HEX_LETTER"

    // $ANTLR start "RULE_UNDERSCORE"
    public final void mRULE_UNDERSCORE() throws RecognitionException {
        try {
            int _type = RULE_UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3620:17: ( '_' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3620:19: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNDERSCORE"

    // $ANTLR start "RULE_DASH"
    public final void mRULE_DASH() throws RecognitionException {
        try {
            int _type = RULE_DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3622:11: ( '-' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3622:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASH"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3624:11: ( '+' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3624:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_HASHMARK"
    public final void mRULE_HASHMARK() throws RecognitionException {
        try {
            int _type = RULE_HASHMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3626:15: ( '#' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3626:17: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASHMARK"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3628:12: ( ',' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3628:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3630:14: ( '%' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3630:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3632:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3632:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3632:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3632:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3634:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3634:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3634:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_CSSSTRING"
    public final void mRULE_CSSSTRING() throws RecognitionException {
        try {
            int _type = RULE_CSSSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:16: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:18: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:18: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:19: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:23: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:24: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='f')||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:96: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:116: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:121: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:122: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='f')||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3636:194: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CSSSTRING"

    // $ANTLR start "RULE_INCLUDES"
    public final void mRULE_INCLUDES() throws RecognitionException {
        try {
            int _type = RULE_INCLUDES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3638:15: ( '~=' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3638:17: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDES"

    // $ANTLR start "RULE_DASHMATCH"
    public final void mRULE_DASHMATCH() throws RecognitionException {
        try {
            int _type = RULE_DASHMATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3640:16: ( '|=' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3640:18: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASHMATCH"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3642:12: ( ':' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3642:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_IMPORTANT_SYM | RULE_ONE_INT | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_UNDERSCORE | RULE_DASH | RULE_PLUS | RULE_HASHMARK | RULE_COMMA | RULE_PERCENT | RULE_ML_COMMENT | RULE_WS | RULE_CSSSTRING | RULE_INCLUDES | RULE_DASHMATCH | RULE_COLON )
        int alt6=63;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:226: T__56
                {
                mT__56(); 

                }
                break;
            case 38 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:232: T__57
                {
                mT__57(); 

                }
                break;
            case 39 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:238: T__58
                {
                mT__58(); 

                }
                break;
            case 40 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:244: T__59
                {
                mT__59(); 

                }
                break;
            case 41 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:250: T__60
                {
                mT__60(); 

                }
                break;
            case 42 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:256: T__61
                {
                mT__61(); 

                }
                break;
            case 43 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:262: T__62
                {
                mT__62(); 

                }
                break;
            case 44 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:268: T__63
                {
                mT__63(); 

                }
                break;
            case 45 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:274: T__64
                {
                mT__64(); 

                }
                break;
            case 46 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:280: T__65
                {
                mT__65(); 

                }
                break;
            case 47 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:286: T__66
                {
                mT__66(); 

                }
                break;
            case 48 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:292: RULE_IMPORTANT_SYM
                {
                mRULE_IMPORTANT_SYM(); 

                }
                break;
            case 49 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:311: RULE_ONE_INT
                {
                mRULE_ONE_INT(); 

                }
                break;
            case 50 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:324: RULE_ONE_HEX_LETTER
                {
                mRULE_ONE_HEX_LETTER(); 

                }
                break;
            case 51 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:344: RULE_ONE_NON_HEX_LETTER
                {
                mRULE_ONE_NON_HEX_LETTER(); 

                }
                break;
            case 52 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:368: RULE_UNDERSCORE
                {
                mRULE_UNDERSCORE(); 

                }
                break;
            case 53 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:384: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 54 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:394: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 55 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:404: RULE_HASHMARK
                {
                mRULE_HASHMARK(); 

                }
                break;
            case 56 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:418: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 57 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:429: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 58 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:442: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 59 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:458: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 60 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:466: RULE_CSSSTRING
                {
                mRULE_CSSSTRING(); 

                }
                break;
            case 61 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:481: RULE_INCLUDES
                {
                mRULE_INCLUDES(); 

                }
                break;
            case 62 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:495: RULE_DASHMATCH
                {
                mRULE_DASHMATCH(); 

                }
                break;
            case 63 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1:510: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\62\5\uffff\1\64\1\66\3\uffff\1\70\2\uffff\1\34\1\uffff\1\73\1\34\1\76\1\uffff\1\100\2\uffff\1\33\1\34\37\uffff\1\111\2\uffff\1\113\13\uffff\1\115\1\uffff\1\117\5\uffff";
    static final String DFA6_eofS =
        "\120\uffff";
    static final String DFA6_minS =
        "\1\11\1\103\5\uffff\2\75\3\uffff\1\75\2\uffff\1\157\1\uffff\1\75\1\162\1\52\1\uffff\1\151\1\uffff\1\40\1\122\1\117\37\uffff\1\164\2\uffff\1\154\13\uffff\1\50\1\uffff\1\50\5\uffff";
    static final String DFA6_maxS =
        "\1\176\1\160\5\uffff\2\75\3\uffff\1\75\2\uffff\1\157\1\uffff\1\75\1\162\1\52\1\uffff\1\151\1\uffff\1\51\1\122\1\117\37\uffff\1\164\2\uffff\1\154\13\uffff\1\50\1\uffff\1\50\5\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\3\1\10\1\11\1\20\1\21\2\uffff\1\24\1\25\1\26\1\uffff\1\31\1\32\1\uffff\1\34\3\uffff\1\40\1\uffff\1\44\3\uffff\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\73\1\74\1\77\1\1\1\2\1\4\1\5\1\6\1\7\1\12\1\13\1\14\1\15\1\16\1\17\1\41\1\22\1\43\1\23\1\27\1\76\1\30\1\uffff\1\75\1\35\1\uffff\1\72\1\37\1\60\1\42\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\46\1\uffff\1\50\1\33\1\45\1\36\1\47";
    static final String DFA6_specialS =
        "\120\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\25\1\44\1\40\1\7\1\42\1\26\1\44\1\16\1\15\1\10\1\37\1\41\1\36\1\13\1\23\12\32\1\45\1\2\1\uffff\1\11\1\20\1\24\1\1\5\33\1\30\15\34\1\31\6\34\1\5\1\27\1\12\1\6\1\35\1\uffff\6\33\7\34\1\17\6\34\1\22\5\34\1\3\1\14\1\4\1\21",
            "\1\47\2\uffff\1\57\2\uffff\1\51\1\uffff\1\61\1\uffff\1\55\2\uffff\1\53\22\uffff\1\46\2\uffff\1\56\2\uffff\1\50\1\uffff\1\60\1\uffff\1\54\2\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\65",
            "",
            "",
            "",
            "\1\67",
            "",
            "",
            "\1\71",
            "",
            "\1\72",
            "\1\74",
            "\1\75",
            "",
            "\1\77",
            "",
            "\1\101\1\uffff\1\105\4\uffff\1\104\1\102\1\103",
            "\1\106",
            "\1\107",
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
            "\1\110",
            "",
            "",
            "\1\112",
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
            "\1\114",
            "",
            "\1\116",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_IMPORTANT_SYM | RULE_ONE_INT | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_UNDERSCORE | RULE_DASH | RULE_PLUS | RULE_HASHMARK | RULE_COMMA | RULE_PERCENT | RULE_ML_COMMENT | RULE_WS | RULE_CSSSTRING | RULE_INCLUDES | RULE_DASHMATCH | RULE_COLON );";
        }
    }
 

}