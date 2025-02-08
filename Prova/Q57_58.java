package Prova;

import java.util.Scanner;

public class Q57_58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] Q = new double[20];
        
        for (int i = 0; i < 20; i++) {
            do {
                System.out.println("Digite o " + (i+1) + "º número (positivo):");
                Q[i] = scan.nextDouble();
            } while (Q[i] <= 0);
        }
        
        double maior = Q[0], menor = Q[0];
        int posMaior = 0, posMenor = 0;
        
        for (int i = 1; i < 20; i++) {
            if (Q[i] > maior) {
                maior = Q[i];
                posMaior = i;
            }
            if (Q[i] < menor) {
                menor = Q[i];
                posMenor = i;
            }
        }
        
        System.out.println("Maior elemento: " + maior + " na posição: " + posMaior);
        System.out.println("Menor elemento: " + menor + " na posição: " + posMenor);
        scan.close();
    }
}
