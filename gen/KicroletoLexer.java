// Generated from C:/Users/Juan Camilo Merchan/IdeaProjects/proyecto_teoria_de_la_computacion/src/main/antlr4/com/kicroleto\Kicroleto.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KicroletoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, ASSIGN=19, 
		BRACKET_OPEN=20, BRACKET_CLOSE=21, PAR_OPEN=22, PAR_CLOSE=23, SEMICOLON=24, 
		ID=25, INT=26, FLOAT=27, STRING=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", "DIV", 
			"AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"ID", "INT", "FLOAT", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'kicrograma'", "'var'", "'kimprimir'", "'kicroSi'", "'kicroSiNo'", 
			"'+'", "'-'", "'*'", "'/'", "'kicroY'", "'kicroO'", "'negativo_hermano!'", 
			"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", "'{'", "'}'", "'('", 
			"')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", 
			"DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"ID", "INT", "FLOAT", "STRING", "WS"
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


	public KicroletoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kicroleto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00d6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u00b3\n\32\f\32\16\32\u00b6\13\32\3\33\6\33\u00b9\n\33\r\33"+
		"\16\33\u00ba\3\34\6\34\u00be\n\34\r\34\16\34\u00bf\3\34\3\34\6\34\u00c4"+
		"\n\34\r\34\16\34\u00c5\3\35\3\35\6\35\u00ca\n\35\r\35\16\35\u00cb\3\35"+
		"\3\35\3\36\6\36\u00d1\n\36\r\36\16\36\u00d2\3\36\3\36\2\2\37\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\r\3"+
		"\2mm\3\2kk\3\2ee\3\2tt\3\2qq\6\2\62;C\\aac|\3\2\62;\3\2\60\60\3\2$$\t"+
		"\2\f\f\"\"\60\60\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00db\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2"+
		"\5H\3\2\2\2\7L\3\2\2\2\tV\3\2\2\2\13^\3\2\2\2\rh\3\2\2\2\17j\3\2\2\2\21"+
		"l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27w\3\2\2\2\31~\3\2\2\2\33\u0090\3\2"+
		"\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0097\3\2\2\2#\u009a\3\2\2\2%"+
		"\u009d\3\2\2\2\'\u00a0\3\2\2\2)\u00a2\3\2\2\2+\u00a4\3\2\2\2-\u00a6\3"+
		"\2\2\2/\u00a8\3\2\2\2\61\u00aa\3\2\2\2\63\u00ac\3\2\2\2\65\u00b8\3\2\2"+
		"\2\67\u00bd\3\2\2\29\u00c7\3\2\2\2;\u00d0\3\2\2\2=>\7m\2\2>?\7k\2\2?@"+
		"\7e\2\2@A\7t\2\2AB\7q\2\2BC\7i\2\2CD\7t\2\2DE\7c\2\2EF\7o\2\2FG\7c\2\2"+
		"G\4\3\2\2\2HI\7x\2\2IJ\7c\2\2JK\7t\2\2K\6\3\2\2\2LM\7m\2\2MN\7k\2\2NO"+
		"\7o\2\2OP\7r\2\2PQ\7t\2\2QR\7k\2\2RS\7o\2\2ST\7k\2\2TU\7t\2\2U\b\3\2\2"+
		"\2VW\7m\2\2WX\7k\2\2XY\7e\2\2YZ\7t\2\2Z[\7q\2\2[\\\7U\2\2\\]\7k\2\2]\n"+
		"\3\2\2\2^_\7m\2\2_`\7k\2\2`a\7e\2\2ab\7t\2\2bc\7q\2\2cd\7U\2\2de\7k\2"+
		"\2ef\7P\2\2fg\7q\2\2g\f\3\2\2\2hi\7-\2\2i\16\3\2\2\2jk\7/\2\2k\20\3\2"+
		"\2\2lm\7,\2\2m\22\3\2\2\2no\7\61\2\2o\24\3\2\2\2pq\7m\2\2qr\7k\2\2rs\7"+
		"e\2\2st\7t\2\2tu\7q\2\2uv\7[\2\2v\26\3\2\2\2wx\7m\2\2xy\7k\2\2yz\7e\2"+
		"\2z{\7t\2\2{|\7q\2\2|}\7Q\2\2}\30\3\2\2\2~\177\7p\2\2\177\u0080\7g\2\2"+
		"\u0080\u0081\7i\2\2\u0081\u0082\7c\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7x\2\2\u0085\u0086\7q\2\2\u0086\u0087\7a\2\2\u0087"+
		"\u0088\7j\2\2\u0088\u0089\7g\2\2\u0089\u008a\7t\2\2\u008a\u008b\7o\2\2"+
		"\u008b\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d\u008e\7q\2\2\u008e\u008f"+
		"\7#\2\2\u008f\32\3\2\2\2\u0090\u0091\7@\2\2\u0091\34\3\2\2\2\u0092\u0093"+
		"\7>\2\2\u0093\36\3\2\2\2\u0094\u0095\7@\2\2\u0095\u0096\7?\2\2\u0096 "+
		"\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099\7?\2\2\u0099\"\3\2\2\2\u009a\u009b"+
		"\7?\2\2\u009b\u009c\7?\2\2\u009c$\3\2\2\2\u009d\u009e\7#\2\2\u009e\u009f"+
		"\7?\2\2\u009f&\3\2\2\2\u00a0\u00a1\7?\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7"+
		"}\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7\177\2\2\u00a5,\3\2\2\2\u00a6\u00a7"+
		"\7*\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9\60\3\2\2\2\u00aa\u00ab"+
		"\7=\2\2\u00ab\62\3\2\2\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\t\3\2\2\u00ae"+
		"\u00af\t\4\2\2\u00af\u00b0\t\5\2\2\u00b0\u00b4\t\6\2\2\u00b1\u00b3\t\7"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\64\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\t\b\2"+
		"\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\66\3\2\2\2\u00bc\u00be\t\b\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\t\t\2\2\u00c2\u00c4\t\b\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c68\3\2\2\2"+
		"\u00c7\u00c9\t\n\2\2\u00c8\u00ca\t\13\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\t\n\2\2\u00ce:\3\2\2\2\u00cf\u00d1\t\f\2\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\b\36\2\2\u00d5<\3\2\2\2\t\2\u00b4\u00ba\u00bf\u00c5"+
		"\u00cb\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}