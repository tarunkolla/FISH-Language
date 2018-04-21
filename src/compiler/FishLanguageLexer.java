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
		BOOLEAN=10, BINARY=11, NUMBER=12, IDENTIFIER=13, DOLLAR=14, ASSIGNMENT=15, 
		MULTIPLY=16, DIVIDE=17, MOD=18, ADD=19, SUBTRACT=20, LBRACE=21, RBRACE=22, 
		EQUALS=23, GTE=24, LTE=25, NE=26, GT=27, LT=28, BOR=29, BAND=30, NEWLINE=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"BOOLEAN", "BINARY", "NUMBER", "IDENTIFIER", "DOLLAR", "ASSIGNMENT", "MULTIPLY", 
		"DIVIDE", "MOD", "ADD", "SUBTRACT", "LBRACE", "RBRACE", "EQUALS", "GTE", 
		"LTE", "NE", "GT", "LT", "BOR", "BAND", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'startFISH'", "'endFISH'", "'endif'", "'if'", "':'", "'else'", 
		"'loop'", "'endloop'", "'write'", null, null, null, null, "'$'", "'='", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'", "'=='", "'>='", "'<='", 
		"'!='", "'>'", "'<'", "'||'", "'&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
		"BINARY", "NUMBER", "IDENTIFIER", "DOLLAR", "ASSIGNMENT", "MULTIPLY", 
		"DIVIDE", "MOD", "ADD", "SUBTRACT", "LBRACE", "RBRACE", "EQUALS", "GTE", 
		"LTE", "NE", "GT", "LT", "BOR", "BAND", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3\f\3\f\5"+
		"\f\u0084\n\f\3\r\5\r\u0087\n\r\3\r\6\r\u008a\n\r\r\r\16\r\u008b\3\16\6"+
		"\16\u008f\n\16\r\16\16\16\u0090\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\6\3\2//\3\2\62;\3\2c|\5\2"+
		"\13\f\17\17\"\"\2\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5K\3\2\2"+
		"\2\7S\3\2\2\2\tY\3\2\2\2\13\\\3\2\2\2\r^\3\2\2\2\17c\3\2\2\2\21h\3\2\2"+
		"\2\23p\3\2\2\2\25\177\3\2\2\2\27\u0083\3\2\2\2\31\u0086\3\2\2\2\33\u008e"+
		"\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2"+
		"\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a0\3\2\2\2-\u00a2"+
		"\3\2\2\2/\u00a4\3\2\2\2\61\u00a7\3\2\2\2\63\u00aa\3\2\2\2\65\u00ad\3\2"+
		"\2\2\67\u00b0\3\2\2\29\u00b2\3\2\2\2;\u00b4\3\2\2\2=\u00b7\3\2\2\2?\u00ba"+
		"\3\2\2\2AB\7u\2\2BC\7v\2\2CD\7c\2\2DE\7t\2\2EF\7v\2\2FG\7H\2\2GH\7K\2"+
		"\2HI\7U\2\2IJ\7J\2\2J\4\3\2\2\2KL\7g\2\2LM\7p\2\2MN\7f\2\2NO\7H\2\2OP"+
		"\7K\2\2PQ\7U\2\2QR\7J\2\2R\6\3\2\2\2ST\7g\2\2TU\7p\2\2UV\7f\2\2VW\7k\2"+
		"\2WX\7h\2\2X\b\3\2\2\2YZ\7k\2\2Z[\7h\2\2[\n\3\2\2\2\\]\7<\2\2]\f\3\2\2"+
		"\2^_\7g\2\2_`\7n\2\2`a\7u\2\2ab\7g\2\2b\16\3\2\2\2cd\7n\2\2de\7q\2\2e"+
		"f\7q\2\2fg\7r\2\2g\20\3\2\2\2hi\7g\2\2ij\7p\2\2jk\7f\2\2kl\7n\2\2lm\7"+
		"q\2\2mn\7q\2\2no\7r\2\2o\22\3\2\2\2pq\7y\2\2qr\7t\2\2rs\7k\2\2st\7v\2"+
		"\2tu\7g\2\2u\24\3\2\2\2vw\7v\2\2wx\7t\2\2xy\7w\2\2y\u0080\7g\2\2z{\7h"+
		"\2\2{|\7c\2\2|}\7n\2\2}~\7u\2\2~\u0080\7g\2\2\177v\3\2\2\2\177z\3\2\2"+
		"\2\u0080\26\3\2\2\2\u0081\u0084\5=\37\2\u0082\u0084\5;\36\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0082\3\2\2\2\u0084\30\3\2\2\2\u0085\u0087\t\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\t\3"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\32\3\2\2\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\34"+
		"\3\2\2\2\u0092\u0093\7&\2\2\u0093\36\3\2\2\2\u0094\u0095\7?\2\2\u0095"+
		" \3\2\2\2\u0096\u0097\7,\2\2\u0097\"\3\2\2\2\u0098\u0099\7\61\2\2\u0099"+
		"$\3\2\2\2\u009a\u009b\7\'\2\2\u009b&\3\2\2\2\u009c\u009d\7-\2\2\u009d"+
		"(\3\2\2\2\u009e\u009f\7/\2\2\u009f*\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1,"+
		"\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5\u00a6"+
		"\7?\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9\7?\2\2\u00a9\62"+
		"\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7?\2\2\u00ac\64\3\2\2\2\u00ad"+
		"\u00ae\7#\2\2\u00ae\u00af\7?\2\2\u00af\66\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1"+
		"8\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3:\3\2\2\2\u00b4\u00b5\7~\2\2\u00b5\u00b6"+
		"\7~\2\2\u00b6<\3\2\2\2\u00b7\u00b8\7(\2\2\u00b8\u00b9\7(\2\2\u00b9>\3"+
		"\2\2\2\u00ba\u00bb\t\5\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b \2\2\u00bd"+
		"@\3\2\2\2\b\2\177\u0083\u0086\u008b\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}