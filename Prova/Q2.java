package Prova;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite as horas: ");
		int horas = scan.nextInt();

		System.out.print("Digite os minutos: ");
		int minutos = scan.nextInt();

		System.out.print("Digite os segundos: ");
		int segundos = scan.nextInt();

		int totalSegundos = horas * 3600 + minutos * 60 + segundos;

		System.out.println("Total de segundos: " + totalSegundos);

		scan.close();
	}
}