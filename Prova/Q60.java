package Prova;

import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = scan.nextInt();
        }
        
        System.out.println("Números na ordem inversa:");
        for (int i = 19; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        scan.close();
    }
}
