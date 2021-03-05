
package com.kicroleto;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "kclt";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		KicroletoLexer lexer = new KicroletoLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		KicroletoParser parser = new KicroletoParser(tokens);

		KicroletoParser.ProgramContext tree = parser.program();

		KicroletoCustomVisitor visitor = new KicroletoCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
