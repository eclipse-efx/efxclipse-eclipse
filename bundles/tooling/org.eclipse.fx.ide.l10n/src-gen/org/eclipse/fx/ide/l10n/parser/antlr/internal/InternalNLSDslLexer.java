package org.eclipse.fx.ide.l10n.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNLSDslLexer extends Lexer {
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_IN_RICH_STRING=10;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_RICH_TEXT=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_RICH_TEXT_END=7;
    public static final int RULE_RICH_TEXT_START=6;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_RICH_TEXT_INBETWEEN=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalNLSDslLexer() {;} 
    public InternalNLSDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNLSDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:11:7: ( '{' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:12:7: ( '}' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:13:7: ( 'package' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:13:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:14:7: ( 'bundle' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:14:9: 'bundle'
            {
            match("bundle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:15:7: ( 'default' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:15:9: 'default'
            {
            match("default"); 


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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:16:7: ( 'formatter' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:16:9: 'formatter'
            {
            match("formatter"); 


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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:17:7: ( '(' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:17:9: '('
            {
            match('('); 

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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:18:7: ( ',' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:18:9: ','
            {
            match(','); 

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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:19:7: ( ')' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:19:9: ')'
            {
            match(')'); 

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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:20:7: ( ':' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:20:9: ':'
            {
            match(':'); 

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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:21:7: ( '[' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:21:9: '['
            {
            match('['); 

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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:22:7: ( ']' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:22:9: ']'
            {
            match(']'); 

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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:23:7: ( '.' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:23:9: '.'
            {
            match('.'); 

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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:24:7: ( 'ANY' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:24:9: 'ANY'
            {
            match("ANY"); 


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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:25:7: ( 'NUMBER' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:25:9: 'NUMBER'
            {
            match("NUMBER"); 


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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:26:7: ( 'DATE' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:26:9: 'DATE'
            {
            match("DATE"); 


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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:27:7: ( 'TEMPORAL' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:27:9: 'TEMPORAL'
            {
            match("TEMPORAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_RICH_TEXT"
    public final void mRULE_RICH_TEXT() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:16: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:18: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match("'''"); 

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:27: ( RULE_IN_RICH_STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>='\u0000' && LA1_4<='&')||(LA1_4>='(' && LA1_4<='\u00AA')||(LA1_4>='\u00AC' && LA1_4<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='&')||(LA1_1>='(' && LA1_1<='\u00AA')||(LA1_1>='\u00AC' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='\u00AA')||(LA1_0>='\u00AC' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:27: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:48: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\'') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\'') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='\'') ) {
                        alt4=1;
                    }
                    else {
                        alt4=2;}
                }
                else {
                    alt4=2;}
            }
            else {
                alt4=2;}
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:49: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:58: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:58: ( '\\'' ( '\\'' )? )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\'') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:59: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:64: ( '\\'' )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0=='\'') ) {
                                alt2=1;
                            }
                            switch (alt2) {
                                case 1 :
                                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1094:64: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

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
    // $ANTLR end "RULE_RICH_TEXT"

    // $ANTLR start "RULE_RICH_TEXT_START"
    public final void mRULE_RICH_TEXT_START() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1096:22: ( '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1096:24: '\\'\\'\\'' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match("'''"); 

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1096:33: ( RULE_IN_RICH_STRING )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\'') ) {
                        int LA5_4 = input.LA(3);

                        if ( ((LA5_4>='\u0000' && LA5_4<='&')||(LA5_4>='(' && LA5_4<='\u00AA')||(LA5_4>='\u00AC' && LA5_4<='\uFFFF')) ) {
                            alt5=1;
                        }


                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='&')||(LA5_1>='(' && LA5_1<='\u00AA')||(LA5_1>='\u00AC' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\u00AA')||(LA5_0>='\u00AC' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1096:33: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1096:54: ( '\\'' ( '\\'' )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\'') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1096:55: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1096:60: ( '\\'' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\'') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1096:60: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_START"

    // $ANTLR start "RULE_RICH_TEXT_END"
    public final void mRULE_RICH_TEXT_END() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:20: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:22: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            {
            match('\u00BB'); 
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:31: ( RULE_IN_RICH_STRING )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\'') ) {
                        int LA8_4 = input.LA(3);

                        if ( ((LA8_4>='\u0000' && LA8_4<='&')||(LA8_4>='(' && LA8_4<='\u00AA')||(LA8_4>='\u00AC' && LA8_4<='\uFFFF')) ) {
                            alt8=1;
                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='&')||(LA8_1>='(' && LA8_1<='\u00AA')||(LA8_1>='\u00AC' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\u00AA')||(LA8_0>='\u00AC' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:31: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:52: ( '\\'\\'\\'' | ( '\\'' ( '\\'' )? )? EOF )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\'') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\'') ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3=='\'') ) {
                        alt11=1;
                    }
                    else {
                        alt11=2;}
                }
                else {
                    alt11=2;}
            }
            else {
                alt11=2;}
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:53: '\\'\\'\\''
                    {
                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:62: ( '\\'' ( '\\'' )? )? EOF
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:62: ( '\\'' ( '\\'' )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\'') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:63: '\\'' ( '\\'' )?
                            {
                            match('\''); 
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:68: ( '\\'' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='\'') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:68: '\\''
                                    {
                                    match('\''); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(EOF); 

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
    // $ANTLR end "RULE_RICH_TEXT_END"

    // $ANTLR start "RULE_RICH_TEXT_INBETWEEN"
    public final void mRULE_RICH_TEXT_INBETWEEN() throws RecognitionException {
        try {
            int _type = RULE_RICH_TEXT_INBETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1100:26: ( '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1100:28: '\\u00BB' ( RULE_IN_RICH_STRING )* ( '\\'' ( '\\'' )? )? '\\u00AB'
            {
            match('\u00BB'); 
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1100:37: ( RULE_IN_RICH_STRING )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\'') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='\'') ) {
                        int LA12_4 = input.LA(3);

                        if ( ((LA12_4>='\u0000' && LA12_4<='&')||(LA12_4>='(' && LA12_4<='\u00AA')||(LA12_4>='\u00AC' && LA12_4<='\uFFFF')) ) {
                            alt12=1;
                        }


                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='&')||(LA12_1>='(' && LA12_1<='\u00AA')||(LA12_1>='\u00AC' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='\u00AA')||(LA12_0>='\u00AC' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1100:37: RULE_IN_RICH_STRING
            	    {
            	    mRULE_IN_RICH_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1100:58: ( '\\'' ( '\\'' )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\'') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1100:59: '\\'' ( '\\'' )?
                    {
                    match('\''); 
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1100:64: ( '\\'' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\'') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1100:64: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }

            match('\u00AB'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RICH_TEXT_INBETWEEN"

    // $ANTLR start "RULE_IN_RICH_STRING"
    public final void mRULE_IN_RICH_STRING() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1102:30: ( ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1102:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1102:32: ( '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | '\\'' ~ ( ( '\\u00AB' | '\\'' ) ) | ~ ( ( '\\u00AB' | '\\'' ) ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\'') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='\'') ) {
                    alt15=1;
                }
                else if ( ((LA15_1>='\u0000' && LA15_1<='&')||(LA15_1>='(' && LA15_1<='\u00AA')||(LA15_1>='\u00AC' && LA15_1<='\uFFFF')) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='\u00AA')||(LA15_0>='\u00AC' && LA15_0<='\uFFFF')) ) {
                alt15=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1102:33: '\\'\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match("''"); 

                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1102:59: '\\'' ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    match('\''); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1102:83: ~ ( ( '\\u00AB' | '\\'' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN_RICH_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1104:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1104:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1104:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1104:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1104:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1106:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1106:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1106:12: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1106:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop19;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1108:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop20;
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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1110:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1110:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1110:24: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='*') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='/') ) {
                        alt22=2;
                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1110:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1112:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1112:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1112:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1112:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1112:40: ( ( '\\r' )? '\\n' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1112:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1112:41: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1112:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1114:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1114:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1114:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1116:16: ( . )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1116:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt27=28;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:112: RULE_RICH_TEXT
                {
                mRULE_RICH_TEXT(); 

                }
                break;
            case 19 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:127: RULE_RICH_TEXT_START
                {
                mRULE_RICH_TEXT_START(); 

                }
                break;
            case 20 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:148: RULE_RICH_TEXT_END
                {
                mRULE_RICH_TEXT_END(); 

                }
                break;
            case 21 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:167: RULE_RICH_TEXT_INBETWEEN
                {
                mRULE_RICH_TEXT_INBETWEEN(); 

                }
                break;
            case 22 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:192: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:200: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:209: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:221: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:237: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:253: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1:261: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\3\uffff\4\36\7\uffff\4\36\1\32\1\62\1\32\2\uffff\2\32\4\uffff\1\36\1\uffff\3\36\7\uffff\4\36\1\56\1\uffff\2\62\6\uffff\4\36\1\106\3\36\1\115\2\62\4\36\1\uffff\1\36\1\124\1\36\2\115\2\uffff\1\62\5\36\1\uffff\1\36\2\115\1\36\1\140\2\36\1\143\1\36\1\115\1\145\1\uffff\1\146\1\36\1\uffff\1\36\2\uffff\1\36\1\152\1\153\2\uffff";
    static final String DFA27_eofS =
        "\154\uffff";
    static final String DFA27_minS =
        "\1\0\2\uffff\1\141\1\165\1\145\1\157\7\uffff\1\116\1\125\1\101\1\105\2\0\1\101\2\uffff\1\0\1\52\4\uffff\1\143\1\uffff\1\156\1\146\1\162\7\uffff\1\131\1\115\1\124\1\115\1\47\1\uffff\2\0\6\uffff\1\153\1\144\1\141\1\155\1\60\1\102\1\105\1\120\3\0\1\141\1\154\1\165\1\141\1\uffff\1\105\1\60\1\117\2\0\2\uffff\1\0\1\147\1\145\1\154\1\164\1\122\1\uffff\1\122\2\0\1\145\1\60\2\164\1\60\1\101\1\0\1\60\1\uffff\1\60\1\145\1\uffff\1\114\2\uffff\1\162\2\60\2\uffff";
    static final String DFA27_maxS =
        "\1\uffff\2\uffff\1\141\1\165\1\145\1\157\7\uffff\1\116\1\125\1\101\1\105\2\uffff\1\172\2\uffff\1\uffff\1\57\4\uffff\1\143\1\uffff\1\156\1\146\1\162\7\uffff\1\131\1\115\1\124\1\115\1\47\1\uffff\2\uffff\6\uffff\1\153\1\144\1\141\1\155\1\172\1\102\1\105\1\120\3\uffff\1\141\1\154\1\165\1\141\1\uffff\1\105\1\172\1\117\2\uffff\2\uffff\1\uffff\1\147\1\145\1\154\1\164\1\122\1\uffff\1\122\2\uffff\1\145\1\172\2\164\1\172\1\101\1\uffff\1\172\1\uffff\1\172\1\145\1\uffff\1\114\2\uffff\1\162\2\172\2\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\2\4\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\7\uffff\1\26\1\27\2\uffff\1\33\1\34\1\1\1\2\1\uffff\1\26\3\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\5\uffff\1\30\2\uffff\1\25\1\24\1\27\1\31\1\32\1\33\17\uffff\1\16\5\uffff\1\23\1\22\6\uffff\1\20\13\uffff\1\4\2\uffff\1\17\1\uffff\1\3\1\5\3\uffff\1\21\1\6";
    static final String DFA27_specialS =
        "\1\3\21\uffff\1\6\1\7\3\uffff\1\5\27\uffff\1\1\1\16\16\uffff\1\12\1\0\1\15\10\uffff\1\2\1\13\2\uffff\1\14\7\uffff\1\4\1\11\6\uffff\1\10\15\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\27\4\32\1\22\1\7\1\11\2\32\1\10\1\32\1\15\1\30\12\26\1\12\6\32\1\16\2\25\1\20\11\25\1\17\5\25\1\21\6\25\1\13\1\32\1\14\1\24\1\25\1\32\1\25\1\4\1\25\1\5\1\25\1\6\11\25\1\3\12\25\1\1\1\32\1\2\75\32\1\23\uff44\32",
            "",
            "",
            "\1\35",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\47\56\1\55\uffd8\56",
            "\47\60\1\57\u0083\60\1\61\uff54\60",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\56",
            "\1\64\4\uffff\1\65",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\47\101\1\100\u0083\101\1\61\uff54\101",
            "\47\60\1\57\u0083\60\1\61\uff54\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\107",
            "\1\110",
            "\1\111",
            "\47\113\1\112\u0083\113\1\114\uff54\113",
            "\47\116\1\uffff\u0083\116\1\61\uff54\116",
            "\47\60\1\57\u0083\60\1\61\uff54\60",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\125",
            "\47\127\1\126\u0083\127\1\114\uff54\127",
            "\47\113\1\112\u0083\113\1\114\uff54\113",
            "",
            "",
            "\47\60\1\57\u0083\60\1\61\uff54\60",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\47\136\1\uffff\u0083\136\1\114\uff54\136",
            "\47\113\1\112\u0083\113\1\114\uff54\113",
            "\1\137",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\141",
            "\1\142",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\144",
            "\47\113\1\112\u0083\113\1\114\uff54\113",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\147",
            "",
            "\1\150",
            "",
            "",
            "\1\151",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_RICH_TEXT | RULE_RICH_TEXT_START | RULE_RICH_TEXT_END | RULE_RICH_TEXT_INBETWEEN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_64 = input.LA(1);

                        s = -1;
                        if ( ((LA27_64>='\u0000' && LA27_64<='&')||(LA27_64>='(' && LA27_64<='\u00AA')||(LA27_64>='\u00AC' && LA27_64<='\uFFFF')) ) {s = 78;}

                        else if ( (LA27_64=='\u00AB') ) {s = 49;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_47 = input.LA(1);

                        s = -1;
                        if ( (LA27_47=='\'') ) {s = 64;}

                        else if ( ((LA27_47>='\u0000' && LA27_47<='&')||(LA27_47>='(' && LA27_47<='\u00AA')||(LA27_47>='\u00AC' && LA27_47<='\uFFFF')) ) {s = 65;}

                        else if ( (LA27_47=='\u00AB') ) {s = 49;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_74 = input.LA(1);

                        s = -1;
                        if ( (LA27_74=='\'') ) {s = 86;}

                        else if ( ((LA27_74>='\u0000' && LA27_74<='&')||(LA27_74>='(' && LA27_74<='\u00AA')||(LA27_74>='\u00AC' && LA27_74<='\uFFFF')) ) {s = 87;}

                        else if ( (LA27_74=='\u00AB') ) {s = 76;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='{') ) {s = 1;}

                        else if ( (LA27_0=='}') ) {s = 2;}

                        else if ( (LA27_0=='p') ) {s = 3;}

                        else if ( (LA27_0=='b') ) {s = 4;}

                        else if ( (LA27_0=='d') ) {s = 5;}

                        else if ( (LA27_0=='f') ) {s = 6;}

                        else if ( (LA27_0=='(') ) {s = 7;}

                        else if ( (LA27_0==',') ) {s = 8;}

                        else if ( (LA27_0==')') ) {s = 9;}

                        else if ( (LA27_0==':') ) {s = 10;}

                        else if ( (LA27_0=='[') ) {s = 11;}

                        else if ( (LA27_0==']') ) {s = 12;}

                        else if ( (LA27_0=='.') ) {s = 13;}

                        else if ( (LA27_0=='A') ) {s = 14;}

                        else if ( (LA27_0=='N') ) {s = 15;}

                        else if ( (LA27_0=='D') ) {s = 16;}

                        else if ( (LA27_0=='T') ) {s = 17;}

                        else if ( (LA27_0=='\'') ) {s = 18;}

                        else if ( (LA27_0=='\u00BB') ) {s = 19;}

                        else if ( (LA27_0=='^') ) {s = 20;}

                        else if ( ((LA27_0>='B' && LA27_0<='C')||(LA27_0>='E' && LA27_0<='M')||(LA27_0>='O' && LA27_0<='S')||(LA27_0>='U' && LA27_0<='Z')||LA27_0=='_'||LA27_0=='a'||LA27_0=='c'||LA27_0=='e'||(LA27_0>='g' && LA27_0<='o')||(LA27_0>='q' && LA27_0<='z')) ) {s = 21;}

                        else if ( ((LA27_0>='0' && LA27_0<='9')) ) {s = 22;}

                        else if ( (LA27_0=='\"') ) {s = 23;}

                        else if ( (LA27_0=='/') ) {s = 24;}

                        else if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {s = 25;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||LA27_0=='!'||(LA27_0>='#' && LA27_0<='&')||(LA27_0>='*' && LA27_0<='+')||LA27_0=='-'||(LA27_0>=';' && LA27_0<='@')||LA27_0=='\\'||LA27_0=='`'||LA27_0=='|'||(LA27_0>='~' && LA27_0<='\u00BA')||(LA27_0>='\u00BC' && LA27_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_86 = input.LA(1);

                        s = -1;
                        if ( ((LA27_86>='\u0000' && LA27_86<='&')||(LA27_86>='(' && LA27_86<='\u00AA')||(LA27_86>='\u00AC' && LA27_86<='\uFFFF')) ) {s = 94;}

                        else if ( (LA27_86=='\u00AB') ) {s = 76;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_23 = input.LA(1);

                        s = -1;
                        if ( ((LA27_23>='\u0000' && LA27_23<='\uFFFF')) ) {s = 46;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_18 = input.LA(1);

                        s = -1;
                        if ( (LA27_18=='\'') ) {s = 45;}

                        else if ( ((LA27_18>='\u0000' && LA27_18<='&')||(LA27_18>='(' && LA27_18<='\uFFFF')) ) {s = 46;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_19 = input.LA(1);

                        s = -1;
                        if ( (LA27_19=='\'') ) {s = 47;}

                        else if ( ((LA27_19>='\u0000' && LA27_19<='&')||(LA27_19>='(' && LA27_19<='\u00AA')||(LA27_19>='\u00AC' && LA27_19<='\uFFFF')) ) {s = 48;}

                        else if ( (LA27_19=='\u00AB') ) {s = 49;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_94 = input.LA(1);

                        s = -1;
                        if ( (LA27_94=='\'') ) {s = 74;}

                        else if ( (LA27_94=='\u00AB') ) {s = 76;}

                        else if ( ((LA27_94>='\u0000' && LA27_94<='&')||(LA27_94>='(' && LA27_94<='\u00AA')||(LA27_94>='\u00AC' && LA27_94<='\uFFFF')) ) {s = 75;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_87 = input.LA(1);

                        s = -1;
                        if ( (LA27_87=='\'') ) {s = 74;}

                        else if ( (LA27_87=='\u00AB') ) {s = 76;}

                        else if ( ((LA27_87>='\u0000' && LA27_87<='&')||(LA27_87>='(' && LA27_87<='\u00AA')||(LA27_87>='\u00AC' && LA27_87<='\uFFFF')) ) {s = 75;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_63 = input.LA(1);

                        s = -1;
                        if ( (LA27_63=='\'') ) {s = 74;}

                        else if ( ((LA27_63>='\u0000' && LA27_63<='&')||(LA27_63>='(' && LA27_63<='\u00AA')||(LA27_63>='\u00AC' && LA27_63<='\uFFFF')) ) {s = 75;}

                        else if ( (LA27_63=='\u00AB') ) {s = 76;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_75 = input.LA(1);

                        s = -1;
                        if ( (LA27_75=='\'') ) {s = 74;}

                        else if ( (LA27_75=='\u00AB') ) {s = 76;}

                        else if ( ((LA27_75>='\u0000' && LA27_75<='&')||(LA27_75>='(' && LA27_75<='\u00AA')||(LA27_75>='\u00AC' && LA27_75<='\uFFFF')) ) {s = 75;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_78 = input.LA(1);

                        s = -1;
                        if ( (LA27_78=='\'') ) {s = 47;}

                        else if ( ((LA27_78>='\u0000' && LA27_78<='&')||(LA27_78>='(' && LA27_78<='\u00AA')||(LA27_78>='\u00AC' && LA27_78<='\uFFFF')) ) {s = 48;}

                        else if ( (LA27_78=='\u00AB') ) {s = 49;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_65 = input.LA(1);

                        s = -1;
                        if ( (LA27_65=='\'') ) {s = 47;}

                        else if ( (LA27_65=='\u00AB') ) {s = 49;}

                        else if ( ((LA27_65>='\u0000' && LA27_65<='&')||(LA27_65>='(' && LA27_65<='\u00AA')||(LA27_65>='\u00AC' && LA27_65<='\uFFFF')) ) {s = 48;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA27_48 = input.LA(1);

                        s = -1;
                        if ( (LA27_48=='\'') ) {s = 47;}

                        else if ( (LA27_48=='\u00AB') ) {s = 49;}

                        else if ( ((LA27_48>='\u0000' && LA27_48<='&')||(LA27_48>='(' && LA27_48<='\u00AA')||(LA27_48>='\u00AC' && LA27_48<='\uFFFF')) ) {s = 48;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}