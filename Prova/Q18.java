package Prova;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números: ");
        int quantidade = scan.nextInt();
        
        System.out.println("Digite os números:");
        for (int i = 0; i < quantidade; i++) {
            int numero = scan.nextInt();
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            }
        }
        scan.close();
    }
}