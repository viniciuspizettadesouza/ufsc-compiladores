// Generated from /home/pizetta/Downloads/compila/cmm/parser/cmm.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, INPUT=27, ELSE=28, ID=29, INT=30, FLOAT=31, NULL=32, 
		BOOLEAN=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "INPUT", "ELSE", "ID", "INT", "FLOAT", "NULL", "BOOLEAN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "')'", "','", "'{'", "'}'", "'='", "';'", "'print'", 
			"'if'", "'while'", "'for'", "'switch'", "'return'", "'case'", "':'", 
			"'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'input'", "'else'", null, null, null, "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INPUT", "ELSE", "ID", "INT", "FLOAT", "NULL", "BOOLEAN", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public cmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\6\36\u00a6\n\36\r\36\16\36\u00a7\3"+
		"\36\7\36\u00ab\n\36\f\36\16\36\u00ae\13\36\3\37\6\37\u00b1\n\37\r\37\16"+
		"\37\u00b2\3 \6 \u00b6\n \r \16 \u00b7\3 \3 \6 \u00bc\n \r \16 \u00bd\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00ce\n\"\3#\6#"+
		"\u00d1\n#\r#\16#\u00d2\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\6\4\2C\\c|\5\2\62;C\\"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2"+
		"\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25_\3\2"+
		"\2\2\27b\3\2\2\2\31h\3\2\2\2\33l\3\2\2\2\35s\3\2\2\2\37z\3\2\2\2!\177"+
		"\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u0085\3\2\2\2)\u0088\3\2\2\2"+
		"+\u008b\3\2\2\2-\u008e\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u0095"+
		"\3\2\2\2\65\u0097\3\2\2\2\67\u0099\3\2\2\29\u009f\3\2\2\2;\u00a5\3\2\2"+
		"\2=\u00b0\3\2\2\2?\u00b5\3\2\2\2A\u00bf\3\2\2\2C\u00cd\3\2\2\2E\u00d0"+
		"\3\2\2\2GH\7f\2\2HI\7g\2\2IJ\7h\2\2J\4\3\2\2\2KL\7*\2\2L\6\3\2\2\2MN\7"+
		"+\2\2N\b\3\2\2\2OP\7.\2\2P\n\3\2\2\2QR\7}\2\2R\f\3\2\2\2ST\7\177\2\2T"+
		"\16\3\2\2\2UV\7?\2\2V\20\3\2\2\2WX\7=\2\2X\22\3\2\2\2YZ\7r\2\2Z[\7t\2"+
		"\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\24\3\2\2\2_`\7k\2\2`a\7h\2\2a\26\3\2"+
		"\2\2bc\7y\2\2cd\7j\2\2de\7k\2\2ef\7n\2\2fg\7g\2\2g\30\3\2\2\2hi\7h\2\2"+
		"ij\7q\2\2jk\7t\2\2k\32\3\2\2\2lm\7u\2\2mn\7y\2\2no\7k\2\2op\7v\2\2pq\7"+
		"e\2\2qr\7j\2\2r\34\3\2\2\2st\7t\2\2tu\7g\2\2uv\7v\2\2vw\7w\2\2wx\7t\2"+
		"\2xy\7p\2\2y\36\3\2\2\2z{\7e\2\2{|\7c\2\2|}\7u\2\2}~\7g\2\2~ \3\2\2\2"+
		"\177\u0080\7<\2\2\u0080\"\3\2\2\2\u0081\u0082\7@\2\2\u0082$\3\2\2\2\u0083"+
		"\u0084\7>\2\2\u0084&\3\2\2\2\u0085\u0086\7>\2\2\u0086\u0087\7?\2\2\u0087"+
		"(\3\2\2\2\u0088\u0089\7@\2\2\u0089\u008a\7?\2\2\u008a*\3\2\2\2\u008b\u008c"+
		"\7?\2\2\u008c\u008d\7?\2\2\u008d,\3\2\2\2\u008e\u008f\7#\2\2\u008f\u0090"+
		"\7?\2\2\u0090.\3\2\2\2\u0091\u0092\7-\2\2\u0092\60\3\2\2\2\u0093\u0094"+
		"\7/\2\2\u0094\62\3\2\2\2\u0095\u0096\7,\2\2\u0096\64\3\2\2\2\u0097\u0098"+
		"\7\61\2\2\u0098\66\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7r\2\2\u009c\u009d\7w\2\2\u009d\u009e\7v\2\2\u009e8\3\2\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3:\3\2\2\2\u00a4\u00a6\t\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9"+
		"\u00ab\t\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad<\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1"+
		"\t\4\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3>\3\2\2\2\u00b4\u00b6\t\4\2\2\u00b5\u00b4\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\7\60\2\2\u00ba\u00bc\t\4\2\2\u00bb\u00ba\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be@\3"+
		"\2\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3B\3\2\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7w\2\2\u00c7\u00ce\7g\2\2\u00c8\u00c9\7H\2\2\u00c9\u00ca\7c\2\2"+
		"\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00ce\7g\2\2\u00cd\u00c4"+
		"\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ceD\3\2\2\2\u00cf\u00d1\t\5\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b#\2\2\u00d5F\3\2\2\2\n\2\u00a7\u00ac"+
		"\u00b2\u00b7\u00bd\u00cd\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}