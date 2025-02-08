package Prova;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o número de carros vendidos: ");
		int carrosVendidos = scan.nextInt();

		System.out.print("Digite o valor total das vendas: ");
		double totalVendas = scan.nextDouble();

		System.out.print("Digite o salário fixo: ");
		double salarioFixo = scan.nextDouble();

		System.out.print("Digite o valor por carro vendido: ");
		double valorPorCarro = scan.nextDouble();

		double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarro) + (totalVendas * 0.05);

		System.out.printf("Salário final: R$ %.2f\n", salarioFinal);
		scan.close();
	}
}