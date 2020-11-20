package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {

//        Fluxo de saida com Arquivo
//		OutputStream fis = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fis);
//		BufferedWriter br = new BufferedWriter(osw);

		BufferedWriter fw = new BufferedWriter(new FileWriter("lorem2.txt"));
		fw.write("1914 translation by H. Rackham \"But I must explain to you how all this mistaken idea");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("1914 translation by H. Rackham \"But I must explain to you how all this");

		fw.close();

	}

}
