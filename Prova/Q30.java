package Prova;

import java.util.Scanner;

public class Q30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double somaPositivos = 0;
		int contadorPositivos = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite o " + i + "º número:");
			double numero = scan.nextDouble();

			if (numero > 0) {
				somaPositivos += numero;
				contadorPositivos++;
			}
		}

		if (contadorPositivos > 0) {
			double media = somaPositivos / contadorPositivos;
			System.out.printf("Média dos números positivos: %.2f\n", media);
		} else {
			System.out.println("Nenhum número positivo foi digitado");
		}
		scan.close();
	}
}
