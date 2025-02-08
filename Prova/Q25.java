package Prova;

import java.util.Scanner;

public class Q25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o código do empregado:");
		int codigo = scan.nextInt();

		System.out.println("Digite o ano de nascimento:");
		int anoNascimento = scan.nextInt();

		System.out.println("Digite o ano de ingresso na empresa:");
		int anoIngresso = scan.nextInt();

		System.out.println("Digite o ano atual:");
		int anoAtual = scan.nextInt();
		int idade = anoAtual - anoNascimento;
		int tempoTrabalho = anoAtual - anoIngresso;

		boolean podeAposentar = (idade >= 65) || (tempoTrabalho >= 30) || (idade >= 60 && tempoTrabalho >= 25);

		System.out.println("Idade: " + idade + " anos");
		System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

		if (podeAposentar) {
			System.out.println("Requerer aposentadoria");
		} else {
			System.out.println("Não requerer");
		}
	}
}
