package Prova;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade atual em estoque: ");
        int estoqueAtual = scan.nextInt();
        
        System.out.print("Digite a quantidade máxima: ");
        int estoqueMaximo = scan.nextInt();
        
        System.out.print("Digite a quantidade mínima: ");
        int estoqueMinimo = scan.nextInt();
        
        int quantidadeMedia = (estoqueMaximo + estoqueMinimo) / 2;
        
        System.out.println(estoqueAtual >= quantidadeMedia ? "Não efetuar compra" : "Efetuar compra");
        scan.close();
    }
}