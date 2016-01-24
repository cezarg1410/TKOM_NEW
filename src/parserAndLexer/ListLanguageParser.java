// Generated from ListLanguage.g4 by ANTLR 4.5.1

    package parserAndLexer;

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
		IF=1, THEN=2, ELSE=3, AT=4, PRINT=5, NUMERICAL_VAR_OP=6, BOOLEAN=7, LIST_VAR_OP=8, 
		RETURN=9, FUNCTIONS=10, PROGRAM=11, LOOP=12, ID=13, NUMBER=14, ACTION_OPERATOR=15, 
		LOGICAL_OPERATOR=16, ASSIGN=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, 
		COMA=22, SEMI=23, LBRACK=24, RBRACK=25, AND_OPERATOR=26, OR_OPERATOR=27, 
		WS=28;
	public static final int
		RULE_compilation_unit = 0, RULE_function_defs = 1, RULE_assignment = 2, 
		RULE_operation = 3, RULE_return_op = 4, RULE_numerical_var_dec = 5, RULE_list_var_dec = 6, 
		RULE_list = 7, RULE_list_element = 8, RULE_value = 9, RULE_if_statement = 10, 
		RULE_then_block = 11, RULE_else_block = 12, RULE_condition = 13, RULE_elementary_condition = 14, 
		RULE_function_def = 15, RULE_function_call = 16, RULE_function_def_arg = 17, 
		RULE_function_call_arg = 18, RULE_loop = 19, RULE_return_arg = 20;
	public static final String[] ruleNames = {
		"compilation_unit", "function_defs", "assignment", "operation", "return_op", 
		"numerical_var_dec", "list_var_dec", "list", "list_element", "value", 
		"if_statement", "then_block", "else_block", "condition", "elementary_condition", 
		"function_def", "function_call", "function_def_arg", "function_call_arg", 
		"loop", "return_arg"
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
	public static class Compilation_unitContext extends ParserRuleContext {
		public Function_defsContext function_defs() {
			return getRuleContext(Function_defsContext.class,0);
		}
		public TerminalNode PROGRAM() { return getToken(ListLanguageParser.PROGRAM, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
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
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			function_defs();
			setState(43);
			match(PROGRAM);
			setState(44);
			match(LBRACE);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(45);
				operation();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(RBRACE);
			setState(52);
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

	public static class Function_defsContext extends ParserRuleContext {
		public TerminalNode FUNCTIONS() { return getToken(ListLanguageParser.FUNCTIONS, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public Function_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_defs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitFunction_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defsContext function_defs() throws RecognitionException {
		Function_defsContext _localctx = new Function_defsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(FUNCTIONS);
			setState(55);
			match(LBRACE);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(56);
				function_def();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(RBRACE);
			setState(63);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ListLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ListLanguageParser.ID, i);
		}
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
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(ASSIGN);
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(67);
				list();
				}
				break;
			case 2:
				{
				setState(68);
				list_element();
				}
				break;
			case 3:
				{
				setState(69);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(70);
				function_call();
				}
				break;
			case 5:
				{
				setState(71);
				match(ID);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		enterRule(_localctx, 6, RULE_operation);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				numerical_var_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				list_var_dec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(76);
				function_call();
				setState(77);
				match(SEMI);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				function_def();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				return_op();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				assignment();
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

	public static class Return_opContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ListLanguageParser.RETURN, 0); }
		public Return_argContext return_arg() {
			return getRuleContext(Return_argContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
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
		enterRule(_localctx, 8, RULE_return_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(RETURN);
			setState(87);
			return_arg();
			setState(88);
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
		enterRule(_localctx, 10, RULE_numerical_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(NUMERICAL_VAR_OP);
			setState(91);
			match(ID);
			setState(92);
			match(ASSIGN);
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(93);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(94);
				function_call();
				}
				break;
			case 3:
				{
				setState(95);
				list_element();
				}
				break;
			}
			setState(98);
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
		enterRule(_localctx, 12, RULE_list_var_dec);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(100);
				match(LIST_VAR_OP);
				setState(101);
				match(ID);
				setState(102);
				match(ASSIGN);
				setState(103);
				list();
				setState(104);
				match(SEMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(106);
				match(LIST_VAR_OP);
				setState(107);
				match(ID);
				setState(108);
				match(ASSIGN);
				setState(109);
				function_call();
				setState(110);
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
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LBRACE);
			setState(115);
			match(NUMBER);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(116);
				match(COMA);
				setState(117);
				match(NUMBER);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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
		enterRule(_localctx, 16, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(LBRACK);
			setState(127);
			match(NUMBER);
			setState(128);
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
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
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
		public Then_blockContext then_block() {
			return getRuleContext(Then_blockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
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
		enterRule(_localctx, 20, RULE_if_statement);
		try {
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(134);
				match(IF);
				setState(135);
				condition();
				setState(136);
				then_block();
				setState(137);
				else_block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(139);
				match(IF);
				setState(140);
				condition();
				setState(141);
				then_block();
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

	public static class Then_blockContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(ListLanguageParser.THEN, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Then_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitThen_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_blockContext then_block() throws RecognitionException {
		Then_blockContext _localctx = new Then_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_then_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(THEN);
			setState(146);
			match(LBRACE);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(147);
				operation();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(RBRACE);
			setState(154);
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ListLanguageParser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ELSE);
			setState(157);
			match(LBRACE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(158);
				operation();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RBRACE);
			setState(165);
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
		public List<TerminalNode> OR_OPERATOR() { return getTokens(ListLanguageParser.OR_OPERATOR); }
		public TerminalNode OR_OPERATOR(int i) {
			return getToken(ListLanguageParser.OR_OPERATOR, i);
		}
		public List<TerminalNode> AND_OPERATOR() { return getTokens(ListLanguageParser.AND_OPERATOR); }
		public TerminalNode AND_OPERATOR(int i) {
			return getToken(ListLanguageParser.AND_OPERATOR, i);
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
		enterRule(_localctx, 26, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(LPAREN);
			setState(168);
			elementary_condition();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OPERATOR || _la==OR_OPERATOR) {
				{
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(170);
				elementary_condition();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
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
		enterRule(_localctx, 28, RULE_elementary_condition);
		try {
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(178);
				match(ID);
				setState(179);
				match(LOGICAL_OPERATOR);
				setState(180);
				match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(181);
				match(ID);
				setState(182);
				match(LOGICAL_OPERATOR);
				setState(183);
				value();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(184);
				value();
				setState(185);
				match(LOGICAL_OPERATOR);
				setState(186);
				match(ID);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(188);
				match(ID);
				setState(189);
				match(LOGICAL_OPERATOR);
				setState(190);
				list();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(191);
				list();
				setState(192);
				match(LOGICAL_OPERATOR);
				setState(193);
				match(ID);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(195);
				match(ID);
				setState(196);
				match(LOGICAL_OPERATOR);
				setState(197);
				function_call();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(198);
				function_call();
				setState(199);
				match(LOGICAL_OPERATOR);
				setState(200);
				match(ID);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(202);
				value();
				setState(203);
				match(LOGICAL_OPERATOR);
				setState(204);
				value();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(206);
				value();
				setState(207);
				match(LOGICAL_OPERATOR);
				setState(208);
				function_call();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(210);
				function_call();
				setState(211);
				match(LOGICAL_OPERATOR);
				setState(212);
				value();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(214);
				function_call();
				setState(215);
				match(LOGICAL_OPERATOR);
				setState(216);
				function_call();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(218);
				value();
				setState(219);
				match(LOGICAL_OPERATOR);
				setState(220);
				list();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(222);
				list();
				setState(223);
				match(LOGICAL_OPERATOR);
				setState(224);
				value();
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(226);
				function_call();
				setState(227);
				match(LOGICAL_OPERATOR);
				setState(228);
				list();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(230);
				list();
				setState(231);
				match(LOGICAL_OPERATOR);
				setState(232);
				function_call();
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(234);
				list();
				setState(235);
				match(LOGICAL_OPERATOR);
				setState(236);
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
		public List<Function_def_argContext> function_def_arg() {
			return getRuleContexts(Function_def_argContext.class);
		}
		public Function_def_argContext function_def_arg(int i) {
			return getRuleContext(Function_def_argContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
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
		enterRule(_localctx, 30, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(AT);
			setState(241);
			match(ID);
			setState(242);
			match(LPAREN);
			setState(252);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
			case LIST_VAR_OP:
				{
				{
				setState(243);
				function_def_arg();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(244);
					match(COMA);
					setState(245);
					function_def_arg();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case RPAREN:
				{
				{
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(254);
			match(RPAREN);
			setState(255);
			match(LBRACE);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(256);
				operation();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(RBRACE);
			setState(263);
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
		enterRule(_localctx, 32, RULE_function_call);
		int _la;
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(265);
				match(ID);
				setState(266);
				match(LPAREN);
				setState(267);
				function_call_arg();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(268);
					match(COMA);
					setState(269);
					function_call_arg();
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
				match(RPAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(277);
				match(ID);
				setState(278);
				match(LPAREN);
				setState(279);
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
		enterRule(_localctx, 34, RULE_function_def_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
				{
				{
				setState(282);
				match(NUMERICAL_VAR_OP);
				setState(283);
				match(ID);
				}
				}
				break;
			case LIST_VAR_OP:
				{
				{
				setState(284);
				match(LIST_VAR_OP);
				setState(285);
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_function_call_arg);
		try {
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				function_call();
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
		public TerminalNode LOOP() { return getToken(ListLanguageParser.LOOP, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(LOOP);
			setState(295);
			match(LPAREN);
			setState(296);
			value();
			setState(297);
			match(RPAREN);
			setState(298);
			match(LBRACE);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(299);
				operation();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(RBRACE);
			setState(306);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_return_arg);
		try {
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				function_call();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u013d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7c\n"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3"+
		"\t\3\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0092\n"+
		"\f\3\r\3\r\3\r\7\r\u0097\n\r\f\r\16\r\u009a\13\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00f1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f9\n"+
		"\21\f\21\16\21\u00fc\13\21\3\21\5\21\u00ff\n\21\3\21\3\21\3\21\7\21\u0104"+
		"\n\21\f\21\16\21\u0107\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7"+
		"\22\u0111\n\22\f\22\16\22\u0114\13\22\3\22\3\22\3\22\3\22\3\22\5\22\u011b"+
		"\n\22\3\23\3\23\3\23\3\23\5\23\u0121\n\23\3\24\3\24\3\24\3\24\5\24\u0127"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u012f\n\25\f\25\16\25\u0132\13"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u013b\n\26\3\26\2\2\27\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\34\35\u0159\2,\3\2"+
		"\2\2\48\3\2\2\2\6C\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\f\\\3\2\2\2\16r\3\2\2"+
		"\2\20t\3\2\2\2\22\177\3\2\2\2\24\u0086\3\2\2\2\26\u0091\3\2\2\2\30\u0093"+
		"\3\2\2\2\32\u009e\3\2\2\2\34\u00a9\3\2\2\2\36\u00f0\3\2\2\2 \u00f2\3\2"+
		"\2\2\"\u011a\3\2\2\2$\u0120\3\2\2\2&\u0126\3\2\2\2(\u0128\3\2\2\2*\u013a"+
		"\3\2\2\2,-\5\4\3\2-.\7\r\2\2.\62\7\26\2\2/\61\5\b\5\2\60/\3\2\2\2\61\64"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66"+
		"\7\27\2\2\66\67\7\31\2\2\67\3\3\2\2\289\7\f\2\29=\7\26\2\2:<\5 \21\2;"+
		":\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\27\2\2"+
		"AB\7\31\2\2B\5\3\2\2\2CD\7\17\2\2DJ\7\23\2\2EK\5\20\t\2FK\5\22\n\2GK\7"+
		"\20\2\2HK\5\"\22\2IK\7\17\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2"+
		"JI\3\2\2\2K\7\3\2\2\2LW\5\f\7\2MW\5\16\b\2NO\5\"\22\2OP\7\31\2\2PW\3\2"+
		"\2\2QW\5 \21\2RW\5\26\f\2SW\5(\25\2TW\5\n\6\2UW\5\6\4\2VL\3\2\2\2VM\3"+
		"\2\2\2VN\3\2\2\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\t"+
		"\3\2\2\2XY\7\13\2\2YZ\5*\26\2Z[\7\31\2\2[\13\3\2\2\2\\]\7\b\2\2]^\7\17"+
		"\2\2^b\7\23\2\2_c\7\20\2\2`c\5\"\22\2ac\5\22\n\2b_\3\2\2\2b`\3\2\2\2b"+
		"a\3\2\2\2cd\3\2\2\2de\7\31\2\2e\r\3\2\2\2fg\7\n\2\2gh\7\17\2\2hi\7\23"+
		"\2\2ij\5\20\t\2jk\7\31\2\2ks\3\2\2\2lm\7\n\2\2mn\7\17\2\2no\7\23\2\2o"+
		"p\5\"\22\2pq\7\31\2\2qs\3\2\2\2rf\3\2\2\2rl\3\2\2\2s\17\3\2\2\2tu\7\26"+
		"\2\2uz\7\20\2\2vw\7\30\2\2wy\7\20\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{"+
		"\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\27\2\2~\21\3\2\2\2\177\u0080\7\17\2\2"+
		"\u0080\u0081\7\32\2\2\u0081\u0082\7\20\2\2\u0082\u0083\7\33\2\2\u0083"+
		"\23\3\2\2\2\u0084\u0087\7\20\2\2\u0085\u0087\5\22\n\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089\7\3\2\2\u0089\u008a"+
		"\5\34\17\2\u008a\u008b\5\30\r\2\u008b\u008c\5\32\16\2\u008c\u0092\3\2"+
		"\2\2\u008d\u008e\7\3\2\2\u008e\u008f\5\34\17\2\u008f\u0090\5\30\r\2\u0090"+
		"\u0092\3\2\2\2\u0091\u0088\3\2\2\2\u0091\u008d\3\2\2\2\u0092\27\3\2\2"+
		"\2\u0093\u0094\7\4\2\2\u0094\u0098\7\26\2\2\u0095\u0097\5\b\5\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\27\2\2\u009c"+
		"\u009d\7\31\2\2\u009d\31\3\2\2\2\u009e\u009f\7\5\2\2\u009f\u00a3\7\26"+
		"\2\2\u00a0\u00a2\5\b\5\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a7\7\27\2\2\u00a7\u00a8\7\31\2\2\u00a8\33\3\2\2\2\u00a9"+
		"\u00aa\7\24\2\2\u00aa\u00af\5\36\20\2\u00ab\u00ac\t\2\2\2\u00ac\u00ae"+
		"\5\36\20\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3"+
		"\7\25\2\2\u00b3\35\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b6\7\22\2\2\u00b6"+
		"\u00f1\7\17\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00f1"+
		"\5\24\13\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\7\22\2\2\u00bc\u00bd\7\17"+
		"\2\2\u00bd\u00f1\3\2\2\2\u00be\u00bf\7\17\2\2\u00bf\u00c0\7\22\2\2\u00c0"+
		"\u00f1\5\20\t\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7\22\2\2\u00c3\u00c4"+
		"\7\17\2\2\u00c4\u00f1\3\2\2\2\u00c5\u00c6\7\17\2\2\u00c6\u00c7\7\22\2"+
		"\2\u00c7\u00f1\5\"\22\2\u00c8\u00c9\5\"\22\2\u00c9\u00ca\7\22\2\2\u00ca"+
		"\u00cb\7\17\2\2\u00cb\u00f1\3\2\2\2\u00cc\u00cd\5\24\13\2\u00cd\u00ce"+
		"\7\22\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00f1\3\2\2\2\u00d0\u00d1\5\24\13"+
		"\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00f1\3\2\2\2\u00d4"+
		"\u00d5\5\"\22\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\5\24\13\2\u00d7\u00f1"+
		"\3\2\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\7\22\2\2\u00da\u00db\5\"\22"+
		"\2\u00db\u00f1\3\2\2\2\u00dc\u00dd\5\24\13\2\u00dd\u00de\7\22\2\2\u00de"+
		"\u00df\5\20\t\2\u00df\u00f1\3\2\2\2\u00e0\u00e1\5\20\t\2\u00e1\u00e2\7"+
		"\22\2\2\u00e2\u00e3\5\24\13\2\u00e3\u00f1\3\2\2\2\u00e4\u00e5\5\"\22\2"+
		"\u00e5\u00e6\7\22\2\2\u00e6\u00e7\5\20\t\2\u00e7\u00f1\3\2\2\2\u00e8\u00e9"+
		"\5\20\t\2\u00e9\u00ea\7\22\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00f1\3\2\2"+
		"\2\u00ec\u00ed\5\20\t\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\5\20\t\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00b4\3\2\2\2\u00f0\u00b7\3\2\2\2\u00f0\u00ba\3\2"+
		"\2\2\u00f0\u00be\3\2\2\2\u00f0\u00c1\3\2\2\2\u00f0\u00c5\3\2\2\2\u00f0"+
		"\u00c8\3\2\2\2\u00f0\u00cc\3\2\2\2\u00f0\u00d0\3\2\2\2\u00f0\u00d4\3\2"+
		"\2\2\u00f0\u00d8\3\2\2\2\u00f0\u00dc\3\2\2\2\u00f0\u00e0\3\2\2\2\u00f0"+
		"\u00e4\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1\37\3\2\2"+
		"\2\u00f2\u00f3\7\6\2\2\u00f3\u00f4\7\17\2\2\u00f4\u00fe\7\24\2\2\u00f5"+
		"\u00fa\5$\23\2\u00f6\u00f7\7\30\2\2\u00f7\u00f9\5$\23\2\u00f8\u00f6\3"+
		"\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00ff\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f5\3\2"+
		"\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\25\2\2\u0101"+
		"\u0105\7\26\2\2\u0102\u0104\5\b\5\2\u0103\u0102\3\2\2\2\u0104\u0107\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\7\27\2\2\u0109\u010a\7\31\2\2\u010a!\3\2\2"+
		"\2\u010b\u010c\7\17\2\2\u010c\u010d\7\24\2\2\u010d\u0112\5&\24\2\u010e"+
		"\u010f\7\30\2\2\u010f\u0111\5&\24\2\u0110\u010e\3\2\2\2\u0111\u0114\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0116\7\25\2\2\u0116\u011b\3\2\2\2\u0117\u0118\7"+
		"\17\2\2\u0118\u0119\7\24\2\2\u0119\u011b\7\25\2\2\u011a\u010b\3\2\2\2"+
		"\u011a\u0117\3\2\2\2\u011b#\3\2\2\2\u011c\u011d\7\b\2\2\u011d\u0121\7"+
		"\17\2\2\u011e\u011f\7\n\2\2\u011f\u0121\7\17\2\2\u0120\u011c\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121%\3\2\2\2\u0122\u0127\5\20\t\2\u0123\u0127\5\24\13"+
		"\2\u0124\u0127\7\17\2\2\u0125\u0127\5\"\22\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\'\3\2\2\2"+
		"\u0128\u0129\7\16\2\2\u0129\u012a\7\24\2\2\u012a\u012b\5\24\13\2\u012b"+
		"\u012c\7\25\2\2\u012c\u0130\7\26\2\2\u012d\u012f\5\b\5\2\u012e\u012d\3"+
		"\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\27\2\2\u0134\u0135\7"+
		"\31\2\2\u0135)\3\2\2\2\u0136\u013b\7\17\2\2\u0137\u013b\5\24\13\2\u0138"+
		"\u013b\5\20\t\2\u0139\u013b\5\"\22\2\u013a\u0136\3\2\2\2\u013a\u0137\3"+
		"\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b+\3\2\2\2\30\62=J"+
		"Vbrz\u0086\u0091\u0098\u00a3\u00af\u00f0\u00fa\u00fe\u0105\u0112\u011a"+
		"\u0120\u0126\u0130\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}