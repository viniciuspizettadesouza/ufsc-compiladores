grammar vjj;

start: func* EOF;

func: 'def' name = ID '(' args? ')' statms;

args: ID (',' ID)*;

statms: '{' statm* '}' | statm;

statm:
	ID '=' expr ';'													# assign
	| 'print' expr ';'												# print
	| 'if' cond = expr then = statms ('else' otherwise = statms)?	# if
	| 'while' cond = expr statms									# while
	| 'for' '(' cond = expr ';' cond = expr ';' expr ')' statms		# for
	| 'switch' '(' atom ')' switchStatms+							# switch
	| 'class' classdef												# class
	| 'return' expr ';'												# return;

whileStatement: '{' statm* '}';

switchStatms: '{' 'case' atom ':' switchStatms* '}';

types: TYPE_INT | TYPE_FLOAT | TYPE_BOOLEAN | TYPE_NULL;

classdef: 'class' atom ('(' (arglist)? ')')? ':' statms;

arglist: argument (',' argument)* (',')?;

argument: ( test '=' test | '**' test | '*' test);

test: or_test ('if' or_test 'else' test)?;

or_test: and_test ('or' and_test)*;

and_test: not_test ('and' not_test)*;

not_test: 'not' not_test | comparison;

comparison: expr (expr expr)*;

call: name = ID '(' exprs? ')';

exprs: expr (',' expr)*;

expr:
	left = summ (
		op = ('>' | '<' | '<=' | '>=' | '==') right = expr
	)*;

summ: left = mult (op = ('+' | '-') right = summ)*;

mult: left = atom (op = ('*' | '/') right = mult)*;

atom:
	'(' expr ')'
	| INT
	| FLOAT
	| NULL
	| BOOLEAN
	| ID
	| 'input'
	| call;

TYPE_INT: 'int';
TYPE_FLOAT: 'float';
TYPE_BOOLEAN: 'bool';
TYPE_NULL: 'null';
CLASS: 'class';
INPUT: 'input';
ELSE: 'else';
ID: [a-zA-Z]+ [0-9a-zA-Z]*;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
NULL: 'None';
BOOLEAN: 'True' | 'False';
WS: [ \r\n\t]+ -> skip;