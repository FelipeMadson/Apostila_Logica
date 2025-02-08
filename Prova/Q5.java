package Prova;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um caractere: ");
		char caractere = scan.next().charAt(0);
		caractere = Character.toLowerCase(caractere);

		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		boolean Vogal = false;

		for (char vogal : vogais) {
			if (caractere == vogal) {
				Vogal = true;
				break;
			}
		}

		if (Vogal) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}

		scan.close();
	}
}
