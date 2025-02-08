package Prova;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a descrição do produto: ");
		String nome = scan.nextLine();

		System.out.print("Digite a quantidade adquirida: ");
		int quantidade = scan.nextInt();

		System.out.print("Digite o preço unitário: ");
		double preco = scan.nextDouble();

		double total = quantidade * preco;
		double desconto;

		if (quantidade <= 5) {
			desconto = total * 0.02;
		} else if (quantidade <= 10) {
			desconto = total * 0.03;
		} else {
			desconto = total * 0.05;
		}

		double totalPagar = total - desconto;

		System.out.print(nome);
		System.out.printf("Total: %.2f\n", total);
		System.out.printf("Desconto: %.2f\n", desconto);
		System.out.printf("Total a pagar: %.2f\n", totalPagar);
		scan.close();
	}
}
