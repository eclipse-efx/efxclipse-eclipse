/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssExtDslLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=4;
    public static final int RULE_PSEUDO=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_REGEX=10;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int RULE_JDOC=6;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalCssExtDslLexer() {;} 
    public InternalCssExtDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCssExtDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCssExtDsl.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:11:7: ( '*' )
            // InternalCssExtDsl.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:12:7: ( '+' )
            // InternalCssExtDsl.g:12:9: '+'
            {
            match('+'); 

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
            // InternalCssExtDsl.g:13:7: ( '?' )
            // InternalCssExtDsl.g:13:9: '?'
            {
            match('?'); 

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
            // InternalCssExtDsl.g:14:7: ( ',' )
            // InternalCssExtDsl.g:14:9: ','
            {
            match(','); 

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
            // InternalCssExtDsl.g:15:7: ( '%' )
            // InternalCssExtDsl.g:15:9: '%'
            {
            match('%'); 

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
            // InternalCssExtDsl.g:16:7: ( 'import' )
            // InternalCssExtDsl.g:16:9: 'import'
            {
            match("import"); 


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
            // InternalCssExtDsl.g:17:7: ( '.' )
            // InternalCssExtDsl.g:17:9: '.'
            {
            match('.'); 

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
            // InternalCssExtDsl.g:18:7: ( 'package' )
            // InternalCssExtDsl.g:18:9: 'package'
            {
            match("package"); 


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
            // InternalCssExtDsl.g:19:7: ( '{' )
            // InternalCssExtDsl.g:19:9: '{'
            {
            match('{'); 

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
            // InternalCssExtDsl.g:20:7: ( '}' )
            // InternalCssExtDsl.g:20:9: '}'
            {
            match('}'); 

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
            // InternalCssExtDsl.g:21:7: ( '(' )
            // InternalCssExtDsl.g:21:9: '('
            {
            match('('); 

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
            // InternalCssExtDsl.g:22:7: ( '->' )
            // InternalCssExtDsl.g:22:9: '->'
            {
            match("->"); 


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
            // InternalCssExtDsl.g:23:7: ( ')' )
            // InternalCssExtDsl.g:23:9: ')'
            {
            match(')'); 

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
            // InternalCssExtDsl.g:24:7: ( 'extends' )
            // InternalCssExtDsl.g:24:9: 'extends'
            {
            match("extends"); 


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
            // InternalCssExtDsl.g:25:7: ( 'styleclass' )
            // InternalCssExtDsl.g:25:9: 'styleclass'
            {
            match("styleclass"); 


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
            // InternalCssExtDsl.g:26:7: ( ';' )
            // InternalCssExtDsl.g:26:9: ';'
            {
            match(';'); 

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
            // InternalCssExtDsl.g:27:7: ( 'default:' )
            // InternalCssExtDsl.g:27:9: 'default:'
            {
            match("default:"); 


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
            // InternalCssExtDsl.g:28:7: ( '<' )
            // InternalCssExtDsl.g:28:9: '<'
            {
            match('<'); 

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
            // InternalCssExtDsl.g:29:7: ( '>' )
            // InternalCssExtDsl.g:29:9: '>'
            {
            match('>'); 

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
            // InternalCssExtDsl.g:30:7: ( '=' )
            // InternalCssExtDsl.g:30:9: '='
            {
            match('='); 

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
            // InternalCssExtDsl.g:31:7: ( '|' )
            // InternalCssExtDsl.g:31:9: '|'
            {
            match('|'); 

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
            // InternalCssExtDsl.g:32:7: ( '||' )
            // InternalCssExtDsl.g:32:9: '||'
            {
            match("||"); 


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
            // InternalCssExtDsl.g:33:7: ( '~' )
            // InternalCssExtDsl.g:33:9: '~'
            {
            match('~'); 

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
            // InternalCssExtDsl.g:34:7: ( '[' )
            // InternalCssExtDsl.g:34:9: '['
            {
            match('['); 

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
            // InternalCssExtDsl.g:35:7: ( ']' )
            // InternalCssExtDsl.g:35:9: ']'
            {
            match(']'); 

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
            // InternalCssExtDsl.g:36:7: ( 'substructure' )
            // InternalCssExtDsl.g:36:9: 'substructure'
            {
            match("substructure"); 


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
            // InternalCssExtDsl.g:37:7: ( '@INT' )
            // InternalCssExtDsl.g:37:9: '@INT'
            {
            match("@INT"); 


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
            // InternalCssExtDsl.g:38:7: ( '@NUM' )
            // InternalCssExtDsl.g:38:9: '@NUM'
            {
            match("@NUM"); 


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
            // InternalCssExtDsl.g:39:7: ( '@STRING' )
            // InternalCssExtDsl.g:39:9: '@STRING'
            {
            match("@STRING"); 


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
            // InternalCssExtDsl.g:40:7: ( '@URL' )
            // InternalCssExtDsl.g:40:9: '@URL'
            {
            match("@URL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_PSEUDO"
    public final void mRULE_PSEUDO() throws RecognitionException {
        try {
            int _type = RULE_PSEUDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:7756:13: ( ':' ~ ( ' ' ) RULE_ID )
            // InternalCssExtDsl.g:7756:15: ':' ~ ( ' ' ) RULE_ID
            {
            match(':'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PSEUDO"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:7758:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' )* )
            // InternalCssExtDsl.g:7758:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' )*
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCssExtDsl.g:7758:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCssExtDsl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
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

    // $ANTLR start "RULE_JDOC"
    public final void mRULE_JDOC() throws RecognitionException {
        try {
            int _type = RULE_JDOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:7760:11: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalCssExtDsl.g:7760:13: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalCssExtDsl.g:7760:19: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCssExtDsl.g:7760:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "RULE_JDOC"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:7762:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalCssExtDsl.g:7762:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCssExtDsl.g:7762:31: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCssExtDsl.g:7762:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // InternalCssExtDsl.g:7764:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCssExtDsl.g:7764:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCssExtDsl.g:7764:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCssExtDsl.g:7764:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // InternalCssExtDsl.g:7764:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCssExtDsl.g:7764:41: ( '\\r' )? '\\n'
                    {
                    // InternalCssExtDsl.g:7764:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalCssExtDsl.g:7764:41: '\\r'
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:7766:10: ( ( '-' )? ( '0' .. '9' )+ )
            // InternalCssExtDsl.g:7766:12: ( '-' )? ( '0' .. '9' )+
            {
            // InternalCssExtDsl.g:7766:12: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCssExtDsl.g:7766:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalCssExtDsl.g:7766:17: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCssExtDsl.g:7766:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:7768:13: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // InternalCssExtDsl.g:7768:15: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            // InternalCssExtDsl.g:7768:15: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCssExtDsl.g:7768:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalCssExtDsl.g:7768:20: ( '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCssExtDsl.g:7768:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('.'); 
            // InternalCssExtDsl.g:7768:36: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCssExtDsl.g:7768:37: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_REGEX"
    public final void mRULE_REGEX() throws RecognitionException {
        try {
            int _type = RULE_REGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:7770:12: ( '$' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | ',' | '.' | '?' | '\\'' | ':' | '\"' | '>' | '<' | '/' | '_' | '=' | ';' | '(' | ')' | '&' | '!' | '#' | '%' | '*' | '+' | '[' | ']' | '{' | '}' )+ '$' )
            // InternalCssExtDsl.g:7770:14: '$' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | ',' | '.' | '?' | '\\'' | ':' | '\"' | '>' | '<' | '/' | '_' | '=' | ';' | '(' | ')' | '&' | '!' | '#' | '%' | '*' | '+' | '[' | ']' | '{' | '}' )+ '$'
            {
            match('$'); 
            // InternalCssExtDsl.g:7770:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | ',' | '.' | '?' | '\\'' | ':' | '\"' | '>' | '<' | '/' | '_' | '=' | ';' | '(' | ')' | '&' | '!' | '#' | '%' | '*' | '+' | '[' | ']' | '{' | '}' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='!' && LA12_0<='#')||(LA12_0>='%' && LA12_0<='?')||(LA12_0>='A' && LA12_0<='[')||LA12_0==']'||LA12_0=='_'||(LA12_0>='a' && LA12_0<='{')||LA12_0=='}') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCssExtDsl.g:
            	    {
            	    if ( (input.LA(1)>='!' && input.LA(1)<='#')||(input.LA(1)>='%' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='{')||input.LA(1)=='}' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGEX"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:7772:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCssExtDsl.g:7772:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCssExtDsl.g:7772:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCssExtDsl.g:7772:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCssExtDsl.g:7772:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:7772:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCssExtDsl.g:7772:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:7772:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCssExtDsl.g:7772:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:7772:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCssExtDsl.g:7772:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssExtDsl.g:7774:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCssExtDsl.g:7774:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCssExtDsl.g:7774:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCssExtDsl.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalCssExtDsl.g:7776:16: ( . )
            // InternalCssExtDsl.g:7776:18: .
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
        // InternalCssExtDsl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_PSEUDO | RULE_ID | RULE_JDOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_DOUBLE | RULE_REGEX | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt17=41;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalCssExtDsl.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalCssExtDsl.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalCssExtDsl.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalCssExtDsl.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalCssExtDsl.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalCssExtDsl.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalCssExtDsl.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalCssExtDsl.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalCssExtDsl.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalCssExtDsl.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalCssExtDsl.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalCssExtDsl.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalCssExtDsl.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalCssExtDsl.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalCssExtDsl.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalCssExtDsl.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalCssExtDsl.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalCssExtDsl.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalCssExtDsl.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalCssExtDsl.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalCssExtDsl.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalCssExtDsl.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalCssExtDsl.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalCssExtDsl.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalCssExtDsl.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalCssExtDsl.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalCssExtDsl.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalCssExtDsl.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalCssExtDsl.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalCssExtDsl.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalCssExtDsl.g:1:190: RULE_PSEUDO
                {
                mRULE_PSEUDO(); 

                }
                break;
            case 32 :
                // InternalCssExtDsl.g:1:202: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalCssExtDsl.g:1:210: RULE_JDOC
                {
                mRULE_JDOC(); 

                }
                break;
            case 34 :
                // InternalCssExtDsl.g:1:220: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // InternalCssExtDsl.g:1:236: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // InternalCssExtDsl.g:1:252: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalCssExtDsl.g:1:261: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 38 :
                // InternalCssExtDsl.g:1:273: RULE_REGEX
                {
                mRULE_REGEX(); 

                }
                break;
            case 39 :
                // InternalCssExtDsl.g:1:284: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalCssExtDsl.g:1:296: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalCssExtDsl.g:1:304: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\6\uffff\1\51\1\52\1\51\3\uffff\1\51\1\uffff\2\51\1\uffff\1\51\3\uffff\1\74\3\uffff\2\42\1\uffff\1\42\1\110\3\42\7\uffff\1\51\3\uffff\1\51\4\uffff\1\51\1\uffff\3\51\1\uffff\1\51\17\uffff\1\110\4\uffff\6\51\2\uffff\14\51\1\146\5\51\1\uffff\1\154\1\155\3\51\2\uffff\2\51\1\uffff\2\51\1\165\1\51\1\uffff\1\51\1\170\1\uffff";
    static final String DFA17_eofS =
        "\171\uffff";
    static final String DFA17_minS =
        "\1\0\5\uffff\1\155\1\60\1\141\3\uffff\1\56\1\uffff\1\170\1\164\1\uffff\1\145\3\uffff\1\174\3\uffff\1\111\1\0\1\uffff\1\52\1\56\1\41\2\0\7\uffff\1\160\3\uffff\1\143\4\uffff\1\56\1\uffff\1\164\1\171\1\142\1\uffff\1\146\15\uffff\1\0\1\uffff\1\56\4\uffff\1\157\1\153\1\145\1\154\1\163\1\141\2\uffff\1\162\1\141\1\156\1\145\1\164\1\165\1\164\1\147\1\144\1\143\1\162\1\154\1\55\1\145\1\163\1\154\1\165\1\164\1\uffff\2\55\1\141\1\143\1\72\2\uffff\1\163\1\164\1\uffff\1\163\1\165\1\55\1\162\1\uffff\1\145\1\55\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\5\uffff\1\155\1\71\1\141\3\uffff\1\76\1\uffff\1\170\1\165\1\uffff\1\145\3\uffff\1\174\3\uffff\1\125\1\uffff\1\uffff\1\57\1\71\1\175\2\uffff\7\uffff\1\160\3\uffff\1\143\4\uffff\1\71\1\uffff\1\164\1\171\1\142\1\uffff\1\146\15\uffff\1\uffff\1\uffff\1\71\4\uffff\1\157\1\153\1\145\1\154\1\163\1\141\2\uffff\1\162\1\141\1\156\1\145\1\164\1\165\1\164\1\147\1\144\1\143\1\162\1\154\1\172\1\145\1\163\1\154\1\165\1\164\1\uffff\2\172\1\141\1\143\1\72\2\uffff\1\163\1\164\1\uffff\1\163\1\165\1\172\1\162\1\uffff\1\145\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\3\uffff\1\11\1\12\1\13\1\uffff\1\15\2\uffff\1\20\1\uffff\1\22\1\23\1\24\1\uffff\1\27\1\30\1\31\2\uffff\1\40\5\uffff\1\50\1\51\1\1\1\2\1\3\1\4\1\5\1\uffff\1\40\1\7\1\45\1\uffff\1\11\1\12\1\13\1\14\1\uffff\1\15\3\uffff\1\20\1\uffff\1\22\1\23\1\24\1\26\1\25\1\27\1\30\1\31\1\33\1\34\1\35\1\36\1\37\1\uffff\1\43\1\uffff\1\44\1\46\1\47\1\50\6\uffff\1\41\1\42\22\uffff\1\6\5\uffff\1\10\1\16\2\uffff\1\21\4\uffff\1\17\2\uffff\1\32";
    static final String DFA17_specialS =
        "\1\2\31\uffff\1\3\4\uffff\1\0\1\4\44\uffff\1\1\63\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\37\1\42\1\36\1\5\1\42\1\40\1\13\1\15\1\1\1\2\1\4\1\14\1\7\1\34\12\35\1\32\1\20\1\22\1\24\1\23\1\3\1\31\32\33\1\27\1\42\1\30\1\42\1\33\1\42\3\33\1\21\1\16\3\33\1\6\6\33\1\10\2\33\1\17\7\33\1\11\1\25\1\12\1\26\uff81\42",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\12\53",
            "\1\54",
            "",
            "",
            "",
            "\1\53\1\uffff\12\61\4\uffff\1\60",
            "",
            "\1\63",
            "\1\64\1\65",
            "",
            "\1\67",
            "",
            "",
            "",
            "\1\73",
            "",
            "",
            "",
            "\1\100\4\uffff\1\101\4\uffff\1\102\1\uffff\1\103",
            "\40\104\1\uffff\uffdf\104",
            "",
            "\1\105\4\uffff\1\106",
            "\1\53\1\uffff\12\107",
            "\3\111\1\uffff\33\111\1\uffff\33\111\1\uffff\1\111\1\uffff\1\111\1\uffff\33\111\1\uffff\1\111",
            "\0\112",
            "\0\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "",
            "",
            "",
            "\1\115",
            "",
            "",
            "",
            "",
            "\1\53\1\uffff\12\61",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
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
            "\52\123\1\122\uffd5\123",
            "",
            "\1\53\1\uffff\12\107",
            "",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\166",
            "",
            "\1\167",
            "\1\51\2\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_PSEUDO | RULE_ID | RULE_JDOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_DOUBLE | RULE_REGEX | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_31 = input.LA(1);

                        s = -1;
                        if ( ((LA17_31>='\u0000' && LA17_31<='\uFFFF')) ) {s = 74;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_69 = input.LA(1);

                        s = -1;
                        if ( (LA17_69=='*') ) {s = 82;}

                        else if ( ((LA17_69>='\u0000' && LA17_69<=')')||(LA17_69>='+' && LA17_69<='\uFFFF')) ) {s = 83;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='*') ) {s = 1;}

                        else if ( (LA17_0=='+') ) {s = 2;}

                        else if ( (LA17_0=='?') ) {s = 3;}

                        else if ( (LA17_0==',') ) {s = 4;}

                        else if ( (LA17_0=='%') ) {s = 5;}

                        else if ( (LA17_0=='i') ) {s = 6;}

                        else if ( (LA17_0=='.') ) {s = 7;}

                        else if ( (LA17_0=='p') ) {s = 8;}

                        else if ( (LA17_0=='{') ) {s = 9;}

                        else if ( (LA17_0=='}') ) {s = 10;}

                        else if ( (LA17_0=='(') ) {s = 11;}

                        else if ( (LA17_0=='-') ) {s = 12;}

                        else if ( (LA17_0==')') ) {s = 13;}

                        else if ( (LA17_0=='e') ) {s = 14;}

                        else if ( (LA17_0=='s') ) {s = 15;}

                        else if ( (LA17_0==';') ) {s = 16;}

                        else if ( (LA17_0=='d') ) {s = 17;}

                        else if ( (LA17_0=='<') ) {s = 18;}

                        else if ( (LA17_0=='>') ) {s = 19;}

                        else if ( (LA17_0=='=') ) {s = 20;}

                        else if ( (LA17_0=='|') ) {s = 21;}

                        else if ( (LA17_0=='~') ) {s = 22;}

                        else if ( (LA17_0=='[') ) {s = 23;}

                        else if ( (LA17_0==']') ) {s = 24;}

                        else if ( (LA17_0=='@') ) {s = 25;}

                        else if ( (LA17_0==':') ) {s = 26;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='c')||(LA17_0>='f' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='o')||(LA17_0>='q' && LA17_0<='r')||(LA17_0>='t' && LA17_0<='z')) ) {s = 27;}

                        else if ( (LA17_0=='/') ) {s = 28;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 29;}

                        else if ( (LA17_0=='$') ) {s = 30;}

                        else if ( (LA17_0=='\"') ) {s = 31;}

                        else if ( (LA17_0=='\'') ) {s = 32;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 33;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||LA17_0=='#'||LA17_0=='&'||LA17_0=='\\'||LA17_0=='^'||LA17_0=='`'||(LA17_0>='\u007F' && LA17_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( ((LA17_26>='\u0000' && LA17_26<='\u001F')||(LA17_26>='!' && LA17_26<='\uFFFF')) ) {s = 68;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_32 = input.LA(1);

                        s = -1;
                        if ( ((LA17_32>='\u0000' && LA17_32<='\uFFFF')) ) {s = 74;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}