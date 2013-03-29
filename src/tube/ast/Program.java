package tube.ast;

import java.io.*;
import java.util.*;
import java.math.*;

import tube.syntactic.*;

public class Program extends AbstractSyntaxTree {

	public Program(GrammarParser parser) {
		child = new LinkedList<AbstractSyntaxTree>();
		displayName = "";
	}
}

