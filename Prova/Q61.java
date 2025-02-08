package Prova;

import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tamanho dos vetores:");
        int N = scan.nextInt();
        
        int[] A = new int[N];
        int[] B = new int[N];
        int[] Soma = new int[N];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            B[i] = scan.nextInt();
            Soma[i] = A[i] + B[i];
        }
        
        System.out.println("Vetor Soma:");
        for (int valor : Soma) {
            System.out.print(valor + " ");
        }
        scan.close();
    }
}