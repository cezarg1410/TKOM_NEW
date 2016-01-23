// Generated from ListLanguage.g4 by ANTLR 4.5.1

    package parserAndLexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ListLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, VAR=4, FOREACH=5, IN=6, AT=7, PRINT=8, NUMERICAL_VAR_OP=9, 
		BOOLEAN=10, LIST_VAR_OP=11, RETURN=12, FUNCTIONS=13, PROGRAM=14, ID=15, 
		NUMBER=16, ACTION_OPERATOR=17, LOGICAL_OPERATOR=18, ASSIGN=19, LPAREN=20, 
		RPAREN=21, LBRACE=22, RBRACE=23, COMA=24, SEMI=25, LBRACK=26, RBRACK=27, 
		AND_OPERATOR=28, OR_OPERATOR=29, WS=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "THEN", "ELSE", "VAR", "FOREACH", "IN", "AT", "PRINT", "NUMERICAL_VAR_OP", 
		"BOOLEAN", "LIST_VAR_OP", "RETURN", "FUNCTIONS", "PROGRAM", "LETTER", 
		"DIGIT", "ID", "NUMBER", "ACTION_OPERATOR", "LOGICAL_OPERATOR", "ASSIGN", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMA", "SEMI", "LBRACK", "RBRACK", 
		"AND_OPERATOR", "OR_OPERATOR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'then'", "'else'", "'var'", "'foreach'", "'in'", "'@'", 
		"'print'", "'number'", null, "'list'", "'return'", "'FUNCTIONS'", "'PROGRAM'", 
		null, null, null, null, "'='", "'('", "')'", "'{'", "'}'", "','", "';'", 
		"'['", "']'", "'&&'", "'!&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "THEN", "ELSE", "VAR", "FOREACH", "IN", "AT", "PRINT", "NUMERICAL_VAR_OP", 
		"BOOLEAN", "LIST_VAR_OP", "RETURN", "FUNCTIONS", "PROGRAM", "ID", "NUMBER", 
		"ACTION_OPERATOR", "LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", 
		"WS"
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


	public ListLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ListLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13x\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22\u009d\n\22\r\22\16"+
		"\22\u009e\3\23\6\23\u00a2\n\23\r\23\16\23\u00a3\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b2\n\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\6!\u00ce\n!\r!\16!\u00cf\3!\3!\2\2"+
		"\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\2!\2#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35"+
		"=\36?\37A \3\2\6\5\2C\\c|~~\3\2\62;\4\2,-//\5\2\13\f\17\17\"\"\u00d9\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\3C\3\2\2\2\5F\3\2\2\2\7K\3\2\2\2\tP\3\2\2\2\13T\3\2\2\2"+
		"\r\\\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23g\3\2\2\2\25w\3\2\2\2\27y\3\2\2"+
		"\2\31~\3\2\2\2\33\u0085\3\2\2\2\35\u008f\3\2\2\2\37\u0097\3\2\2\2!\u0099"+
		"\3\2\2\2#\u009c\3\2\2\2%\u00a1\3\2\2\2\'\u00a5\3\2\2\2)\u00b1\3\2\2\2"+
		"+\u00b3\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2\63\u00bb"+
		"\3\2\2\2\65\u00bd\3\2\2\2\67\u00bf\3\2\2\29\u00c1\3\2\2\2;\u00c3\3\2\2"+
		"\2=\u00c5\3\2\2\2?\u00c8\3\2\2\2A\u00cd\3\2\2\2CD\7k\2\2DE\7h\2\2E\4\3"+
		"\2\2\2FG\7v\2\2GH\7j\2\2HI\7g\2\2IJ\7p\2\2J\6\3\2\2\2KL\7g\2\2LM\7n\2"+
		"\2MN\7u\2\2NO\7g\2\2O\b\3\2\2\2PQ\7x\2\2QR\7c\2\2RS\7t\2\2S\n\3\2\2\2"+
		"TU\7h\2\2UV\7q\2\2VW\7t\2\2WX\7g\2\2XY\7c\2\2YZ\7e\2\2Z[\7j\2\2[\f\3\2"+
		"\2\2\\]\7k\2\2]^\7p\2\2^\16\3\2\2\2_`\7B\2\2`\20\3\2\2\2ab\7r\2\2bc\7"+
		"t\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2f\22\3\2\2\2gh\7p\2\2hi\7w\2\2ij\7o\2"+
		"\2jk\7d\2\2kl\7g\2\2lm\7t\2\2m\24\3\2\2\2no\7v\2\2op\7t\2\2pq\7w\2\2q"+
		"x\7g\2\2rs\7h\2\2st\7c\2\2tu\7n\2\2uv\7u\2\2vx\7g\2\2wn\3\2\2\2wr\3\2"+
		"\2\2x\26\3\2\2\2yz\7n\2\2z{\7k\2\2{|\7u\2\2|}\7v\2\2}\30\3\2\2\2~\177"+
		"\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7v\2\2\u0081\u0082\7w\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7p\2\2\u0084\32\3\2\2\2\u0085\u0086\7H\2\2\u0086\u0087"+
		"\7W\2\2\u0087\u0088\7P\2\2\u0088\u0089\7E\2\2\u0089\u008a\7V\2\2\u008a"+
		"\u008b\7K\2\2\u008b\u008c\7Q\2\2\u008c\u008d\7P\2\2\u008d\u008e\7U\2\2"+
		"\u008e\34\3\2\2\2\u008f\u0090\7R\2\2\u0090\u0091\7T\2\2\u0091\u0092\7"+
		"Q\2\2\u0092\u0093\7I\2\2\u0093\u0094\7T\2\2\u0094\u0095\7C\2\2\u0095\u0096"+
		"\7O\2\2\u0096\36\3\2\2\2\u0097\u0098\t\2\2\2\u0098 \3\2\2\2\u0099\u009a"+
		"\t\3\2\2\u009a\"\3\2\2\2\u009b\u009d\5\37\20\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f$\3\2\2\2"+
		"\u00a0\u00a2\5!\21\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4&\3\2\2\2\u00a5\u00a6\t\4\2\2\u00a6"+
		"(\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8\u00b2\7?\2\2\u00a9\u00aa\7#\2\2\u00aa"+
		"\u00b2\7/\2\2\u00ab\u00b2\7@\2\2\u00ac\u00ad\7@\2\2\u00ad\u00b2\7?\2\2"+
		"\u00ae\u00b2\7>\2\2\u00af\u00b0\7>\2\2\u00b0\u00b2\7?\2\2\u00b1\u00a7"+
		"\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4"+
		",\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8\60"+
		"\3\2\2\2\u00b9\u00ba\7}\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\7\177\2\2\u00bc"+
		"\64\3\2\2\2\u00bd\u00be\7.\2\2\u00be\66\3\2\2\2\u00bf\u00c0\7=\2\2\u00c0"+
		"8\3\2\2\2\u00c1\u00c2\7]\2\2\u00c2:\3\2\2\2\u00c3\u00c4\7_\2\2\u00c4<"+
		"\3\2\2\2\u00c5\u00c6\7(\2\2\u00c6\u00c7\7(\2\2\u00c7>\3\2\2\2\u00c8\u00c9"+
		"\7#\2\2\u00c9\u00ca\7(\2\2\u00ca\u00cb\7(\2\2\u00cb@\3\2\2\2\u00cc\u00ce"+
		"\t\5\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b!\2\2\u00d2B\3\2\2\2\b"+
		"\2w\u009e\u00a3\u00b1\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}