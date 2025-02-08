package Prova;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor da refeição: ");
        double mealPrice = scan.nextDouble();
        
        System.out.print("Digite a taxa de serviço (%): ");
        double serviceRate = scan.nextDouble();
        
        double totalBill = mealPrice * (1 + serviceRate/100);
        
        System.out.printf("Valor total da conta: R$ %.2f\n", totalBill);
        
        scan.close();
    }
}