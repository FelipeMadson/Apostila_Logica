package Prova;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = scan.nextDouble();

		double fahrenheit = (celsius * 9 / 5) + 32;

		System.out.printf("Temperatura em Fahrenheit: %.2f°F\n" + fahrenheit);

		scan.close();
	}
}