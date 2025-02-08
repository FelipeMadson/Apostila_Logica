package Prova;

import java.util.Scanner;

public class Q55 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nomes = new String[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º nome:");
			nomes[i] = scan.nextLine();
		}

		System.out.println("Digite um nome para buscar:");
		String busca = scan.nextLine();

		boolean encontrado = false;
		for (String nome : nomes) {
			if (nome.equalsIgnoreCase(busca)) {
				encontrado = true;
				break;
			}
		}

		System.out.println(encontrado ? "ACHEI" : "NÃO ACHEI");
		scan.close();
	}
}
