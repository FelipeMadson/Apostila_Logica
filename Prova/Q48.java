package Prova;

import java.util.Scanner;

public class Q48 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de números:");
		int quantidade = scan.nextInt();

		double maior = Double.NEGATIVE_INFINITY;
		double soma = 0;

		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Digite o " + i + "º número:");
			double numero = scan.nextDouble();

			maior = Math.max(maior, numero);
			soma += numero;
		}

		double media = soma / quantidade;

		System.out.println("Maior número: " + maior);
		System.out.printf("Média dos números: %.2f\n", media);
		scan.close();
	}
}
