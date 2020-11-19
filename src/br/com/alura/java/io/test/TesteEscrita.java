package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de saida com Arquivo
		OutputStream fis = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fis);
		BufferedWriter br = new BufferedWriter(osw);

		br.write("1914 translation by H. Rackham \"But I must explain to you how all this mistaken idea");
		br.newLine();
		br.write("1914 translation by H. Rackham \"But I must explain to you how all this mistaken idea");

		br.close();

	}

}
