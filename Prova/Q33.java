package Prova;

import java.util.Scanner;

public class Q33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número para calcular seu fatorial:");
		int numero = scan.nextInt();

		long fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}

		System.out.printf("O fatorial de %d é %d\n", numero, fatorial);
		scan.close();
	}
}