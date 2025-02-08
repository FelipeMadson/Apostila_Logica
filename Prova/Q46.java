package Prova;

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        
        for (int i = 1; i <= 100; i++) {
            System.out.println("Digite o " + i + "º valor:");
            double valor = scan.nextDouble();
            
            maior = Math.max(maior, valor);
            menor = Math.min(menor, valor);
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        scan.close();
    }
}
