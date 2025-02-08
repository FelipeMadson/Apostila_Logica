package Prova;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o lado A: ");
        double a = scan.nextDouble();
        
        System.out.print("Digite o lado B: ");
        double b = scan.nextDouble();
        
        System.out.print("Digite o lado C: ");
        double c = scan.nextDouble();
        
        boolean formaTriangulo = (a < b + c) && (b < a + c) && (c < a + b);
        
        System.out.println(formaTriangulo ? "Forma um triângulo" : "Não forma um triângulo");
        scan.close();
    }
}