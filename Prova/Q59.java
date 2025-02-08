package Prova;

import java.util.Scanner;

public class Q59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[10];
        int[] M = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            A[i] = scan.nextInt();
        }
        
        System.out.println("Digite o valor de X:");
        int X = scan.nextInt();
        
        for (int i = 0; i < 10; i++) {
            M[i] = A[i] * X;
            System.out.println("M[" + i + "] = " + M[i]);
        }
        scan.close();
    }
}