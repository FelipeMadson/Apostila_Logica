package Prova;

import java.util.Scanner;

public class Q68  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] VET = new int[50];
        
        for (int i = 0; i < 50; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            VET[i] = scan.nextInt();
        }
        
        for (int i = 0; i < 50; i++) {
            boolean repetido = false;
            for (int j = i + 1; j < 50; j++) {
                if (VET[i] == VET[j]) {
                    System.out.println("Número " + VET[i] + " repetido nas posições " + i + " e " + j);
                    repetido = true;
                }
            }
        }
        scan.close();
    }
}