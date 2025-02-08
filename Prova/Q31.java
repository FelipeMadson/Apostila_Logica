package Prova;

import java.util.Scanner;

public class Q31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o lado do " + i + "º quadrado:");
			double lado = scan.nextDouble();
			double area = lado * lado;
			System.out.printf("Área do quadrado %d: %.2f\n", i, area);
		}
		scan.close();
	}
}
