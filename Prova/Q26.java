package Prova;

import java.util.Scanner;

public class Q26 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int contador = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "º valor:");
            double valor = scan.nextDouble();
            
            if (valor >= 5) {
                contador++;
            }
        }
        
        System.out.println("Quantidade de valores maiores ou iguais a 5: " + contador);
    }
}