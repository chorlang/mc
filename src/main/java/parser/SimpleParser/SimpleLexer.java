// Generated from C:/Users/annem/IdeaProjects/Master_Parser/src/main/java/parser\SimpleLexer.g4 by ANTLR 4.9.1
package parser.SimpleParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROC=1, RETURN=2, IF=3, ELSE=4, VAR=5, BOOL=6, WORD=7, FLOAT=8, NUMBER=9, 
		STRING=10, EQUAL=11, ARROW=12, ISEP=13, WHITESPACE=14, COLON=15, OPENCURLY=16, 
		CLOSECURLY=17, OPENPARA=18, CLOSEPARA=19, OPENSQUA=20, CLOSESQUA=21, COMMA=22, 
		PERIOD=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"P", "R", "O", "C", "E", "T", "U", "N", "I", "F", "L", "S", "V", "A", 
			"DIGIT", "PROC", "RETURN", "IF", "ELSE", "VAR", "BOOL", "WORD", "FLOAT", 
			"NUMBER", "STRING", "EQUAL", "ARROW", "ISEP", "WHITESPACE", "COLON", 
			"OPENCURLY", "CLOSECURLY", "OPENPARA", "CLOSEPARA", "OPENSQUA", "CLOSESQUA", 
			"COMMA", "PERIOD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'='", 
			"'->'", null, "' '", "':'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROC", "RETURN", "IF", "ELSE", "VAR", "BOOL", "WORD", "FLOAT", 
			"NUMBER", "STRING", "EQUAL", "ARROW", "ISEP", "WHITESPACE", "COLON", 
			"OPENCURLY", "CLOSECURLY", "OPENPARA", "CLOSEPARA", "OPENSQUA", "CLOSESQUA", 
			"COMMA", "PERIOD"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u008f"+
		"\n\26\3\27\6\27\u0092\n\27\r\27\16\27\u0093\3\30\6\30\u0097\n\30\r\30"+
		"\16\30\u0098\3\30\3\30\7\30\u009d\n\30\f\30\16\30\u00a0\13\30\3\31\6\31"+
		"\u00a3\n\31\r\31\16\31\u00a4\3\32\3\32\3\32\3\32\7\32\u00ab\n\32\f\32"+
		"\16\32\u00ae\13\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\5"+
		"\35\u00ba\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\2\2(\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\3#\4%\5\'\6)\7+\b-\t/\n\61\13\63\f\65"+
		"\r\67\169\17;\20=\21?\22A\23C\24E\25G\26I\27K\30M\31\3\2\6\3\2\62;\4\2"+
		"C\\c|\3\2$$\4\2\f\f==\2\u00c9\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\r"+
		"Y\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2"+
		"\31e\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#r\3\2\2\2%"+
		"y\3\2\2\2\'|\3\2\2\2)\u0081\3\2\2\2+\u008e\3\2\2\2-\u0091\3\2\2\2/\u0096"+
		"\3\2\2\2\61\u00a2\3\2\2\2\63\u00a6\3\2\2\2\65\u00b1\3\2\2\2\67\u00b3\3"+
		"\2\2\29\u00b9\3\2\2\2;\u00bb\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00c3"+
		"\3\2\2\2C\u00c5\3\2\2\2E\u00c7\3\2\2\2G\u00c9\3\2\2\2I\u00cb\3\2\2\2K"+
		"\u00cd\3\2\2\2M\u00cf\3\2\2\2OP\7r\2\2P\4\3\2\2\2QR\7t\2\2R\6\3\2\2\2"+
		"ST\7q\2\2T\b\3\2\2\2UV\7e\2\2V\n\3\2\2\2WX\7g\2\2X\f\3\2\2\2YZ\7v\2\2"+
		"Z\16\3\2\2\2[\\\7w\2\2\\\20\3\2\2\2]^\7p\2\2^\22\3\2\2\2_`\7k\2\2`\24"+
		"\3\2\2\2ab\7h\2\2b\26\3\2\2\2cd\7n\2\2d\30\3\2\2\2ef\7u\2\2f\32\3\2\2"+
		"\2gh\7x\2\2h\34\3\2\2\2ij\7c\2\2j\36\3\2\2\2kl\t\2\2\2l \3\2\2\2mn\5\3"+
		"\2\2no\5\5\3\2op\5\7\4\2pq\5\t\5\2q\"\3\2\2\2rs\5\5\3\2st\5\13\6\2tu\5"+
		"\r\7\2uv\5\17\b\2vw\5\5\3\2wx\5\21\t\2x$\3\2\2\2yz\5\23\n\2z{\5\25\13"+
		"\2{&\3\2\2\2|}\5\13\6\2}~\5\27\f\2~\177\5\31\r\2\177\u0080\5\13\6\2\u0080"+
		"(\3\2\2\2\u0081\u0082\5\33\16\2\u0082\u0083\5\35\17\2\u0083\u0084\5\5"+
		"\3\2\u0084*\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088"+
		"\7w\2\2\u0088\u008f\7g\2\2\u0089\u008a\7h\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u008f\7g\2\2\u008e\u0085\3\2\2"+
		"\2\u008e\u0089\3\2\2\2\u008f,\3\2\2\2\u0090\u0092\t\3\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		".\3\2\2\2\u0095\u0097\5\37\20\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e"+
		"\7\60\2\2\u009b\u009d\5\37\20\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\60\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a3\5\37\20\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\62\3\2\2\2\u00a6\u00ac"+
		"\7$\2\2\u00a7\u00ab\n\4\2\2\u00a8\u00a9\7^\2\2\u00a9\u00ab\7$\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7$\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7?\2\2\u00b2\66\3\2\2\2\u00b3"+
		"\u00b4\7/\2\2\u00b4\u00b5\7@\2\2\u00b58\3\2\2\2\u00b6\u00ba\t\5\2\2\u00b7"+
		"\u00b8\7\17\2\2\u00b8\u00ba\7\f\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00ba:\3\2\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\b\36\2\2\u00be<\3\2\2\2\u00bf\u00c0\7<\2\2\u00c0>\3\2\2\2\u00c1\u00c2"+
		"\7}\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7\177\2\2\u00c4B\3\2\2\2\u00c5\u00c6"+
		"\7*\2\2\u00c6D\3\2\2\2\u00c7\u00c8\7+\2\2\u00c8F\3\2\2\2\u00c9\u00ca\7"+
		"]\2\2\u00caH\3\2\2\2\u00cb\u00cc\7_\2\2\u00ccJ\3\2\2\2\u00cd\u00ce\7."+
		"\2\2\u00ceL\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0N\3\2\2\2\13\2\u008e\u0093"+
		"\u0098\u009e\u00a4\u00aa\u00ac\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}