package Prova;

import java.util.Scanner;

public class Q56 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] notas = new double[20];
		double soma = 0;

		for (int i = 0; i < 20; i++) {
			System.out.println("Digite a nota do aluno " + (i + 1) + ":");
			notas[i] = scan.nextDouble();
			soma += notas[i];
		}

		double media = soma / 20;
		int acimaMedia = 0;

		for (double nota : notas) {
			if (nota > media)
				acimaMedia++;
		}

		System.out.printf("Média da turma: %.2f\n", media);
		System.out.println("Alunos acima da média: " + acimaMedia);
		scan.close();
	}
}