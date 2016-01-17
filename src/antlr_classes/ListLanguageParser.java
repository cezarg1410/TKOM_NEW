// Generated from ListLanguage.g4 by ANTLR 4.5.1

    package antlr_classes;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ListLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IF=2, THEN=3, ELSE=4, VAR=5, FOREACH=6, IN=7, AT=8, PRINT=9, NUMERICAL_VAR_OP=10, 
		BOOLEAN=11, LIST_VAR_OP=12, RETURN=13, ID=14, NUMBER=15, ACTION_OPERATOR=16, 
		LOGICAL_OPERATOR=17, ASSIGN=18, LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, 
		COMA=23, SEMI=24, LBRACK=25, RBRACK=26, AND_OPERATOR=27, OR_OPERATOR=28, 
		WS=29;
	public static final int
		RULE_assignment = 0, RULE_compilation_unit = 1, RULE_operation = 2, RULE_return_op = 3, 
		RULE_numerical_var_dec = 4, RULE_list_var_dec = 5, RULE_list = 6, RULE_list_element = 7, 
		RULE_value = 8, RULE_if_statement = 9, RULE_condition = 10, RULE_elementary_condition = 11, 
		RULE_function_def = 12, RULE_function_call = 13, RULE_function_def_arg = 14, 
		RULE_function_call_arg = 15, RULE_loop = 16, RULE_return_arg = 17;
	public static final String[] ruleNames = {
		"assignment", "compilation_unit", "operation", "return_op", "numerical_var_dec", 
		"list_var_dec", "list", "list_element", "value", "if_statement", "condition", 
		"elementary_condition", "function_def", "function_call", "function_def_arg", 
		"function_call_arg", "loop", "return_arg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<EOF>'", "'if'", "'then'", "'else'", "'var'", "'foreach'", "'in'", 
		"'@'", "'print'", "'number'", null, "'list'", "'return'", null, null, 
		null, null, "'='", "'('", "')'", "'{'", "'}'", "','", "';'", "'['", "']'", 
		"'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "IF", "THEN", "ELSE", "VAR", "FOREACH", "IN", "AT", "PRINT", 
		"NUMERICAL_VAR_OP", "BOOLEAN", "LIST_VAR_OP", "RETURN", "ID", "NUMBER", 
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

	@Override
	public String getGrammarFileName() { return "ListLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ListLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ListLanguageParser.ASSIGN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List_elementContext list_element() {
			return getRuleContext(List_elementContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(ASSIGN);
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(38);
				list();
				}
				break;
			case 2:
				{
				setState(39);
				list_element();
				}
				break;
			case 3:
				{
				setState(40);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(41);
				function_call();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(44);
				operation();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public Numerical_var_decContext numerical_var_dec() {
			return getRuleContext(Numerical_var_decContext.class,0);
		}
		public List_var_decContext list_var_dec() {
			return getRuleContext(List_var_decContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Return_opContext return_op() {
			return getRuleContext(Return_opContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				numerical_var_dec();
				}
				break;
			case LIST_VAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				list_var_dec();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(54);
				function_call();
				setState(55);
				match(SEMI);
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				function_def();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				if_statement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				loop();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				return_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_opContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ListLanguageParser.RETURN, 0); }
		public Return_argContext return_arg() {
			return getRuleContext(Return_argContext.class,0);
		}
		public Return_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitReturn_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_opContext return_op() throws RecognitionException {
		Return_opContext _localctx = new Return_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(RETURN);
			setState(64);
			return_arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numerical_var_decContext extends ParserRuleContext {
		public TerminalNode NUMERICAL_VAR_OP() { return getToken(ListLanguageParser.NUMERICAL_VAR_OP, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ListLanguageParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List_elementContext list_element() {
			return getRuleContext(List_elementContext.class,0);
		}
		public Numerical_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_var_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitNumerical_var_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_var_decContext numerical_var_dec() throws RecognitionException {
		Numerical_var_decContext _localctx = new Numerical_var_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numerical_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(NUMERICAL_VAR_OP);
			setState(67);
			match(ID);
			setState(68);
			match(ASSIGN);
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(69);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(70);
				function_call();
				}
				break;
			case 3:
				{
				setState(71);
				list_element();
				}
				break;
			}
			setState(74);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_var_decContext extends ParserRuleContext {
		public TerminalNode LIST_VAR_OP() { return getToken(ListLanguageParser.LIST_VAR_OP, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ListLanguageParser.ASSIGN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_var_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitList_var_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_var_decContext list_var_dec() throws RecognitionException {
		List_var_decContext _localctx = new List_var_decContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list_var_dec);
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(76);
				match(LIST_VAR_OP);
				setState(77);
				match(ID);
				setState(78);
				match(ASSIGN);
				setState(79);
				list();
				setState(80);
				match(SEMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(82);
				match(LIST_VAR_OP);
				setState(83);
				match(ID);
				setState(84);
				match(ASSIGN);
				setState(85);
				function_call();
				setState(86);
				match(SEMI);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ListLanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ListLanguageParser.NUMBER, i);
		}
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LBRACE);
			setState(91);
			match(NUMBER);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(92);
				match(COMA);
				setState(93);
				match(NUMBER);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_elementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(ListLanguageParser.LBRACK, 0); }
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public TerminalNode RBRACK() { return getToken(ListLanguageParser.RBRACK, 0); }
		public List_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitList_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_elementContext list_element() throws RecognitionException {
		List_elementContext _localctx = new List_elementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
			setState(102);
			match(LBRACK);
			setState(103);
			match(NUMBER);
			setState(104);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public List_elementContext list_element() {
			return getRuleContext(List_elementContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				list_element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ListLanguageParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ListLanguageParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ListLanguageParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ListLanguageParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ListLanguageParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ListLanguageParser.RBRACE, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ListLanguageParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ListLanguageParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(ListLanguageParser.ELSE, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IF);
			setState(111);
			condition();
			setState(112);
			match(THEN);
			setState(113);
			match(LBRACE);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(114);
				operation();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RBRACE);
			setState(121);
			match(SEMI);
			setState(122);
			match(ELSE);
			setState(123);
			match(LBRACE);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(124);
				operation();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(RBRACE);
			setState(131);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public List<Elementary_conditionContext> elementary_condition() {
			return getRuleContexts(Elementary_conditionContext.class);
		}
		public Elementary_conditionContext elementary_condition(int i) {
			return getRuleContext(Elementary_conditionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public List<TerminalNode> AND_OPERATOR() { return getTokens(ListLanguageParser.AND_OPERATOR); }
		public TerminalNode AND_OPERATOR(int i) {
			return getToken(ListLanguageParser.AND_OPERATOR, i);
		}
		public List<TerminalNode> OR_OPERATOR() { return getTokens(ListLanguageParser.OR_OPERATOR); }
		public TerminalNode OR_OPERATOR(int i) {
			return getToken(ListLanguageParser.OR_OPERATOR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LPAREN);
			setState(134);
			elementary_condition();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OPERATOR || _la==OR_OPERATOR) {
				{
				{
				setState(135);
				_la = _input.LA(1);
				if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(136);
				elementary_condition();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elementary_conditionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ListLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ListLanguageParser.ID, i);
		}
		public TerminalNode LOGICAL_OPERATOR() { return getToken(ListLanguageParser.LOGICAL_OPERATOR, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public Elementary_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementary_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitElementary_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elementary_conditionContext elementary_condition() throws RecognitionException {
		Elementary_conditionContext _localctx = new Elementary_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementary_condition);
		try {
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(144);
				match(ID);
				setState(145);
				match(LOGICAL_OPERATOR);
				setState(146);
				match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(147);
				match(ID);
				setState(148);
				match(LOGICAL_OPERATOR);
				setState(149);
				value();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(150);
				value();
				setState(151);
				match(LOGICAL_OPERATOR);
				setState(152);
				match(ID);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(154);
				match(ID);
				setState(155);
				match(LOGICAL_OPERATOR);
				setState(156);
				list();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(157);
				list();
				setState(158);
				match(LOGICAL_OPERATOR);
				setState(159);
				match(ID);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(161);
				match(ID);
				setState(162);
				match(LOGICAL_OPERATOR);
				setState(163);
				function_call();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(164);
				function_call();
				setState(165);
				match(LOGICAL_OPERATOR);
				setState(166);
				match(ID);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(168);
				value();
				setState(169);
				match(LOGICAL_OPERATOR);
				setState(170);
				value();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(172);
				value();
				setState(173);
				match(LOGICAL_OPERATOR);
				setState(174);
				function_call();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(176);
				function_call();
				setState(177);
				match(LOGICAL_OPERATOR);
				setState(178);
				value();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(180);
				function_call();
				setState(181);
				match(LOGICAL_OPERATOR);
				setState(182);
				function_call();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(184);
				value();
				setState(185);
				match(LOGICAL_OPERATOR);
				setState(186);
				list();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(188);
				list();
				setState(189);
				match(LOGICAL_OPERATOR);
				setState(190);
				value();
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(192);
				function_call();
				setState(193);
				match(LOGICAL_OPERATOR);
				setState(194);
				list();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(196);
				list();
				setState(197);
				match(LOGICAL_OPERATOR);
				setState(198);
				function_call();
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(200);
				list();
				setState(201);
				match(LOGICAL_OPERATOR);
				setState(202);
				list();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ListLanguageParser.AT, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public List<Function_def_argContext> function_def_arg() {
			return getRuleContexts(Function_def_argContext.class);
		}
		public Function_def_argContext function_def_arg(int i) {
			return getRuleContext(Function_def_argContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_def);
		int _la;
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(206);
				match(AT);
				setState(207);
				match(ID);
				setState(208);
				match(LPAREN);
				setState(209);
				function_def_arg();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(210);
					match(COMA);
					setState(211);
					function_def_arg();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(RPAREN);
				setState(218);
				match(LBRACE);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(219);
					operation();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(RBRACE);
				setState(226);
				match(SEMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(228);
				match(AT);
				setState(229);
				match(ID);
				setState(230);
				match(LPAREN);
				setState(231);
				match(RPAREN);
				setState(232);
				match(LBRACE);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(233);
					operation();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(RBRACE);
				setState(240);
				match(SEMI);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public List<Function_call_argContext> function_call_arg() {
			return getRuleContexts(Function_call_argContext.class);
		}
		public Function_call_argContext function_call_arg(int i) {
			return getRuleContext(Function_call_argContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(243);
				match(ID);
				setState(244);
				match(LPAREN);
				setState(245);
				function_call_arg();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(246);
					match(COMA);
					setState(247);
					function_call_arg();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(RPAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(255);
				match(ID);
				setState(256);
				match(LPAREN);
				setState(257);
				match(RPAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_def_argContext extends ParserRuleContext {
		public TerminalNode NUMERICAL_VAR_OP() { return getToken(ListLanguageParser.NUMERICAL_VAR_OP, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode LIST_VAR_OP() { return getToken(ListLanguageParser.LIST_VAR_OP, 0); }
		public Function_def_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitFunction_def_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_def_argContext function_def_arg() throws RecognitionException {
		Function_def_argContext _localctx = new Function_def_argContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_def_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
				{
				{
				setState(260);
				match(NUMERICAL_VAR_OP);
				setState(261);
				match(ID);
				}
				}
				break;
			case LIST_VAR_OP:
				{
				{
				setState(262);
				match(LIST_VAR_OP);
				setState(263);
				match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_argContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode VAR() { return getToken(ListLanguageParser.VAR, 0); }
		public Function_call_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitFunction_call_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argContext function_call_arg() throws RecognitionException {
		Function_call_argContext _localctx = new Function_call_argContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_call_arg);
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(VAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(ListLanguageParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public TerminalNode VAR() { return getToken(ListLanguageParser.VAR, 0); }
		public TerminalNode IN() { return getToken(ListLanguageParser.IN, 0); }
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(FOREACH);
			setState(272);
			match(LPAREN);
			setState(273);
			match(VAR);
			setState(274);
			match(IN);
			setState(275);
			match(ID);
			setState(276);
			match(RPAREN);
			setState(277);
			match(LBRACE);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(278);
				operation();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(RBRACE);
			setState(285);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_argContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public Return_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitReturn_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_argContext return_arg() throws RecognitionException {
		Return_argContext _localctx = new Return_argContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0124\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\7\ba\n\b\f\b\16\bd\13\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\no\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\7\13v\n\13\f\13\16\13y\13\13\3\13\3\13\3\13\3\13\3\13\7\13\u0080\n\13"+
		"\f\13\16\13\u0083\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u008c\n\f\f"+
		"\f\16\f\u008f\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cf\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d7\n\16\f\16\16\16\u00da\13\16"+
		"\3\16\3\16\3\16\7\16\u00df\n\16\f\16\16\16\u00e2\13\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0\13\16"+
		"\3\16\3\16\5\16\u00f4\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u00fb\n\17\f"+
		"\17\16\17\u00fe\13\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3"+
		"\20\3\20\3\20\5\20\u010b\n\20\3\21\3\21\3\21\5\21\u0110\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u011a\n\22\f\22\16\22\u011d\13\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\3\3\2\35\36\u013c\2&\3\2\2\2\4\61\3\2\2\2\6?\3\2\2\2\bA\3"+
		"\2\2\2\nD\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20g\3\2\2\2\22n\3\2\2\2\24p"+
		"\3\2\2\2\26\u0087\3\2\2\2\30\u00ce\3\2\2\2\32\u00f3\3\2\2\2\34\u0104\3"+
		"\2\2\2\36\u010a\3\2\2\2 \u010f\3\2\2\2\"\u0111\3\2\2\2$\u0121\3\2\2\2"+
		"&\'\7\20\2\2\',\7\24\2\2(-\5\16\b\2)-\5\20\t\2*-\7\21\2\2+-\5\34\17\2"+
		",(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\3\3\2\2\2.\60\5\6\4\2/.\3\2"+
		"\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2"+
		"\2\64\65\7\3\2\2\65\5\3\2\2\2\66@\5\n\6\2\67@\5\f\7\289\5\34\17\29:\7"+
		"\32\2\2:@\3\2\2\2;@\5\32\16\2<@\5\24\13\2=@\5\"\22\2>@\5\b\5\2?\66\3\2"+
		"\2\2?\67\3\2\2\2?8\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7"+
		"\3\2\2\2AB\7\17\2\2BC\5$\23\2C\t\3\2\2\2DE\7\f\2\2EF\7\20\2\2FJ\7\24\2"+
		"\2GK\7\21\2\2HK\5\34\17\2IK\5\20\t\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2KL\3"+
		"\2\2\2LM\7\32\2\2M\13\3\2\2\2NO\7\16\2\2OP\7\20\2\2PQ\7\24\2\2QR\5\16"+
		"\b\2RS\7\32\2\2S[\3\2\2\2TU\7\16\2\2UV\7\20\2\2VW\7\24\2\2WX\5\34\17\2"+
		"XY\7\32\2\2Y[\3\2\2\2ZN\3\2\2\2ZT\3\2\2\2[\r\3\2\2\2\\]\7\27\2\2]b\7\21"+
		"\2\2^_\7\31\2\2_a\7\21\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3"+
		"\2\2\2db\3\2\2\2ef\7\30\2\2f\17\3\2\2\2gh\7\20\2\2hi\7\33\2\2ij\7\21\2"+
		"\2jk\7\34\2\2k\21\3\2\2\2lo\7\21\2\2mo\5\20\t\2nl\3\2\2\2nm\3\2\2\2o\23"+
		"\3\2\2\2pq\7\4\2\2qr\5\26\f\2rs\7\5\2\2sw\7\27\2\2tv\5\6\4\2ut\3\2\2\2"+
		"vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\30\2\2{|\7\32\2"+
		"\2|}\7\6\2\2}\u0081\7\27\2\2~\u0080\5\6\4\2\177~\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7\30\2\2\u0085\u0086\7\32\2\2\u0086\25\3\2"+
		"\2\2\u0087\u0088\7\25\2\2\u0088\u008d\5\30\r\2\u0089\u008a\t\2\2\2\u008a"+
		"\u008c\5\30\r\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\26\2\2\u0091\27\3\2\2\2\u0092\u0093\7\20\2\2\u0093\u0094\7\23"+
		"\2\2\u0094\u00cf\7\20\2\2\u0095\u0096\7\20\2\2\u0096\u0097\7\23\2\2\u0097"+
		"\u00cf\5\22\n\2\u0098\u0099\5\22\n\2\u0099\u009a\7\23\2\2\u009a\u009b"+
		"\7\20\2\2\u009b\u00cf\3\2\2\2\u009c\u009d\7\20\2\2\u009d\u009e\7\23\2"+
		"\2\u009e\u00cf\5\16\b\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\7\23\2\2\u00a1"+
		"\u00a2\7\20\2\2\u00a2\u00cf\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\7"+
		"\23\2\2\u00a5\u00cf\5\34\17\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\23\2"+
		"\2\u00a8\u00a9\7\20\2\2\u00a9\u00cf\3\2\2\2\u00aa\u00ab\5\22\n\2\u00ab"+
		"\u00ac\7\23\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00cf\3\2\2\2\u00ae\u00af\5"+
		"\22\n\2\u00af\u00b0\7\23\2\2\u00b0\u00b1\5\34\17\2\u00b1\u00cf\3\2\2\2"+
		"\u00b2\u00b3\5\34\17\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\5\22\n\2\u00b5"+
		"\u00cf\3\2\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\7\23\2\2\u00b8\u00b9"+
		"\5\34\17\2\u00b9\u00cf\3\2\2\2\u00ba\u00bb\5\22\n\2\u00bb\u00bc\7\23\2"+
		"\2\u00bc\u00bd\5\16\b\2\u00bd\u00cf\3\2\2\2\u00be\u00bf\5\16\b\2\u00bf"+
		"\u00c0\7\23\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00cf\3\2\2\2\u00c2\u00c3\5"+
		"\34\17\2\u00c3\u00c4\7\23\2\2\u00c4\u00c5\5\16\b\2\u00c5\u00cf\3\2\2\2"+
		"\u00c6\u00c7\5\16\b\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\5\34\17\2\u00c9"+
		"\u00cf\3\2\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\7\23\2\2\u00cc\u00cd\5"+
		"\16\b\2\u00cd\u00cf\3\2\2\2\u00ce\u0092\3\2\2\2\u00ce\u0095\3\2\2\2\u00ce"+
		"\u0098\3\2\2\2\u00ce\u009c\3\2\2\2\u00ce\u009f\3\2\2\2\u00ce\u00a3\3\2"+
		"\2\2\u00ce\u00a6\3\2\2\2\u00ce\u00aa\3\2\2\2\u00ce\u00ae\3\2\2\2\u00ce"+
		"\u00b2\3\2\2\2\u00ce\u00b6\3\2\2\2\u00ce\u00ba\3\2\2\2\u00ce\u00be\3\2"+
		"\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf"+
		"\31\3\2\2\2\u00d0\u00d1\7\n\2\2\u00d1\u00d2\7\20\2\2\u00d2\u00d3\7\25"+
		"\2\2\u00d3\u00d8\5\36\20\2\u00d4\u00d5\7\31\2\2\u00d5\u00d7\5\36\20\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\26\2\2"+
		"\u00dc\u00e0\7\27\2\2\u00dd\u00df\5\6\4\2\u00de\u00dd\3\2\2\2\u00df\u00e2"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\7\32\2\2\u00e5\u00f4\3"+
		"\2\2\2\u00e6\u00e7\7\n\2\2\u00e7\u00e8\7\20\2\2\u00e8\u00e9\7\25\2\2\u00e9"+
		"\u00ea\7\26\2\2\u00ea\u00ee\7\27\2\2\u00eb\u00ed\5\6\4\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\30\2\2\u00f2\u00f4\7"+
		"\32\2\2\u00f3\u00d0\3\2\2\2\u00f3\u00e6\3\2\2\2\u00f4\33\3\2\2\2\u00f5"+
		"\u00f6\7\20\2\2\u00f6\u00f7\7\25\2\2\u00f7\u00fc\5 \21\2\u00f8\u00f9\7"+
		"\31\2\2\u00f9\u00fb\5 \21\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0100\7\26\2\2\u0100\u0105\3\2\2\2\u0101\u0102\7\20\2\2\u0102"+
		"\u0103\7\25\2\2\u0103\u0105\7\26\2\2\u0104\u00f5\3\2\2\2\u0104\u0101\3"+
		"\2\2\2\u0105\35\3\2\2\2\u0106\u0107\7\f\2\2\u0107\u010b\7\20\2\2\u0108"+
		"\u0109\7\16\2\2\u0109\u010b\7\20\2\2\u010a\u0106\3\2\2\2\u010a\u0108\3"+
		"\2\2\2\u010b\37\3\2\2\2\u010c\u0110\5\22\n\2\u010d\u0110\7\20\2\2\u010e"+
		"\u0110\7\7\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2"+
		"\2\2\u0110!\3\2\2\2\u0111\u0112\7\b\2\2\u0112\u0113\7\25\2\2\u0113\u0114"+
		"\7\7\2\2\u0114\u0115\7\t\2\2\u0115\u0116\7\20\2\2\u0116\u0117\7\26\2\2"+
		"\u0117\u011b\7\27\2\2\u0118\u011a\5\6\4\2\u0119\u0118\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\7\30\2\2\u011f\u0120\7\32\2\2\u0120#\3\2\2"+
		"\2\u0121\u0122\7\20\2\2\u0122%\3\2\2\2\26,\61?JZbnw\u0081\u008d\u00ce"+
		"\u00d8\u00e0\u00ee\u00f3\u00fc\u0104\u010a\u010f\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}