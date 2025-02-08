package Prova;

import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantidade de morangos (Kg): ");
		double kgMorango = scan.nextDouble();

		System.out.print("Quantidade de maçãs (Kg): ");
		double kgMaca = scan.nextDouble();

		double precoMorango = kgMorango <= 5 ? 2.50 : 2.20;
		double precoMaca = kgMaca <= 5 ? 1.80 : 1.50;

		double totalMorango = kgMorango * precoMorango;
		double totalMaca = kgMaca * precoMaca;
		double totalCompra = totalMorango + totalMaca;

		if ((kgMorango + kgMaca > 8) || totalCompra > 25.00) {
			totalCompra = totalCompra * 0.90;
		}

		System.out.printf("Valor total a pagar: R$ %.2f\n", totalCompra);

		scan.close();
	}
}