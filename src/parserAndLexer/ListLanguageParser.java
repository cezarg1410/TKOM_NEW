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
		RULE_compilation_unit = 0, RULE_program = 1, RULE_function_defs = 2, RULE_assignment = 3, 
		RULE_operation = 4, RULE_return_op = 5, RULE_numerical_var_dec = 6, RULE_list_var_dec = 7, 
		RULE_list = 8, RULE_list_element = 9, RULE_value = 10, RULE_if_statement = 11, 
		RULE_then_block = 12, RULE_else_block = 13, RULE_condition = 14, RULE_elementary_condition = 15, 
		RULE_function_def = 16, RULE_function_call = 17, RULE_function_def_arg = 18, 
		RULE_function_call_arg = 19, RULE_loop = 20, RULE_return_arg = 21;
	public static final String[] ruleNames = {
		"compilation_unit", "program", "function_defs", "assignment", "operation", 
		"return_op", "numerical_var_dec", "list_var_dec", "list", "list_element", 
		"value", "if_statement", "then_block", "else_block", "condition", "elementary_condition", 
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			function_defs();
			setState(45);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PROGRAM);
			setState(48);
			match(LBRACE);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(49);
				operation();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(RBRACE);
			setState(56);
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
		enterRule(_localctx, 4, RULE_function_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(FUNCTIONS);
			setState(59);
			match(LBRACE);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(60);
				function_def();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(RBRACE);
			setState(67);
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
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(ASSIGN);
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(71);
				list();
				}
				break;
			case 2:
				{
				setState(72);
				list_element();
				}
				break;
			case 3:
				{
				setState(73);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(74);
				function_call();
				}
				break;
			case 5:
				{
				setState(75);
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
		enterRule(_localctx, 8, RULE_operation);
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				numerical_var_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				list_var_dec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(80);
				function_call();
				setState(81);
				match(SEMI);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				function_def();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				return_op();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
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
		enterRule(_localctx, 10, RULE_return_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(RETURN);
			setState(91);
			return_arg();
			setState(92);
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
		enterRule(_localctx, 12, RULE_numerical_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(NUMERICAL_VAR_OP);
			setState(95);
			match(ID);
			setState(96);
			match(ASSIGN);
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(97);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(98);
				function_call();
				}
				break;
			case 3:
				{
				setState(99);
				list_element();
				}
				break;
			}
			setState(102);
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
		enterRule(_localctx, 14, RULE_list_var_dec);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(104);
				match(LIST_VAR_OP);
				setState(105);
				match(ID);
				setState(106);
				match(ASSIGN);
				setState(107);
				list();
				setState(108);
				match(SEMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(110);
				match(LIST_VAR_OP);
				setState(111);
				match(ID);
				setState(112);
				match(ASSIGN);
				setState(113);
				function_call();
				setState(114);
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
		enterRule(_localctx, 16, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LBRACE);
			setState(119);
			match(NUMBER);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(120);
				match(COMA);
				setState(121);
				match(NUMBER);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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
		enterRule(_localctx, 18, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ID);
			setState(130);
			match(LBRACK);
			setState(131);
			match(NUMBER);
			setState(132);
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
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
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
		enterRule(_localctx, 22, RULE_if_statement);
		try {
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(138);
				match(IF);
				setState(139);
				condition();
				setState(140);
				then_block();
				setState(141);
				else_block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(143);
				match(IF);
				setState(144);
				condition();
				setState(145);
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
		enterRule(_localctx, 24, RULE_then_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(THEN);
			setState(150);
			match(LBRACE);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(151);
				operation();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(RBRACE);
			setState(158);
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
		enterRule(_localctx, 26, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ELSE);
			setState(161);
			match(LBRACE);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(162);
				operation();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RBRACE);
			setState(169);
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
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(LPAREN);
			setState(172);
			elementary_condition();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OPERATOR || _la==OR_OPERATOR) {
				{
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(174);
				elementary_condition();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
		enterRule(_localctx, 30, RULE_elementary_condition);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(182);
				match(ID);
				setState(183);
				match(LOGICAL_OPERATOR);
				setState(184);
				match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(185);
				match(ID);
				setState(186);
				match(LOGICAL_OPERATOR);
				setState(187);
				value();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(188);
				value();
				setState(189);
				match(LOGICAL_OPERATOR);
				setState(190);
				match(ID);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(192);
				match(ID);
				setState(193);
				match(LOGICAL_OPERATOR);
				setState(194);
				list();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(195);
				list();
				setState(196);
				match(LOGICAL_OPERATOR);
				setState(197);
				match(ID);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(199);
				match(ID);
				setState(200);
				match(LOGICAL_OPERATOR);
				setState(201);
				function_call();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(202);
				function_call();
				setState(203);
				match(LOGICAL_OPERATOR);
				setState(204);
				match(ID);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(206);
				value();
				setState(207);
				match(LOGICAL_OPERATOR);
				setState(208);
				value();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(210);
				value();
				setState(211);
				match(LOGICAL_OPERATOR);
				setState(212);
				function_call();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(214);
				function_call();
				setState(215);
				match(LOGICAL_OPERATOR);
				setState(216);
				value();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(218);
				function_call();
				setState(219);
				match(LOGICAL_OPERATOR);
				setState(220);
				function_call();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(222);
				value();
				setState(223);
				match(LOGICAL_OPERATOR);
				setState(224);
				list();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(226);
				list();
				setState(227);
				match(LOGICAL_OPERATOR);
				setState(228);
				value();
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(230);
				function_call();
				setState(231);
				match(LOGICAL_OPERATOR);
				setState(232);
				list();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(234);
				list();
				setState(235);
				match(LOGICAL_OPERATOR);
				setState(236);
				function_call();
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(238);
				list();
				setState(239);
				match(LOGICAL_OPERATOR);
				setState(240);
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
		enterRule(_localctx, 32, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(AT);
			setState(245);
			match(ID);
			setState(246);
			match(LPAREN);
			setState(256);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
			case LIST_VAR_OP:
				{
				{
				setState(247);
				function_def_arg();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(248);
					match(COMA);
					setState(249);
					function_def_arg();
					}
					}
					setState(254);
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
			setState(258);
			match(RPAREN);
			setState(259);
			match(LBRACE);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(260);
				operation();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(RBRACE);
			setState(267);
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
		enterRule(_localctx, 34, RULE_function_call);
		int _la;
		try {
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(269);
				match(ID);
				setState(270);
				match(LPAREN);
				setState(271);
				function_call_arg();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(272);
					match(COMA);
					setState(273);
					function_call_arg();
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(279);
				match(RPAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(281);
				match(ID);
				setState(282);
				match(LPAREN);
				setState(283);
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
		enterRule(_localctx, 36, RULE_function_def_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
				{
				{
				setState(286);
				match(NUMERICAL_VAR_OP);
				setState(287);
				match(ID);
				}
				}
				break;
			case LIST_VAR_OP:
				{
				{
				setState(288);
				match(LIST_VAR_OP);
				setState(289);
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
		enterRule(_localctx, 38, RULE_function_call_arg);
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
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
		enterRule(_localctx, 40, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(LOOP);
			setState(299);
			match(LPAREN);
			setState(300);
			value();
			setState(301);
			match(RPAREN);
			setState(302);
			match(LBRACE);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID))) != 0)) {
				{
				{
				setState(303);
				operation();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(RBRACE);
			setState(310);
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
		enterRule(_localctx, 42, RULE_return_arg);
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u0141\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4@\n\4\f\4\16"+
		"\4C\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bg\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tw\n\t\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0096\n\r\3\16\3\16\3\16\7\16\u009b\n\16\f\16\16\16\u009e"+
		"\13\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00a6\n\17\f\17\16\17\u00a9"+
		"\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00b2\n\20\f\20\16\20\u00b5"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f5\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00fd\n\22\f\22\16\22\u0100\13\22\3\22\5\22\u0103\n\22"+
		"\3\22\3\22\3\22\7\22\u0108\n\22\f\22\16\22\u010b\13\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u0115\n\23\f\23\16\23\u0118\13\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u011f\n\23\3\24\3\24\3\24\3\24\5\24\u0125\n"+
		"\24\3\25\3\25\3\25\3\25\5\25\u012b\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u0133\n\26\f\26\16\26\u0136\13\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\5\27\u013f\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,\2\3\3\2\34\35\u015c\2.\3\2\2\2\4\61\3\2\2\2\6<\3\2\2\2\bG"+
		"\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16`\3\2\2\2\20v\3\2\2\2\22x\3\2\2\2\24"+
		"\u0083\3\2\2\2\26\u008a\3\2\2\2\30\u0095\3\2\2\2\32\u0097\3\2\2\2\34\u00a2"+
		"\3\2\2\2\36\u00ad\3\2\2\2 \u00f4\3\2\2\2\"\u00f6\3\2\2\2$\u011e\3\2\2"+
		"\2&\u0124\3\2\2\2(\u012a\3\2\2\2*\u012c\3\2\2\2,\u013e\3\2\2\2./\5\6\4"+
		"\2/\60\5\4\3\2\60\3\3\2\2\2\61\62\7\r\2\2\62\66\7\26\2\2\63\65\5\n\6\2"+
		"\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66"+
		"\3\2\2\29:\7\27\2\2:;\7\31\2\2;\5\3\2\2\2<=\7\f\2\2=A\7\26\2\2>@\5\"\22"+
		"\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\27"+
		"\2\2EF\7\31\2\2F\7\3\2\2\2GH\7\17\2\2HN\7\23\2\2IO\5\22\n\2JO\5\24\13"+
		"\2KO\7\20\2\2LO\5$\23\2MO\7\17\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2"+
		"\2\2NM\3\2\2\2O\t\3\2\2\2P[\5\16\b\2Q[\5\20\t\2RS\5$\23\2ST\7\31\2\2T"+
		"[\3\2\2\2U[\5\"\22\2V[\5\30\r\2W[\5*\26\2X[\5\f\7\2Y[\5\b\5\2ZP\3\2\2"+
		"\2ZQ\3\2\2\2ZR\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2"+
		"\2[\13\3\2\2\2\\]\7\13\2\2]^\5,\27\2^_\7\31\2\2_\r\3\2\2\2`a\7\b\2\2a"+
		"b\7\17\2\2bf\7\23\2\2cg\7\20\2\2dg\5$\23\2eg\5\24\13\2fc\3\2\2\2fd\3\2"+
		"\2\2fe\3\2\2\2gh\3\2\2\2hi\7\31\2\2i\17\3\2\2\2jk\7\n\2\2kl\7\17\2\2l"+
		"m\7\23\2\2mn\5\22\n\2no\7\31\2\2ow\3\2\2\2pq\7\n\2\2qr\7\17\2\2rs\7\23"+
		"\2\2st\5$\23\2tu\7\31\2\2uw\3\2\2\2vj\3\2\2\2vp\3\2\2\2w\21\3\2\2\2xy"+
		"\7\26\2\2y~\7\20\2\2z{\7\30\2\2{}\7\20\2\2|z\3\2\2\2}\u0080\3\2\2\2~|"+
		"\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\27"+
		"\2\2\u0082\23\3\2\2\2\u0083\u0084\7\17\2\2\u0084\u0085\7\32\2\2\u0085"+
		"\u0086\7\20\2\2\u0086\u0087\7\33\2\2\u0087\25\3\2\2\2\u0088\u008b\7\20"+
		"\2\2\u0089\u008b\5\24\13\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\27\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008e\5\36\20\2\u008e\u008f\5\32"+
		"\16\2\u008f\u0090\5\34\17\2\u0090\u0096\3\2\2\2\u0091\u0092\7\3\2\2\u0092"+
		"\u0093\5\36\20\2\u0093\u0094\5\32\16\2\u0094\u0096\3\2\2\2\u0095\u008c"+
		"\3\2\2\2\u0095\u0091\3\2\2\2\u0096\31\3\2\2\2\u0097\u0098\7\4\2\2\u0098"+
		"\u009c\7\26\2\2\u0099\u009b\5\n\6\2\u009a\u0099\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a1\7\31\2\2\u00a1\33\3\2"+
		"\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a7\7\26\2\2\u00a4\u00a6\5\n\6\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\27\2\2\u00ab"+
		"\u00ac\7\31\2\2\u00ac\35\3\2\2\2\u00ad\u00ae\7\24\2\2\u00ae\u00b3\5 \21"+
		"\2\u00af\u00b0\t\2\2\2\u00b0\u00b2\5 \21\2\u00b1\u00af\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7\25\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\17"+
		"\2\2\u00b9\u00ba\7\22\2\2\u00ba\u00f5\7\17\2\2\u00bb\u00bc\7\17\2\2\u00bc"+
		"\u00bd\7\22\2\2\u00bd\u00f5\5\26\f\2\u00be\u00bf\5\26\f\2\u00bf\u00c0"+
		"\7\22\2\2\u00c0\u00c1\7\17\2\2\u00c1\u00f5\3\2\2\2\u00c2\u00c3\7\17\2"+
		"\2\u00c3\u00c4\7\22\2\2\u00c4\u00f5\5\22\n\2\u00c5\u00c6\5\22\n\2\u00c6"+
		"\u00c7\7\22\2\2\u00c7\u00c8\7\17\2\2\u00c8\u00f5\3\2\2\2\u00c9\u00ca\7"+
		"\17\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00f5\5$\23\2\u00cc\u00cd\5$\23\2\u00cd"+
		"\u00ce\7\22\2\2\u00ce\u00cf\7\17\2\2\u00cf\u00f5\3\2\2\2\u00d0\u00d1\5"+
		"\26\f\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\5\26\f\2\u00d3\u00f5\3\2\2\2"+
		"\u00d4\u00d5\5\26\f\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\5$\23\2\u00d7\u00f5"+
		"\3\2\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da\7\22\2\2\u00da\u00db\5\26\f\2"+
		"\u00db\u00f5\3\2\2\2\u00dc\u00dd\5$\23\2\u00dd\u00de\7\22\2\2\u00de\u00df"+
		"\5$\23\2\u00df\u00f5\3\2\2\2\u00e0\u00e1\5\26\f\2\u00e1\u00e2\7\22\2\2"+
		"\u00e2\u00e3\5\22\n\2\u00e3\u00f5\3\2\2\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6"+
		"\7\22\2\2\u00e6\u00e7\5\26\f\2\u00e7\u00f5\3\2\2\2\u00e8\u00e9\5$\23\2"+
		"\u00e9\u00ea\7\22\2\2\u00ea\u00eb\5\22\n\2\u00eb\u00f5\3\2\2\2\u00ec\u00ed"+
		"\5\22\n\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\5$\23\2\u00ef\u00f5\3\2\2\2"+
		"\u00f0\u00f1\5\22\n\2\u00f1\u00f2\7\22\2\2\u00f2\u00f3\5\22\n\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00b8\3\2\2\2\u00f4\u00bb\3\2\2\2\u00f4\u00be\3\2"+
		"\2\2\u00f4\u00c2\3\2\2\2\u00f4\u00c5\3\2\2\2\u00f4\u00c9\3\2\2\2\u00f4"+
		"\u00cc\3\2\2\2\u00f4\u00d0\3\2\2\2\u00f4\u00d4\3\2\2\2\u00f4\u00d8\3\2"+
		"\2\2\u00f4\u00dc\3\2\2\2\u00f4\u00e0\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4"+
		"\u00e8\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5!\3\2\2\2"+
		"\u00f6\u00f7\7\6\2\2\u00f7\u00f8\7\17\2\2\u00f8\u0102\7\24\2\2\u00f9\u00fe"+
		"\5&\24\2\u00fa\u00fb\7\30\2\2\u00fb\u00fd\5&\24\2\u00fc\u00fa\3\2\2\2"+
		"\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0103"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00f9\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\25\2\2\u0105\u0109\7"+
		"\26\2\2\u0106\u0108\5\n\6\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010d\7\27\2\2\u010d\u010e\7\31\2\2\u010e#\3\2\2\2\u010f\u0110"+
		"\7\17\2\2\u0110\u0111\7\24\2\2\u0111\u0116\5(\25\2\u0112\u0113\7\30\2"+
		"\2\u0113\u0115\5(\25\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\7\25\2\2\u011a\u011f\3\2\2\2\u011b\u011c\7\17\2\2\u011c\u011d\7"+
		"\24\2\2\u011d\u011f\7\25\2\2\u011e\u010f\3\2\2\2\u011e\u011b\3\2\2\2\u011f"+
		"%\3\2\2\2\u0120\u0121\7\b\2\2\u0121\u0125\7\17\2\2\u0122\u0123\7\n\2\2"+
		"\u0123\u0125\7\17\2\2\u0124\u0120\3\2\2\2\u0124\u0122\3\2\2\2\u0125\'"+
		"\3\2\2\2\u0126\u012b\5\22\n\2\u0127\u012b\5\26\f\2\u0128\u012b\7\17\2"+
		"\2\u0129\u012b\5$\23\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012a\u0129\3\2\2\2\u012b)\3\2\2\2\u012c\u012d\7\16\2\2\u012d"+
		"\u012e\7\24\2\2\u012e\u012f\5\26\f\2\u012f\u0130\7\25\2\2\u0130\u0134"+
		"\7\26\2\2\u0131\u0133\5\n\6\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u0138\7\27\2\2\u0138\u0139\7\31\2\2\u0139+\3\2\2\2\u013a"+
		"\u013f\7\17\2\2\u013b\u013f\5\26\f\2\u013c\u013f\5\22\n\2\u013d\u013f"+
		"\5$\23\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013f-\3\2\2\2\30\66ANZfv~\u008a\u0095\u009c\u00a7\u00b3"+
		"\u00f4\u00fe\u0102\u0109\u0116\u011e\u0124\u012a\u0134\u013e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}