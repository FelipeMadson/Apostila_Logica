package Prova;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o número total de mercadorias:");
        int totalMercadorias = scan.nextInt();
        
        double valorTotal = 0;
        
        for (int i = 1; i <= totalMercadorias; i++) {
            System.out.println("Digite o valor da mercadoria " + i + ":");
            double valor = scan.nextDouble();
            valorTotal += valor;
        }
        
        double mediaValor = valorTotal / totalMercadorias;
        
        System.out.printf("Valor total em estoque: R$ %.2f\n", valorTotal);
        System.out.printf("Média de valor das mercadorias: R$ %.2f\n", mediaValor);
        scan.close();
    }
}