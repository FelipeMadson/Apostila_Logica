package Prova;

import java.util.Scanner;

public class Q29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double somaPositivos = 0;

		for (int i = 1; i <= 30; i++) {
			System.out.println("Digite o " + i + "º número:");
			double numero = scan.nextDouble();

			if (numero > 0) {
				somaPositivos += numero;
			}
		}

		System.out.printf("Soma dos números positivos: %.2f\n", somaPositivos);
		scan.close();
	}
}