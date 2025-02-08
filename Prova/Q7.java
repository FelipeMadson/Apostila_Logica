package Prova;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a hora de início do jogo: ");
        int comeco = scan.nextInt();
        
        System.out.print("Digite a hora de fim do jogo: ");
        int horaFinal= scan.nextInt();
        
        int duracao = horaFinal - comeco;
        if (duracao <= 0) duracao += 24;
        
        System.out.println("Duração do jogo: " + duracao + " horas");
        
        scan.close();
    }
}