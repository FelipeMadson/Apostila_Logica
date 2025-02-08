package Prova;

import java.util.Scanner;

public class Q34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantos termos da sequência de Fibonacci você quer ver:");
		int n = scan.nextInt();

		long primeiro = 0;
		long segundo = 1;

		System.out.print("Sequência de Fibonacci: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(primeiro + " ");
			long proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
		}
		scan.close();
	}
}