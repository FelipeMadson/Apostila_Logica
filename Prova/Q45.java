package Prova;

import java.util.Scanner;

public class Q45 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double valorTotal = 0;
		int quantidade = 0;
		char continuar;

		do {
			System.out.println("Digite o valor da mercadoria:");
			double valor = scan.nextDouble();
			valorTotal += valor;
			quantidade++;

			System.out.println("MAIS MERCADORIAS (S/N)?");
			continuar = scan.next().toUpperCase().charAt(0);
		} while (continuar == 'S');

		double mediaValor = valorTotal / quantidade;

		System.out.printf("Valor total em estoque: R$ %.2f\n", valorTotal);
		System.out.printf("Média de valor das mercadorias: R$ %.2f\n", mediaValor);
		scan.close();
	}
}