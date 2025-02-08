package Prova;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o número de litros: ");
        int litros = scan.nextInt();
        
        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipo = scan.next().charAt(0);
        
        double precoGasolina = 3.30;
        double precoAlcool = 2.90;
        
        double total = litros * (tipo == 'G' || tipo == 'g' ? precoGasolina : precoAlcool);
        
        System.out.printf("Valor a pagar: R$ %.2f\n", total);
        scan.close();
    }
}