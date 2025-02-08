package Prova;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        int valor1 = scan.nextInt();
        
        System.out.println("Digite o segundo valor:");
        int valor2 = scan.nextInt();
        
        int menor = Math.min(valor1, valor2);
        int maior = Math.max(valor1, valor2);
        
        int soma = 0;
        for (int i = menor; i <= maior; i++) {
            soma += i;
        }
        
        System.out.println("Soma dos valores entre " + menor + " e " + maior + ": " + soma);
        scan.close();
    }
}