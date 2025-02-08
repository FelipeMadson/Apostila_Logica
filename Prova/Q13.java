package Prova;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o número da conta: ");
		int numeroConta = scan.nextInt();

		System.out.print("Digite o saldo: ");
		double saldo = scan.nextDouble();

		System.out.print("Digite o débito: ");
		double debito = scan.nextDouble();

		System.out.print("Digite o crédito: ");
		double credito = scan.nextDouble();

		double saldoAtual = saldo - debito + credito;

		System.out.println(numeroConta);

		System.out.println("Saldo atual: R$ " + saldoAtual);

		System.out.println(saldoAtual >= 0 ? "Saldo Positivo" : "Saldo Negativo");
		scan.close();
	}
}