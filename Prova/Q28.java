package Prova;

import java.util.Scanner;

public class Q28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double soma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º valor:");
			soma += scan.nextDouble();
		}

		double media = soma / 10;
		System.out.printf("Média dos valores: %.2f\n", media);
		scan.close();
	}
}