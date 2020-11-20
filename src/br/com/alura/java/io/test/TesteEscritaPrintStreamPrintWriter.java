package br.com.alura.java.io.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		PrintStream ps = new PrintStream("lorem2.txt");
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		ps.println("1914 translation by H. Rackham \\\"But I must explain to you how all this mistaken idea");
		ps.println();
		ps.println("1914 translation by H. Rackham \\\"But I must explain to you how all this");

		ps.close();
		
		System.out.println();
	}

}
