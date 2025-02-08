package Prova;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a nota N1:");
        double n1 = scan.nextDouble();
        
        System.out.println("Digite a nota N2:");
        double n2 = scan.nextDouble();
        
        System.out.println("Digite a nota N3:");
        double n3 = scan.nextDouble();
        
        System.out.println("Digite a média dos exercícios:");
        double mediaExercicios = scan.nextDouble();
        
        double mediaAproveitamento = (n1 + (n2 * 2) + (n3 * 3) + mediaExercicios) / 7;
        
        String conceito;
        if (mediaAproveitamento >= 9.0) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0) {
            conceito = "C";
        } else {
            conceito = "D";
        }
        
        System.out.printf("Média de aproveitamento: %.2f\n", mediaAproveitamento);
        System.out.println("Conceito: " + conceito);
    }
}