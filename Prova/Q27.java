package Prova;

import java.util.Scanner;

public class Q27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int contadorNegativos = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º valor:");
			double valor = scan.nextDouble();

			if (valor < 0) {
				contadorNegativos++;
			}
		}

		System.out.println("Quantidade de valores negativos: " + contadorNegativos);
		scan.close();
	}
}
