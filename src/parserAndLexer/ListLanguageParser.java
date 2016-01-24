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
		RULE_operation = 4, RULE_arithmetic_operation = 5, RULE_return_op = 6, 
		RULE_list_var_dec = 7, RULE_numerical_var_dec = 8, RULE_list = 9, RULE_list_element = 10, 
		RULE_value = 11, RULE_if_statement = 12, RULE_then_block = 13, RULE_else_block = 14, 
		RULE_condition = 15, RULE_elementary_condition = 16, RULE_function_def = 17, 
		RULE_function_call = 18, RULE_function_def_arg = 19, RULE_function_call_arg = 20, 
		RULE_loop = 21, RULE_return_arg = 22;
	public static final String[] ruleNames = {
		"compilation_unit", "program", "function_defs", "assignment", "operation", 
		"arithmetic_operation", "return_op", "list_var_dec", "numerical_var_dec", 
		"list", "list_element", "value", "if_statement", "then_block", "else_block", 
		"condition", "elementary_condition", "function_def", "function_call", 
		"function_def_arg", "function_call_arg", "loop", "return_arg"
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
			setState(46);
			function_defs();
			setState(47);
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
			setState(49);
			match(PROGRAM);
			setState(50);
			match(LBRACE);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID) | (1L << NUMBER) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(51);
				operation();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(RBRACE);
			setState(58);
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
			setState(60);
			match(FUNCTIONS);
			setState(61);
			match(LBRACE);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(62);
				function_def();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(RBRACE);
			setState(69);
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
		public Arithmetic_operationContext arithmetic_operation() {
			return getRuleContext(Arithmetic_operationContext.class,0);
		}
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
			setState(71);
			match(ID);
			setState(72);
			match(ASSIGN);
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(73);
				arithmetic_operation();
				}
				break;
			case 2:
				{
				setState(74);
				list();
				}
				break;
			case 3:
				{
				setState(75);
				list_element();
				}
				break;
			case 4:
				{
				setState(76);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(77);
				function_call();
				}
				break;
			case 6:
				{
				setState(78);
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
		public Arithmetic_operationContext arithmetic_operation() {
			return getRuleContext(Arithmetic_operationContext.class,0);
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
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				numerical_var_dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				list_var_dec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(83);
				function_call();
				setState(84);
				match(SEMI);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				function_def();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				return_op();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				assignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				arithmetic_operation();
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

	public static class Arithmetic_operationContext extends ParserRuleContext {
		public TerminalNode ACTION_OPERATOR() { return getToken(ListLanguageParser.ACTION_OPERATOR, 0); }
		public List<TerminalNode> ID() { return getTokens(ListLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ListLanguageParser.ID, i);
		}
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
		public Arithmetic_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ListLanguageVisitor ) return ((ListLanguageVisitor<? extends T>)visitor).visitArithmetic_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_operationContext arithmetic_operation() throws RecognitionException {
		Arithmetic_operationContext _localctx = new Arithmetic_operationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arithmetic_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(94);
				match(ID);
				}
				break;
			case 2:
				{
				setState(95);
				value();
				}
				break;
			case 3:
				{
				setState(96);
				list();
				}
				break;
			case 4:
				{
				setState(97);
				function_call();
				}
				break;
			}
			setState(100);
			match(ACTION_OPERATOR);
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(101);
				match(ID);
				}
				break;
			case 2:
				{
				setState(102);
				value();
				}
				break;
			case 3:
				{
				setState(103);
				list();
				}
				break;
			case 4:
				{
				setState(104);
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
		enterRule(_localctx, 12, RULE_return_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(RETURN);
			setState(108);
			return_arg();
			setState(109);
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
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public Arithmetic_operationContext arithmetic_operation() {
			return getRuleContext(Arithmetic_operationContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LIST_VAR_OP);
			setState(112);
			match(ID);
			setState(113);
			match(ASSIGN);
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(114);
				arithmetic_operation();
				}
				break;
			case 2:
				{
				setState(115);
				list();
				}
				break;
			case 3:
				{
				setState(116);
				function_call();
				}
				break;
			}
			setState(119);
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
		public Arithmetic_operationContext arithmetic_operation() {
			return getRuleContext(Arithmetic_operationContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_numerical_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(NUMERICAL_VAR_OP);
			setState(122);
			match(ID);
			setState(123);
			match(ASSIGN);
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(124);
				arithmetic_operation();
				}
				break;
			case 2:
				{
				setState(125);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(126);
				function_call();
				}
				break;
			case 4:
				{
				setState(127);
				list_element();
				}
				break;
			}
			setState(130);
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
		enterRule(_localctx, 18, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LBRACE);
			setState(133);
			match(NUMBER);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(134);
				match(COMA);
				setState(135);
				match(NUMBER);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
		enterRule(_localctx, 20, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(144);
			match(LBRACK);
			setState(145);
			match(NUMBER);
			setState(146);
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
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(150);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
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
		enterRule(_localctx, 24, RULE_if_statement);
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(152);
				match(IF);
				setState(153);
				condition();
				setState(154);
				then_block();
				setState(155);
				else_block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(157);
				match(IF);
				setState(158);
				condition();
				setState(159);
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
		public List<Return_opContext> return_op() {
			return getRuleContexts(Return_opContext.class);
		}
		public Return_opContext return_op(int i) {
			return getRuleContext(Return_opContext.class,i);
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
		enterRule(_localctx, 26, RULE_then_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(THEN);
			setState(164);
			match(LBRACE);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID) | (1L << NUMBER) | (1L << LBRACE))) != 0)) {
				{
				setState(167);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(165);
					operation();
					}
					break;
				case 2:
					{
					setState(166);
					return_op();
					}
					break;
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(RBRACE);
			setState(173);
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
		public List<Return_opContext> return_op() {
			return getRuleContexts(Return_opContext.class);
		}
		public Return_opContext return_op(int i) {
			return getRuleContext(Return_opContext.class,i);
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
		enterRule(_localctx, 28, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ELSE);
			setState(176);
			match(LBRACE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID) | (1L << NUMBER) | (1L << LBRACE))) != 0)) {
				{
				setState(179);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(177);
					operation();
					}
					break;
				case 2:
					{
					setState(178);
					return_op();
					}
					break;
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(RBRACE);
			setState(185);
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
		enterRule(_localctx, 30, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(LPAREN);
			setState(188);
			elementary_condition();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OPERATOR || _la==OR_OPERATOR) {
				{
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(190);
				elementary_condition();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
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
		enterRule(_localctx, 32, RULE_elementary_condition);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(198);
				match(ID);
				setState(199);
				match(LOGICAL_OPERATOR);
				setState(200);
				match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(201);
				match(ID);
				setState(202);
				match(LOGICAL_OPERATOR);
				setState(203);
				value();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(204);
				value();
				setState(205);
				match(LOGICAL_OPERATOR);
				setState(206);
				match(ID);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(208);
				match(ID);
				setState(209);
				match(LOGICAL_OPERATOR);
				setState(210);
				list();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(211);
				list();
				setState(212);
				match(LOGICAL_OPERATOR);
				setState(213);
				match(ID);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(215);
				match(ID);
				setState(216);
				match(LOGICAL_OPERATOR);
				setState(217);
				function_call();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(218);
				function_call();
				setState(219);
				match(LOGICAL_OPERATOR);
				setState(220);
				match(ID);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(222);
				value();
				setState(223);
				match(LOGICAL_OPERATOR);
				setState(224);
				value();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(226);
				value();
				setState(227);
				match(LOGICAL_OPERATOR);
				setState(228);
				function_call();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(230);
				function_call();
				setState(231);
				match(LOGICAL_OPERATOR);
				setState(232);
				value();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(234);
				function_call();
				setState(235);
				match(LOGICAL_OPERATOR);
				setState(236);
				function_call();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(238);
				value();
				setState(239);
				match(LOGICAL_OPERATOR);
				setState(240);
				list();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(242);
				list();
				setState(243);
				match(LOGICAL_OPERATOR);
				setState(244);
				value();
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(246);
				function_call();
				setState(247);
				match(LOGICAL_OPERATOR);
				setState(248);
				list();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(250);
				list();
				setState(251);
				match(LOGICAL_OPERATOR);
				setState(252);
				function_call();
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(254);
				list();
				setState(255);
				match(LOGICAL_OPERATOR);
				setState(256);
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
		enterRule(_localctx, 34, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(AT);
			setState(261);
			match(ID);
			setState(262);
			match(LPAREN);
			setState(272);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
			case LIST_VAR_OP:
				{
				{
				setState(263);
				function_def_arg();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(264);
					match(COMA);
					setState(265);
					function_def_arg();
					}
					}
					setState(270);
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
			setState(274);
			match(RPAREN);
			setState(275);
			match(LBRACE);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID) | (1L << NUMBER) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(276);
				operation();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(RBRACE);
			setState(283);
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
		enterRule(_localctx, 36, RULE_function_call);
		int _la;
		try {
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(285);
				match(ID);
				setState(286);
				match(LPAREN);
				setState(287);
				function_call_arg();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(288);
					match(COMA);
					setState(289);
					function_call_arg();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				match(RPAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(297);
				match(ID);
				setState(298);
				match(LPAREN);
				setState(299);
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
		enterRule(_localctx, 38, RULE_function_def_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
				{
				{
				setState(302);
				match(NUMERICAL_VAR_OP);
				setState(303);
				match(ID);
				}
				}
				break;
			case LIST_VAR_OP:
				{
				{
				setState(304);
				match(LIST_VAR_OP);
				setState(305);
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
		enterRule(_localctx, 40, RULE_function_call_arg);
		try {
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				list();
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
				match(ID);
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
		enterRule(_localctx, 42, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(LOOP);
			setState(315);
			match(LPAREN);
			setState(316);
			value();
			setState(317);
			match(RPAREN);
			setState(318);
			match(LBRACE);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << RETURN) | (1L << LOOP) | (1L << ID) | (1L << NUMBER) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(319);
				operation();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(RBRACE);
			setState(326);
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
		public Arithmetic_operationContext arithmetic_operation() {
			return getRuleContext(Arithmetic_operationContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_return_arg);
		try {
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				arithmetic_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u0152\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4B"+
		"\n\4\f\4\16\4E\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3"+
		"\7\5\7e\n\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tx\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u0099\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00a4\n\16\3\17\3\17\3\17\3\17\7\17\u00aa"+
		"\n\17\f\17\16\17\u00ad\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00b6"+
		"\n\20\f\20\16\20\u00b9\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00c2"+
		"\n\21\f\21\16\21\u00c5\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0105"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u010d\n\23\f\23\16\23\u0110\13"+
		"\23\3\23\5\23\u0113\n\23\3\23\3\23\3\23\7\23\u0118\n\23\f\23\16\23\u011b"+
		"\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0125\n\24\f\24\16"+
		"\24\u0128\13\24\3\24\3\24\3\24\3\24\3\24\5\24\u012f\n\24\3\25\3\25\3\25"+
		"\3\25\5\25\u0135\n\25\3\26\3\26\3\26\3\26\5\26\u013b\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u0143\n\27\f\27\16\27\u0146\13\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\5\30\u0150\n\30\3\30\2\2\31\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\34\35\u0179\2\60\3\2\2\2\4\63"+
		"\3\2\2\2\6>\3\2\2\2\bI\3\2\2\2\n^\3\2\2\2\fd\3\2\2\2\16m\3\2\2\2\20q\3"+
		"\2\2\2\22{\3\2\2\2\24\u0086\3\2\2\2\26\u0091\3\2\2\2\30\u0098\3\2\2\2"+
		"\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00b1\3\2\2\2 \u00bd\3\2\2\2\"\u0104"+
		"\3\2\2\2$\u0106\3\2\2\2&\u012e\3\2\2\2(\u0134\3\2\2\2*\u013a\3\2\2\2,"+
		"\u013c\3\2\2\2.\u014f\3\2\2\2\60\61\5\6\4\2\61\62\5\4\3\2\62\3\3\2\2\2"+
		"\63\64\7\r\2\2\648\7\26\2\2\65\67\5\n\6\2\66\65\3\2\2\2\67:\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\27\2\2<=\7\31\2\2=\5\3\2\2"+
		"\2>?\7\f\2\2?C\7\26\2\2@B\5$\23\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2DF\3\2\2\2EC\3\2\2\2FG\7\27\2\2GH\7\31\2\2H\7\3\2\2\2IJ\7\17\2\2J"+
		"Q\7\23\2\2KR\5\f\7\2LR\5\24\13\2MR\5\26\f\2NR\7\20\2\2OR\5&\24\2PR\7\17"+
		"\2\2QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\t\3"+
		"\2\2\2S_\5\22\n\2T_\5\20\t\2UV\5&\24\2VW\7\31\2\2W_\3\2\2\2X_\5$\23\2"+
		"Y_\5\32\16\2Z_\5,\27\2[_\5\16\b\2\\_\5\b\5\2]_\5\f\7\2^S\3\2\2\2^T\3\2"+
		"\2\2^U\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3"+
		"\2\2\2_\13\3\2\2\2`e\7\17\2\2ae\5\30\r\2be\5\24\13\2ce\5&\24\2d`\3\2\2"+
		"\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2fk\7\21\2\2gl\7\17\2\2hl\5\30"+
		"\r\2il\5\24\13\2jl\5&\24\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\r"+
		"\3\2\2\2mn\7\13\2\2no\5.\30\2op\7\31\2\2p\17\3\2\2\2qr\7\n\2\2rs\7\17"+
		"\2\2sw\7\23\2\2tx\5\f\7\2ux\5\24\13\2vx\5&\24\2wt\3\2\2\2wu\3\2\2\2wv"+
		"\3\2\2\2xy\3\2\2\2yz\7\31\2\2z\21\3\2\2\2{|\7\b\2\2|}\7\17\2\2}\u0082"+
		"\7\23\2\2~\u0083\5\f\7\2\177\u0083\7\20\2\2\u0080\u0083\5&\24\2\u0081"+
		"\u0083\5\26\f\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\31\2\2\u0085\23\3\2\2"+
		"\2\u0086\u0087\7\26\2\2\u0087\u008c\7\20\2\2\u0088\u0089\7\30\2\2\u0089"+
		"\u008b\7\20\2\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\7\27\2\2\u0090\25\3\2\2\2\u0091\u0092\7\17\2\2\u0092\u0093\7\32"+
		"\2\2\u0093\u0094\7\20\2\2\u0094\u0095\7\33\2\2\u0095\27\3\2\2\2\u0096"+
		"\u0099\7\20\2\2\u0097\u0099\5\26\f\2\u0098\u0096\3\2\2\2\u0098\u0097\3"+
		"\2\2\2\u0099\31\3\2\2\2\u009a\u009b\7\3\2\2\u009b\u009c\5 \21\2\u009c"+
		"\u009d\5\34\17\2\u009d\u009e\5\36\20\2\u009e\u00a4\3\2\2\2\u009f\u00a0"+
		"\7\3\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\5\34\17\2\u00a2\u00a4\3\2\2\2"+
		"\u00a3\u009a\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a6"+
		"\7\4\2\2\u00a6\u00ab\7\26\2\2\u00a7\u00aa\5\n\6\2\u00a8\u00aa\5\16\b\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7\27\2\2\u00af\u00b0\7\31\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\7\5"+
		"\2\2\u00b2\u00b7\7\26\2\2\u00b3\u00b6\5\n\6\2\u00b4\u00b6\5\16\b\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\27\2\2\u00bb\u00bc\7\31\2\2\u00bc\37\3\2\2\2\u00bd\u00be\7\24"+
		"\2\2\u00be\u00c3\5\"\22\2\u00bf\u00c0\t\2\2\2\u00c0\u00c2\5\"\22\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\25\2\2\u00c7"+
		"!\3\2\2\2\u00c8\u00c9\7\17\2\2\u00c9\u00ca\7\22\2\2\u00ca\u0105\7\17\2"+
		"\2\u00cb\u00cc\7\17\2\2\u00cc\u00cd\7\22\2\2\u00cd\u0105\5\30\r\2\u00ce"+
		"\u00cf\5\30\r\2\u00cf\u00d0\7\22\2\2\u00d0\u00d1\7\17\2\2\u00d1\u0105"+
		"\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d4\7\22\2\2\u00d4\u0105\5\24\13"+
		"\2\u00d5\u00d6\5\24\13\2\u00d6\u00d7\7\22\2\2\u00d7\u00d8\7\17\2\2\u00d8"+
		"\u0105\3\2\2\2\u00d9\u00da\7\17\2\2\u00da\u00db\7\22\2\2\u00db\u0105\5"+
		"&\24\2\u00dc\u00dd\5&\24\2\u00dd\u00de\7\22\2\2\u00de\u00df\7\17\2\2\u00df"+
		"\u0105\3\2\2\2\u00e0\u00e1\5\30\r\2\u00e1\u00e2\7\22\2\2\u00e2\u00e3\5"+
		"\30\r\2\u00e3\u0105\3\2\2\2\u00e4\u00e5\5\30\r\2\u00e5\u00e6\7\22\2\2"+
		"\u00e6\u00e7\5&\24\2\u00e7\u0105\3\2\2\2\u00e8\u00e9\5&\24\2\u00e9\u00ea"+
		"\7\22\2\2\u00ea\u00eb\5\30\r\2\u00eb\u0105\3\2\2\2\u00ec\u00ed\5&\24\2"+
		"\u00ed\u00ee\7\22\2\2\u00ee\u00ef\5&\24\2\u00ef\u0105\3\2\2\2\u00f0\u00f1"+
		"\5\30\r\2\u00f1\u00f2\7\22\2\2\u00f2\u00f3\5\24\13\2\u00f3\u0105\3\2\2"+
		"\2\u00f4\u00f5\5\24\13\2\u00f5\u00f6\7\22\2\2\u00f6\u00f7\5\30\r\2\u00f7"+
		"\u0105\3\2\2\2\u00f8\u00f9\5&\24\2\u00f9\u00fa\7\22\2\2\u00fa\u00fb\5"+
		"\24\13\2\u00fb\u0105\3\2\2\2\u00fc\u00fd\5\24\13\2\u00fd\u00fe\7\22\2"+
		"\2\u00fe\u00ff\5&\24\2\u00ff\u0105\3\2\2\2\u0100\u0101\5\24\13\2\u0101"+
		"\u0102\7\22\2\2\u0102\u0103\5\24\13\2\u0103\u0105\3\2\2\2\u0104\u00c8"+
		"\3\2\2\2\u0104\u00cb\3\2\2\2\u0104\u00ce\3\2\2\2\u0104\u00d2\3\2\2\2\u0104"+
		"\u00d5\3\2\2\2\u0104\u00d9\3\2\2\2\u0104\u00dc\3\2\2\2\u0104\u00e0\3\2"+
		"\2\2\u0104\u00e4\3\2\2\2\u0104\u00e8\3\2\2\2\u0104\u00ec\3\2\2\2\u0104"+
		"\u00f0\3\2\2\2\u0104\u00f4\3\2\2\2\u0104\u00f8\3\2\2\2\u0104\u00fc\3\2"+
		"\2\2\u0104\u0100\3\2\2\2\u0105#\3\2\2\2\u0106\u0107\7\6\2\2\u0107\u0108"+
		"\7\17\2\2\u0108\u0112\7\24\2\2\u0109\u010e\5(\25\2\u010a\u010b\7\30\2"+
		"\2\u010b\u010d\5(\25\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\7\25\2\2\u0115\u0119\7\26\2\2\u0116\u0118\5\n\6\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\27\2\2\u011d"+
		"\u011e\7\31\2\2\u011e%\3\2\2\2\u011f\u0120\7\17\2\2\u0120\u0121\7\24\2"+
		"\2\u0121\u0126\5*\26\2\u0122\u0123\7\30\2\2\u0123\u0125\5*\26\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\25\2\2\u012a"+
		"\u012f\3\2\2\2\u012b\u012c\7\17\2\2\u012c\u012d\7\24\2\2\u012d\u012f\7"+
		"\25\2\2\u012e\u011f\3\2\2\2\u012e\u012b\3\2\2\2\u012f\'\3\2\2\2\u0130"+
		"\u0131\7\b\2\2\u0131\u0135\7\17\2\2\u0132\u0133\7\n\2\2\u0133\u0135\7"+
		"\17\2\2\u0134\u0130\3\2\2\2\u0134\u0132\3\2\2\2\u0135)\3\2\2\2\u0136\u013b"+
		"\5\24\13\2\u0137\u013b\5\30\r\2\u0138\u013b\7\17\2\2\u0139\u013b\5&\24"+
		"\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013b+\3\2\2\2\u013c\u013d\7\16\2\2\u013d\u013e\7\24\2\2\u013e"+
		"\u013f\5\30\r\2\u013f\u0140\7\25\2\2\u0140\u0144\7\26\2\2\u0141\u0143"+
		"\5\n\6\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\27"+
		"\2\2\u0148\u0149\7\31\2\2\u0149-\3\2\2\2\u014a\u0150\5\f\7\2\u014b\u0150"+
		"\7\17\2\2\u014c\u0150\5\30\r\2\u014d\u0150\5\24\13\2\u014e\u0150\5&\24"+
		"\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u014e\3\2\2\2\u0150/\3\2\2\2\348CQ^dkw\u0082\u008c\u0098"+
		"\u00a3\u00a9\u00ab\u00b5\u00b7\u00c3\u0104\u010e\u0112\u0119\u0126\u012e"+
		"\u0134\u013a\u0144\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}