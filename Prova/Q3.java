package Prova;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = scan.nextInt();
        
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scan.nextInt();
        
        int idade = anoAtual - anoNascimento;
        
        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
        
        scan.close();
    }
}