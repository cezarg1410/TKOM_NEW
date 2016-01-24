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
		IF=1, THEN=2, ELSE=3, AT=4, PRINT=5, NUMERICAL_VAR_OP=6, BOOLEAN=7, LIST_VAR_OP=8, 
		RETURN=9, FUNCTIONS=10, PROGRAM=11, LOOP=12, ID=13, NUMBER=14, ACTION_OPERATOR=15, 
		LOGICAL_OPERATOR=16, ASSIGN=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, 
		COMA=22, SEMI=23, LBRACK=24, RBRACK=25, AND_OPERATOR=26, OR_OPERATOR=27, 
		WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "THEN", "ELSE", "AT", "PRINT", "NUMERICAL_VAR_OP", "BOOLEAN", "LIST_VAR_OP", 
		"RETURN", "FUNCTIONS", "PROGRAM", "LOOP", "LETTER", "DIGIT", "ID", "NUMBER", 
		"ACTION_OPERATOR", "LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'then'", "'else'", "'@'", "'print'", "'number'", null, 
		"'list'", "'return'", "'FUNCTIONS'", "'PROGRAM'", "'LOOP'", null, null, 
		null, null, "'='", "'('", "')'", "'{'", "'}'", "','", "';'", "'['", "']'", 
		"'&&'", "'!&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "THEN", "ELSE", "AT", "PRINT", "NUMERICAL_VAR_OP", "BOOLEAN", 
		"LIST_VAR_OP", "RETURN", "FUNCTIONS", "PROGRAM", "LOOP", "ID", "NUMBER", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\be\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20\u008f\n\20\r\20\16"+
		"\20\u0090\3\21\6\21\u0094\n\21\r\21\16\21\u0095\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a4\n\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\6\37\u00c0\n\37\r\37\16"+
		"\37\u00c1\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\2\35\2\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63"+
		"\31\65\32\67\339\34;\35=\36\3\2\6\5\2C\\c|~~\3\2\62;\5\2,-//\61\61\5\2"+
		"\13\f\17\17\"\"\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\3?\3\2\2\2\5B\3\2\2\2\7G\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2"+
		"\rT\3\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23k\3\2\2\2\25r\3\2\2\2\27|\3\2\2"+
		"\2\31\u0084\3\2\2\2\33\u0089\3\2\2\2\35\u008b\3\2\2\2\37\u008e\3\2\2\2"+
		"!\u0093\3\2\2\2#\u0097\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3\2\2\2)\u00a7\3"+
		"\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61\u00af\3\2\2\2\63"+
		"\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00b7\3\2\2\2;\u00ba"+
		"\3\2\2\2=\u00bf\3\2\2\2?@\7k\2\2@A\7h\2\2A\4\3\2\2\2BC\7v\2\2CD\7j\2\2"+
		"DE\7g\2\2EF\7p\2\2F\6\3\2\2\2GH\7g\2\2HI\7n\2\2IJ\7u\2\2JK\7g\2\2K\b\3"+
		"\2\2\2LM\7B\2\2M\n\3\2\2\2NO\7r\2\2OP\7t\2\2PQ\7k\2\2QR\7p\2\2RS\7v\2"+
		"\2S\f\3\2\2\2TU\7p\2\2UV\7w\2\2VW\7o\2\2WX\7d\2\2XY\7g\2\2YZ\7t\2\2Z\16"+
		"\3\2\2\2[\\\7v\2\2\\]\7t\2\2]^\7w\2\2^e\7g\2\2_`\7h\2\2`a\7c\2\2ab\7n"+
		"\2\2bc\7u\2\2ce\7g\2\2d[\3\2\2\2d_\3\2\2\2e\20\3\2\2\2fg\7n\2\2gh\7k\2"+
		"\2hi\7u\2\2ij\7v\2\2j\22\3\2\2\2kl\7t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2o"+
		"p\7t\2\2pq\7p\2\2q\24\3\2\2\2rs\7H\2\2st\7W\2\2tu\7P\2\2uv\7E\2\2vw\7"+
		"V\2\2wx\7K\2\2xy\7Q\2\2yz\7P\2\2z{\7U\2\2{\26\3\2\2\2|}\7R\2\2}~\7T\2"+
		"\2~\177\7Q\2\2\177\u0080\7I\2\2\u0080\u0081\7T\2\2\u0081\u0082\7C\2\2"+
		"\u0082\u0083\7O\2\2\u0083\30\3\2\2\2\u0084\u0085\7N\2\2\u0085\u0086\7"+
		"Q\2\2\u0086\u0087\7Q\2\2\u0087\u0088\7R\2\2\u0088\32\3\2\2\2\u0089\u008a"+
		"\t\2\2\2\u008a\34\3\2\2\2\u008b\u008c\t\3\2\2\u008c\36\3\2\2\2\u008d\u008f"+
		"\5\33\16\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091 \3\2\2\2\u0092\u0094\5\35\17\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\"\3\2\2\2\u0097\u0098\t\4\2\2\u0098$\3\2\2\2\u0099\u009a\7?\2\2\u009a"+
		"\u00a4\7?\2\2\u009b\u009c\7#\2\2\u009c\u00a4\7/\2\2\u009d\u00a4\7@\2\2"+
		"\u009e\u009f\7@\2\2\u009f\u00a4\7?\2\2\u00a0\u00a4\7>\2\2\u00a1\u00a2"+
		"\7>\2\2\u00a2\u00a4\7?\2\2\u00a3\u0099\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7*\2"+
		"\2\u00a8*\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7}\2\2"+
		"\u00ac.\3\2\2\2\u00ad\u00ae\7\177\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7."+
		"\2\2\u00b0\62\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\64\3\2\2\2\u00b3\u00b4"+
		"\7]\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7_\2\2\u00b68\3\2\2\2\u00b7\u00b8"+
		"\7(\2\2\u00b8\u00b9\7(\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc"+
		"\7(\2\2\u00bc\u00bd\7(\2\2\u00bd<\3\2\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\b\37\2\2\u00c4>\3\2\2\2\b\2d\u0090\u0095\u00a3"+
		"\u00c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}