package tube.main;

import java.io.*;
import java.util.*;
import java.math.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import tube.ast.AbstractSyntaxTree;
import tube.syntactic.*;

public class Main {
	public static void main(String[] args) throws IOException {
		for (String fileName : args)
			new Main().compile(fileName);
	}
	void compile(String fileName) throws IOException {
		InputStream source = new FileInputStream(fileName);
		
		ANTLRInputStream stream = new ANTLRInputStream(source);
		GrammarLexer lex = new GrammarLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		tokens.fill();
		List<Token> list = tokens.getTokens();

		PrintWriter output = new PrintWriter(new FileOutputStream(fileName.replace(".c", ".lexer")));
		for (Token iter : list) {
			if (iter.getType() != -1)
				output.println(lex.tokenNames[iter.getType()] + ", " + iter.getText());
		}
		output.close();

		GrammarParser parser = new GrammarParser(tokens);

		output = new PrintWriter(new FileOutputStream(fileName.replace(".c", ".ast")));
		ParseTree tree = parser.program();
		output.println(tree.toStringTree(parser));
		AbstractSyntaxTree ast = new AbstractSyntaxTree(parser);
		output.close();
	}
}

