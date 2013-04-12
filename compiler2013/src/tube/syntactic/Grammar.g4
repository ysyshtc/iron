grammar Grammar;

@header {
package tube.syntactic;
}

program: (declaration | functionDefinition)+
			;
 
declaration: 'typedef' typeSpecifier declarators ';'
           | typeSpecifier initDeclarators? ';'
   		;

functionDefinition: typeSpecifier plainDeclarator '(' parameters? ')' compoundStatement
   		;

parameters: plainDeclaration (',' plainDeclaration)* (',' '...')?
   		;

declarators: declarator (',' declarator)*
   		;

initDeclarators: initDeclarator (',' initDeclarator)*
   		;

initDeclarator: declarator ('=' initializer)?
   		;

initializer: assignmentExpression
           | '{' initializer (',' initializer)* '}'
   		;

typeSpecifier: 'void' | 'char' | 'int' | typedefName
              | structOrUnion identifier? '{' (typeSpecifier declarators ';')+ '}'
              | structOrUnion identifier
   		   ;

structOrUnion: 'struct' | 'union'
   		;

plainDeclaration: typeSpecifier declarator
   		;

declarator: plainDeclarator '(' parameters? ')'
          | plainDeclarator ('[' constantExpression ']')*
   	   ;

plainDeclarator: '*'* identifier
   		;

statement: expressionStatement
         | compoundStatement
         | selectionStatement
         | iterationStatement
         | jumpStatement
   	  ;

expressionStatement: expression? ';'
   		;

compoundStatement: '{' declaration* statement* '}'
   		;

selectionStatement: 'if' '(' expression ')' statement ('else' statement)?
   		;

iterationStatement: 'while' '(' expression ')' statement
                   | 'for' '(' expression? ';' expression? ';' expression? ')' statement
   				;

jumpStatement: 'continue' ';'
              | 'break' ';'
              | 'return' expression? ';'
   		   ;

expression: assignmentExpression (',' assignmentExpression)*
   			;

assignmentExpression: logicalOrExpression
                     | unaryExpression assignmentOperator assignmentExpression
   				  ;

assignmentOperator: '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
   			;

constantExpression: logicalOrExpression
   			;

logicalOrExpression: logicalAndExpression ('||' logicalAndExpression)*
   			;

logicalAndExpression: inclusiveOrExpression ('&&' inclusiveOrExpression)*
   			;

inclusiveOrExpression: exclusiveOrExpression ('|' exclusiveOrExpression)*
   			;

exclusiveOrExpression: andExpression ('^' andExpression)*
   			;

andExpression: equalityExpression ('&' equalityExpression)*
   			;

equalityExpression: relationalExpression (equalityOperator relationalExpression)*
   			;

equalityOperator: '==' | '!='
   			;

relationalExpression: shiftExpression (relationalOperator shiftExpression)*
   			;

relationalOperator: '<' | '>' | '<=' | '>='
   			;

shiftExpression: additiveExpression (shiftOperator additiveExpression)*
   			;

shiftOperator: '<<' | '>>'
   			;

additiveExpression: multiplicativeExpression (additiveOperator multiplicativeExpression)*
   			;

additiveOperator: '+' | '-'
   			;

multiplicativeExpression: castExpression (multiplicativeOperator castExpression)*
   			;

multiplicativeOperator: '*' | '/' | '%'
   			;

castExpression: unaryExpression
               | '(' typeName ')' castExpression
   			;

typeName: typeSpecifier '*'* 
   			;

unaryExpression: postfixExpression
                | '++' unaryExpression
                | '--' unaryExpression
                | unaryOperator castExpression
                | 'sizeof' unaryExpression
                | 'sizeof' '(' typeName ')'
   			;

unaryOperator: '&' | '*' | '+' | '-' | '~' | '!'
   			;

postfixExpression: primaryExpression postfix*
   			;

postfix: '[' expression ']'
       | '(' arguments? ')'
       | '.' identifier
       | '->' identifier
       | '++'
       | '--'
   	;

arguments: assignmentExpression (',' assignmentExpression)*
   	;

primaryExpression: identifier
                  | constant
                  | string
                  | '(' expression ')'
   			   ;

constant: integerConstant
         | characterConstant
		 ;


//------------------------------------------------------------------

integerConstant : INT
					;

characterConstant : CHAR
			;

string : STRING
		;

identifier : ID
			;

typedefName : ID
			;

//------------------------------------------------------------------

fragment ALPHA : [a-zA-Z]
				;
fragment DIGIT : [0-9]
				;
fragment HEX : [a-fA-F0-9]
				;
fragment OCT : [0-7]
				;
fragment ESCAPE : '\\' 'a'
				| '\\' 'b'
				| '\\' 'f'
				| '\\' 'n'
				| '\\' 'r'
				| '\\' 't'
				| '\\' 'v'
				| '\\' '\\'
				| '\\' '\''
				| '\\' '\"'
				| '\\' OCT
				| '\\' OCT OCT
				| '\\' OCT OCT OCT
				| '\\' ('x' | 'X') HEX
				| '\\' ('x' | 'X') HEX HEX
				;

ID : ([$_] | ALPHA) (DIGIT | ALPHA | [$_])*
	;

INT : '0' ('x' | 'X') (HEX)+
	| [1-9] DIGIT*
	| '0' OCT*
	;

CHAR : '\'' (~'\\' | ESCAPE) '\''
		;

STRING : '\"' (~'\\' | ESCAPE)* '\"'
		;

WS : [ \t\f\r\n]+ -> skip
		;
COMMENT : ('/*' .*? '*/' | '//' ~[\n\r]*) ->channel(HIDDEN)
				;

PREPROCESS : '#' ~[\n\r]* -> skip
			;

