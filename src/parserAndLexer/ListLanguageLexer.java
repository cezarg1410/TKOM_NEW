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
		IF=1, THEN=2, ELSE=3, AT=4, NUMERICAL_VAR_OP=5, BOOLEAN=6, LIST_VAR_OP=7, 
		RETURN=8, FUNCTIONS=9, PROGRAM=10, LOOP=11, ID=12, NUMBER=13, ACTION_OPERATOR=14, 
		LOGICAL_OPERATOR=15, ASSIGN=16, LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, 
		COMA=21, SEMI=22, LBRACK=23, RBRACK=24, AND_OPERATOR=25, OR_OPERATOR=26, 
		STOP=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "THEN", "ELSE", "AT", "NUMERICAL_VAR_OP", "BOOLEAN", "LIST_VAR_OP", 
		"RETURN", "FUNCTIONS", "PROGRAM", "LOOP", "LETTER", "DIGIT", "ID", "NUMBER", 
		"ACTION_OPERATOR", "LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", 
		"STOP", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'then'", "'else'", "'@'", "'number'", null, "'list'", "'return'", 
		"'FUNCTIONS'", "'PROGRAM'", "'loop'", null, null, null, null, "'='", "'('", 
		"')'", "'{'", "'}'", "','", "';'", "'['", "']'", "'&&'", "'!&&'", "'STOP'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "THEN", "ELSE", "AT", "NUMERICAL_VAR_OP", "BOOLEAN", "LIST_VAR_OP", 
		"RETURN", "FUNCTIONS", "PROGRAM", "LOOP", "ID", "NUMBER", "ACTION_OPERATOR", 
		"LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", "STOP", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\6\17\u0089\n\17\r\17\16\17\u008a\3\20\6\20\u008e"+
		"\n\20\r\20\16\20\u008f\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u009e\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\6\37\u00bf\n\37\r\37\16"+
		"\37\u00c0\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\2\33\2\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63"+
		"\31\65\32\67\339\34;\35=\36\3\2\6\5\2C\\c|~~\3\2\62;\5\2,-//\61\61\5\2"+
		"\13\f\17\17\"\"\u00ca\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\3?\3\2\2\2\5B\3\2\2\2\7G\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2"+
		"\r^\3\2\2\2\17`\3\2\2\2\21e\3\2\2\2\23l\3\2\2\2\25v\3\2\2\2\27~\3\2\2"+
		"\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35\u0088\3\2\2\2\37\u008d\3\2\2\2"+
		"!\u0091\3\2\2\2#\u009d\3\2\2\2%\u009f\3\2\2\2\'\u00a1\3\2\2\2)\u00a3\3"+
		"\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61\u00ab\3\2\2\2\63"+
		"\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3\2\2\29\u00b4\3\2\2\2;\u00b8"+
		"\3\2\2\2=\u00be\3\2\2\2?@\7k\2\2@A\7h\2\2A\4\3\2\2\2BC\7v\2\2CD\7j\2\2"+
		"DE\7g\2\2EF\7p\2\2F\6\3\2\2\2GH\7g\2\2HI\7n\2\2IJ\7u\2\2JK\7g\2\2K\b\3"+
		"\2\2\2LM\7B\2\2M\n\3\2\2\2NO\7p\2\2OP\7w\2\2PQ\7o\2\2QR\7d\2\2RS\7g\2"+
		"\2ST\7t\2\2T\f\3\2\2\2UV\7v\2\2VW\7t\2\2WX\7w\2\2X_\7g\2\2YZ\7h\2\2Z["+
		"\7c\2\2[\\\7n\2\2\\]\7u\2\2]_\7g\2\2^U\3\2\2\2^Y\3\2\2\2_\16\3\2\2\2`"+
		"a\7n\2\2ab\7k\2\2bc\7u\2\2cd\7v\2\2d\20\3\2\2\2ef\7t\2\2fg\7g\2\2gh\7"+
		"v\2\2hi\7w\2\2ij\7t\2\2jk\7p\2\2k\22\3\2\2\2lm\7H\2\2mn\7W\2\2no\7P\2"+
		"\2op\7E\2\2pq\7V\2\2qr\7K\2\2rs\7Q\2\2st\7P\2\2tu\7U\2\2u\24\3\2\2\2v"+
		"w\7R\2\2wx\7T\2\2xy\7Q\2\2yz\7I\2\2z{\7T\2\2{|\7C\2\2|}\7O\2\2}\26\3\2"+
		"\2\2~\177\7n\2\2\177\u0080\7q\2\2\u0080\u0081\7q\2\2\u0081\u0082\7r\2"+
		"\2\u0082\30\3\2\2\2\u0083\u0084\t\2\2\2\u0084\32\3\2\2\2\u0085\u0086\t"+
		"\3\2\2\u0086\34\3\2\2\2\u0087\u0089\5\31\r\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\36\3\2\2"+
		"\2\u008c\u008e\5\33\16\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090 \3\2\2\2\u0091\u0092\t\4\2\2"+
		"\u0092\"\3\2\2\2\u0093\u0094\7?\2\2\u0094\u009e\7?\2\2\u0095\u0096\7#"+
		"\2\2\u0096\u009e\7?\2\2\u0097\u009e\7@\2\2\u0098\u0099\7@\2\2\u0099\u009e"+
		"\7?\2\2\u009a\u009e\7>\2\2\u009b\u009c\7>\2\2\u009c\u009e\7?\2\2\u009d"+
		"\u0093\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2"+
		"\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\7?\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7"+
		"+\2\2\u00a4*\3\2\2\2\u00a5\u00a6\7}\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7\177"+
		"\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7.\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7"+
		"=\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7]\2\2\u00ae\64\3\2\2\2\u00af\u00b0"+
		"\7_\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2\u00b3\7(\2\2\u00b38"+
		"\3\2\2\2\u00b4\u00b5\7#\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\7(\2\2\u00b7"+
		":\3\2\2\2\u00b8\u00b9\7U\2\2\u00b9\u00ba\7V\2\2\u00ba\u00bb\7Q\2\2\u00bb"+
		"\u00bc\7R\2\2\u00bc<\3\2\2\2\u00bd\u00bf\t\5\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\b\37\2\2\u00c3>\3\2\2\2\b\2^\u008a\u008f\u009d\u00c0"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}