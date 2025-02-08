package Prova;

import java.util.Scanner;

public class Q67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[30];
        
        for (int i = 0; i < 30; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            vetor[i] = scan.nextInt();
        }
        
        System.out.println("Digite um número para contar:");
        int numero = scan.nextInt();
        
        int ocorrencias = 0;
        for (int valor : vetor) {
            if (valor == numero) ocorrencias++;
        }
        
        System.out.println("O número " + numero + " aparece " + ocorrencias + " vezes no vetor.");
        scan.close();
    }
}