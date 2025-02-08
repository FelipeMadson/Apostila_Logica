package Prova;

import java.util.Arrays;
import java.util.Scanner;

public class Q64 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[11];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			numeros[i] = scan.nextInt();
		}

		Arrays.sort(numeros, 0, 10);

		System.out.println("Digite o novo número:");
		numeros[10] = scan.nextInt();

		Arrays.sort(numeros);

		System.out.println("Números ordenados com o novo valor:");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		scan.close();
	}
}
