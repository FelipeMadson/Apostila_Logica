package Prova;

import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temperaturas = new double[365];
        
        for (int i = 0; i < 365; i++) {
            System.out.println("Digite a temperatura do dia " + (i+1) + ":");
            temperaturas[i] = scan.nextDouble();
        }
        
        double menor = temperaturas[0];
        double maior = temperaturas[0];
        double soma = temperaturas[0];
        
        for (int i = 1; i < 365; i++) {
            menor = Math.min(menor, temperaturas[i]);
            maior = Math.max(maior, temperaturas[i]);
            soma += temperaturas[i];
        }
        
        double media = soma / 365;
        int diasAbaixoMedia = 0;
        
        for (double temp : temperaturas) {
            if (temp < media) diasAbaixoMedia++;
        }
        
        System.out.printf("Menor temperatura: %.1f\n", menor);
        System.out.printf("Maior temperatura: %.1f\n", maior);
        System.out.printf("Temperatura média: %.1f\n", media);
        System.out.println("Dias abaixo da média: " + diasAbaixoMedia);
        scan.close();
    }
}
