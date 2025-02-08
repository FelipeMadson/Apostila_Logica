package Prova;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double maiorPreco = Double.NEGATIVE_INFINITY;
        double somaPrecos = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("Digite o código do produto " + i + ":");
            int codigo = scan.nextInt();
            
            System.out.println("Digite o preço do produto " + i + ":");
            double preco = scan.nextDouble();
            
            maiorPreco = Math.max(maiorPreco, preco);
            somaPrecos += preco;
        }
        
        double mediaPrecos = somaPrecos / 15;
        
        System.out.printf("Maior preço: R$ %.2f\n", maiorPreco);
        System.out.printf("Média dos preços: R$ %.2f\n", mediaPrecos);
        scan.close();
    }
}
