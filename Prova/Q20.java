package Prova;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Idade do primeiro homem: ");
        int homem1 = scan.nextInt();
        
        System.out.print("Idade do segundo homem: ");
        int homem2 = scan.nextInt();
        
        System.out.print("Idade da primeira mulher: ");
        int mulher1 = scan.nextInt();
        
        System.out.print("Idade da segunda mulher: ");
        int mulher2 = scan.nextInt();
        
        int homemMaisVelho = Math.max(homem1, homem2);
        int homemMaisNovo = Math.min(homem1, homem2);
        int mulherMaisVelha = Math.max(mulher1, mulher2);
        int mulherMaisNova = Math.min(mulher1, mulher2);
        
        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;
        
        System.out.println("Soma (homem mais velho + mulher mais nova): " + soma);
        System.out.println("Produto (homem mais novo * mulher mais velha): " + produto);
        
        scan.close();
    }
}

