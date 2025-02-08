package Prova;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        double valor1 = scan.nextDouble();
        
        double valor2;
        do {
            System.out.println("Digite o segundo valor (não pode ser zero):");
            valor2 = scan.nextDouble();
        } while (valor2 == 0);
        
        double resultado = valor1 / valor2;
        System.out.printf("Resultado da divisão: %.2f\n", resultado);
        scan.close();
    }
}
