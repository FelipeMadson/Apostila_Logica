package Prova;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o nome do primeiro time: ");
        String time1 = scan.nextLine();
        
        System.out.print("Digite o número de gols do primeiro time: ");
        int gols1 = scan.nextInt();
        
        scan.nextLine(); // (lembrar) limpa o buffer
        
        System.out.print("Digite o nome do segundo time: ");
        String time2 = scan.nextLine();
        
        System.out.print("Digite o número de gols do segundo time: ");
        int gols2 = scan.nextInt();
        
        if (gols1 > gols2) {
            System.out.println("Vencedor: " + time1);
        } else if (gols2 > gols1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }
        scan.close();
    }
}
