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
		WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "THEN", "ELSE", "AT", "NUMERICAL_VAR_OP", "BOOLEAN", "LIST_VAR_OP", 
		"RETURN", "FUNCTIONS", "PROGRAM", "LOOP", "LETTER", "DIGIT", "ID", "NUMBER", 
		"ACTION_OPERATOR", "LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'then'", "'else'", "'@'", "'number'", null, "'list'", "'return'", 
		"'FUNCTIONS'", "'PROGRAM'", "'LOOP'", null, null, null, null, "'='", "'('", 
		"')'", "'{'", "'}'", "','", "';'", "'['", "']'", "'&&'", "'!&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "THEN", "ELSE", "AT", "NUMERICAL_VAR_OP", "BOOLEAN", "LIST_VAR_OP", 
		"RETURN", "FUNCTIONS", "PROGRAM", "LOOP", "ID", "NUMBER", "ACTION_OPERATOR", 
		"LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\6\17\u0087\n\17\r\17\16\17\u0088\3\20\6\20\u008c\n\20\r\20"+
		"\16\20\u008d\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u009c\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\6\36\u00b8\n\36\r\36\16\36\u00b9\3\36\3\36\2\2\37\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\16\37\17!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35\3\2\6\5\2C\\"+
		"c|~~\3\2\62;\5\2,-//\61\61\5\2\13\f\17\17\"\"\u00c3\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5@\3\2\2\2\7E\3\2\2\2\tJ\3\2"+
		"\2\2\13L\3\2\2\2\r\\\3\2\2\2\17^\3\2\2\2\21c\3\2\2\2\23j\3\2\2\2\25t\3"+
		"\2\2\2\27|\3\2\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0086\3\2\2\2"+
		"\37\u008b\3\2\2\2!\u008f\3\2\2\2#\u009b\3\2\2\2%\u009d\3\2\2\2\'\u009f"+
		"\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61"+
		"\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b2"+
		"\3\2\2\2;\u00b7\3\2\2\2=>\7k\2\2>?\7h\2\2?\4\3\2\2\2@A\7v\2\2AB\7j\2\2"+
		"BC\7g\2\2CD\7p\2\2D\6\3\2\2\2EF\7g\2\2FG\7n\2\2GH\7u\2\2HI\7g\2\2I\b\3"+
		"\2\2\2JK\7B\2\2K\n\3\2\2\2LM\7p\2\2MN\7w\2\2NO\7o\2\2OP\7d\2\2PQ\7g\2"+
		"\2QR\7t\2\2R\f\3\2\2\2ST\7v\2\2TU\7t\2\2UV\7w\2\2V]\7g\2\2WX\7h\2\2XY"+
		"\7c\2\2YZ\7n\2\2Z[\7u\2\2[]\7g\2\2\\S\3\2\2\2\\W\3\2\2\2]\16\3\2\2\2^"+
		"_\7n\2\2_`\7k\2\2`a\7u\2\2ab\7v\2\2b\20\3\2\2\2cd\7t\2\2de\7g\2\2ef\7"+
		"v\2\2fg\7w\2\2gh\7t\2\2hi\7p\2\2i\22\3\2\2\2jk\7H\2\2kl\7W\2\2lm\7P\2"+
		"\2mn\7E\2\2no\7V\2\2op\7K\2\2pq\7Q\2\2qr\7P\2\2rs\7U\2\2s\24\3\2\2\2t"+
		"u\7R\2\2uv\7T\2\2vw\7Q\2\2wx\7I\2\2xy\7T\2\2yz\7C\2\2z{\7O\2\2{\26\3\2"+
		"\2\2|}\7N\2\2}~\7Q\2\2~\177\7Q\2\2\177\u0080\7R\2\2\u0080\30\3\2\2\2\u0081"+
		"\u0082\t\2\2\2\u0082\32\3\2\2\2\u0083\u0084\t\3\2\2\u0084\34\3\2\2\2\u0085"+
		"\u0087\5\31\r\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\36\3\2\2\2\u008a\u008c\5\33\16\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e \3\2\2\2\u008f\u0090\t\4\2\2\u0090\"\3\2\2\2\u0091\u0092\7"+
		"?\2\2\u0092\u009c\7?\2\2\u0093\u0094\7#\2\2\u0094\u009c\7/\2\2\u0095\u009c"+
		"\7@\2\2\u0096\u0097\7@\2\2\u0097\u009c\7?\2\2\u0098\u009c\7>\2\2\u0099"+
		"\u009a\7>\2\2\u009a\u009c\7?\2\2\u009b\u0091\3\2\2\2\u009b\u0093\3\2\2"+
		"\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c$\3\2\2\2\u009d\u009e\7?\2\2\u009e&\3\2\2\2\u009f\u00a0"+
		"\7*\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7+\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7"+
		"}\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7\177\2\2\u00a6.\3\2\2\2\u00a7\u00a8"+
		"\7.\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\7=\2\2\u00aa\62\3\2\2\2\u00ab\u00ac"+
		"\7]\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7_\2\2\u00ae\66\3\2\2\2\u00af\u00b0"+
		"\7(\2\2\u00b0\u00b1\7(\2\2\u00b18\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4"+
		"\7(\2\2\u00b4\u00b5\7(\2\2\u00b5:\3\2\2\2\u00b6\u00b8\t\5\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\b\36\2\2\u00bc<\3\2\2\2\b\2\\\u0088\u008d\u009b"+
		"\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}