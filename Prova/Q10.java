package Prova;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o ano: ");
		int ano = scan.nextInt();

		boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

		System.out.println(ehBissexto ? "É ano bissexto" : "Não é ano bissexto");
		scan.close();
	}
}