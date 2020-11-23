package br.com.alura.java.io.test;

import java.util.Scanner;

public class IMC {

	private static float peso;
	private static float altura;
	private static float imc;
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.print("Digite seu Peso: ");
		peso = sc.nextFloat();
		System.out.print("Digite sua Altura: ");
		altura = sc.nextFloat();

		imc = peso / (altura * altura);
		System.out.println(imc);

		if (imc < 18.5)
			System.out.println("Abaixo do Peso");

		else if (imc >= 18.5 && imc <= 24.9)
			System.out.println("Peso Normal");

		else if (imc == 25 && imc <= 29.9)
			System.out.println("Sobrepeso");

		else if (imc == 30 && imc <= 34.9)
			System.out.println("Obesidade Grau I");

		else if (imc == 35 && imc <= 39.9)
			System.out.println("Obesidade Grau II");

		else if (imc > 40)
			System.out.println("Obesidade Grau III ou Mórbida");

	}

}
