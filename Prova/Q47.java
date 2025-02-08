package Prova;

import java.util.Scanner;

public class Q47 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número decimal:");
		int decimal = scan.nextInt();

		String hexadecimal = Integer.toHexString(decimal).toUpperCase();
		System.out.println("Valor em hexadecimal: " + hexadecimal);
		scan.close();
	}
}
