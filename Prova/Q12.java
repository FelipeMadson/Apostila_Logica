package Prova;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um caractere: ");
		char caractere = scan.next().charAt(0);

		if (Character.isUpperCase(caractere)) {
			System.out.println("Maiúscula");
		} else if (Character.isLowerCase(caractere)) {
			System.out.println("Minúscula");
		} else {
			System.out.println("Não é letra");
		}
		scan.close();
	}
}