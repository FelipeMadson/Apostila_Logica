package Prova;

import java.util.Scanner;

public class Q66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] V1 = new int[15];
        int[] V2 = new int[15];
        
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 15; i++) {
            V1[i] = scan.nextInt();
        }
        
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 15; i++) {
            V2[i] = scan.nextInt();
        }
        
        int iguais = 0;
        for (int i = 0; i < 15; i++) {
            if (V1[i] == V2[i]) iguais++;
        }
        
        System.out.println("Quantidade de números iguais nas mesmas posições: " + iguais);
        scan.close();
    }
}