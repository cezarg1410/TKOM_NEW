/**
 * Define a grammar called Hello
 */
grammar ListLanguage;
 
@header {
    package parserAndLexer;
}

IF					:	'if';
THEN				:   'then';
ELSE				:  	'else';


AT					:  	'@';
PRINT				:  	'print';
NUMERICAL_VAR_OP 	: 	'number';
BOOLEAN 			: 	'true' | 'false';

LIST_VAR_OP			: 	'list';
RETURN				:   'return';
FUNCTIONS			:	'FUNCTIONS';
PROGRAM				:	'PROGRAM';
LOOP				: 	'LOOP';
 

fragment 
	LETTER: [a-z|A-Z];
fragment
	DIGIT: [0-9];
ID				 	: 	LETTER+;
NUMBER 			 	: 	DIGIT+;
ACTION_OPERATOR  	: 	'+' | '*' | '-';
LOGICAL_OPERATOR 	: 	'==' | '!-' | '>' | '>=' | '<' | '<=';
ASSIGN			 	: 	'=';
LPAREN           	: 	'(';
RPAREN           	: 	')';
LBRACE           	: 	'{';
RBRACE           	: 	'}';
COMA             	: 	',';
SEMI             	: 	';';
LBRACK           	: 	'[';
RBRACK           	:  	']';
AND_OPERATOR		:  	'&&';
OR_OPERATOR			:  	'!&&';

WS					: 	[ \t\n\r]+ ->skip;


compilation_unit 	: function_defs PROGRAM LBRACE operation* RBRACE SEMI;
function_defs		:  FUNCTIONS LBRACE function_def* RBRACE SEMI;
assignment			: ID ASSIGN (list | list_element | NUMBER | function_call | ID);
operation			: numerical_var_dec | list_var_dec | (function_call SEMI) | function_def | if_statement | loop | return_op | assignment;
return_op:			RETURN return_arg  SEMI;

numerical_var_dec 	: NUMERICAL_VAR_OP  ID  ASSIGN  (NUMBER | function_call | list_element) SEMI;
list_var_dec 		: (LIST_VAR_OP  ID  ASSIGN  list  SEMI) | (LIST_VAR_OP ID ASSIGN function_call SEMI) ;
list 				: LBRACE NUMBER (COMA NUMBER)* RBRACE;
list_element 		: ID  LBRACK  NUMBER  RBRACK ;

value 				: NUMBER | list_element;
if_statement 		:  (IF condition  
						then_block		
						else_block )
						| 
						(IF condition  
						then_block);
						
then_block			: THEN LBRACE (operation)* RBRACE SEMI;
else_block			: ELSE LBRACE (operation)* RBRACE SEMI;

condition 			: LPAREN elementary_condition  ((OR_OPERATOR | AND_OPERATOR )  elementary_condition )* RPAREN;

elementary_condition : 
					(ID LOGICAL_OPERATOR ID)
					| (ID LOGICAL_OPERATOR value)
					| (value LOGICAL_OPERATOR ID)
					| (ID LOGICAL_OPERATOR list)
					| (list LOGICAL_OPERATOR ID)
					| (ID LOGICAL_OPERATOR function_call)
					| (function_call LOGICAL_OPERATOR ID)
					| (value LOGICAL_OPERATOR value)
					| (value LOGICAL_OPERATOR function_call)
					| (function_call LOGICAL_OPERATOR value)
					| (function_call LOGICAL_OPERATOR function_call)
					| (value LOGICAL_OPERATOR list)
					| (list LOGICAL_OPERATOR value)
					| (function_call LOGICAL_OPERATOR list)
					| (list LOGICAL_OPERATOR function_call)
					| (list LOGICAL_OPERATOR list);								
function_def		: AT ID  LPAREN  ((function_def_arg (COMA function_def_arg)*) | ())  RPAREN
					LBRACE
						(operation)*
					RBRACE SEMI;

function_call		: (ID  LPAREN function_call_arg (COMA function_call_arg)* RPAREN)
					| (ID LPAREN RPAREN);
		
function_def_arg:  ((NUMERICAL_VAR_OP  ID) | (LIST_VAR_OP  ID));
function_call_arg :	list | value | ID | function_call;
loop				: LOOP  LPAREN  value RPAREN  LBRACE  operation *  RBRACE SEMI;

return_arg			: ID | value | list | function_call;