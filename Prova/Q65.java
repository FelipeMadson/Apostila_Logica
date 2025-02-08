package Prova;

import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            vetor[i] = scan.nextInt();
        }
        
        System.out.println("Digite um número para remover:");
        int remover = scan.nextInt();
        
        int[] novoVetor = new int[19];
        int j = 0;
        boolean encontrado = false;
        
        for (int i = 0; i < 20; i++) {
            if (vetor[i] != remover) {
                if (j < 19) {
                    novoVetor[j] = vetor[i];
                    j++;
                }
            } else {
                encontrado = true;
            }
        }
        
        if (encontrado) {
            System.out.println("Novo vetor sem o número " + remover + ":");
            for (int numero : novoVetor) {
                System.out.print(numero + " ");
            }
        } else {
            System.out.println("Número não encontrado no vetor.");
        }
        scan.close();
    }
}