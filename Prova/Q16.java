package Prova;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o preço original: ");
		double precoOriginal = scan.nextDouble();

		System.out.print("Digite o percentual de desconto: ");
		double percentualDesconto = scan.nextDouble();

		double precoFinal = precoOriginal * (1 - percentualDesconto / 100);

		System.out.printf("Preço final: R$ %.2f\n", precoFinal);
		scan.close();
	}
}
