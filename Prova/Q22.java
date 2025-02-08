package Prova;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // dá para usar "java.util.Scanner scanner = new
													// java.util.Scanner(System.in);"
		final int codigoCorreto = 1234;
		final int senhaCorreta = 9999;

		System.out.print("Digite o código de usuário: ");
		int codigo = scan.nextInt();

		if (codigo != codigoCorreto) {
			System.out.println("Usuário inválido!");
		} else {
			System.out.print("Digite a senha: ");
			int senha = scan.nextInt();
			if (senha != senhaCorreta) {
				System.out.println("Senha incorreta");
			} else {
				System.out.println("Acesso permitido");
			}
		}
		scan.close();
	}
}