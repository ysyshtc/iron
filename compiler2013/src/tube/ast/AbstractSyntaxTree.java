package tube.ast;

import java.io.*;
import java.util.*;
import java.math.*;

public class AbstractSyntaxTree {
	List<AbstractSyntaxTree> child;
	String displayName;
	public AbstractSyntaxTree() {
		child = new	LinkedList<AbstractSyntaxTree>();
		displayName = "";
	}

	public String toString() {
		String ret = displayName;
		if (child.size() > 0) {
			ret += "(" + child.get(0);
			for (AbstractSyntaxTree cd : child)
				ret += ", " + cd.toString();
			ret += ")";
		}
		return ret;
	}
}

