// Generated from ListLanguage.g4 by ANTLR 4.5.1

    package antlr_classes;

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
		STOP=27, QUOTE=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "THEN", "ELSE", "AT", "NUMERICAL_VAR_OP", "BOOLEAN", "LIST_VAR_OP", 
		"RETURN", "FUNCTIONS", "PROGRAM", "LOOP", "LETTER", "DIGIT", "ID", "NUMBER", 
		"ACTION_OPERATOR", "LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", 
		"STOP", "QUOTE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'then'", "'else'", "'@'", "'number'", null, "'list'", "'return'", 
		"'FUNCTIONS'", "'PROGRAM'", "'loop'", null, null, null, null, "'='", "'('", 
		"')'", "'{'", "'}'", "','", "';'", "'['", "']'", "'&&'", "'||'", "'STOP'", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "THEN", "ELSE", "AT", "NUMERICAL_VAR_OP", "BOOLEAN", "LIST_VAR_OP", 
		"RETURN", "FUNCTIONS", "PROGRAM", "LOOP", "ID", "NUMBER", "ACTION_OPERATOR", 
		"LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", "STOP", 
		"QUOTE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\6\17\u008b\n\17\r\17\16\17\u008c\3\20\6\20"+
		"\u0090\n\20\r\20\16\20\u0091\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00a0\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \6 \u00c2\n \r \16"+
		" \u00c3\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\2\33\2\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65"+
		"\32\67\339\34;\35=\36?\37\3\2\6\5\2C\\c|~~\3\2\62;\5\2,-//\61\61\5\2\13"+
		"\f\17\17\"\"\u00cd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5D\3\2\2\2\7I\3\2\2\2\tN\3\2\2\2\13P\3\2"+
		"\2\2\r`\3\2\2\2\17b\3\2\2\2\21g\3\2\2\2\23n\3\2\2\2\25x\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u008a\3\2\2\2\37\u008f\3"+
		"\2\2\2!\u0093\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00ad\3\2\2\2"+
		"\63\u00af\3\2\2\2\65\u00b1\3\2\2\2\67\u00b3\3\2\2\29\u00b6\3\2\2\2;\u00b9"+
		"\3\2\2\2=\u00be\3\2\2\2?\u00c1\3\2\2\2AB\7k\2\2BC\7h\2\2C\4\3\2\2\2DE"+
		"\7v\2\2EF\7j\2\2FG\7g\2\2GH\7p\2\2H\6\3\2\2\2IJ\7g\2\2JK\7n\2\2KL\7u\2"+
		"\2LM\7g\2\2M\b\3\2\2\2NO\7B\2\2O\n\3\2\2\2PQ\7p\2\2QR\7w\2\2RS\7o\2\2"+
		"ST\7d\2\2TU\7g\2\2UV\7t\2\2V\f\3\2\2\2WX\7v\2\2XY\7t\2\2YZ\7w\2\2Za\7"+
		"g\2\2[\\\7h\2\2\\]\7c\2\2]^\7n\2\2^_\7u\2\2_a\7g\2\2`W\3\2\2\2`[\3\2\2"+
		"\2a\16\3\2\2\2bc\7n\2\2cd\7k\2\2de\7u\2\2ef\7v\2\2f\20\3\2\2\2gh\7t\2"+
		"\2hi\7g\2\2ij\7v\2\2jk\7w\2\2kl\7t\2\2lm\7p\2\2m\22\3\2\2\2no\7H\2\2o"+
		"p\7W\2\2pq\7P\2\2qr\7E\2\2rs\7V\2\2st\7K\2\2tu\7Q\2\2uv\7P\2\2vw\7U\2"+
		"\2w\24\3\2\2\2xy\7R\2\2yz\7T\2\2z{\7Q\2\2{|\7I\2\2|}\7T\2\2}~\7C\2\2~"+
		"\177\7O\2\2\177\26\3\2\2\2\u0080\u0081\7n\2\2\u0081\u0082\7q\2\2\u0082"+
		"\u0083\7q\2\2\u0083\u0084\7r\2\2\u0084\30\3\2\2\2\u0085\u0086\t\2\2\2"+
		"\u0086\32\3\2\2\2\u0087\u0088\t\3\2\2\u0088\34\3\2\2\2\u0089\u008b\5\31"+
		"\r\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\36\3\2\2\2\u008e\u0090\5\33\16\2\u008f\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		" \3\2\2\2\u0093\u0094\t\4\2\2\u0094\"\3\2\2\2\u0095\u0096\7?\2\2\u0096"+
		"\u00a0\7?\2\2\u0097\u0098\7#\2\2\u0098\u00a0\7?\2\2\u0099\u00a0\7@\2\2"+
		"\u009a\u009b\7@\2\2\u009b\u00a0\7?\2\2\u009c\u00a0\7>\2\2\u009d\u009e"+
		"\7>\2\2\u009e\u00a0\7?\2\2\u009f\u0095\3\2\2\2\u009f\u0097\3\2\2\2\u009f"+
		"\u0099\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7*\2"+
		"\2\u00a4(\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7}\2\2"+
		"\u00a8,\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7.\2"+
		"\2\u00ac\60\3\2\2\2\u00ad\u00ae\7=\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7"+
		"]\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7_\2\2\u00b2\66\3\2\2\2\u00b3\u00b4"+
		"\7(\2\2\u00b4\u00b5\7(\2\2\u00b58\3\2\2\2\u00b6\u00b7\7~\2\2\u00b7\u00b8"+
		"\7~\2\2\u00b8:\3\2\2\2\u00b9\u00ba\7U\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc"+
		"\7Q\2\2\u00bc\u00bd\7R\2\2\u00bd<\3\2\2\2\u00be\u00bf\7$\2\2\u00bf>\3"+
		"\2\2\2\u00c0\u00c2\t\5\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b "+
		"\2\2\u00c6@\3\2\2\2\b\2`\u008c\u0091\u009f\u00c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}