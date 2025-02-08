package Prova;

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double somaSalarios = 0;
        int somaFilhos = 0;
        double maiorSalario = Double.NEGATIVE_INFINITY;
        int pessoasSalarioBaixo = 0;
        int totalPessoas = 0;
        
        while (true) {
            System.out.println("Digite o salário (ou um valor negativo para encerrar):");
            double salario = scan.nextDouble();
            
            if (salario < 0) break;
            
            System.out.println("Digite o número de filhos:");
            int numFilhos = scan.nextInt();
            
            somaSalarios += salario;
            somaFilhos += numFilhos;
            maiorSalario = Math.max(maiorSalario, salario);
            if (salario < 150) pessoasSalarioBaixo++;
            totalPessoas++;
        }
        
        if (totalPessoas > 0) {
            double mediaSalarios = somaSalarios / totalPessoas;
            double mediaFilhos = (double) somaFilhos / totalPessoas;
            double percentualSalarioBaixo = (double) pessoasSalarioBaixo * 100 / totalPessoas;
            
            System.out.printf("Média de salário: R$ %.2f\n", mediaSalarios);
            System.out.printf("Média de filhos: %.1f\n", mediaFilhos);
            System.out.printf("Maior salário: R$ %.2f\n", maiorSalario);
            System.out.printf("Percentual de pessoas com salário menor que R$ 150,00: %.1f%%\n", 
                            percentualSalarioBaixo);
        }
        scan.close();
    }
}