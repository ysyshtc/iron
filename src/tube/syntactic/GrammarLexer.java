// Generated from ./src/tube/syntactic/Grammar.g4 by ANTLR 4.0

package tube.syntactic;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__57=1, T__56=2, T__55=3, T__54=4, T__53=5, T__52=6, T__51=7, T__50=8, 
		T__49=9, T__48=10, T__47=11, T__46=12, T__45=13, T__44=14, T__43=15, T__42=16, 
		T__41=17, T__40=18, T__39=19, T__38=20, T__37=21, T__36=22, T__35=23, 
		T__34=24, T__33=25, T__32=26, T__31=27, T__30=28, T__29=29, T__28=30, 
		T__27=31, T__26=32, T__25=33, T__24=34, T__23=35, T__22=36, T__21=37, 
		T__20=38, T__19=39, T__18=40, T__17=41, T__16=42, T__15=43, T__14=44, 
		T__13=45, T__12=46, T__11=47, T__10=48, T__9=49, T__8=50, T__7=51, T__6=52, 
		T__5=53, T__4=54, T__3=55, T__2=56, T__1=57, T__0=58, ID=59, INT=60, CHAR=61, 
		STRING=62, WS=63, COMMENT=64, PREPROCESS=65;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'&'", "'['", "'*'", "'<'", "'--'", "'continue'", "'!='", "'<='", "'<<'", 
		"'}'", "'char'", "'%'", "'->'", "'union'", "'*='", "')'", "'='", "'|='", 
		"'|'", "'!'", "'sizeof'", "'<<='", "']'", "'-='", "','", "'-'", "'while'", 
		"'('", "'&='", "'if'", "'int'", "'void'", "'>>='", "'{'", "'...'", "'break'", 
		"'+='", "'^='", "'else'", "'struct'", "'++'", "'>>'", "'^'", "'.'", "'+'", 
		"'for'", "'typedef'", "'return'", "';'", "'&&'", "'||'", "'>'", "'%='", 
		"'/='", "'=='", "'/'", "'~'", "'>='", "ID", "INT", "CHAR", "STRING", "WS", 
		"COMMENT", "PREPROCESS"
	};
	public static final String[] ruleNames = {
		"T__57", "T__56", "T__55", "T__54", "T__53", "T__52", "T__51", "T__50", 
		"T__49", "T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", 
		"T__41", "T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", 
		"T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", 
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "ALPHA", "DIGIT", "HEX", "OCT", "ESCAPE", "ID", "INT", "CHAR", 
		"STRING", "WS", "COMMENT", "PREPROCESS"
	};


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 67: WS_action((RuleContext)_localctx, actionIndex); break;

		case 68: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 69: PREPROCESS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}
	private void PREPROCESS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4C\u01df\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\3"+
		">\3>\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0182\n"+
		"@\3A\3A\5A\u0186\nA\3A\3A\3A\7A\u018b\nA\fA\16A\u018e\13A\3B\3B\3B\6B"+
		"\u0193\nB\rB\16B\u0194\3B\3B\7B\u0199\nB\fB\16B\u019c\13B\3B\3B\7B\u01a0"+
		"\nB\fB\16B\u01a3\13B\5B\u01a5\nB\3C\3C\3C\5C\u01aa\nC\3C\3C\3D\3D\3D\7"+
		"D\u01b1\nD\fD\16D\u01b4\13D\3D\3D\3E\6E\u01b9\nE\rE\16E\u01ba\3E\3E\3"+
		"F\3F\3F\3F\7F\u01c3\nF\fF\16F\u01c6\13F\3F\3F\3F\3F\3F\3F\7F\u01ce\nF"+
		"\fF\16F\u01d1\13F\5F\u01d3\nF\3F\3F\3G\3G\7G\u01d9\nG\fG\16G\u01dc\13"+
		"G\3G\3G\3\u01c4H\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1"+
		";\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1["+
		"/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<"+
		"\1w\2\1y\2\1{\2\1}\2\1\177\2\1\u0081=\1\u0083>\1\u0085?\1\u0087@\1\u0089"+
		"A\2\u008bB\3\u008dC\4\3\2\21\4C\\c|\3\62;\5\62;CHch\3\629\4ZZzz\4ZZzz"+
		"\4&&aa\4&&aa\4ZZzz\3\63;\3^^\3^^\5\13\f\16\17\"\"\4\f\f\17\17\4\f\f\17"+
		"\17\u01f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0091\3\2\2\2\7\u0093\3\2\2"+
		"\2\t\u0095\3\2\2\2\13\u0097\3\2\2\2\r\u009a\3\2\2\2\17\u00a3\3\2\2\2\21"+
		"\u00a6\3\2\2\2\23\u00a9\3\2\2\2\25\u00ac\3\2\2\2\27\u00ae\3\2\2\2\31\u00b3"+
		"\3\2\2\2\33\u00b5\3\2\2\2\35\u00b8\3\2\2\2\37\u00be\3\2\2\2!\u00c1\3\2"+
		"\2\2#\u00c3\3\2\2\2%\u00c5\3\2\2\2\'\u00c8\3\2\2\2)\u00ca\3\2\2\2+\u00cc"+
		"\3\2\2\2-\u00d3\3\2\2\2/\u00d7\3\2\2\2\61\u00d9\3\2\2\2\63\u00dc\3\2\2"+
		"\2\65\u00de\3\2\2\2\67\u00e0\3\2\2\29\u00e6\3\2\2\2;\u00e8\3\2\2\2=\u00eb"+
		"\3\2\2\2?\u00ee\3\2\2\2A\u00f2\3\2\2\2C\u00f7\3\2\2\2E\u00fb\3\2\2\2G"+
		"\u00fd\3\2\2\2I\u0101\3\2\2\2K\u0107\3\2\2\2M\u010a\3\2\2\2O\u010d\3\2"+
		"\2\2Q\u0112\3\2\2\2S\u0119\3\2\2\2U\u011c\3\2\2\2W\u011f\3\2\2\2Y\u0121"+
		"\3\2\2\2[\u0123\3\2\2\2]\u0125\3\2\2\2_\u0129\3\2\2\2a\u0131\3\2\2\2c"+
		"\u0138\3\2\2\2e\u013a\3\2\2\2g\u013d\3\2\2\2i\u0140\3\2\2\2k\u0142\3\2"+
		"\2\2m\u0145\3\2\2\2o\u0148\3\2\2\2q\u014b\3\2\2\2s\u014d\3\2\2\2u\u014f"+
		"\3\2\2\2w\u0152\3\2\2\2y\u0154\3\2\2\2{\u0156\3\2\2\2}\u0158\3\2\2\2\177"+
		"\u0181\3\2\2\2\u0081\u0185\3\2\2\2\u0083\u01a4\3\2\2\2\u0085\u01a6\3\2"+
		"\2\2\u0087\u01ad\3\2\2\2\u0089\u01b8\3\2\2\2\u008b\u01d2\3\2\2\2\u008d"+
		"\u01d6\3\2\2\2\u008f\u0090\7(\2\2\u0090\4\3\2\2\2\u0091\u0092\7]\2\2\u0092"+
		"\6\3\2\2\2\u0093\u0094\7,\2\2\u0094\b\3\2\2\2\u0095\u0096\7>\2\2\u0096"+
		"\n\3\2\2\2\u0097\u0098\7/\2\2\u0098\u0099\7/\2\2\u0099\f\3\2\2\2\u009a"+
		"\u009b\7e\2\2\u009b\u009c\7q\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2\2"+
		"\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2"+
		"\7g\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\7?\2\2\u00a5\20"+
		"\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7?\2\2\u00a8\22\3\2\2\2\u00a9"+
		"\u00aa\7>\2\2\u00aa\u00ab\7>\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7\177\2"+
		"\2\u00ad\26\3\2\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1"+
		"\7c\2\2\u00b1\u00b2\7t\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7\'\2\2\u00b4"+
		"\32\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6\u00b7\7@\2\2\u00b7\34\3\2\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7q\2\2"+
		"\u00bc\u00bd\7p\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7,\2\2\u00bf\u00c0\7"+
		"?\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7+\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7"+
		"?\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7~\2\2\u00c6\u00c7\7?\2\2\u00c7&\3\2"+
		"\2\2\u00c8\u00c9\7~\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb*\3\2\2"+
		"\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7|\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7h\2\2\u00d2,\3\2\2\2\u00d3\u00d4"+
		"\7>\2\2\u00d4\u00d5\7>\2\2\u00d5\u00d6\7?\2\2\u00d6.\3\2\2\2\u00d7\u00d8"+
		"\7_\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7/\2\2\u00da\u00db\7?\2\2\u00db\62"+
		"\3\2\2\2\u00dc\u00dd\7.\2\2\u00dd\64\3\2\2\2\u00de\u00df\7/\2\2\u00df"+
		"\66\3\2\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4\u00e5\7g\2\2\u00e58\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7"+
		":\3\2\2\2\u00e8\u00e9\7(\2\2\u00e9\u00ea\7?\2\2\u00ea<\3\2\2\2\u00eb\u00ec"+
		"\7k\2\2\u00ec\u00ed\7h\2\2\u00ed>\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7p\2\2\u00f0\u00f1\7v\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7x\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7f\2\2\u00f6B\3\2\2\2\u00f7\u00f8"+
		"\7@\2\2\u00f8\u00f9\7@\2\2\u00f9\u00fa\7?\2\2\u00faD\3\2\2\2\u00fb\u00fc"+
		"\7}\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7\60\2\2\u00fe\u00ff\7\60\2\2\u00ff"+
		"\u0100\7\60\2\2\u0100H\3\2\2\2\u0101\u0102\7d\2\2\u0102\u0103\7t\2\2\u0103"+
		"\u0104\7g\2\2\u0104\u0105\7c\2\2\u0105\u0106\7m\2\2\u0106J\3\2\2\2\u0107"+
		"\u0108\7-\2\2\u0108\u0109\7?\2\2\u0109L\3\2\2\2\u010a\u010b\7`\2\2\u010b"+
		"\u010c\7?\2\2\u010cN\3\2\2\2\u010d\u010e\7g\2\2\u010e\u010f\7n\2\2\u010f"+
		"\u0110\7u\2\2\u0110\u0111\7g\2\2\u0111P\3\2\2\2\u0112\u0113\7u\2\2\u0113"+
		"\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116\7w\2\2\u0116\u0117\7e\2\2"+
		"\u0117\u0118\7v\2\2\u0118R\3\2\2\2\u0119\u011a\7-\2\2\u011a\u011b\7-\2"+
		"\2\u011bT\3\2\2\2\u011c\u011d\7@\2\2\u011d\u011e\7@\2\2\u011eV\3\2\2\2"+
		"\u011f\u0120\7`\2\2\u0120X\3\2\2\2\u0121\u0122\7\60\2\2\u0122Z\3\2\2\2"+
		"\u0123\u0124\7-\2\2\u0124\\\3\2\2\2\u0125\u0126\7h\2\2\u0126\u0127\7q"+
		"\2\2\u0127\u0128\7t\2\2\u0128^\3\2\2\2\u0129\u012a\7v\2\2\u012a\u012b"+
		"\7{\2\2\u012b\u012c\7r\2\2\u012c\u012d\7g\2\2\u012d\u012e\7f\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7h\2\2\u0130`\3\2\2\2\u0131\u0132\7t\2\2\u0132"+
		"\u0133\7g\2\2\u0133\u0134\7v\2\2\u0134\u0135\7w\2\2\u0135\u0136\7t\2\2"+
		"\u0136\u0137\7p\2\2\u0137b\3\2\2\2\u0138\u0139\7=\2\2\u0139d\3\2\2\2\u013a"+
		"\u013b\7(\2\2\u013b\u013c\7(\2\2\u013cf\3\2\2\2\u013d\u013e\7~\2\2\u013e"+
		"\u013f\7~\2\2\u013fh\3\2\2\2\u0140\u0141\7@\2\2\u0141j\3\2\2\2\u0142\u0143"+
		"\7\'\2\2\u0143\u0144\7?\2\2\u0144l\3\2\2\2\u0145\u0146\7\61\2\2\u0146"+
		"\u0147\7?\2\2\u0147n\3\2\2\2\u0148\u0149\7?\2\2\u0149\u014a\7?\2\2\u014a"+
		"p\3\2\2\2\u014b\u014c\7\61\2\2\u014cr\3\2\2\2\u014d\u014e\7\u0080\2\2"+
		"\u014et\3\2\2\2\u014f\u0150\7@\2\2\u0150\u0151\7?\2\2\u0151v\3\2\2\2\u0152"+
		"\u0153\t\2\2\2\u0153x\3\2\2\2\u0154\u0155\t\3\2\2\u0155z\3\2\2\2\u0156"+
		"\u0157\t\4\2\2\u0157|\3\2\2\2\u0158\u0159\t\5\2\2\u0159~\3\2\2\2\u015a"+
		"\u015b\7^\2\2\u015b\u0182\7c\2\2\u015c\u015d\7^\2\2\u015d\u0182\7d\2\2"+
		"\u015e\u015f\7^\2\2\u015f\u0182\7h\2\2\u0160\u0161\7^\2\2\u0161\u0182"+
		"\7p\2\2\u0162\u0163\7^\2\2\u0163\u0182\7t\2\2\u0164\u0165\7^\2\2\u0165"+
		"\u0182\7v\2\2\u0166\u0167\7^\2\2\u0167\u0182\7x\2\2\u0168\u0169\7^\2\2"+
		"\u0169\u0182\7^\2\2\u016a\u016b\7^\2\2\u016b\u0182\7)\2\2\u016c\u016d"+
		"\7^\2\2\u016d\u0182\7$\2\2\u016e\u016f\7^\2\2\u016f\u0182\5}?\2\u0170"+
		"\u0171\7^\2\2\u0171\u0172\5}?\2\u0172\u0173\5}?\2\u0173\u0182\3\2\2\2"+
		"\u0174\u0175\7^\2\2\u0175\u0176\5}?\2\u0176\u0177\5}?\2\u0177\u0178\5"+
		"}?\2\u0178\u0182\3\2\2\2\u0179\u017a\7^\2\2\u017a\u017b\t\6\2\2\u017b"+
		"\u0182\5{>\2\u017c\u017d\7^\2\2\u017d\u017e\t\7\2\2\u017e\u017f\5{>\2"+
		"\u017f\u0180\5{>\2\u0180\u0182\3\2\2\2\u0181\u015a\3\2\2\2\u0181\u015c"+
		"\3\2\2\2\u0181\u015e\3\2\2\2\u0181\u0160\3\2\2\2\u0181\u0162\3\2\2\2\u0181"+
		"\u0164\3\2\2\2\u0181\u0166\3\2\2\2\u0181\u0168\3\2\2\2\u0181\u016a\3\2"+
		"\2\2\u0181\u016c\3\2\2\2\u0181\u016e\3\2\2\2\u0181\u0170\3\2\2\2\u0181"+
		"\u0174\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u017c\3\2\2\2\u0182\u0080\3\2"+
		"\2\2\u0183\u0186\t\b\2\2\u0184\u0186\5w<\2\u0185\u0183\3\2\2\2\u0185\u0184"+
		"\3\2\2\2\u0186\u018c\3\2\2\2\u0187\u018b\5y=\2\u0188\u018b\5w<\2\u0189"+
		"\u018b\t\t\2\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2"+
		"\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u0082\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\62\2\2\u0190\u0192\t"+
		"\n\2\2\u0191\u0193\5{>\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u01a5\3\2\2\2\u0196\u019a\t\13"+
		"\2\2\u0197\u0199\5y=\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a5\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u01a1\7\62\2\2\u019e\u01a0\5}?\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u018f\3\2\2\2\u01a4\u0196\3\2\2\2\u01a4\u019d\3\2"+
		"\2\2\u01a5\u0084\3\2\2\2\u01a6\u01a9\7)\2\2\u01a7\u01aa\n\f\2\2\u01a8"+
		"\u01aa\5\177@\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01ab\u01ac\7)\2\2\u01ac\u0086\3\2\2\2\u01ad\u01b2\7$\2\2\u01ae"+
		"\u01b1\n\r\2\2\u01af\u01b1\5\177@\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3"+
		"\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7$\2\2\u01b6\u0088\3\2"+
		"\2\2\u01b7\u01b9\t\16\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\bE"+
		"\2\2\u01bd\u008a\3\2\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c0\7,\2\2\u01c0"+
		"\u01c4\3\2\2\2\u01c1\u01c3\13\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3"+
		"\2\2\2\u01c4\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c8\7,\2\2\u01c8\u01d3\7\61\2\2\u01c9\u01ca\7\61"+
		"\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cf\3\2\2\2\u01cc\u01ce\n\17\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01be\3\2\2\2\u01d2"+
		"\u01c9\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\bF\3\2\u01d5\u008c\3\2"+
		"\2\2\u01d6\u01da\7%\2\2\u01d7\u01d9\n\20\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\bG\4\2\u01de\u008e\3\2\2\2\23\2\u0181"+
		"\u0185\u018a\u018c\u0194\u019a\u01a1\u01a4\u01a9\u01b0\u01b2\u01ba\u01c4"+
		"\u01cf\u01d2\u01da";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}