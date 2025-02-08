package Prova;

public class Q43 {
	public static void main(String[] args) {
		int soma = 0;
		int contador = 0;

		for (int i = 15; i <= 100; i++) {
			soma += i;
			contador++;
		}

		double media = (double) soma / contador;
		System.out.printf("Média aritmética dos números entre 15 e 100: %.2f\n", media);
	}
}