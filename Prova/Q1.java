package Prova;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
        double salario = scan.nextDouble();
        
        System.out.print("Digite o percentual de aumento: ");
        double aumentoSal = scan.nextDouble();
        
        double aumento = salario * (aumentoSal / 100);
        double novoSal = salario + aumento;
        
        System.out.printf("Aumento: R$ %.2f\n", aumento);
        System.out.printf("Novo Salário: R$ %.2f\n", novoSal);
        
        scan.close();
    }
}

	