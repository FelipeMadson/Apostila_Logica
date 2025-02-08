package Prova;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o custo de fábrica do carro: ");
		double precoFabrica = scan.nextDouble();

		double porcentoDistribuicao = 0.28;
		double porcentoTaxa = 0.45;

		double precoFinal = precoFabrica * (1 + porcentoDistribuicao + porcentoTaxa);

		System.out.printf("Preço final ao consumidor: R$ %.2f\n", precoFinal);

		scan.close();
	}
}