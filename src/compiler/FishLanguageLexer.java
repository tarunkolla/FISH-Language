package compiler;
// Generated from FishLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FishLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BOOLEAN=10, NUMBER=11, IDENTIFIER=12, DOLLAR=13, ASSIGNMENT=14, MULTIPLY=15, 
		DIVIDE=16, MOD=17, ADD=18, SUBTRACT=19, LBRACE=20, RBRACE=21, EQUALS=22, 
		GTE=23, LTE=24, NE=25, GT=26, LT=27, NEWLINE=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"BOOLEAN", "NUMBER", "IDENTIFIER", "DOLLAR", "ASSIGNMENT", "MULTIPLY", 
		"DIVIDE", "MOD", "ADD", "SUBTRACT", "LBRACE", "RBRACE", "EQUALS", "GTE", 
		"LTE", "NE", "GT", "LT", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'startFISH'", "'endFISH'", "'endif'", "'if'", "':'", "'else'", 
		"'loop'", "'endloop'", "'write'", null, null, null, "'$'", "'='", "'*'", 
		"'/'", "'%'", "'+'", "'-'", "'('", "')'", "'=='", "'>='", "'<='", "'!='", 
		"'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
		"NUMBER", "IDENTIFIER", "DOLLAR", "ASSIGNMENT", "MULTIPLY", "DIVIDE", 
		"MOD", "ADD", "SUBTRACT", "LBRACE", "RBRACE", "EQUALS", "GTE", "LTE", 
		"NE", "GT", "LT", "NEWLINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public FishLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FishLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13z\n\13\3\f\5\f}\n\f\3\f\6\f\u0080\n\f\r\f"+
		"\16\f\u0081\3\r\6\r\u0085\n\r\r\r\16\r\u0086\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36\3\2\6\3\2//\3\2\62;\3\2c|\5\2\13\f\17\17"+
		"\"\"\2\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\3;\3\2\2\2\5E\3\2\2\2\7M\3\2\2\2\tS\3\2\2\2\13V\3\2\2\2\rX\3\2"+
		"\2\2\17]\3\2\2\2\21b\3\2\2\2\23j\3\2\2\2\25y\3\2\2\2\27|\3\2\2\2\31\u0084"+
		"\3\2\2\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008e\3\2"+
		"\2\2#\u0090\3\2\2\2%\u0092\3\2\2\2\'\u0094\3\2\2\2)\u0096\3\2\2\2+\u0098"+
		"\3\2\2\2-\u009a\3\2\2\2/\u009d\3\2\2\2\61\u00a0\3\2\2\2\63\u00a3\3\2\2"+
		"\2\65\u00a6\3\2\2\2\67\u00a8\3\2\2\29\u00aa\3\2\2\2;<\7u\2\2<=\7v\2\2"+
		"=>\7c\2\2>?\7t\2\2?@\7v\2\2@A\7H\2\2AB\7K\2\2BC\7U\2\2CD\7J\2\2D\4\3\2"+
		"\2\2EF\7g\2\2FG\7p\2\2GH\7f\2\2HI\7H\2\2IJ\7K\2\2JK\7U\2\2KL\7J\2\2L\6"+
		"\3\2\2\2MN\7g\2\2NO\7p\2\2OP\7f\2\2PQ\7k\2\2QR\7h\2\2R\b\3\2\2\2ST\7k"+
		"\2\2TU\7h\2\2U\n\3\2\2\2VW\7<\2\2W\f\3\2\2\2XY\7g\2\2YZ\7n\2\2Z[\7u\2"+
		"\2[\\\7g\2\2\\\16\3\2\2\2]^\7n\2\2^_\7q\2\2_`\7q\2\2`a\7r\2\2a\20\3\2"+
		"\2\2bc\7g\2\2cd\7p\2\2de\7f\2\2ef\7n\2\2fg\7q\2\2gh\7q\2\2hi\7r\2\2i\22"+
		"\3\2\2\2jk\7y\2\2kl\7t\2\2lm\7k\2\2mn\7v\2\2no\7g\2\2o\24\3\2\2\2pq\7"+
		"v\2\2qr\7t\2\2rs\7w\2\2sz\7g\2\2tu\7h\2\2uv\7c\2\2vw\7n\2\2wx\7u\2\2x"+
		"z\7g\2\2yp\3\2\2\2yt\3\2\2\2z\26\3\2\2\2{}\t\2\2\2|{\3\2\2\2|}\3\2\2\2"+
		"}\177\3\2\2\2~\u0080\t\3\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\30\3\2\2\2\u0083\u0085\t\4\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\32\3\2\2\2\u0088\u0089\7&\2\2\u0089\34\3\2\2\2\u008a\u008b"+
		"\7?\2\2\u008b\36\3\2\2\2\u008c\u008d\7,\2\2\u008d \3\2\2\2\u008e\u008f"+
		"\7\61\2\2\u008f\"\3\2\2\2\u0090\u0091\7\'\2\2\u0091$\3\2\2\2\u0092\u0093"+
		"\7-\2\2\u0093&\3\2\2\2\u0094\u0095\7/\2\2\u0095(\3\2\2\2\u0096\u0097\7"+
		"*\2\2\u0097*\3\2\2\2\u0098\u0099\7+\2\2\u0099,\3\2\2\2\u009a\u009b\7?"+
		"\2\2\u009b\u009c\7?\2\2\u009c.\3\2\2\2\u009d\u009e\7@\2\2\u009e\u009f"+
		"\7?\2\2\u009f\60\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2\7?\2\2\u00a2\62"+
		"\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\7?\2\2\u00a5\64\3\2\2\2\u00a6"+
		"\u00a7\7@\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7>\2\2\u00a98\3\2\2\2\u00aa"+
		"\u00ab\t\5\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\35\2\2\u00ad:\3\2\2\2"+
		"\7\2y|\u0081\u0086\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}