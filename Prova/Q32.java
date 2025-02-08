package Prova;

import java.util.Scanner;

public class Q32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número para ver sua tabuada:");
		int numero = scan.nextInt();

		System.out.println("Tabuada do " + numero + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", numero, i, numero * i);
		}
		scan.close();
	}
}