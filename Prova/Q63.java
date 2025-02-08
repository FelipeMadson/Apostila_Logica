package Prova;

import java.util.Arrays;
import java.util.Scanner;

public class Q63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            numeros[i] = scan.nextInt();
        }
        
        Arrays.sort(numeros);
        
        System.out.println("Números ordenados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        scan.close();
    }
}