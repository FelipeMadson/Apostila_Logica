package Prova;

import java.util.Scanner;

public class Q40 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char resposta;

		do {
			double nota1, nota2;

			do {
				System.out.println("Digite a primeira nota (0-10):");
				nota1 = scan.nextDouble();
			} while (nota1 < 0 || nota1 > 10);

			do {
				System.out.println("Digite a segunda nota (0-10):");
				nota2 = scan.nextDouble();
			} while (nota2 < 0 || nota2 > 10);

			double media = (nota1 + nota2) / 2;
			System.out.printf("Média: %.2f\n", media);

			System.out.println("NOVO CÁLCULO (S/N)?");
			resposta = scan.next().toUpperCase().charAt(0);
		} while (resposta == 'S');

		scan.close();
	}
}