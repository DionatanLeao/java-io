package br.com.alura.java.io.test;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));
//		String linha = scanner.nextLine();
//		System.out.println(linha);

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
//			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String TipoConta = linhaScanner.next();
			Integer agencia = linhaScanner.nextInt();
			Integer numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();

			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%d, %s: %08.2f",
					TipoConta + agencia + numero + titular + saldo);

			System.out.println(valorFormatado);

//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			linhaScanner.close();

		}

		scanner.close();
	}
}
