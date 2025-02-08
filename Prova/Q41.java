package Prova;

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        int valor1 = scan.nextInt();
        
        System.out.println("Digite o segundo valor (maior que o primeiro):");
        int valor2 = scan.nextInt();
        
        int soma = 0;
        for (int i = valor1; i <= valor2; i++) {
            soma += i;
        }
        
        System.out.println("Soma dos valores entre " + valor1 + " e " + valor2 + ": " + soma);
        scan.close();
    }
}
