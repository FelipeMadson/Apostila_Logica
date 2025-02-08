package Prova;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scan.nextInt();

		System.out.println(numero % 5 == 0 ? "É múltiplo de 5" : "Não é múltiplo de 5");
		scan.close();
	}
}